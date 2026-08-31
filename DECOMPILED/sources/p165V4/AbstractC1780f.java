package p165V4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p158U4.C1687k;
import p158U4.C1693q;
import p158U4.C1694r;
import p158U4.C1695s;
import p164V3.C1774s;
import p186Y4.AbstractC2034b;
import p351s5.C7039u;

/* JADX INFO: renamed from: V4.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1780f {

    /* JADX INFO: renamed from: a */
    private final C1687k f5835a;

    /* JADX INFO: renamed from: b */
    private final C1787m f5836b;

    /* JADX INFO: renamed from: c */
    private final List f5837c;

    AbstractC1780f(C1687k c1687k, C1787m c1787m) {
        this(c1687k, c1787m, new ArrayList());
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC1780f m7460c(C1694r c1694r, C1778d c1778d) {
        if (!c1694r.mo7075d()) {
            return null;
        }
        if (c1778d != null && c1778d.m7457b().isEmpty()) {
            return null;
        }
        if (c1778d == null) {
            return c1694r.mo7079h() ? new C1777c(c1694r.getKey(), C1787m.f5852c) : new C1789o(c1694r.getKey(), c1694r.getData(), C1787m.f5852c);
        }
        C1695s data = c1694r.getData();
        C1695s c1695s = new C1695s();
        HashSet hashSet = new HashSet();
        for (C1693q c1693q : c1778d.m7457b()) {
            if (!hashSet.contains(c1693q)) {
                if (data.m7143g(c1693q) == null && c1693q.m7063v() > 1) {
                    c1693q = (C1693q) c1693q.m7065x();
                }
                c1695s.m7145i(c1693q, data.m7143g(c1693q));
                hashSet.add(c1693q);
            }
        }
        return new C1786l(c1694r.getKey(), c1695s, C1778d.m7456a(hashSet), C1787m.f5852c);
    }

    /* JADX INFO: renamed from: a */
    public abstract C1778d mo7453a(C1694r c1694r, C1778d c1778d, C1774s c1774s);

    /* JADX INFO: renamed from: b */
    public abstract void mo7454b(C1694r c1694r, C1783i c1783i);

    /* JADX INFO: renamed from: d */
    public abstract C1778d mo7455d();

    /* JADX INFO: renamed from: e */
    public List m7461e() {
        return this.f5837c;
    }

    /* JADX INFO: renamed from: f */
    public C1687k m7462f() {
        return this.f5835a;
    }

    /* JADX INFO: renamed from: g */
    public C1787m m7463g() {
        return this.f5836b;
    }

    /* JADX INFO: renamed from: h */
    boolean m7464h(AbstractC1780f abstractC1780f) {
        return this.f5835a.equals(abstractC1780f.f5835a) && this.f5836b.equals(abstractC1780f.f5836b);
    }

    /* JADX INFO: renamed from: i */
    int m7465i() {
        return (m7462f().hashCode() * 31) + this.f5836b.hashCode();
    }

    /* JADX INFO: renamed from: j */
    String m7466j() {
        return "key=" + this.f5835a + ", precondition=" + this.f5836b;
    }

    /* JADX INFO: renamed from: k */
    protected Map m7467k(C1774s c1774s, C1694r c1694r) {
        HashMap map = new HashMap(this.f5837c.size());
        for (C1779e c1779e : this.f5837c) {
            map.put(c1779e.m7458a(), c1779e.m7459b().mo7447a(c1694r.mo7078g(c1779e.m7458a()), c1774s));
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    protected Map m7468l(C1694r c1694r, List list) {
        HashMap map = new HashMap(this.f5837c.size());
        AbstractC2034b.m8460d(this.f5837c.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.f5837c.size()));
        for (int i7 = 0; i7 < list.size(); i7++) {
            C1779e c1779e = (C1779e) this.f5837c.get(i7);
            map.put(c1779e.m7458a(), c1779e.m7459b().mo7448b(c1694r.mo7078g(c1779e.m7458a()), (C7039u) list.get(i7)));
        }
        return map;
    }

    /* JADX INFO: renamed from: m */
    void m7469m(C1694r c1694r) {
        AbstractC2034b.m8460d(c1694r.getKey().equals(m7462f()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    AbstractC1780f(C1687k c1687k, C1787m c1787m, List list) {
        this.f5835a = c1687k;
        this.f5836b = c1787m;
        this.f5837c = list;
    }
}

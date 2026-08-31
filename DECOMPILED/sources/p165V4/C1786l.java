package p165V4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p158U4.C1687k;
import p158U4.C1693q;
import p158U4.C1694r;
import p158U4.C1695s;
import p164V3.C1774s;

/* JADX INFO: renamed from: V4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1786l extends AbstractC1780f {

    /* JADX INFO: renamed from: d */
    private final C1695s f5850d;

    /* JADX INFO: renamed from: e */
    private final C1778d f5851e;

    public C1786l(C1687k c1687k, C1695s c1695s, C1778d c1778d, C1787m c1787m) {
        this(c1687k, c1695s, c1778d, c1787m, new ArrayList());
    }

    /* JADX INFO: renamed from: n */
    private List m7492n() {
        ArrayList arrayList = new ArrayList();
        Iterator it = m7461e().iterator();
        while (it.hasNext()) {
            arrayList.add(((C1779e) it.next()).m7458a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private Map m7493o() {
        HashMap map = new HashMap();
        for (C1693q c1693q : this.f5851e.m7457b()) {
            if (!c1693q.isEmpty()) {
                map.put(c1693q, this.f5850d.m7143g(c1693q));
            }
        }
        return map;
    }

    @Override // p165V4.AbstractC1780f
    /* JADX INFO: renamed from: a */
    public C1778d mo7453a(C1694r c1694r, C1778d c1778d, C1774s c1774s) {
        m7469m(c1694r);
        if (!m7463g().m7500e(c1694r)) {
            return c1778d;
        }
        Map mapM7467k = m7467k(c1774s, c1694r);
        Map mapM7493o = m7493o();
        C1695s data = c1694r.getData();
        data.m7146j(mapM7493o);
        data.m7146j(mapM7467k);
        c1694r.m7127l(c1694r.mo7081j(), c1694r.getData()).m7132u();
        if (c1778d == null) {
            return null;
        }
        HashSet hashSet = new HashSet(c1778d.m7457b());
        hashSet.addAll(this.f5851e.m7457b());
        hashSet.addAll(m7492n());
        return C1778d.m7456a(hashSet);
    }

    @Override // p165V4.AbstractC1780f
    /* JADX INFO: renamed from: b */
    public void mo7454b(C1694r c1694r, C1783i c1783i) {
        m7469m(c1694r);
        if (!m7463g().m7500e(c1694r)) {
            c1694r.m7129n(c1783i.m7484b());
            return;
        }
        Map mapM7468l = m7468l(c1694r, c1783i.m7483a());
        C1695s data = c1694r.getData();
        data.m7146j(m7493o());
        data.m7146j(mapM7468l);
        c1694r.m7127l(c1783i.m7484b(), c1694r.getData()).m7131t();
    }

    @Override // p165V4.AbstractC1780f
    /* JADX INFO: renamed from: d */
    public C1778d mo7455d() {
        return this.f5851e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1786l.class == obj.getClass()) {
            C1786l c1786l = (C1786l) obj;
            if (m7464h(c1786l) && this.f5850d.equals(c1786l.f5850d) && m7461e().equals(c1786l.m7461e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (m7465i() * 31) + this.f5850d.hashCode();
    }

    /* JADX INFO: renamed from: p */
    public C1695s m7494p() {
        return this.f5850d;
    }

    public String toString() {
        return "PatchMutation{" + m7466j() + ", mask=" + this.f5851e + ", value=" + this.f5850d + "}";
    }

    public C1786l(C1687k c1687k, C1695s c1695s, C1778d c1778d, C1787m c1787m, List list) {
        super(c1687k, c1787m, list);
        this.f5850d = c1695s;
        this.f5851e = c1778d;
    }
}

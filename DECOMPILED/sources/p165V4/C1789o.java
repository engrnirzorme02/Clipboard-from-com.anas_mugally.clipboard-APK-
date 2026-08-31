package p165V4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p158U4.C1687k;
import p158U4.C1694r;
import p158U4.C1695s;
import p164V3.C1774s;

/* JADX INFO: renamed from: V4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1789o extends AbstractC1780f {

    /* JADX INFO: renamed from: d */
    private final C1695s f5856d;

    public C1789o(C1687k c1687k, C1695s c1695s, C1787m c1787m) {
        this(c1687k, c1695s, c1787m, new ArrayList());
    }

    @Override // p165V4.AbstractC1780f
    /* JADX INFO: renamed from: a */
    public C1778d mo7453a(C1694r c1694r, C1778d c1778d, C1774s c1774s) {
        m7469m(c1694r);
        if (!m7463g().m7500e(c1694r)) {
            return c1778d;
        }
        Map mapM7467k = m7467k(c1774s, c1694r);
        C1695s c1695sClone = this.f5856d.clone();
        c1695sClone.m7146j(mapM7467k);
        c1694r.m7127l(c1694r.mo7081j(), c1695sClone).m7132u();
        return null;
    }

    @Override // p165V4.AbstractC1780f
    /* JADX INFO: renamed from: b */
    public void mo7454b(C1694r c1694r, C1783i c1783i) {
        m7469m(c1694r);
        C1695s c1695sClone = this.f5856d.clone();
        c1695sClone.m7146j(m7468l(c1694r, c1783i.m7483a()));
        c1694r.m7127l(c1783i.m7484b(), c1695sClone).m7131t();
    }

    @Override // p165V4.AbstractC1780f
    /* JADX INFO: renamed from: d */
    public C1778d mo7455d() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1789o.class == obj.getClass()) {
            C1789o c1789o = (C1789o) obj;
            if (m7464h(c1789o) && this.f5856d.equals(c1789o.f5856d) && m7461e().equals(c1789o.m7461e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (m7465i() * 31) + this.f5856d.hashCode();
    }

    /* JADX INFO: renamed from: n */
    public C1695s m7502n() {
        return this.f5856d;
    }

    public String toString() {
        return "SetMutation{" + m7466j() + ", value=" + this.f5856d + "}";
    }

    public C1789o(C1687k c1687k, C1695s c1695s, C1787m c1787m, List list) {
        super(c1687k, c1787m, list);
        this.f5856d = c1695s;
    }
}

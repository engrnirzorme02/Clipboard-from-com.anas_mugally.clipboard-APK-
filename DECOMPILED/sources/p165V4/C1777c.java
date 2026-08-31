package p165V4;

import p158U4.C1687k;
import p158U4.C1694r;
import p164V3.C1774s;
import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: V4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1777c extends AbstractC1780f {
    public C1777c(C1687k c1687k, C1787m c1787m) {
        super(c1687k, c1787m);
    }

    @Override // p165V4.AbstractC1780f
    /* JADX INFO: renamed from: a */
    public C1778d mo7453a(C1694r c1694r, C1778d c1778d, C1774s c1774s) {
        m7469m(c1694r);
        if (!m7463g().m7500e(c1694r)) {
            return c1778d;
        }
        c1694r.m7128m(c1694r.mo7081j()).m7132u();
        return null;
    }

    @Override // p165V4.AbstractC1780f
    /* JADX INFO: renamed from: b */
    public void mo7454b(C1694r c1694r, C1783i c1783i) {
        m7469m(c1694r);
        AbstractC2034b.m8460d(c1783i.m7483a().isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        c1694r.m7128m(c1783i.m7484b()).m7131t();
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
        if (obj == null || C1777c.class != obj.getClass()) {
            return false;
        }
        return m7464h((C1777c) obj);
    }

    public int hashCode() {
        return m7465i();
    }

    public String toString() {
        return "DeleteMutation{" + m7466j() + "}";
    }
}

package p165V4;

import p158U4.C1687k;
import p158U4.C1694r;
import p164V3.C1774s;
import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: V4.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1791q extends AbstractC1780f {
    public C1791q(C1687k c1687k, C1787m c1787m) {
        super(c1687k, c1787m);
    }

    @Override // p165V4.AbstractC1780f
    /* JADX INFO: renamed from: a */
    public C1778d mo7453a(C1694r c1694r, C1778d c1778d, C1774s c1774s) {
        throw AbstractC2034b.m8457a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // p165V4.AbstractC1780f
    /* JADX INFO: renamed from: b */
    public void mo7454b(C1694r c1694r, C1783i c1783i) {
        throw AbstractC2034b.m8457a("VerifyMutation should only be used in Transactions.", new Object[0]);
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
        if (obj == null || C1791q.class != obj.getClass()) {
            return false;
        }
        return m7464h((C1791q) obj);
    }

    public int hashCode() {
        return m7465i();
    }

    public String toString() {
        return "VerifyMutation{" + m7466j() + "}";
    }
}

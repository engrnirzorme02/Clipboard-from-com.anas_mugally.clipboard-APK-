package p137R4;

import p158U4.AbstractC1701y;
import p158U4.C1693q;
import p158U4.InterfaceC1684h;
import p186Y4.AbstractC2034b;
import p351s5.C7039u;

/* JADX INFO: renamed from: R4.J */
/* JADX INFO: loaded from: classes.dex */
public class C1342J {

    /* JADX INFO: renamed from: a */
    private final a f4673a;

    /* JADX INFO: renamed from: b */
    final C1693q f4674b;

    /* JADX INFO: renamed from: R4.J$a */
    public enum a {
        ASCENDING(1),
        DESCENDING(-1);


        /* JADX INFO: renamed from: a */
        private final int f4678a;

        a(int i7) {
            this.f4678a = i7;
        }

        /* JADX INFO: renamed from: d */
        int m5743d() {
            return this.f4678a;
        }
    }

    private C1342J(a aVar, C1693q c1693q) {
        this.f4673a = aVar;
        this.f4674b = c1693q;
    }

    /* JADX INFO: renamed from: d */
    public static C1342J m5738d(a aVar, C1693q c1693q) {
        return new C1342J(aVar, c1693q);
    }

    /* JADX INFO: renamed from: a */
    int m5739a(InterfaceC1684h interfaceC1684h, InterfaceC1684h interfaceC1684h2) {
        int iM5743d;
        int iM7181i;
        if (this.f4674b.equals(C1693q.f5616b)) {
            iM5743d = this.f4673a.m5743d();
            iM7181i = interfaceC1684h.getKey().compareTo(interfaceC1684h2.getKey());
        } else {
            C7039u c7039uMo7078g = interfaceC1684h.mo7078g(this.f4674b);
            C7039u c7039uMo7078g2 = interfaceC1684h2.mo7078g(this.f4674b);
            AbstractC2034b.m8460d((c7039uMo7078g == null || c7039uMo7078g2 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
            iM5743d = this.f4673a.m5743d();
            iM7181i = AbstractC1701y.m7181i(c7039uMo7078g, c7039uMo7078g2);
        }
        return iM5743d * iM7181i;
    }

    /* JADX INFO: renamed from: b */
    public a m5740b() {
        return this.f4673a;
    }

    /* JADX INFO: renamed from: c */
    public C1693q m5741c() {
        return this.f4674b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1342J)) {
            C1342J c1342j = (C1342J) obj;
            if (this.f4673a == c1342j.f4673a && this.f4674b.equals(c1342j.f4674b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f4673a.hashCode()) * 31) + this.f4674b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4673a == a.ASCENDING ? "" : "-");
        sb.append(this.f4674b.mo7057h());
        return sb.toString();
    }
}

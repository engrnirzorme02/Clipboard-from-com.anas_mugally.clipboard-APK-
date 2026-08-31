package p137R4;

import java.util.List;
import p158U4.AbstractC1701y;
import p158U4.C1687k;
import p158U4.C1693q;
import p158U4.InterfaceC1684h;
import p186Y4.AbstractC2034b;
import p351s5.C7039u;

/* JADX INFO: renamed from: R4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1362i {

    /* JADX INFO: renamed from: a */
    private final boolean f4775a;

    /* JADX INFO: renamed from: b */
    private final List f4776b;

    public C1362i(List list, boolean z7) {
        this.f4776b = list;
        this.f4775a = z7;
    }

    /* JADX INFO: renamed from: a */
    private int m5872a(List list, InterfaceC1684h interfaceC1684h) {
        int iM7181i;
        AbstractC2034b.m8460d(this.f4776b.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i7 = 0;
        for (int i8 = 0; i8 < this.f4776b.size(); i8++) {
            C1342J c1342j = (C1342J) list.get(i8);
            C7039u c7039u = (C7039u) this.f4776b.get(i8);
            if (c1342j.f4674b.equals(C1693q.f5616b)) {
                AbstractC2034b.m8460d(AbstractC1701y.m7165C(c7039u), "Bound has a non-key value where the key path is being used %s", c7039u);
                iM7181i = C1687k.m7087k(c7039u.m31041t0()).compareTo(interfaceC1684h.getKey());
            } else {
                C7039u c7039uMo7078g = interfaceC1684h.mo7078g(c1342j.m5741c());
                AbstractC2034b.m8460d(c7039uMo7078g != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                iM7181i = AbstractC1701y.m7181i(c7039u, c7039uMo7078g);
            }
            if (c1342j.m5740b().equals(C1342J.a.DESCENDING)) {
                iM7181i *= -1;
            }
            i7 = iM7181i;
            if (i7 != 0) {
                return i7;
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: b */
    public List m5873b() {
        return this.f4776b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m5874c() {
        return this.f4775a;
    }

    /* JADX INFO: renamed from: d */
    public String m5875d() {
        StringBuilder sb = new StringBuilder();
        boolean z7 = true;
        for (C7039u c7039u : this.f4776b) {
            if (!z7) {
                sb.append(",");
            }
            sb.append(AbstractC1701y.m7174b(c7039u));
            z7 = false;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public boolean m5876e(List list, InterfaceC1684h interfaceC1684h) {
        int iM5872a = m5872a(list, interfaceC1684h);
        if (this.f4775a) {
            return iM5872a >= 0;
        }
        return iM5872a > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1362i.class == obj.getClass()) {
            C1362i c1362i = (C1362i) obj;
            if (this.f4775a == c1362i.f4775a && this.f4776b.equals(c1362i.f4776b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m5877f(List list, InterfaceC1684h interfaceC1684h) {
        int iM5872a = m5872a(list, interfaceC1684h);
        if (this.f4775a) {
            return iM5872a <= 0;
        }
        return iM5872a < 0;
    }

    public int hashCode() {
        return ((this.f4775a ? 1 : 0) * 31) + this.f4776b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bound(inclusive=");
        sb.append(this.f4775a);
        sb.append(", position=");
        for (int i7 = 0; i7 < this.f4776b.size(); i7++) {
            if (i7 > 0) {
                sb.append(" and ");
            }
            sb.append(AbstractC1701y.m7174b((C7039u) this.f4776b.get(i7)));
        }
        sb.append(")");
        return sb.toString();
    }
}

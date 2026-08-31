package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2515g0 {

    /* JADX INFO: renamed from: f */
    private static final C2515g0 f9544f = new C2515g0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    private int f9545a;

    /* JADX INFO: renamed from: b */
    private int[] f9546b;

    /* JADX INFO: renamed from: c */
    private Object[] f9547c;

    /* JADX INFO: renamed from: d */
    private int f9548d;

    /* JADX INFO: renamed from: e */
    private boolean f9549e;

    private C2515g0() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: b */
    private void m11248b(int i7) {
        int[] iArr = this.f9546b;
        if (i7 > iArr.length) {
            int i8 = this.f9545a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f9546b = Arrays.copyOf(iArr, i7);
            this.f9547c = Arrays.copyOf(this.f9547c, i7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2515g0 m11249c() {
        return f9544f;
    }

    /* JADX INFO: renamed from: f */
    private static int m11250f(int[] iArr, int i7) {
        int i8 = 17;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        return i8;
    }

    /* JADX INFO: renamed from: g */
    private static int m11251g(Object[] objArr, int i7) {
        int iHashCode = 17;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: j */
    static C2515g0 m11252j(C2515g0 c2515g0, C2515g0 c2515g1) {
        int i7 = c2515g0.f9545a + c2515g1.f9545a;
        int[] iArrCopyOf = Arrays.copyOf(c2515g0.f9546b, i7);
        System.arraycopy(c2515g1.f9546b, 0, iArrCopyOf, c2515g0.f9545a, c2515g1.f9545a);
        Object[] objArrCopyOf = Arrays.copyOf(c2515g0.f9547c, i7);
        System.arraycopy(c2515g1.f9547c, 0, objArrCopyOf, c2515g0.f9545a, c2515g1.f9545a);
        return new C2515g0(i7, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: k */
    static C2515g0 m11253k() {
        return new C2515g0();
    }

    /* JADX INFO: renamed from: l */
    private static boolean m11254l(Object[] objArr, Object[] objArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (!objArr[i8].equals(objArr2[i8])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    private static boolean m11255o(int[] iArr, int[] iArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (iArr[i8] != iArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    private static void m11256q(int i7, Object obj, InterfaceC2525l0 interfaceC2525l0) {
        int iM11548a = AbstractC2523k0.m11548a(i7);
        int iM11549b = AbstractC2523k0.m11549b(i7);
        if (iM11549b == 0) {
            interfaceC2525l0.mo11510n(iM11548a, ((Long) obj).longValue());
            return;
        }
        if (iM11549b == 1) {
            interfaceC2525l0.mo11503h(iM11548a, ((Long) obj).longValue());
            return;
        }
        if (iM11549b == 2) {
            interfaceC2525l0.mo11491L(iM11548a, (AbstractC2512f) obj);
            return;
        }
        if (iM11549b != 3) {
            if (iM11549b != 5) {
                throw new RuntimeException(C2535v.m11648e());
            }
            interfaceC2525l0.mo11498d(iM11548a, ((Integer) obj).intValue());
        } else if (interfaceC2525l0.mo11505i() == InterfaceC2525l0.a.ASCENDING) {
            interfaceC2525l0.mo11513q(iM11548a);
            ((C2515g0) obj).m11265r(interfaceC2525l0);
            interfaceC2525l0.mo11481B(iM11548a);
        } else {
            interfaceC2525l0.mo11481B(iM11548a);
            ((C2515g0) obj).m11265r(interfaceC2525l0);
            interfaceC2525l0.mo11513q(iM11548a);
        }
    }

    /* JADX INFO: renamed from: a */
    void m11257a() {
        if (!this.f9549e) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: d */
    public int m11258d() {
        int iM11311R;
        int i7 = this.f9548d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f9545a; i9++) {
            int i10 = this.f9546b[i9];
            int iM11548a = AbstractC2523k0.m11548a(i10);
            int iM11549b = AbstractC2523k0.m11549b(i10);
            if (iM11549b == 0) {
                iM11311R = AbstractC2518i.m11311R(iM11548a, ((Long) this.f9547c[i9]).longValue());
            } else if (iM11549b == 1) {
                iM11311R = AbstractC2518i.m11328n(iM11548a, ((Long) this.f9547c[i9]).longValue());
            } else if (iM11549b == 2) {
                iM11311R = AbstractC2518i.m11320f(iM11548a, (AbstractC2512f) this.f9547c[i9]);
            } else if (iM11549b == 3) {
                iM11311R = (AbstractC2518i.m11308O(iM11548a) * 2) + ((C2515g0) this.f9547c[i9]).m11258d();
            } else {
                if (iM11549b != 5) {
                    throw new IllegalStateException(C2535v.m11648e());
                }
                iM11311R = AbstractC2518i.m11326l(iM11548a, ((Integer) this.f9547c[i9]).intValue());
            }
            i8 += iM11311R;
        }
        this.f9548d = i8;
        return i8;
    }

    /* JADX INFO: renamed from: e */
    public int m11259e() {
        int i7 = this.f9548d;
        if (i7 != -1) {
            return i7;
        }
        int iM11297D = 0;
        for (int i8 = 0; i8 < this.f9545a; i8++) {
            iM11297D += AbstractC2518i.m11297D(AbstractC2523k0.m11548a(this.f9546b[i8]), (AbstractC2512f) this.f9547c[i8]);
        }
        this.f9548d = iM11297D;
        return iM11297D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2515g0)) {
            return false;
        }
        C2515g0 c2515g0 = (C2515g0) obj;
        int i7 = this.f9545a;
        return i7 == c2515g0.f9545a && m11255o(this.f9546b, c2515g0.f9546b, i7) && m11254l(this.f9547c, c2515g0.f9547c, this.f9545a);
    }

    /* JADX INFO: renamed from: h */
    public void m11260h() {
        if (this.f9549e) {
            this.f9549e = false;
        }
    }

    public int hashCode() {
        int i7 = this.f9545a;
        return ((((527 + i7) * 31) + m11250f(this.f9546b, i7)) * 31) + m11251g(this.f9547c, this.f9545a);
    }

    /* JADX INFO: renamed from: i */
    C2515g0 m11261i(C2515g0 c2515g0) {
        if (c2515g0.equals(m11249c())) {
            return this;
        }
        m11257a();
        int i7 = this.f9545a + c2515g0.f9545a;
        m11248b(i7);
        System.arraycopy(c2515g0.f9546b, 0, this.f9546b, this.f9545a, c2515g0.f9545a);
        System.arraycopy(c2515g0.f9547c, 0, this.f9547c, this.f9545a, c2515g0.f9545a);
        this.f9545a = i7;
        return this;
    }

    /* JADX INFO: renamed from: m */
    final void m11262m(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f9545a; i8++) {
            AbstractC2488L.m10904d(sb, i7, String.valueOf(AbstractC2523k0.m11548a(this.f9546b[i8])), this.f9547c[i8]);
        }
    }

    /* JADX INFO: renamed from: n */
    void m11263n(int i7, Object obj) {
        m11257a();
        m11248b(this.f9545a + 1);
        int[] iArr = this.f9546b;
        int i8 = this.f9545a;
        iArr[i8] = i7;
        this.f9547c[i8] = obj;
        this.f9545a = i8 + 1;
    }

    /* JADX INFO: renamed from: p */
    void m11264p(InterfaceC2525l0 interfaceC2525l0) {
        if (interfaceC2525l0.mo11505i() == InterfaceC2525l0.a.DESCENDING) {
            for (int i7 = this.f9545a - 1; i7 >= 0; i7--) {
                interfaceC2525l0.mo11497c(AbstractC2523k0.m11548a(this.f9546b[i7]), this.f9547c[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.f9545a; i8++) {
            interfaceC2525l0.mo11497c(AbstractC2523k0.m11548a(this.f9546b[i8]), this.f9547c[i8]);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m11265r(InterfaceC2525l0 interfaceC2525l0) {
        if (this.f9545a == 0) {
            return;
        }
        if (interfaceC2525l0.mo11505i() == InterfaceC2525l0.a.ASCENDING) {
            for (int i7 = 0; i7 < this.f9545a; i7++) {
                m11256q(this.f9546b[i7], this.f9547c[i7], interfaceC2525l0);
            }
            return;
        }
        for (int i8 = this.f9545a - 1; i8 >= 0; i8--) {
            m11256q(this.f9546b[i8], this.f9547c[i8], interfaceC2525l0);
        }
    }

    private C2515g0(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f9548d = -1;
        this.f9545a = i7;
        this.f9546b = iArr;
        this.f9547c = objArr;
        this.f9549e = z7;
    }
}

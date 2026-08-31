package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5131v0 {

    /* JADX INFO: renamed from: f */
    private static final C5131v0 f19608f = new C5131v0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    private int f19609a;

    /* JADX INFO: renamed from: b */
    private int[] f19610b;

    /* JADX INFO: renamed from: c */
    private Object[] f19611c;

    /* JADX INFO: renamed from: d */
    private int f19612d;

    /* JADX INFO: renamed from: e */
    private boolean f19613e;

    private C5131v0() {
        this(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: b */
    private void m23640b(int i7) {
        int[] iArr = this.f19610b;
        if (i7 > iArr.length) {
            int i8 = this.f19609a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f19610b = Arrays.copyOf(iArr, i7);
            this.f19611c = Arrays.copyOf(this.f19611c, i7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C5131v0 m23641c() {
        return f19608f;
    }

    /* JADX INFO: renamed from: f */
    private static int m23642f(int[] iArr, int i7) {
        int i8 = 17;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        return i8;
    }

    /* JADX INFO: renamed from: g */
    private static int m23643g(Object[] objArr, int i7) {
        int iHashCode = 17;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: j */
    static C5131v0 m23644j(C5131v0 c5131v0, C5131v0 c5131v1) {
        int i7 = c5131v0.f19609a + c5131v1.f19609a;
        int[] iArrCopyOf = Arrays.copyOf(c5131v0.f19610b, i7);
        System.arraycopy(c5131v1.f19610b, 0, iArrCopyOf, c5131v0.f19609a, c5131v1.f19609a);
        Object[] objArrCopyOf = Arrays.copyOf(c5131v0.f19611c, i7);
        System.arraycopy(c5131v1.f19611c, 0, objArrCopyOf, c5131v0.f19609a, c5131v1.f19609a);
        return new C5131v0(i7, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: k */
    static C5131v0 m23645k() {
        return new C5131v0();
    }

    /* JADX INFO: renamed from: l */
    private static boolean m23646l(Object[] objArr, Object[] objArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (!objArr[i8].equals(objArr2[i8])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    private static boolean m23647o(int[] iArr, int[] iArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (iArr[i8] != iArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    private static void m23648q(int i7, Object obj, InterfaceC5064B0 interfaceC5064B0) {
        int iM22832a = AbstractC5062A0.m22832a(i7);
        int iM22833b = AbstractC5062A0.m22833b(i7);
        if (iM22833b == 0) {
            interfaceC5064B0.mo22878n(iM22832a, ((Long) obj).longValue());
            return;
        }
        if (iM22833b == 1) {
            interfaceC5064B0.mo22872h(iM22832a, ((Long) obj).longValue());
            return;
        }
        if (iM22833b == 2) {
            interfaceC5064B0.mo22863N(iM22832a, (AbstractC5104i) obj);
            return;
        }
        if (iM22833b != 3) {
            if (iM22833b != 5) {
                throw new RuntimeException(C5065C.m22894e());
            }
            interfaceC5064B0.mo22868d(iM22832a, ((Integer) obj).intValue());
        } else if (interfaceC5064B0.mo22873i() == InterfaceC5064B0.a.ASCENDING) {
            interfaceC5064B0.mo22881q(iM22832a);
            ((C5131v0) obj).m23657r(interfaceC5064B0);
            interfaceC5064B0.mo22851B(iM22832a);
        } else {
            interfaceC5064B0.mo22851B(iM22832a);
            ((C5131v0) obj).m23657r(interfaceC5064B0);
            interfaceC5064B0.mo22881q(iM22832a);
        }
    }

    /* JADX INFO: renamed from: a */
    void m23649a() {
        if (!this.f19613e) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: d */
    public int m23650d() {
        int iM23356T;
        int i7 = this.f19612d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f19609a; i9++) {
            int i10 = this.f19610b[i9];
            int iM22832a = AbstractC5062A0.m22832a(i10);
            int iM22833b = AbstractC5062A0.m22833b(i10);
            if (iM22833b == 0) {
                iM23356T = AbstractC5110l.m23356T(iM22832a, ((Long) this.f19611c[i9]).longValue());
            } else if (iM22833b == 1) {
                iM23356T = AbstractC5110l.m23375p(iM22832a, ((Long) this.f19611c[i9]).longValue());
            } else if (iM22833b == 2) {
                iM23356T = AbstractC5110l.m23367h(iM22832a, (AbstractC5104i) this.f19611c[i9]);
            } else if (iM22833b == 3) {
                iM23356T = (AbstractC5110l.m23353Q(iM22832a) * 2) + ((C5131v0) this.f19611c[i9]).m23650d();
            } else {
                if (iM22833b != 5) {
                    throw new IllegalStateException(C5065C.m22894e());
                }
                iM23356T = AbstractC5110l.m23373n(iM22832a, ((Integer) this.f19611c[i9]).intValue());
            }
            i8 += iM23356T;
        }
        this.f19612d = i8;
        return i8;
    }

    /* JADX INFO: renamed from: e */
    public int m23651e() {
        int i7 = this.f19612d;
        if (i7 != -1) {
            return i7;
        }
        int iM23342F = 0;
        for (int i8 = 0; i8 < this.f19609a; i8++) {
            iM23342F += AbstractC5110l.m23342F(AbstractC5062A0.m22832a(this.f19610b[i8]), (AbstractC5104i) this.f19611c[i8]);
        }
        this.f19612d = iM23342F;
        return iM23342F;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5131v0)) {
            return false;
        }
        C5131v0 c5131v0 = (C5131v0) obj;
        int i7 = this.f19609a;
        return i7 == c5131v0.f19609a && m23647o(this.f19610b, c5131v0.f19610b, i7) && m23646l(this.f19611c, c5131v0.f19611c, this.f19609a);
    }

    /* JADX INFO: renamed from: h */
    public void m23652h() {
        if (this.f19613e) {
            this.f19613e = false;
        }
    }

    public int hashCode() {
        int i7 = this.f19609a;
        return ((((527 + i7) * 31) + m23642f(this.f19610b, i7)) * 31) + m23643g(this.f19611c, this.f19609a);
    }

    /* JADX INFO: renamed from: i */
    C5131v0 m23653i(C5131v0 c5131v0) {
        if (c5131v0.equals(m23641c())) {
            return this;
        }
        m23649a();
        int i7 = this.f19609a + c5131v0.f19609a;
        m23640b(i7);
        System.arraycopy(c5131v0.f19610b, 0, this.f19610b, this.f19609a, c5131v0.f19609a);
        System.arraycopy(c5131v0.f19611c, 0, this.f19611c, this.f19609a, c5131v0.f19609a);
        this.f19609a = i7;
        return this;
    }

    /* JADX INFO: renamed from: m */
    final void m23654m(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f19609a; i8++) {
            AbstractC5084W.m22981d(sb, i7, String.valueOf(AbstractC5062A0.m22832a(this.f19610b[i8])), this.f19611c[i8]);
        }
    }

    /* JADX INFO: renamed from: n */
    void m23655n(int i7, Object obj) {
        m23649a();
        m23640b(this.f19609a + 1);
        int[] iArr = this.f19610b;
        int i8 = this.f19609a;
        iArr[i8] = i7;
        this.f19611c[i8] = obj;
        this.f19609a = i8 + 1;
    }

    /* JADX INFO: renamed from: p */
    void m23656p(InterfaceC5064B0 interfaceC5064B0) {
        if (interfaceC5064B0.mo22873i() == InterfaceC5064B0.a.DESCENDING) {
            for (int i7 = this.f19609a - 1; i7 >= 0; i7--) {
                interfaceC5064B0.mo22867c(AbstractC5062A0.m22832a(this.f19610b[i7]), this.f19611c[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.f19609a; i8++) {
            interfaceC5064B0.mo22867c(AbstractC5062A0.m22832a(this.f19610b[i8]), this.f19611c[i8]);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m23657r(InterfaceC5064B0 interfaceC5064B0) {
        if (this.f19609a == 0) {
            return;
        }
        if (interfaceC5064B0.mo22873i() == InterfaceC5064B0.a.ASCENDING) {
            for (int i7 = 0; i7 < this.f19609a; i7++) {
                m23648q(this.f19610b[i7], this.f19611c[i7], interfaceC5064B0);
            }
            return;
        }
        for (int i8 = this.f19609a - 1; i8 >= 0; i8--) {
            m23648q(this.f19610b[i8], this.f19611c[i8], interfaceC5064B0);
        }
    }

    private C5131v0(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f19612d = -1;
        this.f19609a = i7;
        this.f19610b = iArr;
        this.f19611c = objArr;
        this.f19613e = z7;
    }
}

package com.google.protobuf;

import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.internal.ads.zzbbn;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.X */
/* JADX INFO: loaded from: classes.dex */
final class C5085X implements InterfaceC5113m0 {

    /* JADX INFO: renamed from: r */
    private static final int[] f19350r = new int[0];

    /* JADX INFO: renamed from: s */
    private static final Unsafe f19351s = AbstractC5137y0.m23736H();

    /* JADX INFO: renamed from: a */
    private final int[] f19352a;

    /* JADX INFO: renamed from: b */
    private final Object[] f19353b;

    /* JADX INFO: renamed from: c */
    private final int f19354c;

    /* JADX INFO: renamed from: d */
    private final int f19355d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC5082U f19356e;

    /* JADX INFO: renamed from: f */
    private final boolean f19357f;

    /* JADX INFO: renamed from: g */
    private final boolean f19358g;

    /* JADX INFO: renamed from: h */
    private final EnumC5101g0 f19359h;

    /* JADX INFO: renamed from: i */
    private final boolean f19360i;

    /* JADX INFO: renamed from: j */
    private final int[] f19361j;

    /* JADX INFO: renamed from: k */
    private final int f19362k;

    /* JADX INFO: renamed from: l */
    private final int f19363l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC5087Z f19364m;

    /* JADX INFO: renamed from: n */
    private final AbstractC5072J f19365n;

    /* JADX INFO: renamed from: o */
    private final AbstractC5129u0 f19366o;

    /* JADX INFO: renamed from: p */
    private final AbstractC5122r f19367p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC5077O f19368q;

    /* JADX INFO: renamed from: com.google.protobuf.X$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f19369a;

        static {
            int[] iArr = new int[AbstractC5062A0.b.values().length];
            f19369a = iArr;
            try {
                iArr[AbstractC5062A0.b.f19274u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19278y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19267c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19273t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19262B.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19272s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19263C.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19268d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19261A.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19271r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19279z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19269e.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19270f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19277x.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19264D.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19265E.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19369a[AbstractC5062A0.b.f19275v.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C5085X(int[] iArr, Object[] objArr, int i7, int i8, InterfaceC5082U interfaceC5082U, EnumC5101g0 enumC5101g0, boolean z7, int[] iArr2, int i9, int i10, InterfaceC5087Z interfaceC5087Z, AbstractC5072J abstractC5072J, AbstractC5129u0 abstractC5129u0, AbstractC5122r abstractC5122r, InterfaceC5077O interfaceC5077O) {
        this.f19352a = iArr;
        this.f19353b = objArr;
        this.f19354c = i7;
        this.f19355d = i8;
        this.f19358g = interfaceC5082U instanceof AbstractC5136y;
        this.f19359h = enumC5101g0;
        this.f19357f = abstractC5122r != null && abstractC5122r.mo23568e(interfaceC5082U);
        this.f19360i = z7;
        this.f19361j = iArr2;
        this.f19362k = i9;
        this.f19363l = i10;
        this.f19364m = interfaceC5087Z;
        this.f19365n = abstractC5072J;
        this.f19366o = abstractC5129u0;
        this.f19367p = abstractC5122r;
        this.f19356e = interfaceC5082U;
        this.f19368q = interfaceC5077O;
    }

    /* JADX INFO: renamed from: A */
    private boolean m22984A(Object obj, int i7) {
        int iM23017i0 = m23017i0(i7);
        long j7 = 1048575 & iM23017i0;
        if (j7 != 1048575) {
            return (AbstractC5137y0.m23731C(obj, j7) & (1 << (iM23017i0 >>> 20))) != 0;
        }
        int iM23040u0 = m23040u0(i7);
        long jM23006W = m23006W(iM23040u0);
        switch (m23038t0(iM23040u0)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC5137y0.m23729A(obj, jM23006W)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC5137y0.m23730B(obj, jM23006W)) != 0;
            case 2:
                return AbstractC5137y0.m23733E(obj, jM23006W) != 0;
            case 3:
                return AbstractC5137y0.m23733E(obj, jM23006W) != 0;
            case 4:
                return AbstractC5137y0.m23731C(obj, jM23006W) != 0;
            case 5:
                return AbstractC5137y0.m23733E(obj, jM23006W) != 0;
            case 6:
                return AbstractC5137y0.m23731C(obj, jM23006W) != 0;
            case 7:
                return AbstractC5137y0.m23772t(obj, jM23006W);
            case 8:
                Object objM23735G = AbstractC5137y0.m23735G(obj, jM23006W);
                if (objM23735G instanceof String) {
                    return !((String) objM23735G).isEmpty();
                }
                if (objM23735G instanceof AbstractC5104i) {
                    return !AbstractC5104i.f19401b.equals(objM23735G);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC5137y0.m23735G(obj, jM23006W) != null;
            case 10:
                return !AbstractC5104i.f19401b.equals(AbstractC5137y0.m23735G(obj, jM23006W));
            case 11:
                return AbstractC5137y0.m23731C(obj, jM23006W) != 0;
            case 12:
                return AbstractC5137y0.m23731C(obj, jM23006W) != 0;
            case 13:
                return AbstractC5137y0.m23731C(obj, jM23006W) != 0;
            case 14:
                return AbstractC5137y0.m23733E(obj, jM23006W) != 0;
            case 15:
                return AbstractC5137y0.m23731C(obj, jM23006W) != 0;
            case 16:
                return AbstractC5137y0.m23733E(obj, jM23006W) != 0;
            case 17:
                return AbstractC5137y0.m23735G(obj, jM23006W) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: B */
    private boolean m22985B(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return m22984A(obj, i7);
        }
        return (i9 & i10) != 0;
    }

    /* JADX INFO: renamed from: C */
    private static boolean m22986C(Object obj, int i7, InterfaceC5113m0 interfaceC5113m0) {
        return interfaceC5113m0.mo23053c(AbstractC5137y0.m23735G(obj, m23006W(i7)));
    }

    /* JADX INFO: renamed from: D */
    private static boolean m22987D(int i7) {
        return (i7 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: E */
    private boolean m22988E(Object obj, int i7, int i8) {
        List list = (List) AbstractC5137y0.m23735G(obj, m23006W(i7));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC5113m0 interfaceC5113m0M23041v = m23041v(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (!interfaceC5113m0M23041v.mo23053c(list.get(i9))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    private boolean m22989F(Object obj, int i7, int i8) {
        Map mapMo22960h = this.f19368q.mo22960h(AbstractC5137y0.m23735G(obj, m23006W(i7)));
        if (mapMo22960h.isEmpty()) {
            return true;
        }
        if (this.f19368q.mo22955c(m23039u(i8)).f19343c.m22835c() != AbstractC5062A0.c.MESSAGE) {
            return true;
        }
        InterfaceC5113m0 interfaceC5113m0M23148c = null;
        for (Object obj2 : mapMo22960h.values()) {
            if (interfaceC5113m0M23148c == null) {
                interfaceC5113m0M23148c = C5103h0.m23146a().m23148c(obj2.getClass());
            }
            if (!interfaceC5113m0M23148c.mo23053c(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    private static boolean m22990G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC5136y) {
            return ((AbstractC5136y) obj).m23703I();
        }
        return true;
    }

    /* JADX INFO: renamed from: H */
    private boolean m22991H(Object obj, Object obj2, int i7) {
        long jM23017i0 = m23017i0(i7) & 1048575;
        return AbstractC5137y0.m23731C(obj, jM23017i0) == AbstractC5137y0.m23731C(obj2, jM23017i0);
    }

    /* JADX INFO: renamed from: I */
    private boolean m22992I(Object obj, int i7, int i8) {
        return AbstractC5137y0.m23731C(obj, (long) (m23017i0(i8) & 1048575)) == i7;
    }

    /* JADX INFO: renamed from: J */
    private static boolean m22993J(int i7) {
        return (i7 & 268435456) != 0;
    }

    /* JADX INFO: renamed from: K */
    private static long m22994K(Object obj, long j7) {
        return AbstractC5137y0.m23733E(obj, j7);
    }

    /* JADX WARN: Code duplicated, block: B:232:0x06d8 A[Catch: all -> 0x06f9, TRY_LEAVE, TryCatch #12 {all -> 0x06f9, blocks: (B:230:0x06d2, B:232:0x06d8, B:243:0x06fd, B:244:0x0702), top: B:279:0x06d2 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x06e5 A[LOOP:2: B:235:0x06e1->B:237:0x06e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x06fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x06fd A[Catch: all -> 0x06f9, TRY_ENTER, TryCatch #12 {all -> 0x06f9, blocks: (B:230:0x06d2, B:232:0x06d8, B:243:0x06fd, B:244:0x0702), top: B:279:0x06d2 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x0710 A[LOOP:3: B:247:0x070c->B:249:0x0710, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x0733 A[LOOP:4: B:257:0x072f->B:259:0x0733, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x0746  */
    /* JADX WARN: Code duplicated, block: B:321:0x06de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0709 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: L */
    private void m22995L(AbstractC5129u0 abstractC5129u0, AbstractC5122r abstractC5122r, Object obj, InterfaceC5109k0 interfaceC5109k0, C5120q c5120q) throws Throwable {
        Object obj2;
        int i7;
        Object objM23033r;
        AbstractC5129u0 abstractC5129u1;
        C5085X c5085x;
        Object obj3;
        Object objMo23625f;
        AbstractC5129u0 abstractC5129u2;
        AbstractC5122r abstractC5122r2;
        Object objMo23565b;
        AbstractC5129u0 abstractC5129u3;
        int i8;
        Object objM23033r2;
        int i9;
        InterfaceC5109k0 interfaceC5109k1;
        C5085X c5085x2;
        Object obj4;
        Object obj5;
        C5085X c5085x3 = this;
        C5120q c5120q2 = c5120q;
        C5128u c5128uMo23567d = null;
        Object objMo23570g = null;
        while (true) {
            try {
                int iMo23333w = interfaceC5109k0.mo23333w();
                int iM23015g0 = c5085x3.m23015g0(iMo23333w);
                if (iM23015g0 >= 0) {
                    obj3 = obj;
                    c5120q = c5120q2;
                    objMo23625f = objMo23570g;
                    abstractC5129u2 = abstractC5129u0;
                    InterfaceC5109k0 interfaceC5109k2 = interfaceC5109k0;
                    try {
                        int iM23040u0 = c5085x3.m23040u0(iM23015g0);
                        try {
                            switch (m23038t0(iM23040u0)) {
                                case 0:
                                    AbstractC5137y0.m23746R(obj3, m23006W(iM23040u0), interfaceC5109k2.readDouble());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 1:
                                    AbstractC5137y0.m23747S(obj3, m23006W(iM23040u0), interfaceC5109k2.readFloat());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 2:
                                    AbstractC5137y0.m23749U(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23301G());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 3:
                                    AbstractC5137y0.m23749U(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23313c());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 4:
                                    AbstractC5137y0.m23748T(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23296B());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 5:
                                    AbstractC5137y0.m23749U(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23314d());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 6:
                                    AbstractC5137y0.m23748T(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23318h());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 7:
                                    AbstractC5137y0.m23740L(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23319i());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 8:
                                    c5085x3.m23022l0(obj3, iM23040u0, interfaceC5109k2);
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 9:
                                    InterfaceC5082U interfaceC5082U = (InterfaceC5082U) c5085x3.m23000Q(obj3, iM23015g0);
                                    interfaceC5109k2.mo23307M(interfaceC5082U, c5085x3.m23041v(iM23015g0), c5120q);
                                    c5085x3.m23034r0(obj3, iM23015g0, interfaceC5082U);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 10:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23336z());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 11:
                                    AbstractC5137y0.m23748T(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23322l());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 12:
                                    int iMo23327q = interfaceC5109k2.mo23327q();
                                    c5085x3.m23037t(iM23015g0);
                                    AbstractC5137y0.m23748T(obj3, m23006W(iM23040u0), iMo23327q);
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 13:
                                    AbstractC5137y0.m23748T(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23298D());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 14:
                                    AbstractC5137y0.m23749U(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23320j());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 15:
                                    AbstractC5137y0.m23748T(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23329s());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 16:
                                    AbstractC5137y0.m23749U(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23330t());
                                    c5085x3.m23028o0(obj3, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 17:
                                    InterfaceC5082U interfaceC5082U2 = (InterfaceC5082U) c5085x3.m23000Q(obj3, iM23015g0);
                                    interfaceC5109k2.mo23305K(interfaceC5082U2, c5085x3.m23041v(iM23015g0), c5120q);
                                    c5085x3.m23034r0(obj3, iM23015g0, interfaceC5082U2);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 18:
                                    interfaceC5109k2.mo23300F(c5085x3.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 19:
                                    interfaceC5109k2.mo23295A(c5085x3.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 20:
                                    interfaceC5109k2.mo23323m(c5085x3.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case zzbbn.zzt.zzm /* 21 */:
                                    interfaceC5109k2.mo23321k(c5085x3.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 22:
                                    interfaceC5109k2.mo23325o(c5085x3.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 23:
                                    interfaceC5109k2.mo23303I(c5085x3.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 24:
                                    interfaceC5109k2.mo23328r(c5085x3.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 25:
                                    interfaceC5109k2.mo23331u(c5085x3.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 26:
                                    c5085x3.m23024m0(obj3, iM23040u0, interfaceC5109k2);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 27:
                                    abstractC5129u0 = abstractC5129u2;
                                    obj2 = obj3;
                                    C5085X c5085x4 = c5085x3;
                                    try {
                                        c5120q = c5120q;
                                        try {
                                            c5085x3.m23020k0(obj2, iM23040u0, interfaceC5109k2, c5085x4.m23041v(iM23015g0), c5120q);
                                            objMo23570g = objMo23625f;
                                        } catch (C5065C.a unused) {
                                            objMo23570g = objMo23625f;
                                            try {
                                                if (abstractC5129u0.mo23635q(interfaceC5109k2)) {
                                                    if (objMo23570g == null) {
                                                        objMo23570g = abstractC5129u0.mo23625f(obj2);
                                                    }
                                                    if (!abstractC5129u0.m23631m(objMo23570g, interfaceC5109k2, 0)) {
                                                        objM23033r2 = objMo23570g;
                                                        for (i8 = c5085x3.f19362k; i8 < c5085x3.f19363l; i8++) {
                                                            objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i8], objM23033r2, abstractC5129u0, obj);
                                                        }
                                                        if (objM23033r2 == null) {
                                                            return;
                                                        }
                                                        abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                        return;
                                                    }
                                                } else if (!interfaceC5109k2.mo23297C()) {
                                                    objM23033r2 = objMo23570g;
                                                    for (i9 = c5085x3.f19362k; i9 < c5085x3.f19363l; i9++) {
                                                        objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i9], objM23033r2, abstractC5129u0, obj);
                                                    }
                                                    if (objM23033r2 == null) {
                                                        return;
                                                    }
                                                    abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (C5065C.a unused2) {
                                        c5120q = c5120q;
                                        c5085x3 = c5085x4;
                                        interfaceC5109k2 = interfaceC5109k2;
                                    }
                                    c5120q2 = c5120q;
                                    break;
                                case 28:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23299E(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 29:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    abstractC5129u0 = abstractC5129u2;
                                    obj2 = obj3;
                                    c5085x2 = c5085x3;
                                    try {
                                        try {
                                            interfaceC5109k1.mo23317g(c5085x2.f19365n.mo22924e(obj2, m23006W(iM23040u0)));
                                            c5085x3 = c5085x2;
                                            objMo23570g = objMo23625f;
                                        } catch (C5065C.a unused3) {
                                            c5085x3 = c5085x2;
                                            objMo23570g = objMo23625f;
                                            interfaceC5109k2 = interfaceC5109k1;
                                            if (abstractC5129u0.mo23635q(interfaceC5109k2)) {
                                                if (objMo23570g == null) {
                                                    objMo23570g = abstractC5129u0.mo23625f(obj2);
                                                }
                                                if (!abstractC5129u0.m23631m(objMo23570g, interfaceC5109k2, 0)) {
                                                    objM23033r2 = objMo23570g;
                                                    while (i8 < c5085x3.f19363l) {
                                                        objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i8], objM23033r2, abstractC5129u0, obj);
                                                    }
                                                    if (objM23033r2 == null) {
                                                        return;
                                                    }
                                                    abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                    return;
                                                }
                                            } else if (!interfaceC5109k2.mo23297C()) {
                                                objM23033r2 = objMo23570g;
                                                while (i9 < c5085x3.f19363l) {
                                                    objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i9], objM23033r2, abstractC5129u0, obj);
                                                }
                                                if (objM23033r2 == null) {
                                                    return;
                                                }
                                                abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                return;
                                            }
                                        }
                                        c5120q2 = c5120q;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c5085x3 = c5085x2;
                                        objMo23570g = objMo23625f;
                                        i7 = c5085x3.f19362k;
                                        objM23033r = objMo23570g;
                                        while (i7 < c5085x3.f19363l) {
                                            objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                                            i7++;
                                            c5085x3 = this;
                                        }
                                        abstractC5129u1 = abstractC5129u0;
                                        if (objM23033r != null) {
                                            abstractC5129u1.mo23633o(obj2, objM23033r);
                                        }
                                        throw th;
                                    }
                                    break;
                                case 30:
                                    c5085x2 = c5085x3;
                                    obj2 = obj3;
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    try {
                                        try {
                                            List listMo22924e = c5085x2.f19365n.mo22924e(obj2, m23006W(iM23040u0));
                                            interfaceC5109k1.mo23326p(listMo22924e);
                                            try {
                                                c5085x2.m23037t(iM23015g0);
                                                obj4 = obj2;
                                                try {
                                                    objMo23570g = AbstractC5117o0.m23529z(obj4, iMo23333w, listMo22924e, null, objMo23570g, abstractC5129u0);
                                                    c5120q = c5120q;
                                                    c5085x3 = c5085x2;
                                                } catch (C5065C.a unused4) {
                                                    abstractC5129u0 = abstractC5129u0;
                                                    obj2 = obj4;
                                                    c5085x3 = c5085x2;
                                                    interfaceC5109k2 = interfaceC5109k1;
                                                    if (abstractC5129u0.mo23635q(interfaceC5109k2)) {
                                                        if (objMo23570g == null) {
                                                            objMo23570g = abstractC5129u0.mo23625f(obj2);
                                                        }
                                                        if (!abstractC5129u0.m23631m(objMo23570g, interfaceC5109k2, 0)) {
                                                            objM23033r2 = objMo23570g;
                                                            while (i8 < c5085x3.f19363l) {
                                                                objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i8], objM23033r2, abstractC5129u0, obj);
                                                            }
                                                            if (objM23033r2 == null) {
                                                                return;
                                                            }
                                                            abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                            return;
                                                        }
                                                    } else if (!interfaceC5109k2.mo23297C()) {
                                                        objM23033r2 = objMo23570g;
                                                        while (i9 < c5085x3.f19363l) {
                                                            objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i9], objM23033r2, abstractC5129u0, obj);
                                                        }
                                                        if (objM23033r2 == null) {
                                                            return;
                                                        }
                                                        abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                        return;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    obj2 = obj4;
                                                    abstractC5129u0 = abstractC5129u0;
                                                    c5085x3 = c5085x2;
                                                    i7 = c5085x3.f19362k;
                                                    objM23033r = objMo23570g;
                                                    while (i7 < c5085x3.f19363l) {
                                                        objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                                                        i7++;
                                                        c5085x3 = this;
                                                    }
                                                    abstractC5129u1 = abstractC5129u0;
                                                    if (objM23033r != null) {
                                                        abstractC5129u1.mo23633o(obj2, objM23033r);
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                abstractC5129u0 = abstractC5129u0;
                                                objMo23625f = objMo23570g;
                                                c5085x3 = c5085x2;
                                                objMo23570g = objMo23625f;
                                                i7 = c5085x3.f19362k;
                                                objM23033r = objMo23570g;
                                                while (i7 < c5085x3.f19363l) {
                                                    objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                                                    i7++;
                                                    c5085x3 = this;
                                                }
                                                abstractC5129u1 = abstractC5129u0;
                                                if (objM23033r != null) {
                                                    abstractC5129u1.mo23633o(obj2, objM23033r);
                                                }
                                                throw th;
                                            }
                                            break;
                                        } catch (C5065C.a unused5) {
                                            c5085x3 = c5085x2;
                                            interfaceC5109k2 = interfaceC5109k1;
                                            if (abstractC5129u0.mo23635q(interfaceC5109k2)) {
                                                if (objMo23570g == null) {
                                                    objMo23570g = abstractC5129u0.mo23625f(obj2);
                                                }
                                                if (!abstractC5129u0.m23631m(objMo23570g, interfaceC5109k2, 0)) {
                                                    objM23033r2 = objMo23570g;
                                                    while (i8 < c5085x3.f19363l) {
                                                        objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i8], objM23033r2, abstractC5129u0, obj);
                                                    }
                                                    if (objM23033r2 == null) {
                                                        return;
                                                    }
                                                    abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                    return;
                                                }
                                            } else if (!interfaceC5109k2.mo23297C()) {
                                                objM23033r2 = objMo23570g;
                                                while (i9 < c5085x3.f19363l) {
                                                    objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i9], objM23033r2, abstractC5129u0, obj);
                                                }
                                                if (objM23033r2 == null) {
                                                    return;
                                                }
                                                abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                return;
                                            }
                                        }
                                        c5120q2 = c5120q;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        abstractC5129u0 = abstractC5129u0;
                                    }
                                    break;
                                case 31:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23315e(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23625f = objMo23570g;
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 32:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23324n(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23625f = objMo23570g;
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 33:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23312b(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23625f = objMo23570g;
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 34:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23316f(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23625f = objMo23570g;
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 35:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23300F(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23625f = objMo23570g;
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 36:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23295A(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23625f = objMo23570g;
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 37:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23323m(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23625f = objMo23570g;
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 38:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23321k(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23625f = objMo23570g;
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 39:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23325o(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23625f = objMo23570g;
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 40:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23303I(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23625f = objMo23570g;
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 41:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23328r(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23625f = objMo23570g;
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 42:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    interfaceC5109k1.mo23331u(c5085x2.f19365n.mo22924e(obj3, m23006W(iM23040u0)));
                                    objMo23625f = objMo23570g;
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 43:
                                    interfaceC5109k1 = interfaceC5109k2;
                                    obj2 = obj3;
                                    objMo23570g = objMo23625f;
                                    c5085x2 = c5085x3;
                                    try {
                                        interfaceC5109k1.mo23317g(c5085x2.f19365n.mo22924e(obj2, m23006W(iM23040u0)));
                                        objMo23625f = objMo23570g;
                                        c5085x3 = c5085x2;
                                        objMo23570g = objMo23625f;
                                    } catch (C5065C.a unused6) {
                                        c5085x3 = c5085x2;
                                        interfaceC5109k2 = interfaceC5109k1;
                                        if (abstractC5129u0.mo23635q(interfaceC5109k2)) {
                                            if (objMo23570g == null) {
                                                objMo23570g = abstractC5129u0.mo23625f(obj2);
                                            }
                                            if (!abstractC5129u0.m23631m(objMo23570g, interfaceC5109k2, 0)) {
                                                objM23033r2 = objMo23570g;
                                                while (i8 < c5085x3.f19363l) {
                                                    objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i8], objM23033r2, abstractC5129u0, obj);
                                                }
                                                if (objM23033r2 == null) {
                                                    return;
                                                }
                                                abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                return;
                                            }
                                        } else if (!interfaceC5109k2.mo23297C()) {
                                            objM23033r2 = objMo23570g;
                                            while (i9 < c5085x3.f19363l) {
                                                objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i9], objM23033r2, abstractC5129u0, obj);
                                            }
                                            if (objM23033r2 == null) {
                                                return;
                                            }
                                            abstractC5129u0.mo23633o(obj2, objM23033r2);
                                            return;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        abstractC5129u0 = abstractC5129u0;
                                        c5085x3 = c5085x2;
                                        i7 = c5085x3.f19362k;
                                        objM23033r = objMo23570g;
                                        while (i7 < c5085x3.f19363l) {
                                            objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                                            i7++;
                                            c5085x3 = this;
                                        }
                                        abstractC5129u1 = abstractC5129u0;
                                        if (objM23033r != null) {
                                            abstractC5129u1.mo23633o(obj2, objM23033r);
                                        }
                                        throw th;
                                    }
                                    c5120q2 = c5120q;
                                    break;
                                case 44:
                                    c5085x2 = c5085x3;
                                    obj4 = obj3;
                                    interfaceC5109k1 = interfaceC5109k2;
                                    try {
                                        List listMo22924e2 = c5085x2.f19365n.mo22924e(obj4, m23006W(iM23040u0));
                                        interfaceC5109k1.mo23326p(listMo22924e2);
                                        c5085x2.m23037t(iM23015g0);
                                        objMo23570g = objMo23625f;
                                        try {
                                            objMo23570g = AbstractC5117o0.m23529z(obj4, iMo23333w, listMo22924e2, null, objMo23570g, abstractC5129u2);
                                            c5120q = c5120q;
                                            c5085x3 = c5085x2;
                                        } catch (C5065C.a unused7) {
                                            abstractC5129u0 = abstractC5129u0;
                                            obj2 = obj4;
                                            c5085x3 = c5085x2;
                                            interfaceC5109k2 = interfaceC5109k1;
                                            if (abstractC5129u0.mo23635q(interfaceC5109k2)) {
                                                if (objMo23570g == null) {
                                                    objMo23570g = abstractC5129u0.mo23625f(obj2);
                                                }
                                                if (!abstractC5129u0.m23631m(objMo23570g, interfaceC5109k2, 0)) {
                                                    objM23033r2 = objMo23570g;
                                                    while (i8 < c5085x3.f19363l) {
                                                        objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i8], objM23033r2, abstractC5129u0, obj);
                                                    }
                                                    if (objM23033r2 == null) {
                                                        return;
                                                    }
                                                    abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                    return;
                                                }
                                            } else if (!interfaceC5109k2.mo23297C()) {
                                                objM23033r2 = objMo23570g;
                                                while (i9 < c5085x3.f19363l) {
                                                    objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i9], objM23033r2, abstractC5129u0, obj);
                                                }
                                                if (objM23033r2 == null) {
                                                    return;
                                                }
                                                abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                return;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            obj2 = obj4;
                                            abstractC5129u0 = abstractC5129u0;
                                            c5085x3 = c5085x2;
                                            i7 = c5085x3.f19362k;
                                            objM23033r = objMo23570g;
                                            while (i7 < c5085x3.f19363l) {
                                                objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                                                i7++;
                                                c5085x3 = this;
                                            }
                                            abstractC5129u1 = abstractC5129u0;
                                            if (objM23033r != null) {
                                                abstractC5129u1.mo23633o(obj2, objM23033r);
                                            }
                                            throw th;
                                        }
                                    } catch (C5065C.a unused8) {
                                        objMo23570g = objMo23625f;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        obj2 = obj4;
                                        objMo23570g = objMo23625f;
                                    }
                                    c5120q2 = c5120q;
                                    break;
                                case 45:
                                    c5085x2 = c5085x3;
                                    obj5 = obj3;
                                    interfaceC5109k1 = interfaceC5109k2;
                                    interfaceC5109k1.mo23315e(c5085x2.f19365n.mo22924e(obj5, m23006W(iM23040u0)));
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 46:
                                    c5085x2 = c5085x3;
                                    obj5 = obj3;
                                    interfaceC5109k1 = interfaceC5109k2;
                                    interfaceC5109k1.mo23324n(c5085x2.f19365n.mo22924e(obj5, m23006W(iM23040u0)));
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 47:
                                    c5085x2 = c5085x3;
                                    obj5 = obj3;
                                    interfaceC5109k1 = interfaceC5109k2;
                                    interfaceC5109k1.mo23312b(c5085x2.f19365n.mo22924e(obj5, m23006W(iM23040u0)));
                                    c5085x3 = c5085x2;
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 48:
                                    c5085x2 = c5085x3;
                                    obj5 = obj3;
                                    interfaceC5109k1 = interfaceC5109k2;
                                    abstractC5129u0 = abstractC5129u2;
                                    try {
                                        interfaceC5109k1.mo23316f(c5085x2.f19365n.mo22924e(obj5, m23006W(iM23040u0)));
                                        c5085x3 = c5085x2;
                                        objMo23570g = objMo23625f;
                                    } catch (C5065C.a unused9) {
                                        obj2 = obj5;
                                        c5085x3 = c5085x2;
                                        objMo23570g = objMo23625f;
                                        interfaceC5109k2 = interfaceC5109k1;
                                        if (abstractC5129u0.mo23635q(interfaceC5109k2)) {
                                            if (objMo23570g == null) {
                                                objMo23570g = abstractC5129u0.mo23625f(obj2);
                                            }
                                            if (!abstractC5129u0.m23631m(objMo23570g, interfaceC5109k2, 0)) {
                                                objM23033r2 = objMo23570g;
                                                while (i8 < c5085x3.f19363l) {
                                                    objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i8], objM23033r2, abstractC5129u0, obj);
                                                }
                                                if (objM23033r2 == null) {
                                                    return;
                                                }
                                                abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                return;
                                            }
                                        } else if (!interfaceC5109k2.mo23297C()) {
                                            objM23033r2 = objMo23570g;
                                            while (i9 < c5085x3.f19363l) {
                                                objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i9], objM23033r2, abstractC5129u0, obj);
                                            }
                                            if (objM23033r2 == null) {
                                                return;
                                            }
                                            abstractC5129u0.mo23633o(obj2, objM23033r2);
                                            return;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        obj2 = obj5;
                                        c5085x3 = c5085x2;
                                        objMo23570g = objMo23625f;
                                        i7 = c5085x3.f19362k;
                                        objM23033r = objMo23570g;
                                        while (i7 < c5085x3.f19363l) {
                                            objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                                            i7++;
                                            c5085x3 = this;
                                        }
                                        abstractC5129u1 = abstractC5129u0;
                                        if (objM23033r != null) {
                                            abstractC5129u1.mo23633o(obj2, objM23033r);
                                        }
                                        throw th;
                                    }
                                    c5120q2 = c5120q;
                                    break;
                                case 49:
                                    abstractC5129u0 = abstractC5129u2;
                                    try {
                                        obj2 = obj;
                                        try {
                                            c5085x3.m23018j0(obj2, m23006W(iM23040u0), interfaceC5109k0, c5085x3.m23041v(iM23015g0), c5120q);
                                            c5085x2 = c5085x3;
                                            obj5 = obj2;
                                            interfaceC5109k1 = interfaceC5109k0;
                                            c5085x3 = c5085x2;
                                            objMo23570g = objMo23625f;
                                        } catch (C5065C.a unused10) {
                                            c5120q = c5120q;
                                            interfaceC5109k2 = interfaceC5109k0;
                                            objMo23570g = objMo23625f;
                                            if (abstractC5129u0.mo23635q(interfaceC5109k2)) {
                                                if (objMo23570g == null) {
                                                    objMo23570g = abstractC5129u0.mo23625f(obj2);
                                                }
                                                if (!abstractC5129u0.m23631m(objMo23570g, interfaceC5109k2, 0)) {
                                                    objM23033r2 = objMo23570g;
                                                    while (i8 < c5085x3.f19363l) {
                                                        objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i8], objM23033r2, abstractC5129u0, obj);
                                                    }
                                                    if (objM23033r2 == null) {
                                                        return;
                                                    }
                                                    abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                    return;
                                                }
                                            } else if (!interfaceC5109k2.mo23297C()) {
                                                objM23033r2 = objMo23570g;
                                                while (i9 < c5085x3.f19363l) {
                                                    objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i9], objM23033r2, abstractC5129u0, obj);
                                                }
                                                if (objM23033r2 == null) {
                                                    return;
                                                }
                                                abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                return;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            c5085x2 = c5085x3;
                                            c5085x3 = c5085x2;
                                            objMo23570g = objMo23625f;
                                            i7 = c5085x3.f19362k;
                                            objM23033r = objMo23570g;
                                            while (i7 < c5085x3.f19363l) {
                                                objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                                                i7++;
                                                c5085x3 = this;
                                            }
                                            abstractC5129u1 = abstractC5129u0;
                                            if (objM23033r != null) {
                                                abstractC5129u1.mo23633o(obj2, objM23033r);
                                            }
                                            throw th;
                                        }
                                        c5120q2 = c5120q;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        c5085x2 = c5085x3;
                                        obj5 = obj;
                                        obj2 = obj5;
                                        c5085x3 = c5085x2;
                                        objMo23570g = objMo23625f;
                                        i7 = c5085x3.f19362k;
                                        objM23033r = objMo23570g;
                                        while (i7 < c5085x3.f19363l) {
                                            objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                                            i7++;
                                            c5085x3 = this;
                                        }
                                        abstractC5129u1 = abstractC5129u0;
                                        if (objM23033r != null) {
                                            abstractC5129u1.mo23633o(obj2, objM23033r);
                                        }
                                        throw th;
                                    }
                                    break;
                                case 50:
                                    abstractC5129u0 = abstractC5129u2;
                                    try {
                                        try {
                                            c5085x3.m22996M(obj3, iM23015g0, c5085x3.m23039u(iM23015g0), c5120q, interfaceC5109k0);
                                            c5120q = c5120q;
                                            objMo23570g = objMo23625f;
                                        } catch (Throwable th13) {
                                            th = th13;
                                            obj2 = obj;
                                        }
                                        break;
                                    } catch (C5065C.a unused11) {
                                        obj2 = obj;
                                        interfaceC5109k2 = interfaceC5109k0;
                                        c5120q = c5120q;
                                        objMo23570g = objMo23625f;
                                        if (abstractC5129u0.mo23635q(interfaceC5109k2)) {
                                            if (objMo23570g == null) {
                                                objMo23570g = abstractC5129u0.mo23625f(obj2);
                                            }
                                            if (!abstractC5129u0.m23631m(objMo23570g, interfaceC5109k2, 0)) {
                                                objM23033r2 = objMo23570g;
                                                while (i8 < c5085x3.f19363l) {
                                                    objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i8], objM23033r2, abstractC5129u0, obj);
                                                }
                                                if (objM23033r2 == null) {
                                                    return;
                                                }
                                                abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                return;
                                            }
                                        } else if (!interfaceC5109k2.mo23297C()) {
                                            objM23033r2 = objMo23570g;
                                            while (i9 < c5085x3.f19363l) {
                                                objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i9], objM23033r2, abstractC5129u0, obj);
                                            }
                                            if (objM23033r2 == null) {
                                                return;
                                            }
                                            abstractC5129u0.mo23633o(obj2, objM23033r2);
                                            return;
                                        }
                                    }
                                    c5120q2 = c5120q;
                                    break;
                                case 51:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Double.valueOf(interfaceC5109k2.readDouble()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 52:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Float.valueOf(interfaceC5109k2.readFloat()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 53:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Long.valueOf(interfaceC5109k2.mo23301G()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 54:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Long.valueOf(interfaceC5109k2.mo23313c()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 55:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Integer.valueOf(interfaceC5109k2.mo23296B()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 56:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Long.valueOf(interfaceC5109k2.mo23314d()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 57:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Integer.valueOf(interfaceC5109k2.mo23318h()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 58:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Boolean.valueOf(interfaceC5109k2.mo23319i()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 59:
                                    c5085x3.m23022l0(obj3, iM23040u0, interfaceC5109k2);
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 60:
                                    InterfaceC5082U interfaceC5082U3 = (InterfaceC5082U) c5085x3.m23001R(obj3, iMo23333w, iM23015g0);
                                    interfaceC5109k2.mo23307M(interfaceC5082U3, c5085x3.m23041v(iM23015g0), c5120q);
                                    c5085x3.m23036s0(obj3, iMo23333w, iM23015g0, interfaceC5082U3);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 61:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), interfaceC5109k2.mo23336z());
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 62:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Integer.valueOf(interfaceC5109k2.mo23322l()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 63:
                                    int iMo23327q2 = interfaceC5109k2.mo23327q();
                                    c5085x3.m23037t(iM23015g0);
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Integer.valueOf(iMo23327q2));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 64:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Integer.valueOf(interfaceC5109k2.mo23298D()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 65:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Long.valueOf(interfaceC5109k2.mo23320j()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 66:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Integer.valueOf(interfaceC5109k2.mo23329s()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 67:
                                    AbstractC5137y0.m23750V(obj3, m23006W(iM23040u0), Long.valueOf(interfaceC5109k2.mo23330t()));
                                    c5085x3.m23030p0(obj3, iMo23333w, iM23015g0);
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                case 68:
                                    abstractC5129u0 = abstractC5129u2;
                                    try {
                                        InterfaceC5082U interfaceC5082U4 = (InterfaceC5082U) c5085x3.m23001R(obj3, iMo23333w, iM23015g0);
                                        interfaceC5109k2.mo23305K(interfaceC5082U4, c5085x3.m23041v(iM23015g0), c5120q);
                                        c5085x3.m23036s0(obj3, iMo23333w, iM23015g0, interfaceC5082U4);
                                        objMo23570g = objMo23625f;
                                    } catch (C5065C.a unused12) {
                                        obj2 = obj3;
                                        objMo23570g = objMo23625f;
                                        if (abstractC5129u0.mo23635q(interfaceC5109k2)) {
                                            if (objMo23570g == null) {
                                                objMo23570g = abstractC5129u0.mo23625f(obj2);
                                            }
                                            if (!abstractC5129u0.m23631m(objMo23570g, interfaceC5109k2, 0)) {
                                                objM23033r2 = objMo23570g;
                                                while (i8 < c5085x3.f19363l) {
                                                    objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i8], objM23033r2, abstractC5129u0, obj);
                                                }
                                                if (objM23033r2 == null) {
                                                    return;
                                                }
                                                abstractC5129u0.mo23633o(obj2, objM23033r2);
                                                return;
                                            }
                                        } else if (!interfaceC5109k2.mo23297C()) {
                                            objM23033r2 = objMo23570g;
                                            while (i9 < c5085x3.f19363l) {
                                                objM23033r2 = c5085x3.m23033r(obj2, c5085x3.f19361j[i9], objM23033r2, abstractC5129u0, obj);
                                            }
                                            if (objM23033r2 == null) {
                                                return;
                                            }
                                            abstractC5129u0.mo23633o(obj2, objM23033r2);
                                            return;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        obj2 = obj3;
                                        objMo23570g = objMo23625f;
                                        i7 = c5085x3.f19362k;
                                        objM23033r = objMo23570g;
                                        while (i7 < c5085x3.f19363l) {
                                            objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                                            i7++;
                                            c5085x3 = this;
                                        }
                                        abstractC5129u1 = abstractC5129u0;
                                        if (objM23033r != null) {
                                            abstractC5129u1.mo23633o(obj2, objM23033r);
                                        }
                                        throw th;
                                    }
                                    c5120q2 = c5120q;
                                    break;
                                default:
                                    if (objMo23625f == null) {
                                        objMo23625f = abstractC5129u2.mo23625f(obj3);
                                    }
                                    if (!abstractC5129u2.m23631m(objMo23625f, interfaceC5109k2, 0)) {
                                        Object objM23033r3 = objMo23625f;
                                        for (int i10 = c5085x3.f19362k; i10 < c5085x3.f19363l; i10++) {
                                            objM23033r3 = c5085x3.m23033r(obj3, c5085x3.f19361j[i10], objM23033r3, abstractC5129u2, obj);
                                        }
                                        if (objM23033r3 != null) {
                                            abstractC5129u2.mo23633o(obj3, objM23033r3);
                                            return;
                                        }
                                        return;
                                    }
                                    objMo23570g = objMo23625f;
                                    c5120q2 = c5120q;
                                    break;
                                    break;
                            }
                        } catch (C5065C.a unused13) {
                            abstractC5129u0 = abstractC5129u2;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        abstractC5129u0 = abstractC5129u2;
                        obj2 = obj3;
                        objMo23570g = objMo23625f;
                        i7 = c5085x3.f19362k;
                        objM23033r = objMo23570g;
                        while (i7 < c5085x3.f19363l) {
                            objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                            i7++;
                            c5085x3 = this;
                        }
                        abstractC5129u1 = abstractC5129u0;
                        if (objM23033r != null) {
                            abstractC5129u1.mo23633o(obj2, objM23033r);
                        }
                        throw th;
                    }
                } else {
                    if (iMo23333w == Integer.MAX_VALUE) {
                        int i11 = c5085x3.f19362k;
                        Object objM23033r4 = objMo23570g;
                        while (i11 < c5085x3.f19363l) {
                            objM23033r4 = c5085x3.m23033r(obj, c5085x3.f19361j[i11], objM23033r4, abstractC5129u0, obj);
                            i11++;
                            c5085x3 = c5085x3;
                        }
                        if (objM23033r4 != null) {
                            abstractC5129u0.mo23633o(obj, objM23033r4);
                        }
                        return;
                    }
                    c5085x = c5085x3;
                    try {
                        if (c5085x.f19357f) {
                            abstractC5122r2 = abstractC5122r;
                            objMo23565b = abstractC5122r2.mo23565b(c5120q2, c5085x.f19356e, iMo23333w);
                        } else {
                            abstractC5122r2 = abstractC5122r;
                            objMo23565b = null;
                        }
                        if (objMo23565b != null) {
                            if (c5128uMo23567d == null) {
                                try {
                                    c5128uMo23567d = abstractC5122r.mo23567d(obj);
                                } catch (Throwable th16) {
                                    th = th16;
                                    obj2 = obj;
                                    abstractC5129u0 = abstractC5129u0;
                                    c5085x3 = c5085x;
                                }
                            }
                            Object obj6 = objMo23570g;
                            C5128u c5128u = c5128uMo23567d;
                            try {
                                c5128uMo23567d = c5128u;
                                objMo23570g = abstractC5122r2.mo23570g(obj, interfaceC5109k0, objMo23565b, c5120q2, c5128u, obj6, abstractC5129u0);
                                c5120q2 = c5120q2;
                                c5085x3 = c5085x;
                            } catch (Throwable th17) {
                                th = th17;
                                obj2 = obj;
                                objMo23625f = obj6;
                                abstractC5129u3 = abstractC5129u0;
                                abstractC5129u0 = abstractC5129u3;
                                c5085x3 = c5085x;
                                objMo23570g = objMo23625f;
                                i7 = c5085x3.f19362k;
                                objM23033r = objMo23570g;
                                while (i7 < c5085x3.f19363l) {
                                    objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                                    i7++;
                                    c5085x3 = this;
                                }
                                abstractC5129u1 = abstractC5129u0;
                                if (objM23033r != null) {
                                    abstractC5129u1.mo23633o(obj2, objM23033r);
                                }
                                throw th;
                            }
                        } else {
                            obj2 = obj;
                            objMo23625f = objMo23570g;
                            abstractC5129u3 = abstractC5129u0;
                            C5120q c5120q3 = c5120q2;
                            try {
                                if (abstractC5129u3.mo23635q(interfaceC5109k0)) {
                                    try {
                                        if (!interfaceC5109k0.mo23297C()) {
                                        }
                                        c5120q2 = c5120q3;
                                        c5085x3 = c5085x;
                                        objMo23570g = objMo23625f;
                                    } catch (Throwable th18) {
                                        th = th18;
                                        abstractC5129u0 = abstractC5129u3;
                                        c5085x3 = c5085x;
                                        objMo23570g = objMo23625f;
                                        i7 = c5085x3.f19362k;
                                        objM23033r = objMo23570g;
                                        while (i7 < c5085x3.f19363l) {
                                            objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                                            i7++;
                                            c5085x3 = this;
                                        }
                                        abstractC5129u1 = abstractC5129u0;
                                        if (objM23033r != null) {
                                            abstractC5129u1.mo23633o(obj2, objM23033r);
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (objMo23625f == null) {
                                        objMo23625f = abstractC5129u3.mo23625f(obj2);
                                    }
                                    if (!abstractC5129u3.m23631m(objMo23625f, interfaceC5109k0, 0)) {
                                    }
                                    c5120q2 = c5120q3;
                                    c5085x3 = c5085x;
                                    objMo23570g = objMo23625f;
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                c5085x3 = c5085x;
                                abstractC5129u0 = abstractC5129u3;
                            }
                        }
                    } catch (Throwable th20) {
                        th = th20;
                        obj3 = obj;
                        objMo23625f = objMo23570g;
                        abstractC5129u2 = abstractC5129u0;
                        c5085x3 = c5085x;
                        abstractC5129u0 = abstractC5129u2;
                        obj2 = obj3;
                    }
                }
                objMo23570g = objMo23625f;
            } catch (Throwable th21) {
                th = th21;
                abstractC5129u0 = abstractC5129u0;
                obj2 = obj;
            }
            i7 = c5085x3.f19362k;
            objM23033r = objMo23570g;
            while (i7 < c5085x3.f19363l) {
                objM23033r = c5085x3.m23033r(obj2, c5085x3.f19361j[i7], objM23033r, abstractC5129u0, obj);
                i7++;
                c5085x3 = this;
            }
            abstractC5129u1 = abstractC5129u0;
            if (objM23033r != null) {
                abstractC5129u1.mo23633o(obj2, objM23033r);
            }
            throw th;
        }
        Object objM23033r5 = objMo23625f;
        for (int i12 = c5085x.f19362k; i12 < c5085x.f19363l; i12++) {
            objM23033r5 = c5085x.m23033r(obj2, c5085x.f19361j[i12], objM23033r5, abstractC5129u3, obj);
        }
        if (objM23033r5 != null) {
            abstractC5129u3.mo23633o(obj2, objM23033r5);
        }
    }

    /* JADX INFO: renamed from: M */
    private final void m22996M(Object obj, int i7, Object obj2, C5120q c5120q, InterfaceC5109k0 interfaceC5109k0) {
        long jM23006W = m23006W(m23040u0(i7));
        Object objM23735G = AbstractC5137y0.m23735G(obj, jM23006W);
        if (objM23735G == null) {
            objM23735G = this.f19368q.mo22957e(obj2);
            AbstractC5137y0.m23750V(obj, jM23006W, objM23735G);
        } else if (this.f19368q.mo22959g(objM23735G)) {
            Object objMo22957e = this.f19368q.mo22957e(obj2);
            this.f19368q.mo22953a(objMo22957e, objM23735G);
            AbstractC5137y0.m23750V(obj, jM23006W, objMo22957e);
            objM23735G = objMo22957e;
        }
        interfaceC5109k0.mo23308N(this.f19368q.mo22956d(objM23735G), this.f19368q.mo22955c(obj2), c5120q);
    }

    /* JADX INFO: renamed from: N */
    private void m22997N(Object obj, Object obj2, int i7) {
        if (m22984A(obj2, i7)) {
            long jM23006W = m23006W(m23040u0(i7));
            Unsafe unsafe = f19351s;
            Object object = unsafe.getObject(obj2, jM23006W);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m23005V(i7) + " is present but null: " + obj2);
            }
            InterfaceC5113m0 interfaceC5113m0M23041v = m23041v(i7);
            if (!m22984A(obj, i7)) {
                if (m22990G(object)) {
                    Object objMo23057f = interfaceC5113m0M23041v.mo23057f();
                    interfaceC5113m0M23041v.mo23051a(objMo23057f, object);
                    unsafe.putObject(obj, jM23006W, objMo23057f);
                } else {
                    unsafe.putObject(obj, jM23006W, object);
                }
                m23028o0(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM23006W);
            if (!m22990G(object2)) {
                Object objMo23057f2 = interfaceC5113m0M23041v.mo23057f();
                interfaceC5113m0M23041v.mo23051a(objMo23057f2, object2);
                unsafe.putObject(obj, jM23006W, objMo23057f2);
                object2 = objMo23057f2;
            }
            interfaceC5113m0M23041v.mo23051a(object2, object);
        }
    }

    /* JADX INFO: renamed from: O */
    private void m22998O(Object obj, Object obj2, int i7) {
        int iM23005V = m23005V(i7);
        if (m22992I(obj2, iM23005V, i7)) {
            long jM23006W = m23006W(m23040u0(i7));
            Unsafe unsafe = f19351s;
            Object object = unsafe.getObject(obj2, jM23006W);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m23005V(i7) + " is present but null: " + obj2);
            }
            InterfaceC5113m0 interfaceC5113m0M23041v = m23041v(i7);
            if (!m22992I(obj, iM23005V, i7)) {
                if (m22990G(object)) {
                    Object objMo23057f = interfaceC5113m0M23041v.mo23057f();
                    interfaceC5113m0M23041v.mo23051a(objMo23057f, object);
                    unsafe.putObject(obj, jM23006W, objMo23057f);
                } else {
                    unsafe.putObject(obj, jM23006W, object);
                }
                m23030p0(obj, iM23005V, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM23006W);
            if (!m22990G(object2)) {
                Object objMo23057f2 = interfaceC5113m0M23041v.mo23057f();
                interfaceC5113m0M23041v.mo23051a(objMo23057f2, object2);
                unsafe.putObject(obj, jM23006W, objMo23057f2);
                object2 = objMo23057f2;
            }
            interfaceC5113m0M23041v.mo23051a(object2, object);
        }
    }

    /* JADX INFO: renamed from: P */
    private void m22999P(Object obj, Object obj2, int i7) {
        int iM23040u0 = m23040u0(i7);
        long jM23006W = m23006W(iM23040u0);
        int iM23005V = m23005V(i7);
        switch (m23038t0(iM23040u0)) {
            case 0:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23746R(obj, jM23006W, AbstractC5137y0.m23729A(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 1:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23747S(obj, jM23006W, AbstractC5137y0.m23730B(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 2:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23749U(obj, jM23006W, AbstractC5137y0.m23733E(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 3:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23749U(obj, jM23006W, AbstractC5137y0.m23733E(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 4:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23748T(obj, jM23006W, AbstractC5137y0.m23731C(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 5:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23749U(obj, jM23006W, AbstractC5137y0.m23733E(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 6:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23748T(obj, jM23006W, AbstractC5137y0.m23731C(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 7:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23740L(obj, jM23006W, AbstractC5137y0.m23772t(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 8:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23750V(obj, jM23006W, AbstractC5137y0.m23735G(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 9:
                m22997N(obj, obj2, i7);
                break;
            case 10:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23750V(obj, jM23006W, AbstractC5137y0.m23735G(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 11:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23748T(obj, jM23006W, AbstractC5137y0.m23731C(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 12:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23748T(obj, jM23006W, AbstractC5137y0.m23731C(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 13:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23748T(obj, jM23006W, AbstractC5137y0.m23731C(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 14:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23749U(obj, jM23006W, AbstractC5137y0.m23733E(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 15:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23748T(obj, jM23006W, AbstractC5137y0.m23731C(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 16:
                if (m22984A(obj2, i7)) {
                    AbstractC5137y0.m23749U(obj, jM23006W, AbstractC5137y0.m23733E(obj2, jM23006W));
                    m23028o0(obj, i7);
                }
                break;
            case 17:
                m22997N(obj, obj2, i7);
                break;
            case 18:
            case 19:
            case 20:
            case zzbbn.zzt.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f19365n.mo22923d(obj, obj2, jM23006W);
                break;
            case 50:
                AbstractC5117o0.m23479E(this.f19368q, obj, obj2, jM23006W);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (m22992I(obj2, iM23005V, i7)) {
                    AbstractC5137y0.m23750V(obj, jM23006W, AbstractC5137y0.m23735G(obj2, jM23006W));
                    m23030p0(obj, iM23005V, i7);
                }
                break;
            case 60:
                m22998O(obj, obj2, i7);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m22992I(obj2, iM23005V, i7)) {
                    AbstractC5137y0.m23750V(obj, jM23006W, AbstractC5137y0.m23735G(obj2, jM23006W));
                    m23030p0(obj, iM23005V, i7);
                }
                break;
            case 68:
                m22998O(obj, obj2, i7);
                break;
        }
    }

    /* JADX INFO: renamed from: Q */
    private Object m23000Q(Object obj, int i7) {
        InterfaceC5113m0 interfaceC5113m0M23041v = m23041v(i7);
        long jM23006W = m23006W(m23040u0(i7));
        if (!m22984A(obj, i7)) {
            return interfaceC5113m0M23041v.mo23057f();
        }
        Object object = f19351s.getObject(obj, jM23006W);
        if (m22990G(object)) {
            return object;
        }
        Object objMo23057f = interfaceC5113m0M23041v.mo23057f();
        if (object != null) {
            interfaceC5113m0M23041v.mo23051a(objMo23057f, object);
        }
        return objMo23057f;
    }

    /* JADX INFO: renamed from: R */
    private Object m23001R(Object obj, int i7, int i8) {
        InterfaceC5113m0 interfaceC5113m0M23041v = m23041v(i8);
        if (!m22992I(obj, i7, i8)) {
            return interfaceC5113m0M23041v.mo23057f();
        }
        Object object = f19351s.getObject(obj, m23006W(m23040u0(i8)));
        if (m22990G(object)) {
            return object;
        }
        Object objMo23057f = interfaceC5113m0M23041v.mo23057f();
        if (object != null) {
            interfaceC5113m0M23041v.mo23051a(objMo23057f, object);
        }
        return objMo23057f;
    }

    /* JADX INFO: renamed from: S */
    static C5085X m23002S(Class cls, InterfaceC5080S interfaceC5080S, InterfaceC5087Z interfaceC5087Z, AbstractC5072J abstractC5072J, AbstractC5129u0 abstractC5129u0, AbstractC5122r abstractC5122r, InterfaceC5077O interfaceC5077O) {
        if (interfaceC5080S instanceof C5107j0) {
            return m23004U((C5107j0) interfaceC5080S, interfaceC5087Z, abstractC5072J, abstractC5129u0, abstractC5122r, interfaceC5077O);
        }
        AbstractC2263x.m9328a(interfaceC5080S);
        return m23003T(null, interfaceC5087Z, abstractC5072J, abstractC5129u0, abstractC5122r, interfaceC5077O);
    }

    /* JADX INFO: renamed from: T */
    static C5085X m23003T(AbstractC5121q0 abstractC5121q0, InterfaceC5087Z interfaceC5087Z, AbstractC5072J abstractC5072J, AbstractC5129u0 abstractC5129u0, AbstractC5122r abstractC5122r, InterfaceC5077O interfaceC5077O) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    /* JADX INFO: renamed from: U */
    static C5085X m23004U(C5107j0 c5107j0, InterfaceC5087Z interfaceC5087Z, AbstractC5072J abstractC5072J, AbstractC5129u0 abstractC5129u0, AbstractC5122r abstractC5122r, InterfaceC5077O interfaceC5077O) {
        int i7;
        int iCharAt;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        char cCharAt5;
        int i19;
        char cCharAt6;
        int i20;
        char cCharAt7;
        int i21;
        char cCharAt8;
        int i22;
        int i23;
        int i24;
        int i25;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i26;
        int i27;
        int iObjectFieldOffset3;
        int i28;
        Field fieldM23026n0;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldM23026n1;
        int i32;
        Object obj2;
        Field fieldM23026n2;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        String strM23284e = c5107j0.m23284e();
        int length = strM23284e.length();
        char c7 = 55296;
        if (strM23284e.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i7 = i37 + 1;
                if (strM23284e.charAt(i37) < 55296) {
                    break;
                }
                i37 = i7;
            }
        } else {
            i7 = 1;
        }
        int i38 = i7 + 1;
        int iCharAt2 = strM23284e.charAt(i7);
        if (iCharAt2 >= 55296) {
            int i39 = iCharAt2 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                cCharAt13 = strM23284e.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            iCharAt2 = i39 | (cCharAt13 << i40);
            i38 = i36;
        }
        if (iCharAt2 == 0) {
            i10 = 0;
            iCharAt = 0;
            i9 = 0;
            i13 = 0;
            i8 = 0;
            i12 = 0;
            iArr = f19350r;
            i11 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt3 = strM23284e.charAt(i38);
            if (iCharAt3 >= 55296) {
                int i42 = iCharAt3 & 8191;
                int i43 = 13;
                while (true) {
                    i21 = i41 + 1;
                    cCharAt8 = strM23284e.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i21;
                }
                iCharAt3 = i42 | (cCharAt8 << i43);
                i41 = i21;
            }
            int i44 = i41 + 1;
            int iCharAt4 = strM23284e.charAt(i41);
            if (iCharAt4 >= 55296) {
                int i45 = iCharAt4 & 8191;
                int i46 = 13;
                while (true) {
                    i20 = i44 + 1;
                    cCharAt7 = strM23284e.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i20;
                }
                iCharAt4 = i45 | (cCharAt7 << i46);
                i44 = i20;
            }
            int i47 = i44 + 1;
            int iCharAt5 = strM23284e.charAt(i44);
            if (iCharAt5 >= 55296) {
                int i48 = iCharAt5 & 8191;
                int i49 = 13;
                while (true) {
                    i19 = i47 + 1;
                    cCharAt6 = strM23284e.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i19;
                }
                iCharAt5 = i48 | (cCharAt6 << i49);
                i47 = i19;
            }
            int i50 = i47 + 1;
            int iCharAt6 = strM23284e.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i18 = i50 + 1;
                    cCharAt5 = strM23284e.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i18;
                }
                iCharAt6 = i51 | (cCharAt5 << i52);
                i50 = i18;
            }
            int i53 = i50 + 1;
            iCharAt = strM23284e.charAt(i50);
            if (iCharAt >= 55296) {
                int i54 = iCharAt & 8191;
                int i55 = 13;
                while (true) {
                    i17 = i53 + 1;
                    cCharAt4 = strM23284e.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i17;
                }
                iCharAt = i54 | (cCharAt4 << i55);
                i53 = i17;
            }
            int i56 = i53 + 1;
            int iCharAt7 = strM23284e.charAt(i53);
            if (iCharAt7 >= 55296) {
                int i57 = iCharAt7 & 8191;
                int i58 = 13;
                while (true) {
                    i16 = i56 + 1;
                    cCharAt3 = strM23284e.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i16;
                }
                iCharAt7 = i57 | (cCharAt3 << i58);
                i56 = i16;
            }
            int i59 = i56 + 1;
            int iCharAt8 = strM23284e.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i60 = iCharAt8 & 8191;
                int i61 = 13;
                while (true) {
                    i15 = i59 + 1;
                    cCharAt2 = strM23284e.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i15;
                }
                iCharAt8 = i60 | (cCharAt2 << i61);
                i59 = i15;
            }
            int i62 = i59 + 1;
            int iCharAt9 = strM23284e.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = 13;
                while (true) {
                    i14 = i62 + 1;
                    cCharAt = strM23284e.charAt(i62);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i62 = i14;
                }
                iCharAt9 = i63 | (cCharAt << i64);
                i62 = i14;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i8 = (iCharAt3 * 2) + iCharAt4;
            int i65 = iCharAt7;
            i9 = iCharAt5;
            i10 = i65;
            i11 = iCharAt3;
            iArr = iArr2;
            i12 = iCharAt9;
            i38 = i62;
            i13 = iCharAt6;
        }
        Unsafe unsafe = f19351s;
        Object[] objArrM23283d = c5107j0.m23283d();
        Class<?> cls = c5107j0.mo22967b().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i66 = i12 + i10;
        int i67 = i66;
        int i68 = i12;
        int i69 = 0;
        int i70 = 0;
        while (i38 < length) {
            int i71 = i38 + 1;
            int iCharAt10 = strM23284e.charAt(i38);
            if (iCharAt10 >= c7) {
                int i72 = iCharAt10 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i35 = i73 + 1;
                    cCharAt12 = strM23284e.charAt(i73);
                    if (cCharAt12 < c7) {
                        break;
                    }
                    i72 |= (cCharAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i35;
                }
                iCharAt10 = i72 | (cCharAt12 << i74);
                i22 = i35;
            } else {
                i22 = i71;
            }
            int i75 = i22 + 1;
            int iCharAt11 = strM23284e.charAt(i22);
            if (iCharAt11 >= c7) {
                int i76 = iCharAt11 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i34 = i77 + 1;
                    cCharAt11 = strM23284e.charAt(i77);
                    if (cCharAt11 < c7) {
                        break;
                    }
                    i76 |= (cCharAt11 & 8191) << i78;
                    i78 += 13;
                    i77 = i34;
                }
                iCharAt11 = i76 | (cCharAt11 << i78);
                i23 = i34;
            } else {
                i23 = i75;
            }
            int i79 = iCharAt11 & 255;
            int i80 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            int[] iArr4 = iArr3;
            if (i79 >= 51) {
                int i81 = i23 + 1;
                int iCharAt12 = strM23284e.charAt(i23);
                char c8 = 55296;
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = 13;
                    while (true) {
                        i33 = i81 + 1;
                        cCharAt10 = strM23284e.charAt(i81);
                        if (cCharAt10 < c8) {
                            break;
                        }
                        i82 |= (cCharAt10 & 8191) << i83;
                        i83 += 13;
                        i81 = i33;
                        c8 = 55296;
                    }
                    iCharAt12 = i82 | (cCharAt10 << i83);
                    i81 = i33;
                }
                int i84 = i79 - 51;
                int i85 = i81;
                if (i84 == 9 || i84 == 17) {
                    i30 = i8 + 1;
                    objArr[((i70 / 3) * 2) + 1] = objArrM23283d[i8];
                } else {
                    if (i84 == 12 && (c5107j0.mo22968c().equals(EnumC5101g0.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i30 = i8 + 1;
                        objArr[((i70 / 3) * 2) + 1] = objArrM23283d[i8];
                    }
                    i31 = iCharAt12 * 2;
                    obj = objArrM23283d[i31];
                    if (obj instanceof Field) {
                        fieldM23026n1 = (Field) obj;
                    } else {
                        fieldM23026n1 = m23026n0(cls, (String) obj);
                        objArrM23283d[i31] = fieldM23026n1;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM23026n1);
                    i32 = i31 + 1;
                    obj2 = objArrM23283d[i32];
                    if (obj2 instanceof Field) {
                        fieldM23026n2 = (Field) obj2;
                    } else {
                        fieldM23026n2 = m23026n0(cls, (String) obj2);
                        objArrM23283d[i32] = fieldM23026n2;
                    }
                    strM23284e = strM23284e;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM23026n2);
                    i28 = iObjectFieldOffset4;
                    i27 = 0;
                    i24 = iCharAt10;
                    i38 = i85;
                }
                i8 = i30;
                i31 = iCharAt12 * 2;
                obj = objArrM23283d[i31];
                if (obj instanceof Field) {
                    fieldM23026n1 = (Field) obj;
                } else {
                    fieldM23026n1 = m23026n0(cls, (String) obj);
                    objArrM23283d[i31] = fieldM23026n1;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldM23026n1);
                i32 = i31 + 1;
                obj2 = objArrM23283d[i32];
                if (obj2 instanceof Field) {
                    fieldM23026n2 = (Field) obj2;
                } else {
                    fieldM23026n2 = m23026n0(cls, (String) obj2);
                    objArrM23283d[i32] = fieldM23026n2;
                }
                strM23284e = strM23284e;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM23026n2);
                i28 = iObjectFieldOffset5;
                i27 = 0;
                i24 = iCharAt10;
                i38 = i85;
            } else {
                int i86 = i8 + 1;
                Field fieldM23026n3 = m23026n0(cls, (String) objArrM23283d[i8]);
                if (i79 == 9 || i79 == 17) {
                    i24 = iCharAt10;
                    objArr[((i70 / 3) * 2) + 1] = fieldM23026n3.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i24 = iCharAt10;
                        i29 = i8 + 2;
                        objArr[((i70 / 3) * 2) + 1] = objArrM23283d[i86];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        i24 = iCharAt10;
                        if (c5107j0.mo22968c() == EnumC5101g0.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i29 = i8 + 2;
                            objArr[((i70 / 3) * 2) + 1] = objArrM23283d[i86];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM23026n3);
                        if ((iCharAt11 & 4096) != 0 || i79 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i26 = i23;
                            i27 = 0;
                        } else {
                            int i87 = i23 + 1;
                            int iCharAt13 = strM23284e.charAt(i23);
                            if (iCharAt13 >= 55296) {
                                int i88 = iCharAt13 & 8191;
                                int i89 = 13;
                                while (true) {
                                    i26 = i87 + 1;
                                    cCharAt9 = strM23284e.charAt(i87);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i88 |= (cCharAt9 & 8191) << i89;
                                    i89 += 13;
                                    i87 = i26;
                                }
                                iCharAt13 = i88 | (cCharAt9 << i89);
                            } else {
                                i26 = i87;
                            }
                            int i90 = (i11 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrM23283d[i90];
                            if (obj3 instanceof Field) {
                                fieldM23026n0 = (Field) obj3;
                            } else {
                                fieldM23026n0 = m23026n0(cls, (String) obj3);
                                objArrM23283d[i90] = fieldM23026n0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM23026n0);
                            i27 = iCharAt13 % 32;
                        }
                        int i91 = iObjectFieldOffset2;
                        if (i79 >= 18 && i79 <= 49) {
                            iArr[i67] = iObjectFieldOffset;
                            i67++;
                        }
                        iObjectFieldOffset3 = i91;
                        i28 = iObjectFieldOffset;
                        i8 = i25;
                        i38 = i26;
                    } else {
                        if (i79 == 50) {
                            int i92 = i68 + 1;
                            iArr[i68] = i70;
                            int i93 = (i70 / 3) * 2;
                            int i94 = i8 + 2;
                            objArr[i93] = objArrM23283d[i86];
                            if ((iCharAt11 & 2048) != 0) {
                                i25 = i8 + 3;
                                objArr[i93 + 1] = objArrM23283d[i94];
                                i24 = iCharAt10;
                                i68 = i92;
                            } else {
                                i25 = i94;
                                i68 = i92;
                                i24 = iCharAt10;
                            }
                        } else {
                            i24 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM23026n3);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i26 = i23;
                            i27 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i26 = i23;
                            i27 = 0;
                        }
                        int i95 = iObjectFieldOffset2;
                        if (i79 >= 18) {
                            iArr[i67] = iObjectFieldOffset;
                            i67++;
                        }
                        iObjectFieldOffset3 = i95;
                        i28 = iObjectFieldOffset;
                        i8 = i25;
                        i38 = i26;
                    }
                    i25 = i29;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM23026n3);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i26 = i23;
                        i27 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i26 = i23;
                        i27 = 0;
                    }
                    int i96 = iObjectFieldOffset2;
                    if (i79 >= 18) {
                        iArr[i67] = iObjectFieldOffset;
                        i67++;
                    }
                    iObjectFieldOffset3 = i96;
                    i28 = iObjectFieldOffset;
                    i8 = i25;
                    i38 = i26;
                }
                i25 = i86;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM23026n3);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i26 = i23;
                    i27 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i26 = i23;
                    i27 = 0;
                }
                int i97 = iObjectFieldOffset2;
                if (i79 >= 18) {
                    iArr[i67] = iObjectFieldOffset;
                    i67++;
                }
                iObjectFieldOffset3 = i97;
                i28 = iObjectFieldOffset;
                i8 = i25;
                i38 = i26;
            }
            int i98 = i70 + 1;
            iArr4[i70] = i24;
            int i99 = i70 + 2;
            int i100 = iObjectFieldOffset3;
            iArr4[i98] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i79 << 20) | i28;
            i70 += 3;
            iArr4[i99] = (i27 << 20) | i100;
            length = i80;
            iArr3 = iArr4;
            strM23284e = strM23284e;
            c7 = 55296;
        }
        return new C5085X(iArr3, objArr, i9, i13, c5107j0.mo22967b(), c5107j0.mo22968c(), false, iArr, i12, i66, interfaceC5087Z, abstractC5072J, abstractC5129u0, abstractC5122r, interfaceC5077O);
    }

    /* JADX INFO: renamed from: V */
    private int m23005V(int i7) {
        return this.f19352a[i7];
    }

    /* JADX INFO: renamed from: W */
    private static long m23006W(int i7) {
        return i7 & 1048575;
    }

    /* JADX INFO: renamed from: X */
    private static boolean m23007X(Object obj, long j7) {
        return ((Boolean) AbstractC5137y0.m23735G(obj, j7)).booleanValue();
    }

    /* JADX INFO: renamed from: Y */
    private static double m23008Y(Object obj, long j7) {
        return ((Double) AbstractC5137y0.m23735G(obj, j7)).doubleValue();
    }

    /* JADX INFO: renamed from: Z */
    private static float m23009Z(Object obj, long j7) {
        return ((Float) AbstractC5137y0.m23735G(obj, j7)).floatValue();
    }

    /* JADX INFO: renamed from: a0 */
    private static int m23010a0(Object obj, long j7) {
        return ((Integer) AbstractC5137y0.m23735G(obj, j7)).intValue();
    }

    /* JADX INFO: renamed from: b0 */
    private static long m23011b0(Object obj, long j7) {
        return ((Long) AbstractC5137y0.m23735G(obj, j7)).longValue();
    }

    /* JADX INFO: renamed from: c0 */
    private int m23012c0(Object obj, byte[] bArr, int i7, int i8, int i9, long j7, AbstractC5098f.a aVar) {
        Unsafe unsafe = f19351s;
        Object objM23039u = m23039u(i9);
        Object object = unsafe.getObject(obj, j7);
        if (this.f19368q.mo22959g(object)) {
            Object objMo22957e = this.f19368q.mo22957e(objM23039u);
            this.f19368q.mo22953a(objMo22957e, object);
            unsafe.putObject(obj, j7, objMo22957e);
            object = objMo22957e;
        }
        return m23025n(bArr, i7, i8, this.f19368q.mo22955c(objM23039u), this.f19368q.mo22956d(object), aVar);
    }

    /* JADX INFO: renamed from: e0 */
    private int m23013e0(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, int i14, AbstractC5098f.a aVar) throws C5065C {
        int i15;
        Unsafe unsafe = f19351s;
        long j8 = this.f19352a[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j7, Double.valueOf(AbstractC5098f.m23121e(bArr, i7)));
                int i16 = i7 + 8;
                unsafe.putInt(obj, j8, i10);
                return i16;
            case 52:
                if (i11 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j7, Float.valueOf(AbstractC5098f.m23128l(bArr, i7)));
                int i17 = i7 + 4;
                unsafe.putInt(obj, j8, i10);
                return i17;
            case 53:
            case 54:
                if (i11 != 0) {
                    return i7;
                }
                int iM23112L = AbstractC5098f.m23112L(bArr, i7, aVar);
                unsafe.putObject(obj, j7, Long.valueOf(aVar.f19390b));
                unsafe.putInt(obj, j8, i10);
                return iM23112L;
            case 55:
            case 62:
                if (i11 != 0) {
                    return i7;
                }
                int iM23109I = AbstractC5098f.m23109I(bArr, i7, aVar);
                unsafe.putObject(obj, j7, Integer.valueOf(aVar.f19389a));
                unsafe.putInt(obj, j8, i10);
                return iM23109I;
            case 56:
            case 65:
                if (i11 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j7, Long.valueOf(AbstractC5098f.m23126j(bArr, i7)));
                int i18 = i7 + 8;
                unsafe.putInt(obj, j8, i10);
                return i18;
            case 57:
            case 64:
                if (i11 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j7, Integer.valueOf(AbstractC5098f.m23124h(bArr, i7)));
                int i19 = i7 + 4;
                unsafe.putInt(obj, j8, i10);
                return i19;
            case 58:
                if (i11 != 0) {
                    return i7;
                }
                int iM23112L2 = AbstractC5098f.m23112L(bArr, i7, aVar);
                unsafe.putObject(obj, j7, Boolean.valueOf(aVar.f19390b != 0));
                unsafe.putInt(obj, j8, i10);
                return iM23112L2;
            case 59:
                if (i11 != 2) {
                    return i7;
                }
                int iM23109I2 = AbstractC5098f.m23109I(bArr, i7, aVar);
                int i20 = aVar.f19389a;
                if (i20 == 0) {
                    unsafe.putObject(obj, j7, "");
                } else {
                    if ((i12 & 536870912) != 0 && !AbstractC5139z0.m23828t(bArr, iM23109I2, iM23109I2 + i20)) {
                        throw C5065C.m22893d();
                    }
                    unsafe.putObject(obj, j7, new String(bArr, iM23109I2, i20, AbstractC5063B.f19294b));
                    iM23109I2 += i20;
                }
                unsafe.putInt(obj, j8, i10);
                return iM23109I2;
            case 60:
                i15 = i7;
                if (i11 == 2) {
                    Object objM23001R = m23001R(obj, i10, i14);
                    int iM23115O = AbstractC5098f.m23115O(objM23001R, m23041v(i14), bArr, i15, i8, aVar);
                    m23036s0(obj, i10, i14, objM23001R);
                    return iM23115O;
                }
                break;
            case 61:
                i15 = i7;
                if (i11 == 2) {
                    int iM23119c = AbstractC5098f.m23119c(bArr, i15, aVar);
                    unsafe.putObject(obj, j7, aVar.f19391c);
                    unsafe.putInt(obj, j8, i10);
                    return iM23119c;
                }
                break;
            case 63:
                i15 = i7;
                if (i11 == 0) {
                    int iM23109I3 = AbstractC5098f.m23109I(bArr, i15, aVar);
                    int i21 = aVar.f19389a;
                    m23037t(i14);
                    unsafe.putObject(obj, j7, Integer.valueOf(i21));
                    unsafe.putInt(obj, j8, i10);
                    return iM23109I3;
                }
                break;
            case 66:
                i15 = i7;
                if (i11 == 0) {
                    int iM23109I4 = AbstractC5098f.m23109I(bArr, i15, aVar);
                    unsafe.putObject(obj, j7, Integer.valueOf(AbstractC5106j.m23183c(aVar.f19389a)));
                    unsafe.putInt(obj, j8, i10);
                    return iM23109I4;
                }
                break;
            case 67:
                i15 = i7;
                if (i11 == 0) {
                    int iM23112L3 = AbstractC5098f.m23112L(bArr, i15, aVar);
                    unsafe.putObject(obj, j7, Long.valueOf(AbstractC5106j.m23184d(aVar.f19390b)));
                    unsafe.putInt(obj, j8, i10);
                    return iM23112L3;
                }
                break;
            case 68:
                if (i11 == 3) {
                    Object objM23001R2 = m23001R(obj, i10, i14);
                    int iM23114N = AbstractC5098f.m23114N(objM23001R2, m23041v(i14), bArr, i7, i8, (i9 & (-8)) | 4, aVar);
                    m23036s0(obj, i10, i14, objM23001R2);
                    return iM23114N;
                }
            default:
                return i7;
        }
        return i15;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: f0 */
    private int m23014f0(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, long j7, int i13, long j8, AbstractC5098f.a aVar) throws C5065C {
        int iM23110J;
        Unsafe unsafe = f19351s;
        AbstractC5063B.e eVarMo22823d = (AbstractC5063B.e) unsafe.getObject(obj, j8);
        if (!eVarMo22823d.mo22849h()) {
            int size = eVarMo22823d.size();
            eVarMo22823d = eVarMo22823d.mo22823d(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j8, eVarMo22823d);
        }
        AbstractC5063B.e eVar = eVarMo22823d;
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    return AbstractC5098f.m23135s(bArr, i7, eVar, aVar);
                }
                if (i11 == 1) {
                    return AbstractC5098f.m23122f(i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            case 19:
            case 36:
                if (i11 == 2) {
                    return AbstractC5098f.m23138v(bArr, i7, eVar, aVar);
                }
                if (i11 == 5) {
                    return AbstractC5098f.m23129m(i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            case 20:
            case zzbbn.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i11 == 2) {
                    return AbstractC5098f.m23142z(bArr, i7, eVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC5098f.m23113M(i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return AbstractC5098f.m23141y(bArr, i7, eVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC5098f.m23110J(i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    return AbstractC5098f.m23137u(bArr, i7, eVar, aVar);
                }
                if (i11 == 1) {
                    return AbstractC5098f.m23127k(i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    return AbstractC5098f.m23136t(bArr, i7, eVar, aVar);
                }
                if (i11 == 5) {
                    return AbstractC5098f.m23125i(i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            case 25:
            case 42:
                if (i11 == 2) {
                    return AbstractC5098f.m23134r(bArr, i7, eVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC5098f.m23118b(i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            case 26:
                if (i11 == 2) {
                    return (j7 & 536870912) == 0 ? AbstractC5098f.m23104D(i9, bArr, i7, i8, eVar, aVar) : AbstractC5098f.m23105E(i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            case 27:
                if (i11 == 2) {
                    return AbstractC5098f.m23133q(m23041v(i12), i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            case 28:
                if (i11 == 2) {
                    return AbstractC5098f.m23120d(i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            case 30:
            case 44:
                if (i11 != 2) {
                    if (i11 == 0) {
                        iM23110J = AbstractC5098f.m23110J(i9, bArr, i7, i8, eVar, aVar);
                    }
                    return i7;
                }
                iM23110J = AbstractC5098f.m23141y(bArr, i7, eVar, aVar);
                m23037t(i12);
                AbstractC5117o0.m23529z(obj, i10, eVar, null, null, this.f19366o);
                return iM23110J;
            case 33:
            case 47:
                if (i11 == 2) {
                    return AbstractC5098f.m23139w(bArr, i7, eVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC5098f.m23101A(i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            case 34:
            case 48:
                if (i11 == 2) {
                    return AbstractC5098f.m23140x(bArr, i7, eVar, aVar);
                }
                if (i11 == 0) {
                    return AbstractC5098f.m23102B(i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            case 49:
                if (i11 == 3) {
                    return AbstractC5098f.m23131o(m23041v(i12), i9, bArr, i7, i8, eVar, aVar);
                }
                return i7;
            default:
                return i7;
        }
    }

    /* JADX INFO: renamed from: g0 */
    private int m23015g0(int i7) {
        if (i7 < this.f19354c || i7 > this.f19355d) {
            return -1;
        }
        return m23032q0(i7, 0);
    }

    /* JADX INFO: renamed from: h0 */
    private int m23016h0(int i7, int i8) {
        if (i7 < this.f19354c || i7 > this.f19355d) {
            return -1;
        }
        return m23032q0(i7, i8);
    }

    /* JADX INFO: renamed from: i0 */
    private int m23017i0(int i7) {
        return this.f19352a[i7 + 2];
    }

    /* JADX INFO: renamed from: j0 */
    private void m23018j0(Object obj, long j7, InterfaceC5109k0 interfaceC5109k0, InterfaceC5113m0 interfaceC5113m0, C5120q c5120q) {
        interfaceC5109k0.mo23304J(this.f19365n.mo22924e(obj, j7), interfaceC5113m0, c5120q);
    }

    /* JADX INFO: renamed from: k */
    private boolean m23019k(Object obj, Object obj2, int i7) {
        return m22984A(obj, i7) == m22984A(obj2, i7);
    }

    /* JADX INFO: renamed from: k0 */
    private void m23020k0(Object obj, int i7, InterfaceC5109k0 interfaceC5109k0, InterfaceC5113m0 interfaceC5113m0, C5120q c5120q) {
        interfaceC5109k0.mo23306L(this.f19365n.mo22924e(obj, m23006W(i7)), interfaceC5113m0, c5120q);
    }

    /* JADX INFO: renamed from: l */
    private static boolean m23021l(Object obj, long j7) {
        return AbstractC5137y0.m23772t(obj, j7);
    }

    /* JADX INFO: renamed from: l0 */
    private void m23022l0(Object obj, int i7, InterfaceC5109k0 interfaceC5109k0) {
        if (m23049z(i7)) {
            AbstractC5137y0.m23750V(obj, m23006W(i7), interfaceC5109k0.mo23302H());
        } else if (this.f19358g) {
            AbstractC5137y0.m23750V(obj, m23006W(i7), interfaceC5109k0.mo23332v());
        } else {
            AbstractC5137y0.m23750V(obj, m23006W(i7), interfaceC5109k0.mo23336z());
        }
    }

    /* JADX INFO: renamed from: m */
    private static void m23023m(Object obj) {
        if (m22990G(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX INFO: renamed from: m0 */
    private void m23024m0(Object obj, int i7, InterfaceC5109k0 interfaceC5109k0) {
        if (m23049z(i7)) {
            interfaceC5109k0.mo23335y(this.f19365n.mo22924e(obj, m23006W(i7)));
        } else {
            interfaceC5109k0.mo23334x(this.f19365n.mo22924e(obj, m23006W(i7)));
        }
    }

    /* JADX INFO: renamed from: n */
    private int m23025n(byte[] bArr, int i7, int i8, C5075M.a aVar, Map map, AbstractC5098f.a aVar2) throws C5065C {
        int iM23109I = AbstractC5098f.m23109I(bArr, i7, aVar2);
        int i9 = aVar2.f19389a;
        if (i9 < 0 || i9 > i8 - iM23109I) {
            throw C5065C.m22900m();
        }
        int i10 = iM23109I + i9;
        Object obj = aVar.f19342b;
        Object obj2 = aVar.f19344d;
        while (iM23109I < i10) {
            int iM23108H = iM23109I + 1;
            int i11 = bArr[iM23109I];
            if (i11 < 0) {
                iM23108H = AbstractC5098f.m23108H(i11, bArr, iM23108H, aVar2);
                i11 = aVar2.f19389a;
            }
            int i12 = iM23108H;
            int i13 = i11 >>> 3;
            int i14 = i11 & 7;
            if (i13 != 1) {
                if (i13 == 2 && i14 == aVar.f19343c.m22836d()) {
                    iM23109I = m23027o(bArr, i12, i8, aVar.f19343c, aVar.f19344d.getClass(), aVar2);
                    obj2 = aVar2.f19391c;
                } else {
                    iM23109I = AbstractC5098f.m23116P(i11, bArr, i12, i8, aVar2);
                }
            } else if (i14 == aVar.f19341a.m22836d()) {
                iM23109I = m23027o(bArr, i12, i8, aVar.f19341a, null, aVar2);
                obj = aVar2.f19391c;
            } else {
                iM23109I = AbstractC5098f.m23116P(i11, bArr, i12, i8, aVar2);
            }
        }
        if (iM23109I != i10) {
            throw C5065C.m22897h();
        }
        map.put(obj, obj2);
        return i10;
    }

    /* JADX INFO: renamed from: n0 */
    private static Field m23026n0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX INFO: renamed from: o */
    private int m23027o(byte[] bArr, int i7, int i8, AbstractC5062A0.b bVar, Class cls, AbstractC5098f.a aVar) {
        switch (a.f19369a[bVar.ordinal()]) {
            case 1:
                int iM23112L = AbstractC5098f.m23112L(bArr, i7, aVar);
                aVar.f19391c = Boolean.valueOf(aVar.f19390b != 0);
                return iM23112L;
            case 2:
                return AbstractC5098f.m23119c(bArr, i7, aVar);
            case 3:
                aVar.f19391c = Double.valueOf(AbstractC5098f.m23121e(bArr, i7));
                return i7 + 8;
            case 4:
            case 5:
                aVar.f19391c = Integer.valueOf(AbstractC5098f.m23124h(bArr, i7));
                return i7 + 4;
            case 6:
            case 7:
                aVar.f19391c = Long.valueOf(AbstractC5098f.m23126j(bArr, i7));
                return i7 + 8;
            case 8:
                aVar.f19391c = Float.valueOf(AbstractC5098f.m23128l(bArr, i7));
                return i7 + 4;
            case 9:
            case 10:
            case 11:
                int iM23109I = AbstractC5098f.m23109I(bArr, i7, aVar);
                aVar.f19391c = Integer.valueOf(aVar.f19389a);
                return iM23109I;
            case 12:
            case 13:
                int iM23112L2 = AbstractC5098f.m23112L(bArr, i7, aVar);
                aVar.f19391c = Long.valueOf(aVar.f19390b);
                return iM23112L2;
            case 14:
                return AbstractC5098f.m23132p(C5103h0.m23146a().m23148c(cls), bArr, i7, i8, aVar);
            case 15:
                int iM23109I2 = AbstractC5098f.m23109I(bArr, i7, aVar);
                aVar.f19391c = Integer.valueOf(AbstractC5106j.m23183c(aVar.f19389a));
                return iM23109I2;
            case 16:
                int iM23112L3 = AbstractC5098f.m23112L(bArr, i7, aVar);
                aVar.f19391c = Long.valueOf(AbstractC5106j.m23184d(aVar.f19390b));
                return iM23112L3;
            case 17:
                return AbstractC5098f.m23106F(bArr, i7, aVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX INFO: renamed from: o0 */
    private void m23028o0(Object obj, int i7) {
        int iM23017i0 = m23017i0(i7);
        long j7 = 1048575 & iM23017i0;
        if (j7 == 1048575) {
            return;
        }
        AbstractC5137y0.m23748T(obj, j7, (1 << (iM23017i0 >>> 20)) | AbstractC5137y0.m23731C(obj, j7));
    }

    /* JADX INFO: renamed from: p */
    private static double m23029p(Object obj, long j7) {
        return AbstractC5137y0.m23729A(obj, j7);
    }

    /* JADX INFO: renamed from: p0 */
    private void m23030p0(Object obj, int i7, int i8) {
        AbstractC5137y0.m23748T(obj, m23017i0(i8) & 1048575, i7);
    }

    /* JADX INFO: renamed from: q */
    private boolean m23031q(Object obj, Object obj2, int i7) {
        int iM23040u0 = m23040u0(i7);
        long jM23006W = m23006W(iM23040u0);
        switch (m23038t0(iM23040u0)) {
            case 0:
                return m23019k(obj, obj2, i7) && Double.doubleToLongBits(AbstractC5137y0.m23729A(obj, jM23006W)) == Double.doubleToLongBits(AbstractC5137y0.m23729A(obj2, jM23006W));
            case 1:
                return m23019k(obj, obj2, i7) && Float.floatToIntBits(AbstractC5137y0.m23730B(obj, jM23006W)) == Float.floatToIntBits(AbstractC5137y0.m23730B(obj2, jM23006W));
            case 2:
                return m23019k(obj, obj2, i7) && AbstractC5137y0.m23733E(obj, jM23006W) == AbstractC5137y0.m23733E(obj2, jM23006W);
            case 3:
                return m23019k(obj, obj2, i7) && AbstractC5137y0.m23733E(obj, jM23006W) == AbstractC5137y0.m23733E(obj2, jM23006W);
            case 4:
                return m23019k(obj, obj2, i7) && AbstractC5137y0.m23731C(obj, jM23006W) == AbstractC5137y0.m23731C(obj2, jM23006W);
            case 5:
                return m23019k(obj, obj2, i7) && AbstractC5137y0.m23733E(obj, jM23006W) == AbstractC5137y0.m23733E(obj2, jM23006W);
            case 6:
                return m23019k(obj, obj2, i7) && AbstractC5137y0.m23731C(obj, jM23006W) == AbstractC5137y0.m23731C(obj2, jM23006W);
            case 7:
                return m23019k(obj, obj2, i7) && AbstractC5137y0.m23772t(obj, jM23006W) == AbstractC5137y0.m23772t(obj2, jM23006W);
            case 8:
                return m23019k(obj, obj2, i7) && AbstractC5117o0.m23482H(AbstractC5137y0.m23735G(obj, jM23006W), AbstractC5137y0.m23735G(obj2, jM23006W));
            case 9:
                return m23019k(obj, obj2, i7) && AbstractC5117o0.m23482H(AbstractC5137y0.m23735G(obj, jM23006W), AbstractC5137y0.m23735G(obj2, jM23006W));
            case 10:
                return m23019k(obj, obj2, i7) && AbstractC5117o0.m23482H(AbstractC5137y0.m23735G(obj, jM23006W), AbstractC5137y0.m23735G(obj2, jM23006W));
            case 11:
                return m23019k(obj, obj2, i7) && AbstractC5137y0.m23731C(obj, jM23006W) == AbstractC5137y0.m23731C(obj2, jM23006W);
            case 12:
                return m23019k(obj, obj2, i7) && AbstractC5137y0.m23731C(obj, jM23006W) == AbstractC5137y0.m23731C(obj2, jM23006W);
            case 13:
                return m23019k(obj, obj2, i7) && AbstractC5137y0.m23731C(obj, jM23006W) == AbstractC5137y0.m23731C(obj2, jM23006W);
            case 14:
                return m23019k(obj, obj2, i7) && AbstractC5137y0.m23733E(obj, jM23006W) == AbstractC5137y0.m23733E(obj2, jM23006W);
            case 15:
                return m23019k(obj, obj2, i7) && AbstractC5137y0.m23731C(obj, jM23006W) == AbstractC5137y0.m23731C(obj2, jM23006W);
            case 16:
                return m23019k(obj, obj2, i7) && AbstractC5137y0.m23733E(obj, jM23006W) == AbstractC5137y0.m23733E(obj2, jM23006W);
            case 17:
                return m23019k(obj, obj2, i7) && AbstractC5117o0.m23482H(AbstractC5137y0.m23735G(obj, jM23006W), AbstractC5137y0.m23735G(obj2, jM23006W));
            case 18:
            case 19:
            case 20:
            case zzbbn.zzt.zzm /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return AbstractC5117o0.m23482H(AbstractC5137y0.m23735G(obj, jM23006W), AbstractC5137y0.m23735G(obj2, jM23006W));
            case 50:
                return AbstractC5117o0.m23482H(AbstractC5137y0.m23735G(obj, jM23006W), AbstractC5137y0.m23735G(obj2, jM23006W));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return m22991H(obj, obj2, i7) && AbstractC5117o0.m23482H(AbstractC5137y0.m23735G(obj, jM23006W), AbstractC5137y0.m23735G(obj2, jM23006W));
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: q0 */
    private int m23032q0(int i7, int i8) {
        int length = (this.f19352a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int iM23005V = m23005V(i10);
            if (i7 == iM23005V) {
                return i10;
            }
            if (i7 < iM23005V) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    private Object m23033r(Object obj, int i7, Object obj2, AbstractC5129u0 abstractC5129u0, Object obj3) {
        m23005V(i7);
        if (AbstractC5137y0.m23735G(obj, m23006W(m23040u0(i7))) == null) {
            return obj2;
        }
        m23037t(i7);
        return obj2;
    }

    /* JADX INFO: renamed from: r0 */
    private void m23034r0(Object obj, int i7, Object obj2) {
        f19351s.putObject(obj, m23006W(m23040u0(i7)), obj2);
        m23028o0(obj, i7);
    }

    /* JADX INFO: renamed from: s */
    private static float m23035s(Object obj, long j7) {
        return AbstractC5137y0.m23730B(obj, j7);
    }

    /* JADX INFO: renamed from: s0 */
    private void m23036s0(Object obj, int i7, int i8, Object obj2) {
        f19351s.putObject(obj, m23006W(m23040u0(i8)), obj2);
        m23030p0(obj, i7, i8);
    }

    /* JADX INFO: renamed from: t */
    private AbstractC5063B.c m23037t(int i7) {
        AbstractC2263x.m9328a(this.f19353b[((i7 / 3) * 2) + 1]);
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    private static int m23038t0(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: u */
    private Object m23039u(int i7) {
        return this.f19353b[(i7 / 3) * 2];
    }

    /* JADX INFO: renamed from: u0 */
    private int m23040u0(int i7) {
        return this.f19352a[i7 + 1];
    }

    /* JADX INFO: renamed from: v */
    private InterfaceC5113m0 m23041v(int i7) {
        int i8 = (i7 / 3) * 2;
        InterfaceC5113m0 interfaceC5113m0 = (InterfaceC5113m0) this.f19353b[i8];
        if (interfaceC5113m0 != null) {
            return interfaceC5113m0;
        }
        InterfaceC5113m0 interfaceC5113m0M23148c = C5103h0.m23146a().m23148c((Class) this.f19353b[i8 + 1]);
        this.f19353b[i8] = interfaceC5113m0M23148c;
        return interfaceC5113m0M23148c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX INFO: renamed from: v0 */
    private void m23042v0(Object obj, InterfaceC5064B0 interfaceC5064B0) {
        Map.Entry entry;
        Iterator it;
        boolean z7;
        int i7;
        int i8;
        int i9;
        boolean z8;
        C5085X c5085x = this;
        if (c5085x.f19357f) {
            C5128u c5128uMo23566c = c5085x.f19367p.mo23566c(obj);
            if (c5128uMo23566c.m23609j()) {
                entry = null;
                it = null;
            } else {
                Iterator itM23611n = c5128uMo23566c.m23611n();
                entry = (Map.Entry) itM23611n.next();
                it = itM23611n;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = c5085x.f19352a.length;
        Unsafe unsafe = f19351s;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int iM23040u0 = c5085x.m23040u0(i11);
            int iM23005V = c5085x.m23005V(i11);
            int iM23038t0 = m23038t0(iM23040u0);
            if (iM23038t0 <= 17) {
                int i13 = c5085x.f19352a[i11 + 2];
                z7 = true;
                int i14 = i13 & 1048575;
                if (i14 != i10) {
                    i12 = i14 == 1048575 ? 0 : unsafe.getInt(obj, i14);
                    i10 = i14;
                }
                i7 = i10;
                i8 = i12;
                i9 = 1 << (i13 >>> 20);
            } else {
                z7 = true;
                i7 = i10;
                i8 = i12;
                i9 = 0;
            }
            while (entry != null && c5085x.f19367p.mo23564a(entry) <= iM23005V) {
                c5085x.f19367p.mo23573j(interfaceC5064B0, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jM23006W = m23006W(iM23040u0);
            switch (iM23038t0) {
                case 0:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22869e(iM23005V, m23029p(obj, jM23006W));
                    }
                    break;
                case 1:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22850A(iM23005V, m23035s(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 2:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22878n(iM23005V, unsafe.getLong(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 3:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22876l(iM23005V, unsafe.getLong(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 4:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22882r(iM23005V, unsafe.getInt(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 5:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22872h(iM23005V, unsafe.getLong(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 6:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22868d(iM23005V, unsafe.getInt(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 7:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22879o(iM23005V, m23021l(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 8:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        c5085x.m23048y0(iM23005V, unsafe.getObject(obj, jM23006W), interfaceC5064B0);
                    }
                    break;
                case 9:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22861L(iM23005V, unsafe.getObject(obj, jM23006W), c5085x.m23041v(i11));
                    }
                    break;
                case 10:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22863N(iM23005V, (AbstractC5104i) unsafe.getObject(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 11:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22866b(iM23005V, unsafe.getInt(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 12:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22853D(iM23005V, unsafe.getInt(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 13:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22880p(iM23005V, unsafe.getInt(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 14:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22885u(iM23005V, unsafe.getLong(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 15:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22857H(iM23005V, unsafe.getInt(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 16:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22890z(iM23005V, unsafe.getLong(obj, jM23006W));
                    }
                    c5085x = this;
                    break;
                case 17:
                    if (c5085x.m22985B(obj, i11, i7, i8, i9)) {
                        interfaceC5064B0.mo22862M(iM23005V, unsafe.getObject(obj, jM23006W), c5085x.m23041v(i11));
                    }
                    break;
                case 18:
                    AbstractC5117o0.m23488N(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 19:
                    AbstractC5117o0.m23492R(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 20:
                    AbstractC5117o0.m23495U(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    AbstractC5117o0.m23506c0(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 22:
                    AbstractC5117o0.m23494T(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 23:
                    AbstractC5117o0.m23491Q(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 24:
                    AbstractC5117o0.m23490P(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 25:
                    AbstractC5117o0.m23486L(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 26:
                    AbstractC5117o0.m23502a0(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0);
                    break;
                case 27:
                    AbstractC5117o0.m23496V(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, c5085x.m23041v(i11));
                    break;
                case 28:
                    AbstractC5117o0.m23487M(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0);
                    break;
                case 29:
                    z8 = false;
                    AbstractC5117o0.m23504b0(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 30:
                    z8 = false;
                    AbstractC5117o0.m23489O(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 31:
                    z8 = false;
                    AbstractC5117o0.m23497W(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 32:
                    z8 = false;
                    AbstractC5117o0.m23498X(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 33:
                    z8 = false;
                    AbstractC5117o0.m23499Y(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 34:
                    z8 = false;
                    AbstractC5117o0.m23500Z(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, false);
                    break;
                case 35:
                    AbstractC5117o0.m23488N(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 36:
                    AbstractC5117o0.m23492R(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 37:
                    AbstractC5117o0.m23495U(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 38:
                    AbstractC5117o0.m23506c0(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 39:
                    AbstractC5117o0.m23494T(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 40:
                    AbstractC5117o0.m23491Q(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 41:
                    AbstractC5117o0.m23490P(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 42:
                    AbstractC5117o0.m23486L(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 43:
                    AbstractC5117o0.m23504b0(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 44:
                    AbstractC5117o0.m23489O(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 45:
                    AbstractC5117o0.m23497W(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 46:
                    AbstractC5117o0.m23498X(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 47:
                    AbstractC5117o0.m23499Y(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 48:
                    AbstractC5117o0.m23500Z(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, z7);
                    break;
                case 49:
                    AbstractC5117o0.m23493S(c5085x.m23005V(i11), (List) unsafe.getObject(obj, jM23006W), interfaceC5064B0, c5085x.m23041v(i11));
                    break;
                case 50:
                    c5085x.m23046x0(interfaceC5064B0, iM23005V, unsafe.getObject(obj, jM23006W), i11);
                    break;
                case 51:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22869e(iM23005V, m23008Y(obj, jM23006W));
                    }
                    break;
                case 52:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22850A(iM23005V, m23009Z(obj, jM23006W));
                    }
                    break;
                case 53:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22878n(iM23005V, m23011b0(obj, jM23006W));
                    }
                    break;
                case 54:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22876l(iM23005V, m23011b0(obj, jM23006W));
                    }
                    break;
                case 55:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22882r(iM23005V, m23010a0(obj, jM23006W));
                    }
                    break;
                case 56:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22872h(iM23005V, m23011b0(obj, jM23006W));
                    }
                    break;
                case 57:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22868d(iM23005V, m23010a0(obj, jM23006W));
                    }
                    break;
                case 58:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22879o(iM23005V, m23007X(obj, jM23006W));
                    }
                    break;
                case 59:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        c5085x.m23048y0(iM23005V, unsafe.getObject(obj, jM23006W), interfaceC5064B0);
                    }
                    break;
                case 60:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22861L(iM23005V, unsafe.getObject(obj, jM23006W), c5085x.m23041v(i11));
                    }
                    break;
                case 61:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22863N(iM23005V, (AbstractC5104i) unsafe.getObject(obj, jM23006W));
                    }
                    break;
                case 62:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22866b(iM23005V, m23010a0(obj, jM23006W));
                    }
                    break;
                case 63:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22853D(iM23005V, m23010a0(obj, jM23006W));
                    }
                    break;
                case 64:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22880p(iM23005V, m23010a0(obj, jM23006W));
                    }
                    break;
                case 65:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22885u(iM23005V, m23011b0(obj, jM23006W));
                    }
                    break;
                case 66:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22857H(iM23005V, m23010a0(obj, jM23006W));
                    }
                    break;
                case 67:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22890z(iM23005V, m23011b0(obj, jM23006W));
                    }
                    break;
                case 68:
                    if (c5085x.m22992I(obj, iM23005V, i11)) {
                        interfaceC5064B0.mo22862M(iM23005V, unsafe.getObject(obj, jM23006W), c5085x.m23041v(i11));
                    }
                    break;
                default:
                    break;
            }
            i11 += 3;
            i12 = i8;
            i10 = i7;
            entry = entry;
        }
        while (entry != null) {
            c5085x.f19367p.mo23573j(interfaceC5064B0, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        c5085x.m23050z0(c5085x.f19366o, obj, interfaceC5064B0);
    }

    /* JADX INFO: renamed from: w */
    static C5131v0 m23043w(Object obj) {
        AbstractC5136y abstractC5136y = (AbstractC5136y) obj;
        C5131v0 c5131v0 = abstractC5136y.unknownFields;
        if (c5131v0 != C5131v0.m23641c()) {
            return c5131v0;
        }
        C5131v0 c5131v0M23645k = C5131v0.m23645k();
        abstractC5136y.unknownFields = c5131v0M23645k;
        return c5131v0M23645k;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: w0 */
    private void m23044w0(Object obj, InterfaceC5064B0 interfaceC5064B0) {
        Iterator itM23606e;
        Map.Entry entry;
        m23050z0(this.f19366o, obj, interfaceC5064B0);
        if (this.f19357f) {
            C5128u c5128uMo23566c = this.f19367p.mo23566c(obj);
            if (c5128uMo23566c.m23609j()) {
                itM23606e = null;
                entry = null;
            } else {
                itM23606e = c5128uMo23566c.m23606e();
                entry = (Map.Entry) itM23606e.next();
            }
        } else {
            itM23606e = null;
            entry = null;
        }
        for (int length = this.f19352a.length - 3; length >= 0; length -= 3) {
            int iM23040u0 = m23040u0(length);
            int iM23005V = m23005V(length);
            while (entry != null && this.f19367p.mo23564a(entry) > iM23005V) {
                this.f19367p.mo23573j(interfaceC5064B0, entry);
                entry = itM23606e.hasNext() ? (Map.Entry) itM23606e.next() : null;
            }
            switch (m23038t0(iM23040u0)) {
                case 0:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22869e(iM23005V, m23029p(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 1:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22850A(iM23005V, m23035s(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 2:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22878n(iM23005V, m22994K(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 3:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22876l(iM23005V, m22994K(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 4:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22882r(iM23005V, m23047y(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 5:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22872h(iM23005V, m22994K(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 6:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22868d(iM23005V, m23047y(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 7:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22879o(iM23005V, m23021l(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 8:
                    if (m22984A(obj, length)) {
                        m23048y0(iM23005V, AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0);
                    }
                    break;
                case 9:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22861L(iM23005V, AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), m23041v(length));
                    }
                    break;
                case 10:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22863N(iM23005V, (AbstractC5104i) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 11:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22866b(iM23005V, m23047y(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 12:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22853D(iM23005V, m23047y(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 13:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22880p(iM23005V, m23047y(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 14:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22885u(iM23005V, m22994K(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 15:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22857H(iM23005V, m23047y(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 16:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22890z(iM23005V, m22994K(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 17:
                    if (m22984A(obj, length)) {
                        interfaceC5064B0.mo22862M(iM23005V, AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), m23041v(length));
                    }
                    break;
                case 18:
                    AbstractC5117o0.m23488N(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 19:
                    AbstractC5117o0.m23492R(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 20:
                    AbstractC5117o0.m23495U(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    AbstractC5117o0.m23506c0(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 22:
                    AbstractC5117o0.m23494T(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 23:
                    AbstractC5117o0.m23491Q(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 24:
                    AbstractC5117o0.m23490P(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 25:
                    AbstractC5117o0.m23486L(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 26:
                    AbstractC5117o0.m23502a0(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0);
                    break;
                case 27:
                    AbstractC5117o0.m23496V(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, m23041v(length));
                    break;
                case 28:
                    AbstractC5117o0.m23487M(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0);
                    break;
                case 29:
                    AbstractC5117o0.m23504b0(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 30:
                    AbstractC5117o0.m23489O(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 31:
                    AbstractC5117o0.m23497W(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 32:
                    AbstractC5117o0.m23498X(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 33:
                    AbstractC5117o0.m23499Y(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 34:
                    AbstractC5117o0.m23500Z(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, false);
                    break;
                case 35:
                    AbstractC5117o0.m23488N(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 36:
                    AbstractC5117o0.m23492R(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 37:
                    AbstractC5117o0.m23495U(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 38:
                    AbstractC5117o0.m23506c0(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 39:
                    AbstractC5117o0.m23494T(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 40:
                    AbstractC5117o0.m23491Q(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 41:
                    AbstractC5117o0.m23490P(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 42:
                    AbstractC5117o0.m23486L(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 43:
                    AbstractC5117o0.m23504b0(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 44:
                    AbstractC5117o0.m23489O(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 45:
                    AbstractC5117o0.m23497W(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 46:
                    AbstractC5117o0.m23498X(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 47:
                    AbstractC5117o0.m23499Y(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 48:
                    AbstractC5117o0.m23500Z(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, true);
                    break;
                case 49:
                    AbstractC5117o0.m23493S(m23005V(length), (List) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0, m23041v(length));
                    break;
                case 50:
                    m23046x0(interfaceC5064B0, iM23005V, AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), length);
                    break;
                case 51:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22869e(iM23005V, m23008Y(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 52:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22850A(iM23005V, m23009Z(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 53:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22878n(iM23005V, m23011b0(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 54:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22876l(iM23005V, m23011b0(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 55:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22882r(iM23005V, m23010a0(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 56:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22872h(iM23005V, m23011b0(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 57:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22868d(iM23005V, m23010a0(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 58:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22879o(iM23005V, m23007X(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 59:
                    if (m22992I(obj, iM23005V, length)) {
                        m23048y0(iM23005V, AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), interfaceC5064B0);
                    }
                    break;
                case 60:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22861L(iM23005V, AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), m23041v(length));
                    }
                    break;
                case 61:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22863N(iM23005V, (AbstractC5104i) AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 62:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22866b(iM23005V, m23010a0(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 63:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22853D(iM23005V, m23010a0(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 64:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22880p(iM23005V, m23010a0(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 65:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22885u(iM23005V, m23011b0(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 66:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22857H(iM23005V, m23010a0(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 67:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22890z(iM23005V, m23011b0(obj, m23006W(iM23040u0)));
                    }
                    break;
                case 68:
                    if (m22992I(obj, iM23005V, length)) {
                        interfaceC5064B0.mo22862M(iM23005V, AbstractC5137y0.m23735G(obj, m23006W(iM23040u0)), m23041v(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f19367p.mo23573j(interfaceC5064B0, entry);
            entry = itM23606e.hasNext() ? (Map.Entry) itM23606e.next() : null;
        }
    }

    /* JADX INFO: renamed from: x */
    private int m23045x(AbstractC5129u0 abstractC5129u0, Object obj) {
        return abstractC5129u0.mo23627h(abstractC5129u0.mo23626g(obj));
    }

    /* JADX INFO: renamed from: x0 */
    private void m23046x0(InterfaceC5064B0 interfaceC5064B0, int i7, Object obj, int i8) {
        if (obj != null) {
            interfaceC5064B0.mo22864O(i7, this.f19368q.mo22955c(m23039u(i8)), this.f19368q.mo22960h(obj));
        }
    }

    /* JADX INFO: renamed from: y */
    private static int m23047y(Object obj, long j7) {
        return AbstractC5137y0.m23731C(obj, j7);
    }

    /* JADX INFO: renamed from: y0 */
    private void m23048y0(int i7, Object obj, InterfaceC5064B0 interfaceC5064B0) {
        if (obj instanceof String) {
            interfaceC5064B0.mo22875k(i7, (String) obj);
        } else {
            interfaceC5064B0.mo22863N(i7, (AbstractC5104i) obj);
        }
    }

    /* JADX INFO: renamed from: z */
    private static boolean m23049z(int i7) {
        return (i7 & 536870912) != 0;
    }

    /* JADX INFO: renamed from: z0 */
    private void m23050z0(AbstractC5129u0 abstractC5129u0, Object obj, InterfaceC5064B0 interfaceC5064B0) {
        abstractC5129u0.mo23638t(abstractC5129u0.mo23626g(obj), interfaceC5064B0);
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: a */
    public void mo23051a(Object obj, Object obj2) {
        m23023m(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.f19352a.length; i7 += 3) {
            m22999P(obj, obj2, i7);
        }
        AbstractC5117o0.m23480F(this.f19366o, obj, obj2);
        if (this.f19357f) {
            AbstractC5117o0.m23478D(this.f19367p, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: b */
    public void mo23052b(Object obj) {
        if (m22990G(obj)) {
            if (obj instanceof AbstractC5136y) {
                AbstractC5136y abstractC5136y = (AbstractC5136y) obj;
                abstractC5136y.m23713r();
                abstractC5136y.m23712q();
                abstractC5136y.m23705K();
            }
            int length = this.f19352a.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int iM23040u0 = m23040u0(i7);
                long jM23006W = m23006W(iM23040u0);
                int iM23038t0 = m23038t0(iM23040u0);
                if (iM23038t0 != 9) {
                    if (iM23038t0 != 60 && iM23038t0 != 68) {
                        switch (iM23038t0) {
                            case 17:
                                if (m22984A(obj, i7)) {
                                    m23041v(i7).mo23052b(f19351s.getObject(obj, jM23006W));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case zzbbn.zzt.zzm /* 21 */:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f19365n.mo22922c(obj, jM23006W);
                                break;
                            case 50:
                                Unsafe unsafe = f19351s;
                                Object object = unsafe.getObject(obj, jM23006W);
                                if (object != null) {
                                    unsafe.putObject(obj, jM23006W, this.f19368q.mo22954b(object));
                                }
                                break;
                        }
                    } else if (m22992I(obj, m23005V(i7), i7)) {
                        m23041v(i7).mo23052b(f19351s.getObject(obj, jM23006W));
                    }
                } else if (m22984A(obj, i7)) {
                    m23041v(i7).mo23052b(f19351s.getObject(obj, jM23006W));
                }
            }
            this.f19366o.mo23629j(obj);
            if (this.f19357f) {
                this.f19367p.mo23569f(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: c */
    public final boolean mo23053c(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f19362k) {
            int i12 = this.f19361j[i10];
            int iM23005V = m23005V(i12);
            int iM23040u0 = m23040u0(i12);
            int i13 = this.f19352a[i12 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i9) {
                if (i14 != 1048575) {
                    i11 = f19351s.getInt(obj, i14);
                }
                i8 = i11;
                i7 = i14;
            } else {
                i7 = i9;
                i8 = i11;
            }
            Object obj2 = obj;
            if (m22993J(iM23040u0) && !m22985B(obj2, i12, i7, i8, i15)) {
                return false;
            }
            int iM23038t0 = m23038t0(iM23040u0);
            if (iM23038t0 == 9 || iM23038t0 == 17) {
                if (m22985B(obj2, i12, i7, i8, i15) && !m22986C(obj2, iM23040u0, m23041v(i12))) {
                    return false;
                }
            } else if (iM23038t0 == 27) {
                if (!m22988E(obj2, iM23040u0, i12)) {
                    return false;
                }
            } else if (iM23038t0 == 60 || iM23038t0 == 68) {
                if (m22992I(obj2, iM23005V, i12) && !m22986C(obj2, iM23040u0, m23041v(i12))) {
                    return false;
                }
            } else if (iM23038t0 != 49) {
                if (iM23038t0 == 50 && !m22989F(obj2, iM23040u0, i12)) {
                    return false;
                }
            } else if (!m22988E(obj2, iM23040u0, i12)) {
                return false;
            }
            i10++;
            obj = obj2;
            i9 = i7;
            i11 = i8;
        }
        return !this.f19357f || this.f19367p.mo23566c(obj).m23610k();
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: d */
    public boolean mo23054d(Object obj, Object obj2) {
        int length = this.f19352a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            if (!m23031q(obj, obj2, i7)) {
                return false;
            }
        }
        if (!this.f19366o.mo23626g(obj).equals(this.f19366o.mo23626g(obj2))) {
            return false;
        }
        if (this.f19357f) {
            return this.f19367p.mo23566c(obj).equals(this.f19367p.mo23566c(obj2));
        }
        return true;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: d0 */
    int m23055d0(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.AbstractC5098f.a r32) {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5085X.m23055d0(java.lang.Object, byte[], int, int, int, com.google.protobuf.f$a):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
      0x0552: PHI (r0v2 com.google.protobuf.X) = 
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v24 com.google.protobuf.X)
      (r0v30 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
      (r0v1 com.google.protobuf.X)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0552: PHI (r1v4 java.lang.Object) = 
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v5 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: e */
    public int mo23056e(Object obj) {
        int i7;
        int iM23369j;
        int iM23377r;
        int iM23384y;
        int iM23512i;
        int iM23353Q;
        int iM23355S;
        C5085X c5085x = this;
        Object obj2 = obj;
        Unsafe unsafe = f19351s;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i9 < c5085x.f19352a.length) {
            int iM23040u0 = c5085x.m23040u0(i9);
            int iM23038t0 = m23038t0(iM23040u0);
            int iM23005V = c5085x.m23005V(i9);
            int i13 = c5085x.f19352a[i9 + 2];
            int i14 = i13 & i8;
            if (iM23038t0 <= 17) {
                if (i14 != i12) {
                    i10 = i14 == i8 ? 0 : unsafe.getInt(obj2, i14);
                    i12 = i14;
                }
                i7 = 1 << (i13 >>> 20);
            } else {
                i7 = 0;
            }
            int i15 = i11;
            long jM23006W = m23006W(iM23040u0);
            if (iM23038t0 < EnumC5130v.f19566Z.m23639c() || iM23038t0 > EnumC5130v.f19580m0.m23639c()) {
                i14 = 0;
            }
            switch (iM23038t0) {
                case 0:
                    if (!c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23369j(iM23005V, 0.0d);
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 1:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23377r = AbstractC5110l.m23377r(iM23005V, 0.0f);
                        i11 = i15 + iM23377r;
                        c5085x = this;
                        obj2 = obj;
                    }
                    c5085x = this;
                    obj2 = obj;
                    i11 = i15;
                    break;
                case 2:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23384y = AbstractC5110l.m23384y(iM23005V, unsafe.getLong(obj2, jM23006W));
                        i11 = i15 + iM23384y;
                        c5085x = this;
                    }
                    c5085x = this;
                    i11 = i15;
                    break;
                case 3:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23384y = AbstractC5110l.m23356T(iM23005V, unsafe.getLong(obj2, jM23006W));
                        i11 = i15 + iM23384y;
                        c5085x = this;
                    }
                    c5085x = this;
                    i11 = i15;
                    break;
                case 4:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23384y = AbstractC5110l.m23382w(iM23005V, unsafe.getInt(obj2, jM23006W));
                        i11 = i15 + iM23384y;
                        c5085x = this;
                    }
                    c5085x = this;
                    i11 = i15;
                    break;
                case 5:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23377r = AbstractC5110l.m23375p(iM23005V, 0L);
                        i11 = i15 + iM23377r;
                        c5085x = this;
                        obj2 = obj;
                    }
                    c5085x = this;
                    obj2 = obj;
                    i11 = i15;
                    break;
                case 6:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23377r = AbstractC5110l.m23373n(iM23005V, 0);
                        i11 = i15 + iM23377r;
                        c5085x = this;
                        obj2 = obj;
                    }
                    c5085x = this;
                    obj2 = obj;
                    i11 = i15;
                    break;
                case 7:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23377r = AbstractC5110l.m23364e(iM23005V, true);
                        i11 = i15 + iM23377r;
                        c5085x = this;
                        obj2 = obj;
                    }
                    c5085x = this;
                    obj2 = obj;
                    i11 = i15;
                    break;
                case 8:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        Object object = unsafe.getObject(obj2, jM23006W);
                        iM23384y = object instanceof AbstractC5104i ? AbstractC5110l.m23367h(iM23005V, (AbstractC5104i) object) : AbstractC5110l.m23351O(iM23005V, (String) object);
                        i11 = i15 + iM23384y;
                        c5085x = this;
                    }
                    c5085x = this;
                    i11 = i15;
                    break;
                case 9:
                    if (!c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5117o0.m23518o(iM23005V, unsafe.getObject(obj2, jM23006W), c5085x.m23041v(i9));
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 10:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23384y = AbstractC5110l.m23367h(iM23005V, (AbstractC5104i) unsafe.getObject(obj2, jM23006W));
                        i11 = i15 + iM23384y;
                        c5085x = this;
                    }
                    c5085x = this;
                    i11 = i15;
                    break;
                case 11:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23384y = AbstractC5110l.m23354R(iM23005V, unsafe.getInt(obj2, jM23006W));
                        i11 = i15 + iM23384y;
                        c5085x = this;
                    }
                    c5085x = this;
                    i11 = i15;
                    break;
                case 12:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23384y = AbstractC5110l.m23371l(iM23005V, unsafe.getInt(obj2, jM23006W));
                        i11 = i15 + iM23384y;
                        c5085x = this;
                    }
                    c5085x = this;
                    i11 = i15;
                    break;
                case 13:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23377r = AbstractC5110l.m23343G(iM23005V, 0);
                        i11 = i15 + iM23377r;
                        c5085x = this;
                        obj2 = obj;
                    }
                    c5085x = this;
                    obj2 = obj;
                    i11 = i15;
                    break;
                case 14:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23377r = AbstractC5110l.m23345I(iM23005V, 0L);
                        i11 = i15 + iM23377r;
                        c5085x = this;
                        obj2 = obj;
                    }
                    c5085x = this;
                    obj2 = obj;
                    i11 = i15;
                    break;
                case 15:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23384y = AbstractC5110l.m23347K(iM23005V, unsafe.getInt(obj2, jM23006W));
                        i11 = i15 + iM23384y;
                        c5085x = this;
                    }
                    c5085x = this;
                    i11 = i15;
                    break;
                case 16:
                    if (c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        iM23384y = AbstractC5110l.m23349M(iM23005V, unsafe.getLong(obj2, jM23006W));
                        i11 = i15 + iM23384y;
                        c5085x = this;
                    }
                    c5085x = this;
                    i11 = i15;
                    break;
                case 17:
                    if (!c5085x.m22985B(obj2, i9, i12, i10, i7)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23379t(iM23005V, (InterfaceC5082U) unsafe.getObject(obj2, jM23006W), c5085x.m23041v(i9));
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 18:
                    iM23369j = AbstractC5117o0.m23511h(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 19:
                    iM23369j = AbstractC5117o0.m23509f(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 20:
                    iM23369j = AbstractC5117o0.m23516m(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    iM23369j = AbstractC5117o0.m23527x(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 22:
                    iM23369j = AbstractC5117o0.m23514k(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 23:
                    iM23369j = AbstractC5117o0.m23511h(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 24:
                    iM23369j = AbstractC5117o0.m23509f(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 25:
                    iM23369j = AbstractC5117o0.m23501a(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 26:
                    iM23369j = AbstractC5117o0.m23524u(iM23005V, (List) unsafe.getObject(obj2, jM23006W));
                    i11 = i15 + iM23369j;
                    break;
                case 27:
                    iM23369j = AbstractC5117o0.m23519p(iM23005V, (List) unsafe.getObject(obj2, jM23006W), c5085x.m23041v(i9));
                    i11 = i15 + iM23369j;
                    break;
                case 28:
                    iM23369j = AbstractC5117o0.m23505c(iM23005V, (List) unsafe.getObject(obj2, jM23006W));
                    i11 = i15 + iM23369j;
                    break;
                case 29:
                    iM23369j = AbstractC5117o0.m23525v(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 30:
                    iM23369j = AbstractC5117o0.m23507d(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 31:
                    iM23369j = AbstractC5117o0.m23509f(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 32:
                    iM23369j = AbstractC5117o0.m23511h(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 33:
                    iM23369j = AbstractC5117o0.m23520q(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 34:
                    iM23369j = AbstractC5117o0.m23522s(iM23005V, (List) unsafe.getObject(obj2, jM23006W), false);
                    i11 = i15 + iM23369j;
                    break;
                case 35:
                    iM23512i = AbstractC5117o0.m23512i((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 36:
                    iM23512i = AbstractC5117o0.m23510g((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 37:
                    iM23512i = AbstractC5117o0.m23517n((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 38:
                    iM23512i = AbstractC5117o0.m23528y((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 39:
                    iM23512i = AbstractC5117o0.m23515l((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 40:
                    iM23512i = AbstractC5117o0.m23512i((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 41:
                    iM23512i = AbstractC5117o0.m23510g((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 42:
                    iM23512i = AbstractC5117o0.m23503b((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 43:
                    iM23512i = AbstractC5117o0.m23526w((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 44:
                    iM23512i = AbstractC5117o0.m23508e((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 45:
                    iM23512i = AbstractC5117o0.m23510g((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 46:
                    iM23512i = AbstractC5117o0.m23512i((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 47:
                    iM23512i = AbstractC5117o0.m23521r((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 48:
                    iM23512i = AbstractC5117o0.m23523t((List) unsafe.getObject(obj2, jM23006W));
                    if (iM23512i <= 0) {
                        i11 = i15;
                    } else {
                        if (c5085x.f19360i) {
                            unsafe.putInt(obj2, i14, iM23512i);
                        }
                        iM23353Q = AbstractC5110l.m23353Q(iM23005V);
                        iM23355S = AbstractC5110l.m23355S(iM23512i);
                        i11 = i15 + iM23353Q + iM23355S + iM23512i;
                    }
                    break;
                case 49:
                    iM23369j = AbstractC5117o0.m23513j(iM23005V, (List) unsafe.getObject(obj2, jM23006W), c5085x.m23041v(i9));
                    i11 = i15 + iM23369j;
                    break;
                case 50:
                    iM23369j = c5085x.f19368q.mo22958f(iM23005V, unsafe.getObject(obj2, jM23006W), c5085x.m23039u(i9));
                    i11 = i15 + iM23369j;
                    break;
                case 51:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23369j(iM23005V, 0.0d);
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 52:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23377r(iM23005V, 0.0f);
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 53:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23384y(iM23005V, m23011b0(obj2, jM23006W));
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 54:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23356T(iM23005V, m23011b0(obj2, jM23006W));
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 55:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23382w(iM23005V, m23010a0(obj2, jM23006W));
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 56:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23375p(iM23005V, 0L);
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 57:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23373n(iM23005V, 0);
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 58:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23364e(iM23005V, true);
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 59:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        Object object2 = unsafe.getObject(obj2, jM23006W);
                        iM23369j = object2 instanceof AbstractC5104i ? AbstractC5110l.m23367h(iM23005V, (AbstractC5104i) object2) : AbstractC5110l.m23351O(iM23005V, (String) object2);
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 60:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5117o0.m23518o(iM23005V, unsafe.getObject(obj2, jM23006W), c5085x.m23041v(i9));
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 61:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23367h(iM23005V, (AbstractC5104i) unsafe.getObject(obj2, jM23006W));
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 62:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23354R(iM23005V, m23010a0(obj2, jM23006W));
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 63:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23371l(iM23005V, m23010a0(obj2, jM23006W));
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 64:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23343G(iM23005V, 0);
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 65:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23345I(iM23005V, 0L);
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 66:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23347K(iM23005V, m23010a0(obj2, jM23006W));
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 67:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23349M(iM23005V, m23011b0(obj2, jM23006W));
                        i11 = i15 + iM23369j;
                    }
                    break;
                case 68:
                    if (!c5085x.m22992I(obj2, iM23005V, i9)) {
                        i11 = i15;
                    } else {
                        iM23369j = AbstractC5110l.m23379t(iM23005V, (InterfaceC5082U) unsafe.getObject(obj2, jM23006W), c5085x.m23041v(i9));
                        i11 = i15 + iM23369j;
                    }
                    break;
                default:
                    i11 = i15;
                    break;
            }
            i9 += 3;
            i8 = 1048575;
        }
        int iM23045x = i11 + c5085x.m23045x(c5085x.f19366o, obj2);
        return c5085x.f19357f ? iM23045x + c5085x.f19367p.mo23566c(obj2).m23608h() : iM23045x;
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: f */
    public Object mo23057f() {
        return this.f19364m.mo23067a(this.f19356e);
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: g */
    public int mo23058g(Object obj) {
        int i7;
        int iM22842f;
        int length = this.f19352a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int iM23040u0 = m23040u0(i9);
            int iM23005V = m23005V(i9);
            long jM23006W = m23006W(iM23040u0);
            int iHashCode = 37;
            switch (m23038t0(iM23040u0)) {
                case 0:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5063B.m22842f(Double.doubleToLongBits(AbstractC5137y0.m23729A(obj, jM23006W)));
                    i8 = i7 + iM22842f;
                    break;
                case 1:
                    i7 = i8 * 53;
                    iM22842f = Float.floatToIntBits(AbstractC5137y0.m23730B(obj, jM23006W));
                    i8 = i7 + iM22842f;
                    break;
                case 2:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5063B.m22842f(AbstractC5137y0.m23733E(obj, jM23006W));
                    i8 = i7 + iM22842f;
                    break;
                case 3:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5063B.m22842f(AbstractC5137y0.m23733E(obj, jM23006W));
                    i8 = i7 + iM22842f;
                    break;
                case 4:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5137y0.m23731C(obj, jM23006W);
                    i8 = i7 + iM22842f;
                    break;
                case 5:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5063B.m22842f(AbstractC5137y0.m23733E(obj, jM23006W));
                    i8 = i7 + iM22842f;
                    break;
                case 6:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5137y0.m23731C(obj, jM23006W);
                    i8 = i7 + iM22842f;
                    break;
                case 7:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5063B.m22839c(AbstractC5137y0.m23772t(obj, jM23006W));
                    i8 = i7 + iM22842f;
                    break;
                case 8:
                    i7 = i8 * 53;
                    iM22842f = ((String) AbstractC5137y0.m23735G(obj, jM23006W)).hashCode();
                    i8 = i7 + iM22842f;
                    break;
                case 9:
                    Object objM23735G = AbstractC5137y0.m23735G(obj, jM23006W);
                    if (objM23735G != null) {
                        iHashCode = objM23735G.hashCode();
                    }
                    i8 = (i8 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5137y0.m23735G(obj, jM23006W).hashCode();
                    i8 = i7 + iM22842f;
                    break;
                case 11:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5137y0.m23731C(obj, jM23006W);
                    i8 = i7 + iM22842f;
                    break;
                case 12:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5137y0.m23731C(obj, jM23006W);
                    i8 = i7 + iM22842f;
                    break;
                case 13:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5137y0.m23731C(obj, jM23006W);
                    i8 = i7 + iM22842f;
                    break;
                case 14:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5063B.m22842f(AbstractC5137y0.m23733E(obj, jM23006W));
                    i8 = i7 + iM22842f;
                    break;
                case 15:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5137y0.m23731C(obj, jM23006W);
                    i8 = i7 + iM22842f;
                    break;
                case 16:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5063B.m22842f(AbstractC5137y0.m23733E(obj, jM23006W));
                    i8 = i7 + iM22842f;
                    break;
                case 17:
                    Object objM23735G2 = AbstractC5137y0.m23735G(obj, jM23006W);
                    if (objM23735G2 != null) {
                        iHashCode = objM23735G2.hashCode();
                    }
                    i8 = (i8 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbn.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5137y0.m23735G(obj, jM23006W).hashCode();
                    i8 = i7 + iM22842f;
                    break;
                case 50:
                    i7 = i8 * 53;
                    iM22842f = AbstractC5137y0.m23735G(obj, jM23006W).hashCode();
                    i8 = i7 + iM22842f;
                    break;
                case 51:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = AbstractC5063B.m22842f(Double.doubleToLongBits(m23008Y(obj, jM23006W)));
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 52:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = Float.floatToIntBits(m23009Z(obj, jM23006W));
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 53:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = AbstractC5063B.m22842f(m23011b0(obj, jM23006W));
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 54:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = AbstractC5063B.m22842f(m23011b0(obj, jM23006W));
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 55:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = m23010a0(obj, jM23006W);
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 56:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = AbstractC5063B.m22842f(m23011b0(obj, jM23006W));
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 57:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = m23010a0(obj, jM23006W);
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 58:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = AbstractC5063B.m22839c(m23007X(obj, jM23006W));
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 59:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = ((String) AbstractC5137y0.m23735G(obj, jM23006W)).hashCode();
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 60:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = AbstractC5137y0.m23735G(obj, jM23006W).hashCode();
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 61:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = AbstractC5137y0.m23735G(obj, jM23006W).hashCode();
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 62:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = m23010a0(obj, jM23006W);
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 63:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = m23010a0(obj, jM23006W);
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 64:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = m23010a0(obj, jM23006W);
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 65:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = AbstractC5063B.m22842f(m23011b0(obj, jM23006W));
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 66:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = m23010a0(obj, jM23006W);
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 67:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = AbstractC5063B.m22842f(m23011b0(obj, jM23006W));
                        i8 = i7 + iM22842f;
                    }
                    break;
                case 68:
                    if (m22992I(obj, iM23005V, i9)) {
                        i7 = i8 * 53;
                        iM22842f = AbstractC5137y0.m23735G(obj, jM23006W).hashCode();
                        i8 = i7 + iM22842f;
                    }
                    break;
            }
        }
        int iHashCode2 = (i8 * 53) + this.f19366o.mo23626g(obj).hashCode();
        return this.f19357f ? (iHashCode2 * 53) + this.f19367p.mo23566c(obj).hashCode() : iHashCode2;
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: h */
    public void mo23059h(Object obj, InterfaceC5064B0 interfaceC5064B0) {
        if (interfaceC5064B0.mo22873i() == InterfaceC5064B0.a.DESCENDING) {
            m23044w0(obj, interfaceC5064B0);
        } else {
            m23042v0(obj, interfaceC5064B0);
        }
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: i */
    public void mo23060i(Object obj, InterfaceC5109k0 interfaceC5109k0, C5120q c5120q) throws Throwable {
        c5120q.getClass();
        m23023m(obj);
        m22995L(this.f19366o, this.f19367p, obj, interfaceC5109k0, c5120q);
    }

    @Override // com.google.protobuf.InterfaceC5113m0
    /* JADX INFO: renamed from: j */
    public void mo23061j(Object obj, byte[] bArr, int i7, int i8, AbstractC5098f.a aVar) {
        m23055d0(obj, bArr, i7, i8, 0, aVar);
    }
}

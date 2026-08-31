package androidx.datastore.preferences.protobuf;

import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.internal.ads.zzbbn;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.M */
/* JADX INFO: loaded from: classes.dex */
final class C2489M implements InterfaceC2500Y {

    /* JADX INFO: renamed from: r */
    private static final int[] f9442r = new int[0];

    /* JADX INFO: renamed from: s */
    private static final Unsafe f9443s = AbstractC2519i0.m11400A();

    /* JADX INFO: renamed from: a */
    private final int[] f9444a;

    /* JADX INFO: renamed from: b */
    private final Object[] f9445b;

    /* JADX INFO: renamed from: c */
    private final int f9446c;

    /* JADX INFO: renamed from: d */
    private final int f9447d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC2486J f9448e;

    /* JADX INFO: renamed from: f */
    private final boolean f9449f;

    /* JADX INFO: renamed from: g */
    private final boolean f9450g;

    /* JADX INFO: renamed from: h */
    private final EnumC2495T f9451h;

    /* JADX INFO: renamed from: i */
    private final boolean f9452i;

    /* JADX INFO: renamed from: j */
    private final int[] f9453j;

    /* JADX INFO: renamed from: k */
    private final int f9454k;

    /* JADX INFO: renamed from: l */
    private final int f9455l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC2491O f9456m;

    /* JADX INFO: renamed from: n */
    private final InterfaceC2538y f9457n;

    /* JADX INFO: renamed from: o */
    private final AbstractC2513f0 f9458o;

    /* JADX INFO: renamed from: p */
    private final AbstractC2527n f9459p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC2481E f9460q;

    private C2489M(int[] iArr, Object[] objArr, int i7, int i8, InterfaceC2486J interfaceC2486J, EnumC2495T enumC2495T, boolean z7, int[] iArr2, int i9, int i10, InterfaceC2491O interfaceC2491O, InterfaceC2538y interfaceC2538y, AbstractC2513f0 abstractC2513f0, AbstractC2527n abstractC2527n, InterfaceC2481E interfaceC2481E) {
        this.f9444a = iArr;
        this.f9445b = objArr;
        this.f9446c = i7;
        this.f9447d = i8;
        this.f9450g = interfaceC2486J instanceof AbstractC2533t;
        this.f9451h = enumC2495T;
        this.f9449f = abstractC2527n != null && abstractC2527n.mo11562e(interfaceC2486J);
        this.f9452i = z7;
        this.f9453j = iArr2;
        this.f9454k = i9;
        this.f9455l = i10;
        this.f9456m = interfaceC2491O;
        this.f9457n = interfaceC2538y;
        this.f9458o = abstractC2513f0;
        this.f9459p = abstractC2527n;
        this.f9448e = interfaceC2486J;
        this.f9460q = interfaceC2481E;
    }

    /* JADX INFO: renamed from: A */
    private boolean m10907A(Object obj, int i7, int i8) {
        Map mapMo10887h = this.f9460q.mo10887h(AbstractC2519i0.m11442z(obj, m10924R(i7)));
        if (mapMo10887h.isEmpty()) {
            return true;
        }
        if (this.f9460q.mo10882c(m10957r(i8)).f9435c.m11551c() != AbstractC2523k0.c.MESSAGE) {
            return true;
        }
        InterfaceC2500Y interfaceC2500YM10986c = null;
        for (Object obj2 : mapMo10887h.values()) {
            if (interfaceC2500YM10986c == null) {
                interfaceC2500YM10986c = C2496U.m10984a().m10986c(obj2.getClass());
            }
            if (!interfaceC2500YM10986c.mo10968c(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    private static boolean m10908B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2533t) {
            return ((AbstractC2533t) obj).m11611C();
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    private boolean m10909C(Object obj, Object obj2, int i7) {
        long jM10931Y = m10931Y(i7) & 1048575;
        return AbstractC2519i0.m11439w(obj, jM10931Y) == AbstractC2519i0.m11439w(obj2, jM10931Y);
    }

    /* JADX INFO: renamed from: D */
    private boolean m10910D(Object obj, int i7, int i8) {
        return AbstractC2519i0.m11439w(obj, (long) (m10931Y(i8) & 1048575)) == i7;
    }

    /* JADX INFO: renamed from: E */
    private static boolean m10911E(int i7) {
        return (i7 & 268435456) != 0;
    }

    /* JADX INFO: renamed from: F */
    private static long m10912F(Object obj, long j7) {
        return AbstractC2519i0.m11440x(obj, j7);
    }

    /* JADX WARN: Code duplicated, block: B:232:0x06d8 A[Catch: all -> 0x06f9, TRY_LEAVE, TryCatch #13 {all -> 0x06f9, blocks: (B:230:0x06d2, B:232:0x06d8, B:243:0x06fd, B:244:0x0702), top: B:281:0x06d2 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x06e5 A[LOOP:2: B:235:0x06e1->B:237:0x06e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x06fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x06fd A[Catch: all -> 0x06f9, TRY_ENTER, TryCatch #13 {all -> 0x06f9, blocks: (B:230:0x06d2, B:232:0x06d8, B:243:0x06fd, B:244:0x0702), top: B:281:0x06d2 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x0710 A[LOOP:3: B:247:0x070c->B:249:0x0710, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x0733 A[LOOP:4: B:257:0x072f->B:259:0x0733, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x0746  */
    /* JADX WARN: Code duplicated, block: B:321:0x06de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0709 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: G */
    private void m10913G(AbstractC2513f0 abstractC2513f0, AbstractC2527n abstractC2527n, Object obj, InterfaceC2499X interfaceC2499X, C2526m c2526m) throws Throwable {
        Object obj2;
        int i7;
        Object objM10952o;
        AbstractC2513f0 abstractC2513f1;
        C2489M c2489m;
        Object obj3;
        Object objMo11168f;
        AbstractC2513f0 abstractC2513f2;
        AbstractC2527n abstractC2527n2;
        Object objMo11559b;
        AbstractC2513f0 abstractC2513f3;
        int i8;
        Object objM10952o2;
        int i9;
        InterfaceC2499X interfaceC2499X2;
        C2489M c2489m2;
        Object obj4;
        Object obj5;
        C2489M c2489m3 = this;
        C2526m c2526m2 = c2526m;
        C2530q c2530qMo11561d = null;
        Object objMo11564g = null;
        while (true) {
            try {
                int iMo11032w = interfaceC2499X.mo11032w();
                int iM10930X = c2489m3.m10930X(iMo11032w);
                if (iM10930X >= 0) {
                    obj3 = obj;
                    c2526m = c2526m2;
                    objMo11168f = objMo11564g;
                    abstractC2513f2 = abstractC2513f0;
                    InterfaceC2499X interfaceC2499X3 = interfaceC2499X;
                    try {
                        int iM10945k0 = c2489m3.m10945k0(iM10930X);
                        try {
                            switch (m10943j0(iM10945k0)) {
                                case 0:
                                    AbstractC2519i0.m11410K(obj3, m10924R(iM10945k0), interfaceC2499X3.readDouble());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 1:
                                    AbstractC2519i0.m11411L(obj3, m10924R(iM10945k0), interfaceC2499X3.readFloat());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 2:
                                    AbstractC2519i0.m11413N(obj3, m10924R(iM10945k0), interfaceC2499X3.mo11002G());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 3:
                                    AbstractC2519i0.m11413N(obj3, m10924R(iM10945k0), interfaceC2499X3.mo11012c());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 4:
                                    AbstractC2519i0.m11412M(obj3, m10924R(iM10945k0), interfaceC2499X3.mo10997B());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 5:
                                    AbstractC2519i0.m11413N(obj3, m10924R(iM10945k0), interfaceC2499X3.mo11013d());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 6:
                                    AbstractC2519i0.m11412M(obj3, m10924R(iM10945k0), interfaceC2499X3.mo11017h());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 7:
                                    AbstractC2519i0.m11404E(obj3, m10924R(iM10945k0), interfaceC2499X3.mo11018i());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 8:
                                    c2489m3.m10934b0(obj3, iM10945k0, interfaceC2499X3);
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 9:
                                    InterfaceC2486J interfaceC2486J = (InterfaceC2486J) c2489m3.m10918L(obj3, iM10930X);
                                    interfaceC2499X3.mo11005J(interfaceC2486J, c2489m3.m10958s(iM10930X), c2526m);
                                    c2489m3.m10940h0(obj3, iM10930X, interfaceC2486J);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 10:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), interfaceC2499X3.mo11035z());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 11:
                                    AbstractC2519i0.m11412M(obj3, m10924R(iM10945k0), interfaceC2499X3.mo11021l());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 12:
                                    int iMo11026q = interfaceC2499X3.mo11026q();
                                    c2489m3.m10956q(iM10930X);
                                    AbstractC2519i0.m11412M(obj3, m10924R(iM10945k0), iMo11026q);
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 13:
                                    AbstractC2519i0.m11412M(obj3, m10924R(iM10945k0), interfaceC2499X3.mo10999D());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 14:
                                    AbstractC2519i0.m11413N(obj3, m10924R(iM10945k0), interfaceC2499X3.mo11019j());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 15:
                                    AbstractC2519i0.m11412M(obj3, m10924R(iM10945k0), interfaceC2499X3.mo11028s());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 16:
                                    AbstractC2519i0.m11413N(obj3, m10924R(iM10945k0), interfaceC2499X3.mo11029t());
                                    c2489m3.m10937e0(obj3, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 17:
                                    InterfaceC2486J interfaceC2486J2 = (InterfaceC2486J) c2489m3.m10918L(obj3, iM10930X);
                                    interfaceC2499X3.mo11007L(interfaceC2486J2, c2489m3.m10958s(iM10930X), c2526m);
                                    c2489m3.m10940h0(obj3, iM10930X, interfaceC2486J2);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 18:
                                    interfaceC2499X3.mo11001F(c2489m3.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 19:
                                    interfaceC2499X3.mo10996A(c2489m3.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 20:
                                    interfaceC2499X3.mo11022m(c2489m3.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case zzbbn.zzt.zzm /* 21 */:
                                    interfaceC2499X3.mo11020k(c2489m3.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 22:
                                    interfaceC2499X3.mo11024o(c2489m3.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 23:
                                    interfaceC2499X3.mo11004I(c2489m3.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 24:
                                    interfaceC2499X3.mo11027r(c2489m3.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 25:
                                    interfaceC2499X3.mo11030u(c2489m3.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 26:
                                    c2489m3.m10935c0(obj3, iM10945k0, interfaceC2499X3);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 27:
                                    abstractC2513f0 = abstractC2513f2;
                                    obj2 = obj3;
                                    C2489M c2489m4 = c2489m3;
                                    try {
                                        c2526m = c2526m;
                                        try {
                                            c2489m3.m10933a0(obj2, iM10945k0, interfaceC2499X3, c2489m4.m10958s(iM10930X), c2526m);
                                            objMo11564g = objMo11168f;
                                        } catch (C2535v.a unused) {
                                            objMo11564g = objMo11168f;
                                            try {
                                                if (abstractC2513f0.mo11178q(interfaceC2499X3)) {
                                                    if (objMo11564g == null) {
                                                        objMo11564g = abstractC2513f0.mo11168f(obj2);
                                                    }
                                                    if (!abstractC2513f0.m11174m(objMo11564g, interfaceC2499X3, 0)) {
                                                        objM10952o2 = objMo11564g;
                                                        for (i8 = c2489m3.f9454k; i8 < c2489m3.f9455l; i8++) {
                                                            objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i8], objM10952o2, abstractC2513f0, obj);
                                                        }
                                                        if (objM10952o2 == null) {
                                                            return;
                                                        }
                                                        abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                        return;
                                                    }
                                                } else if (!interfaceC2499X3.mo10998C()) {
                                                    objM10952o2 = objMo11564g;
                                                    for (i9 = c2489m3.f9454k; i9 < c2489m3.f9455l; i9++) {
                                                        objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i9], objM10952o2, abstractC2513f0, obj);
                                                    }
                                                    if (objM10952o2 == null) {
                                                        return;
                                                    }
                                                    abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (C2535v.a unused2) {
                                        c2526m = c2526m;
                                        c2489m3 = c2489m4;
                                        interfaceC2499X3 = interfaceC2499X3;
                                    }
                                    c2526m2 = c2526m;
                                    break;
                                case 28:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo11000E(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 29:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    abstractC2513f0 = abstractC2513f2;
                                    obj2 = obj3;
                                    c2489m2 = c2489m3;
                                    try {
                                        try {
                                            interfaceC2499X2.mo11016g(c2489m2.f9457n.mo11662c(obj2, m10924R(iM10945k0)));
                                            c2489m3 = c2489m2;
                                            objMo11564g = objMo11168f;
                                        } catch (C2535v.a unused3) {
                                            c2489m3 = c2489m2;
                                            objMo11564g = objMo11168f;
                                            interfaceC2499X3 = interfaceC2499X2;
                                            if (abstractC2513f0.mo11178q(interfaceC2499X3)) {
                                                if (objMo11564g == null) {
                                                    objMo11564g = abstractC2513f0.mo11168f(obj2);
                                                }
                                                if (!abstractC2513f0.m11174m(objMo11564g, interfaceC2499X3, 0)) {
                                                    objM10952o2 = objMo11564g;
                                                    while (i8 < c2489m3.f9455l) {
                                                        objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i8], objM10952o2, abstractC2513f0, obj);
                                                    }
                                                    if (objM10952o2 == null) {
                                                        return;
                                                    }
                                                    abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                    return;
                                                }
                                            } else if (!interfaceC2499X3.mo10998C()) {
                                                objM10952o2 = objMo11564g;
                                                while (i9 < c2489m3.f9455l) {
                                                    objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i9], objM10952o2, abstractC2513f0, obj);
                                                }
                                                if (objM10952o2 == null) {
                                                    return;
                                                }
                                                abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                return;
                                            }
                                        }
                                        c2526m2 = c2526m;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c2489m3 = c2489m2;
                                        objMo11564g = objMo11168f;
                                        i7 = c2489m3.f9454k;
                                        objM10952o = objMo11564g;
                                        while (i7 < c2489m3.f9455l) {
                                            objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                                            i7++;
                                            c2489m3 = this;
                                        }
                                        abstractC2513f1 = abstractC2513f0;
                                        if (objM10952o != null) {
                                            abstractC2513f1.mo11176o(obj2, objM10952o);
                                        }
                                        throw th;
                                    }
                                    break;
                                case 30:
                                    c2489m2 = c2489m3;
                                    obj2 = obj3;
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    try {
                                        try {
                                            List listMo11662c = c2489m2.f9457n.mo11662c(obj2, m10924R(iM10945k0));
                                            interfaceC2499X2.mo11025p(listMo11662c);
                                            try {
                                                c2489m2.m10956q(iM10930X);
                                                obj4 = obj2;
                                                try {
                                                    objMo11564g = AbstractC2503a0.m11097z(obj4, iMo11032w, listMo11662c, null, objMo11564g, abstractC2513f0);
                                                    c2526m = c2526m;
                                                    c2489m3 = c2489m2;
                                                } catch (C2535v.a unused4) {
                                                    abstractC2513f0 = abstractC2513f0;
                                                    obj2 = obj4;
                                                    c2489m3 = c2489m2;
                                                    interfaceC2499X3 = interfaceC2499X2;
                                                    if (abstractC2513f0.mo11178q(interfaceC2499X3)) {
                                                        if (objMo11564g == null) {
                                                            objMo11564g = abstractC2513f0.mo11168f(obj2);
                                                        }
                                                        if (!abstractC2513f0.m11174m(objMo11564g, interfaceC2499X3, 0)) {
                                                            objM10952o2 = objMo11564g;
                                                            while (i8 < c2489m3.f9455l) {
                                                                objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i8], objM10952o2, abstractC2513f0, obj);
                                                            }
                                                            if (objM10952o2 == null) {
                                                                return;
                                                            }
                                                            abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                            return;
                                                        }
                                                    } else if (!interfaceC2499X3.mo10998C()) {
                                                        objM10952o2 = objMo11564g;
                                                        while (i9 < c2489m3.f9455l) {
                                                            objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i9], objM10952o2, abstractC2513f0, obj);
                                                        }
                                                        if (objM10952o2 == null) {
                                                            return;
                                                        }
                                                        abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                        return;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    obj2 = obj4;
                                                    abstractC2513f0 = abstractC2513f0;
                                                    c2489m3 = c2489m2;
                                                    i7 = c2489m3.f9454k;
                                                    objM10952o = objMo11564g;
                                                    while (i7 < c2489m3.f9455l) {
                                                        objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                                                        i7++;
                                                        c2489m3 = this;
                                                    }
                                                    abstractC2513f1 = abstractC2513f0;
                                                    if (objM10952o != null) {
                                                        abstractC2513f1.mo11176o(obj2, objM10952o);
                                                    }
                                                    throw th;
                                                }
                                                c2526m2 = c2526m;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                abstractC2513f0 = abstractC2513f0;
                                                objMo11168f = objMo11564g;
                                                c2489m3 = c2489m2;
                                                objMo11564g = objMo11168f;
                                                i7 = c2489m3.f9454k;
                                                objM10952o = objMo11564g;
                                                while (i7 < c2489m3.f9455l) {
                                                    objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                                                    i7++;
                                                    c2489m3 = this;
                                                }
                                                abstractC2513f1 = abstractC2513f0;
                                                if (objM10952o != null) {
                                                    abstractC2513f1.mo11176o(obj2, objM10952o);
                                                }
                                                throw th;
                                            }
                                            break;
                                        } catch (C2535v.a unused5) {
                                            c2489m3 = c2489m2;
                                            interfaceC2499X3 = interfaceC2499X2;
                                            if (abstractC2513f0.mo11178q(interfaceC2499X3)) {
                                                if (objMo11564g == null) {
                                                    objMo11564g = abstractC2513f0.mo11168f(obj2);
                                                }
                                                if (!abstractC2513f0.m11174m(objMo11564g, interfaceC2499X3, 0)) {
                                                    objM10952o2 = objMo11564g;
                                                    while (i8 < c2489m3.f9455l) {
                                                        objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i8], objM10952o2, abstractC2513f0, obj);
                                                    }
                                                    if (objM10952o2 == null) {
                                                        return;
                                                    }
                                                    abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                    return;
                                                }
                                            } else if (!interfaceC2499X3.mo10998C()) {
                                                objM10952o2 = objMo11564g;
                                                while (i9 < c2489m3.f9455l) {
                                                    objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i9], objM10952o2, abstractC2513f0, obj);
                                                }
                                                if (objM10952o2 == null) {
                                                    return;
                                                }
                                                abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        abstractC2513f0 = abstractC2513f0;
                                    }
                                    break;
                                case 31:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo11014e(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11168f = objMo11564g;
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 32:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo11023n(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11168f = objMo11564g;
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 33:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo11011b(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11168f = objMo11564g;
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 34:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo11015f(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11168f = objMo11564g;
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 35:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo11001F(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11168f = objMo11564g;
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 36:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo10996A(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11168f = objMo11564g;
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 37:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo11022m(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11168f = objMo11564g;
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 38:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo11020k(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11168f = objMo11564g;
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 39:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo11024o(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11168f = objMo11564g;
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 40:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo11004I(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11168f = objMo11564g;
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 41:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo11027r(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11168f = objMo11564g;
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 42:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    interfaceC2499X2.mo11030u(c2489m2.f9457n.mo11662c(obj3, m10924R(iM10945k0)));
                                    objMo11168f = objMo11564g;
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 43:
                                    interfaceC2499X2 = interfaceC2499X3;
                                    obj2 = obj3;
                                    objMo11564g = objMo11168f;
                                    c2489m2 = c2489m3;
                                    try {
                                        interfaceC2499X2.mo11016g(c2489m2.f9457n.mo11662c(obj2, m10924R(iM10945k0)));
                                        objMo11168f = objMo11564g;
                                        c2489m3 = c2489m2;
                                        objMo11564g = objMo11168f;
                                    } catch (C2535v.a unused6) {
                                        c2489m3 = c2489m2;
                                        interfaceC2499X3 = interfaceC2499X2;
                                        if (abstractC2513f0.mo11178q(interfaceC2499X3)) {
                                            if (objMo11564g == null) {
                                                objMo11564g = abstractC2513f0.mo11168f(obj2);
                                            }
                                            if (!abstractC2513f0.m11174m(objMo11564g, interfaceC2499X3, 0)) {
                                                objM10952o2 = objMo11564g;
                                                while (i8 < c2489m3.f9455l) {
                                                    objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i8], objM10952o2, abstractC2513f0, obj);
                                                }
                                                if (objM10952o2 == null) {
                                                    return;
                                                }
                                                abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                return;
                                            }
                                        } else if (!interfaceC2499X3.mo10998C()) {
                                            objM10952o2 = objMo11564g;
                                            while (i9 < c2489m3.f9455l) {
                                                objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i9], objM10952o2, abstractC2513f0, obj);
                                            }
                                            if (objM10952o2 == null) {
                                                return;
                                            }
                                            abstractC2513f0.mo11176o(obj2, objM10952o2);
                                            return;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        abstractC2513f0 = abstractC2513f0;
                                        c2489m3 = c2489m2;
                                        i7 = c2489m3.f9454k;
                                        objM10952o = objMo11564g;
                                        while (i7 < c2489m3.f9455l) {
                                            objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                                            i7++;
                                            c2489m3 = this;
                                        }
                                        abstractC2513f1 = abstractC2513f0;
                                        if (objM10952o != null) {
                                            abstractC2513f1.mo11176o(obj2, objM10952o);
                                        }
                                        throw th;
                                    }
                                    c2526m2 = c2526m;
                                    break;
                                case 44:
                                    c2489m2 = c2489m3;
                                    obj4 = obj3;
                                    interfaceC2499X2 = interfaceC2499X3;
                                    try {
                                        List listMo11662c2 = c2489m2.f9457n.mo11662c(obj4, m10924R(iM10945k0));
                                        interfaceC2499X2.mo11025p(listMo11662c2);
                                        c2489m2.m10956q(iM10930X);
                                        objMo11564g = objMo11168f;
                                        try {
                                            objMo11564g = AbstractC2503a0.m11097z(obj4, iMo11032w, listMo11662c2, null, objMo11564g, abstractC2513f2);
                                            c2526m = c2526m;
                                            c2489m3 = c2489m2;
                                        } catch (C2535v.a unused7) {
                                            abstractC2513f0 = abstractC2513f0;
                                            obj2 = obj4;
                                            c2489m3 = c2489m2;
                                            interfaceC2499X3 = interfaceC2499X2;
                                            if (abstractC2513f0.mo11178q(interfaceC2499X3)) {
                                                if (objMo11564g == null) {
                                                    objMo11564g = abstractC2513f0.mo11168f(obj2);
                                                }
                                                if (!abstractC2513f0.m11174m(objMo11564g, interfaceC2499X3, 0)) {
                                                    objM10952o2 = objMo11564g;
                                                    while (i8 < c2489m3.f9455l) {
                                                        objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i8], objM10952o2, abstractC2513f0, obj);
                                                    }
                                                    if (objM10952o2 == null) {
                                                        return;
                                                    }
                                                    abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                    return;
                                                }
                                            } else if (!interfaceC2499X3.mo10998C()) {
                                                objM10952o2 = objMo11564g;
                                                while (i9 < c2489m3.f9455l) {
                                                    objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i9], objM10952o2, abstractC2513f0, obj);
                                                }
                                                if (objM10952o2 == null) {
                                                    return;
                                                }
                                                abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                return;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            obj2 = obj4;
                                            abstractC2513f0 = abstractC2513f0;
                                            c2489m3 = c2489m2;
                                            i7 = c2489m3.f9454k;
                                            objM10952o = objMo11564g;
                                            while (i7 < c2489m3.f9455l) {
                                                objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                                                i7++;
                                                c2489m3 = this;
                                            }
                                            abstractC2513f1 = abstractC2513f0;
                                            if (objM10952o != null) {
                                                abstractC2513f1.mo11176o(obj2, objM10952o);
                                            }
                                            throw th;
                                        }
                                    } catch (C2535v.a unused8) {
                                        objMo11564g = objMo11168f;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        obj2 = obj4;
                                        objMo11564g = objMo11168f;
                                    }
                                    c2526m2 = c2526m;
                                    break;
                                case 45:
                                    c2489m2 = c2489m3;
                                    obj5 = obj3;
                                    interfaceC2499X2 = interfaceC2499X3;
                                    interfaceC2499X2.mo11014e(c2489m2.f9457n.mo11662c(obj5, m10924R(iM10945k0)));
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 46:
                                    c2489m2 = c2489m3;
                                    obj5 = obj3;
                                    interfaceC2499X2 = interfaceC2499X3;
                                    interfaceC2499X2.mo11023n(c2489m2.f9457n.mo11662c(obj5, m10924R(iM10945k0)));
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 47:
                                    c2489m2 = c2489m3;
                                    obj5 = obj3;
                                    interfaceC2499X2 = interfaceC2499X3;
                                    interfaceC2499X2.mo11011b(c2489m2.f9457n.mo11662c(obj5, m10924R(iM10945k0)));
                                    c2489m3 = c2489m2;
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 48:
                                    c2489m2 = c2489m3;
                                    obj5 = obj3;
                                    interfaceC2499X2 = interfaceC2499X3;
                                    abstractC2513f0 = abstractC2513f2;
                                    try {
                                        interfaceC2499X2.mo11015f(c2489m2.f9457n.mo11662c(obj5, m10924R(iM10945k0)));
                                        c2489m3 = c2489m2;
                                        objMo11564g = objMo11168f;
                                    } catch (C2535v.a unused9) {
                                        obj2 = obj5;
                                        c2489m3 = c2489m2;
                                        objMo11564g = objMo11168f;
                                        interfaceC2499X3 = interfaceC2499X2;
                                        if (abstractC2513f0.mo11178q(interfaceC2499X3)) {
                                            if (objMo11564g == null) {
                                                objMo11564g = abstractC2513f0.mo11168f(obj2);
                                            }
                                            if (!abstractC2513f0.m11174m(objMo11564g, interfaceC2499X3, 0)) {
                                                objM10952o2 = objMo11564g;
                                                while (i8 < c2489m3.f9455l) {
                                                    objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i8], objM10952o2, abstractC2513f0, obj);
                                                }
                                                if (objM10952o2 == null) {
                                                    return;
                                                }
                                                abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                return;
                                            }
                                        } else if (!interfaceC2499X3.mo10998C()) {
                                            objM10952o2 = objMo11564g;
                                            while (i9 < c2489m3.f9455l) {
                                                objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i9], objM10952o2, abstractC2513f0, obj);
                                            }
                                            if (objM10952o2 == null) {
                                                return;
                                            }
                                            abstractC2513f0.mo11176o(obj2, objM10952o2);
                                            return;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        obj2 = obj5;
                                        c2489m3 = c2489m2;
                                        objMo11564g = objMo11168f;
                                        i7 = c2489m3.f9454k;
                                        objM10952o = objMo11564g;
                                        while (i7 < c2489m3.f9455l) {
                                            objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                                            i7++;
                                            c2489m3 = this;
                                        }
                                        abstractC2513f1 = abstractC2513f0;
                                        if (objM10952o != null) {
                                            abstractC2513f1.mo11176o(obj2, objM10952o);
                                        }
                                        throw th;
                                    }
                                    c2526m2 = c2526m;
                                    break;
                                case 49:
                                    abstractC2513f0 = abstractC2513f2;
                                    try {
                                        obj2 = obj;
                                        try {
                                            c2489m3.m10932Z(obj2, m10924R(iM10945k0), interfaceC2499X, c2489m3.m10958s(iM10930X), c2526m);
                                            c2489m2 = c2489m3;
                                            obj5 = obj2;
                                            interfaceC2499X2 = interfaceC2499X;
                                            c2489m3 = c2489m2;
                                            objMo11564g = objMo11168f;
                                        } catch (C2535v.a unused10) {
                                            c2526m = c2526m;
                                            interfaceC2499X3 = interfaceC2499X;
                                            objMo11564g = objMo11168f;
                                            if (abstractC2513f0.mo11178q(interfaceC2499X3)) {
                                                if (objMo11564g == null) {
                                                    objMo11564g = abstractC2513f0.mo11168f(obj2);
                                                }
                                                if (!abstractC2513f0.m11174m(objMo11564g, interfaceC2499X3, 0)) {
                                                    objM10952o2 = objMo11564g;
                                                    while (i8 < c2489m3.f9455l) {
                                                        objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i8], objM10952o2, abstractC2513f0, obj);
                                                    }
                                                    if (objM10952o2 == null) {
                                                        return;
                                                    }
                                                    abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                    return;
                                                }
                                            } else if (!interfaceC2499X3.mo10998C()) {
                                                objM10952o2 = objMo11564g;
                                                while (i9 < c2489m3.f9455l) {
                                                    objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i9], objM10952o2, abstractC2513f0, obj);
                                                }
                                                if (objM10952o2 == null) {
                                                    return;
                                                }
                                                abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                return;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            c2489m2 = c2489m3;
                                            c2489m3 = c2489m2;
                                            objMo11564g = objMo11168f;
                                            i7 = c2489m3.f9454k;
                                            objM10952o = objMo11564g;
                                            while (i7 < c2489m3.f9455l) {
                                                objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                                                i7++;
                                                c2489m3 = this;
                                            }
                                            abstractC2513f1 = abstractC2513f0;
                                            if (objM10952o != null) {
                                                abstractC2513f1.mo11176o(obj2, objM10952o);
                                            }
                                            throw th;
                                        }
                                        c2526m2 = c2526m;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        c2489m2 = c2489m3;
                                        obj5 = obj;
                                        obj2 = obj5;
                                        c2489m3 = c2489m2;
                                        objMo11564g = objMo11168f;
                                        i7 = c2489m3.f9454k;
                                        objM10952o = objMo11564g;
                                        while (i7 < c2489m3.f9455l) {
                                            objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                                            i7++;
                                            c2489m3 = this;
                                        }
                                        abstractC2513f1 = abstractC2513f0;
                                        if (objM10952o != null) {
                                            abstractC2513f1.mo11176o(obj2, objM10952o);
                                        }
                                        throw th;
                                    }
                                    break;
                                case 50:
                                    abstractC2513f0 = abstractC2513f2;
                                    try {
                                        try {
                                            c2489m3.m10914H(obj3, iM10930X, c2489m3.m10957r(iM10930X), c2526m, interfaceC2499X);
                                            c2526m = c2526m;
                                            objMo11564g = objMo11168f;
                                        } catch (C2535v.a unused11) {
                                            obj2 = obj;
                                            interfaceC2499X3 = interfaceC2499X;
                                            c2526m = c2526m;
                                            objMo11564g = objMo11168f;
                                            if (abstractC2513f0.mo11178q(interfaceC2499X3)) {
                                                if (objMo11564g == null) {
                                                    objMo11564g = abstractC2513f0.mo11168f(obj2);
                                                }
                                                if (!abstractC2513f0.m11174m(objMo11564g, interfaceC2499X3, 0)) {
                                                    objM10952o2 = objMo11564g;
                                                    while (i8 < c2489m3.f9455l) {
                                                        objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i8], objM10952o2, abstractC2513f0, obj);
                                                    }
                                                    if (objM10952o2 == null) {
                                                        return;
                                                    }
                                                    abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                    return;
                                                }
                                            } else if (!interfaceC2499X3.mo10998C()) {
                                                objM10952o2 = objMo11564g;
                                                while (i9 < c2489m3.f9455l) {
                                                    objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i9], objM10952o2, abstractC2513f0, obj);
                                                }
                                                if (objM10952o2 == null) {
                                                    return;
                                                }
                                                abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                return;
                                            }
                                        }
                                        c2526m2 = c2526m;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        obj2 = obj;
                                    }
                                    break;
                                case 51:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Double.valueOf(interfaceC2499X3.readDouble()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 52:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Float.valueOf(interfaceC2499X3.readFloat()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 53:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Long.valueOf(interfaceC2499X3.mo11002G()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 54:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Long.valueOf(interfaceC2499X3.mo11012c()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 55:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Integer.valueOf(interfaceC2499X3.mo10997B()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 56:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Long.valueOf(interfaceC2499X3.mo11013d()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 57:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Integer.valueOf(interfaceC2499X3.mo11017h()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 58:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Boolean.valueOf(interfaceC2499X3.mo11018i()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 59:
                                    c2489m3.m10934b0(obj3, iM10945k0, interfaceC2499X3);
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 60:
                                    InterfaceC2486J interfaceC2486J3 = (InterfaceC2486J) c2489m3.m10919M(obj3, iMo11032w, iM10930X);
                                    interfaceC2499X3.mo11005J(interfaceC2486J3, c2489m3.m10958s(iM10930X), c2526m);
                                    c2489m3.m10941i0(obj3, iMo11032w, iM10930X, interfaceC2486J3);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 61:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), interfaceC2499X3.mo11035z());
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 62:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Integer.valueOf(interfaceC2499X3.mo11021l()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 63:
                                    int iMo11026q2 = interfaceC2499X3.mo11026q();
                                    c2489m3.m10956q(iM10930X);
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Integer.valueOf(iMo11026q2));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 64:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Integer.valueOf(interfaceC2499X3.mo10999D()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 65:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Long.valueOf(interfaceC2499X3.mo11019j()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 66:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Integer.valueOf(interfaceC2499X3.mo11028s()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 67:
                                    AbstractC2519i0.m11414O(obj3, m10924R(iM10945k0), Long.valueOf(interfaceC2499X3.mo11029t()));
                                    c2489m3.m10938f0(obj3, iMo11032w, iM10930X);
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                case 68:
                                    abstractC2513f0 = abstractC2513f2;
                                    try {
                                        InterfaceC2486J interfaceC2486J4 = (InterfaceC2486J) c2489m3.m10919M(obj3, iMo11032w, iM10930X);
                                        interfaceC2499X3.mo11007L(interfaceC2486J4, c2489m3.m10958s(iM10930X), c2526m);
                                        c2489m3.m10941i0(obj3, iMo11032w, iM10930X, interfaceC2486J4);
                                        objMo11564g = objMo11168f;
                                    } catch (C2535v.a unused12) {
                                        obj2 = obj3;
                                        objMo11564g = objMo11168f;
                                        if (abstractC2513f0.mo11178q(interfaceC2499X3)) {
                                            if (objMo11564g == null) {
                                                objMo11564g = abstractC2513f0.mo11168f(obj2);
                                            }
                                            if (!abstractC2513f0.m11174m(objMo11564g, interfaceC2499X3, 0)) {
                                                objM10952o2 = objMo11564g;
                                                while (i8 < c2489m3.f9455l) {
                                                    objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i8], objM10952o2, abstractC2513f0, obj);
                                                }
                                                if (objM10952o2 == null) {
                                                    return;
                                                }
                                                abstractC2513f0.mo11176o(obj2, objM10952o2);
                                                return;
                                            }
                                        } else if (!interfaceC2499X3.mo10998C()) {
                                            objM10952o2 = objMo11564g;
                                            while (i9 < c2489m3.f9455l) {
                                                objM10952o2 = c2489m3.m10952o(obj2, c2489m3.f9453j[i9], objM10952o2, abstractC2513f0, obj);
                                            }
                                            if (objM10952o2 == null) {
                                                return;
                                            }
                                            abstractC2513f0.mo11176o(obj2, objM10952o2);
                                            return;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        obj2 = obj3;
                                        objMo11564g = objMo11168f;
                                        i7 = c2489m3.f9454k;
                                        objM10952o = objMo11564g;
                                        while (i7 < c2489m3.f9455l) {
                                            objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                                            i7++;
                                            c2489m3 = this;
                                        }
                                        abstractC2513f1 = abstractC2513f0;
                                        if (objM10952o != null) {
                                            abstractC2513f1.mo11176o(obj2, objM10952o);
                                        }
                                        throw th;
                                    }
                                    c2526m2 = c2526m;
                                    break;
                                default:
                                    if (objMo11168f == null) {
                                        objMo11168f = abstractC2513f2.mo11168f(obj3);
                                    }
                                    if (!abstractC2513f2.m11174m(objMo11168f, interfaceC2499X3, 0)) {
                                        Object objM10952o3 = objMo11168f;
                                        for (int i10 = c2489m3.f9454k; i10 < c2489m3.f9455l; i10++) {
                                            objM10952o3 = c2489m3.m10952o(obj3, c2489m3.f9453j[i10], objM10952o3, abstractC2513f2, obj);
                                        }
                                        if (objM10952o3 != null) {
                                            abstractC2513f2.mo11176o(obj3, objM10952o3);
                                            return;
                                        }
                                        return;
                                    }
                                    objMo11564g = objMo11168f;
                                    c2526m2 = c2526m;
                                    break;
                                    break;
                            }
                        } catch (C2535v.a unused13) {
                            abstractC2513f0 = abstractC2513f2;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        abstractC2513f0 = abstractC2513f2;
                        obj2 = obj3;
                        objMo11564g = objMo11168f;
                        i7 = c2489m3.f9454k;
                        objM10952o = objMo11564g;
                        while (i7 < c2489m3.f9455l) {
                            objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                            i7++;
                            c2489m3 = this;
                        }
                        abstractC2513f1 = abstractC2513f0;
                        if (objM10952o != null) {
                            abstractC2513f1.mo11176o(obj2, objM10952o);
                        }
                        throw th;
                    }
                } else {
                    if (iMo11032w == Integer.MAX_VALUE) {
                        int i11 = c2489m3.f9454k;
                        Object objM10952o4 = objMo11564g;
                        while (i11 < c2489m3.f9455l) {
                            objM10952o4 = c2489m3.m10952o(obj, c2489m3.f9453j[i11], objM10952o4, abstractC2513f0, obj);
                            i11++;
                            c2489m3 = c2489m3;
                        }
                        if (objM10952o4 != null) {
                            abstractC2513f0.mo11176o(obj, objM10952o4);
                        }
                        return;
                    }
                    c2489m = c2489m3;
                    try {
                        if (c2489m.f9449f) {
                            abstractC2527n2 = abstractC2527n;
                            objMo11559b = abstractC2527n2.mo11559b(c2526m2, c2489m.f9448e, iMo11032w);
                        } else {
                            abstractC2527n2 = abstractC2527n;
                            objMo11559b = null;
                        }
                        if (objMo11559b != null) {
                            if (c2530qMo11561d == null) {
                                try {
                                    c2530qMo11561d = abstractC2527n.mo11561d(obj);
                                } catch (Throwable th16) {
                                    th = th16;
                                    obj2 = obj;
                                    abstractC2513f0 = abstractC2513f0;
                                    c2489m3 = c2489m;
                                }
                            }
                            Object obj6 = objMo11564g;
                            C2530q c2530q = c2530qMo11561d;
                            try {
                                c2530qMo11561d = c2530q;
                                objMo11564g = abstractC2527n2.mo11564g(obj, interfaceC2499X, objMo11559b, c2526m2, c2530q, obj6, abstractC2513f0);
                                c2526m2 = c2526m2;
                                c2489m3 = c2489m;
                            } catch (Throwable th17) {
                                th = th17;
                                obj2 = obj;
                                objMo11168f = obj6;
                                abstractC2513f3 = abstractC2513f0;
                                abstractC2513f0 = abstractC2513f3;
                                c2489m3 = c2489m;
                                objMo11564g = objMo11168f;
                                i7 = c2489m3.f9454k;
                                objM10952o = objMo11564g;
                                while (i7 < c2489m3.f9455l) {
                                    objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                                    i7++;
                                    c2489m3 = this;
                                }
                                abstractC2513f1 = abstractC2513f0;
                                if (objM10952o != null) {
                                    abstractC2513f1.mo11176o(obj2, objM10952o);
                                }
                                throw th;
                            }
                        } else {
                            obj2 = obj;
                            objMo11168f = objMo11564g;
                            abstractC2513f3 = abstractC2513f0;
                            C2526m c2526m3 = c2526m2;
                            try {
                                if (abstractC2513f3.mo11178q(interfaceC2499X)) {
                                    try {
                                        if (!interfaceC2499X.mo10998C()) {
                                        }
                                        c2526m2 = c2526m3;
                                        c2489m3 = c2489m;
                                        objMo11564g = objMo11168f;
                                    } catch (Throwable th18) {
                                        th = th18;
                                        abstractC2513f0 = abstractC2513f3;
                                        c2489m3 = c2489m;
                                        objMo11564g = objMo11168f;
                                        i7 = c2489m3.f9454k;
                                        objM10952o = objMo11564g;
                                        while (i7 < c2489m3.f9455l) {
                                            objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                                            i7++;
                                            c2489m3 = this;
                                        }
                                        abstractC2513f1 = abstractC2513f0;
                                        if (objM10952o != null) {
                                            abstractC2513f1.mo11176o(obj2, objM10952o);
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (objMo11168f == null) {
                                        objMo11168f = abstractC2513f3.mo11168f(obj2);
                                    }
                                    if (!abstractC2513f3.m11174m(objMo11168f, interfaceC2499X, 0)) {
                                    }
                                    c2526m2 = c2526m3;
                                    c2489m3 = c2489m;
                                    objMo11564g = objMo11168f;
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                c2489m3 = c2489m;
                                abstractC2513f0 = abstractC2513f3;
                            }
                        }
                    } catch (Throwable th20) {
                        th = th20;
                        obj3 = obj;
                        objMo11168f = objMo11564g;
                        abstractC2513f2 = abstractC2513f0;
                        c2489m3 = c2489m;
                        abstractC2513f0 = abstractC2513f2;
                        obj2 = obj3;
                    }
                }
                objMo11564g = objMo11168f;
            } catch (Throwable th21) {
                th = th21;
                abstractC2513f0 = abstractC2513f0;
                obj2 = obj;
            }
            i7 = c2489m3.f9454k;
            objM10952o = objMo11564g;
            while (i7 < c2489m3.f9455l) {
                objM10952o = c2489m3.m10952o(obj2, c2489m3.f9453j[i7], objM10952o, abstractC2513f0, obj);
                i7++;
                c2489m3 = this;
            }
            abstractC2513f1 = abstractC2513f0;
            if (objM10952o != null) {
                abstractC2513f1.mo11176o(obj2, objM10952o);
            }
            throw th;
        }
        Object objM10952o5 = objMo11168f;
        for (int i12 = c2489m.f9454k; i12 < c2489m.f9455l; i12++) {
            objM10952o5 = c2489m.m10952o(obj2, c2489m.f9453j[i12], objM10952o5, abstractC2513f3, obj);
        }
        if (objM10952o5 != null) {
            abstractC2513f3.mo11176o(obj2, objM10952o5);
        }
    }

    /* JADX INFO: renamed from: H */
    private final void m10914H(Object obj, int i7, Object obj2, C2526m c2526m, InterfaceC2499X interfaceC2499X) {
        long jM10924R = m10924R(m10945k0(i7));
        Object objM11442z = AbstractC2519i0.m11442z(obj, jM10924R);
        if (objM11442z == null) {
            objM11442z = this.f9460q.mo10884e(obj2);
            AbstractC2519i0.m11414O(obj, jM10924R, objM11442z);
        } else if (this.f9460q.mo10886g(objM11442z)) {
            Object objMo10884e = this.f9460q.mo10884e(obj2);
            this.f9460q.mo10880a(objMo10884e, objM11442z);
            AbstractC2519i0.m11414O(obj, jM10924R, objMo10884e);
            objM11442z = objMo10884e;
        }
        interfaceC2499X.mo11006K(this.f9460q.mo10883d(objM11442z), this.f9460q.mo10882c(obj2), c2526m);
    }

    /* JADX INFO: renamed from: I */
    private void m10915I(Object obj, Object obj2, int i7) {
        if (m10962w(obj2, i7)) {
            long jM10924R = m10924R(m10945k0(i7));
            Unsafe unsafe = f9443s;
            Object object = unsafe.getObject(obj2, jM10924R);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m10923Q(i7) + " is present but null: " + obj2);
            }
            InterfaceC2500Y interfaceC2500YM10958s = m10958s(i7);
            if (!m10962w(obj, i7)) {
                if (m10908B(object)) {
                    Object objMo10971f = interfaceC2500YM10958s.mo10971f();
                    interfaceC2500YM10958s.mo10966a(objMo10971f, object);
                    unsafe.putObject(obj, jM10924R, objMo10971f);
                } else {
                    unsafe.putObject(obj, jM10924R, object);
                }
                m10937e0(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM10924R);
            if (!m10908B(object2)) {
                Object objMo10971f2 = interfaceC2500YM10958s.mo10971f();
                interfaceC2500YM10958s.mo10966a(objMo10971f2, object2);
                unsafe.putObject(obj, jM10924R, objMo10971f2);
                object2 = objMo10971f2;
            }
            interfaceC2500YM10958s.mo10966a(object2, object);
        }
    }

    /* JADX INFO: renamed from: J */
    private void m10916J(Object obj, Object obj2, int i7) {
        int iM10923Q = m10923Q(i7);
        if (m10910D(obj2, iM10923Q, i7)) {
            long jM10924R = m10924R(m10945k0(i7));
            Unsafe unsafe = f9443s;
            Object object = unsafe.getObject(obj2, jM10924R);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m10923Q(i7) + " is present but null: " + obj2);
            }
            InterfaceC2500Y interfaceC2500YM10958s = m10958s(i7);
            if (!m10910D(obj, iM10923Q, i7)) {
                if (m10908B(object)) {
                    Object objMo10971f = interfaceC2500YM10958s.mo10971f();
                    interfaceC2500YM10958s.mo10966a(objMo10971f, object);
                    unsafe.putObject(obj, jM10924R, objMo10971f);
                } else {
                    unsafe.putObject(obj, jM10924R, object);
                }
                m10938f0(obj, iM10923Q, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM10924R);
            if (!m10908B(object2)) {
                Object objMo10971f2 = interfaceC2500YM10958s.mo10971f();
                interfaceC2500YM10958s.mo10966a(objMo10971f2, object2);
                unsafe.putObject(obj, jM10924R, objMo10971f2);
                object2 = objMo10971f2;
            }
            interfaceC2500YM10958s.mo10966a(object2, object);
        }
    }

    /* JADX INFO: renamed from: K */
    private void m10917K(Object obj, Object obj2, int i7) {
        int iM10945k0 = m10945k0(i7);
        long jM10924R = m10924R(iM10945k0);
        int iM10923Q = m10923Q(i7);
        switch (m10943j0(iM10945k0)) {
            case 0:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11410K(obj, jM10924R, AbstractC2519i0.m11437u(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 1:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11411L(obj, jM10924R, AbstractC2519i0.m11438v(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 2:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11413N(obj, jM10924R, AbstractC2519i0.m11440x(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 3:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11413N(obj, jM10924R, AbstractC2519i0.m11440x(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 4:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11412M(obj, jM10924R, AbstractC2519i0.m11439w(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 5:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11413N(obj, jM10924R, AbstractC2519i0.m11440x(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 6:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11412M(obj, jM10924R, AbstractC2519i0.m11439w(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 7:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11404E(obj, jM10924R, AbstractC2519i0.m11432p(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 8:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11414O(obj, jM10924R, AbstractC2519i0.m11442z(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 9:
                m10915I(obj, obj2, i7);
                break;
            case 10:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11414O(obj, jM10924R, AbstractC2519i0.m11442z(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 11:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11412M(obj, jM10924R, AbstractC2519i0.m11439w(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 12:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11412M(obj, jM10924R, AbstractC2519i0.m11439w(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 13:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11412M(obj, jM10924R, AbstractC2519i0.m11439w(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 14:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11413N(obj, jM10924R, AbstractC2519i0.m11440x(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 15:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11412M(obj, jM10924R, AbstractC2519i0.m11439w(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 16:
                if (m10962w(obj2, i7)) {
                    AbstractC2519i0.m11413N(obj, jM10924R, AbstractC2519i0.m11440x(obj2, jM10924R));
                    m10937e0(obj, i7);
                }
                break;
            case 17:
                m10915I(obj, obj2, i7);
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
                this.f9457n.mo11660a(obj, obj2, jM10924R);
                break;
            case 50:
                AbstractC2503a0.m11047E(this.f9460q, obj, obj2, jM10924R);
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
                if (m10910D(obj2, iM10923Q, i7)) {
                    AbstractC2519i0.m11414O(obj, jM10924R, AbstractC2519i0.m11442z(obj2, jM10924R));
                    m10938f0(obj, iM10923Q, i7);
                }
                break;
            case 60:
                m10916J(obj, obj2, i7);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m10910D(obj2, iM10923Q, i7)) {
                    AbstractC2519i0.m11414O(obj, jM10924R, AbstractC2519i0.m11442z(obj2, jM10924R));
                    m10938f0(obj, iM10923Q, i7);
                }
                break;
            case 68:
                m10916J(obj, obj2, i7);
                break;
        }
    }

    /* JADX INFO: renamed from: L */
    private Object m10918L(Object obj, int i7) {
        InterfaceC2500Y interfaceC2500YM10958s = m10958s(i7);
        long jM10924R = m10924R(m10945k0(i7));
        if (!m10962w(obj, i7)) {
            return interfaceC2500YM10958s.mo10971f();
        }
        Object object = f9443s.getObject(obj, jM10924R);
        if (m10908B(object)) {
            return object;
        }
        Object objMo10971f = interfaceC2500YM10958s.mo10971f();
        if (object != null) {
            interfaceC2500YM10958s.mo10966a(objMo10971f, object);
        }
        return objMo10971f;
    }

    /* JADX INFO: renamed from: M */
    private Object m10919M(Object obj, int i7, int i8) {
        InterfaceC2500Y interfaceC2500YM10958s = m10958s(i8);
        if (!m10910D(obj, i7, i8)) {
            return interfaceC2500YM10958s.mo10971f();
        }
        Object object = f9443s.getObject(obj, m10924R(m10945k0(i8)));
        if (m10908B(object)) {
            return object;
        }
        Object objMo10971f = interfaceC2500YM10958s.mo10971f();
        if (object != null) {
            interfaceC2500YM10958s.mo10966a(objMo10971f, object);
        }
        return objMo10971f;
    }

    /* JADX INFO: renamed from: N */
    static C2489M m10920N(Class cls, InterfaceC2484H interfaceC2484H, InterfaceC2491O interfaceC2491O, InterfaceC2538y interfaceC2538y, AbstractC2513f0 abstractC2513f0, AbstractC2527n abstractC2527n, InterfaceC2481E interfaceC2481E) {
        if (interfaceC2484H instanceof C2498W) {
            return m10922P((C2498W) interfaceC2484H, interfaceC2491O, interfaceC2538y, abstractC2513f0, abstractC2527n, interfaceC2481E);
        }
        AbstractC2263x.m9328a(interfaceC2484H);
        return m10921O(null, interfaceC2491O, interfaceC2538y, abstractC2513f0, abstractC2527n, interfaceC2481E);
    }

    /* JADX INFO: renamed from: O */
    static C2489M m10921O(AbstractC2507c0 abstractC2507c0, InterfaceC2491O interfaceC2491O, InterfaceC2538y interfaceC2538y, AbstractC2513f0 abstractC2513f0, AbstractC2527n abstractC2527n, InterfaceC2481E interfaceC2481E) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    /* JADX INFO: renamed from: P */
    static C2489M m10922P(C2498W c2498w, InterfaceC2491O interfaceC2491O, InterfaceC2538y interfaceC2538y, AbstractC2513f0 abstractC2513f0, AbstractC2527n abstractC2527n, InterfaceC2481E interfaceC2481E) {
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
        Field fieldM10936d0;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldM10936d1;
        int i32;
        Object obj2;
        Field fieldM10936d2;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        String strM10995e = c2498w.m10995e();
        int length = strM10995e.length();
        char c7 = 55296;
        if (strM10995e.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i7 = i37 + 1;
                if (strM10995e.charAt(i37) < 55296) {
                    break;
                }
                i37 = i7;
            }
        } else {
            i7 = 1;
        }
        int i38 = i7 + 1;
        int iCharAt2 = strM10995e.charAt(i7);
        if (iCharAt2 >= 55296) {
            int i39 = iCharAt2 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                cCharAt13 = strM10995e.charAt(i38);
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
            iArr = f9442r;
            i11 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt3 = strM10995e.charAt(i38);
            if (iCharAt3 >= 55296) {
                int i42 = iCharAt3 & 8191;
                int i43 = 13;
                while (true) {
                    i21 = i41 + 1;
                    cCharAt8 = strM10995e.charAt(i41);
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
            int iCharAt4 = strM10995e.charAt(i41);
            if (iCharAt4 >= 55296) {
                int i45 = iCharAt4 & 8191;
                int i46 = 13;
                while (true) {
                    i20 = i44 + 1;
                    cCharAt7 = strM10995e.charAt(i44);
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
            int iCharAt5 = strM10995e.charAt(i44);
            if (iCharAt5 >= 55296) {
                int i48 = iCharAt5 & 8191;
                int i49 = 13;
                while (true) {
                    i19 = i47 + 1;
                    cCharAt6 = strM10995e.charAt(i47);
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
            int iCharAt6 = strM10995e.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i18 = i50 + 1;
                    cCharAt5 = strM10995e.charAt(i50);
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
            iCharAt = strM10995e.charAt(i50);
            if (iCharAt >= 55296) {
                int i54 = iCharAt & 8191;
                int i55 = 13;
                while (true) {
                    i17 = i53 + 1;
                    cCharAt4 = strM10995e.charAt(i53);
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
            int iCharAt7 = strM10995e.charAt(i53);
            if (iCharAt7 >= 55296) {
                int i57 = iCharAt7 & 8191;
                int i58 = 13;
                while (true) {
                    i16 = i56 + 1;
                    cCharAt3 = strM10995e.charAt(i56);
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
            int iCharAt8 = strM10995e.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i60 = iCharAt8 & 8191;
                int i61 = 13;
                while (true) {
                    i15 = i59 + 1;
                    cCharAt2 = strM10995e.charAt(i59);
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
            int iCharAt9 = strM10995e.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = 13;
                while (true) {
                    i14 = i62 + 1;
                    cCharAt = strM10995e.charAt(i62);
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
        Unsafe unsafe = f9443s;
        Object[] objArrM10994d = c2498w.m10994d();
        Class<?> cls = c2498w.mo10894b().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i66 = i12 + i10;
        int i67 = i66;
        int i68 = i12;
        int i69 = 0;
        int i70 = 0;
        while (i38 < length) {
            int i71 = i38 + 1;
            int iCharAt10 = strM10995e.charAt(i38);
            if (iCharAt10 >= c7) {
                int i72 = iCharAt10 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i35 = i73 + 1;
                    cCharAt12 = strM10995e.charAt(i73);
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
            int iCharAt11 = strM10995e.charAt(i22);
            if (iCharAt11 >= c7) {
                int i76 = iCharAt11 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i34 = i77 + 1;
                    cCharAt11 = strM10995e.charAt(i77);
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
                int iCharAt12 = strM10995e.charAt(i23);
                char c8 = 55296;
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = 13;
                    while (true) {
                        i33 = i81 + 1;
                        cCharAt10 = strM10995e.charAt(i81);
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
                    objArr[((i70 / 3) * 2) + 1] = objArrM10994d[i8];
                } else {
                    if (i84 == 12 && (c2498w.mo10895c().equals(EnumC2495T.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i30 = i8 + 1;
                        objArr[((i70 / 3) * 2) + 1] = objArrM10994d[i8];
                    }
                    i31 = iCharAt12 * 2;
                    obj = objArrM10994d[i31];
                    if (obj instanceof Field) {
                        fieldM10936d1 = (Field) obj;
                    } else {
                        fieldM10936d1 = m10936d0(cls, (String) obj);
                        objArrM10994d[i31] = fieldM10936d1;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM10936d1);
                    i32 = i31 + 1;
                    obj2 = objArrM10994d[i32];
                    if (obj2 instanceof Field) {
                        fieldM10936d2 = (Field) obj2;
                    } else {
                        fieldM10936d2 = m10936d0(cls, (String) obj2);
                        objArrM10994d[i32] = fieldM10936d2;
                    }
                    strM10995e = strM10995e;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM10936d2);
                    i28 = iObjectFieldOffset4;
                    i27 = 0;
                    i24 = iCharAt10;
                    i38 = i85;
                }
                i8 = i30;
                i31 = iCharAt12 * 2;
                obj = objArrM10994d[i31];
                if (obj instanceof Field) {
                    fieldM10936d1 = (Field) obj;
                } else {
                    fieldM10936d1 = m10936d0(cls, (String) obj);
                    objArrM10994d[i31] = fieldM10936d1;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldM10936d1);
                i32 = i31 + 1;
                obj2 = objArrM10994d[i32];
                if (obj2 instanceof Field) {
                    fieldM10936d2 = (Field) obj2;
                } else {
                    fieldM10936d2 = m10936d0(cls, (String) obj2);
                    objArrM10994d[i32] = fieldM10936d2;
                }
                strM10995e = strM10995e;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM10936d2);
                i28 = iObjectFieldOffset5;
                i27 = 0;
                i24 = iCharAt10;
                i38 = i85;
            } else {
                int i86 = i8 + 1;
                Field fieldM10936d3 = m10936d0(cls, (String) objArrM10994d[i8]);
                if (i79 == 9 || i79 == 17) {
                    i24 = iCharAt10;
                    objArr[((i70 / 3) * 2) + 1] = fieldM10936d3.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i24 = iCharAt10;
                        i29 = i8 + 2;
                        objArr[((i70 / 3) * 2) + 1] = objArrM10994d[i86];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        i24 = iCharAt10;
                        if (c2498w.mo10895c() == EnumC2495T.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i29 = i8 + 2;
                            objArr[((i70 / 3) * 2) + 1] = objArrM10994d[i86];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10936d3);
                        if ((iCharAt11 & 4096) != 0 || i79 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i26 = i23;
                            i27 = 0;
                        } else {
                            int i87 = i23 + 1;
                            int iCharAt13 = strM10995e.charAt(i23);
                            if (iCharAt13 >= 55296) {
                                int i88 = iCharAt13 & 8191;
                                int i89 = 13;
                                while (true) {
                                    i26 = i87 + 1;
                                    cCharAt9 = strM10995e.charAt(i87);
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
                            Object obj3 = objArrM10994d[i90];
                            if (obj3 instanceof Field) {
                                fieldM10936d0 = (Field) obj3;
                            } else {
                                fieldM10936d0 = m10936d0(cls, (String) obj3);
                                objArrM10994d[i90] = fieldM10936d0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM10936d0);
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
                            objArr[i93] = objArrM10994d[i86];
                            if ((iCharAt11 & 2048) != 0) {
                                i25 = i8 + 3;
                                objArr[i93 + 1] = objArrM10994d[i94];
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10936d3);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10936d3);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM10936d3);
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
            strM10995e = strM10995e;
            c7 = 55296;
        }
        return new C2489M(iArr3, objArr, i9, i13, c2498w.mo10894b(), c2498w.mo10895c(), false, iArr, i12, i66, interfaceC2491O, interfaceC2538y, abstractC2513f0, abstractC2527n, interfaceC2481E);
    }

    /* JADX INFO: renamed from: Q */
    private int m10923Q(int i7) {
        return this.f9444a[i7];
    }

    /* JADX INFO: renamed from: R */
    private static long m10924R(int i7) {
        return i7 & 1048575;
    }

    /* JADX INFO: renamed from: S */
    private static boolean m10925S(Object obj, long j7) {
        return ((Boolean) AbstractC2519i0.m11442z(obj, j7)).booleanValue();
    }

    /* JADX INFO: renamed from: T */
    private static double m10926T(Object obj, long j7) {
        return ((Double) AbstractC2519i0.m11442z(obj, j7)).doubleValue();
    }

    /* JADX INFO: renamed from: U */
    private static float m10927U(Object obj, long j7) {
        return ((Float) AbstractC2519i0.m11442z(obj, j7)).floatValue();
    }

    /* JADX INFO: renamed from: V */
    private static int m10928V(Object obj, long j7) {
        return ((Integer) AbstractC2519i0.m11442z(obj, j7)).intValue();
    }

    /* JADX INFO: renamed from: W */
    private static long m10929W(Object obj, long j7) {
        return ((Long) AbstractC2519i0.m11442z(obj, j7)).longValue();
    }

    /* JADX INFO: renamed from: X */
    private int m10930X(int i7) {
        if (i7 < this.f9446c || i7 > this.f9447d) {
            return -1;
        }
        return m10939g0(i7, 0);
    }

    /* JADX INFO: renamed from: Y */
    private int m10931Y(int i7) {
        return this.f9444a[i7 + 2];
    }

    /* JADX INFO: renamed from: Z */
    private void m10932Z(Object obj, long j7, InterfaceC2499X interfaceC2499X, InterfaceC2500Y interfaceC2500Y, C2526m c2526m) {
        interfaceC2499X.mo11008M(this.f9457n.mo11662c(obj, j7), interfaceC2500Y, c2526m);
    }

    /* JADX INFO: renamed from: a0 */
    private void m10933a0(Object obj, int i7, InterfaceC2499X interfaceC2499X, InterfaceC2500Y interfaceC2500Y, C2526m c2526m) {
        interfaceC2499X.mo11009N(this.f9457n.mo11662c(obj, m10924R(i7)), interfaceC2500Y, c2526m);
    }

    /* JADX INFO: renamed from: b0 */
    private void m10934b0(Object obj, int i7, InterfaceC2499X interfaceC2499X) {
        if (m10961v(i7)) {
            AbstractC2519i0.m11414O(obj, m10924R(i7), interfaceC2499X.mo11003H());
        } else if (this.f9450g) {
            AbstractC2519i0.m11414O(obj, m10924R(i7), interfaceC2499X.mo11031v());
        } else {
            AbstractC2519i0.m11414O(obj, m10924R(i7), interfaceC2499X.mo11035z());
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m10935c0(Object obj, int i7, InterfaceC2499X interfaceC2499X) {
        if (m10961v(i7)) {
            interfaceC2499X.mo11034y(this.f9457n.mo11662c(obj, m10924R(i7)));
        } else {
            interfaceC2499X.mo11033x(this.f9457n.mo11662c(obj, m10924R(i7)));
        }
    }

    /* JADX INFO: renamed from: d0 */
    private static Field m10936d0(Class cls, String str) {
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

    /* JADX INFO: renamed from: e0 */
    private void m10937e0(Object obj, int i7) {
        int iM10931Y = m10931Y(i7);
        long j7 = 1048575 & iM10931Y;
        if (j7 == 1048575) {
            return;
        }
        AbstractC2519i0.m11412M(obj, j7, (1 << (iM10931Y >>> 20)) | AbstractC2519i0.m11439w(obj, j7));
    }

    /* JADX INFO: renamed from: f0 */
    private void m10938f0(Object obj, int i7, int i8) {
        AbstractC2519i0.m11412M(obj, m10931Y(i8) & 1048575, i7);
    }

    /* JADX INFO: renamed from: g0 */
    private int m10939g0(int i7, int i8) {
        int length = (this.f9444a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int iM10923Q = m10923Q(i10);
            if (i7 == iM10923Q) {
                return i10;
            }
            if (i7 < iM10923Q) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: h0 */
    private void m10940h0(Object obj, int i7, Object obj2) {
        f9443s.putObject(obj, m10924R(m10945k0(i7)), obj2);
        m10937e0(obj, i7);
    }

    /* JADX INFO: renamed from: i0 */
    private void m10941i0(Object obj, int i7, int i8, Object obj2) {
        f9443s.putObject(obj, m10924R(m10945k0(i8)), obj2);
        m10938f0(obj, i7, i8);
    }

    /* JADX INFO: renamed from: j */
    private boolean m10942j(Object obj, Object obj2, int i7) {
        return m10962w(obj, i7) == m10962w(obj2, i7);
    }

    /* JADX INFO: renamed from: j0 */
    private static int m10943j0(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m10944k(Object obj, long j7) {
        return AbstractC2519i0.m11432p(obj, j7);
    }

    /* JADX INFO: renamed from: k0 */
    private int m10945k0(int i7) {
        return this.f9444a[i7 + 1];
    }

    /* JADX INFO: renamed from: l */
    private static void m10946l(Object obj) {
        if (m10908B(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX INFO: renamed from: l0 */
    private void m10947l0(Object obj, InterfaceC2525l0 interfaceC2525l0) {
        Map.Entry entry;
        Iterator it;
        boolean z7;
        int i7;
        int i8;
        int i9;
        boolean z8;
        C2489M c2489m = this;
        if (c2489m.f9449f) {
            C2530q c2530qMo11560c = c2489m.f9459p.mo11560c(obj);
            if (c2530qMo11560c.m11587j()) {
                entry = null;
                it = null;
            } else {
                Iterator itM11589n = c2530qMo11560c.m11589n();
                entry = (Map.Entry) itM11589n.next();
                it = itM11589n;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = c2489m.f9444a.length;
        Unsafe unsafe = f9443s;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int iM10945k0 = c2489m.m10945k0(i11);
            int iM10923Q = c2489m.m10923Q(i11);
            int iM10943j0 = m10943j0(iM10945k0);
            if (iM10943j0 <= 17) {
                int i13 = c2489m.f9444a[i11 + 2];
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
            while (entry != null && c2489m.f9459p.mo11558a(entry) <= iM10923Q) {
                c2489m.f9459p.mo11567j(interfaceC2525l0, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jM10924R = m10924R(iM10945k0);
            switch (iM10943j0) {
                case 0:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11499e(iM10923Q, m10948m(obj, jM10924R));
                    }
                    break;
                case 1:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11480A(iM10923Q, m10954p(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 2:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11510n(iM10923Q, unsafe.getLong(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 3:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11508l(iM10923Q, unsafe.getLong(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 4:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11514r(iM10923Q, unsafe.getInt(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 5:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11503h(iM10923Q, unsafe.getLong(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 6:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11498d(iM10923Q, unsafe.getInt(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 7:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11511o(iM10923Q, m10944k(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 8:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        c2489m.m10953o0(iM10923Q, unsafe.getObject(obj, jM10924R), interfaceC2525l0);
                    }
                    break;
                case 9:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11492M(iM10923Q, unsafe.getObject(obj, jM10924R), c2489m.m10958s(i11));
                    }
                    break;
                case 10:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11491L(iM10923Q, (AbstractC2512f) unsafe.getObject(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 11:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11496b(iM10923Q, unsafe.getInt(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 12:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11483D(iM10923Q, unsafe.getInt(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 13:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11512p(iM10923Q, unsafe.getInt(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 14:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11517u(iM10923Q, unsafe.getLong(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 15:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11487H(iM10923Q, unsafe.getInt(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 16:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11522z(iM10923Q, unsafe.getLong(obj, jM10924R));
                    }
                    c2489m = this;
                    break;
                case 17:
                    if (c2489m.m10963x(obj, i11, i7, i8, i9)) {
                        interfaceC2525l0.mo11494O(iM10923Q, unsafe.getObject(obj, jM10924R), c2489m.m10958s(i11));
                    }
                    break;
                case 18:
                    AbstractC2503a0.m11056N(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 19:
                    AbstractC2503a0.m11060R(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 20:
                    AbstractC2503a0.m11063U(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    AbstractC2503a0.m11074c0(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 22:
                    AbstractC2503a0.m11062T(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 23:
                    AbstractC2503a0.m11059Q(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 24:
                    AbstractC2503a0.m11058P(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 25:
                    AbstractC2503a0.m11054L(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 26:
                    AbstractC2503a0.m11070a0(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0);
                    break;
                case 27:
                    AbstractC2503a0.m11064V(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, c2489m.m10958s(i11));
                    break;
                case 28:
                    AbstractC2503a0.m11055M(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0);
                    break;
                case 29:
                    z8 = false;
                    AbstractC2503a0.m11072b0(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 30:
                    z8 = false;
                    AbstractC2503a0.m11057O(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 31:
                    z8 = false;
                    AbstractC2503a0.m11065W(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 32:
                    z8 = false;
                    AbstractC2503a0.m11066X(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 33:
                    z8 = false;
                    AbstractC2503a0.m11067Y(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 34:
                    z8 = false;
                    AbstractC2503a0.m11068Z(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, false);
                    break;
                case 35:
                    AbstractC2503a0.m11056N(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 36:
                    AbstractC2503a0.m11060R(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 37:
                    AbstractC2503a0.m11063U(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 38:
                    AbstractC2503a0.m11074c0(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 39:
                    AbstractC2503a0.m11062T(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 40:
                    AbstractC2503a0.m11059Q(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 41:
                    AbstractC2503a0.m11058P(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 42:
                    AbstractC2503a0.m11054L(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 43:
                    AbstractC2503a0.m11072b0(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 44:
                    AbstractC2503a0.m11057O(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 45:
                    AbstractC2503a0.m11065W(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 46:
                    AbstractC2503a0.m11066X(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 47:
                    AbstractC2503a0.m11067Y(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 48:
                    AbstractC2503a0.m11068Z(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, z7);
                    break;
                case 49:
                    AbstractC2503a0.m11061S(c2489m.m10923Q(i11), (List) unsafe.getObject(obj, jM10924R), interfaceC2525l0, c2489m.m10958s(i11));
                    break;
                case 50:
                    c2489m.m10951n0(interfaceC2525l0, iM10923Q, unsafe.getObject(obj, jM10924R), i11);
                    break;
                case 51:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11499e(iM10923Q, m10926T(obj, jM10924R));
                    }
                    break;
                case 52:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11480A(iM10923Q, m10927U(obj, jM10924R));
                    }
                    break;
                case 53:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11510n(iM10923Q, m10929W(obj, jM10924R));
                    }
                    break;
                case 54:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11508l(iM10923Q, m10929W(obj, jM10924R));
                    }
                    break;
                case 55:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11514r(iM10923Q, m10928V(obj, jM10924R));
                    }
                    break;
                case 56:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11503h(iM10923Q, m10929W(obj, jM10924R));
                    }
                    break;
                case 57:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11498d(iM10923Q, m10928V(obj, jM10924R));
                    }
                    break;
                case 58:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11511o(iM10923Q, m10925S(obj, jM10924R));
                    }
                    break;
                case 59:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        c2489m.m10953o0(iM10923Q, unsafe.getObject(obj, jM10924R), interfaceC2525l0);
                    }
                    break;
                case 60:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11492M(iM10923Q, unsafe.getObject(obj, jM10924R), c2489m.m10958s(i11));
                    }
                    break;
                case 61:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11491L(iM10923Q, (AbstractC2512f) unsafe.getObject(obj, jM10924R));
                    }
                    break;
                case 62:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11496b(iM10923Q, m10928V(obj, jM10924R));
                    }
                    break;
                case 63:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11483D(iM10923Q, m10928V(obj, jM10924R));
                    }
                    break;
                case 64:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11512p(iM10923Q, m10928V(obj, jM10924R));
                    }
                    break;
                case 65:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11517u(iM10923Q, m10929W(obj, jM10924R));
                    }
                    break;
                case 66:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11487H(iM10923Q, m10928V(obj, jM10924R));
                    }
                    break;
                case 67:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11522z(iM10923Q, m10929W(obj, jM10924R));
                    }
                    break;
                case 68:
                    if (c2489m.m10910D(obj, iM10923Q, i11)) {
                        interfaceC2525l0.mo11494O(iM10923Q, unsafe.getObject(obj, jM10924R), c2489m.m10958s(i11));
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
            c2489m.f9459p.mo11567j(interfaceC2525l0, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        c2489m.m10955p0(c2489m.f9458o, obj, interfaceC2525l0);
    }

    /* JADX INFO: renamed from: m */
    private static double m10948m(Object obj, long j7) {
        return AbstractC2519i0.m11437u(obj, j7);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: m0 */
    private void m10949m0(Object obj, InterfaceC2525l0 interfaceC2525l0) {
        Iterator itM11584e;
        Map.Entry entry;
        m10955p0(this.f9458o, obj, interfaceC2525l0);
        if (this.f9449f) {
            C2530q c2530qMo11560c = this.f9459p.mo11560c(obj);
            if (c2530qMo11560c.m11587j()) {
                itM11584e = null;
                entry = null;
            } else {
                itM11584e = c2530qMo11560c.m11584e();
                entry = (Map.Entry) itM11584e.next();
            }
        } else {
            itM11584e = null;
            entry = null;
        }
        for (int length = this.f9444a.length - 3; length >= 0; length -= 3) {
            int iM10945k0 = m10945k0(length);
            int iM10923Q = m10923Q(length);
            while (entry != null && this.f9459p.mo11558a(entry) > iM10923Q) {
                this.f9459p.mo11567j(interfaceC2525l0, entry);
                entry = itM11584e.hasNext() ? (Map.Entry) itM11584e.next() : null;
            }
            switch (m10943j0(iM10945k0)) {
                case 0:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11499e(iM10923Q, m10948m(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 1:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11480A(iM10923Q, m10954p(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 2:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11510n(iM10923Q, m10912F(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 3:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11508l(iM10923Q, m10912F(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 4:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11514r(iM10923Q, m10960u(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 5:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11503h(iM10923Q, m10912F(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 6:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11498d(iM10923Q, m10960u(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 7:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11511o(iM10923Q, m10944k(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 8:
                    if (m10962w(obj, length)) {
                        m10953o0(iM10923Q, AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0);
                    }
                    break;
                case 9:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11492M(iM10923Q, AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), m10958s(length));
                    }
                    break;
                case 10:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11491L(iM10923Q, (AbstractC2512f) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 11:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11496b(iM10923Q, m10960u(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 12:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11483D(iM10923Q, m10960u(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 13:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11512p(iM10923Q, m10960u(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 14:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11517u(iM10923Q, m10912F(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 15:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11487H(iM10923Q, m10960u(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 16:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11522z(iM10923Q, m10912F(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 17:
                    if (m10962w(obj, length)) {
                        interfaceC2525l0.mo11494O(iM10923Q, AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), m10958s(length));
                    }
                    break;
                case 18:
                    AbstractC2503a0.m11056N(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 19:
                    AbstractC2503a0.m11060R(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 20:
                    AbstractC2503a0.m11063U(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    AbstractC2503a0.m11074c0(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 22:
                    AbstractC2503a0.m11062T(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 23:
                    AbstractC2503a0.m11059Q(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 24:
                    AbstractC2503a0.m11058P(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 25:
                    AbstractC2503a0.m11054L(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 26:
                    AbstractC2503a0.m11070a0(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0);
                    break;
                case 27:
                    AbstractC2503a0.m11064V(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, m10958s(length));
                    break;
                case 28:
                    AbstractC2503a0.m11055M(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0);
                    break;
                case 29:
                    AbstractC2503a0.m11072b0(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 30:
                    AbstractC2503a0.m11057O(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 31:
                    AbstractC2503a0.m11065W(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 32:
                    AbstractC2503a0.m11066X(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 33:
                    AbstractC2503a0.m11067Y(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 34:
                    AbstractC2503a0.m11068Z(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, false);
                    break;
                case 35:
                    AbstractC2503a0.m11056N(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 36:
                    AbstractC2503a0.m11060R(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 37:
                    AbstractC2503a0.m11063U(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 38:
                    AbstractC2503a0.m11074c0(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 39:
                    AbstractC2503a0.m11062T(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 40:
                    AbstractC2503a0.m11059Q(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 41:
                    AbstractC2503a0.m11058P(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 42:
                    AbstractC2503a0.m11054L(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 43:
                    AbstractC2503a0.m11072b0(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 44:
                    AbstractC2503a0.m11057O(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 45:
                    AbstractC2503a0.m11065W(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 46:
                    AbstractC2503a0.m11066X(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 47:
                    AbstractC2503a0.m11067Y(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 48:
                    AbstractC2503a0.m11068Z(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, true);
                    break;
                case 49:
                    AbstractC2503a0.m11061S(m10923Q(length), (List) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0, m10958s(length));
                    break;
                case 50:
                    m10951n0(interfaceC2525l0, iM10923Q, AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), length);
                    break;
                case 51:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11499e(iM10923Q, m10926T(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 52:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11480A(iM10923Q, m10927U(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 53:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11510n(iM10923Q, m10929W(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 54:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11508l(iM10923Q, m10929W(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 55:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11514r(iM10923Q, m10928V(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 56:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11503h(iM10923Q, m10929W(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 57:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11498d(iM10923Q, m10928V(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 58:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11511o(iM10923Q, m10925S(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 59:
                    if (m10910D(obj, iM10923Q, length)) {
                        m10953o0(iM10923Q, AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), interfaceC2525l0);
                    }
                    break;
                case 60:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11492M(iM10923Q, AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), m10958s(length));
                    }
                    break;
                case 61:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11491L(iM10923Q, (AbstractC2512f) AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 62:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11496b(iM10923Q, m10928V(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 63:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11483D(iM10923Q, m10928V(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 64:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11512p(iM10923Q, m10928V(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 65:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11517u(iM10923Q, m10929W(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 66:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11487H(iM10923Q, m10928V(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 67:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11522z(iM10923Q, m10929W(obj, m10924R(iM10945k0)));
                    }
                    break;
                case 68:
                    if (m10910D(obj, iM10923Q, length)) {
                        interfaceC2525l0.mo11494O(iM10923Q, AbstractC2519i0.m11442z(obj, m10924R(iM10945k0)), m10958s(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f9459p.mo11567j(interfaceC2525l0, entry);
            entry = itM11584e.hasNext() ? (Map.Entry) itM11584e.next() : null;
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m10950n(Object obj, Object obj2, int i7) {
        int iM10945k0 = m10945k0(i7);
        long jM10924R = m10924R(iM10945k0);
        switch (m10943j0(iM10945k0)) {
            case 0:
                return m10942j(obj, obj2, i7) && Double.doubleToLongBits(AbstractC2519i0.m11437u(obj, jM10924R)) == Double.doubleToLongBits(AbstractC2519i0.m11437u(obj2, jM10924R));
            case 1:
                return m10942j(obj, obj2, i7) && Float.floatToIntBits(AbstractC2519i0.m11438v(obj, jM10924R)) == Float.floatToIntBits(AbstractC2519i0.m11438v(obj2, jM10924R));
            case 2:
                return m10942j(obj, obj2, i7) && AbstractC2519i0.m11440x(obj, jM10924R) == AbstractC2519i0.m11440x(obj2, jM10924R);
            case 3:
                return m10942j(obj, obj2, i7) && AbstractC2519i0.m11440x(obj, jM10924R) == AbstractC2519i0.m11440x(obj2, jM10924R);
            case 4:
                return m10942j(obj, obj2, i7) && AbstractC2519i0.m11439w(obj, jM10924R) == AbstractC2519i0.m11439w(obj2, jM10924R);
            case 5:
                return m10942j(obj, obj2, i7) && AbstractC2519i0.m11440x(obj, jM10924R) == AbstractC2519i0.m11440x(obj2, jM10924R);
            case 6:
                return m10942j(obj, obj2, i7) && AbstractC2519i0.m11439w(obj, jM10924R) == AbstractC2519i0.m11439w(obj2, jM10924R);
            case 7:
                return m10942j(obj, obj2, i7) && AbstractC2519i0.m11432p(obj, jM10924R) == AbstractC2519i0.m11432p(obj2, jM10924R);
            case 8:
                return m10942j(obj, obj2, i7) && AbstractC2503a0.m11050H(AbstractC2519i0.m11442z(obj, jM10924R), AbstractC2519i0.m11442z(obj2, jM10924R));
            case 9:
                return m10942j(obj, obj2, i7) && AbstractC2503a0.m11050H(AbstractC2519i0.m11442z(obj, jM10924R), AbstractC2519i0.m11442z(obj2, jM10924R));
            case 10:
                return m10942j(obj, obj2, i7) && AbstractC2503a0.m11050H(AbstractC2519i0.m11442z(obj, jM10924R), AbstractC2519i0.m11442z(obj2, jM10924R));
            case 11:
                return m10942j(obj, obj2, i7) && AbstractC2519i0.m11439w(obj, jM10924R) == AbstractC2519i0.m11439w(obj2, jM10924R);
            case 12:
                return m10942j(obj, obj2, i7) && AbstractC2519i0.m11439w(obj, jM10924R) == AbstractC2519i0.m11439w(obj2, jM10924R);
            case 13:
                return m10942j(obj, obj2, i7) && AbstractC2519i0.m11439w(obj, jM10924R) == AbstractC2519i0.m11439w(obj2, jM10924R);
            case 14:
                return m10942j(obj, obj2, i7) && AbstractC2519i0.m11440x(obj, jM10924R) == AbstractC2519i0.m11440x(obj2, jM10924R);
            case 15:
                return m10942j(obj, obj2, i7) && AbstractC2519i0.m11439w(obj, jM10924R) == AbstractC2519i0.m11439w(obj2, jM10924R);
            case 16:
                return m10942j(obj, obj2, i7) && AbstractC2519i0.m11440x(obj, jM10924R) == AbstractC2519i0.m11440x(obj2, jM10924R);
            case 17:
                return m10942j(obj, obj2, i7) && AbstractC2503a0.m11050H(AbstractC2519i0.m11442z(obj, jM10924R), AbstractC2519i0.m11442z(obj2, jM10924R));
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
                return AbstractC2503a0.m11050H(AbstractC2519i0.m11442z(obj, jM10924R), AbstractC2519i0.m11442z(obj2, jM10924R));
            case 50:
                return AbstractC2503a0.m11050H(AbstractC2519i0.m11442z(obj, jM10924R), AbstractC2519i0.m11442z(obj2, jM10924R));
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
                return m10909C(obj, obj2, i7) && AbstractC2503a0.m11050H(AbstractC2519i0.m11442z(obj, jM10924R), AbstractC2519i0.m11442z(obj2, jM10924R));
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: n0 */
    private void m10951n0(InterfaceC2525l0 interfaceC2525l0, int i7, Object obj, int i8) {
        if (obj != null) {
            interfaceC2525l0.mo11493N(i7, this.f9460q.mo10882c(m10957r(i8)), this.f9460q.mo10887h(obj));
        }
    }

    /* JADX INFO: renamed from: o */
    private Object m10952o(Object obj, int i7, Object obj2, AbstractC2513f0 abstractC2513f0, Object obj3) {
        m10923Q(i7);
        if (AbstractC2519i0.m11442z(obj, m10924R(m10945k0(i7))) == null) {
            return obj2;
        }
        m10956q(i7);
        return obj2;
    }

    /* JADX INFO: renamed from: o0 */
    private void m10953o0(int i7, Object obj, InterfaceC2525l0 interfaceC2525l0) {
        if (obj instanceof String) {
            interfaceC2525l0.mo11507k(i7, (String) obj);
        } else {
            interfaceC2525l0.mo11491L(i7, (AbstractC2512f) obj);
        }
    }

    /* JADX INFO: renamed from: p */
    private static float m10954p(Object obj, long j7) {
        return AbstractC2519i0.m11438v(obj, j7);
    }

    /* JADX INFO: renamed from: p0 */
    private void m10955p0(AbstractC2513f0 abstractC2513f0, Object obj, InterfaceC2525l0 interfaceC2525l0) {
        abstractC2513f0.mo11181t(abstractC2513f0.mo11169g(obj), interfaceC2525l0);
    }

    /* JADX INFO: renamed from: q */
    private AbstractC2534u.a m10956q(int i7) {
        AbstractC2263x.m9328a(this.f9445b[((i7 / 3) * 2) + 1]);
        return null;
    }

    /* JADX INFO: renamed from: r */
    private Object m10957r(int i7) {
        return this.f9445b[(i7 / 3) * 2];
    }

    /* JADX INFO: renamed from: s */
    private InterfaceC2500Y m10958s(int i7) {
        int i8 = (i7 / 3) * 2;
        InterfaceC2500Y interfaceC2500Y = (InterfaceC2500Y) this.f9445b[i8];
        if (interfaceC2500Y != null) {
            return interfaceC2500Y;
        }
        InterfaceC2500Y interfaceC2500YM10986c = C2496U.m10984a().m10986c((Class) this.f9445b[i8 + 1]);
        this.f9445b[i8] = interfaceC2500YM10986c;
        return interfaceC2500YM10986c;
    }

    /* JADX INFO: renamed from: t */
    private int m10959t(AbstractC2513f0 abstractC2513f0, Object obj) {
        return abstractC2513f0.mo11170h(abstractC2513f0.mo11169g(obj));
    }

    /* JADX INFO: renamed from: u */
    private static int m10960u(Object obj, long j7) {
        return AbstractC2519i0.m11439w(obj, j7);
    }

    /* JADX INFO: renamed from: v */
    private static boolean m10961v(int i7) {
        return (i7 & 536870912) != 0;
    }

    /* JADX INFO: renamed from: w */
    private boolean m10962w(Object obj, int i7) {
        int iM10931Y = m10931Y(i7);
        long j7 = 1048575 & iM10931Y;
        if (j7 != 1048575) {
            return (AbstractC2519i0.m11439w(obj, j7) & (1 << (iM10931Y >>> 20))) != 0;
        }
        int iM10945k0 = m10945k0(i7);
        long jM10924R = m10924R(iM10945k0);
        switch (m10943j0(iM10945k0)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC2519i0.m11437u(obj, jM10924R)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC2519i0.m11438v(obj, jM10924R)) != 0;
            case 2:
                return AbstractC2519i0.m11440x(obj, jM10924R) != 0;
            case 3:
                return AbstractC2519i0.m11440x(obj, jM10924R) != 0;
            case 4:
                return AbstractC2519i0.m11439w(obj, jM10924R) != 0;
            case 5:
                return AbstractC2519i0.m11440x(obj, jM10924R) != 0;
            case 6:
                return AbstractC2519i0.m11439w(obj, jM10924R) != 0;
            case 7:
                return AbstractC2519i0.m11432p(obj, jM10924R);
            case 8:
                Object objM11442z = AbstractC2519i0.m11442z(obj, jM10924R);
                if (objM11442z instanceof String) {
                    return !((String) objM11442z).isEmpty();
                }
                if (objM11442z instanceof AbstractC2512f) {
                    return !AbstractC2512f.f9510b.equals(objM11442z);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC2519i0.m11442z(obj, jM10924R) != null;
            case 10:
                return !AbstractC2512f.f9510b.equals(AbstractC2519i0.m11442z(obj, jM10924R));
            case 11:
                return AbstractC2519i0.m11439w(obj, jM10924R) != 0;
            case 12:
                return AbstractC2519i0.m11439w(obj, jM10924R) != 0;
            case 13:
                return AbstractC2519i0.m11439w(obj, jM10924R) != 0;
            case 14:
                return AbstractC2519i0.m11440x(obj, jM10924R) != 0;
            case 15:
                return AbstractC2519i0.m11439w(obj, jM10924R) != 0;
            case 16:
                return AbstractC2519i0.m11440x(obj, jM10924R) != 0;
            case 17:
                return AbstractC2519i0.m11442z(obj, jM10924R) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: x */
    private boolean m10963x(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return m10962w(obj, i7);
        }
        return (i9 & i10) != 0;
    }

    /* JADX INFO: renamed from: y */
    private static boolean m10964y(Object obj, int i7, InterfaceC2500Y interfaceC2500Y) {
        return interfaceC2500Y.mo10968c(AbstractC2519i0.m11442z(obj, m10924R(i7)));
    }

    /* JADX INFO: renamed from: z */
    private boolean m10965z(Object obj, int i7, int i8) {
        List list = (List) AbstractC2519i0.m11442z(obj, m10924R(i7));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC2500Y interfaceC2500YM10958s = m10958s(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (!interfaceC2500YM10958s.mo10968c(list.get(i9))) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: a */
    public void mo10966a(Object obj, Object obj2) {
        m10946l(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.f9444a.length; i7 += 3) {
            m10917K(obj, obj2, i7);
        }
        AbstractC2503a0.m11048F(this.f9458o, obj, obj2);
        if (this.f9449f) {
            AbstractC2503a0.m11046D(this.f9459p, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: b */
    public void mo10967b(Object obj) {
        if (m10908B(obj)) {
            if (obj instanceof AbstractC2533t) {
                AbstractC2533t abstractC2533t = (AbstractC2533t) obj;
                abstractC2533t.m11620l();
                abstractC2533t.m11619k();
                abstractC2533t.m11613E();
            }
            int length = this.f9444a.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int iM10945k0 = m10945k0(i7);
                long jM10924R = m10924R(iM10945k0);
                int iM10943j0 = m10943j0(iM10945k0);
                if (iM10943j0 != 9) {
                    if (iM10943j0 != 60 && iM10943j0 != 68) {
                        switch (iM10943j0) {
                            case 17:
                                if (m10962w(obj, i7)) {
                                    m10958s(i7).mo10967b(f9443s.getObject(obj, jM10924R));
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
                                this.f9457n.mo11661b(obj, jM10924R);
                                break;
                            case 50:
                                Unsafe unsafe = f9443s;
                                Object object = unsafe.getObject(obj, jM10924R);
                                if (object != null) {
                                    unsafe.putObject(obj, jM10924R, this.f9460q.mo10881b(object));
                                }
                                break;
                        }
                    } else if (m10910D(obj, m10923Q(i7), i7)) {
                        m10958s(i7).mo10967b(f9443s.getObject(obj, jM10924R));
                    }
                } else if (m10962w(obj, i7)) {
                    m10958s(i7).mo10967b(f9443s.getObject(obj, jM10924R));
                }
            }
            this.f9458o.mo11172j(obj);
            if (this.f9449f) {
                this.f9459p.mo11563f(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: c */
    public final boolean mo10968c(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f9454k) {
            int i12 = this.f9453j[i10];
            int iM10923Q = m10923Q(i12);
            int iM10945k0 = m10945k0(i12);
            int i13 = this.f9444a[i12 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i9) {
                if (i14 != 1048575) {
                    i11 = f9443s.getInt(obj, i14);
                }
                i8 = i11;
                i7 = i14;
            } else {
                i7 = i9;
                i8 = i11;
            }
            Object obj2 = obj;
            if (m10911E(iM10945k0) && !m10963x(obj2, i12, i7, i8, i15)) {
                return false;
            }
            int iM10943j0 = m10943j0(iM10945k0);
            if (iM10943j0 == 9 || iM10943j0 == 17) {
                if (m10963x(obj2, i12, i7, i8, i15) && !m10964y(obj2, iM10945k0, m10958s(i12))) {
                    return false;
                }
            } else if (iM10943j0 == 27) {
                if (!m10965z(obj2, iM10945k0, i12)) {
                    return false;
                }
            } else if (iM10943j0 == 60 || iM10943j0 == 68) {
                if (m10910D(obj2, iM10923Q, i12) && !m10964y(obj2, iM10945k0, m10958s(i12))) {
                    return false;
                }
            } else if (iM10943j0 != 49) {
                if (iM10943j0 == 50 && !m10907A(obj2, iM10945k0, i12)) {
                    return false;
                }
            } else if (!m10965z(obj2, iM10945k0, i12)) {
                return false;
            }
            i10++;
            obj = obj2;
            i9 = i7;
            i11 = i8;
        }
        return !this.f9449f || this.f9459p.mo11560c(obj).m11588k();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: d */
    public boolean mo10969d(Object obj, Object obj2) {
        int length = this.f9444a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            if (!m10950n(obj, obj2, i7)) {
                return false;
            }
        }
        if (!this.f9458o.mo11169g(obj).equals(this.f9458o.mo11169g(obj2))) {
            return false;
        }
        if (this.f9449f) {
            return this.f9459p.mo11560c(obj).equals(this.f9459p.mo11560c(obj2));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
      0x0552: PHI (r0v2 androidx.datastore.preferences.protobuf.M) = 
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v24 androidx.datastore.preferences.protobuf.M)
      (r0v30 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
      (r0v1 androidx.datastore.preferences.protobuf.M)
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
    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: e */
    public int mo10970e(Object obj) {
        int i7;
        int iM11322h;
        int iM11330p;
        int iM11337w;
        int iM11080i;
        int iM11308O;
        int iM11310Q;
        C2489M c2489m = this;
        Object obj2 = obj;
        Unsafe unsafe = f9443s;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i9 < c2489m.f9444a.length) {
            int iM10945k0 = c2489m.m10945k0(i9);
            int iM10943j0 = m10943j0(iM10945k0);
            int iM10923Q = c2489m.m10923Q(i9);
            int i13 = c2489m.f9444a[i9 + 2];
            int i14 = i13 & i8;
            if (iM10943j0 <= 17) {
                if (i14 != i12) {
                    i10 = i14 == i8 ? 0 : unsafe.getInt(obj2, i14);
                    i12 = i14;
                }
                i7 = 1 << (i13 >>> 20);
            } else {
                i7 = 0;
            }
            int i15 = i11;
            long jM10924R = m10924R(iM10945k0);
            if (iM10943j0 < EnumC2531r.f9669Z.m11597c() || iM10943j0 > EnumC2531r.f9683m0.m11597c()) {
                i14 = 0;
            }
            switch (iM10943j0) {
                case 0:
                    if (!c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11322h(iM10923Q, 0.0d);
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 1:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11330p = AbstractC2518i.m11330p(iM10923Q, 0.0f);
                        i11 = i15 + iM11330p;
                        c2489m = this;
                        obj2 = obj;
                    }
                    c2489m = this;
                    obj2 = obj;
                    i11 = i15;
                    break;
                case 2:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11337w = AbstractC2518i.m11337w(iM10923Q, unsafe.getLong(obj2, jM10924R));
                        i11 = i15 + iM11337w;
                        c2489m = this;
                    }
                    c2489m = this;
                    i11 = i15;
                    break;
                case 3:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11337w = AbstractC2518i.m11311R(iM10923Q, unsafe.getLong(obj2, jM10924R));
                        i11 = i15 + iM11337w;
                        c2489m = this;
                    }
                    c2489m = this;
                    i11 = i15;
                    break;
                case 4:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11337w = AbstractC2518i.m11335u(iM10923Q, unsafe.getInt(obj2, jM10924R));
                        i11 = i15 + iM11337w;
                        c2489m = this;
                    }
                    c2489m = this;
                    i11 = i15;
                    break;
                case 5:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11330p = AbstractC2518i.m11328n(iM10923Q, 0L);
                        i11 = i15 + iM11330p;
                        c2489m = this;
                        obj2 = obj;
                    }
                    c2489m = this;
                    obj2 = obj;
                    i11 = i15;
                    break;
                case 6:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11330p = AbstractC2518i.m11326l(iM10923Q, 0);
                        i11 = i15 + iM11330p;
                        c2489m = this;
                        obj2 = obj;
                    }
                    c2489m = this;
                    obj2 = obj;
                    i11 = i15;
                    break;
                case 7:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11330p = AbstractC2518i.m11317c(iM10923Q, true);
                        i11 = i15 + iM11330p;
                        c2489m = this;
                        obj2 = obj;
                    }
                    c2489m = this;
                    obj2 = obj;
                    i11 = i15;
                    break;
                case 8:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        Object object = unsafe.getObject(obj2, jM10924R);
                        iM11337w = object instanceof AbstractC2512f ? AbstractC2518i.m11320f(iM10923Q, (AbstractC2512f) object) : AbstractC2518i.m11306M(iM10923Q, (String) object);
                        i11 = i15 + iM11337w;
                        c2489m = this;
                    }
                    c2489m = this;
                    i11 = i15;
                    break;
                case 9:
                    if (!c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2503a0.m11086o(iM10923Q, unsafe.getObject(obj2, jM10924R), c2489m.m10958s(i9));
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 10:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11337w = AbstractC2518i.m11320f(iM10923Q, (AbstractC2512f) unsafe.getObject(obj2, jM10924R));
                        i11 = i15 + iM11337w;
                        c2489m = this;
                    }
                    c2489m = this;
                    i11 = i15;
                    break;
                case 11:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11337w = AbstractC2518i.m11309P(iM10923Q, unsafe.getInt(obj2, jM10924R));
                        i11 = i15 + iM11337w;
                        c2489m = this;
                    }
                    c2489m = this;
                    i11 = i15;
                    break;
                case 12:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11337w = AbstractC2518i.m11324j(iM10923Q, unsafe.getInt(obj2, jM10924R));
                        i11 = i15 + iM11337w;
                        c2489m = this;
                    }
                    c2489m = this;
                    i11 = i15;
                    break;
                case 13:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11330p = AbstractC2518i.m11298E(iM10923Q, 0);
                        i11 = i15 + iM11330p;
                        c2489m = this;
                        obj2 = obj;
                    }
                    c2489m = this;
                    obj2 = obj;
                    i11 = i15;
                    break;
                case 14:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11330p = AbstractC2518i.m11300G(iM10923Q, 0L);
                        i11 = i15 + iM11330p;
                        c2489m = this;
                        obj2 = obj;
                    }
                    c2489m = this;
                    obj2 = obj;
                    i11 = i15;
                    break;
                case 15:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11337w = AbstractC2518i.m11302I(iM10923Q, unsafe.getInt(obj2, jM10924R));
                        i11 = i15 + iM11337w;
                        c2489m = this;
                    }
                    c2489m = this;
                    i11 = i15;
                    break;
                case 16:
                    if (c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        iM11337w = AbstractC2518i.m11304K(iM10923Q, unsafe.getLong(obj2, jM10924R));
                        i11 = i15 + iM11337w;
                        c2489m = this;
                    }
                    c2489m = this;
                    i11 = i15;
                    break;
                case 17:
                    if (!c2489m.m10963x(obj2, i9, i12, i10, i7)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11332r(iM10923Q, (InterfaceC2486J) unsafe.getObject(obj2, jM10924R), c2489m.m10958s(i9));
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 18:
                    iM11322h = AbstractC2503a0.m11079h(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 19:
                    iM11322h = AbstractC2503a0.m11077f(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 20:
                    iM11322h = AbstractC2503a0.m11084m(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    iM11322h = AbstractC2503a0.m11095x(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 22:
                    iM11322h = AbstractC2503a0.m11082k(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 23:
                    iM11322h = AbstractC2503a0.m11079h(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 24:
                    iM11322h = AbstractC2503a0.m11077f(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 25:
                    iM11322h = AbstractC2503a0.m11069a(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 26:
                    iM11322h = AbstractC2503a0.m11092u(iM10923Q, (List) unsafe.getObject(obj2, jM10924R));
                    i11 = i15 + iM11322h;
                    break;
                case 27:
                    iM11322h = AbstractC2503a0.m11087p(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), c2489m.m10958s(i9));
                    i11 = i15 + iM11322h;
                    break;
                case 28:
                    iM11322h = AbstractC2503a0.m11073c(iM10923Q, (List) unsafe.getObject(obj2, jM10924R));
                    i11 = i15 + iM11322h;
                    break;
                case 29:
                    iM11322h = AbstractC2503a0.m11093v(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 30:
                    iM11322h = AbstractC2503a0.m11075d(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 31:
                    iM11322h = AbstractC2503a0.m11077f(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 32:
                    iM11322h = AbstractC2503a0.m11079h(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 33:
                    iM11322h = AbstractC2503a0.m11088q(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 34:
                    iM11322h = AbstractC2503a0.m11090s(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), false);
                    i11 = i15 + iM11322h;
                    break;
                case 35:
                    iM11080i = AbstractC2503a0.m11080i((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 36:
                    iM11080i = AbstractC2503a0.m11078g((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 37:
                    iM11080i = AbstractC2503a0.m11085n((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 38:
                    iM11080i = AbstractC2503a0.m11096y((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 39:
                    iM11080i = AbstractC2503a0.m11083l((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 40:
                    iM11080i = AbstractC2503a0.m11080i((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 41:
                    iM11080i = AbstractC2503a0.m11078g((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 42:
                    iM11080i = AbstractC2503a0.m11071b((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 43:
                    iM11080i = AbstractC2503a0.m11094w((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 44:
                    iM11080i = AbstractC2503a0.m11076e((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 45:
                    iM11080i = AbstractC2503a0.m11078g((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 46:
                    iM11080i = AbstractC2503a0.m11080i((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 47:
                    iM11080i = AbstractC2503a0.m11089r((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 48:
                    iM11080i = AbstractC2503a0.m11091t((List) unsafe.getObject(obj2, jM10924R));
                    if (iM11080i <= 0) {
                        i11 = i15;
                    } else {
                        if (c2489m.f9452i) {
                            unsafe.putInt(obj2, i14, iM11080i);
                        }
                        iM11308O = AbstractC2518i.m11308O(iM10923Q);
                        iM11310Q = AbstractC2518i.m11310Q(iM11080i);
                        i11 = i15 + iM11308O + iM11310Q + iM11080i;
                    }
                    break;
                case 49:
                    iM11322h = AbstractC2503a0.m11081j(iM10923Q, (List) unsafe.getObject(obj2, jM10924R), c2489m.m10958s(i9));
                    i11 = i15 + iM11322h;
                    break;
                case 50:
                    iM11322h = c2489m.f9460q.mo10885f(iM10923Q, unsafe.getObject(obj2, jM10924R), c2489m.m10957r(i9));
                    i11 = i15 + iM11322h;
                    break;
                case 51:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11322h(iM10923Q, 0.0d);
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 52:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11330p(iM10923Q, 0.0f);
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 53:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11337w(iM10923Q, m10929W(obj2, jM10924R));
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 54:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11311R(iM10923Q, m10929W(obj2, jM10924R));
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 55:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11335u(iM10923Q, m10928V(obj2, jM10924R));
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 56:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11328n(iM10923Q, 0L);
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 57:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11326l(iM10923Q, 0);
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 58:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11317c(iM10923Q, true);
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 59:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        Object object2 = unsafe.getObject(obj2, jM10924R);
                        iM11322h = object2 instanceof AbstractC2512f ? AbstractC2518i.m11320f(iM10923Q, (AbstractC2512f) object2) : AbstractC2518i.m11306M(iM10923Q, (String) object2);
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 60:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2503a0.m11086o(iM10923Q, unsafe.getObject(obj2, jM10924R), c2489m.m10958s(i9));
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 61:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11320f(iM10923Q, (AbstractC2512f) unsafe.getObject(obj2, jM10924R));
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 62:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11309P(iM10923Q, m10928V(obj2, jM10924R));
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 63:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11324j(iM10923Q, m10928V(obj2, jM10924R));
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 64:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11298E(iM10923Q, 0);
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 65:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11300G(iM10923Q, 0L);
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 66:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11302I(iM10923Q, m10928V(obj2, jM10924R));
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 67:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11304K(iM10923Q, m10929W(obj2, jM10924R));
                        i11 = i15 + iM11322h;
                    }
                    break;
                case 68:
                    if (!c2489m.m10910D(obj2, iM10923Q, i9)) {
                        i11 = i15;
                    } else {
                        iM11322h = AbstractC2518i.m11332r(iM10923Q, (InterfaceC2486J) unsafe.getObject(obj2, jM10924R), c2489m.m10958s(i9));
                        i11 = i15 + iM11322h;
                    }
                    break;
                default:
                    i11 = i15;
                    break;
            }
            i9 += 3;
            i8 = 1048575;
        }
        int iM10959t = i11 + c2489m.m10959t(c2489m.f9458o, obj2);
        return c2489m.f9449f ? iM10959t + c2489m.f9459p.mo11560c(obj2).m11586h() : iM10959t;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: f */
    public Object mo10971f() {
        return this.f9456m.mo10980a(this.f9448e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: g */
    public int mo10972g(Object obj) {
        int i7;
        int iM11642f;
        int length = this.f9444a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int iM10945k0 = m10945k0(i9);
            int iM10923Q = m10923Q(i9);
            long jM10924R = m10924R(iM10945k0);
            int iHashCode = 37;
            switch (m10943j0(iM10945k0)) {
                case 0:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2534u.m11642f(Double.doubleToLongBits(AbstractC2519i0.m11437u(obj, jM10924R)));
                    i8 = i7 + iM11642f;
                    break;
                case 1:
                    i7 = i8 * 53;
                    iM11642f = Float.floatToIntBits(AbstractC2519i0.m11438v(obj, jM10924R));
                    i8 = i7 + iM11642f;
                    break;
                case 2:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2534u.m11642f(AbstractC2519i0.m11440x(obj, jM10924R));
                    i8 = i7 + iM11642f;
                    break;
                case 3:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2534u.m11642f(AbstractC2519i0.m11440x(obj, jM10924R));
                    i8 = i7 + iM11642f;
                    break;
                case 4:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2519i0.m11439w(obj, jM10924R);
                    i8 = i7 + iM11642f;
                    break;
                case 5:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2534u.m11642f(AbstractC2519i0.m11440x(obj, jM10924R));
                    i8 = i7 + iM11642f;
                    break;
                case 6:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2519i0.m11439w(obj, jM10924R);
                    i8 = i7 + iM11642f;
                    break;
                case 7:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2534u.m11639c(AbstractC2519i0.m11432p(obj, jM10924R));
                    i8 = i7 + iM11642f;
                    break;
                case 8:
                    i7 = i8 * 53;
                    iM11642f = ((String) AbstractC2519i0.m11442z(obj, jM10924R)).hashCode();
                    i8 = i7 + iM11642f;
                    break;
                case 9:
                    Object objM11442z = AbstractC2519i0.m11442z(obj, jM10924R);
                    if (objM11442z != null) {
                        iHashCode = objM11442z.hashCode();
                    }
                    i8 = (i8 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2519i0.m11442z(obj, jM10924R).hashCode();
                    i8 = i7 + iM11642f;
                    break;
                case 11:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2519i0.m11439w(obj, jM10924R);
                    i8 = i7 + iM11642f;
                    break;
                case 12:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2519i0.m11439w(obj, jM10924R);
                    i8 = i7 + iM11642f;
                    break;
                case 13:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2519i0.m11439w(obj, jM10924R);
                    i8 = i7 + iM11642f;
                    break;
                case 14:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2534u.m11642f(AbstractC2519i0.m11440x(obj, jM10924R));
                    i8 = i7 + iM11642f;
                    break;
                case 15:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2519i0.m11439w(obj, jM10924R);
                    i8 = i7 + iM11642f;
                    break;
                case 16:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2534u.m11642f(AbstractC2519i0.m11440x(obj, jM10924R));
                    i8 = i7 + iM11642f;
                    break;
                case 17:
                    Object objM11442z2 = AbstractC2519i0.m11442z(obj, jM10924R);
                    if (objM11442z2 != null) {
                        iHashCode = objM11442z2.hashCode();
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
                    iM11642f = AbstractC2519i0.m11442z(obj, jM10924R).hashCode();
                    i8 = i7 + iM11642f;
                    break;
                case 50:
                    i7 = i8 * 53;
                    iM11642f = AbstractC2519i0.m11442z(obj, jM10924R).hashCode();
                    i8 = i7 + iM11642f;
                    break;
                case 51:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = AbstractC2534u.m11642f(Double.doubleToLongBits(m10926T(obj, jM10924R)));
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 52:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = Float.floatToIntBits(m10927U(obj, jM10924R));
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 53:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = AbstractC2534u.m11642f(m10929W(obj, jM10924R));
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 54:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = AbstractC2534u.m11642f(m10929W(obj, jM10924R));
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 55:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = m10928V(obj, jM10924R);
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 56:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = AbstractC2534u.m11642f(m10929W(obj, jM10924R));
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 57:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = m10928V(obj, jM10924R);
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 58:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = AbstractC2534u.m11639c(m10925S(obj, jM10924R));
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 59:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = ((String) AbstractC2519i0.m11442z(obj, jM10924R)).hashCode();
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 60:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = AbstractC2519i0.m11442z(obj, jM10924R).hashCode();
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 61:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = AbstractC2519i0.m11442z(obj, jM10924R).hashCode();
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 62:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = m10928V(obj, jM10924R);
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 63:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = m10928V(obj, jM10924R);
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 64:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = m10928V(obj, jM10924R);
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 65:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = AbstractC2534u.m11642f(m10929W(obj, jM10924R));
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 66:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = m10928V(obj, jM10924R);
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 67:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = AbstractC2534u.m11642f(m10929W(obj, jM10924R));
                        i8 = i7 + iM11642f;
                    }
                    break;
                case 68:
                    if (m10910D(obj, iM10923Q, i9)) {
                        i7 = i8 * 53;
                        iM11642f = AbstractC2519i0.m11442z(obj, jM10924R).hashCode();
                        i8 = i7 + iM11642f;
                    }
                    break;
            }
        }
        int iHashCode2 = (i8 * 53) + this.f9458o.mo11169g(obj).hashCode();
        return this.f9449f ? (iHashCode2 * 53) + this.f9459p.mo11560c(obj).hashCode() : iHashCode2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: h */
    public void mo10973h(Object obj, InterfaceC2499X interfaceC2499X, C2526m c2526m) throws Throwable {
        c2526m.getClass();
        m10946l(obj);
        m10913G(this.f9458o, this.f9459p, obj, interfaceC2499X, c2526m);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2500Y
    /* JADX INFO: renamed from: i */
    public void mo10974i(Object obj, InterfaceC2525l0 interfaceC2525l0) {
        if (interfaceC2525l0.mo11505i() == InterfaceC2525l0.a.DESCENDING) {
            m10949m0(obj, interfaceC2525l0);
        } else {
            m10947l0(obj, interfaceC2525l0);
        }
    }
}

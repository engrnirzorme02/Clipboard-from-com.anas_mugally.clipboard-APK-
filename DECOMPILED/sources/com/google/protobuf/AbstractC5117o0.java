package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.o0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5117o0 {

    /* JADX INFO: renamed from: a */
    private static final Class f19498a = m23475A();

    /* JADX INFO: renamed from: b */
    private static final AbstractC5129u0 f19499b = m23476B();

    /* JADX INFO: renamed from: c */
    private static final AbstractC5129u0 f19500c = new C5133w0();

    /* JADX INFO: renamed from: A */
    private static Class m23475A() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    private static AbstractC5129u0 m23476B() {
        try {
            Class clsM23477C = m23477C();
            if (clsM23477C == null) {
                return null;
            }
            return (AbstractC5129u0) clsM23477C.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    private static Class m23477C() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    static void m23478D(AbstractC5122r abstractC5122r, Object obj, Object obj2) {
        C5128u c5128uMo23566c = abstractC5122r.mo23566c(obj2);
        if (c5128uMo23566c.m23609j()) {
            return;
        }
        abstractC5122r.mo23567d(obj).m23613p(c5128uMo23566c);
    }

    /* JADX INFO: renamed from: E */
    static void m23479E(InterfaceC5077O interfaceC5077O, Object obj, Object obj2, long j7) {
        AbstractC5137y0.m23750V(obj, j7, interfaceC5077O.mo22953a(AbstractC5137y0.m23735G(obj, j7), AbstractC5137y0.m23735G(obj2, j7)));
    }

    /* JADX INFO: renamed from: F */
    static void m23480F(AbstractC5129u0 abstractC5129u0, Object obj, Object obj2) {
        abstractC5129u0.mo23634p(obj, abstractC5129u0.mo23630k(abstractC5129u0.mo23626g(obj), abstractC5129u0.mo23626g(obj2)));
    }

    /* JADX INFO: renamed from: G */
    public static void m23481G(Class cls) {
        Class cls2;
        if (!AbstractC5136y.class.isAssignableFrom(cls) && (cls2 = f19498a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* JADX INFO: renamed from: H */
    static boolean m23482H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    static Object m23483I(Object obj, int i7, int i8, Object obj2, AbstractC5129u0 abstractC5129u0) {
        if (obj2 == null) {
            obj2 = abstractC5129u0.mo23625f(obj);
        }
        abstractC5129u0.mo23624e(obj2, i7, i8);
        return obj2;
    }

    /* JADX INFO: renamed from: J */
    public static AbstractC5129u0 m23484J() {
        return f19499b;
    }

    /* JADX INFO: renamed from: K */
    public static AbstractC5129u0 m23485K() {
        return f19500c;
    }

    /* JADX INFO: renamed from: L */
    public static void m23486L(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22887w(i7, list, z7);
    }

    /* JADX INFO: renamed from: M */
    public static void m23487M(int i7, List list, InterfaceC5064B0 interfaceC5064B0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22858I(i7, list);
    }

    /* JADX INFO: renamed from: N */
    public static void m23488N(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22856G(i7, list, z7);
    }

    /* JADX INFO: renamed from: O */
    public static void m23489O(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22855F(i7, list, z7);
    }

    /* JADX INFO: renamed from: P */
    public static void m23490P(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22886v(i7, list, z7);
    }

    /* JADX INFO: renamed from: Q */
    public static void m23491Q(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22883s(i7, list, z7);
    }

    /* JADX INFO: renamed from: R */
    public static void m23492R(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22865a(i7, list, z7);
    }

    /* JADX INFO: renamed from: S */
    public static void m23493S(int i7, List list, InterfaceC5064B0 interfaceC5064B0, InterfaceC5113m0 interfaceC5113m0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22860K(i7, list, interfaceC5113m0);
    }

    /* JADX INFO: renamed from: T */
    public static void m23494T(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22877m(i7, list, z7);
    }

    /* JADX INFO: renamed from: U */
    public static void m23495U(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22854E(i7, list, z7);
    }

    /* JADX INFO: renamed from: V */
    public static void m23496V(int i7, List list, InterfaceC5064B0 interfaceC5064B0, InterfaceC5113m0 interfaceC5113m0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22859J(i7, list, interfaceC5113m0);
    }

    /* JADX INFO: renamed from: W */
    public static void m23497W(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22884t(i7, list, z7);
    }

    /* JADX INFO: renamed from: X */
    public static void m23498X(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22870f(i7, list, z7);
    }

    /* JADX INFO: renamed from: Y */
    public static void m23499Y(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22852C(i7, list, z7);
    }

    /* JADX INFO: renamed from: Z */
    public static void m23500Z(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22889y(i7, list, z7);
    }

    /* JADX INFO: renamed from: a */
    static int m23501a(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC5110l.m23353Q(i7) + AbstractC5110l.m23337A(size) : size * AbstractC5110l.m23364e(i7, true);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m23502a0(int i7, List list, InterfaceC5064B0 interfaceC5064B0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22874j(i7, list);
    }

    /* JADX INFO: renamed from: b */
    static int m23503b(List list) {
        return list.size();
    }

    /* JADX INFO: renamed from: b0 */
    public static void m23504b0(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22888x(i7, list, z7);
    }

    /* JADX INFO: renamed from: c */
    static int m23505c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM23353Q = size * AbstractC5110l.m23353Q(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            iM23353Q += AbstractC5110l.m23368i((AbstractC5104i) list.get(i8));
        }
        return iM23353Q;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m23506c0(int i7, List list, InterfaceC5064B0 interfaceC5064B0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5064B0.mo22871g(i7, list, z7);
    }

    /* JADX INFO: renamed from: d */
    static int m23507d(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM23508e = m23508e(list);
        return z7 ? AbstractC5110l.m23353Q(i7) + AbstractC5110l.m23337A(iM23508e) : iM23508e + (size * AbstractC5110l.m23353Q(i7));
    }

    /* JADX INFO: renamed from: e */
    static int m23508e(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5061A)) {
            int iM23372m = 0;
            while (i7 < size) {
                iM23372m += AbstractC5110l.m23372m(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iM23372m;
        }
        C5061A c5061a = (C5061A) list;
        int iM23372m2 = 0;
        while (i7 < size) {
            iM23372m2 += AbstractC5110l.m23372m(c5061a.m22827p(i7));
            i7++;
        }
        return iM23372m2;
    }

    /* JADX INFO: renamed from: f */
    static int m23509f(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC5110l.m23353Q(i7) + AbstractC5110l.m23337A(size * 4) : size * AbstractC5110l.m23373n(i7, 0);
    }

    /* JADX INFO: renamed from: g */
    static int m23510g(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: h */
    static int m23511h(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC5110l.m23353Q(i7) + AbstractC5110l.m23337A(size * 8) : size * AbstractC5110l.m23375p(i7, 0L);
    }

    /* JADX INFO: renamed from: i */
    static int m23512i(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: j */
    static int m23513j(int i7, List list, InterfaceC5113m0 interfaceC5113m0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM23379t = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iM23379t += AbstractC5110l.m23379t(i7, (InterfaceC5082U) list.get(i8), interfaceC5113m0);
        }
        return iM23379t;
    }

    /* JADX INFO: renamed from: k */
    static int m23514k(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM23515l = m23515l(list);
        return z7 ? AbstractC5110l.m23353Q(i7) + AbstractC5110l.m23337A(iM23515l) : iM23515l + (size * AbstractC5110l.m23353Q(i7));
    }

    /* JADX INFO: renamed from: l */
    static int m23515l(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5061A)) {
            int iM23383x = 0;
            while (i7 < size) {
                iM23383x += AbstractC5110l.m23383x(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iM23383x;
        }
        C5061A c5061a = (C5061A) list;
        int iM23383x2 = 0;
        while (i7 < size) {
            iM23383x2 += AbstractC5110l.m23383x(c5061a.m22827p(i7));
            i7++;
        }
        return iM23383x2;
    }

    /* JADX INFO: renamed from: m */
    static int m23516m(int i7, List list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        int iM23517n = m23517n(list);
        return z7 ? AbstractC5110l.m23353Q(i7) + AbstractC5110l.m23337A(iM23517n) : iM23517n + (list.size() * AbstractC5110l.m23353Q(i7));
    }

    /* JADX INFO: renamed from: n */
    static int m23517n(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC5073K)) {
            int iM23385z = 0;
            while (i7 < size) {
                iM23385z += AbstractC5110l.m23385z(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iM23385z;
        }
        AbstractC5073K abstractC5073K = (AbstractC5073K) list;
        int iM23385z2 = 0;
        while (i7 < size) {
            iM23385z2 += AbstractC5110l.m23385z(abstractC5073K.m22929e(i7));
            i7++;
        }
        return iM23385z2;
    }

    /* JADX INFO: renamed from: o */
    static int m23518o(int i7, Object obj, InterfaceC5113m0 interfaceC5113m0) {
        return AbstractC5110l.m23338B(i7, (InterfaceC5082U) obj, interfaceC5113m0);
    }

    /* JADX INFO: renamed from: p */
    static int m23519p(int i7, List list, InterfaceC5113m0 interfaceC5113m0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM23353Q = AbstractC5110l.m23353Q(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            iM23353Q += AbstractC5110l.m23340D((InterfaceC5082U) list.get(i8), interfaceC5113m0);
        }
        return iM23353Q;
    }

    /* JADX INFO: renamed from: q */
    static int m23520q(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM23521r = m23521r(list);
        return z7 ? AbstractC5110l.m23353Q(i7) + AbstractC5110l.m23337A(iM23521r) : iM23521r + (size * AbstractC5110l.m23353Q(i7));
    }

    /* JADX INFO: renamed from: r */
    static int m23521r(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5061A)) {
            int iM23348L = 0;
            while (i7 < size) {
                iM23348L += AbstractC5110l.m23348L(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iM23348L;
        }
        C5061A c5061a = (C5061A) list;
        int iM23348L2 = 0;
        while (i7 < size) {
            iM23348L2 += AbstractC5110l.m23348L(c5061a.m22827p(i7));
            i7++;
        }
        return iM23348L2;
    }

    /* JADX INFO: renamed from: s */
    static int m23522s(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM23523t = m23523t(list);
        return z7 ? AbstractC5110l.m23353Q(i7) + AbstractC5110l.m23337A(iM23523t) : iM23523t + (size * AbstractC5110l.m23353Q(i7));
    }

    /* JADX INFO: renamed from: t */
    static int m23523t(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC5073K)) {
            int iM23350N = 0;
            while (i7 < size) {
                iM23350N += AbstractC5110l.m23350N(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iM23350N;
        }
        AbstractC5073K abstractC5073K = (AbstractC5073K) list;
        int iM23350N2 = 0;
        while (i7 < size) {
            iM23350N2 += AbstractC5110l.m23350N(abstractC5073K.m22929e(i7));
            i7++;
        }
        return iM23350N2;
    }

    /* JADX INFO: renamed from: u */
    static int m23524u(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int iM23353Q = AbstractC5110l.m23353Q(i7) * size;
        if (!(list instanceof InterfaceC5071I)) {
            while (i8 < size) {
                Object obj = list.get(i8);
                iM23353Q += obj instanceof AbstractC5104i ? AbstractC5110l.m23368i((AbstractC5104i) obj) : AbstractC5110l.m23352P((String) obj);
                i8++;
            }
            return iM23353Q;
        }
        InterfaceC5071I interfaceC5071I = (InterfaceC5071I) list;
        while (i8 < size) {
            Object objMo22912M = interfaceC5071I.mo22912M(i8);
            iM23353Q += objMo22912M instanceof AbstractC5104i ? AbstractC5110l.m23368i((AbstractC5104i) objMo22912M) : AbstractC5110l.m23352P((String) objMo22912M);
            i8++;
        }
        return iM23353Q;
    }

    /* JADX INFO: renamed from: v */
    static int m23525v(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM23526w = m23526w(list);
        return z7 ? AbstractC5110l.m23353Q(i7) + AbstractC5110l.m23337A(iM23526w) : iM23526w + (size * AbstractC5110l.m23353Q(i7));
    }

    /* JADX INFO: renamed from: w */
    static int m23526w(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5061A)) {
            int iM23355S = 0;
            while (i7 < size) {
                iM23355S += AbstractC5110l.m23355S(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iM23355S;
        }
        C5061A c5061a = (C5061A) list;
        int iM23355S2 = 0;
        while (i7 < size) {
            iM23355S2 += AbstractC5110l.m23355S(c5061a.m22827p(i7));
            i7++;
        }
        return iM23355S2;
    }

    /* JADX INFO: renamed from: x */
    static int m23527x(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM23528y = m23528y(list);
        return z7 ? AbstractC5110l.m23353Q(i7) + AbstractC5110l.m23337A(iM23528y) : iM23528y + (size * AbstractC5110l.m23353Q(i7));
    }

    /* JADX INFO: renamed from: y */
    static int m23528y(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC5073K)) {
            int iM23357U = 0;
            while (i7 < size) {
                iM23357U += AbstractC5110l.m23357U(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iM23357U;
        }
        AbstractC5073K abstractC5073K = (AbstractC5073K) list;
        int iM23357U2 = 0;
        while (i7 < size) {
            iM23357U2 += AbstractC5110l.m23357U(abstractC5073K.m22929e(i7));
            i7++;
        }
        return iM23357U2;
    }

    /* JADX INFO: renamed from: z */
    static Object m23529z(Object obj, int i7, List list, AbstractC5063B.c cVar, Object obj2, AbstractC5129u0 abstractC5129u0) {
        if (cVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!cVar.m22847a(iIntValue)) {
                    obj2 = m23483I(obj, i7, iIntValue, obj2, abstractC5129u0);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Integer num = (Integer) list.get(i9);
            int iIntValue2 = num.intValue();
            if (cVar.m22847a(iIntValue2)) {
                if (i9 != i8) {
                    list.set(i8, num);
                }
                i8++;
            } else {
                obj2 = m23483I(obj, i7, iIntValue2, obj2, abstractC5129u0);
            }
        }
        if (i8 != size) {
            list.subList(i8, size).clear();
        }
        return obj2;
    }
}

package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2503a0 {

    /* JADX INFO: renamed from: a */
    private static final Class f9482a = m11043A();

    /* JADX INFO: renamed from: b */
    private static final AbstractC2513f0 f9483b = m11044B();

    /* JADX INFO: renamed from: c */
    private static final AbstractC2513f0 f9484c = new C2517h0();

    /* JADX INFO: renamed from: A */
    private static Class m11043A() {
        if (C2496U.f9472d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    private static AbstractC2513f0 m11044B() {
        try {
            Class clsM11045C = m11045C();
            if (clsM11045C == null) {
                return null;
            }
            return (AbstractC2513f0) clsM11045C.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    private static Class m11045C() {
        if (C2496U.f9472d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    static void m11046D(AbstractC2527n abstractC2527n, Object obj, Object obj2) {
        C2530q c2530qMo11560c = abstractC2527n.mo11560c(obj2);
        if (c2530qMo11560c.m11587j()) {
            return;
        }
        abstractC2527n.mo11561d(obj).m11591p(c2530qMo11560c);
    }

    /* JADX INFO: renamed from: E */
    static void m11047E(InterfaceC2481E interfaceC2481E, Object obj, Object obj2, long j7) {
        AbstractC2519i0.m11414O(obj, j7, interfaceC2481E.mo10880a(AbstractC2519i0.m11442z(obj, j7), AbstractC2519i0.m11442z(obj2, j7)));
    }

    /* JADX INFO: renamed from: F */
    static void m11048F(AbstractC2513f0 abstractC2513f0, Object obj, Object obj2) {
        abstractC2513f0.mo11177p(obj, abstractC2513f0.mo11173k(abstractC2513f0.mo11169g(obj), abstractC2513f0.mo11169g(obj2)));
    }

    /* JADX INFO: renamed from: G */
    public static void m11049G(Class cls) {
        Class cls2;
        if (!AbstractC2533t.class.isAssignableFrom(cls) && !C2496U.f9472d && (cls2 = f9482a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: renamed from: H */
    static boolean m11050H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    static Object m11051I(Object obj, int i7, int i8, Object obj2, AbstractC2513f0 abstractC2513f0) {
        if (obj2 == null) {
            obj2 = abstractC2513f0.mo11168f(obj);
        }
        abstractC2513f0.mo11167e(obj2, i7, i8);
        return obj2;
    }

    /* JADX INFO: renamed from: J */
    public static AbstractC2513f0 m11052J() {
        return f9483b;
    }

    /* JADX INFO: renamed from: K */
    public static AbstractC2513f0 m11053K() {
        return f9484c;
    }

    /* JADX INFO: renamed from: L */
    public static void m11054L(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11519w(i7, list, z7);
    }

    /* JADX INFO: renamed from: M */
    public static void m11055M(int i7, List list, InterfaceC2525l0 interfaceC2525l0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11488I(i7, list);
    }

    /* JADX INFO: renamed from: N */
    public static void m11056N(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11486G(i7, list, z7);
    }

    /* JADX INFO: renamed from: O */
    public static void m11057O(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11485F(i7, list, z7);
    }

    /* JADX INFO: renamed from: P */
    public static void m11058P(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11518v(i7, list, z7);
    }

    /* JADX INFO: renamed from: Q */
    public static void m11059Q(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11515s(i7, list, z7);
    }

    /* JADX INFO: renamed from: R */
    public static void m11060R(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11495a(i7, list, z7);
    }

    /* JADX INFO: renamed from: S */
    public static void m11061S(int i7, List list, InterfaceC2525l0 interfaceC2525l0, InterfaceC2500Y interfaceC2500Y) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11490K(i7, list, interfaceC2500Y);
    }

    /* JADX INFO: renamed from: T */
    public static void m11062T(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11509m(i7, list, z7);
    }

    /* JADX INFO: renamed from: U */
    public static void m11063U(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11484E(i7, list, z7);
    }

    /* JADX INFO: renamed from: V */
    public static void m11064V(int i7, List list, InterfaceC2525l0 interfaceC2525l0, InterfaceC2500Y interfaceC2500Y) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11489J(i7, list, interfaceC2500Y);
    }

    /* JADX INFO: renamed from: W */
    public static void m11065W(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11516t(i7, list, z7);
    }

    /* JADX INFO: renamed from: X */
    public static void m11066X(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11500f(i7, list, z7);
    }

    /* JADX INFO: renamed from: Y */
    public static void m11067Y(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11482C(i7, list, z7);
    }

    /* JADX INFO: renamed from: Z */
    public static void m11068Z(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11521y(i7, list, z7);
    }

    /* JADX INFO: renamed from: a */
    static int m11069a(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC2518i.m11308O(i7) + AbstractC2518i.m11339y(size) : size * AbstractC2518i.m11317c(i7, true);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m11070a0(int i7, List list, InterfaceC2525l0 interfaceC2525l0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11506j(i7, list);
    }

    /* JADX INFO: renamed from: b */
    static int m11071b(List list) {
        return list.size();
    }

    /* JADX INFO: renamed from: b0 */
    public static void m11072b0(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11520x(i7, list, z7);
    }

    /* JADX INFO: renamed from: c */
    static int m11073c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11308O = size * AbstractC2518i.m11308O(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            iM11308O += AbstractC2518i.m11321g((AbstractC2512f) list.get(i8));
        }
        return iM11308O;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m11074c0(int i7, List list, InterfaceC2525l0 interfaceC2525l0, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2525l0.mo11502g(i7, list, z7);
    }

    /* JADX INFO: renamed from: d */
    static int m11075d(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11076e = m11076e(list);
        return z7 ? AbstractC2518i.m11308O(i7) + AbstractC2518i.m11339y(iM11076e) : iM11076e + (size * AbstractC2518i.m11308O(i7));
    }

    /* JADX INFO: renamed from: e */
    static int m11076e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11325k = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iM11325k += AbstractC2518i.m11325k(((Integer) list.get(i7)).intValue());
        }
        return iM11325k;
    }

    /* JADX INFO: renamed from: f */
    static int m11077f(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC2518i.m11308O(i7) + AbstractC2518i.m11339y(size * 4) : size * AbstractC2518i.m11326l(i7, 0);
    }

    /* JADX INFO: renamed from: g */
    static int m11078g(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: h */
    static int m11079h(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z7 ? AbstractC2518i.m11308O(i7) + AbstractC2518i.m11339y(size * 8) : size * AbstractC2518i.m11328n(i7, 0L);
    }

    /* JADX INFO: renamed from: i */
    static int m11080i(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: j */
    static int m11081j(int i7, List list, InterfaceC2500Y interfaceC2500Y) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11332r = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iM11332r += AbstractC2518i.m11332r(i7, (InterfaceC2486J) list.get(i8), interfaceC2500Y);
        }
        return iM11332r;
    }

    /* JADX INFO: renamed from: k */
    static int m11082k(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11083l = m11083l(list);
        return z7 ? AbstractC2518i.m11308O(i7) + AbstractC2518i.m11339y(iM11083l) : iM11083l + (size * AbstractC2518i.m11308O(i7));
    }

    /* JADX INFO: renamed from: l */
    static int m11083l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11336v = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iM11336v += AbstractC2518i.m11336v(((Integer) list.get(i7)).intValue());
        }
        return iM11336v;
    }

    /* JADX INFO: renamed from: m */
    static int m11084m(int i7, List list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        int iM11085n = m11085n(list);
        return z7 ? AbstractC2518i.m11308O(i7) + AbstractC2518i.m11339y(iM11085n) : iM11085n + (list.size() * AbstractC2518i.m11308O(i7));
    }

    /* JADX INFO: renamed from: n */
    static int m11085n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11338x = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iM11338x += AbstractC2518i.m11338x(((Long) list.get(i7)).longValue());
        }
        return iM11338x;
    }

    /* JADX INFO: renamed from: o */
    static int m11086o(int i7, Object obj, InterfaceC2500Y interfaceC2500Y) {
        return AbstractC2518i.m11340z(i7, (InterfaceC2486J) obj, interfaceC2500Y);
    }

    /* JADX INFO: renamed from: p */
    static int m11087p(int i7, List list, InterfaceC2500Y interfaceC2500Y) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11308O = AbstractC2518i.m11308O(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            iM11308O += AbstractC2518i.m11295B((InterfaceC2486J) list.get(i8), interfaceC2500Y);
        }
        return iM11308O;
    }

    /* JADX INFO: renamed from: q */
    static int m11088q(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11089r = m11089r(list);
        return z7 ? AbstractC2518i.m11308O(i7) + AbstractC2518i.m11339y(iM11089r) : iM11089r + (size * AbstractC2518i.m11308O(i7));
    }

    /* JADX INFO: renamed from: r */
    static int m11089r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11303J = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iM11303J += AbstractC2518i.m11303J(((Integer) list.get(i7)).intValue());
        }
        return iM11303J;
    }

    /* JADX INFO: renamed from: s */
    static int m11090s(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11091t = m11091t(list);
        return z7 ? AbstractC2518i.m11308O(i7) + AbstractC2518i.m11339y(iM11091t) : iM11091t + (size * AbstractC2518i.m11308O(i7));
    }

    /* JADX INFO: renamed from: t */
    static int m11091t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11305L = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iM11305L += AbstractC2518i.m11305L(((Long) list.get(i7)).longValue());
        }
        return iM11305L;
    }

    /* JADX INFO: renamed from: u */
    static int m11092u(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11308O = AbstractC2518i.m11308O(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            iM11308O += obj instanceof AbstractC2512f ? AbstractC2518i.m11321g((AbstractC2512f) obj) : AbstractC2518i.m11307N((String) obj);
        }
        return iM11308O;
    }

    /* JADX INFO: renamed from: v */
    static int m11093v(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11094w = m11094w(list);
        return z7 ? AbstractC2518i.m11308O(i7) + AbstractC2518i.m11339y(iM11094w) : iM11094w + (size * AbstractC2518i.m11308O(i7));
    }

    /* JADX INFO: renamed from: w */
    static int m11094w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11310Q = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iM11310Q += AbstractC2518i.m11310Q(((Integer) list.get(i7)).intValue());
        }
        return iM11310Q;
    }

    /* JADX INFO: renamed from: x */
    static int m11095x(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11096y = m11096y(list);
        return z7 ? AbstractC2518i.m11308O(i7) + AbstractC2518i.m11339y(iM11096y) : iM11096y + (size * AbstractC2518i.m11308O(i7));
    }

    /* JADX INFO: renamed from: y */
    static int m11096y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM11312S = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iM11312S += AbstractC2518i.m11312S(((Long) list.get(i7)).longValue());
        }
        return iM11312S;
    }

    /* JADX INFO: renamed from: z */
    static Object m11097z(Object obj, int i7, List list, AbstractC2534u.a aVar, Object obj2, AbstractC2513f0 abstractC2513f0) {
        if (aVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!aVar.m11644a(iIntValue)) {
                    obj2 = m11051I(obj, i7, iIntValue, obj2, abstractC2513f0);
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
            if (aVar.m11644a(iIntValue2)) {
                if (i9 != i8) {
                    list.set(i8, num);
                }
                i8++;
            } else {
                obj2 = m11051I(obj, i7, iIntValue2, obj2, abstractC2513f0);
            }
        }
        if (i8 != size) {
            list.subList(i8, size).clear();
        }
        return obj2;
    }
}

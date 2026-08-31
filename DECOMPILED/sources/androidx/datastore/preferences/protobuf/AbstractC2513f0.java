package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2513f0 {

    /* JADX INFO: renamed from: a */
    private static volatile int f9520a = 100;

    AbstractC2513f0() {
    }

    /* JADX INFO: renamed from: l */
    private final void m11162l(Object obj, InterfaceC2499X interfaceC2499X, int i7) {
        while (interfaceC2499X.mo11032w() != Integer.MAX_VALUE && m11174m(obj, interfaceC2499X, i7)) {
        }
    }

    /* JADX INFO: renamed from: a */
    abstract void mo11163a(Object obj, int i7, int i8);

    /* JADX INFO: renamed from: b */
    abstract void mo11164b(Object obj, int i7, long j7);

    /* JADX INFO: renamed from: c */
    abstract void mo11165c(Object obj, int i7, Object obj2);

    /* JADX INFO: renamed from: d */
    abstract void mo11166d(Object obj, int i7, AbstractC2512f abstractC2512f);

    /* JADX INFO: renamed from: e */
    abstract void mo11167e(Object obj, int i7, long j7);

    /* JADX INFO: renamed from: f */
    abstract Object mo11168f(Object obj);

    /* JADX INFO: renamed from: g */
    abstract Object mo11169g(Object obj);

    /* JADX INFO: renamed from: h */
    abstract int mo11170h(Object obj);

    /* JADX INFO: renamed from: i */
    abstract int mo11171i(Object obj);

    /* JADX INFO: renamed from: j */
    abstract void mo11172j(Object obj);

    /* JADX INFO: renamed from: k */
    abstract Object mo11173k(Object obj, Object obj2);

    /* JADX INFO: renamed from: m */
    final boolean m11174m(Object obj, InterfaceC2499X interfaceC2499X, int i7) throws C2535v {
        int iMo11010a = interfaceC2499X.mo11010a();
        int iM11548a = AbstractC2523k0.m11548a(iMo11010a);
        int iM11549b = AbstractC2523k0.m11549b(iMo11010a);
        if (iM11549b == 0) {
            mo11167e(obj, iM11548a, interfaceC2499X.mo11002G());
            return true;
        }
        if (iM11549b == 1) {
            mo11164b(obj, iM11548a, interfaceC2499X.mo11013d());
            return true;
        }
        if (iM11549b == 2) {
            mo11166d(obj, iM11548a, interfaceC2499X.mo11035z());
            return true;
        }
        if (iM11549b != 3) {
            if (iM11549b == 4) {
                return false;
            }
            if (iM11549b != 5) {
                throw C2535v.m11648e();
            }
            mo11163a(obj, iM11548a, interfaceC2499X.mo11017h());
            return true;
        }
        Object objMo11175n = mo11175n();
        int iM11550c = AbstractC2523k0.m11550c(iM11548a, 4);
        int i8 = i7 + 1;
        if (i8 >= f9520a) {
            throw C2535v.m11652i();
        }
        m11162l(objMo11175n, interfaceC2499X, i8);
        if (iM11550c != interfaceC2499X.mo11010a()) {
            throw C2535v.m11645b();
        }
        mo11165c(obj, iM11548a, mo11179r(objMo11175n));
        return true;
    }

    /* JADX INFO: renamed from: n */
    abstract Object mo11175n();

    /* JADX INFO: renamed from: o */
    abstract void mo11176o(Object obj, Object obj2);

    /* JADX INFO: renamed from: p */
    abstract void mo11177p(Object obj, Object obj2);

    /* JADX INFO: renamed from: q */
    abstract boolean mo11178q(InterfaceC2499X interfaceC2499X);

    /* JADX INFO: renamed from: r */
    abstract Object mo11179r(Object obj);

    /* JADX INFO: renamed from: s */
    abstract void mo11180s(Object obj, InterfaceC2525l0 interfaceC2525l0);

    /* JADX INFO: renamed from: t */
    abstract void mo11181t(Object obj, InterfaceC2525l0 interfaceC2525l0);
}

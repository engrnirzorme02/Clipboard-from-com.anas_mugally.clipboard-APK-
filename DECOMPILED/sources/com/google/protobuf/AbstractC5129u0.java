package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.u0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5129u0 {

    /* JADX INFO: renamed from: a */
    private static volatile int f19540a = 100;

    AbstractC5129u0() {
    }

    /* JADX INFO: renamed from: l */
    private final void m23619l(Object obj, InterfaceC5109k0 interfaceC5109k0, int i7) {
        while (interfaceC5109k0.mo23333w() != Integer.MAX_VALUE && m23631m(obj, interfaceC5109k0, i7)) {
        }
    }

    /* JADX INFO: renamed from: a */
    abstract void mo23620a(Object obj, int i7, int i8);

    /* JADX INFO: renamed from: b */
    abstract void mo23621b(Object obj, int i7, long j7);

    /* JADX INFO: renamed from: c */
    abstract void mo23622c(Object obj, int i7, Object obj2);

    /* JADX INFO: renamed from: d */
    abstract void mo23623d(Object obj, int i7, AbstractC5104i abstractC5104i);

    /* JADX INFO: renamed from: e */
    abstract void mo23624e(Object obj, int i7, long j7);

    /* JADX INFO: renamed from: f */
    abstract Object mo23625f(Object obj);

    /* JADX INFO: renamed from: g */
    abstract Object mo23626g(Object obj);

    /* JADX INFO: renamed from: h */
    abstract int mo23627h(Object obj);

    /* JADX INFO: renamed from: i */
    abstract int mo23628i(Object obj);

    /* JADX INFO: renamed from: j */
    abstract void mo23629j(Object obj);

    /* JADX INFO: renamed from: k */
    abstract Object mo23630k(Object obj, Object obj2);

    /* JADX INFO: renamed from: m */
    final boolean m23631m(Object obj, InterfaceC5109k0 interfaceC5109k0, int i7) throws C5065C {
        int iMo23311a = interfaceC5109k0.mo23311a();
        int iM22832a = AbstractC5062A0.m22832a(iMo23311a);
        int iM22833b = AbstractC5062A0.m22833b(iMo23311a);
        if (iM22833b == 0) {
            mo23624e(obj, iM22832a, interfaceC5109k0.mo23301G());
            return true;
        }
        if (iM22833b == 1) {
            mo23621b(obj, iM22832a, interfaceC5109k0.mo23314d());
            return true;
        }
        if (iM22833b == 2) {
            mo23623d(obj, iM22832a, interfaceC5109k0.mo23336z());
            return true;
        }
        if (iM22833b != 3) {
            if (iM22833b == 4) {
                return false;
            }
            if (iM22833b != 5) {
                throw C5065C.m22894e();
            }
            mo23620a(obj, iM22832a, interfaceC5109k0.mo23318h());
            return true;
        }
        Object objMo23632n = mo23632n();
        int iM22834c = AbstractC5062A0.m22834c(iM22832a, 4);
        int i8 = i7 + 1;
        if (i8 >= f19540a) {
            throw C5065C.m22898i();
        }
        m23619l(objMo23632n, interfaceC5109k0, i8);
        if (iM22834c != interfaceC5109k0.mo23311a()) {
            throw C5065C.m22891b();
        }
        mo23622c(obj, iM22832a, mo23636r(objMo23632n));
        return true;
    }

    /* JADX INFO: renamed from: n */
    abstract Object mo23632n();

    /* JADX INFO: renamed from: o */
    abstract void mo23633o(Object obj, Object obj2);

    /* JADX INFO: renamed from: p */
    abstract void mo23634p(Object obj, Object obj2);

    /* JADX INFO: renamed from: q */
    abstract boolean mo23635q(InterfaceC5109k0 interfaceC5109k0);

    /* JADX INFO: renamed from: r */
    abstract Object mo23636r(Object obj);

    /* JADX INFO: renamed from: s */
    abstract void mo23637s(Object obj, InterfaceC5064B0 interfaceC5064B0);

    /* JADX INFO: renamed from: t */
    abstract void mo23638t(Object obj, InterfaceC5064B0 interfaceC5064B0);
}

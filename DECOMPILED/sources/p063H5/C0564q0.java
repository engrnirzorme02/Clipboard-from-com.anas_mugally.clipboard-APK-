package p063H5;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: H5.q0 */
/* JADX INFO: loaded from: classes.dex */
final class C0564q0 extends C0565r.c {

    /* JADX INFO: renamed from: a */
    private static final Logger f2182a = Logger.getLogger(C0564q0.class.getName());

    /* JADX INFO: renamed from: b */
    static final ThreadLocal f2183b = new ThreadLocal();

    C0564q0() {
    }

    @Override // p063H5.C0565r.c
    /* JADX INFO: renamed from: a */
    public C0565r mo2499a() {
        C0565r c0565r = (C0565r) f2183b.get();
        return c0565r == null ? C0565r.f2185c : c0565r;
    }

    @Override // p063H5.C0565r.c
    /* JADX INFO: renamed from: b */
    public void mo2500b(C0565r c0565r, C0565r c0565r2) {
        if (mo2499a() != c0565r) {
            f2182a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (c0565r2 != C0565r.f2185c) {
            f2183b.set(c0565r2);
        } else {
            f2183b.set(null);
        }
    }

    @Override // p063H5.C0565r.c
    /* JADX INFO: renamed from: c */
    public C0565r mo2501c(C0565r c0565r) {
        C0565r c0565rMo2499a = mo2499a();
        f2183b.set(c0565r);
        return c0565rMo2499a;
    }
}

package p318o6;

import p173W5.InterfaceC1875e;
import p360t6.C7124h;

/* JADX INFO: renamed from: o6.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6686r {
    /* JADX INFO: renamed from: a */
    public static final void m28280a(InterfaceC6678n interfaceC6678n, InterfaceC6661e0 interfaceC6661e0) {
        m28282c(interfaceC6678n, new C6663f0(interfaceC6661e0));
    }

    /* JADX INFO: renamed from: b */
    public static final C6682p m28281b(InterfaceC1875e interfaceC1875e) {
        if (!(interfaceC1875e instanceof C7124h)) {
            return new C6682p(interfaceC1875e, 1);
        }
        C6682p c6682pM31452o = ((C7124h) interfaceC1875e).m31452o();
        if (c6682pM31452o != null) {
            if (!c6682pM31452o.m28267N()) {
                c6682pM31452o = null;
            }
            if (c6682pM31452o != null) {
                return c6682pM31452o;
            }
        }
        return new C6682p(interfaceC1875e, 2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m28282c(InterfaceC6678n interfaceC6678n, InterfaceC6676m interfaceC6676m) {
        if (!(interfaceC6678n instanceof C6682p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C6682p) interfaceC6678n).m28264H(interfaceC6676m);
    }
}

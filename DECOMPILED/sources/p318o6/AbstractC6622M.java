package p318o6;

import p145S5.AbstractC1423a;
import p173W5.InterfaceC1879i;
import p360t6.AbstractC7122f;

/* JADX INFO: renamed from: o6.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6622M {
    /* JADX INFO: renamed from: a */
    public static final void m28096a(InterfaceC1879i interfaceC1879i, Throwable th) {
        try {
            InterfaceC6620L interfaceC6620L = (InterfaceC6620L) interfaceC1879i.get(InterfaceC6620L.f24910o);
            if (interfaceC6620L != null) {
                interfaceC6620L.mo28095n(interfaceC1879i, th);
            } else {
                AbstractC7122f.m31448a(interfaceC1879i, th);
            }
        } catch (Throwable th2) {
            AbstractC7122f.m31448a(interfaceC1879i, m28097b(th, th2));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Throwable m28097b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC1423a.m6060a(runtimeException, th);
        return runtimeException;
    }
}

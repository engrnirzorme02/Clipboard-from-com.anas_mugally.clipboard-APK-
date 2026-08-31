package p318o6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: o6.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6703z0 extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient InterfaceC6701y0 f25001a;

    public C6703z0(String str, Throwable th, InterfaceC6701y0 interfaceC6701y0) {
        super(str);
        this.f25001a = interfaceC6701y0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6703z0)) {
            return false;
        }
        C6703z0 c6703z0 = (C6703z0) obj;
        return AbstractC6118n.m27183a(c6703z0.getMessage(), getMessage()) && AbstractC6118n.m27183a(c6703z0.f25001a, this.f25001a) && AbstractC6118n.m27183a(c6703z0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        AbstractC6118n.m27184b(message);
        int iHashCode = ((message.hashCode() * 31) + this.f25001a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f25001a;
    }
}

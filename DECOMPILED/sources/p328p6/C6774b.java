package p328p6;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p173W5.AbstractC1871a;
import p173W5.InterfaceC1879i;
import p318o6.InterfaceC6620L;

/* JADX INFO: renamed from: p6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6774b extends AbstractC1871a implements InterfaceC6620L {
    private volatile Object _preHandler;

    public C6774b() {
        super(InterfaceC6620L.f24910o);
        this._preHandler = this;
    }

    /* JADX INFO: renamed from: Q0 */
    private final Method m29609Q0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // p318o6.InterfaceC6620L
    /* JADX INFO: renamed from: n */
    public void mo28095n(InterfaceC1879i interfaceC1879i, Throwable th) {
        if (Build.VERSION.SDK_INT < 28) {
            Method methodM29609Q0 = m29609Q0();
            Object objInvoke = methodM29609Q0 != null ? methodM29609Q0.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}

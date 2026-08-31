package p360t6;

import java.util.Collection;
import java.util.ServiceLoader;
import p294l6.AbstractC6307h;
import p318o6.InterfaceC6620L;

/* JADX INFO: renamed from: t6.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7121e {

    /* JADX INFO: renamed from: a */
    private static final Collection f28411a = AbstractC6307h.m27249n(AbstractC6307h.m27239d(ServiceLoader.load(InterfaceC6620L.class, InterfaceC6620L.class.getClassLoader()).iterator()));

    /* JADX INFO: renamed from: a */
    public static final Collection m31446a() {
        return f28411a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m31447b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}

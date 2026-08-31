package p328p6;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1436n;

/* JADX INFO: renamed from: p6.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6779g {

    /* JADX INFO: renamed from: a */
    public static final AbstractC6778f f27220a;
    private static volatile Choreographer choreographer;

    static {
        Object objM6073b;
        try {
            C1436n.a aVar = C1436n.f4958b;
            objM6073b = C1436n.m6073b(new C6777e(m29616a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            C1436n.a aVar2 = C1436n.f4958b;
            objM6073b = C1436n.m6073b(AbstractC1437o.m6081a(th));
        }
        f27220a = (AbstractC6778f) (C1436n.m6077f(objM6073b) ? null : objM6073b);
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m29616a(Looper looper, boolean z7) throws IllegalAccessException, InvocationTargetException {
        if (!z7) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC6118n.m27185c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}

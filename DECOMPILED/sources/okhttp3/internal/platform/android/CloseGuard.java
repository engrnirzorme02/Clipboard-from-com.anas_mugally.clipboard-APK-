package okhttp3.internal.platform.android;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class CloseGuard {

    /* JADX INFO: renamed from: d */
    public static final Companion f26027d = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final Method f26028a;

    /* JADX INFO: renamed from: b */
    private final Method f26029b;

    /* JADX INFO: renamed from: c */
    private final Method f26030c;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final CloseGuard m29419a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new CloseGuard(method, method3, method2);
        }

        private Companion() {
        }
    }

    public CloseGuard(Method method, Method method2, Method method3) {
        this.f26028a = method;
        this.f26029b = method2;
        this.f26030c = method3;
    }

    /* JADX INFO: renamed from: a */
    public final Object m29417a(String closer) {
        AbstractC6118n.m27187e(closer, "closer");
        Method method = this.f26028a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = this.f26029b;
                AbstractC6118n.m27184b(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m29418b(Object obj) {
        if (obj != null) {
            try {
                Method method = this.f26030c;
                AbstractC6118n.m27184b(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}

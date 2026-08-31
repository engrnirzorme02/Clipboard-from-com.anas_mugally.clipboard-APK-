package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.i */
/* JADX INFO: loaded from: classes.dex */
final class C6094i {

    /* JADX INFO: renamed from: a */
    public static final C6094i f23851a = new C6094i();

    /* JADX INFO: renamed from: b */
    private static final a f23852b = new a(null, null, null);

    /* JADX INFO: renamed from: c */
    private static a f23853c;

    /* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.i$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        public final Method f23854a;

        /* JADX INFO: renamed from: b */
        public final Method f23855b;

        /* JADX INFO: renamed from: c */
        public final Method f23856c;

        public a(Method method, Method method2, Method method3) {
            this.f23854a = method;
            this.f23855b = method2;
            this.f23856c = method3;
        }
    }

    private C6094i() {
    }

    /* JADX INFO: renamed from: a */
    private final a m27136a(AbstractC6086a abstractC6086a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC6086a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC6086a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f23853c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f23852b;
            f23853c = aVar2;
            return aVar2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m27137b(AbstractC6086a continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        AbstractC6118n.m27187e(continuation, "continuation");
        a aVarM27136a = f23853c;
        if (aVarM27136a == null) {
            aVarM27136a = m27136a(continuation);
        }
        if (aVarM27136a != f23852b && (method = aVarM27136a.f23854a) != null && (objInvoke = method.invoke(continuation.getClass(), new Object[0])) != null && (method2 = aVarM27136a.f23855b) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = aVarM27136a.f23856c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}

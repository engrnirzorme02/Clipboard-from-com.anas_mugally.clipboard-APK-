package p105N0;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p088K6.AbstractC0764a;

/* JADX INFO: renamed from: N0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0929q {

    /* JADX INFO: renamed from: N0.q$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        static final InterfaceC0931s f3642a = AbstractC0929q.m4161a();
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC0931s m4161a() {
        try {
            return new C0932t((WebViewProviderFactoryBoundaryInterface) AbstractC0764a.m3594a(WebViewProviderFactoryBoundaryInterface.class, m4162b()));
        } catch (ClassNotFoundException unused) {
            return new C0918f();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: b */
    private static InvocationHandler m4162b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m4164d()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0931s m4163c() {
        return a.f3642a;
    }

    /* JADX INFO: renamed from: d */
    public static ClassLoader m4164d() {
        return Build.VERSION.SDK_INT >= 28 ? AbstractC0916d.m4150a() : m4165e().getClass().getClassLoader();
    }

    /* JADX INFO: renamed from: e */
    private static Object m4165e() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }
}

package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2362k0 {

    /* JADX INFO: renamed from: a */
    private static boolean f8290a;

    /* JADX INFO: renamed from: b */
    private static Method f8291b;

    /* JADX INFO: renamed from: c */
    static final boolean f8292c;

    /* JADX INFO: renamed from: androidx.appcompat.widget.k0$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m10114a(View view, Rect rect, Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    static {
        f8292c = Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: a */
    public static void m10111a(View view, Rect rect, Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.m10114a(view, rect, rect2);
            return;
        }
        if (!f8290a) {
            f8290a = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f8291b = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f8291b.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        Method method = f8291b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e7) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10112b(View view) {
        return view.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: c */
    public static void m10113c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException e7) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e8) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e8);
        }
    }
}

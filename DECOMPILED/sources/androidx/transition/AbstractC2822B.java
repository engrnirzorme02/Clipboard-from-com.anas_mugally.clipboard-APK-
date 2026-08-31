package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: androidx.transition.B */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2822B {

    /* JADX INFO: renamed from: a */
    private static boolean f11415a = true;

    /* JADX INFO: renamed from: b */
    private static Field f11416b;

    /* JADX INFO: renamed from: c */
    private static boolean f11417c;

    /* JADX INFO: renamed from: androidx.transition.B$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static float m14070a(View view) {
            return view.getTransitionAlpha();
        }

        /* JADX INFO: renamed from: b */
        static void m14071b(View view, float f7) {
            view.setTransitionAlpha(f7);
        }
    }

    AbstractC2822B() {
    }

    /* JADX INFO: renamed from: a */
    public void m14062a(View view) {
    }

    /* JADX INFO: renamed from: b */
    public float mo14063b(View view) {
        if (f11415a) {
            try {
                return a.m14070a(view);
            } catch (NoSuchMethodError unused) {
                f11415a = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: c */
    public void m14064c(View view) {
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo14065d(View view, int i7, int i8, int i9, int i10);

    /* JADX INFO: renamed from: e */
    public void mo14066e(View view, float f7) {
        if (f11415a) {
            try {
                a.m14071b(view, f7);
                return;
            } catch (NoSuchMethodError unused) {
                f11415a = false;
            }
        }
        view.setAlpha(f7);
    }

    /* JADX INFO: renamed from: f */
    public void mo14067f(View view, int i7) {
        if (!f11417c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f11416b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f11417c = true;
        }
        Field field = f11416b;
        if (field != null) {
            try {
                f11416b.setInt(view, i7 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo14068g(View view, Matrix matrix);

    /* JADX INFO: renamed from: h */
    public abstract void mo14069h(View view, Matrix matrix);
}

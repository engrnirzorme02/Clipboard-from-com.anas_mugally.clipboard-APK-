package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.F */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2826F extends AbstractC2822B {

    /* JADX INFO: renamed from: d */
    private static boolean f11418d = true;

    /* JADX INFO: renamed from: e */
    private static boolean f11419e = true;

    /* JADX INFO: renamed from: androidx.transition.F$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m14075a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        /* JADX INFO: renamed from: b */
        static void m14076b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        /* JADX INFO: renamed from: c */
        static void m14077c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    AbstractC2826F() {
    }

    @Override // androidx.transition.AbstractC2822B
    /* JADX INFO: renamed from: g */
    public void mo14068g(View view, Matrix matrix) {
        if (f11418d) {
            try {
                a.m14076b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f11418d = false;
            }
        }
    }

    @Override // androidx.transition.AbstractC2822B
    /* JADX INFO: renamed from: h */
    public void mo14069h(View view, Matrix matrix) {
        if (f11419e) {
            try {
                a.m14077c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f11419e = false;
            }
        }
    }
}

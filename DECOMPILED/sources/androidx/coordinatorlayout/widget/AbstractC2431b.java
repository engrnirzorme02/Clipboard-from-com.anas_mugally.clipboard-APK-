package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.coordinatorlayout.widget.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2431b {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f9279a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal f9280b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m10558a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m10560c(viewGroup, view, rect);
    }

    /* JADX INFO: renamed from: b */
    private static void m10559b(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m10559b(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* JADX INFO: renamed from: c */
    static void m10560c(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal threadLocal = f9279a;
        Matrix matrix = (Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m10559b(viewGroup, view, matrix);
        ThreadLocal threadLocal2 = f9280b;
        RectF rectF = (RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}

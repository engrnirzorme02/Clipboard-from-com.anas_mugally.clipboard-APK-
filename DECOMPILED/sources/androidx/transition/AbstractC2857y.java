package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.y */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2857y {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2822B f11576a;

    /* JADX INFO: renamed from: b */
    static final Property f11577b;

    /* JADX INFO: renamed from: c */
    static final Property f11578c;

    /* JADX INFO: renamed from: androidx.transition.y$a */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC2857y.m14213b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f7) {
            AbstractC2857y.m14216e(view, f7.floatValue());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.y$b */
    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f11576a = new C2831K();
        } else {
            f11576a = new C2830J();
        }
        f11577b = new a(Float.class, "translationAlpha");
        f11578c = new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: a */
    static void m14212a(View view) {
        f11576a.m14062a(view);
    }

    /* JADX INFO: renamed from: b */
    static float m14213b(View view) {
        return f11576a.mo14063b(view);
    }

    /* JADX INFO: renamed from: c */
    static void m14214c(View view) {
        f11576a.m14064c(view);
    }

    /* JADX INFO: renamed from: d */
    static void m14215d(View view, int i7, int i8, int i9, int i10) {
        f11576a.mo14065d(view, i7, i8, i9, i10);
    }

    /* JADX INFO: renamed from: e */
    static void m14216e(View view, float f7) {
        f11576a.mo14066e(view, f7);
    }

    /* JADX INFO: renamed from: f */
    static void m14217f(View view, int i7) {
        f11576a.mo14067f(view, i7);
    }

    /* JADX INFO: renamed from: g */
    static void m14218g(View view, Matrix matrix) {
        f11576a.mo14068g(view, matrix);
    }

    /* JADX INFO: renamed from: h */
    static void m14219h(View view, Matrix matrix) {
        f11576a.mo14069h(view, matrix);
    }
}

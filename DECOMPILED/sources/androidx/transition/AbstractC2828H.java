package androidx.transition;

import android.view.View;

/* JADX INFO: renamed from: androidx.transition.H */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2828H extends AbstractC2826F {

    /* JADX INFO: renamed from: f */
    private static boolean f11420f = true;

    /* JADX INFO: renamed from: androidx.transition.H$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m14079a(View view, int i7, int i8, int i9, int i10) {
            view.setLeftTopRightBottom(i7, i8, i9, i10);
        }
    }

    AbstractC2828H() {
    }

    @Override // androidx.transition.AbstractC2822B
    /* JADX INFO: renamed from: d */
    public void mo14065d(View view, int i7, int i8, int i9, int i10) {
        if (f11420f) {
            try {
                a.m14079a(view, i7, i8, i9, i10);
            } catch (NoSuchMethodError unused) {
                f11420f = false;
            }
        }
    }
}

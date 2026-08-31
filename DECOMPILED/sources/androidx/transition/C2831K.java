package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.K */
/* JADX INFO: loaded from: classes.dex */
class C2831K extends C2830J {
    C2831K() {
    }

    @Override // androidx.transition.AbstractC2822B
    /* JADX INFO: renamed from: b */
    public float mo14063b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.AbstractC2828H, androidx.transition.AbstractC2822B
    /* JADX INFO: renamed from: d */
    public void mo14065d(View view, int i7, int i8, int i9, int i10) {
        view.setLeftTopRightBottom(i7, i8, i9, i10);
    }

    @Override // androidx.transition.AbstractC2822B
    /* JADX INFO: renamed from: e */
    public void mo14066e(View view, float f7) {
        view.setTransitionAlpha(f7);
    }

    @Override // androidx.transition.C2830J, androidx.transition.AbstractC2822B
    /* JADX INFO: renamed from: f */
    public void mo14067f(View view, int i7) {
        view.setTransitionVisibility(i7);
    }

    @Override // androidx.transition.AbstractC2826F, androidx.transition.AbstractC2822B
    /* JADX INFO: renamed from: g */
    public void mo14068g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.AbstractC2826F, androidx.transition.AbstractC2822B
    /* JADX INFO: renamed from: h */
    public void mo14069h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}

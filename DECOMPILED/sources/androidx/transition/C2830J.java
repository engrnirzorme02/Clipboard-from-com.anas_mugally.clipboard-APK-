package androidx.transition;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.J */
/* JADX INFO: loaded from: classes.dex */
class C2830J extends AbstractC2828H {

    /* JADX INFO: renamed from: g */
    private static boolean f11421g = true;

    /* JADX INFO: renamed from: androidx.transition.J$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m14081a(View view, int i7) {
            view.setTransitionVisibility(i7);
        }
    }

    C2830J() {
    }

    @Override // androidx.transition.AbstractC2822B
    /* JADX INFO: renamed from: f */
    public void mo14067f(View view, int i7) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo14067f(view, i7);
        } else if (f11421g) {
            try {
                a.m14081a(view, i7);
            } catch (NoSuchMethodError unused) {
                f11421g = false;
            }
        }
    }
}

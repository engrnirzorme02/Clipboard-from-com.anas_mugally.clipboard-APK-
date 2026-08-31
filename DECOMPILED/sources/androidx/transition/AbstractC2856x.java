package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.x */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2856x {

    /* JADX INFO: renamed from: a */
    private static boolean f11575a = true;

    /* JADX INFO: renamed from: androidx.transition.x$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static int m14210a(ViewGroup viewGroup, int i7) {
            return viewGroup.getChildDrawingOrder(i7);
        }

        /* JADX INFO: renamed from: b */
        static void m14211b(ViewGroup viewGroup, boolean z7) {
            viewGroup.suppressLayout(z7);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m14208a(ViewGroup viewGroup, boolean z7) {
        if (f11575a) {
            try {
                a.m14211b(viewGroup, z7);
            } catch (NoSuchMethodError unused) {
                f11575a = false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    static void m14209b(ViewGroup viewGroup, boolean z7) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.m14211b(viewGroup, z7);
        } else {
            m14208a(viewGroup, z7);
        }
    }
}

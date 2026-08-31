package p111O;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: O.g0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1049g0 {

    /* JADX INFO: renamed from: O.g0$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static boolean m4673a(ViewParent viewParent, View view, float f7, float f8, boolean z7) {
            return viewParent.onNestedFling(view, f7, f8, z7);
        }

        /* JADX INFO: renamed from: b */
        static boolean m4674b(ViewParent viewParent, View view, float f7, float f8) {
            return viewParent.onNestedPreFling(view, f7, f8);
        }

        /* JADX INFO: renamed from: c */
        static void m4675c(ViewParent viewParent, View view, int i7, int i8, int[] iArr) {
            viewParent.onNestedPreScroll(view, i7, i8, iArr);
        }

        /* JADX INFO: renamed from: d */
        static void m4676d(ViewParent viewParent, View view, int i7, int i8, int i9, int i10) {
            viewParent.onNestedScroll(view, i7, i8, i9, i10);
        }

        /* JADX INFO: renamed from: e */
        static void m4677e(ViewParent viewParent, View view, View view2, int i7) {
            viewParent.onNestedScrollAccepted(view, view2, i7);
        }

        /* JADX INFO: renamed from: f */
        static boolean m4678f(ViewParent viewParent, View view, View view2, int i7) {
            return viewParent.onStartNestedScroll(view, view2, i7);
        }

        /* JADX INFO: renamed from: g */
        static void m4679g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4666a(ViewParent viewParent, View view, float f7, float f8, boolean z7) {
        try {
            return a.m4673a(viewParent, view, f7, f8, z7);
        } catch (AbstractMethodError e7) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4667b(ViewParent viewParent, View view, float f7, float f8) {
        try {
            return a.m4674b(viewParent, view, f7, f8);
        } catch (AbstractMethodError e7) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m4668c(ViewParent viewParent, View view, int i7, int i8, int[] iArr, int i9) {
        if (viewParent instanceof InterfaceC0987D) {
            ((InterfaceC0987D) viewParent).mo4359o(view, i7, i8, iArr, i9);
            return;
        }
        if (i9 == 0) {
            try {
                a.m4675c(viewParent, view, i7, i8, iArr);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e7);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4669d(ViewParent viewParent, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (viewParent instanceof InterfaceC0989E) {
            ((InterfaceC0989E) viewParent).mo4361j(view, i7, i8, i9, i10, i11, iArr);
            return;
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (viewParent instanceof InterfaceC0987D) {
            ((InterfaceC0987D) viewParent).mo4355k(view, i7, i8, i9, i10, i11);
            return;
        }
        if (i11 == 0) {
            try {
                a.m4676d(viewParent, view, i7, i8, i9, i10);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e7);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m4670e(ViewParent viewParent, View view, View view2, int i7, int i8) {
        if (viewParent instanceof InterfaceC0987D) {
            ((InterfaceC0987D) viewParent).mo4357m(view, view2, i7, i8);
            return;
        }
        if (i8 == 0) {
            try {
                a.m4677e(viewParent, view, view2, i7);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e7);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m4671f(ViewParent viewParent, View view, View view2, int i7, int i8) {
        if (viewParent instanceof InterfaceC0987D) {
            return ((InterfaceC0987D) viewParent).mo4356l(view, view2, i7, i8);
        }
        if (i8 != 0) {
            return false;
        }
        try {
            return a.m4678f(viewParent, view, view2, i7);
        } catch (AbstractMethodError e7) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m4672g(ViewParent viewParent, View view, int i7) {
        if (viewParent instanceof InterfaceC0987D) {
            ((InterfaceC0987D) viewParent).mo4358n(view, i7);
            return;
        }
        if (i7 == 0) {
            try {
                a.m4679g(viewParent, view);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e7);
            }
        }
    }
}

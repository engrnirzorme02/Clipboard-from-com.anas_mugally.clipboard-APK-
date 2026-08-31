package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: androidx.core.widget.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2457h {

    /* JADX INFO: renamed from: androidx.core.widget.h$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m10748a(PopupWindow popupWindow, boolean z7) {
            popupWindow.setOverlapAnchor(z7);
        }

        /* JADX INFO: renamed from: b */
        static void m10749b(PopupWindow popupWindow, int i7) {
            popupWindow.setWindowLayoutType(i7);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10745a(PopupWindow popupWindow, boolean z7) {
        a.m10748a(popupWindow, z7);
    }

    /* JADX INFO: renamed from: b */
    public static void m10746b(PopupWindow popupWindow, int i7) {
        a.m10749b(popupWindow, i7);
    }

    /* JADX INFO: renamed from: c */
    public static void m10747c(PopupWindow popupWindow, View view, int i7, int i8, int i9) {
        popupWindow.showAsDropDown(view, i7, i8, i9);
    }
}

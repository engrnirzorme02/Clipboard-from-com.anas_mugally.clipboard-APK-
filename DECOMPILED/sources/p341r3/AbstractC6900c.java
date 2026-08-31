package p341r3;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: r3.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6900c {
    /* JADX INFO: renamed from: a */
    public static void m30249a(C6898a c6898a, View view, FrameLayout frameLayout) {
        m30251c(c6898a, view, frameLayout);
        if (c6898a.m30147j() != null) {
            c6898a.m30147j().setForeground(c6898a);
        } else {
            view.getOverlay().add(c6898a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m30250b(C6898a c6898a, View view) {
        if (c6898a == null) {
            return;
        }
        if (c6898a.m30147j() != null) {
            c6898a.m30147j().setForeground(null);
        } else {
            view.getOverlay().remove(c6898a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m30251c(C6898a c6898a, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c6898a.setBounds(rect);
        c6898a.m30145M(view, frameLayout);
    }

    /* JADX INFO: renamed from: d */
    public static void m30252d(Rect rect, float f7, float f8, float f9, float f10) {
        rect.set((int) (f7 - f9), (int) (f8 - f10), (int) (f7 + f9), (int) (f8 + f10));
    }
}

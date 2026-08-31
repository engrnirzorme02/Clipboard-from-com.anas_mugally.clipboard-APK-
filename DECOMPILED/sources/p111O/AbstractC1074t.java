package p111O;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: renamed from: O.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1074t {
    /* JADX INFO: renamed from: a */
    public static void m4770a(int i7, int i8, int i9, Rect rect, Rect rect2, int i10) {
        Gravity.apply(i7, i8, i9, rect, rect2, i10);
    }

    /* JADX INFO: renamed from: b */
    public static int m4771b(int i7, int i8) {
        return Gravity.getAbsoluteGravity(i7, i8);
    }
}

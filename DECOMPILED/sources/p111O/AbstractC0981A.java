package p111O;

import android.view.MotionEvent;

/* JADX INFO: renamed from: O.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0981A {
    /* JADX INFO: renamed from: a */
    public static int m4262a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4263b(MotionEvent motionEvent, int i7) {
        return (motionEvent.getSource() & i7) == i7;
    }
}

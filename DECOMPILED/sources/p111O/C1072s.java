package p111O;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: O.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1072s {

    /* JADX INFO: renamed from: a */
    private final GestureDetector f3912a;

    public C1072s(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* JADX INFO: renamed from: a */
    public boolean m4768a(MotionEvent motionEvent) {
        return this.f3912a.onTouchEvent(motionEvent);
    }

    public C1072s(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f3912a = new GestureDetector(context, onGestureListener, handler);
    }
}

package p405z3;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: z3.a */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnTouchListenerC7610a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    private final Dialog f30279a;

    /* JADX INFO: renamed from: b */
    private final int f30280b;

    /* JADX INFO: renamed from: c */
    private final int f30281c;

    /* JADX INFO: renamed from: d */
    private final int f30282d;

    public ViewOnTouchListenerC7610a(Dialog dialog, Rect rect) {
        this.f30279a = dialog;
        this.f30280b = rect.left;
        this.f30281c = rect.top;
        this.f30282d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f30280b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f30281c + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i7 = this.f30282d;
            motionEventObtain.setLocation((-i7) - 1, (-i7) - 1);
        }
        view.performClick();
        return this.f30279a.onTouchEvent(motionEventObtain);
    }
}

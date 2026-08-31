package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.internal.ads.zzbbn;

/* JADX INFO: renamed from: com.google.android.material.appbar.c */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4400c extends AbstractC4402e {

    /* JADX INFO: renamed from: d */
    private Runnable f16345d;

    /* JADX INFO: renamed from: e */
    OverScroller f16346e;

    /* JADX INFO: renamed from: f */
    private boolean f16347f;

    /* JADX INFO: renamed from: r */
    private int f16348r;

    /* JADX INFO: renamed from: s */
    private int f16349s;

    /* JADX INFO: renamed from: t */
    private int f16350t;

    /* JADX INFO: renamed from: u */
    private VelocityTracker f16351u;

    /* JADX INFO: renamed from: com.google.android.material.appbar.c$a */
    private class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final CoordinatorLayout f16352a;

        /* JADX INFO: renamed from: b */
        private final View f16353b;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f16352a = coordinatorLayout;
            this.f16353b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f16353b == null || (overScroller = AbstractC4400c.this.f16346e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                AbstractC4400c.this.mo19476R(this.f16352a, this.f16353b);
                return;
            }
            AbstractC4400c abstractC4400c = AbstractC4400c.this;
            abstractC4400c.m19522T(this.f16352a, this.f16353b, abstractC4400c.f16346e.getCurrY());
            this.f16353b.postOnAnimation(this);
        }
    }

    public AbstractC4400c() {
        this.f16348r = -1;
        this.f16350t = -1;
    }

    /* JADX INFO: renamed from: M */
    private void m19519M() {
        if (this.f16351u == null) {
            this.f16351u = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: H */
    public boolean mo10499H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z7;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f16351u;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f16351u.computeCurrentVelocity(zzbbn.zzq.zzf);
                m19520N(coordinatorLayout, view, -mo19474P(view), 0, this.f16351u.getYVelocity(this.f16348r));
                z7 = true;
            }
            this.f16347f = false;
            this.f16348r = -1;
            velocityTracker = this.f16351u;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f16351u = null;
            }
            velocityTracker2 = this.f16351u;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f16347f) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f16348r);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y7 = (int) motionEvent.getY(iFindPointerIndex);
            int i7 = this.f16349s - y7;
            this.f16349s = y7;
            m19521S(coordinatorLayout, view, i7, mo19473O(view), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i8 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f16348r = motionEvent.getPointerId(i8);
                this.f16349s = (int) (motionEvent.getY(i8) + 0.5f);
            }
        }
        z7 = false;
        velocityTracker2 = this.f16351u;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f16347f || z7;
        z7 = false;
        this.f16347f = false;
        this.f16348r = -1;
        velocityTracker = this.f16351u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16351u = null;
        }
        velocityTracker2 = this.f16351u;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f16347f) {
        }
    }

    /* JADX INFO: renamed from: L */
    abstract boolean mo19472L(View view);

    /* JADX INFO: renamed from: N */
    final boolean m19520N(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, float f7) {
        Runnable runnable = this.f16345d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f16345d = null;
        }
        if (this.f16346e == null) {
            this.f16346e = new OverScroller(view.getContext());
        }
        this.f16346e.fling(0, mo19496I(), 0, Math.round(f7), 0, 0, i7, i8);
        if (!this.f16346e.computeScrollOffset()) {
            mo19476R(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f16345d = aVar;
        view.postOnAnimation(aVar);
        return true;
    }

    /* JADX INFO: renamed from: O */
    abstract int mo19473O(View view);

    /* JADX INFO: renamed from: P */
    abstract int mo19474P(View view);

    /* JADX INFO: renamed from: Q */
    abstract int mo19475Q();

    /* JADX INFO: renamed from: R */
    abstract void mo19476R(CoordinatorLayout coordinatorLayout, View view);

    /* JADX INFO: renamed from: S */
    final int m19521S(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9) {
        return mo19477U(coordinatorLayout, view, mo19475Q() - i7, i8, i9);
    }

    /* JADX INFO: renamed from: T */
    int m19522T(CoordinatorLayout coordinatorLayout, View view, int i7) {
        return mo19477U(coordinatorLayout, view, i7, Integer.MIN_VALUE, C3553a.e.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: U */
    abstract int mo19477U(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2423c
    /* JADX INFO: renamed from: o */
    public boolean mo10510o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f16350t < 0) {
            this.f16350t = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f16347f) {
            int i7 = this.f16348r;
            if (i7 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i7)) == -1) {
                return false;
            }
            int y7 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y7 - this.f16349s) > this.f16350t) {
                this.f16349s = y7;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f16348r = -1;
            int x7 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            boolean z7 = mo19472L(view) && coordinatorLayout.m10473F(view, x7, y8);
            this.f16347f = z7;
            if (z7) {
                this.f16349s = y8;
                this.f16348r = motionEvent.getPointerId(0);
                m19519M();
                OverScroller overScroller = this.f16346e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f16346e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f16351u;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public AbstractC4400c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16348r = -1;
        this.f16350t = -1;
    }
}

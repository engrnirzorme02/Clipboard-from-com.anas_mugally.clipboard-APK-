package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p295m.InterfaceC6318e;

/* JADX INFO: renamed from: androidx.appcompat.widget.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2318P implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    private final float f7950a;

    /* JADX INFO: renamed from: b */
    private final int f7951b;

    /* JADX INFO: renamed from: c */
    private final int f7952c;

    /* JADX INFO: renamed from: d */
    final View f7953d;

    /* JADX INFO: renamed from: e */
    private Runnable f7954e;

    /* JADX INFO: renamed from: f */
    private Runnable f7955f;

    /* JADX INFO: renamed from: r */
    private boolean f7956r;

    /* JADX INFO: renamed from: s */
    private int f7957s;

    /* JADX INFO: renamed from: t */
    private final int[] f7958t = new int[2];

    /* JADX INFO: renamed from: androidx.appcompat.widget.P$a */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC2318P.this.f7953d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.P$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC2318P.this.m9806e();
        }
    }

    public AbstractViewOnTouchListenerC2318P(View view) {
        this.f7953d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f7950a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f7951b = tapTimeout;
        this.f7952c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX INFO: renamed from: a */
    private void m9799a() {
        Runnable runnable = this.f7955f;
        if (runnable != null) {
            this.f7953d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f7954e;
        if (runnable2 != null) {
            this.f7953d.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m9800f(MotionEvent motionEvent) {
        C2316N c2316n;
        View view = this.f7953d;
        InterfaceC6318e interfaceC6318eMo9419b = mo9419b();
        if (interfaceC6318eMo9419b != null && interfaceC6318eMo9419b.mo9453a() && (c2316n = (C2316N) interfaceC6318eMo9419b.mo9457k()) != null && c2316n.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            m9803i(view, motionEventObtainNoHistory);
            m9804j(c2316n, motionEventObtainNoHistory);
            boolean zMo9787e = c2316n.mo9787e(motionEventObtainNoHistory, this.f7957s);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z7 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zMo9787e && z7) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX INFO: renamed from: g */
    private boolean m9801g(MotionEvent motionEvent) {
        View view = this.f7953d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7957s = motionEvent.getPointerId(0);
            if (this.f7954e == null) {
                this.f7954e = new a();
            }
            view.postDelayed(this.f7954e, this.f7951b);
            if (this.f7955f == null) {
                this.f7955f = new b();
            }
            view.postDelayed(this.f7955f, this.f7952c);
        } else if (actionMasked == 1) {
            m9799a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f7957s);
            if (iFindPointerIndex >= 0 && !m9802h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f7950a)) {
                m9799a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            m9799a();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m9802h(View view, float f7, float f8, float f9) {
        float f10 = -f9;
        return f7 >= f10 && f8 >= f10 && f7 < ((float) (view.getRight() - view.getLeft())) + f9 && f8 < ((float) (view.getBottom() - view.getTop())) + f9;
    }

    /* JADX INFO: renamed from: i */
    private boolean m9803i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f7958t;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* JADX INFO: renamed from: j */
    private boolean m9804j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f7958t;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC6318e mo9419b();

    /* JADX INFO: renamed from: c */
    protected abstract boolean mo9420c();

    /* JADX INFO: renamed from: d */
    protected boolean mo9805d() {
        InterfaceC6318e interfaceC6318eMo9419b = mo9419b();
        if (interfaceC6318eMo9419b == null || !interfaceC6318eMo9419b.mo9453a()) {
            return true;
        }
        interfaceC6318eMo9419b.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: e */
    void m9806e() {
        m9799a();
        View view = this.f7953d;
        if (view.isEnabled() && !view.isLongClickable() && mo9420c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f7956r = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z7;
        boolean z8 = this.f7956r;
        if (z8) {
            z7 = m9800f(motionEvent) || !mo9805d();
        } else {
            z7 = m9801g(motionEvent) && mo9420c();
            if (z7) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f7953d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f7956r = z7;
        return z7 || z8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f7956r = false;
        this.f7957s = -1;
        Runnable runnable = this.f7954e;
        if (runnable != null) {
            this.f7953d.removeCallbacks(runnable);
        }
    }
}

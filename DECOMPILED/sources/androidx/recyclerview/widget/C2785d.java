package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import p111O.AbstractC1030Z;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d */
/* JADX INFO: loaded from: classes.dex */
class C2785d extends RecyclerView.AbstractC2764o implements RecyclerView.InterfaceC2769t {

    /* JADX INFO: renamed from: D */
    private static final int[] f11105D = {R.attr.state_pressed};

    /* JADX INFO: renamed from: E */
    private static final int[] f11106E = new int[0];

    /* JADX INFO: renamed from: A */
    int f11107A;

    /* JADX INFO: renamed from: B */
    private final Runnable f11108B;

    /* JADX INFO: renamed from: C */
    private final RecyclerView.AbstractC2770u f11109C;

    /* JADX INFO: renamed from: a */
    private final int f11110a;

    /* JADX INFO: renamed from: b */
    private final int f11111b;

    /* JADX INFO: renamed from: c */
    final StateListDrawable f11112c;

    /* JADX INFO: renamed from: d */
    final Drawable f11113d;

    /* JADX INFO: renamed from: e */
    private final int f11114e;

    /* JADX INFO: renamed from: f */
    private final int f11115f;

    /* JADX INFO: renamed from: g */
    private final StateListDrawable f11116g;

    /* JADX INFO: renamed from: h */
    private final Drawable f11117h;

    /* JADX INFO: renamed from: i */
    private final int f11118i;

    /* JADX INFO: renamed from: j */
    private final int f11119j;

    /* JADX INFO: renamed from: k */
    int f11120k;

    /* JADX INFO: renamed from: l */
    int f11121l;

    /* JADX INFO: renamed from: m */
    float f11122m;

    /* JADX INFO: renamed from: n */
    int f11123n;

    /* JADX INFO: renamed from: o */
    int f11124o;

    /* JADX INFO: renamed from: p */
    float f11125p;

    /* JADX INFO: renamed from: s */
    private RecyclerView f11128s;

    /* JADX INFO: renamed from: z */
    final ValueAnimator f11135z;

    /* JADX INFO: renamed from: q */
    private int f11126q = 0;

    /* JADX INFO: renamed from: r */
    private int f11127r = 0;

    /* JADX INFO: renamed from: t */
    private boolean f11129t = false;

    /* JADX INFO: renamed from: u */
    private boolean f11130u = false;

    /* JADX INFO: renamed from: v */
    private int f11131v = 0;

    /* JADX INFO: renamed from: w */
    private int f11132w = 0;

    /* JADX INFO: renamed from: x */
    private final int[] f11133x = new int[2];

    /* JADX INFO: renamed from: y */
    private final int[] f11134y = new int[2];

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2785d.this.m13736s(500);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$b */
    class b extends RecyclerView.AbstractC2770u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2770u
        /* JADX INFO: renamed from: b */
        public void mo13489b(RecyclerView recyclerView, int i7, int i8) {
            C2785d.this.m13734D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$c */
    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        private boolean f11138a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11138a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f11138a) {
                this.f11138a = false;
                return;
            }
            if (((Float) C2785d.this.f11135z.getAnimatedValue()).floatValue() == 0.0f) {
                C2785d c2785d = C2785d.this;
                c2785d.f11107A = 0;
                c2785d.m13732A(0);
            } else {
                C2785d c2785d2 = C2785d.this;
                c2785d2.f11107A = 2;
                c2785d2.m13739x();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C2785d.this.f11112c.setAlpha(iFloatValue);
            C2785d.this.f11113d.setAlpha(iFloatValue);
            C2785d.this.m13739x();
        }
    }

    C2785d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i8, int i9) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f11135z = valueAnimatorOfFloat;
        this.f11107A = 0;
        this.f11108B = new a();
        this.f11109C = new b();
        this.f11112c = stateListDrawable;
        this.f11113d = drawable;
        this.f11116g = stateListDrawable2;
        this.f11117h = drawable2;
        this.f11114e = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.f11115f = Math.max(i7, drawable.getIntrinsicWidth());
        this.f11118i = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.f11119j = Math.max(i7, drawable2.getIntrinsicWidth());
        this.f11110a = i8;
        this.f11111b = i9;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        m13735l(recyclerView);
    }

    /* JADX INFO: renamed from: B */
    private void m13720B() {
        this.f11128s.m13174h(this);
        this.f11128s.m13180k(this);
        this.f11128s.m13182l(this.f11109C);
    }

    /* JADX INFO: renamed from: E */
    private void m13721E(float f7) {
        int[] iArrM13727r = m13727r();
        float fMax = Math.max(iArrM13727r[0], Math.min(iArrM13727r[1], f7));
        if (Math.abs(this.f11121l - fMax) < 2.0f) {
            return;
        }
        int iM13731z = m13731z(this.f11122m, fMax, iArrM13727r, this.f11128s.computeVerticalScrollRange(), this.f11128s.computeVerticalScrollOffset(), this.f11127r);
        if (iM13731z != 0) {
            this.f11128s.scrollBy(0, iM13731z);
        }
        this.f11122m = fMax;
    }

    /* JADX INFO: renamed from: m */
    private void m13722m() {
        this.f11128s.removeCallbacks(this.f11108B);
    }

    /* JADX INFO: renamed from: n */
    private void m13723n() {
        this.f11128s.m13160Y0(this);
        this.f11128s.m13165a1(this);
        this.f11128s.m13167b1(this.f11109C);
        m13722m();
    }

    /* JADX INFO: renamed from: o */
    private void m13724o(Canvas canvas) {
        int i7 = this.f11127r;
        int i8 = this.f11118i;
        int i9 = i7 - i8;
        int i10 = this.f11124o;
        int i11 = this.f11123n;
        int i12 = i10 - (i11 / 2);
        this.f11116g.setBounds(0, 0, i11, i8);
        this.f11117h.setBounds(0, 0, this.f11126q, this.f11119j);
        canvas.translate(0.0f, i9);
        this.f11117h.draw(canvas);
        canvas.translate(i12, 0.0f);
        this.f11116g.draw(canvas);
        canvas.translate(-i12, -i9);
    }

    /* JADX INFO: renamed from: p */
    private void m13725p(Canvas canvas) {
        int i7 = this.f11126q;
        int i8 = this.f11114e;
        int i9 = i7 - i8;
        int i10 = this.f11121l;
        int i11 = this.f11120k;
        int i12 = i10 - (i11 / 2);
        this.f11112c.setBounds(0, 0, i8, i11);
        this.f11113d.setBounds(0, 0, this.f11115f, this.f11127r);
        if (!m13729u()) {
            canvas.translate(i9, 0.0f);
            this.f11113d.draw(canvas);
            canvas.translate(0.0f, i12);
            this.f11112c.draw(canvas);
            canvas.translate(-i9, -i12);
            return;
        }
        this.f11113d.draw(canvas);
        canvas.translate(this.f11114e, i12);
        canvas.scale(-1.0f, 1.0f);
        this.f11112c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f11114e, -i12);
    }

    /* JADX INFO: renamed from: q */
    private int[] m13726q() {
        int[] iArr = this.f11134y;
        int i7 = this.f11111b;
        iArr[0] = i7;
        iArr[1] = this.f11126q - i7;
        return iArr;
    }

    /* JADX INFO: renamed from: r */
    private int[] m13727r() {
        int[] iArr = this.f11133x;
        int i7 = this.f11111b;
        iArr[0] = i7;
        iArr[1] = this.f11127r - i7;
        return iArr;
    }

    /* JADX INFO: renamed from: t */
    private void m13728t(float f7) {
        int[] iArrM13726q = m13726q();
        float fMax = Math.max(iArrM13726q[0], Math.min(iArrM13726q[1], f7));
        if (Math.abs(this.f11124o - fMax) < 2.0f) {
            return;
        }
        int iM13731z = m13731z(this.f11125p, fMax, iArrM13726q, this.f11128s.computeHorizontalScrollRange(), this.f11128s.computeHorizontalScrollOffset(), this.f11126q);
        if (iM13731z != 0) {
            this.f11128s.scrollBy(iM13731z, 0);
        }
        this.f11125p = fMax;
    }

    /* JADX INFO: renamed from: u */
    private boolean m13729u() {
        return AbstractC1030Z.m4505z(this.f11128s) == 1;
    }

    /* JADX INFO: renamed from: y */
    private void m13730y(int i7) {
        m13722m();
        this.f11128s.postDelayed(this.f11108B, i7);
    }

    /* JADX INFO: renamed from: z */
    private int m13731z(float f7, float f8, int[] iArr, int i7, int i8, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 == 0) {
            return 0;
        }
        int i11 = i7 - i9;
        int i12 = (int) (((f8 - f7) / i10) * i11);
        int i13 = i8 + i12;
        if (i13 >= i11 || i13 < 0) {
            return 0;
        }
        return i12;
    }

    /* JADX INFO: renamed from: A */
    void m13732A(int i7) {
        if (i7 == 2 && this.f11131v != 2) {
            this.f11112c.setState(f11105D);
            m13722m();
        }
        if (i7 == 0) {
            m13739x();
        } else {
            m13733C();
        }
        if (this.f11131v == 2 && i7 != 2) {
            this.f11112c.setState(f11106E);
            m13730y(1200);
        } else if (i7 == 1) {
            m13730y(1500);
        }
        this.f11131v = i7;
    }

    /* JADX INFO: renamed from: C */
    public void m13733C() {
        int i7 = this.f11107A;
        if (i7 != 0) {
            if (i7 != 3) {
                return;
            } else {
                this.f11135z.cancel();
            }
        }
        this.f11107A = 1;
        ValueAnimator valueAnimator = this.f11135z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f11135z.setDuration(500L);
        this.f11135z.setStartDelay(0L);
        this.f11135z.start();
    }

    /* JADX INFO: renamed from: D */
    void m13734D(int i7, int i8) {
        int iComputeVerticalScrollRange = this.f11128s.computeVerticalScrollRange();
        int i9 = this.f11127r;
        this.f11129t = iComputeVerticalScrollRange - i9 > 0 && i9 >= this.f11110a;
        int iComputeHorizontalScrollRange = this.f11128s.computeHorizontalScrollRange();
        int i10 = this.f11126q;
        boolean z7 = iComputeHorizontalScrollRange - i10 > 0 && i10 >= this.f11110a;
        this.f11130u = z7;
        boolean z8 = this.f11129t;
        if (!z8 && !z7) {
            if (this.f11131v != 0) {
                m13732A(0);
                return;
            }
            return;
        }
        if (z8) {
            float f7 = i9;
            this.f11121l = (int) ((f7 * (i8 + (f7 / 2.0f))) / iComputeVerticalScrollRange);
            this.f11120k = Math.min(i9, (i9 * i9) / iComputeVerticalScrollRange);
        }
        if (this.f11130u) {
            float f8 = i10;
            this.f11124o = (int) ((f8 * (i7 + (f8 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f11123n = Math.min(i10, (i10 * i10) / iComputeHorizontalScrollRange);
        }
        int i11 = this.f11131v;
        if (i11 == 0 || i11 == 1) {
            m13732A(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2769t
    /* JADX INFO: renamed from: a */
    public void mo13485a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f11131v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM13738w = m13738w(motionEvent.getX(), motionEvent.getY());
            boolean zM13737v = m13737v(motionEvent.getX(), motionEvent.getY());
            if (zM13738w || zM13737v) {
                if (zM13737v) {
                    this.f11132w = 1;
                    this.f11125p = (int) motionEvent.getX();
                } else if (zM13738w) {
                    this.f11132w = 2;
                    this.f11122m = (int) motionEvent.getY();
                }
                m13732A(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f11131v == 2) {
            this.f11122m = 0.0f;
            this.f11125p = 0.0f;
            m13732A(1);
            this.f11132w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f11131v == 2) {
            m13733C();
            if (this.f11132w == 1) {
                m13728t(motionEvent.getX());
            }
            if (this.f11132w == 2) {
                m13721E(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2769t
    /* JADX INFO: renamed from: c */
    public boolean mo13486c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i7 = this.f11131v;
        if (i7 != 1) {
            return i7 == 2;
        }
        boolean zM13738w = m13738w(motionEvent.getX(), motionEvent.getY());
        boolean zM13737v = m13737v(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zM13738w && !zM13737v)) {
            return false;
        }
        if (zM13737v) {
            this.f11132w = 1;
            this.f11125p = (int) motionEvent.getX();
        } else if (zM13738w) {
            this.f11132w = 2;
            this.f11122m = (int) motionEvent.getY();
        }
        m13732A(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2769t
    /* JADX INFO: renamed from: e */
    public void mo13487e(boolean z7) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2764o
    /* JADX INFO: renamed from: k */
    public void mo13369k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C2746B c2746b) {
        if (this.f11126q != this.f11128s.getWidth() || this.f11127r != this.f11128s.getHeight()) {
            this.f11126q = this.f11128s.getWidth();
            this.f11127r = this.f11128s.getHeight();
            m13732A(0);
        } else if (this.f11107A != 0) {
            if (this.f11129t) {
                m13725p(canvas);
            }
            if (this.f11130u) {
                m13724o(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m13735l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f11128s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m13723n();
        }
        this.f11128s = recyclerView;
        if (recyclerView != null) {
            m13720B();
        }
    }

    /* JADX INFO: renamed from: s */
    void m13736s(int i7) {
        int i8 = this.f11107A;
        if (i8 == 1) {
            this.f11135z.cancel();
        } else if (i8 != 2) {
            return;
        }
        this.f11107A = 3;
        ValueAnimator valueAnimator = this.f11135z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f11135z.setDuration(i7);
        this.f11135z.start();
    }

    /* JADX INFO: renamed from: v */
    boolean m13737v(float f7, float f8) {
        if (f8 < this.f11127r - this.f11118i) {
            return false;
        }
        int i7 = this.f11124o;
        int i8 = this.f11123n;
        return f7 >= ((float) (i7 - (i8 / 2))) && f7 <= ((float) (i7 + (i8 / 2)));
    }

    /* JADX INFO: renamed from: w */
    boolean m13738w(float f7, float f8) {
        if (m13729u()) {
            if (f7 > this.f11114e) {
                return false;
            }
        } else if (f7 < this.f11126q - this.f11114e) {
            return false;
        }
        int i7 = this.f11121l;
        int i8 = this.f11120k;
        return f8 >= ((float) (i7 - (i8 / 2))) && f8 <= ((float) (i7 + (i8 / 2)));
    }

    /* JADX INFO: renamed from: x */
    void m13739x() {
        this.f11128s.invalidate();
    }
}

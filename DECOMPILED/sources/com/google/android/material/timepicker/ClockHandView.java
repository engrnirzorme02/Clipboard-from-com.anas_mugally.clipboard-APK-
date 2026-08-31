package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.internal.AbstractC4546v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p021C3.AbstractC0141a;
import p029D3.AbstractC0196h;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p333q3.AbstractC6826a;

/* JADX INFO: loaded from: classes2.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: A */
    private float f18160A;

    /* JADX INFO: renamed from: B */
    private boolean f18161B;

    /* JADX INFO: renamed from: C */
    private double f18162C;

    /* JADX INFO: renamed from: D */
    private int f18163D;

    /* JADX INFO: renamed from: E */
    private int f18164E;

    /* JADX INFO: renamed from: a */
    private final int f18165a;

    /* JADX INFO: renamed from: b */
    private final TimeInterpolator f18166b;

    /* JADX INFO: renamed from: c */
    private final ValueAnimator f18167c;

    /* JADX INFO: renamed from: d */
    private boolean f18168d;

    /* JADX INFO: renamed from: e */
    private float f18169e;

    /* JADX INFO: renamed from: f */
    private float f18170f;

    /* JADX INFO: renamed from: r */
    private boolean f18171r;

    /* JADX INFO: renamed from: s */
    private final int f18172s;

    /* JADX INFO: renamed from: t */
    private boolean f18173t;

    /* JADX INFO: renamed from: u */
    private final List f18174u;

    /* JADX INFO: renamed from: v */
    private final int f18175v;

    /* JADX INFO: renamed from: w */
    private final float f18176w;

    /* JADX INFO: renamed from: x */
    private final Paint f18177x;

    /* JADX INFO: renamed from: y */
    private final RectF f18178y;

    /* JADX INFO: renamed from: z */
    private final int f18179z;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$a */
    class C4663a extends AnimatorListenerAdapter {
        C4663a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$b */
    public interface InterfaceC4664b {
        /* JADX INFO: renamed from: a */
        void mo21764a(float f7, boolean z7);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6742c.f26218C);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21765a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.m21773p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* JADX INFO: renamed from: c */
    private void m21766c(float f7, float f8) {
        this.f18164E = AbstractC0141a.m610b((float) (getWidth() / 2), (float) (getHeight() / 2), f7, f8) > ((float) m21769h(2)) + AbstractC4546v.m20828c(getContext(), 12) ? 1 : 2;
    }

    /* JADX INFO: renamed from: d */
    private void m21767d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iM21769h = m21769h(this.f18164E);
        float f7 = width;
        float f8 = iM21769h;
        float fCos = (((float) Math.cos(this.f18162C)) * f8) + f7;
        float f9 = height;
        float fSin = (f8 * ((float) Math.sin(this.f18162C))) + f9;
        this.f18177x.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f18175v, this.f18177x);
        double dSin = Math.sin(this.f18162C);
        double dCos = Math.cos(this.f18162C);
        double d7 = iM21769h - this.f18175v;
        this.f18177x.setStrokeWidth(this.f18179z);
        canvas.drawLine(f7, f9, width + ((int) (dCos * d7)), height + ((int) (d7 * dSin)), this.f18177x);
        canvas.drawCircle(f7, f9, this.f18176w, this.f18177x);
    }

    /* JADX INFO: renamed from: f */
    private int m21768f(float f7, float f8) {
        int degrees = (int) Math.toDegrees(Math.atan2(f8 - (getHeight() / 2), f7 - (getWidth() / 2)));
        int i7 = degrees + 90;
        return i7 < 0 ? degrees + 450 : i7;
    }

    /* JADX INFO: renamed from: h */
    private int m21769h(int i7) {
        return i7 == 2 ? Math.round(this.f18163D * 0.66f) : this.f18163D;
    }

    /* JADX INFO: renamed from: j */
    private Pair m21770j(float f7) {
        float fM21776g = m21776g();
        if (Math.abs(fM21776g - f7) > 180.0f) {
            if (fM21776g > 180.0f && f7 < 180.0f) {
                f7 += 360.0f;
            }
            if (fM21776g < 180.0f && f7 > 180.0f) {
                fM21776g += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fM21776g), Float.valueOf(f7));
    }

    /* JADX INFO: renamed from: k */
    private boolean m21771k(float f7, float f8, boolean z7, boolean z8, boolean z9) {
        float fM21768f = m21768f(f7, f8);
        boolean z10 = false;
        boolean z11 = m21776g() != fM21768f;
        if (z8 && z11) {
            return true;
        }
        if (!z11 && !z7) {
            return false;
        }
        if (z9 && this.f18168d) {
            z10 = true;
        }
        m21780o(fM21768f, z10);
        return true;
    }

    /* JADX INFO: renamed from: l */
    private void m21772l() {
        this.f18167c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.m21765a(this.f18191a, valueAnimator);
            }
        });
        this.f18167c.addListener(new C4663a());
    }

    /* JADX INFO: renamed from: p */
    private void m21773p(float f7, boolean z7) {
        float f8 = f7 % 360.0f;
        this.f18160A = f8;
        this.f18162C = Math.toRadians(f8 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM21769h = m21769h(this.f18164E);
        float fCos = width + (((float) Math.cos(this.f18162C)) * fM21769h);
        float fSin = height + (fM21769h * ((float) Math.sin(this.f18162C)));
        RectF rectF = this.f18178y;
        int i7 = this.f18175v;
        rectF.set(fCos - i7, fSin - i7, fCos + i7, fSin + i7);
        Iterator it = this.f18174u.iterator();
        while (it.hasNext()) {
            ((InterfaceC4664b) it.next()).mo21764a(f8, z7);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public void m21774b(InterfaceC4664b interfaceC4664b) {
        this.f18174u.add(interfaceC4664b);
    }

    /* JADX INFO: renamed from: e */
    public RectF m21775e() {
        return this.f18178y;
    }

    /* JADX INFO: renamed from: g */
    public float m21776g() {
        return this.f18160A;
    }

    /* JADX INFO: renamed from: i */
    public int m21777i() {
        return this.f18175v;
    }

    /* JADX INFO: renamed from: m */
    public void m21778m(int i7) {
        this.f18163D = i7;
        invalidate();
    }

    /* JADX INFO: renamed from: n */
    public void m21779n(float f7) {
        m21780o(f7, false);
    }

    /* JADX INFO: renamed from: o */
    public void m21780o(float f7, boolean z7) {
        this.f18167c.cancel();
        if (!z7) {
            m21773p(f7, false);
            return;
        }
        Pair pairM21770j = m21770j(f7);
        this.f18167c.setFloatValues(((Float) pairM21770j.first).floatValue(), ((Float) pairM21770j.second).floatValue());
        this.f18167c.setDuration(this.f18165a);
        this.f18167c.setInterpolator(this.f18166b);
        this.f18167c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m21767d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (this.f18167c.isRunning()) {
            return;
        }
        m21779n(m21776g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        boolean z8;
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f18169e = x7;
            this.f18170f = y7;
            this.f18171r = true;
            this.f18161B = false;
            z7 = true;
            z8 = false;
            z9 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i7 = (int) (x7 - this.f18169e);
            int i8 = (int) (y7 - this.f18170f);
            this.f18171r = (i7 * i7) + (i8 * i8) > this.f18172s;
            z8 = this.f18161B;
            boolean z10 = actionMasked == 1;
            if (this.f18173t) {
                m21766c(x7, y7);
            }
            z9 = z10;
            z7 = false;
        } else {
            z8 = false;
            z7 = false;
            z9 = false;
        }
        this.f18161B |= m21771k(x7, y7, z8, z7, z9);
        return true;
    }

    /* JADX INFO: renamed from: q */
    void m21781q(boolean z7) {
        if (this.f18173t && !z7) {
            this.f18164E = 1;
        }
        this.f18173t = z7;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f18167c = new ValueAnimator();
        this.f18174u = new ArrayList();
        Paint paint = new Paint();
        this.f18177x = paint;
        this.f18178y = new RectF();
        this.f18164E = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6752m.f26696M1, i7, AbstractC6751l.f26533G);
        this.f18165a = AbstractC0196h.m978f(context, AbstractC6742c.f26224I, 200);
        this.f18166b = AbstractC0196h.m979g(context, AbstractC6742c.f26234S, AbstractC6826a.f27405b);
        this.f18163D = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6752m.f26718O1, 0);
        this.f18175v = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC6752m.f26729P1, 0);
        Resources resources = getResources();
        this.f18179z = resources.getDimensionPixelSize(AbstractC6744e.f26308D);
        this.f18176w = resources.getDimensionPixelSize(AbstractC6744e.f26304B);
        int color = typedArrayObtainStyledAttributes.getColor(AbstractC6752m.f26707N1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m21779n(0.0f);
        this.f18172s = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        m21772l();
    }
}

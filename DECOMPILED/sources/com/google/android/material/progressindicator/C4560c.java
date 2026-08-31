package com.google.android.material.progressindicator;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import androidx.vectordrawable.graphics.drawable.AbstractC2860b;
import com.google.android.material.progressindicator.C4560c;
import p029D3.AbstractC0196h;
import p065I.AbstractC0577a;
import p224d0.AbstractC5205i;
import p224d0.C5207k;
import p224d0.C5208l;
import p325p3.AbstractC6742c;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C4560c extends AbstractC4561d {

    /* JADX INFO: renamed from: N */
    private static final AbstractC5205i f17469N = new a("indicatorLevel");

    /* JADX INFO: renamed from: C */
    private AbstractC4562e f17470C;

    /* JADX INFO: renamed from: D */
    private final C5208l f17471D;

    /* JADX INFO: renamed from: E */
    private final C5207k f17472E;

    /* JADX INFO: renamed from: F */
    private final AbstractC4562e.a f17473F;

    /* JADX INFO: renamed from: G */
    private float f17474G;

    /* JADX INFO: renamed from: H */
    private boolean f17475H;

    /* JADX INFO: renamed from: I */
    private final ValueAnimator f17476I;

    /* JADX INFO: renamed from: J */
    private ValueAnimator f17477J;

    /* JADX INFO: renamed from: K */
    private TimeInterpolator f17478K;

    /* JADX INFO: renamed from: L */
    private TimeInterpolator f17479L;

    /* JADX INFO: renamed from: M */
    private TimeInterpolator f17480M;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.c$a */
    class a extends AbstractC5205i {
        a(String str) {
            super(str);
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo2742a(C4560c c4560c) {
            return c4560c.m20904D() * 10000.0f;
        }

        @Override // p224d0.AbstractC5205i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo2743b(C4560c c4560c, float f7) {
            c4560c.m20908J(f7 / 10000.0f);
            c4560c.m20906F((int) f7);
        }
    }

    C4560c(Context context, final AbstractC4559b abstractC4559b, AbstractC4562e abstractC4562e) {
        super(context, abstractC4559b);
        this.f17475H = false;
        m20915H(abstractC4562e);
        AbstractC4562e.a aVar = new AbstractC4562e.a();
        this.f17473F = aVar;
        aVar.f17512h = true;
        C5208l c5208l = new C5208l();
        this.f17471D = c5208l;
        c5208l.m24090f(1.0f);
        c5208l.m24092h(50.0f);
        C5207k c5207k = new C5207k(this, f17469N);
        this.f17472E = c5207k;
        c5207k.m24083q(c5208l);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f17476I = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: E3.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C4560c.m20909v(this.f1530a, abstractC4559b, valueAnimator2);
            }
        });
        if (abstractC4559b.m20897b(true) && abstractC4559b.f17467m != 0) {
            valueAnimator.start();
        }
        m20940p(1.0f);
    }

    /* JADX INFO: renamed from: A */
    static C4560c m20902A(Context context, C4568k c4568k, C4565h c4565h) {
        return new C4560c(context, c4568k, c4565h);
    }

    /* JADX INFO: renamed from: B */
    private float m20903B(int i7) {
        float f7 = i7;
        return (f7 < 1000.0f || f7 > 9000.0f) ? 0.0f : 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public float m20904D() {
        return this.f17473F.f17506b;
    }

    /* JADX INFO: renamed from: E */
    private void m20905E() {
        if (this.f17477J != null) {
            return;
        }
        Context context = this.f17483a;
        int i7 = AbstractC6742c.f26236U;
        TimeInterpolator timeInterpolator = AbstractC6826a.f27404a;
        this.f17479L = AbstractC0196h.m979g(context, i7, timeInterpolator);
        this.f17480M = AbstractC0196h.m979g(this.f17483a, AbstractC6742c.f26232Q, timeInterpolator);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f17477J = valueAnimator;
        valueAnimator.setDuration(500L);
        this.f17477J.setFloatValues(0.0f, 1.0f);
        this.f17477J.setInterpolator(null);
        this.f17477J.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: E3.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C4560c c4560c = this.f1532a;
                c4560c.f17473F.f17509e = c4560c.f17478K.getInterpolation(c4560c.f17477J.getAnimatedFraction());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m20906F(int i7) {
        if (this.f17484b.m20897b(true)) {
            m20905E();
            float fM20903B = m20903B(i7);
            if (fM20903B == this.f17474G) {
                if (this.f17477J.isRunning()) {
                    return;
                }
                m20907G(fM20903B);
                return;
            }
            if (this.f17477J.isRunning()) {
                this.f17477J.cancel();
            }
            this.f17474G = fM20903B;
            if (fM20903B == 1.0f) {
                this.f17478K = this.f17479L;
                this.f17477J.start();
            } else {
                this.f17478K = this.f17480M;
                this.f17477J.reverse();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    private void m20907G(float f7) {
        this.f17473F.f17509e = f7;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public void m20908J(float f7) {
        this.f17473F.f17506b = f7;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m20909v(C4560c c4560c, AbstractC4559b abstractC4559b, ValueAnimator valueAnimator) {
        c4560c.getClass();
        if (abstractC4559b.m20897b(true) && abstractC4559b.f17467m != 0 && c4560c.isVisible()) {
            c4560c.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: C */
    AbstractC4562e m20914C() {
        return this.f17470C;
    }

    /* JADX INFO: renamed from: H */
    void m20915H(AbstractC4562e abstractC4562e) {
        this.f17470C = abstractC4562e;
    }

    /* JADX INFO: renamed from: I */
    void m20916I(boolean z7) {
        if (z7 && !this.f17476I.isRunning()) {
            this.f17476I.start();
        } else {
            if (z7 || !this.f17476I.isRunning()) {
                return;
            }
            this.f17476I.cancel();
        }
    }

    /* JADX INFO: renamed from: K */
    void m20917K(float f7) {
        setLevel((int) (f7 * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f17482A)) {
            canvas.save();
            this.f17470C.m20950h(canvas, getBounds(), m20938h(), mo20920m(), mo20919l());
            this.f17473F.f17510f = m20939i();
            this.f17496y.setStyle(Paint.Style.FILL);
            this.f17496y.setAntiAlias(true);
            AbstractC4562e.a aVar = this.f17473F;
            AbstractC4559b abstractC4559b = this.f17484b;
            aVar.f17507c = abstractC4559b.f17459e[0];
            int iM2540a = abstractC4559b.f17463i;
            if (iM2540a > 0) {
                if (!(this.f17470C instanceof C4565h)) {
                    iM2540a = (int) ((iM2540a * AbstractC0577a.m2540a(m20904D(), 0.0f, 0.01f)) / 0.01f);
                }
                this.f17470C.mo20946d(canvas, this.f17496y, m20904D(), 1.0f, this.f17484b.f17460f, getAlpha(), iM2540a);
            } else {
                this.f17470C.mo20946d(canvas, this.f17496y, 0.0f, 1.0f, abstractC4559b.f17460f, getAlpha(), 0);
            }
            this.f17470C.mo20945c(canvas, this.f17496y, this.f17473F, getAlpha());
            this.f17470C.mo20944b(canvas, this.f17496y, this.f17484b.f17459e[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f17470C.mo20947e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f17470C.mo20948f();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo20918j() {
        return super.mo20918j();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f17472E.m24084r();
        m20908J(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ boolean mo20919l() {
        return super.mo20919l();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo20920m() {
        return super.mo20920m();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: o */
    public /* bridge */ /* synthetic */ void mo20921o(AbstractC2860b abstractC2860b) {
        super.mo20921o(abstractC2860b);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i7) {
        float fM20903B = m20903B(i7);
        if (!this.f17475H) {
            this.f17472E.m24048i(m20904D() * 10000.0f);
            this.f17472E.m24080m(i7);
            return true;
        }
        this.f17472E.m24084r();
        m20908J(i7 / 10000.0f);
        m20907G(fM20903B);
        return true;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ boolean mo20922s(boolean z7, boolean z8, boolean z9) {
        return super.mo20922s(z7, z8, z9);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i7) {
        super.setAlpha(i7);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z7, boolean z8) {
        return super.setVisible(z7, z8);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: t */
    boolean mo20923t(boolean z7, boolean z8, boolean z9) {
        boolean zMo20923t = super.mo20923t(z7, z8, z9);
        float fM1613a = this.f17485c.m1613a(this.f17483a.getContentResolver());
        if (fM1613a == 0.0f) {
            this.f17475H = true;
            return zMo20923t;
        }
        this.f17475H = false;
        this.f17471D.m24092h(50.0f / fM1613a);
        return zMo20923t;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ boolean mo20924u(AbstractC2860b abstractC2860b) {
        return super.mo20924u(abstractC2860b);
    }
}

package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p104N.AbstractC0910g;
import p272j0.C5824b;

/* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b */
/* JADX INFO: loaded from: classes.dex */
public class C2820b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: r */
    private static final Interpolator f11381r = new LinearInterpolator();

    /* JADX INFO: renamed from: s */
    private static final Interpolator f11382s = new C5824b();

    /* JADX INFO: renamed from: t */
    private static final int[] f11383t = {-16777216};

    /* JADX INFO: renamed from: a */
    private final c f11384a;

    /* JADX INFO: renamed from: b */
    private float f11385b;

    /* JADX INFO: renamed from: c */
    private Resources f11386c;

    /* JADX INFO: renamed from: d */
    private Animator f11387d;

    /* JADX INFO: renamed from: e */
    float f11388e;

    /* JADX INFO: renamed from: f */
    boolean f11389f;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$a */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f11390a;

        a(c cVar) {
            this.f11390a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C2820b.this.m14033n(fFloatValue, this.f11390a);
            C2820b.this.m14025b(fFloatValue, this.f11390a, false);
            C2820b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$b */
    class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f11392a;

        b(c cVar) {
            this.f11392a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C2820b.this.m14025b(1.0f, this.f11392a, true);
            this.f11392a.m14034A();
            this.f11392a.m14046l();
            C2820b c2820b = C2820b.this;
            if (!c2820b.f11389f) {
                c2820b.f11388e += 1.0f;
                return;
            }
            c2820b.f11389f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f11392a.m14058x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2820b.this.f11388e = 0.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        final RectF f11394a = new RectF();

        /* JADX INFO: renamed from: b */
        final Paint f11395b;

        /* JADX INFO: renamed from: c */
        final Paint f11396c;

        /* JADX INFO: renamed from: d */
        final Paint f11397d;

        /* JADX INFO: renamed from: e */
        float f11398e;

        /* JADX INFO: renamed from: f */
        float f11399f;

        /* JADX INFO: renamed from: g */
        float f11400g;

        /* JADX INFO: renamed from: h */
        float f11401h;

        /* JADX INFO: renamed from: i */
        int[] f11402i;

        /* JADX INFO: renamed from: j */
        int f11403j;

        /* JADX INFO: renamed from: k */
        float f11404k;

        /* JADX INFO: renamed from: l */
        float f11405l;

        /* JADX INFO: renamed from: m */
        float f11406m;

        /* JADX INFO: renamed from: n */
        boolean f11407n;

        /* JADX INFO: renamed from: o */
        Path f11408o;

        /* JADX INFO: renamed from: p */
        float f11409p;

        /* JADX INFO: renamed from: q */
        float f11410q;

        /* JADX INFO: renamed from: r */
        int f11411r;

        /* JADX INFO: renamed from: s */
        int f11412s;

        /* JADX INFO: renamed from: t */
        int f11413t;

        /* JADX INFO: renamed from: u */
        int f11414u;

        c() {
            Paint paint = new Paint();
            this.f11395b = paint;
            Paint paint2 = new Paint();
            this.f11396c = paint2;
            Paint paint3 = new Paint();
            this.f11397d = paint3;
            this.f11398e = 0.0f;
            this.f11399f = 0.0f;
            this.f11400g = 0.0f;
            this.f11401h = 5.0f;
            this.f11409p = 1.0f;
            this.f11413t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* JADX INFO: renamed from: A */
        void m14034A() {
            this.f11404k = this.f11398e;
            this.f11405l = this.f11399f;
            this.f11406m = this.f11400g;
        }

        /* JADX INFO: renamed from: a */
        void m14035a(Canvas canvas, Rect rect) {
            RectF rectF = this.f11394a;
            float f7 = this.f11410q;
            float fMin = (this.f11401h / 2.0f) + f7;
            if (f7 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f11411r * this.f11409p) / 2.0f, this.f11401h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f8 = this.f11398e;
            float f9 = this.f11400g;
            float f10 = (f8 + f9) * 360.0f;
            float f11 = ((this.f11399f + f9) * 360.0f) - f10;
            this.f11395b.setColor(this.f11414u);
            this.f11395b.setAlpha(this.f11413t);
            float f12 = this.f11401h / 2.0f;
            rectF.inset(f12, f12);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f11397d);
            float f13 = -f12;
            rectF.inset(f13, f13);
            canvas.drawArc(rectF, f10, f11, false, this.f11395b);
            m14036b(canvas, f10, f11, rectF);
        }

        /* JADX INFO: renamed from: b */
        void m14036b(Canvas canvas, float f7, float f8, RectF rectF) {
            if (this.f11407n) {
                Path path = this.f11408o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f11408o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f9 = (this.f11411r * this.f11409p) / 2.0f;
                this.f11408o.moveTo(0.0f, 0.0f);
                this.f11408o.lineTo(this.f11411r * this.f11409p, 0.0f);
                Path path3 = this.f11408o;
                float f10 = this.f11411r;
                float f11 = this.f11409p;
                path3.lineTo((f10 * f11) / 2.0f, this.f11412s * f11);
                this.f11408o.offset((fMin + rectF.centerX()) - f9, rectF.centerY() + (this.f11401h / 2.0f));
                this.f11408o.close();
                this.f11396c.setColor(this.f11414u);
                this.f11396c.setAlpha(this.f11413t);
                canvas.save();
                canvas.rotate(f7 + f8, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f11408o, this.f11396c);
                canvas.restore();
            }
        }

        /* JADX INFO: renamed from: c */
        int m14037c() {
            return this.f11413t;
        }

        /* JADX INFO: renamed from: d */
        float m14038d() {
            return this.f11399f;
        }

        /* JADX INFO: renamed from: e */
        int m14039e() {
            return this.f11402i[m14040f()];
        }

        /* JADX INFO: renamed from: f */
        int m14040f() {
            return (this.f11403j + 1) % this.f11402i.length;
        }

        /* JADX INFO: renamed from: g */
        float m14041g() {
            return this.f11398e;
        }

        /* JADX INFO: renamed from: h */
        int m14042h() {
            return this.f11402i[this.f11403j];
        }

        /* JADX INFO: renamed from: i */
        float m14043i() {
            return this.f11405l;
        }

        /* JADX INFO: renamed from: j */
        float m14044j() {
            return this.f11406m;
        }

        /* JADX INFO: renamed from: k */
        float m14045k() {
            return this.f11404k;
        }

        /* JADX INFO: renamed from: l */
        void m14046l() {
            m14054t(m14040f());
        }

        /* JADX INFO: renamed from: m */
        void m14047m() {
            this.f11404k = 0.0f;
            this.f11405l = 0.0f;
            this.f11406m = 0.0f;
            m14059y(0.0f);
            m14056v(0.0f);
            m14057w(0.0f);
        }

        /* JADX INFO: renamed from: n */
        void m14048n(int i7) {
            this.f11413t = i7;
        }

        /* JADX INFO: renamed from: o */
        void m14049o(float f7, float f8) {
            this.f11411r = (int) f7;
            this.f11412s = (int) f8;
        }

        /* JADX INFO: renamed from: p */
        void m14050p(float f7) {
            if (f7 != this.f11409p) {
                this.f11409p = f7;
            }
        }

        /* JADX INFO: renamed from: q */
        void m14051q(float f7) {
            this.f11410q = f7;
        }

        /* JADX INFO: renamed from: r */
        void m14052r(int i7) {
            this.f11414u = i7;
        }

        /* JADX INFO: renamed from: s */
        void m14053s(ColorFilter colorFilter) {
            this.f11395b.setColorFilter(colorFilter);
        }

        /* JADX INFO: renamed from: t */
        void m14054t(int i7) {
            this.f11403j = i7;
            this.f11414u = this.f11402i[i7];
        }

        /* JADX INFO: renamed from: u */
        void m14055u(int[] iArr) {
            this.f11402i = iArr;
            m14054t(0);
        }

        /* JADX INFO: renamed from: v */
        void m14056v(float f7) {
            this.f11399f = f7;
        }

        /* JADX INFO: renamed from: w */
        void m14057w(float f7) {
            this.f11400g = f7;
        }

        /* JADX INFO: renamed from: x */
        void m14058x(boolean z7) {
            if (this.f11407n != z7) {
                this.f11407n = z7;
            }
        }

        /* JADX INFO: renamed from: y */
        void m14059y(float f7) {
            this.f11398e = f7;
        }

        /* JADX INFO: renamed from: z */
        void m14060z(float f7) {
            this.f11401h = f7;
            this.f11395b.setStrokeWidth(f7);
        }
    }

    public C2820b(Context context) {
        this.f11386c = ((Context) AbstractC0910g.m4139g(context)).getResources();
        c cVar = new c();
        this.f11384a = cVar;
        cVar.m14055u(f11383t);
        m14031k(2.5f);
        m14024m();
    }

    /* JADX INFO: renamed from: a */
    private void m14020a(float f7, c cVar) {
        m14033n(f7, cVar);
        float fFloor = (float) (Math.floor(cVar.m14044j() / 0.8f) + 1.0d);
        cVar.m14059y(cVar.m14045k() + (((cVar.m14043i() - 0.01f) - cVar.m14045k()) * f7));
        cVar.m14056v(cVar.m14043i());
        cVar.m14057w(cVar.m14044j() + ((fFloor - cVar.m14044j()) * f7));
    }

    /* JADX INFO: renamed from: c */
    private int m14021c(float f7, int i7, int i8) {
        int i9 = (i7 >> 24) & 255;
        int i10 = (i7 >> 16) & 255;
        int i11 = (i7 >> 8) & 255;
        int i12 = i7 & 255;
        return ((i9 + ((int) ((((i8 >> 24) & 255) - i9) * f7))) << 24) | ((i10 + ((int) ((((i8 >> 16) & 255) - i10) * f7))) << 16) | ((i11 + ((int) ((((i8 >> 8) & 255) - i11) * f7))) << 8) | (i12 + ((int) (f7 * ((i8 & 255) - i12))));
    }

    /* JADX INFO: renamed from: h */
    private void m14022h(float f7) {
        this.f11385b = f7;
    }

    /* JADX INFO: renamed from: i */
    private void m14023i(float f7, float f8, float f9, float f10) {
        c cVar = this.f11384a;
        float f11 = this.f11386c.getDisplayMetrics().density;
        cVar.m14060z(f8 * f11);
        cVar.m14051q(f7 * f11);
        cVar.m14054t(0);
        cVar.m14049o(f9 * f11, f10 * f11);
    }

    /* JADX INFO: renamed from: m */
    private void m14024m() {
        c cVar = this.f11384a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f11381r);
        valueAnimatorOfFloat.addListener(new b(cVar));
        this.f11387d = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: b */
    void m14025b(float f7, c cVar, boolean z7) {
        float interpolation;
        float interpolation2;
        if (this.f11389f) {
            m14020a(f7, cVar);
            return;
        }
        if (f7 != 1.0f || z7) {
            float fM14044j = cVar.m14044j();
            if (f7 < 0.5f) {
                interpolation = cVar.m14045k();
                interpolation2 = (f11382s.getInterpolation(f7 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fM14045k = cVar.m14045k() + 0.79f;
                interpolation = fM14045k - (((1.0f - f11382s.getInterpolation((f7 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fM14045k;
            }
            float f8 = fM14044j + (0.20999998f * f7);
            float f9 = (f7 + this.f11388e) * 216.0f;
            cVar.m14059y(interpolation);
            cVar.m14056v(interpolation2);
            cVar.m14057w(f8);
            m14022h(f9);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m14026d(boolean z7) {
        this.f11384a.m14058x(z7);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f11385b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f11384a.m14035a(canvas, bounds);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m14027e(float f7) {
        this.f11384a.m14050p(f7);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: f */
    public void m14028f(int... iArr) {
        this.f11384a.m14055u(iArr);
        this.f11384a.m14054t(0);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public void m14029g(float f7) {
        this.f11384a.m14057w(f7);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f11384a.m14037c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f11387d.isRunning();
    }

    /* JADX INFO: renamed from: j */
    public void m14030j(float f7, float f8) {
        this.f11384a.m14059y(f7);
        this.f11384a.m14056v(f8);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m14031k(float f7) {
        this.f11384a.m14060z(f7);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: l */
    public void m14032l(int i7) {
        if (i7 == 0) {
            m14023i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m14023i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: n */
    void m14033n(float f7, c cVar) {
        if (f7 > 0.75f) {
            cVar.m14052r(m14021c((f7 - 0.75f) / 0.25f, cVar.m14042h(), cVar.m14039e()));
        } else {
            cVar.m14052r(cVar.m14042h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f11384a.m14048n(i7);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11384a.m14053s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f11387d.cancel();
        this.f11384a.m14034A();
        if (this.f11384a.m14038d() != this.f11384a.m14041g()) {
            this.f11389f = true;
            this.f11387d.setDuration(666L);
            this.f11387d.start();
        } else {
            this.f11384a.m14054t(0);
            this.f11384a.m14047m();
            this.f11387d.setDuration(1332L);
            this.f11387d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f11387d.cancel();
        m14022h(0.0f);
        this.f11384a.m14058x(false);
        this.f11384a.m14054t(0);
        this.f11384a.m14047m();
        invalidateSelf();
    }
}

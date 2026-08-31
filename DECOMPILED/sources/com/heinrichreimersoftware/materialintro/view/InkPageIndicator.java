package com.heinrichreimersoftware.materialintro.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.AbstractC2870b;
import java.util.Arrays;
import p007A5.AbstractC0036i;
import p031D5.AbstractC0218a;

/* JADX INFO: loaded from: classes.dex */
public class InkPageIndicator extends View implements AbstractC2870b.j, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: A */
    private float f19664A;

    /* JADX INFO: renamed from: B */
    private boolean f19665B;

    /* JADX INFO: renamed from: C */
    private float[] f19666C;

    /* JADX INFO: renamed from: D */
    private float[] f19667D;

    /* JADX INFO: renamed from: E */
    private float f19668E;

    /* JADX INFO: renamed from: F */
    private float f19669F;

    /* JADX INFO: renamed from: G */
    private float[] f19670G;

    /* JADX INFO: renamed from: H */
    private boolean f19671H;

    /* JADX INFO: renamed from: I */
    private boolean f19672I;

    /* JADX INFO: renamed from: J */
    private final Paint f19673J;

    /* JADX INFO: renamed from: K */
    private final Paint f19674K;

    /* JADX INFO: renamed from: L */
    private final Path f19675L;

    /* JADX INFO: renamed from: M */
    private final Path f19676M;

    /* JADX INFO: renamed from: N */
    private final Path f19677N;

    /* JADX INFO: renamed from: O */
    private final Path f19678O;

    /* JADX INFO: renamed from: P */
    private final RectF f19679P;

    /* JADX INFO: renamed from: Q */
    private C5150f f19680Q;

    /* JADX INFO: renamed from: R */
    private C5151g[] f19681R;

    /* JADX INFO: renamed from: S */
    private final Interpolator f19682S;

    /* JADX INFO: renamed from: T */
    float f19683T;

    /* JADX INFO: renamed from: U */
    float f19684U;

    /* JADX INFO: renamed from: V */
    float f19685V;

    /* JADX INFO: renamed from: W */
    float f19686W;

    /* JADX INFO: renamed from: a */
    private int f19687a;

    /* JADX INFO: renamed from: a0 */
    float f19688a0;

    /* JADX INFO: renamed from: b */
    private int f19689b;

    /* JADX INFO: renamed from: b0 */
    float f19690b0;

    /* JADX INFO: renamed from: c */
    private long f19691c;

    /* JADX INFO: renamed from: c0 */
    float f19692c0;

    /* JADX INFO: renamed from: d */
    private int f19693d;

    /* JADX INFO: renamed from: d0 */
    float f19694d0;

    /* JADX INFO: renamed from: e */
    private int f19695e;

    /* JADX INFO: renamed from: e0 */
    private boolean f19696e0;

    /* JADX INFO: renamed from: f */
    private float f19697f;

    /* JADX INFO: renamed from: r */
    private float f19698r;

    /* JADX INFO: renamed from: s */
    private long f19699s;

    /* JADX INFO: renamed from: t */
    private float f19700t;

    /* JADX INFO: renamed from: u */
    private float f19701u;

    /* JADX INFO: renamed from: v */
    private float f19702v;

    /* JADX INFO: renamed from: w */
    private AbstractC2870b f19703w;

    /* JADX INFO: renamed from: x */
    private int f19704x;

    /* JADX INFO: renamed from: y */
    private int f19705y;

    /* JADX INFO: renamed from: z */
    private int f19706z;

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$a */
    class C5145a extends DataSetObserver {
        C5145a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            InkPageIndicator inkPageIndicator = InkPageIndicator.this;
            inkPageIndicator.setPageCount(inkPageIndicator.f19703w.getAdapter().mo684c());
            InkPageIndicator.this.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$b */
    class C5146b extends AnimatorListenerAdapter {
        C5146b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InkPageIndicator.this.m23876D();
            InkPageIndicator.this.f19672I = false;
        }
    }

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$c */
    class C5147c implements ValueAnimator.AnimatorUpdateListener {
        C5147c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            InkPageIndicator.this.f19664A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InkPageIndicator.this.f19680Q.m23905a(InkPageIndicator.this.f19664A);
            InkPageIndicator.this.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$d */
    class C5148d extends AnimatorListenerAdapter {
        C5148d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InkPageIndicator.this.f19665B = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            InkPageIndicator.this.f19665B = false;
        }
    }

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$e */
    public class C5149e extends AbstractC5154j {
        public C5149e(float f7) {
            super(f7);
        }

        @Override // com.heinrichreimersoftware.materialintro.view.InkPageIndicator.AbstractC5154j
        /* JADX INFO: renamed from: a */
        boolean mo23903a(float f7) {
            return f7 < this.f19732a;
        }
    }

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$f */
    public class C5150f extends AbstractC5152h {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InkPageIndicator f19712d;

        /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$f$a */
        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InkPageIndicator f19713a;

            a(InkPageIndicator inkPageIndicator) {
                this.f19713a = inkPageIndicator;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5150f.this.f19712d.f19668E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C5150f.this.f19712d.postInvalidateOnAnimation();
                for (C5151g c5151g : C5150f.this.f19712d.f19681R) {
                    c5151g.m23905a(C5150f.this.f19712d.f19668E);
                }
            }
        }

        /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$f$b */
        class b implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InkPageIndicator f19715a;

            b(InkPageIndicator inkPageIndicator) {
                this.f19715a = inkPageIndicator;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5150f.this.f19712d.f19669F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C5150f.this.f19712d.postInvalidateOnAnimation();
                for (C5151g c5151g : C5150f.this.f19712d.f19681R) {
                    c5151g.m23905a(C5150f.this.f19712d.f19669F);
                }
            }
        }

        /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$f$c */
        class c extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InkPageIndicator f19717a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int[] f19718b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ float f19719c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ float f19720d;

            c(InkPageIndicator inkPageIndicator, int[] iArr, float f7, float f8) {
                this.f19717a = inkPageIndicator;
                this.f19718b = iArr;
                this.f19719c = f7;
                this.f19720d = f8;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C5150f.this.f19712d.f19668E = -1.0f;
                C5150f.this.f19712d.f19669F = -1.0f;
                C5150f.this.f19712d.postInvalidateOnAnimation();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C5150f.this.f19712d.m23901y();
                for (int i7 : this.f19718b) {
                    C5150f.this.f19712d.m23878F(i7, 1.0E-5f);
                }
                C5150f.this.f19712d.f19668E = this.f19719c;
                C5150f.this.f19712d.f19669F = this.f19720d;
                C5150f.this.f19712d.postInvalidateOnAnimation();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5150f(InkPageIndicator inkPageIndicator, int i7, int i8, int i9, AbstractC5154j abstractC5154j) {
            float fMin;
            float f7;
            float f8;
            float f9;
            float fMax;
            float f10;
            float f11;
            float f12;
            super(abstractC5154j);
            int i10 = 0;
            this.f19712d = inkPageIndicator;
            setDuration(inkPageIndicator.f19699s);
            setInterpolator(inkPageIndicator.f19682S);
            if (i8 > i7) {
                fMin = Math.min(inkPageIndicator.f19666C[i7], inkPageIndicator.f19664A);
                f7 = inkPageIndicator.f19697f;
            } else {
                fMin = inkPageIndicator.f19666C[i8];
                f7 = inkPageIndicator.f19697f;
            }
            float f13 = fMin - f7;
            if (i8 > i7) {
                f8 = inkPageIndicator.f19666C[i8];
                f9 = inkPageIndicator.f19697f;
            } else {
                f8 = inkPageIndicator.f19666C[i8];
                f9 = inkPageIndicator.f19697f;
            }
            float f14 = f8 - f9;
            if (i8 > i7) {
                fMax = inkPageIndicator.f19666C[i8];
                f10 = inkPageIndicator.f19697f;
            } else {
                fMax = Math.max(inkPageIndicator.f19666C[i7], inkPageIndicator.f19664A);
                f10 = inkPageIndicator.f19697f;
            }
            float f15 = fMax + f10;
            if (i8 > i7) {
                f11 = inkPageIndicator.f19666C[i8];
                f12 = inkPageIndicator.f19697f;
            } else {
                f11 = inkPageIndicator.f19666C[i8];
                f12 = inkPageIndicator.f19697f;
            }
            float f16 = f11 + f12;
            inkPageIndicator.f19681R = new C5151g[i9];
            int[] iArr = new int[i9];
            if (f13 != f14) {
                setFloatValues(f13, f14);
                while (i10 < i9) {
                    int i11 = i7 + i10;
                    inkPageIndicator.f19681R[i10] = inkPageIndicator.new C5151g(i11, inkPageIndicator.new C5153i(inkPageIndicator.f19666C[i11]));
                    iArr[i10] = i11;
                    i10++;
                }
                addUpdateListener(new a(inkPageIndicator));
            } else {
                setFloatValues(f15, f16);
                while (i10 < i9) {
                    int i12 = i7 - i10;
                    inkPageIndicator.f19681R[i10] = inkPageIndicator.new C5151g(i12, inkPageIndicator.new C5149e(inkPageIndicator.f19666C[i12]));
                    iArr[i10] = i12;
                    i10++;
                }
                addUpdateListener(new b(inkPageIndicator));
            }
            addListener(new c(inkPageIndicator, iArr, f13, f15));
        }
    }

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$g */
    public class C5151g extends AbstractC5152h {

        /* JADX INFO: renamed from: d */
        private int f19722d;

        /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$g$a */
        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InkPageIndicator f19724a;

            a(InkPageIndicator inkPageIndicator) {
                this.f19724a = inkPageIndicator;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5151g c5151g = C5151g.this;
                InkPageIndicator.this.m23878F(c5151g.f19722d, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$g$b */
        class b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InkPageIndicator f19726a;

            b(InkPageIndicator inkPageIndicator) {
                this.f19726a = inkPageIndicator;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C5151g c5151g = C5151g.this;
                InkPageIndicator.this.m23878F(c5151g.f19722d, 0.0f);
                InkPageIndicator.this.postInvalidateOnAnimation();
            }
        }

        public C5151g(int i7, AbstractC5154j abstractC5154j) {
            super(abstractC5154j);
            setFloatValues(1.0E-5f, 1.0f);
            this.f19722d = i7;
            setDuration(InkPageIndicator.this.f19699s);
            setInterpolator(InkPageIndicator.this.f19682S);
            addUpdateListener(new a(InkPageIndicator.this));
            addListener(new b(InkPageIndicator.this));
        }
    }

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$h */
    public abstract class AbstractC5152h extends ValueAnimator {

        /* JADX INFO: renamed from: a */
        protected boolean f19728a = false;

        /* JADX INFO: renamed from: b */
        protected AbstractC5154j f19729b;

        public AbstractC5152h(AbstractC5154j abstractC5154j) {
            this.f19729b = abstractC5154j;
        }

        /* JADX INFO: renamed from: a */
        public void m23905a(float f7) {
            if (this.f19728a || !this.f19729b.mo23903a(f7)) {
                return;
            }
            start();
            this.f19728a = true;
        }
    }

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$i */
    public class C5153i extends AbstractC5154j {
        public C5153i(float f7) {
            super(f7);
        }

        @Override // com.heinrichreimersoftware.materialintro.view.InkPageIndicator.AbstractC5154j
        /* JADX INFO: renamed from: a */
        boolean mo23903a(float f7) {
            return f7 > this.f19732a;
        }
    }

    /* JADX INFO: renamed from: com.heinrichreimersoftware.materialintro.view.InkPageIndicator$j */
    public abstract class AbstractC5154j {

        /* JADX INFO: renamed from: a */
        protected float f19732a;

        public AbstractC5154j(float f7) {
            this.f19732a = f7;
        }

        /* JADX INFO: renamed from: a */
        abstract boolean mo23903a(float f7);
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: A */
    private void m23873A(Canvas canvas) {
        canvas.drawCircle(this.f19664A, this.f19701u, this.f19697f, this.f19674K);
    }

    /* JADX INFO: renamed from: B */
    private void m23874B(Canvas canvas) {
        this.f19675L.rewind();
        int i7 = 0;
        while (true) {
            int i8 = i7;
            int i9 = this.f19704x;
            if (i8 >= i9) {
                break;
            }
            int i10 = i8 == i9 + (-1) ? i8 : i8 + 1;
            float[] fArr = this.f19666C;
            this.f19675L.op(m23875C(i8, fArr[i8], fArr[i10], i8 != i9 + (-1) ? this.f19667D[i8] : -1.0f, this.f19670G[i8]), Path.Op.UNION);
            i7 = i8 + 1;
        }
        if (this.f19668E != -1.0f) {
            this.f19675L.op(getRetreatingJoinPath(), Path.Op.UNION);
        }
        canvas.drawPath(this.f19675L, this.f19673J);
    }

    /* JADX INFO: renamed from: C */
    private Path m23875C(int i7, float f7, float f8, float f9, float f10) {
        float f11;
        float f12;
        this.f19676M.rewind();
        if ((f9 == 0.0f || f9 == -1.0f) && f10 == 0.0f && (i7 != this.f19705y || !this.f19665B)) {
            this.f19676M.addCircle(this.f19666C[i7], this.f19701u, this.f19697f, Path.Direction.CW);
        }
        if (f9 <= 0.0f || f9 > 0.5f || this.f19668E != -1.0f) {
            f11 = f8;
        } else {
            this.f19677N.rewind();
            this.f19677N.moveTo(f7, this.f19702v);
            RectF rectF = this.f19679P;
            float f13 = this.f19697f;
            rectF.set(f7 - f13, this.f19700t, f13 + f7, this.f19702v);
            this.f19677N.arcTo(this.f19679P, 90.0f, 180.0f, true);
            float f14 = this.f19697f + f7 + (this.f19689b * f9);
            this.f19683T = f14;
            float f15 = this.f19701u;
            this.f19684U = f15;
            float f16 = this.f19698r;
            float f17 = f7 + f16;
            this.f19688a0 = f17;
            float f18 = this.f19700t;
            this.f19690b0 = f18;
            this.f19692c0 = f14;
            float f19 = f15 - f16;
            this.f19694d0 = f19;
            this.f19677N.cubicTo(f17, f18, f14, f19, f14, f15);
            this.f19685V = f7;
            float f20 = this.f19702v;
            this.f19686W = f20;
            float f21 = this.f19683T;
            this.f19688a0 = f21;
            float f22 = this.f19684U;
            float f23 = this.f19698r;
            float f24 = f22 + f23;
            this.f19690b0 = f24;
            float f25 = f7 + f23;
            this.f19692c0 = f25;
            this.f19694d0 = f20;
            this.f19677N.cubicTo(f21, f24, f25, f20, f7, f20);
            Path path = this.f19676M;
            Path path2 = this.f19677N;
            Path.Op op = Path.Op.UNION;
            path.op(path2, op);
            this.f19678O.rewind();
            this.f19678O.moveTo(f8, this.f19702v);
            RectF rectF2 = this.f19679P;
            float f26 = this.f19697f;
            rectF2.set(f8 - f26, this.f19700t, f26 + f8, this.f19702v);
            this.f19678O.arcTo(this.f19679P, 90.0f, -180.0f, true);
            float f27 = (f8 - this.f19697f) - (this.f19689b * f9);
            this.f19683T = f27;
            float f28 = this.f19701u;
            this.f19684U = f28;
            float f29 = this.f19698r;
            float f30 = f8 - f29;
            this.f19688a0 = f30;
            float f31 = this.f19700t;
            this.f19690b0 = f31;
            this.f19692c0 = f27;
            float f32 = f28 - f29;
            this.f19694d0 = f32;
            this.f19678O.cubicTo(f30, f31, f27, f32, f27, f28);
            this.f19685V = f8;
            float f33 = this.f19702v;
            this.f19686W = f33;
            float f34 = this.f19683T;
            this.f19688a0 = f34;
            float f35 = this.f19684U;
            float f36 = this.f19698r;
            float f37 = f35 + f36;
            this.f19690b0 = f37;
            float f38 = f8 - f36;
            this.f19692c0 = f38;
            this.f19694d0 = f33;
            f11 = f8;
            this.f19678O.cubicTo(f34, f37, f38, f33, f11, f33);
            this.f19676M.op(this.f19678O, op);
        }
        if (f9 <= 0.5f || f9 >= 1.0f || this.f19668E != -1.0f) {
            f12 = r6;
        } else {
            float f39 = (f9 - 0.2f) * 1.25f;
            this.f19676M.moveTo(r6, this.f19702v);
            RectF rectF3 = this.f19679P;
            float f40 = this.f19697f;
            rectF3.set(r6 - f40, this.f19700t, f40 + r6, this.f19702v);
            this.f19676M.arcTo(this.f19679P, 90.0f, 180.0f, true);
            float f41 = this.f19697f;
            float f42 = r6 + f41 + (this.f19689b / 2);
            this.f19683T = f42;
            float f43 = this.f19701u - (f39 * f41);
            this.f19684U = f43;
            float f44 = f42 - (f39 * f41);
            this.f19688a0 = f44;
            float f45 = this.f19700t;
            this.f19690b0 = f45;
            float f46 = 1.0f - f39;
            float f47 = f42 - (f41 * f46);
            this.f19692c0 = f47;
            this.f19694d0 = f43;
            this.f19676M.cubicTo(f44, f45, f47, f43, f42, f43);
            this.f19685V = f11;
            float f48 = this.f19700t;
            this.f19686W = f48;
            float f49 = this.f19683T;
            float f50 = this.f19697f;
            float f51 = (f46 * f50) + f49;
            this.f19688a0 = f51;
            float f52 = this.f19684U;
            this.f19690b0 = f52;
            float f53 = (f50 * f39) + f49;
            this.f19692c0 = f53;
            this.f19694d0 = f48;
            this.f19676M.cubicTo(f51, f52, f53, f48, f11, f48);
            RectF rectF4 = this.f19679P;
            float f54 = this.f19697f;
            rectF4.set(f8 - f54, this.f19700t, f8 + f54, this.f19702v);
            this.f19676M.arcTo(this.f19679P, 270.0f, 180.0f, true);
            float f55 = this.f19701u;
            float f56 = this.f19697f;
            float f57 = f55 + (f39 * f56);
            this.f19684U = f57;
            float f58 = this.f19683T;
            float f59 = (f39 * f56) + f58;
            this.f19688a0 = f59;
            float f60 = this.f19702v;
            this.f19690b0 = f60;
            float f61 = (f56 * f46) + f58;
            this.f19692c0 = f61;
            this.f19694d0 = f57;
            this.f19676M.cubicTo(f59, f60, f61, f57, f58, f57);
            this.f19685V = r6;
            float f62 = this.f19702v;
            this.f19686W = f62;
            float f63 = this.f19683T;
            float f64 = this.f19697f;
            float f65 = f63 - (f46 * f64);
            this.f19688a0 = f65;
            float f66 = this.f19684U;
            this.f19690b0 = f66;
            float f67 = f63 - (f39 * f64);
            this.f19692c0 = f67;
            this.f19694d0 = f62;
            f12 = f7;
            this.f19676M.cubicTo(f65, f66, f67, f62, f12, f62);
        }
        if (f9 == 1.0f && this.f19668E == -1.0f) {
            RectF rectF5 = this.f19679P;
            float f68 = this.f19697f;
            rectF5.set(f12 - f68, this.f19700t, f8 + f68, this.f19702v);
            Path path3 = this.f19676M;
            RectF rectF6 = this.f19679P;
            float f69 = this.f19697f;
            path3.addRoundRect(rectF6, f69, f69, Path.Direction.CW);
        }
        if (f10 > 1.0E-5f) {
            this.f19676M.addCircle(f12, this.f19701u, this.f19697f * f10, Path.Direction.CW);
        }
        return this.f19676M;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m23876D() {
        float[] fArr = new float[Math.max(this.f19704x - 1, 0)];
        this.f19667D = fArr;
        Arrays.fill(fArr, 0.0f);
        float[] fArr2 = new float[this.f19704x];
        this.f19670G = fArr2;
        Arrays.fill(fArr2, 0.0f);
        this.f19668E = -1.0f;
        this.f19669F = -1.0f;
        this.f19665B = true;
    }

    /* JADX INFO: renamed from: E */
    private void m23877E() {
        AbstractC2870b abstractC2870b = this.f19703w;
        if (abstractC2870b != null) {
            this.f19705y = abstractC2870b.getCurrentItem();
        } else {
            this.f19705y = 0;
        }
        float[] fArr = this.f19666C;
        if (fArr != null) {
            this.f19664A = fArr[Math.max(0, Math.min(this.f19705y, fArr.length - 1))];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m23878F(int i7, float f7) {
        this.f19670G[i7] = f7;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: G */
    private void m23879G(int i7, float f7) {
        float[] fArr = this.f19667D;
        if (i7 < fArr.length) {
            fArr[i7] = f7;
            postInvalidateOnAnimation();
        }
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.f19687a + getPaddingBottom();
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getRequiredWidth() {
        int i7 = this.f19704x;
        return (this.f19687a * i7) + ((i7 - 1) * this.f19689b);
    }

    private Path getRetreatingJoinPath() {
        this.f19676M.rewind();
        this.f19679P.set(this.f19668E, this.f19700t, this.f19669F, this.f19702v);
        Path path = this.f19676M;
        RectF rectF = this.f19679P;
        float f7 = this.f19697f;
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        return this.f19676M;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageCount(int i7) {
        this.f19704x = i7;
        m23900x(getWidth(), getHeight());
        m23876D();
        requestLayout();
    }

    private void setSelectedPage(int i7) {
        float[] fArr;
        int iMin = Math.min(i7, this.f19704x - 1);
        int i8 = this.f19705y;
        if (iMin == i8) {
            return;
        }
        this.f19672I = true;
        this.f19706z = i8;
        this.f19705y = iMin;
        int iAbs = Math.abs(iMin - i8);
        if (iAbs > 1) {
            if (iMin > this.f19706z) {
                for (int i9 = 0; i9 < iAbs; i9++) {
                    m23879G(this.f19706z + i9, 1.0f);
                }
            } else {
                for (int i10 = -1; i10 > (-iAbs); i10--) {
                    m23879G(this.f19706z + i10, 1.0f);
                }
            }
        }
        if (getVisibility() != 0 || (fArr = this.f19666C) == null) {
            return;
        }
        m23902z(fArr[iMin], this.f19706z, iMin, iAbs).start();
    }

    /* JADX INFO: renamed from: x */
    private void m23900x(int i7, int i8) {
        if (this.f19696e0) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = i7 - getPaddingRight();
            float paddingBottom = paddingTop + ((i8 - getPaddingBottom()) / 2.0f);
            float requiredWidth = ((paddingLeft + (paddingRight / 2.0f)) - (getRequiredWidth() / 2.0f)) + this.f19697f;
            this.f19666C = new float[Math.max(1, this.f19704x)];
            for (int i9 = 0; i9 < this.f19704x; i9++) {
                this.f19666C[i9] = ((this.f19687a + this.f19689b) * i9) + requiredWidth;
            }
            float f7 = this.f19697f;
            this.f19700t = paddingBottom - f7;
            this.f19701u = paddingBottom;
            this.f19702v = paddingBottom + f7;
            m23877E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m23901y() {
        Arrays.fill(this.f19667D, 0.0f);
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: z */
    private ValueAnimator m23902z(float f7, int i7, int i8, int i9) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f19664A, f7);
        C5150f c5150f = new C5150f(this, i7, i8, i9, i8 > i7 ? new C5153i(f7 - ((f7 - this.f19664A) * 0.25f)) : new C5149e(f7 + ((this.f19664A - f7) * 0.25f)));
        this.f19680Q = c5150f;
        c5150f.addListener(new C5146b());
        valueAnimatorOfFloat.addUpdateListener(new C5147c());
        valueAnimatorOfFloat.addListener(new C5148d());
        valueAnimatorOfFloat.setStartDelay(this.f19665B ? this.f19691c / 4 : 0L);
        valueAnimatorOfFloat.setDuration((this.f19691c * 3) / 4);
        valueAnimatorOfFloat.setInterpolator(this.f19682S);
        return valueAnimatorOfFloat;
    }

    @Override // androidx.viewpager.widget.AbstractC2870b.j
    /* JADX INFO: renamed from: a */
    public void mo365a(int i7, float f7, int i8) {
        if (this.f19704x != 0 && this.f19671H) {
            int i9 = this.f19672I ? this.f19706z : this.f19705y;
            if (i9 != i7) {
                f7 = 1.0f - f7;
                if (f7 == 1.0f) {
                    i7 = Math.min(i9, i7);
                }
            }
            m23879G(i7, f7);
        }
    }

    @Override // androidx.viewpager.widget.AbstractC2870b.j
    /* JADX INFO: renamed from: b */
    public void mo14381b(int i7) {
    }

    @Override // androidx.viewpager.widget.AbstractC2870b.j
    /* JADX INFO: renamed from: c */
    public void mo366c(int i7) {
        if (this.f19671H) {
            setSelectedPage(i7);
        } else {
            m23877E();
        }
    }

    public int getCurrentPageIndicatorColor() {
        return this.f19674K.getColor();
    }

    public int getPageIndicatorColor() {
        return this.f19673J.getColor();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f19703w == null || this.f19704x == 0) {
            return;
        }
        m23874B(canvas);
        m23873A(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i8);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i8));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i8);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i7);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i7));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i7);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
        if (this.f19696e0) {
            return;
        }
        this.f19696e0 = true;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        m23900x(i7, i8);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f19671H = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f19671H = false;
    }

    public void setCurrentPageIndicatorColor(int i7) {
        this.f19674K.setColor(i7);
        invalidate();
    }

    public void setPageIndicatorColor(int i7) {
        this.f19673J.setColor(i7);
        invalidate();
    }

    public void setViewPager(AbstractC2870b abstractC2870b) {
        this.f19703w = abstractC2870b;
        abstractC2870b.mo14364c(this);
        setPageCount(abstractC2870b.getAdapter().mo684c());
        abstractC2870b.getAdapter().mo14324j(new C5145a());
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f19704x = 0;
        this.f19705y = 0;
        this.f19696e0 = false;
        int i8 = (int) context.getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0036i.f213O, i7, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0036i.f218R, i8 * 8);
        this.f19687a = dimensionPixelSize;
        float f7 = dimensionPixelSize / 2;
        this.f19697f = f7;
        this.f19698r = f7 / 2.0f;
        this.f19689b = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0036i.f219S, i8 * 12);
        long integer = typedArrayObtainStyledAttributes.getInteger(AbstractC0036i.f215P, 400);
        this.f19691c = integer;
        this.f19699s = integer / 2;
        this.f19693d = typedArrayObtainStyledAttributes.getColor(AbstractC0036i.f220T, -2130706433);
        this.f19695e = typedArrayObtainStyledAttributes.getColor(AbstractC0036i.f217Q, -1);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f19673J = paint;
        paint.setColor(this.f19693d);
        Paint paint2 = new Paint(1);
        this.f19674K = paint2;
        paint2.setColor(this.f19695e);
        this.f19682S = AbstractC0218a.m1102b(context);
        this.f19675L = new Path();
        this.f19676M = new Path();
        this.f19677N = new Path();
        this.f19678O = new Path();
        this.f19679P = new RectF();
        addOnAttachStateChangeListener(this);
    }
}

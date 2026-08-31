package p265i1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1434l;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;

/* JADX INFO: renamed from: i1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C5684m extends View {

    /* JADX INFO: renamed from: a */
    private final long f21697a;

    /* JADX INFO: renamed from: b */
    private Paint f21698b;

    /* JADX INFO: renamed from: c */
    private float f21699c;

    /* JADX INFO: renamed from: d */
    private float f21700d;

    /* JADX INFO: renamed from: e */
    private ValueAnimator f21701e;

    /* JADX INFO: renamed from: f */
    private b f21702f;

    /* JADX INFO: renamed from: r */
    private a f21703r;

    /* JADX INFO: renamed from: s */
    private final long f21704s;

    /* JADX INFO: renamed from: i1.m$a */
    public enum a {
        UP,
        DOWN,
        LEFT,
        RIGHT;


        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ InterfaceC2059a f21710f = AbstractC2060b.m8524a(m25234c());
    }

    /* JADX INFO: renamed from: i1.m$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo15138a(a aVar);
    }

    /* JADX INFO: renamed from: i1.m$c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21711a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f21711a = iArr;
        }
    }

    /* JADX INFO: renamed from: i1.m$d */
    public static final class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractC6118n.m27187e(animation, "animation");
            b bVar = C5684m.this.f21702f;
            if (bVar != null) {
                bVar.mo15138a(C5684m.this.f21703r);
            }
        }
    }

    public C5684m(Context context, long j7) {
        super(context);
        this.f21697a = j7;
        this.f21703r = a.DOWN;
        this.f21704s = j7 / ((long) 2);
        m25229e();
    }

    /* JADX INFO: renamed from: e */
    private final void m25229e() {
        setBackgroundColor(0);
        Paint paint = new Paint();
        this.f21698b = paint;
        AbstractC6118n.m27184b(paint);
        paint.setStrokeWidth(15.0f);
        Paint paint2 = this.f21698b;
        AbstractC6118n.m27184b(paint2);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = this.f21698b;
        AbstractC6118n.m27184b(paint3);
        paint3.setAntiAlias(true);
        Paint paint4 = this.f21698b;
        AbstractC6118n.m27184b(paint4);
        paint4.setShadowLayer(10.0f, 0.0f, 0.0f, -16711936);
        setLayerType(1, this.f21698b);
        m25230f();
    }

    /* JADX INFO: renamed from: f */
    private final void m25230f() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f21701e = valueAnimatorOfFloat;
        AbstractC6118n.m27184b(valueAnimatorOfFloat);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ValueAnimator valueAnimator = this.f21701e;
        AbstractC6118n.m27184b(valueAnimator);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: i1.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C5684m.m25231g(this.f21696a, valueAnimator2);
            }
        });
        ValueAnimator valueAnimator2 = this.f21701e;
        AbstractC6118n.m27184b(valueAnimator2);
        valueAnimator2.addListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m25231g(C5684m c5684m, ValueAnimator animation) {
        AbstractC6118n.m27187e(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        AbstractC6118n.m27185c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        int i7 = c.f21711a[c5684m.f21703r.ordinal()];
        if (i7 == 1) {
            c5684m.f21699c = c5684m.getHeight() * fFloatValue;
        } else if (i7 == 2) {
            c5684m.f21699c = c5684m.getHeight() - (c5684m.getHeight() * fFloatValue);
        } else if (i7 == 3) {
            c5684m.f21700d = c5684m.getWidth() * fFloatValue;
        } else {
            if (i7 != 4) {
                throw new C1434l();
            }
            c5684m.f21700d = c5684m.getWidth() - (c5684m.getWidth() * fFloatValue);
        }
        c5684m.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m25232i(C5684m c5684m, a aVar) {
        c5684m.m25233h(aVar);
    }

    /* JADX INFO: renamed from: h */
    public final void m25233h(final a direction) {
        AbstractC6118n.m27187e(direction, "direction");
        if (getHeight() <= 0 || getWidth() <= 0) {
            post(new Runnable() { // from class: i1.k
                @Override // java.lang.Runnable
                public final void run() {
                    C5684m.m25232i(this.f21694a, direction);
                }
            });
            return;
        }
        this.f21703r = direction;
        int i7 = c.f21711a[direction.ordinal()];
        if (i7 == 1) {
            this.f21699c = 0.0f;
            ValueAnimator valueAnimator = this.f21701e;
            AbstractC6118n.m27184b(valueAnimator);
            valueAnimator.setDuration(this.f21697a);
        } else if (i7 == 2) {
            this.f21699c = getHeight();
            ValueAnimator valueAnimator2 = this.f21701e;
            AbstractC6118n.m27184b(valueAnimator2);
            valueAnimator2.setDuration(this.f21697a);
        } else if (i7 == 3) {
            this.f21700d = 0.0f;
            ValueAnimator valueAnimator3 = this.f21701e;
            AbstractC6118n.m27184b(valueAnimator3);
            valueAnimator3.setDuration(this.f21704s);
        } else {
            if (i7 != 4) {
                throw new C1434l();
            }
            this.f21700d = getWidth();
            ValueAnimator valueAnimator4 = this.f21701e;
            AbstractC6118n.m27184b(valueAnimator4);
            valueAnimator4.setDuration(this.f21704s);
        }
        ValueAnimator valueAnimator5 = this.f21701e;
        AbstractC6118n.m27184b(valueAnimator5);
        valueAnimator5.start();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f21701e;
        AbstractC6118n.m27184b(valueAnimator);
        valueAnimator.cancel();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC6118n.m27187e(canvas, "canvas");
        super.onDraw(canvas);
        int iArgb = Color.argb(150, 0, 255, 0);
        int iArgb2 = Color.argb(150, 0, 255, 0);
        a aVar = this.f21703r;
        if (aVar != a.DOWN && aVar != a.UP) {
            Paint paint = this.f21698b;
            AbstractC6118n.m27184b(paint);
            float f7 = this.f21700d;
            paint.setShader(new LinearGradient(f7 - 20.0f, 0.0f, f7 + 20.0f, 0.0f, new int[]{iArgb, -1, iArgb2}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            float f8 = this.f21700d;
            float height = getHeight();
            Paint paint2 = this.f21698b;
            AbstractC6118n.m27184b(paint2);
            canvas.drawLine(f8, 0.0f, f8, height, paint2);
            return;
        }
        Paint paint3 = this.f21698b;
        AbstractC6118n.m27184b(paint3);
        float f9 = this.f21699c;
        paint3.setShader(new LinearGradient(0.0f, f9 - 20.0f, 0.0f, f9 + 20.0f, new int[]{iArgb, -1, iArgb2}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        float f10 = this.f21699c;
        float width = getWidth();
        float f11 = this.f21699c;
        Paint paint4 = this.f21698b;
        AbstractC6118n.m27184b(paint4);
        canvas.drawLine(0.0f, f10, width, f11, paint4);
    }

    public final void setAnimationListener(b bVar) {
        this.f21702f = bVar;
    }
}

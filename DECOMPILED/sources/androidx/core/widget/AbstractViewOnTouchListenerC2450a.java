package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p111O.AbstractC1030Z;

/* JADX INFO: renamed from: androidx.core.widget.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2450a implements View.OnTouchListener {

    /* JADX INFO: renamed from: C */
    private static final int f9342C = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: A */
    private boolean f9343A;

    /* JADX INFO: renamed from: B */
    private boolean f9344B;

    /* JADX INFO: renamed from: c */
    final View f9347c;

    /* JADX INFO: renamed from: d */
    private Runnable f9348d;

    /* JADX INFO: renamed from: r */
    private int f9351r;

    /* JADX INFO: renamed from: s */
    private int f9352s;

    /* JADX INFO: renamed from: w */
    private boolean f9356w;

    /* JADX INFO: renamed from: x */
    boolean f9357x;

    /* JADX INFO: renamed from: y */
    boolean f9358y;

    /* JADX INFO: renamed from: z */
    boolean f9359z;

    /* JADX INFO: renamed from: a */
    final a f9345a = new a();

    /* JADX INFO: renamed from: b */
    private final Interpolator f9346b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e */
    private float[] f9349e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f */
    private float[] f9350f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: t */
    private float[] f9353t = {0.0f, 0.0f};

    /* JADX INFO: renamed from: u */
    private float[] f9354u = {0.0f, 0.0f};

    /* JADX INFO: renamed from: v */
    private float[] f9355v = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private int f9360a;

        /* JADX INFO: renamed from: b */
        private int f9361b;

        /* JADX INFO: renamed from: c */
        private float f9362c;

        /* JADX INFO: renamed from: d */
        private float f9363d;

        /* JADX INFO: renamed from: j */
        private float f9369j;

        /* JADX INFO: renamed from: k */
        private int f9370k;

        /* JADX INFO: renamed from: e */
        private long f9364e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i */
        private long f9368i = -1;

        /* JADX INFO: renamed from: f */
        private long f9365f = 0;

        /* JADX INFO: renamed from: g */
        private int f9366g = 0;

        /* JADX INFO: renamed from: h */
        private int f9367h = 0;

        a() {
        }

        /* JADX INFO: renamed from: e */
        private float m10700e(long j7) {
            long j8 = this.f9364e;
            if (j7 < j8) {
                return 0.0f;
            }
            long j9 = this.f9368i;
            if (j9 < 0 || j7 < j9) {
                return AbstractViewOnTouchListenerC2450a.m10679e((j7 - j8) / this.f9360a, 0.0f, 1.0f) * 0.5f;
            }
            float f7 = this.f9369j;
            return (1.0f - f7) + (f7 * AbstractViewOnTouchListenerC2450a.m10679e((j7 - j9) / this.f9370k, 0.0f, 1.0f));
        }

        /* JADX INFO: renamed from: g */
        private float m10701g(float f7) {
            return ((-4.0f) * f7 * f7) + (f7 * 4.0f);
        }

        /* JADX INFO: renamed from: a */
        public void m10702a() {
            if (this.f9365f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fM10701g = m10701g(m10700e(jCurrentAnimationTimeMillis));
            long j7 = jCurrentAnimationTimeMillis - this.f9365f;
            this.f9365f = jCurrentAnimationTimeMillis;
            float f7 = j7 * fM10701g;
            this.f9366g = (int) (this.f9362c * f7);
            this.f9367h = (int) (f7 * this.f9363d);
        }

        /* JADX INFO: renamed from: b */
        public int m10703b() {
            return this.f9366g;
        }

        /* JADX INFO: renamed from: c */
        public int m10704c() {
            return this.f9367h;
        }

        /* JADX INFO: renamed from: d */
        public int m10705d() {
            float f7 = this.f9362c;
            return (int) (f7 / Math.abs(f7));
        }

        /* JADX INFO: renamed from: f */
        public int m10706f() {
            float f7 = this.f9363d;
            return (int) (f7 / Math.abs(f7));
        }

        /* JADX INFO: renamed from: h */
        public boolean m10707h() {
            return this.f9368i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f9368i + ((long) this.f9370k);
        }

        /* JADX INFO: renamed from: i */
        public void m10708i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9370k = AbstractViewOnTouchListenerC2450a.m10680f((int) (jCurrentAnimationTimeMillis - this.f9364e), 0, this.f9361b);
            this.f9369j = m10700e(jCurrentAnimationTimeMillis);
            this.f9368i = jCurrentAnimationTimeMillis;
        }

        /* JADX INFO: renamed from: j */
        public void m10709j(int i7) {
            this.f9361b = i7;
        }

        /* JADX INFO: renamed from: k */
        public void m10710k(int i7) {
            this.f9360a = i7;
        }

        /* JADX INFO: renamed from: l */
        public void m10711l(float f7, float f8) {
            this.f9362c = f7;
            this.f9363d = f8;
        }

        /* JADX INFO: renamed from: m */
        public void m10712m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9364e = jCurrentAnimationTimeMillis;
            this.f9368i = -1L;
            this.f9365f = jCurrentAnimationTimeMillis;
            this.f9369j = 0.5f;
            this.f9366g = 0;
            this.f9367h = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.a$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC2450a abstractViewOnTouchListenerC2450a = AbstractViewOnTouchListenerC2450a.this;
            if (abstractViewOnTouchListenerC2450a.f9359z) {
                if (abstractViewOnTouchListenerC2450a.f9357x) {
                    abstractViewOnTouchListenerC2450a.f9357x = false;
                    abstractViewOnTouchListenerC2450a.f9345a.m10712m();
                }
                a aVar = AbstractViewOnTouchListenerC2450a.this.f9345a;
                if (aVar.m10707h() || !AbstractViewOnTouchListenerC2450a.this.m10699u()) {
                    AbstractViewOnTouchListenerC2450a.this.f9359z = false;
                    return;
                }
                AbstractViewOnTouchListenerC2450a abstractViewOnTouchListenerC2450a2 = AbstractViewOnTouchListenerC2450a.this;
                if (abstractViewOnTouchListenerC2450a2.f9358y) {
                    abstractViewOnTouchListenerC2450a2.f9358y = false;
                    abstractViewOnTouchListenerC2450a2.m10687c();
                }
                aVar.m10702a();
                AbstractViewOnTouchListenerC2450a.this.mo10688j(aVar.m10703b(), aVar.m10704c());
                AbstractC1030Z.m4458b0(AbstractViewOnTouchListenerC2450a.this.f9347c, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC2450a(View view) {
        this.f9347c = view;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f8 = (int) ((1575.0f * f7) + 0.5f);
        m10693o(f8, f8);
        float f9 = (int) ((f7 * 315.0f) + 0.5f);
        m10694p(f9, f9);
        m10690l(1);
        m10692n(Float.MAX_VALUE, Float.MAX_VALUE);
        m10697s(0.2f, 0.2f);
        m10698t(1.0f, 1.0f);
        m10689k(f9342C);
        m10696r(500);
        m10695q(500);
    }

    /* JADX INFO: renamed from: d */
    private float m10678d(int i7, float f7, float f8, float f9) {
        float fM10682h = m10682h(this.f9349e[i7], f8, this.f9350f[i7], f7);
        if (fM10682h == 0.0f) {
            return 0.0f;
        }
        float f10 = this.f9353t[i7];
        float f11 = this.f9354u[i7];
        float f12 = this.f9355v[i7];
        float f13 = f10 * f9;
        return fM10682h > 0.0f ? m10679e(fM10682h * f13, f11, f12) : -m10679e((-fM10682h) * f13, f11, f12);
    }

    /* JADX INFO: renamed from: e */
    static float m10679e(float f7, float f8, float f9) {
        if (f7 > f9) {
            return f9;
        }
        return f7 < f8 ? f8 : f7;
    }

    /* JADX INFO: renamed from: f */
    static int m10680f(int i7, int i8, int i9) {
        if (i7 > i9) {
            return i9;
        }
        return i7 < i8 ? i8 : i7;
    }

    /* JADX INFO: renamed from: g */
    private float m10681g(float f7, float f8) {
        if (f8 == 0.0f) {
            return 0.0f;
        }
        int i7 = this.f9351r;
        if (i7 == 0 || i7 == 1) {
            if (f7 < f8) {
                if (f7 >= 0.0f) {
                    return 1.0f - (f7 / f8);
                }
                if (this.f9359z && i7 == 1) {
                    return 1.0f;
                }
            }
        } else if (i7 == 2 && f7 < 0.0f) {
            return f7 / (-f8);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    private float m10682h(float f7, float f8, float f9, float f10) {
        float interpolation;
        float fM10679e = m10679e(f7 * f8, 0.0f, f9);
        float fM10681g = m10681g(f8 - f10, fM10679e) - m10681g(f10, fM10679e);
        if (fM10681g < 0.0f) {
            interpolation = -this.f9346b.getInterpolation(-fM10681g);
        } else {
            if (fM10681g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f9346b.getInterpolation(fM10681g);
        }
        return m10679e(interpolation, -1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: i */
    private void m10683i() {
        if (this.f9357x) {
            this.f9359z = false;
        } else {
            this.f9345a.m10708i();
        }
    }

    /* JADX INFO: renamed from: v */
    private void m10684v() {
        int i7;
        if (this.f9348d == null) {
            this.f9348d = new b();
        }
        this.f9359z = true;
        this.f9357x = true;
        if (this.f9356w || (i7 = this.f9352s) <= 0) {
            this.f9348d.run();
        } else {
            AbstractC1030Z.m4460c0(this.f9347c, this.f9348d, i7);
        }
        this.f9356w = true;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo10685a(int i7);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo10686b(int i7);

    /* JADX INFO: renamed from: c */
    void m10687c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f9347c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo10688j(int i7, int i8);

    /* JADX INFO: renamed from: k */
    public AbstractViewOnTouchListenerC2450a m10689k(int i7) {
        this.f9352s = i7;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public AbstractViewOnTouchListenerC2450a m10690l(int i7) {
        this.f9351r = i7;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public AbstractViewOnTouchListenerC2450a m10691m(boolean z7) {
        if (this.f9343A && !z7) {
            m10683i();
        }
        this.f9343A = z7;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public AbstractViewOnTouchListenerC2450a m10692n(float f7, float f8) {
        float[] fArr = this.f9350f;
        fArr[0] = f7;
        fArr[1] = f8;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public AbstractViewOnTouchListenerC2450a m10693o(float f7, float f8) {
        float[] fArr = this.f9355v;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f9343A) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m10683i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m10683i();
                }
            }
            return !this.f9344B && this.f9359z;
        }
        this.f9358y = true;
        this.f9356w = false;
        this.f9345a.m10711l(m10678d(0, motionEvent.getX(), view.getWidth(), this.f9347c.getWidth()), m10678d(1, motionEvent.getY(), view.getHeight(), this.f9347c.getHeight()));
        if (!this.f9359z && m10699u()) {
            m10684v();
        }
        if (this.f9344B) {
        }
    }

    /* JADX INFO: renamed from: p */
    public AbstractViewOnTouchListenerC2450a m10694p(float f7, float f8) {
        float[] fArr = this.f9354u;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public AbstractViewOnTouchListenerC2450a m10695q(int i7) {
        this.f9345a.m10709j(i7);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public AbstractViewOnTouchListenerC2450a m10696r(int i7) {
        this.f9345a.m10710k(i7);
        return this;
    }

    /* JADX INFO: renamed from: s */
    public AbstractViewOnTouchListenerC2450a m10697s(float f7, float f8) {
        float[] fArr = this.f9349e;
        fArr[0] = f7;
        fArr[1] = f8;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public AbstractViewOnTouchListenerC2450a m10698t(float f7, float f8) {
        float[] fArr = this.f9353t;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    /* JADX INFO: renamed from: u */
    boolean m10699u() {
        a aVar = this.f9345a;
        int iM10706f = aVar.m10706f();
        int iM10705d = aVar.m10705d();
        if (iM10706f == 0 || !mo10686b(iM10706f)) {
            return iM10705d != 0 && mo10685a(iM10705d);
        }
        return true;
    }
}

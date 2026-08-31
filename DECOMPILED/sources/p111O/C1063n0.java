package p111O;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p009B.AbstractC0040c;
import p033E.C0247b;
import p272j0.C5823a;

/* JADX INFO: renamed from: O.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1063n0 {

    /* JADX INFO: renamed from: a */
    private e f3866a;

    /* JADX INFO: renamed from: O.n0$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        C0982A0 f3869a;

        /* JADX INFO: renamed from: b */
        private final int f3870b;

        public b(int i7) {
            this.f3870b = i7;
        }

        /* JADX INFO: renamed from: a */
        public final int m4718a() {
            return this.f3870b;
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo4719b(C1063n0 c1063n0);

        /* JADX INFO: renamed from: c */
        public abstract void mo4720c(C1063n0 c1063n0);

        /* JADX INFO: renamed from: d */
        public abstract C0982A0 mo4721d(C0982A0 c0982a0, List list);

        /* JADX INFO: renamed from: e */
        public abstract a mo4722e(C1063n0 c1063n0, a aVar);
    }

    /* JADX INFO: renamed from: O.n0$c */
    private static class c extends e {

        /* JADX INFO: renamed from: f */
        private static final Interpolator f3871f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g */
        private static final Interpolator f3872g = new C5823a();

        /* JADX INFO: renamed from: h */
        private static final Interpolator f3873h = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: i */
        private static final Interpolator f3874i = new AccelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: O.n0$c$a */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            final b f3875a;

            /* JADX INFO: renamed from: b */
            private C0982A0 f3876b;

            /* JADX INFO: renamed from: O.n0$c$a$a, reason: collision with other inner class name */
            class C7636a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ C1063n0 f3877a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ C0982A0 f3878b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ C0982A0 f3879c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ int f3880d;

                /* JADX INFO: renamed from: e */
                final /* synthetic */ View f3881e;

                C7636a(C1063n0 c1063n0, C0982A0 c0982a0, C0982A0 c0982a1, int i7, View view) {
                    this.f3877a = c1063n0;
                    this.f3878b = c0982a0;
                    this.f3879c = c0982a1;
                    this.f3880d = i7;
                    this.f3881e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f3877a.m4713e(valueAnimator.getAnimatedFraction());
                    c.m4729k(this.f3881e, c.m4733o(this.f3878b, this.f3879c, this.f3877a.m4711b(), this.f3880d), Collections.singletonList(this.f3877a));
                }
            }

            /* JADX INFO: renamed from: O.n0$c$a$b */
            class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ C1063n0 f3883a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ View f3884b;

                b(C1063n0 c1063n0, View view) {
                    this.f3883a = c1063n0;
                    this.f3884b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f3883a.m4713e(1.0f);
                    c.m4727i(this.f3884b, this.f3883a);
                }
            }

            /* JADX INFO: renamed from: O.n0$c$a$c, reason: collision with other inner class name */
            class RunnableC7637c implements Runnable {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ View f3886a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ C1063n0 f3887b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ a f3888c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ ValueAnimator f3889d;

                RunnableC7637c(View view, C1063n0 c1063n0, a aVar, ValueAnimator valueAnimator) {
                    this.f3886a = view;
                    this.f3887b = c1063n0;
                    this.f3888c = aVar;
                    this.f3889d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.m4730l(this.f3886a, this.f3887b, this.f3888c);
                    this.f3889d.start();
                }
            }

            a(View view, b bVar) {
                this.f3875a = bVar;
                C0982A0 c0982a0M4433E = AbstractC1030Z.m4433E(view);
                this.f3876b = c0982a0M4433E != null ? new C0982A0.a(c0982a0M4433E).m4289a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f3876b = C0982A0.m4266y(windowInsets, view);
                    return c.m4731m(view, windowInsets);
                }
                C0982A0 c0982a0M4266y = C0982A0.m4266y(windowInsets, view);
                if (this.f3876b == null) {
                    this.f3876b = AbstractC1030Z.m4433E(view);
                }
                if (this.f3876b == null) {
                    this.f3876b = c0982a0M4266y;
                    return c.m4731m(view, windowInsets);
                }
                b bVarM4732n = c.m4732n(view);
                if (bVarM4732n != null && Objects.equals(bVarM4732n.f3869a, c0982a0M4266y)) {
                    return c.m4731m(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.m4723e(c0982a0M4266y, this.f3876b, iArr, iArr2);
                int i7 = iArr[0];
                int i8 = iArr2[0];
                int i9 = i7 | i8;
                if (i9 == 0) {
                    this.f3876b = c0982a0M4266y;
                    return c.m4731m(view, windowInsets);
                }
                C0982A0 c0982a0 = this.f3876b;
                C1063n0 c1063n0 = new C1063n0(i9, c.m4725g(i7, i8), (C0982A0.p.m4329b() & i9) != 0 ? 160L : 250L);
                c1063n0.m4713e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1063n0.m4710a());
                a aVarM4724f = c.m4724f(c0982a0M4266y, c0982a0, i9);
                c.m4728j(view, c1063n0, c0982a0M4266y, false);
                duration.addUpdateListener(new C7636a(c1063n0, c0982a0M4266y, c0982a0, i9, view));
                duration.addListener(new b(c1063n0, view));
                ViewTreeObserverOnPreDrawListenerC0999J.m4375a(view, new RunnableC7637c(view, c1063n0, aVarM4724f, duration));
                this.f3876b = c0982a0M4266y;
                return c.m4731m(view, windowInsets);
            }
        }

        c(int i7, Interpolator interpolator, long j7) {
            super(i7, interpolator, j7);
        }

        /* JADX INFO: renamed from: e */
        static void m4723e(C0982A0 c0982a0, C0982A0 c0982a1, int[] iArr, int[] iArr2) {
            for (int i7 = 1; i7 <= 512; i7 <<= 1) {
                C0247b c0247bM4272f = c0982a0.m4272f(i7);
                C0247b c0247bM4272f2 = c0982a1.m4272f(i7);
                int i8 = c0247bM4272f.f984a;
                int i9 = c0247bM4272f2.f984a;
                boolean z7 = i8 > i9 || c0247bM4272f.f985b > c0247bM4272f2.f985b || c0247bM4272f.f986c > c0247bM4272f2.f986c || c0247bM4272f.f987d > c0247bM4272f2.f987d;
                if (z7 != (i8 < i9 || c0247bM4272f.f985b < c0247bM4272f2.f985b || c0247bM4272f.f986c < c0247bM4272f2.f986c || c0247bM4272f.f987d < c0247bM4272f2.f987d)) {
                    if (z7) {
                        iArr[0] = iArr[0] | i7;
                    } else {
                        iArr2[0] = iArr2[0] | i7;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: f */
        static a m4724f(C0982A0 c0982a0, C0982A0 c0982a1, int i7) {
            C0247b c0247bM4272f = c0982a0.m4272f(i7);
            C0247b c0247bM4272f2 = c0982a1.m4272f(i7);
            return new a(C0247b.m1184b(Math.min(c0247bM4272f.f984a, c0247bM4272f2.f984a), Math.min(c0247bM4272f.f985b, c0247bM4272f2.f985b), Math.min(c0247bM4272f.f986c, c0247bM4272f2.f986c), Math.min(c0247bM4272f.f987d, c0247bM4272f2.f987d)), C0247b.m1184b(Math.max(c0247bM4272f.f984a, c0247bM4272f2.f984a), Math.max(c0247bM4272f.f985b, c0247bM4272f2.f985b), Math.max(c0247bM4272f.f986c, c0247bM4272f2.f986c), Math.max(c0247bM4272f.f987d, c0247bM4272f2.f987d)));
        }

        /* JADX INFO: renamed from: g */
        static Interpolator m4725g(int i7, int i8) {
            if ((C0982A0.p.m4329b() & i7) != 0) {
                return f3871f;
            }
            if ((C0982A0.p.m4329b() & i8) != 0) {
                return f3872g;
            }
            if ((i7 & C0982A0.p.m4332e()) != 0) {
                return f3873h;
            }
            if ((C0982A0.p.m4332e() & i8) != 0) {
                return f3874i;
            }
            return null;
        }

        /* JADX INFO: renamed from: h */
        private static View.OnApplyWindowInsetsListener m4726h(View view, b bVar) {
            return new a(view, bVar);
        }

        /* JADX INFO: renamed from: i */
        static void m4727i(View view, C1063n0 c1063n0) {
            b bVarM4732n = m4732n(view);
            if (bVarM4732n != null) {
                bVarM4732n.mo4719b(c1063n0);
                if (bVarM4732n.m4718a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    m4727i(viewGroup.getChildAt(i7), c1063n0);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        static void m4728j(View view, C1063n0 c1063n0, C0982A0 c0982a0, boolean z7) {
            b bVarM4732n = m4732n(view);
            if (bVarM4732n != null) {
                bVarM4732n.f3869a = c0982a0;
                if (!z7) {
                    bVarM4732n.mo4720c(c1063n0);
                    z7 = bVarM4732n.m4718a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    m4728j(viewGroup.getChildAt(i7), c1063n0, c0982a0, z7);
                }
            }
        }

        /* JADX INFO: renamed from: k */
        static void m4729k(View view, C0982A0 c0982a0, List list) {
            b bVarM4732n = m4732n(view);
            if (bVarM4732n != null) {
                c0982a0 = bVarM4732n.mo4721d(c0982a0, list);
                if (bVarM4732n.m4718a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    m4729k(viewGroup.getChildAt(i7), c0982a0, list);
                }
            }
        }

        /* JADX INFO: renamed from: l */
        static void m4730l(View view, C1063n0 c1063n0, a aVar) {
            b bVarM4732n = m4732n(view);
            if (bVarM4732n != null) {
                bVarM4732n.mo4722e(c1063n0, aVar);
                if (bVarM4732n.m4718a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    m4730l(viewGroup.getChildAt(i7), c1063n0, aVar);
                }
            }
        }

        /* JADX INFO: renamed from: m */
        static WindowInsets m4731m(View view, WindowInsets windowInsets) {
            return view.getTag(AbstractC0040c.f296M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: n */
        static b m4732n(View view) {
            Object tag = view.getTag(AbstractC0040c.f303T);
            if (tag instanceof a) {
                return ((a) tag).f3875a;
            }
            return null;
        }

        /* JADX INFO: renamed from: o */
        static C0982A0 m4733o(C0982A0 c0982a0, C0982A0 c0982a1, float f7, int i7) {
            C0982A0.a aVar = new C0982A0.a(c0982a0);
            for (int i8 = 1; i8 <= 512; i8 <<= 1) {
                if ((i7 & i8) == 0) {
                    aVar.m4290b(i8, c0982a0.m4272f(i8));
                } else {
                    C0247b c0247bM4272f = c0982a0.m4272f(i8);
                    C0247b c0247bM4272f2 = c0982a1.m4272f(i8);
                    float f8 = 1.0f - f7;
                    aVar.m4290b(i8, C0982A0.m4264o(c0247bM4272f, (int) (((double) ((c0247bM4272f.f984a - c0247bM4272f2.f984a) * f8)) + 0.5d), (int) (((double) ((c0247bM4272f.f985b - c0247bM4272f2.f985b) * f8)) + 0.5d), (int) (((double) ((c0247bM4272f.f986c - c0247bM4272f2.f986c) * f8)) + 0.5d), (int) (((double) ((c0247bM4272f.f987d - c0247bM4272f2.f987d) * f8)) + 0.5d)));
                }
            }
            return aVar.m4289a();
        }

        /* JADX INFO: renamed from: p */
        static void m4734p(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerM4726h = bVar != null ? m4726h(view, bVar) : null;
            view.setTag(AbstractC0040c.f303T, onApplyWindowInsetsListenerM4726h);
            if (view.getTag(AbstractC0040c.f295L) == null && view.getTag(AbstractC0040c.f296M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerM4726h);
            }
        }
    }

    /* JADX INFO: renamed from: O.n0$e */
    private static class e {

        /* JADX INFO: renamed from: a */
        private final int f3896a;

        /* JADX INFO: renamed from: b */
        private float f3897b;

        /* JADX INFO: renamed from: c */
        private final Interpolator f3898c;

        /* JADX INFO: renamed from: d */
        private final long f3899d;

        /* JADX INFO: renamed from: e */
        private float f3900e = 1.0f;

        e(int i7, Interpolator interpolator, long j7) {
            this.f3896a = i7;
            this.f3898c = interpolator;
            this.f3899d = j7;
        }

        /* JADX INFO: renamed from: a */
        public long mo4739a() {
            return this.f3899d;
        }

        /* JADX INFO: renamed from: b */
        public float mo4740b() {
            Interpolator interpolator = this.f3898c;
            return interpolator != null ? interpolator.getInterpolation(this.f3897b) : this.f3897b;
        }

        /* JADX INFO: renamed from: c */
        public int mo4741c() {
            return this.f3896a;
        }

        /* JADX INFO: renamed from: d */
        public void mo4742d(float f7) {
            this.f3897b = f7;
        }
    }

    public C1063n0(int i7, Interpolator interpolator, long j7) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3866a = new d(i7, interpolator, j7);
        } else {
            this.f3866a = new c(i7, interpolator, j7);
        }
    }

    /* JADX INFO: renamed from: d */
    static void m4708d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.m4738h(view, bVar);
        } else {
            c.m4734p(view, bVar);
        }
    }

    /* JADX INFO: renamed from: f */
    static C1063n0 m4709f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C1063n0(windowInsetsAnimation);
    }

    /* JADX INFO: renamed from: a */
    public long m4710a() {
        return this.f3866a.mo4739a();
    }

    /* JADX INFO: renamed from: b */
    public float m4711b() {
        return this.f3866a.mo4740b();
    }

    /* JADX INFO: renamed from: c */
    public int m4712c() {
        return this.f3866a.mo4741c();
    }

    /* JADX INFO: renamed from: e */
    public void m4713e(float f7) {
        this.f3866a.mo4742d(f7);
    }

    /* JADX INFO: renamed from: O.n0$d */
    private static class d extends e {

        /* JADX INFO: renamed from: f */
        private final WindowInsetsAnimation f3891f;

        /* JADX INFO: renamed from: O.n0$d$a */
        private static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a */
            private final b f3892a;

            /* JADX INFO: renamed from: b */
            private List f3893b;

            /* JADX INFO: renamed from: c */
            private ArrayList f3894c;

            /* JADX INFO: renamed from: d */
            private final HashMap f3895d;

            a(b bVar) {
                super(bVar.m4718a());
                this.f3895d = new HashMap();
                this.f3892a = bVar;
            }

            /* JADX INFO: renamed from: a */
            private C1063n0 m4743a(WindowInsetsAnimation windowInsetsAnimation) {
                C1063n0 c1063n0 = (C1063n0) this.f3895d.get(windowInsetsAnimation);
                if (c1063n0 != null) {
                    return c1063n0;
                }
                C1063n0 c1063n0M4709f = C1063n0.m4709f(windowInsetsAnimation);
                this.f3895d.put(windowInsetsAnimation, c1063n0M4709f);
                return c1063n0M4709f;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f3892a.mo4719b(m4743a(windowInsetsAnimation));
                this.f3895d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f3892a.mo4720c(m4743a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f3894c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f3894c = arrayList2;
                    this.f3893b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationM4805a = AbstractC1085y0.m4805a(list.get(size));
                    C1063n0 c1063n0M4743a = m4743a(windowInsetsAnimationM4805a);
                    c1063n0M4743a.m4713e(windowInsetsAnimationM4805a.getFraction());
                    this.f3894c.add(c1063n0M4743a);
                }
                return this.f3892a.mo4721d(C0982A0.m4265x(windowInsets), this.f3893b).m4288w();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f3892a.mo4722e(m4743a(windowInsetsAnimation), a.m4714d(bounds)).m4717c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f3891f = windowInsetsAnimation;
        }

        /* JADX INFO: renamed from: e */
        public static WindowInsetsAnimation.Bounds m4735e(a aVar) {
            AbstractC1079v0.m4781a();
            return AbstractC1077u0.m4779a(aVar.m4715a().m1187e(), aVar.m4716b().m1187e());
        }

        /* JADX INFO: renamed from: f */
        public static C0247b m4736f(WindowInsetsAnimation.Bounds bounds) {
            return C0247b.m1186d(bounds.getUpperBound());
        }

        /* JADX INFO: renamed from: g */
        public static C0247b m4737g(WindowInsetsAnimation.Bounds bounds) {
            return C0247b.m1186d(bounds.getLowerBound());
        }

        /* JADX INFO: renamed from: h */
        public static void m4738h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // p111O.C1063n0.e
        /* JADX INFO: renamed from: a */
        public long mo4739a() {
            return this.f3891f.getDurationMillis();
        }

        @Override // p111O.C1063n0.e
        /* JADX INFO: renamed from: b */
        public float mo4740b() {
            return this.f3891f.getInterpolatedFraction();
        }

        @Override // p111O.C1063n0.e
        /* JADX INFO: renamed from: c */
        public int mo4741c() {
            return this.f3891f.getTypeMask();
        }

        @Override // p111O.C1063n0.e
        /* JADX INFO: renamed from: d */
        public void mo4742d(float f7) {
            this.f3891f.setFraction(f7);
        }

        d(int i7, Interpolator interpolator, long j7) {
            this(AbstractC1075t0.m4772a(i7, interpolator, j7));
        }
    }

    /* JADX INFO: renamed from: O.n0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final C0247b f3867a;

        /* JADX INFO: renamed from: b */
        private final C0247b f3868b;

        public a(C0247b c0247b, C0247b c0247b2) {
            this.f3867a = c0247b;
            this.f3868b = c0247b2;
        }

        /* JADX INFO: renamed from: d */
        public static a m4714d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        /* JADX INFO: renamed from: a */
        public C0247b m4715a() {
            return this.f3867a;
        }

        /* JADX INFO: renamed from: b */
        public C0247b m4716b() {
            return this.f3868b;
        }

        /* JADX INFO: renamed from: c */
        public WindowInsetsAnimation.Bounds m4717c() {
            return d.m4735e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f3867a + " upper=" + this.f3868b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f3867a = d.m4737g(bounds);
            this.f3868b = d.m4736f(bounds);
        }
    }

    private C1063n0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3866a = new d(windowInsetsAnimation);
        }
    }
}

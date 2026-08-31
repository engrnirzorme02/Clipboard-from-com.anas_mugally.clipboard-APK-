package p111O;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p033E.C0247b;
import p104N.AbstractC0905b;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: O.A0 */
/* JADX INFO: loaded from: classes.dex */
public class C0982A0 {

    /* JADX INFO: renamed from: b */
    public static final C0982A0 f3748b;

    /* JADX INFO: renamed from: a */
    private final o f3749a;

    /* JADX INFO: renamed from: O.A0$d */
    private static class d extends c {
        d() {
        }

        @Override // p111O.C0982A0.g
        /* JADX INFO: renamed from: c */
        void mo4300c(int i7, C0247b c0247b) {
            this.f3757c.setInsets(q.m4333a(i7), c0247b.m1187e());
        }

        d(C0982A0 c0982a0) {
            super(c0982a0);
        }
    }

    /* JADX INFO: renamed from: O.A0$e */
    private static class e extends d {
        e() {
        }

        e(C0982A0 c0982a0) {
            super(c0982a0);
        }
    }

    /* JADX INFO: renamed from: O.A0$f */
    private static class f extends e {
        f() {
        }

        @Override // p111O.C0982A0.d, p111O.C0982A0.g
        /* JADX INFO: renamed from: c */
        void mo4300c(int i7, C0247b c0247b) {
            this.f3757c.setInsets(r.m4334a(i7), c0247b.m1187e());
        }

        f(C0982A0 c0982a0) {
            super(c0982a0);
        }
    }

    /* JADX INFO: renamed from: O.A0$g */
    private static class g {

        /* JADX INFO: renamed from: a */
        private final C0982A0 f3758a;

        /* JADX INFO: renamed from: b */
        C0247b[] f3759b;

        g() {
            this(new C0982A0((C0982A0) null));
        }

        /* JADX INFO: renamed from: a */
        protected final void m4301a() {
            C0247b[] c0247bArr = this.f3759b;
            if (c0247bArr != null) {
                C0247b c0247bM4272f = c0247bArr[p.m4330c(1)];
                C0247b c0247bM4272f2 = this.f3759b[p.m4330c(2)];
                if (c0247bM4272f2 == null) {
                    c0247bM4272f2 = this.f3758a.m4272f(2);
                }
                if (c0247bM4272f == null) {
                    c0247bM4272f = this.f3758a.m4272f(1);
                }
                mo4296g(C0247b.m1183a(c0247bM4272f, c0247bM4272f2));
                C0247b c0247b = this.f3759b[p.m4330c(16)];
                if (c0247b != null) {
                    mo4298f(c0247b);
                }
                C0247b c0247b2 = this.f3759b[p.m4330c(32)];
                if (c0247b2 != null) {
                    mo4297d(c0247b2);
                }
                C0247b c0247b3 = this.f3759b[p.m4330c(64)];
                if (c0247b3 != null) {
                    mo4299h(c0247b3);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        abstract C0982A0 mo4294b();

        /* JADX INFO: renamed from: c */
        void mo4300c(int i7, C0247b c0247b) {
            if (this.f3759b == null) {
                this.f3759b = new C0247b[10];
            }
            for (int i8 = 1; i8 <= 512; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    this.f3759b[p.m4330c(i8)] = c0247b;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        void mo4297d(C0247b c0247b) {
        }

        /* JADX INFO: renamed from: e */
        abstract void mo4295e(C0247b c0247b);

        /* JADX INFO: renamed from: f */
        void mo4298f(C0247b c0247b) {
        }

        /* JADX INFO: renamed from: g */
        abstract void mo4296g(C0247b c0247b);

        /* JADX INFO: renamed from: h */
        void mo4299h(C0247b c0247b) {
        }

        g(C0982A0 c0982a0) {
            this.f3758a = c0982a0;
        }
    }

    /* JADX INFO: renamed from: O.A0$j */
    private static class j extends i {
        j(C0982A0 c0982a0, WindowInsets windowInsets) {
            super(c0982a0, windowInsets);
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: a */
        C0982A0 mo4323a() {
            return C0982A0.m4265x(this.f3765c.consumeDisplayCutout());
        }

        @Override // p111O.C0982A0.h, p111O.C0982A0.o
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Objects.equals(this.f3765c, jVar.f3765c) && Objects.equals(this.f3769g, jVar.f3769g) && h.m4306z(this.f3770h, jVar.f3770h);
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: f */
        C1070r mo4324f() {
            return C1070r.m4758e(this.f3765c.getDisplayCutout());
        }

        @Override // p111O.C0982A0.o
        public int hashCode() {
            return this.f3765c.hashCode();
        }

        j(C0982A0 c0982a0, j jVar) {
            super(c0982a0, jVar);
        }
    }

    /* JADX INFO: renamed from: O.A0$l */
    private static class l extends k {

        /* JADX INFO: renamed from: r */
        static final C0982A0 f3775r = C0982A0.m4265x(WindowInsets.CONSUMED);

        l(C0982A0 c0982a0, WindowInsets windowInsets) {
            super(c0982a0, windowInsets);
        }

        @Override // p111O.C0982A0.h, p111O.C0982A0.o
        /* JADX INFO: renamed from: d */
        final void mo4307d(View view) {
        }

        @Override // p111O.C0982A0.h, p111O.C0982A0.o
        /* JADX INFO: renamed from: g */
        public C0247b mo4309g(int i7) {
            return C0247b.m1186d(this.f3765c.getInsets(q.m4333a(i7)));
        }

        l(C0982A0 c0982a0, l lVar) {
            super(c0982a0, lVar);
        }
    }

    /* JADX INFO: renamed from: O.A0$m */
    private static class m extends l {
        m(C0982A0 c0982a0, WindowInsets windowInsets) {
            super(c0982a0, windowInsets);
        }

        m(C0982A0 c0982a0, m mVar) {
            super(c0982a0, mVar);
        }
    }

    /* JADX INFO: renamed from: O.A0$n */
    private static class n extends m {

        /* JADX INFO: renamed from: s */
        static final C0982A0 f3776s = C0982A0.m4265x(WindowInsets.CONSUMED);

        n(C0982A0 c0982a0, WindowInsets windowInsets) {
            super(c0982a0, windowInsets);
        }

        @Override // p111O.C0982A0.l, p111O.C0982A0.h, p111O.C0982A0.o
        /* JADX INFO: renamed from: g */
        public C0247b mo4309g(int i7) {
            return C0247b.m1186d(this.f3765c.getInsets(r.m4334a(i7)));
        }

        n(C0982A0 c0982a0, n nVar) {
            super(c0982a0, nVar);
        }
    }

    /* JADX INFO: renamed from: O.A0$o */
    private static class o {

        /* JADX INFO: renamed from: b */
        static final C0982A0 f3777b = new a().m4289a().m4267a().m4268b().m4269c();

        /* JADX INFO: renamed from: a */
        final C0982A0 f3778a;

        o(C0982A0 c0982a0) {
            this.f3778a = c0982a0;
        }

        /* JADX INFO: renamed from: a */
        C0982A0 mo4323a() {
            return this.f3778a;
        }

        /* JADX INFO: renamed from: b */
        C0982A0 mo4318b() {
            return this.f3778a;
        }

        /* JADX INFO: renamed from: c */
        C0982A0 mo4319c() {
            return this.f3778a;
        }

        /* JADX INFO: renamed from: d */
        void mo4307d(View view) {
        }

        /* JADX INFO: renamed from: e */
        void mo4308e(C0982A0 c0982a0) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return mo4312o() == oVar.mo4312o() && mo4321n() == oVar.mo4321n() && AbstractC0905b.m4125a(mo4310k(), oVar.mo4310k()) && AbstractC0905b.m4125a(mo4320i(), oVar.mo4320i()) && AbstractC0905b.m4125a(mo4324f(), oVar.mo4324f());
        }

        /* JADX INFO: renamed from: f */
        C1070r mo4324f() {
            return null;
        }

        /* JADX INFO: renamed from: g */
        C0247b mo4309g(int i7) {
            return C0247b.f983e;
        }

        /* JADX INFO: renamed from: h */
        C0247b mo4325h() {
            return mo4310k();
        }

        public int hashCode() {
            return AbstractC0905b.m4126b(Boolean.valueOf(mo4312o()), Boolean.valueOf(mo4321n()), mo4310k(), mo4320i(), mo4324f());
        }

        /* JADX INFO: renamed from: i */
        C0247b mo4320i() {
            return C0247b.f983e;
        }

        /* JADX INFO: renamed from: j */
        C0247b mo4326j() {
            return mo4310k();
        }

        /* JADX INFO: renamed from: k */
        C0247b mo4310k() {
            return C0247b.f983e;
        }

        /* JADX INFO: renamed from: l */
        C0247b mo4327l() {
            return mo4310k();
        }

        /* JADX INFO: renamed from: m */
        C0982A0 mo4311m(int i7, int i8, int i9, int i10) {
            return f3777b;
        }

        /* JADX INFO: renamed from: n */
        boolean mo4321n() {
            return false;
        }

        /* JADX INFO: renamed from: o */
        boolean mo4312o() {
            return false;
        }

        /* JADX INFO: renamed from: p */
        public void mo4313p(C0247b[] c0247bArr) {
        }

        /* JADX INFO: renamed from: q */
        void mo4314q(C0247b c0247b) {
        }

        /* JADX INFO: renamed from: r */
        void mo4315r(C0982A0 c0982a0) {
        }

        /* JADX INFO: renamed from: s */
        public void mo4322s(C0247b c0247b) {
        }

        /* JADX INFO: renamed from: t */
        void mo4316t(int i7) {
        }
    }

    /* JADX INFO: renamed from: O.A0$p */
    public static final class p {
        /* JADX INFO: renamed from: a */
        public static int m4328a() {
            return 128;
        }

        /* JADX INFO: renamed from: b */
        public static int m4329b() {
            return 8;
        }

        /* JADX INFO: renamed from: c */
        static int m4330c(int i7) {
            if (i7 == 1) {
                return 0;
            }
            if (i7 == 2) {
                return 1;
            }
            if (i7 == 4) {
                return 2;
            }
            if (i7 == 8) {
                return 3;
            }
            if (i7 == 16) {
                return 4;
            }
            if (i7 == 32) {
                return 5;
            }
            if (i7 == 64) {
                return 6;
            }
            if (i7 == 128) {
                return 7;
            }
            if (i7 == 256) {
                return 8;
            }
            if (i7 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i7);
        }

        /* JADX INFO: renamed from: d */
        public static int m4331d() {
            return 32;
        }

        /* JADX INFO: renamed from: e */
        public static int m4332e() {
            return 519;
        }
    }

    /* JADX INFO: renamed from: O.A0$q */
    private static final class q {
        /* JADX INFO: renamed from: a */
        static int m4333a(int i7) {
            int iStatusBars;
            int i8 = 0;
            for (int i9 = 1; i9 <= 512; i9 <<= 1) {
                if ((i7 & i9) != 0) {
                    if (i9 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i9 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i9 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i9 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i9 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i9 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i9 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i9 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i8 |= iStatusBars;
                }
            }
            return i8;
        }
    }

    /* JADX INFO: renamed from: O.A0$r */
    private static final class r {
        /* JADX INFO: renamed from: a */
        static int m4334a(int i7) {
            int iStatusBars;
            int i8 = 0;
            for (int i9 = 1; i9 <= 512; i9 <<= 1) {
                if ((i7 & i9) != 0) {
                    if (i9 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i9 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i9 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i9 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i9 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i9 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i9 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i9 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i9 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i8 |= iStatusBars;
                }
            }
            return i8;
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            f3748b = n.f3776s;
        } else if (i7 >= 30) {
            f3748b = l.f3775r;
        } else {
            f3748b = o.f3777b;
        }
    }

    private C0982A0(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            this.f3749a = new n(this, windowInsets);
            return;
        }
        if (i7 >= 31) {
            this.f3749a = new m(this, windowInsets);
            return;
        }
        if (i7 >= 30) {
            this.f3749a = new l(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.f3749a = new k(this, windowInsets);
        } else if (i7 >= 28) {
            this.f3749a = new j(this, windowInsets);
        } else {
            this.f3749a = new i(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: o */
    static C0247b m4264o(C0247b c0247b, int i7, int i8, int i9, int i10) {
        int iMax = Math.max(0, c0247b.f984a - i7);
        int iMax2 = Math.max(0, c0247b.f985b - i8);
        int iMax3 = Math.max(0, c0247b.f986c - i9);
        int iMax4 = Math.max(0, c0247b.f987d - i10);
        return (iMax == i7 && iMax2 == i8 && iMax3 == i9 && iMax4 == i10) ? c0247b : C0247b.m1184b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: x */
    public static C0982A0 m4265x(WindowInsets windowInsets) {
        return m4266y(windowInsets, null);
    }

    /* JADX INFO: renamed from: y */
    public static C0982A0 m4266y(WindowInsets windowInsets, View view) {
        C0982A0 c0982a0 = new C0982A0((WindowInsets) AbstractC0910g.m4139g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c0982a0.m4285t(AbstractC1030Z.m4433E(view));
            c0982a0.m4270d(view.getRootView());
            c0982a0.m4287v(view.getWindowSystemUiVisibility());
        }
        return c0982a0;
    }

    /* JADX INFO: renamed from: a */
    public C0982A0 m4267a() {
        return this.f3749a.mo4323a();
    }

    /* JADX INFO: renamed from: b */
    public C0982A0 m4268b() {
        return this.f3749a.mo4318b();
    }

    /* JADX INFO: renamed from: c */
    public C0982A0 m4269c() {
        return this.f3749a.mo4319c();
    }

    /* JADX INFO: renamed from: d */
    void m4270d(View view) {
        this.f3749a.mo4307d(view);
    }

    /* JADX INFO: renamed from: e */
    public C1070r m4271e() {
        return this.f3749a.mo4324f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0982A0) {
            return AbstractC0905b.m4125a(this.f3749a, ((C0982A0) obj).f3749a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C0247b m4272f(int i7) {
        return this.f3749a.mo4309g(i7);
    }

    /* JADX INFO: renamed from: g */
    public C0247b m4273g() {
        return this.f3749a.mo4320i();
    }

    /* JADX INFO: renamed from: h */
    public C0247b m4274h() {
        return this.f3749a.mo4326j();
    }

    public int hashCode() {
        o oVar = this.f3749a;
        if (oVar == null) {
            return 0;
        }
        return oVar.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public int m4275i() {
        return this.f3749a.mo4310k().f987d;
    }

    /* JADX INFO: renamed from: j */
    public int m4276j() {
        return this.f3749a.mo4310k().f984a;
    }

    /* JADX INFO: renamed from: k */
    public int m4277k() {
        return this.f3749a.mo4310k().f986c;
    }

    /* JADX INFO: renamed from: l */
    public int m4278l() {
        return this.f3749a.mo4310k().f985b;
    }

    /* JADX INFO: renamed from: m */
    public boolean m4279m() {
        return !this.f3749a.mo4310k().equals(C0247b.f983e);
    }

    /* JADX INFO: renamed from: n */
    public C0982A0 m4280n(int i7, int i8, int i9, int i10) {
        return this.f3749a.mo4311m(i7, i8, i9, i10);
    }

    /* JADX INFO: renamed from: p */
    public boolean m4281p() {
        return this.f3749a.mo4321n();
    }

    /* JADX INFO: renamed from: q */
    public C0982A0 m4282q(int i7, int i8, int i9, int i10) {
        return new a(this).m4292d(C0247b.m1184b(i7, i8, i9, i10)).m4289a();
    }

    /* JADX INFO: renamed from: r */
    void m4283r(C0247b[] c0247bArr) {
        this.f3749a.mo4313p(c0247bArr);
    }

    /* JADX INFO: renamed from: s */
    void m4284s(C0247b c0247b) {
        this.f3749a.mo4314q(c0247b);
    }

    /* JADX INFO: renamed from: t */
    void m4285t(C0982A0 c0982a0) {
        this.f3749a.mo4315r(c0982a0);
    }

    /* JADX INFO: renamed from: u */
    void m4286u(C0247b c0247b) {
        this.f3749a.mo4322s(c0247b);
    }

    /* JADX INFO: renamed from: v */
    void m4287v(int i7) {
        this.f3749a.mo4316t(i7);
    }

    /* JADX INFO: renamed from: w */
    public WindowInsets m4288w() {
        o oVar = this.f3749a;
        if (oVar instanceof h) {
            return ((h) oVar).f3765c;
        }
        return null;
    }

    /* JADX INFO: renamed from: O.A0$b */
    private static class b extends g {

        /* JADX INFO: renamed from: e */
        private static Field f3751e = null;

        /* JADX INFO: renamed from: f */
        private static boolean f3752f = false;

        /* JADX INFO: renamed from: g */
        private static Constructor f3753g = null;

        /* JADX INFO: renamed from: h */
        private static boolean f3754h = false;

        /* JADX INFO: renamed from: c */
        private WindowInsets f3755c;

        /* JADX INFO: renamed from: d */
        private C0247b f3756d;

        b() {
            this.f3755c = m4293i();
        }

        /* JADX INFO: renamed from: i */
        private static WindowInsets m4293i() {
            if (!f3752f) {
                try {
                    f3751e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
                }
                f3752f = true;
            }
            Field field = f3751e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e8);
                }
            }
            if (!f3754h) {
                try {
                    f3753g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e9);
                }
                f3754h = true;
            }
            Constructor constructor = f3753g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
                }
            }
            return null;
        }

        @Override // p111O.C0982A0.g
        /* JADX INFO: renamed from: b */
        C0982A0 mo4294b() {
            m4301a();
            C0982A0 c0982a0M4265x = C0982A0.m4265x(this.f3755c);
            c0982a0M4265x.m4283r(this.f3759b);
            c0982a0M4265x.m4286u(this.f3756d);
            return c0982a0M4265x;
        }

        @Override // p111O.C0982A0.g
        /* JADX INFO: renamed from: e */
        void mo4295e(C0247b c0247b) {
            this.f3756d = c0247b;
        }

        @Override // p111O.C0982A0.g
        /* JADX INFO: renamed from: g */
        void mo4296g(C0247b c0247b) {
            WindowInsets windowInsets = this.f3755c;
            if (windowInsets != null) {
                this.f3755c = windowInsets.replaceSystemWindowInsets(c0247b.f984a, c0247b.f985b, c0247b.f986c, c0247b.f987d);
            }
        }

        b(C0982A0 c0982a0) {
            super(c0982a0);
            this.f3755c = c0982a0.m4288w();
        }
    }

    /* JADX INFO: renamed from: O.A0$c */
    private static class c extends g {

        /* JADX INFO: renamed from: c */
        final WindowInsets.Builder f3757c;

        c() {
            this.f3757c = AbstractC0998I0.m4374a();
        }

        @Override // p111O.C0982A0.g
        /* JADX INFO: renamed from: b */
        C0982A0 mo4294b() {
            m4301a();
            C0982A0 c0982a0M4265x = C0982A0.m4265x(this.f3757c.build());
            c0982a0M4265x.m4283r(this.f3759b);
            return c0982a0M4265x;
        }

        @Override // p111O.C0982A0.g
        /* JADX INFO: renamed from: d */
        void mo4297d(C0247b c0247b) {
            this.f3757c.setMandatorySystemGestureInsets(c0247b.m1187e());
        }

        @Override // p111O.C0982A0.g
        /* JADX INFO: renamed from: e */
        void mo4295e(C0247b c0247b) {
            this.f3757c.setStableInsets(c0247b.m1187e());
        }

        @Override // p111O.C0982A0.g
        /* JADX INFO: renamed from: f */
        void mo4298f(C0247b c0247b) {
            this.f3757c.setSystemGestureInsets(c0247b.m1187e());
        }

        @Override // p111O.C0982A0.g
        /* JADX INFO: renamed from: g */
        void mo4296g(C0247b c0247b) {
            this.f3757c.setSystemWindowInsets(c0247b.m1187e());
        }

        @Override // p111O.C0982A0.g
        /* JADX INFO: renamed from: h */
        void mo4299h(C0247b c0247b) {
            this.f3757c.setTappableElementInsets(c0247b.m1187e());
        }

        c(C0982A0 c0982a0) {
            WindowInsets.Builder builderM4374a;
            super(c0982a0);
            WindowInsets windowInsetsM4288w = c0982a0.m4288w();
            if (windowInsetsM4288w != null) {
                builderM4374a = AbstractC0996H0.m4372a(windowInsetsM4288w);
            } else {
                builderM4374a = AbstractC0998I0.m4374a();
            }
            this.f3757c = builderM4374a;
        }
    }

    /* JADX INFO: renamed from: O.A0$i */
    private static class i extends h {

        /* JADX INFO: renamed from: n */
        private C0247b f3771n;

        i(C0982A0 c0982a0, WindowInsets windowInsets) {
            super(c0982a0, windowInsets);
            this.f3771n = null;
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: b */
        C0982A0 mo4318b() {
            return C0982A0.m4265x(this.f3765c.consumeStableInsets());
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: c */
        C0982A0 mo4319c() {
            return C0982A0.m4265x(this.f3765c.consumeSystemWindowInsets());
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: i */
        final C0247b mo4320i() {
            if (this.f3771n == null) {
                this.f3771n = C0247b.m1184b(this.f3765c.getStableInsetLeft(), this.f3765c.getStableInsetTop(), this.f3765c.getStableInsetRight(), this.f3765c.getStableInsetBottom());
            }
            return this.f3771n;
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: n */
        boolean mo4321n() {
            return this.f3765c.isConsumed();
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: s */
        public void mo4322s(C0247b c0247b) {
            this.f3771n = c0247b;
        }

        i(C0982A0 c0982a0, i iVar) {
            super(c0982a0, iVar);
            this.f3771n = null;
            this.f3771n = iVar.f3771n;
        }
    }

    /* JADX INFO: renamed from: O.A0$h */
    private static class h extends o {

        /* JADX INFO: renamed from: i */
        private static boolean f3760i = false;

        /* JADX INFO: renamed from: j */
        private static Method f3761j;

        /* JADX INFO: renamed from: k */
        private static Class f3762k;

        /* JADX INFO: renamed from: l */
        private static Field f3763l;

        /* JADX INFO: renamed from: m */
        private static Field f3764m;

        /* JADX INFO: renamed from: c */
        final WindowInsets f3765c;

        /* JADX INFO: renamed from: d */
        private C0247b[] f3766d;

        /* JADX INFO: renamed from: e */
        private C0247b f3767e;

        /* JADX INFO: renamed from: f */
        private C0982A0 f3768f;

        /* JADX INFO: renamed from: g */
        C0247b f3769g;

        /* JADX INFO: renamed from: h */
        int f3770h;

        h(C0982A0 c0982a0, WindowInsets windowInsets) {
            super(c0982a0);
            this.f3767e = null;
            this.f3765c = windowInsets;
        }

        /* JADX INFO: renamed from: u */
        private C0247b m4302u(int i7, boolean z7) {
            C0247b c0247bM1183a = C0247b.f983e;
            for (int i8 = 1; i8 <= 512; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    c0247bM1183a = C0247b.m1183a(c0247bM1183a, m4317v(i8, z7));
                }
            }
            return c0247bM1183a;
        }

        /* JADX INFO: renamed from: w */
        private C0247b m4303w() {
            C0982A0 c0982a0 = this.f3768f;
            return c0982a0 != null ? c0982a0.m4273g() : C0247b.f983e;
        }

        /* JADX INFO: renamed from: x */
        private C0247b m4304x(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f3760i) {
                m4305y();
            }
            Method method = f3761j;
            if (method != null && f3762k != null && f3763l != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f3763l.get(f3764m.get(objInvoke));
                    if (rect != null) {
                        return C0247b.m1185c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e7) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: y */
        private static void m4305y() {
            try {
                f3761j = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3762k = cls;
                f3763l = cls.getDeclaredField("mVisibleInsets");
                f3764m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3763l.setAccessible(true);
                f3764m.setAccessible(true);
            } catch (ReflectiveOperationException e7) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
            f3760i = true;
        }

        /* JADX INFO: renamed from: z */
        static boolean m4306z(int i7, int i8) {
            return (i7 & 6) == (i8 & 6);
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: d */
        void mo4307d(View view) {
            C0247b c0247bM4304x = m4304x(view);
            if (c0247bM4304x == null) {
                c0247bM4304x = C0247b.f983e;
            }
            mo4314q(c0247bM4304x);
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: e */
        void mo4308e(C0982A0 c0982a0) {
            c0982a0.m4285t(this.f3768f);
            c0982a0.m4284s(this.f3769g);
            c0982a0.m4287v(this.f3770h);
        }

        @Override // p111O.C0982A0.o
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f3769g, hVar.f3769g) && m4306z(this.f3770h, hVar.f3770h);
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: g */
        public C0247b mo4309g(int i7) {
            return m4302u(i7, false);
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: k */
        final C0247b mo4310k() {
            if (this.f3767e == null) {
                this.f3767e = C0247b.m1184b(this.f3765c.getSystemWindowInsetLeft(), this.f3765c.getSystemWindowInsetTop(), this.f3765c.getSystemWindowInsetRight(), this.f3765c.getSystemWindowInsetBottom());
            }
            return this.f3767e;
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: m */
        C0982A0 mo4311m(int i7, int i8, int i9, int i10) {
            a aVar = new a(C0982A0.m4265x(this.f3765c));
            aVar.m4292d(C0982A0.m4264o(mo4310k(), i7, i8, i9, i10));
            aVar.m4291c(C0982A0.m4264o(mo4320i(), i7, i8, i9, i10));
            return aVar.m4289a();
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: o */
        boolean mo4312o() {
            return this.f3765c.isRound();
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: p */
        public void mo4313p(C0247b[] c0247bArr) {
            this.f3766d = c0247bArr;
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: q */
        void mo4314q(C0247b c0247b) {
            this.f3769g = c0247b;
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: r */
        void mo4315r(C0982A0 c0982a0) {
            this.f3768f = c0982a0;
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: t */
        void mo4316t(int i7) {
            this.f3770h = i7;
        }

        /* JADX INFO: renamed from: v */
        protected C0247b m4317v(int i7, boolean z7) {
            C0247b c0247bM4273g;
            int i8;
            if (i7 == 1) {
                if (z7) {
                    return C0247b.m1184b(0, Math.max(m4303w().f985b, mo4310k().f985b), 0, 0);
                }
                return (this.f3770h & 4) != 0 ? C0247b.f983e : C0247b.m1184b(0, mo4310k().f985b, 0, 0);
            }
            if (i7 == 2) {
                if (z7) {
                    C0247b c0247bM4303w = m4303w();
                    C0247b c0247bMo4320i = mo4320i();
                    return C0247b.m1184b(Math.max(c0247bM4303w.f984a, c0247bMo4320i.f984a), 0, Math.max(c0247bM4303w.f986c, c0247bMo4320i.f986c), Math.max(c0247bM4303w.f987d, c0247bMo4320i.f987d));
                }
                if ((this.f3770h & 2) != 0) {
                    return C0247b.f983e;
                }
                C0247b c0247bMo4310k = mo4310k();
                C0982A0 c0982a0 = this.f3768f;
                c0247bM4273g = c0982a0 != null ? c0982a0.m4273g() : null;
                int iMin = c0247bMo4310k.f987d;
                if (c0247bM4273g != null) {
                    iMin = Math.min(iMin, c0247bM4273g.f987d);
                }
                return C0247b.m1184b(c0247bMo4310k.f984a, 0, c0247bMo4310k.f986c, iMin);
            }
            if (i7 != 8) {
                if (i7 == 16) {
                    return mo4326j();
                }
                if (i7 == 32) {
                    return mo4325h();
                }
                if (i7 == 64) {
                    return mo4327l();
                }
                if (i7 != 128) {
                    return C0247b.f983e;
                }
                C0982A0 c0982a1 = this.f3768f;
                C1070r c1070rM4271e = c0982a1 != null ? c0982a1.m4271e() : mo4324f();
                return c1070rM4271e != null ? C0247b.m1184b(c1070rM4271e.m4760b(), c1070rM4271e.m4762d(), c1070rM4271e.m4761c(), c1070rM4271e.m4759a()) : C0247b.f983e;
            }
            C0247b[] c0247bArr = this.f3766d;
            c0247bM4273g = c0247bArr != null ? c0247bArr[p.m4330c(8)] : null;
            if (c0247bM4273g != null) {
                return c0247bM4273g;
            }
            C0247b c0247bMo4310k2 = mo4310k();
            C0247b c0247bM4303w2 = m4303w();
            int i9 = c0247bMo4310k2.f987d;
            if (i9 > c0247bM4303w2.f987d) {
                return C0247b.m1184b(0, 0, 0, i9);
            }
            C0247b c0247b = this.f3769g;
            return (c0247b == null || c0247b.equals(C0247b.f983e) || (i8 = this.f3769g.f987d) <= c0247bM4303w2.f987d) ? C0247b.f983e : C0247b.m1184b(0, 0, 0, i8);
        }

        h(C0982A0 c0982a0, h hVar) {
            this(c0982a0, new WindowInsets(hVar.f3765c));
        }
    }

    /* JADX INFO: renamed from: O.A0$k */
    private static class k extends j {

        /* JADX INFO: renamed from: o */
        private C0247b f3772o;

        /* JADX INFO: renamed from: p */
        private C0247b f3773p;

        /* JADX INFO: renamed from: q */
        private C0247b f3774q;

        k(C0982A0 c0982a0, WindowInsets windowInsets) {
            super(c0982a0, windowInsets);
            this.f3772o = null;
            this.f3773p = null;
            this.f3774q = null;
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: h */
        C0247b mo4325h() {
            if (this.f3773p == null) {
                this.f3773p = C0247b.m1186d(this.f3765c.getMandatorySystemGestureInsets());
            }
            return this.f3773p;
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: j */
        C0247b mo4326j() {
            if (this.f3772o == null) {
                this.f3772o = C0247b.m1186d(this.f3765c.getSystemGestureInsets());
            }
            return this.f3772o;
        }

        @Override // p111O.C0982A0.o
        /* JADX INFO: renamed from: l */
        C0247b mo4327l() {
            if (this.f3774q == null) {
                this.f3774q = C0247b.m1186d(this.f3765c.getTappableElementInsets());
            }
            return this.f3774q;
        }

        @Override // p111O.C0982A0.h, p111O.C0982A0.o
        /* JADX INFO: renamed from: m */
        C0982A0 mo4311m(int i7, int i8, int i9, int i10) {
            return C0982A0.m4265x(this.f3765c.inset(i7, i8, i9, i10));
        }

        @Override // p111O.C0982A0.i, p111O.C0982A0.o
        /* JADX INFO: renamed from: s */
        public void mo4322s(C0247b c0247b) {
        }

        k(C0982A0 c0982a0, k kVar) {
            super(c0982a0, kVar);
            this.f3772o = null;
            this.f3773p = null;
            this.f3774q = null;
        }
    }

    /* JADX INFO: renamed from: O.A0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final g f3750a;

        public a() {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                this.f3750a = new f();
                return;
            }
            if (i7 >= 31) {
                this.f3750a = new e();
                return;
            }
            if (i7 >= 30) {
                this.f3750a = new d();
            } else if (i7 >= 29) {
                this.f3750a = new c();
            } else {
                this.f3750a = new b();
            }
        }

        /* JADX INFO: renamed from: a */
        public C0982A0 m4289a() {
            return this.f3750a.mo4294b();
        }

        /* JADX INFO: renamed from: b */
        public a m4290b(int i7, C0247b c0247b) {
            this.f3750a.mo4300c(i7, c0247b);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m4291c(C0247b c0247b) {
            this.f3750a.mo4295e(c0247b);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m4292d(C0247b c0247b) {
            this.f3750a.mo4296g(c0247b);
            return this;
        }

        public a(C0982A0 c0982a0) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                this.f3750a = new f(c0982a0);
                return;
            }
            if (i7 >= 31) {
                this.f3750a = new e(c0982a0);
                return;
            }
            if (i7 >= 30) {
                this.f3750a = new d(c0982a0);
            } else if (i7 >= 29) {
                this.f3750a = new c(c0982a0);
            } else {
                this.f3750a = new b(c0982a0);
            }
        }
    }

    public C0982A0(C0982A0 c0982a0) {
        if (c0982a0 != null) {
            o oVar = c0982a0.f3749a;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34 && (oVar instanceof n)) {
                this.f3749a = new n(this, (n) oVar);
            } else if (i7 >= 31 && (oVar instanceof m)) {
                this.f3749a = new m(this, (m) oVar);
            } else if (i7 >= 30 && (oVar instanceof l)) {
                this.f3749a = new l(this, (l) oVar);
            } else if (i7 >= 29 && (oVar instanceof k)) {
                this.f3749a = new k(this, (k) oVar);
            } else if (i7 >= 28 && (oVar instanceof j)) {
                this.f3749a = new j(this, (j) oVar);
            } else if (oVar instanceof i) {
                this.f3749a = new i(this, (i) oVar);
            } else if (oVar instanceof h) {
                this.f3749a = new h(this, (h) oVar);
            } else {
                this.f3749a = new o(this);
            }
            oVar.mo4308e(this);
            return;
        }
        this.f3749a = new o(this);
    }
}

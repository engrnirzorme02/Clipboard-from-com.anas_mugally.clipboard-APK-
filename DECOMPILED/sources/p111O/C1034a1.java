package p111O;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.collection.C2400k;

/* JADX INFO: renamed from: O.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1034a1 {

    /* JADX INFO: renamed from: a */
    private final g f3827a;

    /* JADX INFO: renamed from: O.a1$a */
    private static class a extends g {

        /* JADX INFO: renamed from: a */
        protected final Window f3828a;

        /* JADX INFO: renamed from: b */
        private final C1007N f3829b;

        a(Window window, C1007N c1007n) {
            this.f3828a = window;
            this.f3829b = c1007n;
        }

        /* JADX INFO: renamed from: f */
        private void m4597f(int i7) {
            if (i7 == 1) {
                m4601g(4);
            } else if (i7 == 2) {
                m4601g(2);
            } else {
                if (i7 != 8) {
                    return;
                }
                this.f3829b.m4389a();
            }
        }

        /* JADX INFO: renamed from: i */
        private void m4598i(int i7) {
            if (i7 == 1) {
                m4603j(4);
                m4604k(1024);
            } else if (i7 == 2) {
                m4603j(2);
            } else {
                if (i7 != 8) {
                    return;
                }
                this.f3829b.m4390b();
            }
        }

        @Override // p111O.C1034a1.g
        /* JADX INFO: renamed from: a */
        void mo4599a(int i7) {
            for (int i8 = 1; i8 <= 512; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    m4597f(i8);
                }
            }
        }

        @Override // p111O.C1034a1.g
        /* JADX INFO: renamed from: e */
        void mo4600e(int i7) {
            for (int i8 = 1; i8 <= 512; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    m4598i(i8);
                }
            }
        }

        /* JADX INFO: renamed from: g */
        protected void m4601g(int i7) {
            View decorView = this.f3828a.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: h */
        protected void m4602h(int i7) {
            this.f3828a.addFlags(i7);
        }

        /* JADX INFO: renamed from: j */
        protected void m4603j(int i7) {
            View decorView = this.f3828a.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: k */
        protected void m4604k(int i7) {
            this.f3828a.clearFlags(i7);
        }
    }

    /* JADX INFO: renamed from: O.a1$b */
    private static class b extends a {
        b(Window window, C1007N c1007n) {
            super(window, c1007n);
        }

        @Override // p111O.C1034a1.g
        /* JADX INFO: renamed from: b */
        public boolean mo4605b() {
            return (this.f3828a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // p111O.C1034a1.g
        /* JADX INFO: renamed from: d */
        public void mo4606d(boolean z7) {
            if (!z7) {
                m4603j(8192);
                return;
            }
            m4604k(67108864);
            m4602h(Integer.MIN_VALUE);
            m4601g(8192);
        }
    }

    /* JADX INFO: renamed from: O.a1$c */
    private static class c extends b {
        c(Window window, C1007N c1007n) {
            super(window, c1007n);
        }

        @Override // p111O.C1034a1.g
        /* JADX INFO: renamed from: c */
        public void mo4607c(boolean z7) {
            if (!z7) {
                m4603j(16);
                return;
            }
            m4604k(134217728);
            m4602h(Integer.MIN_VALUE);
            m4601g(16);
        }
    }

    /* JADX INFO: renamed from: O.a1$e */
    private static class e extends d {
        e(Window window, C1034a1 c1034a1, C1007N c1007n) {
            super(window, c1034a1, c1007n);
        }

        e(WindowInsetsController windowInsetsController, C1034a1 c1034a1, C1007N c1007n) {
            super(windowInsetsController, c1034a1, c1007n);
        }
    }

    /* JADX INFO: renamed from: O.a1$f */
    private static class f extends e {
        f(Window window, C1034a1 c1034a1, C1007N c1007n) {
            super(window, c1034a1, c1007n);
        }

        @Override // p111O.C1034a1.d, p111O.C1034a1.g
        /* JADX INFO: renamed from: b */
        public boolean mo4605b() {
            return (this.f3831b.getSystemBarsAppearance() & 8) != 0;
        }

        f(WindowInsetsController windowInsetsController, C1034a1 c1034a1, C1007N c1007n) {
            super(windowInsetsController, c1034a1, c1007n);
        }
    }

    /* JADX INFO: renamed from: O.a1$g */
    private static class g {
        g() {
        }

        /* JADX INFO: renamed from: a */
        abstract void mo4599a(int i7);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo4605b();

        /* JADX INFO: renamed from: c */
        public abstract void mo4607c(boolean z7);

        /* JADX INFO: renamed from: d */
        public abstract void mo4606d(boolean z7);

        /* JADX INFO: renamed from: e */
        abstract void mo4600e(int i7);
    }

    private C1034a1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f3827a = new f(windowInsetsController, this, new C1007N(windowInsetsController));
        } else {
            this.f3827a = new d(windowInsetsController, this, new C1007N(windowInsetsController));
        }
    }

    /* JADX INFO: renamed from: f */
    public static C1034a1 m4591f(WindowInsetsController windowInsetsController) {
        return new C1034a1(windowInsetsController);
    }

    /* JADX INFO: renamed from: a */
    public void m4592a(int i7) {
        this.f3827a.mo4599a(i7);
    }

    /* JADX INFO: renamed from: b */
    public boolean m4593b() {
        return this.f3827a.mo4605b();
    }

    /* JADX INFO: renamed from: c */
    public void m4594c(boolean z7) {
        this.f3827a.mo4607c(z7);
    }

    /* JADX INFO: renamed from: d */
    public void m4595d(boolean z7) {
        this.f3827a.mo4606d(z7);
    }

    /* JADX INFO: renamed from: e */
    public void m4596e(int i7) {
        this.f3827a.mo4600e(i7);
    }

    /* JADX INFO: renamed from: O.a1$d */
    private static class d extends g {

        /* JADX INFO: renamed from: a */
        final C1034a1 f3830a;

        /* JADX INFO: renamed from: b */
        final WindowInsetsController f3831b;

        /* JADX INFO: renamed from: c */
        final C1007N f3832c;

        /* JADX INFO: renamed from: d */
        private final C2400k f3833d;

        /* JADX INFO: renamed from: e */
        protected Window f3834e;

        d(Window window, C1034a1 c1034a1, C1007N c1007n) {
            this(window.getInsetsController(), c1034a1, c1007n);
            this.f3834e = window;
        }

        @Override // p111O.C1034a1.g
        /* JADX INFO: renamed from: a */
        void mo4599a(int i7) {
            if ((i7 & 8) != 0) {
                this.f3832c.m4389a();
            }
            this.f3831b.hide(i7 & (-9));
        }

        @Override // p111O.C1034a1.g
        /* JADX INFO: renamed from: b */
        public boolean mo4605b() {
            this.f3831b.setSystemBarsAppearance(0, 0);
            return (this.f3831b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // p111O.C1034a1.g
        /* JADX INFO: renamed from: c */
        public void mo4607c(boolean z7) {
            if (z7) {
                if (this.f3834e != null) {
                    m4608f(16);
                }
                this.f3831b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f3834e != null) {
                    m4609g(16);
                }
                this.f3831b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // p111O.C1034a1.g
        /* JADX INFO: renamed from: d */
        public void mo4606d(boolean z7) {
            if (z7) {
                if (this.f3834e != null) {
                    m4608f(8192);
                }
                this.f3831b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f3834e != null) {
                    m4609g(8192);
                }
                this.f3831b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // p111O.C1034a1.g
        /* JADX INFO: renamed from: e */
        void mo4600e(int i7) {
            if ((i7 & 8) != 0) {
                this.f3832c.m4390b();
            }
            this.f3831b.show(i7 & (-9));
        }

        /* JADX INFO: renamed from: f */
        protected void m4608f(int i7) {
            View decorView = this.f3834e.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: renamed from: g */
        protected void m4609g(int i7) {
            View decorView = this.f3834e.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, C1034a1 c1034a1, C1007N c1007n) {
            this.f3833d = new C2400k();
            this.f3831b = windowInsetsController;
            this.f3830a = c1034a1;
            this.f3832c = c1007n;
        }
    }

    public C1034a1(Window window, View view) {
        C1007N c1007n = new C1007N(view);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            this.f3827a = new f(window, this, c1007n);
        } else if (i7 >= 30) {
            this.f3827a = new d(window, this, c1007n);
        } else {
            this.f3827a = new c(window, c1007n);
        }
    }
}

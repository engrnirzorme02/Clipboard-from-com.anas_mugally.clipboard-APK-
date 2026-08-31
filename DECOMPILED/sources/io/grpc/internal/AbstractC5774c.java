package io.grpc.internal;

import java.io.InputStream;
import p063H5.InterfaceC0553l;
import p063H5.InterfaceC0557n;
import p063H5.InterfaceC0569u;
import p122P3.AbstractC1209m;
import p131Q5.AbstractC1291c;
import p131Q5.C1290b;
import p131Q5.C1293e;

/* JADX INFO: renamed from: io.grpc.internal.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5774c implements InterfaceC5753P0 {

    /* JADX INFO: renamed from: io.grpc.internal.c$a */
    public static abstract class a implements C5778e.h, C5795m0.b {

        /* JADX INFO: renamed from: a */
        private InterfaceC5820z f22419a;

        /* JADX INFO: renamed from: b */
        private final Object f22420b = new Object();

        /* JADX INFO: renamed from: c */
        private final C5751O0 f22421c;

        /* JADX INFO: renamed from: d */
        private final C5762U0 f22422d;

        /* JADX INFO: renamed from: e */
        private final C5795m0 f22423e;

        /* JADX INFO: renamed from: f */
        private int f22424f;

        /* JADX INFO: renamed from: g */
        private boolean f22425g;

        /* JADX INFO: renamed from: h */
        private boolean f22426h;

        /* JADX INFO: renamed from: io.grpc.internal.c$a$a, reason: collision with other inner class name */
        class RunnableC7692a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C1290b f22427a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f22428b;

            RunnableC7692a(C1290b c1290b, int i7) {
                this.f22427a = c1290b;
                this.f22428b = i7;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C1293e c1293eM5632h = AbstractC1291c.m5632h("AbstractStream.request");
                    try {
                        AbstractC1291c.m5629e(this.f22427a);
                        a.this.f22419a.mo25913d(this.f22428b);
                        if (c1293eM5632h != null) {
                            c1293eM5632h.close();
                        }
                    } catch (Throwable th) {
                        if (c1293eM5632h != null) {
                            try {
                                c1293eM5632h.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    a.this.mo3284e(th3);
                }
            }
        }

        protected a(int i7, C5751O0 c5751o0, C5762U0 c5762u0) {
            this.f22421c = (C5751O0) AbstractC1209m.m5303o(c5751o0, "statsTraceCtx");
            this.f22422d = (C5762U0) AbstractC1209m.m5303o(c5762u0, "transportTracer");
            C5795m0 c5795m0 = new C5795m0(this, InterfaceC0553l.b.f2096a, i7, c5751o0, c5762u0);
            this.f22423e = c5795m0;
            this.f22419a = c5795m0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public boolean m25859n() {
            boolean z7;
            synchronized (this.f22420b) {
                try {
                    z7 = this.f22425g && this.f22424f < 32768 && !this.f22426h;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z7;
        }

        /* JADX INFO: renamed from: p */
        private void m25860p() {
            boolean zM25859n;
            synchronized (this.f22420b) {
                zM25859n = m25859n();
            }
            if (zM25859n) {
                mo25845o().mo25474b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public void m25861q(int i7) {
            synchronized (this.f22420b) {
                this.f22424f += i7;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: u */
        public void m25862u(int i7) {
            mo3285f(new RunnableC7692a(AbstractC1291c.m5630f(), i7));
        }

        @Override // io.grpc.internal.C5795m0.b
        /* JADX INFO: renamed from: a */
        public void mo25632a(InterfaceC5755Q0.a aVar) {
            mo25845o().mo25473a(aVar);
        }

        /* JADX INFO: renamed from: b */
        public final void m25863b(int i7) {
            boolean z7;
            synchronized (this.f22420b) {
                AbstractC1209m.m5309u(this.f22425g, "onStreamAllocated was not called, but it seems the stream is active");
                int i8 = this.f22424f;
                z7 = false;
                boolean z8 = i8 < 32768;
                int i9 = i8 - i7;
                this.f22424f = i9;
                boolean z9 = i9 < 32768;
                if (!z8 && z9) {
                    z7 = true;
                }
            }
            if (z7) {
                m25860p();
            }
        }

        /* JADX INFO: renamed from: k */
        protected final void m25864k(boolean z7) {
            if (z7) {
                this.f22419a.close();
            } else {
                this.f22419a.mo25916x();
            }
        }

        /* JADX INFO: renamed from: l */
        protected final void m25865l(InterfaceC5819y0 interfaceC5819y0) {
            try {
                this.f22419a.mo25912J(interfaceC5819y0);
            } catch (Throwable th) {
                mo3284e(th);
            }
        }

        /* JADX INFO: renamed from: m */
        protected C5762U0 m25866m() {
            return this.f22422d;
        }

        /* JADX INFO: renamed from: o */
        protected abstract InterfaceC5755Q0 mo25845o();

        /* JADX INFO: renamed from: r */
        protected void mo3290r() {
            AbstractC1209m.m5308t(mo25845o() != null);
            synchronized (this.f22420b) {
                AbstractC1209m.m5309u(!this.f22425g, "Already allocated");
                this.f22425g = true;
            }
            m25860p();
        }

        /* JADX INFO: renamed from: s */
        protected final void m25867s() {
            synchronized (this.f22420b) {
                this.f22426h = true;
            }
        }

        /* JADX INFO: renamed from: t */
        final void m25868t() {
            this.f22423e.m26072R0(this);
            this.f22419a = this.f22423e;
        }

        /* JADX INFO: renamed from: v */
        protected final void m25869v(InterfaceC0569u interfaceC0569u) {
            this.f22419a.mo25915n(interfaceC0569u);
        }

        /* JADX INFO: renamed from: w */
        protected void m25870w(C5759T c5759t) {
            this.f22423e.m26071Q0(c5759t);
            this.f22419a = new C5778e(this, this, this.f22423e);
        }

        /* JADX INFO: renamed from: x */
        final void m25871x(int i7) {
            this.f22419a.mo25914m(i7);
        }
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: c */
    public final void mo25458c(InterfaceC0557n interfaceC0557n) {
        mo25826j().mo25659c((InterfaceC0557n) AbstractC1209m.m5303o(interfaceC0557n, "compressor"));
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: d */
    public final void mo25459d(int i7) {
        mo3264l().m25862u(i7);
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: e */
    public boolean mo25460e() {
        return mo3264l().m25859n();
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: f */
    public final void mo25461f(InputStream inputStream) {
        AbstractC1209m.m5303o(inputStream, "message");
        try {
            if (!mo25826j().isClosed()) {
                mo25826j().mo25660d(inputStream);
            }
        } finally {
            AbstractC5757S.m25667e(inputStream);
        }
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    public final void flush() {
        if (mo25826j().isClosed()) {
            return;
        }
        mo25826j().flush();
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: g */
    public void mo25462g() {
        mo3264l().m25868t();
    }

    /* JADX INFO: renamed from: i */
    protected final void m25853i() {
        mo25826j().close();
    }

    /* JADX INFO: renamed from: j */
    protected abstract InterfaceC5752P mo25826j();

    /* JADX INFO: renamed from: k */
    protected final void m25854k(int i7) {
        mo3264l().m25861q(i7);
    }

    /* JADX INFO: renamed from: l */
    protected abstract a mo3264l();
}

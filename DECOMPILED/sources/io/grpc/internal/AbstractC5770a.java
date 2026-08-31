package io.grpc.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p063H5.AbstractC0508C;
import p063H5.C0530Z;
import p063H5.C0535c;
import p063H5.C0554l0;
import p063H5.C0568t;
import p063H5.C0570v;
import p063H5.InterfaceC0553l;
import p063H5.InterfaceC0557n;
import p063H5.InterfaceC0569u;
import p122P3.AbstractC1209m;
import p136R3.AbstractC1332b;

/* JADX INFO: renamed from: io.grpc.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5770a extends AbstractC5774c implements InterfaceC5804r, C5797n0.d {

    /* JADX INFO: renamed from: g */
    private static final Logger f22390g = Logger.getLogger(AbstractC5770a.class.getName());

    /* JADX INFO: renamed from: a */
    private final C5762U0 f22391a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5752P f22392b;

    /* JADX INFO: renamed from: c */
    private boolean f22393c;

    /* JADX INFO: renamed from: d */
    private boolean f22394d;

    /* JADX INFO: renamed from: e */
    private C0530Z f22395e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f22396f;

    /* JADX INFO: renamed from: io.grpc.internal.a$a */
    private class a implements InterfaceC5752P {

        /* JADX INFO: renamed from: a */
        private C0530Z f22397a;

        /* JADX INFO: renamed from: b */
        private boolean f22398b;

        /* JADX INFO: renamed from: c */
        private final C5751O0 f22399c;

        /* JADX INFO: renamed from: d */
        private byte[] f22400d;

        public a(C0530Z c0530z, C5751O0 c5751o0) {
            this.f22397a = (C0530Z) AbstractC1209m.m5303o(c0530z, "headers");
            this.f22399c = (C5751O0) AbstractC1209m.m5303o(c5751o0, "statsTraceCtx");
        }

        @Override // io.grpc.internal.InterfaceC5752P
        /* JADX INFO: renamed from: c */
        public InterfaceC5752P mo25659c(InterfaceC0557n interfaceC0557n) {
            return this;
        }

        @Override // io.grpc.internal.InterfaceC5752P
        public void close() {
            this.f22398b = true;
            AbstractC1209m.m5309u(this.f22400d != null, "Lack of request message. GET request is only supported for unary requests");
            AbstractC5770a.this.mo3266v().mo3270c(this.f22397a, this.f22400d);
            this.f22400d = null;
            this.f22397a = null;
        }

        @Override // io.grpc.internal.InterfaceC5752P
        /* JADX INFO: renamed from: d */
        public void mo25660d(InputStream inputStream) {
            AbstractC1209m.m5309u(this.f22400d == null, "writePayload should not be called multiple times");
            try {
                this.f22400d = AbstractC1332b.m5715d(inputStream);
                this.f22399c.m25654i(0);
                C5751O0 c5751o0 = this.f22399c;
                byte[] bArr = this.f22400d;
                c5751o0.m25655j(0, bArr.length, bArr.length);
                this.f22399c.m25656k(this.f22400d.length);
                this.f22399c.m25657l(this.f22400d.length);
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // io.grpc.internal.InterfaceC5752P
        public void flush() {
        }

        @Override // io.grpc.internal.InterfaceC5752P
        public boolean isClosed() {
            return this.f22398b;
        }

        @Override // io.grpc.internal.InterfaceC5752P
        /* JADX INFO: renamed from: n */
        public void mo25661n(int i7) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: io.grpc.internal.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo3268a(C0554l0 c0554l0);

        /* JADX INFO: renamed from: b */
        void mo3269b(InterfaceC5764V0 interfaceC5764V0, boolean z7, boolean z8, int i7);

        /* JADX INFO: renamed from: c */
        void mo3270c(C0530Z c0530z, byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: io.grpc.internal.a$c */
    public static abstract class c extends AbstractC5774c.a {

        /* JADX INFO: renamed from: i */
        private final C5751O0 f22402i;

        /* JADX INFO: renamed from: j */
        private boolean f22403j;

        /* JADX INFO: renamed from: k */
        private InterfaceC5806s f22404k;

        /* JADX INFO: renamed from: l */
        private boolean f22405l;

        /* JADX INFO: renamed from: m */
        private C0570v f22406m;

        /* JADX INFO: renamed from: n */
        private boolean f22407n;

        /* JADX INFO: renamed from: o */
        private Runnable f22408o;

        /* JADX INFO: renamed from: p */
        private volatile boolean f22409p;

        /* JADX INFO: renamed from: q */
        private boolean f22410q;

        /* JADX INFO: renamed from: r */
        private boolean f22411r;

        /* JADX INFO: renamed from: io.grpc.internal.a$c$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0554l0 f22412a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC5806s.a f22413b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C0530Z f22414c;

            a(C0554l0 c0554l0, InterfaceC5806s.a aVar, C0530Z c0530z) {
                this.f22412a = c0554l0;
                this.f22413b = aVar;
                this.f22414c = c0530z;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.m25831C(this.f22412a, this.f22413b, this.f22414c);
            }
        }

        protected c(int i7, C5751O0 c5751o0, C5762U0 c5762u0) {
            super(i7, c5751o0, c5762u0);
            this.f22406m = C0570v.m2527c();
            this.f22407n = false;
            this.f22402i = (C5751O0) AbstractC1209m.m5303o(c5751o0, "statsTraceCtx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: C */
        public void m25831C(C0554l0 c0554l0, InterfaceC5806s.a aVar, C0530Z c0530z) {
            if (this.f22403j) {
                return;
            }
            this.f22403j = true;
            this.f22402i.m25658m(c0554l0);
            if (m25866m() != null) {
                m25866m().m25739f(c0554l0.m2460o());
            }
            mo25845o().mo25475c(c0554l0, aVar, c0530z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public void m25832I(C0570v c0570v) {
            AbstractC1209m.m5309u(this.f22404k == null, "Already called start");
            this.f22406m = (C0570v) AbstractC1209m.m5303o(c0570v, "decompressorRegistry");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: J */
        public void m25833J(boolean z7) {
            this.f22405l = z7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public final void m25834L() {
            this.f22409p = true;
        }

        /* JADX INFO: renamed from: D */
        protected void m25837D(InterfaceC5819y0 interfaceC5819y0) throws Throwable {
            AbstractC1209m.m5303o(interfaceC5819y0, "frame");
            boolean z7 = true;
            try {
                if (this.f22410q) {
                    AbstractC5770a.f22390g.log(Level.INFO, "Received data on closed stream");
                    interfaceC5819y0.close();
                    return;
                } else {
                    try {
                        m25865l(interfaceC5819y0);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        z7 = false;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (z7) {
                interfaceC5819y0.close();
            }
            throw th;
        }

        /* JADX INFO: renamed from: E */
        protected void m25838E(C0530Z c0530z) {
            boolean z7 = true;
            AbstractC1209m.m5309u(!this.f22410q, "Received headers on closed stream");
            this.f22402i.m25647a();
            String str = (String) c0530z.m2283g(AbstractC5757S.f22231g);
            if (!this.f22405l || str == null) {
                z7 = false;
            } else if (str.equalsIgnoreCase("gzip")) {
                m25870w(new C5759T());
            } else {
                if (!str.equalsIgnoreCase("identity")) {
                    mo3284e(C0554l0.f2112s.m2462q(String.format("Can't find full stream decompressor for %s", str)).m2455d());
                    return;
                }
                z7 = false;
            }
            String str2 = (String) c0530z.m2283g(AbstractC5757S.f22229e);
            if (str2 != null) {
                InterfaceC0569u interfaceC0569uM2530e = this.f22406m.m2530e(str2);
                if (interfaceC0569uM2530e == null) {
                    mo3284e(C0554l0.f2112s.m2462q(String.format("Can't find decompressor for %s", str2)).m2455d());
                    return;
                } else if (interfaceC0569uM2530e != InterfaceC0553l.b.f2096a) {
                    if (z7) {
                        mo3284e(C0554l0.f2112s.m2462q("Full stream and gRPC message encoding cannot both be set").m2455d());
                        return;
                    }
                    m25869v(interfaceC0569uM2530e);
                }
            }
            mo25845o().mo25476d(c0530z);
        }

        /* JADX INFO: renamed from: F */
        protected void m25839F(C0530Z c0530z, C0554l0 c0554l0) {
            AbstractC1209m.m5303o(c0554l0, "status");
            AbstractC1209m.m5303o(c0530z, "trailers");
            if (this.f22410q) {
                AbstractC5770a.f22390g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{c0554l0, c0530z});
            } else {
                this.f22402i.m25648b(c0530z);
                m25844N(c0554l0, false, c0530z);
            }
        }

        /* JADX INFO: renamed from: G */
        protected final boolean m25840G() {
            return this.f22409p;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.AbstractC5774c.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5806s mo25845o() {
            return this.f22404k;
        }

        /* JADX INFO: renamed from: K */
        public final void m25842K(InterfaceC5806s interfaceC5806s) {
            AbstractC1209m.m5309u(this.f22404k == null, "Already called setListener");
            this.f22404k = (InterfaceC5806s) AbstractC1209m.m5303o(interfaceC5806s, "listener");
        }

        /* JADX INFO: renamed from: M */
        public final void m25843M(C0554l0 c0554l0, InterfaceC5806s.a aVar, boolean z7, C0530Z c0530z) {
            AbstractC1209m.m5303o(c0554l0, "status");
            AbstractC1209m.m5303o(c0530z, "trailers");
            if (!this.f22410q || z7) {
                this.f22410q = true;
                this.f22411r = c0554l0.m2460o();
                m25867s();
                if (this.f22407n) {
                    this.f22408o = null;
                    m25831C(c0554l0, aVar, c0530z);
                } else {
                    this.f22408o = new a(c0554l0, aVar, c0530z);
                    m25864k(z7);
                }
            }
        }

        /* JADX INFO: renamed from: N */
        public final void m25844N(C0554l0 c0554l0, boolean z7, C0530Z c0530z) {
            m25843M(c0554l0, InterfaceC5806s.a.PROCESSED, z7, c0530z);
        }

        /* JADX INFO: renamed from: c */
        public void mo3281c(boolean z7) {
            AbstractC1209m.m5309u(this.f22410q, "status should have been reported on deframer closed");
            this.f22407n = true;
            if (this.f22411r && z7) {
                m25844N(C0554l0.f2112s.m2462q("Encountered end-of-stream mid-frame"), true, new C0530Z());
            }
            Runnable runnable = this.f22408o;
            if (runnable != null) {
                runnable.run();
                this.f22408o = null;
            }
        }
    }

    protected AbstractC5770a(InterfaceC5766W0 interfaceC5766W0, C5751O0 c5751o0, C5762U0 c5762u0, C0530Z c0530z, C0535c c0535c, boolean z7) {
        AbstractC1209m.m5303o(c0530z, "headers");
        this.f22391a = (C5762U0) AbstractC1209m.m5303o(c5762u0, "transportTracer");
        this.f22393c = AbstractC5757S.m25678p(c0535c);
        this.f22394d = z7;
        if (z7) {
            this.f22392b = new a(c0530z, c5751o0);
        } else {
            this.f22392b = new C5797n0(this, interfaceC5766W0, c5751o0);
            this.f22395e = c0530z;
        }
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: a */
    public final void mo25438a(C0554l0 c0554l0) {
        AbstractC1209m.m5293e(!c0554l0.m2460o(), "Should not cancel with OK status");
        this.f22396f = true;
        mo3266v().mo3268a(c0554l0);
    }

    @Override // io.grpc.internal.AbstractC5774c, io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: e */
    public final boolean mo25460e() {
        return super.mo25460e() && !this.f22396f;
    }

    @Override // io.grpc.internal.C5797n0.d
    /* JADX INFO: renamed from: h */
    public final void mo25825h(InterfaceC5764V0 interfaceC5764V0, boolean z7, boolean z8, int i7) {
        AbstractC1209m.m5293e(interfaceC5764V0 != null || z7, "null frame before EOS");
        mo3266v().mo3269b(interfaceC5764V0, z7, z8, i7);
    }

    @Override // io.grpc.internal.AbstractC5774c
    /* JADX INFO: renamed from: j */
    protected final InterfaceC5752P mo25826j() {
        return this.f22392b;
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: m */
    public void mo25463m(int i7) {
        mo3267z().m25871x(i7);
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: n */
    public void mo25464n(int i7) {
        this.f22392b.mo25661n(i7);
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: p */
    public final void mo25439p(C5768Y c5768y) {
        c5768y.m25763b("remote_addr", mo3263b().m2313b(AbstractC0508C.f1892a));
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: q */
    public final void mo25465q() {
        if (mo3267z().m25840G()) {
            return;
        }
        mo3267z().m25834L();
        m25853i();
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: r */
    public void mo25466r(C0568t c0568t) {
        C0530Z c0530z = this.f22395e;
        C0530Z.g gVar = AbstractC5757S.f22228d;
        c0530z.m2282e(gVar);
        this.f22395e.m2287p(gVar, Long.valueOf(Math.max(0L, c0568t.m2524q(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: s */
    public final void mo25467s(InterfaceC5806s interfaceC5806s) {
        mo3267z().m25842K(interfaceC5806s);
        if (this.f22394d) {
            return;
        }
        mo3266v().mo3270c(this.f22395e, null);
        this.f22395e = null;
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: t */
    public final void mo25468t(C0570v c0570v) {
        mo3267z().m25832I(c0570v);
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: u */
    public final void mo25469u(boolean z7) {
        mo3267z().m25833J(z7);
    }

    /* JADX INFO: renamed from: v */
    protected abstract b mo3266v();

    /* JADX INFO: renamed from: x */
    protected C5762U0 m25827x() {
        return this.f22391a;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m25828y() {
        return this.f22393c;
    }

    /* JADX INFO: renamed from: z */
    protected abstract c mo3267z();
}

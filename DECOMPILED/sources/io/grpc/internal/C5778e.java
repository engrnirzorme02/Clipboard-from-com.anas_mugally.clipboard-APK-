package io.grpc.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import p063H5.InterfaceC0569u;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.e */
/* JADX INFO: loaded from: classes.dex */
public class C5778e implements InterfaceC5820z {

    /* JADX INFO: renamed from: a */
    private final C5795m0.b f22455a;

    /* JADX INFO: renamed from: b */
    private final C5780f f22456b;

    /* JADX INFO: renamed from: c */
    private final C5795m0 f22457c;

    /* JADX INFO: renamed from: io.grpc.internal.e$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f22458a;

        a(int i7) {
            this.f22458a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5778e.this.f22457c.isClosed()) {
                return;
            }
            try {
                C5778e.this.f22457c.mo25913d(this.f22458a);
            } catch (Throwable th) {
                C5778e.this.f22456b.mo3284e(th);
                C5778e.this.f22457c.close();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5819y0 f22460a;

        b(InterfaceC5819y0 interfaceC5819y0) {
            this.f22460a = interfaceC5819y0;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C5778e.this.f22457c.mo25912J(this.f22460a);
            } catch (Throwable th) {
                C5778e.this.f22456b.mo3284e(th);
                C5778e.this.f22457c.close();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$c */
    class c implements Closeable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5819y0 f22462a;

        c(InterfaceC5819y0 interfaceC5819y0) {
            this.f22462a = interfaceC5819y0;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f22462a.close();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5778e.this.f22457c.mo25916x();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$e */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5778e.this.f22457c.close();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$f */
    private class f extends g implements Closeable {

        /* JADX INFO: renamed from: d */
        private final Closeable f22466d;

        public f(Runnable runnable, Closeable closeable) {
            super(C5778e.this, runnable, null);
            this.f22466d = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f22466d.close();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$g */
    private class g implements InterfaceC5755Q0.a {

        /* JADX INFO: renamed from: a */
        private final Runnable f22468a;

        /* JADX INFO: renamed from: b */
        private boolean f22469b;

        /* synthetic */ g(C5778e c5778e, Runnable runnable, a aVar) {
            this(runnable);
        }

        /* JADX INFO: renamed from: d */
        private void m25917d() {
            if (this.f22469b) {
                return;
            }
            this.f22468a.run();
            this.f22469b = true;
        }

        @Override // io.grpc.internal.InterfaceC5755Q0.a
        public InputStream next() {
            m25917d();
            return C5778e.this.f22456b.m25919f();
        }

        private g(Runnable runnable) {
            this.f22469b = false;
            this.f22468a = runnable;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$h */
    interface h extends C5780f.d {
    }

    C5778e(C5795m0.b bVar, h hVar, C5795m0 c5795m0) {
        C5749N0 c5749n0 = new C5749N0((C5795m0.b) AbstractC1209m.m5303o(bVar, "listener"));
        this.f22455a = c5749n0;
        C5780f c5780f = new C5780f(c5749n0, hVar);
        this.f22456b = c5780f;
        c5795m0.m26072R0(c5780f);
        this.f22457c = c5795m0;
    }

    @Override // io.grpc.internal.InterfaceC5820z
    /* JADX INFO: renamed from: J */
    public void mo25912J(InterfaceC5819y0 interfaceC5819y0) {
        this.f22455a.mo25632a(new f(new b(interfaceC5819y0), new c(interfaceC5819y0)));
    }

    @Override // io.grpc.internal.InterfaceC5820z
    public void close() {
        this.f22457c.m26073S0();
        this.f22455a.mo25632a(new g(this, new e(), null));
    }

    @Override // io.grpc.internal.InterfaceC5820z
    /* JADX INFO: renamed from: d */
    public void mo25913d(int i7) {
        this.f22455a.mo25632a(new g(this, new a(i7), null));
    }

    @Override // io.grpc.internal.InterfaceC5820z
    /* JADX INFO: renamed from: m */
    public void mo25914m(int i7) {
        this.f22457c.mo25914m(i7);
    }

    @Override // io.grpc.internal.InterfaceC5820z
    /* JADX INFO: renamed from: n */
    public void mo25915n(InterfaceC0569u interfaceC0569u) {
        this.f22457c.mo25915n(interfaceC0569u);
    }

    @Override // io.grpc.internal.InterfaceC5820z
    /* JADX INFO: renamed from: x */
    public void mo25916x() {
        this.f22455a.mo25632a(new g(this, new d(), null));
    }
}

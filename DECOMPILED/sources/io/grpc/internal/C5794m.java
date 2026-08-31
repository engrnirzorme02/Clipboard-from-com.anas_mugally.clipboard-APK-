package io.grpc.internal;

import com.google.android.gms.common.api.C3553a;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p063H5.AbstractC0533b;
import p063H5.AbstractC0541f;
import p063H5.AbstractC0551k;
import p063H5.C0530Z;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.C0554l0;
import p063H5.C0555m;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.m */
/* JADX INFO: loaded from: classes.dex */
final class C5794m implements InterfaceC5810u {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5810u f22733a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0533b f22734b;

    /* JADX INFO: renamed from: c */
    private final Executor f22735c;

    /* JADX INFO: renamed from: io.grpc.internal.m$a */
    private class a extends AbstractC5742K {

        /* JADX INFO: renamed from: a */
        private final InterfaceC5814w f22736a;

        /* JADX INFO: renamed from: b */
        private final String f22737b;

        /* JADX INFO: renamed from: d */
        private volatile C0554l0 f22739d;

        /* JADX INFO: renamed from: e */
        private C0554l0 f22740e;

        /* JADX INFO: renamed from: f */
        private C0554l0 f22741f;

        /* JADX INFO: renamed from: c */
        private final AtomicInteger f22738c = new AtomicInteger(-2147483647);

        /* JADX INFO: renamed from: g */
        private final C5799o0.a f22742g = new C7693a();

        /* JADX INFO: renamed from: io.grpc.internal.m$a$a, reason: collision with other inner class name */
        class C7693a implements C5799o0.a {
            C7693a() {
            }

            @Override // io.grpc.internal.C5799o0.a
            /* JADX INFO: renamed from: a */
            public void mo26062a() {
                if (a.this.f22738c.decrementAndGet() == 0) {
                    a.this.m26061k();
                }
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.m$a$b */
        class b extends AbstractC0533b.b {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0532a0 f22745a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C0535c f22746b;

            b(C0532a0 c0532a0, C0535c c0535c) {
                this.f22745a = c0532a0;
                this.f22746b = c0535c;
            }
        }

        a(InterfaceC5814w interfaceC5814w, String str) {
            this.f22736a = (InterfaceC5814w) AbstractC1209m.m5303o(interfaceC5814w, "delegate");
            this.f22737b = (String) AbstractC1209m.m5303o(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public void m26061k() {
            synchronized (this) {
                try {
                    if (this.f22738c.get() != 0) {
                        return;
                    }
                    C0554l0 c0554l0 = this.f22740e;
                    C0554l0 c0554l1 = this.f22741f;
                    this.f22740e = null;
                    this.f22741f = null;
                    if (c0554l0 != null) {
                        super.mo3353h(c0554l0);
                    }
                    if (c0554l1 != null) {
                        super.mo3350d(c0554l1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.AbstractC5742K
        /* JADX INFO: renamed from: a */
        protected InterfaceC5814w mo25600a() {
            return this.f22736a;
        }

        @Override // io.grpc.internal.AbstractC5742K, io.grpc.internal.InterfaceC5808t
        /* JADX INFO: renamed from: c */
        public InterfaceC5804r mo3348c(C0532a0 c0532a0, C0530Z c0530z, C0535c c0535c, AbstractC0551k[] abstractC0551kArr) {
            AbstractC0533b abstractC0533bM2345c = c0535c.m2345c();
            if (abstractC0533bM2345c == null) {
                abstractC0533bM2345c = C5794m.this.f22734b;
            } else if (C5794m.this.f22734b != null) {
                abstractC0533bM2345c = new C0555m(C5794m.this.f22734b, abstractC0533bM2345c);
            }
            if (abstractC0533bM2345c == null) {
                return this.f22738c.get() >= 0 ? new C5734G(this.f22739d, abstractC0551kArr) : this.f22736a.mo3348c(c0532a0, c0530z, c0535c, abstractC0551kArr);
            }
            C5799o0 c5799o0 = new C5799o0(this.f22736a, c0532a0, c0530z, c0535c, this.f22742g, abstractC0551kArr);
            if (this.f22738c.incrementAndGet() > 0) {
                this.f22742g.mo26062a();
                return new C5734G(this.f22739d, abstractC0551kArr);
            }
            try {
                abstractC0533bM2345c.mo2339a(new b(c0532a0, c0535c), C5794m.this.f22735c, c5799o0);
            } catch (Throwable th) {
                c5799o0.mo2341b(C0554l0.f2106m.m2462q("Credentials should use fail() instead of throwing exceptions").m2461p(th));
            }
            return c5799o0.m26101d();
        }

        @Override // io.grpc.internal.AbstractC5742K, io.grpc.internal.InterfaceC5793l0
        /* JADX INFO: renamed from: d */
        public void mo3350d(C0554l0 c0554l0) {
            AbstractC1209m.m5303o(c0554l0, "status");
            synchronized (this) {
                try {
                    if (this.f22738c.get() < 0) {
                        this.f22739d = c0554l0;
                        this.f22738c.addAndGet(C3553a.e.API_PRIORITY_OTHER);
                    } else if (this.f22741f != null) {
                        return;
                    }
                    if (this.f22738c.get() != 0) {
                        this.f22741f = c0554l0;
                    } else {
                        super.mo3350d(c0554l0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.AbstractC5742K, io.grpc.internal.InterfaceC5793l0
        /* JADX INFO: renamed from: h */
        public void mo3353h(C0554l0 c0554l0) {
            AbstractC1209m.m5303o(c0554l0, "status");
            synchronized (this) {
                try {
                    if (this.f22738c.get() < 0) {
                        this.f22739d = c0554l0;
                        this.f22738c.addAndGet(C3553a.e.API_PRIORITY_OTHER);
                        if (this.f22738c.get() != 0) {
                            this.f22740e = c0554l0;
                        } else {
                            super.mo3353h(c0554l0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    C5794m(InterfaceC5810u interfaceC5810u, AbstractC0533b abstractC0533b, Executor executor) {
        this.f22733a = (InterfaceC5810u) AbstractC1209m.m5303o(interfaceC5810u, "delegate");
        this.f22734b = abstractC0533b;
        this.f22735c = (Executor) AbstractC1209m.m5303o(executor, "appExecutor");
    }

    @Override // io.grpc.internal.InterfaceC5810u
    /* JADX INFO: renamed from: M */
    public InterfaceC5814w mo3244M(SocketAddress socketAddress, InterfaceC5810u.a aVar, AbstractC0541f abstractC0541f) {
        return new a(this.f22733a.mo3244M(socketAddress, aVar, abstractC0541f), aVar.m26182a());
    }

    @Override // io.grpc.internal.InterfaceC5810u
    /* JADX INFO: renamed from: M0 */
    public Collection mo3245M0() {
        return this.f22733a.mo3245M0();
    }

    @Override // io.grpc.internal.InterfaceC5810u, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f22733a.close();
    }

    @Override // io.grpc.internal.InterfaceC5810u
    /* JADX INFO: renamed from: z0 */
    public ScheduledExecutorService mo3246z0() {
        return this.f22733a.mo3246z0();
    }
}

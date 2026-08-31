package io.grpc.internal;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p063H5.AbstractC0512G;
import p063H5.AbstractC0513H;
import p063H5.AbstractC0543g;
import p063H5.AbstractC0551k;
import p063H5.AbstractC0567s;
import p063H5.C0530Z;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.C0554l0;
import p063H5.C0559o;
import p063H5.C0565r;
import p063H5.C0568t;
import p063H5.C0570v;
import p063H5.InterfaceC0553l;
import p063H5.InterfaceC0557n;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;
import p131Q5.AbstractC1291c;
import p131Q5.C1290b;
import p131Q5.C1292d;
import p131Q5.C1293e;
import p157U3.AbstractC1674f;

/* JADX INFO: renamed from: io.grpc.internal.q */
/* JADX INFO: loaded from: classes.dex */
final class C5802q extends AbstractC0543g {

    /* JADX INFO: renamed from: t */
    private static final Logger f22824t = Logger.getLogger(C5802q.class.getName());

    /* JADX INFO: renamed from: u */
    private static final byte[] f22825u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* JADX INFO: renamed from: v */
    private static final double f22826v = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* JADX INFO: renamed from: a */
    private final C0532a0 f22827a;

    /* JADX INFO: renamed from: b */
    private final C1292d f22828b;

    /* JADX INFO: renamed from: c */
    private final Executor f22829c;

    /* JADX INFO: renamed from: d */
    private final boolean f22830d;

    /* JADX INFO: renamed from: e */
    private final C5796n f22831e;

    /* JADX INFO: renamed from: f */
    private final C0565r f22832f;

    /* JADX INFO: renamed from: g */
    private volatile ScheduledFuture f22833g;

    /* JADX INFO: renamed from: h */
    private final boolean f22834h;

    /* JADX INFO: renamed from: i */
    private C0535c f22835i;

    /* JADX INFO: renamed from: j */
    private InterfaceC5804r f22836j;

    /* JADX INFO: renamed from: k */
    private volatile boolean f22837k;

    /* JADX INFO: renamed from: l */
    private boolean f22838l;

    /* JADX INFO: renamed from: m */
    private boolean f22839m;

    /* JADX INFO: renamed from: n */
    private final e f22840n;

    /* JADX INFO: renamed from: p */
    private final ScheduledExecutorService f22842p;

    /* JADX INFO: renamed from: q */
    private boolean f22843q;

    /* JADX INFO: renamed from: o */
    private final f f22841o = new f();

    /* JADX INFO: renamed from: r */
    private C0570v f22844r = C0570v.m2527c();

    /* JADX INFO: renamed from: s */
    private C0559o f22845s = C0559o.m2477a();

    /* JADX INFO: renamed from: io.grpc.internal.q$b */
    class b extends AbstractRunnableC5818y {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC0543g.a f22846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC0543g.a aVar) {
            super(C5802q.this.f22832f);
            this.f22846b = aVar;
        }

        @Override // io.grpc.internal.AbstractRunnableC5818y
        /* JADX INFO: renamed from: a */
        public void mo25416a() {
            C5802q c5802q = C5802q.this;
            c5802q.m26127t(this.f22846b, AbstractC0567s.m2514a(c5802q.f22832f), new C0530Z());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.q$c */
    class c extends AbstractRunnableC5818y {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC0543g.a f22848b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f22849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC0543g.a aVar, String str) {
            super(C5802q.this.f22832f);
            this.f22848b = aVar;
            this.f22849c = str;
        }

        @Override // io.grpc.internal.AbstractRunnableC5818y
        /* JADX INFO: renamed from: a */
        public void mo25416a() {
            C5802q.this.m26127t(this.f22848b, C0554l0.f2112s.m2462q(String.format("Unable to find compressor by name %s", this.f22849c)), new C0530Z());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.q$d */
    private class d implements InterfaceC5806s {

        /* JADX INFO: renamed from: a */
        private final AbstractC0543g.a f22851a;

        /* JADX INFO: renamed from: b */
        private C0554l0 f22852b;

        /* JADX INFO: renamed from: io.grpc.internal.q$d$a */
        final class a extends AbstractRunnableC5818y {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C1290b f22854b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C0530Z f22855c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1290b c1290b, C0530Z c0530z) {
                super(C5802q.this.f22832f);
                this.f22854b = c1290b;
                this.f22855c = c0530z;
            }

            /* JADX INFO: renamed from: b */
            private void m26142b() {
                if (d.this.f22852b != null) {
                    return;
                }
                try {
                    d.this.f22851a.mo2422b(this.f22855c);
                } catch (Throwable th) {
                    d.this.m26141i(C0554l0.f2099f.m2461p(th).m2462q("Failed to read headers"));
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC5818y
            /* JADX INFO: renamed from: a */
            public void mo25416a() {
                C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientCall$Listener.headersRead");
                try {
                    AbstractC1291c.m5625a(C5802q.this.f22828b);
                    AbstractC1291c.m5629e(this.f22854b);
                    m26142b();
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
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.q$d$b */
        final class b extends AbstractRunnableC5818y {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C1290b f22857b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ InterfaceC5755Q0.a f22858c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C1290b c1290b, InterfaceC5755Q0.a aVar) {
                super(C5802q.this.f22832f);
                this.f22857b = c1290b;
                this.f22858c = aVar;
            }

            /* JADX INFO: renamed from: b */
            private void m26143b() {
                if (d.this.f22852b != null) {
                    AbstractC5757S.m25666d(this.f22858c);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f22858c.next();
                        if (next == null) {
                            return;
                        }
                        try {
                            d.this.f22851a.mo2423c(C5802q.this.f22827a.m2328i(next));
                            next.close();
                        } catch (Throwable th) {
                            AbstractC5757S.m25667e(next);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        AbstractC5757S.m25666d(this.f22858c);
                        d.this.m26141i(C0554l0.f2099f.m2461p(th2).m2462q("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC5818y
            /* JADX INFO: renamed from: a */
            public void mo25416a() {
                C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientCall$Listener.messagesAvailable");
                try {
                    AbstractC1291c.m5625a(C5802q.this.f22828b);
                    AbstractC1291c.m5629e(this.f22857b);
                    m26143b();
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
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.q$d$c */
        final class c extends AbstractRunnableC5818y {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C1290b f22860b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C0554l0 f22861c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ C0530Z f22862d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C1290b c1290b, C0554l0 c0554l0, C0530Z c0530z) {
                super(C5802q.this.f22832f);
                this.f22860b = c1290b;
                this.f22861c = c0554l0;
                this.f22862d = c0530z;
            }

            /* JADX INFO: renamed from: b */
            private void m26144b() {
                C0554l0 c0554l0 = this.f22861c;
                C0530Z c0530z = this.f22862d;
                if (d.this.f22852b != null) {
                    c0554l0 = d.this.f22852b;
                    c0530z = new C0530Z();
                }
                C5802q.this.f22837k = true;
                try {
                    d dVar = d.this;
                    C5802q.this.m26127t(dVar.f22851a, c0554l0, c0530z);
                } finally {
                    C5802q.this.m26109A();
                    C5802q.this.f22831e.m26076a(c0554l0.m2460o());
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC5818y
            /* JADX INFO: renamed from: a */
            public void mo25416a() {
                C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientCall$Listener.onClose");
                try {
                    AbstractC1291c.m5625a(C5802q.this.f22828b);
                    AbstractC1291c.m5629e(this.f22860b);
                    m26144b();
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
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.q$d$d, reason: collision with other inner class name */
        final class C7694d extends AbstractRunnableC5818y {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C1290b f22864b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7694d(C1290b c1290b) {
                super(C5802q.this.f22832f);
                this.f22864b = c1290b;
            }

            /* JADX INFO: renamed from: b */
            private void m26145b() {
                if (d.this.f22852b != null) {
                    return;
                }
                try {
                    d.this.f22851a.mo2424d();
                } catch (Throwable th) {
                    d.this.m26141i(C0554l0.f2099f.m2461p(th).m2462q("Failed to call onReady."));
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC5818y
            /* JADX INFO: renamed from: a */
            public void mo25416a() {
                C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientCall$Listener.onReady");
                try {
                    AbstractC1291c.m5625a(C5802q.this.f22828b);
                    AbstractC1291c.m5629e(this.f22864b);
                    m26145b();
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
            }
        }

        public d(AbstractC0543g.a aVar) {
            this.f22851a = (AbstractC0543g.a) AbstractC1209m.m5303o(aVar, "observer");
        }

        /* JADX INFO: renamed from: h */
        private void m26140h(C0554l0 c0554l0, InterfaceC5806s.a aVar, C0530Z c0530z) {
            C0568t c0568tM26128u = C5802q.this.m26128u();
            if (c0554l0.m2458m() == C0554l0.b.CANCELLED && c0568tM26128u != null && c0568tM26128u.m2522o()) {
                C5768Y c5768y = new C5768Y();
                C5802q.this.f22836j.mo25439p(c5768y);
                c0554l0 = C0554l0.f2102i.m2456e("ClientCall was cancelled at or after deadline. " + c5768y);
                c0530z = new C0530Z();
            }
            C5802q.this.f22829c.execute(new c(AbstractC1291c.m5630f(), c0554l0, c0530z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public void m26141i(C0554l0 c0554l0) {
            this.f22852b = c0554l0;
            C5802q.this.f22836j.mo25438a(c0554l0);
        }

        @Override // io.grpc.internal.InterfaceC5755Q0
        /* JADX INFO: renamed from: a */
        public void mo25473a(InterfaceC5755Q0.a aVar) {
            C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientStreamListener.messagesAvailable");
            try {
                AbstractC1291c.m5625a(C5802q.this.f22828b);
                C5802q.this.f22829c.execute(new b(AbstractC1291c.m5630f(), aVar));
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
        }

        @Override // io.grpc.internal.InterfaceC5755Q0
        /* JADX INFO: renamed from: b */
        public void mo25474b() {
            if (C5802q.this.f22827a.m2326e().m2338c()) {
                return;
            }
            C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientStreamListener.onReady");
            try {
                AbstractC1291c.m5625a(C5802q.this.f22828b);
                C5802q.this.f22829c.execute(new C7694d(AbstractC1291c.m5630f()));
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
        }

        @Override // io.grpc.internal.InterfaceC5806s
        /* JADX INFO: renamed from: c */
        public void mo25475c(C0554l0 c0554l0, InterfaceC5806s.a aVar, C0530Z c0530z) {
            C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientStreamListener.closed");
            try {
                AbstractC1291c.m5625a(C5802q.this.f22828b);
                m26140h(c0554l0, aVar, c0530z);
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
        }

        @Override // io.grpc.internal.InterfaceC5806s
        /* JADX INFO: renamed from: d */
        public void mo25476d(C0530Z c0530z) {
            C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientStreamListener.headersRead");
            try {
                AbstractC1291c.m5625a(C5802q.this.f22828b);
                C5802q.this.f22829c.execute(new a(AbstractC1291c.m5630f(), c0530z));
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
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.q$e */
    interface e {
        /* JADX INFO: renamed from: a */
        InterfaceC5804r mo26006a(C0532a0 c0532a0, C0535c c0535c, C0530Z c0530z, C0565r c0565r);
    }

    /* JADX INFO: renamed from: io.grpc.internal.q$f */
    private final class f implements C0565r.a {
        private f() {
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.q$g */
    private class g implements Runnable {

        /* JADX INFO: renamed from: a */
        private final long f22867a;

        g(long j7) {
            this.f22867a = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5768Y c5768y = new C5768Y();
            C5802q.this.f22836j.mo25439p(c5768y);
            long jAbs = Math.abs(this.f22867a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit.toNanos(1L);
            long jAbs2 = Math.abs(this.f22867a) % timeUnit.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            sb.append("deadline exceeded after ");
            if (this.f22867a < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            Locale locale = Locale.US;
            sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            Long l7 = (Long) C5802q.this.f22835i.m2350h(AbstractC0551k.f2088a);
            sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(l7 == null ? 0.0d : l7.longValue() / C5802q.f22826v)));
            sb.append(c5768y);
            C5802q.this.f22836j.mo25438a(C0554l0.f2102i.m2456e(sb.toString()));
        }
    }

    C5802q(C0532a0 c0532a0, Executor executor, C0535c c0535c, e eVar, ScheduledExecutorService scheduledExecutorService, C5796n c5796n, AbstractC0512G abstractC0512G) {
        this.f22827a = c0532a0;
        C1292d c1292dM5627c = AbstractC1291c.m5627c(c0532a0.m2324c(), System.identityHashCode(this));
        this.f22828b = c1292dM5627c;
        if (executor == AbstractC1674f.m7033a()) {
            this.f22829c = new ExecutorC5739I0();
            this.f22830d = true;
        } else {
            this.f22829c = new ExecutorC5741J0(executor);
            this.f22830d = false;
        }
        this.f22831e = c5796n;
        this.f22832f = C0565r.m2503e();
        this.f22834h = c0532a0.m2326e() == C0532a0.d.UNARY || c0532a0.m2326e() == C0532a0.d.SERVER_STREAMING;
        this.f22835i = c0535c;
        this.f22840n = eVar;
        this.f22842p = scheduledExecutorService;
        AbstractC1291c.m5628d("ClientCall.<init>", c1292dM5627c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m26109A() {
        this.f22832f.m2512i(this.f22841o);
        ScheduledFuture scheduledFuture = this.f22833g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: renamed from: B */
    private void m26110B(Object obj) {
        AbstractC1209m.m5309u(this.f22836j != null, "Not started");
        AbstractC1209m.m5309u(!this.f22838l, "call was cancelled");
        AbstractC1209m.m5309u(!this.f22839m, "call was half-closed");
        try {
            InterfaceC5804r interfaceC5804r = this.f22836j;
            if (interfaceC5804r instanceof AbstractC5727C0) {
                ((AbstractC5727C0) interfaceC5804r).m25528o0(obj);
            } else {
                interfaceC5804r.mo25461f(this.f22827a.m2329j(obj));
            }
            if (this.f22834h) {
                return;
            }
            this.f22836j.flush();
        } catch (Error e7) {
            this.f22836j.mo25438a(C0554l0.f2099f.m2462q("Client sendMessage() failed with Error"));
            throw e7;
        } catch (RuntimeException e8) {
            this.f22836j.mo25438a(C0554l0.f2099f.m2461p(e8).m2462q("Failed to stream message"));
        }
    }

    /* JADX INFO: renamed from: F */
    private ScheduledFuture m26111F(C0568t c0568t) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jM2524q = c0568t.m2524q(timeUnit);
        return this.f22842p.schedule(new RunnableC5779e0(new g(jM2524q)), jM2524q, timeUnit);
    }

    /* JADX INFO: renamed from: G */
    private void m26112G(AbstractC0543g.a aVar, C0530Z c0530z) {
        InterfaceC0557n interfaceC0557nM2478b;
        AbstractC1209m.m5309u(this.f22836j == null, "Already started");
        AbstractC1209m.m5309u(!this.f22838l, "call was cancelled");
        AbstractC1209m.m5303o(aVar, "observer");
        AbstractC1209m.m5303o(c0530z, "headers");
        if (this.f22832f.m2511h()) {
            this.f22836j = C5801p0.f22823a;
            this.f22829c.execute(new b(aVar));
            return;
        }
        m26125r();
        String strM2344b = this.f22835i.m2344b();
        if (strM2344b != null) {
            interfaceC0557nM2478b = this.f22845s.m2478b(strM2344b);
            if (interfaceC0557nM2478b == null) {
                this.f22836j = C5801p0.f22823a;
                this.f22829c.execute(new c(aVar, strM2344b));
                return;
            }
        } else {
            interfaceC0557nM2478b = InterfaceC0553l.b.f2096a;
        }
        m26133z(c0530z, this.f22844r, interfaceC0557nM2478b, this.f22843q);
        C0568t c0568tM26128u = m26128u();
        if (c0568tM26128u == null || !c0568tM26128u.m2522o()) {
            m26131x(c0568tM26128u, this.f22832f.m2510g(), this.f22835i.m2346d());
            this.f22836j = this.f22840n.mo26006a(this.f22827a, this.f22835i, c0530z, this.f22832f);
        } else {
            AbstractC0551k[] abstractC0551kArrM25668f = AbstractC5757S.m25668f(this.f22835i, c0530z, 0, false);
            String str = m26130w(this.f22835i.m2346d(), this.f22832f.m2510g()) ? "CallOptions" : "Context";
            Long l7 = (Long) this.f22835i.m2350h(AbstractC0551k.f2088a);
            double dM2524q = c0568tM26128u.m2524q(TimeUnit.NANOSECONDS);
            double d7 = f22826v;
            this.f22836j = new C5734G(C0554l0.f2102i.m2462q(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(dM2524q / d7), Double.valueOf(l7 == null ? 0.0d : l7.longValue() / d7))), abstractC0551kArrM25668f);
        }
        if (this.f22830d) {
            this.f22836j.mo25462g();
        }
        if (this.f22835i.m2343a() != null) {
            this.f22836j.mo3265o(this.f22835i.m2343a());
        }
        if (this.f22835i.m2348f() != null) {
            this.f22836j.mo25463m(this.f22835i.m2348f().intValue());
        }
        if (this.f22835i.m2349g() != null) {
            this.f22836j.mo25464n(this.f22835i.m2349g().intValue());
        }
        if (c0568tM26128u != null) {
            this.f22836j.mo25466r(c0568tM26128u);
        }
        this.f22836j.mo25458c(interfaceC0557nM2478b);
        boolean z7 = this.f22843q;
        if (z7) {
            this.f22836j.mo25469u(z7);
        }
        this.f22836j.mo25468t(this.f22844r);
        this.f22831e.m26077b();
        this.f22836j.mo25467s(new d(aVar));
        this.f22832f.m2506a(this.f22841o, AbstractC1674f.m7033a());
        if (c0568tM26128u != null && !c0568tM26128u.equals(this.f22832f.m2510g()) && this.f22842p != null) {
            this.f22833g = m26111F(c0568tM26128u);
        }
        if (this.f22837k) {
            m26109A();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m26125r() {
        C5791k0.b bVar = (C5791k0.b) this.f22835i.m2350h(C5791k0.b.f22719g);
        if (bVar == null) {
            return;
        }
        Long l7 = bVar.f22720a;
        if (l7 != null) {
            C0568t c0568tM2515c = C0568t.m2515c(l7.longValue(), TimeUnit.NANOSECONDS);
            C0568t c0568tM2346d = this.f22835i.m2346d();
            if (c0568tM2346d == null || c0568tM2515c.compareTo(c0568tM2346d) < 0) {
                this.f22835i = this.f22835i.m2354m(c0568tM2515c);
            }
        }
        Boolean bool = bVar.f22721b;
        if (bool != null) {
            this.f22835i = bool.booleanValue() ? this.f22835i.m2360s() : this.f22835i.m2361t();
        }
        if (bVar.f22722c != null) {
            Integer numM2348f = this.f22835i.m2348f();
            if (numM2348f != null) {
                this.f22835i = this.f22835i.m2356o(Math.min(numM2348f.intValue(), bVar.f22722c.intValue()));
            } else {
                this.f22835i = this.f22835i.m2356o(bVar.f22722c.intValue());
            }
        }
        if (bVar.f22723d != null) {
            Integer numM2349g = this.f22835i.m2349g();
            if (numM2349g != null) {
                this.f22835i = this.f22835i.m2357p(Math.min(numM2349g.intValue(), bVar.f22723d.intValue()));
            } else {
                this.f22835i = this.f22835i.m2357p(bVar.f22723d.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m26126s(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f22824t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f22838l) {
            return;
        }
        this.f22838l = true;
        try {
            if (this.f22836j != null) {
                C0554l0 c0554l0 = C0554l0.f2099f;
                C0554l0 c0554l0M2462q = str != null ? c0554l0.m2462q(str) : c0554l0.m2462q("Call cancelled without message");
                if (th != null) {
                    c0554l0M2462q = c0554l0M2462q.m2461p(th);
                }
                this.f22836j.mo25438a(c0554l0M2462q);
            }
        } finally {
            m26109A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m26127t(AbstractC0543g.a aVar, C0554l0 c0554l0, C0530Z c0530z) {
        aVar.mo2421a(c0554l0, c0530z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public C0568t m26128u() {
        return m26132y(this.f22835i.m2346d(), this.f22832f.m2510g());
    }

    /* JADX INFO: renamed from: v */
    private void m26129v() {
        AbstractC1209m.m5309u(this.f22836j != null, "Not started");
        AbstractC1209m.m5309u(!this.f22838l, "call was cancelled");
        AbstractC1209m.m5309u(!this.f22839m, "call already half-closed");
        this.f22839m = true;
        this.f22836j.mo25465q();
    }

    /* JADX INFO: renamed from: w */
    private static boolean m26130w(C0568t c0568t, C0568t c0568t2) {
        if (c0568t == null) {
            return false;
        }
        if (c0568t2 == null) {
            return true;
        }
        return c0568t.m2521n(c0568t2);
    }

    /* JADX INFO: renamed from: x */
    private static void m26131x(C0568t c0568t, C0568t c0568t2, C0568t c0568t3) {
        Logger logger = f22824t;
        if (logger.isLoggable(Level.FINE) && c0568t != null && c0568t.equals(c0568t2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jMax = Math.max(0L, c0568t.m2524q(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jMax)));
            if (c0568t3 == null) {
                sb.append(" Explicit call timeout was not set.");
            } else {
                sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c0568t3.m2524q(timeUnit))));
            }
            logger.fine(sb.toString());
        }
    }

    /* JADX INFO: renamed from: y */
    private static C0568t m26132y(C0568t c0568t, C0568t c0568t2) {
        if (c0568t == null) {
            return c0568t2;
        }
        return c0568t2 == null ? c0568t : c0568t.m2523p(c0568t2);
    }

    /* JADX INFO: renamed from: z */
    static void m26133z(C0530Z c0530z, C0570v c0570v, InterfaceC0557n interfaceC0557n, boolean z7) {
        c0530z.m2282e(AbstractC5757S.f22233i);
        C0530Z.g gVar = AbstractC5757S.f22229e;
        c0530z.m2282e(gVar);
        if (interfaceC0557n != InterfaceC0553l.b.f2096a) {
            c0530z.m2287p(gVar, interfaceC0557n.mo2443a());
        }
        C0530Z.g gVar2 = AbstractC5757S.f22230f;
        c0530z.m2282e(gVar2);
        byte[] bArrM2158a = AbstractC0513H.m2158a(c0570v);
        if (bArrM2158a.length != 0) {
            c0530z.m2287p(gVar2, bArrM2158a);
        }
        c0530z.m2282e(AbstractC5757S.f22231g);
        C0530Z.g gVar3 = AbstractC5757S.f22232h;
        c0530z.m2282e(gVar3);
        if (z7) {
            c0530z.m2287p(gVar3, f22825u);
        }
    }

    /* JADX INFO: renamed from: C */
    C5802q m26134C(C0559o c0559o) {
        this.f22845s = c0559o;
        return this;
    }

    /* JADX INFO: renamed from: D */
    C5802q m26135D(C0570v c0570v) {
        this.f22844r = c0570v;
        return this;
    }

    /* JADX INFO: renamed from: E */
    C5802q m26136E(boolean z7) {
        this.f22843q = z7;
        return this;
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: a */
    public void mo2118a(String str, Throwable th) {
        C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientCall.cancel");
        try {
            AbstractC1291c.m5625a(this.f22828b);
            m26126s(str, th);
            if (c1293eM5632h != null) {
                c1293eM5632h.close();
            }
        } catch (Throwable th2) {
            if (c1293eM5632h != null) {
                try {
                    c1293eM5632h.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: b */
    public void mo2119b() {
        C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientCall.halfClose");
        try {
            AbstractC1291c.m5625a(this.f22828b);
            m26129v();
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
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: c */
    public void mo2120c(int i7) {
        C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientCall.request");
        try {
            AbstractC1291c.m5625a(this.f22828b);
            AbstractC1209m.m5309u(this.f22836j != null, "Not started");
            AbstractC1209m.m5293e(i7 >= 0, "Number requested must be non-negative");
            this.f22836j.mo25459d(i7);
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
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: d */
    public void mo2121d(Object obj) {
        C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientCall.sendMessage");
        try {
            AbstractC1291c.m5625a(this.f22828b);
            m26110B(obj);
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
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: e */
    public void mo2122e(AbstractC0543g.a aVar, C0530Z c0530z) {
        C1293e c1293eM5632h = AbstractC1291c.m5632h("ClientCall.start");
        try {
            AbstractC1291c.m5625a(this.f22828b);
            m26112G(aVar, c0530z);
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
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("method", this.f22827a).toString();
    }
}

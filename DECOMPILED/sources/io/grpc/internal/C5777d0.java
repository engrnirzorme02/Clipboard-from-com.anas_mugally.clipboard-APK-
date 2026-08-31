package io.grpc.internal;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p063H5.C0554l0;
import p122P3.AbstractC1209m;
import p122P3.C1212p;
import p157U3.AbstractC1674f;

/* JADX INFO: renamed from: io.grpc.internal.d0 */
/* JADX INFO: loaded from: classes.dex */
public class C5777d0 {

    /* JADX INFO: renamed from: l */
    private static final long f22431l = TimeUnit.SECONDS.toNanos(10);

    /* JADX INFO: renamed from: m */
    private static final long f22432m = TimeUnit.MILLISECONDS.toNanos(10);

    /* JADX INFO: renamed from: a */
    private final ScheduledExecutorService f22433a;

    /* JADX INFO: renamed from: b */
    private final C1212p f22434b;

    /* JADX INFO: renamed from: c */
    private final d f22435c;

    /* JADX INFO: renamed from: d */
    private final boolean f22436d;

    /* JADX INFO: renamed from: e */
    private e f22437e;

    /* JADX INFO: renamed from: f */
    private ScheduledFuture f22438f;

    /* JADX INFO: renamed from: g */
    private ScheduledFuture f22439g;

    /* JADX INFO: renamed from: h */
    private final Runnable f22440h;

    /* JADX INFO: renamed from: i */
    private final Runnable f22441i;

    /* JADX INFO: renamed from: j */
    private final long f22442j;

    /* JADX INFO: renamed from: k */
    private final long f22443k;

    /* JADX INFO: renamed from: io.grpc.internal.d0$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z7;
            synchronized (C5777d0.this) {
                try {
                    e eVar = C5777d0.this.f22437e;
                    e eVar2 = e.DISCONNECTED;
                    if (eVar != eVar2) {
                        C5777d0.this.f22437e = eVar2;
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z7) {
                C5777d0.this.f22435c.mo25906a();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.d0$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z7;
            synchronized (C5777d0.this) {
                try {
                    C5777d0.this.f22439g = null;
                    e eVar = C5777d0.this.f22437e;
                    e eVar2 = e.PING_SCHEDULED;
                    if (eVar == eVar2) {
                        C5777d0.this.f22437e = e.PING_SENT;
                        C5777d0 c5777d0 = C5777d0.this;
                        c5777d0.f22438f = c5777d0.f22433a.schedule(C5777d0.this.f22440h, C5777d0.this.f22443k, TimeUnit.NANOSECONDS);
                        z7 = true;
                    } else {
                        if (C5777d0.this.f22437e == e.PING_DELAYED) {
                            C5777d0 c5777d1 = C5777d0.this;
                            ScheduledExecutorService scheduledExecutorService = c5777d1.f22433a;
                            Runnable runnable = C5777d0.this.f22441i;
                            long j7 = C5777d0.this.f22442j;
                            C1212p c1212p = C5777d0.this.f22434b;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            c5777d1.f22439g = scheduledExecutorService.schedule(runnable, j7 - c1212p.m5320d(timeUnit), timeUnit);
                            C5777d0.this.f22437e = eVar2;
                        }
                        z7 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z7) {
                C5777d0.this.f22435c.mo25907b();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.d0$c */
    public static final class c implements d {

        /* JADX INFO: renamed from: a */
        private final InterfaceC5814w f22446a;

        /* JADX INFO: renamed from: io.grpc.internal.d0$c$a */
        class a implements InterfaceC5808t.a {
            a() {
            }

            @Override // io.grpc.internal.InterfaceC5808t.a
            /* JADX INFO: renamed from: a */
            public void mo25908a(Throwable th) {
                c.this.f22446a.mo3350d(C0554l0.f2113t.m2462q("Keepalive failed. The connection is likely gone"));
            }

            @Override // io.grpc.internal.InterfaceC5808t.a
            /* JADX INFO: renamed from: b */
            public void mo25909b(long j7) {
            }
        }

        public c(InterfaceC5814w interfaceC5814w) {
            this.f22446a = interfaceC5814w;
        }

        @Override // io.grpc.internal.C5777d0.d
        /* JADX INFO: renamed from: a */
        public void mo25906a() {
            this.f22446a.mo3350d(C0554l0.f2113t.m2462q("Keepalive failed. The connection is likely gone"));
        }

        @Override // io.grpc.internal.C5777d0.d
        /* JADX INFO: renamed from: b */
        public void mo25907b() {
            this.f22446a.mo3355i(new a(), AbstractC1674f.m7033a());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.d0$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo25906a();

        /* JADX INFO: renamed from: b */
        void mo25907b();
    }

    /* JADX INFO: renamed from: io.grpc.internal.d0$e */
    private enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public C5777d0(d dVar, ScheduledExecutorService scheduledExecutorService, long j7, long j8, boolean z7) {
        this(dVar, scheduledExecutorService, C1212p.m5318c(), j7, j8, z7);
    }

    /* JADX INFO: renamed from: l */
    public static long m25899l(long j7) {
        return Math.max(j7, f22431l);
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m25900m() {
        try {
            this.f22434b.m5321f().m5322g();
            e eVar = this.f22437e;
            e eVar2 = e.PING_SCHEDULED;
            if (eVar == eVar2) {
                this.f22437e = e.PING_DELAYED;
            } else if (eVar == e.PING_SENT || eVar == e.IDLE_AND_PING_SENT) {
                ScheduledFuture scheduledFuture = this.f22438f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f22437e == e.IDLE_AND_PING_SENT) {
                    this.f22437e = e.IDLE;
                } else {
                    this.f22437e = eVar2;
                    AbstractC1209m.m5309u(this.f22439g == null, "There should be no outstanding pingFuture");
                    this.f22439g = this.f22433a.schedule(this.f22441i, this.f22442j, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m25901n() {
        try {
            e eVar = this.f22437e;
            if (eVar == e.IDLE) {
                this.f22437e = e.PING_SCHEDULED;
                if (this.f22439g == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f22433a;
                    Runnable runnable = this.f22441i;
                    long j7 = this.f22442j;
                    C1212p c1212p = this.f22434b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f22439g = scheduledExecutorService.schedule(runnable, j7 - c1212p.m5320d(timeUnit), timeUnit);
                }
            } else if (eVar == e.IDLE_AND_PING_SENT) {
                this.f22437e = e.PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m25902o() {
        try {
            if (this.f22436d) {
                return;
            }
            e eVar = this.f22437e;
            if (eVar == e.PING_SCHEDULED || eVar == e.PING_DELAYED) {
                this.f22437e = e.IDLE;
            }
            if (this.f22437e == e.PING_SENT) {
                this.f22437e = e.IDLE_AND_PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m25903p() {
        if (this.f22436d) {
            m25901n();
        }
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m25904q() {
        try {
            e eVar = this.f22437e;
            e eVar2 = e.DISCONNECTED;
            if (eVar != eVar2) {
                this.f22437e = eVar2;
                ScheduledFuture scheduledFuture = this.f22438f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture scheduledFuture2 = this.f22439g;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.f22439g = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    C5777d0(d dVar, ScheduledExecutorService scheduledExecutorService, C1212p c1212p, long j7, long j8, boolean z7) {
        this.f22437e = e.IDLE;
        this.f22440h = new RunnableC5779e0(new a());
        this.f22441i = new RunnableC5779e0(new b());
        this.f22435c = (d) AbstractC1209m.m5303o(dVar, "keepAlivePinger");
        this.f22433a = (ScheduledExecutorService) AbstractC1209m.m5303o(scheduledExecutorService, "scheduler");
        this.f22434b = (C1212p) AbstractC1209m.m5303o(c1212p, "stopwatch");
        this.f22442j = j7;
        this.f22443k = j8;
        this.f22436d = z7;
        c1212p.m5321f().m5322g();
    }
}

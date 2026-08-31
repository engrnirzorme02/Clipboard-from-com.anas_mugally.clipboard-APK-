package p366u4;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p022C4.C0144c;
import p022C4.InterfaceC0145d;

/* JADX INFO: renamed from: u4.a */
/* JADX INFO: loaded from: classes.dex */
public class C7160a {

    /* JADX INFO: renamed from: a */
    private final ScheduledExecutorService f28607a;

    /* JADX INFO: renamed from: b */
    private final C0144c f28608b;

    /* JADX INFO: renamed from: c */
    private final long f28609c;

    /* JADX INFO: renamed from: d */
    private final long f28610d;

    /* JADX INFO: renamed from: e */
    private final double f28611e;

    /* JADX INFO: renamed from: f */
    private final double f28612f;

    /* JADX INFO: renamed from: g */
    private final Random f28613g;

    /* JADX INFO: renamed from: h */
    private ScheduledFuture f28614h;

    /* JADX INFO: renamed from: i */
    private long f28615i;

    /* JADX INFO: renamed from: j */
    private boolean f28616j;

    /* JADX INFO: renamed from: u4.a$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f28617a;

        a(Runnable runnable) {
            this.f28617a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C7160a.this.f28614h = null;
            this.f28617a.run();
        }
    }

    /* JADX INFO: renamed from: u4.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final ScheduledExecutorService f28619a;

        /* JADX INFO: renamed from: b */
        private long f28620b = 1000;

        /* JADX INFO: renamed from: c */
        private double f28621c = 0.5d;

        /* JADX INFO: renamed from: d */
        private long f28622d = 30000;

        /* JADX INFO: renamed from: e */
        private double f28623e = 1.3d;

        /* JADX INFO: renamed from: f */
        private final C0144c f28624f;

        public b(ScheduledExecutorService scheduledExecutorService, InterfaceC0145d interfaceC0145d, String str) {
            this.f28619a = scheduledExecutorService;
            this.f28624f = new C0144c(interfaceC0145d, str);
        }

        /* JADX INFO: renamed from: a */
        public C7160a m31652a() {
            return new C7160a(this.f28619a, this.f28624f, this.f28620b, this.f28622d, this.f28623e, this.f28621c, null);
        }

        /* JADX INFO: renamed from: b */
        public b m31653b(double d7) {
            if (d7 >= 0.0d && d7 <= 1.0d) {
                this.f28621c = d7;
                return this;
            }
            throw new IllegalArgumentException("Argument out of range: " + d7);
        }

        /* JADX INFO: renamed from: c */
        public b m31654c(long j7) {
            this.f28622d = j7;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m31655d(long j7) {
            this.f28620b = j7;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m31656e(double d7) {
            this.f28623e = d7;
            return this;
        }
    }

    /* synthetic */ C7160a(ScheduledExecutorService scheduledExecutorService, C0144c c0144c, long j7, long j8, double d7, double d8, a aVar) {
        this(scheduledExecutorService, c0144c, j7, j8, d7, d8);
    }

    /* JADX INFO: renamed from: b */
    public void m31648b() {
        if (this.f28614h != null) {
            this.f28608b.m624b("Cancelling existing retry attempt", new Object[0]);
            this.f28614h.cancel(false);
            this.f28614h = null;
        } else {
            this.f28608b.m624b("No existing retry attempt to cancel", new Object[0]);
        }
        this.f28615i = 0L;
    }

    /* JADX INFO: renamed from: c */
    public void m31649c(Runnable runnable) {
        a aVar = new a(runnable);
        if (this.f28614h != null) {
            this.f28608b.m624b("Cancelling previous scheduled retry", new Object[0]);
            this.f28614h.cancel(false);
            this.f28614h = null;
        }
        long jNextDouble = 0;
        if (!this.f28616j) {
            long j7 = this.f28615i;
            if (j7 == 0) {
                this.f28615i = this.f28609c;
            } else {
                this.f28615i = Math.min((long) (j7 * this.f28612f), this.f28610d);
            }
            double d7 = this.f28611e;
            long j8 = this.f28615i;
            jNextDouble = (long) (((1.0d - d7) * j8) + (d7 * j8 * this.f28613g.nextDouble()));
        }
        this.f28616j = false;
        this.f28608b.m624b("Scheduling retry in %dms", Long.valueOf(jNextDouble));
        this.f28614h = this.f28607a.schedule(aVar, jNextDouble, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: d */
    public void m31650d() {
        this.f28615i = this.f28610d;
    }

    /* JADX INFO: renamed from: e */
    public void m31651e() {
        this.f28616j = true;
        this.f28615i = 0L;
    }

    private C7160a(ScheduledExecutorService scheduledExecutorService, C0144c c0144c, long j7, long j8, double d7, double d8) {
        this.f28613g = new Random();
        this.f28616j = true;
        this.f28607a = scheduledExecutorService;
        this.f28608b = c0144c;
        this.f28609c = j7;
        this.f28610d = j8;
        this.f28612f = d7;
        this.f28611e = d8;
    }
}

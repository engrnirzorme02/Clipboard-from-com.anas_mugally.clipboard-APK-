package p072I6;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.C */
/* JADX INFO: loaded from: classes.dex */
public class C0641C {

    /* JADX INFO: renamed from: d */
    public static final b f2529d = new b(null);

    /* JADX INFO: renamed from: e */
    public static final C0641C f2530e = new a();

    /* JADX INFO: renamed from: a */
    private boolean f2531a;

    /* JADX INFO: renamed from: b */
    private long f2532b;

    /* JADX INFO: renamed from: c */
    private long f2533c;

    /* JADX INFO: renamed from: I6.C$a */
    public static final class a extends C0641C {
        a() {
        }

        @Override // p072I6.C0641C
        /* JADX INFO: renamed from: d */
        public C0641C mo2953d(long j7) {
            return this;
        }

        @Override // p072I6.C0641C
        /* JADX INFO: renamed from: f */
        public void mo2955f() {
        }

        @Override // p072I6.C0641C
        /* JADX INFO: renamed from: g */
        public C0641C mo2956g(long j7, TimeUnit unit) {
            AbstractC6118n.m27187e(unit, "unit");
            return this;
        }
    }

    /* JADX INFO: renamed from: I6.C$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m2959a(long j7, long j8) {
            return (j7 != 0 && (j8 == 0 || j7 < j8)) ? j7 : j8;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public C0641C mo2950a() {
        this.f2531a = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0641C mo2951b() {
        this.f2533c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo2952c() {
        if (this.f2531a) {
            return this.f2532b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* JADX INFO: renamed from: d */
    public C0641C mo2953d(long j7) {
        this.f2531a = true;
        this.f2532b = j7;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo2954e() {
        return this.f2531a;
    }

    /* JADX INFO: renamed from: f */
    public void mo2955f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f2531a && this.f2532b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: g */
    public C0641C mo2956g(long j7, TimeUnit unit) {
        AbstractC6118n.m27187e(unit, "unit");
        if (j7 >= 0) {
            this.f2533c = unit.toNanos(j7);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j7).toString());
    }

    /* JADX INFO: renamed from: h */
    public long mo2957h() {
        return this.f2533c;
    }

    /* JADX INFO: renamed from: i */
    public final void m2958i(Object monitor) throws InterruptedIOException {
        AbstractC6118n.m27187e(monitor, "monitor");
        try {
            boolean zMo2954e = mo2954e();
            long jMo2957h = mo2957h();
            long jNanoTime = 0;
            if (!zMo2954e && jMo2957h == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zMo2954e && jMo2957h != 0) {
                jMo2957h = Math.min(jMo2957h, mo2952c() - jNanoTime2);
            } else if (zMo2954e) {
                jMo2957h = mo2952c() - jNanoTime2;
            }
            if (jMo2957h > 0) {
                long j7 = jMo2957h / 1000000;
                monitor.wait(j7, (int) (jMo2957h - (1000000 * j7)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jMo2957h) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}

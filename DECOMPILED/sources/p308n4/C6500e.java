package p308n4;

import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p198a2.AbstractC2188d;
import p198a2.EnumC2190f;
import p198a2.InterfaceC2193i;
import p198a2.InterfaceC2195k;
import p216c2.AbstractC2996l;
import p228d4.C5235g;
import p252g4.AbstractC5493c0;
import p252g4.AbstractC5516z;
import p252g4.C5475M;
import p316o4.C6583d;

/* JADX INFO: renamed from: n4.e */
/* JADX INFO: loaded from: classes.dex */
final class C6500e {

    /* JADX INFO: renamed from: a */
    private final double f24570a;

    /* JADX INFO: renamed from: b */
    private final double f24571b;

    /* JADX INFO: renamed from: c */
    private final long f24572c;

    /* JADX INFO: renamed from: d */
    private final long f24573d;

    /* JADX INFO: renamed from: e */
    private final int f24574e;

    /* JADX INFO: renamed from: f */
    private final BlockingQueue f24575f;

    /* JADX INFO: renamed from: g */
    private final ThreadPoolExecutor f24576g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC2193i f24577h;

    /* JADX INFO: renamed from: i */
    private final C5475M f24578i;

    /* JADX INFO: renamed from: j */
    private int f24579j;

    /* JADX INFO: renamed from: k */
    private long f24580k;

    /* JADX INFO: renamed from: n4.e$b */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final AbstractC5516z f24581a;

        /* JADX INFO: renamed from: b */
        private final TaskCompletionSource f24582b;

        @Override // java.lang.Runnable
        public void run() {
            C6500e.this.m27670n(this.f24581a, this.f24582b);
            C6500e.this.f24578i.m24723c();
            double dM27665g = C6500e.this.m27665g();
            C5235g.m24179f().m24180b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dM27665g / 1000.0d)) + " s for report: " + this.f24581a.mo24761d());
            C6500e.m27671o(dM27665g);
        }

        private b(AbstractC5516z abstractC5516z, TaskCompletionSource taskCompletionSource) {
            this.f24581a = abstractC5516z;
            this.f24582b = taskCompletionSource;
        }
    }

    C6500e(InterfaceC2193i interfaceC2193i, C6583d c6583d, C5475M c5475m) {
        this(c6583d.f24828f, c6583d.f24829g, ((long) c6583d.f24830h) * 1000, interfaceC2193i, c5475m);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27659a(C6500e c6500e, TaskCompletionSource taskCompletionSource, boolean z7, AbstractC5516z abstractC5516z, Exception exc) {
        c6500e.getClass();
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z7) {
            c6500e.m27673j();
        }
        taskCompletionSource.trySetResult(abstractC5516z);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m27660b(C6500e c6500e, CountDownLatch countDownLatch) {
        c6500e.getClass();
        try {
            AbstractC2996l.m14960a(c6500e.f24577h, EnumC2190f.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public double m27665g() {
        return Math.min(3600000.0d, (60000.0d / this.f24570a) * Math.pow(this.f24571b, m27666h()));
    }

    /* JADX INFO: renamed from: h */
    private int m27666h() {
        if (this.f24580k == 0) {
            this.f24580k = m27669m();
        }
        int iM27669m = (int) ((m27669m() - this.f24580k) / this.f24572c);
        int iMin = m27668l() ? Math.min(100, this.f24579j + iM27669m) : Math.max(0, this.f24579j - iM27669m);
        if (this.f24579j != iMin) {
            this.f24579j = iMin;
            this.f24580k = m27669m();
        }
        return iMin;
    }

    /* JADX INFO: renamed from: k */
    private boolean m27667k() {
        return this.f24575f.size() < this.f24574e;
    }

    /* JADX INFO: renamed from: l */
    private boolean m27668l() {
        return this.f24575f.size() == this.f24574e;
    }

    /* JADX INFO: renamed from: m */
    private long m27669m() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m27670n(final AbstractC5516z abstractC5516z, final TaskCompletionSource taskCompletionSource) {
        C5235g.m24179f().m24180b("Sending report through Google DataTransport: " + abstractC5516z.mo24761d());
        final boolean z7 = SystemClock.elapsedRealtime() - this.f24573d < 2000;
        this.f24577h.mo8931a(AbstractC2188d.m8929h(abstractC5516z.mo24759b()), new InterfaceC2195k() { // from class: n4.c
            @Override // p198a2.InterfaceC2195k
            /* JADX INFO: renamed from: a */
            public final void mo8934a(Exception exc) {
                C6500e.m27659a(this.f24564a, taskCompletionSource, z7, abstractC5516z, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static void m27671o(double d7) {
        try {
            Thread.sleep((long) d7);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    TaskCompletionSource m27672i(AbstractC5516z abstractC5516z, boolean z7) {
        synchronized (this.f24575f) {
            try {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (!z7) {
                    m27670n(abstractC5516z, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.f24578i.m24722b();
                if (!m27667k()) {
                    m27666h();
                    C5235g.m24179f().m24180b("Dropping report due to queue being full: " + abstractC5516z.mo24761d());
                    this.f24578i.m24721a();
                    taskCompletionSource.trySetResult(abstractC5516z);
                    return taskCompletionSource;
                }
                C5235g.m24179f().m24180b("Enqueueing report: " + abstractC5516z.mo24761d());
                C5235g.m24179f().m24180b("Queue size: " + this.f24575f.size());
                this.f24576g.execute(new b(abstractC5516z, taskCompletionSource));
                C5235g.m24179f().m24180b("Closing task for report: " + abstractC5516z.mo24761d());
                taskCompletionSource.trySetResult(abstractC5516z);
                return taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m27673j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: n4.d
            @Override // java.lang.Runnable
            public final void run() {
                C6500e.m27660b(this.f24568a, countDownLatch);
            }
        }).start();
        AbstractC5493c0.m24764c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    C6500e(double d7, double d8, long j7, InterfaceC2193i interfaceC2193i, C5475M c5475m) {
        this.f24570a = d7;
        this.f24571b = d8;
        this.f24572c = j7;
        this.f24577h = interfaceC2193i;
        this.f24578i = c5475m;
        this.f24573d = SystemClock.elapsedRealtime();
        int i7 = (int) d7;
        this.f24574e = i7;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i7);
        this.f24575f = arrayBlockingQueue;
        this.f24576g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f24579j = 0;
        this.f24580k = 0L;
    }
}

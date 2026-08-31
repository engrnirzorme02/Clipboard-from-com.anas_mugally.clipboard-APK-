package p175X0;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p112O0.AbstractC1097j;

/* JADX INFO: renamed from: X0.r */
/* JADX INFO: loaded from: classes.dex */
public class C1940r {

    /* JADX INFO: renamed from: f */
    private static final String f6421f = AbstractC1097j.m4846f("WorkTimer");

    /* JADX INFO: renamed from: a */
    private final ThreadFactory f6422a;

    /* JADX INFO: renamed from: b */
    private final ScheduledExecutorService f6423b;

    /* JADX INFO: renamed from: c */
    final Map f6424c;

    /* JADX INFO: renamed from: d */
    final Map f6425d;

    /* JADX INFO: renamed from: e */
    final Object f6426e;

    /* JADX INFO: renamed from: X0.r$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private int f6427a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f6427a);
            this.f6427a = this.f6427a + 1;
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: X0.r$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo7992a(String str);
    }

    /* JADX INFO: renamed from: X0.r$c */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: a */
        private final C1940r f6429a;

        /* JADX INFO: renamed from: b */
        private final String f6430b;

        c(C1940r c1940r, String str) {
            this.f6429a = c1940r;
            this.f6430b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f6429a.f6426e) {
                try {
                    if (((c) this.f6429a.f6424c.remove(this.f6430b)) != null) {
                        b bVar = (b) this.f6429a.f6425d.remove(this.f6430b);
                        if (bVar != null) {
                            bVar.mo7992a(this.f6430b);
                        }
                    } else {
                        AbstractC1097j.m4844c().mo4847a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f6430b), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C1940r() {
        a aVar = new a();
        this.f6422a = aVar;
        this.f6424c = new HashMap();
        this.f6425d = new HashMap();
        this.f6426e = new Object();
        this.f6423b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m7989a() {
        if (this.f6423b.isShutdown()) {
            return;
        }
        this.f6423b.shutdownNow();
    }

    /* JADX INFO: renamed from: b */
    public void m7990b(String str, long j7, b bVar) {
        synchronized (this.f6426e) {
            AbstractC1097j.m4844c().mo4847a(f6421f, String.format("Starting timer for %s", str), new Throwable[0]);
            m7991c(str);
            c cVar = new c(this, str);
            this.f6424c.put(str, cVar);
            this.f6425d.put(str, bVar);
            this.f6423b.schedule(cVar, j7, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7991c(String str) {
        synchronized (this.f6426e) {
            try {
                if (((c) this.f6424c.remove(str)) != null) {
                    AbstractC1097j.m4844c().mo4847a(f6421f, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.f6425d.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

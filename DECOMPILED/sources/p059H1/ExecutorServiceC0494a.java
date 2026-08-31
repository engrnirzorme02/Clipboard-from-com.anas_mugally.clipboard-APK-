package p059H1;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.C3553a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: H1.a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorServiceC0494a implements ExecutorService {

    /* JADX INFO: renamed from: b */
    private static final long f1850b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c */
    private static volatile int f1851c;

    /* JADX INFO: renamed from: a */
    private final ExecutorService f1852a;

    /* JADX INFO: renamed from: H1.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final boolean f1853a;

        /* JADX INFO: renamed from: b */
        private int f1854b;

        /* JADX INFO: renamed from: c */
        private int f1855c;

        /* JADX INFO: renamed from: d */
        private ThreadFactory f1856d = new c();

        /* JADX INFO: renamed from: e */
        private e f1857e = e.f1871d;

        /* JADX INFO: renamed from: f */
        private String f1858f;

        /* JADX INFO: renamed from: g */
        private long f1859g;

        b(boolean z7) {
            this.f1853a = z7;
        }

        /* JADX INFO: renamed from: a */
        public ExecutorServiceC0494a m2102a() {
            if (TextUtils.isEmpty(this.f1858f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f1858f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f1854b, this.f1855c, this.f1859g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f1856d, this.f1858f, this.f1857e, this.f1853a));
            if (this.f1859g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC0494a(threadPoolExecutor);
        }

        /* JADX INFO: renamed from: b */
        public b m2103b(String str) {
            this.f1858f = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m2104c(int i7) {
            this.f1854b = i7;
            this.f1855c = i7;
            return this;
        }
    }

    /* JADX INFO: renamed from: H1.a$c */
    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: H1.a$c$a */
        class a extends Thread {
            a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    /* JADX INFO: renamed from: H1.a$d */
    private static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final ThreadFactory f1861a;

        /* JADX INFO: renamed from: b */
        private final String f1862b;

        /* JADX INFO: renamed from: c */
        final e f1863c;

        /* JADX INFO: renamed from: d */
        final boolean f1864d;

        /* JADX INFO: renamed from: e */
        private final AtomicInteger f1865e = new AtomicInteger();

        /* JADX INFO: renamed from: H1.a$d$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Runnable f1866a;

            a(Runnable runnable) {
                this.f1866a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f1864d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f1866a.run();
                } catch (Throwable th) {
                    d.this.f1863c.mo2105a(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z7) {
            this.f1861a = threadFactory;
            this.f1862b = str;
            this.f1863c = eVar;
            this.f1864d = z7;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f1861a.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f1862b + "-thread-" + this.f1865e.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: H1.a$e */
    public interface e {

        /* JADX INFO: renamed from: a */
        public static final e f1868a = new a();

        /* JADX INFO: renamed from: b */
        public static final e f1869b;

        /* JADX INFO: renamed from: c */
        public static final e f1870c;

        /* JADX INFO: renamed from: d */
        public static final e f1871d;

        /* JADX INFO: renamed from: H1.a$e$a */
        class a implements e {
            a() {
            }

            @Override // p059H1.ExecutorServiceC0494a.e
            /* JADX INFO: renamed from: a */
            public void mo2105a(Throwable th) {
            }
        }

        /* JADX INFO: renamed from: H1.a$e$b */
        class b implements e {
            b() {
            }

            @Override // p059H1.ExecutorServiceC0494a.e
            /* JADX INFO: renamed from: a */
            public void mo2105a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* JADX INFO: renamed from: H1.a$e$c */
        class c implements e {
            c() {
            }

            @Override // p059H1.ExecutorServiceC0494a.e
            /* JADX INFO: renamed from: a */
            public void mo2105a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f1869b = bVar;
            f1870c = new c();
            f1871d = bVar;
        }

        /* JADX INFO: renamed from: a */
        void mo2105a(Throwable th);
    }

    ExecutorServiceC0494a(ExecutorService executorService) {
        this.f1852a = executorService;
    }

    /* JADX INFO: renamed from: J */
    public static ExecutorServiceC0494a m2093J() {
        return m2101x().m2102a();
    }

    /* JADX INFO: renamed from: Q */
    public static b m2094Q() {
        return new b(true).m2104c(1).m2103b("disk-cache");
    }

    /* JADX INFO: renamed from: d0 */
    public static ExecutorServiceC0494a m2095d0() {
        return m2094Q().m2102a();
    }

    /* JADX INFO: renamed from: k0 */
    public static b m2096k0() {
        return new b(false).m2104c(m2098n()).m2103b("source");
    }

    /* JADX INFO: renamed from: m */
    static int m2097m() {
        return m2098n() >= 4 ? 2 : 1;
    }

    /* JADX INFO: renamed from: n */
    public static int m2098n() {
        if (f1851c == 0) {
            f1851c = Math.min(4, AbstractC0495b.m2106a());
        }
        return f1851c;
    }

    /* JADX INFO: renamed from: o0 */
    public static ExecutorServiceC0494a m2099o0() {
        return m2096k0().m2102a();
    }

    /* JADX INFO: renamed from: p0 */
    public static ExecutorServiceC0494a m2100p0() {
        return new ExecutorServiceC0494a(new ThreadPoolExecutor(0, C3553a.e.API_PRIORITY_OTHER, f1850b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f1871d, false)));
    }

    /* JADX INFO: renamed from: x */
    public static b m2101x() {
        return new b(true).m2104c(m2097m()).m2103b("animation");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return this.f1852a.awaitTermination(j7, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f1852a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f1852a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f1852a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f1852a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f1852a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f1852a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f1852a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f1852a.submit(runnable);
    }

    public String toString() {
        return this.f1852a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f1852a.invokeAll(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f1852a.invokeAny(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f1852a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f1852a.submit(callable);
    }
}

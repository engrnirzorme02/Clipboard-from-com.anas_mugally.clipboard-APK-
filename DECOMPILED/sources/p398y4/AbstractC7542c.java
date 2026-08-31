package p398y4;

import com.google.firebase.database.C4906c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p334q4.C6835b;
import p374v4.InterfaceC7252q;
import p374v4.InterfaceC7260y;

/* JADX INFO: renamed from: y4.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7542c implements InterfaceC7252q {

    /* JADX INFO: renamed from: a */
    private ScheduledThreadPoolExecutor f30177a;

    /* JADX INFO: renamed from: y4.c$a */
    class a extends ScheduledThreadPoolExecutor {
        a(int i7, ThreadFactory threadFactory) {
            super(i7, threadFactory);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th == null && (runnable instanceof Future)) {
                Future future = (Future) runnable;
                try {
                    if (future.isDone()) {
                        future.get();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (CancellationException unused2) {
                } catch (ExecutionException e7) {
                    th = e7.getCause();
                }
            }
            if (th != null) {
                AbstractC7542c.this.mo30274g(th);
            }
        }
    }

    /* JADX INFO: renamed from: y4.c$b */
    private class b implements ThreadFactory {

        /* JADX INFO: renamed from: y4.c$b$a */
        class a implements Thread.UncaughtExceptionHandler {
            a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                AbstractC7542c.this.mo30274g(th);
            }
        }

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = AbstractC7542c.this.m33185e().newThread(runnable);
            InterfaceC7260y interfaceC7260yM33186f = AbstractC7542c.this.m33186f();
            interfaceC7260yM33186f.mo32186a(threadNewThread, "FirebaseDatabaseWorker");
            interfaceC7260yM33186f.mo32187b(threadNewThread, true);
            interfaceC7260yM33186f.mo32188c(threadNewThread, new a());
            return threadNewThread;
        }

        /* synthetic */ b(AbstractC7542c abstractC7542c, a aVar) {
            this();
        }
    }

    public AbstractC7542c() {
        a aVar = new a(1, new b(this, null));
        this.f30177a = aVar;
        aVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: h */
    public static String m33183h(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            return "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        }
        if (th instanceof NoClassDefFoundError) {
            return "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk";
        }
        if (th instanceof C6835b) {
            return "";
        }
        return "Uncaught exception in Firebase Database runloop (" + C4906c.m22116e() + "). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
    }

    @Override // p374v4.InterfaceC7252q
    /* JADX INFO: renamed from: a */
    public void mo32087a() {
        this.f30177a.setCorePoolSize(1);
    }

    @Override // p374v4.InterfaceC7252q
    /* JADX INFO: renamed from: b */
    public void mo32088b(Runnable runnable) {
        this.f30177a.execute(runnable);
    }

    @Override // p374v4.InterfaceC7252q
    /* JADX INFO: renamed from: c */
    public ScheduledFuture mo32089c(Runnable runnable, long j7) {
        return this.f30177a.schedule(runnable, j7, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: d */
    public ScheduledExecutorService m33184d() {
        return this.f30177a;
    }

    /* JADX INFO: renamed from: e */
    protected ThreadFactory m33185e() {
        return Executors.defaultThreadFactory();
    }

    /* JADX INFO: renamed from: f */
    protected InterfaceC7260y m33186f() {
        return InterfaceC7260y.f29044a;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo30274g(Throwable th);
}

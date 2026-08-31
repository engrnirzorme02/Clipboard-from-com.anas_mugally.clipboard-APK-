package p089L;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p104N.AbstractC0910g;
import p104N.InterfaceC0904a;

/* JADX INFO: renamed from: L.m */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0777m {

    /* JADX INFO: renamed from: L.m$a */
    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private String f3152a;

        /* JADX INFO: renamed from: b */
        private int f3153b;

        /* JADX INFO: renamed from: L.m$a$a, reason: collision with other inner class name */
        private static class C7634a extends Thread {

            /* JADX INFO: renamed from: a */
            private final int f3154a;

            C7634a(Runnable runnable, String str, int i7) {
                super(runnable, str);
                this.f3154a = i7;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f3154a);
                super.run();
            }
        }

        a(String str, int i7) {
            this.f3152a = str;
            this.f3153b = i7;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C7634a(runnable, this.f3152a, this.f3153b);
        }
    }

    /* JADX INFO: renamed from: L.m$b */
    private static class b implements Executor {

        /* JADX INFO: renamed from: a */
        private final Handler f3155a;

        b(Handler handler) {
            this.f3155a = (Handler) AbstractC0910g.m4139g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f3155a.post((Runnable) AbstractC0910g.m4139g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f3155a + " is shutting down");
        }
    }

    /* JADX INFO: renamed from: L.m$c */
    private static class c implements Runnable {

        /* JADX INFO: renamed from: a */
        private Callable f3156a;

        /* JADX INFO: renamed from: b */
        private InterfaceC0904a f3157b;

        /* JADX INFO: renamed from: c */
        private Handler f3158c;

        /* JADX INFO: renamed from: L.m$c$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC0904a f3159a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Object f3160b;

            a(InterfaceC0904a interfaceC0904a, Object obj) {
                this.f3159a = interfaceC0904a;
                this.f3160b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3159a.accept(this.f3160b);
            }
        }

        c(Handler handler, Callable callable, InterfaceC0904a interfaceC0904a) {
            this.f3156a = callable;
            this.f3157b = interfaceC0904a;
            this.f3158c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f3156a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f3158c.post(new a(this.f3157b, objCall));
        }
    }

    /* JADX INFO: renamed from: a */
    static ThreadPoolExecutor m3654a(String str, int i7, int i8) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i8, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i7));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    static Executor m3655b(Handler handler) {
        return new b(handler);
    }

    /* JADX INFO: renamed from: c */
    static void m3656c(Executor executor, Callable callable, InterfaceC0904a interfaceC0904a) {
        executor.execute(new c(AbstractC0766b.m3602a(), callable, interfaceC0904a));
    }

    /* JADX INFO: renamed from: d */
    static Object m3657d(ExecutorService executorService, Callable callable, int i7) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i7, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw e7;
        } catch (ExecutionException e8) {
            throw new RuntimeException(e8);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}

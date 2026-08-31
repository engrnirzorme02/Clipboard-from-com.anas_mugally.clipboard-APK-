package p303n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: n.d */
/* JADX INFO: loaded from: classes.dex */
public class C6426d extends AbstractC6427e {

    /* JADX INFO: renamed from: a */
    private final Object f24465a = new Object();

    /* JADX INFO: renamed from: b */
    private final ExecutorService f24466b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c */
    private volatile Handler f24467c;

    /* JADX INFO: renamed from: n.d$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f24468a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f24468a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: n.d$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        public static Handler m27639a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: d */
    private static Handler m27638d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m27639a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p303n.AbstractC6427e
    /* JADX INFO: renamed from: a */
    public void mo27635a(Runnable runnable) {
        this.f24466b.execute(runnable);
    }

    @Override // p303n.AbstractC6427e
    /* JADX INFO: renamed from: b */
    public boolean mo27636b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p303n.AbstractC6427e
    /* JADX INFO: renamed from: c */
    public void mo27637c(Runnable runnable) {
        if (this.f24467c == null) {
            synchronized (this.f24465a) {
                try {
                    if (this.f24467c == null) {
                        this.f24467c = m27638d(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f24467c.post(runnable);
    }
}

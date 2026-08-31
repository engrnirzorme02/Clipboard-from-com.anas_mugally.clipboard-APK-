package p252g4;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: g4.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5493c0 {

    /* JADX INFO: renamed from: a */
    private static final ExecutorService f20836a = AbstractC5467E.m24688c("awaitEvenIfOnMainThread task continuation executor");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m24762a(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Object m24763b(Task task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f20836a, new Continuation() { // from class: g4.b0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return AbstractC5493c0.m24762a(countDownLatch, task2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m24764c(CountDownLatch countDownLatch, long j7, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z7 = false;
        try {
            long nanos = timeUnit.toNanos(j7);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z7) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th) {
            if (z7) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }
}

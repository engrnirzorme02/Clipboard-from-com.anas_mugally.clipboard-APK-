package p260h4;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: h4.e */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC5649e implements Executor {

    /* JADX INFO: renamed from: a */
    private final ExecutorService f21635a;

    /* JADX INFO: renamed from: b */
    private final Object f21636b = new Object();

    /* JADX INFO: renamed from: c */
    private Task f21637c = Tasks.forResult(null);

    ExecutorC5649e(ExecutorService executorService) {
        this.f21635a = executorService;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m25129a(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.forResult(null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Task m25130b(Callable callable, Task task) {
        return (Task) callable.call();
    }

    /* JADX INFO: renamed from: c */
    public ExecutorService m25131c() {
        return this.f21635a;
    }

    /* JADX INFO: renamed from: e */
    public Task m25132e(final Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f21636b) {
            taskContinueWithTask = this.f21637c.continueWithTask(this.f21635a, new Continuation() { // from class: h4.d
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return ExecutorC5649e.m25129a(runnable, task);
                }
            });
            this.f21637c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f21635a.execute(runnable);
    }

    /* JADX INFO: renamed from: f */
    public Task m25133f(final Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.f21636b) {
            taskContinueWithTask = this.f21637c.continueWithTask(this.f21635a, new Continuation() { // from class: h4.c
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return ExecutorC5649e.m25130b(callable, task);
                }
            });
            this.f21637c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }
}

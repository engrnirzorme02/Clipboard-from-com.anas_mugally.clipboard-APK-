package p322p0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: p0.c */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC6717c {

    /* JADX INFO: renamed from: e */
    private static Handler f26156e;

    /* JADX INFO: renamed from: b */
    private volatile e f26158b = e.PENDING;

    /* JADX INFO: renamed from: c */
    final AtomicBoolean f26159c = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    final AtomicBoolean f26160d = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    private final FutureTask f26157a = new b(new a());

    /* JADX INFO: renamed from: p0.c$a */
    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractC6717c.this.f26160d.set(true);
            Object objMo29506b = null;
            try {
                Process.setThreadPriority(10);
                objMo29506b = AbstractC6717c.this.mo29506b();
                Binder.flushPendingCommands();
                AbstractC6717c.this.m29533i(objMo29506b);
                return objMo29506b;
            } catch (Throwable th) {
                try {
                    AbstractC6717c.this.f26159c.set(true);
                    throw th;
                } catch (Throwable th2) {
                    AbstractC6717c.this.m29533i(objMo29506b);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p0.c$b */
    class b extends FutureTask {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC6717c.this.m29534j(get());
            } catch (InterruptedException e7) {
                Log.w("AsyncTask", e7);
            } catch (CancellationException unused) {
                AbstractC6717c.this.m29534j(null);
            } catch (ExecutionException e8) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e8.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: p0.c$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f26163a;

        c(Object obj) {
            this.f26163a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC6717c.this.m29531d(this.f26163a);
        }
    }

    /* JADX INFO: renamed from: p0.c$d */
    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f26165a;

        static {
            int[] iArr = new int[e.values().length];
            f26165a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26165a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: p0.c$e */
    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    AbstractC6717c() {
    }

    /* JADX INFO: renamed from: e */
    private static Handler m29528e() {
        Handler handler;
        synchronized (AbstractC6717c.class) {
            try {
                if (f26156e == null) {
                    f26156e = new Handler(Looper.getMainLooper());
                }
                handler = f26156e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29529a(boolean z7) {
        this.f26159c.set(true);
        return this.f26157a.cancel(z7);
    }

    /* JADX INFO: renamed from: b */
    protected abstract Object mo29506b();

    /* JADX INFO: renamed from: c */
    public final void m29530c(Executor executor) {
        if (this.f26158b == e.PENDING) {
            this.f26158b = e.RUNNING;
            executor.execute(this.f26157a);
            return;
        }
        int i7 = d.f26165a[this.f26158b.ordinal()];
        if (i7 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i7 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    /* JADX INFO: renamed from: d */
    void m29531d(Object obj) {
        if (m29532f()) {
            mo29507g(obj);
        } else {
            mo29508h(obj);
        }
        this.f26158b = e.FINISHED;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m29532f() {
        return this.f26159c.get();
    }

    /* JADX INFO: renamed from: g */
    protected abstract void mo29507g(Object obj);

    /* JADX INFO: renamed from: h */
    protected abstract void mo29508h(Object obj);

    /* JADX INFO: renamed from: i */
    void m29533i(Object obj) {
        m29528e().post(new c(obj));
    }

    /* JADX INFO: renamed from: j */
    void m29534j(Object obj) {
        if (this.f26160d.get()) {
            return;
        }
        m29533i(obj);
    }
}

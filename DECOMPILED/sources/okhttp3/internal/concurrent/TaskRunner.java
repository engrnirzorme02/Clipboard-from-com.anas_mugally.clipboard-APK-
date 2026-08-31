package okhttp3.internal.concurrent;

import com.google.android.gms.common.api.C3553a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p145S5.C1444v;

/* JADX INFO: loaded from: classes.dex */
public final class TaskRunner {

    /* JADX INFO: renamed from: h */
    public static final Companion f25605h = new Companion(null);

    /* JADX INFO: renamed from: i */
    public static final TaskRunner f25606i = new TaskRunner(new RealBackend(Util.m28745N(Util.f25485i + " TaskRunner", true)));

    /* JADX INFO: renamed from: j */
    private static final Logger f25607j;

    /* JADX INFO: renamed from: a */
    private final Backend f25608a;

    /* JADX INFO: renamed from: b */
    private int f25609b;

    /* JADX INFO: renamed from: c */
    private boolean f25610c;

    /* JADX INFO: renamed from: d */
    private long f25611d;

    /* JADX INFO: renamed from: e */
    private final List f25612e;

    /* JADX INFO: renamed from: f */
    private final List f25613f;

    /* JADX INFO: renamed from: g */
    private final Runnable f25614g;

    public interface Backend {
        /* JADX INFO: renamed from: a */
        void mo28917a(TaskRunner taskRunner);

        /* JADX INFO: renamed from: b */
        long mo28918b();

        /* JADX INFO: renamed from: c */
        void mo28919c(TaskRunner taskRunner, long j7);

        void execute(Runnable runnable);
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Logger m28920a() {
            return TaskRunner.f25607j;
        }

        private Companion() {
        }
    }

    public static final class RealBackend implements Backend {

        /* JADX INFO: renamed from: a */
        private final ThreadPoolExecutor f25615a;

        public RealBackend(ThreadFactory threadFactory) {
            AbstractC6118n.m27187e(threadFactory, "threadFactory");
            this.f25615a = new ThreadPoolExecutor(0, C3553a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        /* JADX INFO: renamed from: a */
        public void mo28917a(TaskRunner taskRunner) {
            AbstractC6118n.m27187e(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        /* JADX INFO: renamed from: b */
        public long mo28918b() {
            return System.nanoTime();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        /* JADX INFO: renamed from: c */
        public void mo28919c(TaskRunner taskRunner, long j7) throws InterruptedException {
            AbstractC6118n.m27187e(taskRunner, "taskRunner");
            long j8 = j7 / 1000000;
            long j9 = j7 - (1000000 * j8);
            if (j8 > 0 || j7 > 0) {
                taskRunner.wait(j8, (int) j9);
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(Runnable runnable) {
            AbstractC6118n.m27187e(runnable, "runnable");
            this.f25615a.execute(runnable);
        }
    }

    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        AbstractC6118n.m27186d(logger, "getLogger(TaskRunner::class.java.name)");
        f25607j = logger;
    }

    public TaskRunner(Backend backend) {
        AbstractC6118n.m27187e(backend, "backend");
        this.f25608a = backend;
        this.f25609b = 10000;
        this.f25612e = new ArrayList();
        this.f25613f = new ArrayList();
        this.f25614g = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Task taskM28912d;
                long jMo28918b;
                while (true) {
                    TaskRunner taskRunner = this.f25616a;
                    synchronized (taskRunner) {
                        taskM28912d = taskRunner.m28912d();
                    }
                    if (taskM28912d == null) {
                        return;
                    }
                    TaskQueue taskQueueM28887d = taskM28912d.m28887d();
                    AbstractC6118n.m27184b(taskQueueM28887d);
                    TaskRunner taskRunner2 = this.f25616a;
                    boolean zIsLoggable = TaskRunner.f25605h.m28920a().isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jMo28918b = taskQueueM28887d.m28901h().m28914g().mo28918b();
                        TaskLoggerKt.m28892c(taskM28912d, taskQueueM28887d, "starting");
                    } else {
                        jMo28918b = -1;
                    }
                    try {
                        taskRunner2.m28911j(taskM28912d);
                        try {
                            C1444v c1444v = C1444v.f4971a;
                            if (zIsLoggable) {
                                TaskLoggerKt.m28892c(taskM28912d, taskQueueM28887d, "finished run in " + TaskLoggerKt.m28891b(taskQueueM28887d.m28901h().m28914g().mo28918b() - jMo28918b));
                            }
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                TaskLoggerKt.m28892c(taskM28912d, taskQueueM28887d, "failed a run in " + TaskLoggerKt.m28891b(taskQueueM28887d.m28901h().m28914g().mo28918b() - jMo28918b));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        taskRunner2.m28914g().execute(this);
                        throw th2;
                    }
                }
            }
        };
    }

    /* JADX INFO: renamed from: c */
    private final void m28909c(Task task, long j7) {
        if (Util.f25484h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        TaskQueue taskQueueM28887d = task.m28887d();
        AbstractC6118n.m27184b(taskQueueM28887d);
        if (taskQueueM28887d.m28896c() != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zM28897d = taskQueueM28887d.m28897d();
        taskQueueM28887d.m28905m(false);
        taskQueueM28887d.m28904l(null);
        this.f25612e.remove(taskQueueM28887d);
        if (j7 != -1 && !zM28897d && !taskQueueM28887d.m28900g()) {
            taskQueueM28887d.m28903k(task, j7, true);
        }
        if (taskQueueM28887d.m28898e().isEmpty()) {
            return;
        }
        this.f25613f.add(taskQueueM28887d);
    }

    /* JADX INFO: renamed from: e */
    private final void m28910e(Task task) {
        if (Util.f25484h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        task.m28889g(-1L);
        TaskQueue taskQueueM28887d = task.m28887d();
        AbstractC6118n.m27184b(taskQueueM28887d);
        taskQueueM28887d.m28898e().remove(task);
        this.f25613f.remove(taskQueueM28887d);
        taskQueueM28887d.m28904l(task);
        this.f25612e.add(taskQueueM28887d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m28911j(Task task) {
        if (Util.f25484h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.m28885b());
        try {
            long jMo28863f = task.mo28863f();
            synchronized (this) {
                m28909c(task, jMo28863f);
                C1444v c1444v = C1444v.f4971a;
            }
        } finally {
            synchronized (this) {
                m28909c(task, -1L);
                C1444v c1444v2 = C1444v.f4971a;
                threadCurrentThread.setName(name);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Task m28912d() {
        boolean z7;
        if (Util.f25484h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f25613f.isEmpty()) {
            long jMo28918b = this.f25608a.mo28918b();
            Iterator it = this.f25613f.iterator();
            long jMin = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z7 = false;
                    break;
                }
                Task task2 = (Task) ((TaskQueue) it.next()).m28898e().get(0);
                long jMax = Math.max(0L, task2.m28886c() - jMo28918b);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task != null) {
                        z7 = true;
                        break;
                    }
                    task = task2;
                }
            }
            if (task != null) {
                m28910e(task);
                if (z7 || (!this.f25610c && !this.f25613f.isEmpty())) {
                    this.f25608a.execute(this.f25614g);
                }
                return task;
            }
            if (this.f25610c) {
                if (jMin < this.f25611d - jMo28918b) {
                    this.f25608a.mo28917a(this);
                }
                return null;
            }
            this.f25610c = true;
            this.f25611d = jMo28918b + jMin;
            try {
                try {
                    this.f25608a.mo28919c(this, jMin);
                } catch (InterruptedException unused) {
                    m28913f();
                }
                this.f25610c = false;
            } catch (Throwable th) {
                this.f25610c = false;
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m28913f() {
        int size = this.f25612e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((TaskQueue) this.f25612e.get(size)).m28895b();
            }
        }
        for (int size2 = this.f25613f.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = (TaskQueue) this.f25613f.get(size2);
            taskQueue.m28895b();
            if (taskQueue.m28898e().isEmpty()) {
                this.f25613f.remove(size2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final Backend m28914g() {
        return this.f25608a;
    }

    /* JADX INFO: renamed from: h */
    public final void m28915h(TaskQueue taskQueue) {
        AbstractC6118n.m27187e(taskQueue, "taskQueue");
        if (Util.f25484h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.m28896c() == null) {
            if (taskQueue.m28898e().isEmpty()) {
                this.f25613f.remove(taskQueue);
            } else {
                Util.m28762c(this.f25613f, taskQueue);
            }
        }
        if (this.f25610c) {
            this.f25608a.mo28917a(this);
        } else {
            this.f25608a.execute(this.f25614g);
        }
    }

    /* JADX INFO: renamed from: i */
    public final TaskQueue m28916i() {
        int i7;
        synchronized (this) {
            i7 = this.f25609b;
            this.f25609b = i7 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i7);
        return new TaskQueue(this, sb.toString());
    }
}

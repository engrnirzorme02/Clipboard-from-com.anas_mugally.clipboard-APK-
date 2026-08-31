package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p145S5.C1444v;

/* JADX INFO: loaded from: classes.dex */
public final class TaskQueue {

    /* JADX INFO: renamed from: a */
    private final TaskRunner f25596a;

    /* JADX INFO: renamed from: b */
    private final String f25597b;

    /* JADX INFO: renamed from: c */
    private boolean f25598c;

    /* JADX INFO: renamed from: d */
    private Task f25599d;

    /* JADX INFO: renamed from: e */
    private final List f25600e;

    /* JADX INFO: renamed from: f */
    private boolean f25601f;

    private static final class AwaitIdleTask extends Task {

        /* JADX INFO: renamed from: e */
        private final CountDownLatch f25602e;

        public AwaitIdleTask() {
            super(Util.f25485i + " awaitIdle", false);
            this.f25602e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        /* JADX INFO: renamed from: f */
        public long mo28863f() {
            this.f25602e.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        AbstractC6118n.m27187e(taskRunner, "taskRunner");
        AbstractC6118n.m27187e(name, "name");
        this.f25596a = taskRunner;
        this.f25597b = name;
        this.f25600e = new ArrayList();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m28893j(TaskQueue taskQueue, Task task, long j7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        taskQueue.m28902i(task, j7);
    }

    /* JADX INFO: renamed from: a */
    public final void m28894a() {
        if (Util.f25484h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f25596a) {
            try {
                if (m28895b()) {
                    this.f25596a.m28915h(this);
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m28895b() {
        Task task = this.f25599d;
        if (task != null) {
            AbstractC6118n.m27184b(task);
            if (task.m28884a()) {
                this.f25601f = true;
            }
        }
        boolean z7 = false;
        for (int size = this.f25600e.size() - 1; -1 < size; size--) {
            if (((Task) this.f25600e.get(size)).m28884a()) {
                Task task2 = (Task) this.f25600e.get(size);
                if (TaskRunner.f25605h.m28920a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.m28892c(task2, this, "canceled");
                }
                this.f25600e.remove(size);
                z7 = true;
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: c */
    public final Task m28896c() {
        return this.f25599d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m28897d() {
        return this.f25601f;
    }

    /* JADX INFO: renamed from: e */
    public final List m28898e() {
        return this.f25600e;
    }

    /* JADX INFO: renamed from: f */
    public final String m28899f() {
        return this.f25597b;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m28900g() {
        return this.f25598c;
    }

    /* JADX INFO: renamed from: h */
    public final TaskRunner m28901h() {
        return this.f25596a;
    }

    /* JADX INFO: renamed from: i */
    public final void m28902i(Task task, long j7) {
        AbstractC6118n.m27187e(task, "task");
        synchronized (this.f25596a) {
            if (!this.f25598c) {
                if (m28903k(task, j7, false)) {
                    this.f25596a.m28915h(this);
                }
                C1444v c1444v = C1444v.f4971a;
            } else if (task.m28884a()) {
                if (TaskRunner.f25605h.m28920a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.m28892c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (TaskRunner.f25605h.m28920a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.m28892c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m28903k(Task task, long j7, boolean z7) {
        String str;
        AbstractC6118n.m27187e(task, "task");
        task.m28888e(this);
        long jMo28918b = this.f25596a.m28914g().mo28918b();
        long j8 = jMo28918b + j7;
        int iIndexOf = this.f25600e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.m28886c() <= j8) {
                if (TaskRunner.f25605h.m28920a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.m28892c(task, this, "already scheduled");
                }
                return false;
            }
            this.f25600e.remove(iIndexOf);
        }
        task.m28889g(j8);
        if (TaskRunner.f25605h.m28920a().isLoggable(Level.FINE)) {
            if (z7) {
                str = "run again after " + TaskLoggerKt.m28891b(j8 - jMo28918b);
            } else {
                str = "scheduled after " + TaskLoggerKt.m28891b(j8 - jMo28918b);
            }
            TaskLoggerKt.m28892c(task, this, str);
        }
        Iterator it = this.f25600e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((Task) it.next()).m28886c() - jMo28918b > j7) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f25600e.size();
        }
        this.f25600e.add(size, task);
        return size == 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m28904l(Task task) {
        this.f25599d = task;
    }

    /* JADX INFO: renamed from: m */
    public final void m28905m(boolean z7) {
        this.f25601f = z7;
    }

    /* JADX INFO: renamed from: n */
    public final void m28906n() {
        if (Util.f25484h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f25596a) {
            try {
                this.f25598c = true;
                if (m28895b()) {
                    this.f25596a.m28915h(this);
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f25597b;
    }
}

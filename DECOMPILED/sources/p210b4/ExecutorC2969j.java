package p210b4;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: renamed from: b4.j */
/* JADX INFO: loaded from: classes.dex */
final class ExecutorC2969j implements Executor {

    /* JADX INFO: renamed from: f */
    private static final Logger f12253f = Logger.getLogger(ExecutorC2969j.class.getName());

    /* JADX INFO: renamed from: a */
    private final Executor f12254a;

    /* JADX INFO: renamed from: b */
    private final Deque f12255b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    private c f12256c = c.IDLE;

    /* JADX INFO: renamed from: d */
    private long f12257d = 0;

    /* JADX INFO: renamed from: e */
    private final b f12258e = new b(this, null);

    /* JADX INFO: renamed from: b4.j$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f12259a;

        a(Runnable runnable) {
            this.f12259a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12259a.run();
        }

        public String toString() {
            return this.f12259a.toString();
        }
    }

    /* JADX INFO: renamed from: b4.j$b */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a */
        Runnable f12261a;

        private b() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x003d A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.f12261a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            p210b4.ExecutorC2969j.f12253f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f12261a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.f12261a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void m14818a() {
            Runnable runnable;
            boolean z7 = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (ExecutorC2969j.this.f12255b) {
                        if (z7) {
                            runnable = (Runnable) ExecutorC2969j.this.f12255b.poll();
                            this.f12261a = runnable;
                            if (runnable == null) {
                                ExecutorC2969j.this.f12256c = c.IDLE;
                            }
                        } else {
                            c cVar = ExecutorC2969j.this.f12256c;
                            c cVar2 = c.RUNNING;
                            if (cVar != cVar2) {
                                ExecutorC2969j.m14816e(ExecutorC2969j.this);
                                ExecutorC2969j.this.f12256c = cVar2;
                                z7 = true;
                                runnable = (Runnable) ExecutorC2969j.this.f12255b.poll();
                                this.f12261a = runnable;
                                if (runnable == null) {
                                    ExecutorC2969j.this.f12256c = c.IDLE;
                                }
                            }
                        }
                    }
                    if (zInterrupted) {
                        break;
                    } else {
                        return;
                    }
                    this.f12261a = null;
                } catch (Throwable th) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            Thread.currentThread().interrupt();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m14818a();
            } catch (Error e7) {
                synchronized (ExecutorC2969j.this.f12255b) {
                    ExecutorC2969j.this.f12256c = c.IDLE;
                    throw e7;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f12261a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + ExecutorC2969j.this.f12256c + "}";
        }

        /* synthetic */ b(ExecutorC2969j executorC2969j, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: b4.j$c */
    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    ExecutorC2969j(Executor executor) {
        this.f12254a = (Executor) AbstractC3718s.m18083l(executor);
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ long m14816e(ExecutorC2969j executorC2969j) {
        long j7 = executorC2969j.f12257d;
        executorC2969j.f12257d = 1 + j7;
        return j7;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        boolean z7;
        AbstractC3718s.m18083l(runnable);
        synchronized (this.f12255b) {
            c cVar2 = this.f12256c;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j7 = this.f12257d;
                a aVar = new a(runnable);
                this.f12255b.add(aVar);
                c cVar3 = c.QUEUING;
                this.f12256c = cVar3;
                try {
                    this.f12254a.execute(this.f12258e);
                    if (this.f12256c != cVar3) {
                        return;
                    }
                    synchronized (this.f12255b) {
                        try {
                            if (this.f12257d == j7 && this.f12256c == cVar3) {
                                this.f12256c = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f12255b) {
                        try {
                            c cVar4 = this.f12256c;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z7 = false;
                            } else if (this.f12255b.removeLastOccurrence(aVar)) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (!(e7 instanceof RejectedExecutionException) || z7) {
                                throw e7;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f12255b.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f12254a + "}";
    }
}

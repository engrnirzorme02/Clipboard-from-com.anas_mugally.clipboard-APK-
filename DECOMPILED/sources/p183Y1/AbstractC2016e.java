package p183Y1;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Y1.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2016e {

    /* JADX INFO: renamed from: a */
    private static final Executor f6694a = new a();

    /* JADX INFO: renamed from: b */
    private static final Executor f6695b = new b();

    /* JADX INFO: renamed from: c */
    private static final Executor f6696c = new c();

    /* JADX INFO: renamed from: Y1.e$a */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC2023l.m8431v(runnable);
        }
    }

    /* JADX INFO: renamed from: Y1.e$b */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC2023l.m8430u(runnable);
        }
    }

    /* JADX INFO: renamed from: Y1.e$c */
    class c implements Executor {
        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m8389a() {
        return f6696c;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m8390b() {
        return f6694a;
    }
}

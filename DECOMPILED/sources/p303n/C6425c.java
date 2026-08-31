package p303n;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: n.c */
/* JADX INFO: loaded from: classes.dex */
public class C6425c extends AbstractC6427e {

    /* JADX INFO: renamed from: c */
    private static volatile C6425c f24460c;

    /* JADX INFO: renamed from: d */
    private static final Executor f24461d = new Executor() { // from class: n.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C6425c.m27634g().mo27637c(runnable);
        }
    };

    /* JADX INFO: renamed from: e */
    private static final Executor f24462e = new Executor() { // from class: n.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C6425c.m27634g().mo27635a(runnable);
        }
    };

    /* JADX INFO: renamed from: a */
    private AbstractC6427e f24463a;

    /* JADX INFO: renamed from: b */
    private final AbstractC6427e f24464b;

    private C6425c() {
        C6426d c6426d = new C6426d();
        this.f24464b = c6426d;
        this.f24463a = c6426d;
    }

    /* JADX INFO: renamed from: f */
    public static Executor m27633f() {
        return f24462e;
    }

    /* JADX INFO: renamed from: g */
    public static C6425c m27634g() {
        if (f24460c != null) {
            return f24460c;
        }
        synchronized (C6425c.class) {
            try {
                if (f24460c == null) {
                    f24460c = new C6425c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24460c;
    }

    @Override // p303n.AbstractC6427e
    /* JADX INFO: renamed from: a */
    public void mo27635a(Runnable runnable) {
        this.f24463a.mo27635a(runnable);
    }

    @Override // p303n.AbstractC6427e
    /* JADX INFO: renamed from: b */
    public boolean mo27636b() {
        return this.f24463a.mo27636b();
    }

    @Override // p303n.AbstractC6427e
    /* JADX INFO: renamed from: c */
    public void mo27637c(Runnable runnable) {
        this.f24463a.mo27637c(runnable);
    }
}

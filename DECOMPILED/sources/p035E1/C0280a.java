package p035E1;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p019C1.InterfaceC0130f;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: E1.a */
/* JADX INFO: loaded from: classes.dex */
final class C0280a {

    /* JADX INFO: renamed from: a */
    private final boolean f1049a;

    /* JADX INFO: renamed from: b */
    private final Executor f1050b;

    /* JADX INFO: renamed from: c */
    final Map f1051c;

    /* JADX INFO: renamed from: d */
    private final ReferenceQueue f1052d;

    /* JADX INFO: renamed from: e */
    private C0295p.a f1053e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f1054f;

    /* JADX INFO: renamed from: E1.a$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: E1.a$a$a, reason: collision with other inner class name */
        class RunnableC7626a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Runnable f1055a;

            RunnableC7626a(Runnable runnable) {
                this.f1055a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f1055a.run();
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC7626a(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: renamed from: E1.a$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0280a.this.m1305b();
        }
    }

    /* JADX INFO: renamed from: E1.a$c */
    static final class c extends WeakReference {

        /* JADX INFO: renamed from: a */
        final InterfaceC0130f f1058a;

        /* JADX INFO: renamed from: b */
        final boolean f1059b;

        /* JADX INFO: renamed from: c */
        InterfaceC0301v f1060c;

        c(InterfaceC0130f interfaceC0130f, C0295p c0295p, ReferenceQueue referenceQueue, boolean z7) {
            super(c0295p, referenceQueue);
            this.f1058a = (InterfaceC0130f) AbstractC2022k.m8408e(interfaceC0130f);
            this.f1060c = (c0295p.m1440f() && z7) ? (InterfaceC0301v) AbstractC2022k.m8408e(c0295p.m1439e()) : null;
            this.f1059b = c0295p.m1440f();
        }

        /* JADX INFO: renamed from: a */
        void m1310a() {
            this.f1060c = null;
            clear();
        }
    }

    C0280a(boolean z7) {
        this(z7, Executors.newSingleThreadExecutor(new a()));
    }

    /* JADX INFO: renamed from: a */
    synchronized void m1304a(InterfaceC0130f interfaceC0130f, C0295p c0295p) {
        c cVar = (c) this.f1051c.put(interfaceC0130f, new c(interfaceC0130f, c0295p, this.f1052d, this.f1049a));
        if (cVar != null) {
            cVar.m1310a();
        }
    }

    /* JADX INFO: renamed from: b */
    void m1305b() {
        while (!this.f1054f) {
            try {
                m1306c((c) this.f1052d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    void m1306c(c cVar) {
        InterfaceC0301v interfaceC0301v;
        synchronized (this) {
            this.f1051c.remove(cVar.f1058a);
            if (cVar.f1059b && (interfaceC0301v = cVar.f1060c) != null) {
                this.f1053e.mo1401a(cVar.f1058a, new C0295p(interfaceC0301v, true, false, cVar.f1058a, this.f1053e));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    synchronized void m1307d(InterfaceC0130f interfaceC0130f) {
        c cVar = (c) this.f1051c.remove(interfaceC0130f);
        if (cVar != null) {
            cVar.m1310a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    synchronized C0295p m1308e(InterfaceC0130f interfaceC0130f) {
        c cVar = (c) this.f1051c.get(interfaceC0130f);
        if (cVar == null) {
            return null;
        }
        C0295p c0295p = (C0295p) cVar.get();
        if (c0295p == null) {
            m1306c(cVar);
        }
        return c0295p;
    }

    /* JADX INFO: renamed from: f */
    void m1309f(C0295p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f1053e = aVar;
            }
        }
    }

    C0280a(boolean z7, Executor executor) {
        this.f1051c = new HashMap();
        this.f1052d = new ReferenceQueue();
        this.f1049a = z7;
        this.f1050b = executor;
        executor.execute(new b());
    }
}

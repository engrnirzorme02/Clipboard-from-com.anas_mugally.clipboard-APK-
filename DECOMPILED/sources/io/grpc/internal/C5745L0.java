package io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5745L0 {

    /* JADX INFO: renamed from: d */
    private static final C5745L0 f22202d = new C5745L0(new a());

    /* JADX INFO: renamed from: a */
    private final IdentityHashMap f22203a = new IdentityHashMap();

    /* JADX INFO: renamed from: b */
    private final e f22204b;

    /* JADX INFO: renamed from: c */
    private ScheduledExecutorService f22205c;

    /* JADX INFO: renamed from: io.grpc.internal.L0$a */
    class a implements e {
        a() {
        }

        @Override // io.grpc.internal.C5745L0.e
        /* JADX INFO: renamed from: a */
        public ScheduledExecutorService mo25641a() {
            return Executors.newSingleThreadScheduledExecutor(AbstractC5757S.m25672j("grpc-shared-destroyer-%d", true));
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.L0$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f22206a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ d f22207b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f22208c;

        b(c cVar, d dVar, Object obj) {
            this.f22206a = cVar;
            this.f22207b = dVar;
            this.f22208c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C5745L0.this) {
                try {
                    if (this.f22206a.f22211b == 0) {
                        try {
                            this.f22207b.mo3239b(this.f22208c);
                            C5745L0.this.f22203a.remove(this.f22207b);
                            if (C5745L0.this.f22203a.isEmpty()) {
                                C5745L0.this.f22205c.shutdown();
                                C5745L0.this.f22205c = null;
                            }
                        } catch (Throwable th) {
                            C5745L0.this.f22203a.remove(this.f22207b);
                            if (C5745L0.this.f22203a.isEmpty()) {
                                C5745L0.this.f22205c.shutdown();
                                C5745L0.this.f22205c = null;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.L0$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        final Object f22210a;

        /* JADX INFO: renamed from: b */
        int f22211b;

        /* JADX INFO: renamed from: c */
        ScheduledFuture f22212c;

        c(Object obj) {
            this.f22210a = obj;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.L0$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        Object mo3238a();

        /* JADX INFO: renamed from: b */
        void mo3239b(Object obj);
    }

    /* JADX INFO: renamed from: io.grpc.internal.L0$e */
    interface e {
        /* JADX INFO: renamed from: a */
        ScheduledExecutorService mo25641a();
    }

    C5745L0(e eVar) {
        this.f22204b = eVar;
    }

    /* JADX INFO: renamed from: d */
    public static Object m25637d(d dVar) {
        return f22202d.m25639e(dVar);
    }

    /* JADX INFO: renamed from: f */
    public static Object m25638f(d dVar, Object obj) {
        return f22202d.m25640g(dVar, obj);
    }

    /* JADX INFO: renamed from: e */
    synchronized Object m25639e(d dVar) {
        c cVar;
        try {
            cVar = (c) this.f22203a.get(dVar);
            if (cVar == null) {
                cVar = new c(dVar.mo3238a());
                this.f22203a.put(dVar, cVar);
            }
            ScheduledFuture scheduledFuture = cVar.f22212c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                cVar.f22212c = null;
            }
            cVar.f22211b++;
        } catch (Throwable th) {
            throw th;
        }
        return cVar.f22210a;
    }

    /* JADX INFO: renamed from: g */
    synchronized Object m25640g(d dVar, Object obj) {
        try {
            c cVar = (c) this.f22203a.get(dVar);
            if (cVar == null) {
                throw new IllegalArgumentException("No cached instance found for " + dVar);
            }
            AbstractC1209m.m5293e(obj == cVar.f22210a, "Releasing the wrong instance");
            AbstractC1209m.m5309u(cVar.f22211b > 0, "Refcount has already reached zero");
            int i7 = cVar.f22211b - 1;
            cVar.f22211b = i7;
            if (i7 == 0) {
                AbstractC1209m.m5309u(cVar.f22212c == null, "Destroy task already scheduled");
                if (this.f22205c == null) {
                    this.f22205c = this.f22204b.mo25641a();
                }
                cVar.f22212c = this.f22205c.schedule(new RunnableC5779e0(new b(cVar, dVar, obj)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return null;
    }
}

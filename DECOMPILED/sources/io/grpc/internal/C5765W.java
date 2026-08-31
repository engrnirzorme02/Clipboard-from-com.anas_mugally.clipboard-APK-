package io.grpc.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p122P3.C1212p;

/* JADX INFO: renamed from: io.grpc.internal.W */
/* JADX INFO: loaded from: classes.dex */
public class C5765W {

    /* JADX INFO: renamed from: g */
    private static final Logger f22320g = Logger.getLogger(C5765W.class.getName());

    /* JADX INFO: renamed from: a */
    private final long f22321a;

    /* JADX INFO: renamed from: b */
    private final C1212p f22322b;

    /* JADX INFO: renamed from: c */
    private Map f22323c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    private boolean f22324d;

    /* JADX INFO: renamed from: e */
    private Throwable f22325e;

    /* JADX INFO: renamed from: f */
    private long f22326f;

    /* JADX INFO: renamed from: io.grpc.internal.W$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5808t.a f22327a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f22328b;

        a(InterfaceC5808t.a aVar, long j7) {
            this.f22327a = aVar;
            this.f22328b = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22327a.mo25909b(this.f22328b);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.W$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5808t.a f22329a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Throwable f22330b;

        b(InterfaceC5808t.a aVar, Throwable th) {
            this.f22329a = aVar;
            this.f22330b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22329a.mo25908a(this.f22330b);
        }
    }

    public C5765W(long j7, C1212p c1212p) {
        this.f22321a = j7;
        this.f22322b = c1212p;
    }

    /* JADX INFO: renamed from: b */
    private static Runnable m25751b(InterfaceC5808t.a aVar, long j7) {
        return new a(aVar, j7);
    }

    /* JADX INFO: renamed from: c */
    private static Runnable m25752c(InterfaceC5808t.a aVar, Throwable th) {
        return new b(aVar, th);
    }

    /* JADX INFO: renamed from: e */
    private static void m25753e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f22320g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m25754g(InterfaceC5808t.a aVar, Executor executor, Throwable th) {
        m25753e(executor, m25752c(aVar, th));
    }

    /* JADX INFO: renamed from: a */
    public void m25755a(InterfaceC5808t.a aVar, Executor executor) {
        synchronized (this) {
            try {
                if (!this.f22324d) {
                    this.f22323c.put(aVar, executor);
                } else {
                    Throwable th = this.f22325e;
                    m25753e(executor, th != null ? m25752c(aVar, th) : m25751b(aVar, this.f22326f));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m25756d() {
        synchronized (this) {
            try {
                if (this.f22324d) {
                    return false;
                }
                this.f22324d = true;
                long jM5320d = this.f22322b.m5320d(TimeUnit.NANOSECONDS);
                this.f22326f = jM5320d;
                Map map = this.f22323c;
                this.f22323c = null;
                for (Map.Entry entry : map.entrySet()) {
                    m25753e((Executor) entry.getValue(), m25751b((InterfaceC5808t.a) entry.getKey(), jM5320d));
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m25757f(Throwable th) {
        synchronized (this) {
            try {
                if (this.f22324d) {
                    return;
                }
                this.f22324d = true;
                this.f22325e = th;
                Map map = this.f22323c;
                this.f22323c = null;
                for (Map.Entry entry : map.entrySet()) {
                    m25754g((InterfaceC5808t.a) entry.getKey(), (Executor) entry.getValue(), th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public long m25758h() {
        return this.f22321a;
    }
}

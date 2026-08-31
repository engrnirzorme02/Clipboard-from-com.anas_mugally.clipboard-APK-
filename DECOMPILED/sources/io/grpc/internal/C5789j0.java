package io.grpc.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p063H5.AbstractC0526V;

/* JADX INFO: renamed from: io.grpc.internal.j0 */
/* JADX INFO: loaded from: classes.dex */
final class C5789j0 extends AbstractC5746M {

    /* JADX INFO: renamed from: c */
    private static final ReferenceQueue f22701c = new ReferenceQueue();

    /* JADX INFO: renamed from: d */
    private static final ConcurrentMap f22702d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    private static final Logger f22703e = Logger.getLogger(C5789j0.class.getName());

    /* JADX INFO: renamed from: b */
    private final a f22704b;

    /* JADX INFO: renamed from: io.grpc.internal.j0$a */
    static final class a extends WeakReference {

        /* JADX INFO: renamed from: f */
        private static final boolean f22705f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* JADX INFO: renamed from: g */
        private static final RuntimeException f22706g = m26046e();

        /* JADX INFO: renamed from: a */
        private final ReferenceQueue f22707a;

        /* JADX INFO: renamed from: b */
        private final ConcurrentMap f22708b;

        /* JADX INFO: renamed from: c */
        private final String f22709c;

        /* JADX INFO: renamed from: d */
        private final Reference f22710d;

        /* JADX INFO: renamed from: e */
        private final AtomicBoolean f22711e;

        a(C5789j0 c5789j0, AbstractC0526V abstractC0526V, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
            super(c5789j0, referenceQueue);
            this.f22711e = new AtomicBoolean();
            this.f22710d = new SoftReference(f22705f ? new RuntimeException("ManagedChannel allocation site") : f22706g);
            this.f22709c = abstractC0526V.toString();
            this.f22707a = referenceQueue;
            this.f22708b = concurrentMap;
            concurrentMap.put(this, this);
            m26043b(referenceQueue);
        }

        /* JADX INFO: renamed from: b */
        static int m26043b(ReferenceQueue referenceQueue) {
            int i7 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i7;
                }
                RuntimeException runtimeException = (RuntimeException) aVar.f22710d.get();
                aVar.m26044c();
                if (!aVar.f22711e.get()) {
                    i7++;
                    Level level = Level.SEVERE;
                    if (C5789j0.f22703e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(C5789j0.f22703e.getName());
                        logRecord.setParameters(new Object[]{aVar.f22709c});
                        logRecord.setThrown(runtimeException);
                        C5789j0.f22703e.log(logRecord);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: c */
        private void m26044c() {
            super.clear();
            this.f22708b.remove(this);
            this.f22710d.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public void m26045d() {
            if (this.f22711e.getAndSet(true)) {
                return;
            }
            clear();
        }

        /* JADX INFO: renamed from: e */
        private static RuntimeException m26046e() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            m26044c();
            m26043b(this.f22707a);
        }
    }

    C5789j0(AbstractC0526V abstractC0526V) {
        this(abstractC0526V, f22701c, f22702d);
    }

    @Override // io.grpc.internal.AbstractC5746M, p063H5.AbstractC0526V
    /* JADX INFO: renamed from: m */
    public AbstractC0526V mo2248m() {
        this.f22704b.m26045d();
        return super.mo2248m();
    }

    C5789j0(AbstractC0526V abstractC0526V, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(abstractC0526V);
        this.f22704b = new a(this, abstractC0526V, referenceQueue, concurrentMap);
    }
}

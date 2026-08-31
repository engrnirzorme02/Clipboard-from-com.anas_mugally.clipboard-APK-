package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Address;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import p145S5.C1444v;

/* JADX INFO: loaded from: classes.dex */
public final class RealConnectionPool {

    /* JADX INFO: renamed from: f */
    public static final Companion f25697f = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final int f25698a;

    /* JADX INFO: renamed from: b */
    private final long f25699b;

    /* JADX INFO: renamed from: c */
    private final TaskQueue f25700c;

    /* JADX INFO: renamed from: d */
    private final RealConnectionPool$cleanupTask$1 f25701d;

    /* JADX INFO: renamed from: e */
    private final ConcurrentLinkedQueue f25702e;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i7, long j7, TimeUnit timeUnit) {
        AbstractC6118n.m27187e(taskRunner, "taskRunner");
        AbstractC6118n.m27187e(timeUnit, "timeUnit");
        this.f25698a = i7;
        this.f25699b = timeUnit.toNanos(j7);
        this.f25700c = taskRunner.m28916i();
        final String str = Util.f25485i + " ConnectionPool";
        this.f25701d = new Task(str) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            /* JADX INFO: renamed from: f */
            public long mo28863f() {
                return this.f25703e.m29023b(System.nanoTime());
            }
        };
        this.f25702e = new ConcurrentLinkedQueue();
        if (j7 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j7).toString());
    }

    /* JADX INFO: renamed from: d */
    private final int m29021d(RealConnection realConnection, long j7) {
        if (Util.f25484h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List listM29006n = realConnection.m29006n();
        int i7 = 0;
        while (i7 < listM29006n.size()) {
            Reference reference = (Reference) listM29006n.get(i7);
            if (reference.get() != null) {
                i7++;
            } else {
                AbstractC6118n.m27185c(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                Platform.f26006a.m29391g().mo29354m("A connection to " + realConnection.m28996A().m28714a().m28311l() + " was leaked. Did you forget to close a response body?", ((RealCall.CallReference) reference).m28984a());
                listM29006n.remove(i7);
                realConnection.m28998D(true);
                if (listM29006n.isEmpty()) {
                    realConnection.m28997C(j7 - this.f25699b);
                    return 0;
                }
            }
        }
        return listM29006n.size();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0033 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final boolean m29022a(Address address, RealCall call, List list, boolean z7) {
        AbstractC6118n.m27187e(address, "address");
        AbstractC6118n.m27187e(call, "call");
        for (RealConnection connection : this.f25702e) {
            AbstractC6118n.m27186d(connection, "connection");
            synchronized (connection) {
                if (z7) {
                    try {
                        if (connection.m29014v()) {
                            if (connection.m29012t(address, list)) {
                                call.m28964c(connection);
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (connection.m29012t(address, list)) {
                    call.m28964c(connection);
                    return true;
                }
                C1444v c1444v = C1444v.f4971a;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final long m29023b(long j7) {
        int i7 = 0;
        long j8 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i8 = 0;
        for (RealConnection connection : this.f25702e) {
            AbstractC6118n.m27186d(connection, "connection");
            synchronized (connection) {
                if (m29021d(connection, j7) > 0) {
                    i8++;
                } else {
                    i7++;
                    long jM29007o = j7 - connection.m29007o();
                    if (jM29007o > j8) {
                        realConnection = connection;
                        j8 = jM29007o;
                    }
                    C1444v c1444v = C1444v.f4971a;
                }
            }
        }
        long j9 = this.f25699b;
        if (j8 < j9 && i7 <= this.f25698a) {
            if (i7 > 0) {
                return j9 - j8;
            }
            if (i8 > 0) {
                return j9;
            }
            return -1L;
        }
        AbstractC6118n.m27184b(realConnection);
        synchronized (realConnection) {
            if (!realConnection.m29006n().isEmpty()) {
                return 0L;
            }
            if (realConnection.m29007o() + j8 != j7) {
                return 0L;
            }
            realConnection.m28998D(true);
            this.f25702e.remove(realConnection);
            Util.m28774n(realConnection.m28999E());
            if (this.f25702e.isEmpty()) {
                this.f25700c.m28894a();
            }
            return 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m29024c(RealConnection connection) {
        AbstractC6118n.m27187e(connection, "connection");
        if (Util.f25484h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.m29008p() && this.f25698a != 0) {
            TaskQueue.m28893j(this.f25700c, this.f25701d, 0L, 2, null);
            return false;
        }
        connection.m28998D(true);
        this.f25702e.remove(connection);
        if (this.f25702e.isEmpty()) {
            this.f25700c.m28894a();
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m29025e(RealConnection connection) {
        AbstractC6118n.m27187e(connection, "connection");
        if (!Util.f25484h || Thread.holdsLock(connection)) {
            this.f25702e.add(connection);
            TaskQueue.m28893j(this.f25700c, this.f25701d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}

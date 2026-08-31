package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionPool {

    /* JADX INFO: renamed from: a */
    private final RealConnectionPool f25212a;

    public ConnectionPool(RealConnectionPool delegate) {
        AbstractC6118n.m27187e(delegate, "delegate");
        this.f25212a = delegate;
    }

    /* JADX INFO: renamed from: a */
    public final RealConnectionPool m28391a() {
        return this.f25212a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i7, long j7, TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.f25606i, i7, j7, timeUnit));
        AbstractC6118n.m27187e(timeUnit, "timeUnit");
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}

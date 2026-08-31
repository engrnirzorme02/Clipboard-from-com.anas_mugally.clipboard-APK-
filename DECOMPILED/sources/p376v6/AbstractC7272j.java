package p376v6;

import java.util.concurrent.TimeUnit;
import p278j6.AbstractC5905g;
import p360t6.AbstractC7105E;
import p360t6.AbstractC7107G;

/* JADX INFO: renamed from: v6.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7272j {

    /* JADX INFO: renamed from: a */
    public static final String f29087a = AbstractC7105E.m31390e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b */
    public static final long f29088b = AbstractC7107G.m31401f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c */
    public static final int f29089c = AbstractC7107G.m31400e("kotlinx.coroutines.scheduler.core.pool.size", AbstractC5905g.m26654b(AbstractC7105E.m31386a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d */
    public static final int f29090d = AbstractC7107G.m31400e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e */
    public static final long f29091e = TimeUnit.SECONDS.toNanos(AbstractC7107G.m31401f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f */
    public static AbstractC7269g f29092f = C7267e.f29078a;

    /* JADX INFO: renamed from: b */
    public static final AbstractRunnableC7270h m32240b(Runnable runnable, long j7, boolean z7) {
        return new C7271i(runnable, j7, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final String m32241c(boolean z7) {
        return z7 ? "Blocking" : "Non-blocking";
    }
}

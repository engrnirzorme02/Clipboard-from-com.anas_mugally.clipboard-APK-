package p392x6;

import p360t6.AbstractC7107G;
import p360t6.C7104D;

/* JADX INFO: renamed from: x6.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7428j {

    /* JADX INFO: renamed from: a */
    private static final int f29749a = AbstractC7107G.m31400e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b */
    private static final C7104D f29750b = new C7104D("PERMIT");

    /* JADX INFO: renamed from: c */
    private static final C7104D f29751c = new C7104D("TAKEN");

    /* JADX INFO: renamed from: d */
    private static final C7104D f29752d = new C7104D("BROKEN");

    /* JADX INFO: renamed from: e */
    private static final C7104D f29753e = new C7104D("CANCELLED");

    /* JADX INFO: renamed from: f */
    private static final int f29754f = AbstractC7107G.m31400e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C7429k m32904h(long j7, C7429k c7429k) {
        return new C7429k(j7, c7429k, 0);
    }
}

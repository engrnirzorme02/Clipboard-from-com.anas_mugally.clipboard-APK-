package p318o6;

import p360t6.C7104D;

/* JADX INFO: renamed from: o6.m0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6677m0 {

    /* JADX INFO: renamed from: a */
    private static final C7104D f24979a = new C7104D("REMOVED_TASK");

    /* JADX INFO: renamed from: b */
    private static final C7104D f24980b = new C7104D("CLOSED_EMPTY");

    /* JADX INFO: renamed from: c */
    public static final long m28233c(long j7) {
        if (j7 <= 0) {
            return 0L;
        }
        if (j7 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j7 * 1000000;
    }
}

package p164V3;

import android.os.SystemClock;

/* JADX INFO: renamed from: V3.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1773r {
    /* JADX INFO: renamed from: a */
    public static AbstractC1773r m7433a(long j7, long j8, long j9) {
        return new C1756a(j7, j8, j9);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC1773r m7434e() {
        return m7433a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo7382b();

    /* JADX INFO: renamed from: c */
    public abstract long mo7383c();

    /* JADX INFO: renamed from: d */
    public abstract long mo7384d();
}

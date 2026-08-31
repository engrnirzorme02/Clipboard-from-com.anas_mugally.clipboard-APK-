package p183Y1;

import android.os.SystemClock;

/* JADX INFO: renamed from: Y1.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2018g {

    /* JADX INFO: renamed from: a */
    private static final double f6699a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: a */
    public static double m8392a(long j7) {
        return (m8393b() - j7) * f6699a;
    }

    /* JADX INFO: renamed from: b */
    public static long m8393b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}

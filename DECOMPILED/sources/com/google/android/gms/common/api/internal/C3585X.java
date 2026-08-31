package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3686c;
import com.google.android.gms.common.internal.C3692f;
import com.google.android.gms.common.internal.C3712p;
import com.google.android.gms.common.internal.C3720t;
import com.google.android.gms.common.internal.C3722u;
import com.google.android.gms.common.util.AbstractC3747b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.X */
/* JADX INFO: loaded from: classes.dex */
final class C3585X implements OnCompleteListener {

    /* JADX INFO: renamed from: a */
    private final C3600g f14606a;

    /* JADX INFO: renamed from: b */
    private final int f14607b;

    /* JADX INFO: renamed from: c */
    private final C3590b f14608c;

    /* JADX INFO: renamed from: d */
    private final long f14609d;

    /* JADX INFO: renamed from: e */
    private final long f14610e;

    C3585X(C3600g c3600g, int i7, C3590b c3590b, long j7, long j8, String str, String str2) {
        this.f14606a = c3600g;
        this.f14607b = i7;
        this.f14608c = c3590b;
        this.f14609d = j7;
        this.f14610e = j8;
    }

    /* JADX INFO: renamed from: a */
    static C3585X m17852a(C3600g c3600g, int i7, C3590b c3590b) {
        boolean zM18095W;
        if (!c3600g.m17898e()) {
            return null;
        }
        C3722u c3722uM18090a = C3720t.m18089b().m18090a();
        if (c3722uM18090a == null) {
            zM18095W = true;
        } else {
            if (!c3722uM18090a.m18094V()) {
                return null;
            }
            zM18095W = c3722uM18090a.m18095W();
            C3574L c3574lM17901t = c3600g.m17901t(c3590b);
            if (c3574lM17901t != null) {
                if (!(c3574lM17901t.m17834s() instanceof AbstractC3686c)) {
                    return null;
                }
                AbstractC3686c abstractC3686c = (AbstractC3686c) c3574lM17901t.m17834s();
                if (abstractC3686c.hasConnectionInfo() && !abstractC3686c.isConnecting()) {
                    C3692f c3692fM17853b = m17853b(c3574lM17901t, abstractC3686c, i7);
                    if (c3692fM17853b == null) {
                        return null;
                    }
                    c3574lM17901t.m17824D();
                    zM18095W = c3692fM17853b.m18025X();
                }
            }
        }
        return new C3585X(c3600g, i7, c3590b, zM18095W ? System.currentTimeMillis() : 0L, zM18095W ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    /* JADX INFO: renamed from: b */
    private static C3692f m17853b(C3574L c3574l, AbstractC3686c abstractC3686c, int i7) {
        int[] iArrM18022U;
        int[] iArrM18023V;
        C3692f telemetryConfiguration = abstractC3686c.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.m18024W() || ((iArrM18022U = telemetryConfiguration.m18022U()) != null ? !AbstractC3747b.m18144a(iArrM18022U, i7) : !((iArrM18023V = telemetryConfiguration.m18023V()) == null || !AbstractC3747b.m18144a(iArrM18023V, i7))) || c3574l.m17833q() >= telemetryConfiguration.m18021T()) {
            return null;
        }
        return telemetryConfiguration;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009a A[PHI: r9
      0x009a: PHI (r9v3 int) = (r9v0 int), (r9v2 int) binds: [B:38:0x0098, B:44:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        C3574L c3574lM17901t;
        int iM18096X;
        int i7;
        int i8;
        int iM7596T;
        long j7;
        long j8;
        if (this.f14606a.m17898e()) {
            C3722u c3722uM18090a = C3720t.m18089b().m18090a();
            if ((c3722uM18090a == null || c3722uM18090a.m18094V()) && (c3574lM17901t = this.f14606a.m17901t(this.f14608c)) != null && (c3574lM17901t.m17834s() instanceof AbstractC3686c)) {
                AbstractC3686c abstractC3686c = (AbstractC3686c) c3574lM17901t.m17834s();
                int i9 = 0;
                boolean zM18095W = this.f14609d > 0;
                int gCoreServiceId = abstractC3686c.getGCoreServiceId();
                int iM17744U = 100;
                if (c3722uM18090a != null) {
                    zM18095W &= c3722uM18090a.m18095W();
                    int iM18092T = c3722uM18090a.m18092T();
                    int iM18093U = c3722uM18090a.m18093U();
                    iM18096X = c3722uM18090a.m18096X();
                    if (abstractC3686c.hasConnectionInfo() && !abstractC3686c.isConnecting()) {
                        C3692f c3692fM17853b = m17853b(c3574lM17901t, abstractC3686c, this.f14607b);
                        if (c3692fM17853b == null) {
                            return;
                        }
                        boolean z7 = c3692fM17853b.m18025X() && this.f14609d > 0;
                        iM18093U = c3692fM17853b.m18021T();
                        zM18095W = z7;
                    }
                    i8 = iM18092T;
                    i7 = iM18093U;
                } else {
                    iM18096X = 0;
                    i7 = 100;
                    i8 = 5000;
                }
                C3600g c3600g = this.f14606a;
                int iElapsedRealtime = -1;
                if (task.isSuccessful()) {
                    iM7596T = 0;
                } else if (task.isCanceled()) {
                    i9 = iM17744U;
                    iM7596T = -1;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof C3554b) {
                        Status status = ((C3554b) exception).getStatus();
                        iM17744U = status.m17744U();
                        C1837b c1837bM17743T = status.m17743T();
                        if (c1837bM17743T == null) {
                            i9 = iM17744U;
                            iM7596T = -1;
                        } else {
                            iM7596T = c1837bM17743T.m7596T();
                            i9 = iM17744U;
                        }
                    } else {
                        i9 = 101;
                        iM7596T = -1;
                    }
                }
                if (zM18095W) {
                    long j9 = this.f14609d;
                    long j10 = this.f14610e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j10);
                    j8 = jCurrentTimeMillis;
                    j7 = j9;
                } else {
                    j7 = 0;
                    j8 = 0;
                }
                c3600g.m17892E(new C3712p(this.f14607b, i9, iM7596T, j7, j8, null, null, gCoreServiceId, iElapsedRealtime), iM18096X, i8, i7);
            }
        }
    }
}

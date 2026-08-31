package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzaps {
    public static final boolean zza = zzapt.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzaps() {
    }

    protected final void finalize() {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzapt.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j7) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzapr(str, j7, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzapr> list = this.zzb;
        long j7 = list.size() == 0 ? 0L : ((zzapr) list.get(list.size() - 1)).zzc - ((zzapr) list.get(0)).zzc;
        if (j7 > 0) {
            long j8 = ((zzapr) list.get(0)).zzc;
            zzapt.zzb("(%-4d ms) %s", Long.valueOf(j7), str);
            for (zzapr zzaprVar : list) {
                long j9 = zzaprVar.zzc;
                zzapt.zzb("(+%-4d) [%2d] %s", Long.valueOf(j9 - j8), Long.valueOf(zzaprVar.zzb), zzaprVar.zza);
                j8 = j9;
            }
        }
    }
}

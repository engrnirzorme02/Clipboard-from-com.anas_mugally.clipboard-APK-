package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfnu {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfnt zzd = null;

    public zzfnu() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfnt zzfntVar = (zzfnt) this.zzc.poll();
        this.zzd = zzfntVar;
        if (zzfntVar != null) {
            zzfntVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfnt zzfntVar) {
        zzfntVar.zzb(this);
        this.zzc.add(zzfntVar);
        if (this.zzd == null) {
            zzc();
        }
    }

    public final void zzb(zzfnt zzfntVar) {
        this.zzd = null;
        zzc();
    }
}

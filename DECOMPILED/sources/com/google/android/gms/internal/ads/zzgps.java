package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes2.dex */
final class zzgps extends zzgok implements RunnableFuture {
    private volatile zzgpa zza;

    zzgps(zzgoa zzgoaVar) {
        this.zza = new zzgpq(this, zzgoaVar);
    }

    static zzgps zze(Runnable runnable, Object obj) {
        return new zzgps(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgpa zzgpaVar = this.zza;
        if (zzgpaVar != null) {
            zzgpaVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final void zzc() {
        zzgpa zzgpaVar;
        if (zzj() && (zzgpaVar = this.zza) != null) {
            zzgpaVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final String zzd() {
        zzgpa zzgpaVar = this.zza;
        if (zzgpaVar == null) {
            return super.zzd();
        }
        String string = zzgpaVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 7);
        sb.append("task=[");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }

    zzgps(Callable callable) {
        this.zza = new zzgpr(this, callable);
    }
}

package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    zzc(zzd zzdVar, Task task) {
        this.zzb = zzdVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.isCanceled()) {
            this.zzb.zzc.zzc();
            return;
        }
        try {
            this.zzb.zzc.zzb(this.zzb.zzb.then(this.zza));
        } catch (RuntimeExecutionException e7) {
            if (e7.getCause() instanceof Exception) {
                this.zzb.zzc.zza((Exception) e7.getCause());
            } else {
                this.zzb.zzc.zza(e7);
            }
        } catch (Exception e8) {
            this.zzb.zzc.zza(e8);
        }
    }
}

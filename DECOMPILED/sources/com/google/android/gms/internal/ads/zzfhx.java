package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfhx implements zzgoq {
    final /* synthetic */ zzfib zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ boolean zzc;

    zzfhx(zzfib zzfibVar, zzfhr zzfhrVar, boolean z7) {
        this.zza = zzfibVar;
        this.zzb = zzfhrVar;
        this.zzc = z7;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfhr zzfhrVar = this.zzb;
        if (zzfhrVar.zzb()) {
            zzfib zzfibVar = this.zza;
            zzfhrVar.zzj(th);
            zzfhrVar.zzd(false);
            zzfibVar.zza(zzfhrVar);
            if (this.zzc) {
                zzfibVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
        zzfhr zzfhrVar = this.zzb;
        zzfhrVar.zzd(true);
        zzfib zzfibVar = this.zza;
        zzfibVar.zza(zzfhrVar);
        if (this.zzc) {
            zzfibVar.zzh();
        }
    }
}

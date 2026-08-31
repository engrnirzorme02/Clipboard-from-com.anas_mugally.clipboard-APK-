package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfhy implements zzgoq {
    final /* synthetic */ zzfib zza;
    final /* synthetic */ zzfhr zzb;

    zzfhy(zzfib zzfibVar, zzfhr zzfhrVar) {
        this.zza = zzfibVar;
        this.zzb = zzfhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfhr zzfhrVar = this.zzb;
        zzfhrVar.zzj(th);
        zzfhrVar.zzd(false);
        this.zza.zza(zzfhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzauj implements zzfpf {
    final /* synthetic */ zzfoh zza;

    zzauj(zzfoh zzfohVar) {
        this.zza = zzfohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zza(int i7, long j7) {
        this.zza.zzb(i7, System.currentTimeMillis() - j7);
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final void zzb(int i7, long j7, String str) {
        this.zza.zzf(i7, System.currentTimeMillis() - j7, str);
    }
}

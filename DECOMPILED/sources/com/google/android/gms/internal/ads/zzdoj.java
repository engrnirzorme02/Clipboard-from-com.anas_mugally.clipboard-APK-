package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdoj implements zzbkd {
    private final zzcwz zza;
    private final zzbvt zzb;
    private final String zzc;
    private final String zzd;

    public zzdoj(zzcwz zzcwzVar, zzfcj zzfcjVar) {
        this.zza = zzcwzVar;
        this.zzb = zzfcjVar.zzl;
        this.zzc = zzfcjVar.zzj;
        this.zzd = zzfcjVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzb(zzbvt zzbvtVar) {
        int i7;
        String str;
        zzbvt zzbvtVar2 = this.zzb;
        if (zzbvtVar2 != null) {
            zzbvtVar = zzbvtVar2;
        }
        if (zzbvtVar != null) {
            str = zzbvtVar.zza;
            i7 = zzbvtVar.zzb;
        } else {
            i7 = 1;
            str = "";
        }
        this.zza.zze(new zzbve(str, i7), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zzc() {
        this.zza.zzf();
    }
}

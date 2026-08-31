package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzciv implements zzdtx {
    private final Long zza;
    private final String zzb;
    private final zzcih zzc;
    private final zzcix zzd;

    zzciv(zzcih zzcihVar, zzcix zzcixVar, Long l7, String str) {
        this.zzc = zzcihVar;
        this.zzd = zzcixVar;
        this.zza = l7;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdtx
    public final zzdug zza() {
        long jLongValue = this.zza.longValue();
        zzcix zzcixVar = this.zzd;
        return zzduh.zza(jLongValue, zzcixVar.zzd(), zzcixVar.zza(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdtx
    public final zzduk zzb() {
        long jLongValue = this.zza.longValue();
        zzcix zzcixVar = this.zzd;
        return zzdul.zza(jLongValue, zzcixVar.zzd(), zzcixVar.zza(), this.zzc, this.zzb);
    }
}

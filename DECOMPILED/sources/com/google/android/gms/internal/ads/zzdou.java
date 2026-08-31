package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdou implements zzhpx {
    private final zzhqg zza;

    private zzdou(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdou zza(zzhqg zzhqgVar) {
        return new zzdou(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbn.zza.EnumC7681zza enumC7681zza = ((zzcvj) this.zza).zza().zzp.zza == 3 ? zzbbn.zza.EnumC7681zza.REWARDED_INTERSTITIAL : zzbbn.zza.EnumC7681zza.REWARD_BASED_VIDEO_AD;
        zzhqf.zzb(enumC7681zza);
        return enumC7681zza;
    }
}

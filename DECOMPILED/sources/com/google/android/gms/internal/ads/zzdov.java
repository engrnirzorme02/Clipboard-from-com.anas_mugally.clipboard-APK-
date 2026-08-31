package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdov implements zzhpx {
    private final zzhqg zza;

    private zzdov(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdov zza(zzhqg zzhqgVar) {
        return new zzdov(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzcvj) this.zza).zza().zzp.zza == 3 ? "rewarded_interstitial" : "rewarded";
    }
}

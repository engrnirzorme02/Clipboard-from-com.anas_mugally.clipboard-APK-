package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdhv implements zzhpx {
    private final zzdhq zza;

    private zzdhv(zzdhq zzdhqVar) {
        this.zza = zzdhqVar;
    }

    public static zzdhv zzc(zzdhq zzdhqVar) {
        return new zzdhv(zzdhqVar);
    }

    public static zzdnx zzd(zzdhq zzdhqVar) {
        zzdnx zzdnxVarZzd = zzdhqVar.zzd();
        zzhqf.zzb(zzdnxVarZzd);
        return zzdnxVarZzd;
    }

    public final zzdnx zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpr implements zzhpx {
    private final zzhqg zza;

    private zzdpr(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdpr zzc(zzhqg zzhqgVar) {
        return new zzdpr(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdpq zzb() {
        return new zzdpq((zzcek) this.zza.zzb());
    }
}

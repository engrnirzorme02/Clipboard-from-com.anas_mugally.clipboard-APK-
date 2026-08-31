package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzckh implements zzhpx {
    private final zzhqg zza;

    private zzckh(zzcjy zzcjyVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzckh zzc(zzcjy zzcjyVar, zzhqg zzhqgVar) {
        return new zzckh(zzcjyVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfdy zzb() {
        zzfdy zzfdyVarZza = zzfdy.zza(((zzchd) this.zza).zza());
        zzhqf.zzb(zzfdyVarZza);
        return zzfdyVarZza;
    }
}

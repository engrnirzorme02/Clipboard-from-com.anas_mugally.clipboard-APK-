package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhpv implements zzhpx {
    private zzhqg zza;

    public static void zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        zzhpv zzhpvVar = (zzhpv) zzhqgVar;
        if (zzhpvVar.zza != null) {
            throw new IllegalStateException();
        }
        zzhpvVar.zza = zzhqgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final Object zzb() {
        zzhqg zzhqgVar = this.zza;
        if (zzhqgVar != null) {
            return zzhqgVar.zzb();
        }
        throw new IllegalStateException();
    }
}

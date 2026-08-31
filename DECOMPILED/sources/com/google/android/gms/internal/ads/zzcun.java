package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcun implements zzhpx {
    private final zzhqg zza;

    private zzcun(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzcun zza(zzhqg zzhqgVar) {
        return new zzcun(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcum(((zzcrm) this.zza).zza());
    }
}

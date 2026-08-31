package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzclp implements zzhpx {
    private final zzhqg zza;

    private zzclp(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzclp zza(zzhqg zzhqgVar) {
        return new zzclp(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzclo(((zzchd) this.zza).zza());
    }
}

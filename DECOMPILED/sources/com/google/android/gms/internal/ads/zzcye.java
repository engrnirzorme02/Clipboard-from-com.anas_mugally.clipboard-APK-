package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcye implements zzhpx {
    private final zzhqg zza;

    private zzcye(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzcye zza(zzhqg zzhqgVar) {
        return new zzcye(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcyd(((zzhqj) this.zza).zzb());
    }
}

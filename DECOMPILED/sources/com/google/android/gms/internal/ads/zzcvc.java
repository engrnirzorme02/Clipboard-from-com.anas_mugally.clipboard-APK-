package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvc implements zzhpx {
    private final zzcvb zza;
    private final zzhqg zzb;

    private zzcvc(zzcvb zzcvbVar, zzhqg zzhqgVar) {
        this.zza = zzcvbVar;
        this.zzb = zzhqgVar;
    }

    public static zzcvc zza(zzcvb zzcvbVar, zzhqg zzhqgVar) {
        return new zzcvc(zzcvbVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return this.zza.zzg((String) this.zzb.zzb());
    }
}

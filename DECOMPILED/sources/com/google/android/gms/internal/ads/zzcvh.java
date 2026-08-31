package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvh implements zzhpx {
    private final zzcvb zza;

    private zzcvh(zzcvb zzcvbVar) {
        this.zza = zzcvbVar;
    }

    public static zzcvh zza(zzcvb zzcvbVar) {
        return new zzcvh(zzcvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Integer.valueOf(this.zza.zzh());
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcqn implements zzhpx {
    private final zzcqk zza;

    private zzcqn(zzcqk zzcqkVar) {
        this.zza = zzcqkVar;
    }

    public static zzcqn zzc(zzcqk zzcqkVar) {
        return new zzcqn(zzcqkVar);
    }

    public static zzcyt zzd(zzcqk zzcqkVar) {
        return zzcqkVar.zza();
    }

    public final zzcyt zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}

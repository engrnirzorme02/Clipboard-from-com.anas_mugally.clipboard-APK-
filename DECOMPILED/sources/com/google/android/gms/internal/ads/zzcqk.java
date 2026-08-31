package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcqk {
    private final zzcyt zza;
    private final zzday zzb;

    public zzcqk(zzcyt zzcytVar, zzday zzdayVar) {
        this.zza = zzcytVar;
        this.zzb = zzdayVar;
    }

    public final zzcyt zza() {
        return this.zza;
    }

    final zzddr zzb() {
        zzday zzdayVar = this.zzb;
        return zzdayVar != null ? new zzddr(zzdayVar, zzbzh.zzg) : new zzddr(new zzcqj(this), zzbzh.zzg);
    }

    final zzday zzc() {
        return this.zzb;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzxv {
    public final int zza;
    public final zzbf zzb;
    public final int zzc;
    public final zzu zzd;

    public zzxv(int i7, zzbf zzbfVar, int i8) {
        this.zza = i7;
        this.zzb = zzbfVar;
        this.zzc = i8;
        this.zzd = zzbfVar.zza(i8);
    }

    public abstract int zza();

    public abstract boolean zzc(zzxv zzxvVar);
}

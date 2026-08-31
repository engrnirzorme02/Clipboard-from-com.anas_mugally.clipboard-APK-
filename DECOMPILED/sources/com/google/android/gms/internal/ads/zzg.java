package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg {
    private int zza;
    private int zzb;
    private int zzc;
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzg() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
        this.zze = -1;
        this.zzf = -1;
    }

    public final zzg zza(int i7) {
        this.zza = i7;
        return this;
    }

    public final zzg zzb(int i7) {
        this.zzb = i7;
        return this;
    }

    public final zzg zzc(int i7) {
        this.zzc = i7;
        return this;
    }

    public final zzg zzd(byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final zzg zze(int i7) {
        this.zze = i7;
        return this;
    }

    public final zzg zzf(int i7) {
        this.zzf = i7;
        return this;
    }

    public final zzh zzg() {
        return new zzh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }

    /* synthetic */ zzg(zzh zzhVar, byte[] bArr) {
        this.zza = zzhVar.zzb;
        this.zzb = zzhVar.zzc;
        this.zzc = zzhVar.zzd;
        this.zzd = zzhVar.zze;
        this.zze = zzhVar.zzf;
        this.zzf = zzhVar.zzg;
    }
}

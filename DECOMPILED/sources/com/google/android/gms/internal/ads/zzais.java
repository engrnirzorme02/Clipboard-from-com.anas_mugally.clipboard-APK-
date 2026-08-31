package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzais {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzu zzg;
    public final int zzh;
    public final long[] zzi;
    public final long[] zzj;
    public final int zzk;
    private final zzait[] zzl;

    public zzais(int i7, int i8, long j7, long j8, long j9, long j10, zzu zzuVar, int i9, zzait[] zzaitVarArr, int i10, long[] jArr, long[] jArr2) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = j7;
        this.zzd = j8;
        this.zze = j9;
        this.zzf = j10;
        this.zzg = zzuVar;
        this.zzh = i9;
        this.zzl = zzaitVarArr;
        this.zzk = i10;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final zzait zza(int i7) {
        return this.zzl[i7];
    }

    public final zzais zzb(zzu zzuVar) {
        return new zzais(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzuVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }
}

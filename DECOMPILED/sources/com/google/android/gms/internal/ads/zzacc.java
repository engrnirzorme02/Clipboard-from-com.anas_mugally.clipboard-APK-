package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacc {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    protected zzacc(long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.zza = j7;
        this.zzb = j8;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = j12;
        this.zzc = j13;
        this.zzh = zza(j8, 0L, j10, j11, j12, j13);
    }

    protected static long zza(long j7, long j8, long j9, long j10, long j11, long j12) {
        if (j10 + 1 >= j11 || 1 + j8 >= j9) {
            return j10;
        }
        long j13 = (long) ((j7 - j8) * ((j11 - j10) / (j9 - j8)));
        String str = zzeo.zza;
        return Math.max(j10, Math.min(((j10 + j13) - j12) - (j13 / 20), j11 - 1));
    }

    private final void zzi() {
        this.zzh = zza(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }

    final /* synthetic */ long zzb() {
        return this.zzf;
    }

    final /* synthetic */ long zzc() {
        return this.zzg;
    }

    final /* synthetic */ long zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zza;
    }

    final /* synthetic */ void zzf(long j7, long j8) {
        this.zzd = j7;
        this.zzf = j8;
        zzi();
    }

    final /* synthetic */ void zzg(long j7, long j8) {
        this.zze = j7;
        this.zzg = j8;
        zzi();
    }

    final /* synthetic */ long zzh() {
        return this.zzh;
    }
}

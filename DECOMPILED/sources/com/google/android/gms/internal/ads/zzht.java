package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzht {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    /* synthetic */ zzht(float f7, float f8, long j7, float f9, long j8, long j9, float f10, byte[] bArr) {
        this.zza = j8;
        this.zzb = j9;
    }

    private final void zzf() {
        long j7;
        long j8 = this.zzc;
        if (j8 != -9223372036854775807L) {
            j7 = this.zzd;
            if (j7 == -9223372036854775807L) {
                long j9 = this.zzf;
                if (j9 != -9223372036854775807L && j8 < j9) {
                    j8 = j9;
                }
                j7 = this.zzg;
                if (j7 == -9223372036854775807L || j8 <= j7) {
                    j7 = j8;
                }
            }
        } else {
            j7 = -9223372036854775807L;
        }
        if (this.zze == j7) {
            return;
        }
        this.zze = j7;
        this.zzh = j7;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    private static long zzg(long j7, long j8, float f7) {
        return (long) ((j7 * 0.999f) + (j8 * 9.999871E-4f));
    }

    public final void zza(zzae zzaeVar) {
        long j7 = zzaeVar.zza;
        this.zzc = zzeo.zzq(-9223372036854775807L);
        this.zzf = zzeo.zzq(-9223372036854775807L);
        this.zzg = zzeo.zzq(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j7) {
        this.zzd = j7;
        zzf();
    }

    public final void zzc() {
        long j7 = this.zzh;
        if (j7 == -9223372036854775807L) {
            return;
        }
        long j8 = j7 + this.zzb;
        this.zzh = j8;
        long j9 = this.zzg;
        if (j9 != -9223372036854775807L && j8 > j9) {
            this.zzh = j9;
        }
        this.zzl = -9223372036854775807L;
    }

    public final float zzd(long j7, long j8) {
        float f7;
        long jMax;
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j9 = j7 - j8;
        long j10 = this.zzm;
        if (j10 == -9223372036854775807L) {
            this.zzm = j9;
            this.zzn = 0L;
        } else {
            long jMax2 = Math.max(j9, zzg(j10, j9, 0.999f));
            this.zzm = jMax2;
            this.zzn = zzg(this.zzn, Math.abs(j9 - jMax2), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j11 = this.zzm + (this.zzn * 3);
        if (this.zzh > j11) {
            float fZzq = zzeo.zzq(1000L);
            f7 = 1.0E-7f;
            long[] jArr = {j11, this.zze, this.zzh - (((long) (fZzq * (this.zzk - 1.0f))) + ((long) ((this.zzi - 1.0f) * fZzq)))};
            jMax = jArr[0];
            for (int i7 = 1; i7 < 3; i7++) {
                long j12 = jArr[i7];
                if (j12 > jMax) {
                    jMax = j12;
                }
            }
            this.zzh = jMax;
        } else {
            f7 = 1.0E-7f;
            long jMax3 = j7 - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f));
            long j13 = this.zzh;
            String str = zzeo.zza;
            jMax = Math.max(j13, Math.min(jMax3, j11));
            this.zzh = jMax;
            long j14 = this.zzg;
            if (j14 != -9223372036854775807L && jMax > j14) {
                this.zzh = j14;
                jMax = j14;
            }
        }
        long j15 = j7 - jMax;
        if (Math.abs(j15) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.zzj, Math.min((j15 * f7) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }

    public final long zze() {
        return this.zzh;
    }
}

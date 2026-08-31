package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class zzel {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzel(long j7) {
        zzd(0L);
    }

    public static long zzi(long j7) {
        return zzeo.zzt(j7, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long zzj(long j7) {
        return zzeo.zzt(j7, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long zza() {
        long j7 = this.zza;
        if (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j7;
    }

    public final synchronized long zzb() {
        long j7;
        try {
            j7 = this.zzc;
        } catch (Throwable th) {
            throw th;
        }
        return j7 != -9223372036854775807L ? j7 + this.zzb : zza();
    }

    public final synchronized long zzc() {
        return this.zzb;
    }

    public final synchronized void zzd(long j7) {
        this.zza = j7;
        this.zzb = j7 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized long zze(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.zzc;
            if (j8 != -9223372036854775807L) {
                long jZzj = zzj(j8);
                long j9 = (4294967296L + jZzj) / 8589934592L;
                long j10 = (((-1) + j9) * 8589934592L) + j7;
                j7 += j9 * 8589934592L;
                if (Math.abs(j10 - jZzj) < Math.abs(j7 - jZzj)) {
                    j7 = j10;
                }
            }
            return zzg(zzi(j7));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzf(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.zzc;
            if (j8 != -9223372036854775807L) {
                long jZzj = zzj(j8);
                long j9 = jZzj / 8589934592L;
                long j10 = (j9 * 8589934592L) + j7;
                j7 += (j9 + 1) * 8589934592L;
                if (j10 >= jZzj) {
                    j7 = j10;
                }
            }
            return zzg(zzi(j7));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzg(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!zzh()) {
                long jLongValue = this.zza;
                if (jLongValue == 9223372036854775806L) {
                    Long l7 = (Long) this.zzd.get();
                    if (l7 == null) {
                        throw null;
                    }
                    jLongValue = l7.longValue();
                }
                this.zzb = jLongValue - j7;
                notifyAll();
            }
            this.zzc = j7;
            return j7 + this.zzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzh() {
        return this.zzb != -9223372036854775807L;
    }
}

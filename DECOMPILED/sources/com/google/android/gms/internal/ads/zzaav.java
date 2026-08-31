package com.google.android.gms.internal.ads;

import android.util.Range;

/* JADX INFO: loaded from: classes2.dex */
final class zzaav {
    private long zza;
    private long zzb;
    private double zzc;
    private Range zzd;

    public zzaav(float f7) {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.zzd = range;
        this.zzc = ((Double) range.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public final void zza(long j7, long j8) {
        double dDoubleValue;
        zzghc.zza(j7 != -9223372036854775807L);
        zzghc.zza(j8 != -9223372036854775807L);
        long j9 = this.zza;
        if (j9 != -9223372036854775807L) {
            long j10 = this.zzb;
            if (j10 == -9223372036854775807L || j7 == j9) {
                dDoubleValue = ((Double) this.zzd.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j8 - j10) / (j7 - j9);
            }
        } else {
            dDoubleValue = ((Double) this.zzd.getUpper()).doubleValue();
        }
        this.zzc = (this.zzc * 0.800000011920929d) + (((Double) this.zzd.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d);
        this.zza = j7;
        this.zzb = j8;
    }

    public final long zzb(long j7) {
        long j8 = this.zza;
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.zzb + ((j7 - j8) * this.zzc));
    }

    public final void zzc(float f7) {
        zzghc.zza(f7 > 0.0f);
        this.zzd = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f7)));
        zzd();
    }

    public final void zzd() {
        this.zzc = ((Double) this.zzd.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }
}

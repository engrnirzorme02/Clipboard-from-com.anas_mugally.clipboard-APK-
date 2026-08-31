package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzzw {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg = new boolean[15];
    private int zzh;

    public final void zza() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zzb() {
        return this.zzd > 15 && this.zzh == 0;
    }

    public final boolean zzc() {
        long j7 = this.zzd;
        if (j7 == 0) {
            return false;
        }
        return this.zzg[(int) ((j7 - 1) % 15)];
    }

    public final long zzd() {
        return this.zzf;
    }

    public final long zze() {
        long j7 = this.zze;
        if (j7 == 0) {
            return 0L;
        }
        return this.zzf / j7;
    }

    public final void zzf(long j7) {
        long j8 = this.zzd;
        if (j8 == 0) {
            this.zza = j7;
        } else if (j8 == 1) {
            long j9 = j7 - this.zza;
            this.zzb = j9;
            this.zzf = j9;
            this.zze = 1L;
        } else {
            long j10 = j7 - this.zzc;
            int i7 = (int) (j8 % 15);
            if (Math.abs(j10 - this.zzb) <= 1000000) {
                this.zze++;
                this.zzf += j10;
                boolean[] zArr = this.zzg;
                if (zArr[i7]) {
                    zArr[i7] = false;
                    this.zzh--;
                }
            } else {
                boolean[] zArr2 = this.zzg;
                if (!zArr2[i7]) {
                    zArr2[i7] = true;
                    this.zzh++;
                }
            }
        }
        this.zzd++;
        this.zzc = j7;
    }
}

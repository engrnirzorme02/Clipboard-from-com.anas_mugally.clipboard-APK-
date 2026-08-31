package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzahl implements zzahi {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzahl(long j7, int i7, long j8, int i8, long j9, long[] jArr) {
        this.zza = j7;
        this.zzb = i7;
        this.zzc = j8;
        this.zzd = i8;
        this.zze = j9;
        this.zzg = jArr;
        this.zzf = j9 != -1 ? j7 + j9 : -1L;
    }

    public static zzahl zzd(zzahk zzahkVar, long j7) {
        long jZzb = zzahkVar.zzb();
        if (jZzb == -9223372036854775807L) {
            return null;
        }
        zzado zzadoVar = zzahkVar.zza;
        return new zzahl(j7, zzadoVar.zzc, jZzb, zzadoVar.zzf, zzahkVar.zzc, zzahkVar.zzf);
    }

    private final long zzh(int i7) {
        return (this.zzc * ((long) i7)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j7) {
        if (!zzb()) {
            zzadw zzadwVar = new zzadw(0L, this.zza + ((long) this.zzb));
            return new zzadt(zzadwVar, zzadwVar);
        }
        long j8 = this.zzc;
        String str = zzeo.zza;
        long jMax = Math.max(0L, Math.min(j7, j8));
        double d7 = (jMax * 100.0d) / j8;
        double d8 = 0.0d;
        if (d7 > 0.0d) {
            if (d7 >= 100.0d) {
                d8 = 256.0d;
            } else {
                int i7 = (int) d7;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d9 = jArr[i7];
                d8 = d9 + ((d7 - ((double) i7)) * ((i7 == 99 ? 256.0d : jArr[i7 + 1]) - d9));
            }
        }
        long j9 = this.zze;
        zzadw zzadwVar2 = new zzadw(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d8 / 256.0d) * j9), j9 - 1)));
        return new zzadt(zzadwVar2, zzadwVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zze(long j7) {
        if (!zzb()) {
            return 0L;
        }
        long j8 = j7 - this.zza;
        if (j8 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        double d7 = (j8 * 256.0d) / this.zze;
        int iZzm = zzeo.zzm(jArr, (long) d7, true, true);
        long jZzh = zzh(iZzm);
        long j9 = jArr[iZzm];
        int i7 = iZzm + 1;
        long jZzh2 = zzh(i7);
        long j10 = iZzm == 99 ? 256L : jArr[i7];
        return jZzh + Math.round((j9 == j10 ? 0.0d : (d7 - j9) / (j10 - j9)) * (jZzh2 - jZzh));
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final int zzg() {
        return this.zzd;
    }
}

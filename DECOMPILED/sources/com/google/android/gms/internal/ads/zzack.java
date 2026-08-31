package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzack implements zzadv {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzack(long j7, long j8, int i7, int i8, boolean z7) {
        long jZze;
        this.zza = j7;
        this.zzb = j8;
        this.zzc = i8 == -1 ? 1 : i8;
        this.zze = i7;
        if (j7 == -1) {
            this.zzd = -1L;
            jZze = -9223372036854775807L;
        } else {
            this.zzd = j7 - j8;
            jZze = zze(j7, j8, i7);
        }
        this.zzf = jZze;
    }

    private static long zze(long j7, long j8, int i7) {
        return (Math.max(0L, j7 - j8) * 8000000) / ((long) i7);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j7) {
        long j8 = this.zzd;
        if (j8 == -1) {
            zzadw zzadwVar = new zzadw(0L, this.zzb);
            return new zzadt(zzadwVar, zzadwVar);
        }
        long j9 = ((long) this.zze) * j7;
        long j10 = this.zzc;
        long jMin = ((j9 / 8000000) / j10) * j10;
        if (j8 != -1) {
            jMin = Math.min(jMin, j8 - j10);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZzd = zzd(jMax);
        zzadw zzadwVar2 = new zzadw(jZzd, jMax);
        if (j8 != -1 && jZzd < j7) {
            long j11 = jMax + j10;
            if (j11 < this.zza) {
                return new zzadt(zzadwVar2, new zzadw(zzd(j11), j11));
            }
        }
        return new zzadt(zzadwVar2, zzadwVar2);
    }

    public final long zzd(long j7) {
        return zze(j7, this.zzb, this.zze);
    }
}

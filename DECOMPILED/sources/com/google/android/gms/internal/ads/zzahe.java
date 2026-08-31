package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
final class zzahe implements zzahi {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzahe(long[] jArr, long[] jArr2, long j7) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j7 == -9223372036854775807L ? zzeo.zzq(jArr2[jArr2.length - 1]) : j7;
    }

    public static zzahe zzd(long j7, zzagk zzagkVar, long j8) {
        int[] iArr = zzagkVar.zzd;
        int length = iArr.length;
        int i7 = length + 1;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        jArr[0] = j7;
        long j9 = 0;
        jArr2[0] = 0;
        for (int i8 = 1; i8 <= length; i8++) {
            int i9 = i8 - 1;
            j7 += (long) (zzagkVar.zzb + iArr[i9]);
            j9 += (long) (zzagkVar.zzc + zzagkVar.zze[i9]);
            jArr[i8] = j7;
            jArr2[i8] = j9;
        }
        return new zzahe(jArr, jArr2, j8);
    }

    private static Pair zzh(long j7, long[] jArr, long[] jArr2) {
        int iZzm = zzeo.zzm(jArr, j7, true, true);
        long j8 = jArr[iZzm];
        long j9 = jArr2[iZzm];
        int i7 = iZzm + 1;
        if (i7 == jArr.length) {
            return Pair.create(Long.valueOf(j8), Long.valueOf(j9));
        }
        long j10 = jArr[i7];
        return Pair.create(Long.valueOf(j7), Long.valueOf(((long) ((j10 == j8 ? 0.0d : (j7 - j8) / (j10 - j8)) * (jArr2[i7] - j9))) + j9));
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j7) {
        String str = zzeo.zza;
        Pair pairZzh = zzh(zzeo.zzp(Math.max(0L, Math.min(j7, this.zzc))), this.zzb, this.zza);
        zzadw zzadwVar = new zzadw(zzeo.zzq(((Long) pairZzh.first).longValue()), ((Long) pairZzh.second).longValue());
        return new zzadt(zzadwVar, zzadwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zze(long j7) {
        return zzeo.zzq(((Long) zzh(j7, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zzf() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final int zzg() {
        return -2147483647;
    }
}

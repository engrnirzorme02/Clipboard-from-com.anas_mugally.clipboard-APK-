package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzahk {
    public final zzado zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzahk(zzado zzadoVar, long j7, long j8, long[] jArr, int i7, int i8) {
        this.zza = new zzado(zzadoVar);
        this.zzb = j7;
        this.zzc = j8;
        this.zzf = jArr;
        this.zzd = i7;
        this.zze = i8;
    }

    public static zzahk zza(zzado zzadoVar, zzef zzefVar) {
        long[] jArr;
        int i7;
        int i8;
        int iZzB = zzefVar.zzB();
        int iZzH = (iZzB & 1) != 0 ? zzefVar.zzH() : -1;
        long jZzz = (iZzB & 2) != 0 ? zzefVar.zzz() : -1L;
        if ((iZzB & 4) == 4) {
            jArr = new long[100];
            for (int i9 = 0; i9 < 100; i9++) {
                jArr[i9] = zzefVar.zzs();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iZzB & 8) != 0) {
            zzefVar.zzk(4);
        }
        if (zzefVar.zzd() >= 24) {
            zzefVar.zzk(21);
            int iZzx = zzefVar.zzx();
            i8 = iZzx & 4095;
            i7 = iZzx >> 12;
        } else {
            i7 = -1;
            i8 = -1;
        }
        return new zzahk(zzadoVar, iZzH, jZzz, jArr2, i7, i8);
    }

    public final long zzb() {
        long j7 = this.zzb;
        if (j7 == -1 || j7 == 0) {
            return -9223372036854775807L;
        }
        zzado zzadoVar = this.zza;
        return zzeo.zzr((j7 * ((long) zzadoVar.zzg)) - 1, zzadoVar.zzd);
    }
}

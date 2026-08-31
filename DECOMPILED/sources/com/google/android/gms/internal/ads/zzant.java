package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzant {
    public static int zza(byte[] bArr, int i7, int i8) {
        while (i7 < i8 && bArr[i7] != 71) {
            i7++;
        }
        return i7;
    }

    public static long zzb(zzef zzefVar, int i7, int i8) {
        zzefVar.zzh(i7);
        if (zzefVar.zzd() < 5) {
            return -9223372036854775807L;
        }
        int iZzB = zzefVar.zzB();
        if ((8388608 & iZzB) != 0 || ((iZzB >> 8) & 8191) != i8 || (iZzB & 32) == 0 || zzefVar.zzs() < 7 || zzefVar.zzd() < 7 || (zzefVar.zzs() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzefVar.zzm(bArr, 0, 6);
        long j7 = bArr[0];
        long j8 = bArr[1];
        long j9 = bArr[2];
        long j10 = bArr[3] & 255;
        return ((j7 & 255) << 25) | ((j8 & 255) << 17) | ((j9 & 255) << 9) | (j10 + j10) | ((((long) bArr[4]) & 255) >> 7);
    }
}

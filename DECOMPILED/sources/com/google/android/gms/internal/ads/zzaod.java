package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzaod {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzacv zzacvVar) {
        zzef zzefVar = new zzef(8);
        int i7 = zzaoc.zza(zzacvVar, zzefVar).zza;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        zzacvVar.zzi(zzefVar.zzi(), 0, 4);
        zzefVar.zzh(0);
        int iZzB = zzefVar.zzB();
        if (iZzB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iZzB);
        zzds.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static zzaob zzb(zzacv zzacvVar) throws zzas {
        byte[] bArr;
        int i7;
        byte[] bArr2;
        zzef zzefVar = new zzef(16);
        long j7 = zzd(1718449184, zzacvVar, zzefVar).zzb;
        zzghc.zzh(j7 >= 16);
        zzacvVar.zzi(zzefVar.zzi(), 0, 16);
        zzefVar.zzh(0);
        int iZzu = zzefVar.zzu();
        int iZzu2 = zzefVar.zzu();
        int iZzI = zzefVar.zzI();
        int iZzI2 = zzefVar.zzI();
        int iZzu3 = zzefVar.zzu();
        int iZzu4 = zzefVar.zzu();
        int i8 = ((int) j7) - 16;
        if (i8 > 0) {
            bArr = new byte[i8];
            zzacvVar.zzi(bArr, 0, i8);
            if (iZzu == 65534) {
                if (i8 == 24) {
                    zzef zzefVar2 = new zzef(bArr);
                    zzefVar2.zzu();
                    int iZzu5 = zzefVar2.zzu();
                    if (iZzu5 != 0 && iZzu5 != iZzu4) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzu5).length() + 33 + String.valueOf(iZzu4).length() + 19);
                        sb.append("validBits ( ");
                        sb.append(iZzu5);
                        sb.append(")  != bitsPerSample( ");
                        sb.append(iZzu4);
                        sb.append(") are not supported");
                        throw zzas.zzc(sb.toString());
                    }
                    int iZzI3 = zzefVar2.zzI();
                    if ((iZzI3 >> 18) != 0) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzI3).length() + 21);
                        sb2.append("invalid channel mask ");
                        sb2.append(iZzI3);
                        throw zzas.zzc(sb2.toString());
                    }
                    if (iZzI3 != 0 && Integer.bitCount(iZzI3) != iZzu2) {
                        int iBitCount = Integer.bitCount(iZzI3);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iBitCount).length() + 46 + String.valueOf(iZzI3).length());
                        sb3.append("invalid number of channels (");
                        sb3.append(iBitCount);
                        sb3.append(") in channel mask ");
                        sb3.append(iZzI3);
                        throw zzas.zzc(sb3.toString());
                    }
                    iZzu = zzefVar2.zzu();
                    byte[] bArr3 = new byte[14];
                    zzefVar2.zzm(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                        throw zzas.zzc("invalid wav format extension guid");
                    }
                } else {
                    bArr2 = bArr;
                    i7 = 65534;
                }
            }
            zzacvVar.zzf((int) (zzacvVar.zzm() - zzacvVar.zzn()));
            return new zzaob(i7, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
        }
        bArr = zzeo.zzb;
        i7 = iZzu;
        bArr2 = bArr;
        zzacvVar.zzf((int) (zzacvVar.zzm() - zzacvVar.zzn()));
        return new zzaob(i7, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
    }

    public static Pair zzc(zzacv zzacvVar) throws zzas {
        zzacvVar.zzl();
        zzaoc zzaocVarZzd = zzd(1684108385, zzacvVar, new zzef(8));
        zzacvVar.zzf(8);
        return Pair.create(Long.valueOf(zzacvVar.zzn()), Long.valueOf(zzaocVarZzd.zzb));
    }

    private static zzaoc zzd(int i7, zzacv zzacvVar, zzef zzefVar) throws zzas {
        zzaoc zzaocVarZza = zzaoc.zza(zzacvVar, zzefVar);
        while (true) {
            int i8 = zzaocVarZza.zza;
            if (i8 == i7) {
                return zzaocVarZza;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 28);
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(i8);
            zzds.zzc("WavHeaderReader", sb.toString());
            long j7 = zzaocVarZza.zzb;
            long j8 = 8 + j7;
            if ((1 & j7) != 0) {
                j8 = 9 + j7;
            }
            if (j8 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i8);
                throw zzas.zzc(sb2.toString());
            }
            zzacvVar.zzf((int) j8);
            zzaocVarZza = zzaoc.zza(zzacvVar, zzefVar);
        }
    }
}

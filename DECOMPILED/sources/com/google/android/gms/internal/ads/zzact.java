package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzact {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(int i7) {
        if (i7 == 2147385345 || i7 == -25230976 || i7 == 536864768 || i7 == -14745368) {
            return 1;
        }
        if (i7 == 1683496997 || i7 == 622876772) {
            return 2;
        }
        if (i7 == 1078008818 || i7 == -233094848) {
            return 3;
        }
        return (i7 == 1908687592 || i7 == -398277519) ? 4 : 0;
    }

    public static zzu zzb(byte[] bArr, String str, String str2, int i7, String str3, zzp zzpVar) {
        zzee zzeeVarZzi = zzi(bArr);
        zzeeVarZzi.zzh(60);
        int i8 = zzb[zzeeVarZzi.zzj(6)];
        int i9 = zzc[zzeeVarZzi.zzj(4)];
        int iZzj = zzeeVarZzi.zzj(5);
        int i10 = iZzj >= 29 ? -1 : (zzd[iZzj] * zzbbn.zzq.zzf) / 2;
        zzeeVarZzi.zzh(10);
        int i11 = i8 + (zzeeVarZzi.zzj(2) > 0 ? 1 : 0);
        zzs zzsVar = new zzs();
        zzsVar.zza(str);
        zzsVar.zzl("video/mp2t");
        zzsVar.zzm("audio/vnd.dts");
        zzsVar.zzh(i10);
        zzsVar.zzE(i11);
        zzsVar.zzF(i9);
        zzsVar.zzq(null);
        zzsVar.zze(str2);
        zzsVar.zzg(i7);
        return zzsVar.zzM();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int zzc(byte[] bArr) {
        int i7;
        int i8;
        byte b7;
        int i9;
        int i10;
        int i11;
        byte b8;
        boolean z7 = false;
        byte b9 = bArr[0];
        if (b9 != -2) {
            if (b9 == -1) {
                i10 = (bArr[7] & 3) << 12;
                i11 = (bArr[6] & 255) << 4;
                b8 = bArr[9];
            } else if (b9 != 31) {
                i7 = (bArr[5] & 3) << 12;
                i8 = (bArr[6] & 255) << 4;
                b7 = bArr[7];
            } else {
                i10 = (bArr[6] & 3) << 12;
                i11 = (bArr[7] & 255) << 4;
                b8 = bArr[8];
            }
            i9 = (((b8 & 60) >> 2) | i10 | i11) + 1;
            z7 = true;
            if (z7) {
                return (i9 * 16) / 14;
            }
            return i9;
        }
        i7 = (bArr[4] & 3) << 12;
        i8 = (bArr[7] & 255) << 4;
        b7 = bArr[6];
        i9 = (((b7 & 240) >> 4) | i7 | i8) + 1;
        if (z7) {
            return (i9 * 16) / 14;
        }
        return i9;
    }

    public static zzacs zzd(byte[] bArr) throws zzas {
        int iZzj;
        int i7;
        long jZzt;
        int i8;
        zzee zzeeVarZzi = zzi(bArr);
        zzeeVarZzi.zzh(40);
        int iZzj2 = zzeeVarZzi.zzj(2);
        boolean zZzi = zzeeVarZzi.zzi();
        int i9 = true != zZzi ? 16 : 20;
        zzeeVarZzi.zzh(true != zZzi ? 8 : 12);
        int iZzj3 = zzeeVarZzi.zzj(i9) + 1;
        boolean zZzi2 = zzeeVarZzi.zzi();
        int iZzj4 = -1;
        int i10 = 0;
        if (zZzi2) {
            iZzj = zzeeVarZzi.zzj(2);
            int iZzj5 = zzeeVarZzi.zzj(3) + 1;
            if (zzeeVarZzi.zzi()) {
                zzeeVarZzi.zzh(36);
            }
            int iZzj6 = zzeeVarZzi.zzj(3) + 1;
            int iZzj7 = zzeeVarZzi.zzj(3) + 1;
            if (iZzj6 != 1 || iZzj7 != 1) {
                throw zzas.zzc("Multiple audio presentations or assets not supported");
            }
            int i11 = iZzj2 + 1;
            int iZzj8 = zzeeVarZzi.zzj(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                if (((iZzj8 >> i12) & 1) == 1) {
                    zzeeVarZzi.zzh(8);
                }
            }
            int i13 = iZzj5 * 512;
            if (zzeeVarZzi.zzi()) {
                zzeeVarZzi.zzh(2);
                int iZzj9 = (zzeeVarZzi.zzj(2) + 1) << 2;
                int iZzj10 = zzeeVarZzi.zzj(2) + 1;
                while (i10 < iZzj10) {
                    zzeeVarZzi.zzh(iZzj9);
                    i10++;
                }
            }
            i10 = i13;
        } else {
            iZzj = -1;
        }
        zzeeVarZzi.zzh(i9);
        zzeeVarZzi.zzh(12);
        if (zZzi2) {
            if (zzeeVarZzi.zzi()) {
                zzeeVarZzi.zzh(4);
            }
            if (zzeeVarZzi.zzi()) {
                zzeeVarZzi.zzh(24);
            }
            if (zzeeVarZzi.zzi()) {
                zzeeVarZzi.zzo(zzeeVarZzi.zzj(10) + 1);
            }
            zzeeVarZzi.zzh(5);
            i7 = zze[zzeeVarZzi.zzj(4)];
            iZzj4 = zzeeVarZzi.zzj(8) + 1;
        } else {
            i7 = -2147483647;
        }
        int i14 = i7;
        if (zZzi2) {
            if (iZzj == 0) {
                i8 = 32000;
            } else if (iZzj == 1) {
                i8 = 44100;
            } else {
                if (iZzj != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzj).length() + 51);
                    sb.append("Unsupported reference clock code in DTS HD header: ");
                    sb.append(iZzj);
                    throw zzas.zzb(sb.toString(), null);
                }
                i8 = 48000;
            }
            jZzt = zzeo.zzt(i10, 1000000L, i8, RoundingMode.DOWN);
        } else {
            jZzt = -9223372036854775807L;
        }
        return new zzacs("audio/vnd.dts.hd;profile=lbr", iZzj4, i14, iZzj3, jZzt, 0, null);
    }

    public static int zze(byte[] bArr) {
        zzee zzeeVarZzi = zzi(bArr);
        zzeeVarZzi.zzh(42);
        return zzeeVarZzi.zzj(true != zzeeVarZzi.zzi() ? 8 : 12) + 1;
    }

    public static zzacs zzf(byte[] bArr, AtomicInteger atomicInteger) throws zzas {
        long jZzt;
        int iZzj;
        AtomicInteger atomicInteger2;
        int i7;
        int i8;
        zzee zzeeVarZzi = zzi(bArr);
        int iZzj2 = zzeeVarZzi.zzj(32);
        int iZzh = zzh(zzeeVarZzi, zzf, true);
        int i9 = iZzh + 1;
        char c7 = iZzj2 == 1078008818 ? (char) 1 : (char) 0;
        if (c7 == 0) {
            jZzt = -9223372036854775807L;
            iZzj = -2147483647;
        } else {
            if (!zzeeVarZzi.zzi()) {
                throw zzas.zzc("Only supports full channel mask-based audio presentation");
            }
            int i10 = iZzh - 1;
            if (((bArr[iZzh] & 255) | ((char) (bArr[i10] << 8))) != zzeo.zzI(bArr, 0, i10, 65535)) {
                throw zzas.zzb("CRC check failed", null);
            }
            int iZzj3 = zzeeVarZzi.zzj(2);
            if (iZzj3 == 0) {
                i7 = 512;
            } else if (iZzj3 == 1) {
                i7 = 480;
            } else {
                if (iZzj3 != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzj3).length() + 51);
                    sb.append("Unsupported base duration index in DTS UHD header: ");
                    sb.append(iZzj3);
                    throw zzas.zzb(sb.toString(), null);
                }
                i7 = 384;
            }
            int iZzj4 = zzeeVarZzi.zzj(3) + 1;
            int iZzj5 = zzeeVarZzi.zzj(2);
            if (iZzj5 == 0) {
                i8 = 32000;
            } else if (iZzj5 == 1) {
                i8 = 44100;
            } else {
                if (iZzj5 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj5).length() + 48);
                    sb2.append("Unsupported clock rate index in DTS UHD header: ");
                    sb2.append(iZzj5);
                    throw zzas.zzb(sb2.toString(), null);
                }
                i8 = 48000;
            }
            if (zzeeVarZzi.zzi()) {
                zzeeVarZzi.zzh(36);
            }
            iZzj = (1 << zzeeVarZzi.zzj(2)) * i8;
            jZzt = zzeo.zzt(i7 * iZzj4, 1000000L, i8, RoundingMode.DOWN);
        }
        int i11 = iZzj;
        long j7 = jZzt;
        int iZzh2 = 0;
        for (char c8 = 0; c8 < c7; c8 = 1) {
            iZzh2 += zzh(zzeeVarZzi, zzg, true);
        }
        for (int i12 = 0; i12 <= 0; i12++) {
            if (c7 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(zzh(zzeeVarZzi, zzh, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            iZzh2 += atomicInteger2.get() != 0 ? zzh(zzeeVarZzi, zzi, true) : 0;
        }
        return new zzacs("audio/vnd.dts.uhd;profile=p2", 2, i11, i9 + iZzh2, j7, 0, null);
    }

    public static int zzg(byte[] bArr) {
        zzee zzeeVarZzi = zzi(bArr);
        zzeeVarZzi.zzh(32);
        return zzh(zzeeVarZzi, zzj, true) + 1;
    }

    private static int zzh(zzee zzeeVar, int[] iArr, boolean z7) {
        int i7 = 0;
        for (int i8 = 0; i8 < 3 && zzeeVar.zzi(); i8++) {
            i7++;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 += 1 << iArr[i10];
        }
        return i9 + zzeeVar.zzj(iArr[i7]);
    }

    private static zzee zzi(byte[] bArr) {
        byte b7 = bArr[0];
        if (b7 == 127 || b7 == 100 || b7 == 64 || b7 == 113) {
            return new zzee(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b8 = bArrCopyOf[0];
        if (b8 == -2 || b8 == -1 || b8 == 37 || b8 == -14 || b8 == -24) {
            for (int i7 = 0; i7 < bArrCopyOf.length - 1; i7 += 2) {
                byte b9 = bArrCopyOf[i7];
                int i8 = i7 + 1;
                bArrCopyOf[i7] = bArrCopyOf[i8];
                bArrCopyOf[i8] = b9;
            }
        }
        int length = bArrCopyOf.length;
        zzee zzeeVar = new zzee(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzee zzeeVar2 = new zzee(bArrCopyOf, length);
            while (zzeeVar2.zzc() >= 16) {
                zzeeVar2.zzh(2);
                zzeeVar.zzp(zzeeVar2.zzj(14), 14);
            }
        }
        zzeeVar.zzb(bArrCopyOf, bArrCopyOf.length);
        return zzeeVar;
    }
}

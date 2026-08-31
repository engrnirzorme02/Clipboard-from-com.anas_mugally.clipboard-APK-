package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfl {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i7) {
        int i8;
        synchronized (zzc) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7) {
                while (true) {
                    try {
                        if (i9 >= i7 - 2) {
                            i9 = i7;
                            break;
                        }
                        int i11 = i9 + 1;
                        if (bArr[i9] == 0 && bArr[i11] == 0 && bArr[i9 + 2] == 3) {
                            break;
                        }
                        i9 = i11;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i9 < i7) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i10) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i8 = i7 - i10;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = zzd[i14] - i12;
                System.arraycopy(bArr, i12, bArr, i13, i15);
                int i16 = i13 + i15;
                int i17 = i16 + 1;
                bArr[i16] = 0;
                i13 = i16 + 2;
                bArr[i17] = 0;
                i12 += i15 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i13, i8 - i13);
        }
        return i8;
    }

    public static int zzb(zzu zzuVar) {
        String str = zzuVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            return 1;
        }
        return (Objects.equals(str, "video/hevc") || zzar.zze(zzuVar.zzk, "video/hevc")) ? 2 : 0;
    }

    public static boolean zzc(byte[] bArr, int i7, int i8, zzu zzuVar) {
        String str = zzuVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            byte b7 = bArr[4];
            if (((b7 & 96) >> 5) != 0) {
                return true;
            }
            int i9 = b7 & 31;
            return (i9 == 1 || i9 == 9 || i9 == 14) ? false : true;
        }
        if (Objects.equals(str, "video/hevc")) {
            zzez zzezVarZzk = zzk(new zzfm(bArr, 4, i8 + 4));
            int i10 = zzezVarZzk.zza;
            if (i10 == 35) {
                return false;
            }
            return (i10 <= 14 && i10 % 2 == 0 && zzezVarZzk.zzc == zzuVar.zzF + (-1)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x0208  */
    /* JADX WARN: Code duplicated, block: B:117:0x020c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0215  */
    /* JADX WARN: Code duplicated, block: B:123:0x0221  */
    /* JADX WARN: Code duplicated, block: B:126:0x022c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0235  */
    /* JADX WARN: Code duplicated, block: B:132:0x023c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0248  */
    /* JADX WARN: Code duplicated, block: B:137:0x0269  */
    /* JADX WARN: Code duplicated, block: B:142:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:70:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x016c A[PHI: r2
      0x016c: PHI (r2v6 int) = (r2v4 int), (r2v3 int) binds: [B:87:0x0171, B:83:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x016f A[PHI: r2
      0x016f: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:74:0x0156, B:76:0x015a, B:78:0x015e, B:80:0x0162, B:82:0x0166, B:84:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:95:0x018e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a1  */
    public static zzfk zzd(byte[] bArr, int i7, int i8) {
        int iZzg;
        int i9;
        boolean zZze;
        int i10;
        int iZzg2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iZzh;
        int i16;
        int i17;
        int iZzg3;
        boolean z7;
        boolean zZze2;
        int i18;
        int i19;
        int i20;
        int iZzg4;
        float f7;
        int i21;
        int i22;
        float f8;
        int i23;
        int i24;
        int iZzb;
        int iZzc;
        boolean zZze3;
        boolean zZze4;
        int i25;
        int iZzf;
        int iZzf2;
        int iZzf3;
        int i26;
        int i27;
        zzfm zzfmVar = new zzfm(bArr, i7, i8);
        int iZzf4 = zzfmVar.zzf(8);
        int iZzf5 = zzfmVar.zzf(8);
        int iZzf6 = zzfmVar.zzf(8);
        int iZzg5 = zzfmVar.zzg();
        if (iZzf4 == 100 || iZzf4 == 110 || iZzf4 == 122 || iZzf4 == 244 || iZzf4 == 44 || iZzf4 == 83 || iZzf4 == 86 || iZzf4 == 118 || iZzf4 == 128) {
            iZzg = zzfmVar.zzg();
            if (iZzg == 3) {
                zZze = zzfmVar.zze();
                i9 = 3;
            } else {
                i9 = iZzg;
                zZze = false;
            }
            i10 = 16;
            int iZzg6 = zzfmVar.zzg();
            iZzg2 = zzfmVar.zzg();
            zzfmVar.zza();
            if (zzfmVar.zze()) {
                if (i9 != 3) {
                    i12 = 8;
                } else {
                    i12 = 12;
                }
                for (i13 = 0; i13 < i12; i13++) {
                    if (!zzfmVar.zze()) {
                        if (i13 < 6) {
                            i14 = 16;
                        } else {
                            i14 = 64;
                        }
                        iZzh = 8;
                        i16 = 8;
                        for (i15 = 0; i15 < i14; i15++) {
                            if (iZzh != 0) {
                                iZzh = ((i16 + zzfmVar.zzh()) + 256) % 256;
                            }
                            if (iZzh != 0) {
                                i16 = iZzh;
                            }
                        }
                    }
                }
            }
            i11 = iZzg6;
        } else if (iZzf4 == 138) {
            iZzf4 = 138;
            iZzg = zzfmVar.zzg();
            if (iZzg == 3) {
                zZze = zzfmVar.zze();
                i9 = 3;
            } else {
                i9 = iZzg;
                zZze = false;
            }
            i10 = 16;
            int iZzg7 = zzfmVar.zzg();
            iZzg2 = zzfmVar.zzg();
            zzfmVar.zza();
            if (zzfmVar.zze()) {
                if (i9 != 3) {
                    i12 = 8;
                } else {
                    i12 = 12;
                }
                while (i13 < i12) {
                    if (!zzfmVar.zze()) {
                        if (i13 < 6) {
                            i14 = 16;
                        } else {
                            i14 = 64;
                        }
                        iZzh = 8;
                        i16 = 8;
                        while (i15 < i14) {
                            if (iZzh != 0) {
                                iZzh = ((i16 + zzfmVar.zzh()) + 256) % 256;
                            }
                            if (iZzh != 0) {
                                i16 = iZzh;
                            }
                        }
                    }
                }
            }
            i11 = iZzg7;
        } else {
            iZzg = 1;
            i10 = 16;
            i11 = 0;
            zZze = false;
            iZzg2 = 0;
        }
        int iZzg8 = zzfmVar.zzg() + 4;
        int iZzg9 = zzfmVar.zzg();
        if (iZzg9 != 0) {
            if (iZzg9 == 1) {
                boolean zZze5 = zzfmVar.zze();
                zzfmVar.zzh();
                zzfmVar.zzh();
                long jZzg = zzfmVar.zzg();
                for (int i28 = 0; i28 < jZzg; i28++) {
                    zzfmVar.zzg();
                }
                z7 = zZze5;
                iZzg9 = 1;
                i17 = 244;
                iZzg3 = 0;
            } else {
                i17 = 244;
                iZzg3 = 0;
            }
            int iZzg10 = zzfmVar.zzg();
            zzfmVar.zza();
            int iZzg11 = zzfmVar.zzg() + 1;
            int iZzg12 = zzfmVar.zzg() + 1;
            zZze2 = zzfmVar.zze();
            i18 = 2 - (zZze2 ? 1 : 0);
            if (!zZze2) {
                zzfmVar.zza();
            }
            zzfmVar.zza();
            i19 = iZzg11 * 16;
            i20 = iZzg12 * i18 * 16;
            if (zzfmVar.zze()) {
                int iZzg13 = zzfmVar.zzg();
                int iZzg14 = zzfmVar.zzg();
                int iZzg15 = zzfmVar.zzg();
                int iZzg16 = zzfmVar.zzg();
                if (iZzg == 0) {
                    i26 = 1;
                } else {
                    if (iZzg == 3) {
                        i26 = 1;
                    } else {
                        i26 = 2;
                    }
                    if (iZzg == 1) {
                        i27 = 2;
                    } else {
                        i27 = 1;
                    }
                    i18 *= i27;
                }
                i19 -= (iZzg13 + iZzg14) * i26;
                i20 -= (iZzg15 + iZzg16) * i18;
            }
            if (iZzf4 != 44 || iZzf4 == 86 || iZzf4 == 100 || iZzf4 == 110 || iZzf4 == 122) {
                if ((iZzf5 & 16) != 0) {
                    iZzg4 = 0;
                } else {
                    iZzg4 = i10;
                }
            } else if (iZzf4 == i17) {
                iZzf4 = i17;
                if ((iZzf5 & 16) != 0) {
                    iZzg4 = 0;
                } else {
                    iZzg4 = i10;
                }
            } else {
                iZzg4 = i10;
            }
            f7 = 1.0f;
            i21 = -1;
            if (zzfmVar.zze()) {
                if (zzfmVar.zze()) {
                    iZzf = zzfmVar.zzf(8);
                    if (iZzf == 255) {
                        int i29 = i10;
                        iZzf2 = zzfmVar.zzf(i29);
                        iZzf3 = zzfmVar.zzf(i29);
                        if (iZzf2 != 0 && iZzf3 != 0) {
                            f7 = iZzf2 / iZzf3;
                        }
                    } else if (iZzf < 17) {
                        f7 = zzb[iZzf];
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzf).length() + 35);
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(iZzf);
                        zzds.zzc("NalUnitUtil", sb.toString());
                    }
                }
                if (zzfmVar.zze()) {
                    zzfmVar.zza();
                }
                if (zzfmVar.zze()) {
                    zzfmVar.zzb(3);
                    if (true != zzfmVar.zze()) {
                        i25 = 2;
                    } else {
                        i25 = 1;
                    }
                    if (zzfmVar.zze()) {
                        int iZzf7 = zzfmVar.zzf(8);
                        int iZzf8 = zzfmVar.zzf(8);
                        zzfmVar.zzb(8);
                        iZzb = zzh.zzb(iZzf7);
                        iZzc = zzh.zzc(iZzf8);
                    } else {
                        iZzb = -1;
                        iZzc = -1;
                    }
                    i21 = i25;
                } else {
                    iZzb = -1;
                    iZzc = -1;
                }
                if (zzfmVar.zze()) {
                    zzfmVar.zzg();
                    zzfmVar.zzg();
                }
                if (zzfmVar.zze()) {
                    zzfmVar.zzb(65);
                }
                zZze3 = zzfmVar.zze();
                if (zZze3) {
                    zzo(zzfmVar);
                }
                zZze4 = zzfmVar.zze();
                if (zZze4) {
                    zzo(zzfmVar);
                }
                if (zZze3 || zZze4) {
                    zzfmVar.zza();
                }
                zzfmVar.zza();
                if (zzfmVar.zze()) {
                    zzfmVar.zza();
                    zzfmVar.zzg();
                    zzfmVar.zzg();
                    zzfmVar.zzg();
                    zzfmVar.zzg();
                    iZzg4 = zzfmVar.zzg();
                    zzfmVar.zzg();
                }
                i24 = iZzc;
                i22 = iZzg4;
                f8 = f7;
                i23 = i21;
                i21 = iZzb;
            } else {
                i22 = iZzg4;
                f8 = 1.0f;
                i23 = -1;
                i24 = -1;
            }
            return new zzfk(iZzf4, iZzf5, iZzf6, iZzg5, iZzg10, i19, i20, f8, i11, iZzg2, zZze, zZze2, iZzg8, iZzg9, iZzg3, z7, i21, i23, i24, i22);
        }
        iZzg3 = zzfmVar.zzg() + 4;
        i17 = 244;
        z7 = false;
        int iZzg17 = zzfmVar.zzg();
        zzfmVar.zza();
        int iZzg18 = zzfmVar.zzg() + 1;
        int iZzg19 = zzfmVar.zzg() + 1;
        zZze2 = zzfmVar.zze();
        i18 = 2 - (zZze2 ? 1 : 0);
        if (!zZze2) {
            zzfmVar.zza();
        }
        zzfmVar.zza();
        i19 = iZzg18 * 16;
        i20 = iZzg19 * i18 * 16;
        if (zzfmVar.zze()) {
            int iZzg110 = zzfmVar.zzg();
            int iZzg111 = zzfmVar.zzg();
            int iZzg112 = zzfmVar.zzg();
            int iZzg113 = zzfmVar.zzg();
            if (iZzg == 0) {
                i26 = 1;
            } else {
                if (iZzg == 3) {
                    i26 = 1;
                } else {
                    i26 = 2;
                }
                if (iZzg == 1) {
                    i27 = 2;
                } else {
                    i27 = 1;
                }
                i18 *= i27;
            }
            i19 -= (iZzg110 + iZzg111) * i26;
            i20 -= (iZzg112 + iZzg113) * i18;
        }
        if (iZzf4 != 44) {
            if ((iZzf5 & 16) != 0) {
                iZzg4 = 0;
            } else {
                iZzg4 = i10;
            }
        } else if ((iZzf5 & 16) != 0) {
            iZzg4 = 0;
        } else {
            iZzg4 = i10;
        }
        f7 = 1.0f;
        i21 = -1;
        if (zzfmVar.zze()) {
            if (zzfmVar.zze()) {
                iZzf = zzfmVar.zzf(8);
                if (iZzf == 255) {
                    int i210 = i10;
                    iZzf2 = zzfmVar.zzf(i210);
                    iZzf3 = zzfmVar.zzf(i210);
                    if (iZzf2 != 0) {
                        f7 = iZzf2 / iZzf3;
                    }
                } else if (iZzf < 17) {
                    f7 = zzb[iZzf];
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzf).length() + 35);
                    sb2.append("Unexpected aspect_ratio_idc value: ");
                    sb2.append(iZzf);
                    zzds.zzc("NalUnitUtil", sb2.toString());
                }
            }
            if (zzfmVar.zze()) {
                zzfmVar.zza();
            }
            if (zzfmVar.zze()) {
                zzfmVar.zzb(3);
                if (true != zzfmVar.zze()) {
                    i25 = 2;
                } else {
                    i25 = 1;
                }
                if (zzfmVar.zze()) {
                    int iZzf9 = zzfmVar.zzf(8);
                    int iZzf10 = zzfmVar.zzf(8);
                    zzfmVar.zzb(8);
                    iZzb = zzh.zzb(iZzf9);
                    iZzc = zzh.zzc(iZzf10);
                } else {
                    iZzb = -1;
                    iZzc = -1;
                }
                i21 = i25;
            } else {
                iZzb = -1;
                iZzc = -1;
            }
            if (zzfmVar.zze()) {
                zzfmVar.zzg();
                zzfmVar.zzg();
            }
            if (zzfmVar.zze()) {
                zzfmVar.zzb(65);
            }
            zZze3 = zzfmVar.zze();
            if (zZze3) {
                zzo(zzfmVar);
            }
            zZze4 = zzfmVar.zze();
            if (zZze4) {
                zzo(zzfmVar);
            }
            if (zZze3) {
                zzfmVar.zza();
            } else {
                zzfmVar.zza();
            }
            zzfmVar.zza();
            if (zzfmVar.zze()) {
                zzfmVar.zza();
                zzfmVar.zzg();
                zzfmVar.zzg();
                zzfmVar.zzg();
                zzfmVar.zzg();
                iZzg4 = zzfmVar.zzg();
                zzfmVar.zzg();
            }
            i24 = iZzc;
            i22 = iZzg4;
            f8 = f7;
            i23 = i21;
            i21 = iZzb;
        } else {
            i22 = iZzg4;
            f8 = 1.0f;
            i23 = -1;
            i24 = -1;
        }
        return new zzfk(iZzf4, iZzf5, iZzf6, iZzg5, iZzg17, i19, i20, f8, i11, iZzg2, zZze, zZze2, iZzg8, iZzg9, iZzg3, z7, i21, i23, i24, i22);
    }

    /* JADX WARN: Code duplicated, block: B:458:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0152  */
    /* JADX WARN: Multi-variable type inference failed */
    public static zzfi zze(byte[] bArr, int i7, int i8) {
        int i9;
        zzfh zzfhVar;
        boolean z7;
        int iZzf;
        int iZzf2;
        int iZzf3;
        int iZzf4;
        int i10;
        int i11;
        int i12;
        boolean[][] zArr;
        int[] iArr;
        boolean[][] zArr2;
        int[] iArr2;
        int i13;
        int i14;
        boolean zZze;
        int i15;
        int i16;
        int i17;
        int iZzg;
        int i18;
        int i19;
        int i20;
        boolean z8;
        boolean z9;
        zzfm zzfmVar = new zzfm(bArr, i7, i8);
        zzez zzezVarZzk = zzk(zzfmVar);
        zzfmVar.zzb(4);
        boolean zZze2 = zzfmVar.zze();
        boolean zZze3 = zzfmVar.zze();
        int iZzf5 = zzfmVar.zzf(6);
        int i21 = iZzf5 + 1;
        int iZzf6 = zzfmVar.zzf(3);
        zzfmVar.zzb(17);
        zzfa zzfaVarZzl = zzl(zzfmVar, true, iZzf6, null);
        for (int i22 = true != zzfmVar.zze() ? iZzf6 : 0; i22 <= iZzf6; i22++) {
            zzfmVar.zzg();
            zzfmVar.zzg();
            zzfmVar.zzg();
        }
        int iZzf7 = zzfmVar.zzf(6);
        int iZzg2 = zzfmVar.zzg() + 1;
        int i23 = 6;
        zzfb zzfbVar = new zzfb(zzgjz.zzj(zzfaVarZzl), new int[1]);
        boolean z10 = i21 >= 2 && iZzg2 >= 2;
        boolean z11 = zZze2 && zZze3;
        int i24 = 1;
        int i25 = iZzf7 + 1;
        if (!z10 || !z11 || i25 < i21) {
            return new zzfi(zzezVarZzk, null, zzfbVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, iZzg2, i25);
        int[] iArr4 = new int[iZzg2];
        int[] iArr5 = new int[iZzg2];
        iArr3[0][0] = 0;
        iArr4[0] = 1;
        iArr5[0] = 0;
        for (int i26 = 1; i26 < iZzg2; i26++) {
            int i27 = 0;
            for (int i28 = 0; i28 <= iZzf7; i28++) {
                if (zzfmVar.zze()) {
                    iArr3[i26][i27] = i28;
                    iArr5[i26] = i28;
                    i27++;
                }
                iArr4[i26] = i27;
            }
        }
        if (zzfmVar.zze()) {
            zzfmVar.zzb(64);
            if (zzfmVar.zze()) {
                zzfmVar.zzg();
            }
            int iZzg3 = zzfmVar.zzg();
            int i29 = 0;
            while (i29 < iZzg3) {
                zzfmVar.zzg();
                if (i29 == 0 || zzfmVar.zze()) {
                    boolean zZze4 = zzfmVar.zze();
                    boolean zZze5 = zzfmVar.zze();
                    if (zZze4 || zZze5) {
                        zZze = zzfmVar.zze();
                        iZzg3 = iZzg3;
                        if (zZze) {
                            zzfmVar.zzb(19);
                        }
                        zzfmVar.zzb(8);
                        if (zZze) {
                            zzfmVar.zzb(4);
                        }
                        zzfmVar.zzb(15);
                        i16 = zZze4;
                        i15 = zZze5;
                    } else {
                        z9 = zZze4;
                        z8 = zZze5;
                    }
                    i17 = 0;
                    while (i17 <= iZzf6) {
                        if (!zzfmVar.zze() || zzfmVar.zze()) {
                            zzfmVar.zzg();
                        } else {
                            if (zzfmVar.zze()) {
                                iZzg = 0;
                            }
                            zzez zzezVar = zzezVarZzk;
                            i18 = i16 + i15;
                            int[][] iArr6 = iArr3;
                            i19 = 0;
                            while (i19 < i18) {
                                int i30 = i18;
                                for (i20 = 0; i20 <= iZzg; i20++) {
                                    zzfmVar.zzg();
                                    zzfmVar.zzg();
                                    if (zZze) {
                                        zzfmVar.zzg();
                                        zzfmVar.zzg();
                                    }
                                    zzfmVar.zza();
                                }
                                i19++;
                                i18 = i30;
                            }
                            i17++;
                            zzezVarZzk = zzezVar;
                            iArr3 = iArr6;
                        }
                        iZzg = zzfmVar.zzg();
                        zzez zzezVar2 = zzezVarZzk;
                        i18 = i16 + i15;
                        int[][] iArr7 = iArr3;
                        i19 = 0;
                        while (i19 < i18) {
                            int i31 = i18;
                            while (i20 <= iZzg) {
                                zzfmVar.zzg();
                                zzfmVar.zzg();
                                if (zZze) {
                                    zzfmVar.zzg();
                                    zzfmVar.zzg();
                                }
                                zzfmVar.zza();
                            }
                            i19++;
                            i18 = i31;
                        }
                        i17++;
                        zzezVarZzk = zzezVar2;
                        iArr3 = iArr7;
                    }
                    i29++;
                    iZzg3 = iZzg3;
                } else {
                    z9 = false;
                    z8 = false;
                }
                zZze = false;
                i16 = z9;
                i15 = z8;
                i17 = 0;
                while (i17 <= iZzf6) {
                    if (zzfmVar.zze()) {
                        zzfmVar.zzg();
                        iZzg = zzfmVar.zzg();
                    } else {
                        zzfmVar.zzg();
                        iZzg = zzfmVar.zzg();
                    }
                    zzez zzezVar3 = zzezVarZzk;
                    i18 = i16 + i15;
                    int[][] iArr8 = iArr3;
                    i19 = 0;
                    while (i19 < i18) {
                        int i32 = i18;
                        while (i20 <= iZzg) {
                            zzfmVar.zzg();
                            zzfmVar.zzg();
                            if (zZze) {
                                zzfmVar.zzg();
                                zzfmVar.zzg();
                            }
                            zzfmVar.zza();
                        }
                        i19++;
                        i18 = i32;
                    }
                    i17++;
                    zzezVarZzk = zzezVar3;
                    iArr3 = iArr8;
                }
                i29++;
                iZzg3 = iZzg3;
            }
        }
        zzez zzezVar4 = zzezVarZzk;
        int[][] iArr9 = iArr3;
        if (!zzfmVar.zze()) {
            return new zzfi(zzezVar4, null, zzfbVar, null, null);
        }
        zzfmVar.zzc();
        zzfa zzfaVarZzl2 = zzl(zzfmVar, false, iZzf6, zzfaVarZzl);
        boolean zZze6 = zzfmVar.zze();
        boolean[] zArr3 = new boolean[16];
        int i33 = 0;
        for (int i34 = 0; i34 < 16; i34++) {
            boolean zZze7 = zzfmVar.zze();
            zArr3[i34] = zZze7;
            if (zZze7) {
                i33++;
            }
        }
        if (i33 == 0 || !zArr3[1]) {
            return new zzfi(zzezVar4, null, zzfbVar, null, null);
        }
        int i35 = i33 + 1;
        int[] iArr10 = new int[i33];
        for (int i36 = 0; i36 < i33 - (zZze6 ? 1 : 0); i36++) {
            iArr10[i36] = zzfmVar.zzf(3);
        }
        int[] iArr11 = new int[i35];
        if (zZze6) {
            for (int i37 = 1; i37 < i33; i37++) {
                for (int i38 = 0; i38 < i37; i38++) {
                    iArr11[i37] = iArr11[i37] + iArr10[i38] + 1;
                }
            }
            iArr11[i33] = 6;
        }
        int[][] iArr12 = (int[][]) Array.newInstance((Class<?>) cls, i21, i33);
        int[] iArr13 = new int[i21];
        iArr13[0] = 0;
        boolean zZze8 = zzfmVar.zze();
        int i39 = 1;
        while (i39 < i21) {
            if (zZze8) {
                iArr13[i39] = zzfmVar.zzf(i23);
            } else {
                iArr13[i39] = i39;
            }
            if (zZze6) {
                i14 = i39;
                int i40 = 0;
                while (i40 < i33) {
                    int i41 = i40 + 1;
                    iArr12[i14][i40] = (iArr13[i14] & ((1 << iArr11[i41]) - 1)) >> iArr11[i40];
                    i40 = i41;
                }
            } else {
                int i42 = 0;
                while (i42 < i33) {
                    iArr12[i39][i42] = zzfmVar.zzf(iArr10[i42] + 1);
                    i42++;
                    i39 = i39;
                }
                i14 = i39;
            }
            i39 = i14 + 1;
            i23 = 6;
        }
        int[] iArr14 = new int[i25];
        int i43 = 1;
        int i44 = 0;
        while (i44 < i21) {
            iArr14[iArr13[i44]] = -1;
            int[] iArr15 = iArr14;
            int i45 = 0;
            int i46 = 0;
            while (i45 < 16) {
                if (zArr3[i45]) {
                    i13 = i24;
                    if (i45 == i13) {
                        iArr15[iArr13[i44]] = iArr12[i44][i46];
                        i45 = i13;
                    }
                    i46++;
                } else {
                    i13 = i24;
                }
                i45 += i13;
                i24 = i13;
            }
            if (i44 > 0) {
                int i47 = 0;
                while (true) {
                    if (i47 >= i44) {
                        i43++;
                        break;
                    }
                    if (iArr15[iArr13[i44]] == iArr15[iArr13[i47]]) {
                        break;
                    }
                    i47++;
                }
            }
            i44++;
            iArr14 = iArr15;
            i24 = 1;
        }
        int[] iArr16 = iArr14;
        int iZzf8 = zzfmVar.zzf(4);
        if (i43 < 2 || iZzf8 == 0) {
            return new zzfi(zzezVar4, null, zzfbVar, null, null);
        }
        int[] iArr17 = new int[i43];
        for (int i48 = 0; i48 < i43; i48++) {
            iArr17[i48] = zzfmVar.zzf(iZzf8);
        }
        int[] iArr18 = new int[i25];
        for (int i49 = 0; i49 < i21; i49++) {
            iArr18[Math.min(iArr13[i49], iZzf7)] = i49;
        }
        zzgjw zzgjwVar = new zzgjw();
        int i50 = 0;
        while (i50 <= iZzf7) {
            int[] iArr19 = iArr17;
            int i51 = i43;
            int iMin = Math.min(iArr16[i50], i51 - 1);
            int[] iArr20 = iArr18;
            zzgjwVar.zzf(new zzey(iArr20[i50], iMin >= 0 ? iArr19[iMin] : -1));
            i50++;
            i43 = i51;
            iArr17 = iArr19;
            iArr18 = iArr20;
        }
        zzgjz zzgjzVarZzi = zzgjwVar.zzi();
        if (((zzey) zzgjzVarZzi.get(0)).zzb == -1) {
            return new zzfi(zzezVar4, null, zzfbVar, null, null);
        }
        int i52 = 1;
        while (true) {
            zzez zzezVar5 = zzezVar4;
            if (i52 > iZzf7) {
                zzezVar4 = zzezVar5;
                i9 = -1;
                i52 = -1;
                break;
            }
            zzezVar4 = zzezVar5;
            i9 = -1;
            if (((zzey) zzgjzVarZzi.get(i52)).zzb != -1) {
                break;
            }
            i52++;
        }
        if (i52 == i9) {
            return new zzfi(zzezVar4, null, zzfbVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i21, i21);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i21, i21);
        int i53 = 1;
        while (i53 < i21) {
            boolean[][] zArr6 = zArr5;
            for (int i54 = 0; i54 < i53; i54++) {
                boolean[] zArr7 = zArr4[i53];
                boolean[] zArr8 = zArr6[i53];
                boolean zZze9 = zzfmVar.zze();
                zArr8[i54] = zZze9;
                zArr7[i54] = zZze9;
            }
            i53++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i55 = 1; i55 < i21; i55++) {
            int i56 = 0;
            while (i56 < iZzf5) {
                int i57 = i56;
                for (int i58 = 0; i58 < i55; i58++) {
                    boolean[] zArr10 = zArr9[i55];
                    if (zArr10[i58] && zArr9[i58][i57]) {
                        zArr10[i57] = true;
                        break;
                    }
                }
                i56 = i57 + 1;
            }
        }
        int[] iArr21 = new int[i25];
        int i59 = 0;
        while (i59 < i21) {
            int[] iArr22 = iArr21;
            int i60 = 0;
            for (int i61 = 0; i61 < i59; i61++) {
                i60 += zArr4[i59][i61] ? 1 : 0;
            }
            iArr22[iArr13[i59]] = i60;
            i59++;
            iArr21 = iArr22;
        }
        int[] iArr23 = iArr21;
        int i62 = 0;
        for (int i63 = 0; i63 < i21; i63++) {
            if (iArr23[iArr13[i63]] == 0) {
                i62++;
            }
        }
        if (i62 > 1) {
            return new zzfi(zzezVar4, null, zzfbVar, null, null);
        }
        int[] iArr24 = new int[i21];
        int[] iArr25 = new int[iZzg2];
        if (zzfmVar.zze()) {
            int i64 = 0;
            while (i64 < i21) {
                int i65 = i64;
                iArr24[i65] = zzfmVar.zzf(3);
                i64 = i65 + 1;
            }
        } else {
            Arrays.fill(iArr24, 0, i21, iZzf6);
        }
        int i66 = 0;
        while (i66 < iZzg2) {
            int[] iArr26 = iArr24;
            int i67 = i66;
            int[] iArr27 = iArr13;
            int iMax = 0;
            for (int i68 = 0; i68 < iArr4[i67]; i68++) {
                iMax = Math.max(iMax, iArr26[((zzey) zzgjzVarZzi.get(iArr9[i67][i68])).zza]);
            }
            iArr25[i67] = iMax + 1;
            i66 = i67 + 1;
            iArr24 = iArr26;
            iArr13 = iArr27;
        }
        int[] iArr28 = iArr13;
        if (zzfmVar.zze()) {
            int i69 = 0;
            while (i69 < iZzf5) {
                int i70 = i69 + 1;
                int i71 = i70;
                while (i71 < i21) {
                    if (zArr4[i71][i69]) {
                        zzfmVar.zzb(3);
                    }
                    i71++;
                    i69 = i69;
                }
                i69 = i70;
            }
        }
        zzfmVar.zza();
        int iZzg4 = zzfmVar.zzg() + 1;
        zzgjw zzgjwVar2 = new zzgjw();
        zzgjwVar2.zzf(zzfaVarZzl);
        if (iZzg4 > 1) {
            zzgjwVar2.zzf(zzfaVarZzl2);
            for (int i72 = 2; i72 < iZzg4; i72++) {
                zzfaVarZzl2 = zzl(zzfmVar, zzfmVar.zze(), iZzf6, zzfaVarZzl2);
                zzgjwVar2.zzf(zzfaVarZzl2);
            }
        }
        zzgjz zzgjzVarZzi2 = zzgjwVar2.zzi();
        int iZzg5 = zzfmVar.zzg() + iZzg2;
        if (iZzg5 > iZzg2) {
            return new zzfi(zzezVar4, null, zzfbVar, null, null);
        }
        int iZzf9 = zzfmVar.zzf(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) cls2, iZzg5, i25);
        int[] iArr29 = new int[iZzg5];
        int i73 = 0;
        int[] iArr30 = new int[iZzg5];
        int i74 = 0;
        while (i74 < iZzg2) {
            iArr29[i74] = i73;
            int i75 = i74;
            int i76 = iArr5[i75];
            iArr30[i75] = i76;
            if (iZzf9 == 0) {
                iArr = iArr5;
                zArr2 = zArr11;
                iArr2 = iArr29;
                Arrays.fill(zArr11[i75], i73, iArr4[i75], true);
                iArr2[i75] = iArr4[i75];
            } else {
                iArr = iArr5;
                zArr2 = zArr11;
                iArr2 = iArr29;
                if (iZzf9 == 1) {
                    for (int i77 = 0; i77 < iArr4[i75]; i77++) {
                        zArr2[i75][i77] = iArr9[i75][i77] == i76;
                    }
                    iArr2[i75] = 1;
                } else {
                    i73 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i74 = i75 + 1;
                iArr5 = iArr;
                zArr11 = zArr2;
                iArr29 = iArr2;
            }
            i73 = 0;
            i74 = i75 + 1;
            iArr5 = iArr;
            zArr11 = zArr2;
            iArr29 = iArr2;
        }
        boolean[][] zArr12 = zArr11;
        int[] iArr31 = iArr29;
        int[] iArr32 = new int[i25];
        int i78 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i25;
        iArr33[i73] = iZzg5;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i79 = 1;
        int i80 = 0;
        while (i79 < iZzg5) {
            if (iZzf9 == i78) {
                for (int i81 = 0; i81 < iArr4[i79]; i81++) {
                    zArr12[i79][i81] = zzfmVar.zze();
                    int i82 = iArr31[i79];
                    boolean z12 = zArr12[i79][i81];
                    iArr31[i79] = i82 + (z12 ? 1 : 0);
                    if (z12) {
                        iArr30[i79] = iArr9[i79][i81];
                    }
                }
            }
            if (i80 == 0) {
                i10 = 0;
                if (iArr9[i79][0] == 0 && zArr12[i79][0]) {
                    i80 = 0;
                    for (int i83 = 1; i83 < iArr4[i79]; i83++) {
                        if (iArr9[i79][i83] == i52 && zArr12[i79][i52]) {
                            i80 = i79;
                        }
                    }
                } else {
                    i80 = 0;
                }
            } else {
                i10 = 0;
            }
            int i84 = i10;
            while (i84 < iArr4[i79]) {
                if (iZzg4 > 1) {
                    zArr13[i79][i84] = zArr12[i79][i84];
                    zArr = zArr4;
                    i11 = iZzg4;
                    int iZzc = zzgmu.zzc(iZzg4, RoundingMode.CEILING);
                    if (zArr13[i79][i84]) {
                        i12 = iZzf9;
                        break;
                    }
                    int i85 = ((zzey) zzgjzVarZzi.get(iArr9[i79][i84])).zza;
                    int i86 = i10;
                    while (true) {
                        if (i86 >= i84) {
                            i12 = iZzf9;
                            break;
                        }
                        i12 = iZzf9;
                        if (zArr9[i85][((zzey) zzgjzVarZzi.get(iArr9[i79][i86])).zza]) {
                            zArr13[i79][i84] = true;
                            break;
                        }
                        i86++;
                        iZzf9 = i12;
                    }
                    if (zArr13[i79][i84]) {
                        if (i80 <= 0 || i79 != i80) {
                            zzfmVar.zzb(iZzc);
                        } else {
                            iArr32[i84] = zzfmVar.zzf(iZzc);
                        }
                    }
                } else {
                    i11 = iZzg4;
                    i12 = iZzf9;
                    zArr = zArr4;
                }
                i84++;
                zArr4 = zArr;
                iZzg4 = i11;
                iZzf9 = i12;
            }
            int i87 = iZzg4;
            int i88 = iZzf9;
            boolean[][] zArr14 = zArr4;
            if (iArr31[i79] == 1 && iArr23[iArr30[i79]] > 0) {
                zzfmVar.zza();
            }
            i79++;
            zArr4 = zArr14;
            iZzg4 = i87;
            iZzf9 = i88;
            i78 = 2;
        }
        boolean[][] zArr15 = zArr4;
        if (i80 == 0) {
            return new zzfi(zzezVar4, null, zzfbVar, null, null);
        }
        zzez zzezVar6 = zzezVar4;
        int iZzg6 = zzfmVar.zzg();
        int i89 = iZzg6 + 1;
        zzgjw zzgjwVarZzv = zzgjz.zzv(i89);
        int[] iArr34 = new int[i21];
        int i90 = 0;
        while (i90 < i89) {
            int iZzf10 = zzfmVar.zzf(16);
            zzgjz zzgjzVar = zzgjzVarZzi;
            int iZzf11 = zzfmVar.zzf(16);
            if (zzfmVar.zze()) {
                iZzf2 = zzfmVar.zzf(2);
                if (iZzf2 == 3) {
                    zzfmVar.zza();
                }
                iZzf3 = zzfmVar.zzf(4);
                iZzf4 = zzfmVar.zzf(4);
            } else {
                iZzf2 = 0;
                iZzf3 = 0;
                iZzf4 = 0;
            }
            if (zzfmVar.zze()) {
                int iZzg7 = zzfmVar.zzg();
                int iZzg8 = zzfmVar.zzg();
                int iZzg9 = zzfmVar.zzg();
                int iZzg10 = zzfmVar.zzg();
                iZzf10 = zzm(iZzf10, iZzf2, iZzg7, iZzg8);
                iZzf11 = zzn(iZzf11, iZzf2, iZzg9, iZzg10);
            }
            zzgjwVarZzv.zzf(new zzfc(iZzf2, iZzf3, iZzf4, iZzf10, iZzf11));
            i90++;
            zzgjzVarZzi = zzgjzVar;
            zArr13 = zArr13;
            zzezVar6 = zzezVar6;
            zzgjzVarZzi2 = zzgjzVarZzi2;
        }
        zzgjz zzgjzVar2 = zzgjzVarZzi;
        zzez zzezVar7 = zzezVar6;
        zzgjz zzgjzVar3 = zzgjzVarZzi2;
        boolean[][] zArr16 = zArr13;
        if (i89 <= 1 || !zzfmVar.zze()) {
            for (int i91 = 1; i91 < i21; i91++) {
                iArr34[i91] = Math.min(i91, iZzg6);
            }
        } else {
            int iZzc2 = zzgmu.zzc(i89, RoundingMode.CEILING);
            for (int i92 = 1; i92 < i21; i92++) {
                iArr34[i92] = zzfmVar.zzf(iZzc2);
            }
        }
        zzfd zzfdVar = new zzfd(zzgjwVarZzv.zzi(), iArr34);
        zzfmVar.zzb(2);
        for (int i93 = 1; i93 < i21; i93++) {
            if (iArr23[iArr28[i93]] == 0) {
                zzfmVar.zza();
            }
        }
        for (int i94 = 1; i94 < iZzg5; i94++) {
            boolean zZze10 = zzfmVar.zze();
            int i95 = 0;
            while (i95 < iArr25[i94]) {
                if ((i95 <= 0 || !zZze10) ? i95 == 0 : zzfmVar.zze()) {
                    for (int i96 = 0; i96 < iArr4[i94]; i96++) {
                        if (zArr16[i94][i96]) {
                            zzfmVar.zzg();
                        }
                    }
                    zzfmVar.zzg();
                    zzfmVar.zzg();
                }
                i95++;
            }
        }
        int iZzg11 = zzfmVar.zzg() + 2;
        if (zzfmVar.zze()) {
            zzfmVar.zzb(iZzg11);
        } else {
            for (int i97 = 1; i97 < i21; i97++) {
                for (int i98 = 0; i98 < i97; i98++) {
                    if (zArr15[i97][i98]) {
                        zzfmVar.zzb(iZzg11);
                    }
                }
            }
        }
        int iZzg12 = zzfmVar.zzg();
        for (int i99 = 1; i99 <= iZzg12; i99++) {
            zzfmVar.zzb(8);
        }
        if (zzfmVar.zze()) {
            zzfmVar.zzc();
            if (zzfmVar.zze() || zzfmVar.zze()) {
                zzfmVar.zza();
            }
            boolean zZze11 = zzfmVar.zze();
            boolean zZze12 = zzfmVar.zze();
            if (zZze11 || zZze12) {
                for (int i100 = 0; i100 < iZzg2; i100++) {
                    for (int i101 = 0; i101 < iArr25[i100]; i101++) {
                        boolean zZze13 = zZze11 ? zzfmVar.zze() : false;
                        boolean zZze14 = zZze12 ? zzfmVar.zze() : false;
                        if (zZze13) {
                            zzfmVar.zzb(32);
                        }
                        if (zZze14) {
                            zzfmVar.zzb(18);
                        }
                    }
                }
            }
            boolean zZze15 = zzfmVar.zze();
            if (zZze15) {
                z7 = true;
                iZzf = zzfmVar.zzf(4) + 1;
            } else {
                z7 = true;
                iZzf = i21;
            }
            zzgjw zzgjwVarZzv2 = zzgjz.zzv(iZzf);
            int[] iArr35 = new int[i21];
            int i102 = 0;
            while (i102 < iZzf) {
                zzfmVar.zzb(3);
                int i103 = z7 != zzfmVar.zze() ? 2 : 1;
                int iZzb = zzh.zzb(zzfmVar.zzf(8));
                int iZzc3 = zzh.zzc(zzfmVar.zzf(8));
                zzfmVar.zzb(8);
                zzgjwVarZzv2.zzf(new zzfg(iZzb, i103, iZzc3));
                i102++;
                z7 = true;
            }
            if (zZze15 && iZzf > 1) {
                for (int i104 = 0; i104 < i21; i104++) {
                    iArr35[i104] = zzfmVar.zzf(4);
                }
            }
            zzfhVar = new zzfh(zzgjwVarZzv2.zzi(), iArr35);
        } else {
            zzfhVar = null;
        }
        return new zzfi(zzezVar7, zzgjzVar2, new zzfb(zzgjzVar3, iArr32), zzfdVar, zzfhVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:195:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    public static zzff zzf(byte[] bArr, int i7, int i8, zzfi zzfiVar) {
        boolean z7;
        int i9;
        int i10;
        int iZzn;
        int iZzm;
        int iZzg;
        int i11;
        int i12;
        int i13;
        int i14;
        int iZzg2;
        int i15;
        int iMax;
        float f7;
        int i16;
        int i17;
        int i18;
        int iZzb;
        int iZzc;
        int i19;
        zzfh zzfhVar;
        int i20;
        zzfd zzfdVar;
        zzez zzezVarZzk = zzk(new zzfm(bArr, i7, i8));
        zzfm zzfmVar = new zzfm(bArr, i7 + 2, i8);
        zzfmVar.zzb(4);
        int iZzf = zzfmVar.zzf(3);
        int i21 = zzezVarZzk.zzb;
        if (i21 == 0 || iZzf != 7) {
            z7 = false;
        } else {
            iZzf = 7;
            z7 = true;
        }
        if (zzfiVar != null) {
            zzgjz zzgjzVar = zzfiVar.zza;
            if (zzgjzVar.isEmpty()) {
                i9 = 0;
            } else {
                i9 = ((zzey) zzgjzVar.get(Math.min(i21, zzgjzVar.size() - 1))).zza;
            }
        } else {
            i9 = 0;
        }
        zzfa zzfaVarZzl = null;
        if (!z7) {
            zzfmVar.zza();
            zzfaVarZzl = zzl(zzfmVar, true, iZzf, null);
        } else if (zzfiVar != null) {
            zzfb zzfbVar = zzfiVar.zzb;
            int i22 = zzfbVar.zzb[i9];
            zzgjz zzgjzVar2 = zzfbVar.zza;
            if (zzgjzVar2.size() > i22) {
                zzfaVarZzl = (zzfa) zzgjzVar2.get(i22);
            }
        }
        int iZzg3 = zzfmVar.zzg();
        if (z7) {
            int iZzf2 = zzfmVar.zze() ? zzfmVar.zzf(8) : -1;
            if (zzfiVar == null || (zzfdVar = zzfiVar.zzc) == null) {
                i12 = 0;
                i14 = 0;
                iZzg = 0;
                i15 = 0;
                iZzg2 = 0;
                i11 = 0;
                i13 = 0;
            } else {
                if (iZzf2 == -1) {
                    iZzf2 = zzfdVar.zzb[i9];
                }
                if (iZzf2 != -1) {
                    zzgjz zzgjzVar3 = zzfdVar.zza;
                    if (zzgjzVar3.size() > iZzf2) {
                        zzfc zzfcVar = (zzfc) zzgjzVar3.get(iZzf2);
                        int i23 = zzfcVar.zza;
                        i13 = zzfcVar.zzd;
                        i11 = zzfcVar.zze;
                        iZzg = zzfcVar.zzb;
                        iZzg2 = zzfcVar.zzc;
                        i15 = i23;
                        i12 = i11;
                        i14 = i13;
                    } else {
                        i12 = 0;
                        i14 = 0;
                        iZzg = 0;
                        i15 = 0;
                        iZzg2 = 0;
                        i11 = 0;
                        i13 = 0;
                    }
                } else {
                    i12 = 0;
                    i14 = 0;
                    iZzg = 0;
                    i15 = 0;
                    iZzg2 = 0;
                    i11 = 0;
                    i13 = 0;
                }
            }
        } else {
            int iZzg4 = zzfmVar.zzg();
            if (iZzg4 == 3) {
                zzfmVar.zza();
                i10 = 3;
            } else {
                i10 = iZzg4;
            }
            int iZzg5 = zzfmVar.zzg();
            int iZzg6 = zzfmVar.zzg();
            if (zzfmVar.zze()) {
                int iZzg7 = zzfmVar.zzg();
                int iZzg8 = zzfmVar.zzg();
                int iZzg9 = zzfmVar.zzg();
                int iZzg10 = zzfmVar.zzg();
                iZzm = zzm(iZzg5, i10, iZzg7, iZzg8);
                iZzn = zzn(iZzg6, i10, iZzg9, iZzg10);
            } else {
                iZzn = iZzg6;
                iZzm = iZzg5;
            }
            iZzg = zzfmVar.zzg();
            i11 = iZzn;
            i12 = iZzg6;
            i13 = iZzm;
            i14 = iZzg5;
            iZzg2 = zzfmVar.zzg();
            i15 = iZzg4;
        }
        int iZzg11 = zzfmVar.zzg();
        if (z7) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i24 = true != zzfmVar.zze() ? iZzf : 0; i24 <= iZzf; i24++) {
                zzfmVar.zzg();
                iMax = Math.max(zzfmVar.zzg(), iMax);
                zzfmVar.zzg();
            }
        }
        zzfmVar.zzg();
        zzfmVar.zzg();
        zzfmVar.zzg();
        zzfmVar.zzg();
        zzfmVar.zzg();
        zzfmVar.zzg();
        if (zzfmVar.zze()) {
            if (z7 && zzfmVar.zze()) {
                zzfmVar.zzb(6);
            } else if (zzfmVar.zze()) {
                int i25 = 0;
                int i26 = 4;
                while (i25 < i26) {
                    int i27 = iMax;
                    int i28 = i26;
                    for (int i29 = 0; i29 < 6; i29 += i25 == 3 ? 3 : 1) {
                        if (zzfmVar.zze()) {
                            int iMin = Math.min(64, 1 << ((i25 + i25) + 4));
                            if (i25 > 1) {
                                zzfmVar.zzh();
                            }
                            for (int i30 = 0; i30 < iMin; i30++) {
                                zzfmVar.zzh();
                            }
                        } else {
                            zzfmVar.zzg();
                        }
                    }
                    i25++;
                    iMax = i27;
                    i26 = i28;
                }
            }
        }
        int i31 = iMax;
        zzfmVar.zzb(2);
        if (zzfmVar.zze()) {
            zzfmVar.zzb(8);
            zzfmVar.zzg();
            zzfmVar.zzg();
            zzfmVar.zza();
        }
        int iZzg12 = zzfmVar.zzg();
        int i32 = 0;
        int[] iArr = new int[0];
        int i33 = iZzf;
        int[] iArrCopyOf = new int[0];
        int i34 = iZzg;
        int i35 = -1;
        int i36 = -1;
        while (i32 < iZzg12) {
            if (i32 == 0 || !zzfmVar.zze()) {
                int iZzg13 = zzfmVar.zzg();
                int iZzg14 = zzfmVar.zzg();
                int[] iArr2 = new int[iZzg13];
                int i37 = 0;
                while (i37 < iZzg13) {
                    iArr2[i37] = (i37 > 0 ? iArr2[i37 - 1] : 0) - (zzfmVar.zzg() + 1);
                    zzfmVar.zza();
                    i37++;
                }
                int[] iArr3 = new int[iZzg14];
                int i38 = 0;
                while (i38 < iZzg14) {
                    iArr3[i38] = (i38 > 0 ? iArr3[i38 - 1] : 0) + zzfmVar.zzg() + 1;
                    zzfmVar.zza();
                    i38++;
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i35 = iZzg13;
                i36 = iZzg14;
            } else {
                int i39 = i35 + i36;
                boolean zZze = zzfmVar.zze();
                boolean z8 = true;
                int iZzg15 = zzfmVar.zzg() + 1;
                int i40 = 1 - ((zZze ? 1 : 0) + (zZze ? 1 : 0));
                int i41 = i39 + 1;
                boolean[] zArr = new boolean[i41];
                int i42 = 0;
                while (i42 <= i39) {
                    if (zzfmVar.zze()) {
                        zArr[i42] = z8;
                    } else {
                        zArr[i42] = zzfmVar.zze();
                    }
                    i42++;
                    z8 = true;
                }
                int i43 = i36 - 1;
                int[] iArr4 = new int[i41];
                int[] iArr5 = new int[i41];
                int i44 = 0;
                while (true) {
                    i20 = i40 * iZzg15;
                    if (i43 < 0) {
                        break;
                    }
                    int i45 = iArrCopyOf[i43] + i20;
                    if (i45 < 0 && zArr[i35 + i43]) {
                        iArr4[i44] = i45;
                        i44++;
                    }
                    i43--;
                }
                if (i20 < 0 && zArr[i39]) {
                    iArr4[i44] = i20;
                    i44++;
                }
                int i46 = i44;
                for (int i47 = 0; i47 < i35; i47++) {
                    int i48 = iArr[i47] + i20;
                    if (i48 < 0 && zArr[i47]) {
                        iArr4[i46] = i48;
                        i46++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i46);
                int i49 = 0;
                for (int i50 = i35 - 1; i50 >= 0; i50--) {
                    int i51 = iArr[i50] + i20;
                    if (i51 > 0 && zArr[i50]) {
                        iArr5[i49] = i51;
                        i49++;
                    }
                }
                if (i20 > 0 && zArr[i39]) {
                    iArr5[i49] = i20;
                    i49++;
                }
                int i52 = i49;
                for (int i53 = 0; i53 < i36; i53++) {
                    int i54 = iArrCopyOf[i53] + i20;
                    if (i54 > 0 && zArr[i35 + i53]) {
                        iArr5[i52] = i54;
                        i52++;
                    }
                }
                iArr = iArrCopyOf2;
                iArrCopyOf = Arrays.copyOf(iArr5, i52);
                i35 = i46;
                i36 = i52;
            }
            i32++;
            iZzg12 = iZzg12;
            i9 = i9;
            zzezVarZzk = zzezVarZzk;
        }
        zzez zzezVar = zzezVarZzk;
        int i55 = i9;
        if (zzfmVar.zze()) {
            int iZzg16 = zzfmVar.zzg();
            for (int i56 = 0; i56 < iZzg16; i56++) {
                zzfmVar.zzb(iZzg11 + 5);
            }
        }
        zzfmVar.zzb(2);
        float f8 = 1.0f;
        if (zzfmVar.zze()) {
            if (zzfmVar.zze()) {
                int iZzf3 = zzfmVar.zzf(8);
                if (iZzf3 == 255) {
                    int iZzf4 = zzfmVar.zzf(16);
                    int iZzf5 = zzfmVar.zzf(16);
                    if (iZzf4 != 0 && iZzf5 != 0) {
                        f8 = iZzf4 / iZzf5;
                    }
                } else if (iZzf3 < 17) {
                    f8 = zzb[iZzf3];
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzf3).length() + 35);
                    sb.append("Unexpected aspect_ratio_idc value: ");
                    sb.append(iZzf3);
                    zzds.zzc("NalUnitUtil", sb.toString());
                }
            }
            if (zzfmVar.zze()) {
                zzfmVar.zza();
            }
            if (zzfmVar.zze()) {
                zzfmVar.zzb(3);
                i19 = true != zzfmVar.zze() ? 2 : 1;
                if (zzfmVar.zze()) {
                    int iZzf6 = zzfmVar.zzf(8);
                    int iZzf7 = zzfmVar.zzf(8);
                    zzfmVar.zzb(8);
                    iZzb = zzh.zzb(iZzf6);
                    iZzc = zzh.zzc(iZzf7);
                } else {
                    iZzb = -1;
                    iZzc = -1;
                }
            } else if (zzfiVar == null || (zzfhVar = zzfiVar.zzd) == null) {
                iZzb = -1;
                iZzc = -1;
                i19 = -1;
            } else {
                int i57 = zzfhVar.zzb[i55];
                zzgjz zzgjzVar4 = zzfhVar.zza;
                if (zzgjzVar4.size() > i57) {
                    zzfg zzfgVar = (zzfg) zzgjzVar4.get(i57);
                    int i58 = zzfgVar.zza;
                    int i59 = zzfgVar.zzb;
                    iZzc = zzfgVar.zzc;
                    iZzb = i58;
                    i19 = i59;
                } else {
                    iZzb = -1;
                    iZzc = -1;
                    i19 = -1;
                }
            }
            if (zzfmVar.zze()) {
                zzfmVar.zzg();
                zzfmVar.zzg();
            }
            zzfmVar.zza();
            if (zzfmVar.zze()) {
                i11 += i11;
            }
            i16 = iZzb;
            f7 = f8;
            i18 = iZzc;
            i17 = i19;
        } else {
            f7 = 1.0f;
            i16 = -1;
            i17 = -1;
            i18 = -1;
        }
        return new zzff(zzezVar, i33, zzfaVarZzl, i15, i34, iZzg2, iZzg3, i13, i11, i14, i12, f7, i31, i16, i17, i18);
    }

    public static zzfj zzg(byte[] bArr, int i7, int i8) {
        zzfm zzfmVar = new zzfm(bArr, 4, i8);
        int iZzg = zzfmVar.zzg();
        int iZzg2 = zzfmVar.zzg();
        zzfmVar.zza();
        return new zzfj(iZzg, iZzg2, zzfmVar.zze());
    }

    public static int zzh(byte[] bArr, int i7, int i8, boolean[] zArr) {
        int i9 = i8 - i7;
        zzghc.zzh(i9 >= 0);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            zzi(zArr);
            return i7 - 3;
        }
        if (i9 > 1 && zArr[1] && bArr[i7] == 1) {
            zzi(zArr);
            return i7 - 2;
        }
        if (i9 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            zzi(zArr);
            return i7 - 1;
        }
        int i10 = i8 - 1;
        int i11 = i7 + 2;
        while (i11 < i10) {
            byte b7 = bArr[i11];
            if ((b7 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b7 == 1) {
                    zzi(zArr);
                    return i12;
                }
                i11 = i12;
            }
            i11 += 3;
        }
        zArr[0] = i9 <= 2 ? !(i9 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i8 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i8 + (-3)] == 0 && bArr[i8 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i8 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i8;
    }

    public static void zzi(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String zzj(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            byte[] bArr = (byte[]) list.get(i7);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i8 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                int i9 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i9 >= length2) {
                        break;
                    }
                    int iZzh = zzh(bArr, i9, length2, zArr);
                    if (iZzh != length2) {
                        zzgjwVar.zzf(Integer.valueOf(iZzh));
                    }
                    i9 = iZzh + 3;
                }
                zzgjz zzgjzVarZzi = zzgjwVar.zzi();
                for (int i10 = 0; i10 < zzgjzVarZzi.size(); i10++) {
                    if (((Integer) zzgjzVarZzi.get(i10)).intValue() + 3 < length) {
                        zzfm zzfmVar = new zzfm(bArr, ((Integer) zzgjzVarZzi.get(i10)).intValue() + 3, length);
                        zzez zzezVarZzk = zzk(zzfmVar);
                        if (zzezVarZzk.zza == 33 && zzezVarZzk.zzb == 0) {
                            zzfmVar.zzb(4);
                            int iZzf = zzfmVar.zzf(3);
                            zzfmVar.zza();
                            zzfa zzfaVarZzl = zzl(zzfmVar, true, iZzf, null);
                            return zzdc.zzc(zzfaVarZzl.zza, zzfaVarZzl.zzb, zzfaVarZzl.zzc, zzfaVarZzl.zzd, zzfaVarZzl.zze, zzfaVarZzl.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static zzez zzk(zzfm zzfmVar) {
        zzfmVar.zza();
        return new zzez(zzfmVar.zzf(6), zzfmVar.zzf(6), zzfmVar.zzf(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    private static zzfa zzl(zzfm zzfmVar, boolean z7, int i7, zzfa zzfaVar) {
        int[] iArr;
        int i8;
        boolean z8;
        int i9;
        int i10;
        boolean zZze;
        int iZzf;
        int i11;
        int i12;
        int[] iArr2 = new int[6];
        if (!z7) {
            if (zzfaVar != null) {
                int i13 = zzfaVar.zza;
                zZze = zzfaVar.zzb;
                iZzf = zzfaVar.zzc;
                i11 = zzfaVar.zzd;
                iArr2 = zzfaVar.zze;
                i8 = i13;
            } else {
                iArr = iArr2;
                i8 = 0;
                z8 = false;
                i9 = 0;
                i10 = 0;
            }
            int iZzf2 = zzfmVar.zzf(8);
            i12 = 0;
            for (int i14 = 0; i14 < i7; i14++) {
                if (zzfmVar.zze()) {
                    i12 += 88;
                }
                if (zzfmVar.zze()) {
                    i12 += 8;
                }
            }
            zzfmVar.zzb(i12);
            if (i7 > 0) {
                int i15 = 8 - i7;
                zzfmVar.zzb(i15 + i15);
            }
            return new zzfa(i8, z8, i9, i10, iArr, iZzf2);
        }
        int iZzf3 = zzfmVar.zzf(2);
        zZze = zzfmVar.zze();
        iZzf = zzfmVar.zzf(5);
        i11 = 0;
        for (int i16 = 0; i16 < 32; i16++) {
            if (zzfmVar.zze()) {
                i11 |= 1 << i16;
            }
        }
        for (int i17 = 0; i17 < 6; i17++) {
            iArr2[i17] = zzfmVar.zzf(8);
        }
        i8 = iZzf3;
        iArr = iArr2;
        z8 = zZze;
        i9 = iZzf;
        i10 = i11;
        int iZzf4 = zzfmVar.zzf(8);
        i12 = 0;
        while (i14 < i7) {
            if (zzfmVar.zze()) {
                i12 += 88;
            }
            if (zzfmVar.zze()) {
                i12 += 8;
            }
        }
        zzfmVar.zzb(i12);
        if (i7 > 0) {
            int i18 = 8 - i7;
            zzfmVar.zzb(i18 + i18);
        }
        return new zzfa(i8, z8, i9, i10, iArr, iZzf4);
    }

    private static int zzm(int i7, int i8, int i9, int i10) {
        int i11 = 2;
        if (i8 != 1 && i8 != 2) {
            i11 = 1;
        }
        return i7 - (i11 * (i9 + i10));
    }

    private static int zzn(int i7, int i8, int i9, int i10) {
        return i7 - ((i8 == 1 ? 2 : 1) * (i9 + i10));
    }

    private static void zzo(zzfm zzfmVar) {
        int iZzg = zzfmVar.zzg() + 1;
        zzfmVar.zzb(8);
        for (int i7 = 0; i7 < iZzg; i7++) {
            zzfmVar.zzg();
            zzfmVar.zzg();
            zzfmVar.zza();
        }
        zzfmVar.zzb(20);
    }
}

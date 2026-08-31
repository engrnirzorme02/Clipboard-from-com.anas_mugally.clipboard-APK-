package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
final class zzajr {
    private static volatile int zza = 100;

    static double zza(byte[] bArr, int i7) {
        return Double.longBitsToDouble(zzd(bArr, i7));
    }

    static float zzb(byte[] bArr, int i7) {
        return Float.intBitsToFloat(zzc(bArr, i7));
    }

    static int zzc(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    static int zzd(byte[] bArr, int i7, zzaju zzajuVar) {
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        if (j7 >= 0) {
            zzajuVar.zzb = j7;
            return i8;
        }
        int i9 = i7 + 2;
        byte b7 = bArr[i8];
        long j8 = (j7 & 127) | (((long) (b7 & 127)) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            i10 += 7;
            j8 |= ((long) (b8 & 127)) << i10;
            b7 = b8;
            i9 = i11;
        }
        zzajuVar.zzb = j8;
        return i9;
    }

    static int zza(byte[] bArr, int i7, zzaju zzajuVar) {
        int iZzc = zzc(bArr, i7, zzajuVar);
        int i8 = zzajuVar.zza;
        if (i8 < 0) {
            throw zzall.zzf();
        }
        if (i8 > bArr.length - iZzc) {
            throw zzall.zzj();
        }
        if (i8 == 0) {
            zzajuVar.zzc = zzajv.zza;
            return iZzc;
        }
        zzajuVar.zzc = zzajv.zza(bArr, iZzc, i8);
        return iZzc + i8;
    }

    static int zzb(zzanb<?> zzanbVar, int i7, byte[] bArr, int i8, int i9, zzalm<?> zzalmVar, zzaju zzajuVar) {
        int iZza = zza(zzanbVar, bArr, i8, i9, zzajuVar);
        zzalmVar.add(zzajuVar.zzc);
        while (iZza < i9) {
            int iZzc = zzc(bArr, iZza, zzajuVar);
            if (i7 != zzajuVar.zza) {
                break;
            }
            iZza = zza(zzanbVar, bArr, iZzc, i9, zzajuVar);
            zzalmVar.add(zzajuVar.zzc);
        }
        return iZza;
    }

    static int zzc(byte[] bArr, int i7, zzaju zzajuVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zza(b7, bArr, i8, zzajuVar);
        }
        zzajuVar.zza = b7;
        return i8;
    }

    static long zzd(byte[] bArr, int i7) {
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    static int zzb(byte[] bArr, int i7, zzaju zzajuVar) {
        int iZzc = zzc(bArr, i7, zzajuVar);
        int i8 = zzajuVar.zza;
        if (i8 < 0) {
            throw zzall.zzf();
        }
        if (i8 == 0) {
            zzajuVar.zzc = "";
            return iZzc;
        }
        zzajuVar.zzc = zzaoa.zzb(bArr, iZzc, i8);
        return iZzc + i8;
    }

    static int zza(int i7, byte[] bArr, int i8, int i9, Object obj, zzamm zzammVar, zzanu<zzanx, zzanx> zzanuVar, zzaju zzajuVar) {
        if (zzajuVar.zzd.zza(zzammVar, i7 >>> 3) == null) {
            return zza(i7, bArr, i8, i9, zzamq.zzc(obj), zzajuVar);
        }
        zzalf.zzd zzdVar = (zzalf.zzd) obj;
        zzdVar.zza();
        zzakx<zzalf.zzc> zzakxVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    private static <T> int zza(zzanb<T> zzanbVar, byte[] bArr, int i7, int i8, int i9, zzaju zzajuVar) {
        T tZza = zzanbVar.zza();
        int iZza = zza(tZza, zzanbVar, bArr, i7, i8, i9, zzajuVar);
        zzanbVar.zzd(tZza);
        zzajuVar.zzc = tZza;
        return iZza;
    }

    static int zza(zzanb<?> zzanbVar, int i7, byte[] bArr, int i8, int i9, zzalm<Object> zzalmVar, zzaju zzajuVar) {
        int i10 = (i7 & (-8)) | 4;
        int iZza = zza(zzanbVar, bArr, i8, i9, i10, zzajuVar);
        zzalmVar.add(zzajuVar.zzc);
        while (iZza < i9) {
            int iZzc = zzc(bArr, iZza, zzajuVar);
            if (i7 != zzajuVar.zza) {
                break;
            }
            iZza = zza(zzanbVar, bArr, iZzc, i9, i10, zzajuVar);
            zzalmVar.add(zzajuVar.zzc);
        }
        return iZza;
    }

    static <T> int zza(zzanb<T> zzanbVar, byte[] bArr, int i7, int i8, zzaju zzajuVar) {
        T tZza = zzanbVar.zza();
        int iZza = zza(tZza, zzanbVar, bArr, i7, i8, zzajuVar);
        zzanbVar.zzd(tZza);
        zzajuVar.zzc = tZza;
        return iZza;
    }

    static int zza(byte[] bArr, int i7, zzalm<?> zzalmVar, zzaju zzajuVar) {
        zzali zzaliVar = (zzali) zzalmVar;
        int iZzc = zzc(bArr, i7, zzajuVar);
        int i8 = zzajuVar.zza + iZzc;
        while (iZzc < i8) {
            iZzc = zzc(bArr, iZzc, zzajuVar);
            zzaliVar.zzc(zzajuVar.zza);
        }
        if (iZzc == i8) {
            return iZzc;
        }
        throw zzall.zzj();
    }

    static int zza(int i7, byte[] bArr, int i8, int i9, zzanx zzanxVar, zzaju zzajuVar) {
        if ((i7 >>> 3) == 0) {
            throw zzall.zzc();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iZzd = zzd(bArr, i8, zzajuVar);
            zzanxVar.zza(i7, Long.valueOf(zzajuVar.zzb));
            return iZzd;
        }
        if (i10 == 1) {
            zzanxVar.zza(i7, Long.valueOf(zzd(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iZzc = zzc(bArr, i8, zzajuVar);
            int i11 = zzajuVar.zza;
            if (i11 >= 0) {
                if (i11 > bArr.length - iZzc) {
                    throw zzall.zzj();
                }
                if (i11 == 0) {
                    zzanxVar.zza(i7, zzajv.zza);
                } else {
                    zzanxVar.zza(i7, zzajv.zza(bArr, iZzc, i11));
                }
                return iZzc + i11;
            }
            throw zzall.zzf();
        }
        if (i10 != 3) {
            if (i10 == 5) {
                zzanxVar.zza(i7, Integer.valueOf(zzc(bArr, i8)));
                return i8 + 4;
            }
            throw zzall.zzc();
        }
        zzanx zzanxVarZzd = zzanx.zzd();
        int i12 = (i7 & (-8)) | 4;
        int i13 = zzajuVar.zze + 1;
        zzajuVar.zze = i13;
        zza(i13);
        int i14 = 0;
        while (i8 < i9) {
            int iZzc2 = zzc(bArr, i8, zzajuVar);
            i14 = zzajuVar.zza;
            if (i14 == i12) {
                i8 = iZzc2;
                break;
            }
            i8 = zza(i14, bArr, iZzc2, i9, zzanxVarZzd, zzajuVar);
        }
        zzajuVar.zze--;
        if (i8 <= i9 && i14 == i12) {
            zzanxVar.zza(i7, zzanxVarZzd);
            return i8;
        }
        throw zzall.zzg();
    }

    static int zza(int i7, byte[] bArr, int i8, zzaju zzajuVar) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            zzajuVar.zza = i9 | (b7 << 7);
            return i10;
        }
        int i11 = i9 | ((b7 & 127) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            zzajuVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzajuVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzajuVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzajuVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    static int zza(int i7, byte[] bArr, int i8, int i9, zzalm<?> zzalmVar, zzaju zzajuVar) {
        zzali zzaliVar = (zzali) zzalmVar;
        int iZzc = zzc(bArr, i8, zzajuVar);
        zzaliVar.zzc(zzajuVar.zza);
        while (iZzc < i9) {
            int iZzc2 = zzc(bArr, iZzc, zzajuVar);
            if (i7 != zzajuVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzajuVar);
            zzaliVar.zzc(zzajuVar.zza);
        }
        return iZzc;
    }

    static <T> int zza(Object obj, zzanb<T> zzanbVar, byte[] bArr, int i7, int i8, int i9, zzaju zzajuVar) {
        int i10 = zzajuVar.zze + 1;
        zzajuVar.zze = i10;
        zza(i10);
        int iZza = ((zzamq) zzanbVar).zza(obj, bArr, i7, i8, i9, zzajuVar);
        zzajuVar.zze--;
        zzajuVar.zzc = obj;
        return iZza;
    }

    static <T> int zza(Object obj, zzanb<T> zzanbVar, byte[] bArr, int i7, int i8, zzaju zzajuVar) {
        int iZza = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iZza = zza(i9, bArr, iZza, zzajuVar);
            i9 = zzajuVar.zza;
        }
        int i10 = iZza;
        if (i9 >= 0 && i9 <= i8 - i10) {
            int i11 = zzajuVar.zze + 1;
            zzajuVar.zze = i11;
            zza(i11);
            int i12 = i10 + i9;
            zzanbVar.zza(obj, bArr, i10, i12, zzajuVar);
            zzajuVar.zze--;
            zzajuVar.zzc = obj;
            return i12;
        }
        throw zzall.zzj();
    }

    static int zza(int i7, byte[] bArr, int i8, int i9, zzaju zzajuVar) {
        if ((i7 >>> 3) == 0) {
            throw zzall.zzc();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            return zzd(bArr, i8, zzajuVar);
        }
        if (i10 == 1) {
            return i8 + 8;
        }
        if (i10 == 2) {
            return zzc(bArr, i8, zzajuVar) + zzajuVar.zza;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i8 + 4;
            }
            throw zzall.zzc();
        }
        int i11 = (i7 & (-8)) | 4;
        int i12 = 0;
        while (i8 < i9) {
            i8 = zzc(bArr, i8, zzajuVar);
            i12 = zzajuVar.zza;
            if (i12 == i11) {
                break;
            }
            i8 = zza(i12, bArr, i8, i9, zzajuVar);
        }
        if (i8 > i9 || i12 != i11) {
            throw zzall.zzg();
        }
        return i8;
    }

    private static void zza(int i7) throws zzall {
        if (i7 >= zza) {
            throw zzall.zzh();
        }
    }
}

package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
final class zzdu {
    static int zza(byte[] bArr, int i7, zzdt zzdtVar) {
        int iZzh = zzh(bArr, i7, zzdtVar);
        int i8 = zzdtVar.zza;
        if (i8 < 0) {
            throw zzfb.zzc();
        }
        if (i8 > bArr.length - iZzh) {
            throw zzfb.zzf();
        }
        if (i8 == 0) {
            zzdtVar.zzc = zzef.zzb;
            return iZzh;
        }
        zzdtVar.zzc = zzef.zzk(bArr, iZzh, i8);
        return iZzh + i8;
    }

    static int zzb(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    static int zzc(zzgi zzgiVar, byte[] bArr, int i7, int i8, int i9, zzdt zzdtVar) {
        Object objZzd = zzgiVar.zzd();
        int iZzl = zzl(objZzd, zzgiVar, bArr, i7, i8, i9, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzl;
    }

    static int zzd(zzgi zzgiVar, byte[] bArr, int i7, int i8, zzdt zzdtVar) {
        Object objZzd = zzgiVar.zzd();
        int iZzm = zzm(objZzd, zzgiVar, bArr, i7, i8, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzm;
    }

    static int zze(zzgi zzgiVar, int i7, byte[] bArr, int i8, int i9, zzez zzezVar, zzdt zzdtVar) {
        int iZzd = zzd(zzgiVar, bArr, i8, i9, zzdtVar);
        zzezVar.add(zzdtVar.zzc);
        while (iZzd < i9) {
            int iZzh = zzh(bArr, iZzd, zzdtVar);
            if (i7 != zzdtVar.zza) {
                break;
            }
            iZzd = zzd(zzgiVar, bArr, iZzh, i9, zzdtVar);
            zzezVar.add(zzdtVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i7, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i7, zzdtVar);
        int i8 = zzdtVar.zza + iZzh;
        while (iZzh < i8) {
            iZzh = zzh(bArr, iZzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (iZzh == i8) {
            return iZzh;
        }
        throw zzfb.zzf();
    }

    static int zzg(int i7, byte[] bArr, int i8, int i9, zzha zzhaVar, zzdt zzdtVar) {
        if ((i7 >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iZzk = zzk(bArr, i8, zzdtVar);
            zzhaVar.zzh(i7, Long.valueOf(zzdtVar.zzb));
            return iZzk;
        }
        if (i10 == 1) {
            zzhaVar.zzh(i7, Long.valueOf(zzn(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iZzh = zzh(bArr, i8, zzdtVar);
            int i11 = zzdtVar.zza;
            if (i11 < 0) {
                throw zzfb.zzc();
            }
            if (i11 > bArr.length - iZzh) {
                throw zzfb.zzf();
            }
            if (i11 == 0) {
                zzhaVar.zzh(i7, zzef.zzb);
            } else {
                zzhaVar.zzh(i7, zzef.zzk(bArr, iZzh, i11));
            }
            return iZzh + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i7, Integer.valueOf(zzb(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        zzha zzhaVarZzd = zzha.zzd();
        int i13 = 0;
        while (i8 < i9) {
            int iZzh2 = zzh(bArr, i8, zzdtVar);
            i13 = zzdtVar.zza;
            if (i13 == i12) {
                i8 = iZzh2;
                break;
            }
            i8 = zzg(i13, bArr, iZzh2, i9, zzhaVarZzd, zzdtVar);
        }
        if (i8 > i9 || i13 != i12) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i7, zzhaVarZzd);
        return i8;
    }

    static int zzh(byte[] bArr, int i7, zzdt zzdtVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zzi(b7, bArr, i8, zzdtVar);
        }
        zzdtVar.zza = b7;
        return i8;
    }

    static int zzi(int i7, byte[] bArr, int i8, zzdt zzdtVar) {
        byte b7 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b7 >= 0) {
            zzdtVar.zza = i10 | (b7 << 7);
            return i9;
        }
        int i11 = i10 | ((b7 & 127) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzdtVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzdtVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzdtVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzdtVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    static int zzj(int i7, byte[] bArr, int i8, int i9, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i8, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (iZzh < i9) {
            int iZzh2 = zzh(bArr, iZzh, zzdtVar);
            if (i7 != zzdtVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i7, zzdt zzdtVar) {
        long j7 = bArr[i7];
        int i8 = i7 + 1;
        if (j7 >= 0) {
            zzdtVar.zzb = j7;
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
        zzdtVar.zzb = j8;
        return i9;
    }

    static int zzl(Object obj, zzgi zzgiVar, byte[] bArr, int i7, int i8, int i9, zzdt zzdtVar) {
        int iZzb = ((zzga) zzgiVar).zzb(obj, bArr, i7, i8, i9, zzdtVar);
        zzdtVar.zzc = obj;
        return iZzb;
    }

    static int zzm(Object obj, zzgi zzgiVar, byte[] bArr, int i7, int i8, zzdt zzdtVar) {
        int iZzi = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iZzi = zzi(i9, bArr, iZzi, zzdtVar);
            i9 = zzdtVar.zza;
        }
        int i10 = iZzi;
        if (i9 < 0 || i9 > i8 - i10) {
            throw zzfb.zzf();
        }
        int i11 = i10 + i9;
        zzgiVar.zzg(obj, bArr, i10, i11, zzdtVar);
        zzdtVar.zzc = obj;
        return i11;
    }

    static long zzn(byte[] bArr, int i7) {
        return (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }
}

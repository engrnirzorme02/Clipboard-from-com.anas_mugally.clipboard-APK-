package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhgq {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i7, zzhgp zzhgpVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zzb(b7, bArr, i8, zzhgpVar);
        }
        zzhgpVar.zza = b7;
        return i8;
    }

    static int zzb(int i7, byte[] bArr, int i8, zzhgp zzhgpVar) {
        byte b7 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b7 >= 0) {
            zzhgpVar.zza = i10 | (b7 << 7);
            return i9;
        }
        int i11 = i10 | ((b7 & 127) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzhgpVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzhgpVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzhgpVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzhgpVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    static int zzc(byte[] bArr, int i7, zzhgp zzhgpVar) {
        long j7 = bArr[i7];
        int i8 = i7 + 1;
        if (j7 >= 0) {
            zzhgpVar.zzb = j7;
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
        zzhgpVar.zzb = j8;
        return i9;
    }

    static int zzd(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    static long zze(byte[] bArr, int i7) {
        return (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }

    static int zzf(byte[] bArr, int i7, zzhgp zzhgpVar) {
        int iZza = zza(bArr, i7, zzhgpVar);
        int i8 = zzhgpVar.zza;
        if (i8 < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 == 0) {
            zzhgpVar.zzc = "";
            return iZza;
        }
        zzhgpVar.zzc = zzhlh.zzf(bArr, iZza, i8);
        return iZza + i8;
    }

    static int zzg(byte[] bArr, int i7, zzhgp zzhgpVar) {
        int iZza = zza(bArr, i7, zzhgpVar);
        int i8 = zzhgpVar.zza;
        if (i8 < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 > bArr.length - iZza) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i8 == 0) {
            zzhgpVar.zzc = zzhhb.zzb;
            return iZza;
        }
        zzhgpVar.zzc = zzhhb.zzr(bArr, iZza, i8);
        return iZza + i8;
    }

    static int zzh(zzhkk zzhkkVar, byte[] bArr, int i7, int i8, zzhgp zzhgpVar) {
        Object objZza = zzhkkVar.zza();
        int iZzj = zzj(objZza, zzhkkVar, bArr, i7, i8, zzhgpVar);
        zzhkkVar.zzk(objZza);
        zzhgpVar.zzc = objZza;
        return iZzj;
    }

    static int zzi(zzhkk zzhkkVar, byte[] bArr, int i7, int i8, int i9, zzhgp zzhgpVar) {
        Object objZza = zzhkkVar.zza();
        int iZzk = zzk(objZza, zzhkkVar, bArr, i7, i8, i9, zzhgpVar);
        zzhkkVar.zzk(objZza);
        zzhgpVar.zzc = objZza;
        return iZzk;
    }

    static int zzj(Object obj, zzhkk zzhkkVar, byte[] bArr, int i7, int i8, zzhgp zzhgpVar) {
        int iZzb = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iZzb = zzb(i9, bArr, iZzb, zzhgpVar);
            i9 = zzhgpVar.zza;
        }
        int i10 = iZzb;
        if (i9 < 0 || i9 > i8 - i10) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i11 = zzhgpVar.zze + 1;
        zzhgpVar.zze = i11;
        zzq(i11);
        int i12 = i10 + i9;
        zzhkkVar.zzj(obj, bArr, i10, i12, zzhgpVar);
        zzhgpVar.zze--;
        zzhgpVar.zzc = obj;
        return i12;
    }

    static int zzk(Object obj, zzhkk zzhkkVar, byte[] bArr, int i7, int i8, int i9, zzhgp zzhgpVar) {
        int i10 = zzhgpVar.zze + 1;
        zzhgpVar.zze = i10;
        zzq(i10);
        int iZzi = ((zzhjv) zzhkkVar).zzi(obj, bArr, i7, i8, i9, zzhgpVar);
        zzhgpVar.zze--;
        zzhgpVar.zzc = obj;
        return iZzi;
    }

    static int zzl(int i7, byte[] bArr, int i8, int i9, zzhit zzhitVar, zzhgp zzhgpVar) {
        zzhii zzhiiVar = (zzhii) zzhitVar;
        int iZza = zza(bArr, i8, zzhgpVar);
        zzhiiVar.zzi(zzhgpVar.zza);
        while (iZza < i9) {
            int iZza2 = zza(bArr, iZza, zzhgpVar);
            if (i7 != zzhgpVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzhgpVar);
            zzhiiVar.zzi(zzhgpVar.zza);
        }
        return iZza;
    }

    static int zzm(byte[] bArr, int i7, zzhit zzhitVar, zzhgp zzhgpVar) {
        zzhii zzhiiVar = (zzhii) zzhitVar;
        int iZza = zza(bArr, i7, zzhgpVar);
        int i8 = zzhgpVar.zza + iZza;
        while (iZza < i8) {
            iZza = zza(bArr, iZza, zzhgpVar);
            zzhiiVar.zzi(zzhgpVar.zza);
        }
        if (iZza == i8) {
            return iZza;
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzn(zzhkk zzhkkVar, int i7, byte[] bArr, int i8, int i9, zzhit zzhitVar, zzhgp zzhgpVar) {
        int iZzh = zzh(zzhkkVar, bArr, i8, i9, zzhgpVar);
        zzhitVar.add(zzhgpVar.zzc);
        while (iZzh < i9) {
            int iZza = zza(bArr, iZzh, zzhgpVar);
            if (i7 != zzhgpVar.zza) {
                break;
            }
            iZzh = zzh(zzhkkVar, bArr, iZza, i9, zzhgpVar);
            zzhitVar.add(zzhgpVar.zzc);
        }
        return iZzh;
    }

    static int zzo(int i7, byte[] bArr, int i8, int i9, zzhkw zzhkwVar, zzhgp zzhgpVar) {
        if ((i7 >>> 3) == 0) {
            throw new zzhiw("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iZzc = zzc(bArr, i8, zzhgpVar);
            zzhkwVar.zzk(i7, Long.valueOf(zzhgpVar.zzb));
            return iZzc;
        }
        if (i10 == 1) {
            zzhkwVar.zzk(i7, Long.valueOf(zze(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iZza = zza(bArr, i8, zzhgpVar);
            int i11 = zzhgpVar.zza;
            if (i11 < 0) {
                throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - iZza) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                zzhkwVar.zzk(i7, zzhhb.zzb);
            } else {
                zzhkwVar.zzk(i7, zzhhb.zzr(bArr, iZza, i11));
            }
            return iZza + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new zzhiw("Protocol message contained an invalid tag (zero).");
            }
            zzhkwVar.zzk(i7, Integer.valueOf(zzd(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        zzhkw zzhkwVarZzb = zzhkw.zzb();
        int i13 = zzhgpVar.zze + 1;
        zzhgpVar.zze = i13;
        zzq(i13);
        int i14 = 0;
        while (i8 < i9) {
            int iZza2 = zza(bArr, i8, zzhgpVar);
            int i15 = zzhgpVar.zza;
            if (i15 == i12) {
                i14 = i15;
                i8 = iZza2;
                break;
            }
            i8 = zzo(i15, bArr, iZza2, i9, zzhkwVarZzb, zzhgpVar);
            i14 = i15;
        }
        zzhgpVar.zze--;
        if (i8 > i9 || i14 != i12) {
            throw new zzhiw("Failed to parse the message.");
        }
        zzhkwVar.zzk(i7, zzhkwVarZzb);
        return i8;
    }

    static int zzp(int i7, byte[] bArr, int i8, int i9, zzhgp zzhgpVar) {
        if ((i7 >>> 3) == 0) {
            throw new zzhiw("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            return zzc(bArr, i8, zzhgpVar);
        }
        if (i10 == 1) {
            return i8 + 8;
        }
        if (i10 == 2) {
            return zza(bArr, i8, zzhgpVar) + zzhgpVar.zza;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i8 + 4;
            }
            throw new zzhiw("Protocol message contained an invalid tag (zero).");
        }
        int i11 = (i7 & (-8)) | 4;
        int i12 = 0;
        while (i8 < i9) {
            i8 = zza(bArr, i8, zzhgpVar);
            i12 = zzhgpVar.zza;
            if (i12 == i11) {
                break;
            }
            i8 = zzp(i12, bArr, i8, i9, zzhgpVar);
        }
        if (i8 > i9 || i12 != i11) {
            throw new zzhiw("Failed to parse the message.");
        }
        return i8;
    }

    private static void zzq(int i7) throws zzhiw {
        if (i7 >= zzb) {
            throw new zzhiw("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}

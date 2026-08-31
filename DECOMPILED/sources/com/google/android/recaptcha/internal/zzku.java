package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzku {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i7, zzkt zzktVar) throws zznn {
        int iZzi = zzi(bArr, i7, zzktVar);
        int i8 = zzktVar.zza;
        if (i8 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 > bArr.length - iZzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i8 == 0) {
            zzktVar.zzc = zzle.zzb;
            return iZzi;
        }
        zzktVar.zzc = zzle.zzk(bArr, iZzi, i8);
        return iZzi + i8;
    }

    static int zzb(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    static int zzc(zzow zzowVar, byte[] bArr, int i7, int i8, int i9, zzkt zzktVar) throws zznn {
        Object objZze = zzowVar.zze();
        int iZzm = zzm(objZze, zzowVar, bArr, i7, i8, i9, zzktVar);
        zzowVar.zzf(objZze);
        zzktVar.zzc = objZze;
        return iZzm;
    }

    static int zzd(zzow zzowVar, byte[] bArr, int i7, int i8, zzkt zzktVar) throws zznn {
        Object objZze = zzowVar.zze();
        int iZzn = zzn(objZze, zzowVar, bArr, i7, i8, zzktVar);
        zzowVar.zzf(objZze);
        zzktVar.zzc = objZze;
        return iZzn;
    }

    static int zze(zzow zzowVar, int i7, byte[] bArr, int i8, int i9, zznk zznkVar, zzkt zzktVar) throws zznn {
        int iZzd = zzd(zzowVar, bArr, i8, i9, zzktVar);
        zznkVar.add(zzktVar.zzc);
        while (iZzd < i9) {
            int iZzi = zzi(bArr, iZzd, zzktVar);
            if (i7 != zzktVar.zza) {
                break;
            }
            iZzd = zzd(zzowVar, bArr, iZzi, i9, zzktVar);
            zznkVar.add(zzktVar.zzc);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i7, zznk zznkVar, zzkt zzktVar) throws zznn {
        zzne zzneVar = (zzne) zznkVar;
        int iZzi = zzi(bArr, i7, zzktVar);
        int i8 = zzktVar.zza + iZzi;
        while (iZzi < i8) {
            iZzi = zzi(bArr, iZzi, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        if (iZzi == i8) {
            return iZzi;
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(byte[] bArr, int i7, zzkt zzktVar) throws zznn {
        int iZzi = zzi(bArr, i7, zzktVar);
        int i8 = zzktVar.zza;
        if (i8 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 == 0) {
            zzktVar.zzc = "";
            return iZzi;
        }
        zzktVar.zzc = new String(bArr, iZzi, i8, zznl.zza);
        return iZzi + i8;
    }

    static int zzh(int i7, byte[] bArr, int i8, int i9, zzpm zzpmVar, zzkt zzktVar) throws zznn {
        if ((i7 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iZzl = zzl(bArr, i8, zzktVar);
            zzpmVar.zzj(i7, Long.valueOf(zzktVar.zzb));
            return iZzl;
        }
        if (i10 == 1) {
            zzpmVar.zzj(i7, Long.valueOf(zzp(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iZzi = zzi(bArr, i8, zzktVar);
            int i11 = zzktVar.zza;
            if (i11 < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - iZzi) {
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                zzpmVar.zzj(i7, zzle.zzb);
            } else {
                zzpmVar.zzj(i7, zzle.zzk(bArr, iZzi, i11));
            }
            return iZzi + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new zznn("Protocol message contained an invalid tag (zero).");
            }
            zzpmVar.zzj(i7, Integer.valueOf(zzb(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        zzpm zzpmVarZzf = zzpm.zzf();
        int i13 = zzktVar.zze + 1;
        zzktVar.zze = i13;
        zzq(i13);
        int i14 = 0;
        while (i8 < i9) {
            int iZzi2 = zzi(bArr, i8, zzktVar);
            int i15 = zzktVar.zza;
            if (i15 == i12) {
                i14 = i15;
                i8 = iZzi2;
                break;
            }
            i8 = zzh(i15, bArr, iZzi2, i9, zzpmVarZzf, zzktVar);
            i14 = i15;
        }
        zzktVar.zze--;
        if (i8 > i9 || i14 != i12) {
            throw new zznn("Failed to parse the message.");
        }
        zzpmVar.zzj(i7, zzpmVarZzf);
        return i8;
    }

    static int zzi(byte[] bArr, int i7, zzkt zzktVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zzj(b7, bArr, i8, zzktVar);
        }
        zzktVar.zza = b7;
        return i8;
    }

    static int zzj(int i7, byte[] bArr, int i8, zzkt zzktVar) {
        byte b7 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b7 >= 0) {
            zzktVar.zza = i10 | (b7 << 7);
            return i9;
        }
        int i11 = i10 | ((b7 & 127) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzktVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzktVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzktVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzktVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    static int zzk(int i7, byte[] bArr, int i8, int i9, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int iZzi = zzi(bArr, i8, zzktVar);
        zzneVar.zzh(zzktVar.zza);
        while (iZzi < i9) {
            int iZzi2 = zzi(bArr, iZzi, zzktVar);
            if (i7 != zzktVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        return iZzi;
    }

    static int zzl(byte[] bArr, int i7, zzkt zzktVar) {
        long j7 = bArr[i7];
        int i8 = i7 + 1;
        if (j7 >= 0) {
            zzktVar.zzb = j7;
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
        zzktVar.zzb = j8;
        return i9;
    }

    static int zzm(Object obj, zzow zzowVar, byte[] bArr, int i7, int i8, int i9, zzkt zzktVar) throws zznn {
        int i10 = zzktVar.zze + 1;
        zzktVar.zze = i10;
        zzq(i10);
        int iZzc = ((zzol) zzowVar).zzc(obj, bArr, i7, i8, i9, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return iZzc;
    }

    static int zzn(Object obj, zzow zzowVar, byte[] bArr, int i7, int i8, zzkt zzktVar) throws zznn {
        int iZzj = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iZzj = zzj(i9, bArr, iZzj, zzktVar);
            i9 = zzktVar.zza;
        }
        int i10 = iZzj;
        if (i9 < 0 || i9 > i8 - i10) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i11 = zzktVar.zze + 1;
        zzktVar.zze = i11;
        zzq(i11);
        int i12 = i10 + i9;
        zzowVar.zzi(obj, bArr, i10, i12, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return i12;
    }

    static int zzo(int i7, byte[] bArr, int i8, int i9, zzkt zzktVar) throws zznn {
        if ((i7 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            return zzl(bArr, i8, zzktVar);
        }
        if (i10 == 1) {
            return i8 + 8;
        }
        if (i10 == 2) {
            return zzi(bArr, i8, zzktVar) + zzktVar.zza;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i8 + 4;
            }
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i11 = (i7 & (-8)) | 4;
        int i12 = 0;
        while (i8 < i9) {
            i8 = zzi(bArr, i8, zzktVar);
            i12 = zzktVar.zza;
            if (i12 == i11) {
                break;
            }
            i8 = zzo(i12, bArr, i8, i9, zzktVar);
        }
        if (i8 > i9 || i12 != i11) {
            throw new zznn("Failed to parse the message.");
        }
        return i8;
    }

    static long zzp(byte[] bArr, int i7) {
        return (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }

    private static void zzq(int i7) throws zznn {
        if (i7 >= zzb) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}

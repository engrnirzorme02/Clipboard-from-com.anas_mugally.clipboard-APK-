package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacy {
    public static void zza(boolean z7, String str) throws zzas {
        if (!z7) {
            throw zzas.zzb(str, null);
        }
    }

    public static int zzb(zzacv zzacvVar, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        while (i9 < i8) {
            int iZzg = zzacvVar.zzg(bArr, i7 + i9, i8 - i9);
            if (iZzg == -1) {
                break;
            }
            i9 += iZzg;
        }
        return i9;
    }

    public static boolean zzc(zzacv zzacvVar, byte[] bArr, int i7, int i8) {
        try {
            zzacvVar.zzc(bArr, i7, i8);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zzd(zzacv zzacvVar, int i7) {
        try {
            zzacvVar.zzf(i7);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzacv zzacvVar, byte[] bArr, int i7, int i8, boolean z7) throws EOFException {
        try {
            return zzacvVar.zzh(bArr, 0, i8, z7);
        } catch (EOFException e7) {
            if (z7) {
                return false;
            }
            throw e7;
        }
    }

    public static int zzf(int i7) {
        if (i7 == 20) {
            return 63750;
        }
        if (i7 == 30) {
            return 2250000;
        }
        switch (i7) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i7) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }
}

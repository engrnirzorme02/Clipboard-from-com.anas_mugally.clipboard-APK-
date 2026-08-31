package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
final class zzaoc {
    private static boolean zza(byte b7) {
        return b7 > -65;
    }

    static /* synthetic */ void zza(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) throws zzall {
        if (zza(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || zza(b9) || zza(b10)) {
            throw zzall.zzd();
        }
        int i8 = ((b7 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
        cArr[i7] = (char) ((i8 >>> 10) + 55232);
        cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
    }

    static /* synthetic */ void zza(byte b7, char[] cArr, int i7) {
        cArr[i7] = (char) b7;
    }

    static /* synthetic */ void zza(byte b7, byte b8, byte b9, char[] cArr, int i7) throws zzall {
        if (!zza(b8) && ((b7 != -32 || b8 >= -96) && ((b7 != -19 || b8 < -96) && !zza(b9)))) {
            cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
            return;
        }
        throw zzall.zzd();
    }

    static /* synthetic */ void zza(byte b7, byte b8, char[] cArr, int i7) throws zzall {
        if (b7 >= -62 && !zza(b8)) {
            cArr[i7] = (char) (((b7 & 31) << 6) | (b8 & 63));
            return;
        }
        throw zzall.zzd();
    }
}

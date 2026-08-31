package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzoq {
    static /* synthetic */ boolean zza(byte b7) {
        return b7 >= 0;
    }

    static /* synthetic */ void zzb(byte b7, byte b8, char[] cArr, int i7) throws zzmr {
        if (b7 < -62 || zze(b8)) {
            throw new zzmr("Protocol message had invalid UTF-8.");
        }
        cArr[i7] = (char) (((b7 & 31) << 6) | (b8 & 63));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    static /* synthetic */ void zzc(byte b7, byte b8, byte b9, char[] cArr, int i7) throws zzmr {
        if (!zze(b8)) {
            if (b7 != -32) {
                if (b7 != -19) {
                    if (!zze(b9)) {
                        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                        return;
                    }
                } else if (b8 < -96) {
                    b7 = -19;
                    if (!zze(b9)) {
                        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                        return;
                    }
                }
            } else if (b8 >= -96) {
                b7 = -32;
                if (b7 != -19) {
                    if (!zze(b9)) {
                        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                        return;
                    }
                } else if (b8 < -96) {
                    b7 = -19;
                    if (!zze(b9)) {
                        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                        return;
                    }
                }
            }
        }
        throw new zzmr("Protocol message had invalid UTF-8.");
    }

    static /* synthetic */ void zzd(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) throws zzmr {
        if (zze(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || zze(b9) || zze(b10)) {
            throw new zzmr("Protocol message had invalid UTF-8.");
        }
        int i8 = ((b7 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
        cArr[i7] = (char) ((i8 >>> 10) + 55232);
        cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
    }

    private static boolean zze(byte b7) {
        return b7 > -65;
    }
}

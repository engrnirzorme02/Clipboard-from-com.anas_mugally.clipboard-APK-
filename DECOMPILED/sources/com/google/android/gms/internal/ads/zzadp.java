package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadp {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zza(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (!zzl(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i13 = i10 - 1;
        int i14 = zzb[i11];
        if (i8 == 2) {
            i14 /= 2;
        } else if (i8 == 0) {
            i14 /= 4;
        }
        int i15 = (i7 >>> 9) & 1;
        if (i9 == 3) {
            return ((((i8 == 3 ? zzc[i13] : zzd[i13]) * 12) / i14) + i15) * 4;
        }
        if (i8 == 3) {
            i12 = i9 == 2 ? zze[i13] : zzf[i13];
        } else {
            i12 = zzg[i13];
        }
        if (i8 == 3) {
            return ((i12 * 144) / i14) + i15;
        }
        return (((i9 == 1 ? 72 : 144) * i12) / i14) + i15;
    }

    public static int zzb(int i7) {
        int i8;
        int i9;
        if (!zzl(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0) {
            return -1;
        }
        int i10 = i7 >>> 12;
        int i11 = (i7 >>> 10) & 3;
        int i12 = i10 & 15;
        if (i12 == 0 || i12 == 15 || i11 == 3) {
            return -1;
        }
        return zzm(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzl(int i7) {
        return (i7 & (-2097152)) == -2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzm(int i7, int i8) {
        if (i8 != 1) {
            return i8 != 2 ? 384 : 1152;
        }
        return i7 == 3 ? 1152 : 576;
    }
}

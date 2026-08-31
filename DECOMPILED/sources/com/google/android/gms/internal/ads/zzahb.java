package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzahb {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzd(int i7) {
        int i8 = 0;
        while (i8 < 8) {
            int i9 = i8 + 1;
            if ((zza[i8] & ((long) i7)) != 0) {
                return i9;
            }
            i8 = i9;
        }
        return -1;
    }

    public static long zze(byte[] bArr, int i7, boolean z7) {
        long j7 = ((long) bArr[0]) & 255;
        if (z7) {
            j7 &= ~zza[i7 - 1];
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j7 = (j7 << 8) | (((long) bArr[i8]) & 255);
        }
        return j7;
    }

    public final void zza() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final long zzb(zzacv zzacvVar, boolean z7, boolean z8, int i7) {
        if (this.zzc == 0) {
            byte[] bArr = this.zzb;
            if (!zzacvVar.zzb(bArr, 0, 1, z7)) {
                return -1L;
            }
            int iZzd = zzd(bArr[0] & 255);
            this.zzd = iZzd;
            if (iZzd == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i8 = this.zzd;
        if (i8 > i7) {
            this.zzc = 0;
            return -2L;
        }
        if (i8 != 1) {
            zzacvVar.zzc(this.zzb, 1, i8 - 1);
        }
        this.zzc = 0;
        return zze(this.zzb, this.zzd, z8);
    }

    public final int zzc() {
        return this.zzd;
    }
}

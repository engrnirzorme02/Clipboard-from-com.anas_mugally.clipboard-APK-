package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxv {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public zzfxv(byte[] bArr) {
        for (int i7 = 0; i7 < 256; i7++) {
            this.zza[i7] = (byte) i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < 256; i9++) {
            byte[] bArr2 = this.zza;
            byte b7 = bArr2[i9];
            i8 = (i8 + b7 + bArr[i9 % bArr.length]) & 255;
            bArr2[i9] = bArr2[i8];
            bArr2[i8] = b7;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i7 = this.zzb;
        int i8 = this.zzc;
        for (int i9 = 0; i9 < 256; i9++) {
            byte[] bArr2 = this.zza;
            i7 = (i7 + 1) & 255;
            byte b7 = bArr2[i7];
            i8 = (i8 + b7) & 255;
            bArr2[i7] = bArr2[i8];
            bArr2[i8] = b7;
            bArr[i9] = (byte) (bArr2[(bArr2[i7] + b7) & 255] ^ bArr[i9]);
        }
        this.zzb = i7;
        this.zzc = i8;
    }
}

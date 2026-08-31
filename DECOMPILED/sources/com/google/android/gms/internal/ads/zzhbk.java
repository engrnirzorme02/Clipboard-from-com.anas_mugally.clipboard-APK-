package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhbk {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i7 = 0;
        while (i7 < 16) {
            int i8 = i7 + 1;
            byte b7 = bArr[i7];
            byte b8 = (byte) ((b7 + b7) & 254);
            bArr2[i7] = b8;
            if (i7 < 15) {
                bArr2[i7] = (byte) (((bArr[i8] >> 7) & 1) | b8);
            }
            i7 = i8;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}

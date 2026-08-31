package com.google.android.gms.common.util;

/* JADX INFO: renamed from: com.google.android.gms.common.util.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3759n {
    /* JADX INFO: renamed from: a */
    public static int m18192a(byte[] bArr, int i7, int i8, int i9) {
        int i10;
        int i11 = i7;
        while (true) {
            i10 = (i8 & (-4)) + i7;
            if (i11 >= i10) {
                break;
            }
            int i12 = ((bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | (bArr[i11 + 3] << 24)) * (-862048943);
            int i13 = i9 ^ (((i12 >>> 17) | (i12 << 15)) * 461845907);
            i9 = (((i13 >>> 19) | (i13 << 13)) * 5) - 430675100;
            i11 += 4;
        }
        int i14 = i8 & 3;
        int i15 = 0;
        if (i14 == 1) {
            int i16 = ((bArr[i10] & 255) | i15) * (-862048943);
            i9 ^= ((i16 >>> 17) | (i16 << 15)) * 461845907;
        } else {
            if (i14 != 2) {
                i15 = i14 == 3 ? (bArr[i10 + 2] & 255) << 16 : 0;
            }
            i15 |= (bArr[i10 + 1] & 255) << 8;
            int i17 = ((bArr[i10] & 255) | i15) * (-862048943);
            i9 ^= ((i17 >>> 17) | (i17 << 15)) * 461845907;
        }
        int i18 = i9 ^ i8;
        int i19 = (i18 ^ (i18 >>> 16)) * (-2048144789);
        int i20 = (i19 ^ (i19 >>> 13)) * (-1028477387);
        return i20 ^ (i20 >>> 16);
    }
}

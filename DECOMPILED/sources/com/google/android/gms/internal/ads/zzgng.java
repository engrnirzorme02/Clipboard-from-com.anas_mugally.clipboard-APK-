package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzgng {
    private static final byte[] zza;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < 10; i7++) {
            bArr[i7 + 48] = (byte) i7;
        }
        for (int i8 = 0; i8 < 26; i8++) {
            byte b7 = (byte) (i8 + 10);
            bArr[i8 + 65] = b7;
            bArr[i8 + 97] = b7;
        }
        zza = bArr;
    }

    static int zza(char c7) {
        if (c7 < 128) {
            return zza[c7];
        }
        return -1;
    }
}

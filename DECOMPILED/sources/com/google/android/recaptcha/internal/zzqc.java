package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqc {
    protected static final Charset zza = StandardCharsets.UTF_16;
    protected int[] zzb;
    protected int[] zzc;
    private final int[] zzd = {511133343, 1277647508, 107287496, 338123662};
    private byte[] zze;
    private byte[] zzf;
    private int zzg;

    protected zzqc() {
    }

    protected static int zza(int i7, int i8) {
        if (i7 % 2 != 0) {
            return (i7 | i8) - (i7 & i8);
        }
        return ((~i7) & i8) | ((~i8) & i7);
    }

    public static String zze(String str, byte[] bArr, zzqd zzqdVar) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr2 = new byte[12];
        int length = bArrDecode.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArrDecode, 0, bArr2, 0, 12);
        System.arraycopy(bArrDecode, 12, bArr3, 0, length);
        return new String(new zzqc(bArr, bArr2).zzd(bArr3), zza);
    }

    public static String zzf(String str, byte[] bArr, zzqd zzqdVar) {
        byte[] bArr2 = new byte[12];
        new SecureRandom().nextBytes(bArr2);
        byte[] bArrZzd = new zzqc(bArr, bArr2).zzd(str.getBytes(zza));
        int length = bArrZzd.length;
        byte[] bArr3 = new byte[length + 12];
        System.arraycopy(bArr2, 0, bArr3, 0, 12);
        System.arraycopy(bArrZzd, 0, bArr3, 12, length);
        return Base64.encodeToString(bArr3, 2);
    }

    private static final int zzg(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    protected final void zzb(int i7, int i8, int i9, int i10) {
        zzc(i7, i8, i10, 16);
        zzc(i9, i10, i8, 12);
        zzc(i7, i8, i10, 8);
        zzc(i9, i10, i8, 7);
    }

    protected final void zzc(int i7, int i8, int i9, int i10) {
        int[] iArr = this.zzb;
        int i11 = iArr[i7] + iArr[i8];
        iArr[i7] = i11;
        int iZza = zza(iArr[i9], i11);
        iArr[i9] = iZza;
        iArr[i9] = (iZza << i10) | (iZza >>> (32 - i10));
    }

    protected final byte[] zzd(byte[] bArr) {
        if (this.zzg != 1) {
            throw new IllegalStateException();
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i7 = 0;
        while (length > 0) {
            int[] iArr = this.zzc;
            int[] iArr2 = this.zzb;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr2, 0, 16);
            this.zzb[12] = this.zzg;
            for (int i8 = 0; i8 < 10; i8++) {
                zzb(0, 4, 8, 12);
                zzb(1, 5, 9, 13);
                zzb(2, 6, 10, 14);
                zzb(3, 7, 11, 15);
                zzb(0, 5, 10, 15);
                zzb(1, 6, 11, 12);
                zzb(2, 7, 8, 13);
                zzb(3, 4, 9, 14);
            }
            byte[] bArr3 = new byte[64];
            for (int i9 = 0; i9 < 16; i9++) {
                int i10 = this.zzb[i9];
                int i11 = i9 * 4;
                bArr3[i11] = (byte) (i10 & 255);
                bArr3[i11 + 1] = (byte) ((i10 >> 8) & 255);
                bArr3[i11 + 2] = (byte) ((i10 >> 16) & 255);
                bArr3[i11 + 3] = (byte) ((i10 >> 24) & 255);
            }
            for (int i12 = 0; i12 < Math.min(64, length); i12++) {
                int i13 = i7 + i12;
                bArr2[i13] = (byte) zza(bArr3[i12], bArr[i13]);
            }
            this.zzg++;
            length -= 64;
            i7 += 64;
        }
        return bArr2;
    }

    protected zzqc(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException();
        }
        this.zze = bArr;
        this.zzg = 1;
        this.zzf = bArr2;
        this.zzb = new int[16];
        for (int i7 = 0; i7 < 4; i7++) {
            this.zzb[i7] = zza(this.zzd[i7], 2131181306);
        }
        for (int i8 = 4; i8 < 12; i8++) {
            this.zzb[i8] = zzg(this.zze, (i8 - 4) * 4);
        }
        this.zzb[12] = this.zzg;
        for (int i9 = 13; i9 < 16; i9++) {
            this.zzb[i9] = zzg(this.zzf, (i9 - 13) * 4);
        }
        int[] iArr = new int[16];
        this.zzc = iArr;
        int[] iArr2 = this.zzb;
        int length = iArr2.length;
        System.arraycopy(iArr2, 0, iArr, 0, 16);
    }
}

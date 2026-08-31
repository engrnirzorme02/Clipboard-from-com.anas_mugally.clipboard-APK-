package com.google.android.gms.common.util;

/* JADX INFO: renamed from: com.google.android.gms.common.util.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3755j {

    /* JADX INFO: renamed from: a */
    private static final char[] f14904a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b */
    private static final char[] f14905b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a */
    public static String m18182a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i7 = 0;
        for (byte b7 : bArr) {
            char[] cArr2 = f14905b;
            cArr[i7] = cArr2[(b7 & 255) >>> 4];
            cArr[i7 + 1] = cArr2[b7 & 15];
            i7 += 2;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m18183b(byte[] bArr) {
        return m18184c(bArr, false);
    }

    /* JADX INFO: renamed from: c */
    public static String m18184c(byte[] bArr, boolean z7) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i7 = 0; i7 < length && (!z7 || i7 != length - 1 || (bArr[i7] & 255) != 0); i7++) {
            char[] cArr = f14904a;
            sb.append(cArr[(bArr[i7] & 240) >>> 4]);
            sb.append(cArr[bArr[i7] & 15]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m18185d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i7 = 0;
        while (i7 < length) {
            int i8 = i7 + 2;
            bArr[i7 / 2] = (byte) Integer.parseInt(str.substring(i7, i8), 16);
            i7 = i8;
        }
        return bArr;
    }
}

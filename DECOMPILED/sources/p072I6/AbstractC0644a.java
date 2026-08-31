package p072I6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0644a {

    /* JADX INFO: renamed from: a */
    private static final byte[] f2534a;

    /* JADX INFO: renamed from: b */
    private static final byte[] f2535b;

    static {
        C0651h.a aVar = C0651h.f2562d;
        f2534a = aVar.m3114d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").m3100m();
        f2535b = aVar.m3114d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").m3100m();
    }

    /* JADX INFO: renamed from: a */
    public static final byte[] m2964a(String str) {
        int i7;
        char cCharAt;
        AbstractC6118n.m27187e(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i8 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i8];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt2 = str.charAt(i12);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i7 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i7 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i7 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i7 = 62;
            } else {
                if (cCharAt2 == '/' || cCharAt2 == '_') {
                    i7 = 63;
                } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i10 = (i10 << 6) | i7;
            i9++;
            if (i9 % 4 == 0) {
                bArr[i11] = (byte) (i10 >> 16);
                int i13 = i11 + 2;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                i11 += 3;
                bArr[i13] = (byte) i10;
            }
        }
        int i14 = i9 % 4;
        if (i14 == 1) {
            return null;
        }
        if (i14 == 2) {
            bArr[i11] = (byte) ((i10 << 12) >> 16);
            i11++;
        } else if (i14 == 3) {
            int i15 = i10 << 6;
            int i16 = i11 + 1;
            bArr[i11] = (byte) (i15 >> 16);
            i11 += 2;
            bArr[i16] = (byte) (i15 >> 8);
        }
        if (i11 == i8) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
        AbstractC6118n.m27186d(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: b */
    public static final String m2965b(byte[] bArr, byte[] map) {
        AbstractC6118n.m27187e(bArr, "<this>");
        AbstractC6118n.m27187e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            byte b7 = bArr[i7];
            int i9 = i7 + 2;
            byte b8 = bArr[i7 + 1];
            i7 += 3;
            byte b9 = bArr[i9];
            bArr2[i8] = map[(b7 & 255) >> 2];
            bArr2[i8 + 1] = map[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            int i10 = i8 + 3;
            bArr2[i8 + 2] = map[((b8 & 15) << 2) | ((b9 & 255) >> 6)];
            i8 += 4;
            bArr2[i10] = map[b9 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b10 = bArr[i7];
            bArr2[i8] = map[(b10 & 255) >> 2];
            bArr2[i8 + 1] = map[(b10 & 3) << 4];
            bArr2[i8 + 2] = 61;
            bArr2[i8 + 3] = 61;
        } else if (length2 == 2) {
            int i11 = i7 + 1;
            byte b11 = bArr[i7];
            byte b12 = bArr[i11];
            bArr2[i8] = map[(b11 & 255) >> 2];
            bArr2[i8 + 1] = map[((b11 & 3) << 4) | ((b12 & 255) >> 4)];
            bArr2[i8 + 2] = map[(b12 & 15) << 2];
            bArr2[i8 + 3] = 61;
        }
        return AbstractC0643E.m2963b(bArr2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m2966c(byte[] bArr, byte[] bArr2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bArr2 = f2534a;
        }
        return m2965b(bArr, bArr2);
    }
}

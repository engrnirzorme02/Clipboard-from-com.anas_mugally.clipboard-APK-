package p080J6;

import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0648e;
import p072I6.C0651h;
import p145S5.C1444v;

/* JADX INFO: renamed from: J6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0707b {

    /* JADX INFO: renamed from: a */
    private static final char[] f2875a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final int m3444c(byte[] bArr, int i7) {
        byte b7;
        int i8;
        int i9 = 1;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            byte b8 = bArr[i10];
            if (b8 >= 0) {
                int i13 = i12 + 1;
                if (i12 == i7) {
                    break;
                }
                if ((b8 != 10 && b8 != 13 && ((b8 >= 0 && b8 < 32) || (127 <= b8 && b8 < 160))) || b8 == 65533) {
                    return -1;
                }
                i11 += b8 < 65536 ? i9 : 2;
                i10 += i9;
                while (true) {
                    i12 = i13;
                    if (i10 >= length || (b7 = bArr[i10]) < 0) {
                        break;
                    }
                    i10 += i9;
                    i13 = i12 + 1;
                    if (i12 == i7) {
                        return i11;
                    }
                    if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && b7 < 32) || (127 <= b7 && b7 < 160))) || b7 == 65533) {
                        return -1;
                    }
                    i11 += b7 < 65536 ? i9 : 2;
                }
            } else {
                int i14 = i9;
                if ((b8 >> 5) == -2) {
                    int i15 = i10 + 1;
                    if (length <= i15) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    byte b9 = bArr[i15];
                    if ((b9 & 192) != 128) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    int i16 = (b9 ^ 3968) ^ (b8 << 6);
                    if (i16 < 128) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    i8 = i12 + 1;
                    if (i12 == i7) {
                        break;
                    }
                    if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                        return -1;
                    }
                    i11 += i16 < 65536 ? i14 : 2;
                    C1444v c1444v = C1444v.f4971a;
                    i10 += 2;
                    i12 = i8;
                    i9 = i14;
                } else if ((b8 >> 4) == -2) {
                    int i17 = i10 + 2;
                    if (length <= i17) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    byte b10 = bArr[i10 + 1];
                    if ((b10 & 192) != 128) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    byte b11 = bArr[i17];
                    if ((b11 & 192) != 128) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    int i18 = ((b11 ^ (-123008)) ^ (b10 << 6)) ^ (b8 << 12);
                    if (i18 < 2048) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    if (55296 <= i18 && i18 < 57344) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    i8 = i12 + 1;
                    if (i12 == i7) {
                        break;
                    }
                    if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                        return -1;
                    }
                    i11 += i18 < 65536 ? i14 : 2;
                    C1444v c1444v2 = C1444v.f4971a;
                    i10 += 3;
                    i12 = i8;
                    i9 = i14;
                } else {
                    if ((b8 >> 3) != -2) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    int i19 = i10 + 3;
                    if (length <= i19) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    byte b12 = bArr[i10 + 1];
                    if ((b12 & 192) != 128) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    byte b13 = bArr[i10 + 2];
                    if ((b13 & 192) != 128) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    byte b14 = bArr[i19];
                    if ((b14 & 192) != 128) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    int i20 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b8 << 18);
                    if (i20 > 1114111) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    if (55296 <= i20 && i20 < 57344) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    if (i20 < 65536) {
                        if (i12 == i7) {
                            break;
                        }
                        return -1;
                    }
                    i8 = i12 + 1;
                    if (i12 == i7) {
                        break;
                    }
                    if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                        return -1;
                    }
                    i11 += i20 < 65536 ? i14 : 2;
                    C1444v c1444v3 = C1444v.f4971a;
                    i10 += 4;
                    i12 = i8;
                    i9 = i14;
                }
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: d */
    public static final void m3445d(C0651h c0651h, C0648e buffer, int i7, int i8) {
        AbstractC6118n.m27187e(c0651h, "<this>");
        AbstractC6118n.m27187e(buffer, "buffer");
        buffer.mo3047i(c0651h.m3100m(), i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final int m3446e(char c7) {
        if ('0' <= c7 && c7 < ':') {
            return c7 - '0';
        }
        if ('a' <= c7 && c7 < 'g') {
            return c7 - 'W';
        }
        if ('A' <= c7 && c7 < 'G') {
            return c7 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c7);
    }

    /* JADX INFO: renamed from: f */
    public static final char[] m3447f() {
        return f2875a;
    }
}

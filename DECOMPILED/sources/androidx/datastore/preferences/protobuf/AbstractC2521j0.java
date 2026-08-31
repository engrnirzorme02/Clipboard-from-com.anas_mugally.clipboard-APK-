package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2521j0 {

    /* JADX INFO: renamed from: a */
    private static final b f9590a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0$a */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static void m11534h(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) throws C2535v {
            if (m11539m(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || m11539m(b9) || m11539m(b10)) {
                throw C2535v.m11647d();
            }
            int iM11544r = ((b7 & 7) << 18) | (m11544r(b8) << 12) | (m11544r(b9) << 6) | m11544r(b10);
            cArr[i7] = m11538l(iM11544r);
            cArr[i7 + 1] = m11543q(iM11544r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static void m11535i(byte b7, char[] cArr, int i7) {
            cArr[i7] = (char) b7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static void m11536j(byte b7, byte b8, byte b9, char[] cArr, int i7) throws C2535v {
            if (m11539m(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || m11539m(b9)))) {
                throw C2535v.m11647d();
            }
            cArr[i7] = (char) (((b7 & 15) << 12) | (m11544r(b8) << 6) | m11544r(b9));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static void m11537k(byte b7, byte b8, char[] cArr, int i7) throws C2535v {
            if (b7 < -62 || m11539m(b8)) {
                throw C2535v.m11647d();
            }
            cArr[i7] = (char) (((b7 & 31) << 6) | m11544r(b8));
        }

        /* JADX INFO: renamed from: l */
        private static char m11538l(int i7) {
            return (char) ((i7 >>> 10) + 55232);
        }

        /* JADX INFO: renamed from: m */
        private static boolean m11539m(byte b7) {
            return b7 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static boolean m11540n(byte b7) {
            return b7 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o */
        public static boolean m11541o(byte b7) {
            return b7 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public static boolean m11542p(byte b7) {
            return b7 < -32;
        }

        /* JADX INFO: renamed from: q */
        private static char m11543q(int i7) {
            return (char) ((i7 & 1023) + 56320);
        }

        /* JADX INFO: renamed from: r */
        private static int m11544r(byte b7) {
            return b7 & 63;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0$b */
    static abstract class b {
        b() {
        }

        /* JADX INFO: renamed from: a */
        abstract String mo11545a(byte[] bArr, int i7, int i8);

        /* JADX INFO: renamed from: b */
        abstract int mo11546b(String str, byte[] bArr, int i7, int i8);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0$c */
    static final class c extends b {
        c() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2521j0.b
        /* JADX INFO: renamed from: a */
        String mo11545a(byte[] bArr, int i7, int i8) throws C2535v {
            if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b7 = bArr[i7];
                if (!a.m11540n(b7)) {
                    break;
                }
                i7++;
                a.m11535i(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b8 = bArr[i7];
                if (a.m11540n(b8)) {
                    int i13 = i11 + 1;
                    a.m11535i(b8, cArr, i11);
                    int i14 = i12;
                    while (i14 < i9) {
                        byte b9 = bArr[i14];
                        if (!a.m11540n(b9)) {
                            break;
                        }
                        i14++;
                        a.m11535i(b9, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i7 = i14;
                } else if (a.m11542p(b8)) {
                    if (i12 >= i9) {
                        throw C2535v.m11647d();
                    }
                    i7 += 2;
                    a.m11537k(b8, bArr[i12], cArr, i11);
                    i11++;
                } else if (a.m11541o(b8)) {
                    if (i12 >= i9 - 1) {
                        throw C2535v.m11647d();
                    }
                    int i15 = i7 + 2;
                    i7 += 3;
                    a.m11536j(b8, bArr[i12], bArr[i15], cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i9 - 2) {
                        throw C2535v.m11647d();
                    }
                    byte b10 = bArr[i12];
                    int i16 = i7 + 3;
                    byte b11 = bArr[i7 + 2];
                    i7 += 4;
                    a.m11534h(b8, b10, b11, bArr[i16], cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2521j0.b
        /* JADX INFO: renamed from: b */
        int mo11546b(String str, byte[] bArr, int i7, int i8) {
            int i9;
            int i10;
            char cCharAt;
            int length = str.length();
            int i11 = i8 + i7;
            int i12 = 0;
            while (i12 < length && (i10 = i12 + i7) < i11 && (cCharAt = str.charAt(i12)) < 128) {
                bArr[i10] = (byte) cCharAt;
                i12++;
            }
            if (i12 == length) {
                return i7 + length;
            }
            int i13 = i7 + i12;
            while (i12 < length) {
                char cCharAt2 = str.charAt(i12);
                if (cCharAt2 < 128 && i13 < i11) {
                    bArr[i13] = (byte) cCharAt2;
                    i13++;
                } else if (cCharAt2 < 2048 && i13 <= i11 - 2) {
                    int i14 = i13 + 1;
                    bArr[i13] = (byte) ((cCharAt2 >>> 6) | 960);
                    i13 += 2;
                    bArr[i14] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i13 > i11 - 3) {
                        if (i13 > i11 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i9 = i12 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i9)))) {
                                throw new d(i12, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i13);
                        }
                        int i15 = i12 + 1;
                        if (i15 != str.length()) {
                            char cCharAt3 = str.charAt(i15);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i16 = i13 + 3;
                                bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i13 += 4;
                                bArr[i16] = (byte) ((codePoint & 63) | 128);
                                i12 = i15;
                            } else {
                                i12 = i15;
                            }
                        }
                        throw new d(i12 - 1, length);
                    }
                    bArr[i13] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i17 = i13 + 2;
                    bArr[i13 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i13 += 3;
                    bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
                }
                i12++;
            }
            return i13;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0$d */
    static class d extends IllegalArgumentException {
        d(int i7, int i8) {
            super("Unpaired surrogate at index " + i7 + " of " + i8);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0$e */
    static final class e extends b {
        e() {
        }

        /* JADX INFO: renamed from: c */
        static boolean m11547c() {
            return AbstractC2519i0.m11401B() && AbstractC2519i0.m11402C();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2521j0.b
        /* JADX INFO: renamed from: a */
        String mo11545a(byte[] bArr, int i7, int i8) throws C2535v {
            Charset charset = AbstractC2534u.f9724b;
            String str = new String(bArr, i7, i8, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i8 + i7))) {
                throw C2535v.m11647d();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2521j0.b
        /* JADX INFO: renamed from: b */
        int mo11546b(String str, byte[] bArr, int i7, int i8) {
            long j7;
            long j8;
            long j9;
            int i9;
            char cCharAt;
            long j10 = i7;
            long j11 = ((long) i8) + j10;
            int length = str.length();
            if (length > i8 || bArr.length - i8 < i7) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i7 + i8));
            }
            int i10 = 0;
            while (true) {
                j7 = 1;
                if (i10 >= length || (cCharAt = str.charAt(i10)) >= 128) {
                    break;
                }
                AbstractC2519i0.m11407H(bArr, j10, (byte) cCharAt);
                i10++;
                j10 = 1 + j10;
            }
            if (i10 == length) {
                return (int) j10;
            }
            while (i10 < length) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128 && j10 < j11) {
                    AbstractC2519i0.m11407H(bArr, j10, (byte) cCharAt2);
                    j9 = j11;
                    j8 = j7;
                    j10 += j7;
                } else if (cCharAt2 >= 2048 || j10 > j11 - 2) {
                    j8 = j7;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j10 > j11 - 3) {
                        j9 = j11;
                        if (j10 > j9 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i9 = i10 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i9)))) {
                                throw new d(i10, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j10);
                        }
                        int i11 = i10 + 1;
                        if (i11 != length) {
                            char cCharAt3 = str.charAt(i11);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                AbstractC2519i0.m11407H(bArr, j10, (byte) ((codePoint >>> 18) | 240));
                                AbstractC2519i0.m11407H(bArr, j10 + j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = j10 + 3;
                                AbstractC2519i0.m11407H(bArr, j10 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j10 += 4;
                                AbstractC2519i0.m11407H(bArr, j12, (byte) ((codePoint & 63) | 128));
                                i10 = i11;
                            } else {
                                i10 = i11;
                            }
                        }
                        throw new d(i10 - 1, length);
                    }
                    AbstractC2519i0.m11407H(bArr, j10, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j13 = j10 + 2;
                    j9 = j11;
                    AbstractC2519i0.m11407H(bArr, j10 + j8, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j10 += 3;
                    AbstractC2519i0.m11407H(bArr, j13, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j8 = j7;
                    long j14 = j10 + j8;
                    AbstractC2519i0.m11407H(bArr, j10, (byte) ((cCharAt2 >>> 6) | 960));
                    j10 += 2;
                    AbstractC2519i0.m11407H(bArr, j14, (byte) ((cCharAt2 & '?') | 128));
                    j9 = j11;
                }
                i10++;
                j7 = j8;
                j11 = j9;
            }
            return (int) j10;
        }
    }

    static {
        f9590a = (!e.m11547c() || AbstractC2508d.m11130c()) ? new c() : new e();
    }

    /* JADX INFO: renamed from: a */
    static String m11523a(byte[] bArr, int i7, int i8) {
        return f9590a.mo11545a(bArr, i7, i8);
    }

    /* JADX INFO: renamed from: b */
    static int m11524b(String str, byte[] bArr, int i7, int i8) {
        return f9590a.mo11546b(str, bArr, i7, i8);
    }

    /* JADX INFO: renamed from: c */
    static int m11525c(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length && str.charAt(i7) < 128) {
            i7++;
        }
        int iM11526d = length;
        while (i7 < length) {
            char cCharAt = str.charAt(i7);
            if (cCharAt >= 2048) {
                iM11526d += m11526d(str, i7);
                break;
            }
            iM11526d += (127 - cCharAt) >>> 31;
            i7++;
        }
        if (iM11526d >= length) {
            return iM11526d;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iM11526d) + 4294967296L));
    }

    /* JADX INFO: renamed from: d */
    private static int m11526d(String str, int i7) {
        int length = str.length();
        int i8 = 0;
        while (i7 < length) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < 2048) {
                i8 += (127 - cCharAt) >>> 31;
            } else {
                i8 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i7) < 65536) {
                        throw new d(i7, length);
                    }
                    i7++;
                }
            }
            i7++;
        }
        return i8;
    }
}

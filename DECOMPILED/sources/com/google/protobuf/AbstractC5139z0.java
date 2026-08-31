package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.z0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5139z0 {

    /* JADX INFO: renamed from: a */
    private static final b f19657a;

    /* JADX INFO: renamed from: com.google.protobuf.z0$a */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static void m23838h(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) throws C5065C {
            if (m23843m(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || m23843m(b9) || m23843m(b10)) {
                throw C5065C.m22893d();
            }
            int iM23848r = ((b7 & 7) << 18) | (m23848r(b8) << 12) | (m23848r(b9) << 6) | m23848r(b10);
            cArr[i7] = m23842l(iM23848r);
            cArr[i7 + 1] = m23847q(iM23848r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static void m23839i(byte b7, char[] cArr, int i7) {
            cArr[i7] = (char) b7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static void m23840j(byte b7, byte b8, byte b9, char[] cArr, int i7) throws C5065C {
            if (m23843m(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || m23843m(b9)))) {
                throw C5065C.m22893d();
            }
            cArr[i7] = (char) (((b7 & 15) << 12) | (m23848r(b8) << 6) | m23848r(b9));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static void m23841k(byte b7, byte b8, char[] cArr, int i7) throws C5065C {
            if (b7 < -62 || m23843m(b8)) {
                throw C5065C.m22893d();
            }
            cArr[i7] = (char) (((b7 & 31) << 6) | m23848r(b8));
        }

        /* JADX INFO: renamed from: l */
        private static char m23842l(int i7) {
            return (char) ((i7 >>> 10) + 55232);
        }

        /* JADX INFO: renamed from: m */
        private static boolean m23843m(byte b7) {
            return b7 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static boolean m23844n(byte b7) {
            return b7 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o */
        public static boolean m23845o(byte b7) {
            return b7 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public static boolean m23846p(byte b7) {
            return b7 < -32;
        }

        /* JADX INFO: renamed from: q */
        private static char m23847q(int i7) {
            return (char) ((i7 & 1023) + 56320);
        }

        /* JADX INFO: renamed from: r */
        private static int m23848r(byte b7) {
            return b7 & 63;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.z0$b */
    static abstract class b {
        b() {
        }

        /* JADX INFO: renamed from: j */
        private static int m23849j(ByteBuffer byteBuffer, int i7, int i8) {
            int iM23820l = i7 + AbstractC5139z0.m23820l(byteBuffer, i7, i8);
            while (iM23820l < i8) {
                int i9 = iM23820l + 1;
                byte b7 = byteBuffer.get(iM23820l);
                if (b7 >= 0) {
                    iM23820l = i9;
                } else if (b7 < -32) {
                    if (i9 >= i8) {
                        return b7;
                    }
                    if (b7 < -62 || byteBuffer.get(i9) > -65) {
                        return -1;
                    }
                    iM23820l += 2;
                } else {
                    if (b7 >= -16) {
                        if (i9 >= i8 - 2) {
                            return AbstractC5139z0.m23824p(byteBuffer, b7, i9, i8 - i9);
                        }
                        int i10 = iM23820l + 2;
                        byte b8 = byteBuffer.get(i9);
                        if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                            int i11 = iM23820l + 3;
                            if (byteBuffer.get(i10) <= -65) {
                                iM23820l += 4;
                                if (byteBuffer.get(i11) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i9 >= i8 - 1) {
                        return AbstractC5139z0.m23824p(byteBuffer, b7, i9, i8 - i9);
                    }
                    int i12 = iM23820l + 2;
                    byte b9 = byteBuffer.get(i9);
                    if (b9 > -65 || ((b7 == -32 && b9 < -96) || ((b7 == -19 && b9 >= -96) || byteBuffer.get(i12) > -65))) {
                        return -1;
                    }
                    iM23820l += 3;
                }
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        final String m23850a(ByteBuffer byteBuffer, int i7, int i8) {
            if (byteBuffer.hasArray()) {
                return mo23851b(byteBuffer.array(), byteBuffer.arrayOffset() + i7, i8);
            }
            return byteBuffer.isDirect() ? mo23853d(byteBuffer, i7, i8) : m23852c(byteBuffer, i7, i8);
        }

        /* JADX INFO: renamed from: b */
        abstract String mo23851b(byte[] bArr, int i7, int i8);

        /* JADX INFO: renamed from: c */
        final String m23852c(ByteBuffer byteBuffer, int i7, int i8) throws C5065C {
            if ((i7 | i8 | ((byteBuffer.limit() - i7) - i8)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b7 = byteBuffer.get(i7);
                if (!a.m23844n(b7)) {
                    break;
                }
                i7++;
                a.m23839i(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b8 = byteBuffer.get(i7);
                if (a.m23844n(b8)) {
                    int i13 = i11 + 1;
                    a.m23839i(b8, cArr, i11);
                    int i14 = i12;
                    while (i14 < i9) {
                        byte b9 = byteBuffer.get(i14);
                        if (!a.m23844n(b9)) {
                            break;
                        }
                        i14++;
                        a.m23839i(b9, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i7 = i14;
                } else if (a.m23846p(b8)) {
                    if (i12 >= i9) {
                        throw C5065C.m22893d();
                    }
                    i7 += 2;
                    a.m23841k(b8, byteBuffer.get(i12), cArr, i11);
                    i11++;
                } else if (a.m23845o(b8)) {
                    if (i12 >= i9 - 1) {
                        throw C5065C.m22893d();
                    }
                    int i15 = i7 + 2;
                    i7 += 3;
                    a.m23840j(b8, byteBuffer.get(i12), byteBuffer.get(i15), cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i9 - 2) {
                        throw C5065C.m22893d();
                    }
                    byte b10 = byteBuffer.get(i12);
                    int i16 = i7 + 3;
                    byte b11 = byteBuffer.get(i7 + 2);
                    i7 += 4;
                    a.m23838h(b8, b10, b11, byteBuffer.get(i16), cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        /* JADX INFO: renamed from: d */
        abstract String mo23853d(ByteBuffer byteBuffer, int i7, int i8);

        /* JADX INFO: renamed from: e */
        abstract int mo23854e(CharSequence charSequence, byte[] bArr, int i7, int i8);

        /* JADX INFO: renamed from: f */
        final boolean m23855f(ByteBuffer byteBuffer, int i7, int i8) {
            return m23857h(0, byteBuffer, i7, i8) == 0;
        }

        /* JADX INFO: renamed from: g */
        final boolean m23856g(byte[] bArr, int i7, int i8) {
            return mo23858i(0, bArr, i7, i8) == 0;
        }

        /* JADX INFO: renamed from: h */
        final int m23857h(int i7, ByteBuffer byteBuffer, int i8, int i9) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? mo23860l(i7, byteBuffer, i8, i9) : m23859k(i7, byteBuffer, i8, i9);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return mo23858i(i7, byteBuffer.array(), i8 + iArrayOffset, iArrayOffset + i9);
        }

        /* JADX INFO: renamed from: i */
        abstract int mo23858i(int i7, byte[] bArr, int i8, int i9);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int m23859k(int i7, ByteBuffer byteBuffer, int i8, int i9) {
            byte b7;
            int i10;
            int i11;
            if (i7 != 0) {
                if (i8 >= i9) {
                    return i7;
                }
                byte b8 = (byte) i7;
                if (b8 < -32) {
                    if (b8 >= -62) {
                        i11 = i8 + 1;
                    }
                    return -1;
                }
                if (b8 < -16) {
                    byte b9 = (byte) (~(i7 >> 8));
                    if (b9 == 0) {
                        int i12 = i8 + 1;
                        byte b10 = byteBuffer.get(i8);
                        if (i12 >= i9) {
                            return AbstractC5139z0.m23822n(b8, b10);
                        }
                        i8 = i12;
                        b9 = b10;
                    }
                    if (b9 <= -65 && ((b8 != -32 || b9 >= -96) && (b8 != -19 || b9 < -96))) {
                        i11 = i8 + 1;
                    }
                    return -1;
                }
                byte b11 = (byte) (~(i7 >> 8));
                if (b11 == 0) {
                    i10 = i8 + 1;
                    b11 = byteBuffer.get(i8);
                    if (i10 >= i9) {
                        return AbstractC5139z0.m23822n(b8, b11);
                    }
                    b7 = 0;
                } else {
                    b7 = (byte) (i7 >> 16);
                    i10 = i8;
                }
                if (b7 == 0) {
                    int i13 = i10 + 1;
                    byte b12 = byteBuffer.get(i10);
                    if (i13 >= i9) {
                        return AbstractC5139z0.m23823o(b8, b11, b12);
                    }
                    b7 = b12;
                    i10 = i13;
                }
                if (b11 <= -65 && (((b8 << 28) + (b11 + 112)) >> 30) == 0 && b7 <= -65) {
                    i8 = i10 + 1;
                }
                return -1;
                i8 = i11;
            }
            return m23849j(byteBuffer, i8, i9);
        }

        /* JADX INFO: renamed from: l */
        abstract int mo23860l(int i7, ByteBuffer byteBuffer, int i8, int i9);
    }

    /* JADX INFO: renamed from: com.google.protobuf.z0$c */
    static final class c extends b {
        c() {
        }

        /* JADX INFO: renamed from: m */
        private static int m23861m(byte[] bArr, int i7, int i8) {
            while (i7 < i8 && bArr[i7] >= 0) {
                i7++;
            }
            if (i7 >= i8) {
                return 0;
            }
            return m23862n(bArr, i7, i8);
        }

        /* JADX INFO: renamed from: n */
        private static int m23862n(byte[] bArr, int i7, int i8) {
            while (i7 < i8) {
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 < 0) {
                    if (b7 < -32) {
                        if (i9 >= i8) {
                            return b7;
                        }
                        if (b7 >= -62) {
                            i7 += 2;
                            if (bArr[i9] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b7 >= -16) {
                        if (i9 >= i8 - 2) {
                            return AbstractC5139z0.m23825q(bArr, i9, i8);
                        }
                        int i10 = i7 + 2;
                        byte b8 = bArr[i9];
                        if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                            int i11 = i7 + 3;
                            if (bArr[i10] <= -65) {
                                i7 += 4;
                                if (bArr[i11] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i9 >= i8 - 1) {
                        return AbstractC5139z0.m23825q(bArr, i9, i8);
                    }
                    int i12 = i7 + 2;
                    byte b9 = bArr[i9];
                    if (b9 <= -65 && ((b7 != -32 || b9 >= -96) && (b7 != -19 || b9 < -96))) {
                        i7 += 3;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                i7 = i9;
            }
            return 0;
        }

        @Override // com.google.protobuf.AbstractC5139z0.b
        /* JADX INFO: renamed from: b */
        String mo23851b(byte[] bArr, int i7, int i8) throws C5065C {
            if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b7 = bArr[i7];
                if (!a.m23844n(b7)) {
                    break;
                }
                i7++;
                a.m23839i(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b8 = bArr[i7];
                if (a.m23844n(b8)) {
                    int i13 = i11 + 1;
                    a.m23839i(b8, cArr, i11);
                    int i14 = i12;
                    while (i14 < i9) {
                        byte b9 = bArr[i14];
                        if (!a.m23844n(b9)) {
                            break;
                        }
                        i14++;
                        a.m23839i(b9, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i7 = i14;
                } else if (a.m23846p(b8)) {
                    if (i12 >= i9) {
                        throw C5065C.m22893d();
                    }
                    i7 += 2;
                    a.m23841k(b8, bArr[i12], cArr, i11);
                    i11++;
                } else if (a.m23845o(b8)) {
                    if (i12 >= i9 - 1) {
                        throw C5065C.m22893d();
                    }
                    int i15 = i7 + 2;
                    i7 += 3;
                    a.m23840j(b8, bArr[i12], bArr[i15], cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i9 - 2) {
                        throw C5065C.m22893d();
                    }
                    byte b10 = bArr[i12];
                    int i16 = i7 + 3;
                    byte b11 = bArr[i7 + 2];
                    i7 += 4;
                    a.m23838h(b8, b10, b11, bArr[i16], cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        @Override // com.google.protobuf.AbstractC5139z0.b
        /* JADX INFO: renamed from: d */
        String mo23853d(ByteBuffer byteBuffer, int i7, int i8) {
            return m23852c(byteBuffer, i7, i8);
        }

        @Override // com.google.protobuf.AbstractC5139z0.b
        /* JADX INFO: renamed from: e */
        int mo23854e(CharSequence charSequence, byte[] bArr, int i7, int i8) {
            int i9;
            int i10;
            char cCharAt;
            int length = charSequence.length();
            int i11 = i8 + i7;
            int i12 = 0;
            while (i12 < length && (i10 = i12 + i7) < i11 && (cCharAt = charSequence.charAt(i12)) < 128) {
                bArr[i10] = (byte) cCharAt;
                i12++;
            }
            if (i12 == length) {
                return i7 + length;
            }
            int i13 = i7 + i12;
            while (i12 < length) {
                char cCharAt2 = charSequence.charAt(i12);
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
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i9 = i12 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i9)))) {
                                throw new d(i12, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i13);
                        }
                        int i15 = i12 + 1;
                        if (i15 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i15);
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

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.AbstractC5139z0.b
        /* JADX INFO: renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int mo23858i(int i7, byte[] bArr, int i8, int i9) {
            byte b7;
            int i10;
            int i11;
            if (i7 != 0) {
                if (i8 >= i9) {
                    return i7;
                }
                byte b8 = (byte) i7;
                if (b8 < -32) {
                    if (b8 >= -62) {
                        i11 = i8 + 1;
                    }
                    return -1;
                }
                if (b8 < -16) {
                    byte b9 = (byte) (~(i7 >> 8));
                    if (b9 == 0) {
                        int i12 = i8 + 1;
                        byte b10 = bArr[i8];
                        if (i12 >= i9) {
                            return AbstractC5139z0.m23822n(b8, b10);
                        }
                        i8 = i12;
                        b9 = b10;
                    }
                    if (b9 <= -65 && ((b8 != -32 || b9 >= -96) && (b8 != -19 || b9 < -96))) {
                        i11 = i8 + 1;
                    }
                    return -1;
                }
                byte b11 = (byte) (~(i7 >> 8));
                if (b11 == 0) {
                    i10 = i8 + 1;
                    b11 = bArr[i8];
                    if (i10 >= i9) {
                        return AbstractC5139z0.m23822n(b8, b11);
                    }
                    b7 = 0;
                } else {
                    b7 = (byte) (i7 >> 16);
                    i10 = i8;
                }
                if (b7 == 0) {
                    int i13 = i10 + 1;
                    byte b12 = bArr[i10];
                    if (i13 >= i9) {
                        return AbstractC5139z0.m23823o(b8, b11, b12);
                    }
                    b7 = b12;
                    i10 = i13;
                }
                if (b11 <= -65 && (((b8 << 28) + (b11 + 112)) >> 30) == 0 && b7 <= -65) {
                    i8 = i10 + 1;
                }
                return -1;
                i8 = i11;
            }
            return m23861m(bArr, i8, i9);
        }

        @Override // com.google.protobuf.AbstractC5139z0.b
        /* JADX INFO: renamed from: l */
        int mo23860l(int i7, ByteBuffer byteBuffer, int i8, int i9) {
            return m23859k(i7, byteBuffer, i8, i9);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.z0$d */
    static class d extends IllegalArgumentException {
        d(int i7, int i8) {
            super("Unpaired surrogate at index " + i7 + " of " + i8);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.z0$e */
    static final class e extends b {
        e() {
        }

        /* JADX INFO: renamed from: m */
        static boolean m23863m() {
            return AbstractC5137y0.m23737I() && AbstractC5137y0.m23738J();
        }

        /* JADX INFO: renamed from: n */
        private static int m23864n(long j7, int i7) {
            int iM23866p = m23866p(j7, i7);
            long j8 = j7 + ((long) iM23866p);
            int i8 = i7 - iM23866p;
            while (true) {
                byte bM23775w = 0;
                while (i8 > 0) {
                    long j9 = j8 + 1;
                    bM23775w = AbstractC5137y0.m23775w(j8);
                    if (bM23775w < 0) {
                        j8 = j9;
                        break;
                    }
                    i8--;
                    j8 = j9;
                }
                if (i8 == 0) {
                    return 0;
                }
                int i9 = i8 - 1;
                if (bM23775w < -32) {
                    if (i9 == 0) {
                        return bM23775w;
                    }
                    i8 -= 2;
                    if (bM23775w >= -62) {
                        long j10 = 1 + j8;
                        if (AbstractC5137y0.m23775w(j8) <= -65) {
                            j8 = j10;
                        }
                    }
                    return -1;
                }
                if (bM23775w >= -16) {
                    if (i9 < 3) {
                        return m23868r(j8, bM23775w, i9);
                    }
                    i8 -= 4;
                    long j11 = 1 + j8;
                    byte bM23775w2 = AbstractC5137y0.m23775w(j8);
                    if (bM23775w2 <= -65 && (((bM23775w << 28) + (bM23775w2 + 112)) >> 30) == 0) {
                        long j12 = 2 + j8;
                        if (AbstractC5137y0.m23775w(j11) <= -65) {
                            j8 += 3;
                            if (AbstractC5137y0.m23775w(j12) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i9 < 2) {
                    return m23868r(j8, bM23775w, i9);
                }
                i8 -= 3;
                long j13 = 1 + j8;
                byte bM23775w3 = AbstractC5137y0.m23775w(j8);
                if (bM23775w3 <= -65 && ((bM23775w != -32 || bM23775w3 >= -96) && (bM23775w != -19 || bM23775w3 < -96))) {
                    j8 += 2;
                    if (AbstractC5137y0.m23775w(j13) > -65) {
                    }
                }
                return -1;
            }
        }

        /* JADX INFO: renamed from: o */
        private static int m23865o(byte[] bArr, long j7, int i7) {
            int iM23867q = m23867q(bArr, j7, i7);
            int i8 = i7 - iM23867q;
            long j8 = j7 + ((long) iM23867q);
            while (true) {
                byte bM23776x = 0;
                while (i8 > 0) {
                    long j9 = j8 + 1;
                    bM23776x = AbstractC5137y0.m23776x(bArr, j8);
                    if (bM23776x < 0) {
                        j8 = j9;
                        break;
                    }
                    i8--;
                    j8 = j9;
                }
                if (i8 == 0) {
                    return 0;
                }
                int i9 = i8 - 1;
                if (bM23776x < -32) {
                    if (i9 == 0) {
                        return bM23776x;
                    }
                    i8 -= 2;
                    if (bM23776x >= -62) {
                        long j10 = 1 + j8;
                        if (AbstractC5137y0.m23776x(bArr, j8) <= -65) {
                            j8 = j10;
                        }
                    }
                    return -1;
                }
                if (bM23776x >= -16) {
                    if (i9 < 3) {
                        return m23869s(bArr, bM23776x, j8, i9);
                    }
                    i8 -= 4;
                    long j11 = 1 + j8;
                    byte bM23776x2 = AbstractC5137y0.m23776x(bArr, j8);
                    if (bM23776x2 <= -65 && (((bM23776x << 28) + (bM23776x2 + 112)) >> 30) == 0) {
                        long j12 = 2 + j8;
                        if (AbstractC5137y0.m23776x(bArr, j11) <= -65) {
                            j8 += 3;
                            if (AbstractC5137y0.m23776x(bArr, j12) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i9 < 2) {
                    return m23869s(bArr, bM23776x, j8, i9);
                }
                i8 -= 3;
                long j13 = 1 + j8;
                byte bM23776x3 = AbstractC5137y0.m23776x(bArr, j8);
                if (bM23776x3 <= -65 && ((bM23776x != -32 || bM23776x3 >= -96) && (bM23776x != -19 || bM23776x3 < -96))) {
                    j8 += 2;
                    if (AbstractC5137y0.m23776x(bArr, j13) > -65) {
                    }
                }
                return -1;
            }
        }

        /* JADX INFO: renamed from: p */
        private static int m23866p(long j7, int i7) {
            if (i7 < 16) {
                return 0;
            }
            int i8 = (int) ((-j7) & 7);
            int i9 = i8;
            while (i9 > 0) {
                long j8 = 1 + j7;
                if (AbstractC5137y0.m23775w(j7) < 0) {
                    return i8 - i9;
                }
                i9--;
                j7 = j8;
            }
            int i10 = i7 - i8;
            while (i10 >= 8 && (AbstractC5137y0.m23732D(j7) & (-9187201950435737472L)) == 0) {
                j7 += 8;
                i10 -= 8;
            }
            return i7 - i10;
        }

        /* JADX INFO: renamed from: q */
        private static int m23867q(byte[] bArr, long j7, int i7) {
            int i8 = 0;
            if (i7 < 16) {
                return 0;
            }
            int i9 = 8 - (((int) j7) & 7);
            while (i8 < i9) {
                long j8 = 1 + j7;
                if (AbstractC5137y0.m23776x(bArr, j7) < 0) {
                    return i8;
                }
                i8++;
                j7 = j8;
            }
            while (true) {
                int i10 = i8 + 8;
                if (i10 > i7 || (AbstractC5137y0.m23733E(bArr, AbstractC5137y0.f19639h + j7) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j7 += 8;
                i8 = i10;
            }
            while (i8 < i7) {
                long j9 = j7 + 1;
                if (AbstractC5137y0.m23776x(bArr, j7) < 0) {
                    return i8;
                }
                i8++;
                j7 = j9;
            }
            return i7;
        }

        /* JADX INFO: renamed from: r */
        private static int m23868r(long j7, int i7, int i8) {
            if (i8 == 0) {
                return AbstractC5139z0.m23821m(i7);
            }
            if (i8 == 1) {
                return AbstractC5139z0.m23822n(i7, AbstractC5137y0.m23775w(j7));
            }
            if (i8 == 2) {
                return AbstractC5139z0.m23823o(i7, AbstractC5137y0.m23775w(j7), AbstractC5137y0.m23775w(j7 + 1));
            }
            throw new AssertionError();
        }

        /* JADX INFO: renamed from: s */
        private static int m23869s(byte[] bArr, int i7, long j7, int i8) {
            if (i8 == 0) {
                return AbstractC5139z0.m23821m(i7);
            }
            if (i8 == 1) {
                return AbstractC5139z0.m23822n(i7, AbstractC5137y0.m23776x(bArr, j7));
            }
            if (i8 == 2) {
                return AbstractC5139z0.m23823o(i7, AbstractC5137y0.m23776x(bArr, j7), AbstractC5137y0.m23776x(bArr, j7 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.AbstractC5139z0.b
        /* JADX INFO: renamed from: b */
        String mo23851b(byte[] bArr, int i7, int i8) throws C5065C {
            Charset charset = AbstractC5063B.f19294b;
            String str = new String(bArr, i7, i8, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i8 + i7))) {
                throw C5065C.m22893d();
            }
            return str;
        }

        @Override // com.google.protobuf.AbstractC5139z0.b
        /* JADX INFO: renamed from: d */
        String mo23853d(ByteBuffer byteBuffer, int i7, int i8) throws C5065C {
            if ((i7 | i8 | ((byteBuffer.limit() - i7) - i8)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            long jM23763k = AbstractC5137y0.m23763k(byteBuffer) + ((long) i7);
            long j7 = ((long) i8) + jM23763k;
            char[] cArr = new char[i8];
            int i9 = 0;
            while (jM23763k < j7) {
                byte bM23775w = AbstractC5137y0.m23775w(jM23763k);
                if (!a.m23844n(bM23775w)) {
                    break;
                }
                jM23763k++;
                a.m23839i(bM23775w, cArr, i9);
                i9++;
            }
            int i10 = i9;
            while (jM23763k < j7) {
                long j8 = jM23763k + 1;
                byte bM23775w2 = AbstractC5137y0.m23775w(jM23763k);
                if (a.m23844n(bM23775w2)) {
                    int i11 = i10 + 1;
                    a.m23839i(bM23775w2, cArr, i10);
                    long j9 = j8;
                    while (j9 < j7) {
                        byte bM23775w3 = AbstractC5137y0.m23775w(j9);
                        if (!a.m23844n(bM23775w3)) {
                            break;
                        }
                        j9++;
                        a.m23839i(bM23775w3, cArr, i11);
                        i11++;
                    }
                    i10 = i11;
                    jM23763k = j9;
                } else if (a.m23846p(bM23775w2)) {
                    if (j8 >= j7) {
                        throw C5065C.m22893d();
                    }
                    jM23763k += 2;
                    a.m23841k(bM23775w2, AbstractC5137y0.m23775w(j8), cArr, i10);
                    i10++;
                } else if (a.m23845o(bM23775w2)) {
                    if (j8 >= j7 - 1) {
                        throw C5065C.m22893d();
                    }
                    long j10 = 2 + jM23763k;
                    jM23763k += 3;
                    a.m23840j(bM23775w2, AbstractC5137y0.m23775w(j8), AbstractC5137y0.m23775w(j10), cArr, i10);
                    i10++;
                } else {
                    if (j8 >= j7 - 2) {
                        throw C5065C.m22893d();
                    }
                    byte bM23775w4 = AbstractC5137y0.m23775w(j8);
                    long j11 = jM23763k + 3;
                    byte bM23775w5 = AbstractC5137y0.m23775w(2 + jM23763k);
                    jM23763k += 4;
                    a.m23838h(bM23775w2, bM23775w4, bM23775w5, AbstractC5137y0.m23775w(j11), cArr, i10);
                    i10 += 2;
                }
            }
            return new String(cArr, 0, i10);
        }

        @Override // com.google.protobuf.AbstractC5139z0.b
        /* JADX INFO: renamed from: e */
        int mo23854e(CharSequence charSequence, byte[] bArr, int i7, int i8) {
            long j7;
            long j8;
            long j9;
            int i9;
            char cCharAt;
            long j10 = i7;
            long j11 = ((long) i8) + j10;
            int length = charSequence.length();
            if (length > i8 || bArr.length - i8 < i7) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i7 + i8));
            }
            int i10 = 0;
            while (true) {
                j7 = 1;
                if (i10 >= length || (cCharAt = charSequence.charAt(i10)) >= 128) {
                    break;
                }
                AbstractC5137y0.m23743O(bArr, j10, (byte) cCharAt);
                i10++;
                j10 = 1 + j10;
            }
            if (i10 == length) {
                return (int) j10;
            }
            while (i10 < length) {
                char cCharAt2 = charSequence.charAt(i10);
                if (cCharAt2 < 128 && j10 < j11) {
                    AbstractC5137y0.m23743O(bArr, j10, (byte) cCharAt2);
                    j9 = j11;
                    j8 = j7;
                    j10 += j7;
                } else if (cCharAt2 >= 2048 || j10 > j11 - 2) {
                    j8 = j7;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j10 > j11 - 3) {
                        j9 = j11;
                        if (j10 > j9 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i9 = i10 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i9)))) {
                                throw new d(i10, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j10);
                        }
                        int i11 = i10 + 1;
                        if (i11 != length) {
                            char cCharAt3 = charSequence.charAt(i11);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                AbstractC5137y0.m23743O(bArr, j10, (byte) ((codePoint >>> 18) | 240));
                                AbstractC5137y0.m23743O(bArr, j10 + j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = j10 + 3;
                                AbstractC5137y0.m23743O(bArr, j10 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j10 += 4;
                                AbstractC5137y0.m23743O(bArr, j12, (byte) ((codePoint & 63) | 128));
                                i10 = i11;
                            } else {
                                i10 = i11;
                            }
                        }
                        throw new d(i10 - 1, length);
                    }
                    AbstractC5137y0.m23743O(bArr, j10, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j13 = j10 + 2;
                    j9 = j11;
                    AbstractC5137y0.m23743O(bArr, j10 + j8, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j10 += 3;
                    AbstractC5137y0.m23743O(bArr, j13, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j8 = j7;
                    long j14 = j10 + j8;
                    AbstractC5137y0.m23743O(bArr, j10, (byte) ((cCharAt2 >>> 6) | 960));
                    j10 += 2;
                    AbstractC5137y0.m23743O(bArr, j14, (byte) ((cCharAt2 & '?') | 128));
                    j9 = j11;
                }
                i10++;
                j7 = j8;
                j11 = j9;
            }
            return (int) j10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.protobuf.AbstractC5137y0.m23776x(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.AbstractC5137y0.m23776x(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.AbstractC5139z0.b
        /* JADX INFO: renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int mo23858i(int i7, byte[] bArr, int i8, int i9) {
            byte bM23776x;
            long j7;
            if ((i8 | i9 | (bArr.length - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            long j8 = i8;
            long j9 = i9;
            if (i7 != 0) {
                if (j8 >= j9) {
                    return i7;
                }
                byte b7 = (byte) i7;
                if (b7 < -32) {
                    if (b7 >= -62) {
                        long j10 = 1 + j8;
                        if (AbstractC5137y0.m23776x(bArr, j8) <= -65) {
                            j8 = j10;
                        }
                    }
                    return -1;
                }
                if (b7 < -16) {
                    byte bM23776x2 = (byte) (~(i7 >> 8));
                    if (bM23776x2 == 0) {
                        long j11 = j8 + 1;
                        bM23776x2 = AbstractC5137y0.m23776x(bArr, j8);
                        if (j11 >= j9) {
                            return AbstractC5139z0.m23822n(b7, bM23776x2);
                        }
                        j8 = j11;
                    }
                    if (bM23776x2 <= -65 && ((b7 != -32 || bM23776x2 >= -96) && (b7 != -19 || bM23776x2 < -96))) {
                        j7 = j8 + 1;
                    }
                    return -1;
                }
                byte bM23776x3 = (byte) (~(i7 >> 8));
                if (bM23776x3 == 0) {
                    long j12 = j8 + 1;
                    bM23776x3 = AbstractC5137y0.m23776x(bArr, j8);
                    if (j12 >= j9) {
                        return AbstractC5139z0.m23822n(b7, bM23776x3);
                    }
                    bM23776x = 0;
                    j8 = j12;
                } else {
                    bM23776x = (byte) (i7 >> 16);
                }
                if (bM23776x == 0) {
                    long j13 = j8 + 1;
                    bM23776x = AbstractC5137y0.m23776x(bArr, j8);
                    if (j13 >= j9) {
                        return AbstractC5139z0.m23823o(b7, bM23776x3, bM23776x);
                    }
                    j8 = j13;
                }
                if (bM23776x3 <= -65 && (((b7 << 28) + (bM23776x3 + 112)) >> 30) == 0 && bM23776x <= -65) {
                    j7 = j8 + 1;
                }
                return -1;
                j8 = j7;
            }
            return m23865o(bArr, j8, (int) (j9 - j8));
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.AbstractC5137y0.m23775w(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.protobuf.AbstractC5137y0.m23775w(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.AbstractC5137y0.m23775w(r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.AbstractC5139z0.b
        /* JADX INFO: renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int mo23860l(int i7, ByteBuffer byteBuffer, int i8, int i9) {
            byte bM23775w;
            long j7;
            if ((i8 | i9 | (byteBuffer.limit() - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            long jM23763k = AbstractC5137y0.m23763k(byteBuffer) + ((long) i8);
            long j8 = ((long) (i9 - i8)) + jM23763k;
            if (i7 != 0) {
                if (jM23763k >= j8) {
                    return i7;
                }
                byte b7 = (byte) i7;
                if (b7 < -32) {
                    if (b7 >= -62) {
                        j7 = 1 + jM23763k;
                    }
                    return -1;
                }
                if (b7 < -16) {
                    byte bM23775w2 = (byte) (~(i7 >> 8));
                    if (bM23775w2 == 0) {
                        long j9 = jM23763k + 1;
                        bM23775w2 = AbstractC5137y0.m23775w(jM23763k);
                        if (j9 >= j8) {
                            return AbstractC5139z0.m23822n(b7, bM23775w2);
                        }
                        jM23763k = j9;
                    }
                    if (bM23775w2 <= -65 && ((b7 != -32 || bM23775w2 >= -96) && (b7 != -19 || bM23775w2 < -96))) {
                        j7 = 1 + jM23763k;
                    }
                    return -1;
                }
                byte bM23775w3 = (byte) (~(i7 >> 8));
                if (bM23775w3 == 0) {
                    long j10 = jM23763k + 1;
                    bM23775w3 = AbstractC5137y0.m23775w(jM23763k);
                    if (j10 >= j8) {
                        return AbstractC5139z0.m23822n(b7, bM23775w3);
                    }
                    bM23775w = 0;
                    jM23763k = j10;
                } else {
                    bM23775w = (byte) (i7 >> 16);
                }
                if (bM23775w == 0) {
                    long j11 = jM23763k + 1;
                    bM23775w = AbstractC5137y0.m23775w(jM23763k);
                    if (j11 >= j8) {
                        return AbstractC5139z0.m23823o(b7, bM23775w3, bM23775w);
                    }
                    jM23763k = j11;
                }
                if (bM23775w3 <= -65 && (((b7 << 28) + (bM23775w3 + 112)) >> 30) == 0 && bM23775w <= -65) {
                    j7 = 1 + jM23763k;
                }
                return -1;
                jM23763k = j7;
            }
            return m23864n(jM23763k, (int) (j8 - jM23763k));
        }
    }

    static {
        f19657a = (!e.m23863m() || AbstractC5094d.m23098c()) ? new c() : new e();
    }

    /* JADX INFO: renamed from: g */
    static String m23815g(ByteBuffer byteBuffer, int i7, int i8) {
        return f19657a.m23850a(byteBuffer, i7, i8);
    }

    /* JADX INFO: renamed from: h */
    static String m23816h(byte[] bArr, int i7, int i8) {
        return f19657a.mo23851b(bArr, i7, i8);
    }

    /* JADX INFO: renamed from: i */
    static int m23817i(CharSequence charSequence, byte[] bArr, int i7, int i8) {
        return f19657a.mo23854e(charSequence, bArr, i7, i8);
    }

    /* JADX INFO: renamed from: j */
    static int m23818j(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length && charSequence.charAt(i7) < 128) {
            i7++;
        }
        int iM23819k = length;
        while (i7 < length) {
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt >= 2048) {
                iM23819k += m23819k(charSequence, i7);
                break;
            }
            iM23819k += (127 - cCharAt) >>> 31;
            i7++;
        }
        if (iM23819k >= length) {
            return iM23819k;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iM23819k) + 4294967296L));
    }

    /* JADX INFO: renamed from: k */
    private static int m23819k(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        int i8 = 0;
        while (i7 < length) {
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt < 2048) {
                i8 += (127 - cCharAt) >>> 31;
            } else {
                i8 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i7) < 65536) {
                        throw new d(i7, length);
                    }
                    i7++;
                }
            }
            i7++;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static int m23820l(ByteBuffer byteBuffer, int i7, int i8) {
        int i9 = i8 - 7;
        int i10 = i7;
        while (i10 < i9 && (byteBuffer.getLong(i10) & (-9187201950435737472L)) == 0) {
            i10 += 8;
        }
        return i10 - i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static int m23821m(int i7) {
        if (i7 > -12) {
            return -1;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static int m23822n(int i7, int i8) {
        if (i7 > -12 || i8 > -65) {
            return -1;
        }
        return i7 ^ (i8 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static int m23823o(int i7, int i8, int i9) {
        if (i7 > -12 || i8 > -65 || i9 > -65) {
            return -1;
        }
        return (i7 ^ (i8 << 8)) ^ (i9 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static int m23824p(ByteBuffer byteBuffer, int i7, int i8, int i9) {
        if (i9 == 0) {
            return m23821m(i7);
        }
        if (i9 == 1) {
            return m23822n(i7, byteBuffer.get(i8));
        }
        if (i9 == 2) {
            return m23823o(i7, byteBuffer.get(i8), byteBuffer.get(i8 + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static int m23825q(byte[] bArr, int i7, int i8) {
        byte b7 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 == 0) {
            return m23821m(b7);
        }
        if (i9 == 1) {
            return m23822n(b7, bArr[i7]);
        }
        if (i9 == 2) {
            return m23823o(b7, bArr[i7], bArr[i7 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: r */
    static boolean m23826r(ByteBuffer byteBuffer) {
        return f19657a.m23855f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: s */
    static boolean m23827s(byte[] bArr) {
        return f19657a.m23856g(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: t */
    static boolean m23828t(byte[] bArr, int i7, int i8) {
        return f19657a.m23856g(bArr, i7, i8);
    }

    /* JADX INFO: renamed from: u */
    static int m23829u(int i7, ByteBuffer byteBuffer, int i8, int i9) {
        return f19657a.m23857h(i7, byteBuffer, i8, i9);
    }

    /* JADX INFO: renamed from: v */
    static int m23830v(int i7, byte[] bArr, int i8, int i9) {
        return f19657a.mo23858i(i7, bArr, i8, i9);
    }
}

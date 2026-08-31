package p257h1;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: h1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5549a {

    /* JADX INFO: renamed from: h1.a$b */
    private static abstract class b {

        /* JADX INFO: renamed from: a */
        byte[] f21384a;

        /* JADX INFO: renamed from: b */
        int f21385b;

        private b() {
        }
    }

    /* JADX INFO: renamed from: h1.a$c */
    private static class c extends b {

        /* JADX INFO: renamed from: f */
        private static final int[] f21386f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: g */
        private static final int[] f21387g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: c */
        private int f21388c;

        /* JADX INFO: renamed from: d */
        private int f21389d;

        /* JADX INFO: renamed from: e */
        private final int[] f21390e;

        c(int i7, byte[] bArr) {
            super();
            this.f21384a = bArr;
            this.f21390e = (i7 & 8) == 0 ? f21386f : f21387g;
            this.f21388c = 0;
            this.f21389d = 0;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
        /* JADX INFO: renamed from: a */
        boolean m24939a(byte[] bArr, int i7, int i8, boolean z7) {
            int i9 = this.f21388c;
            if (i9 == 6) {
                return false;
            }
            int i10 = i8 + i7;
            int i11 = this.f21389d;
            byte[] bArr2 = this.f21384a;
            int[] iArr = this.f21390e;
            int i12 = 0;
            int i13 = i11;
            int i14 = i9;
            int i15 = i7;
            while (i15 < i10) {
                if (i14 == 0) {
                    while (true) {
                        int i16 = i15 + 4;
                        if (i16 > i10 || (i13 = (iArr[bArr[i15] & 255] << 18) | (iArr[bArr[i15 + 1] & 255] << 12) | (iArr[bArr[i15 + 2] & 255] << 6) | iArr[bArr[i15 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i12 + 2] = (byte) i13;
                        bArr2[i12 + 1] = (byte) (i13 >> 8);
                        bArr2[i12] = (byte) (i13 >> 16);
                        i12 += 3;
                        i15 = i16;
                    }
                    if (i15 >= i10) {
                        break;
                    }
                }
                int i17 = i15 + 1;
                int i18 = iArr[bArr[i15] & 255];
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 != 4) {
                                    if (i14 == 5 && i18 != -1) {
                                        this.f21388c = 6;
                                        return false;
                                    }
                                } else if (i18 == -2) {
                                    i14++;
                                } else if (i18 != -1) {
                                    this.f21388c = 6;
                                    return false;
                                }
                            } else if (i18 >= 0) {
                                int i19 = i18 | (i13 << 6);
                                bArr2[i12 + 2] = (byte) i19;
                                bArr2[i12 + 1] = (byte) (i19 >> 8);
                                bArr2[i12] = (byte) (i19 >> 16);
                                i12 += 3;
                                i13 = i19;
                                i14 = 0;
                            } else if (i18 == -2) {
                                bArr2[i12 + 1] = (byte) (i13 >> 2);
                                bArr2[i12] = (byte) (i13 >> 10);
                                i12 += 2;
                                i14 = 5;
                            } else if (i18 != -1) {
                                this.f21388c = 6;
                                return false;
                            }
                        } else if (i18 >= 0) {
                            i18 |= i13 << 6;
                            i14++;
                            i13 = i18;
                        } else if (i18 == -2) {
                            bArr2[i12] = (byte) (i13 >> 4);
                            i12++;
                            i14 = 4;
                        } else if (i18 != -1) {
                            this.f21388c = 6;
                            return false;
                        }
                    } else if (i18 >= 0) {
                        i18 |= i13 << 6;
                        i14++;
                        i13 = i18;
                    } else if (i18 != -1) {
                        this.f21388c = 6;
                        return false;
                    }
                } else if (i18 >= 0) {
                    i14++;
                    i13 = i18;
                } else if (i18 != -1) {
                    this.f21388c = 6;
                    return false;
                }
                i15 = i17;
            }
            if (!z7) {
                this.f21388c = i14;
                this.f21389d = i13;
                this.f21385b = i12;
                return true;
            }
            if (i14 == 1) {
                this.f21388c = 6;
                return false;
            }
            if (i14 == 2) {
                bArr2[i12] = (byte) (i13 >> 4);
                i12++;
            } else if (i14 == 3) {
                int i20 = i12 + 1;
                bArr2[i12] = (byte) (i13 >> 10);
                i12 += 2;
                bArr2[i20] = (byte) (i13 >> 2);
            } else if (i14 == 4) {
                this.f21388c = 6;
                return false;
            }
            this.f21388c = i14;
            this.f21385b = i12;
            return true;
        }
    }

    /* JADX INFO: renamed from: h1.a$d */
    private static class d extends b {

        /* JADX INFO: renamed from: j */
        private static final byte[] f21391j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: k */
        private static final byte[] f21392k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: c */
        private final byte[] f21393c;

        /* JADX INFO: renamed from: d */
        int f21394d;

        /* JADX INFO: renamed from: e */
        private int f21395e;

        /* JADX INFO: renamed from: f */
        final boolean f21396f;

        /* JADX INFO: renamed from: g */
        final boolean f21397g;

        /* JADX INFO: renamed from: h */
        final boolean f21398h;

        /* JADX INFO: renamed from: i */
        private final byte[] f21399i;

        d(int i7, byte[] bArr) {
            super();
            this.f21384a = bArr;
            this.f21396f = (i7 & 1) == 0;
            boolean z7 = (i7 & 2) == 0;
            this.f21397g = z7;
            this.f21398h = (i7 & 4) != 0;
            this.f21399i = (i7 & 8) == 0 ? f21391j : f21392k;
            this.f21393c = new byte[2];
            this.f21394d = 0;
            this.f21395e = z7 ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        /* JADX INFO: renamed from: a */
        void m24940a(byte[] bArr, int i7, int i8, boolean z7) {
            int i9;
            int i10;
            int i11;
            int i12;
            byte b7;
            byte b8;
            byte b9;
            int i13;
            int i14;
            byte[] bArr2 = this.f21399i;
            byte[] bArr3 = this.f21384a;
            int i15 = this.f21395e;
            int i16 = i8 + i7;
            int i17 = this.f21394d;
            char c7 = 2;
            int i18 = 1;
            if (i17 != 1) {
                if (i17 == 2 && (i14 = i7 + 1) <= i16) {
                    byte[] bArr4 = this.f21393c;
                    i10 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i7] & 255);
                    this.f21394d = 0;
                    i9 = i14;
                } else {
                    i9 = i7;
                    i10 = -1;
                }
            } else if (i7 + 2 <= i16) {
                i9 = i7 + 2;
                i10 = (bArr[i7 + 1] & 255) | ((this.f21393c[0] & 255) << 16) | ((bArr[i7] & 255) << 8);
                this.f21394d = 0;
            } else {
                i9 = i7;
                i10 = -1;
            }
            if (i10 != -1) {
                bArr3[0] = bArr2[(i10 >> 18) & 63];
                bArr3[1] = bArr2[(i10 >> 12) & 63];
                bArr3[2] = bArr2[(i10 >> 6) & 63];
                bArr3[3] = bArr2[i10 & 63];
                i15--;
                if (i15 == 0) {
                    if (this.f21398h) {
                        bArr3[4] = 13;
                        i13 = 5;
                    } else {
                        i13 = 4;
                    }
                    i11 = i13 + 1;
                    bArr3[i13] = 10;
                    i15 = 19;
                } else {
                    i11 = 4;
                }
            } else {
                i11 = 0;
            }
            while (true) {
                i9 += 3;
                if (i9 > i16) {
                    break;
                }
                c7 = c7;
                int i19 = ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9] & 255) << 16) | (bArr[i9 + 2] & 255);
                bArr3[i11] = bArr2[(i19 >> 18) & 63];
                bArr3[i11 + 1] = bArr2[(i19 >> 12) & 63];
                bArr3[i11 + 2] = bArr2[(i19 >> 6) & 63];
                bArr3[i11 + 3] = bArr2[i19 & 63];
                int i20 = i11 + 4;
                i15--;
                if (i15 == 0) {
                    if (this.f21398h) {
                        bArr3[i20] = 13;
                        i20 = i11 + 5;
                    }
                    i11 = i20 + 1;
                    bArr3[i20] = 10;
                    i15 = 19;
                } else {
                    i11 = i20;
                }
            }
            if (z7) {
                int i21 = this.f21394d;
                if (i9 - i21 == i16 - 1) {
                    if (i21 > 0) {
                        b9 = this.f21393c[0];
                    } else {
                        b9 = bArr[i9];
                        i18 = 0;
                    }
                    int i22 = (b9 & 255) << 4;
                    this.f21394d = i21 - i18;
                    bArr3[i11] = bArr2[(i22 >> 6) & 63];
                    int i23 = i11 + 2;
                    bArr3[i11 + 1] = bArr2[i22 & 63];
                    if (this.f21396f) {
                        bArr3[i23] = 61;
                        i23 = i11 + 4;
                        bArr3[i11 + 3] = 61;
                    }
                    if (this.f21397g) {
                        if (this.f21398h) {
                            bArr3[i23] = 13;
                            i23++;
                        }
                        i12 = i23 + 1;
                        bArr3[i23] = 10;
                        i11 = i12;
                    } else {
                        i11 = i23;
                    }
                } else if (i9 - i21 == i16 - 2) {
                    if (i21 > 1) {
                        b7 = this.f21393c[0];
                    } else {
                        byte b10 = bArr[i9];
                        i9++;
                        b7 = b10;
                        i18 = 0;
                    }
                    int i24 = (b7 & 255) << 10;
                    if (i21 > 0) {
                        b8 = this.f21393c[i18];
                        i18++;
                    } else {
                        b8 = bArr[i9];
                    }
                    int i25 = i24 | ((b8 & 255) << 2);
                    this.f21394d = i21 - i18;
                    bArr3[i11] = bArr2[(i25 >> 12) & 63];
                    bArr3[i11 + 1] = bArr2[(i25 >> 6) & 63];
                    int i26 = i11 + 3;
                    bArr3[i11 + 2] = bArr2[i25 & 63];
                    if (this.f21396f) {
                        bArr3[i26] = 61;
                        i26 = i11 + 4;
                    }
                    if (this.f21397g) {
                        if (this.f21398h) {
                            bArr3[i26] = 13;
                            i26++;
                        }
                        i12 = i26 + 1;
                        bArr3[i26] = 10;
                        i11 = i12;
                    } else {
                        i11 = i26;
                    }
                } else if (this.f21397g && i11 > 0 && i15 != 19) {
                    if (this.f21398h) {
                        bArr3[i11] = 13;
                        i11++;
                    }
                    i12 = i11 + 1;
                    bArr3[i11] = 10;
                    i11 = i12;
                }
            } else if (i9 == i16 - 1) {
                byte[] bArr5 = this.f21393c;
                int i27 = this.f21394d;
                this.f21394d = i27 + 1;
                bArr5[i27] = bArr[i9];
            } else if (i9 == i16 - 2) {
                byte[] bArr6 = this.f21393c;
                int i28 = this.f21394d;
                int i29 = i28 + 1;
                this.f21394d = i29;
                bArr6[i28] = bArr[i9];
                this.f21394d = i28 + 2;
                bArr6[i29] = bArr[i9 + 1];
            }
            this.f21385b = i11;
            this.f21395e = i15;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m24933a(String str, int i7) {
        return m24934b(str.getBytes(), i7);
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m24934b(byte[] bArr, int i7) {
        return m24935c(bArr, 0, bArr.length, i7);
    }

    /* JADX INFO: renamed from: c */
    private static byte[] m24935c(byte[] bArr, int i7, int i8, int i9) {
        c cVar = new c(i9, new byte[(i8 * 3) / 4]);
        if (!cVar.m24939a(bArr, i7, i8, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i10 = cVar.f21385b;
        byte[] bArr2 = cVar.f21384a;
        if (i10 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(bArr2, 0, bArr3, 0, i10);
        return bArr3;
    }

    /* JADX INFO: renamed from: d */
    private static byte[] m24936d(byte[] bArr, int i7) {
        return m24937e(bArr, 0, bArr.length, i7);
    }

    /* JADX INFO: renamed from: e */
    private static byte[] m24937e(byte[] bArr, int i7, int i8, int i9) {
        d dVar = new d(i9, null);
        int i10 = (i8 / 3) * 4;
        if (!dVar.f21396f) {
            int i11 = i8 % 3;
            if (i11 == 1) {
                i10 += 2;
            } else if (i11 == 2) {
                i10 += 3;
            }
        } else if (i8 % 3 > 0) {
            i10 += 4;
        }
        if (dVar.f21397g && i8 > 0) {
            i10 += (((i8 - 1) / 57) + 1) * (dVar.f21398h ? 2 : 1);
        }
        dVar.f21384a = new byte[i10];
        dVar.m24940a(bArr, i7, i8, true);
        return dVar.f21384a;
    }

    /* JADX INFO: renamed from: f */
    public static String m24938f(byte[] bArr, int i7) {
        try {
            return new String(m24936d(bArr, i7), "US-ASCII");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }
}

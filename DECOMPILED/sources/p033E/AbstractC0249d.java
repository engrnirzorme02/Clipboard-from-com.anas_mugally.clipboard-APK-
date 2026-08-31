package p033E;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: E.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0249d {

    /* JADX INFO: renamed from: E.d$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        int f989a;

        /* JADX INFO: renamed from: b */
        boolean f990b;

        a() {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1191a(ArrayList arrayList, char c7, float[] fArr) {
        arrayList.add(new b(c7, fArr));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1192b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            if (bVarArr[i7].f991a != bVarArr2[i7].f991a || bVarArr[i7].f992b.length != bVarArr2[i7].f992b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    static float[] m1193c(float[] fArr, int i7, int i8) {
        if (i7 > i8) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i7 < 0 || i7 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i9 = i8 - i7;
        int iMin = Math.min(i9, length - i7);
        float[] fArr2 = new float[i9];
        System.arraycopy(fArr, i7, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: d */
    public static b[] m1194d(String str) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = 1;
        while (i8 < str.length()) {
            int iM1199i = m1199i(str, i8);
            String strTrim = str.substring(i7, iM1199i).trim();
            if (!strTrim.isEmpty()) {
                m1191a(arrayList, strTrim.charAt(0), m1198h(strTrim));
            }
            i7 = iM1199i;
            i8 = iM1199i + 1;
        }
        if (i8 - i7 == 1 && i7 < str.length()) {
            m1191a(arrayList, str.charAt(i7), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    /* JADX INFO: renamed from: e */
    public static Path m1195e(String str) {
        Path path = new Path();
        try {
            b.m1209h(m1194d(str), path);
            return path;
        } catch (RuntimeException e7) {
            throw new RuntimeException("Error in parsing " + str, e7);
        }
    }

    /* JADX INFO: renamed from: f */
    public static b[] m1196f(b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            bVarArr2[i7] = new b(bVarArr[i7]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX INFO: renamed from: g */
    private static void m1197g(String str, int i7, a aVar) {
        aVar.f990b = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        for (int i8 = i7; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt == ' ') {
                z7 = false;
                z9 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case ',':
                        z7 = false;
                        z9 = true;
                        break;
                    case '-':
                        if (i8 == i7 || z7) {
                            z7 = false;
                        } else {
                            aVar.f990b = true;
                            z7 = false;
                            z9 = true;
                        }
                        break;
                    case '.':
                        if (z8) {
                            aVar.f990b = true;
                            z7 = false;
                            z9 = true;
                        } else {
                            z7 = false;
                            z8 = true;
                        }
                        break;
                    default:
                        z7 = false;
                        break;
                }
            } else {
                z7 = true;
            }
            if (z9) {
                aVar.f989a = i8;
            }
        }
        aVar.f989a = i8;
    }

    /* JADX INFO: renamed from: h */
    private static float[] m1198h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i7 = 1;
            int i8 = 0;
            while (i7 < length) {
                m1197g(str, i7, aVar);
                int i9 = aVar.f989a;
                if (i7 < i9) {
                    fArr[i8] = Float.parseFloat(str.substring(i7, i9));
                    i8++;
                }
                i7 = aVar.f990b ? i9 : i9 + 1;
            }
            return m1193c(fArr, 0, i8);
        } catch (NumberFormatException e7) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e7);
        }
    }

    /* JADX INFO: renamed from: i */
    private static int m1199i(String str, int i7) {
        while (i7 < str.length()) {
            char cCharAt = str.charAt(i7);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i7++;
        }
        return i7;
    }

    /* JADX INFO: renamed from: j */
    public static void m1200j(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c7 = 'm';
        for (b bVar : bVarArr) {
            b.m1206e(path, fArr, c7, bVar.f991a, bVar.f992b);
            c7 = bVar.f991a;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m1201k(b[] bVarArr, b[] bVarArr2) {
        for (int i7 = 0; i7 < bVarArr2.length; i7++) {
            bVarArr[i7].f991a = bVarArr2[i7].f991a;
            for (int i8 = 0; i8 < bVarArr2[i7].f992b.length; i8++) {
                bVarArr[i7].f992b[i8] = bVarArr2[i7].f992b[i8];
            }
        }
    }

    /* JADX INFO: renamed from: E.d$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private char f991a;

        /* JADX INFO: renamed from: b */
        private final float[] f992b;

        b(char c7, float[] fArr) {
            this.f991a = c7;
            this.f992b = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX INFO: renamed from: e */
        public static void m1206e(Path path, float[] fArr, char c7, char c8, float[] fArr2) {
            int i7;
            int i8;
            boolean z7;
            boolean z8;
            char c9;
            char c10;
            int i9;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            Path path2 = path;
            boolean z9 = false;
            float f20 = fArr[0];
            boolean z10 = true;
            float f21 = fArr[1];
            char c11 = 2;
            float f22 = fArr[2];
            char c12 = 3;
            float f23 = fArr[3];
            float f24 = fArr[4];
            float f25 = fArr[5];
            switch (c8) {
                case 'A':
                case 'a':
                    i7 = 7;
                    i8 = i7;
                    break;
                case 'C':
                case 'c':
                    i7 = 6;
                    i8 = i7;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i8 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i8 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i8 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f24, f25);
                    f20 = f24;
                    f22 = f20;
                    f21 = f25;
                    f23 = f21;
                    i8 = 2;
                    break;
            }
            float f26 = f20;
            float f27 = f21;
            float f28 = f24;
            float f29 = f25;
            int i10 = 0;
            char c13 = c7;
            while (i10 < fArr2.length) {
                if (c8 == 'A') {
                    z7 = z9;
                    z8 = z10;
                    c9 = c11;
                    c10 = c12;
                    i9 = i10;
                    int i11 = i9 + 5;
                    int i12 = i9 + 6;
                    m1208g(path, f26, f27, fArr2[i11], fArr2[i12], fArr2[i9], fArr2[i9 + 1], fArr2[i9 + 2], fArr2[i9 + 3] != 0.0f ? z8 : z7, fArr2[i9 + 4] != 0 ? z8 : z7);
                    f22 = fArr2[i11];
                    f26 = f22;
                    f23 = fArr2[i12];
                    f27 = f23;
                } else if (c8 == 'C') {
                    z7 = z9;
                    z8 = z10;
                    c9 = c11;
                    c10 = c12;
                    i9 = i10;
                    int i13 = i9 + 2;
                    int i14 = i9 + 3;
                    int i15 = i9 + 4;
                    int i16 = i9 + 5;
                    path2.cubicTo(fArr2[i9], fArr2[i9 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                    float f30 = fArr2[i15];
                    float f31 = fArr2[i16];
                    float f32 = fArr2[i13];
                    float f33 = fArr2[i14];
                    f26 = f30;
                    f27 = f31;
                    f23 = f33;
                    f22 = f32;
                } else if (c8 != 'H') {
                    if (c8 != 'Q') {
                        z7 = z9;
                        if (c8 == 'V') {
                            z8 = z10;
                            c9 = c11;
                            c10 = c12;
                            i9 = i10;
                            path2.lineTo(f26, fArr2[i9]);
                            f9 = fArr2[i9];
                        } else if (c8 != 'a') {
                            if (c8 != 'c') {
                                z8 = z10;
                                if (c8 != 'h') {
                                    if (c8 != 'q') {
                                        c9 = c11;
                                        if (c8 != 'v') {
                                            if (c8 != 'L') {
                                                if (c8 != 'M') {
                                                    c10 = c12;
                                                    if (c8 == 'S') {
                                                        if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                            f26 = (f26 * 2.0f) - f22;
                                                            f27 = (f27 * 2.0f) - f23;
                                                        }
                                                        float f34 = f26;
                                                        float f35 = f27;
                                                        int i17 = i10 + 1;
                                                        int i18 = i10 + 2;
                                                        int i19 = i10 + 3;
                                                        path2.cubicTo(f34, f35, fArr2[i10], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                        f7 = fArr2[i10];
                                                        f8 = fArr2[i17];
                                                        f26 = fArr2[i18];
                                                        f27 = fArr2[i19];
                                                        i9 = i10;
                                                    } else if (c8 == 'T') {
                                                        if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                            f26 = (f26 * 2.0f) - f22;
                                                            f27 = (f27 * 2.0f) - f23;
                                                        }
                                                        int i20 = i10 + 1;
                                                        path2.quadTo(f26, f27, fArr2[i10], fArr2[i20]);
                                                        float f36 = fArr2[i10];
                                                        f9 = fArr2[i20];
                                                        f22 = f26;
                                                        f23 = f27;
                                                        i9 = i10;
                                                        f26 = f36;
                                                    } else if (c8 == 'l') {
                                                        int i21 = i10 + 1;
                                                        path2.rLineTo(fArr2[i10], fArr2[i21]);
                                                        f26 += fArr2[i10];
                                                        f13 = fArr2[i21];
                                                    } else if (c8 == 'm') {
                                                        float f37 = fArr2[i10];
                                                        f26 += f37;
                                                        float f38 = fArr2[i10 + 1];
                                                        f27 += f38;
                                                        if (i10 > 0) {
                                                            path2.rLineTo(f37, f38);
                                                        } else {
                                                            path2.rMoveTo(f37, f38);
                                                            f28 = f26;
                                                        }
                                                    } else if (c8 == 's') {
                                                        if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                            f16 = f27 - f23;
                                                            f17 = f26 - f22;
                                                        } else {
                                                            f17 = 0.0f;
                                                            f16 = 0.0f;
                                                        }
                                                        int i22 = i10 + 1;
                                                        int i23 = i10 + 2;
                                                        int i24 = i10 + 3;
                                                        path2.rCubicTo(f17, f16, fArr2[i10], fArr2[i22], fArr2[i23], fArr2[i24]);
                                                        f10 = fArr2[i10] + f26;
                                                        f11 = fArr2[i22] + f27;
                                                        f26 += fArr2[i23];
                                                        f12 = fArr2[i24];
                                                    } else if (c8 == 't') {
                                                        if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                            f18 = f26 - f22;
                                                            f19 = f27 - f23;
                                                        } else {
                                                            f19 = 0.0f;
                                                            f18 = 0.0f;
                                                        }
                                                        int i25 = i10 + 1;
                                                        path2.rQuadTo(f18, f19, fArr2[i10], fArr2[i25]);
                                                        float f39 = f18 + f26;
                                                        float f40 = f19 + f27;
                                                        f26 += fArr2[i10];
                                                        f27 += fArr2[i25];
                                                        f23 = f40;
                                                        f22 = f39;
                                                    }
                                                } else {
                                                    c10 = c12;
                                                    f14 = fArr2[i10];
                                                    f15 = fArr2[i10 + 1];
                                                    if (i10 > 0) {
                                                        path2.lineTo(f14, f15);
                                                    } else {
                                                        path2.moveTo(f14, f15);
                                                        f26 = f14;
                                                        f28 = f26;
                                                        f27 = f15;
                                                    }
                                                }
                                                f29 = f27;
                                            } else {
                                                c10 = c12;
                                                int i26 = i10 + 1;
                                                path2.lineTo(fArr2[i10], fArr2[i26]);
                                                f14 = fArr2[i10];
                                                f15 = fArr2[i26];
                                            }
                                            f26 = f14;
                                            f27 = f15;
                                        } else {
                                            c10 = c12;
                                            path2.rLineTo(0.0f, fArr2[i10]);
                                            f13 = fArr2[i10];
                                        }
                                        f27 += f13;
                                    } else {
                                        c9 = c11;
                                        c10 = c12;
                                        int i27 = i10 + 1;
                                        int i28 = i10 + 2;
                                        int i29 = i10 + 3;
                                        path2.rQuadTo(fArr2[i10], fArr2[i27], fArr2[i28], fArr2[i29]);
                                        f10 = fArr2[i10] + f26;
                                        f11 = fArr2[i27] + f27;
                                        f26 += fArr2[i28];
                                        f12 = fArr2[i29];
                                    }
                                    f27 += f12;
                                    f22 = f10;
                                    f23 = f11;
                                } else {
                                    c9 = c11;
                                    c10 = c12;
                                    path2.rLineTo(fArr2[i10], 0.0f);
                                    f26 += fArr2[i10];
                                }
                            } else {
                                z8 = z10;
                                c9 = c11;
                                c10 = c12;
                                int i30 = i10 + 2;
                                int i31 = i10 + 3;
                                int i32 = i10 + 4;
                                int i33 = i10 + 5;
                                path2.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                float f41 = fArr2[i30] + f26;
                                float f42 = fArr2[i31] + f27;
                                f26 += fArr2[i32];
                                f27 += fArr2[i33];
                                f22 = f41;
                                f23 = f42;
                            }
                            i9 = i10;
                        } else {
                            z8 = z10;
                            c9 = c11;
                            c10 = c12;
                            int i34 = i10 + 5;
                            int i35 = i10 + 6;
                            i9 = i10;
                            float f43 = f26;
                            m1208g(path, f43, f27, fArr2[i34] + f26, fArr2[i35] + f27, fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f ? z8 : z7, fArr2[i10 + 4] != 0 ? z8 : z7);
                            f26 = f43 + fArr2[i34];
                            f27 += fArr2[i35];
                            f22 = f26;
                            f23 = f27;
                        }
                        f27 = f9;
                    } else {
                        z7 = z9;
                        z8 = z10;
                        c9 = c11;
                        c10 = c12;
                        i9 = i10;
                        int i36 = i9 + 1;
                        int i37 = i9 + 2;
                        int i38 = i9 + 3;
                        path2.quadTo(fArr2[i9], fArr2[i36], fArr2[i37], fArr2[i38]);
                        f7 = fArr2[i9];
                        f8 = fArr2[i36];
                        f26 = fArr2[i37];
                        f27 = fArr2[i38];
                    }
                    f22 = f7;
                    f23 = f8;
                } else {
                    z7 = z9;
                    z8 = z10;
                    c9 = c11;
                    c10 = c12;
                    i9 = i10;
                    path2.lineTo(fArr2[i9], f27);
                    f26 = fArr2[i9];
                }
                i10 = i9 + i8;
                path2 = path;
                c13 = c8;
                z9 = z7;
                z10 = z8;
                c11 = c9;
                c12 = c10;
            }
            fArr[z9 ? 1 : 0] = f26;
            fArr[z10 ? 1 : 0] = f27;
            fArr[c11] = f22;
            fArr[c12] = f23;
            fArr[4] = f28;
            fArr[5] = f29;
        }

        /* JADX INFO: renamed from: f */
        private static void m1207f(Path path, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
            double d16 = d9;
            int iCeil = (int) Math.ceil(Math.abs((d15 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d13);
            double dSin = Math.sin(d13);
            double dCos2 = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            double d17 = -d16;
            double d18 = d17 * dCos;
            double d19 = d10 * dSin;
            double d20 = (d18 * dSin2) - (d19 * dCos2);
            double d21 = d17 * dSin;
            double d22 = d10 * dCos;
            double d23 = (dSin2 * d21) + (dCos2 * d22);
            double d24 = d15 / ((double) iCeil);
            double d25 = d23;
            double d26 = d20;
            int i7 = 0;
            double d27 = d11;
            double d28 = d12;
            double d29 = d14;
            while (i7 < iCeil) {
                double d30 = d29 + d24;
                double dSin3 = Math.sin(d30);
                double dCos3 = Math.cos(d30);
                double d31 = (d7 + ((d16 * dCos) * dCos3)) - (d19 * dSin3);
                int i8 = i7;
                double d32 = d8 + (d9 * dSin * dCos3) + (d22 * dSin3);
                double d33 = (d18 * dSin3) - (d19 * dCos3);
                double d34 = (dSin3 * d21) + (dCos3 * d22);
                double d35 = d30 - d29;
                double dTan = Math.tan(d35 / 2.0d);
                double dSin4 = (Math.sin(d35) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d36 = d27 + (d26 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d36, (float) (d28 + (d25 * dSin4)), (float) (d31 - (dSin4 * d33)), (float) (d32 - (dSin4 * d34)), (float) d31, (float) d32);
                dSin = dSin;
                d24 = d24;
                d27 = d31;
                d21 = d21;
                d29 = d30;
                d25 = d34;
                dCos = dCos;
                d16 = d9;
                d28 = d32;
                i7 = i8 + 1;
                iCeil = iCeil;
                d26 = d33;
            }
        }

        /* JADX INFO: renamed from: g */
        private static void m1208g(Path path, float f7, float f8, float f9, float f10, float f11, float f12, float f13, boolean z7, boolean z8) {
            double d7;
            double d8;
            double radians = Math.toRadians(f13);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d9 = f7;
            double d10 = f8;
            double d11 = f11;
            double d12 = ((d9 * dCos) + (d10 * dSin)) / d11;
            double d13 = f12;
            double d14 = ((((double) (-f7)) * dSin) + (d10 * dCos)) / d13;
            double d15 = f10;
            double d16 = ((((double) f9) * dCos) + (d15 * dSin)) / d11;
            double d17 = ((((double) (-f9)) * dSin) + (d15 * dCos)) / d13;
            double d18 = d12 - d16;
            double d19 = d14 - d17;
            double d20 = (d12 + d16) / 2.0d;
            double d21 = (d14 + d17) / 2.0d;
            double d22 = (d18 * d18) + (d19 * d19);
            if (d22 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d23 = (1.0d / d22) - 0.25d;
            if (d23 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d22);
                float fSqrt = (float) (Math.sqrt(d22) / 1.99999d);
                m1208g(path, f7, f8, f9, f10, f11 * fSqrt, fSqrt * f12, f13, z7, z8);
                return;
            }
            double dSqrt = Math.sqrt(d23);
            double d24 = d18 * dSqrt;
            double d25 = dSqrt * d19;
            if (z7 == z8) {
                d7 = d20 - d25;
                d8 = d21 + d24;
            } else {
                d7 = d20 + d25;
                d8 = d21 - d24;
            }
            double dAtan2 = Math.atan2(d14 - d8, d12 - d7);
            double dAtan3 = Math.atan2(d17 - d8, d16 - d7) - dAtan2;
            if (z8 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d26 = d7 * d11;
            double d27 = d8 * d13;
            m1207f(path, (d26 * dCos) - (d27 * dSin), (d26 * dSin) + (d27 * dCos), d11, d13, d9, d10, radians, dAtan2, dAtan3);
        }

        /* JADX INFO: renamed from: h */
        public static void m1209h(b[] bVarArr, Path path) {
            AbstractC0249d.m1200j(bVarArr, path);
        }

        b(b bVar) {
            this.f991a = bVar.f991a;
            float[] fArr = bVar.f992b;
            this.f992b = AbstractC0249d.m1193c(fArr, 0, fArr.length);
        }
    }
}

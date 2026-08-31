package p385x;

import java.util.ArrayList;
import p361u.C7144b;
import p361u.C7146d;
import p361u.C7151i;

/* JADX INFO: renamed from: x.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7367b {
    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[PHI: r15 r16
      0x0033: PHI (r15v28 boolean) = (r15v1 boolean), (r15v30 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[PHI: r15 r16
      0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v30 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:218:0x038a  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:296:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:297:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:301:0x04da  */
    /* JADX WARN: Code duplicated, block: B:304:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [u.d] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [u.d] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [x.e] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [u.i] */
    /* JADX INFO: renamed from: a */
    static void m32431a(C7371f c7371f, C7146d c7146d, int i7, int i8, C7368c c7368c) {
        boolean z7;
        boolean z8;
        boolean z9;
        float f7;
        ?? r7;
        C7146d c7146d2;
        C7369d c7369d;
        C7151i c7151i;
        C7151i c7151i2;
        int i9;
        C7369d c7369d2;
        C7151i c7151i3;
        int i10;
        C7369d[] c7369dArr;
        int i11;
        C7369d c7369d3;
        C7369d c7369d4;
        C7151i c7151i4;
        C7369d c7369d5;
        Object obj;
        int size;
        C7369d c7369d6;
        int i12;
        int i13 = i7;
        C7370e c7370e = c7368c.f29346a;
        C7370e c7370e2 = c7368c.f29348c;
        C7370e c7370e3 = c7368c.f29347b;
        C7370e c7370e4 = c7368c.f29349d;
        C7370e c7370e5 = c7368c.f29350e;
        float f8 = c7368c.f29356k;
        boolean z10 = c7371f.f29423Z[i13] == C7370e.b.WRAP_CONTENT;
        if (i13 == 0) {
            int i14 = c7370e5.f29475z0;
            z7 = i14 == 0;
            z8 = i14 == 1;
            if (i14 == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
        } else {
            int i15 = c7370e5.f29389A0;
            z7 = i15 == 0;
            z8 = i15 == 1;
            if (i15 == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        ?? r14 = c7370e;
        boolean z11 = false;
        while (true) {
            f7 = f8;
            Object obj2 = null;
            if (z11) {
                break;
            }
            C7369d c7369d7 = r14.f29420W[i8];
            int i16 = z9 ? 1 : 4;
            int iM32441f = c7369d7.m32441f();
            C7370e.b bVar = r14.f29423Z[i13];
            boolean z12 = z10;
            C7370e.b bVar2 = C7370e.b.MATCH_CONSTRAINT;
            boolean z13 = bVar == bVar2 && r14.f29472y[i13] == 0;
            boolean z14 = z9;
            C7369d c7369d8 = c7369d7.f29373f;
            if (c7369d8 != null && r14 != c7370e) {
                iM32441f += c7369d8.m32441f();
            }
            int i17 = iM32441f;
            if (z14 && r14 != c7370e && r14 != c7370e3) {
                i16 = 8;
            }
            boolean z15 = z13;
            C7369d c7369d9 = c7369d7.f29373f;
            if (c7369d9 != null) {
                if (r14 == c7370e3) {
                    c7146d.m31580h(c7369d7.f29376i, c7369d9.f29376i, i17, 6);
                } else {
                    c7146d.m31580h(c7369d7.f29376i, c7369d9.f29376i, i17, 8);
                }
                if (z15 && !z14) {
                    i16 = 5;
                }
                c7146d.m31577e(c7369d7.f29376i, c7369d7.f29373f.f29376i, i17, (r14 == c7370e3 && z14 && r14.m32531h0(i13)) ? 5 : i16);
            } else {
                z11 = z11;
                z7 = z7;
            }
            if (z12) {
                if (r14.m32506V() == 8 || r14.f29423Z[i13] != bVar2) {
                    i12 = 0;
                } else {
                    C7369d[] c7369dArr2 = r14.f29420W;
                    i12 = 0;
                    c7146d.m31580h(c7369dArr2[i8 + 1].f29376i, c7369dArr2[i8].f29376i, 0, 5);
                }
                c7146d.m31580h(r14.f29420W[i8].f29376i, c7371f.f29420W[i8].f29376i, i12, 8);
            }
            C7369d c7369d10 = r14.f29420W[i8 + 1].f29373f;
            if (c7369d10 != null) {
                C7370e c7370e6 = c7369d10.f29371d;
                C7369d c7369d11 = c7370e6.f29420W[i8].f29373f;
                if (c7369d11 != null && c7369d11.f29371d == r14) {
                    obj2 = c7370e6;
                }
            }
            if (obj2 != null) {
                r14 = obj2;
                z11 = z11;
            } else {
                z11 = true;
            }
            f8 = f7;
            z10 = z12;
            z9 = z14;
            z7 = z7;
            r14 = r14;
        }
        boolean z16 = z10;
        boolean z17 = z9;
        boolean z18 = z7;
        if (c7370e4 != null) {
            int i18 = i8 + 1;
            if (c7370e2.f29420W[i18].f29373f != null) {
                C7369d c7369d12 = c7370e4.f29420W[i18];
                if (c7370e4.f29423Z[i13] == C7370e.b.MATCH_CONSTRAINT && c7370e4.f29472y[i13] == 0 && !z17) {
                    C7369d c7369d13 = c7369d12.f29373f;
                    if (c7369d13.f29371d == c7371f) {
                        c7146d.m31577e(c7369d12.f29376i, c7369d13.f29376i, -c7369d12.m32441f(), 5);
                    } else if (z17) {
                        c7369d6 = c7369d12.f29373f;
                        if (c7369d6.f29371d == c7371f) {
                            c7146d.m31577e(c7369d12.f29376i, c7369d6.f29376i, -c7369d12.m32441f(), 4);
                        }
                    }
                } else if (z17) {
                    c7369d6 = c7369d12.f29373f;
                    if (c7369d6.f29371d == c7371f) {
                        c7146d.m31577e(c7369d12.f29376i, c7369d6.f29376i, -c7369d12.m32441f(), 4);
                    }
                }
                c7146d.m31582j(c7369d12.f29376i, c7370e2.f29420W[i18].f29373f.f29376i, -c7369d12.m32441f(), 6);
            }
        }
        if (z16) {
            int i19 = i8 + 1;
            C7151i c7151i5 = c7371f.f29420W[i19].f29376i;
            C7369d c7369d14 = c7370e2.f29420W[i19];
            c7146d.m31580h(c7151i5, c7369d14.f29376i, c7369d14.m32441f(), 8);
        }
        ArrayList arrayList = c7368c.f29353h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f9 = (!c7368c.f29363r || c7368c.f29365t) ? f7 : c7368c.f29355j;
            float f10 = 0.0f;
            float f11 = 0.0f;
            C7370e c7370e7 = null;
            int i20 = 0;
            while (i20 < size) {
                C7370e c7370e8 = (C7370e) arrayList.get(i20);
                float f12 = c7370e8.f29395D0[i13];
                if (f12 < f10) {
                    if (c7368c.f29365t) {
                        C7369d[] c7369dArr3 = c7370e8.f29420W;
                        f10 = f10;
                        c7146d.m31577e(c7369dArr3[i8 + 1].f29376i, c7369dArr3[i8].f29376i, 0, 4);
                    } else {
                        f12 = 1.0f;
                    }
                    arrayList = arrayList;
                    i20++;
                    f10 = f10;
                    arrayList = arrayList;
                }
                float f13 = f12;
                if (f13 == f10) {
                    C7369d[] c7369dArr4 = c7370e8.f29420W;
                    c7146d.m31577e(c7369dArr4[i8 + 1].f29376i, c7369dArr4[i8].f29376i, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (c7370e7 != null) {
                        C7369d[] c7369dArr5 = c7370e7.f29420W;
                        C7151i c7151i6 = c7369dArr5[i8].f29376i;
                        int i21 = i8 + 1;
                        C7151i c7151i7 = c7369dArr5[i21].f29376i;
                        C7369d[] c7369dArr6 = c7370e8.f29420W;
                        C7151i c7151i8 = c7369dArr6[i8].f29376i;
                        C7151i c7151i9 = c7369dArr6[i21].f29376i;
                        C7144b c7144bM31588r = c7146d.m31588r();
                        c7144bM31588r.m31549l(f11, f9, f13, c7151i6, c7151i7, c7151i8, c7151i9);
                        c7146d.m31576d(c7144bM31588r);
                    }
                    c7370e7 = c7370e8;
                    f11 = f13;
                }
                i20++;
                f10 = f10;
                arrayList = arrayList;
            }
        }
        if (c7370e3 != null && (c7370e3 == c7370e4 || z17)) {
            C7369d c7369d15 = c7370e.f29420W[i8];
            int i22 = i8 + 1;
            C7369d c7369d16 = c7370e2.f29420W[i22];
            C7369d c7369d17 = c7369d15.f29373f;
            C7151i c7151i10 = c7369d17 != null ? c7369d17.f29376i : null;
            C7369d c7369d18 = c7369d16.f29373f;
            C7151i c7151i11 = c7369d18 != null ? c7369d18.f29376i : null;
            C7369d c7369d19 = c7370e3.f29420W[i8];
            if (c7370e4 != null) {
                c7369d16 = c7370e4.f29420W[i22];
            }
            if (c7151i10 != null && c7151i11 != null) {
                c7146d.m31575c(c7369d19.f29376i, c7151i10, c7369d19.m32441f(), i13 == 0 ? c7370e5.f29453o0 : c7370e5.f29455p0, c7151i11, c7369d16.f29376i, c7369d16.m32441f(), 7);
            }
        } else {
            if (!z18 || c7370e3 == null) {
                if (z8 && c7370e3 != null) {
                    int i23 = c7368c.f29355j;
                    boolean z19 = i23 > 0 && c7368c.f29354i == i23;
                    C7370e c7370e9 = c7370e3;
                    C7370e c7370e10 = c7370e9;
                    while (c7370e9 != null) {
                        C7370e c7370e11 = c7370e9.f29399F0[i7];
                        while (c7370e11 != null && c7370e11.m32506V() == 8) {
                            c7370e11 = c7370e11.f29399F0[i7];
                        }
                        if (c7370e9 != c7370e3 && c7370e9 != c7370e4 && c7370e11 != null) {
                            if (c7370e11 == c7370e4) {
                                c7370e11 = null;
                            }
                            C7369d c7369d20 = c7370e9.f29420W[i8];
                            C7151i c7151i12 = c7369d20.f29376i;
                            C7369d c7369d21 = c7369d20.f29373f;
                            if (c7369d21 != null) {
                                C7151i c7151i13 = c7369d21.f29376i;
                            }
                            int i24 = i8 + 1;
                            C7151i c7151i14 = c7370e10.f29420W[i24].f29376i;
                            int iM32441f2 = c7369d20.m32441f();
                            int iM32441f3 = c7370e9.f29420W[i24].m32441f();
                            if (c7370e11 != null) {
                                c7369d = c7370e11.f29420W[i8];
                                c7151i = c7369d.f29376i;
                                C7369d c7369d22 = c7369d.f29373f;
                                c7151i2 = c7369d22 != null ? c7369d22.f29376i : null;
                            } else {
                                c7369d = c7370e4.f29420W[i8];
                                c7151i = c7369d != null ? c7369d.f29376i : null;
                                c7151i2 = c7370e9.f29420W[i24].f29376i;
                            }
                            if (c7369d != null) {
                                iM32441f3 += c7369d.m32441f();
                            }
                            int iM32441f4 = iM32441f2 + c7370e10.f29420W[i24].m32441f();
                            int i25 = z19 ? 8 : 4;
                            if (c7151i12 != null && c7151i14 != null && c7151i != null && c7151i2 != null) {
                                c7146d.m31575c(c7151i12, c7151i14, iM32441f4, 0.5f, c7151i, c7151i2, iM32441f3, i25);
                            }
                            c7370e11 = c7370e11;
                        }
                        if (c7370e9.m32506V() != 8) {
                            c7370e10 = c7370e9;
                        }
                        c7370e9 = c7370e11;
                    }
                    C7369d c7369d23 = c7370e3.f29420W[i8];
                    C7369d c7369d24 = c7370e.f29420W[i8].f29373f;
                    int i26 = i8 + 1;
                    C7369d c7369d25 = c7370e4.f29420W[i26];
                    C7369d c7369d26 = c7370e2.f29420W[i26].f29373f;
                    if (c7369d24 == null) {
                        r7 = c7146d;
                    } else {
                        if (c7370e3 != c7370e4) {
                            c7146d.m31577e(c7369d23.f29376i, c7369d24.f29376i, c7369d23.m32441f(), 5);
                        } else if (c7369d26 != null) {
                            c7146d2 = c7146d;
                            c7146d2.m31575c(c7369d23.f29376i, c7369d24.f29376i, c7369d23.m32441f(), 0.5f, c7369d25.f29376i, c7369d26.f29376i, c7369d25.m32441f(), 5);
                        }
                        r7 = c7146d;
                    }
                    if (c7369d26 != null && c7370e3 != c7370e4) {
                        r7.m31577e(c7369d25.f29376i, c7369d26.f29376i, -c7369d25.m32441f(), 5);
                    }
                }
                if ((z18 && !z8) || c7370e3 == null || c7370e3 == c7370e4) {
                    return;
                }
                c7369dArr = c7370e3.f29420W;
                C7369d c7369d27 = c7369dArr[i8];
                if (c7370e4 == null) {
                    c7370e4 = c7370e3;
                }
                i11 = i8 + 1;
                c7369d3 = c7370e4.f29420W[i11];
                c7369d4 = c7369d27.f29373f;
                if (c7369d4 != null) {
                    c7151i4 = c7369d4.f29376i;
                } else {
                    c7151i4 = null;
                }
                c7369d5 = c7369d3.f29373f;
                if (c7369d5 != null) {
                    obj = c7369d5.f29376i;
                } else {
                    obj = null;
                }
                if (c7370e2 != c7370e4) {
                    C7369d c7369d28 = c7370e2.f29420W[i11].f29373f;
                    obj = c7369d28 != null ? c7369d28.f29376i : null;
                }
                if (c7370e3 == c7370e4) {
                    c7369d3 = c7369dArr[i11];
                }
                if (c7151i4 != null || obj == null) {
                }
                r7.m31575c(c7369d27.f29376i, c7151i4, c7369d27.m32441f(), 0.5f, obj, c7369d3.f29376i, c7370e4.f29420W[i11].m32441f(), 5);
                return;
            }
            int i27 = c7368c.f29355j;
            boolean z20 = i27 > 0 && c7368c.f29354i == i27;
            C7370e c7370e12 = c7370e3;
            C7370e c7370e13 = c7370e12;
            while (c7370e12 != null) {
                C7370e c7370e14 = c7370e12.f29399F0[i13];
                while (true) {
                    if (c7370e14 == null) {
                        i9 = 8;
                        break;
                    }
                    i9 = 8;
                    if (c7370e14.m32506V() != 8) {
                        break;
                    } else {
                        c7370e14 = c7370e14.f29399F0[i13];
                    }
                }
                if (c7370e14 != null || c7370e12 == c7370e4) {
                    C7369d c7369d29 = c7370e12.f29420W[i8];
                    C7151i c7151i15 = c7369d29.f29376i;
                    C7369d c7369d30 = c7369d29.f29373f;
                    C7151i c7151i16 = c7369d30 != null ? c7369d30.f29376i : null;
                    if (c7370e13 != c7370e12) {
                        c7151i16 = c7370e13.f29420W[i8 + 1].f29376i;
                    } else if (c7370e12 == c7370e3) {
                        C7369d c7369d31 = c7370e.f29420W[i8].f29373f;
                        c7151i16 = c7369d31 != null ? c7369d31.f29376i : null;
                    }
                    int iM32441f5 = c7369d29.m32441f();
                    int i28 = i8 + 1;
                    int iM32441f6 = c7370e12.f29420W[i28].m32441f();
                    if (c7370e14 != null) {
                        c7369d2 = c7370e14.f29420W[i8];
                        c7151i3 = c7369d2.f29376i;
                    } else {
                        c7369d2 = c7370e2.f29420W[i28].f29373f;
                        c7151i3 = c7369d2 != null ? c7369d2.f29376i : null;
                    }
                    C7151i c7151i17 = c7370e12.f29420W[i28].f29376i;
                    if (c7369d2 != null) {
                        iM32441f6 += c7369d2.m32441f();
                    }
                    int iM32441f7 = iM32441f5 + c7370e13.f29420W[i28].m32441f();
                    if (c7151i15 == null || c7151i16 == null || c7151i3 == null || c7151i17 == null) {
                        i10 = 8;
                    } else {
                        if (c7370e12 == c7370e3) {
                            iM32441f7 = c7370e3.f29420W[i8].m32441f();
                        }
                        if (c7370e12 == c7370e4) {
                            iM32441f6 = c7370e4.f29420W[i28].m32441f();
                        }
                        c7370e14 = c7370e14;
                        i10 = 8;
                        c7146d.m31575c(c7151i15, c7151i16, iM32441f7, 0.5f, c7151i3, c7151i17, iM32441f6, z20 ? 8 : 5);
                    }
                    if (c7370e12.m32506V() != i10) {
                        c7370e13 = c7370e12;
                    }
                    i13 = i7;
                    c7370e12 = c7370e14;
                } else {
                    i10 = i9;
                }
                if (c7370e12.m32506V() != i10) {
                    c7370e13 = c7370e12;
                }
                i13 = i7;
                c7370e12 = c7370e14;
            }
        }
        r7 = c7146d;
        if (z18) {
        }
        c7369dArr = c7370e3.f29420W;
        C7369d c7369d210 = c7369dArr[i8];
        if (c7370e4 == null) {
            c7370e4 = c7370e3;
        }
        i11 = i8 + 1;
        c7369d3 = c7370e4.f29420W[i11];
        c7369d4 = c7369d210.f29373f;
        if (c7369d4 != null) {
            c7151i4 = c7369d4.f29376i;
        } else {
            c7151i4 = null;
        }
        c7369d5 = c7369d3.f29373f;
        if (c7369d5 != null) {
            obj = c7369d5.f29376i;
        } else {
            obj = null;
        }
        if (c7370e2 != c7370e4) {
            C7369d c7369d211 = c7370e2.f29420W[i11].f29373f;
            obj = c7369d211 != null ? c7369d211.f29376i : null;
        }
        if (c7370e3 == c7370e4) {
            c7369d3 = c7369dArr[i11];
        }
        if (c7151i4 != null) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m32432b(C7371f c7371f, C7146d c7146d, ArrayList arrayList, int i7) {
        int i8;
        C7368c[] c7368cArr;
        int i9;
        if (i7 == 0) {
            i8 = c7371f.f29492W0;
            c7368cArr = c7371f.f29495Z0;
            i9 = 0;
        } else {
            i8 = c7371f.f29493X0;
            c7368cArr = c7371f.f29494Y0;
            i9 = 2;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            C7368c c7368c = c7368cArr[i10];
            c7368c.m32435a();
            if (arrayList == null || arrayList.contains(c7368c.f29346a)) {
                m32431a(c7371f, c7146d, i7, i9, c7368c);
            }
        }
    }
}

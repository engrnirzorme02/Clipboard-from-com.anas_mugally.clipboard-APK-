package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.f */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5098f {

    /* JADX INFO: renamed from: a */
    private static volatile int f19388a = 100;

    /* JADX INFO: renamed from: com.google.protobuf.f$a */
    static final class a {

        /* JADX INFO: renamed from: a */
        public int f19389a;

        /* JADX INFO: renamed from: b */
        public long f19390b;

        /* JADX INFO: renamed from: c */
        public Object f19391c;

        /* JADX INFO: renamed from: d */
        public final C5120q f19392d;

        /* JADX INFO: renamed from: e */
        public int f19393e;

        a(C5120q c5120q) {
            c5120q.getClass();
            this.f19392d = c5120q;
        }
    }

    /* JADX INFO: renamed from: A */
    static int m23101A(int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) {
        C5061A c5061a = (C5061A) eVar;
        int iM23109I = m23109I(bArr, i8, aVar);
        c5061a.m22825g(AbstractC5106j.m23183c(aVar.f19389a));
        while (iM23109I < i9) {
            int iM23109I2 = m23109I(bArr, iM23109I, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            iM23109I = m23109I(bArr, iM23109I2, aVar);
            c5061a.m22825g(AbstractC5106j.m23183c(aVar.f19389a));
        }
        return iM23109I;
    }

    /* JADX INFO: renamed from: B */
    static int m23102B(int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) {
        AbstractC5073K abstractC5073K = (AbstractC5073K) eVar;
        int iM23112L = m23112L(bArr, i8, aVar);
        abstractC5073K.m22928b(AbstractC5106j.m23184d(aVar.f19390b));
        while (iM23112L < i9) {
            int iM23109I = m23109I(bArr, iM23112L, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            iM23112L = m23112L(bArr, iM23109I, aVar);
            abstractC5073K.m22928b(AbstractC5106j.m23184d(aVar.f19390b));
        }
        return iM23112L;
    }

    /* JADX INFO: renamed from: C */
    static int m23103C(byte[] bArr, int i7, a aVar) throws C5065C {
        int iM23109I = m23109I(bArr, i7, aVar);
        int i8 = aVar.f19389a;
        if (i8 < 0) {
            throw C5065C.m22896g();
        }
        if (i8 == 0) {
            aVar.f19391c = "";
            return iM23109I;
        }
        aVar.f19391c = new String(bArr, iM23109I, i8, AbstractC5063B.f19294b);
        return iM23109I + i8;
    }

    /* JADX INFO: renamed from: D */
    static int m23104D(int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) throws C5065C {
        int iM23109I = m23109I(bArr, i8, aVar);
        int i10 = aVar.f19389a;
        if (i10 < 0) {
            throw C5065C.m22896g();
        }
        if (i10 == 0) {
            eVar.add("");
        } else {
            eVar.add(new String(bArr, iM23109I, i10, AbstractC5063B.f19294b));
            iM23109I += i10;
        }
        while (iM23109I < i9) {
            int iM23109I2 = m23109I(bArr, iM23109I, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            iM23109I = m23109I(bArr, iM23109I2, aVar);
            int i11 = aVar.f19389a;
            if (i11 < 0) {
                throw C5065C.m22896g();
            }
            if (i11 == 0) {
                eVar.add("");
            } else {
                eVar.add(new String(bArr, iM23109I, i11, AbstractC5063B.f19294b));
                iM23109I += i11;
            }
        }
        return iM23109I;
    }

    /* JADX INFO: renamed from: E */
    static int m23105E(int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) throws C5065C {
        int iM23109I = m23109I(bArr, i8, aVar);
        int i10 = aVar.f19389a;
        if (i10 < 0) {
            throw C5065C.m22896g();
        }
        if (i10 == 0) {
            eVar.add("");
        } else {
            int i11 = iM23109I + i10;
            if (!AbstractC5139z0.m23828t(bArr, iM23109I, i11)) {
                throw C5065C.m22893d();
            }
            eVar.add(new String(bArr, iM23109I, i10, AbstractC5063B.f19294b));
            iM23109I = i11;
        }
        while (iM23109I < i9) {
            int iM23109I2 = m23109I(bArr, iM23109I, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            iM23109I = m23109I(bArr, iM23109I2, aVar);
            int i12 = aVar.f19389a;
            if (i12 < 0) {
                throw C5065C.m22896g();
            }
            if (i12 == 0) {
                eVar.add("");
            } else {
                int i13 = iM23109I + i12;
                if (!AbstractC5139z0.m23828t(bArr, iM23109I, i13)) {
                    throw C5065C.m22893d();
                }
                eVar.add(new String(bArr, iM23109I, i12, AbstractC5063B.f19294b));
                iM23109I = i13;
            }
        }
        return iM23109I;
    }

    /* JADX INFO: renamed from: F */
    static int m23106F(byte[] bArr, int i7, a aVar) throws C5065C {
        int iM23109I = m23109I(bArr, i7, aVar);
        int i8 = aVar.f19389a;
        if (i8 < 0) {
            throw C5065C.m22896g();
        }
        if (i8 == 0) {
            aVar.f19391c = "";
            return iM23109I;
        }
        aVar.f19391c = AbstractC5139z0.m23816h(bArr, iM23109I, i8);
        return iM23109I + i8;
    }

    /* JADX INFO: renamed from: G */
    static int m23107G(int i7, byte[] bArr, int i8, int i9, C5131v0 c5131v0, a aVar) throws C5065C {
        if (AbstractC5062A0.m22832a(i7) == 0) {
            throw C5065C.m22892c();
        }
        int iM22833b = AbstractC5062A0.m22833b(i7);
        if (iM22833b == 0) {
            int iM23112L = m23112L(bArr, i8, aVar);
            c5131v0.m23655n(i7, Long.valueOf(aVar.f19390b));
            return iM23112L;
        }
        if (iM22833b == 1) {
            c5131v0.m23655n(i7, Long.valueOf(m23126j(bArr, i8)));
            return i8 + 8;
        }
        if (iM22833b == 2) {
            int iM23109I = m23109I(bArr, i8, aVar);
            int i10 = aVar.f19389a;
            if (i10 < 0) {
                throw C5065C.m22896g();
            }
            if (i10 > bArr.length - iM23109I) {
                throw C5065C.m22900m();
            }
            if (i10 == 0) {
                c5131v0.m23655n(i7, AbstractC5104i.f19401b);
            } else {
                c5131v0.m23655n(i7, AbstractC5104i.m23161q(bArr, iM23109I, i10));
            }
            return iM23109I + i10;
        }
        if (iM22833b != 3) {
            if (iM22833b != 5) {
                throw C5065C.m22892c();
            }
            c5131v0.m23655n(i7, Integer.valueOf(m23124h(bArr, i8)));
            return i8 + 4;
        }
        C5131v0 c5131v0M23645k = C5131v0.m23645k();
        int i11 = (i7 & (-8)) | 4;
        int i12 = aVar.f19393e + 1;
        aVar.f19393e = i12;
        m23117a(i12);
        int i13 = 0;
        while (i8 < i9) {
            int iM23109I2 = m23109I(bArr, i8, aVar);
            i13 = aVar.f19389a;
            if (i13 == i11) {
                i8 = iM23109I2;
                break;
            }
            i8 = m23107G(i13, bArr, iM23109I2, i9, c5131v0M23645k, aVar);
        }
        aVar.f19393e--;
        if (i8 > i9 || i13 != i11) {
            throw C5065C.m22897h();
        }
        c5131v0.m23655n(i7, c5131v0M23645k);
        return i8;
    }

    /* JADX INFO: renamed from: H */
    static int m23108H(int i7, byte[] bArr, int i8, a aVar) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            aVar.f19389a = i9 | (b7 << 7);
            return i10;
        }
        int i11 = i9 | ((b7 & 127) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            aVar.f19389a = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            aVar.f19389a = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            aVar.f19389a = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                aVar.f19389a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    /* JADX INFO: renamed from: I */
    static int m23109I(byte[] bArr, int i7, a aVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return m23108H(b7, bArr, i8, aVar);
        }
        aVar.f19389a = b7;
        return i8;
    }

    /* JADX INFO: renamed from: J */
    static int m23110J(int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) {
        C5061A c5061a = (C5061A) eVar;
        int iM23109I = m23109I(bArr, i8, aVar);
        c5061a.m22825g(aVar.f19389a);
        while (iM23109I < i9) {
            int iM23109I2 = m23109I(bArr, iM23109I, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            iM23109I = m23109I(bArr, iM23109I2, aVar);
            c5061a.m22825g(aVar.f19389a);
        }
        return iM23109I;
    }

    /* JADX INFO: renamed from: K */
    static int m23111K(long j7, byte[] bArr, int i7, a aVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        long j8 = (j7 & 127) | (((long) (b7 & 127)) << 7);
        int i9 = 7;
        while (b7 < 0) {
            int i10 = i8 + 1;
            byte b8 = bArr[i8];
            i9 += 7;
            j8 |= ((long) (b8 & 127)) << i9;
            i8 = i10;
            b7 = b8;
        }
        aVar.f19390b = j8;
        return i8;
    }

    /* JADX INFO: renamed from: L */
    static int m23112L(byte[] bArr, int i7, a aVar) {
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        if (j7 < 0) {
            return m23111K(j7, bArr, i8, aVar);
        }
        aVar.f19390b = j7;
        return i8;
    }

    /* JADX INFO: renamed from: M */
    static int m23113M(int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) {
        AbstractC5073K abstractC5073K = (AbstractC5073K) eVar;
        int iM23112L = m23112L(bArr, i8, aVar);
        abstractC5073K.m22928b(aVar.f19390b);
        while (iM23112L < i9) {
            int iM23109I = m23109I(bArr, iM23112L, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            iM23112L = m23112L(bArr, iM23109I, aVar);
            abstractC5073K.m22928b(aVar.f19390b);
        }
        return iM23112L;
    }

    /* JADX INFO: renamed from: N */
    static int m23114N(Object obj, InterfaceC5113m0 interfaceC5113m0, byte[] bArr, int i7, int i8, int i9, a aVar) throws C5065C {
        int i10 = aVar.f19393e + 1;
        aVar.f19393e = i10;
        m23117a(i10);
        int iM23055d0 = ((C5085X) interfaceC5113m0).m23055d0(obj, bArr, i7, i8, i9, aVar);
        aVar.f19393e--;
        aVar.f19391c = obj;
        return iM23055d0;
    }

    /* JADX INFO: renamed from: O */
    static int m23115O(Object obj, InterfaceC5113m0 interfaceC5113m0, byte[] bArr, int i7, int i8, a aVar) throws C5065C {
        int iM23108H = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iM23108H = m23108H(i9, bArr, iM23108H, aVar);
            i9 = aVar.f19389a;
        }
        int i10 = iM23108H;
        if (i9 < 0 || i9 > i8 - i10) {
            throw C5065C.m22900m();
        }
        int i11 = aVar.f19393e + 1;
        aVar.f19393e = i11;
        m23117a(i11);
        int i12 = i10 + i9;
        interfaceC5113m0.mo23061j(obj, bArr, i10, i12, aVar);
        aVar.f19393e--;
        aVar.f19391c = obj;
        return i12;
    }

    /* JADX INFO: renamed from: P */
    static int m23116P(int i7, byte[] bArr, int i8, int i9, a aVar) throws C5065C {
        if (AbstractC5062A0.m22832a(i7) == 0) {
            throw C5065C.m22892c();
        }
        int iM22833b = AbstractC5062A0.m22833b(i7);
        if (iM22833b == 0) {
            return m23112L(bArr, i8, aVar);
        }
        if (iM22833b == 1) {
            return i8 + 8;
        }
        if (iM22833b == 2) {
            return m23109I(bArr, i8, aVar) + aVar.f19389a;
        }
        if (iM22833b != 3) {
            if (iM22833b == 5) {
                return i8 + 4;
            }
            throw C5065C.m22892c();
        }
        int i10 = (i7 & (-8)) | 4;
        int i11 = 0;
        while (i8 < i9) {
            i8 = m23109I(bArr, i8, aVar);
            i11 = aVar.f19389a;
            if (i11 == i10) {
                break;
            }
            i8 = m23116P(i11, bArr, i8, i9, aVar);
        }
        if (i8 > i9 || i11 != i10) {
            throw C5065C.m22897h();
        }
        return i8;
    }

    /* JADX INFO: renamed from: a */
    private static void m23117a(int i7) throws C5065C {
        if (i7 >= f19388a) {
            throw C5065C.m22898i();
        }
    }

    /* JADX INFO: renamed from: b */
    static int m23118b(int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) {
        AbstractC5100g abstractC5100g = (AbstractC5100g) eVar;
        int iM23112L = m23112L(bArr, i8, aVar);
        abstractC5100g.m23143b(aVar.f19390b != 0);
        while (iM23112L < i9) {
            int iM23109I = m23109I(bArr, iM23112L, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            iM23112L = m23112L(bArr, iM23109I, aVar);
            abstractC5100g.m23143b(aVar.f19390b != 0);
        }
        return iM23112L;
    }

    /* JADX INFO: renamed from: c */
    static int m23119c(byte[] bArr, int i7, a aVar) throws C5065C {
        int iM23109I = m23109I(bArr, i7, aVar);
        int i8 = aVar.f19389a;
        if (i8 < 0) {
            throw C5065C.m22896g();
        }
        if (i8 > bArr.length - iM23109I) {
            throw C5065C.m22900m();
        }
        if (i8 == 0) {
            aVar.f19391c = AbstractC5104i.f19401b;
            return iM23109I;
        }
        aVar.f19391c = AbstractC5104i.m23161q(bArr, iM23109I, i8);
        return iM23109I + i8;
    }

    /* JADX INFO: renamed from: d */
    static int m23120d(int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) throws C5065C {
        int iM23109I = m23109I(bArr, i8, aVar);
        int i10 = aVar.f19389a;
        if (i10 < 0) {
            throw C5065C.m22896g();
        }
        if (i10 > bArr.length - iM23109I) {
            throw C5065C.m22900m();
        }
        if (i10 == 0) {
            eVar.add(AbstractC5104i.f19401b);
        } else {
            eVar.add(AbstractC5104i.m23161q(bArr, iM23109I, i10));
            iM23109I += i10;
        }
        while (iM23109I < i9) {
            int iM23109I2 = m23109I(bArr, iM23109I, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            iM23109I = m23109I(bArr, iM23109I2, aVar);
            int i11 = aVar.f19389a;
            if (i11 < 0) {
                throw C5065C.m22896g();
            }
            if (i11 > bArr.length - iM23109I) {
                throw C5065C.m22900m();
            }
            if (i11 == 0) {
                eVar.add(AbstractC5104i.f19401b);
            } else {
                eVar.add(AbstractC5104i.m23161q(bArr, iM23109I, i11));
                iM23109I += i11;
            }
        }
        return iM23109I;
    }

    /* JADX INFO: renamed from: e */
    static double m23121e(byte[] bArr, int i7) {
        return Double.longBitsToDouble(m23126j(bArr, i7));
    }

    /* JADX INFO: renamed from: f */
    static int m23122f(int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) {
        AbstractC5114n abstractC5114n = (AbstractC5114n) eVar;
        abstractC5114n.m23474b(m23121e(bArr, i8));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int iM23109I = m23109I(bArr, i10, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            abstractC5114n.m23474b(m23121e(bArr, iM23109I));
            i10 = iM23109I + 8;
        }
        return i10;
    }

    /* JADX INFO: renamed from: g */
    static int m23123g(int i7, byte[] bArr, int i8, int i9, Object obj, InterfaceC5082U interfaceC5082U, AbstractC5129u0 abstractC5129u0, a aVar) {
        aVar.f19392d.m23563a(interfaceC5082U, i7 >>> 3);
        return m23107G(i7, bArr, i8, i9, C5085X.m23043w(obj), aVar);
    }

    /* JADX INFO: renamed from: h */
    static int m23124h(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: i */
    static int m23125i(int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) {
        C5061A c5061a = (C5061A) eVar;
        c5061a.m22825g(m23124h(bArr, i8));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int iM23109I = m23109I(bArr, i10, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            c5061a.m22825g(m23124h(bArr, iM23109I));
            i10 = iM23109I + 4;
        }
        return i10;
    }

    /* JADX INFO: renamed from: j */
    static long m23126j(byte[] bArr, int i7) {
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: k */
    static int m23127k(int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) {
        AbstractC5073K abstractC5073K = (AbstractC5073K) eVar;
        abstractC5073K.m22928b(m23126j(bArr, i8));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int iM23109I = m23109I(bArr, i10, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            abstractC5073K.m22928b(m23126j(bArr, iM23109I));
            i10 = iM23109I + 8;
        }
        return i10;
    }

    /* JADX INFO: renamed from: l */
    static float m23128l(byte[] bArr, int i7) {
        return Float.intBitsToFloat(m23124h(bArr, i7));
    }

    /* JADX INFO: renamed from: m */
    static int m23129m(int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) {
        AbstractC5132w abstractC5132w = (AbstractC5132w) eVar;
        abstractC5132w.m23658b(m23128l(bArr, i8));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int iM23109I = m23109I(bArr, i10, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            abstractC5132w.m23658b(m23128l(bArr, iM23109I));
            i10 = iM23109I + 4;
        }
        return i10;
    }

    /* JADX INFO: renamed from: n */
    static int m23130n(InterfaceC5113m0 interfaceC5113m0, byte[] bArr, int i7, int i8, int i9, a aVar) throws C5065C {
        Object objMo23057f = interfaceC5113m0.mo23057f();
        int iM23114N = m23114N(objMo23057f, interfaceC5113m0, bArr, i7, i8, i9, aVar);
        interfaceC5113m0.mo23052b(objMo23057f);
        aVar.f19391c = objMo23057f;
        return iM23114N;
    }

    /* JADX INFO: renamed from: o */
    static int m23131o(InterfaceC5113m0 interfaceC5113m0, int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) throws C5065C {
        int i10 = (i7 & (-8)) | 4;
        int iM23130n = m23130n(interfaceC5113m0, bArr, i8, i9, i10, aVar);
        eVar.add(aVar.f19391c);
        while (iM23130n < i9) {
            int iM23109I = m23109I(bArr, iM23130n, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            iM23130n = m23130n(interfaceC5113m0, bArr, iM23109I, i9, i10, aVar);
            eVar.add(aVar.f19391c);
        }
        return iM23130n;
    }

    /* JADX INFO: renamed from: p */
    static int m23132p(InterfaceC5113m0 interfaceC5113m0, byte[] bArr, int i7, int i8, a aVar) throws C5065C {
        Object objMo23057f = interfaceC5113m0.mo23057f();
        int iM23115O = m23115O(objMo23057f, interfaceC5113m0, bArr, i7, i8, aVar);
        interfaceC5113m0.mo23052b(objMo23057f);
        aVar.f19391c = objMo23057f;
        return iM23115O;
    }

    /* JADX INFO: renamed from: q */
    static int m23133q(InterfaceC5113m0 interfaceC5113m0, int i7, byte[] bArr, int i8, int i9, AbstractC5063B.e eVar, a aVar) throws C5065C {
        int iM23132p = m23132p(interfaceC5113m0, bArr, i8, i9, aVar);
        eVar.add(aVar.f19391c);
        while (iM23132p < i9) {
            int iM23109I = m23109I(bArr, iM23132p, aVar);
            if (i7 != aVar.f19389a) {
                break;
            }
            iM23132p = m23132p(interfaceC5113m0, bArr, iM23109I, i9, aVar);
            eVar.add(aVar.f19391c);
        }
        return iM23132p;
    }

    /* JADX INFO: renamed from: r */
    static int m23134r(byte[] bArr, int i7, AbstractC5063B.e eVar, a aVar) throws C5065C {
        AbstractC5100g abstractC5100g = (AbstractC5100g) eVar;
        int iM23109I = m23109I(bArr, i7, aVar);
        int i8 = aVar.f19389a + iM23109I;
        while (iM23109I < i8) {
            iM23109I = m23112L(bArr, iM23109I, aVar);
            abstractC5100g.m23143b(aVar.f19390b != 0);
        }
        if (iM23109I == i8) {
            return iM23109I;
        }
        throw C5065C.m22900m();
    }

    /* JADX INFO: renamed from: s */
    static int m23135s(byte[] bArr, int i7, AbstractC5063B.e eVar, a aVar) throws C5065C {
        AbstractC5114n abstractC5114n = (AbstractC5114n) eVar;
        int iM23109I = m23109I(bArr, i7, aVar);
        int i8 = aVar.f19389a + iM23109I;
        while (iM23109I < i8) {
            abstractC5114n.m23474b(m23121e(bArr, iM23109I));
            iM23109I += 8;
        }
        if (iM23109I == i8) {
            return iM23109I;
        }
        throw C5065C.m22900m();
    }

    /* JADX INFO: renamed from: t */
    static int m23136t(byte[] bArr, int i7, AbstractC5063B.e eVar, a aVar) throws C5065C {
        C5061A c5061a = (C5061A) eVar;
        int iM23109I = m23109I(bArr, i7, aVar);
        int i8 = aVar.f19389a + iM23109I;
        while (iM23109I < i8) {
            c5061a.m22825g(m23124h(bArr, iM23109I));
            iM23109I += 4;
        }
        if (iM23109I == i8) {
            return iM23109I;
        }
        throw C5065C.m22900m();
    }

    /* JADX INFO: renamed from: u */
    static int m23137u(byte[] bArr, int i7, AbstractC5063B.e eVar, a aVar) throws C5065C {
        AbstractC5073K abstractC5073K = (AbstractC5073K) eVar;
        int iM23109I = m23109I(bArr, i7, aVar);
        int i8 = aVar.f19389a + iM23109I;
        while (iM23109I < i8) {
            abstractC5073K.m22928b(m23126j(bArr, iM23109I));
            iM23109I += 8;
        }
        if (iM23109I == i8) {
            return iM23109I;
        }
        throw C5065C.m22900m();
    }

    /* JADX INFO: renamed from: v */
    static int m23138v(byte[] bArr, int i7, AbstractC5063B.e eVar, a aVar) throws C5065C {
        AbstractC5132w abstractC5132w = (AbstractC5132w) eVar;
        int iM23109I = m23109I(bArr, i7, aVar);
        int i8 = aVar.f19389a + iM23109I;
        while (iM23109I < i8) {
            abstractC5132w.m23658b(m23128l(bArr, iM23109I));
            iM23109I += 4;
        }
        if (iM23109I == i8) {
            return iM23109I;
        }
        throw C5065C.m22900m();
    }

    /* JADX INFO: renamed from: w */
    static int m23139w(byte[] bArr, int i7, AbstractC5063B.e eVar, a aVar) throws C5065C {
        C5061A c5061a = (C5061A) eVar;
        int iM23109I = m23109I(bArr, i7, aVar);
        int i8 = aVar.f19389a + iM23109I;
        while (iM23109I < i8) {
            iM23109I = m23109I(bArr, iM23109I, aVar);
            c5061a.m22825g(AbstractC5106j.m23183c(aVar.f19389a));
        }
        if (iM23109I == i8) {
            return iM23109I;
        }
        throw C5065C.m22900m();
    }

    /* JADX INFO: renamed from: x */
    static int m23140x(byte[] bArr, int i7, AbstractC5063B.e eVar, a aVar) throws C5065C {
        AbstractC5073K abstractC5073K = (AbstractC5073K) eVar;
        int iM23109I = m23109I(bArr, i7, aVar);
        int i8 = aVar.f19389a + iM23109I;
        while (iM23109I < i8) {
            iM23109I = m23112L(bArr, iM23109I, aVar);
            abstractC5073K.m22928b(AbstractC5106j.m23184d(aVar.f19390b));
        }
        if (iM23109I == i8) {
            return iM23109I;
        }
        throw C5065C.m22900m();
    }

    /* JADX INFO: renamed from: y */
    static int m23141y(byte[] bArr, int i7, AbstractC5063B.e eVar, a aVar) throws C5065C {
        C5061A c5061a = (C5061A) eVar;
        int iM23109I = m23109I(bArr, i7, aVar);
        int i8 = aVar.f19389a + iM23109I;
        while (iM23109I < i8) {
            iM23109I = m23109I(bArr, iM23109I, aVar);
            c5061a.m22825g(aVar.f19389a);
        }
        if (iM23109I == i8) {
            return iM23109I;
        }
        throw C5065C.m22900m();
    }

    /* JADX INFO: renamed from: z */
    static int m23142z(byte[] bArr, int i7, AbstractC5063B.e eVar, a aVar) throws C5065C {
        AbstractC5073K abstractC5073K = (AbstractC5073K) eVar;
        int iM23109I = m23109I(bArr, i7, aVar);
        int i8 = aVar.f19389a + iM23109I;
        while (iM23109I < i8) {
            iM23109I = m23112L(bArr, iM23109I, aVar);
            abstractC5073K.m22928b(aVar.f19390b);
        }
        if (iM23109I == i8) {
            return iM23109I;
        }
        throw C5065C.m22900m();
    }
}

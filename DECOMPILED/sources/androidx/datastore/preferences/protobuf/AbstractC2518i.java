package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2518i extends AbstractC2510e {

    /* JADX INFO: renamed from: c */
    private static final Logger f9555c = Logger.getLogger(AbstractC2518i.class.getName());

    /* JADX INFO: renamed from: d */
    private static final boolean f9556d = AbstractC2519i0.m11401B();

    /* JADX INFO: renamed from: a */
    C2520j f9557a;

    /* JADX INFO: renamed from: b */
    private boolean f9558b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$b */
    private static abstract class b extends AbstractC2518i {

        /* JADX INFO: renamed from: e */
        final byte[] f9559e;

        /* JADX INFO: renamed from: f */
        final int f9560f;

        /* JADX INFO: renamed from: g */
        int f9561g;

        /* JADX INFO: renamed from: h */
        int f9562h;

        b(int i7) {
            super();
            if (i7 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i7, 20)];
            this.f9559e = bArr;
            this.f9560f = bArr.length;
        }

        /* JADX INFO: renamed from: R0 */
        final void m11388R0(byte b7) {
            byte[] bArr = this.f9559e;
            int i7 = this.f9561g;
            this.f9561g = i7 + 1;
            bArr[i7] = b7;
            this.f9562h++;
        }

        /* JADX INFO: renamed from: S0 */
        final void m11389S0(int i7) {
            byte[] bArr = this.f9559e;
            int i8 = this.f9561g;
            int i9 = i8 + 1;
            this.f9561g = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i8 + 2;
            this.f9561g = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i8 + 3;
            this.f9561g = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.f9561g = i8 + 4;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
            this.f9562h += 4;
        }

        /* JADX INFO: renamed from: T0 */
        final void m11390T0(long j7) {
            byte[] bArr = this.f9559e;
            int i7 = this.f9561g;
            int i8 = i7 + 1;
            this.f9561g = i8;
            bArr[i7] = (byte) (j7 & 255);
            int i9 = i7 + 2;
            this.f9561g = i9;
            bArr[i8] = (byte) ((j7 >> 8) & 255);
            int i10 = i7 + 3;
            this.f9561g = i10;
            bArr[i9] = (byte) ((j7 >> 16) & 255);
            int i11 = i7 + 4;
            this.f9561g = i11;
            bArr[i10] = (byte) (255 & (j7 >> 24));
            int i12 = i7 + 5;
            this.f9561g = i12;
            bArr[i11] = (byte) (((int) (j7 >> 32)) & 255);
            int i13 = i7 + 6;
            this.f9561g = i13;
            bArr[i12] = (byte) (((int) (j7 >> 40)) & 255);
            int i14 = i7 + 7;
            this.f9561g = i14;
            bArr[i13] = (byte) (((int) (j7 >> 48)) & 255);
            this.f9561g = i7 + 8;
            bArr[i14] = (byte) (((int) (j7 >> 56)) & 255);
            this.f9562h += 8;
        }

        /* JADX INFO: renamed from: U0 */
        final void m11391U0(int i7) {
            if (i7 >= 0) {
                m11393W0(i7);
            } else {
                m11394X0(i7);
            }
        }

        /* JADX INFO: renamed from: V0 */
        final void m11392V0(int i7, int i8) {
            m11393W0(AbstractC2523k0.m11550c(i7, i8));
        }

        /* JADX INFO: renamed from: W0 */
        final void m11393W0(int i7) {
            if (!AbstractC2518i.f9556d) {
                while ((i7 & (-128)) != 0) {
                    byte[] bArr = this.f9559e;
                    int i8 = this.f9561g;
                    this.f9561g = i8 + 1;
                    bArr[i8] = (byte) ((i7 | 128) & 255);
                    this.f9562h++;
                    i7 >>>= 7;
                }
                byte[] bArr2 = this.f9559e;
                int i9 = this.f9561g;
                this.f9561g = i9 + 1;
                bArr2[i9] = (byte) i7;
                this.f9562h++;
                return;
            }
            long j7 = this.f9561g;
            while ((i7 & (-128)) != 0) {
                byte[] bArr3 = this.f9559e;
                int i10 = this.f9561g;
                this.f9561g = i10 + 1;
                AbstractC2519i0.m11407H(bArr3, i10, (byte) ((i7 | 128) & 255));
                i7 >>>= 7;
            }
            byte[] bArr4 = this.f9559e;
            int i11 = this.f9561g;
            this.f9561g = i11 + 1;
            AbstractC2519i0.m11407H(bArr4, i11, (byte) i7);
            this.f9562h += (int) (((long) this.f9561g) - j7);
        }

        /* JADX INFO: renamed from: X0 */
        final void m11394X0(long j7) {
            if (!AbstractC2518i.f9556d) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.f9559e;
                    int i7 = this.f9561g;
                    this.f9561g = i7 + 1;
                    bArr[i7] = (byte) ((((int) j7) | 128) & 255);
                    this.f9562h++;
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.f9559e;
                int i8 = this.f9561g;
                this.f9561g = i8 + 1;
                bArr2[i8] = (byte) j7;
                this.f9562h++;
                return;
            }
            long j8 = this.f9561g;
            while ((j7 & (-128)) != 0) {
                byte[] bArr3 = this.f9559e;
                int i9 = this.f9561g;
                this.f9561g = i9 + 1;
                AbstractC2519i0.m11407H(bArr3, i9, (byte) ((((int) j7) | 128) & 255));
                j7 >>>= 7;
            }
            byte[] bArr4 = this.f9559e;
            int i10 = this.f9561g;
            this.f9561g = i10 + 1;
            AbstractC2519i0.m11407H(bArr4, i10, (byte) j7);
            this.f9562h += (int) (((long) this.f9561g) - j8);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$c */
    public static class c extends IOException {
        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$d */
    private static final class d extends b {

        /* JADX INFO: renamed from: i */
        private final OutputStream f9563i;

        d(OutputStream outputStream, int i7) {
            super(i7);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f9563i = outputStream;
        }

        /* JADX INFO: renamed from: Y0 */
        private void m11395Y0() throws IOException {
            this.f9563i.write(this.f9559e, 0, this.f9561g);
            this.f9561g = 0;
        }

        /* JADX INFO: renamed from: Z0 */
        private void m11396Z0(int i7) throws IOException {
            if (this.f9560f - this.f9561g < i7) {
                m11395Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: A0 */
        public void mo11341A0(int i7, InterfaceC2486J interfaceC2486J) throws IOException {
            mo11353M0(1, 3);
            mo11354N0(2, i7);
            m11398b1(3, interfaceC2486J);
            mo11353M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: B0 */
        public void mo11342B0(int i7, AbstractC2512f abstractC2512f) throws IOException {
            mo11353M0(1, 3);
            mo11354N0(2, i7);
            mo11366e0(3, abstractC2512f);
            mo11353M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: K0 */
        public void mo11351K0(int i7, String str) throws IOException {
            mo11353M0(i7, 2);
            mo11352L0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: L0 */
        public void mo11352L0(String str) throws IOException {
            int iM11525c;
            try {
                int length = str.length() * 3;
                int iM11310Q = AbstractC2518i.m11310Q(length);
                int i7 = iM11310Q + length;
                int i8 = this.f9560f;
                if (i7 > i8) {
                    byte[] bArr = new byte[length];
                    int iM11524b = AbstractC2521j0.m11524b(str, bArr, 0, length);
                    mo11355O0(iM11524b);
                    mo11135a(bArr, 0, iM11524b);
                    return;
                }
                if (i7 > i8 - this.f9561g) {
                    m11395Y0();
                }
                int iM11310Q2 = AbstractC2518i.m11310Q(str.length());
                int i9 = this.f9561g;
                try {
                    if (iM11310Q2 == iM11310Q) {
                        int i10 = i9 + iM11310Q2;
                        this.f9561g = i10;
                        int iM11524b2 = AbstractC2521j0.m11524b(str, this.f9559e, i10, this.f9560f - i10);
                        this.f9561g = i9;
                        iM11525c = (iM11524b2 - i9) - iM11310Q2;
                        m11393W0(iM11525c);
                        this.f9561g = iM11524b2;
                    } else {
                        iM11525c = AbstractC2521j0.m11525c(str);
                        m11393W0(iM11525c);
                        this.f9561g = AbstractC2521j0.m11524b(str, this.f9559e, this.f9561g, iM11525c);
                    }
                    this.f9562h += iM11525c;
                } catch (AbstractC2521j0.d e7) {
                    this.f9562h -= this.f9561g - i9;
                    this.f9561g = i9;
                    throw e7;
                } catch (ArrayIndexOutOfBoundsException e8) {
                    throw new c(e8);
                }
            } catch (AbstractC2521j0.d e9) {
                m11359W(str, e9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: M0 */
        public void mo11353M0(int i7, int i8) throws IOException {
            mo11355O0(AbstractC2523k0.m11550c(i7, i8));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: N0 */
        public void mo11354N0(int i7, int i8) throws IOException {
            m11396Z0(20);
            m11392V0(i7, 0);
            m11393W0(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: O0 */
        public void mo11355O0(int i7) throws IOException {
            m11396Z0(5);
            m11393W0(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: P0 */
        public void mo11356P0(int i7, long j7) throws IOException {
            m11396Z0(20);
            m11392V0(i7, 0);
            m11394X0(j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: Q0 */
        public void mo11357Q0(long j7) throws IOException {
            m11396Z0(10);
            m11394X0(j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: V */
        public void mo11358V() throws IOException {
            if (this.f9561g > 0) {
                m11395Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: Z */
        public void mo11361Z(byte b7) throws IOException {
            if (this.f9561g == this.f9560f) {
                m11395Y0();
            }
            m11388R0(b7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i, androidx.datastore.preferences.protobuf.AbstractC2510e
        /* JADX INFO: renamed from: a */
        public void mo11135a(byte[] bArr, int i7, int i8) throws IOException {
            m11397a1(bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: a0 */
        public void mo11362a0(int i7, boolean z7) throws IOException {
            m11396Z0(11);
            m11392V0(i7, 0);
            m11388R0(z7 ? (byte) 1 : (byte) 0);
        }

        /* JADX INFO: renamed from: a1 */
        public void m11397a1(byte[] bArr, int i7, int i8) throws IOException {
            int i9 = this.f9560f;
            int i10 = this.f9561g;
            if (i9 - i10 >= i8) {
                System.arraycopy(bArr, i7, this.f9559e, i10, i8);
                this.f9561g += i8;
                this.f9562h += i8;
                return;
            }
            int i11 = i9 - i10;
            System.arraycopy(bArr, i7, this.f9559e, i10, i11);
            int i12 = i7 + i11;
            int i13 = i8 - i11;
            this.f9561g = this.f9560f;
            this.f9562h += i11;
            m11395Y0();
            if (i13 <= this.f9560f) {
                System.arraycopy(bArr, i12, this.f9559e, 0, i13);
                this.f9561g = i13;
            } else {
                this.f9563i.write(bArr, i12, i13);
            }
            this.f9562h += i13;
        }

        /* JADX INFO: renamed from: b1 */
        public void m11398b1(int i7, InterfaceC2486J interfaceC2486J) throws IOException {
            mo11353M0(i7, 2);
            mo11387z0(interfaceC2486J);
        }

        /* JADX INFO: renamed from: c1 */
        void m11399c1(InterfaceC2486J interfaceC2486J, InterfaceC2500Y interfaceC2500Y) throws IOException {
            mo11355O0(((AbstractC2502a) interfaceC2486J).mo11037f(interfaceC2500Y));
            interfaceC2500Y.mo10974i(interfaceC2486J, this.f9557a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: d0 */
        public void mo11365d0(byte[] bArr, int i7, int i8) throws IOException {
            mo11355O0(i8);
            m11397a1(bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: e0 */
        public void mo11366e0(int i7, AbstractC2512f abstractC2512f) throws IOException {
            mo11353M0(i7, 2);
            mo11367f0(abstractC2512f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: f0 */
        public void mo11367f0(AbstractC2512f abstractC2512f) throws IOException {
            mo11355O0(abstractC2512f.size());
            abstractC2512f.mo11147D(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: k0 */
        public void mo11372k0(int i7, int i8) throws IOException {
            m11396Z0(14);
            m11392V0(i7, 5);
            m11389S0(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: l0 */
        public void mo11373l0(int i7) throws IOException {
            m11396Z0(4);
            m11389S0(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: m0 */
        public void mo11374m0(int i7, long j7) throws IOException {
            m11396Z0(18);
            m11392V0(i7, 1);
            m11390T0(j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: n0 */
        public void mo11375n0(long j7) throws IOException {
            m11396Z0(8);
            m11390T0(j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: u0 */
        public void mo11382u0(int i7, int i8) throws IOException {
            m11396Z0(20);
            m11392V0(i7, 0);
            m11391U0(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: v0 */
        public void mo11383v0(int i7) throws IOException {
            if (i7 >= 0) {
                mo11355O0(i7);
            } else {
                mo11357Q0(i7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: y0 */
        void mo11386y0(int i7, InterfaceC2486J interfaceC2486J, InterfaceC2500Y interfaceC2500Y) throws IOException {
            mo11353M0(i7, 2);
            m11399c1(interfaceC2486J, interfaceC2500Y);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2518i
        /* JADX INFO: renamed from: z0 */
        public void mo11387z0(InterfaceC2486J interfaceC2486J) throws IOException {
            mo11355O0(interfaceC2486J.mo10896b());
            interfaceC2486J.mo10898d(this);
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m11294A(InterfaceC2486J interfaceC2486J) {
        return m11339y(interfaceC2486J.mo10896b());
    }

    /* JADX INFO: renamed from: B */
    static int m11295B(InterfaceC2486J interfaceC2486J, InterfaceC2500Y interfaceC2500Y) {
        return m11339y(((AbstractC2502a) interfaceC2486J).mo11037f(interfaceC2500Y));
    }

    /* JADX INFO: renamed from: C */
    static int m11296C(int i7) {
        if (i7 > 4096) {
            return 4096;
        }
        return i7;
    }

    /* JADX INFO: renamed from: D */
    public static int m11297D(int i7, AbstractC2512f abstractC2512f) {
        return (m11308O(1) * 2) + m11309P(2, i7) + m11320f(3, abstractC2512f);
    }

    /* JADX INFO: renamed from: E */
    public static int m11298E(int i7, int i8) {
        return m11308O(i7) + m11299F(i8);
    }

    /* JADX INFO: renamed from: F */
    public static int m11299F(int i7) {
        return 4;
    }

    /* JADX INFO: renamed from: G */
    public static int m11300G(int i7, long j7) {
        return m11308O(i7) + m11301H(j7);
    }

    /* JADX INFO: renamed from: H */
    public static int m11301H(long j7) {
        return 8;
    }

    /* JADX INFO: renamed from: I */
    public static int m11302I(int i7, int i8) {
        return m11308O(i7) + m11303J(i8);
    }

    /* JADX INFO: renamed from: J */
    public static int m11303J(int i7) {
        return m11310Q(m11313T(i7));
    }

    /* JADX INFO: renamed from: K */
    public static int m11304K(int i7, long j7) {
        return m11308O(i7) + m11305L(j7);
    }

    /* JADX INFO: renamed from: L */
    public static int m11305L(long j7) {
        return m11312S(m11314U(j7));
    }

    /* JADX INFO: renamed from: M */
    public static int m11306M(int i7, String str) {
        return m11308O(i7) + m11307N(str);
    }

    /* JADX INFO: renamed from: N */
    public static int m11307N(String str) {
        int length;
        try {
            length = AbstractC2521j0.m11525c(str);
        } catch (AbstractC2521j0.d unused) {
            length = str.getBytes(AbstractC2534u.f9724b).length;
        }
        return m11339y(length);
    }

    /* JADX INFO: renamed from: O */
    public static int m11308O(int i7) {
        return m11310Q(AbstractC2523k0.m11550c(i7, 0));
    }

    /* JADX INFO: renamed from: P */
    public static int m11309P(int i7, int i8) {
        return m11308O(i7) + m11310Q(i8);
    }

    /* JADX INFO: renamed from: Q */
    public static int m11310Q(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: R */
    public static int m11311R(int i7, long j7) {
        return m11308O(i7) + m11312S(j7);
    }

    /* JADX INFO: renamed from: S */
    public static int m11312S(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: T */
    public static int m11313T(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    /* JADX INFO: renamed from: U */
    public static long m11314U(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    /* JADX INFO: renamed from: Y */
    public static AbstractC2518i m11315Y(OutputStream outputStream, int i7) {
        return new d(outputStream, i7);
    }

    /* JADX INFO: renamed from: c */
    public static int m11317c(int i7, boolean z7) {
        return m11308O(i7) + m11318d(z7);
    }

    /* JADX INFO: renamed from: d */
    public static int m11318d(boolean z7) {
        return 1;
    }

    /* JADX INFO: renamed from: e */
    public static int m11319e(byte[] bArr) {
        return m11339y(bArr.length);
    }

    /* JADX INFO: renamed from: f */
    public static int m11320f(int i7, AbstractC2512f abstractC2512f) {
        return m11308O(i7) + m11321g(abstractC2512f);
    }

    /* JADX INFO: renamed from: g */
    public static int m11321g(AbstractC2512f abstractC2512f) {
        return m11339y(abstractC2512f.size());
    }

    /* JADX INFO: renamed from: h */
    public static int m11322h(int i7, double d7) {
        return m11308O(i7) + m11323i(d7);
    }

    /* JADX INFO: renamed from: i */
    public static int m11323i(double d7) {
        return 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m11324j(int i7, int i8) {
        return m11308O(i7) + m11325k(i8);
    }

    /* JADX INFO: renamed from: k */
    public static int m11325k(int i7) {
        return m11336v(i7);
    }

    /* JADX INFO: renamed from: l */
    public static int m11326l(int i7, int i8) {
        return m11308O(i7) + m11327m(i8);
    }

    /* JADX INFO: renamed from: m */
    public static int m11327m(int i7) {
        return 4;
    }

    /* JADX INFO: renamed from: n */
    public static int m11328n(int i7, long j7) {
        return m11308O(i7) + m11329o(j7);
    }

    /* JADX INFO: renamed from: o */
    public static int m11329o(long j7) {
        return 8;
    }

    /* JADX INFO: renamed from: p */
    public static int m11330p(int i7, float f7) {
        return m11308O(i7) + m11331q(f7);
    }

    /* JADX INFO: renamed from: q */
    public static int m11331q(float f7) {
        return 4;
    }

    /* JADX INFO: renamed from: r */
    static int m11332r(int i7, InterfaceC2486J interfaceC2486J, InterfaceC2500Y interfaceC2500Y) {
        return (m11308O(i7) * 2) + m11334t(interfaceC2486J, interfaceC2500Y);
    }

    /* JADX INFO: renamed from: s */
    public static int m11333s(InterfaceC2486J interfaceC2486J) {
        return interfaceC2486J.mo10896b();
    }

    /* JADX INFO: renamed from: t */
    static int m11334t(InterfaceC2486J interfaceC2486J, InterfaceC2500Y interfaceC2500Y) {
        return ((AbstractC2502a) interfaceC2486J).mo11037f(interfaceC2500Y);
    }

    /* JADX INFO: renamed from: u */
    public static int m11335u(int i7, int i8) {
        return m11308O(i7) + m11336v(i8);
    }

    /* JADX INFO: renamed from: v */
    public static int m11336v(int i7) {
        return m11312S(i7);
    }

    /* JADX INFO: renamed from: w */
    public static int m11337w(int i7, long j7) {
        return m11308O(i7) + m11338x(j7);
    }

    /* JADX INFO: renamed from: x */
    public static int m11338x(long j7) {
        return m11312S(j7);
    }

    /* JADX INFO: renamed from: y */
    static int m11339y(int i7) {
        return m11310Q(i7) + i7;
    }

    /* JADX INFO: renamed from: z */
    static int m11340z(int i7, InterfaceC2486J interfaceC2486J, InterfaceC2500Y interfaceC2500Y) {
        return m11308O(i7) + m11295B(interfaceC2486J, interfaceC2500Y);
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo11341A0(int i7, InterfaceC2486J interfaceC2486J);

    /* JADX INFO: renamed from: B0 */
    public abstract void mo11342B0(int i7, AbstractC2512f abstractC2512f);

    /* JADX INFO: renamed from: C0 */
    public final void m11343C0(int i7, int i8) {
        mo11372k0(i7, i8);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m11344D0(int i7) {
        mo11373l0(i7);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m11345E0(int i7, long j7) {
        mo11374m0(i7, j7);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m11346F0(long j7) {
        mo11375n0(j7);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m11347G0(int i7, int i8) {
        mo11354N0(i7, m11313T(i8));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m11348H0(int i7) {
        mo11355O0(m11313T(i7));
    }

    /* JADX INFO: renamed from: I0 */
    public final void m11349I0(int i7, long j7) {
        mo11356P0(i7, m11314U(j7));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m11350J0(long j7) {
        mo11357Q0(m11314U(j7));
    }

    /* JADX INFO: renamed from: K0 */
    public abstract void mo11351K0(int i7, String str);

    /* JADX INFO: renamed from: L0 */
    public abstract void mo11352L0(String str);

    /* JADX INFO: renamed from: M0 */
    public abstract void mo11353M0(int i7, int i8);

    /* JADX INFO: renamed from: N0 */
    public abstract void mo11354N0(int i7, int i8);

    /* JADX INFO: renamed from: O0 */
    public abstract void mo11355O0(int i7);

    /* JADX INFO: renamed from: P0 */
    public abstract void mo11356P0(int i7, long j7);

    /* JADX INFO: renamed from: Q0 */
    public abstract void mo11357Q0(long j7);

    /* JADX INFO: renamed from: V */
    public abstract void mo11358V();

    /* JADX INFO: renamed from: W */
    final void m11359W(String str, AbstractC2521j0.d dVar) throws c {
        f9555c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC2534u.f9724b);
        try {
            mo11355O0(bytes.length);
            mo11135a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new c(e7);
        }
    }

    /* JADX INFO: renamed from: X */
    boolean m11360X() {
        return this.f9558b;
    }

    /* JADX INFO: renamed from: Z */
    public abstract void mo11361Z(byte b7);

    @Override // androidx.datastore.preferences.protobuf.AbstractC2510e
    /* JADX INFO: renamed from: a */
    public abstract void mo11135a(byte[] bArr, int i7, int i8);

    /* JADX INFO: renamed from: a0 */
    public abstract void mo11362a0(int i7, boolean z7);

    /* JADX INFO: renamed from: b0 */
    public final void m11363b0(boolean z7) {
        mo11361Z(z7 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m11364c0(byte[] bArr) {
        mo11365d0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: d0 */
    abstract void mo11365d0(byte[] bArr, int i7, int i8);

    /* JADX INFO: renamed from: e0 */
    public abstract void mo11366e0(int i7, AbstractC2512f abstractC2512f);

    /* JADX INFO: renamed from: f0 */
    public abstract void mo11367f0(AbstractC2512f abstractC2512f);

    /* JADX INFO: renamed from: g0 */
    public final void m11368g0(int i7, double d7) {
        mo11374m0(i7, Double.doubleToRawLongBits(d7));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m11369h0(double d7) {
        mo11375n0(Double.doubleToRawLongBits(d7));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m11370i0(int i7, int i8) {
        mo11382u0(i7, i8);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m11371j0(int i7) {
        mo11383v0(i7);
    }

    /* JADX INFO: renamed from: k0 */
    public abstract void mo11372k0(int i7, int i8);

    /* JADX INFO: renamed from: l0 */
    public abstract void mo11373l0(int i7);

    /* JADX INFO: renamed from: m0 */
    public abstract void mo11374m0(int i7, long j7);

    /* JADX INFO: renamed from: n0 */
    public abstract void mo11375n0(long j7);

    /* JADX INFO: renamed from: o0 */
    public final void m11376o0(int i7, float f7) {
        mo11372k0(i7, Float.floatToRawIntBits(f7));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m11377p0(float f7) {
        mo11373l0(Float.floatToRawIntBits(f7));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m11378q0(int i7, InterfaceC2486J interfaceC2486J) {
        mo11353M0(i7, 3);
        m11380s0(interfaceC2486J);
        mo11353M0(i7, 4);
    }

    /* JADX INFO: renamed from: r0 */
    final void m11379r0(int i7, InterfaceC2486J interfaceC2486J, InterfaceC2500Y interfaceC2500Y) {
        mo11353M0(i7, 3);
        m11381t0(interfaceC2486J, interfaceC2500Y);
        mo11353M0(i7, 4);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m11380s0(InterfaceC2486J interfaceC2486J) {
        interfaceC2486J.mo10898d(this);
    }

    /* JADX INFO: renamed from: t0 */
    final void m11381t0(InterfaceC2486J interfaceC2486J, InterfaceC2500Y interfaceC2500Y) {
        interfaceC2500Y.mo10974i(interfaceC2486J, this.f9557a);
    }

    /* JADX INFO: renamed from: u0 */
    public abstract void mo11382u0(int i7, int i8);

    /* JADX INFO: renamed from: v0 */
    public abstract void mo11383v0(int i7);

    /* JADX INFO: renamed from: w0 */
    public final void m11384w0(int i7, long j7) {
        mo11356P0(i7, j7);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m11385x0(long j7) {
        mo11357Q0(j7);
    }

    /* JADX INFO: renamed from: y0 */
    abstract void mo11386y0(int i7, InterfaceC2486J interfaceC2486J, InterfaceC2500Y interfaceC2500Y);

    /* JADX INFO: renamed from: z0 */
    public abstract void mo11387z0(InterfaceC2486J interfaceC2486J);

    private AbstractC2518i() {
    }
}

package com.google.protobuf;

import com.google.android.gms.common.api.C3553a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5106j {

    /* JADX INFO: renamed from: f */
    private static volatile int f19414f = 100;

    /* JADX INFO: renamed from: a */
    int f19415a;

    /* JADX INFO: renamed from: b */
    int f19416b;

    /* JADX INFO: renamed from: c */
    int f19417c;

    /* JADX INFO: renamed from: d */
    C5108k f19418d;

    /* JADX INFO: renamed from: e */
    private boolean f19419e;

    /* JADX INFO: renamed from: com.google.protobuf.j$b */
    private static final class b extends AbstractC5106j {

        /* JADX INFO: renamed from: g */
        private final byte[] f19420g;

        /* JADX INFO: renamed from: h */
        private final boolean f19421h;

        /* JADX INFO: renamed from: i */
        private int f19422i;

        /* JADX INFO: renamed from: j */
        private int f19423j;

        /* JADX INFO: renamed from: k */
        private int f19424k;

        /* JADX INFO: renamed from: l */
        private int f19425l;

        /* JADX INFO: renamed from: m */
        private int f19426m;

        /* JADX INFO: renamed from: n */
        private boolean f19427n;

        /* JADX INFO: renamed from: o */
        private int f19428o;

        /* JADX INFO: renamed from: S */
        private void m23220S() {
            int i7 = this.f19422i + this.f19423j;
            this.f19422i = i7;
            int i8 = i7 - this.f19425l;
            int i9 = this.f19428o;
            if (i8 <= i9) {
                this.f19423j = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f19423j = i10;
            this.f19422i = i7 - i10;
        }

        /* JADX INFO: renamed from: U */
        private void m23221U() throws C5065C {
            if (this.f19422i - this.f19424k >= 10) {
                m23222V();
            } else {
                m23223W();
            }
        }

        /* JADX INFO: renamed from: V */
        private void m23222V() throws C5065C {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f19420g;
                int i8 = this.f19424k;
                this.f19424k = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw C5065C.m22895f();
        }

        /* JADX INFO: renamed from: W */
        private void m23223W() throws C5065C {
            for (int i7 = 0; i7 < 10; i7++) {
                if (m23224L() >= 0) {
                    return;
                }
            }
            throw C5065C.m22895f();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: A */
        public int mo23192A() {
            return AbstractC5106j.m23183c(m23228P());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: B */
        public long mo23193B() {
            return AbstractC5106j.m23184d(m23229Q());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: C */
        public String mo23194C() throws C5065C {
            int iM23228P = m23228P();
            if (iM23228P > 0) {
                int i7 = this.f19422i;
                int i8 = this.f19424k;
                if (iM23228P <= i7 - i8) {
                    String str = new String(this.f19420g, i8, iM23228P, AbstractC5063B.f19294b);
                    this.f19424k += iM23228P;
                    return str;
                }
            }
            if (iM23228P == 0) {
                return "";
            }
            if (iM23228P < 0) {
                throw C5065C.m22896g();
            }
            throw C5065C.m22900m();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: D */
        public String mo23195D() throws C5065C {
            int iM23228P = m23228P();
            if (iM23228P > 0) {
                int i7 = this.f19422i;
                int i8 = this.f19424k;
                if (iM23228P <= i7 - i8) {
                    String strM23816h = AbstractC5139z0.m23816h(this.f19420g, i8, iM23228P);
                    this.f19424k += iM23228P;
                    return strM23816h;
                }
            }
            if (iM23228P == 0) {
                return "";
            }
            if (iM23228P <= 0) {
                throw C5065C.m22896g();
            }
            throw C5065C.m22900m();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: E */
        public int mo23196E() throws C5065C {
            if (mo23206f()) {
                this.f19426m = 0;
                return 0;
            }
            int iM23228P = m23228P();
            this.f19426m = iM23228P;
            if (AbstractC5062A0.m22832a(iM23228P) != 0) {
                return this.f19426m;
            }
            throw C5065C.m22892c();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: F */
        public int mo23197F() {
            return m23228P();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: G */
        public long mo23198G() {
            return m23229Q();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: J */
        public boolean mo23201J(int i7) throws C5065C {
            int iM22833b = AbstractC5062A0.m22833b(i7);
            if (iM22833b == 0) {
                m23221U();
                return true;
            }
            if (iM22833b == 1) {
                m23231T(8);
                return true;
            }
            if (iM22833b == 2) {
                m23231T(m23228P());
                return true;
            }
            if (iM22833b == 3) {
                m23202K();
                mo23203a(AbstractC5062A0.m22834c(AbstractC5062A0.m22832a(i7), 4));
                return true;
            }
            if (iM22833b == 4) {
                return false;
            }
            if (iM22833b != 5) {
                throw C5065C.m22894e();
            }
            m23231T(4);
            return true;
        }

        /* JADX INFO: renamed from: L */
        public byte m23224L() throws C5065C {
            int i7 = this.f19424k;
            if (i7 == this.f19422i) {
                throw C5065C.m22900m();
            }
            byte[] bArr = this.f19420g;
            this.f19424k = i7 + 1;
            return bArr[i7];
        }

        /* JADX INFO: renamed from: M */
        public byte[] m23225M(int i7) throws C5065C {
            if (i7 > 0) {
                int i8 = this.f19422i;
                int i9 = this.f19424k;
                if (i7 <= i8 - i9) {
                    int i10 = i7 + i9;
                    this.f19424k = i10;
                    return Arrays.copyOfRange(this.f19420g, i9, i10);
                }
            }
            if (i7 > 0) {
                throw C5065C.m22900m();
            }
            if (i7 == 0) {
                return AbstractC5063B.f19296d;
            }
            throw C5065C.m22896g();
        }

        /* JADX INFO: renamed from: N */
        public int m23226N() throws C5065C {
            int i7 = this.f19424k;
            if (this.f19422i - i7 < 4) {
                throw C5065C.m22900m();
            }
            byte[] bArr = this.f19420g;
            this.f19424k = i7 + 4;
            return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
        }

        /* JADX INFO: renamed from: O */
        public long m23227O() throws C5065C {
            int i7 = this.f19424k;
            if (this.f19422i - i7 < 8) {
                throw C5065C.m22900m();
            }
            byte[] bArr = this.f19420g;
            this.f19424k = i7 + 8;
            return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: P */
        public int m23228P() {
            int i7;
            int i8 = this.f19424k;
            int i9 = this.f19422i;
            if (i9 != i8) {
                byte[] bArr = this.f19420g;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f19424k = i10;
                    return b7;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i8 + 2;
                    int i12 = (bArr[i10] << 7) ^ b7;
                    if (i12 < 0) {
                        i7 = i12 ^ (-128);
                    } else {
                        int i13 = i8 + 3;
                        int i14 = (bArr[i11] << 14) ^ i12;
                        if (i14 >= 0) {
                            i7 = i14 ^ 16256;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                i7 = (-2080896) ^ i16;
                            } else {
                                i13 = i8 + 5;
                                byte b8 = bArr[i15];
                                int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                                if (b8 < 0) {
                                    i15 = i8 + 6;
                                    if (bArr[i13] < 0) {
                                        i13 = i8 + 7;
                                        if (bArr[i15] < 0) {
                                            i15 = i8 + 8;
                                            if (bArr[i13] < 0) {
                                                i13 = i8 + 9;
                                                if (bArr[i15] < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i11 = i18;
                                                        i7 = i17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i17;
                                }
                                i7 = i17;
                            }
                            i11 = i15;
                        }
                        i11 = i13;
                    }
                    this.f19424k = i11;
                    return i7;
                }
            }
            return (int) m23230R();
        }

        /* JADX INFO: renamed from: Q */
        public long m23229Q() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f19424k;
            int i8 = this.f19422i;
            if (i8 != i7) {
                byte[] bArr = this.f19420g;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f19424k = i9;
                    return b7;
                }
                if (i8 - i9 >= 9) {
                    int i10 = i7 + 2;
                    int i11 = (bArr[i9] << 7) ^ b7;
                    if (i11 < 0) {
                        j7 = i11 ^ (-128);
                    } else {
                        int i12 = i7 + 3;
                        int i13 = (bArr[i10] << 14) ^ i11;
                        if (i13 >= 0) {
                            j7 = i13 ^ 16256;
                            i10 = i12;
                        } else {
                            int i14 = i7 + 4;
                            int i15 = i13 ^ (bArr[i12] << 21);
                            if (i15 < 0) {
                                long j10 = (-2080896) ^ i15;
                                i10 = i14;
                                j7 = j10;
                            } else {
                                long j11 = i15;
                                i10 = i7 + 5;
                                long j12 = j11 ^ (((long) bArr[i14]) << 28);
                                if (j12 >= 0) {
                                    j9 = 266354560;
                                } else {
                                    int i16 = i7 + 6;
                                    long j13 = j12 ^ (((long) bArr[i10]) << 35);
                                    if (j13 < 0) {
                                        j8 = -34093383808L;
                                    } else {
                                        i10 = i7 + 7;
                                        j12 = j13 ^ (((long) bArr[i16]) << 42);
                                        if (j12 >= 0) {
                                            j9 = 4363953127296L;
                                        } else {
                                            i16 = i7 + 8;
                                            j13 = j12 ^ (((long) bArr[i10]) << 49);
                                            if (j13 < 0) {
                                                j8 = -558586000294016L;
                                            } else {
                                                i10 = i7 + 9;
                                                long j14 = (j13 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                                if (j14 < 0) {
                                                    int i17 = i7 + 10;
                                                    if (bArr[i10] >= 0) {
                                                        i10 = i17;
                                                    }
                                                }
                                                j7 = j14;
                                            }
                                        }
                                    }
                                    j7 = j13 ^ j8;
                                    i10 = i16;
                                }
                                j7 = j12 ^ j9;
                            }
                        }
                    }
                    this.f19424k = i10;
                    return j7;
                }
            }
            return m23230R();
        }

        /* JADX INFO: renamed from: R */
        long m23230R() throws C5065C {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                byte bM23224L = m23224L();
                j7 |= ((long) (bM23224L & 127)) << i7;
                if ((bM23224L & 128) == 0) {
                    return j7;
                }
            }
            throw C5065C.m22895f();
        }

        /* JADX INFO: renamed from: T */
        public void m23231T(int i7) throws C5065C {
            if (i7 >= 0) {
                int i8 = this.f19422i;
                int i9 = this.f19424k;
                if (i7 <= i8 - i9) {
                    this.f19424k = i9 + i7;
                    return;
                }
            }
            if (i7 >= 0) {
                throw C5065C.m22900m();
            }
            throw C5065C.m22896g();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: a */
        public void mo23203a(int i7) throws C5065C {
            if (this.f19426m != i7) {
                throw C5065C.m22891b();
            }
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: e */
        public int mo23205e() {
            return this.f19424k - this.f19425l;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: f */
        public boolean mo23206f() {
            return this.f19424k == this.f19422i;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: n */
        public void mo23207n(int i7) {
            this.f19428o = i7;
            m23220S();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: o */
        public int mo23208o(int i7) throws C5065C {
            if (i7 < 0) {
                throw C5065C.m22896g();
            }
            int iMo23205e = i7 + mo23205e();
            if (iMo23205e < 0) {
                throw C5065C.m22897h();
            }
            int i8 = this.f19428o;
            if (iMo23205e > i8) {
                throw C5065C.m22900m();
            }
            this.f19428o = iMo23205e;
            m23220S();
            return i8;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: p */
        public boolean mo23209p() {
            return m23229Q() != 0;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: q */
        public AbstractC5104i mo23210q() {
            int iM23228P = m23228P();
            if (iM23228P > 0) {
                int i7 = this.f19422i;
                int i8 = this.f19424k;
                if (iM23228P <= i7 - i8) {
                    AbstractC5104i abstractC5104iM23155b0 = (this.f19421h && this.f19427n) ? AbstractC5104i.m23155b0(this.f19420g, i8, iM23228P) : AbstractC5104i.m23161q(this.f19420g, i8, iM23228P);
                    this.f19424k += iM23228P;
                    return abstractC5104iM23155b0;
                }
            }
            return iM23228P == 0 ? AbstractC5104i.f19401b : AbstractC5104i.m23154a0(m23225M(iM23228P));
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: r */
        public double mo23211r() {
            return Double.longBitsToDouble(m23227O());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: s */
        public int mo23212s() {
            return m23228P();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: t */
        public int mo23213t() {
            return m23226N();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: u */
        public long mo23214u() {
            return m23227O();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: v */
        public float mo23215v() {
            return Float.intBitsToFloat(m23226N());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: w */
        public int mo23216w() {
            return m23228P();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: x */
        public long mo23217x() {
            return m23229Q();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: y */
        public int mo23218y() {
            return m23226N();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: z */
        public long mo23219z() {
            return m23227O();
        }

        private b(byte[] bArr, int i7, int i8, boolean z7) {
            super();
            this.f19428o = C3553a.e.API_PRIORITY_OTHER;
            this.f19420g = bArr;
            this.f19422i = i8 + i7;
            this.f19424k = i7;
            this.f19425l = i7;
            this.f19421h = z7;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$c */
    private static final class c extends AbstractC5106j {

        /* JADX INFO: renamed from: g */
        private final Iterable f19429g;

        /* JADX INFO: renamed from: h */
        private final Iterator f19430h;

        /* JADX INFO: renamed from: i */
        private ByteBuffer f19431i;

        /* JADX INFO: renamed from: j */
        private final boolean f19432j;

        /* JADX INFO: renamed from: k */
        private boolean f19433k;

        /* JADX INFO: renamed from: l */
        private int f19434l;

        /* JADX INFO: renamed from: m */
        private int f19435m;

        /* JADX INFO: renamed from: n */
        private int f19436n;

        /* JADX INFO: renamed from: o */
        private int f19437o;

        /* JADX INFO: renamed from: p */
        private int f19438p;

        /* JADX INFO: renamed from: q */
        private int f19439q;

        /* JADX INFO: renamed from: r */
        private long f19440r;

        /* JADX INFO: renamed from: s */
        private long f19441s;

        /* JADX INFO: renamed from: t */
        private long f19442t;

        /* JADX INFO: renamed from: u */
        private long f19443u;

        /* JADX INFO: renamed from: L */
        private long m23232L() {
            return this.f19443u - this.f19440r;
        }

        /* JADX INFO: renamed from: M */
        private void m23233M() throws C5065C {
            if (!this.f19430h.hasNext()) {
                throw C5065C.m22900m();
            }
            m23239Z();
        }

        /* JADX INFO: renamed from: O */
        private void m23234O(byte[] bArr, int i7, int i8) throws C5065C {
            if (i8 < 0 || i8 > m23236V()) {
                if (i8 > 0) {
                    throw C5065C.m22900m();
                }
                if (i8 != 0) {
                    throw C5065C.m22896g();
                }
                return;
            }
            int i9 = i8;
            while (i9 > 0) {
                if (m23232L() == 0) {
                    m23233M();
                }
                int iMin = Math.min(i9, (int) m23232L());
                long j7 = iMin;
                AbstractC5137y0.m23768p(this.f19440r, bArr, (i8 - i9) + i7, j7);
                i9 -= iMin;
                this.f19440r += j7;
            }
        }

        /* JADX INFO: renamed from: U */
        private void m23235U() {
            int i7 = this.f19434l + this.f19435m;
            this.f19434l = i7;
            int i8 = i7 - this.f19439q;
            int i9 = this.f19436n;
            if (i8 <= i9) {
                this.f19435m = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f19435m = i10;
            this.f19434l = i7 - i10;
        }

        /* JADX INFO: renamed from: V */
        private int m23236V() {
            return (int) ((((long) (this.f19434l - this.f19438p)) - this.f19440r) + this.f19441s);
        }

        /* JADX INFO: renamed from: X */
        private void m23237X() throws C5065C {
            for (int i7 = 0; i7 < 10; i7++) {
                if (m23240N() >= 0) {
                    return;
                }
            }
            throw C5065C.m22895f();
        }

        /* JADX INFO: renamed from: Y */
        private ByteBuffer m23238Y(int i7, int i8) {
            int iPosition = this.f19431i.position();
            int iLimit = this.f19431i.limit();
            ByteBuffer byteBuffer = this.f19431i;
            try {
                try {
                    byteBuffer.position(i7);
                    byteBuffer.limit(i8);
                    ByteBuffer byteBufferSlice = this.f19431i.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw C5065C.m22900m();
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }

        /* JADX INFO: renamed from: Z */
        private void m23239Z() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f19430h.next();
            this.f19431i = byteBuffer;
            this.f19438p += (int) (this.f19440r - this.f19441s);
            long jPosition = byteBuffer.position();
            this.f19440r = jPosition;
            this.f19441s = jPosition;
            this.f19443u = this.f19431i.limit();
            long jM23763k = AbstractC5137y0.m23763k(this.f19431i);
            this.f19442t = jM23763k;
            this.f19440r += jM23763k;
            this.f19441s += jM23763k;
            this.f19443u += jM23763k;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: A */
        public int mo23192A() {
            return AbstractC5106j.m23183c(m23243R());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: B */
        public long mo23193B() {
            return AbstractC5106j.m23184d(m23244S());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: C */
        public String mo23194C() throws C5065C {
            int iM23243R = m23243R();
            if (iM23243R > 0) {
                long j7 = iM23243R;
                long j8 = this.f19443u;
                long j9 = this.f19440r;
                if (j7 <= j8 - j9) {
                    byte[] bArr = new byte[iM23243R];
                    AbstractC5137y0.m23768p(j9, bArr, 0L, j7);
                    String str = new String(bArr, AbstractC5063B.f19294b);
                    this.f19440r += j7;
                    return str;
                }
            }
            if (iM23243R > 0 && iM23243R <= m23236V()) {
                byte[] bArr2 = new byte[iM23243R];
                m23234O(bArr2, 0, iM23243R);
                return new String(bArr2, AbstractC5063B.f19294b);
            }
            if (iM23243R == 0) {
                return "";
            }
            if (iM23243R < 0) {
                throw C5065C.m22896g();
            }
            throw C5065C.m22900m();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: D */
        public String mo23195D() throws C5065C {
            int iM23243R = m23243R();
            if (iM23243R > 0) {
                long j7 = iM23243R;
                long j8 = this.f19443u;
                long j9 = this.f19440r;
                if (j7 <= j8 - j9) {
                    String strM23815g = AbstractC5139z0.m23815g(this.f19431i, (int) (j9 - this.f19441s), iM23243R);
                    this.f19440r += j7;
                    return strM23815g;
                }
            }
            if (iM23243R >= 0 && iM23243R <= m23236V()) {
                byte[] bArr = new byte[iM23243R];
                m23234O(bArr, 0, iM23243R);
                return AbstractC5139z0.m23816h(bArr, 0, iM23243R);
            }
            if (iM23243R == 0) {
                return "";
            }
            if (iM23243R <= 0) {
                throw C5065C.m22896g();
            }
            throw C5065C.m22900m();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: E */
        public int mo23196E() throws C5065C {
            if (mo23206f()) {
                this.f19437o = 0;
                return 0;
            }
            int iM23243R = m23243R();
            this.f19437o = iM23243R;
            if (AbstractC5062A0.m22832a(iM23243R) != 0) {
                return this.f19437o;
            }
            throw C5065C.m22892c();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: F */
        public int mo23197F() {
            return m23243R();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: G */
        public long mo23198G() {
            return m23244S();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: J */
        public boolean mo23201J(int i7) throws C5065C {
            int iM22833b = AbstractC5062A0.m22833b(i7);
            if (iM22833b == 0) {
                m23237X();
                return true;
            }
            if (iM22833b == 1) {
                m23246W(8);
                return true;
            }
            if (iM22833b == 2) {
                m23246W(m23243R());
                return true;
            }
            if (iM22833b == 3) {
                m23202K();
                mo23203a(AbstractC5062A0.m22834c(AbstractC5062A0.m22832a(i7), 4));
                return true;
            }
            if (iM22833b == 4) {
                return false;
            }
            if (iM22833b != 5) {
                throw C5065C.m22894e();
            }
            m23246W(4);
            return true;
        }

        /* JADX INFO: renamed from: N */
        public byte m23240N() throws C5065C {
            if (m23232L() == 0) {
                m23233M();
            }
            long j7 = this.f19440r;
            this.f19440r = 1 + j7;
            return AbstractC5137y0.m23775w(j7);
        }

        /* JADX INFO: renamed from: P */
        public int m23241P() {
            if (m23232L() < 4) {
                return (m23240N() & 255) | ((m23240N() & 255) << 8) | ((m23240N() & 255) << 16) | ((m23240N() & 255) << 24);
            }
            long j7 = this.f19440r;
            this.f19440r = 4 + j7;
            return ((AbstractC5137y0.m23775w(j7 + 3) & 255) << 24) | (AbstractC5137y0.m23775w(j7) & 255) | ((AbstractC5137y0.m23775w(1 + j7) & 255) << 8) | ((AbstractC5137y0.m23775w(2 + j7) & 255) << 16);
        }

        /* JADX INFO: renamed from: Q */
        public long m23242Q() throws C5065C {
            char c7;
            long jM23240N;
            byte bM23240N;
            if (m23232L() >= 8) {
                long j7 = this.f19440r;
                this.f19440r = 8 + j7;
                c7 = '8';
                jM23240N = (((long) AbstractC5137y0.m23775w(j7)) & 255) | ((((long) AbstractC5137y0.m23775w(1 + j7)) & 255) << 8) | ((((long) AbstractC5137y0.m23775w(2 + j7)) & 255) << 16) | ((((long) AbstractC5137y0.m23775w(3 + j7)) & 255) << 24) | ((((long) AbstractC5137y0.m23775w(4 + j7)) & 255) << 32) | ((((long) AbstractC5137y0.m23775w(5 + j7)) & 255) << 40) | ((((long) AbstractC5137y0.m23775w(6 + j7)) & 255) << 48);
                bM23240N = AbstractC5137y0.m23775w(j7 + 7);
            } else {
                c7 = '8';
                jM23240N = (((long) m23240N()) & 255) | ((((long) m23240N()) & 255) << 8) | ((((long) m23240N()) & 255) << 16) | ((((long) m23240N()) & 255) << 24) | ((((long) m23240N()) & 255) << 32) | ((((long) m23240N()) & 255) << 40) | ((((long) m23240N()) & 255) << 48);
                bM23240N = m23240N();
            }
            return jM23240N | ((((long) bM23240N) & 255) << c7);
        }

        /* JADX INFO: renamed from: R */
        public int m23243R() {
            int i7;
            long j7 = this.f19440r;
            if (this.f19443u != j7) {
                long j8 = j7 + 1;
                byte bM23775w = AbstractC5137y0.m23775w(j7);
                if (bM23775w >= 0) {
                    this.f19440r++;
                    return bM23775w;
                }
                if (this.f19443u - this.f19440r >= 10) {
                    long j9 = 2 + j7;
                    int iM23775w = (AbstractC5137y0.m23775w(j8) << 7) ^ bM23775w;
                    if (iM23775w < 0) {
                        i7 = iM23775w ^ (-128);
                    } else {
                        long j10 = 3 + j7;
                        int iM23775w2 = (AbstractC5137y0.m23775w(j9) << 14) ^ iM23775w;
                        if (iM23775w2 >= 0) {
                            i7 = iM23775w2 ^ 16256;
                        } else {
                            long j11 = 4 + j7;
                            int iM23775w3 = iM23775w2 ^ (AbstractC5137y0.m23775w(j10) << 21);
                            if (iM23775w3 < 0) {
                                i7 = (-2080896) ^ iM23775w3;
                            } else {
                                j10 = 5 + j7;
                                byte bM23775w2 = AbstractC5137y0.m23775w(j11);
                                int i8 = (iM23775w3 ^ (bM23775w2 << 28)) ^ 266354560;
                                if (bM23775w2 < 0) {
                                    j11 = 6 + j7;
                                    if (AbstractC5137y0.m23775w(j10) < 0) {
                                        j10 = 7 + j7;
                                        if (AbstractC5137y0.m23775w(j11) < 0) {
                                            j11 = 8 + j7;
                                            if (AbstractC5137y0.m23775w(j10) < 0) {
                                                j10 = 9 + j7;
                                                if (AbstractC5137y0.m23775w(j11) < 0) {
                                                    long j12 = j7 + 10;
                                                    if (AbstractC5137y0.m23775w(j10) >= 0) {
                                                        i7 = i8;
                                                        j9 = j12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i8;
                                }
                                i7 = i8;
                            }
                            j9 = j11;
                        }
                        j9 = j10;
                    }
                    this.f19440r = j9;
                    return i7;
                }
            }
            return (int) m23245T();
        }

        /* JADX INFO: renamed from: S */
        public long m23244S() {
            long j7;
            long j8;
            long j9;
            long j10 = this.f19440r;
            if (this.f19443u != j10) {
                long j11 = j10 + 1;
                byte bM23775w = AbstractC5137y0.m23775w(j10);
                if (bM23775w >= 0) {
                    this.f19440r++;
                    return bM23775w;
                }
                if (this.f19443u - this.f19440r >= 10) {
                    long j12 = 2 + j10;
                    int iM23775w = (AbstractC5137y0.m23775w(j11) << 7) ^ bM23775w;
                    if (iM23775w < 0) {
                        j7 = iM23775w ^ (-128);
                    } else {
                        long j13 = 3 + j10;
                        int iM23775w2 = (AbstractC5137y0.m23775w(j12) << 14) ^ iM23775w;
                        if (iM23775w2 >= 0) {
                            j7 = iM23775w2 ^ 16256;
                            j12 = j13;
                        } else {
                            long j14 = 4 + j10;
                            int iM23775w3 = iM23775w2 ^ (AbstractC5137y0.m23775w(j13) << 21);
                            if (iM23775w3 < 0) {
                                j7 = (-2080896) ^ iM23775w3;
                                j12 = j14;
                            } else {
                                long j15 = 5 + j10;
                                long jM23775w = (((long) AbstractC5137y0.m23775w(j14)) << 28) ^ ((long) iM23775w3);
                                if (jM23775w >= 0) {
                                    j9 = 266354560;
                                } else {
                                    long j16 = 6 + j10;
                                    long jM23775w2 = jM23775w ^ (((long) AbstractC5137y0.m23775w(j15)) << 35);
                                    if (jM23775w2 < 0) {
                                        j8 = -34093383808L;
                                    } else {
                                        j15 = 7 + j10;
                                        jM23775w = jM23775w2 ^ (((long) AbstractC5137y0.m23775w(j16)) << 42);
                                        if (jM23775w >= 0) {
                                            j9 = 4363953127296L;
                                        } else {
                                            j16 = 8 + j10;
                                            jM23775w2 = jM23775w ^ (((long) AbstractC5137y0.m23775w(j15)) << 49);
                                            if (jM23775w2 < 0) {
                                                j8 = -558586000294016L;
                                            } else {
                                                j15 = 9 + j10;
                                                long jM23775w3 = (jM23775w2 ^ (((long) AbstractC5137y0.m23775w(j16)) << 56)) ^ 71499008037633920L;
                                                if (jM23775w3 < 0) {
                                                    long j17 = j10 + 10;
                                                    if (AbstractC5137y0.m23775w(j15) >= 0) {
                                                        j12 = j17;
                                                        j7 = jM23775w3;
                                                    }
                                                } else {
                                                    j7 = jM23775w3;
                                                    j12 = j15;
                                                }
                                            }
                                        }
                                    }
                                    j7 = j8 ^ jM23775w2;
                                    j12 = j16;
                                }
                                j7 = j9 ^ jM23775w;
                                j12 = j15;
                            }
                        }
                    }
                    this.f19440r = j12;
                    return j7;
                }
            }
            return m23245T();
        }

        /* JADX INFO: renamed from: T */
        long m23245T() throws C5065C {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                byte bM23240N = m23240N();
                j7 |= ((long) (bM23240N & 127)) << i7;
                if ((bM23240N & 128) == 0) {
                    return j7;
                }
            }
            throw C5065C.m22895f();
        }

        /* JADX INFO: renamed from: W */
        public void m23246W(int i7) throws C5065C {
            if (i7 < 0 || i7 > (((long) (this.f19434l - this.f19438p)) - this.f19440r) + this.f19441s) {
                if (i7 >= 0) {
                    throw C5065C.m22900m();
                }
                throw C5065C.m22896g();
            }
            while (i7 > 0) {
                if (m23232L() == 0) {
                    m23233M();
                }
                int iMin = Math.min(i7, (int) m23232L());
                i7 -= iMin;
                this.f19440r += (long) iMin;
            }
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: a */
        public void mo23203a(int i7) throws C5065C {
            if (this.f19437o != i7) {
                throw C5065C.m22891b();
            }
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: e */
        public int mo23205e() {
            return (int) ((((long) (this.f19438p - this.f19439q)) + this.f19440r) - this.f19441s);
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: f */
        public boolean mo23206f() {
            return (((long) this.f19438p) + this.f19440r) - this.f19441s == ((long) this.f19434l);
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: n */
        public void mo23207n(int i7) {
            this.f19436n = i7;
            m23235U();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: o */
        public int mo23208o(int i7) throws C5065C {
            if (i7 < 0) {
                throw C5065C.m22896g();
            }
            int iMo23205e = i7 + mo23205e();
            int i8 = this.f19436n;
            if (iMo23205e > i8) {
                throw C5065C.m22900m();
            }
            this.f19436n = iMo23205e;
            m23235U();
            return i8;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: p */
        public boolean mo23209p() {
            return m23244S() != 0;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: q */
        public AbstractC5104i mo23210q() throws C5065C {
            int iM23243R = m23243R();
            if (iM23243R > 0) {
                long j7 = iM23243R;
                long j8 = this.f19443u;
                long j9 = this.f19440r;
                if (j7 <= j8 - j9) {
                    if (this.f19432j && this.f19433k) {
                        int i7 = (int) (j9 - this.f19442t);
                        AbstractC5104i abstractC5104iM23152Z = AbstractC5104i.m23152Z(m23238Y(i7, iM23243R + i7));
                        this.f19440r += j7;
                        return abstractC5104iM23152Z;
                    }
                    byte[] bArr = new byte[iM23243R];
                    AbstractC5137y0.m23768p(j9, bArr, 0L, j7);
                    this.f19440r += j7;
                    return AbstractC5104i.m23154a0(bArr);
                }
            }
            if (iM23243R <= 0 || iM23243R > m23236V()) {
                if (iM23243R == 0) {
                    return AbstractC5104i.f19401b;
                }
                if (iM23243R < 0) {
                    throw C5065C.m22896g();
                }
                throw C5065C.m22900m();
            }
            if (!this.f19432j || !this.f19433k) {
                byte[] bArr2 = new byte[iM23243R];
                m23234O(bArr2, 0, iM23243R);
                return AbstractC5104i.m23154a0(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (iM23243R > 0) {
                if (m23232L() == 0) {
                    m23233M();
                }
                int iMin = Math.min(iM23243R, (int) m23232L());
                int i8 = (int) (this.f19440r - this.f19442t);
                arrayList.add(AbstractC5104i.m23152Z(m23238Y(i8, i8 + iMin)));
                iM23243R -= iMin;
                this.f19440r += (long) iMin;
            }
            return AbstractC5104i.m23159n(arrayList);
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: r */
        public double mo23211r() {
            return Double.longBitsToDouble(m23242Q());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: s */
        public int mo23212s() {
            return m23243R();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: t */
        public int mo23213t() {
            return m23241P();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: u */
        public long mo23214u() {
            return m23242Q();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: v */
        public float mo23215v() {
            return Float.intBitsToFloat(m23241P());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: w */
        public int mo23216w() {
            return m23243R();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: x */
        public long mo23217x() {
            return m23244S();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: y */
        public int mo23218y() {
            return m23241P();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: z */
        public long mo23219z() {
            return m23242Q();
        }

        private c(Iterable iterable, int i7, boolean z7) {
            super();
            this.f19436n = C3553a.e.API_PRIORITY_OTHER;
            this.f19434l = i7;
            this.f19429g = iterable;
            this.f19430h = iterable.iterator();
            this.f19432j = z7;
            this.f19438p = 0;
            this.f19439q = 0;
            if (i7 != 0) {
                m23239Z();
                return;
            }
            this.f19431i = AbstractC5063B.f19297e;
            this.f19440r = 0L;
            this.f19441s = 0L;
            this.f19443u = 0L;
            this.f19442t = 0L;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$d */
    private static final class d extends AbstractC5106j {

        /* JADX INFO: renamed from: g */
        private final InputStream f19444g;

        /* JADX INFO: renamed from: h */
        private final byte[] f19445h;

        /* JADX INFO: renamed from: i */
        private int f19446i;

        /* JADX INFO: renamed from: j */
        private int f19447j;

        /* JADX INFO: renamed from: k */
        private int f19448k;

        /* JADX INFO: renamed from: l */
        private int f19449l;

        /* JADX INFO: renamed from: m */
        private int f19450m;

        /* JADX INFO: renamed from: n */
        private int f19451n;

        /* JADX INFO: renamed from: L */
        private static int m23247L(InputStream inputStream) throws C5065C {
            try {
                return inputStream.available();
            } catch (C5065C e7) {
                e7.m22902j();
                throw e7;
            }
        }

        /* JADX INFO: renamed from: M */
        private static int m23248M(InputStream inputStream, byte[] bArr, int i7, int i8) throws C5065C {
            try {
                return inputStream.read(bArr, i7, i8);
            } catch (C5065C e7) {
                e7.m22902j();
                throw e7;
            }
        }

        /* JADX INFO: renamed from: N */
        private AbstractC5104i m23249N(int i7) throws IOException {
            byte[] bArrM23251Q = m23251Q(i7);
            if (bArrM23251Q != null) {
                return AbstractC5104i.m23160p(bArrM23251Q);
            }
            int i8 = this.f19448k;
            int i9 = this.f19446i;
            int length = i9 - i8;
            this.f19450m += i9;
            this.f19448k = 0;
            this.f19446i = 0;
            List<byte[]> listM23252R = m23252R(i7 - length);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f19445h, i8, bArr, 0, length);
            for (byte[] bArr2 : listM23252R) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC5104i.m23154a0(bArr);
        }

        /* JADX INFO: renamed from: P */
        private byte[] m23250P(int i7, boolean z7) throws IOException {
            byte[] bArrM23251Q = m23251Q(i7);
            if (bArrM23251Q != null) {
                return z7 ? (byte[]) bArrM23251Q.clone() : bArrM23251Q;
            }
            int i8 = this.f19448k;
            int i9 = this.f19446i;
            int length = i9 - i8;
            this.f19450m += i9;
            this.f19448k = 0;
            this.f19446i = 0;
            List<byte[]> listM23252R = m23252R(i7 - length);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f19445h, i8, bArr, 0, length);
            for (byte[] bArr2 : listM23252R) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: Q */
        private byte[] m23251Q(int i7) throws C5065C {
            if (i7 == 0) {
                return AbstractC5063B.f19296d;
            }
            if (i7 < 0) {
                throw C5065C.m22896g();
            }
            int i8 = this.f19450m;
            int i9 = this.f19448k;
            int i10 = i8 + i9 + i7;
            if (i10 - this.f19417c > 0) {
                throw C5065C.m22899l();
            }
            int i11 = this.f19451n;
            if (i10 > i11) {
                m23267a0((i11 - i8) - i9);
                throw C5065C.m22900m();
            }
            int i12 = this.f19446i - i9;
            int i13 = i7 - i12;
            if (i13 >= 4096 && i13 > m23247L(this.f19444g)) {
                return null;
            }
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f19445h, this.f19448k, bArr, 0, i12);
            this.f19450m += this.f19446i;
            this.f19448k = 0;
            this.f19446i = 0;
            while (i12 < i7) {
                int iM23248M = m23248M(this.f19444g, bArr, i12, i7 - i12);
                if (iM23248M == -1) {
                    throw C5065C.m22900m();
                }
                this.f19450m += iM23248M;
                i12 += iM23248M;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: R */
        private List m23252R(int i7) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i7 > 0) {
                int iMin = Math.min(i7, 4096);
                byte[] bArr = new byte[iMin];
                int i8 = 0;
                while (i8 < iMin) {
                    int i9 = this.f19444g.read(bArr, i8, iMin - i8);
                    if (i9 == -1) {
                        throw C5065C.m22900m();
                    }
                    this.f19450m += i9;
                    i8 += i9;
                }
                i7 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: X */
        private void m23253X() {
            int i7 = this.f19446i + this.f19447j;
            this.f19446i = i7;
            int i8 = this.f19450m + i7;
            int i9 = this.f19451n;
            if (i8 <= i9) {
                this.f19447j = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f19447j = i10;
            this.f19446i = i7 - i10;
        }

        /* JADX INFO: renamed from: Y */
        private void m23254Y(int i7) throws C5065C {
            if (m23260f0(i7)) {
                return;
            }
            if (i7 <= (this.f19417c - this.f19450m) - this.f19448k) {
                throw C5065C.m22900m();
            }
            throw C5065C.m22899l();
        }

        /* JADX INFO: renamed from: Z */
        private static long m23255Z(InputStream inputStream, long j7) throws C5065C {
            try {
                return inputStream.skip(j7);
            } catch (C5065C e7) {
                e7.m22902j();
                throw e7;
            }
        }

        /* JADX INFO: renamed from: b0 */
        private void m23256b0(int i7) throws C5065C {
            if (i7 < 0) {
                throw C5065C.m22896g();
            }
            int i8 = this.f19450m;
            int i9 = this.f19448k;
            int i10 = i8 + i9 + i7;
            int i11 = this.f19451n;
            if (i10 > i11) {
                m23267a0((i11 - i8) - i9);
                throw C5065C.m22900m();
            }
            this.f19450m = i8 + i9;
            int i12 = this.f19446i - i9;
            this.f19446i = 0;
            this.f19448k = 0;
            while (i12 < i7) {
                try {
                    long j7 = i7 - i12;
                    long jM23255Z = m23255Z(this.f19444g, j7);
                    if (jM23255Z < 0 || jM23255Z > j7) {
                        throw new IllegalStateException(this.f19444g.getClass() + "#skip returned invalid result: " + jM23255Z + "\nThe InputStream implementation is buggy.");
                    }
                    if (jM23255Z == 0) {
                        break;
                    } else {
                        i12 += (int) jM23255Z;
                    }
                } catch (Throwable th) {
                    this.f19450m += i12;
                    m23253X();
                    throw th;
                }
            }
            this.f19450m += i12;
            m23253X();
            if (i12 >= i7) {
                return;
            }
            int i13 = this.f19446i;
            int i14 = i13 - this.f19448k;
            this.f19448k = i13;
            m23254Y(1);
            while (true) {
                int i15 = i7 - i14;
                int i16 = this.f19446i;
                if (i15 <= i16) {
                    this.f19448k = i15;
                    return;
                } else {
                    i14 += i16;
                    this.f19448k = i16;
                    m23254Y(1);
                }
            }
        }

        /* JADX INFO: renamed from: c0 */
        private void m23257c0() throws C5065C {
            if (this.f19446i - this.f19448k >= 10) {
                m23258d0();
            } else {
                m23259e0();
            }
        }

        /* JADX INFO: renamed from: d0 */
        private void m23258d0() throws C5065C {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f19445h;
                int i8 = this.f19448k;
                this.f19448k = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw C5065C.m22895f();
        }

        /* JADX INFO: renamed from: e0 */
        private void m23259e0() throws C5065C {
            for (int i7 = 0; i7 < 10; i7++) {
                if (m23261O() >= 0) {
                    return;
                }
            }
            throw C5065C.m22895f();
        }

        /* JADX INFO: renamed from: f0 */
        private boolean m23260f0(int i7) throws C5065C {
            int i8 = this.f19448k;
            int i9 = i8 + i7;
            int i10 = this.f19446i;
            if (i9 <= i10) {
                throw new IllegalStateException("refillBuffer() called when " + i7 + " bytes were already available in buffer");
            }
            int i11 = this.f19417c;
            int i12 = this.f19450m;
            if (i7 > (i11 - i12) - i8 || i12 + i8 + i7 > this.f19451n) {
                return false;
            }
            if (i8 > 0) {
                if (i10 > i8) {
                    byte[] bArr = this.f19445h;
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f19450m += i8;
                this.f19446i -= i8;
                this.f19448k = 0;
            }
            InputStream inputStream = this.f19444g;
            byte[] bArr2 = this.f19445h;
            int i13 = this.f19446i;
            int iM23248M = m23248M(inputStream, bArr2, i13, Math.min(bArr2.length - i13, (this.f19417c - this.f19450m) - i13));
            if (iM23248M == 0 || iM23248M < -1 || iM23248M > this.f19445h.length) {
                throw new IllegalStateException(this.f19444g.getClass() + "#read(byte[]) returned invalid result: " + iM23248M + "\nThe InputStream implementation is buggy.");
            }
            if (iM23248M <= 0) {
                return false;
            }
            this.f19446i += iM23248M;
            m23253X();
            if (this.f19446i >= i7) {
                return true;
            }
            return m23260f0(i7);
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: A */
        public int mo23192A() {
            return AbstractC5106j.m23183c(m23264U());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: B */
        public long mo23193B() {
            return AbstractC5106j.m23184d(m23265V());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: C */
        public String mo23194C() throws C5065C {
            int iM23264U = m23264U();
            if (iM23264U > 0) {
                int i7 = this.f19446i;
                int i8 = this.f19448k;
                if (iM23264U <= i7 - i8) {
                    String str = new String(this.f19445h, i8, iM23264U, AbstractC5063B.f19294b);
                    this.f19448k += iM23264U;
                    return str;
                }
            }
            if (iM23264U == 0) {
                return "";
            }
            if (iM23264U < 0) {
                throw C5065C.m22896g();
            }
            if (iM23264U > this.f19446i) {
                return new String(m23250P(iM23264U, false), AbstractC5063B.f19294b);
            }
            m23254Y(iM23264U);
            String str2 = new String(this.f19445h, this.f19448k, iM23264U, AbstractC5063B.f19294b);
            this.f19448k += iM23264U;
            return str2;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: D */
        public String mo23195D() throws IOException {
            byte[] bArrM23250P;
            int iM23264U = m23264U();
            int i7 = this.f19448k;
            int i8 = this.f19446i;
            if (iM23264U <= i8 - i7 && iM23264U > 0) {
                bArrM23250P = this.f19445h;
                this.f19448k = i7 + iM23264U;
            } else {
                if (iM23264U == 0) {
                    return "";
                }
                if (iM23264U < 0) {
                    throw C5065C.m22896g();
                }
                i7 = 0;
                if (iM23264U <= i8) {
                    m23254Y(iM23264U);
                    bArrM23250P = this.f19445h;
                    this.f19448k = iM23264U;
                } else {
                    bArrM23250P = m23250P(iM23264U, false);
                }
            }
            return AbstractC5139z0.m23816h(bArrM23250P, i7, iM23264U);
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: E */
        public int mo23196E() throws C5065C {
            if (mo23206f()) {
                this.f19449l = 0;
                return 0;
            }
            int iM23264U = m23264U();
            this.f19449l = iM23264U;
            if (AbstractC5062A0.m22832a(iM23264U) != 0) {
                return this.f19449l;
            }
            throw C5065C.m22892c();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: F */
        public int mo23197F() {
            return m23264U();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: G */
        public long mo23198G() {
            return m23265V();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: J */
        public boolean mo23201J(int i7) throws C5065C {
            int iM22833b = AbstractC5062A0.m22833b(i7);
            if (iM22833b == 0) {
                m23257c0();
                return true;
            }
            if (iM22833b == 1) {
                m23267a0(8);
                return true;
            }
            if (iM22833b == 2) {
                m23267a0(m23264U());
                return true;
            }
            if (iM22833b == 3) {
                m23202K();
                mo23203a(AbstractC5062A0.m22834c(AbstractC5062A0.m22832a(i7), 4));
                return true;
            }
            if (iM22833b == 4) {
                return false;
            }
            if (iM22833b != 5) {
                throw C5065C.m22894e();
            }
            m23267a0(4);
            return true;
        }

        /* JADX INFO: renamed from: O */
        public byte m23261O() throws C5065C {
            if (this.f19448k == this.f19446i) {
                m23254Y(1);
            }
            byte[] bArr = this.f19445h;
            int i7 = this.f19448k;
            this.f19448k = i7 + 1;
            return bArr[i7];
        }

        /* JADX INFO: renamed from: S */
        public int m23262S() throws C5065C {
            int i7 = this.f19448k;
            if (this.f19446i - i7 < 4) {
                m23254Y(4);
                i7 = this.f19448k;
            }
            byte[] bArr = this.f19445h;
            this.f19448k = i7 + 4;
            return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
        }

        /* JADX INFO: renamed from: T */
        public long m23263T() throws C5065C {
            int i7 = this.f19448k;
            if (this.f19446i - i7 < 8) {
                m23254Y(8);
                i7 = this.f19448k;
            }
            byte[] bArr = this.f19445h;
            this.f19448k = i7 + 8;
            return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: U */
        public int m23264U() {
            int i7;
            int i8 = this.f19448k;
            int i9 = this.f19446i;
            if (i9 != i8) {
                byte[] bArr = this.f19445h;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f19448k = i10;
                    return b7;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i8 + 2;
                    int i12 = (bArr[i10] << 7) ^ b7;
                    if (i12 < 0) {
                        i7 = i12 ^ (-128);
                    } else {
                        int i13 = i8 + 3;
                        int i14 = (bArr[i11] << 14) ^ i12;
                        if (i14 >= 0) {
                            i7 = i14 ^ 16256;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                i7 = (-2080896) ^ i16;
                            } else {
                                i13 = i8 + 5;
                                byte b8 = bArr[i15];
                                int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                                if (b8 < 0) {
                                    i15 = i8 + 6;
                                    if (bArr[i13] < 0) {
                                        i13 = i8 + 7;
                                        if (bArr[i15] < 0) {
                                            i15 = i8 + 8;
                                            if (bArr[i13] < 0) {
                                                i13 = i8 + 9;
                                                if (bArr[i15] < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i11 = i18;
                                                        i7 = i17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i17;
                                }
                                i7 = i17;
                            }
                            i11 = i15;
                        }
                        i11 = i13;
                    }
                    this.f19448k = i11;
                    return i7;
                }
            }
            return (int) m23266W();
        }

        /* JADX INFO: renamed from: V */
        public long m23265V() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f19448k;
            int i8 = this.f19446i;
            if (i8 != i7) {
                byte[] bArr = this.f19445h;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f19448k = i9;
                    return b7;
                }
                if (i8 - i9 >= 9) {
                    int i10 = i7 + 2;
                    int i11 = (bArr[i9] << 7) ^ b7;
                    if (i11 < 0) {
                        j7 = i11 ^ (-128);
                    } else {
                        int i12 = i7 + 3;
                        int i13 = (bArr[i10] << 14) ^ i11;
                        if (i13 >= 0) {
                            j7 = i13 ^ 16256;
                            i10 = i12;
                        } else {
                            int i14 = i7 + 4;
                            int i15 = i13 ^ (bArr[i12] << 21);
                            if (i15 < 0) {
                                long j10 = (-2080896) ^ i15;
                                i10 = i14;
                                j7 = j10;
                            } else {
                                long j11 = i15;
                                i10 = i7 + 5;
                                long j12 = j11 ^ (((long) bArr[i14]) << 28);
                                if (j12 >= 0) {
                                    j9 = 266354560;
                                } else {
                                    int i16 = i7 + 6;
                                    long j13 = j12 ^ (((long) bArr[i10]) << 35);
                                    if (j13 < 0) {
                                        j8 = -34093383808L;
                                    } else {
                                        i10 = i7 + 7;
                                        j12 = j13 ^ (((long) bArr[i16]) << 42);
                                        if (j12 >= 0) {
                                            j9 = 4363953127296L;
                                        } else {
                                            i16 = i7 + 8;
                                            j13 = j12 ^ (((long) bArr[i10]) << 49);
                                            if (j13 < 0) {
                                                j8 = -558586000294016L;
                                            } else {
                                                i10 = i7 + 9;
                                                long j14 = (j13 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                                if (j14 < 0) {
                                                    int i17 = i7 + 10;
                                                    if (bArr[i10] >= 0) {
                                                        i10 = i17;
                                                    }
                                                }
                                                j7 = j14;
                                            }
                                        }
                                    }
                                    j7 = j13 ^ j8;
                                    i10 = i16;
                                }
                                j7 = j12 ^ j9;
                            }
                        }
                    }
                    this.f19448k = i10;
                    return j7;
                }
            }
            return m23266W();
        }

        /* JADX INFO: renamed from: W */
        long m23266W() throws C5065C {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                byte bM23261O = m23261O();
                j7 |= ((long) (bM23261O & 127)) << i7;
                if ((bM23261O & 128) == 0) {
                    return j7;
                }
            }
            throw C5065C.m22895f();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: a */
        public void mo23203a(int i7) throws C5065C {
            if (this.f19449l != i7) {
                throw C5065C.m22891b();
            }
        }

        /* JADX INFO: renamed from: a0 */
        public void m23267a0(int i7) throws C5065C {
            int i8 = this.f19446i;
            int i9 = this.f19448k;
            if (i7 > i8 - i9 || i7 < 0) {
                m23256b0(i7);
            } else {
                this.f19448k = i9 + i7;
            }
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: e */
        public int mo23205e() {
            return this.f19450m + this.f19448k;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: f */
        public boolean mo23206f() {
            return this.f19448k == this.f19446i && !m23260f0(1);
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: n */
        public void mo23207n(int i7) {
            this.f19451n = i7;
            m23253X();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: o */
        public int mo23208o(int i7) throws C5065C {
            if (i7 < 0) {
                throw C5065C.m22896g();
            }
            int i8 = i7 + this.f19450m + this.f19448k;
            int i9 = this.f19451n;
            if (i8 > i9) {
                throw C5065C.m22900m();
            }
            this.f19451n = i8;
            m23253X();
            return i9;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: p */
        public boolean mo23209p() {
            return m23265V() != 0;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: q */
        public AbstractC5104i mo23210q() throws C5065C {
            int iM23264U = m23264U();
            int i7 = this.f19446i;
            int i8 = this.f19448k;
            if (iM23264U <= i7 - i8 && iM23264U > 0) {
                AbstractC5104i abstractC5104iM23161q = AbstractC5104i.m23161q(this.f19445h, i8, iM23264U);
                this.f19448k += iM23264U;
                return abstractC5104iM23161q;
            }
            if (iM23264U == 0) {
                return AbstractC5104i.f19401b;
            }
            if (iM23264U >= 0) {
                return m23249N(iM23264U);
            }
            throw C5065C.m22896g();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: r */
        public double mo23211r() {
            return Double.longBitsToDouble(m23263T());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: s */
        public int mo23212s() {
            return m23264U();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: t */
        public int mo23213t() {
            return m23262S();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: u */
        public long mo23214u() {
            return m23263T();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: v */
        public float mo23215v() {
            return Float.intBitsToFloat(m23262S());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: w */
        public int mo23216w() {
            return m23264U();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: x */
        public long mo23217x() {
            return m23265V();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: y */
        public int mo23218y() {
            return m23262S();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: z */
        public long mo23219z() {
            return m23263T();
        }

        private d(InputStream inputStream, int i7) {
            super();
            this.f19451n = C3553a.e.API_PRIORITY_OTHER;
            AbstractC5063B.m22838b(inputStream, "input");
            this.f19444g = inputStream;
            this.f19445h = new byte[i7];
            this.f19446i = 0;
            this.f19448k = 0;
            this.f19450m = 0;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$e */
    private static final class e extends AbstractC5106j {

        /* JADX INFO: renamed from: g */
        private final ByteBuffer f19452g;

        /* JADX INFO: renamed from: h */
        private final boolean f19453h;

        /* JADX INFO: renamed from: i */
        private final long f19454i;

        /* JADX INFO: renamed from: j */
        private long f19455j;

        /* JADX INFO: renamed from: k */
        private long f19456k;

        /* JADX INFO: renamed from: l */
        private long f19457l;

        /* JADX INFO: renamed from: m */
        private int f19458m;

        /* JADX INFO: renamed from: n */
        private int f19459n;

        /* JADX INFO: renamed from: o */
        private boolean f19460o;

        /* JADX INFO: renamed from: p */
        private int f19461p;

        /* JADX INFO: renamed from: L */
        private int m23268L(long j7) {
            return (int) (j7 - this.f19454i);
        }

        /* JADX INFO: renamed from: M */
        static boolean m23269M() {
            return AbstractC5137y0.m23738J();
        }

        /* JADX INFO: renamed from: T */
        private void m23270T() {
            long j7 = this.f19455j + ((long) this.f19458m);
            this.f19455j = j7;
            int i7 = (int) (j7 - this.f19457l);
            int i8 = this.f19461p;
            if (i7 <= i8) {
                this.f19458m = 0;
                return;
            }
            int i9 = i7 - i8;
            this.f19458m = i9;
            this.f19455j = j7 - ((long) i9);
        }

        /* JADX INFO: renamed from: U */
        private int m23271U() {
            return (int) (this.f19455j - this.f19456k);
        }

        /* JADX INFO: renamed from: W */
        private void m23272W() throws C5065C {
            if (m23271U() >= 10) {
                m23273X();
            } else {
                m23274Y();
            }
        }

        /* JADX INFO: renamed from: X */
        private void m23273X() throws C5065C {
            for (int i7 = 0; i7 < 10; i7++) {
                long j7 = this.f19456k;
                this.f19456k = 1 + j7;
                if (AbstractC5137y0.m23775w(j7) >= 0) {
                    return;
                }
            }
            throw C5065C.m22895f();
        }

        /* JADX INFO: renamed from: Y */
        private void m23274Y() throws C5065C {
            for (int i7 = 0; i7 < 10; i7++) {
                if (m23276N() >= 0) {
                    return;
                }
            }
            throw C5065C.m22895f();
        }

        /* JADX INFO: renamed from: Z */
        private ByteBuffer m23275Z(long j7, long j8) {
            int iPosition = this.f19452g.position();
            int iLimit = this.f19452g.limit();
            ByteBuffer byteBuffer = this.f19452g;
            try {
                try {
                    byteBuffer.position(m23268L(j7));
                    byteBuffer.limit(m23268L(j8));
                    ByteBuffer byteBufferSlice = this.f19452g.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException e7) {
                    C5065C c5065cM22900m = C5065C.m22900m();
                    c5065cM22900m.initCause(e7);
                    throw c5065cM22900m;
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: A */
        public int mo23192A() {
            return AbstractC5106j.m23183c(m23279Q());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: B */
        public long mo23193B() {
            return AbstractC5106j.m23184d(m23280R());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: C */
        public String mo23194C() throws C5065C {
            int iM23279Q = m23279Q();
            if (iM23279Q <= 0 || iM23279Q > m23271U()) {
                if (iM23279Q == 0) {
                    return "";
                }
                if (iM23279Q < 0) {
                    throw C5065C.m22896g();
                }
                throw C5065C.m22900m();
            }
            byte[] bArr = new byte[iM23279Q];
            long j7 = iM23279Q;
            AbstractC5137y0.m23768p(this.f19456k, bArr, 0L, j7);
            String str = new String(bArr, AbstractC5063B.f19294b);
            this.f19456k += j7;
            return str;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: D */
        public String mo23195D() throws C5065C {
            int iM23279Q = m23279Q();
            if (iM23279Q > 0 && iM23279Q <= m23271U()) {
                String strM23815g = AbstractC5139z0.m23815g(this.f19452g, m23268L(this.f19456k), iM23279Q);
                this.f19456k += (long) iM23279Q;
                return strM23815g;
            }
            if (iM23279Q == 0) {
                return "";
            }
            if (iM23279Q <= 0) {
                throw C5065C.m22896g();
            }
            throw C5065C.m22900m();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: E */
        public int mo23196E() throws C5065C {
            if (mo23206f()) {
                this.f19459n = 0;
                return 0;
            }
            int iM23279Q = m23279Q();
            this.f19459n = iM23279Q;
            if (AbstractC5062A0.m22832a(iM23279Q) != 0) {
                return this.f19459n;
            }
            throw C5065C.m22892c();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: F */
        public int mo23197F() {
            return m23279Q();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: G */
        public long mo23198G() {
            return m23280R();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: J */
        public boolean mo23201J(int i7) throws C5065C {
            int iM22833b = AbstractC5062A0.m22833b(i7);
            if (iM22833b == 0) {
                m23272W();
                return true;
            }
            if (iM22833b == 1) {
                m23282V(8);
                return true;
            }
            if (iM22833b == 2) {
                m23282V(m23279Q());
                return true;
            }
            if (iM22833b == 3) {
                m23202K();
                mo23203a(AbstractC5062A0.m22834c(AbstractC5062A0.m22832a(i7), 4));
                return true;
            }
            if (iM22833b == 4) {
                return false;
            }
            if (iM22833b != 5) {
                throw C5065C.m22894e();
            }
            m23282V(4);
            return true;
        }

        /* JADX INFO: renamed from: N */
        public byte m23276N() throws C5065C {
            long j7 = this.f19456k;
            if (j7 == this.f19455j) {
                throw C5065C.m22900m();
            }
            this.f19456k = 1 + j7;
            return AbstractC5137y0.m23775w(j7);
        }

        /* JADX INFO: renamed from: O */
        public int m23277O() throws C5065C {
            long j7 = this.f19456k;
            if (this.f19455j - j7 < 4) {
                throw C5065C.m22900m();
            }
            this.f19456k = 4 + j7;
            return ((AbstractC5137y0.m23775w(j7 + 3) & 255) << 24) | (AbstractC5137y0.m23775w(j7) & 255) | ((AbstractC5137y0.m23775w(1 + j7) & 255) << 8) | ((AbstractC5137y0.m23775w(2 + j7) & 255) << 16);
        }

        /* JADX INFO: renamed from: P */
        public long m23278P() throws C5065C {
            long j7 = this.f19456k;
            if (this.f19455j - j7 < 8) {
                throw C5065C.m22900m();
            }
            this.f19456k = 8 + j7;
            return ((((long) AbstractC5137y0.m23775w(j7 + 7)) & 255) << 56) | (((long) AbstractC5137y0.m23775w(j7)) & 255) | ((((long) AbstractC5137y0.m23775w(1 + j7)) & 255) << 8) | ((((long) AbstractC5137y0.m23775w(2 + j7)) & 255) << 16) | ((((long) AbstractC5137y0.m23775w(3 + j7)) & 255) << 24) | ((((long) AbstractC5137y0.m23775w(4 + j7)) & 255) << 32) | ((((long) AbstractC5137y0.m23775w(5 + j7)) & 255) << 40) | ((((long) AbstractC5137y0.m23775w(6 + j7)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.AbstractC5137y0.m23775w(r3) < 0) goto L34;
         */
        /* JADX INFO: renamed from: Q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int m23279Q() {
            int i7;
            long j7 = this.f19456k;
            if (this.f19455j != j7) {
                long j8 = 1 + j7;
                byte bM23775w = AbstractC5137y0.m23775w(j7);
                if (bM23775w >= 0) {
                    this.f19456k = j8;
                    return bM23775w;
                }
                if (this.f19455j - j8 >= 9) {
                    long j9 = 2 + j7;
                    int iM23775w = (AbstractC5137y0.m23775w(j8) << 7) ^ bM23775w;
                    if (iM23775w < 0) {
                        i7 = iM23775w ^ (-128);
                    } else {
                        long j10 = 3 + j7;
                        int iM23775w2 = iM23775w ^ (AbstractC5137y0.m23775w(j9) << 14);
                        if (iM23775w2 >= 0) {
                            i7 = iM23775w2 ^ 16256;
                        } else {
                            j9 = 4 + j7;
                            int iM23775w3 = iM23775w2 ^ (AbstractC5137y0.m23775w(j10) << 21);
                            if (iM23775w3 < 0) {
                                i7 = (-2080896) ^ iM23775w3;
                            } else {
                                j10 = 5 + j7;
                                byte bM23775w2 = AbstractC5137y0.m23775w(j9);
                                int i8 = (iM23775w3 ^ (bM23775w2 << 28)) ^ 266354560;
                                if (bM23775w2 < 0) {
                                    j9 = 6 + j7;
                                    if (AbstractC5137y0.m23775w(j10) < 0) {
                                        j10 = 7 + j7;
                                        if (AbstractC5137y0.m23775w(j9) < 0) {
                                            j9 = 8 + j7;
                                            if (AbstractC5137y0.m23775w(j10) < 0) {
                                                j10 = j7 + 9;
                                                if (AbstractC5137y0.m23775w(j9) < 0) {
                                                    j9 = 10 + j7;
                                                }
                                            }
                                        }
                                    }
                                    i7 = i8;
                                }
                                i7 = i8;
                            }
                        }
                        j9 = j10;
                    }
                    this.f19456k = j9;
                    return i7;
                }
            }
            return (int) m23281S();
        }

        /* JADX INFO: renamed from: R */
        public long m23280R() {
            long j7;
            long j8;
            long j9;
            int i7;
            long j10 = this.f19456k;
            if (this.f19455j != j10) {
                long j11 = 1 + j10;
                byte bM23775w = AbstractC5137y0.m23775w(j10);
                if (bM23775w >= 0) {
                    this.f19456k = j11;
                    return bM23775w;
                }
                if (this.f19455j - j11 >= 9) {
                    long j12 = 2 + j10;
                    int iM23775w = (AbstractC5137y0.m23775w(j11) << 7) ^ bM23775w;
                    if (iM23775w >= 0) {
                        long j13 = 3 + j10;
                        int iM23775w2 = iM23775w ^ (AbstractC5137y0.m23775w(j12) << 14);
                        if (iM23775w2 >= 0) {
                            j7 = iM23775w2 ^ 16256;
                            j12 = j13;
                        } else {
                            j12 = 4 + j10;
                            int iM23775w3 = iM23775w2 ^ (AbstractC5137y0.m23775w(j13) << 21);
                            if (iM23775w3 < 0) {
                                i7 = (-2080896) ^ iM23775w3;
                            } else {
                                long j14 = 5 + j10;
                                long jM23775w = ((long) iM23775w3) ^ (((long) AbstractC5137y0.m23775w(j12)) << 28);
                                if (jM23775w >= 0) {
                                    j9 = 266354560;
                                } else {
                                    long j15 = 6 + j10;
                                    long jM23775w2 = jM23775w ^ (((long) AbstractC5137y0.m23775w(j14)) << 35);
                                    if (jM23775w2 < 0) {
                                        j8 = -34093383808L;
                                    } else {
                                        j14 = 7 + j10;
                                        jM23775w = jM23775w2 ^ (((long) AbstractC5137y0.m23775w(j15)) << 42);
                                        if (jM23775w >= 0) {
                                            j9 = 4363953127296L;
                                        } else {
                                            j15 = 8 + j10;
                                            jM23775w2 = jM23775w ^ (((long) AbstractC5137y0.m23775w(j14)) << 49);
                                            if (jM23775w2 < 0) {
                                                j8 = -558586000294016L;
                                            } else {
                                                long j16 = j10 + 9;
                                                long jM23775w3 = (jM23775w2 ^ (((long) AbstractC5137y0.m23775w(j15)) << 56)) ^ 71499008037633920L;
                                                if (jM23775w3 < 0) {
                                                    long j17 = j10 + 10;
                                                    if (AbstractC5137y0.m23775w(j16) >= 0) {
                                                        j12 = j17;
                                                        j7 = jM23775w3;
                                                    }
                                                } else {
                                                    j7 = jM23775w3;
                                                    j12 = j16;
                                                }
                                            }
                                        }
                                    }
                                    j7 = j8 ^ jM23775w2;
                                    j12 = j15;
                                }
                                j7 = j9 ^ jM23775w;
                                j12 = j14;
                            }
                        }
                        this.f19456k = j12;
                        return j7;
                    }
                    i7 = iM23775w ^ (-128);
                    j7 = i7;
                    this.f19456k = j12;
                    return j7;
                }
            }
            return m23281S();
        }

        /* JADX INFO: renamed from: S */
        long m23281S() throws C5065C {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                byte bM23276N = m23276N();
                j7 |= ((long) (bM23276N & 127)) << i7;
                if ((bM23276N & 128) == 0) {
                    return j7;
                }
            }
            throw C5065C.m22895f();
        }

        /* JADX INFO: renamed from: V */
        public void m23282V(int i7) throws C5065C {
            if (i7 >= 0 && i7 <= m23271U()) {
                this.f19456k += (long) i7;
            } else {
                if (i7 >= 0) {
                    throw C5065C.m22900m();
                }
                throw C5065C.m22896g();
            }
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: a */
        public void mo23203a(int i7) throws C5065C {
            if (this.f19459n != i7) {
                throw C5065C.m22891b();
            }
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: e */
        public int mo23205e() {
            return (int) (this.f19456k - this.f19457l);
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: f */
        public boolean mo23206f() {
            return this.f19456k == this.f19455j;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: n */
        public void mo23207n(int i7) {
            this.f19461p = i7;
            m23270T();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: o */
        public int mo23208o(int i7) throws C5065C {
            if (i7 < 0) {
                throw C5065C.m22896g();
            }
            int iMo23205e = i7 + mo23205e();
            int i8 = this.f19461p;
            if (iMo23205e > i8) {
                throw C5065C.m22900m();
            }
            this.f19461p = iMo23205e;
            m23270T();
            return i8;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: p */
        public boolean mo23209p() {
            return m23280R() != 0;
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: q */
        public AbstractC5104i mo23210q() throws C5065C {
            int iM23279Q = m23279Q();
            if (iM23279Q <= 0 || iM23279Q > m23271U()) {
                if (iM23279Q == 0) {
                    return AbstractC5104i.f19401b;
                }
                if (iM23279Q < 0) {
                    throw C5065C.m22896g();
                }
                throw C5065C.m22900m();
            }
            if (this.f19453h && this.f19460o) {
                long j7 = this.f19456k;
                long j8 = iM23279Q;
                ByteBuffer byteBufferM23275Z = m23275Z(j7, j7 + j8);
                this.f19456k += j8;
                return AbstractC5104i.m23152Z(byteBufferM23275Z);
            }
            byte[] bArr = new byte[iM23279Q];
            long j9 = iM23279Q;
            AbstractC5137y0.m23768p(this.f19456k, bArr, 0L, j9);
            this.f19456k += j9;
            return AbstractC5104i.m23154a0(bArr);
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: r */
        public double mo23211r() {
            return Double.longBitsToDouble(m23278P());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: s */
        public int mo23212s() {
            return m23279Q();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: t */
        public int mo23213t() {
            return m23277O();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: u */
        public long mo23214u() {
            return m23278P();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: v */
        public float mo23215v() {
            return Float.intBitsToFloat(m23277O());
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: w */
        public int mo23216w() {
            return m23279Q();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: x */
        public long mo23217x() {
            return m23280R();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: y */
        public int mo23218y() {
            return m23277O();
        }

        @Override // com.google.protobuf.AbstractC5106j
        /* JADX INFO: renamed from: z */
        public long mo23219z() {
            return m23278P();
        }

        private e(ByteBuffer byteBuffer, boolean z7) {
            super();
            this.f19461p = C3553a.e.API_PRIORITY_OTHER;
            this.f19452g = byteBuffer;
            long jM23763k = AbstractC5137y0.m23763k(byteBuffer);
            this.f19454i = jM23763k;
            this.f19455j = ((long) byteBuffer.limit()) + jM23763k;
            long jPosition = jM23763k + ((long) byteBuffer.position());
            this.f19456k = jPosition;
            this.f19457l = jPosition;
            this.f19453h = z7;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m23183c(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    /* JADX INFO: renamed from: d */
    public static long m23184d(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC5106j m23185g(InputStream inputStream) {
        return m23186h(inputStream, 4096);
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC5106j m23186h(InputStream inputStream, int i7) {
        if (i7 > 0) {
            return inputStream == null ? m23189k(AbstractC5063B.f19296d) : new d(inputStream, i7);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* JADX INFO: renamed from: i */
    static AbstractC5106j m23187i(Iterable iterable, boolean z7) {
        Iterator it = iterable.iterator();
        int i7 = 0;
        int iRemaining = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i7 |= 1;
            } else {
                i7 = byteBuffer.isDirect() ? i7 | 2 : i7 | 4;
            }
        }
        return i7 == 2 ? new c(iterable, iRemaining, z7) : m23185g(new C5066D(iterable));
    }

    /* JADX INFO: renamed from: j */
    static AbstractC5106j m23188j(ByteBuffer byteBuffer, boolean z7) {
        if (byteBuffer.hasArray()) {
            return m23191m(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z7);
        }
        if (byteBuffer.isDirect() && e.m23269M()) {
            return new e(byteBuffer, z7);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return m23191m(bArr, 0, iRemaining, true);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC5106j m23189k(byte[] bArr) {
        return m23190l(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC5106j m23190l(byte[] bArr, int i7, int i8) {
        return m23191m(bArr, i7, i8, false);
    }

    /* JADX INFO: renamed from: m */
    static AbstractC5106j m23191m(byte[] bArr, int i7, int i8, boolean z7) {
        b bVar = new b(bArr, i7, i8, z7);
        try {
            bVar.mo23208o(i8);
            return bVar;
        } catch (C5065C e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo23192A();

    /* JADX INFO: renamed from: B */
    public abstract long mo23193B();

    /* JADX INFO: renamed from: C */
    public abstract String mo23194C();

    /* JADX INFO: renamed from: D */
    public abstract String mo23195D();

    /* JADX INFO: renamed from: E */
    public abstract int mo23196E();

    /* JADX INFO: renamed from: F */
    public abstract int mo23197F();

    /* JADX INFO: renamed from: G */
    public abstract long mo23198G();

    /* JADX INFO: renamed from: H */
    public final int m23199H(int i7) {
        if (i7 >= 0) {
            int i8 = this.f19416b;
            this.f19416b = i7;
            return i8;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i7);
    }

    /* JADX INFO: renamed from: I */
    public final int m23200I(int i7) {
        if (i7 >= 0) {
            int i8 = this.f19417c;
            this.f19417c = i7;
            return i8;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i7);
    }

    /* JADX INFO: renamed from: J */
    public abstract boolean mo23201J(int i7);

    /* JADX INFO: renamed from: K */
    public void m23202K() throws C5065C {
        boolean zMo23201J;
        do {
            int iMo23196E = mo23196E();
            if (iMo23196E == 0) {
                return;
            }
            m23204b();
            this.f19415a++;
            zMo23201J = mo23201J(iMo23196E);
            this.f19415a--;
        } while (zMo23201J);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo23203a(int i7);

    /* JADX INFO: renamed from: b */
    public void m23204b() throws C5065C {
        if (this.f19415a >= this.f19416b) {
            throw C5065C.m22898i();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo23205e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo23206f();

    /* JADX INFO: renamed from: n */
    public abstract void mo23207n(int i7);

    /* JADX INFO: renamed from: o */
    public abstract int mo23208o(int i7);

    /* JADX INFO: renamed from: p */
    public abstract boolean mo23209p();

    /* JADX INFO: renamed from: q */
    public abstract AbstractC5104i mo23210q();

    /* JADX INFO: renamed from: r */
    public abstract double mo23211r();

    /* JADX INFO: renamed from: s */
    public abstract int mo23212s();

    /* JADX INFO: renamed from: t */
    public abstract int mo23213t();

    /* JADX INFO: renamed from: u */
    public abstract long mo23214u();

    /* JADX INFO: renamed from: v */
    public abstract float mo23215v();

    /* JADX INFO: renamed from: w */
    public abstract int mo23216w();

    /* JADX INFO: renamed from: x */
    public abstract long mo23217x();

    /* JADX INFO: renamed from: y */
    public abstract int mo23218y();

    /* JADX INFO: renamed from: z */
    public abstract long mo23219z();

    private AbstractC5106j() {
        this.f19416b = f19414f;
        this.f19417c = C3553a.e.API_PRIORITY_OTHER;
        this.f19419e = false;
    }
}

package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.C3553a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2514g {

    /* JADX INFO: renamed from: f */
    private static volatile int f9521f = 100;

    /* JADX INFO: renamed from: a */
    int f9522a;

    /* JADX INFO: renamed from: b */
    int f9523b;

    /* JADX INFO: renamed from: c */
    int f9524c;

    /* JADX INFO: renamed from: d */
    C2516h f9525d;

    /* JADX INFO: renamed from: e */
    private boolean f9526e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$b */
    private static final class b extends AbstractC2514g {

        /* JADX INFO: renamed from: g */
        private final byte[] f9527g;

        /* JADX INFO: renamed from: h */
        private final boolean f9528h;

        /* JADX INFO: renamed from: i */
        private int f9529i;

        /* JADX INFO: renamed from: j */
        private int f9530j;

        /* JADX INFO: renamed from: k */
        private int f9531k;

        /* JADX INFO: renamed from: l */
        private int f9532l;

        /* JADX INFO: renamed from: m */
        private int f9533m;

        /* JADX INFO: renamed from: n */
        private boolean f9534n;

        /* JADX INFO: renamed from: o */
        private int f9535o;

        /* JADX INFO: renamed from: O */
        private void m11215O() {
            int i7 = this.f9529i + this.f9530j;
            this.f9529i = i7;
            int i8 = i7 - this.f9532l;
            int i9 = this.f9535o;
            if (i8 <= i9) {
                this.f9530j = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f9530j = i10;
            this.f9529i = i7 - i10;
        }

        /* JADX INFO: renamed from: Q */
        private void m11216Q() throws C2535v {
            if (this.f9529i - this.f9531k >= 10) {
                m11217R();
            } else {
                m11218S();
            }
        }

        /* JADX INFO: renamed from: R */
        private void m11217R() throws C2535v {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f9527g;
                int i8 = this.f9531k;
                this.f9531k = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw C2535v.m11649f();
        }

        /* JADX INFO: renamed from: S */
        private void m11218S() throws C2535v {
            for (int i7 = 0; i7 < 10; i7++) {
                if (m11219H() >= 0) {
                    return;
                }
            }
            throw C2535v.m11649f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: A */
        public String mo11189A() throws C2535v {
            int iM11223L = m11223L();
            if (iM11223L > 0) {
                int i7 = this.f9529i;
                int i8 = this.f9531k;
                if (iM11223L <= i7 - i8) {
                    String str = new String(this.f9527g, i8, iM11223L, AbstractC2534u.f9724b);
                    this.f9531k += iM11223L;
                    return str;
                }
            }
            if (iM11223L == 0) {
                return "";
            }
            if (iM11223L < 0) {
                throw C2535v.m11650g();
            }
            throw C2535v.m11654m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: B */
        public String mo11190B() throws C2535v {
            int iM11223L = m11223L();
            if (iM11223L > 0) {
                int i7 = this.f9529i;
                int i8 = this.f9531k;
                if (iM11223L <= i7 - i8) {
                    String strM11523a = AbstractC2521j0.m11523a(this.f9527g, i8, iM11223L);
                    this.f9531k += iM11223L;
                    return strM11523a;
                }
            }
            if (iM11223L == 0) {
                return "";
            }
            if (iM11223L <= 0) {
                throw C2535v.m11650g();
            }
            throw C2535v.m11654m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: C */
        public int mo11191C() throws C2535v {
            if (mo11199f()) {
                this.f9533m = 0;
                return 0;
            }
            int iM11223L = m11223L();
            this.f9533m = iM11223L;
            if (AbstractC2523k0.m11548a(iM11223L) != 0) {
                return this.f9533m;
            }
            throw C2535v.m11646c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: D */
        public int mo11192D() {
            return m11223L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: E */
        public long mo11193E() {
            return m11224M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: F */
        public boolean mo11194F(int i7) throws C2535v {
            int iM11549b = AbstractC2523k0.m11549b(i7);
            if (iM11549b == 0) {
                m11216Q();
                return true;
            }
            if (iM11549b == 1) {
                m11226P(8);
                return true;
            }
            if (iM11549b == 2) {
                m11226P(m11223L());
                return true;
            }
            if (iM11549b == 3) {
                m11195G();
                mo11196a(AbstractC2523k0.m11550c(AbstractC2523k0.m11548a(i7), 4));
                return true;
            }
            if (iM11549b == 4) {
                return false;
            }
            if (iM11549b != 5) {
                throw C2535v.m11648e();
            }
            m11226P(4);
            return true;
        }

        /* JADX INFO: renamed from: H */
        public byte m11219H() throws C2535v {
            int i7 = this.f9531k;
            if (i7 == this.f9529i) {
                throw C2535v.m11654m();
            }
            byte[] bArr = this.f9527g;
            this.f9531k = i7 + 1;
            return bArr[i7];
        }

        /* JADX INFO: renamed from: I */
        public byte[] m11220I(int i7) throws C2535v {
            if (i7 > 0) {
                int i8 = this.f9529i;
                int i9 = this.f9531k;
                if (i7 <= i8 - i9) {
                    int i10 = i7 + i9;
                    this.f9531k = i10;
                    return Arrays.copyOfRange(this.f9527g, i9, i10);
                }
            }
            if (i7 > 0) {
                throw C2535v.m11654m();
            }
            if (i7 == 0) {
                return AbstractC2534u.f9726d;
            }
            throw C2535v.m11650g();
        }

        /* JADX INFO: renamed from: J */
        public int m11221J() throws C2535v {
            int i7 = this.f9531k;
            if (this.f9529i - i7 < 4) {
                throw C2535v.m11654m();
            }
            byte[] bArr = this.f9527g;
            this.f9531k = i7 + 4;
            return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
        }

        /* JADX INFO: renamed from: K */
        public long m11222K() throws C2535v {
            int i7 = this.f9531k;
            if (this.f9529i - i7 < 8) {
                throw C2535v.m11654m();
            }
            byte[] bArr = this.f9527g;
            this.f9531k = i7 + 8;
            return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: L */
        public int m11223L() {
            int i7;
            int i8 = this.f9531k;
            int i9 = this.f9529i;
            if (i9 != i8) {
                byte[] bArr = this.f9527g;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f9531k = i10;
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
                    this.f9531k = i11;
                    return i7;
                }
            }
            return (int) m11225N();
        }

        /* JADX INFO: renamed from: M */
        public long m11224M() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f9531k;
            int i8 = this.f9529i;
            if (i8 != i7) {
                byte[] bArr = this.f9527g;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f9531k = i9;
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
                    this.f9531k = i10;
                    return j7;
                }
            }
            return m11225N();
        }

        /* JADX INFO: renamed from: N */
        long m11225N() throws C2535v {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                byte bM11219H = m11219H();
                j7 |= ((long) (bM11219H & 127)) << i7;
                if ((bM11219H & 128) == 0) {
                    return j7;
                }
            }
            throw C2535v.m11649f();
        }

        /* JADX INFO: renamed from: P */
        public void m11226P(int i7) throws C2535v {
            if (i7 >= 0) {
                int i8 = this.f9529i;
                int i9 = this.f9531k;
                if (i7 <= i8 - i9) {
                    this.f9531k = i9 + i7;
                    return;
                }
            }
            if (i7 >= 0) {
                throw C2535v.m11654m();
            }
            throw C2535v.m11650g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: a */
        public void mo11196a(int i7) throws C2535v {
            if (this.f9533m != i7) {
                throw C2535v.m11645b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: e */
        public int mo11198e() {
            return this.f9531k - this.f9532l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: f */
        public boolean mo11199f() {
            return this.f9531k == this.f9529i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: l */
        public void mo11200l(int i7) {
            this.f9535o = i7;
            m11215O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: m */
        public int mo11201m(int i7) throws C2535v {
            if (i7 < 0) {
                throw C2535v.m11650g();
            }
            int iMo11198e = i7 + mo11198e();
            if (iMo11198e < 0) {
                throw C2535v.m11651h();
            }
            int i8 = this.f9535o;
            if (iMo11198e > i8) {
                throw C2535v.m11654m();
            }
            this.f9535o = iMo11198e;
            m11215O();
            return i8;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: n */
        public boolean mo11202n() {
            return m11224M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: o */
        public AbstractC2512f mo11203o() {
            int iM11223L = m11223L();
            if (iM11223L > 0) {
                int i7 = this.f9529i;
                int i8 = this.f9531k;
                if (iM11223L <= i7 - i8) {
                    AbstractC2512f abstractC2512fM11139C = (this.f9528h && this.f9534n) ? AbstractC2512f.m11139C(this.f9527g, i8, iM11223L) : AbstractC2512f.m11144k(this.f9527g, i8, iM11223L);
                    this.f9531k += iM11223L;
                    return abstractC2512fM11139C;
                }
            }
            return iM11223L == 0 ? AbstractC2512f.f9510b : AbstractC2512f.m11138B(m11220I(iM11223L));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: p */
        public double mo11204p() {
            return Double.longBitsToDouble(m11222K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: q */
        public int mo11205q() {
            return m11223L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: r */
        public int mo11206r() {
            return m11221J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: s */
        public long mo11207s() {
            return m11222K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: t */
        public float mo11208t() {
            return Float.intBitsToFloat(m11221J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: u */
        public int mo11209u() {
            return m11223L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: v */
        public long mo11210v() {
            return m11224M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: w */
        public int mo11211w() {
            return m11221J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: x */
        public long mo11212x() {
            return m11222K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: y */
        public int mo11213y() {
            return AbstractC2514g.m11182c(m11223L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: z */
        public long mo11214z() {
            return AbstractC2514g.m11183d(m11224M());
        }

        private b(byte[] bArr, int i7, int i8, boolean z7) {
            super();
            this.f9535o = C3553a.e.API_PRIORITY_OTHER;
            this.f9527g = bArr;
            this.f9529i = i8 + i7;
            this.f9531k = i7;
            this.f9532l = i7;
            this.f9528h = z7;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$c */
    private static final class c extends AbstractC2514g {

        /* JADX INFO: renamed from: g */
        private final InputStream f9536g;

        /* JADX INFO: renamed from: h */
        private final byte[] f9537h;

        /* JADX INFO: renamed from: i */
        private int f9538i;

        /* JADX INFO: renamed from: j */
        private int f9539j;

        /* JADX INFO: renamed from: k */
        private int f9540k;

        /* JADX INFO: renamed from: l */
        private int f9541l;

        /* JADX INFO: renamed from: m */
        private int f9542m;

        /* JADX INFO: renamed from: n */
        private int f9543n;

        /* JADX INFO: renamed from: H */
        private static int m11227H(InputStream inputStream) throws C2535v {
            try {
                return inputStream.available();
            } catch (C2535v e7) {
                e7.m11656j();
                throw e7;
            }
        }

        /* JADX INFO: renamed from: I */
        private static int m11228I(InputStream inputStream, byte[] bArr, int i7, int i8) throws C2535v {
            try {
                return inputStream.read(bArr, i7, i8);
            } catch (C2535v e7) {
                e7.m11656j();
                throw e7;
            }
        }

        /* JADX INFO: renamed from: J */
        private AbstractC2512f m11229J(int i7) throws IOException {
            byte[] bArrM11231M = m11231M(i7);
            if (bArrM11231M != null) {
                return AbstractC2512f.m11143j(bArrM11231M);
            }
            int i8 = this.f9540k;
            int i9 = this.f9538i;
            int length = i9 - i8;
            this.f9542m += i9;
            this.f9540k = 0;
            this.f9538i = 0;
            List<byte[]> listM11232N = m11232N(i7 - length);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f9537h, i8, bArr, 0, length);
            for (byte[] bArr2 : listM11232N) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC2512f.m11138B(bArr);
        }

        /* JADX INFO: renamed from: L */
        private byte[] m11230L(int i7, boolean z7) throws IOException {
            byte[] bArrM11231M = m11231M(i7);
            if (bArrM11231M != null) {
                return z7 ? (byte[]) bArrM11231M.clone() : bArrM11231M;
            }
            int i8 = this.f9540k;
            int i9 = this.f9538i;
            int length = i9 - i8;
            this.f9542m += i9;
            this.f9540k = 0;
            this.f9538i = 0;
            List<byte[]> listM11232N = m11232N(i7 - length);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f9537h, i8, bArr, 0, length);
            for (byte[] bArr2 : listM11232N) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: M */
        private byte[] m11231M(int i7) throws C2535v {
            if (i7 == 0) {
                return AbstractC2534u.f9726d;
            }
            if (i7 < 0) {
                throw C2535v.m11650g();
            }
            int i8 = this.f9542m;
            int i9 = this.f9540k;
            int i10 = i8 + i9 + i7;
            if (i10 - this.f9524c > 0) {
                throw C2535v.m11653l();
            }
            int i11 = this.f9543n;
            if (i10 > i11) {
                m11247W((i11 - i8) - i9);
                throw C2535v.m11654m();
            }
            int i12 = this.f9538i - i9;
            int i13 = i7 - i12;
            if (i13 >= 4096 && i13 > m11227H(this.f9536g)) {
                return null;
            }
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f9537h, this.f9540k, bArr, 0, i12);
            this.f9542m += this.f9538i;
            this.f9540k = 0;
            this.f9538i = 0;
            while (i12 < i7) {
                int iM11228I = m11228I(this.f9536g, bArr, i12, i7 - i12);
                if (iM11228I == -1) {
                    throw C2535v.m11654m();
                }
                this.f9542m += iM11228I;
                i12 += iM11228I;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: N */
        private List m11232N(int i7) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i7 > 0) {
                int iMin = Math.min(i7, 4096);
                byte[] bArr = new byte[iMin];
                int i8 = 0;
                while (i8 < iMin) {
                    int i9 = this.f9536g.read(bArr, i8, iMin - i8);
                    if (i9 == -1) {
                        throw C2535v.m11654m();
                    }
                    this.f9542m += i9;
                    i8 += i9;
                }
                i7 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: T */
        private void m11233T() {
            int i7 = this.f9538i + this.f9539j;
            this.f9538i = i7;
            int i8 = this.f9542m + i7;
            int i9 = this.f9543n;
            if (i8 <= i9) {
                this.f9539j = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f9539j = i10;
            this.f9538i = i7 - i10;
        }

        /* JADX INFO: renamed from: U */
        private void m11234U(int i7) throws C2535v {
            if (m11240b0(i7)) {
                return;
            }
            if (i7 <= (this.f9524c - this.f9542m) - this.f9540k) {
                throw C2535v.m11654m();
            }
            throw C2535v.m11653l();
        }

        /* JADX INFO: renamed from: V */
        private static long m11235V(InputStream inputStream, long j7) throws C2535v {
            try {
                return inputStream.skip(j7);
            } catch (C2535v e7) {
                e7.m11656j();
                throw e7;
            }
        }

        /* JADX INFO: renamed from: X */
        private void m11236X(int i7) throws C2535v {
            if (i7 < 0) {
                throw C2535v.m11650g();
            }
            int i8 = this.f9542m;
            int i9 = this.f9540k;
            int i10 = i8 + i9 + i7;
            int i11 = this.f9543n;
            if (i10 > i11) {
                m11247W((i11 - i8) - i9);
                throw C2535v.m11654m();
            }
            this.f9542m = i8 + i9;
            int i12 = this.f9538i - i9;
            this.f9538i = 0;
            this.f9540k = 0;
            while (i12 < i7) {
                try {
                    long j7 = i7 - i12;
                    long jM11235V = m11235V(this.f9536g, j7);
                    if (jM11235V < 0 || jM11235V > j7) {
                        throw new IllegalStateException(this.f9536g.getClass() + "#skip returned invalid result: " + jM11235V + "\nThe InputStream implementation is buggy.");
                    }
                    if (jM11235V == 0) {
                        break;
                    } else {
                        i12 += (int) jM11235V;
                    }
                } catch (Throwable th) {
                    this.f9542m += i12;
                    m11233T();
                    throw th;
                }
            }
            this.f9542m += i12;
            m11233T();
            if (i12 >= i7) {
                return;
            }
            int i13 = this.f9538i;
            int i14 = i13 - this.f9540k;
            this.f9540k = i13;
            m11234U(1);
            while (true) {
                int i15 = i7 - i14;
                int i16 = this.f9538i;
                if (i15 <= i16) {
                    this.f9540k = i15;
                    return;
                } else {
                    i14 += i16;
                    this.f9540k = i16;
                    m11234U(1);
                }
            }
        }

        /* JADX INFO: renamed from: Y */
        private void m11237Y() throws C2535v {
            if (this.f9538i - this.f9540k >= 10) {
                m11238Z();
            } else {
                m11239a0();
            }
        }

        /* JADX INFO: renamed from: Z */
        private void m11238Z() throws C2535v {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f9537h;
                int i8 = this.f9540k;
                this.f9540k = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw C2535v.m11649f();
        }

        /* JADX INFO: renamed from: a0 */
        private void m11239a0() throws C2535v {
            for (int i7 = 0; i7 < 10; i7++) {
                if (m11241K() >= 0) {
                    return;
                }
            }
            throw C2535v.m11649f();
        }

        /* JADX INFO: renamed from: b0 */
        private boolean m11240b0(int i7) throws C2535v {
            int i8 = this.f9540k;
            int i9 = i8 + i7;
            int i10 = this.f9538i;
            if (i9 <= i10) {
                throw new IllegalStateException("refillBuffer() called when " + i7 + " bytes were already available in buffer");
            }
            int i11 = this.f9524c;
            int i12 = this.f9542m;
            if (i7 > (i11 - i12) - i8 || i12 + i8 + i7 > this.f9543n) {
                return false;
            }
            if (i8 > 0) {
                if (i10 > i8) {
                    byte[] bArr = this.f9537h;
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f9542m += i8;
                this.f9538i -= i8;
                this.f9540k = 0;
            }
            InputStream inputStream = this.f9536g;
            byte[] bArr2 = this.f9537h;
            int i13 = this.f9538i;
            int iM11228I = m11228I(inputStream, bArr2, i13, Math.min(bArr2.length - i13, (this.f9524c - this.f9542m) - i13));
            if (iM11228I == 0 || iM11228I < -1 || iM11228I > this.f9537h.length) {
                throw new IllegalStateException(this.f9536g.getClass() + "#read(byte[]) returned invalid result: " + iM11228I + "\nThe InputStream implementation is buggy.");
            }
            if (iM11228I <= 0) {
                return false;
            }
            this.f9538i += iM11228I;
            m11233T();
            if (this.f9538i >= i7) {
                return true;
            }
            return m11240b0(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: A */
        public String mo11189A() throws C2535v {
            int iM11244Q = m11244Q();
            if (iM11244Q > 0) {
                int i7 = this.f9538i;
                int i8 = this.f9540k;
                if (iM11244Q <= i7 - i8) {
                    String str = new String(this.f9537h, i8, iM11244Q, AbstractC2534u.f9724b);
                    this.f9540k += iM11244Q;
                    return str;
                }
            }
            if (iM11244Q == 0) {
                return "";
            }
            if (iM11244Q < 0) {
                throw C2535v.m11650g();
            }
            if (iM11244Q > this.f9538i) {
                return new String(m11230L(iM11244Q, false), AbstractC2534u.f9724b);
            }
            m11234U(iM11244Q);
            String str2 = new String(this.f9537h, this.f9540k, iM11244Q, AbstractC2534u.f9724b);
            this.f9540k += iM11244Q;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: B */
        public String mo11190B() throws IOException {
            byte[] bArrM11230L;
            int iM11244Q = m11244Q();
            int i7 = this.f9540k;
            int i8 = this.f9538i;
            if (iM11244Q <= i8 - i7 && iM11244Q > 0) {
                bArrM11230L = this.f9537h;
                this.f9540k = i7 + iM11244Q;
            } else {
                if (iM11244Q == 0) {
                    return "";
                }
                if (iM11244Q < 0) {
                    throw C2535v.m11650g();
                }
                i7 = 0;
                if (iM11244Q <= i8) {
                    m11234U(iM11244Q);
                    bArrM11230L = this.f9537h;
                    this.f9540k = iM11244Q;
                } else {
                    bArrM11230L = m11230L(iM11244Q, false);
                }
            }
            return AbstractC2521j0.m11523a(bArrM11230L, i7, iM11244Q);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: C */
        public int mo11191C() throws C2535v {
            if (mo11199f()) {
                this.f9541l = 0;
                return 0;
            }
            int iM11244Q = m11244Q();
            this.f9541l = iM11244Q;
            if (AbstractC2523k0.m11548a(iM11244Q) != 0) {
                return this.f9541l;
            }
            throw C2535v.m11646c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: D */
        public int mo11192D() {
            return m11244Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: E */
        public long mo11193E() {
            return m11245R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: F */
        public boolean mo11194F(int i7) throws C2535v {
            int iM11549b = AbstractC2523k0.m11549b(i7);
            if (iM11549b == 0) {
                m11237Y();
                return true;
            }
            if (iM11549b == 1) {
                m11247W(8);
                return true;
            }
            if (iM11549b == 2) {
                m11247W(m11244Q());
                return true;
            }
            if (iM11549b == 3) {
                m11195G();
                mo11196a(AbstractC2523k0.m11550c(AbstractC2523k0.m11548a(i7), 4));
                return true;
            }
            if (iM11549b == 4) {
                return false;
            }
            if (iM11549b != 5) {
                throw C2535v.m11648e();
            }
            m11247W(4);
            return true;
        }

        /* JADX INFO: renamed from: K */
        public byte m11241K() throws C2535v {
            if (this.f9540k == this.f9538i) {
                m11234U(1);
            }
            byte[] bArr = this.f9537h;
            int i7 = this.f9540k;
            this.f9540k = i7 + 1;
            return bArr[i7];
        }

        /* JADX INFO: renamed from: O */
        public int m11242O() throws C2535v {
            int i7 = this.f9540k;
            if (this.f9538i - i7 < 4) {
                m11234U(4);
                i7 = this.f9540k;
            }
            byte[] bArr = this.f9537h;
            this.f9540k = i7 + 4;
            return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
        }

        /* JADX INFO: renamed from: P */
        public long m11243P() throws C2535v {
            int i7 = this.f9540k;
            if (this.f9538i - i7 < 8) {
                m11234U(8);
                i7 = this.f9540k;
            }
            byte[] bArr = this.f9537h;
            this.f9540k = i7 + 8;
            return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: Q */
        public int m11244Q() {
            int i7;
            int i8 = this.f9540k;
            int i9 = this.f9538i;
            if (i9 != i8) {
                byte[] bArr = this.f9537h;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f9540k = i10;
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
                    this.f9540k = i11;
                    return i7;
                }
            }
            return (int) m11246S();
        }

        /* JADX INFO: renamed from: R */
        public long m11245R() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f9540k;
            int i8 = this.f9538i;
            if (i8 != i7) {
                byte[] bArr = this.f9537h;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f9540k = i9;
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
                    this.f9540k = i10;
                    return j7;
                }
            }
            return m11246S();
        }

        /* JADX INFO: renamed from: S */
        long m11246S() throws C2535v {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                byte bM11241K = m11241K();
                j7 |= ((long) (bM11241K & 127)) << i7;
                if ((bM11241K & 128) == 0) {
                    return j7;
                }
            }
            throw C2535v.m11649f();
        }

        /* JADX INFO: renamed from: W */
        public void m11247W(int i7) throws C2535v {
            int i8 = this.f9538i;
            int i9 = this.f9540k;
            if (i7 > i8 - i9 || i7 < 0) {
                m11236X(i7);
            } else {
                this.f9540k = i9 + i7;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: a */
        public void mo11196a(int i7) throws C2535v {
            if (this.f9541l != i7) {
                throw C2535v.m11645b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: e */
        public int mo11198e() {
            return this.f9542m + this.f9540k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: f */
        public boolean mo11199f() {
            return this.f9540k == this.f9538i && !m11240b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: l */
        public void mo11200l(int i7) {
            this.f9543n = i7;
            m11233T();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: m */
        public int mo11201m(int i7) throws C2535v {
            if (i7 < 0) {
                throw C2535v.m11650g();
            }
            int i8 = i7 + this.f9542m + this.f9540k;
            if (i8 < 0) {
                throw C2535v.m11651h();
            }
            int i9 = this.f9543n;
            if (i8 > i9) {
                throw C2535v.m11654m();
            }
            this.f9543n = i8;
            m11233T();
            return i9;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: n */
        public boolean mo11202n() {
            return m11245R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: o */
        public AbstractC2512f mo11203o() throws C2535v {
            int iM11244Q = m11244Q();
            int i7 = this.f9538i;
            int i8 = this.f9540k;
            if (iM11244Q <= i7 - i8 && iM11244Q > 0) {
                AbstractC2512f abstractC2512fM11144k = AbstractC2512f.m11144k(this.f9537h, i8, iM11244Q);
                this.f9540k += iM11244Q;
                return abstractC2512fM11144k;
            }
            if (iM11244Q == 0) {
                return AbstractC2512f.f9510b;
            }
            if (iM11244Q >= 0) {
                return m11229J(iM11244Q);
            }
            throw C2535v.m11650g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: p */
        public double mo11204p() {
            return Double.longBitsToDouble(m11243P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: q */
        public int mo11205q() {
            return m11244Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: r */
        public int mo11206r() {
            return m11242O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: s */
        public long mo11207s() {
            return m11243P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: t */
        public float mo11208t() {
            return Float.intBitsToFloat(m11242O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: u */
        public int mo11209u() {
            return m11244Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: v */
        public long mo11210v() {
            return m11245R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: w */
        public int mo11211w() {
            return m11242O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: x */
        public long mo11212x() {
            return m11243P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: y */
        public int mo11213y() {
            return AbstractC2514g.m11182c(m11244Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2514g
        /* JADX INFO: renamed from: z */
        public long mo11214z() {
            return AbstractC2514g.m11183d(m11245R());
        }

        private c(InputStream inputStream, int i7) {
            super();
            this.f9543n = C3553a.e.API_PRIORITY_OTHER;
            AbstractC2534u.m11638b(inputStream, "input");
            this.f9536g = inputStream;
            this.f9537h = new byte[i7];
            this.f9538i = 0;
            this.f9540k = 0;
            this.f9542m = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m11182c(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    /* JADX INFO: renamed from: d */
    public static long m11183d(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC2514g m11184g(InputStream inputStream) {
        return m11185h(inputStream, 4096);
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC2514g m11185h(InputStream inputStream, int i7) {
        if (i7 > 0) {
            return inputStream == null ? m11186i(AbstractC2534u.f9726d) : new c(inputStream, i7);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC2514g m11186i(byte[] bArr) {
        return m11187j(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC2514g m11187j(byte[] bArr, int i7, int i8) {
        return m11188k(bArr, i7, i8, false);
    }

    /* JADX INFO: renamed from: k */
    static AbstractC2514g m11188k(byte[] bArr, int i7, int i8, boolean z7) {
        b bVar = new b(bArr, i7, i8, z7);
        try {
            bVar.mo11201m(i8);
            return bVar;
        } catch (C2535v e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract String mo11189A();

    /* JADX INFO: renamed from: B */
    public abstract String mo11190B();

    /* JADX INFO: renamed from: C */
    public abstract int mo11191C();

    /* JADX INFO: renamed from: D */
    public abstract int mo11192D();

    /* JADX INFO: renamed from: E */
    public abstract long mo11193E();

    /* JADX INFO: renamed from: F */
    public abstract boolean mo11194F(int i7);

    /* JADX INFO: renamed from: G */
    public void m11195G() throws C2535v {
        boolean zMo11194F;
        do {
            int iMo11191C = mo11191C();
            if (iMo11191C == 0) {
                return;
            }
            m11197b();
            this.f9522a++;
            zMo11194F = mo11194F(iMo11191C);
            this.f9522a--;
        } while (zMo11194F);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo11196a(int i7);

    /* JADX INFO: renamed from: b */
    public void m11197b() throws C2535v {
        if (this.f9522a >= this.f9523b) {
            throw C2535v.m11652i();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo11198e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo11199f();

    /* JADX INFO: renamed from: l */
    public abstract void mo11200l(int i7);

    /* JADX INFO: renamed from: m */
    public abstract int mo11201m(int i7);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo11202n();

    /* JADX INFO: renamed from: o */
    public abstract AbstractC2512f mo11203o();

    /* JADX INFO: renamed from: p */
    public abstract double mo11204p();

    /* JADX INFO: renamed from: q */
    public abstract int mo11205q();

    /* JADX INFO: renamed from: r */
    public abstract int mo11206r();

    /* JADX INFO: renamed from: s */
    public abstract long mo11207s();

    /* JADX INFO: renamed from: t */
    public abstract float mo11208t();

    /* JADX INFO: renamed from: u */
    public abstract int mo11209u();

    /* JADX INFO: renamed from: v */
    public abstract long mo11210v();

    /* JADX INFO: renamed from: w */
    public abstract int mo11211w();

    /* JADX INFO: renamed from: x */
    public abstract long mo11212x();

    /* JADX INFO: renamed from: y */
    public abstract int mo11213y();

    /* JADX INFO: renamed from: z */
    public abstract long mo11214z();

    private AbstractC2514g() {
        this.f9523b = f9521f;
        this.f9524c = C3553a.e.API_PRIORITY_OTHER;
        this.f9526e = false;
    }
}

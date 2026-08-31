package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5110l extends AbstractC5102h {

    /* JADX INFO: renamed from: c */
    private static final Logger f19471c = Logger.getLogger(AbstractC5110l.class.getName());

    /* JADX INFO: renamed from: d */
    private static final boolean f19472d = AbstractC5137y0.m23737I();

    /* JADX INFO: renamed from: a */
    C5112m f19473a;

    /* JADX INFO: renamed from: b */
    private boolean f19474b;

    /* JADX INFO: renamed from: com.google.protobuf.l$b */
    private static abstract class b extends AbstractC5110l {

        /* JADX INFO: renamed from: e */
        final byte[] f19475e;

        /* JADX INFO: renamed from: f */
        final int f19476f;

        /* JADX INFO: renamed from: g */
        int f19477g;

        /* JADX INFO: renamed from: h */
        int f19478h;

        b(int i7) {
            super();
            if (i7 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i7, 20)];
            this.f19475e = bArr;
            this.f19476f = bArr.length;
        }

        /* JADX INFO: renamed from: W0 */
        final void m23435W0(byte b7) {
            byte[] bArr = this.f19475e;
            int i7 = this.f19477g;
            this.f19477g = i7 + 1;
            bArr[i7] = b7;
            this.f19478h++;
        }

        /* JADX INFO: renamed from: X0 */
        final void m23436X0(int i7) {
            byte[] bArr = this.f19475e;
            int i8 = this.f19477g;
            int i9 = i8 + 1;
            this.f19477g = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i8 + 2;
            this.f19477g = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i8 + 3;
            this.f19477g = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.f19477g = i8 + 4;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
            this.f19478h += 4;
        }

        /* JADX INFO: renamed from: Y0 */
        final void m23437Y0(long j7) {
            byte[] bArr = this.f19475e;
            int i7 = this.f19477g;
            int i8 = i7 + 1;
            this.f19477g = i8;
            bArr[i7] = (byte) (j7 & 255);
            int i9 = i7 + 2;
            this.f19477g = i9;
            bArr[i8] = (byte) ((j7 >> 8) & 255);
            int i10 = i7 + 3;
            this.f19477g = i10;
            bArr[i9] = (byte) ((j7 >> 16) & 255);
            int i11 = i7 + 4;
            this.f19477g = i11;
            bArr[i10] = (byte) (255 & (j7 >> 24));
            int i12 = i7 + 5;
            this.f19477g = i12;
            bArr[i11] = (byte) (((int) (j7 >> 32)) & 255);
            int i13 = i7 + 6;
            this.f19477g = i13;
            bArr[i12] = (byte) (((int) (j7 >> 40)) & 255);
            int i14 = i7 + 7;
            this.f19477g = i14;
            bArr[i13] = (byte) (((int) (j7 >> 48)) & 255);
            this.f19477g = i7 + 8;
            bArr[i14] = (byte) (((int) (j7 >> 56)) & 255);
            this.f19478h += 8;
        }

        /* JADX INFO: renamed from: Z0 */
        final void m23438Z0(int i7) {
            if (i7 >= 0) {
                m23440b1(i7);
            } else {
                m23441c1(i7);
            }
        }

        /* JADX INFO: renamed from: a1 */
        final void m23439a1(int i7, int i8) {
            m23440b1(AbstractC5062A0.m22834c(i7, i8));
        }

        /* JADX INFO: renamed from: b1 */
        final void m23440b1(int i7) {
            if (!AbstractC5110l.f19472d) {
                while ((i7 & (-128)) != 0) {
                    byte[] bArr = this.f19475e;
                    int i8 = this.f19477g;
                    this.f19477g = i8 + 1;
                    bArr[i8] = (byte) ((i7 & 127) | 128);
                    this.f19478h++;
                    i7 >>>= 7;
                }
                byte[] bArr2 = this.f19475e;
                int i9 = this.f19477g;
                this.f19477g = i9 + 1;
                bArr2[i9] = (byte) i7;
                this.f19478h++;
                return;
            }
            long j7 = this.f19477g;
            while ((i7 & (-128)) != 0) {
                byte[] bArr3 = this.f19475e;
                int i10 = this.f19477g;
                this.f19477g = i10 + 1;
                AbstractC5137y0.m23743O(bArr3, i10, (byte) ((i7 & 127) | 128));
                i7 >>>= 7;
            }
            byte[] bArr4 = this.f19475e;
            int i11 = this.f19477g;
            this.f19477g = i11 + 1;
            AbstractC5137y0.m23743O(bArr4, i11, (byte) i7);
            this.f19478h += (int) (((long) this.f19477g) - j7);
        }

        /* JADX INFO: renamed from: c1 */
        final void m23441c1(long j7) {
            if (!AbstractC5110l.f19472d) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.f19475e;
                    int i7 = this.f19477g;
                    this.f19477g = i7 + 1;
                    bArr[i7] = (byte) ((((int) j7) & 127) | 128);
                    this.f19478h++;
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.f19475e;
                int i8 = this.f19477g;
                this.f19477g = i8 + 1;
                bArr2[i8] = (byte) j7;
                this.f19478h++;
                return;
            }
            long j8 = this.f19477g;
            while ((j7 & (-128)) != 0) {
                byte[] bArr3 = this.f19475e;
                int i9 = this.f19477g;
                this.f19477g = i9 + 1;
                AbstractC5137y0.m23743O(bArr3, i9, (byte) ((((int) j7) & 127) | 128));
                j7 >>>= 7;
            }
            byte[] bArr4 = this.f19475e;
            int i10 = this.f19477g;
            this.f19477g = i10 + 1;
            AbstractC5137y0.m23743O(bArr4, i10, (byte) j7);
            this.f19478h += (int) (((long) this.f19477g) - j8);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: d0 */
        public final int mo23412d0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$c */
    private static class c extends AbstractC5110l {

        /* JADX INFO: renamed from: e */
        private final byte[] f19479e;

        /* JADX INFO: renamed from: f */
        private final int f19480f;

        /* JADX INFO: renamed from: g */
        private final int f19481g;

        /* JADX INFO: renamed from: h */
        private int f19482h;

        c(byte[] bArr, int i7, int i8) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i9 = i7 + i8;
            if ((i7 | i8 | (bArr.length - i9)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            this.f19479e = bArr;
            this.f19480f = i7;
            this.f19482h = i7;
            this.f19481g = i9;
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: A0 */
        public final void mo23386A0(int i7) throws d {
            if (i7 >= 0) {
                mo23405T0(i7);
            } else {
                mo23407V0(i7);
            }
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: D0 */
        final void mo23389D0(int i7, InterfaceC5082U interfaceC5082U, InterfaceC5113m0 interfaceC5113m0) throws d {
            mo23403R0(i7, 2);
            mo23405T0(((AbstractC5088a) interfaceC5082U).mo23070k(interfaceC5113m0));
            interfaceC5113m0.mo23059h(interfaceC5082U, this.f19473a);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: E0 */
        public final void mo23390E0(InterfaceC5082U interfaceC5082U) throws d {
            mo23405T0(interfaceC5082U.mo22969b());
            interfaceC5082U.mo22972f(this);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: F0 */
        public final void mo23391F0(int i7, InterfaceC5082U interfaceC5082U) throws d {
            mo23403R0(1, 3);
            mo23404S0(2, i7);
            m23444Y0(3, interfaceC5082U);
            mo23403R0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: G0 */
        public final void mo23392G0(int i7, AbstractC5104i abstractC5104i) throws d {
            mo23403R0(1, 3);
            mo23404S0(2, i7);
            mo23418j0(3, abstractC5104i);
            mo23403R0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: P0 */
        public final void mo23401P0(int i7, String str) throws d {
            mo23403R0(i7, 2);
            mo23402Q0(str);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: Q0 */
        public final void mo23402Q0(String str) throws d {
            int i7 = this.f19482h;
            try {
                int iM23355S = AbstractC5110l.m23355S(str.length() * 3);
                int iM23355S2 = AbstractC5110l.m23355S(str.length());
                if (iM23355S2 != iM23355S) {
                    mo23405T0(AbstractC5139z0.m23818j(str));
                    this.f19482h = AbstractC5139z0.m23817i(str, this.f19479e, this.f19482h, mo23412d0());
                    return;
                }
                int i8 = i7 + iM23355S2;
                this.f19482h = i8;
                int iM23817i = AbstractC5139z0.m23817i(str, this.f19479e, i8, mo23412d0());
                this.f19482h = i7;
                mo23405T0((iM23817i - i7) - iM23355S2);
                this.f19482h = iM23817i;
            } catch (AbstractC5139z0.d e7) {
                this.f19482h = i7;
                m23409Y(str, e7);
            } catch (IndexOutOfBoundsException e8) {
                throw new d(e8);
            }
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: R0 */
        public final void mo23403R0(int i7, int i8) throws d {
            mo23405T0(AbstractC5062A0.m22834c(i7, i8));
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: S0 */
        public final void mo23404S0(int i7, int i8) throws d {
            mo23403R0(i7, 0);
            mo23405T0(i8);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: T0 */
        public final void mo23405T0(int i7) throws d {
            while ((i7 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f19479e;
                    int i8 = this.f19482h;
                    this.f19482h = i8 + 1;
                    bArr[i8] = (byte) ((i7 & 127) | 128);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19482h), Integer.valueOf(this.f19481g), 1), e7);
                }
            }
            byte[] bArr2 = this.f19479e;
            int i9 = this.f19482h;
            this.f19482h = i9 + 1;
            bArr2[i9] = (byte) i7;
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: U0 */
        public final void mo23406U0(int i7, long j7) throws d {
            mo23403R0(i7, 0);
            mo23407V0(j7);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: V0 */
        public final void mo23407V0(long j7) throws d {
            if (AbstractC5110l.f19472d && mo23412d0() >= 10) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.f19479e;
                    int i7 = this.f19482h;
                    this.f19482h = i7 + 1;
                    AbstractC5137y0.m23743O(bArr, i7, (byte) ((((int) j7) & 127) | 128));
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.f19479e;
                int i8 = this.f19482h;
                this.f19482h = i8 + 1;
                AbstractC5137y0.m23743O(bArr2, i8, (byte) j7);
                return;
            }
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f19479e;
                    int i9 = this.f19482h;
                    this.f19482h = i9 + 1;
                    bArr3[i9] = (byte) ((((int) j7) & 127) | 128);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19482h), Integer.valueOf(this.f19481g), 1), e7);
                }
            }
            byte[] bArr4 = this.f19479e;
            int i10 = this.f19482h;
            this.f19482h = i10 + 1;
            bArr4[i10] = (byte) j7;
        }

        /* JADX INFO: renamed from: W0 */
        public final void m23442W0(ByteBuffer byteBuffer) throws d {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f19479e, this.f19482h, iRemaining);
                this.f19482h += iRemaining;
            } catch (IndexOutOfBoundsException e7) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19482h), Integer.valueOf(this.f19481g), Integer.valueOf(iRemaining)), e7);
            }
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: X */
        public void mo23408X() {
        }

        /* JADX INFO: renamed from: X0 */
        public final void m23443X0(byte[] bArr, int i7, int i8) throws d {
            try {
                System.arraycopy(bArr, i7, this.f19479e, this.f19482h, i8);
                this.f19482h += i8;
            } catch (IndexOutOfBoundsException e7) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19482h), Integer.valueOf(this.f19481g), Integer.valueOf(i8)), e7);
            }
        }

        /* JADX INFO: renamed from: Y0 */
        public final void m23444Y0(int i7, InterfaceC5082U interfaceC5082U) throws d {
            mo23403R0(i7, 2);
            mo23390E0(interfaceC5082U);
        }

        @Override // com.google.protobuf.AbstractC5102h
        /* JADX INFO: renamed from: a */
        public final void mo23144a(ByteBuffer byteBuffer) throws d {
            m23442W0(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC5110l, com.google.protobuf.AbstractC5102h
        /* JADX INFO: renamed from: b */
        public final void mo23145b(byte[] bArr, int i7, int i8) throws d {
            m23443X0(bArr, i7, i8);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: d0 */
        public final int mo23412d0() {
            return this.f19481g - this.f19482h;
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: e0 */
        public final void mo23413e0(byte b7) throws d {
            try {
                byte[] bArr = this.f19479e;
                int i7 = this.f19482h;
                this.f19482h = i7 + 1;
                bArr[i7] = b7;
            } catch (IndexOutOfBoundsException e7) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19482h), Integer.valueOf(this.f19481g), 1), e7);
            }
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: f0 */
        public final void mo23414f0(int i7, boolean z7) throws d {
            mo23403R0(i7, 0);
            mo23413e0(z7 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: i0 */
        public final void mo23417i0(byte[] bArr, int i7, int i8) throws d {
            mo23405T0(i8);
            m23443X0(bArr, i7, i8);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: j0 */
        public final void mo23418j0(int i7, AbstractC5104i abstractC5104i) throws d {
            mo23403R0(i7, 2);
            mo23419k0(abstractC5104i);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: k0 */
        public final void mo23419k0(AbstractC5104i abstractC5104i) throws d {
            mo23405T0(abstractC5104i.size());
            abstractC5104i.mo23091c0(this);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: p0 */
        public final void mo23424p0(int i7, int i8) throws d {
            mo23403R0(i7, 5);
            mo23425q0(i8);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: q0 */
        public final void mo23425q0(int i7) throws d {
            try {
                byte[] bArr = this.f19479e;
                int i8 = this.f19482h;
                int i9 = i8 + 1;
                this.f19482h = i9;
                bArr[i8] = (byte) (i7 & 255);
                int i10 = i8 + 2;
                this.f19482h = i10;
                bArr[i9] = (byte) ((i7 >> 8) & 255);
                int i11 = i8 + 3;
                this.f19482h = i11;
                bArr[i10] = (byte) ((i7 >> 16) & 255);
                this.f19482h = i8 + 4;
                bArr[i11] = (byte) ((i7 >> 24) & 255);
            } catch (IndexOutOfBoundsException e7) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19482h), Integer.valueOf(this.f19481g), 1), e7);
            }
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: r0 */
        public final void mo23426r0(int i7, long j7) throws d {
            mo23403R0(i7, 1);
            mo23427s0(j7);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: s0 */
        public final void mo23427s0(long j7) throws d {
            try {
                byte[] bArr = this.f19479e;
                int i7 = this.f19482h;
                int i8 = i7 + 1;
                this.f19482h = i8;
                bArr[i7] = (byte) (((int) j7) & 255);
                int i9 = i7 + 2;
                this.f19482h = i9;
                bArr[i8] = (byte) (((int) (j7 >> 8)) & 255);
                int i10 = i7 + 3;
                this.f19482h = i10;
                bArr[i9] = (byte) (((int) (j7 >> 16)) & 255);
                int i11 = i7 + 4;
                this.f19482h = i11;
                bArr[i10] = (byte) (((int) (j7 >> 24)) & 255);
                int i12 = i7 + 5;
                this.f19482h = i12;
                bArr[i11] = (byte) (((int) (j7 >> 32)) & 255);
                int i13 = i7 + 6;
                this.f19482h = i13;
                bArr[i12] = (byte) (((int) (j7 >> 40)) & 255);
                int i14 = i7 + 7;
                this.f19482h = i14;
                bArr[i13] = (byte) (((int) (j7 >> 48)) & 255);
                this.f19482h = i7 + 8;
                bArr[i14] = (byte) (((int) (j7 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e7) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19482h), Integer.valueOf(this.f19481g), 1), e7);
            }
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: z0 */
        public final void mo23434z0(int i7, int i8) throws d {
            mo23403R0(i7, 0);
            mo23386A0(i8);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$d */
    public static class d extends IOException {
        d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$e */
    private static final class e extends b {

        /* JADX INFO: renamed from: i */
        private final OutputStream f19483i;

        e(OutputStream outputStream, int i7) {
            super(i7);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f19483i = outputStream;
        }

        /* JADX INFO: renamed from: d1 */
        private void m23445d1() throws IOException {
            this.f19483i.write(this.f19475e, 0, this.f19477g);
            this.f19477g = 0;
        }

        /* JADX INFO: renamed from: e1 */
        private void m23446e1(int i7) throws IOException {
            if (this.f19476f - this.f19477g < i7) {
                m23445d1();
            }
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: A0 */
        public void mo23386A0(int i7) throws IOException {
            if (i7 >= 0) {
                mo23405T0(i7);
            } else {
                mo23407V0(i7);
            }
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: D0 */
        void mo23389D0(int i7, InterfaceC5082U interfaceC5082U, InterfaceC5113m0 interfaceC5113m0) throws IOException {
            mo23403R0(i7, 2);
            m23450i1(interfaceC5082U, interfaceC5113m0);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: E0 */
        public void mo23390E0(InterfaceC5082U interfaceC5082U) throws IOException {
            mo23405T0(interfaceC5082U.mo22969b());
            interfaceC5082U.mo22972f(this);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: F0 */
        public void mo23391F0(int i7, InterfaceC5082U interfaceC5082U) throws IOException {
            mo23403R0(1, 3);
            mo23404S0(2, i7);
            m23449h1(3, interfaceC5082U);
            mo23403R0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: G0 */
        public void mo23392G0(int i7, AbstractC5104i abstractC5104i) throws IOException {
            mo23403R0(1, 3);
            mo23404S0(2, i7);
            mo23418j0(3, abstractC5104i);
            mo23403R0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: P0 */
        public void mo23401P0(int i7, String str) throws IOException {
            mo23403R0(i7, 2);
            mo23402Q0(str);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: Q0 */
        public void mo23402Q0(String str) throws IOException {
            int iM23818j;
            try {
                int length = str.length() * 3;
                int iM23355S = AbstractC5110l.m23355S(length);
                int i7 = iM23355S + length;
                int i8 = this.f19476f;
                if (i7 > i8) {
                    byte[] bArr = new byte[length];
                    int iM23817i = AbstractC5139z0.m23817i(str, bArr, 0, length);
                    mo23405T0(iM23817i);
                    mo23145b(bArr, 0, iM23817i);
                    return;
                }
                if (i7 > i8 - this.f19477g) {
                    m23445d1();
                }
                int iM23355S2 = AbstractC5110l.m23355S(str.length());
                int i9 = this.f19477g;
                try {
                    if (iM23355S2 == iM23355S) {
                        int i10 = i9 + iM23355S2;
                        this.f19477g = i10;
                        int iM23817i2 = AbstractC5139z0.m23817i(str, this.f19475e, i10, this.f19476f - i10);
                        this.f19477g = i9;
                        iM23818j = (iM23817i2 - i9) - iM23355S2;
                        m23440b1(iM23818j);
                        this.f19477g = iM23817i2;
                    } else {
                        iM23818j = AbstractC5139z0.m23818j(str);
                        m23440b1(iM23818j);
                        this.f19477g = AbstractC5139z0.m23817i(str, this.f19475e, this.f19477g, iM23818j);
                    }
                    this.f19478h += iM23818j;
                } catch (AbstractC5139z0.d e7) {
                    this.f19478h -= this.f19477g - i9;
                    this.f19477g = i9;
                    throw e7;
                } catch (ArrayIndexOutOfBoundsException e8) {
                    throw new d(e8);
                }
            } catch (AbstractC5139z0.d e9) {
                m23409Y(str, e9);
            }
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: R0 */
        public void mo23403R0(int i7, int i8) throws IOException {
            mo23405T0(AbstractC5062A0.m22834c(i7, i8));
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: S0 */
        public void mo23404S0(int i7, int i8) throws IOException {
            m23446e1(20);
            m23439a1(i7, 0);
            m23440b1(i8);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: T0 */
        public void mo23405T0(int i7) throws IOException {
            m23446e1(5);
            m23440b1(i7);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: U0 */
        public void mo23406U0(int i7, long j7) throws IOException {
            m23446e1(20);
            m23439a1(i7, 0);
            m23441c1(j7);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: V0 */
        public void mo23407V0(long j7) throws IOException {
            m23446e1(10);
            m23441c1(j7);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: X */
        public void mo23408X() throws IOException {
            if (this.f19477g > 0) {
                m23445d1();
            }
        }

        @Override // com.google.protobuf.AbstractC5102h
        /* JADX INFO: renamed from: a */
        public void mo23144a(ByteBuffer byteBuffer) throws IOException {
            m23447f1(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC5110l, com.google.protobuf.AbstractC5102h
        /* JADX INFO: renamed from: b */
        public void mo23145b(byte[] bArr, int i7, int i8) throws IOException {
            m23448g1(bArr, i7, i8);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: e0 */
        public void mo23413e0(byte b7) throws IOException {
            if (this.f19477g == this.f19476f) {
                m23445d1();
            }
            m23435W0(b7);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: f0 */
        public void mo23414f0(int i7, boolean z7) throws IOException {
            m23446e1(11);
            m23439a1(i7, 0);
            m23435W0(z7 ? (byte) 1 : (byte) 0);
        }

        /* JADX INFO: renamed from: f1 */
        public void m23447f1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i7 = this.f19476f;
            int i8 = this.f19477g;
            if (i7 - i8 >= iRemaining) {
                byteBuffer.get(this.f19475e, i8, iRemaining);
                this.f19477g += iRemaining;
                this.f19478h += iRemaining;
                return;
            }
            int i9 = i7 - i8;
            byteBuffer.get(this.f19475e, i8, i9);
            int i10 = iRemaining - i9;
            this.f19477g = this.f19476f;
            this.f19478h += i9;
            m23445d1();
            while (true) {
                int i11 = this.f19476f;
                if (i10 <= i11) {
                    byteBuffer.get(this.f19475e, 0, i10);
                    this.f19477g = i10;
                    this.f19478h += i10;
                    return;
                } else {
                    byteBuffer.get(this.f19475e, 0, i11);
                    this.f19483i.write(this.f19475e, 0, this.f19476f);
                    int i12 = this.f19476f;
                    i10 -= i12;
                    this.f19478h += i12;
                }
            }
        }

        /* JADX INFO: renamed from: g1 */
        public void m23448g1(byte[] bArr, int i7, int i8) throws IOException {
            int i9 = this.f19476f;
            int i10 = this.f19477g;
            if (i9 - i10 >= i8) {
                System.arraycopy(bArr, i7, this.f19475e, i10, i8);
                this.f19477g += i8;
                this.f19478h += i8;
                return;
            }
            int i11 = i9 - i10;
            System.arraycopy(bArr, i7, this.f19475e, i10, i11);
            int i12 = i7 + i11;
            int i13 = i8 - i11;
            this.f19477g = this.f19476f;
            this.f19478h += i11;
            m23445d1();
            if (i13 <= this.f19476f) {
                System.arraycopy(bArr, i12, this.f19475e, 0, i13);
                this.f19477g = i13;
            } else {
                this.f19483i.write(bArr, i12, i13);
            }
            this.f19478h += i13;
        }

        /* JADX INFO: renamed from: h1 */
        public void m23449h1(int i7, InterfaceC5082U interfaceC5082U) throws IOException {
            mo23403R0(i7, 2);
            mo23390E0(interfaceC5082U);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: i0 */
        public void mo23417i0(byte[] bArr, int i7, int i8) throws IOException {
            mo23405T0(i8);
            m23448g1(bArr, i7, i8);
        }

        /* JADX INFO: renamed from: i1 */
        void m23450i1(InterfaceC5082U interfaceC5082U, InterfaceC5113m0 interfaceC5113m0) throws IOException {
            mo23405T0(((AbstractC5088a) interfaceC5082U).mo23070k(interfaceC5113m0));
            interfaceC5113m0.mo23059h(interfaceC5082U, this.f19473a);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: j0 */
        public void mo23418j0(int i7, AbstractC5104i abstractC5104i) throws IOException {
            mo23403R0(i7, 2);
            mo23419k0(abstractC5104i);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: k0 */
        public void mo23419k0(AbstractC5104i abstractC5104i) throws IOException {
            mo23405T0(abstractC5104i.size());
            abstractC5104i.mo23091c0(this);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: p0 */
        public void mo23424p0(int i7, int i8) throws IOException {
            m23446e1(14);
            m23439a1(i7, 5);
            m23436X0(i8);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: q0 */
        public void mo23425q0(int i7) throws IOException {
            m23446e1(4);
            m23436X0(i7);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: r0 */
        public void mo23426r0(int i7, long j7) throws IOException {
            m23446e1(18);
            m23439a1(i7, 1);
            m23437Y0(j7);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: s0 */
        public void mo23427s0(long j7) throws IOException {
            m23446e1(8);
            m23437Y0(j7);
        }

        @Override // com.google.protobuf.AbstractC5110l
        /* JADX INFO: renamed from: z0 */
        public void mo23434z0(int i7, int i8) throws IOException {
            m23446e1(20);
            m23439a1(i7, 0);
            m23438Z0(i8);
        }
    }

    /* JADX INFO: renamed from: A */
    static int m23337A(int i7) {
        return m23355S(i7) + i7;
    }

    /* JADX INFO: renamed from: B */
    static int m23338B(int i7, InterfaceC5082U interfaceC5082U, InterfaceC5113m0 interfaceC5113m0) {
        return m23353Q(i7) + m23340D(interfaceC5082U, interfaceC5113m0);
    }

    /* JADX INFO: renamed from: C */
    public static int m23339C(InterfaceC5082U interfaceC5082U) {
        return m23337A(interfaceC5082U.mo22969b());
    }

    /* JADX INFO: renamed from: D */
    static int m23340D(InterfaceC5082U interfaceC5082U, InterfaceC5113m0 interfaceC5113m0) {
        return m23337A(((AbstractC5088a) interfaceC5082U).mo23070k(interfaceC5113m0));
    }

    /* JADX INFO: renamed from: E */
    static int m23341E(int i7) {
        if (i7 > 4096) {
            return 4096;
        }
        return i7;
    }

    /* JADX INFO: renamed from: F */
    public static int m23342F(int i7, AbstractC5104i abstractC5104i) {
        return (m23353Q(1) * 2) + m23354R(2, i7) + m23367h(3, abstractC5104i);
    }

    /* JADX INFO: renamed from: G */
    public static int m23343G(int i7, int i8) {
        return m23353Q(i7) + m23344H(i8);
    }

    /* JADX INFO: renamed from: H */
    public static int m23344H(int i7) {
        return 4;
    }

    /* JADX INFO: renamed from: I */
    public static int m23345I(int i7, long j7) {
        return m23353Q(i7) + m23346J(j7);
    }

    /* JADX INFO: renamed from: J */
    public static int m23346J(long j7) {
        return 8;
    }

    /* JADX INFO: renamed from: K */
    public static int m23347K(int i7, int i8) {
        return m23353Q(i7) + m23348L(i8);
    }

    /* JADX INFO: renamed from: L */
    public static int m23348L(int i7) {
        return m23355S(m23358V(i7));
    }

    /* JADX INFO: renamed from: M */
    public static int m23349M(int i7, long j7) {
        return m23353Q(i7) + m23350N(j7);
    }

    /* JADX INFO: renamed from: N */
    public static int m23350N(long j7) {
        return m23357U(m23359W(j7));
    }

    /* JADX INFO: renamed from: O */
    public static int m23351O(int i7, String str) {
        return m23353Q(i7) + m23352P(str);
    }

    /* JADX INFO: renamed from: P */
    public static int m23352P(String str) {
        int length;
        try {
            length = AbstractC5139z0.m23818j(str);
        } catch (AbstractC5139z0.d unused) {
            length = str.getBytes(AbstractC5063B.f19294b).length;
        }
        return m23337A(length);
    }

    /* JADX INFO: renamed from: Q */
    public static int m23353Q(int i7) {
        return m23355S(AbstractC5062A0.m22834c(i7, 0));
    }

    /* JADX INFO: renamed from: R */
    public static int m23354R(int i7, int i8) {
        return m23353Q(i7) + m23355S(i8);
    }

    /* JADX INFO: renamed from: S */
    public static int m23355S(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: T */
    public static int m23356T(int i7, long j7) {
        return m23353Q(i7) + m23357U(j7);
    }

    /* JADX INFO: renamed from: U */
    public static int m23357U(long j7) {
        int i7;
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (j7 < 0) {
            return 10;
        }
        if (((-34359738368L) & j7) != 0) {
            j7 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j7) != 0) {
            i7 += 2;
            j7 >>>= 14;
        }
        return (j7 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    /* JADX INFO: renamed from: V */
    public static int m23358V(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    /* JADX INFO: renamed from: W */
    public static long m23359W(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    /* JADX INFO: renamed from: a0 */
    public static AbstractC5110l m23360a0(OutputStream outputStream, int i7) {
        return new e(outputStream, i7);
    }

    /* JADX INFO: renamed from: b0 */
    public static AbstractC5110l m23361b0(byte[] bArr) {
        return m23363c0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: c0 */
    public static AbstractC5110l m23363c0(byte[] bArr, int i7, int i8) {
        return new c(bArr, i7, i8);
    }

    /* JADX INFO: renamed from: e */
    public static int m23364e(int i7, boolean z7) {
        return m23353Q(i7) + m23365f(z7);
    }

    /* JADX INFO: renamed from: f */
    public static int m23365f(boolean z7) {
        return 1;
    }

    /* JADX INFO: renamed from: g */
    public static int m23366g(byte[] bArr) {
        return m23337A(bArr.length);
    }

    /* JADX INFO: renamed from: h */
    public static int m23367h(int i7, AbstractC5104i abstractC5104i) {
        return m23353Q(i7) + m23368i(abstractC5104i);
    }

    /* JADX INFO: renamed from: i */
    public static int m23368i(AbstractC5104i abstractC5104i) {
        return m23337A(abstractC5104i.size());
    }

    /* JADX INFO: renamed from: j */
    public static int m23369j(int i7, double d7) {
        return m23353Q(i7) + m23370k(d7);
    }

    /* JADX INFO: renamed from: k */
    public static int m23370k(double d7) {
        return 8;
    }

    /* JADX INFO: renamed from: l */
    public static int m23371l(int i7, int i8) {
        return m23353Q(i7) + m23372m(i8);
    }

    /* JADX INFO: renamed from: m */
    public static int m23372m(int i7) {
        return m23383x(i7);
    }

    /* JADX INFO: renamed from: n */
    public static int m23373n(int i7, int i8) {
        return m23353Q(i7) + m23374o(i8);
    }

    /* JADX INFO: renamed from: o */
    public static int m23374o(int i7) {
        return 4;
    }

    /* JADX INFO: renamed from: p */
    public static int m23375p(int i7, long j7) {
        return m23353Q(i7) + m23376q(j7);
    }

    /* JADX INFO: renamed from: q */
    public static int m23376q(long j7) {
        return 8;
    }

    /* JADX INFO: renamed from: r */
    public static int m23377r(int i7, float f7) {
        return m23353Q(i7) + m23378s(f7);
    }

    /* JADX INFO: renamed from: s */
    public static int m23378s(float f7) {
        return 4;
    }

    /* JADX INFO: renamed from: t */
    static int m23379t(int i7, InterfaceC5082U interfaceC5082U, InterfaceC5113m0 interfaceC5113m0) {
        return (m23353Q(i7) * 2) + m23381v(interfaceC5082U, interfaceC5113m0);
    }

    /* JADX INFO: renamed from: u */
    public static int m23380u(InterfaceC5082U interfaceC5082U) {
        return interfaceC5082U.mo22969b();
    }

    /* JADX INFO: renamed from: v */
    static int m23381v(InterfaceC5082U interfaceC5082U, InterfaceC5113m0 interfaceC5113m0) {
        return ((AbstractC5088a) interfaceC5082U).mo23070k(interfaceC5113m0);
    }

    /* JADX INFO: renamed from: w */
    public static int m23382w(int i7, int i8) {
        return m23353Q(i7) + m23383x(i8);
    }

    /* JADX INFO: renamed from: x */
    public static int m23383x(int i7) {
        if (i7 >= 0) {
            return m23355S(i7);
        }
        return 10;
    }

    /* JADX INFO: renamed from: y */
    public static int m23384y(int i7, long j7) {
        return m23353Q(i7) + m23385z(j7);
    }

    /* JADX INFO: renamed from: z */
    public static int m23385z(long j7) {
        return m23357U(j7);
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo23386A0(int i7);

    /* JADX INFO: renamed from: B0 */
    public final void m23387B0(int i7, long j7) {
        mo23406U0(i7, j7);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m23388C0(long j7) {
        mo23407V0(j7);
    }

    /* JADX INFO: renamed from: D0 */
    abstract void mo23389D0(int i7, InterfaceC5082U interfaceC5082U, InterfaceC5113m0 interfaceC5113m0);

    /* JADX INFO: renamed from: E0 */
    public abstract void mo23390E0(InterfaceC5082U interfaceC5082U);

    /* JADX INFO: renamed from: F0 */
    public abstract void mo23391F0(int i7, InterfaceC5082U interfaceC5082U);

    /* JADX INFO: renamed from: G0 */
    public abstract void mo23392G0(int i7, AbstractC5104i abstractC5104i);

    /* JADX INFO: renamed from: H0 */
    public final void m23393H0(int i7, int i8) {
        mo23424p0(i7, i8);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m23394I0(int i7) {
        mo23425q0(i7);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m23395J0(int i7, long j7) {
        mo23426r0(i7, j7);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m23396K0(long j7) {
        mo23427s0(j7);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m23397L0(int i7, int i8) {
        mo23404S0(i7, m23358V(i8));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m23398M0(int i7) {
        mo23405T0(m23358V(i7));
    }

    /* JADX INFO: renamed from: N0 */
    public final void m23399N0(int i7, long j7) {
        mo23406U0(i7, m23359W(j7));
    }

    /* JADX INFO: renamed from: O0 */
    public final void m23400O0(long j7) {
        mo23407V0(m23359W(j7));
    }

    /* JADX INFO: renamed from: P0 */
    public abstract void mo23401P0(int i7, String str);

    /* JADX INFO: renamed from: Q0 */
    public abstract void mo23402Q0(String str);

    /* JADX INFO: renamed from: R0 */
    public abstract void mo23403R0(int i7, int i8);

    /* JADX INFO: renamed from: S0 */
    public abstract void mo23404S0(int i7, int i8);

    /* JADX INFO: renamed from: T0 */
    public abstract void mo23405T0(int i7);

    /* JADX INFO: renamed from: U0 */
    public abstract void mo23406U0(int i7, long j7);

    /* JADX INFO: renamed from: V0 */
    public abstract void mo23407V0(long j7);

    /* JADX INFO: renamed from: X */
    public abstract void mo23408X();

    /* JADX INFO: renamed from: Y */
    final void m23409Y(String str, AbstractC5139z0.d dVar) throws d {
        f19471c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC5063B.f19294b);
        try {
            mo23405T0(bytes.length);
            mo23145b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new d(e7);
        }
    }

    /* JADX INFO: renamed from: Z */
    boolean m23410Z() {
        return this.f19474b;
    }

    @Override // com.google.protobuf.AbstractC5102h
    /* JADX INFO: renamed from: b */
    public abstract void mo23145b(byte[] bArr, int i7, int i8);

    /* JADX INFO: renamed from: d */
    public final void m23411d() {
        if (mo23412d0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: renamed from: d0 */
    public abstract int mo23412d0();

    /* JADX INFO: renamed from: e0 */
    public abstract void mo23413e0(byte b7);

    /* JADX INFO: renamed from: f0 */
    public abstract void mo23414f0(int i7, boolean z7);

    /* JADX INFO: renamed from: g0 */
    public final void m23415g0(boolean z7) {
        mo23413e0(z7 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m23416h0(byte[] bArr) {
        mo23417i0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: i0 */
    abstract void mo23417i0(byte[] bArr, int i7, int i8);

    /* JADX INFO: renamed from: j0 */
    public abstract void mo23418j0(int i7, AbstractC5104i abstractC5104i);

    /* JADX INFO: renamed from: k0 */
    public abstract void mo23419k0(AbstractC5104i abstractC5104i);

    /* JADX INFO: renamed from: l0 */
    public final void m23420l0(int i7, double d7) {
        mo23426r0(i7, Double.doubleToRawLongBits(d7));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m23421m0(double d7) {
        mo23427s0(Double.doubleToRawLongBits(d7));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m23422n0(int i7, int i8) {
        mo23434z0(i7, i8);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m23423o0(int i7) {
        mo23386A0(i7);
    }

    /* JADX INFO: renamed from: p0 */
    public abstract void mo23424p0(int i7, int i8);

    /* JADX INFO: renamed from: q0 */
    public abstract void mo23425q0(int i7);

    /* JADX INFO: renamed from: r0 */
    public abstract void mo23426r0(int i7, long j7);

    /* JADX INFO: renamed from: s0 */
    public abstract void mo23427s0(long j7);

    /* JADX INFO: renamed from: t0 */
    public final void m23428t0(int i7, float f7) {
        mo23424p0(i7, Float.floatToRawIntBits(f7));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m23429u0(float f7) {
        mo23425q0(Float.floatToRawIntBits(f7));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m23430v0(int i7, InterfaceC5082U interfaceC5082U) {
        mo23403R0(i7, 3);
        m23432x0(interfaceC5082U);
        mo23403R0(i7, 4);
    }

    /* JADX INFO: renamed from: w0 */
    final void m23431w0(int i7, InterfaceC5082U interfaceC5082U, InterfaceC5113m0 interfaceC5113m0) {
        mo23403R0(i7, 3);
        m23433y0(interfaceC5082U, interfaceC5113m0);
        mo23403R0(i7, 4);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m23432x0(InterfaceC5082U interfaceC5082U) {
        interfaceC5082U.mo22972f(this);
    }

    /* JADX INFO: renamed from: y0 */
    final void m23433y0(InterfaceC5082U interfaceC5082U, InterfaceC5113m0 interfaceC5113m0) {
        interfaceC5113m0.mo23059h(interfaceC5082U, this.f19473a);
    }

    /* JADX INFO: renamed from: z0 */
    public abstract void mo23434z0(int i7, int i8);

    private AbstractC5110l() {
    }
}

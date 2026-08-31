package io.grpc.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import p063H5.InterfaceC0522Q;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.z0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5821z0 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC5819y0 f22946a = new c(new byte[0]);

    /* JADX INFO: renamed from: io.grpc.internal.z0$a */
    class a extends AbstractC5750O {
        a(InterfaceC5819y0 interfaceC5819y0) {
            super(interfaceC5819y0);
        }

        @Override // io.grpc.internal.InterfaceC5819y0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.z0$c */
    private static class c extends AbstractC5772b {

        /* JADX INFO: renamed from: a */
        int f22948a;

        /* JADX INFO: renamed from: b */
        final int f22949b;

        /* JADX INFO: renamed from: c */
        final byte[] f22950c;

        /* JADX INFO: renamed from: d */
        int f22951d;

        c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // io.grpc.internal.InterfaceC5819y0
        /* JADX INFO: renamed from: H0 */
        public void mo3395H0(ByteBuffer byteBuffer) {
            AbstractC1209m.m5303o(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            m25847d(iRemaining);
            byteBuffer.put(this.f22950c, this.f22948a, iRemaining);
            this.f22948a += iRemaining;
        }

        @Override // io.grpc.internal.InterfaceC5819y0
        /* JADX INFO: renamed from: c0 */
        public void mo3396c0(byte[] bArr, int i7, int i8) {
            System.arraycopy(this.f22950c, this.f22948a, bArr, i7, i8);
            this.f22948a += i8;
        }

        @Override // io.grpc.internal.InterfaceC5819y0
        /* JADX INFO: renamed from: e */
        public int mo3397e() {
            return this.f22949b - this.f22948a;
        }

        @Override // io.grpc.internal.AbstractC5772b, io.grpc.internal.InterfaceC5819y0
        /* JADX INFO: renamed from: f0 */
        public void mo25645f0() {
            this.f22951d = this.f22948a;
        }

        @Override // io.grpc.internal.InterfaceC5819y0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public c mo3394B(int i7) {
            m25847d(i7);
            int i8 = this.f22948a;
            this.f22948a = i8 + i7;
            return new c(this.f22950c, i8, i7);
        }

        @Override // io.grpc.internal.AbstractC5772b, io.grpc.internal.InterfaceC5819y0
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.InterfaceC5819y0
        public int readUnsignedByte() {
            m25847d(1);
            byte[] bArr = this.f22950c;
            int i7 = this.f22948a;
            this.f22948a = i7 + 1;
            return bArr[i7] & 255;
        }

        @Override // io.grpc.internal.AbstractC5772b, io.grpc.internal.InterfaceC5819y0
        public void reset() {
            int i7 = this.f22951d;
            if (i7 == -1) {
                throw new InvalidMarkException();
            }
            this.f22948a = i7;
        }

        @Override // io.grpc.internal.InterfaceC5819y0
        public void skipBytes(int i7) {
            m25847d(i7);
            this.f22948a += i7;
        }

        @Override // io.grpc.internal.InterfaceC5819y0
        /* JADX INFO: renamed from: x0 */
        public void mo3398x0(OutputStream outputStream, int i7) throws IOException {
            m25847d(i7);
            outputStream.write(this.f22950c, this.f22948a, i7);
            this.f22948a += i7;
        }

        c(byte[] bArr, int i7, int i8) {
            this.f22951d = -1;
            AbstractC1209m.m5293e(i7 >= 0, "offset must be >= 0");
            AbstractC1209m.m5293e(i8 >= 0, "length must be >= 0");
            int i9 = i8 + i7;
            AbstractC1209m.m5293e(i9 <= bArr.length, "offset + length exceeds array boundary");
            this.f22950c = (byte[]) AbstractC1209m.m5303o(bArr, "bytes");
            this.f22948a = i7;
            this.f22949b = i9;
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5819y0 m26217a() {
        return f22946a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5819y0 m26218b(InterfaceC5819y0 interfaceC5819y0) {
        return new a(interfaceC5819y0);
    }

    /* JADX INFO: renamed from: c */
    public static InputStream m26219c(InterfaceC5819y0 interfaceC5819y0, boolean z7) {
        if (!z7) {
            interfaceC5819y0 = m26218b(interfaceC5819y0);
        }
        return new b(interfaceC5819y0);
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m26220d(InterfaceC5819y0 interfaceC5819y0) {
        AbstractC1209m.m5303o(interfaceC5819y0, "buffer");
        int iMo3397e = interfaceC5819y0.mo3397e();
        byte[] bArr = new byte[iMo3397e];
        interfaceC5819y0.mo3396c0(bArr, 0, iMo3397e);
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    public static String m26221e(InterfaceC5819y0 interfaceC5819y0, Charset charset) {
        AbstractC1209m.m5303o(charset, "charset");
        return new String(m26220d(interfaceC5819y0), charset);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC5819y0 m26222f(byte[] bArr, int i7, int i8) {
        return new c(bArr, i7, i8);
    }

    /* JADX INFO: renamed from: io.grpc.internal.z0$b */
    private static final class b extends InputStream implements InterfaceC0522Q {

        /* JADX INFO: renamed from: a */
        private InterfaceC5819y0 f22947a;

        public b(InterfaceC5819y0 interfaceC5819y0) {
            this.f22947a = (InterfaceC5819y0) AbstractC1209m.m5303o(interfaceC5819y0, "buffer");
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f22947a.mo3397e();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f22947a.close();
        }

        @Override // java.io.InputStream
        public void mark(int i7) {
            this.f22947a.mo25645f0();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f22947a.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f22947a.mo3397e() == 0) {
                return -1;
            }
            return this.f22947a.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f22947a.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j7) {
            int iMin = (int) Math.min(this.f22947a.mo3397e(), j7);
            this.f22947a.skipBytes(iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) {
            if (this.f22947a.mo3397e() == 0) {
                return -1;
            }
            int iMin = Math.min(this.f22947a.mo3397e(), i8);
            this.f22947a.mo3396c0(bArr, i7, iMin);
            return iMin;
        }
    }
}

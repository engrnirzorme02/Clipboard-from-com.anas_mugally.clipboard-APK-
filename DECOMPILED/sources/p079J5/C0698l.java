package p079J5;

import io.grpc.internal.AbstractC5772b;
import io.grpc.internal.InterfaceC5819y0;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p072I6.C0648e;

/* JADX INFO: renamed from: J5.l */
/* JADX INFO: loaded from: classes.dex */
class C0698l extends AbstractC5772b {

    /* JADX INFO: renamed from: a */
    private final C0648e f2855a;

    C0698l(C0648e c0648e) {
        this.f2855a = c0648e;
    }

    /* JADX INFO: renamed from: m */
    private void m3393m() {
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: B */
    public InterfaceC5819y0 mo3394B(int i7) {
        C0648e c0648e = new C0648e();
        c0648e.mo3003I(this.f2855a, i7);
        return new C0698l(c0648e);
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: H0 */
    public void mo3395H0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: c0 */
    public void mo3396c0(byte[] bArr, int i7, int i8) {
        while (i8 > 0) {
            int iM3030W0 = this.f2855a.m3030W0(bArr, i7, i8);
            if (iM3030W0 == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i8 + " bytes");
            }
            i8 -= iM3030W0;
            i7 += iM3030W0;
        }
    }

    @Override // io.grpc.internal.AbstractC5772b, io.grpc.internal.InterfaceC5819y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f2855a.m3076x();
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: e */
    public int mo3397e() {
        return (int) this.f2855a.m3046h1();
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    public int readUnsignedByte() {
        try {
            m3393m();
            return this.f2855a.readByte() & 255;
        } catch (EOFException e7) {
            throw new IndexOutOfBoundsException(e7.getMessage());
        }
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    public void skipBytes(int i7) {
        try {
            this.f2855a.mo3052l(i7);
        } catch (EOFException e7) {
            throw new IndexOutOfBoundsException(e7.getMessage());
        }
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: x0 */
    public void mo3398x0(OutputStream outputStream, int i7) throws IOException {
        this.f2855a.m3073v1(outputStream, i7);
    }
}

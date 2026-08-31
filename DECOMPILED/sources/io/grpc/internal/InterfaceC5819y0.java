package io.grpc.internal;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: io.grpc.internal.y0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5819y0 extends Closeable {
    /* JADX INFO: renamed from: B */
    InterfaceC5819y0 mo3394B(int i7);

    /* JADX INFO: renamed from: H0 */
    void mo3395H0(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: c0 */
    void mo3396c0(byte[] bArr, int i7, int i8);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* JADX INFO: renamed from: e */
    int mo3397e();

    /* JADX INFO: renamed from: f0 */
    void mo25645f0();

    boolean markSupported();

    int readUnsignedByte();

    void reset();

    void skipBytes(int i7);

    /* JADX INFO: renamed from: v0 */
    default void m26216v0() {
    }

    /* JADX INFO: renamed from: x0 */
    void mo3398x0(OutputStream outputStream, int i7);
}

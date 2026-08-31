package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5772b implements InterfaceC5819y0 {
    @Override // io.grpc.internal.InterfaceC5819y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: renamed from: d */
    protected final void m25847d(int i7) {
        if (mo3397e() < i7) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: f0 */
    public void mo25645f0() {
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    public boolean markSupported() {
        return false;
    }

    public final int readInt() {
        m25847d(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    public void reset() {
        throw new UnsupportedOperationException();
    }
}

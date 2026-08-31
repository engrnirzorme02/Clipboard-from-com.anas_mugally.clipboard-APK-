package io.grpc.internal;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5750O implements InterfaceC5819y0 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5819y0 f22218a;

    protected AbstractC5750O(InterfaceC5819y0 interfaceC5819y0) {
        this.f22218a = (InterfaceC5819y0) AbstractC1209m.m5303o(interfaceC5819y0, "buf");
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: B */
    public InterfaceC5819y0 mo3394B(int i7) {
        return this.f22218a.mo3394B(i7);
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: H0 */
    public void mo3395H0(ByteBuffer byteBuffer) {
        this.f22218a.mo3395H0(byteBuffer);
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: c0 */
    public void mo3396c0(byte[] bArr, int i7, int i8) {
        this.f22218a.mo3396c0(bArr, i7, i8);
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: e */
    public int mo3397e() {
        return this.f22218a.mo3397e();
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: f0 */
    public void mo25645f0() {
        this.f22218a.mo25645f0();
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    public boolean markSupported() {
        return this.f22218a.markSupported();
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    public int readUnsignedByte() {
        return this.f22218a.readUnsignedByte();
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    public void reset() {
        this.f22218a.reset();
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    public void skipBytes(int i7) {
        this.f22218a.skipBytes(i7);
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("delegate", this.f22218a).toString();
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: x0 */
    public void mo3398x0(OutputStream outputStream, int i7) {
        this.f22218a.mo3398x0(outputStream, i7);
    }
}

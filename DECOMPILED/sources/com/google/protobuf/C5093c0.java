package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.c0 */
/* JADX INFO: loaded from: classes.dex */
final class C5093c0 extends AbstractC5104i.h {

    /* JADX INFO: renamed from: e */
    private final ByteBuffer f19378e;

    C5093c0(ByteBuffer byteBuffer) {
        AbstractC5063B.m22838b(byteBuffer, "buffer");
        this.f19378e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    /* JADX INFO: renamed from: e0 */
    private ByteBuffer m23083e0(int i7, int i8) {
        if (i7 < this.f19378e.position() || i8 > this.f19378e.limit() || i7 > i8) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        ByteBuffer byteBufferSlice = this.f19378e.slice();
        AbstractC5067E.m22907b(byteBufferSlice, i7 - this.f19378e.position());
        AbstractC5067E.m22906a(byteBufferSlice, i8 - this.f19378e.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: B */
    public boolean mo23084B() {
        return AbstractC5139z0.m23826r(this.f19378e);
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: D */
    public AbstractC5106j mo23085D() {
        return AbstractC5106j.m23188j(this.f19378e, true);
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: F */
    protected int mo23086F(int i7, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + this.f19378e.get(i10);
        }
        return i7;
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: I */
    protected int mo23087I(int i7, int i8, int i9) {
        return AbstractC5139z0.m23829u(i7, this.f19378e, i8, i9 + i8);
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: P */
    public AbstractC5104i mo23088P(int i7, int i8) {
        try {
            return new C5093c0(m23083e0(i7, i8));
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw e7;
        } catch (IndexOutOfBoundsException e8) {
            throw new ArrayIndexOutOfBoundsException(e8.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: W */
    protected String mo23089W(Charset charset) {
        byte[] bArrM23167T;
        int length;
        int iArrayOffset;
        if (this.f19378e.hasArray()) {
            bArrM23167T = this.f19378e.array();
            iArrayOffset = this.f19378e.arrayOffset() + this.f19378e.position();
            length = this.f19378e.remaining();
        } else {
            bArrM23167T = m23167T();
            length = bArrM23167T.length;
            iArrayOffset = 0;
        }
        return new String(bArrM23167T, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: b */
    public ByteBuffer mo23090b() {
        return this.f19378e.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: c0 */
    void mo23091c0(AbstractC5102h abstractC5102h) {
        abstractC5102h.mo23144a(this.f19378e.slice());
    }

    @Override // com.google.protobuf.AbstractC5104i.h
    /* JADX INFO: renamed from: d0 */
    boolean mo23092d0(AbstractC5104i abstractC5104i, int i7, int i8) {
        return mo23088P(0, i8).equals(abstractC5104i.mo23088P(i7, i8 + i7));
    }

    @Override // com.google.protobuf.AbstractC5104i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5104i)) {
            return false;
        }
        AbstractC5104i abstractC5104i = (AbstractC5104i) obj;
        if (size() != abstractC5104i.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C5093c0) {
            return this.f19378e.equals(((C5093c0) obj).f19378e);
        }
        return obj instanceof C5111l0 ? obj.equals(this) : this.f19378e.equals(abstractC5104i.mo23090b());
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: g */
    public byte mo23093g(int i7) {
        try {
            return this.f19378e.get(i7);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw e7;
        } catch (IndexOutOfBoundsException e8) {
            throw new ArrayIndexOutOfBoundsException(e8.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC5104i
    public int size() {
        return this.f19378e.remaining();
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: x */
    protected void mo23094x(byte[] bArr, int i7, int i8, int i9) {
        ByteBuffer byteBufferSlice = this.f19378e.slice();
        AbstractC5067E.m22907b(byteBufferSlice, i7);
        byteBufferSlice.get(bArr, i8, i9);
    }

    @Override // com.google.protobuf.AbstractC5104i
    /* JADX INFO: renamed from: z */
    public byte mo23095z(int i7) {
        return mo23093g(i7);
    }
}

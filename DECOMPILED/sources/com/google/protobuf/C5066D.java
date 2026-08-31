package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.protobuf.D */
/* JADX INFO: loaded from: classes.dex */
class C5066D extends InputStream {

    /* JADX INFO: renamed from: a */
    private Iterator f19304a;

    /* JADX INFO: renamed from: b */
    private ByteBuffer f19305b;

    /* JADX INFO: renamed from: c */
    private int f19306c = 0;

    /* JADX INFO: renamed from: d */
    private int f19307d;

    /* JADX INFO: renamed from: e */
    private int f19308e;

    /* JADX INFO: renamed from: f */
    private boolean f19309f;

    /* JADX INFO: renamed from: r */
    private byte[] f19310r;

    /* JADX INFO: renamed from: s */
    private int f19311s;

    /* JADX INFO: renamed from: t */
    private long f19312t;

    C5066D(Iterable iterable) {
        this.f19304a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f19306c++;
        }
        this.f19307d = -1;
        if (m22904d()) {
            return;
        }
        this.f19305b = AbstractC5063B.f19297e;
        this.f19307d = 0;
        this.f19308e = 0;
        this.f19312t = 0L;
    }

    /* JADX INFO: renamed from: d */
    private boolean m22904d() {
        this.f19307d++;
        if (!this.f19304a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f19304a.next();
        this.f19305b = byteBuffer;
        this.f19308e = byteBuffer.position();
        if (this.f19305b.hasArray()) {
            this.f19309f = true;
            this.f19310r = this.f19305b.array();
            this.f19311s = this.f19305b.arrayOffset();
        } else {
            this.f19309f = false;
            this.f19312t = AbstractC5137y0.m23763k(this.f19305b);
            this.f19310r = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    private void m22905m(int i7) {
        int i8 = this.f19308e + i7;
        this.f19308e = i8;
        if (i8 == this.f19305b.limit()) {
            m22904d();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f19307d == this.f19306c) {
            return -1;
        }
        if (this.f19309f) {
            int i7 = this.f19310r[this.f19308e + this.f19311s] & 255;
            m22905m(1);
            return i7;
        }
        int iM23775w = AbstractC5137y0.m23775w(((long) this.f19308e) + this.f19312t) & 255;
        m22905m(1);
        return iM23775w;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        if (this.f19307d == this.f19306c) {
            return -1;
        }
        int iLimit = this.f19305b.limit();
        int i9 = this.f19308e;
        int i10 = iLimit - i9;
        if (i8 > i10) {
            i8 = i10;
        }
        if (this.f19309f) {
            System.arraycopy(this.f19310r, i9 + this.f19311s, bArr, i7, i8);
            m22905m(i8);
            return i8;
        }
        int iPosition = this.f19305b.position();
        AbstractC5067E.m22907b(this.f19305b, this.f19308e);
        this.f19305b.get(bArr, i7, i8);
        AbstractC5067E.m22907b(this.f19305b, iPosition);
        m22905m(i8);
        return i8;
    }
}

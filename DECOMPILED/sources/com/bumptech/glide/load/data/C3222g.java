package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3222g extends FilterInputStream {

    /* JADX INFO: renamed from: c */
    private static final byte[] f13813c;

    /* JADX INFO: renamed from: d */
    private static final int f13814d;

    /* JADX INFO: renamed from: e */
    private static final int f13815e;

    /* JADX INFO: renamed from: a */
    private final byte f13816a;

    /* JADX INFO: renamed from: b */
    private int f13817b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f13813c = bArr;
        int length = bArr.length;
        f13814d = length;
        f13815e = length + 2;
    }

    public C3222g(InputStream inputStream, int i7) {
        super(inputStream);
        if (i7 >= -1 && i7 <= 8) {
            this.f13816a = (byte) i7;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i7);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i7;
        int i8;
        int i9 = this.f13817b;
        if (i9 < 2 || i9 > (i8 = f13815e)) {
            i7 = super.read();
        } else {
            i7 = i9 == i8 ? this.f13816a : f13813c[i9 - 2] & 255;
        }
        if (i7 != -1) {
            this.f13817b++;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j7) throws IOException {
        long jSkip = super.skip(j7);
        if (jSkip > 0) {
            this.f13817b = (int) (((long) this.f13817b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9;
        int i10 = this.f13817b;
        int i11 = f13815e;
        if (i10 > i11) {
            i9 = super.read(bArr, i7, i8);
        } else if (i10 == i11) {
            bArr[i7] = this.f13816a;
            i9 = 1;
        } else if (i10 < 2) {
            i9 = super.read(bArr, i7, 2 - i10);
        } else {
            int iMin = Math.min(i11 - i10, i8);
            System.arraycopy(f13813c, this.f13817b - 2, bArr, i7, iMin);
            i9 = iMin;
        }
        if (i9 > 0) {
            this.f13817b += i9;
        }
        return i9;
    }
}

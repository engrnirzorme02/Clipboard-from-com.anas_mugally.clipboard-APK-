package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;
import p043F1.InterfaceC0404b;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3218c extends OutputStream {

    /* JADX INFO: renamed from: a */
    private final OutputStream f13806a;

    /* JADX INFO: renamed from: b */
    private byte[] f13807b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0404b f13808c;

    /* JADX INFO: renamed from: d */
    private int f13809d;

    public C3218c(OutputStream outputStream, InterfaceC0404b interfaceC0404b) {
        this(outputStream, interfaceC0404b, 65536);
    }

    /* JADX INFO: renamed from: d */
    private void m17111d() throws IOException {
        int i7 = this.f13809d;
        if (i7 > 0) {
            this.f13806a.write(this.f13807b, 0, i7);
            this.f13809d = 0;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m17112m() throws IOException {
        if (this.f13809d == this.f13807b.length) {
            m17111d();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m17113n() {
        byte[] bArr = this.f13807b;
        if (bArr != null) {
            this.f13808c.mo1738d(bArr);
            this.f13807b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f13806a.close();
            m17113n();
        } catch (Throwable th) {
            this.f13806a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m17111d();
        this.f13806a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i7) throws IOException {
        byte[] bArr = this.f13807b;
        int i8 = this.f13809d;
        this.f13809d = i8 + 1;
        bArr[i8] = (byte) i7;
        m17112m();
    }

    C3218c(OutputStream outputStream, InterfaceC0404b interfaceC0404b, int i7) {
        this.f13806a = outputStream;
        this.f13808c = interfaceC0404b;
        this.f13807b = (byte[]) interfaceC0404b.mo1739e(i7, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = 0;
        do {
            int i10 = i8 - i9;
            int i11 = i7 + i9;
            int i12 = this.f13809d;
            if (i12 == 0 && i10 >= this.f13807b.length) {
                this.f13806a.write(bArr, i11, i10);
                return;
            }
            int iMin = Math.min(i10, this.f13807b.length - i12);
            System.arraycopy(bArr, i11, this.f13807b, this.f13809d, iMin);
            this.f13809d += iMin;
            i9 += iMin;
            m17112m();
        } while (i9 < i8);
    }
}

package p091L1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p043F1.InterfaceC0404b;

/* JADX INFO: renamed from: L1.V */
/* JADX INFO: loaded from: classes.dex */
public class C0801V extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private volatile byte[] f3214a;

    /* JADX INFO: renamed from: b */
    private int f3215b;

    /* JADX INFO: renamed from: c */
    private int f3216c;

    /* JADX INFO: renamed from: d */
    private int f3217d;

    /* JADX INFO: renamed from: e */
    private int f3218e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0404b f3219f;

    /* JADX INFO: renamed from: L1.V$a */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public C0801V(InputStream inputStream, InterfaceC0404b interfaceC0404b) {
        this(inputStream, interfaceC0404b, 65536);
    }

    /* JADX INFO: renamed from: d */
    private int m3746d(InputStream inputStream, byte[] bArr) throws IOException {
        int i7 = this.f3217d;
        if (i7 != -1) {
            int i8 = this.f3218e - i7;
            int i9 = this.f3216c;
            if (i8 < i9) {
                if (i7 == 0 && i9 > bArr.length && this.f3215b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i9) {
                        i9 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f3219f.mo1739e(i9, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f3214a = bArr2;
                    this.f3219f.mo1738d(bArr);
                    bArr = bArr2;
                } else if (i7 > 0) {
                    System.arraycopy(bArr, i7, bArr, 0, bArr.length - i7);
                }
                int i10 = this.f3218e - this.f3217d;
                this.f3218e = i10;
                this.f3217d = 0;
                this.f3215b = 0;
                int i11 = inputStream.read(bArr, i10, bArr.length - i10);
                int i12 = this.f3218e;
                if (i11 > 0) {
                    i12 += i11;
                }
                this.f3215b = i12;
                return i11;
            }
        }
        int i13 = inputStream.read(bArr);
        if (i13 > 0) {
            this.f3217d = -1;
            this.f3218e = 0;
            this.f3215b = i13;
        }
        return i13;
    }

    /* JADX INFO: renamed from: x */
    private static IOException m3747x() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f3214a == null || inputStream == null) {
            throw m3747x();
        }
        return (this.f3215b - this.f3218e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f3214a != null) {
            this.f3219f.mo1738d(this.f3214a);
            this.f3214a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m3748m() {
        this.f3216c = this.f3214a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i7) {
        this.f3216c = Math.max(this.f3216c, i7);
        this.f3217d = this.f3218e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m3749n() {
        if (this.f3214a != null) {
            this.f3219f.mo1738d(this.f3214a);
            this.f3214a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f3214a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m3747x();
        }
        if (this.f3218e >= this.f3215b && m3746d(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f3214a && (bArr = this.f3214a) == null) {
            throw m3747x();
        }
        int i7 = this.f3215b;
        int i8 = this.f3218e;
        if (i7 - i8 <= 0) {
            return -1;
        }
        this.f3218e = i8 + 1;
        return bArr[i8] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f3214a == null) {
            throw new IOException("Stream is closed");
        }
        int i7 = this.f3217d;
        if (-1 == i7) {
            throw new a("Mark has been invalidated, pos: " + this.f3218e + " markLimit: " + this.f3216c);
        }
        this.f3218e = i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j7) {
        if (j7 < 1) {
            return 0L;
        }
        byte[] bArr = this.f3214a;
        if (bArr == null) {
            throw m3747x();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m3747x();
        }
        int i7 = this.f3215b;
        int i8 = this.f3218e;
        if (i7 - i8 >= j7) {
            this.f3218e = (int) (((long) i8) + j7);
            return j7;
        }
        long j8 = ((long) i7) - ((long) i8);
        this.f3218e = i7;
        if (this.f3217d == -1 || j7 > this.f3216c) {
            long jSkip = inputStream.skip(j7 - j8);
            if (jSkip > 0) {
                this.f3217d = -1;
            }
            return j8 + jSkip;
        }
        if (m3746d(inputStream, bArr) == -1) {
            return j8;
        }
        int i9 = this.f3215b;
        int i10 = this.f3218e;
        if (i9 - i10 >= j7 - j8) {
            this.f3218e = (int) ((((long) i10) + j7) - j8);
            return j7;
        }
        long j9 = (j8 + ((long) i9)) - ((long) i10);
        this.f3218e = i9;
        return j9;
    }

    C0801V(InputStream inputStream, InterfaceC0404b interfaceC0404b, int i7) {
        super(inputStream);
        this.f3217d = -1;
        this.f3219f = interfaceC0404b;
        this.f3214a = (byte[]) interfaceC0404b.mo1739e(i7, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        byte[] bArr2 = this.f3214a;
        if (bArr2 == null) {
            throw m3747x();
        }
        if (i8 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i11 = this.f3218e;
            int i12 = this.f3215b;
            if (i11 < i12) {
                int i13 = i12 - i11 >= i8 ? i8 : i12 - i11;
                System.arraycopy(bArr2, i11, bArr, i7, i13);
                this.f3218e += i13;
                if (i13 == i8 || inputStream.available() == 0) {
                    return i13;
                }
                i7 += i13;
                i9 = i8 - i13;
            } else {
                i9 = i8;
            }
            while (true) {
                if (this.f3217d == -1 && i9 >= bArr2.length) {
                    i10 = inputStream.read(bArr, i7, i9);
                    if (i10 == -1) {
                        return i9 != i8 ? i8 - i9 : -1;
                    }
                } else {
                    if (m3746d(inputStream, bArr2) == -1) {
                        return i9 != i8 ? i8 - i9 : -1;
                    }
                    if (bArr2 != this.f3214a && (bArr2 = this.f3214a) == null) {
                        throw m3747x();
                    }
                    int i14 = this.f3215b;
                    int i15 = this.f3218e;
                    i10 = i14 - i15 >= i9 ? i9 : i14 - i15;
                    System.arraycopy(bArr2, i15, bArr, i7, i10);
                    this.f3218e += i10;
                }
                i9 -= i10;
                if (i9 == 0) {
                    return i8;
                }
                if (inputStream.available() == 0) {
                    return i8 - i9;
                }
                i7 += i10;
            }
        } else {
            throw m3747x();
        }
    }
}

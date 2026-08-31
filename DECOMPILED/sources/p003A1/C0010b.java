package p003A1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: A1.b */
/* JADX INFO: loaded from: classes.dex */
class C0010b implements Closeable {

    /* JADX INFO: renamed from: a */
    private final InputStream f73a;

    /* JADX INFO: renamed from: b */
    private final Charset f74b;

    /* JADX INFO: renamed from: c */
    private byte[] f75c;

    /* JADX INFO: renamed from: d */
    private int f76d;

    /* JADX INFO: renamed from: e */
    private int f77e;

    /* JADX INFO: renamed from: A1.b$a */
    class a extends ByteArrayOutputStream {
        a(int i7) {
            super(i7);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i7 = ((ByteArrayOutputStream) this).count;
            if (i7 > 0 && ((ByteArrayOutputStream) this).buf[i7 - 1] == 13) {
                i7--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i7, C0010b.this.f74b.name());
            } catch (UnsupportedEncodingException e7) {
                throw new AssertionError(e7);
            }
        }
    }

    C0010b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* JADX INFO: renamed from: m */
    private void m74m() throws IOException {
        InputStream inputStream = this.f73a;
        byte[] bArr = this.f75c;
        int i7 = inputStream.read(bArr, 0, bArr.length);
        if (i7 == -1) {
            throw new EOFException();
        }
        this.f76d = 0;
        this.f77e = i7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f73a) {
            try {
                if (this.f75c != null) {
                    this.f75c = null;
                    this.f73a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    boolean m75n() {
        return this.f77e == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    /* JADX INFO: renamed from: x */
    String m76x() {
        int i7;
        byte[] bArr;
        int i8;
        synchronized (this.f73a) {
            try {
                if (this.f75c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f76d >= this.f77e) {
                    m74m();
                }
                for (int i9 = this.f76d; i9 != this.f77e; i9++) {
                    byte[] bArr2 = this.f75c;
                    if (bArr2[i9] == 10) {
                        int i10 = this.f76d;
                        if (i9 != i10) {
                            i8 = i9 - 1;
                            if (bArr2[i8] != 13) {
                                i8 = i9;
                            }
                        } else {
                            i8 = i9;
                        }
                        String str = new String(bArr2, i10, i8 - i10, this.f74b.name());
                        this.f76d = i9 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f77e - this.f76d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f75c;
                    int i11 = this.f76d;
                    aVar.write(bArr3, i11, this.f77e - i11);
                    this.f77e = -1;
                    m74m();
                    i7 = this.f76d;
                    while (i7 != this.f77e) {
                        bArr = this.f75c;
                        if (bArr[i7] == 10) {
                            break loop1;
                        }
                        i7++;
                    }
                }
                int i12 = this.f76d;
                if (i7 != i12) {
                    aVar.write(bArr, i12, i7 - i12);
                }
                this.f76d = i7 + 1;
                return aVar.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    C0010b(InputStream inputStream, int i7, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(AbstractC0011c.f79a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f73a = inputStream;
        this.f74b = charset;
        this.f75c = new byte[i7];
    }
}

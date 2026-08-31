package p183Y1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Y1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2014c extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private final long f6689a;

    /* JADX INFO: renamed from: b */
    private int f6690b;

    private C2014c(InputStream inputStream, long j7) {
        super(inputStream);
        this.f6689a = j7;
    }

    /* JADX INFO: renamed from: d */
    private int m8383d(int i7) throws IOException {
        if (i7 >= 0) {
            this.f6690b += i7;
            return i7;
        }
        if (this.f6689a - ((long) this.f6690b) <= 0) {
            return i7;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f6689a + ", but read: " + this.f6690b);
    }

    /* JADX INFO: renamed from: m */
    public static InputStream m8384m(InputStream inputStream, long j7) {
        return new C2014c(inputStream, j7);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f6689a - ((long) this.f6690b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i7;
        i7 = super.read();
        m8383d(i7 >= 0 ? 1 : -1);
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i7, int i8) {
        return m8383d(super.read(bArr, i7, i8));
    }
}

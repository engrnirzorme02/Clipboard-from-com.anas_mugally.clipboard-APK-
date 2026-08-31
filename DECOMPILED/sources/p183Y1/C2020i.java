package p183Y1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Y1.i */
/* JADX INFO: loaded from: classes.dex */
public class C2020i extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private int f6706a;

    public C2020i(InputStream inputStream) {
        super(inputStream);
        this.f6706a = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: d */
    private long m8401d(long j7) {
        int i7 = this.f6706a;
        if (i7 == 0) {
            return -1L;
        }
        return (i7 == Integer.MIN_VALUE || j7 <= ((long) i7)) ? j7 : i7;
    }

    /* JADX INFO: renamed from: m */
    private void m8402m(long j7) {
        int i7 = this.f6706a;
        if (i7 == Integer.MIN_VALUE || j7 == -1) {
            return;
        }
        this.f6706a = (int) (((long) i7) - j7);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i7 = this.f6706a;
        return i7 == Integer.MIN_VALUE ? super.available() : Math.min(i7, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i7) {
        super.mark(i7);
        this.f6706a = i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m8401d(1L) == -1) {
            return -1;
        }
        int i7 = super.read();
        m8402m(1L);
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f6706a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j7) throws IOException {
        long jM8401d = m8401d(j7);
        if (jM8401d == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM8401d);
        m8402m(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) throws IOException {
        int iM8401d = (int) m8401d(i8);
        if (iM8401d == -1) {
            return -1;
        }
        int i9 = super.read(bArr, i7, iM8401d);
        m8402m(i9);
        return i9;
    }
}

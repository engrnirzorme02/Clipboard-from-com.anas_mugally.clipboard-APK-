package p183Y1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: renamed from: Y1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2015d extends InputStream {

    /* JADX INFO: renamed from: c */
    private static final Queue f6691c = AbstractC2023l.m8415f(0);

    /* JADX INFO: renamed from: a */
    private InputStream f6692a;

    /* JADX INFO: renamed from: b */
    private IOException f6693b;

    C2015d() {
    }

    /* JADX INFO: renamed from: m */
    public static C2015d m8385m(InputStream inputStream) {
        C2015d c2015d;
        Queue queue = f6691c;
        synchronized (queue) {
            c2015d = (C2015d) queue.poll();
        }
        if (c2015d == null) {
            c2015d = new C2015d();
        }
        c2015d.m8388x(inputStream);
        return c2015d;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f6692a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6692a.close();
    }

    /* JADX INFO: renamed from: d */
    public IOException m8386d() {
        return this.f6693b;
    }

    @Override // java.io.InputStream
    public void mark(int i7) {
        this.f6692a.mark(i7);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f6692a.markSupported();
    }

    /* JADX INFO: renamed from: n */
    public void m8387n() {
        this.f6693b = null;
        this.f6692a = null;
        Queue queue = f6691c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f6692a.read();
        } catch (IOException e7) {
            this.f6693b = e7;
            throw e7;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f6692a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j7) throws IOException {
        try {
            return this.f6692a.skip(j7);
        } catch (IOException e7) {
            this.f6693b = e7;
            throw e7;
        }
    }

    /* JADX INFO: renamed from: x */
    void m8388x(InputStream inputStream) {
        this.f6692a = inputStream;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f6692a.read(bArr);
        } catch (IOException e7) {
            this.f6693b = e7;
            throw e7;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) throws IOException {
        try {
            return this.f6692a.read(bArr, i7, i8);
        } catch (IOException e7) {
            this.f6693b = e7;
            throw e7;
        }
    }
}

package p174X;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: X.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1894N extends OutputStream {

    /* JADX INFO: renamed from: a */
    private final FileOutputStream f6097a;

    public C1894N(FileOutputStream fileOutputStream) {
        AbstractC6118n.m27187e(fileOutputStream, "fileOutputStream");
        this.f6097a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f6097a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i7) throws IOException {
        this.f6097a.write(i7);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b7) throws IOException {
        AbstractC6118n.m27187e(b7, "b");
        this.f6097a.write(b7);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i7, int i8) throws IOException {
        AbstractC6118n.m27187e(bytes, "bytes");
        this.f6097a.write(bytes, i7, i8);
    }
}

package p183Y1;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Y1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2012a {

    /* JADX INFO: renamed from: a */
    private static final AtomicReference f6682a = new AtomicReference();

    /* JADX INFO: renamed from: Y1.a$b */
    static final class b {

        /* JADX INFO: renamed from: a */
        final int f6685a;

        /* JADX INFO: renamed from: b */
        final int f6686b;

        /* JADX INFO: renamed from: c */
        final byte[] f6687c;

        b(byte[] bArr, int i7, int i8) {
            this.f6687c = bArr;
            this.f6685a = i7;
            this.f6686b = i8;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ByteBuffer m8373a(File file) throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return mappedByteBufferLoad;
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static ByteBuffer m8374b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f6682a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 < 0) {
                f6682a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m8376d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, i7);
        }
    }

    /* JADX INFO: renamed from: c */
    private static b m8375c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* JADX INFO: renamed from: d */
    public static ByteBuffer m8376d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m8377e(ByteBuffer byteBuffer) {
        b bVarM8375c = m8375c(byteBuffer);
        if (bVarM8375c != null && bVarM8375c.f6685a == 0 && bVarM8375c.f6686b == bVarM8375c.f6687c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        m8376d(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: f */
    public static void m8378f(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        m8376d(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static InputStream m8379g(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* JADX INFO: renamed from: Y1.a$a */
    private static class a extends InputStream {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f6683a;

        /* JADX INFO: renamed from: b */
        private int f6684b = -1;

        a(ByteBuffer byteBuffer) {
            this.f6683a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f6683a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i7) {
            this.f6684b = this.f6683a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f6683a.hasRemaining()) {
                return this.f6683a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i7 = this.f6684b;
            if (i7 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f6683a.position(i7);
        }

        @Override // java.io.InputStream
        public long skip(long j7) {
            if (!this.f6683a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j7, available());
            ByteBuffer byteBuffer = this.f6683a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) {
            if (!this.f6683a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i8, available());
            this.f6683a.get(bArr, i7, iMin);
            return iMin;
        }
    }
}

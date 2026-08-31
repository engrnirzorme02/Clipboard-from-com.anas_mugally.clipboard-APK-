package p268i4;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: i4.h */
/* JADX INFO: loaded from: classes.dex */
class C5712h implements Closeable {

    /* JADX INFO: renamed from: r */
    private static final Logger f21787r = Logger.getLogger(C5712h.class.getName());

    /* JADX INFO: renamed from: a */
    private final RandomAccessFile f21788a;

    /* JADX INFO: renamed from: b */
    int f21789b;

    /* JADX INFO: renamed from: c */
    private int f21790c;

    /* JADX INFO: renamed from: d */
    private b f21791d;

    /* JADX INFO: renamed from: e */
    private b f21792e;

    /* JADX INFO: renamed from: f */
    private final byte[] f21793f = new byte[16];

    /* JADX INFO: renamed from: i4.h$a */
    class a implements d {

        /* JADX INFO: renamed from: a */
        boolean f21794a = true;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ StringBuilder f21795b;

        a(StringBuilder sb) {
            this.f21795b = sb;
        }

        @Override // p268i4.C5712h.d
        /* JADX INFO: renamed from: a */
        public void mo25338a(InputStream inputStream, int i7) {
            if (this.f21794a) {
                this.f21794a = false;
            } else {
                this.f21795b.append(", ");
            }
            this.f21795b.append(i7);
        }
    }

    /* JADX INFO: renamed from: i4.h$b */
    static class b {

        /* JADX INFO: renamed from: c */
        static final b f21797c = new b(0, 0);

        /* JADX INFO: renamed from: a */
        final int f21798a;

        /* JADX INFO: renamed from: b */
        final int f21799b;

        b(int i7, int i8) {
            this.f21798a = i7;
            this.f21799b = i8;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f21798a + ", length = " + this.f21799b + "]";
        }
    }

    /* JADX INFO: renamed from: i4.h$c */
    private final class c extends InputStream {

        /* JADX INFO: renamed from: a */
        private int f21800a;

        /* JADX INFO: renamed from: b */
        private int f21801b;

        /* synthetic */ c(C5712h c5712h, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) throws IOException {
            C5712h.m25329w0(bArr, "buffer");
            if ((i7 | i8) < 0 || i8 > bArr.length - i7) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i9 = this.f21801b;
            if (i9 <= 0) {
                return -1;
            }
            if (i8 > i9) {
                i8 = i9;
            }
            C5712h.this.m25317V0(this.f21800a, bArr, i7, i8);
            this.f21800a = C5712h.this.m25320Z0(this.f21800a + i8);
            this.f21801b -= i8;
            return i8;
        }

        private c(b bVar) {
            this.f21800a = C5712h.this.m25320Z0(bVar.f21798a + 4);
            this.f21801b = bVar.f21799b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f21801b == 0) {
                return -1;
            }
            C5712h.this.f21788a.seek(this.f21800a);
            int i7 = C5712h.this.f21788a.read();
            this.f21800a = C5712h.this.m25320Z0(this.f21800a + 1);
            this.f21801b--;
            return i7;
        }
    }

    /* JADX INFO: renamed from: i4.h$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo25338a(InputStream inputStream, int i7);
    }

    public C5712h(File file) throws IOException {
        if (!file.exists()) {
            m25328o0(file);
        }
        this.f21788a = m25312K0(file);
        m25314R0();
    }

    /* JADX INFO: renamed from: K0 */
    private static RandomAccessFile m25312K0(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* JADX INFO: renamed from: Q0 */
    private b m25313Q0(int i7) throws IOException {
        if (i7 == 0) {
            return b.f21797c;
        }
        this.f21788a.seek(i7);
        return new b(i7, this.f21788a.readInt());
    }

    /* JADX INFO: renamed from: R0 */
    private void m25314R0() throws IOException {
        this.f21788a.seek(0L);
        this.f21788a.readFully(this.f21793f);
        int iM25315S0 = m25315S0(this.f21793f, 0);
        this.f21789b = iM25315S0;
        if (iM25315S0 <= this.f21788a.length()) {
            this.f21790c = m25315S0(this.f21793f, 4);
            int iM25315S1 = m25315S0(this.f21793f, 8);
            int iM25315S2 = m25315S0(this.f21793f, 12);
            this.f21791d = m25313Q0(iM25315S1);
            this.f21792e = m25313Q0(iM25315S2);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f21789b + ", Actual length: " + this.f21788a.length());
    }

    /* JADX INFO: renamed from: S0 */
    private static int m25315S0(byte[] bArr, int i7) {
        return ((bArr[i7] & 255) << 24) + ((bArr[i7 + 1] & 255) << 16) + ((bArr[i7 + 2] & 255) << 8) + (bArr[i7 + 3] & 255);
    }

    /* JADX INFO: renamed from: T0 */
    private int m25316T0() {
        return this.f21789b - m25334Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public void m25317V0(int i7, byte[] bArr, int i8, int i9) throws IOException {
        int iM25320Z0 = m25320Z0(i7);
        int i10 = iM25320Z0 + i9;
        int i11 = this.f21789b;
        if (i10 <= i11) {
            this.f21788a.seek(iM25320Z0);
            this.f21788a.readFully(bArr, i8, i9);
            return;
        }
        int i12 = i11 - iM25320Z0;
        this.f21788a.seek(iM25320Z0);
        this.f21788a.readFully(bArr, i8, i12);
        this.f21788a.seek(16L);
        this.f21788a.readFully(bArr, i8 + i12, i9 - i12);
    }

    /* JADX INFO: renamed from: W0 */
    private void m25318W0(int i7, byte[] bArr, int i8, int i9) throws IOException {
        int iM25320Z0 = m25320Z0(i7);
        int i10 = iM25320Z0 + i9;
        int i11 = this.f21789b;
        if (i10 <= i11) {
            this.f21788a.seek(iM25320Z0);
            this.f21788a.write(bArr, i8, i9);
            return;
        }
        int i12 = i11 - iM25320Z0;
        this.f21788a.seek(iM25320Z0);
        this.f21788a.write(bArr, i8, i12);
        this.f21788a.seek(16L);
        this.f21788a.write(bArr, i8 + i12, i9 - i12);
    }

    /* JADX INFO: renamed from: X0 */
    private void m25319X0(int i7) throws IOException {
        this.f21788a.setLength(i7);
        this.f21788a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public int m25320Z0(int i7) {
        int i8 = this.f21789b;
        return i7 < i8 ? i7 : (i7 + 16) - i8;
    }

    /* JADX INFO: renamed from: a1 */
    private void m25321a1(int i7, int i8, int i9, int i10) throws IOException {
        m25323c1(this.f21793f, i7, i8, i9, i10);
        this.f21788a.seek(0L);
        this.f21788a.write(this.f21793f);
    }

    /* JADX INFO: renamed from: b1 */
    private static void m25322b1(byte[] bArr, int i7, int i8) {
        bArr[i7] = (byte) (i8 >> 24);
        bArr[i7 + 1] = (byte) (i8 >> 16);
        bArr[i7 + 2] = (byte) (i8 >> 8);
        bArr[i7 + 3] = (byte) i8;
    }

    /* JADX INFO: renamed from: c1 */
    private static void m25323c1(byte[] bArr, int... iArr) {
        int i7 = 0;
        for (int i8 : iArr) {
            m25322b1(bArr, i7, i8);
            i7 += 4;
        }
    }

    /* JADX INFO: renamed from: k0 */
    private void m25325k0(int i7) throws IOException {
        int i8 = i7 + 4;
        int iM25316T0 = m25316T0();
        if (iM25316T0 >= i8) {
            return;
        }
        int i9 = this.f21789b;
        do {
            iM25316T0 += i9;
            i9 <<= 1;
        } while (iM25316T0 < i8);
        m25319X0(i9);
        b bVar = this.f21792e;
        int iM25320Z0 = m25320Z0(bVar.f21798a + 4 + bVar.f21799b);
        if (iM25320Z0 < this.f21791d.f21798a) {
            FileChannel channel = this.f21788a.getChannel();
            channel.position(this.f21789b);
            long j7 = iM25320Z0 - 4;
            if (channel.transferTo(16L, j7, channel) != j7) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i10 = this.f21792e.f21798a;
        int i11 = this.f21791d.f21798a;
        if (i10 < i11) {
            int i12 = (this.f21789b + i10) - 16;
            m25321a1(i9, this.f21790c, i11, i12);
            this.f21792e = new b(i12, this.f21792e.f21799b);
        } else {
            m25321a1(i9, this.f21790c, i11, i10);
        }
        this.f21789b = i9;
    }

    /* JADX INFO: renamed from: o0 */
    private static void m25328o0(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileM25312K0 = m25312K0(file2);
        try {
            randomAccessFileM25312K0.setLength(4096L);
            randomAccessFileM25312K0.seek(0L);
            byte[] bArr = new byte[16];
            m25323c1(bArr, 4096, 0, 0, 0);
            randomAccessFileM25312K0.write(bArr);
            randomAccessFileM25312K0.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileM25312K0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static Object m25329w0(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: J */
    public void m25331J(byte[] bArr) {
        m25332Q(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: Q */
    public synchronized void m25332Q(byte[] bArr, int i7, int i8) {
        int iM25320Z0;
        try {
            m25329w0(bArr, "buffer");
            if ((i7 | i8) < 0 || i8 > bArr.length - i7) {
                throw new IndexOutOfBoundsException();
            }
            m25325k0(i8);
            boolean zM25337p0 = m25337p0();
            if (zM25337p0) {
                iM25320Z0 = 16;
            } else {
                b bVar = this.f21792e;
                iM25320Z0 = m25320Z0(bVar.f21798a + 4 + bVar.f21799b);
            }
            b bVar2 = new b(iM25320Z0, i8);
            m25322b1(this.f21793f, 0, i8);
            m25318W0(bVar2.f21798a, this.f21793f, 0, 4);
            m25318W0(bVar2.f21798a + 4, bArr, i7, i8);
            m25321a1(this.f21789b, this.f21790c + 1, zM25337p0 ? bVar2.f21798a : this.f21791d.f21798a, bVar2.f21798a);
            this.f21792e = bVar2;
            this.f21790c++;
            if (zM25337p0) {
                this.f21791d = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: U0 */
    public synchronized void m25333U0() {
        try {
            if (m25337p0()) {
                throw new NoSuchElementException();
            }
            if (this.f21790c == 1) {
                m25335d0();
            } else {
                b bVar = this.f21791d;
                int iM25320Z0 = m25320Z0(bVar.f21798a + 4 + bVar.f21799b);
                m25317V0(iM25320Z0, this.f21793f, 0, 4);
                int iM25315S0 = m25315S0(this.f21793f, 0);
                m25321a1(this.f21789b, this.f21790c - 1, iM25320Z0, this.f21792e.f21798a);
                this.f21790c--;
                this.f21791d = new b(iM25320Z0, iM25315S0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public int m25334Y0() {
        if (this.f21790c == 0) {
            return 16;
        }
        b bVar = this.f21792e;
        int i7 = bVar.f21798a;
        int i8 = this.f21791d.f21798a;
        return i7 >= i8 ? (i7 - i8) + 4 + bVar.f21799b + 16 : (((i7 + 4) + bVar.f21799b) + this.f21789b) - i8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f21788a.close();
    }

    /* JADX INFO: renamed from: d0 */
    public synchronized void m25335d0() {
        try {
            m25321a1(4096, 0, 0, 0);
            this.f21790c = 0;
            b bVar = b.f21797c;
            this.f21791d = bVar;
            this.f21792e = bVar;
            if (this.f21789b > 4096) {
                m25319X0(4096);
            }
            this.f21789b = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public synchronized void m25336l0(d dVar) {
        int iM25320Z0 = this.f21791d.f21798a;
        for (int i7 = 0; i7 < this.f21790c; i7++) {
            b bVarM25313Q0 = m25313Q0(iM25320Z0);
            dVar.mo25338a(new c(this, bVarM25313Q0, null), bVarM25313Q0.f21799b);
            iM25320Z0 = m25320Z0(bVarM25313Q0.f21798a + 4 + bVarM25313Q0.f21799b);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public synchronized boolean m25337p0() {
        return this.f21790c == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f21789b);
        sb.append(", size=");
        sb.append(this.f21790c);
        sb.append(", first=");
        sb.append(this.f21791d);
        sb.append(", last=");
        sb.append(this.f21792e);
        sb.append(", element lengths=[");
        try {
            m25336l0(new a(sb));
        } catch (IOException e7) {
            f21787r.log(Level.WARNING, "read error", (Throwable) e7);
        }
        sb.append("]]");
        return sb.toString();
    }
}

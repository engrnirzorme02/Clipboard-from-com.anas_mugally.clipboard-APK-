package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: androidx.profileinstaller.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2731d {
    /* JADX INFO: renamed from: a */
    static int m12868a(int i7) {
        return ((i7 + 7) & (-8)) / 8;
    }

    /* JADX INFO: renamed from: b */
    static byte[] m12869b(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    static RuntimeException m12870c(String str) {
        return new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: d */
    static byte[] m12871d(InputStream inputStream, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int i9 = inputStream.read(bArr, i8, i7 - i8);
            if (i9 < 0) {
                throw m12870c("Not enough bytes to read: " + i7);
            }
            i8 += i9;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    static byte[] m12872e(InputStream inputStream, int i7, int i8) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i8];
            byte[] bArr2 = new byte[2048];
            int i9 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i9 < i7) {
                int i10 = inputStream.read(bArr2);
                if (i10 < 0) {
                    throw m12870c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i7 + " bytes");
                }
                inflater.setInput(bArr2, 0, i10);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i8 - iInflate);
                    i9 += i10;
                } catch (DataFormatException e7) {
                    throw m12870c(e7.getMessage());
                }
            }
            if (i9 == i7) {
                if (!inflater.finished()) {
                    throw m12870c("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw m12870c("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i9);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    static String m12873f(InputStream inputStream, int i7) {
        return new String(m12871d(inputStream, i7), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: g */
    static long m12874g(InputStream inputStream, int i7) throws IOException {
        byte[] bArrM12871d = m12871d(inputStream, i7);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 += ((long) (bArrM12871d[i8] & 255)) << (i8 * 8);
        }
        return j7;
    }

    /* JADX INFO: renamed from: h */
    static int m12875h(InputStream inputStream) {
        return (int) m12874g(inputStream, 2);
    }

    /* JADX INFO: renamed from: i */
    static long m12876i(InputStream inputStream) {
        return m12874g(inputStream, 4);
    }

    /* JADX INFO: renamed from: j */
    static int m12877j(InputStream inputStream) {
        return (int) m12874g(inputStream, 1);
    }

    /* JADX INFO: renamed from: k */
    static int m12878k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: renamed from: l */
    static void m12879l(InputStream inputStream, OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i7);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    static void m12880m(OutputStream outputStream, byte[] bArr) throws IOException {
        m12884q(outputStream, bArr.length);
        byte[] bArrM12869b = m12869b(bArr);
        m12884q(outputStream, bArrM12869b.length);
        outputStream.write(bArrM12869b);
    }

    /* JADX INFO: renamed from: n */
    static void m12881n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: o */
    static void m12882o(OutputStream outputStream, long j7, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j7 >> (i8 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: p */
    static void m12883p(OutputStream outputStream, int i7) throws IOException {
        m12882o(outputStream, i7, 2);
    }

    /* JADX INFO: renamed from: q */
    static void m12884q(OutputStream outputStream, long j7) throws IOException {
        m12882o(outputStream, j7, 4);
    }

    /* JADX INFO: renamed from: r */
    static void m12885r(OutputStream outputStream, int i7) throws IOException {
        m12882o(outputStream, i7, 1);
    }
}

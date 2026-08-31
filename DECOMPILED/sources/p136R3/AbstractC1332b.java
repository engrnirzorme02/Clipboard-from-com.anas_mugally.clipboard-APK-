package p136R3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import p122P3.AbstractC1209m;
import p143S3.AbstractC1413a;

/* JADX INFO: renamed from: R3.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1332b {

    /* JADX INFO: renamed from: a */
    private static final OutputStream f4658a = new a();

    /* JADX INFO: renamed from: R3.b$a */
    class a extends OutputStream {
        a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            AbstractC1209m.m5302n(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) {
            AbstractC1209m.m5302n(bArr);
            AbstractC1209m.m5307s(i7, i8 + i7, bArr.length);
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m5712a(Queue queue, int i7) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i7) {
            return bArr;
        }
        int length = i7 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i7);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i7 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: b */
    public static long m5713b(InputStream inputStream, OutputStream outputStream) throws IOException {
        AbstractC1209m.m5302n(inputStream);
        AbstractC1209m.m5302n(outputStream);
        byte[] bArrM5714c = m5714c();
        long j7 = 0;
        while (true) {
            int i7 = inputStream.read(bArrM5714c);
            if (i7 == -1) {
                return j7;
            }
            outputStream.write(bArrM5714c, 0, i7);
            j7 += (long) i7;
        }
    }

    /* JADX INFO: renamed from: c */
    static byte[] m5714c() {
        return new byte[8192];
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m5715d(InputStream inputStream) {
        AbstractC1209m.m5302n(inputStream);
        return m5716e(inputStream, new ArrayDeque(20), 0);
    }

    /* JADX INFO: renamed from: e */
    private static byte[] m5716e(InputStream inputStream, Queue queue, int i7) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i7) * 2));
        while (i7 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i7);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i8 = 0;
            while (i8 < iMin2) {
                int i9 = inputStream.read(bArr, i8, iMin2 - i8);
                if (i9 == -1) {
                    return m5712a(queue, i7);
                }
                i8 += i9;
                i7 += i9;
            }
            iMin = AbstractC1413a.m6006e(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return m5712a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}

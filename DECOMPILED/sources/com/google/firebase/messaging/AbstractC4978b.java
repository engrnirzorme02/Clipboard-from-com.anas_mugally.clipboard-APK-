package com.google.firebase.messaging;

import com.google.android.gms.common.api.C3553a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: renamed from: com.google.firebase.messaging.b */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC4978b {
    /* JADX INFO: renamed from: a */
    private static byte[] m22443a(Queue queue, int i7) {
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
    public static InputStream m22444b(InputStream inputStream, long j7) {
        return new a(inputStream, j7);
    }

    /* JADX INFO: renamed from: c */
    private static int m22445c(long j7) {
        if (j7 > 2147483647L) {
            return C3553a.e.API_PRIORITY_OTHER;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m22446d(InputStream inputStream) {
        return m22447e(inputStream, new ArrayDeque(20), 0);
    }

    /* JADX INFO: renamed from: e */
    private static byte[] m22447e(InputStream inputStream, Queue queue, int i7) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i7) * 2));
        while (i7 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i7);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i8 = 0;
            while (i8 < iMin2) {
                int i9 = inputStream.read(bArr, i8, iMin2 - i8);
                if (i9 == -1) {
                    return m22443a(queue, i7);
                }
                i8 += i9;
                i7 += i9;
            }
            iMin = m22445c(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return m22443a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.b$a */
    private static final class a extends FilterInputStream {

        /* JADX INFO: renamed from: a */
        private long f18903a;

        /* JADX INFO: renamed from: b */
        private long f18904b;

        a(InputStream inputStream, long j7) {
            super(inputStream);
            this.f18904b = -1L;
            this.f18903a = j7;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f18903a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i7) {
            ((FilterInputStream) this).in.mark(i7);
            this.f18904b = this.f18903a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f18903a == 0) {
                return -1;
            }
            int i7 = ((FilterInputStream) this).in.read();
            if (i7 != -1) {
                this.f18903a--;
            }
            return i7;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f18904b == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f18903a = this.f18904b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j7) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j7, this.f18903a));
            this.f18903a -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) throws IOException {
            long j7 = this.f18903a;
            if (j7 == 0) {
                return -1;
            }
            int i9 = ((FilterInputStream) this).in.read(bArr, i7, (int) Math.min(i8, j7));
            if (i9 != -1) {
                this.f18903a -= (long) i9;
            }
            return i9;
        }
    }
}

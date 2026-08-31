package p038E4;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: E4.i */
/* JADX INFO: loaded from: classes.dex */
class C0390i {

    /* JADX INFO: renamed from: a */
    private BlockingQueue f1575a;

    /* JADX INFO: renamed from: e */
    private C0384c f1579e;

    /* JADX INFO: renamed from: f */
    private WritableByteChannel f1580f;

    /* JADX INFO: renamed from: b */
    private final Random f1576b = new Random();

    /* JADX INFO: renamed from: c */
    private volatile boolean f1577c = false;

    /* JADX INFO: renamed from: d */
    private boolean f1578d = false;

    /* JADX INFO: renamed from: g */
    private final Thread f1581g = C0384c.m1625j().newThread(new a());

    /* JADX INFO: renamed from: E4.i$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0390i.this.m1663f();
        }
    }

    C0390i(C0384c c0384c, String str, int i7) {
        C0384c.m1624i().mo1620a(m1665d(), str + "Writer-" + i7);
        this.f1579e = c0384c;
        this.f1575a = new LinkedBlockingQueue();
    }

    /* JADX INFO: renamed from: b */
    private ByteBuffer m1660b(byte b7, boolean z7, byte[] bArr) {
        int i7 = z7 ? 6 : 2;
        int length = bArr.length;
        if (length >= 126) {
            i7 = length <= 65535 ? i7 + 2 : i7 + 8;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + i7);
        byteBufferAllocate.put((byte) (b7 | (-128)));
        if (length < 126) {
            if (z7) {
                length |= 128;
            }
            byteBufferAllocate.put((byte) length);
        } else if (length <= 65535) {
            byteBufferAllocate.put((byte) (z7 ? 254 : 126));
            byteBufferAllocate.putShort((short) length);
        } else {
            byteBufferAllocate.put((byte) (z7 ? 255 : 127));
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(length);
        }
        if (z7) {
            byte[] bArrM1661c = m1661c();
            byteBufferAllocate.put(bArrM1661c);
            for (int i8 = 0; i8 < bArr.length; i8++) {
                byteBufferAllocate.put((byte) (bArr[i8] ^ bArrM1661c[i8 % 4]));
            }
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: c */
    private byte[] m1661c() {
        byte[] bArr = new byte[4];
        this.f1576b.nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    private void m1662e(C0386e c0386e) {
        this.f1579e.m1634k(c0386e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m1663f() {
        while (!this.f1577c && !Thread.interrupted()) {
            try {
                m1664j();
            } catch (IOException e7) {
                m1662e(new C0386e("IO Exception", e7));
                return;
            } catch (InterruptedException unused) {
                return;
            }
        }
        for (int i7 = 0; i7 < this.f1575a.size(); i7++) {
            m1664j();
        }
    }

    /* JADX INFO: renamed from: j */
    private void m1664j() throws IOException {
        this.f1580f.write((ByteBuffer) this.f1575a.take());
    }

    /* JADX INFO: renamed from: d */
    Thread m1665d() {
        return this.f1581g;
    }

    /* JADX INFO: renamed from: g */
    synchronized void m1666g(byte b7, boolean z7, byte[] bArr) {
        try {
            ByteBuffer byteBufferM1660b = m1660b(b7, z7, bArr);
            if (this.f1577c && (this.f1578d || b7 != 8)) {
                throw new C0386e("Shouldn't be sending");
            }
            if (b7 == 8) {
                this.f1578d = true;
            }
            this.f1575a.add(byteBufferM1660b);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    void m1667h(OutputStream outputStream) {
        this.f1580f = Channels.newChannel(outputStream);
    }

    /* JADX INFO: renamed from: i */
    void m1668i() {
        this.f1577c = true;
    }
}

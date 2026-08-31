package p252g4;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: g4.h */
/* JADX INFO: loaded from: classes.dex */
class C5498h {

    /* JADX INFO: renamed from: b */
    private static final String f20845b = AbstractC5499i.m24781A(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* JADX INFO: renamed from: c */
    private static final AtomicLong f20846c = new AtomicLong(0);

    /* JADX INFO: renamed from: a */
    private final String f20847a;

    C5498h() {
        byte[] bArr = new byte[10];
        m24779f(bArr);
        m24778e(bArr);
        m24777d(bArr);
        String strM24803u = AbstractC5499i.m24803u(bArr);
        Locale locale = Locale.US;
        this.f20847a = String.format(locale, "%s%s%s%s", strM24803u.substring(0, 12), strM24803u.substring(12, 16), strM24803u.subSequence(16, 20), f20845b.substring(0, 12)).toUpperCase(locale);
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m24775a(long j7) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j7);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m24776b(long j7) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j7);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: d */
    private void m24777d(byte[] bArr) {
        byte[] bArrM24776b = m24776b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = bArrM24776b[0];
        bArr[9] = bArrM24776b[1];
    }

    /* JADX INFO: renamed from: e */
    private void m24778e(byte[] bArr) {
        byte[] bArrM24776b = m24776b(f20846c.incrementAndGet());
        bArr[6] = bArrM24776b[0];
        bArr[7] = bArrM24776b[1];
    }

    /* JADX INFO: renamed from: f */
    private void m24779f(byte[] bArr) {
        long time = new Date().getTime();
        byte[] bArrM24775a = m24775a(time / 1000);
        bArr[0] = bArrM24775a[0];
        bArr[1] = bArrM24775a[1];
        bArr[2] = bArrM24775a[2];
        bArr[3] = bArrM24775a[3];
        byte[] bArrM24776b = m24776b(time % 1000);
        bArr[4] = bArrM24776b[0];
        bArr[5] = bArrM24776b[1];
    }

    /* JADX INFO: renamed from: c */
    public String m24780c() {
        return this.f20847a;
    }

    public String toString() {
        return this.f20847a;
    }
}

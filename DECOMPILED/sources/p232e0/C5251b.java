package p232e0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: e0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5251b extends AbstractC5252c {
    /* JADX INFO: renamed from: h */
    public static C5251b m24256h(ByteBuffer byteBuffer) {
        return m24257i(byteBuffer, new C5251b());
    }

    /* JADX INFO: renamed from: i */
    public static C5251b m24257i(ByteBuffer byteBuffer, C5251b c5251b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c5251b.m24258f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* JADX INFO: renamed from: f */
    public C5251b m24258f(int i7, ByteBuffer byteBuffer) {
        m24259g(i7, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m24259g(int i7, ByteBuffer byteBuffer) {
        m24265c(i7, byteBuffer);
    }

    /* JADX INFO: renamed from: j */
    public C5250a m24260j(C5250a c5250a, int i7) {
        int iM24264b = m24264b(6);
        if (iM24264b != 0) {
            return c5250a.m24247f(m24263a(m24266d(iM24264b) + (i7 * 4)), this.f20003b);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public int m24261k() {
        int iM24264b = m24264b(6);
        if (iM24264b != 0) {
            return m24267e(iM24264b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public int m24262l() {
        int iM24264b = m24264b(4);
        if (iM24264b != 0) {
            return this.f20003b.getInt(iM24264b + this.f20002a);
        }
        return 0;
    }
}

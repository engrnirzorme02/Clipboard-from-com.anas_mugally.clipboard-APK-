package p232e0;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: e0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5250a extends AbstractC5252c {
    /* JADX INFO: renamed from: f */
    public C5250a m24247f(int i7, ByteBuffer byteBuffer) {
        m24248g(i7, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m24248g(int i7, ByteBuffer byteBuffer) {
        m24265c(i7, byteBuffer);
    }

    /* JADX INFO: renamed from: h */
    public int m24249h(int i7) {
        int iM24264b = m24264b(16);
        if (iM24264b != 0) {
            return this.f20003b.getInt(m24266d(iM24264b) + (i7 * 4));
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public int m24250i() {
        int iM24264b = m24264b(16);
        if (iM24264b != 0) {
            return m24267e(iM24264b);
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public boolean m24251j() {
        int iM24264b = m24264b(6);
        return (iM24264b == 0 || this.f20003b.get(iM24264b + this.f20002a) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public short m24252k() {
        int iM24264b = m24264b(14);
        if (iM24264b != 0) {
            return this.f20003b.getShort(iM24264b + this.f20002a);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: l */
    public int m24253l() {
        int iM24264b = m24264b(4);
        if (iM24264b != 0) {
            return this.f20003b.getInt(iM24264b + this.f20002a);
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public short m24254m() {
        int iM24264b = m24264b(8);
        if (iM24264b != 0) {
            return this.f20003b.getShort(iM24264b + this.f20002a);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: n */
    public short m24255n() {
        int iM24264b = m24264b(12);
        if (iM24264b != 0) {
            return this.f20003b.getShort(iM24264b + this.f20002a);
        }
        return (short) 0;
    }
}

package p038E4;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: E4.h */
/* JADX INFO: loaded from: classes.dex */
class C0389h {

    /* JADX INFO: renamed from: b */
    private C0384c f1570b;

    /* JADX INFO: renamed from: e */
    private AbstractC0382a.b f1573e;

    /* JADX INFO: renamed from: a */
    private DataInputStream f1569a = null;

    /* JADX INFO: renamed from: c */
    private InterfaceC0385d f1571c = null;

    /* JADX INFO: renamed from: d */
    private byte[] f1572d = new byte[112];

    /* JADX INFO: renamed from: f */
    private volatile boolean f1574f = false;

    C0389h(C0384c c0384c) {
        this.f1570b = null;
        this.f1570b = c0384c;
    }

    /* JADX INFO: renamed from: a */
    private void m1651a(boolean z7, byte b7, byte[] bArr) {
        if (b7 == 9) {
            if (!z7) {
                throw new C0386e("PING must not fragment across frames");
            }
            m1653c(bArr);
            return;
        }
        AbstractC0382a.b bVar = this.f1573e;
        if (bVar != null && b7 != 0) {
            throw new C0386e("Failed to continue outstanding frame");
        }
        if (bVar == null && b7 == 0) {
            throw new C0386e("Received continuing frame, but there's nothing to continue");
        }
        if (bVar == null) {
            this.f1573e = AbstractC0382a.m1614a(b7);
        }
        if (!this.f1573e.mo1615a(bArr)) {
            throw new C0386e("Failed to decode frame");
        }
        if (z7) {
            C0388g c0388gMo1616b = this.f1573e.mo1616b();
            this.f1573e = null;
            if (c0388gMo1616b == null) {
                throw new C0386e("Failed to decode whole message");
            }
            this.f1571c.mo1643f(c0388gMo1616b);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m1652b(C0386e c0386e) {
        m1658h();
        this.f1570b.m1634k(c0386e);
    }

    /* JADX INFO: renamed from: c */
    private void m1653c(byte[] bArr) {
        if (bArr.length > 125) {
            throw new C0386e("PING frame too long");
        }
        this.f1570b.m1636m(bArr);
    }

    /* JADX INFO: renamed from: d */
    private long m1654d(byte[] bArr, int i7) {
        return (((long) bArr[i7]) << 56) + (((long) (bArr[i7 + 1] & 255)) << 48) + (((long) (bArr[i7 + 2] & 255)) << 40) + (((long) (bArr[i7 + 3] & 255)) << 32) + (((long) (bArr[i7 + 4] & 255)) << 24) + ((long) ((bArr[i7 + 5] & 255) << 16)) + ((long) ((bArr[i7 + 6] & 255) << 8)) + ((long) (bArr[i7 + 7] & 255));
    }

    /* JADX INFO: renamed from: e */
    private int m1655e(byte[] bArr, int i7, int i8) throws IOException {
        this.f1569a.readFully(bArr, i7, i8);
        return i8;
    }

    /* JADX INFO: renamed from: f */
    void m1656f() {
        long jM1654d;
        this.f1571c = this.f1570b.m1632g();
        while (!this.f1574f) {
            try {
                int iM1655e = m1655e(this.f1572d, 0, 1);
                byte[] bArr = this.f1572d;
                byte b7 = bArr[0];
                boolean z7 = (b7 & 128) != 0;
                if ((b7 & 112) != 0) {
                    throw new C0386e("Invalid frame received");
                }
                byte b8 = (byte) (b7 & 15);
                int iM1655e2 = iM1655e + m1655e(bArr, iM1655e, 1);
                byte[] bArr2 = this.f1572d;
                byte b9 = bArr2[1];
                if (b9 < 126) {
                    jM1654d = b9;
                } else if (b9 == 126) {
                    m1655e(bArr2, iM1655e2, 2);
                    byte[] bArr3 = this.f1572d;
                    jM1654d = (((long) (bArr3[2] & 255)) << 8) | ((long) (bArr3[3] & 255));
                } else if (b9 == 127) {
                    jM1654d = m1654d(this.f1572d, (iM1655e2 + m1655e(bArr2, iM1655e2, 8)) - 8);
                } else {
                    jM1654d = 0;
                }
                int i7 = (int) jM1654d;
                byte[] bArr4 = new byte[i7];
                m1655e(bArr4, 0, i7);
                if (b8 == 8) {
                    this.f1570b.m1635l();
                } else if (b8 != 10) {
                    if (b8 != 1 && b8 != 2 && b8 != 9 && b8 != 0) {
                        throw new C0386e("Unsupported opcode: " + ((int) b8));
                    }
                    m1651a(z7, b8, bArr4);
                }
            } catch (C0386e e7) {
                m1652b(e7);
            } catch (SocketTimeoutException unused) {
            } catch (IOException e8) {
                m1652b(new C0386e("IO Error", e8));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    void m1657g(DataInputStream dataInputStream) {
        this.f1569a = dataInputStream;
    }

    /* JADX INFO: renamed from: h */
    void m1658h() {
        this.f1574f = true;
    }
}

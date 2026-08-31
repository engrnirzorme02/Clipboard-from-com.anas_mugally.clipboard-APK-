package p011B1;

import android.util.Log;
import com.google.android.gms.common.api.C3553a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: B1.d */
/* JADX INFO: loaded from: classes.dex */
public class C0058d {

    /* JADX INFO: renamed from: b */
    private ByteBuffer f412b;

    /* JADX INFO: renamed from: c */
    private C0057c f413c;

    /* JADX INFO: renamed from: a */
    private final byte[] f411a = new byte[256];

    /* JADX INFO: renamed from: d */
    private int f414d = 0;

    /* JADX INFO: renamed from: b */
    private boolean m225b() {
        return this.f413c.f399b != 0;
    }

    /* JADX INFO: renamed from: d */
    private int m226d() {
        try {
            return this.f412b.get() & 255;
        } catch (Exception unused) {
            this.f413c.f399b = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m227e() {
        this.f413c.f401d.f387a = m236n();
        this.f413c.f401d.f388b = m236n();
        this.f413c.f401d.f389c = m236n();
        this.f413c.f401d.f390d = m236n();
        int iM226d = m226d();
        boolean z7 = (iM226d & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM226d & 7) + 1);
        C0056b c0056b = this.f413c.f401d;
        c0056b.f391e = (iM226d & 64) != 0;
        if (z7) {
            c0056b.f397k = m229g(iPow);
        } else {
            c0056b.f397k = null;
        }
        this.f413c.f401d.f396j = this.f412b.position();
        m239r();
        if (m225b()) {
            return;
        }
        C0057c c0057c = this.f413c;
        c0057c.f400c++;
        c0057c.f402e.add(c0057c.f401d);
    }

    /* JADX INFO: renamed from: f */
    private void m228f() {
        int iM226d = m226d();
        this.f414d = iM226d;
        if (iM226d <= 0) {
            return;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            try {
                int i9 = this.f414d;
                if (i7 >= i9) {
                    return;
                }
                i8 = i9 - i7;
                this.f412b.get(this.f411a, i7, i8);
                i7 += i8;
            } catch (Exception e7) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i7 + " count: " + i8 + " blockSize: " + this.f414d, e7);
                }
                this.f413c.f399b = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private int[] m229g(int i7) {
        byte[] bArr = new byte[i7 * 3];
        int[] iArr = null;
        try {
            this.f412b.get(bArr);
            iArr = new int[256];
            int i8 = 0;
            int i9 = 0;
            while (i8 < i7) {
                int i10 = bArr[i9] & 255;
                int i11 = i9 + 2;
                int i12 = bArr[i9 + 1] & 255;
                i9 += 3;
                int i13 = i8 + 1;
                iArr[i8] = (i12 << 8) | (i10 << 16) | (-16777216) | (bArr[i11] & 255);
                i8 = i13;
            }
            return iArr;
        } catch (BufferUnderflowException e7) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e7);
            }
            this.f413c.f399b = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m230h() {
        m231i(C3553a.e.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: i */
    private void m231i(int i7) {
        boolean z7 = false;
        while (!z7 && !m225b() && this.f413c.f400c <= i7) {
            int iM226d = m226d();
            if (iM226d == 33) {
                int iM226d2 = m226d();
                if (iM226d2 == 1) {
                    m238q();
                } else if (iM226d2 == 249) {
                    this.f413c.f401d = new C0056b();
                    m232j();
                } else if (iM226d2 == 254) {
                    m238q();
                } else if (iM226d2 != 255) {
                    m238q();
                } else {
                    m228f();
                    StringBuilder sb = new StringBuilder();
                    for (int i8 = 0; i8 < 11; i8++) {
                        sb.append((char) this.f411a[i8]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m235m();
                    } else {
                        m238q();
                    }
                }
            } else if (iM226d == 44) {
                C0057c c0057c = this.f413c;
                if (c0057c.f401d == null) {
                    c0057c.f401d = new C0056b();
                }
                m227e();
            } else if (iM226d != 59) {
                this.f413c.f399b = 1;
            } else {
                z7 = true;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private void m232j() {
        m226d();
        int iM226d = m226d();
        C0056b c0056b = this.f413c.f401d;
        int i7 = (iM226d & 28) >> 2;
        c0056b.f393g = i7;
        if (i7 == 0) {
            c0056b.f393g = 1;
        }
        c0056b.f392f = (iM226d & 1) != 0;
        int iM236n = m236n();
        if (iM236n < 2) {
            iM236n = 10;
        }
        C0056b c0056b2 = this.f413c.f401d;
        c0056b2.f395i = iM236n * 10;
        c0056b2.f394h = m226d();
        m226d();
    }

    /* JADX INFO: renamed from: k */
    private void m233k() {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < 6; i7++) {
            sb.append((char) m226d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f413c.f399b = 1;
            return;
        }
        m234l();
        if (!this.f413c.f405h || m225b()) {
            return;
        }
        C0057c c0057c = this.f413c;
        c0057c.f398a = m229g(c0057c.f406i);
        C0057c c0057c2 = this.f413c;
        c0057c2.f409l = c0057c2.f398a[c0057c2.f407j];
    }

    /* JADX INFO: renamed from: l */
    private void m234l() {
        this.f413c.f403f = m236n();
        this.f413c.f404g = m236n();
        int iM226d = m226d();
        C0057c c0057c = this.f413c;
        c0057c.f405h = (iM226d & 128) != 0;
        c0057c.f406i = (int) Math.pow(2.0d, (iM226d & 7) + 1);
        this.f413c.f407j = m226d();
        this.f413c.f408k = m226d();
    }

    /* JADX INFO: renamed from: m */
    private void m235m() {
        do {
            m228f();
            byte[] bArr = this.f411a;
            if (bArr[0] == 1) {
                this.f413c.f410m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f414d <= 0) {
                return;
            }
        } while (!m225b());
    }

    /* JADX INFO: renamed from: n */
    private int m236n() {
        return this.f412b.getShort();
    }

    /* JADX INFO: renamed from: o */
    private void m237o() {
        this.f412b = null;
        Arrays.fill(this.f411a, (byte) 0);
        this.f413c = new C0057c();
        this.f414d = 0;
    }

    /* JADX INFO: renamed from: q */
    private void m238q() {
        int iM226d;
        do {
            iM226d = m226d();
            this.f412b.position(Math.min(this.f412b.position() + iM226d, this.f412b.limit()));
        } while (iM226d > 0);
    }

    /* JADX INFO: renamed from: r */
    private void m239r() {
        m226d();
        m238q();
    }

    /* JADX INFO: renamed from: a */
    public void m240a() {
        this.f412b = null;
        this.f413c = null;
    }

    /* JADX INFO: renamed from: c */
    public C0057c m241c() {
        if (this.f412b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m225b()) {
            return this.f413c;
        }
        m233k();
        if (!m225b()) {
            m230h();
            C0057c c0057c = this.f413c;
            if (c0057c.f400c < 0) {
                c0057c.f399b = 1;
            }
        }
        return this.f413c;
    }

    /* JADX INFO: renamed from: p */
    public C0058d m242p(ByteBuffer byteBuffer) {
        m237o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f412b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f412b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}

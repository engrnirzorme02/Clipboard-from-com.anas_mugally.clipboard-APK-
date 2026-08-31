package p144S4;

import com.google.protobuf.AbstractC5104i;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: S4.g */
/* JADX INFO: loaded from: classes.dex */
public class C1422g {

    /* JADX INFO: renamed from: c */
    private static final byte[][] f4940c = {new byte[]{0, 0}, new byte[]{-128, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, -128}, new byte[]{-1, -64}};

    /* JADX INFO: renamed from: b */
    private int f4942b = 0;

    /* JADX INFO: renamed from: a */
    private byte[] f4941a = new byte[1024];

    /* JADX INFO: renamed from: b */
    private void m6037b(int i7) {
        int i8 = i7 + this.f4942b;
        byte[] bArr = this.f4941a;
        if (i8 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i8) {
            i8 = length;
        }
        this.f4941a = Arrays.copyOf(bArr, i8);
    }

    /* JADX INFO: renamed from: d */
    private int m6038d(long j7) {
        if (j7 < 0) {
            j7 = ~j7;
        }
        return AbstractC1421f.m6036a(65 - Long.numberOfLeadingZeros(j7), 7, RoundingMode.UP);
    }

    /* JADX INFO: renamed from: e */
    private int m6039e(long j7) {
        return AbstractC1421f.m6036a(64 - Long.numberOfLeadingZeros(j7), 8, RoundingMode.UP);
    }

    /* JADX INFO: renamed from: f */
    private void m6040f(byte b7) {
        if (b7 == 0) {
            m6042l((byte) 0);
            m6042l((byte) -1);
        } else if (b7 != -1) {
            m6042l(b7);
        } else {
            m6042l((byte) -1);
            m6042l((byte) 0);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m6041g(byte b7) {
        if (b7 == 0) {
            m6043m((byte) 0);
            m6043m((byte) -1);
        } else if (b7 != -1) {
            m6043m(b7);
        } else {
            m6043m((byte) -1);
            m6043m((byte) 0);
        }
    }

    /* JADX INFO: renamed from: l */
    private void m6042l(byte b7) {
        m6037b(1);
        byte[] bArr = this.f4941a;
        int i7 = this.f4942b;
        this.f4942b = i7 + 1;
        bArr[i7] = b7;
    }

    /* JADX INFO: renamed from: m */
    private void m6043m(byte b7) {
        m6037b(1);
        byte[] bArr = this.f4941a;
        int i7 = this.f4942b;
        this.f4942b = i7 + 1;
        bArr[i7] = (byte) (~b7);
    }

    /* JADX INFO: renamed from: p */
    private void m6044p() {
        m6042l((byte) 0);
        m6042l((byte) 1);
    }

    /* JADX INFO: renamed from: q */
    private void m6045q() {
        m6043m((byte) 0);
        m6043m((byte) 1);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m6046a() {
        return Arrays.copyOf(this.f4941a, this.f4942b);
    }

    /* JADX INFO: renamed from: c */
    public void m6047c(byte[] bArr) {
        m6037b(bArr.length);
        for (byte b7 : bArr) {
            byte[] bArr2 = this.f4941a;
            int i7 = this.f4942b;
            this.f4942b = i7 + 1;
            bArr2[i7] = b7;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m6048h(AbstractC5104i abstractC5104i) {
        for (int i7 = 0; i7 < abstractC5104i.size(); i7++) {
            m6040f(abstractC5104i.mo23093g(i7));
        }
        m6044p();
    }

    /* JADX INFO: renamed from: i */
    public void m6049i(AbstractC5104i abstractC5104i) {
        for (int i7 = 0; i7 < abstractC5104i.size(); i7++) {
            m6041g(abstractC5104i.mo23093g(i7));
        }
        m6045q();
    }

    /* JADX INFO: renamed from: j */
    public void m6050j(double d7) {
        long jDoubleToLongBits = Double.doubleToLongBits(d7);
        m6056t(jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    /* JADX INFO: renamed from: k */
    public void m6051k(double d7) {
        long jDoubleToLongBits = Double.doubleToLongBits(d7);
        m6057u(jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE));
    }

    /* JADX INFO: renamed from: n */
    public void m6052n() {
        m6042l((byte) -1);
        m6042l((byte) -1);
    }

    /* JADX INFO: renamed from: o */
    public void m6053o() {
        m6043m((byte) -1);
        m6043m((byte) -1);
    }

    /* JADX INFO: renamed from: r */
    public void m6054r(long j7) {
        int i7;
        long j8 = j7 < 0 ? ~j7 : j7;
        if (j8 < 64) {
            m6037b(1);
            byte[] bArr = this.f4941a;
            int i8 = this.f4942b;
            this.f4942b = i8 + 1;
            bArr[i8] = (byte) (j7 ^ ((long) f4940c[1][0]));
            return;
        }
        int iM6038d = m6038d(j8);
        m6037b(iM6038d);
        if (iM6038d < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(iM6038d)));
        }
        byte b7 = j7 < 0 ? (byte) -1 : (byte) 0;
        int i9 = this.f4942b;
        if (iM6038d == 10) {
            i7 = i9 + 2;
            byte[] bArr2 = this.f4941a;
            bArr2[i9] = b7;
            bArr2[i9 + 1] = b7;
        } else if (iM6038d == 9) {
            i7 = i9 + 1;
            this.f4941a[i9] = b7;
        } else {
            i7 = i9;
        }
        for (int i10 = (iM6038d - 1) + i9; i10 >= i7; i10--) {
            this.f4941a[i10] = (byte) (255 & j7);
            j7 >>= 8;
        }
        byte[] bArr3 = this.f4941a;
        int i11 = this.f4942b;
        byte b8 = bArr3[i11];
        byte[] bArr4 = f4940c[iM6038d];
        bArr3[i11] = (byte) (b8 ^ bArr4[0]);
        int i12 = i11 + 1;
        bArr3[i12] = (byte) (bArr4[1] ^ bArr3[i12]);
        this.f4942b = i11 + iM6038d;
    }

    /* JADX INFO: renamed from: s */
    public void m6055s(long j7) {
        m6054r(~j7);
    }

    /* JADX INFO: renamed from: t */
    public void m6056t(long j7) {
        int iM6039e = m6039e(j7);
        m6037b(iM6039e + 1);
        byte[] bArr = this.f4941a;
        int i7 = this.f4942b;
        int i8 = i7 + 1;
        this.f4942b = i8;
        bArr[i7] = (byte) iM6039e;
        int i9 = i8 + iM6039e;
        while (true) {
            i9--;
            int i10 = this.f4942b;
            if (i9 < i10) {
                this.f4942b = i10 + iM6039e;
                return;
            } else {
                this.f4941a[i9] = (byte) (255 & j7);
                j7 >>>= 8;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m6057u(long j7) {
        int iM6039e = m6039e(j7);
        m6037b(iM6039e + 1);
        byte[] bArr = this.f4941a;
        int i7 = this.f4942b;
        int i8 = i7 + 1;
        this.f4942b = i8;
        bArr[i7] = (byte) (~iM6039e);
        int i9 = i8 + iM6039e;
        while (true) {
            i9--;
            int i10 = this.f4942b;
            if (i9 < i10) {
                this.f4942b = i10 + iM6039e;
                return;
            } else {
                this.f4941a[i9] = (byte) (~(255 & j7));
                j7 >>>= 8;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m6058v(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length) {
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt < 128) {
                m6040f((byte) cCharAt);
            } else if (cCharAt < 2048) {
                m6040f((byte) ((cCharAt >>> 6) | 960));
                m6040f((byte) ((cCharAt & '?') | 128));
            } else if (cCharAt < 55296 || 57343 < cCharAt) {
                m6040f((byte) ((cCharAt >>> '\f') | 480));
                m6040f((byte) (((cCharAt >>> 6) & 63) | 128));
                m6040f((byte) ((cCharAt & '?') | 128));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i7);
                i7++;
                m6040f((byte) ((iCodePointAt >>> 18) | 240));
                m6040f((byte) (((iCodePointAt >>> 12) & 63) | 128));
                m6040f((byte) (((iCodePointAt >>> 6) & 63) | 128));
                m6040f((byte) ((iCodePointAt & 63) | 128));
            }
            i7++;
        }
        m6044p();
    }

    /* JADX INFO: renamed from: w */
    public void m6059w(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length) {
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt < 128) {
                m6041g((byte) cCharAt);
            } else if (cCharAt < 2048) {
                m6041g((byte) ((cCharAt >>> 6) | 960));
                m6041g((byte) ((cCharAt & '?') | 128));
            } else if (cCharAt < 55296 || 57343 < cCharAt) {
                m6041g((byte) ((cCharAt >>> '\f') | 480));
                m6041g((byte) (((cCharAt >>> 6) & 63) | 128));
                m6041g((byte) ((cCharAt & '?') | 128));
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i7);
                i7++;
                m6041g((byte) ((iCodePointAt >>> 18) | 240));
                m6041g((byte) (((iCodePointAt >>> 12) & 63) | 128));
                m6041g((byte) (((iCodePointAt >>> 6) & 63) | 128));
                m6041g((byte) ((iCodePointAt & 63) | 128));
            }
            i7++;
        }
        m6045q();
    }
}

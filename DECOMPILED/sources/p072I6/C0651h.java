package p072I6;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p080J6.AbstractC0707b;
import p152T5.AbstractC1631j;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: I6.h */
/* JADX INFO: loaded from: classes.dex */
public class C0651h implements Serializable, Comparable {

    /* JADX INFO: renamed from: d */
    public static final a f2562d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final C0651h f2563e = new C0651h(new byte[0]);

    /* JADX INFO: renamed from: a */
    private final byte[] f2564a;

    /* JADX INFO: renamed from: b */
    private transient int f2565b;

    /* JADX INFO: renamed from: c */
    private transient String f2566c;

    /* JADX INFO: renamed from: I6.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ C0651h m3110g(a aVar, byte[] bArr, int i7, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i7 = 0;
            }
            if ((i9 & 2) != 0) {
                i8 = AbstractC0645b.m2969c();
            }
            return aVar.m3116f(bArr, i7, i8);
        }

        /* JADX INFO: renamed from: a */
        public final C0651h m3111a(String str) {
            AbstractC6118n.m27187e(str, "<this>");
            byte[] bArrM2964a = AbstractC0644a.m2964a(str);
            if (bArrM2964a != null) {
                return new C0651h(bArrM2964a);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final C0651h m3112b(String str) {
            AbstractC6118n.m27187e(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = i7 * 2;
                bArr[i7] = (byte) ((AbstractC0707b.m3446e(str.charAt(i8)) << 4) + AbstractC0707b.m3446e(str.charAt(i8 + 1)));
            }
            return new C0651h(bArr);
        }

        /* JADX INFO: renamed from: c */
        public final C0651h m3113c(String str, Charset charset) {
            AbstractC6118n.m27187e(str, "<this>");
            AbstractC6118n.m27187e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            AbstractC6118n.m27186d(bytes, "this as java.lang.String).getBytes(charset)");
            return new C0651h(bytes);
        }

        /* JADX INFO: renamed from: d */
        public final C0651h m3114d(String str) {
            AbstractC6118n.m27187e(str, "<this>");
            C0651h c0651h = new C0651h(AbstractC0643E.m2962a(str));
            c0651h.m3087B(str);
            return c0651h;
        }

        /* JADX INFO: renamed from: e */
        public final C0651h m3115e(byte... data) {
            AbstractC6118n.m27187e(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            AbstractC6118n.m27186d(bArrCopyOf, "copyOf(this, size)");
            return new C0651h(bArrCopyOf);
        }

        /* JADX INFO: renamed from: f */
        public final C0651h m3116f(byte[] bArr, int i7, int i8) {
            AbstractC6118n.m27187e(bArr, "<this>");
            int iM2972f = AbstractC0645b.m2972f(bArr, i8);
            AbstractC0645b.m2968b(bArr.length, i7, iM2972f);
            return new C0651h(AbstractC1631j.m6698k(bArr, i7, iM2972f + i7));
        }

        private a() {
        }
    }

    public C0651h(byte[] data) {
        AbstractC6118n.m27187e(data, "data");
        this.f2564a = data;
    }

    /* JADX INFO: renamed from: j */
    public static final C0651h m3084j(String str) {
        return f2562d.m3114d(str);
    }

    /* JADX INFO: renamed from: x */
    public static final C0651h m3085x(byte... bArr) {
        return f2562d.m3115e(bArr);
    }

    /* JADX INFO: renamed from: A */
    public final void m3086A(int i7) {
        this.f2565b = i7;
    }

    /* JADX INFO: renamed from: B */
    public final void m3087B(String str) {
        this.f2566c = str;
    }

    /* JADX INFO: renamed from: C */
    public final C0651h m3088C() {
        return mo3098h("SHA-1");
    }

    /* JADX INFO: renamed from: D */
    public final C0651h m3089D() {
        return mo3098h("SHA-256");
    }

    /* JADX INFO: renamed from: F */
    public final int m3090F() {
        return mo3102o();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m3091I(C0651h prefix) {
        AbstractC6118n.m27187e(prefix, "prefix");
        return mo3108y(0, prefix, 0, prefix.m3090F());
    }

    /* JADX INFO: renamed from: J */
    public C0651h mo3092J() {
        for (int i7 = 0; i7 < m3100m().length; i7++) {
            byte b7 = m3100m()[i7];
            if (b7 >= 65 && b7 <= 90) {
                byte[] bArrM3100m = m3100m();
                byte[] bArrCopyOf = Arrays.copyOf(bArrM3100m, bArrM3100m.length);
                AbstractC6118n.m27186d(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i7] = (byte) (b7 + 32);
                for (int i8 = i7 + 1; i8 < bArrCopyOf.length; i8++) {
                    byte b8 = bArrCopyOf[i8];
                    if (b8 >= 65 && b8 <= 90) {
                        bArrCopyOf[i8] = (byte) (b8 + 32);
                    }
                }
                return new C0651h(bArrCopyOf);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: K */
    public byte[] mo3093K() {
        byte[] bArrM3100m = m3100m();
        byte[] bArrCopyOf = Arrays.copyOf(bArrM3100m, bArrM3100m.length);
        AbstractC6118n.m27186d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: M */
    public String m3094M() {
        String strM3103p = m3103p();
        if (strM3103p != null) {
            return strM3103p;
        }
        String strM2963b = AbstractC0643E.m2963b(mo3105t());
        m3087B(strM2963b);
        return strM2963b;
    }

    /* JADX INFO: renamed from: O */
    public void mo3095O(C0648e buffer, int i7, int i8) {
        AbstractC6118n.m27187e(buffer, "buffer");
        AbstractC0707b.m3445d(this, buffer, i7, i8);
    }

    /* JADX INFO: renamed from: c */
    public String mo3096c() {
        return AbstractC0644a.m2966c(m3100m(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0651h other) {
        AbstractC6118n.m27187e(other, "other");
        int iM3090F = m3090F();
        int iM3090F2 = other.m3090F();
        int iMin = Math.min(iM3090F, iM3090F2);
        for (int i7 = 0; i7 < iMin; i7++) {
            int iM3099k = m3099k(i7) & 255;
            int iM3099k2 = other.m3099k(i7) & 255;
            if (iM3099k != iM3099k2) {
                return iM3099k < iM3099k2 ? -1 : 1;
            }
        }
        if (iM3090F == iM3090F2) {
            return 0;
        }
        return iM3090F < iM3090F2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0651h) {
            C0651h c0651h = (C0651h) obj;
            if (c0651h.m3090F() == m3100m().length && c0651h.mo3109z(0, m3100m(), 0, m3100m().length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public C0651h mo3098h(String algorithm) throws NoSuchAlgorithmException {
        AbstractC6118n.m27187e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f2564a, 0, m3090F());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC6118n.m27184b(bArrDigest);
        return new C0651h(bArrDigest);
    }

    public int hashCode() {
        int iM3101n = m3101n();
        if (iM3101n != 0) {
            return iM3101n;
        }
        int iHashCode = Arrays.hashCode(m3100m());
        m3086A(iHashCode);
        return iHashCode;
    }

    /* JADX INFO: renamed from: k */
    public final byte m3099k(int i7) {
        return mo3106v(i7);
    }

    /* JADX INFO: renamed from: m */
    public final byte[] m3100m() {
        return this.f2564a;
    }

    /* JADX INFO: renamed from: n */
    public final int m3101n() {
        return this.f2565b;
    }

    /* JADX INFO: renamed from: o */
    public int mo3102o() {
        return m3100m().length;
    }

    /* JADX INFO: renamed from: p */
    public final String m3103p() {
        return this.f2566c;
    }

    /* JADX INFO: renamed from: q */
    public String mo3104q() {
        char[] cArr = new char[m3100m().length * 2];
        int i7 = 0;
        for (byte b7 : m3100m()) {
            int i8 = i7 + 1;
            cArr[i7] = AbstractC0707b.m3447f()[(b7 >> 4) & 15];
            i7 += 2;
            cArr[i8] = AbstractC0707b.m3447f()[b7 & 15];
        }
        return AbstractC6406h.m27558q(cArr);
    }

    /* JADX INFO: renamed from: t */
    public byte[] mo3105t() {
        return m3100m();
    }

    public String toString() {
        if (m3100m().length == 0) {
            return "[size=0]";
        }
        int iM3444c = AbstractC0707b.m3444c(m3100m(), 64);
        if (iM3444c != -1) {
            String strM3094M = m3094M();
            String strSubstring = strM3094M.substring(0, iM3444c);
            AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strE = AbstractC6406h.m27551E(AbstractC6406h.m27551E(AbstractC6406h.m27551E(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iM3444c >= strM3094M.length()) {
                return "[text=" + strE + ']';
            }
            return "[size=" + m3100m().length + " text=" + strE + "…]";
        }
        if (m3100m().length <= 64) {
            return "[hex=" + mo3104q() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(m3100m().length);
        sb.append(" hex=");
        int iM2971e = AbstractC0645b.m2971e(this, 64);
        if (iM2971e <= m3100m().length) {
            if (iM2971e < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb.append((iM2971e == m3100m().length ? this : new C0651h(AbstractC1631j.m6698k(m3100m(), 0, iM2971e))).mo3104q());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + m3100m().length + ')').toString());
    }

    /* JADX INFO: renamed from: v */
    public byte mo3106v(int i7) {
        return m3100m()[i7];
    }

    /* JADX INFO: renamed from: w */
    public final C0651h m3107w() {
        return mo3098h("MD5");
    }

    /* JADX INFO: renamed from: y */
    public boolean mo3108y(int i7, C0651h other, int i8, int i9) {
        AbstractC6118n.m27187e(other, "other");
        return other.mo3109z(i8, m3100m(), i7, i9);
    }

    /* JADX INFO: renamed from: z */
    public boolean mo3109z(int i7, byte[] other, int i8, int i9) {
        AbstractC6118n.m27187e(other, "other");
        return i7 >= 0 && i7 <= m3100m().length - i9 && i8 >= 0 && i8 <= other.length - i9 && AbstractC0645b.m2967a(m3100m(), i7, other, i8, i9);
    }
}

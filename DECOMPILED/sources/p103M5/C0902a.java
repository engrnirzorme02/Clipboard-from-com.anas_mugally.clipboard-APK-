package p103M5;

import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;
import p072I6.C0648e;

/* JADX INFO: renamed from: M5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0902a {

    /* JADX INFO: renamed from: e */
    private static final char[] f3534e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    private final String f3535a;

    /* JADX INFO: renamed from: b */
    private final String f3536b;

    /* JADX INFO: renamed from: c */
    private final int f3537c;

    /* JADX INFO: renamed from: d */
    private final String f3538d;

    /* JADX INFO: renamed from: M5.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        String f3539a;

        /* JADX INFO: renamed from: b */
        String f3540b;

        /* JADX INFO: renamed from: c */
        int f3541c = -1;

        /* JADX INFO: renamed from: b */
        private static String m4107b(String str, int i7, int i8) {
            String strM4103d = C0902a.m4103d(str, i7, i8, false);
            if (!strM4103d.startsWith("[") || !strM4103d.endsWith("]")) {
                return m4111f(strM4103d);
            }
            InetAddress inetAddressM4110e = m4110e(strM4103d, 1, strM4103d.length() - 1);
            if (inetAddressM4110e == null) {
                return null;
            }
            byte[] address = inetAddressM4110e.getAddress();
            if (address.length == 16) {
                return m4112i(address);
            }
            throw new AssertionError();
        }

        /* JADX INFO: renamed from: c */
        private static boolean m4108c(String str) {
            for (int i7 = 0; i7 < str.length(); i7++) {
                char cCharAt = str.charAt(i7);
                if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        private static boolean m4109d(String str, int i7, int i8, byte[] bArr, int i9) {
            int i10 = i9;
            while (i7 < i8) {
                if (i10 == bArr.length) {
                    return false;
                }
                if (i10 != i9) {
                    if (str.charAt(i7) != '.') {
                        return false;
                    }
                    i7++;
                }
                int i11 = i7;
                int i12 = 0;
                while (i11 < i8) {
                    char cCharAt = str.charAt(i11);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    if ((i12 == 0 && i7 != i11) || (i12 = ((i12 * 10) + cCharAt) - 48) > 255) {
                        return false;
                    }
                    i11++;
                }
                if (i11 - i7 == 0) {
                    return false;
                }
                bArr[i10] = (byte) i12;
                i10++;
                i7 = i11;
            }
            return i10 == i9 + 4;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x004f  */
        /* JADX WARN: Code duplicated, block: B:34:0x005a A[LOOP:1: B:30:0x004d->B:34:0x005a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:59:0x0060 A[EDGE_INSN: B:59:0x0060->B:35:0x0060 BREAK  A[LOOP:1: B:30:0x004d->B:34:0x005a], SYNTHETIC] */
        /* JADX INFO: renamed from: e */
        private static InetAddress m4110e(String str, int i7, int i8) {
            int i9;
            int i10;
            int iM4101a;
            byte[] bArr = new byte[16];
            int i11 = 0;
            int i12 = -1;
            int i13 = -1;
            while (i7 < i8) {
                if (i11 == 16) {
                    return null;
                }
                int i14 = i7 + 2;
                if (i14 <= i8 && str.regionMatches(i7, "::", 0, 2)) {
                    if (i12 != -1) {
                        return null;
                    }
                    i11 += 2;
                    i12 = i11;
                    if (i14 == i8) {
                        break;
                    }
                    i13 = i14;
                    i9 = 0;
                    i7 = i13;
                    while (i7 < i8) {
                        iM4101a = C0902a.m4101a(str.charAt(i7));
                        if (iM4101a == -1) {
                            break;
                            break;
                        }
                        i9 = (i9 << 4) + iM4101a;
                        i7++;
                    }
                    i10 = i7 - i13;
                    if (i10 != 0) {
                    }
                    return null;
                }
                if (i11 != 0) {
                    if (!str.regionMatches(i7, ":", 0, 1)) {
                        if (!str.regionMatches(i7, ".", 0, 1) || !m4109d(str, i13, i8, bArr, i11 - 2)) {
                            return null;
                        }
                        i11 += 2;
                        break;
                    }
                    i7++;
                }
                i13 = i7;
                i9 = 0;
                i7 = i13;
                while (i7 < i8) {
                    iM4101a = C0902a.m4101a(str.charAt(i7));
                    if (iM4101a == -1) {
                        break;
                    }
                    i9 = (i9 << 4) + iM4101a;
                    i7++;
                }
                i10 = i7 - i13;
                if (i10 != 0 || i10 > 4) {
                    return null;
                }
                int i15 = i11 + 1;
                bArr[i11] = (byte) ((i9 >>> 8) & 255);
                i11 += 2;
                bArr[i15] = (byte) (i9 & 255);
            }
            if (i11 != 16) {
                if (i12 == -1) {
                    return null;
                }
                int i16 = i11 - i12;
                System.arraycopy(bArr, i12, bArr, 16 - i16, i16);
                Arrays.fill(bArr, i12, (16 - i11) + i12, (byte) 0);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException unused) {
                throw new AssertionError();
            }
        }

        /* JADX INFO: renamed from: f */
        private static String m4111f(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty() || m4108c(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: i */
        private static String m4112i(byte[] bArr) {
            int i7 = -1;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i9 < bArr.length) {
                int i11 = i9;
                while (i11 < 16 && bArr[i11] == 0 && bArr[i11 + 1] == 0) {
                    i11 += 2;
                }
                int i12 = i11 - i9;
                if (i12 > i10) {
                    i7 = i9;
                    i10 = i12;
                }
                i9 = i11 + 2;
            }
            C0648e c0648e = new C0648e();
            while (i8 < bArr.length) {
                if (i8 == i7) {
                    c0648e.mo3010F(58);
                    i8 += i10;
                    if (i8 == 16) {
                        c0648e.mo3010F(58);
                    }
                } else {
                    if (i8 > 0) {
                        c0648e.mo3010F(58);
                    }
                    c0648e.mo3041e0(((bArr[i8] & 255) << 8) | (bArr[i8 + 1] & 255));
                    i8 += 2;
                }
            }
            return c0648e.m3042e1();
        }

        /* JADX INFO: renamed from: a */
        public C0902a m4113a() {
            if (this.f3539a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f3540b != null) {
                return new C0902a(this);
            }
            throw new IllegalStateException("host == null");
        }

        /* JADX INFO: renamed from: g */
        int m4114g() {
            int i7 = this.f3541c;
            return i7 != -1 ? i7 : C0902a.m4102b(this.f3539a);
        }

        /* JADX INFO: renamed from: h */
        public b m4115h(String str) {
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            String strM4107b = m4107b(str, 0, str.length());
            if (strM4107b != null) {
                this.f3540b = strM4107b;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* JADX INFO: renamed from: j */
        public b m4116j(int i7) {
            if (i7 > 0 && i7 <= 65535) {
                this.f3541c = i7;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i7);
        }

        /* JADX INFO: renamed from: k */
        public b m4117k(String str) {
            if (str == null) {
                throw new IllegalArgumentException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f3539a = "http";
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.f3539a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + str);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3539a);
            sb.append("://");
            if (this.f3540b.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f3540b);
                sb.append(']');
            } else {
                sb.append(this.f3540b);
            }
            int iM4114g = m4114g();
            if (iM4114g != C0902a.m4102b(this.f3539a)) {
                sb.append(':');
                sb.append(iM4114g);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    static int m4101a(char c7) {
        if (c7 >= '0' && c7 <= '9') {
            return c7 - '0';
        }
        if (c7 >= 'a' && c7 <= 'f') {
            return c7 - 'W';
        }
        if (c7 < 'A' || c7 > 'F') {
            return -1;
        }
        return c7 - '7';
    }

    /* JADX INFO: renamed from: b */
    public static int m4102b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX INFO: renamed from: d */
    static String m4103d(String str, int i7, int i8, boolean z7) {
        for (int i9 = i7; i9 < i8; i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == '%' || (cCharAt == '+' && z7)) {
                C0648e c0648e = new C0648e();
                c0648e.m3077x1(str, i7, i9);
                m4104e(c0648e, str, i9, i8, z7);
                return c0648e.m3042e1();
            }
        }
        return str.substring(i7, i8);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX INFO: renamed from: e */
    static void m4104e(C0648e c0648e, String str, int i7, int i8, boolean z7) {
        int i9;
        while (i7 < i8) {
            int iCodePointAt = str.codePointAt(i7);
            if (iCodePointAt == 37 && (i9 = i7 + 2) < i8) {
                int iM4101a = m4101a(str.charAt(i7 + 1));
                int iM4101a2 = m4101a(str.charAt(i9));
                if (iM4101a == -1 || iM4101a2 == -1) {
                    c0648e.m3078y1(iCodePointAt);
                } else {
                    c0648e.mo3010F((iM4101a << 4) + iM4101a2);
                    i7 = i9;
                }
            } else if (iCodePointAt == 43 && z7) {
                c0648e.mo3010F(32);
            } else {
                c0648e.m3078y1(iCodePointAt);
            }
            i7 += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: c */
    public String m4105c() {
        return this.f3536b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0902a) && ((C0902a) obj).f3538d.equals(this.f3538d);
    }

    /* JADX INFO: renamed from: f */
    public int m4106f() {
        return this.f3537c;
    }

    public int hashCode() {
        return this.f3538d.hashCode();
    }

    public String toString() {
        return this.f3538d;
    }

    private C0902a(b bVar) {
        this.f3535a = bVar.f3539a;
        this.f3536b = bVar.f3540b;
        this.f3537c = bVar.m4114g();
        this.f3538d = bVar.toString();
    }
}

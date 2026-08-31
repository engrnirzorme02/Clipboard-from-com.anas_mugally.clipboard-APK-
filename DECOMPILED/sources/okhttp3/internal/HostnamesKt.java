package okhttp3.internal;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0648e;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class HostnamesKt {
    /* JADX INFO: renamed from: a */
    private static final boolean m28727a(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (AbstractC6118n.m27188f(cCharAt, 31) <= 0 || AbstractC6118n.m27188f(cCharAt, 127) >= 0 || AbstractC6406h.m27601Z(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static final boolean m28728b(String str, int i7, int i8, byte[] bArr, int i9) {
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
                if (AbstractC6118n.m27188f(cCharAt, 48) < 0 || AbstractC6118n.m27188f(cCharAt, 57) > 0) {
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

    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[LOOP:1: B:30:0x0064->B:33:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0076 A[EDGE_INSN: B:54:0x0076->B:34:0x0076 BREAK  A[LOOP:1: B:30:0x0064->B:33:0x0070], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    private static final InetAddress m28729c(String str, int i7, int i8) {
        int i9;
        int i10;
        int iM28740I;
        byte[] bArr = new byte[16];
        int i11 = i7;
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        while (i11 < i8) {
            if (i12 == 16) {
                return null;
            }
            int i15 = i11 + 2;
            if (i15 <= i8 && AbstractC6406h.m27556J(str, "::", i11, false, 4, null)) {
                if (i13 != -1) {
                    return null;
                }
                i12 += 2;
                if (i15 == i8) {
                    i13 = i12;
                    break;
                }
                i13 = i12;
                i14 = i15;
                i9 = 0;
                i11 = i14;
                while (i11 < i8) {
                    iM28740I = Util.m28740I(str.charAt(i11));
                    if (iM28740I != -1) {
                        break;
                        break;
                    }
                    i9 = (i9 << 4) + iM28740I;
                    i11++;
                }
                i10 = i11 - i14;
                if (i10 != 0) {
                }
                return null;
            }
            if (i12 != 0) {
                if (!AbstractC6406h.m27556J(str, ":", i11, false, 4, null)) {
                    if (!AbstractC6406h.m27556J(str, ".", i11, false, 4, null) || !m28728b(str, i14, i8, bArr, i12 - 2)) {
                        return null;
                    }
                    i12 += 2;
                    break;
                }
                i11++;
            }
            i14 = i11;
            i9 = 0;
            i11 = i14;
            while (i11 < i8) {
                iM28740I = Util.m28740I(str.charAt(i11));
                if (iM28740I != -1) {
                    break;
                }
                i9 = (i9 << 4) + iM28740I;
                i11++;
            }
            i10 = i11 - i14;
            if (i10 != 0 || i10 > 4) {
                return null;
            }
            int i16 = i12 + 1;
            bArr[i12] = (byte) ((i9 >>> 8) & 255);
            i12 += 2;
            bArr[i16] = (byte) (i9 & 255);
        }
        if (i12 != 16) {
            if (i13 == -1) {
                return null;
            }
            int i17 = i12 - i13;
            System.arraycopy(bArr, i13, bArr, 16 - i17, i17);
            Arrays.fill(bArr, i13, (16 - i12) + i13, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    /* JADX INFO: renamed from: d */
    private static final String m28730d(byte[] bArr) {
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
            if (i12 > i10 && i12 >= 4) {
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
                c0648e.mo3041e0((Util.m28764d(bArr[i8], 255) << 8) | Util.m28764d(bArr[i8 + 1], 255));
                i8 += 2;
            }
        }
        return c0648e.m3042e1();
    }

    /* JADX INFO: renamed from: e */
    public static final String m28731e(String str) {
        AbstractC6118n.m27187e(str, "<this>");
        if (!AbstractC6406h.m27589Q(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                AbstractC6118n.m27186d(ascii, "toASCII(host)");
                Locale US = Locale.US;
                AbstractC6118n.m27186d(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                AbstractC6118n.m27186d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0 || m28727a(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM28729c = (AbstractC6406h.m27557K(str, "[", false, 2, null) && AbstractC6406h.m27563v(str, "]", false, 2, null)) ? m28729c(str, 1, str.length() - 1) : m28729c(str, 0, str.length());
        if (inetAddressM28729c == null) {
            return null;
        }
        byte[] address = inetAddressM28729c.getAddress();
        if (address.length == 16) {
            AbstractC6118n.m27186d(address, "address");
            return m28730d(address);
        }
        if (address.length == 4) {
            return inetAddressM28729c.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}

package p302m6;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6103F;
import p152T5.AbstractC1625d;
import p278j6.AbstractC5905g;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: m6.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6417s extends AbstractC6416r {
    /* JADX INFO: renamed from: A */
    public static String m27547A(CharSequence charSequence, int i7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i7 + '.').toString());
        }
        if (i7 == 0) {
            return "";
        }
        int i8 = 1;
        if (i7 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i7];
            for (int i9 = 0; i9 < i7; i9++) {
                cArr[i9] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i7);
        if (1 <= i7) {
            while (true) {
                sb.append(charSequence);
                if (i8 == i7) {
                    break;
                }
                i8++;
            }
        }
        String string = sb.toString();
        AbstractC6118n.m27184b(string);
        return string;
    }

    /* JADX INFO: renamed from: B */
    public static final String m27548B(String str, char c7, char c8, boolean z7) {
        AbstractC6118n.m27187e(str, "<this>");
        if (!z7) {
            String strReplace = str.replace(c7, c8);
            AbstractC6118n.m27186d(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (AbstractC6401c.m27519d(cCharAt, c7, z7)) {
                cCharAt = c8;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: C */
    public static final String m27549C(String str, String oldValue, String newValue, boolean z7) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(oldValue, "oldValue");
        AbstractC6118n.m27187e(newValue, "newValue");
        int i7 = 0;
        int iM27598W = AbstractC6420v.m27598W(str, oldValue, 0, z7);
        if (iM27598W < 0) {
            return str;
        }
        int length = oldValue.length();
        int iB = AbstractC5905g.m26654b(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i7, iM27598W);
            sb.append(newValue);
            i7 = iM27598W + length;
            if (iM27598W >= str.length()) {
                break;
            }
            iM27598W = AbstractC6420v.m27598W(str, oldValue, iM27598W + iB, z7);
        } while (iM27598W > 0);
        sb.append((CharSequence) str, i7, str.length());
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ String m27550D(String str, char c7, char c8, boolean z7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        return m27548B(str, c7, c8, z7);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ String m27551E(String str, String str2, String str3, boolean z7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        return m27549C(str, str2, str3, z7);
    }

    /* JADX INFO: renamed from: F */
    public static final String m27552F(String str, String oldValue, String newValue, boolean z7) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(oldValue, "oldValue");
        AbstractC6118n.m27187e(newValue, "newValue");
        int iM27602a0 = AbstractC6420v.m27602a0(str, oldValue, 0, z7, 2, null);
        return iM27602a0 < 0 ? str : AbstractC6420v.m27568A0(str, iM27602a0, oldValue.length() + iM27602a0, newValue).toString();
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ String m27553G(String str, String str2, String str3, boolean z7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        return m27552F(str, str2, str3, z7);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m27554H(String str, String prefix, int i7, boolean z7) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(prefix, "prefix");
        return !z7 ? str.startsWith(prefix, i7) : m27566y(str, i7, prefix, 0, prefix.length(), z7);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m27555I(String str, String prefix, boolean z7) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(prefix, "prefix");
        return !z7 ? str.startsWith(prefix) : m27566y(str, 0, prefix, 0, prefix.length(), z7);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ boolean m27556J(String str, String str2, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return m27554H(str, str2, i7, z7);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ boolean m27557K(String str, String str2, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return m27555I(str, str2, z7);
    }

    /* JADX INFO: renamed from: q */
    public static String m27558q(char[] cArr) {
        AbstractC6118n.m27187e(cArr, "<this>");
        return new String(cArr);
    }

    /* JADX INFO: renamed from: r */
    public static String m27559r(char[] cArr, int i7, int i8) {
        AbstractC6118n.m27187e(cArr, "<this>");
        AbstractC1625d.f5389a.m6661a(i7, i8, cArr.length);
        return new String(cArr, i7, i8 - i7);
    }

    /* JADX INFO: renamed from: s */
    public static String m27560s(byte[] bArr) {
        AbstractC6118n.m27187e(bArr, "<this>");
        return new String(bArr, C6402d.f24428b);
    }

    /* JADX INFO: renamed from: t */
    public static byte[] m27561t(String str) {
        AbstractC6118n.m27187e(str, "<this>");
        byte[] bytes = str.getBytes(C6402d.f24428b);
        AbstractC6118n.m27186d(bytes, "getBytes(...)");
        return bytes;
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m27562u(String str, String suffix, boolean z7) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(suffix, "suffix");
        return !z7 ? str.endsWith(suffix) : m27566y(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m27563v(String str, String str2, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return m27562u(str, str2, z7);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m27564w(String str, String str2, boolean z7) {
        if (str == null) {
            return str2 == null;
        }
        return !z7 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: x */
    public static Comparator m27565x(C6103F c6103f) {
        AbstractC6118n.m27187e(c6103f, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC6118n.m27186d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m27566y(String str, int i7, String other, int i8, int i9, boolean z7) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(other, "other");
        return !z7 ? str.regionMatches(i7, other, i8, i9) : str.regionMatches(z7, i7, other, i8, i9);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m27567z(String str, int i7, String str2, int i8, int i9, boolean z7, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z7 = false;
        }
        return m27566y(str, i7, str2, i8, i9, z7);
    }
}

package p302m6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5371p;
import p278j6.AbstractC5905g;
import p278j6.C5902d;
import p278j6.C5904f;
import p294l6.AbstractC6307h;
import p294l6.InterfaceC6304e;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: m6.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6420v extends AbstractC6417s {

    /* JADX INFO: renamed from: m6.v$a */
    public static final class a implements InterfaceC6304e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CharSequence f24459a;

        public a(CharSequence charSequence) {
            this.f24459a = charSequence;
        }

        @Override // p294l6.InterfaceC6304e
        public Iterator iterator() {
            return new C6404f(this.f24459a);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static final CharSequence m27568A0(CharSequence charSequence, int i7, int i8, CharSequence replacement) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        AbstractC6118n.m27187e(replacement, "replacement");
        if (i8 >= i7) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i7);
            AbstractC6118n.m27186d(sb, "append(...)");
            sb.append(replacement);
            sb.append(charSequence, i8, charSequence.length());
            AbstractC6118n.m27186d(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i8 + ") is less than start index (" + i7 + ").");
    }

    /* JADX INFO: renamed from: B0 */
    public static final void m27569B0(int i7) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i7).toString());
    }

    /* JADX INFO: renamed from: C0 */
    public static final List m27570C0(CharSequence charSequence, char[] delimiters, boolean z7, int i7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        AbstractC6118n.m27187e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return m27572E0(charSequence, String.valueOf(delimiters[0]), z7, i7);
        }
        Iterable iterableH = AbstractC6307h.m27243h(m27619r0(charSequence, delimiters, 0, z7, i7, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(iterableH, 10));
        Iterator it = iterableH.iterator();
        while (it.hasNext()) {
            arrayList.add(m27577J0(charSequence, (C5904f) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D0 */
    public static final List m27571D0(CharSequence charSequence, String[] delimiters, boolean z7, int i7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        AbstractC6118n.m27187e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return m27572E0(charSequence, str, z7, i7);
            }
        }
        Iterable iterableH = AbstractC6307h.m27243h(m27620s0(charSequence, delimiters, 0, z7, i7, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(iterableH, 10));
        Iterator it = iterableH.iterator();
        while (it.hasNext()) {
            arrayList.add(m27577J0(charSequence, (C5904f) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E0 */
    private static final List m27572E0(CharSequence charSequence, String str, boolean z7, int i7) {
        m27569B0(i7);
        int length = 0;
        int iM27598W = m27598W(charSequence, str, 0, z7);
        if (iM27598W == -1 || i7 == 1) {
            return AbstractC1638q.m6759d(charSequence.toString());
        }
        boolean z8 = i7 > 0;
        ArrayList arrayList = new ArrayList(z8 ? AbstractC5905g.m26656d(i7, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iM27598W).toString());
            length = str.length() + iM27598W;
            if (z8 && arrayList.size() == i7 - 1) {
                break;
            }
            iM27598W = m27598W(charSequence, str, length, z7);
        } while (iM27598W != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ List m27573F0(CharSequence charSequence, char[] cArr, boolean z7, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return m27570C0(charSequence, cArr, z7, i7);
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ List m27574G0(CharSequence charSequence, String[] strArr, boolean z7, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return m27571D0(charSequence, strArr, z7, i7);
    }

    /* JADX INFO: renamed from: H0 */
    public static final boolean m27575H0(CharSequence charSequence, CharSequence prefix, boolean z7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        AbstractC6118n.m27187e(prefix, "prefix");
        return (!z7 && (charSequence instanceof String) && (prefix instanceof String)) ? AbstractC6417s.m27557K((String) charSequence, (String) prefix, false, 2, null) : m27623v0(charSequence, 0, prefix, 0, prefix.length(), z7);
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ boolean m27576I0(CharSequence charSequence, CharSequence charSequence2, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return m27575H0(charSequence, charSequence2, z7);
    }

    /* JADX INFO: renamed from: J0 */
    public static final String m27577J0(CharSequence charSequence, C5904f range) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        AbstractC6118n.m27187e(range, "range");
        return charSequence.subSequence(range.m26651p().intValue(), range.m26650n().intValue() + 1).toString();
    }

    /* JADX INFO: renamed from: K0 */
    public static String m27578K0(String str, char c7, String missingDelimiterValue) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(missingDelimiterValue, "missingDelimiterValue");
        int iM27601Z = m27601Z(str, c7, 0, false, 6, null);
        if (iM27601Z == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM27601Z + 1, str.length());
        AbstractC6118n.m27186d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: L0 */
    public static String m27580L0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(delimiter, "delimiter");
        AbstractC6118n.m27187e(missingDelimiterValue, "missingDelimiterValue");
        int iM27602a0 = m27602a0(str, delimiter, 0, false, 6, null);
        if (iM27602a0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM27602a0 + delimiter.length(), str.length());
        AbstractC6118n.m27186d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ String m27582M0(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return m27578K0(str, c7, str2);
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m27583N(CharSequence charSequence, char c7, boolean z7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        return m27601Z(charSequence, c7, 0, z7, 2, null) >= 0;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ String m27584N0(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return m27580L0(str, str2, str3);
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m27585O(CharSequence charSequence, CharSequence other, boolean z7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        AbstractC6118n.m27187e(other, "other");
        if (other instanceof String) {
            return m27602a0(charSequence, (String) other, 0, z7, 2, null) >= 0;
        }
        return m27600Y(charSequence, other, 0, charSequence.length(), z7, false, 16, null) >= 0;
    }

    /* JADX INFO: renamed from: O0 */
    public static String m27586O0(String str, char c7, String missingDelimiterValue) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(missingDelimiterValue, "missingDelimiterValue");
        int iM27607f0 = m27607f0(str, c7, 0, false, 6, null);
        if (iM27607f0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM27607f0 + 1, str.length());
        AbstractC6118n.m27186d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ boolean m27587P(CharSequence charSequence, char c7, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return m27583N(charSequence, c7, z7);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ String m27588P0(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return m27586O0(str, c7, str2);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ boolean m27589Q(CharSequence charSequence, CharSequence charSequence2, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return m27585O(charSequence, charSequence2, z7);
    }

    /* JADX INFO: renamed from: Q0 */
    public static final String m27590Q0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(delimiter, "delimiter");
        AbstractC6118n.m27187e(missingDelimiterValue, "missingDelimiterValue");
        int iM27602a0 = m27602a0(str, delimiter, 0, false, 6, null);
        if (iM27602a0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM27602a0);
        AbstractC6118n.m27186d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m27591R(CharSequence charSequence, CharSequence suffix, boolean z7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        AbstractC6118n.m27187e(suffix, "suffix");
        return (!z7 && (charSequence instanceof String) && (suffix instanceof String)) ? AbstractC6417s.m27563v((String) charSequence, (String) suffix, false, 2, null) : m27623v0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z7);
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ String m27592R0(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return m27590Q0(str, str2, str3);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ boolean m27593S(CharSequence charSequence, CharSequence charSequence2, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return m27591R(charSequence, charSequence2, z7);
    }

    /* JADX INFO: renamed from: S0 */
    public static CharSequence m27594S0(CharSequence charSequence) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i7 = 0;
        boolean z7 = false;
        while (i7 <= length) {
            boolean zM27518c = AbstractC6400b.m27518c(charSequence.charAt(!z7 ? i7 : length));
            if (z7) {
                if (!zM27518c) {
                    break;
                }
                length--;
            } else if (zM27518c) {
                i7++;
            } else {
                z7 = true;
            }
        }
        return charSequence.subSequence(i7, length + 1);
    }

    /* JADX INFO: renamed from: T */
    private static final C1435m m27595T(CharSequence charSequence, Collection collection, int i7, boolean z7, boolean z8) {
        CharSequence charSequence2;
        Object next;
        boolean z9;
        Object next2;
        if (!z7 && collection.size() == 1) {
            String str = (String) AbstractC1638q.m6584X(collection);
            int iM27602a0 = !z8 ? m27602a0(charSequence, str, i7, false, 4, null) : m27608g0(charSequence, str, i7, false, 4, null);
            if (iM27602a0 < 0) {
                return null;
            }
            return AbstractC1440r.m6083a(Integer.valueOf(iM27602a0), str);
        }
        CharSequence charSequence3 = charSequence;
        C5902d c5904f = !z8 ? new C5904f(AbstractC5905g.m26654b(i7, 0), charSequence3.length()) : AbstractC5905g.m26661i(AbstractC5905g.m26656d(i7, m27596U(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iM26643a = c5904f.m26643a();
            int iM26644b = c5904f.m26644b();
            int iM26645e = c5904f.m26645e();
            if ((iM26645e > 0 && iM26643a <= iM26644b) || (iM26645e < 0 && iM26644b <= iM26643a)) {
                int i8 = iM26643a;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z9 = z7;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z9 = z7;
                        if (AbstractC6417s.m27566y(str2, 0, (String) charSequence3, i8, str2.length(), z9)) {
                            break;
                        }
                        z7 = z9;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return AbstractC1440r.m6083a(Integer.valueOf(i8), str3);
                    }
                    if (i8 != iM26644b) {
                        i8 += iM26645e;
                        z7 = z9;
                    }
                }
            }
        } else {
            boolean z10 = z7;
            int iM26643a2 = c5904f.m26643a();
            int iM26644b2 = c5904f.m26644b();
            int iM26645e2 = c5904f.m26645e();
            if ((iM26645e2 > 0 && iM26643a2 <= iM26644b2) || (iM26645e2 < 0 && iM26644b2 <= iM26643a2)) {
                int i9 = iM26643a2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z11 = z10;
                        charSequence2 = charSequence3;
                        z10 = z11;
                        if (m27623v0(str4, 0, charSequence2, i9, str4.length(), z11)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return AbstractC1440r.m6083a(Integer.valueOf(i9), str5);
                    }
                    if (i9 != iM26644b2) {
                        i9 += iM26645e2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: U */
    public static final int m27596U(CharSequence charSequence) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: V */
    public static final int m27597V(CharSequence charSequence, char c7, int i7, boolean z7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        return (z7 || !(charSequence instanceof String)) ? m27603b0(charSequence, new char[]{c7}, i7, z7) : ((String) charSequence).indexOf(c7, i7);
    }

    /* JADX INFO: renamed from: W */
    public static final int m27598W(CharSequence charSequence, String string, int i7, boolean z7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        AbstractC6118n.m27187e(string, "string");
        return (z7 || !(charSequence instanceof String)) ? m27600Y(charSequence, string, i7, charSequence.length(), z7, false, 16, null) : ((String) charSequence).indexOf(string, i7);
    }

    /* JADX INFO: renamed from: X */
    private static final int m27599X(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z7, boolean z8) {
        C5902d c5904f = !z8 ? new C5904f(AbstractC5905g.m26654b(i7, 0), AbstractC5905g.m26656d(i8, charSequence.length())) : AbstractC5905g.m26661i(AbstractC5905g.m26656d(i7, m27596U(charSequence)), AbstractC5905g.m26654b(i8, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iM26643a = c5904f.m26643a();
            int iM26644b = c5904f.m26644b();
            int iM26645e = c5904f.m26645e();
            if ((iM26645e <= 0 || iM26643a > iM26644b) && (iM26645e >= 0 || iM26644b > iM26643a)) {
                return -1;
            }
            int i9 = iM26643a;
            while (true) {
                String str = (String) charSequence2;
                boolean z9 = z7;
                if (AbstractC6417s.m27566y(str, 0, (String) charSequence, i9, str.length(), z9)) {
                    return i9;
                }
                if (i9 == iM26644b) {
                    return -1;
                }
                i9 += iM26645e;
                z7 = z9;
            }
        } else {
            boolean z10 = z7;
            int iM26643a2 = c5904f.m26643a();
            int iM26644b2 = c5904f.m26644b();
            int iM26645e2 = c5904f.m26645e();
            if ((iM26645e2 <= 0 || iM26643a2 > iM26644b2) && (iM26645e2 >= 0 || iM26644b2 > iM26643a2)) {
                return -1;
            }
            int i10 = iM26643a2;
            while (true) {
                boolean z11 = z10;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z10 = z11;
                if (m27623v0(charSequence4, 0, charSequence3, i10, charSequence2.length(), z11)) {
                    return i10;
                }
                if (i10 == iM26644b2) {
                    return -1;
                }
                i10 += iM26645e2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    static /* synthetic */ int m27600Y(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z7, boolean z8, int i9, Object obj) {
        if ((i9 & 16) != 0) {
            z8 = false;
        }
        return m27599X(charSequence, charSequence2, i7, i8, z7, z8);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ int m27601Z(CharSequence charSequence, char c7, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return m27597V(charSequence, c7, i7, z7);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ int m27602a0(CharSequence charSequence, String str, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return m27598W(charSequence, str, i7, z7);
    }

    /* JADX INFO: renamed from: b0 */
    public static final int m27603b0(CharSequence charSequence, char[] chars, int i7, boolean z7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        AbstractC6118n.m27187e(chars, "chars");
        if (!z7 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC1631j.m6724U(chars), i7);
        }
        int iB = AbstractC5905g.m26654b(i7, 0);
        int iM27596U = m27596U(charSequence);
        if (iB > iM27596U) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iB);
            for (char c7 : chars) {
                if (AbstractC6401c.m27519d(c7, cCharAt, z7)) {
                    return iB;
                }
            }
            if (iB == iM27596U) {
                return -1;
            }
            iB++;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m27604c0(CharSequence charSequence) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!AbstractC6400b.m27518c(charSequence.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public static final int m27605d0(CharSequence charSequence, char c7, int i7, boolean z7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        return (z7 || !(charSequence instanceof String)) ? m27609h0(charSequence, new char[]{c7}, i7, z7) : ((String) charSequence).lastIndexOf(c7, i7);
    }

    /* JADX INFO: renamed from: e0 */
    public static final int m27606e0(CharSequence charSequence, String string, int i7, boolean z7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        AbstractC6118n.m27187e(string, "string");
        return (z7 || !(charSequence instanceof String)) ? m27599X(charSequence, string, i7, 0, z7, true) : ((String) charSequence).lastIndexOf(string, i7);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ int m27607f0(CharSequence charSequence, char c7, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = m27596U(charSequence);
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return m27605d0(charSequence, c7, i7, z7);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ int m27608g0(CharSequence charSequence, String str, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = m27596U(charSequence);
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return m27606e0(charSequence, str, i7, z7);
    }

    /* JADX INFO: renamed from: h0 */
    public static final int m27609h0(CharSequence charSequence, char[] chars, int i7, boolean z7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        AbstractC6118n.m27187e(chars, "chars");
        if (!z7 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC1631j.m6724U(chars), i7);
        }
        for (int iD = AbstractC5905g.m26656d(i7, m27596U(charSequence)); -1 < iD; iD--) {
            char cCharAt = charSequence.charAt(iD);
            for (char c7 : chars) {
                if (AbstractC6401c.m27519d(c7, cCharAt, z7)) {
                    return iD;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i0 */
    public static final InterfaceC6304e m27610i0(CharSequence charSequence) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        return new a(charSequence);
    }

    /* JADX INFO: renamed from: j0 */
    public static final List m27611j0(CharSequence charSequence) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        return AbstractC6307h.m27249n(m27610i0(charSequence));
    }

    /* JADX INFO: renamed from: k0 */
    public static final CharSequence m27612k0(CharSequence charSequence, int i7, char c7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException("Desired length " + i7 + " is less than zero.");
        }
        if (i7 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i7);
        sb.append(charSequence);
        int length = i7 - charSequence.length();
        int i8 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c7);
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        return sb;
    }

    /* JADX INFO: renamed from: l0 */
    public static final String m27613l0(String str, int i7, char c7) {
        AbstractC6118n.m27187e(str, "<this>");
        return m27612k0(str, i7, c7).toString();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ String m27614m0(String str, int i7, char c7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            c7 = ' ';
        }
        return m27613l0(str, i7, c7);
    }

    /* JADX INFO: renamed from: n0 */
    public static final CharSequence m27615n0(CharSequence charSequence, int i7, char c7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException("Desired length " + i7 + " is less than zero.");
        }
        if (i7 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i7);
        int length = i7 - charSequence.length();
        int i8 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c7);
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    /* JADX INFO: renamed from: o0 */
    public static String m27616o0(String str, int i7, char c7) {
        AbstractC6118n.m27187e(str, "<this>");
        return m27615n0(str, i7, c7).toString();
    }

    /* JADX INFO: renamed from: p0 */
    private static final InterfaceC6304e m27617p0(CharSequence charSequence, final char[] cArr, int i7, final boolean z7, int i8) {
        m27569B0(i8);
        return new C6403e(charSequence, i7, i8, new InterfaceC5371p() { // from class: m6.t
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC6420v.m27621t0(cArr, z7, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    private static final InterfaceC6304e m27618q0(CharSequence charSequence, String[] strArr, int i7, final boolean z7, int i8) {
        m27569B0(i8);
        final List listC = AbstractC1631j.m6690c(strArr);
        return new C6403e(charSequence, i7, i8, new InterfaceC5371p() { // from class: m6.u
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC6420v.m27622u0(listC, z7, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    static /* synthetic */ InterfaceC6304e m27619r0(CharSequence charSequence, char[] cArr, int i7, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        return m27617p0(charSequence, cArr, i7, z7, i8);
    }

    /* JADX INFO: renamed from: s0 */
    static /* synthetic */ InterfaceC6304e m27620s0(CharSequence charSequence, String[] strArr, int i7, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        return m27618q0(charSequence, strArr, i7, z7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C1435m m27621t0(char[] cArr, boolean z7, CharSequence DelimitedRangesSequence, int i7) {
        AbstractC6118n.m27187e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iM27603b0 = m27603b0(DelimitedRangesSequence, cArr, i7, z7);
        if (iM27603b0 < 0) {
            return null;
        }
        return AbstractC1440r.m6083a(Integer.valueOf(iM27603b0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C1435m m27622u0(List list, boolean z7, CharSequence DelimitedRangesSequence, int i7) {
        AbstractC6118n.m27187e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        C1435m c1435mM27595T = m27595T(DelimitedRangesSequence, list, i7, z7, false);
        if (c1435mM27595T != null) {
            return AbstractC1440r.m6083a(c1435mM27595T.m6070c(), Integer.valueOf(((String) c1435mM27595T.m6071d()).length()));
        }
        return null;
    }

    /* JADX INFO: renamed from: v0 */
    public static final boolean m27623v0(CharSequence charSequence, int i7, CharSequence other, int i8, int i9, boolean z7) {
        AbstractC6118n.m27187e(charSequence, "<this>");
        AbstractC6118n.m27187e(other, "other");
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > other.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!AbstractC6401c.m27519d(charSequence.charAt(i7 + i10), other.charAt(i8 + i10), z7)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w0 */
    public static String m27624w0(String str, CharSequence prefix) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(prefix, "prefix");
        if (!m27576I0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        AbstractC6118n.m27186d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: x0 */
    public static String m27625x0(String str, CharSequence suffix) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(suffix, "suffix");
        if (!m27593S(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        AbstractC6118n.m27186d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: y0 */
    public static String m27626y0(String str, CharSequence delimiter) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(delimiter, "delimiter");
        return m27627z0(str, delimiter, delimiter);
    }

    /* JADX INFO: renamed from: z0 */
    public static final String m27627z0(String str, CharSequence prefix, CharSequence suffix) {
        AbstractC6118n.m27187e(str, "<this>");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !m27576I0(str, prefix, false, 2, null) || !m27593S(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        AbstractC6118n.m27186d(strSubstring, "substring(...)");
        return strSubstring;
    }
}

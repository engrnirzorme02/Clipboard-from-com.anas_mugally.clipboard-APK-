package p048F6;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1426d;
import p145S5.C1434l;
import p152T5.AbstractC1638q;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: F6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0440a {

    /* JADX INFO: renamed from: a */
    public int f1708a;

    /* JADX INFO: renamed from: c */
    private String f1710c;

    /* JADX INFO: renamed from: b */
    public final C0459t f1709b = new C0459t();

    /* JADX INFO: renamed from: d */
    private StringBuilder f1711d = new StringBuilder();

    /* JADX INFO: renamed from: I */
    private final String m1884I() {
        String str = this.f1710c;
        AbstractC6118n.m27184b(str);
        this.f1710c = null;
        return str;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ boolean m1885L(AbstractC0440a abstractC0440a, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i7 & 1) != 0) {
            z7 = true;
        }
        return abstractC0440a.m1904K(z7);
    }

    /* JADX INFO: renamed from: N */
    private final boolean m1886N() {
        return mo1897A().charAt(this.f1708a - 1) != '\"';
    }

    /* JADX INFO: renamed from: a */
    private final int m1887a(int i7) {
        int iMo1900E = mo1900E(i7);
        if (iMo1900E == -1) {
            m1894v(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new C1426d();
        }
        int i8 = iMo1900E + 1;
        char cCharAt = mo1897A().charAt(iMo1900E);
        if (cCharAt == 'u') {
            return m1889c(mo1897A(), i8);
        }
        char cM1920b = AbstractC0441b.m1920b(cCharAt);
        if (cM1920b != 0) {
            this.f1711d.append(cM1920b);
            return i8;
        }
        m1894v(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new C1426d();
    }

    /* JADX INFO: renamed from: b */
    private final int m1888b(int i7, int i8) {
        m1906d(i7, i8);
        return m1887a(i8 + 1);
    }

    /* JADX INFO: renamed from: c */
    private final int m1889c(CharSequence charSequence, int i7) {
        int i8 = i7 + 4;
        if (i8 < charSequence.length()) {
            this.f1711d.append((char) ((m1896z(charSequence, i7) << 12) + (m1896z(charSequence, i7 + 1) << 8) + (m1896z(charSequence, i7 + 2) << 4) + m1896z(charSequence, i7 + 3)));
            return i8;
        }
        this.f1708a = i7;
        m1914s();
        if (this.f1708a + 4 < charSequence.length()) {
            return m1889c(charSequence, this.f1708a);
        }
        m1894v(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new C1426d();
    }

    /* JADX INFO: renamed from: f */
    private final boolean m1890f(int i7) {
        int iMo1900E = mo1900E(i7);
        if (iMo1900E >= mo1897A().length() || iMo1900E == -1) {
            m1894v(this, "EOF", 0, null, 6, null);
            throw new C1426d();
        }
        int i8 = iMo1900E + 1;
        int iCharAt = mo1897A().charAt(iMo1900E) | ' ';
        if (iCharAt == 102) {
            m1891h("alse", i8);
            return false;
        }
        if (iCharAt == 116) {
            m1891h("rue", i8);
            return true;
        }
        m1894v(this, "Expected valid boolean literal prefix, but had '" + m1912p() + '\'', 0, null, 6, null);
        throw new C1426d();
    }

    /* JADX INFO: renamed from: h */
    private final void m1891h(String str, int i7) {
        if (mo1897A().length() - i7 < str.length()) {
            m1894v(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new C1426d();
        }
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (str.charAt(i8) != (mo1897A().charAt(i7 + i8) | ' ')) {
                m1894v(this, "Expected valid boolean literal prefix, but had '" + m1912p() + '\'', 0, null, 6, null);
                throw new C1426d();
            }
        }
        this.f1708a = i7 + str.length();
    }

    /* JADX INFO: renamed from: m */
    private static final double m1892m(long j7, boolean z7) {
        if (!z7) {
            return Math.pow(10.0d, -j7);
        }
        if (z7) {
            return Math.pow(10.0d, j7);
        }
        throw new C1434l();
    }

    /* JADX INFO: renamed from: r */
    private final String m1893r(int i7, int i8) {
        m1906d(i7, i8);
        String string = this.f1711d.toString();
        AbstractC6118n.m27186d(string, "toString(...)");
        this.f1711d.setLength(0);
        return string;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Void m1894v(AbstractC0440a abstractC0440a, String str, int i7, String str2, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i8 & 2) != 0) {
            i7 = abstractC0440a.f1708a;
        }
        if ((i8 & 4) != 0) {
            str2 = "";
        }
        return abstractC0440a.m1916u(str, i7, str2);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Void m1895x(AbstractC0440a abstractC0440a, byte b7, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        return abstractC0440a.m1917w(b7, z7);
    }

    /* JADX INFO: renamed from: z */
    private final int m1896z(CharSequence charSequence, int i7) {
        char cCharAt = charSequence.charAt(i7);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m1894v(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new C1426d();
    }

    /* JADX INFO: renamed from: A */
    protected abstract CharSequence mo1897A();

    /* JADX INFO: renamed from: B */
    protected final boolean m1898B(char c7) {
        return (c7 == ',' || c7 == ':' || c7 == ']' || c7 == '}') ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public byte mo1872C() {
        CharSequence charSequenceMo1897A = mo1897A();
        int i7 = this.f1708a;
        while (true) {
            int iMo1900E = mo1900E(i7);
            if (iMo1900E == -1) {
                this.f1708a = iMo1900E;
                return (byte) 10;
            }
            char cCharAt = charSequenceMo1897A.charAt(iMo1900E);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f1708a = iMo1900E;
                return AbstractC0441b.m1919a(cCharAt);
            }
            i7 = iMo1900E + 1;
        }
    }

    /* JADX INFO: renamed from: D */
    public final String m1899D(boolean z7) {
        String strM1910n;
        byte bMo1872C = mo1872C();
        if (z7) {
            if (bMo1872C != 1 && bMo1872C != 0) {
                return null;
            }
            strM1910n = m1912p();
        } else {
            if (bMo1872C != 1) {
                return null;
            }
            strM1910n = m1910n();
        }
        this.f1710c = strM1910n;
        return strM1910n;
    }

    /* JADX INFO: renamed from: E */
    public abstract int mo1900E(int i7);

    /* JADX INFO: renamed from: F */
    public final void m1901F(boolean z7) {
        ArrayList arrayList = new ArrayList();
        byte bMo1872C = mo1872C();
        if (bMo1872C != 8 && bMo1872C != 6) {
            m1912p();
            return;
        }
        while (true) {
            byte bMo1872C2 = mo1872C();
            if (bMo1872C2 != 1) {
                if (bMo1872C2 == 8 || bMo1872C2 == 6) {
                    arrayList.add(Byte.valueOf(bMo1872C2));
                } else if (bMo1872C2 == 9) {
                    if (((Number) AbstractC1638q.m6579S(arrayList)).byteValue() != 8) {
                        throw AbstractC0456q.m1965d(this.f1708a, "found ] instead of } at path: " + this.f1709b, mo1897A());
                    }
                    AbstractC1638q.m6777A(arrayList);
                } else if (bMo1872C2 == 7) {
                    if (((Number) AbstractC1638q.m6579S(arrayList)).byteValue() != 6) {
                        throw AbstractC0456q.m1965d(this.f1708a, "found } instead of ] at path: " + this.f1709b, mo1897A());
                    }
                    AbstractC1638q.m6777A(arrayList);
                } else if (bMo1872C2 == 10) {
                    m1894v(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new C1426d();
                }
                mo1875j();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z7) {
                m1912p();
            } else {
                mo1908i();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public abstract int mo1873G();

    /* JADX INFO: renamed from: H */
    public String m1902H(int i7, int i8) {
        return mo1897A().subSequence(i7, i8).toString();
    }

    /* JADX INFO: renamed from: J */
    public final boolean m1903J() {
        int iMo1873G = mo1873G();
        CharSequence charSequenceMo1897A = mo1897A();
        if (iMo1873G >= charSequenceMo1897A.length() || iMo1873G == -1 || charSequenceMo1897A.charAt(iMo1873G) != ',') {
            return false;
        }
        this.f1708a++;
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m1904K(boolean z7) {
        int iMo1900E = mo1900E(mo1873G());
        int length = mo1897A().length() - iMo1900E;
        if (length < 4 || iMo1900E == -1) {
            return false;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            if ("null".charAt(i7) != mo1897A().charAt(iMo1900E + i7)) {
                return false;
            }
        }
        if (length > 4 && AbstractC0441b.m1919a(mo1897A().charAt(iMo1900E + 4)) == 0) {
            return false;
        }
        if (!z7) {
            return true;
        }
        this.f1708a = iMo1900E + 4;
        return true;
    }

    /* JADX INFO: renamed from: M */
    protected final void m1905M(char c7) {
        int i7 = this.f1708a;
        if (i7 > 0 && c7 == '\"') {
            try {
                this.f1708a = i7 - 1;
                String strM1912p = m1912p();
                this.f1708a = i7;
                if (AbstractC6118n.m27183a(strM1912p, "null")) {
                    m1916u("Expected string literal but 'null' literal was found", this.f1708a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new C1426d();
                }
            } catch (Throwable th) {
                this.f1708a = i7;
                throw th;
            }
        }
        m1895x(this, AbstractC0441b.m1919a(c7), false, 2, null);
        throw new C1426d();
    }

    /* JADX INFO: renamed from: d */
    protected void m1906d(int i7, int i8) {
        this.f1711d.append(mo1897A(), i7, i8);
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1874e();

    /* JADX INFO: renamed from: g */
    public final boolean m1907g() {
        boolean z7;
        int iMo1873G = mo1873G();
        if (iMo1873G == mo1897A().length()) {
            m1894v(this, "EOF", 0, null, 6, null);
            throw new C1426d();
        }
        if (mo1897A().charAt(iMo1873G) == '\"') {
            iMo1873G++;
            z7 = true;
        } else {
            z7 = false;
        }
        boolean zM1890f = m1890f(iMo1873G);
        if (!z7) {
            return zM1890f;
        }
        if (this.f1708a == mo1897A().length()) {
            m1894v(this, "EOF", 0, null, 6, null);
            throw new C1426d();
        }
        if (mo1897A().charAt(this.f1708a) == '\"') {
            this.f1708a++;
            return zM1890f;
        }
        m1894v(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new C1426d();
    }

    /* JADX INFO: renamed from: i */
    public abstract String mo1908i();

    /* JADX INFO: renamed from: j */
    public abstract byte mo1875j();

    /* JADX INFO: renamed from: k */
    public abstract void mo1876k(char c7);

    /* JADX INFO: renamed from: l */
    public final long m1909l() {
        boolean z7;
        boolean z8;
        int iMo1900E = mo1900E(mo1873G());
        if (iMo1900E >= mo1897A().length() || iMo1900E == -1) {
            m1894v(this, "EOF", 0, null, 6, null);
            throw new C1426d();
        }
        if (mo1897A().charAt(iMo1900E) == '\"') {
            iMo1900E++;
            if (iMo1900E == mo1897A().length()) {
                m1894v(this, "EOF", 0, null, 6, null);
                throw new C1426d();
            }
            z7 = true;
        } else {
            z7 = false;
        }
        int i7 = iMo1900E;
        boolean z9 = false;
        boolean z10 = false;
        long j7 = 0;
        long j8 = 0;
        loop0: while (true) {
            z8 = false;
            while (true) {
                if (i7 == mo1897A().length()) {
                    break loop0;
                }
                char cCharAt = mo1897A().charAt(i7);
                if ((cCharAt == 'e' || cCharAt == 'E') && !z9) {
                    if (i7 == iMo1900E) {
                        m1894v(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                        throw new C1426d();
                    }
                    i7++;
                    z9 = true;
                } else if (cCharAt != '-' || !z9) {
                    if (cCharAt != '+' || !z9) {
                        if (cCharAt != '-') {
                            if (AbstractC0441b.m1919a(cCharAt) != 0) {
                                break loop0;
                            }
                            i7++;
                            int i8 = cCharAt - '0';
                            if (i8 < 0 || i8 >= 10) {
                                m1894v(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                                throw new C1426d();
                            }
                            if (z9) {
                                j8 = (j8 * ((long) 10)) + ((long) i8);
                            } else {
                                j7 = (j7 * ((long) 10)) - ((long) i8);
                                if (j7 > 0) {
                                    m1894v(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new C1426d();
                                }
                            }
                        } else {
                            if (i7 != iMo1900E) {
                                m1894v(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new C1426d();
                            }
                            i7++;
                            z10 = true;
                        }
                    } else {
                        if (i7 == iMo1900E) {
                            m1894v(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new C1426d();
                        }
                        i7++;
                    }
                }
                z8 = true;
            }
            if (i7 == iMo1900E) {
                m1894v(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new C1426d();
            }
            i7++;
        }
        boolean z11 = i7 != iMo1900E;
        if (iMo1900E == i7 || (z10 && iMo1900E == i7 - 1)) {
            m1894v(this, "Expected numeric literal", 0, null, 6, null);
            throw new C1426d();
        }
        if (z7) {
            if (!z11) {
                m1894v(this, "EOF", 0, null, 6, null);
                throw new C1426d();
            }
            if (mo1897A().charAt(i7) != '\"') {
                m1894v(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new C1426d();
            }
            i7++;
        }
        this.f1708a = i7;
        if (z9) {
            double dM1892m = j7 * m1892m(j8, z8);
            if (dM1892m > 9.223372036854776E18d || dM1892m < -9.223372036854776E18d) {
                m1894v(this, "Numeric value overflow", 0, null, 6, null);
                throw new C1426d();
            }
            if (Math.floor(dM1892m) != dM1892m) {
                m1894v(this, "Can't convert " + dM1892m + " to Long", 0, null, 6, null);
                throw new C1426d();
            }
            j7 = (long) dM1892m;
        }
        if (z10) {
            return j7;
        }
        if (j7 != Long.MIN_VALUE) {
            return -j7;
        }
        m1894v(this, "Numeric value overflow", 0, null, 6, null);
        throw new C1426d();
    }

    /* JADX INFO: renamed from: n */
    public final String m1910n() {
        return this.f1710c != null ? m1884I() : mo1908i();
    }

    /* JADX INFO: renamed from: o */
    protected final String m1911o(CharSequence source, int i7, int i8) {
        AbstractC6118n.m27187e(source, "source");
        char cCharAt = source.charAt(i8);
        boolean z7 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int iMo1900E = mo1900E(m1888b(i7, i8));
                if (iMo1900E == -1) {
                    m1894v(this, "Unexpected EOF", iMo1900E, null, 4, null);
                    throw new C1426d();
                }
                z7 = true;
                i7 = iMo1900E;
                i8 = i7;
            } else {
                i8++;
                if (i8 >= source.length()) {
                    m1906d(i7, i8);
                    int iMo1900E2 = mo1900E(i8);
                    if (iMo1900E2 == -1) {
                        m1894v(this, "Unexpected EOF", iMo1900E2, null, 4, null);
                        throw new C1426d();
                    }
                    i7 = iMo1900E2;
                    i8 = i7;
                    z7 = true;
                } else {
                    continue;
                }
            }
            cCharAt = source.charAt(i8);
        }
        String strM1902H = !z7 ? m1902H(i7, i8) : m1893r(i7, i8);
        this.f1708a = i8 + 1;
        return strM1902H;
    }

    /* JADX INFO: renamed from: p */
    public final String m1912p() {
        if (this.f1710c != null) {
            return m1884I();
        }
        int iMo1873G = mo1873G();
        if (iMo1873G >= mo1897A().length() || iMo1873G == -1) {
            m1894v(this, "EOF", iMo1873G, null, 4, null);
            throw new C1426d();
        }
        byte bM1919a = AbstractC0441b.m1919a(mo1897A().charAt(iMo1873G));
        if (bM1919a == 1) {
            return m1910n();
        }
        if (bM1919a != 0) {
            m1894v(this, "Expected beginning of the string, but got " + mo1897A().charAt(iMo1873G), 0, null, 6, null);
            throw new C1426d();
        }
        boolean z7 = false;
        while (AbstractC0441b.m1919a(mo1897A().charAt(iMo1873G)) == 0) {
            iMo1873G++;
            if (iMo1873G >= mo1897A().length()) {
                m1906d(this.f1708a, iMo1873G);
                int iMo1900E = mo1900E(iMo1873G);
                if (iMo1900E == -1) {
                    this.f1708a = iMo1873G;
                    return m1893r(0, 0);
                }
                iMo1873G = iMo1900E;
                z7 = true;
            }
        }
        String strM1902H = !z7 ? m1902H(this.f1708a, iMo1873G) : m1893r(this.f1708a, iMo1873G);
        this.f1708a = iMo1873G;
        return strM1902H;
    }

    /* JADX INFO: renamed from: q */
    public final String m1913q() {
        String strM1912p = m1912p();
        if (!AbstractC6118n.m27183a(strM1912p, "null") || !m1886N()) {
            return strM1912p;
        }
        m1894v(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new C1426d();
    }

    /* JADX INFO: renamed from: s */
    public void m1914s() {
    }

    /* JADX INFO: renamed from: t */
    public final void m1915t() {
        if (mo1875j() == 10) {
            return;
        }
        m1894v(this, "Expected EOF after parsing, but had " + mo1897A().charAt(this.f1708a - 1) + " instead", 0, null, 6, null);
        throw new C1426d();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) mo1897A()) + "', currentPosition=" + this.f1708a + ')';
    }

    /* JADX INFO: renamed from: u */
    public final Void m1916u(String message, int i7, String hint) {
        String str;
        AbstractC6118n.m27187e(message, "message");
        AbstractC6118n.m27187e(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw AbstractC0456q.m1965d(i7, message + " at path: " + this.f1709b.m1982a() + str, mo1897A());
    }

    /* JADX INFO: renamed from: w */
    public final Void m1917w(byte b7, boolean z7) {
        String strM1921c = AbstractC0441b.m1921c(b7);
        int i7 = z7 ? this.f1708a - 1 : this.f1708a;
        m1894v(this, "Expected " + strM1921c + ", but had '" + ((this.f1708a == mo1897A().length() || i7 < 0) ? "EOF" : String.valueOf(mo1897A().charAt(i7))) + "' instead", i7, null, 4, null);
        throw new C1426d();
    }

    /* JADX INFO: renamed from: y */
    public final void m1918y(String key) {
        AbstractC6118n.m27187e(key, "key");
        m1916u("Encountered an unknown key '" + key + '\'', AbstractC6406h.m27608g0(m1902H(0, this.f1708a), key, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new C1426d();
    }
}

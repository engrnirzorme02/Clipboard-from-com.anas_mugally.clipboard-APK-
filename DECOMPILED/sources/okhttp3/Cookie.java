package okhttp3;

import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p152T5.AbstractC1638q;
import p302m6.AbstractC6406h;
import p302m6.C6405g;

/* JADX INFO: loaded from: classes.dex */
public final class Cookie {

    /* JADX INFO: renamed from: j */
    public static final Companion f25228j = new Companion(null);

    /* JADX INFO: renamed from: k */
    private static final Pattern f25229k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l */
    private static final Pattern f25230l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m */
    private static final Pattern f25231m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n */
    private static final Pattern f25232n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    private final String f25233a;

    /* JADX INFO: renamed from: b */
    private final String f25234b;

    /* JADX INFO: renamed from: c */
    private final long f25235c;

    /* JADX INFO: renamed from: d */
    private final String f25236d;

    /* JADX INFO: renamed from: e */
    private final String f25237e;

    /* JADX INFO: renamed from: f */
    private final boolean f25238f;

    /* JADX INFO: renamed from: g */
    private final boolean f25239g;

    /* JADX INFO: renamed from: h */
    private final boolean f25240h;

    /* JADX INFO: renamed from: i */
    private final boolean f25241i;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private long f25242a = 253402300799999L;

        /* JADX INFO: renamed from: b */
        private String f25243b = "/";
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final int m28414a(String str, int i7, int i8, boolean z7) {
            while (i7 < i8) {
                char cCharAt = str.charAt(i7);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z7)) {
                    return i7;
                }
                i7++;
            }
            return i8;
        }

        /* JADX INFO: renamed from: b */
        private final boolean m28415b(String str, String str2) {
            if (AbstractC6118n.m27183a(str, str2)) {
                return true;
            }
            return AbstractC6406h.m27563v(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.m28769i(str);
        }

        /* JADX INFO: renamed from: f */
        private final String m28416f(String str) {
            if (AbstractC6406h.m27563v(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strM28731e = HostnamesKt.m28731e(AbstractC6406h.m27624w0(str, "."));
            if (strM28731e != null) {
                return strM28731e;
            }
            throw new IllegalArgumentException();
        }

        /* JADX INFO: renamed from: g */
        private final long m28417g(String str, int i7, int i8) {
            int iM28414a = m28414a(str, i7, i8, false);
            Matcher matcher = Cookie.f25232n.matcher(str);
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int iA0 = -1;
            int i12 = -1;
            int i13 = -1;
            while (iM28414a < i8) {
                int iM28414a2 = m28414a(str, iM28414a + 1, i8, true);
                matcher.region(iM28414a, iM28414a2);
                if (i10 == -1 && matcher.usePattern(Cookie.f25232n).matches()) {
                    String strGroup = matcher.group(1);
                    AbstractC6118n.m27186d(strGroup, "matcher.group(1)");
                    i10 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    AbstractC6118n.m27186d(strGroup2, "matcher.group(2)");
                    i12 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    AbstractC6118n.m27186d(strGroup3, "matcher.group(3)");
                    i13 = Integer.parseInt(strGroup3);
                } else if (i11 == -1 && matcher.usePattern(Cookie.f25231m).matches()) {
                    String strGroup4 = matcher.group(1);
                    AbstractC6118n.m27186d(strGroup4, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup4);
                } else if (iA0 == -1 && matcher.usePattern(Cookie.f25230l).matches()) {
                    String strGroup5 = matcher.group(1);
                    AbstractC6118n.m27186d(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    AbstractC6118n.m27186d(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    AbstractC6118n.m27186d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = Cookie.f25230l.pattern();
                    AbstractC6118n.m27186d(strPattern, "MONTH_PATTERN.pattern()");
                    iA0 = AbstractC6406h.m27602a0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i9 == -1 && matcher.usePattern(Cookie.f25229k).matches()) {
                    String strGroup6 = matcher.group(1);
                    AbstractC6118n.m27186d(strGroup6, "matcher.group(1)");
                    i9 = Integer.parseInt(strGroup6);
                }
                iM28414a = m28414a(str, iM28414a2 + 1, i8, false);
            }
            if (70 <= i9 && i9 < 100) {
                i9 += 1900;
            }
            if (i9 >= 0 && i9 < 70) {
                i9 += 2000;
            }
            if (i9 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iA0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i11 || i11 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i10 < 0 || i10 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i12 < 0 || i12 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.f25482f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i9);
            gregorianCalendar.set(2, iA0 - 1);
            gregorianCalendar.set(5, i11);
            gregorianCalendar.set(11, i10);
            gregorianCalendar.set(12, i12);
            gregorianCalendar.set(13, i13);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* JADX INFO: renamed from: h */
        private final long m28418h(String str) {
            try {
                long j7 = Long.parseLong(str);
                if (j7 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j7;
            } catch (NumberFormatException e7) {
                if (new C6405g("-?\\d+").m27529a(str)) {
                    return AbstractC6406h.m27557K(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e7;
            }
        }

        /* JADX INFO: renamed from: c */
        public final Cookie m28419c(HttpUrl url, String setCookie) {
            AbstractC6118n.m27187e(url, "url");
            AbstractC6118n.m27187e(setCookie, "setCookie");
            return m28420d(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX INFO: renamed from: d */
        public final Cookie m28420d(long j7, HttpUrl url, String setCookie) {
            long j8;
            AbstractC6118n.m27187e(url, "url");
            AbstractC6118n.m27187e(setCookie, "setCookie");
            int iM28778r = Util.m28778r(setCookie, ';', 0, 0, 6, null);
            int iM28778r2 = Util.m28778r(setCookie, '=', 0, iM28778r, 2, null);
            Cookie cookie = null;
            if (iM28778r2 == iM28778r) {
                return null;
            }
            String strM28759a0 = Util.m28759a0(setCookie, 0, iM28778r2, 1, null);
            if (strM28759a0.length() == 0 || Util.m28785y(strM28759a0) != -1) {
                return null;
            }
            String strM28757Z = Util.m28757Z(setCookie, iM28778r2 + 1, iM28778r);
            if (Util.m28785y(strM28757Z) != -1) {
                return null;
            }
            int i7 = iM28778r + 1;
            int length = setCookie.length();
            String strM28416f = null;
            String str = null;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = true;
            long jM28418h = -1;
            long jM28417g = 253402300799999L;
            while (i7 < length) {
                int iM28776p = Util.m28776p(setCookie, ';', i7, length);
                int iM28776p2 = Util.m28776p(setCookie, '=', i7, iM28776p);
                String strM28757Z2 = Util.m28757Z(setCookie, i7, iM28776p2);
                String strM28757Z3 = iM28776p2 < iM28776p ? Util.m28757Z(setCookie, iM28776p2 + 1, iM28776p) : "";
                Cookie cookie2 = cookie;
                if (AbstractC6406h.m27564w(strM28757Z2, "expires", true)) {
                    try {
                        jM28417g = m28417g(strM28757Z3, 0, strM28757Z3.length());
                        z8 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (AbstractC6406h.m27564w(strM28757Z2, "max-age", true)) {
                    jM28418h = m28418h(strM28757Z3);
                    z8 = true;
                } else if (AbstractC6406h.m27564w(strM28757Z2, "domain", true)) {
                    strM28416f = m28416f(strM28757Z3);
                    z10 = false;
                } else if (AbstractC6406h.m27564w(strM28757Z2, "path", true)) {
                    str = strM28757Z3;
                } else if (AbstractC6406h.m27564w(strM28757Z2, "secure", true)) {
                    z9 = true;
                } else if (AbstractC6406h.m27564w(strM28757Z2, "httponly", true)) {
                    z7 = true;
                }
                i7 = iM28776p + 1;
                cookie = cookie2;
            }
            Cookie cookie3 = cookie;
            if (jM28418h == Long.MIN_VALUE) {
                j8 = Long.MIN_VALUE;
            } else if (jM28418h != -1) {
                long j9 = j7 + (jM28418h <= 9223372036854775L ? jM28418h * ((long) zzbbn.zzq.zzf) : Long.MAX_VALUE);
                j8 = (j9 < j7 || j9 > 253402300799999L) ? 253402300799999L : j9;
            } else {
                j8 = jM28417g;
            }
            String strM28504h = url.m28504h();
            if (strM28416f == null) {
                strM28416f = strM28504h;
            } else if (!m28415b(strM28504h, strM28416f)) {
                return cookie3;
            }
            if (strM28504h.length() != strM28416f.length() && PublicSuffixDatabase.f26039e.m29436c().m29433c(strM28416f) == null) {
                return cookie3;
            }
            String strSubstring = "/";
            if (str == null || !AbstractC6406h.m27557K(str, "/", false, 2, cookie3)) {
                String strM28500d = url.m28500d();
                int iF0 = AbstractC6406h.m27607f0(strM28500d, '/', 0, false, 6, null);
                if (iF0 != 0) {
                    strSubstring = strM28500d.substring(0, iF0);
                    AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new Cookie(strM28759a0, strM28757Z, j8, strM28416f, str, z9, z7, z8, z10, null);
        }

        /* JADX INFO: renamed from: e */
        public final List m28421e(HttpUrl url, Headers headers) {
            AbstractC6118n.m27187e(url, "url");
            AbstractC6118n.m27187e(headers, "headers");
            List listM28481k = headers.m28481k("Set-Cookie");
            int size = listM28481k.size();
            ArrayList arrayList = null;
            for (int i7 = 0; i7 < size; i7++) {
                Cookie cookieM28419c = m28419c(url, (String) listM28481k.get(i7));
                if (cookieM28419c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookieM28419c);
                }
            }
            if (arrayList == null) {
                return AbstractC1638q.m6765j();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC6118n.m27186d(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j7, String str3, String str4, boolean z7, boolean z8, boolean z9, boolean z10, AbstractC6112h abstractC6112h) {
        this(str, str2, j7, str3, str4, z7, z8, z9, z10);
    }

    /* JADX INFO: renamed from: e */
    public final String m28411e() {
        return this.f25233a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return AbstractC6118n.m27183a(cookie.f25233a, this.f25233a) && AbstractC6118n.m27183a(cookie.f25234b, this.f25234b) && cookie.f25235c == this.f25235c && AbstractC6118n.m27183a(cookie.f25236d, this.f25236d) && AbstractC6118n.m27183a(cookie.f25237e, this.f25237e) && cookie.f25238f == this.f25238f && cookie.f25239g == this.f25239g && cookie.f25240h == this.f25240h && cookie.f25241i == this.f25241i;
    }

    /* JADX INFO: renamed from: f */
    public final String m28412f(boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25233a);
        sb.append('=');
        sb.append(this.f25234b);
        if (this.f25240h) {
            if (this.f25235c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.m29046b(new Date(this.f25235c)));
            }
        }
        if (!this.f25241i) {
            sb.append("; domain=");
            if (z7) {
                sb.append(".");
            }
            sb.append(this.f25236d);
        }
        sb.append("; path=");
        sb.append(this.f25237e);
        if (this.f25238f) {
            sb.append("; secure");
        }
        if (this.f25239g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "toString()");
        return string;
    }

    /* JADX INFO: renamed from: g */
    public final String m28413g() {
        return this.f25234b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f25233a.hashCode()) * 31) + this.f25234b.hashCode()) * 31) + Long.hashCode(this.f25235c)) * 31) + this.f25236d.hashCode()) * 31) + this.f25237e.hashCode()) * 31) + Boolean.hashCode(this.f25238f)) * 31) + Boolean.hashCode(this.f25239g)) * 31) + Boolean.hashCode(this.f25240h)) * 31) + Boolean.hashCode(this.f25241i);
    }

    public String toString() {
        return m28412f(false);
    }

    private Cookie(String str, String str2, long j7, String str3, String str4, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f25233a = str;
        this.f25234b = str2;
        this.f25235c = j7;
        this.f25236d = str3;
        this.f25237e = str4;
        this.f25238f = z7;
        this.f25239g = z8;
        this.f25240h = z9;
        this.f25241i = z10;
    }
}

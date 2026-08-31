package okhttp3;

import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import p072I6.C0648e;
import p152T5.AbstractC1638q;
import p278j6.AbstractC5905g;
import p278j6.C5902d;
import p302m6.AbstractC6406h;
import p302m6.C6405g;

/* JADX INFO: loaded from: classes.dex */
public final class HttpUrl {

    /* JADX INFO: renamed from: k */
    public static final Companion f25278k = new Companion(null);

    /* JADX INFO: renamed from: l */
    private static final char[] f25279l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    private final String f25280a;

    /* JADX INFO: renamed from: b */
    private final String f25281b;

    /* JADX INFO: renamed from: c */
    private final String f25282c;

    /* JADX INFO: renamed from: d */
    private final String f25283d;

    /* JADX INFO: renamed from: e */
    private final int f25284e;

    /* JADX INFO: renamed from: f */
    private final List f25285f;

    /* JADX INFO: renamed from: g */
    private final List f25286g;

    /* JADX INFO: renamed from: h */
    private final String f25287h;

    /* JADX INFO: renamed from: i */
    private final String f25288i;

    /* JADX INFO: renamed from: j */
    private final boolean f25289j;

    public static final class Builder {

        /* JADX INFO: renamed from: i */
        public static final Companion f25290i = new Companion(null);

        /* JADX INFO: renamed from: a */
        private String f25291a;

        /* JADX INFO: renamed from: d */
        private String f25294d;

        /* JADX INFO: renamed from: f */
        private final List f25296f;

        /* JADX INFO: renamed from: g */
        private List f25297g;

        /* JADX INFO: renamed from: h */
        private String f25298h;

        /* JADX INFO: renamed from: b */
        private String f25292b = "";

        /* JADX INFO: renamed from: c */
        private String f25293c = "";

        /* JADX INFO: renamed from: e */
        private int f25295e = -1;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: e */
            public final int m28541e(String str, int i7, int i8) {
                try {
                    int i9 = Integer.parseInt(Companion.m28545b(HttpUrl.f25278k, str, i7, i8, "", false, false, false, false, null, 248, null));
                    if (1 > i9 || i9 >= 65536) {
                        return -1;
                    }
                    return i9;
                } catch (NumberFormatException unused) {
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: f */
            public final int m28542f(String str, int i7, int i8) {
                while (i7 < i8) {
                    char cCharAt = str.charAt(i7);
                    if (cCharAt == '[') {
                        do {
                            i7++;
                            if (i7 >= i8) {
                                break;
                            }
                        } while (str.charAt(i7) != ']');
                    } else if (cCharAt == ':') {
                        return i7;
                    }
                    i7++;
                }
                return i8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: g */
            public final int m28543g(String str, int i7, int i8) {
                if (i8 - i7 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i7);
                if ((AbstractC6118n.m27188f(cCharAt, 97) >= 0 && AbstractC6118n.m27188f(cCharAt, 122) <= 0) || (AbstractC6118n.m27188f(cCharAt, 65) >= 0 && AbstractC6118n.m27188f(cCharAt, 90) <= 0)) {
                    while (true) {
                        i7++;
                        if (i7 >= i8) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i7);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h */
            public final int m28544h(String str, int i7, int i8) {
                int i9 = 0;
                while (i7 < i8) {
                    char cCharAt = str.charAt(i7);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i9++;
                    i7++;
                }
                return i9;
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f25296f = arrayList;
            arrayList.add("");
        }

        /* JADX INFO: renamed from: b */
        private final int m28515b() {
            int i7 = this.f25295e;
            if (i7 != -1) {
                return i7;
            }
            Companion companion = HttpUrl.f25278k;
            String str = this.f25291a;
            AbstractC6118n.m27184b(str);
            return companion.m28551c(str);
        }

        /* JADX INFO: renamed from: f */
        private final boolean m28516f(String str) {
            return AbstractC6118n.m27183a(str, ".") || AbstractC6406h.m27564w(str, "%2e", true);
        }

        /* JADX INFO: renamed from: g */
        private final boolean m28517g(String str) {
            return AbstractC6118n.m27183a(str, "..") || AbstractC6406h.m27564w(str, "%2e.", true) || AbstractC6406h.m27564w(str, ".%2e", true) || AbstractC6406h.m27564w(str, "%2e%2e", true);
        }

        /* JADX INFO: renamed from: j */
        private final void m28518j() {
            List list = this.f25296f;
            if (((String) list.remove(list.size() - 1)).length() != 0 || this.f25296f.isEmpty()) {
                this.f25296f.add("");
            } else {
                List list2 = this.f25296f;
                list2.set(list2.size() - 1, "");
            }
        }

        /* JADX INFO: renamed from: l */
        private final void m28519l(String str, int i7, int i8, boolean z7, boolean z8) {
            String strM28545b = Companion.m28545b(HttpUrl.f25278k, str, i7, i8, " \"<>^`{}|/\\?#", z8, false, false, false, null, 240, null);
            if (m28516f(strM28545b)) {
                return;
            }
            if (m28517g(strM28545b)) {
                m28518j();
                return;
            }
            List list = this.f25296f;
            if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                List list2 = this.f25296f;
                list2.set(list2.size() - 1, strM28545b);
            } else {
                this.f25296f.add(strM28545b);
            }
            if (z7) {
                this.f25296f.add("");
            }
        }

        /* JADX INFO: renamed from: n */
        private final void m28520n(String str, int i7, int i8) {
            if (i7 == i8) {
                return;
            }
            char cCharAt = str.charAt(i7);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f25296f.clear();
                this.f25296f.add("");
                i7++;
            } else {
                List list = this.f25296f;
                list.set(list.size() - 1, "");
            }
            int i9 = i7;
            while (i9 < i8) {
                int iM28777q = Util.m28777q(str, "/\\", i9, i8);
                boolean z7 = iM28777q < i8;
                str = str;
                m28519l(str, i9, iM28777q, z7, true);
                i9 = z7 ? iM28777q + 1 : iM28777q;
            }
        }

        /* JADX INFO: renamed from: a */
        public final HttpUrl m28521a() {
            ArrayList arrayList;
            String str = this.f25291a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.f25278k;
            String strM28547h = Companion.m28547h(companion, this.f25292b, 0, 0, false, 7, null);
            String strM28547h2 = Companion.m28547h(companion, this.f25293c, 0, 0, false, 7, null);
            String str2 = this.f25294d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM28515b = m28515b();
            List list = this.f25296f;
            ArrayList arrayList2 = new ArrayList(AbstractC1638q.m6774s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.m28547h(HttpUrl.f25278k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f25297g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(AbstractC1638q.m6774s(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? Companion.m28547h(HttpUrl.f25278k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f25298h;
            return new HttpUrl(str, strM28547h, strM28547h2, str2, iM28515b, arrayList2, arrayList, str4 != null ? Companion.m28547h(HttpUrl.f25278k, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* JADX INFO: renamed from: c */
        public final Builder m28522c(String str) {
            Companion companion;
            String strM28545b;
            this.f25297g = (str == null || (strM28545b = Companion.m28545b((companion = HttpUrl.f25278k), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : companion.m28556j(strM28545b);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final List m28523d() {
            return this.f25296f;
        }

        /* JADX INFO: renamed from: e */
        public final Builder m28524e(String host) {
            AbstractC6118n.m27187e(host, "host");
            String strM28731e = HostnamesKt.m28731e(Companion.m28547h(HttpUrl.f25278k, host, 0, 0, false, 7, null));
            if (strM28731e != null) {
                this.f25294d = strM28731e;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        /* JADX INFO: renamed from: h */
        public final Builder m28525h(HttpUrl httpUrl, String str) {
            String str2;
            int iM28777q;
            int i7;
            boolean z7;
            int i8;
            int i9;
            char c7;
            int i10;
            String input = str;
            AbstractC6118n.m27187e(input, "input");
            int iM28732A = Util.m28732A(input, 0, 0, 3, null);
            int iM28734C = Util.m28734C(input, iM28732A, 0, 2, null);
            Companion companion = f25290i;
            int iM28543g = companion.m28543g(input, iM28732A, iM28734C);
            boolean z8 = true;
            byte b7 = -1;
            if (iM28543g != -1) {
                if (AbstractC6406h.m27554H(input, "https:", iM28732A, true)) {
                    this.f25291a = "https";
                    iM28732A += 6;
                } else {
                    if (!AbstractC6406h.m27554H(input, "http:", iM28732A, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iM28543g);
                        AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f25291a = "http";
                    iM28732A += 5;
                }
            } else {
                if (httpUrl == null) {
                    if (input.length() > 6) {
                        str2 = AbstractC6406h.m27630V0(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f25291a = httpUrl.m28512p();
            }
            int iM28544h = companion.m28544h(input, iM28732A, iM28734C);
            byte b8 = 63;
            byte b9 = 35;
            if (iM28544h >= 2 || httpUrl == null || !AbstractC6118n.m27183a(httpUrl.m28512p(), this.f25291a)) {
                int i11 = iM28732A + iM28544h;
                boolean z9 = false;
                boolean z10 = false;
                while (true) {
                    iM28777q = Util.m28777q(input, "@/\\?#", i11, iM28734C);
                    byte bCharAt = iM28777q != iM28734C ? input.charAt(iM28777q) : b7;
                    if (bCharAt == b7 || bCharAt == b9 || bCharAt == 47 || bCharAt == 92 || bCharAt == b8) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z9) {
                            z7 = z8;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f25293c);
                            sb2.append("%40");
                            input = str;
                            i8 = iM28777q;
                            sb2.append(Companion.m28545b(HttpUrl.f25278k, input, i11, iM28777q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f25293c = sb2.toString();
                        } else {
                            int iM28776p = Util.m28776p(input, ':', i11, iM28777q);
                            Companion companion2 = HttpUrl.f25278k;
                            z7 = z8;
                            String strM28545b = Companion.m28545b(companion2, input, i11, iM28776p, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z10) {
                                strM28545b = this.f25292b + "%40" + strM28545b;
                            }
                            this.f25292b = strM28545b;
                            if (iM28776p != iM28777q) {
                                i9 = iM28777q;
                                this.f25293c = Companion.m28545b(companion2, str, iM28776p + 1, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z9 = z7;
                            } else {
                                i9 = iM28777q;
                            }
                            input = str;
                            i8 = i9;
                            z10 = z7;
                        }
                        i11 = i8 + 1;
                        iM28734C = iM28734C;
                        z8 = z7;
                        b8 = 63;
                        b7 = -1;
                        b9 = 35;
                    }
                }
                i7 = iM28734C;
                Companion companion3 = f25290i;
                int iM28542f = companion3.m28542f(input, i11, iM28777q);
                int i12 = iM28542f + 1;
                if (i12 < iM28777q) {
                    this.f25294d = HostnamesKt.m28731e(Companion.m28547h(HttpUrl.f25278k, input, i11, iM28542f, false, 4, null));
                    int iM28541e = companion3.m28541e(input, i12, iM28777q);
                    this.f25295e = iM28541e;
                    if (iM28541e == -1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i12, iM28777q);
                        AbstractC6118n.m27186d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.f25278k;
                    this.f25294d = HostnamesKt.m28731e(Companion.m28547h(companion4, input, i11, iM28542f, false, 4, null));
                    String str3 = this.f25291a;
                    AbstractC6118n.m27184b(str3);
                    this.f25295e = companion4.m28551c(str3);
                }
                if (this.f25294d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i11, iM28542f);
                    AbstractC6118n.m27186d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iM28732A = iM28777q;
            } else {
                this.f25292b = httpUrl.m28503g();
                this.f25293c = httpUrl.m28499c();
                this.f25294d = httpUrl.m28504h();
                this.f25295e = httpUrl.m28508l();
                this.f25296f.clear();
                this.f25296f.addAll(httpUrl.m28501e());
                if (iM28732A == iM28734C || input.charAt(iM28732A) == '#') {
                    m28522c(httpUrl.m28502f());
                }
                i7 = iM28734C;
            }
            int i13 = i7;
            int iM28777q2 = Util.m28777q(input, "?#", iM28732A, i13);
            m28520n(input, iM28732A, iM28777q2);
            if (iM28777q2 >= i13 || input.charAt(iM28777q2) != '?') {
                c7 = '#';
                i10 = iM28777q2;
            } else {
                c7 = '#';
                int iM28776p2 = Util.m28776p(input, '#', iM28777q2, i13);
                Companion companion5 = HttpUrl.f25278k;
                this.f25297g = companion5.m28556j(Companion.m28545b(companion5, input, iM28777q2 + 1, iM28776p2, " \"'<>#", true, false, true, false, null, 208, null));
                i10 = iM28776p2;
            }
            if (i10 < i13 && input.charAt(i10) == c7) {
                this.f25298h = Companion.m28545b(HttpUrl.f25278k, input, i10 + 1, i13, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        /* JADX INFO: renamed from: i */
        public final Builder m28526i(String password) {
            AbstractC6118n.m27187e(password, "password");
            this.f25293c = Companion.m28545b(HttpUrl.f25278k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final Builder m28527k(int i7) {
            if (1 <= i7 && i7 < 65536) {
                this.f25295e = i7;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i7).toString());
        }

        /* JADX INFO: renamed from: m */
        public final Builder m28528m() {
            String str = this.f25294d;
            this.f25294d = str != null ? new C6405g("[\"<>^`{|}]").m27530b(str, "") : null;
            int size = this.f25296f.size();
            for (int i7 = 0; i7 < size; i7++) {
                List list = this.f25296f;
                list.set(i7, Companion.m28545b(HttpUrl.f25278k, (String) list.get(i7), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f25297g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    String str2 = (String) list2.get(i8);
                    list2.set(i8, str2 != null ? Companion.m28545b(HttpUrl.f25278k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f25298h;
            this.f25298h = str3 != null ? Companion.m28545b(HttpUrl.f25278k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public final Builder m28529o(String scheme) {
            AbstractC6118n.m27187e(scheme, "scheme");
            if (AbstractC6406h.m27564w(scheme, "http", true)) {
                this.f25291a = "http";
                return this;
            }
            if (AbstractC6406h.m27564w(scheme, "https", true)) {
                this.f25291a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        /* JADX INFO: renamed from: p */
        public final void m28530p(String str) {
            this.f25298h = str;
        }

        /* JADX INFO: renamed from: q */
        public final void m28531q(String str) {
            AbstractC6118n.m27187e(str, "<set-?>");
            this.f25293c = str;
        }

        /* JADX INFO: renamed from: r */
        public final void m28532r(String str) {
            AbstractC6118n.m27187e(str, "<set-?>");
            this.f25292b = str;
        }

        /* JADX INFO: renamed from: s */
        public final void m28533s(String str) {
            this.f25294d = str;
        }

        /* JADX INFO: renamed from: t */
        public final void m28534t(int i7) {
            this.f25295e = i7;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0085  */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f25291a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f25292b.length() > 0 || this.f25293c.length() > 0) {
                sb.append(this.f25292b);
                if (this.f25293c.length() > 0) {
                    sb.append(':');
                    sb.append(this.f25293c);
                }
                sb.append('@');
            }
            String str2 = this.f25294d;
            if (str2 != null) {
                AbstractC6118n.m27184b(str2);
                if (AbstractC6406h.m27587P(str2, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(this.f25294d);
                    sb.append(']');
                } else {
                    sb.append(this.f25294d);
                }
            }
            if (this.f25295e != -1 || this.f25291a != null) {
                int iM28515b = m28515b();
                String str3 = this.f25291a;
                if (str3 != null) {
                    Companion companion = HttpUrl.f25278k;
                    AbstractC6118n.m27184b(str3);
                    if (iM28515b != companion.m28551c(str3)) {
                        sb.append(':');
                        sb.append(iM28515b);
                    }
                } else {
                    sb.append(':');
                    sb.append(iM28515b);
                }
            }
            Companion companion2 = HttpUrl.f25278k;
            companion2.m28555i(this.f25296f, sb);
            if (this.f25297g != null) {
                sb.append('?');
                List list = this.f25297g;
                AbstractC6118n.m27184b(list);
                companion2.m28557k(list, sb);
            }
            if (this.f25298h != null) {
                sb.append('#');
                sb.append(this.f25298h);
            }
            String string = sb.toString();
            AbstractC6118n.m27186d(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        /* JADX INFO: renamed from: u */
        public final void m28535u(String str) {
            this.f25291a = str;
        }

        /* JADX INFO: renamed from: v */
        public final Builder m28536v(String username) {
            AbstractC6118n.m27187e(username, "username");
            this.f25292b = Companion.m28545b(HttpUrl.f25278k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ String m28545b(Companion companion, String str, int i7, int i8, String str2, boolean z7, boolean z8, boolean z9, boolean z10, Charset charset, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i7 = 0;
            }
            if ((i9 & 2) != 0) {
                i8 = str.length();
            }
            if ((i9 & 8) != 0) {
                z7 = false;
            }
            if ((i9 & 16) != 0) {
                z8 = false;
            }
            if ((i9 & 32) != 0) {
                z9 = false;
            }
            if ((i9 & 64) != 0) {
                z10 = false;
            }
            if ((i9 & 128) != 0) {
                charset = null;
            }
            return companion.m28550a(str, i7, i8, str2, z7, z8, z9, z10, charset);
        }

        /* JADX INFO: renamed from: e */
        private final boolean m28546e(String str, int i7, int i8) {
            int i9 = i7 + 2;
            return i9 < i8 && str.charAt(i7) == '%' && Util.m28740I(str.charAt(i7 + 1)) != -1 && Util.m28740I(str.charAt(i9)) != -1;
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ String m28547h(Companion companion, String str, int i7, int i8, boolean z7, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i7 = 0;
            }
            if ((i9 & 2) != 0) {
                i8 = str.length();
            }
            if ((i9 & 4) != 0) {
                z7 = false;
            }
            return companion.m28554g(str, i7, i8, z7);
        }

        /* JADX INFO: renamed from: l */
        private final void m28548l(C0648e c0648e, String str, int i7, int i8, String str2, boolean z7, boolean z8, boolean z9, boolean z10, Charset charset) throws EOFException {
            int iCharCount = i7;
            C0648e c0648e2 = null;
            while (iCharCount < i8) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z7 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z9) {
                        c0648e.mo3031X(z7 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z10)) {
                            if (!AbstractC6406h.m27587P(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z7 && (!z8 || m28546e(str, iCharCount, i8))))) {
                                c0648e.m3078y1(iCodePointAt);
                            }
                        }
                        if (c0648e2 == null) {
                            c0648e2 = new C0648e();
                        }
                        if (charset == null || AbstractC6118n.m27183a(charset, StandardCharsets.UTF_8)) {
                            c0648e2.m3078y1(iCodePointAt);
                        } else {
                            c0648e2.m3071u1(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!c0648e2.mo3009E()) {
                            byte b7 = c0648e2.readByte();
                            c0648e.mo3010F(37);
                            c0648e.mo3010F(HttpUrl.f25279l[((b7 & 255) >> 4) & 15]);
                            c0648e.mo3010F(HttpUrl.f25279l[b7 & 15]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        /* JADX INFO: renamed from: m */
        private final void m28549m(C0648e c0648e, String str, int i7, int i8, boolean z7) {
            int i9;
            while (i7 < i8) {
                int iCodePointAt = str.codePointAt(i7);
                if (iCodePointAt == 37 && (i9 = i7 + 2) < i8) {
                    int iM28740I = Util.m28740I(str.charAt(i7 + 1));
                    int iM28740I2 = Util.m28740I(str.charAt(i9));
                    if (iM28740I == -1 || iM28740I2 == -1) {
                        c0648e.m3078y1(iCodePointAt);
                        i7 += Character.charCount(iCodePointAt);
                    } else {
                        c0648e.mo3010F((iM28740I << 4) + iM28740I2);
                        i7 = Character.charCount(iCodePointAt) + i9;
                    }
                } else if (iCodePointAt == 43 && z7) {
                    c0648e.mo3010F(32);
                    i7++;
                } else {
                    c0648e.m3078y1(iCodePointAt);
                    i7 += Character.charCount(iCodePointAt);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final String m28550a(String str, int i7, int i8, String encodeSet, boolean z7, boolean z8, boolean z9, boolean z10, Charset charset) throws EOFException {
            AbstractC6118n.m27187e(str, "<this>");
            AbstractC6118n.m27187e(encodeSet, "encodeSet");
            int iCharCount = i7;
            while (iCharCount < i8) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z10) || AbstractC6406h.m27587P(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z7 || (z8 && !m28546e(str, iCharCount, i8)))) || (iCodePointAt == 43 && z9)))) {
                    C0648e c0648e = new C0648e();
                    c0648e.m3077x1(str, i7, iCharCount);
                    m28548l(c0648e, str, iCharCount, i8, encodeSet, z7, z8, z9, z10, charset);
                    return c0648e.m3042e1();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i7, i8);
            AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* JADX INFO: renamed from: c */
        public final int m28551c(String scheme) {
            AbstractC6118n.m27187e(scheme, "scheme");
            if (AbstractC6118n.m27183a(scheme, "http")) {
                return 80;
            }
            return AbstractC6118n.m27183a(scheme, "https") ? 443 : -1;
        }

        /* JADX INFO: renamed from: d */
        public final HttpUrl m28552d(String str) {
            AbstractC6118n.m27187e(str, "<this>");
            return new Builder().m28525h(null, str).m28521a();
        }

        /* JADX INFO: renamed from: f */
        public final HttpUrl m28553f(String str) {
            AbstractC6118n.m27187e(str, "<this>");
            try {
                return m28552d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: g */
        public final String m28554g(String str, int i7, int i8, boolean z7) {
            AbstractC6118n.m27187e(str, "<this>");
            for (int i9 = i7; i9 < i8; i9++) {
                char cCharAt = str.charAt(i9);
                if (cCharAt == '%' || (cCharAt == '+' && z7)) {
                    C0648e c0648e = new C0648e();
                    c0648e.m3077x1(str, i7, i9);
                    m28549m(c0648e, str, i9, i8, z7);
                    return c0648e.m3042e1();
                }
            }
            String strSubstring = str.substring(i7, i8);
            AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* JADX INFO: renamed from: i */
        public final void m28555i(List list, StringBuilder out) {
            AbstractC6118n.m27187e(list, "<this>");
            AbstractC6118n.m27187e(out, "out");
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                out.append('/');
                out.append((String) list.get(i7));
            }
        }

        /* JADX INFO: renamed from: j */
        public final List m28556j(String str) {
            AbstractC6118n.m27187e(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            while (i7 <= str.length()) {
                String str2 = str;
                int iZ = AbstractC6406h.m27601Z(str2, '&', i7, false, 4, null);
                if (iZ == -1) {
                    iZ = str2.length();
                }
                int iZ2 = AbstractC6406h.m27601Z(str2, '=', i7, false, 4, null);
                if (iZ2 == -1 || iZ2 > iZ) {
                    String strSubstring = str2.substring(i7, iZ);
                    AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i7, iZ2);
                    AbstractC6118n.m27186d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iZ2 + 1, iZ);
                    AbstractC6118n.m27186d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i7 = iZ + 1;
                str = str2;
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: k */
        public final void m28557k(List list, StringBuilder out) {
            AbstractC6118n.m27187e(list, "<this>");
            AbstractC6118n.m27187e(out, "out");
            C5902d c5902dJ = AbstractC5905g.m26662j(AbstractC5905g.m26663k(0, list.size()), 2);
            int iM26643a = c5902dJ.m26643a();
            int iM26644b = c5902dJ.m26644b();
            int iM26645e = c5902dJ.m26645e();
            if ((iM26645e <= 0 || iM26643a > iM26644b) && (iM26645e >= 0 || iM26644b > iM26643a)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iM26643a);
                String str2 = (String) list.get(iM26643a + 1);
                if (iM26643a > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (iM26643a == iM26644b) {
                    return;
                } else {
                    iM26643a += iM26645e;
                }
            }
        }

        private Companion() {
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i7, List pathSegments, List list, String str, String url) {
        AbstractC6118n.m27187e(scheme, "scheme");
        AbstractC6118n.m27187e(username, "username");
        AbstractC6118n.m27187e(password, "password");
        AbstractC6118n.m27187e(host, "host");
        AbstractC6118n.m27187e(pathSegments, "pathSegments");
        AbstractC6118n.m27187e(url, "url");
        this.f25280a = scheme;
        this.f25281b = username;
        this.f25282c = password;
        this.f25283d = host;
        this.f25284e = i7;
        this.f25285f = pathSegments;
        this.f25286g = list;
        this.f25287h = str;
        this.f25288i = url;
        this.f25289j = AbstractC6118n.m27183a(scheme, "https");
    }

    /* JADX INFO: renamed from: b */
    public final String m28498b() {
        if (this.f25287h == null) {
            return null;
        }
        String strSubstring = this.f25288i.substring(AbstractC6406h.m27601Z(this.f25288i, '#', 0, false, 6, null) + 1);
        AbstractC6118n.m27186d(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: c */
    public final String m28499c() {
        if (this.f25282c.length() == 0) {
            return "";
        }
        String strSubstring = this.f25288i.substring(AbstractC6406h.m27601Z(this.f25288i, ':', this.f25280a.length() + 3, false, 4, null) + 1, AbstractC6406h.m27601Z(this.f25288i, '@', 0, false, 6, null));
        AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: d */
    public final String m28500d() {
        int iZ = AbstractC6406h.m27601Z(this.f25288i, '/', this.f25280a.length() + 3, false, 4, null);
        String str = this.f25288i;
        String strSubstring = this.f25288i.substring(iZ, Util.m28777q(str, "?#", iZ, str.length()));
        AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: e */
    public final List m28501e() {
        int iZ = AbstractC6406h.m27601Z(this.f25288i, '/', this.f25280a.length() + 3, false, 4, null);
        String str = this.f25288i;
        int iM28777q = Util.m28777q(str, "?#", iZ, str.length());
        ArrayList arrayList = new ArrayList();
        while (iZ < iM28777q) {
            int i7 = iZ + 1;
            int iM28776p = Util.m28776p(this.f25288i, '/', i7, iM28777q);
            String strSubstring = this.f25288i.substring(i7, iM28776p);
            AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iZ = iM28776p;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && AbstractC6118n.m27183a(((HttpUrl) obj).f25288i, this.f25288i);
    }

    /* JADX INFO: renamed from: f */
    public final String m28502f() {
        if (this.f25286g == null) {
            return null;
        }
        int iZ = AbstractC6406h.m27601Z(this.f25288i, '?', 0, false, 6, null) + 1;
        String str = this.f25288i;
        String strSubstring = this.f25288i.substring(iZ, Util.m28776p(str, '#', iZ, str.length()));
        AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: g */
    public final String m28503g() {
        if (this.f25281b.length() == 0) {
            return "";
        }
        int length = this.f25280a.length() + 3;
        String str = this.f25288i;
        String strSubstring = this.f25288i.substring(length, Util.m28777q(str, ":@", length, str.length()));
        AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: h */
    public final String m28504h() {
        return this.f25283d;
    }

    public int hashCode() {
        return this.f25288i.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m28505i() {
        return this.f25289j;
    }

    /* JADX INFO: renamed from: j */
    public final Builder m28506j() {
        Builder builder = new Builder();
        builder.m28535u(this.f25280a);
        builder.m28532r(m28503g());
        builder.m28531q(m28499c());
        builder.m28533s(this.f25283d);
        builder.m28534t(this.f25284e != f25278k.m28551c(this.f25280a) ? this.f25284e : -1);
        builder.m28523d().clear();
        builder.m28523d().addAll(m28501e());
        builder.m28522c(m28502f());
        builder.m28530p(m28498b());
        return builder;
    }

    /* JADX INFO: renamed from: k */
    public final Builder m28507k(String link) {
        AbstractC6118n.m27187e(link, "link");
        try {
            return new Builder().m28525h(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m28508l() {
        return this.f25284e;
    }

    /* JADX INFO: renamed from: m */
    public final String m28509m() {
        if (this.f25286g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f25278k.m28557k(this.f25286g, sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public final String m28510n() {
        Builder builderM28507k = m28507k("/...");
        AbstractC6118n.m27184b(builderM28507k);
        return builderM28507k.m28536v("").m28526i("").m28521a().toString();
    }

    /* JADX INFO: renamed from: o */
    public final HttpUrl m28511o(String link) {
        AbstractC6118n.m27187e(link, "link");
        Builder builderM28507k = m28507k(link);
        if (builderM28507k != null) {
            return builderM28507k.m28521a();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final String m28512p() {
        return this.f25280a;
    }

    /* JADX INFO: renamed from: q */
    public final URI m28513q() {
        String string = m28506j().m28528m().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e7) {
            try {
                URI uriCreate = URI.create(new C6405g("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m27530b(string, ""));
                AbstractC6118n.m27186d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final URL m28514r() {
        try {
            return new URL(this.f25288i);
        } catch (MalformedURLException e7) {
            throw new RuntimeException(e7);
        }
    }

    public String toString() {
        return this.f25288i;
    }
}

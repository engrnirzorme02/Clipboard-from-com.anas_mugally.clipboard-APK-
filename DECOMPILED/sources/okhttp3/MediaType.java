package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p194Z5.AbstractC2168c;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class MediaType {

    /* JADX INFO: renamed from: e */
    public static final Companion f25301e = new Companion(null);

    /* JADX INFO: renamed from: f */
    private static final Pattern f25302f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g */
    private static final Pattern f25303g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    private final String f25304a;

    /* JADX INFO: renamed from: b */
    private final String f25305b;

    /* JADX INFO: renamed from: c */
    private final String f25306c;

    /* JADX INFO: renamed from: d */
    private final String[] f25307d;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final MediaType m28565a(String str) {
            AbstractC6118n.m27187e(str, "<this>");
            Matcher matcher = MediaType.f25302f.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            AbstractC6118n.m27186d(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            AbstractC6118n.m27186d(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            AbstractC6118n.m27186d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            AbstractC6118n.m27186d(strGroup2, "typeSubtype.group(2)");
            AbstractC6118n.m27186d(US, "US");
            String lowerCase2 = strGroup2.toLowerCase(US);
            AbstractC6118n.m27186d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.f25303g.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    AbstractC6118n.m27186d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (AbstractC6406h.m27557K(strGroup4, "'", false, 2, null) && AbstractC6406h.m27563v(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        AbstractC6118n.m27186d(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        /* JADX INFO: renamed from: b */
        public final MediaType m28566b(String str) {
            AbstractC6118n.m27187e(str, "<this>");
            try {
                return m28565a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, AbstractC6112h abstractC6112h) {
        this(str, str2, str3, strArr);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Charset m28562d(MediaType mediaType, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = null;
        }
        return mediaType.m28563c(charset);
    }

    /* JADX INFO: renamed from: c */
    public final Charset m28563c(Charset charset) {
        String strM28564e = m28564e("charset");
        if (strM28564e == null) {
            return charset;
        }
        try {
            return Charset.forName(strM28564e);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m28564e(String name) {
        AbstractC6118n.m27187e(name, "name");
        int i7 = 0;
        int iM8789b = AbstractC2168c.m8789b(0, this.f25307d.length - 1, 2);
        if (iM8789b < 0) {
            return null;
        }
        while (!AbstractC6406h.m27564w(this.f25307d[i7], name, true)) {
            if (i7 == iM8789b) {
                return null;
            }
            i7 += 2;
        }
        return this.f25307d[i7 + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && AbstractC6118n.m27183a(((MediaType) obj).f25304a, this.f25304a);
    }

    public int hashCode() {
        return this.f25304a.hashCode();
    }

    public String toString() {
        return this.f25304a;
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.f25304a = str;
        this.f25305b = str2;
        this.f25306c = str3;
        this.f25307d = strArr;
    }
}

package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class Challenge {

    /* JADX INFO: renamed from: a */
    private final String f25087a;

    /* JADX INFO: renamed from: b */
    private final Map f25088b;

    public Challenge(String scheme, Map authParams) {
        String lowerCase;
        AbstractC6118n.m27187e(scheme, "scheme");
        AbstractC6118n.m27187e(authParams, "authParams");
        this.f25087a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                AbstractC6118n.m27186d(US, "US");
                lowerCase = str.toLowerCase(US);
                AbstractC6118n.m27186d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC6118n.m27186d(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f25088b = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: a */
    public final Charset m28379a() {
        String str = (String) this.f25088b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                AbstractC6118n.m27186d(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        AbstractC6118n.m27186d(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    /* JADX INFO: renamed from: b */
    public final String m28380b() {
        return (String) this.f25088b.get("realm");
    }

    /* JADX INFO: renamed from: c */
    public final String m28381c() {
        return this.f25087a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return AbstractC6118n.m27183a(challenge.f25087a, this.f25087a) && AbstractC6118n.m27183a(challenge.f25088b, this.f25088b);
    }

    public int hashCode() {
        return ((899 + this.f25087a.hashCode()) * 31) + this.f25088b.hashCode();
    }

    public String toString() {
        return this.f25087a + " authParams=" + this.f25088b;
    }
}

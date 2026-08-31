package p067I1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: I1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0591k implements InterfaceC0589i {

    /* JADX INFO: renamed from: c */
    private final Map f2255c;

    /* JADX INFO: renamed from: d */
    private volatile Map f2256d;

    /* JADX INFO: renamed from: I1.k$a */
    public static final class a {

        /* JADX INFO: renamed from: d */
        private static final String f2257d;

        /* JADX INFO: renamed from: e */
        private static final Map f2258e;

        /* JADX INFO: renamed from: a */
        private boolean f2259a = true;

        /* JADX INFO: renamed from: b */
        private Map f2260b = f2258e;

        /* JADX INFO: renamed from: c */
        private boolean f2261c = true;

        static {
            String strM2605b = m2605b();
            f2257d = strM2605b;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM2605b)) {
                map.put("User-Agent", Collections.singletonList(new b(strM2605b)));
            }
            f2258e = Collections.unmodifiableMap(map);
        }

        /* JADX INFO: renamed from: b */
        static String m2605b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = property.charAt(i7);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: a */
        public C0591k m2606a() {
            this.f2259a = true;
            return new C0591k(this.f2260b);
        }
    }

    /* JADX INFO: renamed from: I1.k$b */
    static final class b implements InterfaceC0590j {

        /* JADX INFO: renamed from: a */
        private final String f2262a;

        b(String str) {
            this.f2262a = str;
        }

        @Override // p067I1.InterfaceC0590j
        /* JADX INFO: renamed from: a */
        public String mo2602a() {
            return this.f2262a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f2262a.equals(((b) obj).f2262a);
            }
            return false;
        }

        public int hashCode() {
            return this.f2262a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f2262a + "'}";
        }
    }

    C0591k(Map map) {
        this.f2255c = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: b */
    private String m2603b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            String strMo2602a = ((InterfaceC0590j) list.get(i7)).mo2602a();
            if (!TextUtils.isEmpty(strMo2602a)) {
                sb.append(strMo2602a);
                if (i7 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private Map m2604c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f2255c.entrySet()) {
            String strM2603b = m2603b((List) entry.getValue());
            if (!TextUtils.isEmpty(strM2603b)) {
                map.put((String) entry.getKey(), strM2603b);
            }
        }
        return map;
    }

    @Override // p067I1.InterfaceC0589i
    /* JADX INFO: renamed from: a */
    public Map mo2601a() {
        if (this.f2256d == null) {
            synchronized (this) {
                try {
                    if (this.f2256d == null) {
                        this.f2256d = Collections.unmodifiableMap(m2604c());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f2256d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0591k) {
            return this.f2255c.equals(((C0591k) obj).f2255c);
        }
        return false;
    }

    public int hashCode() {
        return this.f2255c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f2255c + '}';
    }
}

package p216c2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c2.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2993i {

    /* JADX INFO: renamed from: c2.i$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public final a m14952a(String str, int i7) {
            mo14907e().put(str, String.valueOf(i7));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m14953b(String str, long j7) {
            mo14907e().put(str, String.valueOf(j7));
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m14954c(String str, String str2) {
            mo14907e().put(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public abstract AbstractC2993i mo14906d();

        /* JADX INFO: renamed from: e */
        protected abstract Map mo14907e();

        /* JADX INFO: renamed from: f */
        protected abstract a mo14908f(Map map);

        /* JADX INFO: renamed from: g */
        public abstract a mo14909g(Integer num);

        /* JADX INFO: renamed from: h */
        public abstract a mo14910h(C2992h c2992h);

        /* JADX INFO: renamed from: i */
        public abstract a mo14911i(long j7);

        /* JADX INFO: renamed from: j */
        public abstract a mo14912j(byte[] bArr);

        /* JADX INFO: renamed from: k */
        public abstract a mo14913k(byte[] bArr);

        /* JADX INFO: renamed from: l */
        public abstract a mo14914l(Integer num);

        /* JADX INFO: renamed from: m */
        public abstract a mo14915m(String str);

        /* JADX INFO: renamed from: n */
        public abstract a mo14916n(String str);

        /* JADX INFO: renamed from: o */
        public abstract a mo14917o(long j7);
    }

    /* JADX INFO: renamed from: a */
    public static a m14946a() {
        return new C2986b.b().mo14908f(new HashMap());
    }

    /* JADX INFO: renamed from: b */
    public final String m14947b(String str) {
        String str2 = (String) mo14896c().get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: c */
    protected abstract Map mo14896c();

    /* JADX INFO: renamed from: d */
    public abstract Integer mo14897d();

    /* JADX INFO: renamed from: e */
    public abstract C2992h mo14898e();

    /* JADX INFO: renamed from: f */
    public abstract long mo14899f();

    /* JADX INFO: renamed from: g */
    public abstract byte[] mo14900g();

    /* JADX INFO: renamed from: h */
    public abstract byte[] mo14901h();

    /* JADX INFO: renamed from: i */
    public final int m14948i(String str) {
        String str2 = (String) mo14896c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: j */
    public final long m14949j(String str) {
        String str2 = (String) mo14896c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* JADX INFO: renamed from: k */
    public final Map m14950k() {
        return Collections.unmodifiableMap(mo14896c());
    }

    /* JADX INFO: renamed from: l */
    public abstract Integer mo14902l();

    /* JADX INFO: renamed from: m */
    public abstract String mo14903m();

    /* JADX INFO: renamed from: n */
    public abstract String mo14904n();

    /* JADX INFO: renamed from: o */
    public abstract long mo14905o();

    /* JADX INFO: renamed from: p */
    public a m14951p() {
        return new C2986b.b().mo14916n(mo14904n()).mo14909g(mo14897d()).mo14914l(mo14902l()).mo14915m(mo14903m()).mo14912j(mo14900g()).mo14913k(mo14901h()).mo14910h(mo14898e()).mo14911i(mo14899f()).mo14917o(mo14905o()).mo14908f(new HashMap(mo14896c()));
    }
}

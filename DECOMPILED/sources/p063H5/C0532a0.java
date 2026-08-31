package p063H5;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0532a0 {

    /* JADX INFO: renamed from: a */
    private final d f1999a;

    /* JADX INFO: renamed from: b */
    private final String f2000b;

    /* JADX INFO: renamed from: c */
    private final String f2001c;

    /* JADX INFO: renamed from: d */
    private final c f2002d;

    /* JADX INFO: renamed from: e */
    private final c f2003e;

    /* JADX INFO: renamed from: f */
    private final Object f2004f;

    /* JADX INFO: renamed from: g */
    private final boolean f2005g;

    /* JADX INFO: renamed from: h */
    private final boolean f2006h;

    /* JADX INFO: renamed from: i */
    private final boolean f2007i;

    /* JADX INFO: renamed from: j */
    private final AtomicReferenceArray f2008j;

    /* JADX INFO: renamed from: H5.a0$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private c f2009a;

        /* JADX INFO: renamed from: b */
        private c f2010b;

        /* JADX INFO: renamed from: c */
        private d f2011c;

        /* JADX INFO: renamed from: d */
        private String f2012d;

        /* JADX INFO: renamed from: e */
        private boolean f2013e;

        /* JADX INFO: renamed from: f */
        private boolean f2014f;

        /* JADX INFO: renamed from: g */
        private Object f2015g;

        /* JADX INFO: renamed from: h */
        private boolean f2016h;

        /* JADX INFO: renamed from: a */
        public C0532a0 m2330a() {
            return new C0532a0(this.f2011c, this.f2012d, this.f2009a, this.f2010b, this.f2015g, this.f2013e, this.f2014f, this.f2016h);
        }

        /* JADX INFO: renamed from: b */
        public b m2331b(String str) {
            this.f2012d = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m2332c(c cVar) {
            this.f2009a = cVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m2333d(c cVar) {
            this.f2010b = cVar;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m2334e(boolean z7) {
            this.f2016h = z7;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m2335f(d dVar) {
            this.f2011c = dVar;
            return this;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: H5.a0$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        Object mo2336a(InputStream inputStream);

        /* JADX INFO: renamed from: b */
        InputStream mo2337b(Object obj);
    }

    /* JADX INFO: renamed from: H5.a0$d */
    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        /* JADX INFO: renamed from: c */
        public final boolean m2338c() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2320a(String str) {
        int iLastIndexOf = ((String) AbstractC1209m.m5303o(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return null;
        }
        return str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: b */
    public static String m2321b(String str, String str2) {
        return ((String) AbstractC1209m.m5303o(str, "fullServiceName")) + "/" + ((String) AbstractC1209m.m5303o(str2, "methodName"));
    }

    /* JADX INFO: renamed from: g */
    public static b m2322g() {
        return m2323h(null, null);
    }

    /* JADX INFO: renamed from: h */
    public static b m2323h(c cVar, c cVar2) {
        return new b().m2332c(cVar).m2333d(cVar2);
    }

    /* JADX INFO: renamed from: c */
    public String m2324c() {
        return this.f2000b;
    }

    /* JADX INFO: renamed from: d */
    public String m2325d() {
        return this.f2001c;
    }

    /* JADX INFO: renamed from: e */
    public d m2326e() {
        return this.f1999a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m2327f() {
        return this.f2006h;
    }

    /* JADX INFO: renamed from: i */
    public Object m2328i(InputStream inputStream) {
        return this.f2003e.mo2336a(inputStream);
    }

    /* JADX INFO: renamed from: j */
    public InputStream m2329j(Object obj) {
        return this.f2002d.mo2337b(obj);
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("fullMethodName", this.f2000b).m5277d("type", this.f1999a).m5278e("idempotent", this.f2005g).m5278e("safe", this.f2006h).m5278e("sampledToLocalTracing", this.f2007i).m5277d("requestMarshaller", this.f2002d).m5277d("responseMarshaller", this.f2003e).m5277d("schemaDescriptor", this.f2004f).m5280m().toString();
    }

    private C0532a0(d dVar, String str, c cVar, c cVar2, Object obj, boolean z7, boolean z8, boolean z9) {
        this.f2008j = new AtomicReferenceArray(2);
        this.f1999a = (d) AbstractC1209m.m5303o(dVar, "type");
        this.f2000b = (String) AbstractC1209m.m5303o(str, "fullMethodName");
        this.f2001c = m2320a(str);
        this.f2002d = (c) AbstractC1209m.m5303o(cVar, "requestMarshaller");
        this.f2003e = (c) AbstractC1209m.m5303o(cVar2, "responseMarshaller");
        this.f2004f = obj;
        this.f2005g = z7;
        this.f2006h = z8;
        this.f2007i = z9;
    }
}

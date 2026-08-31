package p063H5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0535c {

    /* JADX INFO: renamed from: k */
    public static final C0535c f2023k;

    /* JADX INFO: renamed from: a */
    private final C0568t f2024a;

    /* JADX INFO: renamed from: b */
    private final Executor f2025b;

    /* JADX INFO: renamed from: c */
    private final String f2026c;

    /* JADX INFO: renamed from: d */
    private final AbstractC0533b f2027d;

    /* JADX INFO: renamed from: e */
    private final String f2028e;

    /* JADX INFO: renamed from: f */
    private final Object[][] f2029f;

    /* JADX INFO: renamed from: g */
    private final List f2030g;

    /* JADX INFO: renamed from: h */
    private final Boolean f2031h;

    /* JADX INFO: renamed from: i */
    private final Integer f2032i;

    /* JADX INFO: renamed from: j */
    private final Integer f2033j;

    /* JADX INFO: renamed from: H5.c$b */
    static class b {

        /* JADX INFO: renamed from: a */
        C0568t f2034a;

        /* JADX INFO: renamed from: b */
        Executor f2035b;

        /* JADX INFO: renamed from: c */
        String f2036c;

        /* JADX INFO: renamed from: d */
        AbstractC0533b f2037d;

        /* JADX INFO: renamed from: e */
        String f2038e;

        /* JADX INFO: renamed from: f */
        Object[][] f2039f;

        /* JADX INFO: renamed from: g */
        List f2040g;

        /* JADX INFO: renamed from: h */
        Boolean f2041h;

        /* JADX INFO: renamed from: i */
        Integer f2042i;

        /* JADX INFO: renamed from: j */
        Integer f2043j;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public C0535c m2363b() {
            return new C0535c(this);
        }
    }

    /* JADX INFO: renamed from: H5.c$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final String f2044a;

        /* JADX INFO: renamed from: b */
        private final Object f2045b;

        private c(String str, Object obj) {
            this.f2044a = str;
            this.f2045b = obj;
        }

        /* JADX INFO: renamed from: b */
        public static c m2365b(String str) {
            AbstractC1209m.m5303o(str, "debugString");
            return new c(str, null);
        }

        public String toString() {
            return this.f2044a;
        }
    }

    static {
        b bVar = new b();
        bVar.f2039f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        bVar.f2040g = Collections.EMPTY_LIST;
        f2023k = bVar.m2363b();
    }

    /* JADX INFO: renamed from: k */
    private static b m2342k(C0535c c0535c) {
        b bVar = new b();
        bVar.f2034a = c0535c.f2024a;
        bVar.f2035b = c0535c.f2025b;
        bVar.f2036c = c0535c.f2026c;
        bVar.f2037d = c0535c.f2027d;
        bVar.f2038e = c0535c.f2028e;
        bVar.f2039f = c0535c.f2029f;
        bVar.f2040g = c0535c.f2030g;
        bVar.f2041h = c0535c.f2031h;
        bVar.f2042i = c0535c.f2032i;
        bVar.f2043j = c0535c.f2033j;
        return bVar;
    }

    /* JADX INFO: renamed from: a */
    public String m2343a() {
        return this.f2026c;
    }

    /* JADX INFO: renamed from: b */
    public String m2344b() {
        return this.f2028e;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC0533b m2345c() {
        return this.f2027d;
    }

    /* JADX INFO: renamed from: d */
    public C0568t m2346d() {
        return this.f2024a;
    }

    /* JADX INFO: renamed from: e */
    public Executor m2347e() {
        return this.f2025b;
    }

    /* JADX INFO: renamed from: f */
    public Integer m2348f() {
        return this.f2032i;
    }

    /* JADX INFO: renamed from: g */
    public Integer m2349g() {
        return this.f2033j;
    }

    /* JADX INFO: renamed from: h */
    public Object m2350h(c cVar) {
        AbstractC1209m.m5303o(cVar, "key");
        int i7 = 0;
        while (true) {
            Object[][] objArr = this.f2029f;
            if (i7 >= objArr.length) {
                return cVar.f2045b;
            }
            if (cVar.equals(objArr[i7][0])) {
                return this.f2029f[i7][1];
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: i */
    public List m2351i() {
        return this.f2030g;
    }

    /* JADX INFO: renamed from: j */
    public boolean m2352j() {
        return Boolean.TRUE.equals(this.f2031h);
    }

    /* JADX INFO: renamed from: l */
    public C0535c m2353l(AbstractC0533b abstractC0533b) {
        b bVarM2342k = m2342k(this);
        bVarM2342k.f2037d = abstractC0533b;
        return bVarM2342k.m2363b();
    }

    /* JADX INFO: renamed from: m */
    public C0535c m2354m(C0568t c0568t) {
        b bVarM2342k = m2342k(this);
        bVarM2342k.f2034a = c0568t;
        return bVarM2342k.m2363b();
    }

    /* JADX INFO: renamed from: n */
    public C0535c m2355n(Executor executor) {
        b bVarM2342k = m2342k(this);
        bVarM2342k.f2035b = executor;
        return bVarM2342k.m2363b();
    }

    /* JADX INFO: renamed from: o */
    public C0535c m2356o(int i7) {
        AbstractC1209m.m5296h(i7 >= 0, "invalid maxsize %s", i7);
        b bVarM2342k = m2342k(this);
        bVarM2342k.f2042i = Integer.valueOf(i7);
        return bVarM2342k.m2363b();
    }

    /* JADX INFO: renamed from: p */
    public C0535c m2357p(int i7) {
        AbstractC1209m.m5296h(i7 >= 0, "invalid maxsize %s", i7);
        b bVarM2342k = m2342k(this);
        bVarM2342k.f2043j = Integer.valueOf(i7);
        return bVarM2342k.m2363b();
    }

    /* JADX INFO: renamed from: q */
    public C0535c m2358q(c cVar, Object obj) {
        AbstractC1209m.m5303o(cVar, "key");
        AbstractC1209m.m5303o(obj, "value");
        b bVarM2342k = m2342k(this);
        int i7 = 0;
        while (true) {
            Object[][] objArr = this.f2029f;
            if (i7 >= objArr.length) {
                i7 = -1;
                break;
            }
            if (cVar.equals(objArr[i7][0])) {
                break;
            }
            i7++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f2029f.length + (i7 == -1 ? 1 : 0), 2);
        bVarM2342k.f2039f = objArr2;
        Object[][] objArr3 = this.f2029f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i7 == -1) {
            bVarM2342k.f2039f[this.f2029f.length] = new Object[]{cVar, obj};
        } else {
            bVarM2342k.f2039f[i7] = new Object[]{cVar, obj};
        }
        return bVarM2342k.m2363b();
    }

    /* JADX INFO: renamed from: r */
    public C0535c m2359r(AbstractC0551k.a aVar) {
        ArrayList arrayList = new ArrayList(this.f2030g.size() + 1);
        arrayList.addAll(this.f2030g);
        arrayList.add(aVar);
        b bVarM2342k = m2342k(this);
        bVarM2342k.f2040g = Collections.unmodifiableList(arrayList);
        return bVarM2342k.m2363b();
    }

    /* JADX INFO: renamed from: s */
    public C0535c m2360s() {
        b bVarM2342k = m2342k(this);
        bVarM2342k.f2041h = Boolean.TRUE;
        return bVarM2342k.m2363b();
    }

    /* JADX INFO: renamed from: t */
    public C0535c m2361t() {
        b bVarM2342k = m2342k(this);
        bVarM2342k.f2041h = Boolean.FALSE;
        return bVarM2342k.m2363b();
    }

    public String toString() {
        AbstractC1203g.b bVarM5277d = AbstractC1203g.m5267b(this).m5277d("deadline", this.f2024a).m5277d("authority", this.f2026c).m5277d("callCredentials", this.f2027d);
        Executor executor = this.f2025b;
        return bVarM5277d.m5277d("executor", executor != null ? executor.getClass() : null).m5277d("compressorName", this.f2028e).m5277d("customOptions", Arrays.deepToString(this.f2029f)).m5278e("waitForReady", m2352j()).m5277d("maxInboundMessageSize", this.f2032i).m5277d("maxOutboundMessageSize", this.f2033j).m5277d("streamTracerFactories", this.f2030g).toString();
    }

    private C0535c(b bVar) {
        this.f2024a = bVar.f2034a;
        this.f2025b = bVar.f2035b;
        this.f2026c = bVar.f2036c;
        this.f2027d = bVar.f2037d;
        this.f2028e = bVar.f2038e;
        this.f2029f = bVar.f2039f;
        this.f2030g = bVar.f2040g;
        this.f2031h = bVar.f2041h;
        this.f2032i = bVar.f2042i;
        this.f2033j = bVar.f2043j;
    }
}

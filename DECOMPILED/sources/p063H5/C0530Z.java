package p063H5;

import androidx.appcompat.app.AbstractC2263x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import p122P3.AbstractC1199c;
import p122P3.AbstractC1209m;
import p136R3.AbstractC1331a;
import p136R3.AbstractC1332b;

/* JADX INFO: renamed from: H5.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C0530Z {

    /* JADX INFO: renamed from: c */
    private static final Logger f1978c = Logger.getLogger(C0530Z.class.getName());

    /* JADX INFO: renamed from: d */
    public static final e f1979d = new a();

    /* JADX INFO: renamed from: e */
    public static final d f1980e = new b();

    /* JADX INFO: renamed from: f */
    static final AbstractC1331a f1981f = AbstractC1331a.m5692a().mo5702k();

    /* JADX INFO: renamed from: a */
    private Object[] f1982a;

    /* JADX INFO: renamed from: b */
    private int f1983b;

    /* JADX INFO: renamed from: H5.Z$a */
    class a implements e {
        a() {
        }
    }

    /* JADX INFO: renamed from: H5.Z$b */
    class b implements d {
        b() {
        }

        @Override // p063H5.C0530Z.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String mo2290b(String str) {
            return str;
        }

        @Override // p063H5.C0530Z.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String mo2289a(String str) {
            return str;
        }
    }

    /* JADX INFO: renamed from: H5.Z$c */
    private static class c extends g {

        /* JADX INFO: renamed from: f */
        private final d f1984f;

        /* synthetic */ c(String str, boolean z7, d dVar, a aVar) {
            this(str, z7, dVar);
        }

        @Override // p063H5.C0530Z.g
        /* JADX INFO: renamed from: h */
        Object mo2293h(byte[] bArr) {
            return this.f1984f.mo2290b(new String(bArr, AbstractC1199c.f4277a));
        }

        @Override // p063H5.C0530Z.g
        /* JADX INFO: renamed from: j */
        byte[] mo2294j(Object obj) {
            return ((String) AbstractC1209m.m5303o(this.f1984f.mo2289a(obj), "null marshaller.toAsciiString()")).getBytes(AbstractC1199c.f4277a);
        }

        private c(String str, boolean z7, d dVar) {
            super(str, z7, dVar, null);
            AbstractC1209m.m5299k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f1984f = (d) AbstractC1209m.m5303o(dVar, "marshaller");
        }
    }

    /* JADX INFO: renamed from: H5.Z$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        String mo2289a(Object obj);

        /* JADX INFO: renamed from: b */
        Object mo2290b(String str);
    }

    /* JADX INFO: renamed from: H5.Z$e */
    public interface e {
    }

    /* JADX INFO: renamed from: H5.Z$f */
    public interface f {
    }

    /* JADX INFO: renamed from: H5.Z$g */
    public static abstract class g {

        /* JADX INFO: renamed from: e */
        private static final BitSet f1985e = m2295b();

        /* JADX INFO: renamed from: a */
        private final String f1986a;

        /* JADX INFO: renamed from: b */
        private final String f1987b;

        /* JADX INFO: renamed from: c */
        private final byte[] f1988c;

        /* JADX INFO: renamed from: d */
        private final Object f1989d;

        /* synthetic */ g(String str, boolean z7, Object obj, a aVar) {
            this(str, z7, obj);
        }

        /* JADX INFO: renamed from: b */
        private static BitSet m2295b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c7 = '0'; c7 <= '9'; c7 = (char) (c7 + 1)) {
                bitSet.set(c7);
            }
            for (char c8 = 'a'; c8 <= 'z'; c8 = (char) (c8 + 1)) {
                bitSet.set(c8);
            }
            return bitSet;
        }

        /* JADX INFO: renamed from: e */
        public static g m2296e(String str, d dVar) {
            return m2297f(str, false, dVar);
        }

        /* JADX INFO: renamed from: f */
        static g m2297f(String str, boolean z7, d dVar) {
            return new c(str, z7, dVar, null);
        }

        /* JADX INFO: renamed from: g */
        static g m2298g(String str, boolean z7, j jVar) {
            return new i(str, z7, jVar, null);
        }

        /* JADX INFO: renamed from: k */
        private static String m2299k(String str, boolean z7) {
            AbstractC1209m.m5303o(str, "name");
            AbstractC1209m.m5293e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                C0530Z.f1978c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i7 = 0; i7 < str.length(); i7++) {
                char cCharAt = str.charAt(i7);
                if (!z7 || cCharAt != ':' || i7 != 0) {
                    AbstractC1209m.m5295g(f1985e.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, str);
                }
            }
            return str;
        }

        /* JADX INFO: renamed from: a */
        byte[] m2300a() {
            return this.f1988c;
        }

        /* JADX INFO: renamed from: c */
        final Object m2301c(Class cls) {
            if (cls.isInstance(this.f1989d)) {
                return cls.cast(this.f1989d);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final String m2302d() {
            return this.f1987b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f1987b.equals(((g) obj).f1987b);
        }

        /* JADX INFO: renamed from: h */
        abstract Object mo2293h(byte[] bArr);

        public final int hashCode() {
            return this.f1987b.hashCode();
        }

        /* JADX INFO: renamed from: i */
        boolean m2303i() {
            return false;
        }

        /* JADX INFO: renamed from: j */
        abstract byte[] mo2294j(Object obj);

        public String toString() {
            return "Key{name='" + this.f1987b + "'}";
        }

        private g(String str, boolean z7, Object obj) {
            String str2 = (String) AbstractC1209m.m5303o(str, "name");
            this.f1986a = str2;
            String strM2299k = m2299k(str2.toLowerCase(Locale.ROOT), z7);
            this.f1987b = strM2299k;
            this.f1988c = strM2299k.getBytes(AbstractC1199c.f4277a);
            this.f1989d = obj;
        }
    }

    /* JADX INFO: renamed from: H5.Z$h */
    static final class h {

        /* JADX INFO: renamed from: a */
        private final Object f1990a;

        /* JADX INFO: renamed from: b */
        private volatile byte[] f1991b;

        h(f fVar, Object obj) {
            this.f1990a = obj;
        }

        /* JADX INFO: renamed from: a */
        static h m2304a(g gVar, Object obj) {
            m2305b(gVar);
            AbstractC2263x.m9328a(AbstractC1209m.m5302n(null));
            return new h(null, obj);
        }

        /* JADX INFO: renamed from: b */
        private static f m2305b(g gVar) {
            AbstractC2263x.m9328a(gVar.m2301c(f.class));
            return null;
        }

        /* JADX INFO: renamed from: c */
        byte[] m2306c() {
            if (this.f1991b == null) {
                synchronized (this) {
                    try {
                        if (this.f1991b == null) {
                            this.f1991b = C0530Z.m2276r(m2308e());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f1991b;
        }

        /* JADX INFO: renamed from: d */
        Object m2307d(g gVar) {
            if (gVar.m2303i()) {
                m2305b(gVar);
            }
            return gVar.mo2293h(m2306c());
        }

        /* JADX INFO: renamed from: e */
        InputStream m2308e() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: H5.Z$i */
    private static final class i extends g {

        /* JADX INFO: renamed from: f */
        private final j f1992f;

        /* synthetic */ i(String str, boolean z7, j jVar, a aVar) {
            this(str, z7, jVar);
        }

        @Override // p063H5.C0530Z.g
        /* JADX INFO: renamed from: h */
        Object mo2293h(byte[] bArr) {
            return this.f1992f.mo2310b(bArr);
        }

        @Override // p063H5.C0530Z.g
        /* JADX INFO: renamed from: j */
        byte[] mo2294j(Object obj) {
            return (byte[]) AbstractC1209m.m5303o(this.f1992f.mo2309a(obj), "null marshaller.toAsciiString()");
        }

        private i(String str, boolean z7, j jVar) {
            super(str, z7, jVar, null);
            AbstractC1209m.m5299k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f1992f = (j) AbstractC1209m.m5303o(jVar, "marshaller");
        }
    }

    /* JADX INFO: renamed from: H5.Z$j */
    interface j {
        /* JADX INFO: renamed from: a */
        byte[] mo2309a(Object obj);

        /* JADX INFO: renamed from: b */
        Object mo2310b(byte[] bArr);
    }

    C0530Z(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    /* JADX INFO: renamed from: c */
    private boolean m2268c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    /* JADX INFO: renamed from: d */
    private int m2269d() {
        Object[] objArr = this.f1982a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    private void m2270f(int i7) {
        Object[] objArr = new Object[i7];
        if (!m2271i()) {
            System.arraycopy(this.f1982a, 0, objArr, 0, m2272k());
        }
        this.f1982a = objArr;
    }

    /* JADX INFO: renamed from: i */
    private boolean m2271i() {
        return this.f1983b == 0;
    }

    /* JADX INFO: renamed from: k */
    private int m2272k() {
        return this.f1983b * 2;
    }

    /* JADX INFO: renamed from: l */
    private void m2273l() {
        if (m2272k() == 0 || m2272k() == m2269d()) {
            m2270f(Math.max(m2272k() * 2, 8));
        }
    }

    /* JADX INFO: renamed from: n */
    private void m2274n(int i7, byte[] bArr) {
        this.f1982a[i7 * 2] = bArr;
    }

    /* JADX INFO: renamed from: o */
    private byte[] m2275o(int i7) {
        return (byte[]) this.f1982a[i7 * 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static byte[] m2276r(InputStream inputStream) {
        try {
            return AbstractC1332b.m5715d(inputStream);
        } catch (IOException e7) {
            throw new RuntimeException("failure reading serialized stream", e7);
        }
    }

    /* JADX INFO: renamed from: s */
    private Object m2277s(int i7) {
        return this.f1982a[(i7 * 2) + 1];
    }

    /* JADX INFO: renamed from: t */
    private void m2278t(int i7, Object obj) {
        if (this.f1982a instanceof byte[][]) {
            m2270f(m2269d());
        }
        this.f1982a[(i7 * 2) + 1] = obj;
    }

    /* JADX INFO: renamed from: u */
    private void m2279u(int i7, byte[] bArr) {
        this.f1982a[(i7 * 2) + 1] = bArr;
    }

    /* JADX INFO: renamed from: v */
    private byte[] m2280v(int i7) {
        Object objM2277s = m2277s(i7);
        return objM2277s instanceof byte[] ? (byte[]) objM2277s : ((h) objM2277s).m2306c();
    }

    /* JADX INFO: renamed from: w */
    private Object m2281w(int i7, g gVar) {
        Object objM2277s = m2277s(i7);
        return objM2277s instanceof byte[] ? gVar.mo2293h((byte[]) objM2277s) : ((h) objM2277s).m2307d(gVar);
    }

    /* JADX INFO: renamed from: e */
    public void m2282e(g gVar) {
        if (m2271i()) {
            return;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f1983b; i8++) {
            if (!m2268c(gVar.m2300a(), m2275o(i8))) {
                m2274n(i7, m2275o(i8));
                m2278t(i7, m2277s(i8));
                i7++;
            }
        }
        Arrays.fill(this.f1982a, i7 * 2, m2272k(), (Object) null);
        this.f1983b = i7;
    }

    /* JADX INFO: renamed from: g */
    public Object m2283g(g gVar) {
        for (int i7 = this.f1983b - 1; i7 >= 0; i7--) {
            if (m2268c(gVar.m2300a(), m2275o(i7))) {
                return m2281w(i7, gVar);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    int m2284h() {
        return this.f1983b;
    }

    /* JADX INFO: renamed from: j */
    public Set m2285j() {
        if (m2271i()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(this.f1983b);
        for (int i7 = 0; i7 < this.f1983b; i7++) {
            hashSet.add(new String(m2275o(i7), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: m */
    public void m2286m(C0530Z c0530z) {
        if (c0530z.m2271i()) {
            return;
        }
        int iM2269d = m2269d() - m2272k();
        if (m2271i() || iM2269d < c0530z.m2272k()) {
            m2270f(m2272k() + c0530z.m2272k());
        }
        System.arraycopy(c0530z.f1982a, 0, this.f1982a, m2272k(), c0530z.m2272k());
        this.f1983b += c0530z.f1983b;
    }

    /* JADX INFO: renamed from: p */
    public void m2287p(g gVar, Object obj) {
        AbstractC1209m.m5303o(gVar, "key");
        AbstractC1209m.m5303o(obj, "value");
        m2273l();
        m2274n(this.f1983b, gVar.m2300a());
        if (gVar.m2303i()) {
            m2278t(this.f1983b, h.m2304a(gVar, obj));
        } else {
            m2279u(this.f1983b, gVar.mo2294j(obj));
        }
        this.f1983b++;
    }

    /* JADX INFO: renamed from: q */
    byte[][] m2288q() {
        byte[][] bArr = new byte[m2272k()][];
        Object[] objArr = this.f1982a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, m2272k());
            return bArr;
        }
        for (int i7 = 0; i7 < this.f1983b; i7++) {
            int i8 = i7 * 2;
            bArr[i8] = m2275o(i7);
            bArr[i8 + 1] = m2280v(i7);
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i7 = 0; i7 < this.f1983b; i7++) {
            if (i7 != 0) {
                sb.append(',');
            }
            byte[] bArrM2275o = m2275o(i7);
            Charset charset = AbstractC1199c.f4277a;
            String str = new String(bArrM2275o, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(f1981f.m5697e(m2280v(i7)));
            } else {
                sb.append(new String(m2280v(i7), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    C0530Z(int i7, byte[]... bArr) {
        this(i7, (Object[]) bArr);
    }

    C0530Z(int i7, Object[] objArr) {
        this.f1983b = i7;
        this.f1982a = objArr;
    }

    public C0530Z() {
    }
}

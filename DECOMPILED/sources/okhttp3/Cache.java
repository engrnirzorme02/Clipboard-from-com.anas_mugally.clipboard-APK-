package okhttp3;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6103F;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import p072I6.AbstractC0653j;
import p072I6.AbstractC0654k;
import p072I6.AbstractC0659p;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0649f;
import p072I6.InterfaceC0650g;
import p072I6.InterfaceC0669z;
import p145S5.C1444v;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p220c6.AbstractC3026b;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class Cache implements Closeable, Flushable {

    /* JADX INFO: renamed from: r */
    public static final Companion f25017r = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final DiskLruCache f25018a;

    /* JADX INFO: renamed from: b */
    private int f25019b;

    /* JADX INFO: renamed from: c */
    private int f25020c;

    /* JADX INFO: renamed from: d */
    private int f25021d;

    /* JADX INFO: renamed from: e */
    private int f25022e;

    /* JADX INFO: renamed from: f */
    private int f25023f;

    private static final class CacheResponseBody extends ResponseBody {

        /* JADX INFO: renamed from: b */
        private final DiskLruCache.Snapshot f25024b;

        /* JADX INFO: renamed from: c */
        private final String f25025c;

        /* JADX INFO: renamed from: d */
        private final String f25026d;

        /* JADX INFO: renamed from: e */
        private final InterfaceC0650g f25027e;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            AbstractC6118n.m27187e(snapshot, "snapshot");
            this.f25024b = snapshot;
            this.f25025c = str;
            this.f25026d = str2;
            this.f25027e = AbstractC0659p.m3132d(new AbstractC0654k(snapshot.m28861m(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // p072I6.AbstractC0654k, p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    this.m28324Q().close();
                    super.close();
                }
            });
        }

        /* JADX INFO: renamed from: Q */
        public final DiskLruCache.Snapshot m28324Q() {
            return this.f25024b;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: m */
        public long mo28325m() {
            String str = this.f25026d;
            if (str != null) {
                return Util.m28755X(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: n */
        public MediaType mo28326n() {
            String str = this.f25025c;
            if (str != null) {
                return MediaType.f25301e.m28566b(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: x */
        public InterfaceC0650g mo28327x() {
            return this.f25027e;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: d */
        private final Set m28328d(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i7 = 0; i7 < size; i7++) {
                if (AbstractC6406h.m27564w("Vary", headers.m28478b(i7), true)) {
                    String strM28480g = headers.m28480g(i7);
                    if (treeSet == null) {
                        treeSet = new TreeSet(AbstractC6406h.m27565x(C6103F.f23863a));
                    }
                    Iterator it = AbstractC6406h.m27573F0(strM28480g, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(AbstractC6406h.m27594S0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? AbstractC1617O.m6650d() : treeSet;
        }

        /* JADX INFO: renamed from: e */
        private final Headers m28329e(Headers headers, Headers headers2) {
            Set setM28328d = m28328d(headers2);
            if (setM28328d.isEmpty()) {
                return Util.f25478b;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i7 = 0; i7 < size; i7++) {
                String strM28478b = headers.m28478b(i7);
                if (setM28328d.contains(strM28478b)) {
                    builder.m28482a(strM28478b, headers.m28480g(i7));
                }
            }
            return builder.m28485d();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m28330a(Response response) {
            AbstractC6118n.m27187e(response, "<this>");
            return m28328d(response.m28686o0()).contains("*");
        }

        /* JADX INFO: renamed from: b */
        public final String m28331b(HttpUrl url) {
            AbstractC6118n.m27187e(url, "url");
            return C0651h.f2562d.m3114d(url.toString()).m3107w().mo3104q();
        }

        /* JADX INFO: renamed from: c */
        public final int m28332c(InterfaceC0650g source) throws IOException {
            AbstractC6118n.m27187e(source, "source");
            try {
                long jMo3018O = source.mo3018O();
                String strMo3056n0 = source.mo3056n0();
                if (jMo3018O >= 0 && jMo3018O <= 2147483647L && strMo3056n0.length() <= 0) {
                    return (int) jMo3018O;
                }
                throw new IOException("expected an int but was \"" + jMo3018O + strMo3056n0 + '\"');
            } catch (NumberFormatException e7) {
                throw new IOException(e7.getMessage());
            }
        }

        /* JADX INFO: renamed from: f */
        public final Headers m28333f(Response response) {
            AbstractC6118n.m27187e(response, "<this>");
            Response responseM28673K0 = response.m28673K0();
            AbstractC6118n.m27184b(responseM28673K0);
            return m28329e(responseM28673K0.m28679U0().m28652f(), response.m28686o0());
        }

        /* JADX INFO: renamed from: g */
        public final boolean m28334g(Response cachedResponse, Headers cachedRequest, Request newRequest) {
            AbstractC6118n.m27187e(cachedResponse, "cachedResponse");
            AbstractC6118n.m27187e(cachedRequest, "cachedRequest");
            AbstractC6118n.m27187e(newRequest, "newRequest");
            Set<String> setM28328d = m28328d(cachedResponse.m28686o0());
            if (setM28328d != null && setM28328d.isEmpty()) {
                return true;
            }
            for (String str : setM28328d) {
                if (!AbstractC6118n.m27183a(cachedRequest.m28481k(str), newRequest.m28651e(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }
    }

    private final class RealCacheRequest implements CacheRequest {

        /* JADX INFO: renamed from: a */
        private final DiskLruCache.Editor f25042a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0669z f25043b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC0669z f25044c;

        /* JADX INFO: renamed from: d */
        private boolean f25045d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Cache f25046e;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            AbstractC6118n.m27187e(editor, "editor");
            this.f25046e = cache;
            this.f25042a = editor;
            InterfaceC0669z interfaceC0669zM28839f = editor.m28839f(1);
            this.f25043b = interfaceC0669zM28839f;
            this.f25044c = new AbstractC0653j(interfaceC0669zM28839f) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // p072I6.AbstractC0653j, p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    Cache cache2 = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.m28344d()) {
                            return;
                        }
                        realCacheRequest.m28345e(true);
                        cache2.m28317k0(cache2.m28323x() + 1);
                        super.close();
                        this.f25042a.m28835b();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        /* JADX INFO: renamed from: a */
        public void mo28342a() {
            Cache cache = this.f25046e;
            synchronized (cache) {
                if (this.f25045d) {
                    return;
                }
                this.f25045d = true;
                cache.m28316d0(cache.m28320n() + 1);
                Util.m28773m(this.f25043b);
                try {
                    this.f25042a.m28834a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        /* JADX INFO: renamed from: b */
        public InterfaceC0669z mo28343b() {
            return this.f25044c;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m28344d() {
            return this.f25045d;
        }

        /* JADX INFO: renamed from: e */
        public final void m28345e(boolean z7) {
            this.f25045d = z7;
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m28313d(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.m28834a();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final CacheRequest m28314J(Response response) {
        DiskLruCache.Editor editorM28805K0;
        AbstractC6118n.m27187e(response, "response");
        String strM28654h = response.m28679U0().m28654h();
        if (HttpMethod.f25726a.m29066a(response.m28679U0().m28654h())) {
            try {
                m28315Q(response.m28679U0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!AbstractC6118n.m27183a(strM28654h, "GET")) {
            return null;
        }
        Companion companion = f25017r;
        if (companion.m28330a(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editorM28805K0 = DiskLruCache.m28805K0(this.f25018a, companion.m28331b(response.m28679U0().m28656j()), 0L, 2, null);
            if (editorM28805K0 == null) {
                return null;
            }
            try {
                entry.m28340f(editorM28805K0);
                return new RealCacheRequest(this, editorM28805K0);
            } catch (IOException unused2) {
                m28313d(editorM28805K0);
                return null;
            }
        } catch (IOException unused3) {
            editorM28805K0 = null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m28315Q(Request request) {
        AbstractC6118n.m27187e(request, "request");
        this.f25018a.m28828c1(f25017r.m28331b(request.m28656j()));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25018a.close();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m28316d0(int i7) {
        this.f25020c = i7;
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f25018a.flush();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m28317k0(int i7) {
        this.f25019b = i7;
    }

    /* JADX INFO: renamed from: l0 */
    public final synchronized void m28318l0() {
        this.f25022e++;
    }

    /* JADX INFO: renamed from: m */
    public final Response m28319m(Request request) {
        AbstractC6118n.m27187e(request, "request");
        try {
            DiskLruCache.Snapshot snapshotM28821Q0 = this.f25018a.m28821Q0(f25017r.m28331b(request.m28656j()));
            if (snapshotM28821Q0 == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshotM28821Q0.m28861m(0));
                Response responseM28339d = entry.m28339d(snapshotM28821Q0);
                if (entry.m28338b(request, responseM28339d)) {
                    return responseM28339d;
                }
                ResponseBody responseBodyM28681d = responseM28339d.m28681d();
                if (responseBodyM28681d != null) {
                    Util.m28773m(responseBodyM28681d);
                }
                return null;
            } catch (IOException unused) {
                Util.m28773m(snapshotM28821Q0);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m28320n() {
        return this.f25020c;
    }

    /* JADX INFO: renamed from: o0 */
    public final synchronized void m28321o0(CacheStrategy cacheStrategy) {
        try {
            AbstractC6118n.m27187e(cacheStrategy, "cacheStrategy");
            this.f25023f++;
            if (cacheStrategy.m28796b() != null) {
                this.f25021d++;
            } else if (cacheStrategy.m28795a() != null) {
                this.f25022e++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m28322p0(Response cached, Response network) {
        DiskLruCache.Editor editorM28860d;
        AbstractC6118n.m27187e(cached, "cached");
        AbstractC6118n.m27187e(network, "network");
        Entry entry = new Entry(network);
        ResponseBody responseBodyM28681d = cached.m28681d();
        AbstractC6118n.m27185c(responseBodyM28681d, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editorM28860d = ((CacheResponseBody) responseBodyM28681d).m28324Q().m28860d();
            if (editorM28860d == null) {
                return;
            }
            try {
                entry.m28340f(editorM28860d);
                editorM28860d.m28835b();
            } catch (IOException unused) {
                m28313d(editorM28860d);
            }
        } catch (IOException unused2) {
            editorM28860d = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m28323x() {
        return this.f25019b;
    }

    private static final class Entry {

        /* JADX INFO: renamed from: k */
        public static final Companion f25029k = new Companion(null);

        /* JADX INFO: renamed from: l */
        private static final String f25030l;

        /* JADX INFO: renamed from: m */
        private static final String f25031m;

        /* JADX INFO: renamed from: a */
        private final HttpUrl f25032a;

        /* JADX INFO: renamed from: b */
        private final Headers f25033b;

        /* JADX INFO: renamed from: c */
        private final String f25034c;

        /* JADX INFO: renamed from: d */
        private final Protocol f25035d;

        /* JADX INFO: renamed from: e */
        private final int f25036e;

        /* JADX INFO: renamed from: f */
        private final String f25037f;

        /* JADX INFO: renamed from: g */
        private final Headers f25038g;

        /* JADX INFO: renamed from: h */
        private final Handshake f25039h;

        /* JADX INFO: renamed from: i */
        private final long f25040i;

        /* JADX INFO: renamed from: j */
        private final long f25041j;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
                this();
            }

            private Companion() {
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.f26006a;
            sb.append(companion.m29391g().m29380g());
            sb.append("-Sent-Millis");
            f25030l = sb.toString();
            f25031m = companion.m29391g().m29380g() + "-Received-Millis";
        }

        public Entry(InterfaceC0640B rawSource) throws IOException {
            AbstractC6118n.m27187e(rawSource, "rawSource");
            try {
                InterfaceC0650g interfaceC0650gM3132d = AbstractC0659p.m3132d(rawSource);
                String strMo3056n0 = interfaceC0650gM3132d.mo3056n0();
                HttpUrl httpUrlM28553f = HttpUrl.f25278k.m28553f(strMo3056n0);
                if (httpUrlM28553f == null) {
                    IOException iOException = new IOException("Cache corruption for " + strMo3056n0);
                    Platform.f26006a.m29391g().m29381k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f25032a = httpUrlM28553f;
                this.f25034c = interfaceC0650gM3132d.mo3056n0();
                Headers.Builder builder = new Headers.Builder();
                int iM28332c = Cache.f25017r.m28332c(interfaceC0650gM3132d);
                for (int i7 = 0; i7 < iM28332c; i7++) {
                    builder.m28483b(interfaceC0650gM3132d.mo3056n0());
                }
                this.f25033b = builder.m28485d();
                StatusLine statusLineM29087a = StatusLine.f25742d.m29087a(interfaceC0650gM3132d.mo3056n0());
                this.f25035d = statusLineM29087a.f25743a;
                this.f25036e = statusLineM29087a.f25744b;
                this.f25037f = statusLineM29087a.f25745c;
                Headers.Builder builder2 = new Headers.Builder();
                int iM28332c2 = Cache.f25017r.m28332c(interfaceC0650gM3132d);
                for (int i8 = 0; i8 < iM28332c2; i8++) {
                    builder2.m28483b(interfaceC0650gM3132d.mo3056n0());
                }
                String str = f25030l;
                String strM28486e = builder2.m28486e(str);
                String str2 = f25031m;
                String strM28486e2 = builder2.m28486e(str2);
                builder2.m28488g(str);
                builder2.m28488g(str2);
                this.f25040i = strM28486e != null ? Long.parseLong(strM28486e) : 0L;
                this.f25041j = strM28486e2 != null ? Long.parseLong(strM28486e2) : 0L;
                this.f25038g = builder2.m28485d();
                if (m28335a()) {
                    String strMo3056n1 = interfaceC0650gM3132d.mo3056n0();
                    if (strMo3056n1.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strMo3056n1 + '\"');
                    }
                    this.f25039h = Handshake.f25267e.m28473b(!interfaceC0650gM3132d.mo3009E() ? TlsVersion.f25469b.m28720a(interfaceC0650gM3132d.mo3056n0()) : TlsVersion.SSL_3_0, CipherSuite.f25143b.m28388b(interfaceC0650gM3132d.mo3056n0()), m28336c(interfaceC0650gM3132d), m28336c(interfaceC0650gM3132d));
                } else {
                    this.f25039h = null;
                }
                C1444v c1444v = C1444v.f4971a;
                AbstractC3026b.m14999a(rawSource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3026b.m14999a(rawSource, th);
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private final boolean m28335a() {
            return AbstractC6118n.m27183a(this.f25032a.m28512p(), "https");
        }

        /* JADX INFO: renamed from: c */
        private final List m28336c(InterfaceC0650g interfaceC0650g) throws IOException {
            int iM28332c = Cache.f25017r.m28332c(interfaceC0650g);
            if (iM28332c == -1) {
                return AbstractC1638q.m6765j();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iM28332c);
                for (int i7 = 0; i7 < iM28332c; i7++) {
                    String strMo3056n0 = interfaceC0650g.mo3056n0();
                    C0648e c0648e = new C0648e();
                    C0651h c0651hM3111a = C0651h.f2562d.m3111a(strMo3056n0);
                    if (c0651hM3111a == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c0648e.mo3017N0(c0651hM3111a);
                    arrayList.add(certificateFactory.generateCertificate(c0648e.mo3019O0()));
                }
                return arrayList;
            } catch (CertificateException e7) {
                throw new IOException(e7.getMessage());
            }
        }

        /* JADX INFO: renamed from: e */
        private final void m28337e(InterfaceC0649f interfaceC0649f, List list) throws IOException {
            try {
                interfaceC0649f.mo3012I0(list.size()).mo3010F(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    C0651h.a aVar = C0651h.f2562d;
                    AbstractC6118n.m27186d(bytes, "bytes");
                    interfaceC0649f.mo3031X(C0651h.a.m3110g(aVar, bytes, 0, 0, 3, null).mo3096c()).mo3010F(10);
                }
            } catch (CertificateEncodingException e7) {
                throw new IOException(e7.getMessage());
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m28338b(Request request, Response response) {
            AbstractC6118n.m27187e(request, "request");
            AbstractC6118n.m27187e(response, "response");
            return AbstractC6118n.m27183a(this.f25032a, request.m28656j()) && AbstractC6118n.m27183a(this.f25034c, request.m28654h()) && Cache.f25017r.m28334g(response, this.f25033b, request);
        }

        /* JADX INFO: renamed from: d */
        public final Response m28339d(DiskLruCache.Snapshot snapshot) {
            AbstractC6118n.m27187e(snapshot, "snapshot");
            String strM28477a = this.f25038g.m28477a("Content-Type");
            String strM28477a2 = this.f25038g.m28477a("Content-Length");
            return new Response.Builder().m28707r(new Request.Builder().m28665i(this.f25032a).m28661e(this.f25034c, null).m28660d(this.f25033b).m28658b()).m28705p(this.f25035d).m28696g(this.f25036e).m28702m(this.f25037f).m28700k(this.f25038g).m28693b(new CacheResponseBody(snapshot, strM28477a, strM28477a2)).m28698i(this.f25039h).m28708s(this.f25040i).m28706q(this.f25041j).m28694c();
        }

        /* JADX INFO: renamed from: f */
        public final void m28340f(DiskLruCache.Editor editor) throws IOException {
            AbstractC6118n.m27187e(editor, "editor");
            InterfaceC0649f interfaceC0649fM3131c = AbstractC0659p.m3131c(editor.m28839f(0));
            try {
                interfaceC0649fM3131c.mo3031X(this.f25032a.toString()).mo3010F(10);
                interfaceC0649fM3131c.mo3031X(this.f25034c).mo3010F(10);
                interfaceC0649fM3131c.mo3012I0(this.f25033b.size()).mo3010F(10);
                int size = this.f25033b.size();
                for (int i7 = 0; i7 < size; i7++) {
                    interfaceC0649fM3131c.mo3031X(this.f25033b.m28478b(i7)).mo3031X(": ").mo3031X(this.f25033b.m28480g(i7)).mo3010F(10);
                }
                interfaceC0649fM3131c.mo3031X(new StatusLine(this.f25035d, this.f25036e, this.f25037f).toString()).mo3010F(10);
                interfaceC0649fM3131c.mo3012I0(this.f25038g.size() + 2).mo3010F(10);
                int size2 = this.f25038g.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    interfaceC0649fM3131c.mo3031X(this.f25038g.m28478b(i8)).mo3031X(": ").mo3031X(this.f25038g.m28480g(i8)).mo3010F(10);
                }
                interfaceC0649fM3131c.mo3031X(f25030l).mo3031X(": ").mo3012I0(this.f25040i).mo3010F(10);
                interfaceC0649fM3131c.mo3031X(f25031m).mo3031X(": ").mo3012I0(this.f25041j).mo3010F(10);
                if (m28335a()) {
                    interfaceC0649fM3131c.mo3010F(10);
                    Handshake handshake = this.f25039h;
                    AbstractC6118n.m27184b(handshake);
                    interfaceC0649fM3131c.mo3031X(handshake.m28467a().m28384c()).mo3010F(10);
                    m28337e(interfaceC0649fM3131c, this.f25039h.m28469d());
                    m28337e(interfaceC0649fM3131c, this.f25039h.m28468c());
                    interfaceC0649fM3131c.mo3031X(this.f25039h.m28470e().m28719d()).mo3010F(10);
                }
                C1444v c1444v = C1444v.f4971a;
                AbstractC3026b.m14999a(interfaceC0649fM3131c, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3026b.m14999a(interfaceC0649fM3131c, th);
                    throw th2;
                }
            }
        }

        public Entry(Response response) {
            AbstractC6118n.m27187e(response, "response");
            this.f25032a = response.m28679U0().m28656j();
            this.f25033b = Cache.f25017r.m28333f(response);
            this.f25034c = response.m28679U0().m28654h();
            this.f25035d = response.m28677S0();
            this.f25036e = response.m28672J();
            this.f25037f = response.m28688w0();
            this.f25038g = response.m28686o0();
            this.f25039h = response.m28682d0();
            this.f25040i = response.m28680V0();
            this.f25041j = response.m28678T0();
        }
    }
}

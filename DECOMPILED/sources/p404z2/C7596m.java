package p404z2;

import android.util.JsonWriter;
import com.google.android.gms.common.util.AbstractC3748c;
import com.google.android.gms.common.util.C3753h;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: z2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7596m {

    /* JADX INFO: renamed from: c */
    private static boolean f30256c = false;

    /* JADX INFO: renamed from: d */
    private static boolean f30257d = false;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f30260g = 0;

    /* JADX INFO: renamed from: a */
    private final List f30261a;

    /* JADX INFO: renamed from: b */
    private static final Object f30255b = new Object();

    /* JADX INFO: renamed from: e */
    private static final InterfaceC3750e f30258e = C3753h.m18171d();

    /* JADX INFO: renamed from: f */
    private static final Set f30259f = new HashSet(Arrays.asList(new String[0]));

    public C7596m(String str) {
        this.f30261a = !m33304j() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    /* JADX INFO: renamed from: g */
    public static void m33301g() {
        synchronized (f30255b) {
            f30256c = false;
            f30257d = false;
            AbstractC7599p.m33331f("Ad debug logging enablement is out of date.");
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m33302h(boolean z7) {
        synchronized (f30255b) {
            f30256c = true;
            f30257d = z7;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m33303i() {
        boolean z7;
        synchronized (f30255b) {
            z7 = f30256c;
        }
        return z7;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m33304j() {
        boolean z7;
        synchronized (f30255b) {
            try {
                z7 = false;
                if (f30256c && f30257d) {
                    z7 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: k */
    static /* synthetic */ void m33305k(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m33310p(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(AbstractC3748c.m18155c(bArr));
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: renamed from: l */
    static /* synthetic */ void m33306l(int i7, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i7);
        jsonWriter.endObject();
        m33310p(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* JADX INFO: renamed from: m */
    private final void m33307m(final String str, final String str2, final Map map, final byte[] bArr) {
        m33311q("onNetworkRequest", new InterfaceC7595l() { // from class: z2.k
            @Override // p404z2.InterfaceC7595l
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo33300a(JsonWriter jsonWriter) throws IOException {
                C7596m.m33305k(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    private final void m33308n(final Map map, final int i7) {
        m33311q("onNetworkResponse", new InterfaceC7595l() { // from class: z2.h
            @Override // p404z2.InterfaceC7595l
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo33300a(JsonWriter jsonWriter) throws IOException {
                C7596m.m33306l(i7, map, jsonWriter);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    private final void m33309o(final String str) {
        m33311q("onNetworkRequestError", new InterfaceC7595l() { // from class: z2.j
            @Override // p404z2.InterfaceC7595l
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo33300a(JsonWriter jsonWriter) throws IOException {
                int i7 = C7596m.f30260g;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    private static void m33310p(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!f30259f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        AbstractC7599p.m33328c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    /* JADX INFO: renamed from: q */
    private final void m33311q(String str, InterfaceC7595l interfaceC7595l) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f30258e.mo18159a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f30261a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            interfaceC7595l.mo33300a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e7) {
            AbstractC7599p.m33329d("unable to log", e7);
        }
        m33312r(stringWriter.toString());
    }

    /* JADX INFO: renamed from: r */
    private static synchronized void m33312r(String str) {
        try {
            AbstractC7599p.m33330e("GMA Debug BEGIN");
            int i7 = 0;
            while (i7 < str.length()) {
                int i8 = i7 + 4000;
                AbstractC7599p.m33330e("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i7, Math.min(i8, str.length())))));
                i7 = i8;
            }
            AbstractC7599p.m33330e("GMA Debug FINISH");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m33313a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (m33304j()) {
            m33307m(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m33314b(String str, String str2, Map map, byte[] bArr) {
        if (m33304j()) {
            m33307m(str, "GET", map, bArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m33315c(HttpURLConnection httpURLConnection, int i7) {
        if (m33304j()) {
            String responseMessage = null;
            m33308n(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i7);
            if (i7 < 200 || i7 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e7) {
                    AbstractC7599p.m33331f("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e7.getMessage())));
                }
                m33309o(responseMessage);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m33316d(Map map, int i7) {
        if (m33304j()) {
            m33308n(map, i7);
            if (i7 < 200 || i7 >= 300) {
                m33309o(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m33317e(String str) {
        if (m33304j() && str != null) {
            m33318f(str.getBytes());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m33318f(final byte[] bArr) {
        m33311q("onNetworkResponseBody", new InterfaceC7595l() { // from class: z2.i
            @Override // p404z2.InterfaceC7595l
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo33300a(JsonWriter jsonWriter) throws IOException {
                int i7 = C7596m.f30260g;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strM18155c = AbstractC3748c.m18155c(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(strM18155c);
                } else {
                    String strM33285o = C7590g.m33285o(strM18155c);
                    if (strM33285o != null) {
                        jsonWriter.name("bodydigest").value(strM33285o);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}

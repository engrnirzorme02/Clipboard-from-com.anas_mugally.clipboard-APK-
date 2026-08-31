package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import p072I6.C0648e;
import p072I6.C0651h;
import p152T5.AbstractC1610H;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class HttpHeaders {

    /* JADX INFO: renamed from: a */
    private static final C0651h f25724a;

    /* JADX INFO: renamed from: b */
    private static final C0651h f25725b;

    static {
        C0651h.a aVar = C0651h.f2562d;
        f25724a = aVar.m3114d("\"\\");
        f25725b = aVar.m3114d("\t ,=");
    }

    /* JADX INFO: renamed from: a */
    public static final List m29056a(Headers headers, String headerName) {
        AbstractC6118n.m27187e(headers, "<this>");
        AbstractC6118n.m27187e(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (AbstractC6406h.m27564w(headerName, headers.m28478b(i7), true)) {
                try {
                    m29058c(new C0648e().mo3031X(headers.m28480g(i7)), arrayList);
                } catch (EOFException e7) {
                    Platform.f26006a.m29391g().m29381k("Unable to parse challenge", 5, e7);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m29057b(Response response) {
        AbstractC6118n.m27187e(response, "<this>");
        if (AbstractC6118n.m27183a(response.m28679U0().m28654h(), "HEAD")) {
            return false;
        }
        int iM28672J = response.m28672J();
        return (((iM28672J >= 100 && iM28672J < 200) || iM28672J == 204 || iM28672J == 304) && Util.m28782v(response) == -1 && !AbstractC6406h.m27564w("chunked", Response.m28671l0(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[EDGE_INSN: B:59:0x00bc->B:48:0x00bc BREAK  A[LOOP:2: B:22:0x0073->B:47:0x00ba], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    private static final void m29058c(C0648e c0648e, List list) throws EOFException {
        String strM29060e;
        while (true) {
            String strM29060e2 = null;
            while (true) {
                if (strM29060e2 == null) {
                    m29062g(c0648e);
                    strM29060e2 = m29060e(c0648e);
                    if (strM29060e2 == null) {
                        return;
                    }
                }
                boolean zM29062g = m29062g(c0648e);
                String strM29060e3 = m29060e(c0648e);
                if (strM29060e3 == null) {
                    if (c0648e.mo3009E()) {
                        list.add(new Challenge(strM29060e2, AbstractC1610H.m6626h()));
                        return;
                    }
                    return;
                }
                int iM28743L = Util.m28743L(c0648e, (byte) 61);
                boolean zM29062g2 = m29062g(c0648e);
                if (zM29062g || !(zM29062g2 || c0648e.mo3009E())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iM28743L2 = iM28743L + Util.m28743L(c0648e, (byte) 61);
                    while (true) {
                        if (strM29060e3 != null) {
                            if (iM28743L2 != 0) {
                                break;
                                break;
                            }
                            if (iM28743L2 <= 1) {
                                return;
                            }
                            if (m29063h(c0648e, (byte) 34)) {
                                strM29060e = m29059d(c0648e);
                            } else {
                                strM29060e = m29060e(c0648e);
                            }
                            if (strM29060e != null) {
                                return;
                            }
                            if (m29062g(c0648e)) {
                            }
                            strM29060e3 = null;
                        } else {
                            strM29060e3 = m29060e(c0648e);
                            if (!m29062g(c0648e)) {
                                iM28743L2 = Util.m28743L(c0648e, (byte) 61);
                                if (iM28743L2 != 0) {
                                    break;
                                }
                                if (iM28743L2 <= 1 || m29062g(c0648e)) {
                                    return;
                                }
                                if (m29063h(c0648e, (byte) 34)) {
                                    strM29060e = m29059d(c0648e);
                                } else {
                                    strM29060e = m29060e(c0648e);
                                }
                                if (strM29060e != null || ((String) linkedHashMap.put(strM29060e3, strM29060e)) != null) {
                                    return;
                                }
                                if (m29062g(c0648e) && !c0648e.mo3009E()) {
                                    return;
                                } else {
                                    strM29060e3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new Challenge(strM29060e2, linkedHashMap));
                    strM29060e2 = strM29060e3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, strM29060e3 + AbstractC6406h.m27547A("=", iM28743L));
                    AbstractC6118n.m27186d(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new Challenge(strM29060e2, mapSingletonMap));
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private static final String m29059d(C0648e c0648e) throws EOFException {
        if (c0648e.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0648e c0648e2 = new C0648e();
        while (true) {
            long jM3023R0 = c0648e.m3023R0(f25724a);
            if (jM3023R0 == -1) {
                return null;
            }
            if (c0648e.m3060p0(jM3023R0) == 34) {
                c0648e2.mo3003I(c0648e, jM3023R0);
                c0648e.readByte();
                return c0648e2.m3042e1();
            }
            if (c0648e.m3046h1() == jM3023R0 + 1) {
                return null;
            }
            c0648e2.mo3003I(c0648e, jM3023R0);
            c0648e.readByte();
            c0648e2.mo3003I(c0648e, 1L);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final String m29060e(C0648e c0648e) {
        long jM3023R0 = c0648e.m3023R0(f25725b);
        if (jM3023R0 == -1) {
            jM3023R0 = c0648e.m3046h1();
        }
        if (jM3023R0 != 0) {
            return c0648e.m3044f1(jM3023R0);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final void m29061f(CookieJar cookieJar, HttpUrl url, Headers headers) {
        AbstractC6118n.m27187e(cookieJar, "<this>");
        AbstractC6118n.m27187e(url, "url");
        AbstractC6118n.m27187e(headers, "headers");
        if (cookieJar == CookieJar.f25245b) {
            return;
        }
        List listM28421e = Cookie.f25228j.m28421e(url, headers);
        if (listM28421e.isEmpty()) {
            return;
        }
        cookieJar.mo28422a(url, listM28421e);
    }

    /* JADX INFO: renamed from: g */
    private static final boolean m29062g(C0648e c0648e) throws EOFException {
        boolean z7 = false;
        while (!c0648e.mo3009E()) {
            byte bM3060p0 = c0648e.m3060p0(0L);
            if (bM3060p0 == 44) {
                c0648e.readByte();
                z7 = true;
            } else {
                if (bM3060p0 != 32 && bM3060p0 != 9) {
                    break;
                }
                c0648e.readByte();
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: h */
    private static final boolean m29063h(C0648e c0648e, byte b7) {
        return !c0648e.mo3009E() && c0648e.m3060p0(0L) == b7;
    }
}

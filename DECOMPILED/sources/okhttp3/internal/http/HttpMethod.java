package okhttp3.internal.http;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class HttpMethod {

    /* JADX INFO: renamed from: a */
    public static final HttpMethod f25726a = new HttpMethod();

    private HttpMethod() {
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m29064b(String method) {
        AbstractC6118n.m27187e(method, "method");
        return (AbstractC6118n.m27183a(method, "GET") || AbstractC6118n.m27183a(method, "HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m29065e(String method) {
        AbstractC6118n.m27187e(method, "method");
        return AbstractC6118n.m27183a(method, "POST") || AbstractC6118n.m27183a(method, "PUT") || AbstractC6118n.m27183a(method, "PATCH") || AbstractC6118n.m27183a(method, "PROPPATCH") || AbstractC6118n.m27183a(method, "REPORT");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29066a(String method) {
        AbstractC6118n.m27187e(method, "method");
        return AbstractC6118n.m27183a(method, "POST") || AbstractC6118n.m27183a(method, "PATCH") || AbstractC6118n.m27183a(method, "PUT") || AbstractC6118n.m27183a(method, "DELETE") || AbstractC6118n.m27183a(method, "MOVE");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m29067c(String method) {
        AbstractC6118n.m27187e(method, "method");
        return !AbstractC6118n.m27183a(method, "PROPFIND");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m29068d(String method) {
        AbstractC6118n.m27187e(method, "method");
        return AbstractC6118n.m27183a(method, "PROPFIND");
    }
}

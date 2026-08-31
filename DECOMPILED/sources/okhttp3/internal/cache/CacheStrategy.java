package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class CacheStrategy {

    /* JADX INFO: renamed from: c */
    public static final Companion f25494c = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final Request f25495a;

    /* JADX INFO: renamed from: b */
    private final Response f25496b;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        /* JADX INFO: renamed from: a */
        public final boolean m28797a(Response response, Request request) {
            AbstractC6118n.m27187e(response, "response");
            AbstractC6118n.m27187e(request, "request");
            int iM28672J = response.m28672J();
            if (iM28672J != 200 && iM28672J != 410 && iM28672J != 414 && iM28672J != 501 && iM28672J != 203 && iM28672J != 204) {
                if (iM28672J == 307) {
                    if (Response.m28671l0(response, "Expires", null, 2, null) == null && response.m28684m().m28349c() == -1 && !response.m28684m().m28348b() && !response.m28684m().m28347a()) {
                        return false;
                    }
                } else if (iM28672J != 308 && iM28672J != 404 && iM28672J != 405) {
                    switch (iM28672J) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (Response.m28671l0(response, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.m28684m().m28354h() || request.m28648b().m28354h()) ? false : true;
        }

        private Companion() {
        }
    }

    public static final class Factory {

        /* JADX INFO: renamed from: a */
        private final long f25497a;

        /* JADX INFO: renamed from: b */
        private final Request f25498b;

        /* JADX INFO: renamed from: c */
        private final Response f25499c;

        /* JADX INFO: renamed from: d */
        private Date f25500d;

        /* JADX INFO: renamed from: e */
        private String f25501e;

        /* JADX INFO: renamed from: f */
        private Date f25502f;

        /* JADX INFO: renamed from: g */
        private String f25503g;

        /* JADX INFO: renamed from: h */
        private Date f25504h;

        /* JADX INFO: renamed from: i */
        private long f25505i;

        /* JADX INFO: renamed from: j */
        private long f25506j;

        /* JADX INFO: renamed from: k */
        private String f25507k;

        /* JADX INFO: renamed from: l */
        private int f25508l;

        public Factory(long j7, Request request, Response response) {
            AbstractC6118n.m27187e(request, "request");
            this.f25497a = j7;
            this.f25498b = request;
            this.f25499c = response;
            this.f25508l = -1;
            if (response != null) {
                this.f25505i = response.m28680V0();
                this.f25506j = response.m28678T0();
                Headers headersM28686o0 = response.m28686o0();
                int size = headersM28686o0.size();
                for (int i7 = 0; i7 < size; i7++) {
                    String strM28478b = headersM28686o0.m28478b(i7);
                    String strM28480g = headersM28686o0.m28480g(i7);
                    if (AbstractC6406h.m27564w(strM28478b, "Date", true)) {
                        this.f25500d = DatesKt.m29045a(strM28480g);
                        this.f25501e = strM28480g;
                    } else if (AbstractC6406h.m27564w(strM28478b, "Expires", true)) {
                        this.f25504h = DatesKt.m29045a(strM28480g);
                    } else if (AbstractC6406h.m27564w(strM28478b, "Last-Modified", true)) {
                        this.f25502f = DatesKt.m29045a(strM28480g);
                        this.f25503g = strM28480g;
                    } else if (AbstractC6406h.m27564w(strM28478b, "ETag", true)) {
                        this.f25507k = strM28480g;
                    } else if (AbstractC6406h.m27564w(strM28478b, "Age", true)) {
                        this.f25508l = Util.m28756Y(strM28480g, -1);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private final long m28798a() {
            Date date = this.f25500d;
            long jMax = date != null ? Math.max(0L, this.f25506j - date.getTime()) : 0L;
            int i7 = this.f25508l;
            if (i7 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i7));
            }
            long j7 = this.f25506j;
            return jMax + (j7 - this.f25505i) + (this.f25497a - j7);
        }

        /* JADX INFO: renamed from: c */
        private final CacheStrategy m28799c() {
            String str;
            if (this.f25499c == null) {
                return new CacheStrategy(this.f25498b, null);
            }
            if ((!this.f25498b.m28653g() || this.f25499c.m28682d0() != null) && CacheStrategy.f25494c.m28797a(this.f25499c, this.f25498b)) {
                CacheControl cacheControlM28648b = this.f25498b.m28648b();
                if (cacheControlM28648b.m28353g() || m28801e(this.f25498b)) {
                    return new CacheStrategy(this.f25498b, null);
                }
                CacheControl cacheControlM28684m = this.f25499c.m28684m();
                long jM28798a = m28798a();
                long jM28800d = m28800d();
                if (cacheControlM28648b.m28349c() != -1) {
                    jM28800d = Math.min(jM28800d, TimeUnit.SECONDS.toMillis(cacheControlM28648b.m28349c()));
                }
                long millis = 0;
                long millis2 = cacheControlM28648b.m28351e() != -1 ? TimeUnit.SECONDS.toMillis(cacheControlM28648b.m28351e()) : 0L;
                if (!cacheControlM28684m.m28352f() && cacheControlM28648b.m28350d() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(cacheControlM28648b.m28350d());
                }
                if (!cacheControlM28684m.m28353g()) {
                    long j7 = millis2 + jM28798a;
                    if (j7 < millis + jM28800d) {
                        Response.Builder builderM28675Q0 = this.f25499c.m28675Q0();
                        if (j7 >= jM28800d) {
                            builderM28675Q0.m28692a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jM28798a > 86400000 && m28802f()) {
                            builderM28675Q0.m28692a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new CacheStrategy(null, builderM28675Q0.m28694c());
                    }
                }
                String str2 = this.f25507k;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f25502f != null) {
                        str2 = this.f25503g;
                    } else {
                        if (this.f25500d == null) {
                            return new CacheStrategy(this.f25498b, null);
                        }
                        str2 = this.f25501e;
                    }
                    str = "If-Modified-Since";
                }
                Headers.Builder builderM28479e = this.f25498b.m28652f().m28479e();
                AbstractC6118n.m27184b(str2);
                builderM28479e.m28484c(str, str2);
                return new CacheStrategy(this.f25498b.m28655i().m28660d(builderM28479e.m28485d()).m28658b(), this.f25499c);
            }
            return new CacheStrategy(this.f25498b, null);
        }

        /* JADX INFO: renamed from: d */
        private final long m28800d() {
            Response response = this.f25499c;
            AbstractC6118n.m27184b(response);
            CacheControl cacheControlM28684m = response.m28684m();
            if (cacheControlM28684m.m28349c() != -1) {
                return TimeUnit.SECONDS.toMillis(cacheControlM28684m.m28349c());
            }
            Date date = this.f25504h;
            if (date != null) {
                Date date2 = this.f25500d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f25506j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f25502f != null && this.f25499c.m28679U0().m28656j().m28509m() == null) {
                Date date3 = this.f25500d;
                long time2 = date3 != null ? date3.getTime() : this.f25505i;
                Date date4 = this.f25502f;
                AbstractC6118n.m27184b(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        /* JADX INFO: renamed from: e */
        private final boolean m28801e(Request request) {
            return (request.m28650d("If-Modified-Since") == null && request.m28650d("If-None-Match") == null) ? false : true;
        }

        /* JADX INFO: renamed from: f */
        private final boolean m28802f() {
            Response response = this.f25499c;
            AbstractC6118n.m27184b(response);
            return response.m28684m().m28349c() == -1 && this.f25504h == null;
        }

        /* JADX INFO: renamed from: b */
        public final CacheStrategy m28803b() {
            CacheStrategy cacheStrategyM28799c = m28799c();
            return (cacheStrategyM28799c.m28796b() == null || !this.f25498b.m28648b().m28355i()) ? cacheStrategyM28799c : new CacheStrategy(null, null);
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.f25495a = request;
        this.f25496b = response;
    }

    /* JADX INFO: renamed from: a */
    public final Response m28795a() {
        return this.f25496b;
    }

    /* JADX INFO: renamed from: b */
    public final Request m28796b() {
        return this.f25495a;
    }
}

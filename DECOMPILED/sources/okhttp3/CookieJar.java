package okhttp3;

import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;

/* JADX INFO: loaded from: classes.dex */
public interface CookieJar {

    /* JADX INFO: renamed from: a */
    public static final Companion f25244a = Companion.f25246a;

    /* JADX INFO: renamed from: b */
    public static final CookieJar f25245b = new Companion.NoCookies();

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f25246a = new Companion();

        private static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            /* JADX INFO: renamed from: a */
            public void mo28422a(HttpUrl url, List cookies) {
                AbstractC6118n.m27187e(url, "url");
                AbstractC6118n.m27187e(cookies, "cookies");
            }

            @Override // okhttp3.CookieJar
            /* JADX INFO: renamed from: b */
            public List mo28423b(HttpUrl url) {
                AbstractC6118n.m27187e(url, "url");
                return AbstractC1638q.m6765j();
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    void mo28422a(HttpUrl httpUrl, List list);

    /* JADX INFO: renamed from: b */
    List mo28423b(HttpUrl httpUrl);
}

package okhttp3.internal.tls;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class CertificateChainCleaner {

    /* JADX INFO: renamed from: a */
    public static final Companion f26050a = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final CertificateChainCleaner m29438a(X509TrustManager trustManager) {
            AbstractC6118n.m27187e(trustManager, "trustManager");
            return Platform.f26006a.m29391g().mo29344c(trustManager);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract List mo29400a(List list, String str);
}

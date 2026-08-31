package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import p152T5.AbstractC1638q;

/* JADX INFO: loaded from: classes.dex */
public final class Android10Platform extends Platform {

    /* JADX INFO: renamed from: e */
    public static final Companion f25976e = new Companion(null);

    /* JADX INFO: renamed from: f */
    private static final boolean f25977f;

    /* JADX INFO: renamed from: d */
    private final List f25978d;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Platform m29348a() {
            if (m29349b()) {
                return new Android10Platform();
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m29349b() {
            return Android10Platform.f25977f;
        }

        private Companion() {
        }
    }

    static {
        f25977f = Platform.f26006a.m29392h() && Build.VERSION.SDK_INT >= 29;
    }

    public Android10Platform() {
        List listM = AbstractC1638q.m6768m(Android10SocketAdapter.f26009a.m29398a(), new DeferredSocketAdapter(AndroidSocketAdapter.f26017f.m29412d()), new DeferredSocketAdapter(ConscryptSocketAdapter.f26031a.m29421a()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.f26025a.m29416a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (((SocketAdapter) obj).mo29394a()) {
                arrayList.add(obj);
            }
        }
        this.f25978d = arrayList;
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: c */
    public CertificateChainCleaner mo29344c(X509TrustManager trustManager) {
        AbstractC6118n.m27187e(trustManager, "trustManager");
        AndroidCertificateChainCleaner androidCertificateChainCleanerM29401a = AndroidCertificateChainCleaner.f26010d.m29401a(trustManager);
        return androidCertificateChainCleanerM29401a != null ? androidCertificateChainCleanerM29401a : super.mo29344c(trustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: e */
    public void mo29345e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        AbstractC6118n.m27187e(protocols, "protocols");
        Iterator it = this.f25978d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).mo29395b(sslSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            socketAdapter.mo29397d(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: h */
    public String mo29346h(SSLSocket sslSocket) {
        Object next;
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        Iterator it = this.f25978d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((SocketAdapter) next).mo29395b(sslSocket));
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter != null) {
            return socketAdapter.mo29396c(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: j */
    public boolean mo29347j(String hostname) {
        AbstractC6118n.m27187e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}

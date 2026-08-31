package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.Platform;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class BouncyCastleSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a */
    public static final Companion f26025a = new Companion(null);

    /* JADX INFO: renamed from: b */
    private static final DeferredSocketAdapter.Factory f26026b = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1
        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        /* JADX INFO: renamed from: b */
        public boolean mo29413b(SSLSocket sslSocket) {
            AbstractC6118n.m27187e(sslSocket, "sslSocket");
            BouncyCastlePlatform.f25985e.m29362b();
            return false;
        }

        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        /* JADX INFO: renamed from: c */
        public SocketAdapter mo29414c(SSLSocket sslSocket) {
            AbstractC6118n.m27187e(sslSocket, "sslSocket");
            return new BouncyCastleSocketAdapter();
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final DeferredSocketAdapter.Factory m29416a() {
            return BouncyCastleSocketAdapter.f26026b;
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: a */
    public boolean mo29394a() {
        return BouncyCastlePlatform.f25985e.m29362b();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: b */
    public boolean mo29395b(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        return false;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: c */
    public String mo29396c(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC6118n.m27183a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: d */
    public void mo29397d(SSLSocket sslSocket, String str, List protocols) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        AbstractC6118n.m27187e(protocols, "protocols");
        if (mo29395b(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) Platform.f26006a.m29389b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}

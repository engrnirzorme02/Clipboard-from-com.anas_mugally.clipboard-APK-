package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class ConscryptSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a */
    public static final Companion f26031a = new Companion(null);

    /* JADX INFO: renamed from: b */
    private static final DeferredSocketAdapter.Factory f26032b = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1
        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        /* JADX INFO: renamed from: b */
        public boolean mo29413b(SSLSocket sslSocket) {
            AbstractC6118n.m27187e(sslSocket, "sslSocket");
            return ConscryptPlatform.f25988e.m29367c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        /* JADX INFO: renamed from: c */
        public SocketAdapter mo29414c(SSLSocket sslSocket) {
            AbstractC6118n.m27187e(sslSocket, "sslSocket");
            return new ConscryptSocketAdapter();
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final DeferredSocketAdapter.Factory m29421a() {
            return ConscryptSocketAdapter.f26032b;
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: a */
    public boolean mo29394a() {
        return ConscryptPlatform.f25988e.m29367c();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: b */
    public boolean mo29395b(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: c */
    public String mo29396c(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        if (mo29395b(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: d */
    public void mo29397d(SSLSocket sslSocket, String str, List protocols) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        AbstractC6118n.m27187e(protocols, "protocols");
        if (mo29395b(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) Platform.f26006a.m29389b(protocols).toArray(new String[0]));
        }
    }
}

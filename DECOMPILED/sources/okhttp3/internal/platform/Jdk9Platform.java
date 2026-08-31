package okhttp3.internal.platform;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public class Jdk9Platform extends Platform {

    /* JADX INFO: renamed from: d */
    public static final Companion f26001d = new Companion(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: e */
    private static final boolean f26002e;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Jdk9Platform m29373a() {
            if (m29374b()) {
                return new Jdk9Platform();
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m29374b() {
            return Jdk9Platform.f26002e;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property = System.getProperty("java.specification.version");
        Integer numM = property != null ? AbstractC6406h.m27543m(property) : null;
        boolean z7 = true;
        if (numM == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
                z7 = false;
            }
        } else if (numM.intValue() < 9) {
            z7 = false;
        }
        f26002e = z7;
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: e */
    public void mo29345e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        AbstractC6118n.m27187e(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) Platform.f26006a.m29389b(protocols).toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: h */
    public String mo29346h(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : AbstractC6118n.m27183a(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}

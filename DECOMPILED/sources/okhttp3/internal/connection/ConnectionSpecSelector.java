package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.ConnectionSpec;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionSpecSelector {

    /* JADX INFO: renamed from: a */
    private final List f25618a;

    /* JADX INFO: renamed from: b */
    private int f25619b;

    /* JADX INFO: renamed from: c */
    private boolean f25620c;

    /* JADX INFO: renamed from: d */
    private boolean f25621d;

    public ConnectionSpecSelector(List connectionSpecs) {
        AbstractC6118n.m27187e(connectionSpecs, "connectionSpecs");
        this.f25618a = connectionSpecs;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m28921c(SSLSocket sSLSocket) {
        int size = this.f25618a.size();
        for (int i7 = this.f25619b; i7 < size; i7++) {
            if (((ConnectionSpec) this.f25618a.get(i7)).m28397e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final ConnectionSpec m28922a(SSLSocket sslSocket) throws UnknownServiceException {
        ConnectionSpec connectionSpec;
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        int i7 = this.f25619b;
        int size = this.f25618a.size();
        while (true) {
            if (i7 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = (ConnectionSpec) this.f25618a.get(i7);
            if (connectionSpec.m28397e(sslSocket)) {
                this.f25619b = i7 + 1;
                break;
            }
            i7++;
        }
        if (connectionSpec != null) {
            this.f25620c = m28921c(sslSocket);
            connectionSpec.m28395c(sslSocket, this.f25621d);
            return connectionSpec;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f25621d);
        sb.append(", modes=");
        sb.append(this.f25618a);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        AbstractC6118n.m27184b(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        AbstractC6118n.m27186d(string, "toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m28923b(IOException e7) {
        AbstractC6118n.m27187e(e7, "e");
        this.f25621d = true;
        if (!this.f25620c || (e7 instanceof ProtocolException) || (e7 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e7 instanceof SSLHandshakeException) && (e7.getCause() instanceof CertificateException)) || (e7 instanceof SSLPeerUnverifiedException) || !(e7 instanceof SSLException)) ? false : true;
    }
}

package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class DeferredSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a */
    private final Factory f26033a;

    /* JADX INFO: renamed from: b */
    private SocketAdapter f26034b;

    public interface Factory {
        /* JADX INFO: renamed from: b */
        boolean mo29413b(SSLSocket sSLSocket);

        /* JADX INFO: renamed from: c */
        SocketAdapter mo29414c(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory socketAdapterFactory) {
        AbstractC6118n.m27187e(socketAdapterFactory, "socketAdapterFactory");
        this.f26033a = socketAdapterFactory;
    }

    /* JADX INFO: renamed from: e */
    private final synchronized SocketAdapter m29422e(SSLSocket sSLSocket) {
        try {
            if (this.f26034b == null && this.f26033a.mo29413b(sSLSocket)) {
                this.f26034b = this.f26033a.mo29414c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f26034b;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: a */
    public boolean mo29394a() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: b */
    public boolean mo29395b(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        return this.f26033a.mo29413b(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: c */
    public String mo29396c(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        SocketAdapter socketAdapterM29422e = m29422e(sslSocket);
        if (socketAdapterM29422e != null) {
            return socketAdapterM29422e.mo29396c(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: d */
    public void mo29397d(SSLSocket sslSocket, String str, List protocols) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        AbstractC6118n.m27187e(protocols, "protocols");
        SocketAdapter socketAdapterM29422e = m29422e(sslSocket);
        if (socketAdapterM29422e != null) {
            socketAdapterM29422e.mo29397d(sslSocket, str, protocols);
        }
    }
}

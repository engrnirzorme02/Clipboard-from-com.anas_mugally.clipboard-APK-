package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import p152T5.AbstractC1638q;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPlatform extends Platform {

    /* JADX INFO: renamed from: f */
    public static final Companion f25979f = new Companion(null);

    /* JADX INFO: renamed from: g */
    private static final boolean f25980g;

    /* JADX INFO: renamed from: d */
    private final List f25981d;

    /* JADX INFO: renamed from: e */
    private final CloseGuard f25982e;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Platform m29355a() {
            if (m29356b()) {
                return new AndroidPlatform();
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m29356b() {
            return AndroidPlatform.f25980g;
        }

        private Companion() {
        }
    }

    public static final class CustomTrustRootIndex implements TrustRootIndex {

        /* JADX INFO: renamed from: a */
        private final X509TrustManager f25983a;

        /* JADX INFO: renamed from: b */
        private final Method f25984b;

        public CustomTrustRootIndex(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            AbstractC6118n.m27187e(trustManager, "trustManager");
            AbstractC6118n.m27187e(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f25983a = trustManager;
            this.f25984b = findByIssuerAndSignatureMethod;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        /* JADX INFO: renamed from: a */
        public X509Certificate mo29357a(X509Certificate cert) {
            AbstractC6118n.m27187e(cert, "cert");
            try {
                Object objInvoke = this.f25984b.invoke(this.f25983a, cert);
                AbstractC6118n.m27185c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e7) {
                throw new AssertionError("unable to get issues and signature", e7);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return AbstractC6118n.m27183a(this.f25983a, customTrustRootIndex.f25983a) && AbstractC6118n.m27183a(this.f25984b, customTrustRootIndex.f25984b);
        }

        public int hashCode() {
            return (this.f25983a.hashCode() * 31) + this.f25984b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f25983a + ", findByIssuerAndSignatureMethod=" + this.f25984b + ')';
        }
    }

    static {
        boolean z7 = false;
        if (Platform.f26006a.m29392h() && Build.VERSION.SDK_INT < 30) {
            z7 = true;
        }
        f25980g = z7;
    }

    public AndroidPlatform() {
        List listM = AbstractC1638q.m6768m(StandardAndroidSocketAdapter.Companion.m29423b(StandardAndroidSocketAdapter.f26035j, null, 1, null), new DeferredSocketAdapter(AndroidSocketAdapter.f26017f.m29412d()), new DeferredSocketAdapter(ConscryptSocketAdapter.f26031a.m29421a()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.f26025a.m29416a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (((SocketAdapter) obj).mo29394a()) {
                arrayList.add(obj);
            }
        }
        this.f25981d = arrayList;
        this.f25982e = CloseGuard.f26027d.m29419a();
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: c */
    public CertificateChainCleaner mo29344c(X509TrustManager trustManager) {
        AbstractC6118n.m27187e(trustManager, "trustManager");
        AndroidCertificateChainCleaner androidCertificateChainCleanerM29401a = AndroidCertificateChainCleaner.f26010d.m29401a(trustManager);
        return androidCertificateChainCleanerM29401a != null ? androidCertificateChainCleanerM29401a : super.mo29344c(trustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: d */
    public TrustRootIndex mo29351d(X509TrustManager trustManager) {
        AbstractC6118n.m27187e(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            AbstractC6118n.m27186d(method, "method");
            return new CustomTrustRootIndex(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.mo29351d(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: e */
    public void mo29345e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        AbstractC6118n.m27187e(protocols, "protocols");
        Iterator it = this.f25981d.iterator();
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
    /* JADX INFO: renamed from: f */
    public void mo29352f(Socket socket, InetSocketAddress address, int i7) throws IOException {
        AbstractC6118n.m27187e(socket, "socket");
        AbstractC6118n.m27187e(address, "address");
        try {
            socket.connect(address, i7);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e7;
            }
            throw new IOException("Exception in connect", e7);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: h */
    public String mo29346h(SSLSocket sslSocket) {
        Object next;
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        Iterator it = this.f25981d.iterator();
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
    /* JADX INFO: renamed from: i */
    public Object mo29353i(String closer) {
        AbstractC6118n.m27187e(closer, "closer");
        return this.f25982e.m29417a(closer);
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: j */
    public boolean mo29347j(String hostname) {
        AbstractC6118n.m27187e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: m */
    public void mo29354m(String message, Object obj) {
        AbstractC6118n.m27187e(message, "message");
        if (this.f25982e.m29418b(obj)) {
            return;
        }
        Platform.m29379l(this, message, 5, null, 4, null);
    }
}

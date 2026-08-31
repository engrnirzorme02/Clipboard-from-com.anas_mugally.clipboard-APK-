package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import p302m6.AbstractC6406h;
import p302m6.C6402d;

/* JADX INFO: loaded from: classes.dex */
public class AndroidSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: f */
    public static final Companion f26017f;

    /* JADX INFO: renamed from: g */
    private static final DeferredSocketAdapter.Factory f26018g;

    /* JADX INFO: renamed from: a */
    private final Class f26019a;

    /* JADX INFO: renamed from: b */
    private final Method f26020b;

    /* JADX INFO: renamed from: c */
    private final Method f26021c;

    /* JADX INFO: renamed from: d */
    private final Method f26022d;

    /* JADX INFO: renamed from: e */
    private final Method f26023e;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final AndroidSocketAdapter m29410b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !AbstractC6118n.m27183a(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            AbstractC6118n.m27184b(superclass);
            return new AndroidSocketAdapter(superclass);
        }

        /* JADX INFO: renamed from: c */
        public final DeferredSocketAdapter.Factory m29411c(final String packageName) {
            AbstractC6118n.m27187e(packageName, "packageName");
            return new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                /* JADX INFO: renamed from: b */
                public boolean mo29413b(SSLSocket sslSocket) {
                    AbstractC6118n.m27187e(sslSocket, "sslSocket");
                    String name = sslSocket.getClass().getName();
                    AbstractC6118n.m27186d(name, "sslSocket.javaClass.name");
                    return AbstractC6406h.m27557K(name, packageName + '.', false, 2, null);
                }

                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                /* JADX INFO: renamed from: c */
                public SocketAdapter mo29414c(SSLSocket sslSocket) {
                    AbstractC6118n.m27187e(sslSocket, "sslSocket");
                    return AndroidSocketAdapter.f26017f.m29410b(sslSocket.getClass());
                }
            };
        }

        /* JADX INFO: renamed from: d */
        public final DeferredSocketAdapter.Factory m29412d() {
            return AndroidSocketAdapter.f26018g;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        f26017f = companion;
        f26018g = companion.m29411c("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(Class sslSocketClass) throws NoSuchMethodException {
        AbstractC6118n.m27187e(sslSocketClass, "sslSocketClass");
        this.f26019a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC6118n.m27186d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f26020b = declaredMethod;
        this.f26021c = sslSocketClass.getMethod("setHostname", String.class);
        this.f26022d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f26023e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: a */
    public boolean mo29394a() {
        return AndroidPlatform.f25979f.m29356b();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: b */
    public boolean mo29395b(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        return this.f26019a.isInstance(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: c */
    public String mo29396c(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        if (!mo29395b(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f26022d.invoke(sslSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, C6402d.f24428b);
            }
            return null;
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if ((cause instanceof NullPointerException) && AbstractC6118n.m27183a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e8);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    /* JADX INFO: renamed from: d */
    public void mo29397d(SSLSocket sslSocket, String str, List protocols) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        AbstractC6118n.m27187e(protocols, "protocols");
        if (mo29395b(sslSocket)) {
            try {
                this.f26020b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f26021c.invoke(sslSocket, str);
                }
                this.f26023e.invoke(sslSocket, Platform.f26006a.m29390c(protocols));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                throw new AssertionError(e8);
            }
        }
    }
}

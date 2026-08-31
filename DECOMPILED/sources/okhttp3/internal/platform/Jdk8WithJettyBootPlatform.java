package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {

    /* JADX INFO: renamed from: i */
    public static final Companion f25992i = new Companion(null);

    /* JADX INFO: renamed from: d */
    private final Method f25993d;

    /* JADX INFO: renamed from: e */
    private final Method f25994e;

    /* JADX INFO: renamed from: f */
    private final Method f25995f;

    /* JADX INFO: renamed from: g */
    private final Class f25996g;

    /* JADX INFO: renamed from: h */
    private final Class f25997h;

    private static final class AlpnProvider implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        private final List f25998a;

        /* JADX INFO: renamed from: b */
        private boolean f25999b;

        /* JADX INFO: renamed from: c */
        private String f26000c;

        public AlpnProvider(List protocols) {
            AbstractC6118n.m27187e(protocols, "protocols");
            this.f25998a = protocols;
        }

        /* JADX INFO: renamed from: a */
        public final String m29369a() {
            return this.f26000c;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m29370b() {
            return this.f25999b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            AbstractC6118n.m27187e(proxy, "proxy");
            AbstractC6118n.m27187e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (AbstractC6118n.m27183a(name, "supports") && AbstractC6118n.m27183a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (AbstractC6118n.m27183a(name, "unsupported") && AbstractC6118n.m27183a(Void.TYPE, returnType)) {
                this.f25999b = true;
                return null;
            }
            if (AbstractC6118n.m27183a(name, "protocols") && objArr.length == 0) {
                return this.f25998a;
            }
            if ((AbstractC6118n.m27183a(name, "selectProtocol") || AbstractC6118n.m27183a(name, "select")) && AbstractC6118n.m27183a(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i7 = 0;
                        while (true) {
                            Object obj2 = list.get(i7);
                            AbstractC6118n.m27185c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (this.f25998a.contains(str)) {
                                this.f26000c = str;
                                return str;
                            }
                            if (i7 != size) {
                                i7++;
                            }
                        }
                    }
                    String str2 = (String) this.f25998a.get(0);
                    this.f26000c = str2;
                    return str2;
                }
            }
            if ((!AbstractC6118n.m27183a(name, "protocolSelected") && !AbstractC6118n.m27183a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            AbstractC6118n.m27185c(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f26000c = (String) obj3;
            return null;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Platform m29371a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                AbstractC6118n.m27186d(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                AbstractC6118n.m27186d(putMethod, "putMethod");
                AbstractC6118n.m27186d(getMethod, "getMethod");
                AbstractC6118n.m27186d(removeMethod, "removeMethod");
                AbstractC6118n.m27186d(clientProviderClass, "clientProviderClass");
                AbstractC6118n.m27186d(serverProviderClass, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public Jdk8WithJettyBootPlatform(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        AbstractC6118n.m27187e(putMethod, "putMethod");
        AbstractC6118n.m27187e(getMethod, "getMethod");
        AbstractC6118n.m27187e(removeMethod, "removeMethod");
        AbstractC6118n.m27187e(clientProviderClass, "clientProviderClass");
        AbstractC6118n.m27187e(serverProviderClass, "serverProviderClass");
        this.f25993d = putMethod;
        this.f25994e = getMethod;
        this.f25995f = removeMethod;
        this.f25996g = clientProviderClass;
        this.f25997h = serverProviderClass;
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: b */
    public void mo29368b(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        try {
            this.f25995f.invoke(null, sslSocket);
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: e */
    public void mo29345e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        AbstractC6118n.m27187e(protocols, "protocols");
        try {
            this.f25993d.invoke(null, sslSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f25996g, this.f25997h}, new AlpnProvider(Platform.f26006a.m29389b(protocols))));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    /* JADX INFO: renamed from: h */
    public String mo29346h(SSLSocket sslSocket) {
        AbstractC6118n.m27187e(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f25994e.invoke(null, sslSocket));
            AbstractC6118n.m27185c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            if (!alpnProvider.m29370b() && alpnProvider.m29369a() == null) {
                Platform.m29379l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (alpnProvider.m29370b()) {
                return null;
            }
            return alpnProvider.m29369a();
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        }
    }
}

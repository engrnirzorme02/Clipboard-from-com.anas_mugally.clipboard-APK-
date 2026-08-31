package p087K5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p072I6.C0648e;

/* JADX INFO: renamed from: K5.h */
/* JADX INFO: loaded from: classes.dex */
public class C0759h {

    /* JADX INFO: renamed from: b */
    public static final Logger f3062b = Logger.getLogger(C0759h.class.getName());

    /* JADX INFO: renamed from: c */
    private static final String[] f3063c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* JADX INFO: renamed from: d */
    private static final C0759h f3064d = m3573d();

    /* JADX INFO: renamed from: a */
    private final Provider f3065a;

    /* JADX INFO: renamed from: K5.h$a */
    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* JADX INFO: renamed from: K5.h$b */
    class b implements PrivilegedExceptionAction {
        b() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    /* JADX INFO: renamed from: K5.h$c */
    class c implements PrivilegedExceptionAction {
        c() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* JADX INFO: renamed from: K5.h$d */
    private static class d extends C0759h {

        /* JADX INFO: renamed from: e */
        private final C0758g f3066e;

        /* JADX INFO: renamed from: f */
        private final C0758g f3067f;

        /* JADX INFO: renamed from: g */
        private final Method f3068g;

        /* JADX INFO: renamed from: h */
        private final Method f3069h;

        /* JADX INFO: renamed from: i */
        private final C0758g f3070i;

        /* JADX INFO: renamed from: j */
        private final C0758g f3071j;

        /* JADX INFO: renamed from: k */
        private final h f3072k;

        public d(C0758g c0758g, C0758g c0758g2, Method method, Method method2, C0758g c0758g3, C0758g c0758g4, Provider provider, h hVar) {
            super(provider);
            this.f3066e = c0758g;
            this.f3067f = c0758g2;
            this.f3068g = method;
            this.f3069h = method2;
            this.f3070i = c0758g3;
            this.f3071j = c0758g4;
            this.f3072k = hVar;
        }

        @Override // p087K5.C0759h
        /* JADX INFO: renamed from: c */
        public void mo3579c(SSLSocket sSLSocket, String str, List list) {
            if (str != null) {
                this.f3066e.m3569e(sSLSocket, Boolean.TRUE);
                this.f3067f.m3569e(sSLSocket, str);
            }
            if (this.f3071j.m3571g(sSLSocket)) {
                this.f3071j.m3570f(sSLSocket, C0759h.m3572b(list));
            }
        }

        @Override // p087K5.C0759h
        /* JADX INFO: renamed from: h */
        public String mo3581h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f3070i.m3571g(sSLSocket) && (bArr = (byte[]) this.f3070i.m3570f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, AbstractC0763l.f3104b);
            }
            return null;
        }

        @Override // p087K5.C0759h
        /* JADX INFO: renamed from: i */
        public h mo3582i() {
            return this.f3072k;
        }
    }

    /* JADX INFO: renamed from: K5.h$e */
    private static class e extends C0759h {

        /* JADX INFO: renamed from: e */
        private final Method f3073e;

        /* JADX INFO: renamed from: f */
        private final Method f3074f;

        /* synthetic */ e(Provider provider, Method method, Method method2, a aVar) {
            this(provider, method, method2);
        }

        @Override // p087K5.C0759h
        /* JADX INFO: renamed from: c */
        public void mo3579c(SSLSocket sSLSocket, String str, List list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EnumC0760i enumC0760i = (EnumC0760i) it.next();
                if (enumC0760i != EnumC0760i.HTTP_1_0) {
                    arrayList.add(enumC0760i.toString());
                }
            }
            try {
                this.f3073e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // p087K5.C0759h
        /* JADX INFO: renamed from: h */
        public String mo3581h(SSLSocket sSLSocket) {
            try {
                return (String) this.f3074f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // p087K5.C0759h
        /* JADX INFO: renamed from: i */
        public h mo3582i() {
            return h.ALPN_AND_NPN;
        }

        private e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f3073e = method;
            this.f3074f = method2;
        }
    }

    /* JADX INFO: renamed from: K5.h$f */
    private static class f extends C0759h {

        /* JADX INFO: renamed from: e */
        private final Method f3075e;

        /* JADX INFO: renamed from: f */
        private final Method f3076f;

        /* JADX INFO: renamed from: g */
        private final Method f3077g;

        /* JADX INFO: renamed from: h */
        private final Class f3078h;

        /* JADX INFO: renamed from: i */
        private final Class f3079i;

        public f(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
            super(provider);
            this.f3075e = method;
            this.f3076f = method2;
            this.f3077g = method3;
            this.f3078h = cls;
            this.f3079i = cls2;
        }

        @Override // p087K5.C0759h
        /* JADX INFO: renamed from: a */
        public void mo3578a(SSLSocket sSLSocket) {
            try {
                this.f3077g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e7) {
                C0759h.f3062b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e7);
            }
        }

        @Override // p087K5.C0759h
        /* JADX INFO: renamed from: c */
        public void mo3579c(SSLSocket sSLSocket, String str, List list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                EnumC0760i enumC0760i = (EnumC0760i) list.get(i7);
                if (enumC0760i != EnumC0760i.HTTP_1_0) {
                    arrayList.add(enumC0760i.toString());
                }
            }
            try {
                this.f3075e.invoke(null, sSLSocket, Proxy.newProxyInstance(C0759h.class.getClassLoader(), new Class[]{this.f3078h, this.f3079i}, new g(arrayList)));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // p087K5.C0759h
        /* JADX INFO: renamed from: h */
        public String mo3581h(SSLSocket sSLSocket) {
            try {
                g gVar = (g) Proxy.getInvocationHandler(this.f3076f.invoke(null, sSLSocket));
                if (!gVar.f3081b && gVar.f3082c == null) {
                    C0759h.f3062b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (gVar.f3081b) {
                    return null;
                }
                return gVar.f3082c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // p087K5.C0759h
        /* JADX INFO: renamed from: i */
        public h mo3582i() {
            return h.ALPN_AND_NPN;
        }
    }

    /* JADX INFO: renamed from: K5.h$g */
    private static class g implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        private final List f3080a;

        /* JADX INFO: renamed from: b */
        private boolean f3081b;

        /* JADX INFO: renamed from: c */
        private String f3082c;

        public g(List list) {
            this.f3080a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = AbstractC0763l.f3103a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f3081b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f3080a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (this.f3080a.contains(list.get(i7))) {
                            String str = (String) list.get(i7);
                            this.f3082c = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f3080a.get(0);
                    this.f3082c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f3082c = (String) objArr[0];
            return null;
        }
    }

    /* JADX INFO: renamed from: K5.h$h */
    public enum h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public C0759h(Provider provider) {
        this.f3065a = provider;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m3572b(List list) {
        C0648e c0648e = new C0648e();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            EnumC0760i enumC0760i = (EnumC0760i) list.get(i7);
            if (enumC0760i != EnumC0760i.HTTP_1_0) {
                c0648e.mo3010F(enumC0760i.toString().length());
                c0648e.mo3031X(enumC0760i.toString());
            }
        }
        return c0648e.m3033Z0();
    }

    /* JADX INFO: renamed from: d */
    private static C0759h m3573d() throws NoSuchMethodException {
        Method method;
        Method method2;
        h hVar;
        Provider providerM3575f = m3575f();
        a aVar = null;
        if (providerM3575f != null) {
            C0758g c0758g = new C0758g(null, "setUseSessionTickets", Boolean.TYPE);
            C0758g c0758g2 = new C0758g(null, "setHostname", String.class);
            C0758g c0758g3 = new C0758g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            C0758g c0758g4 = new C0758g(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method2 = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    method2 = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
            }
            Method method3 = method;
            if (providerM3575f.getName().equals("GmsCore_OpenSSL") || providerM3575f.getName().equals("Conscrypt") || providerM3575f.getName().equals("Ssl_Guard") || m3577k()) {
                hVar = h.ALPN_AND_NPN;
            } else {
                hVar = m3576j() ? h.NPN : h.NONE;
            }
            return new d(c0758g, c0758g2, method3, method2, c0758g3, c0758g4, providerM3575f, hVar);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new a())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                    return new e(provider, (Method) AccessController.doPrivileged(new b()), (Method) AccessController.doPrivileged(new c()), aVar);
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                return new C0759h(provider);
            }
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0759h m3574e() {
        return f3064d;
    }

    /* JADX INFO: renamed from: f */
    private static Provider m3575f() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f3063c) {
                if (str.equals(provider.getClass().getName())) {
                    f3062b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f3062b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    /* JADX INFO: renamed from: j */
    private static boolean m3576j() {
        try {
            C0759h.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e7) {
            f3062b.log(Level.FINE, "Can't find class", (Throwable) e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    private static boolean m3577k() {
        try {
            C0759h.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e7) {
            f3062b.log(Level.FINE, "Can't find class", (Throwable) e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo3578a(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: c */
    public void mo3579c(SSLSocket sSLSocket, String str, List list) {
    }

    /* JADX INFO: renamed from: g */
    public Provider m3580g() {
        return this.f3065a;
    }

    /* JADX INFO: renamed from: h */
    public String mo3581h(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public h mo3582i() {
        return h.NONE;
    }
}

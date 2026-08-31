package p079J5;

import io.grpc.internal.AbstractC5757S;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p087K5.AbstractC0763l;
import p087K5.C0758g;
import p087K5.C0759h;
import p087K5.EnumC0760i;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: J5.k */
/* JADX INFO: loaded from: classes.dex */
class C0697k {

    /* JADX INFO: renamed from: b */
    private static final Logger f2838b = Logger.getLogger(C0697k.class.getName());

    /* JADX INFO: renamed from: c */
    private static final C0759h f2839c = C0759h.m3574e();

    /* JADX INFO: renamed from: d */
    private static C0697k f2840d = m3386d(C0697k.class.getClassLoader());

    /* JADX INFO: renamed from: a */
    protected final C0759h f2841a;

    /* JADX INFO: renamed from: J5.k$a */
    static final class a extends C0697k {

        /* JADX INFO: renamed from: e */
        private static final C0758g f2842e;

        /* JADX INFO: renamed from: f */
        private static final C0758g f2843f;

        /* JADX INFO: renamed from: g */
        private static final C0758g f2844g;

        /* JADX INFO: renamed from: h */
        private static final C0758g f2845h;

        /* JADX INFO: renamed from: i */
        private static final C0758g f2846i;

        /* JADX INFO: renamed from: j */
        private static final C0758g f2847j;

        /* JADX INFO: renamed from: k */
        private static final Method f2848k;

        /* JADX INFO: renamed from: l */
        private static final Method f2849l;

        /* JADX INFO: renamed from: m */
        private static final Method f2850m;

        /* JADX INFO: renamed from: n */
        private static final Method f2851n;

        /* JADX INFO: renamed from: o */
        private static final Method f2852o;

        /* JADX INFO: renamed from: p */
        private static final Method f2853p;

        /* JADX INFO: renamed from: q */
        private static final Constructor f2854q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Class cls = Boolean.TYPE;
            Constructor<?> constructor = null;
            f2842e = new C0758g(null, "setUseSessionTickets", cls);
            f2843f = new C0758g(null, "setHostname", String.class);
            f2844g = new C0758g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f2845h = new C0758g(null, "setAlpnProtocols", byte[].class);
            f2846i = new C0758g(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f2847j = new C0758g(null, "setNpnProtocols", byte[].class);
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method3 = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                    try {
                        method2 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                        try {
                            Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                            try {
                                method5 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                            } catch (ClassNotFoundException e7) {
                                e = e7;
                                C0697k.f2838b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                method5 = null;
                            } catch (NoSuchMethodException e8) {
                                e = e8;
                                C0697k.f2838b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                method5 = null;
                            }
                        } catch (ClassNotFoundException e9) {
                            e = e9;
                            method4 = null;
                        } catch (NoSuchMethodException e10) {
                            e = e10;
                            method4 = null;
                        }
                    } catch (ClassNotFoundException e11) {
                        e = e11;
                        method2 = null;
                        method4 = null;
                    } catch (NoSuchMethodException e12) {
                        e = e12;
                        method2 = null;
                        method4 = null;
                    }
                } catch (ClassNotFoundException e13) {
                    e = e13;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    C0697k.f2838b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f2850m = method;
                    f2851n = method3;
                    f2852o = method2;
                    f2848k = method4;
                    f2849l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f2853p = method6;
                    f2854q = constructor;
                } catch (NoSuchMethodException e14) {
                    e = e14;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    C0697k.f2838b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f2850m = method;
                    f2851n = method3;
                    f2852o = method2;
                    f2848k = method4;
                    f2849l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f2853p = method6;
                    f2854q = constructor;
                }
            } catch (ClassNotFoundException e15) {
                e = e15;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e16) {
                e = e16;
                method = null;
                method2 = null;
            }
            f2850m = method;
            f2851n = method3;
            f2852o = method2;
            f2848k = method4;
            f2849l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                try {
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                } catch (ClassNotFoundException e17) {
                    e = e17;
                    C0697k.f2838b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                } catch (NoSuchMethodException e18) {
                    e = e18;
                    C0697k.f2838b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                }
            } catch (ClassNotFoundException e19) {
                e = e19;
                method6 = null;
            } catch (NoSuchMethodException e20) {
                e = e20;
                method6 = null;
            }
            f2853p = method6;
            f2854q = constructor;
        }

        a(C0759h c0759h) {
            super(c0759h);
        }

        @Override // p079J5.C0697k
        /* JADX INFO: renamed from: c */
        protected void mo3390c(SSLSocket sSLSocket, String str, List list) {
            Constructor constructor;
            boolean z7;
            Method method;
            String[] strArrM3389i = C0697k.m3389i(list);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (C0697k.m3388g(str)) {
                            Method method2 = f2848k;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                f2842e.m3569e(sSLSocket, Boolean.TRUE);
                            } else {
                                f2849l.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = f2853p;
                            if (method3 == null || (constructor = f2854q) == null) {
                                f2843f.m3569e(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        }
                    } catch (InvocationTargetException e7) {
                        throw new RuntimeException(e7);
                    }
                } catch (IllegalAccessException e8) {
                    throw new RuntimeException(e8);
                } catch (InstantiationException e9) {
                    throw new RuntimeException(e9);
                }
            }
            Method method4 = f2852o;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, new Object[0]);
                    f2850m.invoke(sSLParameters, strArrM3389i);
                    z7 = true;
                } catch (InvocationTargetException e10) {
                    if (!(e10.getTargetException() instanceof UnsupportedOperationException)) {
                        throw e10;
                    }
                    C0697k.f2838b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                    z7 = false;
                }
            } else {
                z7 = false;
            }
            sSLSocket.setSSLParameters(sSLParameters);
            if (z7 && (method = f2851n) != null && Arrays.equals(strArrM3389i, (String[]) method.invoke(sSLSocket.getSSLParameters(), new Object[0]))) {
                return;
            }
            Object[] objArr = {C0759h.m3572b(list)};
            if (this.f2841a.mo3582i() == C0759h.h.ALPN_AND_NPN) {
                f2845h.m3570f(sSLSocket, objArr);
            }
            if (this.f2841a.mo3582i() == C0759h.h.NONE) {
                throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
            }
            f2847j.m3570f(sSLSocket, objArr);
        }

        @Override // p079J5.C0697k
        /* JADX INFO: renamed from: f */
        public String mo3391f(SSLSocket sSLSocket) {
            Method method = f2852o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e8) {
                    if (!(e8.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e8);
                    }
                    C0697k.f2838b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f2841a.mo3582i() == C0759h.h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f2844g.m3570f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, AbstractC0763l.f3104b);
                    }
                } catch (Exception e9) {
                    C0697k.f2838b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e9);
                }
            }
            if (this.f2841a.mo3582i() == C0759h.h.NONE) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) f2846i.m3570f(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, AbstractC0763l.f3104b);
                }
                return null;
            } catch (Exception e10) {
                C0697k.f2838b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e10);
                return null;
            }
        }

        @Override // p079J5.C0697k
        /* JADX INFO: renamed from: h */
        public String mo3392h(SSLSocket sSLSocket, String str, List list) {
            String strMo3391f = mo3391f(sSLSocket);
            return strMo3391f == null ? super.mo3392h(sSLSocket, str, list) : strMo3391f;
        }
    }

    C0697k(C0759h c0759h) {
        this.f2841a = (C0759h) AbstractC1209m.m5303o(c0759h, "platform");
    }

    /* JADX INFO: renamed from: d */
    static C0697k m3386d(ClassLoader classLoader) {
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e7) {
            f2838b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e7);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e8) {
                f2838b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e8);
                return new C0697k(f2839c);
            }
        }
        return new a(f2839c);
    }

    /* JADX INFO: renamed from: e */
    public static C0697k m3387e() {
        return f2840d;
    }

    /* JADX INFO: renamed from: g */
    static boolean m3388g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            AbstractC5757S.m25665c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static String[] m3389i(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumC0760i) it.next()).toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: c */
    protected void mo3390c(SSLSocket sSLSocket, String str, List list) {
        this.f2841a.mo3579c(sSLSocket, str, list);
    }

    /* JADX INFO: renamed from: f */
    public String mo3391f(SSLSocket sSLSocket) {
        return this.f2841a.mo3581h(sSLSocket);
    }

    /* JADX INFO: renamed from: h */
    public String mo3392h(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            mo3390c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strMo3391f = mo3391f(sSLSocket);
            if (strMo3391f != null) {
                this.f2841a.mo3578a(sSLSocket);
                return strMo3391f;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } catch (Throwable th) {
            this.f2841a.mo3578a(sSLSocket);
            throw th;
        }
    }
}

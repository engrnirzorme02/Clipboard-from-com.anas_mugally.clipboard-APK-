package okhttp3.internal.platform.android;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes.dex */
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {

    /* JADX INFO: renamed from: j */
    public static final Companion f26035j = new Companion(null);

    /* JADX INFO: renamed from: h */
    private final Class f26036h;

    /* JADX INFO: renamed from: i */
    private final Class f26037i;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ SocketAdapter m29423b(Companion companion, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return companion.m29424a(str);
        }

        /* JADX INFO: renamed from: a */
        public final SocketAdapter m29424a(String packageName) {
            AbstractC6118n.m27187e(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                AbstractC6118n.m27185c(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                AbstractC6118n.m27185c(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                AbstractC6118n.m27186d(paramsClass, "paramsClass");
                return new StandardAndroidSocketAdapter(cls, cls2, paramsClass);
            } catch (Exception e7) {
                Platform.f26006a.m29391g().m29381k("unable to load android socket classes", 5, e7);
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        AbstractC6118n.m27187e(sslSocketClass, "sslSocketClass");
        AbstractC6118n.m27187e(sslSocketFactoryClass, "sslSocketFactoryClass");
        AbstractC6118n.m27187e(paramClass, "paramClass");
        this.f26036h = sslSocketFactoryClass;
        this.f26037i = paramClass;
    }
}

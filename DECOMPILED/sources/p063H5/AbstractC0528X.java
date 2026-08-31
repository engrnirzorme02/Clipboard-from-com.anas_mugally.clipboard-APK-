package p063H5;

/* JADX INFO: renamed from: H5.X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0528X {

    /* JADX INFO: renamed from: H5.X$a */
    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC0528X m2253d() {
        AbstractC0528X abstractC0528XM2261d = C0529Y.m2258b().m2261d();
        if (abstractC0528XM2261d != null) {
            return abstractC0528XM2261d;
        }
        throw new a("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    /* JADX INFO: renamed from: a */
    protected abstract AbstractC0527W mo2254a(String str);

    /* JADX INFO: renamed from: b */
    protected abstract boolean mo2255b();

    /* JADX INFO: renamed from: c */
    protected abstract int mo2256c();
}

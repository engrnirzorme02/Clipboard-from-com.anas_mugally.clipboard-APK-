package okhttp3.internal.connection;

import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    public static final ConnectInterceptor f25617a = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override // okhttp3.Interceptor
    /* JADX INFO: renamed from: a */
    public Response mo14834a(Interceptor.Chain chain) {
        AbstractC6118n.m27187e(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        return RealInterceptorChain.m29069d(realInterceptorChain, 0, realInterceptorChain.m29071e().m28973q(realInterceptorChain), null, 0, 0, 0, 61, null).mo28558a(realInterceptorChain.m29075i());
    }
}

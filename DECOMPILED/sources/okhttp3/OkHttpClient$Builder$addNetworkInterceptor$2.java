package okhttp3;

import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5367l;

/* JADX INFO: loaded from: classes.dex */
public final class OkHttpClient$Builder$addNetworkInterceptor$2 implements Interceptor {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC5367l f25401a;

    @Override // okhttp3.Interceptor
    /* JADX INFO: renamed from: a */
    public final Response mo14834a(Interceptor.Chain chain) {
        AbstractC6118n.m27187e(chain, "chain");
        return (Response) this.f25401a.invoke(chain);
    }
}

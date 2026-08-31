package okhttp3.internal.http;

import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* JADX INFO: renamed from: a */
    private final RealCall f25727a;

    /* JADX INFO: renamed from: b */
    private final List f25728b;

    /* JADX INFO: renamed from: c */
    private final int f25729c;

    /* JADX INFO: renamed from: d */
    private final Exchange f25730d;

    /* JADX INFO: renamed from: e */
    private final Request f25731e;

    /* JADX INFO: renamed from: f */
    private final int f25732f;

    /* JADX INFO: renamed from: g */
    private final int f25733g;

    /* JADX INFO: renamed from: h */
    private final int f25734h;

    /* JADX INFO: renamed from: i */
    private int f25735i;

    public RealInterceptorChain(RealCall call, List interceptors, int i7, Exchange exchange, Request request, int i8, int i9, int i10) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(interceptors, "interceptors");
        AbstractC6118n.m27187e(request, "request");
        this.f25727a = call;
        this.f25728b = interceptors;
        this.f25729c = i7;
        this.f25730d = exchange;
        this.f25731e = request;
        this.f25732f = i8;
        this.f25733g = i9;
        this.f25734h = i10;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ RealInterceptorChain m29069d(RealInterceptorChain realInterceptorChain, int i7, Exchange exchange, Request request, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = realInterceptorChain.f25729c;
        }
        if ((i11 & 2) != 0) {
            exchange = realInterceptorChain.f25730d;
        }
        if ((i11 & 4) != 0) {
            request = realInterceptorChain.f25731e;
        }
        if ((i11 & 8) != 0) {
            i8 = realInterceptorChain.f25732f;
        }
        if ((i11 & 16) != 0) {
            i9 = realInterceptorChain.f25733g;
        }
        if ((i11 & 32) != 0) {
            i10 = realInterceptorChain.f25734h;
        }
        int i12 = i9;
        int i13 = i10;
        return realInterceptorChain.m29070c(i7, exchange, request, i8, i12, i13);
    }

    @Override // okhttp3.Interceptor.Chain
    /* JADX INFO: renamed from: a */
    public Response mo28558a(Request request) {
        AbstractC6118n.m27187e(request, "request");
        if (this.f25729c >= this.f25728b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f25735i++;
        Exchange exchange = this.f25730d;
        if (exchange != null) {
            if (!exchange.m28934j().m28955g(request.m28656j())) {
                throw new IllegalStateException(("network interceptor " + this.f25728b.get(this.f25729c - 1) + " must retain the same host and port").toString());
            }
            if (this.f25735i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f25728b.get(this.f25729c - 1) + " must call proceed() exactly once").toString());
            }
        }
        RealInterceptorChain realInterceptorChainM29069d = m29069d(this, this.f25729c + 1, null, request, 0, 0, 0, 58, null);
        Interceptor interceptor = (Interceptor) this.f25728b.get(this.f25729c);
        Response responseMo14834a = interceptor.mo14834a(realInterceptorChainM29069d);
        if (responseMo14834a == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.f25730d != null && this.f25729c + 1 < this.f25728b.size() && realInterceptorChainM29069d.f25735i != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (responseMo14834a.m28681d() != null) {
            return responseMo14834a;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    /* JADX INFO: renamed from: b */
    public Request mo28559b() {
        return this.f25731e;
    }

    /* JADX INFO: renamed from: c */
    public final RealInterceptorChain m29070c(int i7, Exchange exchange, Request request, int i8, int i9, int i10) {
        AbstractC6118n.m27187e(request, "request");
        return new RealInterceptorChain(this.f25727a, this.f25728b, i7, exchange, request, i8, i9, i10);
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.f25727a;
    }

    /* JADX INFO: renamed from: e */
    public final RealCall m29071e() {
        return this.f25727a;
    }

    /* JADX INFO: renamed from: f */
    public final int m29072f() {
        return this.f25732f;
    }

    /* JADX INFO: renamed from: g */
    public final Exchange m29073g() {
        return this.f25730d;
    }

    /* JADX INFO: renamed from: h */
    public final int m29074h() {
        return this.f25733g;
    }

    /* JADX INFO: renamed from: i */
    public final Request m29075i() {
        return this.f25731e;
    }

    /* JADX INFO: renamed from: j */
    public final int m29076j() {
        return this.f25734h;
    }

    /* JADX INFO: renamed from: k */
    public int m29077k() {
        return this.f25733g;
    }
}

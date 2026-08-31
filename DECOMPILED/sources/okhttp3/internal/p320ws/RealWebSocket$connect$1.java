package okhttp3.internal.p320ws;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;

/* JADX INFO: loaded from: classes.dex */
public final class RealWebSocket$connect$1 implements Callback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RealWebSocket f26096a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Request f26097b;

    @Override // okhttp3.Callback
    /* JADX INFO: renamed from: a */
    public void mo28364a(Call call, Response response) throws Throwable {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(response, "response");
        Exchange exchangeM28674Q = response.m28674Q();
        try {
            this.f26096a.m29463k(response, exchangeM28674Q);
            AbstractC6118n.m27184b(exchangeM28674Q);
            RealWebSocket.Streams streamsM28938n = exchangeM28674Q.m28938n();
            WebSocketExtensions webSocketExtensionsM29481a = WebSocketExtensions.f26101g.m29481a(response.m28686o0());
            this.f26096a.f26066d = webSocketExtensionsM29481a;
            if (!this.f26096a.m29455q(webSocketExtensionsM29481a)) {
                RealWebSocket realWebSocket = this.f26096a;
                synchronized (realWebSocket) {
                    realWebSocket.f26077o.clear();
                    realWebSocket.m29464l(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.f26096a.m29468p(Util.f25485i + " WebSocket " + this.f26097b.m28656j().m28510n(), streamsM28938n);
                this.f26096a.m29467o().m28726f(this.f26096a, response);
                this.f26096a.m29469r();
            } catch (Exception e7) {
                this.f26096a.m29466n(e7, null);
            }
        } catch (IOException e8) {
            this.f26096a.m29466n(e8, response);
            Util.m28773m(response);
            if (exchangeM28674Q != null) {
                exchangeM28674Q.m28945v();
            }
        }
    }

    @Override // okhttp3.Callback
    /* JADX INFO: renamed from: b */
    public void mo28365b(Call call, IOException e7) {
        AbstractC6118n.m27187e(call, "call");
        AbstractC6118n.m27187e(e7, "e");
        this.f26096a.m29466n(e7, null);
    }
}

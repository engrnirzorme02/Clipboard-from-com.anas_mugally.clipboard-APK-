package okhttp3.internal.http;

import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0669z;

/* JADX INFO: loaded from: classes.dex */
public interface ExchangeCodec {

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f25723a = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    void mo29048a();

    /* JADX INFO: renamed from: b */
    void mo29049b(Request request);

    /* JADX INFO: renamed from: c */
    InterfaceC0640B mo29050c(Response response);

    void cancel();

    /* JADX INFO: renamed from: d */
    Response.Builder mo29051d(boolean z7);

    /* JADX INFO: renamed from: e */
    RealConnection mo29052e();

    /* JADX INFO: renamed from: f */
    void mo29053f();

    /* JADX INFO: renamed from: g */
    long mo29054g(Response response);

    /* JADX INFO: renamed from: h */
    InterfaceC0669z mo29055h(Request request, long j7);
}

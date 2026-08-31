package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.content.Context;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.A */
/* JADX INFO: loaded from: classes.dex */
public final class C2693A extends AbstractC2698F {
    /* JADX WARN: Illegal instructions before constructor call */
    public C2693A(Context context) {
        AbstractC6118n.m27187e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AbstractC2723y.m12839a());
        AbstractC6118n.m27186d(systemService, "context.getSystemService…opicsManager::class.java)");
        super(AbstractC2724z.m12840a(systemService));
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.AbstractC2698F
    /* JADX INFO: renamed from: c */
    public GetTopicsRequest mo12800c(C2700b request) {
        AbstractC6118n.m27187e(request, "request");
        return C2705g.f10649a.m12817a(request);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.AbstractC2698F
    /* JADX INFO: renamed from: d */
    public C2706h mo12801d(GetTopicsResponse response) {
        AbstractC6118n.m27187e(response, "response");
        return C2717s.f10652a.m12831b(response);
    }
}

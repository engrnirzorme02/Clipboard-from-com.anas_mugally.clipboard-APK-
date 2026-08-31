package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2721w extends AbstractC2698F {
    /* JADX WARN: Illegal instructions before constructor call */
    public C2721w(Context context) {
        AbstractC6118n.m27187e(context, "context");
        TopicsManager topicsManager = TopicsManager.get(context);
        AbstractC6118n.m27186d(topicsManager, "get(context)");
        super(topicsManager);
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

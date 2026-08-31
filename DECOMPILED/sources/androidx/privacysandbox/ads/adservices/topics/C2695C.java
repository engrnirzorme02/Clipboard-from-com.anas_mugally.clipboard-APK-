package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.content.Context;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.C */
/* JADX INFO: loaded from: classes.dex */
public final class C2695C extends AbstractC2698F {
    /* JADX WARN: Illegal instructions before constructor call */
    public C2695C(Context context) {
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
}

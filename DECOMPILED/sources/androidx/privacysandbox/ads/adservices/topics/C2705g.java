package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2705g {

    /* JADX INFO: renamed from: a */
    public static final C2705g f10649a = new C2705g();

    private C2705g() {
    }

    /* JADX INFO: renamed from: a */
    public final GetTopicsRequest m12817a(C2700b request) {
        AbstractC6118n.m27187e(request, "request");
        GetTopicsRequest getTopicsRequestBuild = AbstractC2701c.m12813a().setAdsSdkName(request.m12808a()).setShouldRecordObservation(request.m12809b()).build();
        AbstractC6118n.m27186d(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }

    /* JADX INFO: renamed from: b */
    public final GetTopicsRequest m12818b(C2700b request) {
        AbstractC6118n.m27187e(request, "request");
        GetTopicsRequest getTopicsRequestBuild = AbstractC2701c.m12813a().setAdsSdkName(request.m12808a()).build();
        AbstractC6118n.m27186d(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }
}

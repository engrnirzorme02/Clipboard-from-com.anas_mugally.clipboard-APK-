package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2684g extends AbstractC2689l {
    /* JADX WARN: Illegal instructions before constructor call */
    public C2684g(Context context) {
        AbstractC6118n.m27187e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AbstractC2682e.m12786a());
        AbstractC6118n.m27186d(systemService, "context.getSystemService…ementManager::class.java)");
        super(AbstractC2683f.m12787a(systemService));
    }
}

package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2681d extends AbstractC2689l {
    /* JADX WARN: Illegal instructions before constructor call */
    public C2681d(Context context) {
        AbstractC6118n.m27187e(context, "context");
        MeasurementManager measurementManager = MeasurementManager.get(context);
        AbstractC6118n.m27186d(measurementManager, "get(context)");
        super(measurementManager);
    }
}

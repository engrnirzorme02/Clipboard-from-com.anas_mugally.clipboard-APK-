package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4291n4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4261j6 f15919a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f15920b;

    RunnableC4291n4(AppMeasurementDynamiteService appMeasurementDynamiteService, C4261j6 c4261j6) {
        this.f15919a = c4261j6;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f15920b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15920b.f15078a.m18660B().m19264I(this.f15919a);
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4268k5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ zzcu f15858a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f15859b;

    RunnableC4268k5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar) {
        this.f15858a = zzcuVar;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f15859b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f15859b;
        appMeasurementDynamiteService.f15078a.m18661C().m19394e0(this.f15858a, appMeasurementDynamiteService.f15078a.m18674d());
    }
}

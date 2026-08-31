package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.U2 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4143U2 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ zzcu f15440a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f15441b;

    RunnableC4143U2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar) {
        this.f15440a = zzcuVar;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f15441b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15441b.f15078a.m18668J().m19238r(this.f15440a);
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.v3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4354v3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ zzcu f16117a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4039G f16118b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f16119c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f16120d;

    RunnableC4354v3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, C4039G c4039g, String str) {
        this.f16117a = zzcuVar;
        this.f16118b = c4039g;
        this.f16119c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f16120d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16120d.f15078a.m18668J().m19203B(this.f16117a, this.f16118b, this.f16119c);
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.K4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4076K4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ zzcu f15287a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15288b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f15289c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f15290d;

    RunnableC4076K4(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, String str, String str2) {
        this.f15287a = zzcuVar;
        this.f15288b = str;
        this.f15289c = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f15290d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15290d.f15078a.m18668J().m19228f0(this.f15287a, this.f15288b, this.f15289c);
    }
}

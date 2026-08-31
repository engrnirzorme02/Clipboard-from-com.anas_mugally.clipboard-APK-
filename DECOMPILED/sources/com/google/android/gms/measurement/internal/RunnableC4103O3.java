package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcu;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.O3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4103O3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ zzcu f15342a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15343b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f15344c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f15345d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f15346e;

    RunnableC4103O3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, String str, String str2, boolean z7) {
        this.f15342a = zzcuVar;
        this.f15343b = str;
        this.f15344c = str2;
        this.f15345d = z7;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f15346e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15346e.f15078a.m18668J().m19230h0(this.f15342a, this.f15343b, this.f15344c, this.f15345d);
    }
}

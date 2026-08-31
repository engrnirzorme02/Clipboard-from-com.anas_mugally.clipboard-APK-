package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4284m5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ServiceConnectionC4316q5 f15890a;

    RunnableC4284m5(ServiceConnectionC4316q5 serviceConnectionC4316q5) {
        Objects.requireNonNull(serviceConnectionC4316q5);
        this.f15890a = serviceConnectionC4316q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4364w5 c4364w5 = this.f15890a.f15981c;
        C4164X2 c4164x2 = c4364w5.f15066a;
        Context contextMo18424e = c4164x2.mo18424e();
        c4164x2.mo18423c();
        c4364w5.m19212K(new ComponentName(contextMo18424e, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}

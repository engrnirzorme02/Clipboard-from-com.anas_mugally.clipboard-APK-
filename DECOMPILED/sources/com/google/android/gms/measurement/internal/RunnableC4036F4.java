package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.F4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4036F4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Bundle f15211a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4028E4 f15212b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4028E4 f15213c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ long f15214d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4090M4 f15215e;

    RunnableC4036F4(C4090M4 c4090m4, Bundle bundle, C4028E4 c4028e4, C4028E4 c4028e5, long j7) {
        this.f15211a = bundle;
        this.f15212b = c4028e4;
        this.f15213c = c4028e5;
        this.f15214d = j7;
        Objects.requireNonNull(c4090m4);
        this.f15215e = c4090m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15215e.m18545A(this.f15211a, this.f15212b, this.f15213c, this.f15214d);
    }
}

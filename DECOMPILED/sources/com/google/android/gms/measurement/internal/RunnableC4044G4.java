package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.G4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4044G4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4028E4 f15234a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4028E4 f15235b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ long f15236c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f15237d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4090M4 f15238e;

    RunnableC4044G4(C4090M4 c4090m4, C4028E4 c4028e4, C4028E4 c4028e5, long j7, boolean z7) {
        this.f15234a = c4028e4;
        this.f15235b = c4028e5;
        this.f15236c = j7;
        this.f15237d = z7;
        Objects.requireNonNull(c4090m4);
        this.f15238e = c4090m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15238e.m18546B(this.f15234a, this.f15235b, this.f15236c, this.f15237d, null);
    }
}

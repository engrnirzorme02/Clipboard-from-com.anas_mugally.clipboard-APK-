package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.I4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4060I4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f15255a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4090M4 f15256b;

    RunnableC4060I4(C4090M4 c4090m4, long j7) {
        this.f15255a = j7;
        Objects.requireNonNull(c4090m4);
        this.f15256b = c4090m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4090M4 c4090m4 = this.f15256b;
        c4090m4.f15066a.m18671M().m18448k(this.f15255a);
        c4090m4.f15312e = null;
    }
}

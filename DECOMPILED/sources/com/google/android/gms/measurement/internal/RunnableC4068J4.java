package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.J4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4068J4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4028E4 f15272a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f15273b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4090M4 f15274c;

    RunnableC4068J4(C4090M4 c4090m4, C4028E4 c4028e4, long j7) {
        this.f15272a = c4028e4;
        this.f15273b = j7;
        Objects.requireNonNull(c4090m4);
        this.f15274c = c4090m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4090M4 c4090m4 = this.f15274c;
        c4090m4.m18547C(this.f15272a, false, this.f15273b);
        c4090m4.f15312e = null;
        c4090m4.f15066a.m18668J().m19241u(null);
    }
}

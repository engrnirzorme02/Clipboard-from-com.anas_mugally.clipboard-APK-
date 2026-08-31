package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.x2 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4369x2 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f16198a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4377y2 f16199b;

    RunnableC4369x2(C4377y2 c4377y2, boolean z7) {
        this.f16198a = z7;
        Objects.requireNonNull(c4377y2);
        this.f16199b = c4377y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16199b.m19329c().m18945s0(this.f16198a);
    }
}

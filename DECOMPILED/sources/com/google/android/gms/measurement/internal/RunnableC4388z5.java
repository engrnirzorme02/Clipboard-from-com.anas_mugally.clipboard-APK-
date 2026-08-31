package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z5 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4388z5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4317q6 f16271a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Runnable f16272b;

    RunnableC4388z5(C4021D5 c4021d5, C4317q6 c4317q6, Runnable runnable) {
        this.f16271a = c4317q6;
        this.f16272b = runnable;
        Objects.requireNonNull(c4021d5);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4317q6 c4317q6 = this.f16271a;
        c4317q6.m18896E();
        c4317q6.m18894D(this.f16272b);
        c4317q6.m18942r();
    }
}

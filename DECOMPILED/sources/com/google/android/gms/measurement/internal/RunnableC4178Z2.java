package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.Z2 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4178Z2 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15528a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ BinderC4386z3 f15529b;

    RunnableC4178Z2(BinderC4386z3 binderC4386z3, C4006B6 c4006b6) {
        this.f15528a = c4006b6;
        Objects.requireNonNull(binderC4386z3);
        this.f15529b = binderC4386z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC4386z3 binderC4386z3 = this.f15529b;
        binderC4386z3.m19347S0().m18896E();
        binderC4386z3.m19347S0().m18923h0(this.f15528a);
    }
}

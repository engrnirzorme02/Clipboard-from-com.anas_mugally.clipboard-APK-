package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4258j3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15838a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ BinderC4386z3 f15839b;

    RunnableC4258j3(BinderC4386z3 binderC4386z3, C4006B6 c4006b6) {
        this.f15838a = c4006b6;
        Objects.requireNonNull(binderC4386z3);
        this.f15839b = binderC4386z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC4386z3 binderC4386z3 = this.f15839b;
        binderC4386z3.m19347S0().m18896E();
        binderC4386z3.m19347S0().m18914b0(this.f15838a);
    }
}

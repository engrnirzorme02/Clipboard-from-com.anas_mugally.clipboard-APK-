package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4186a3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15546a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ BinderC4386z3 f15547b;

    RunnableC4186a3(BinderC4386z3 binderC4386z3, C4006B6 c4006b6) {
        this.f15546a = c4006b6;
        Objects.requireNonNull(binderC4386z3);
        this.f15547b = binderC4386z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BinderC4386z3 binderC4386z3 = this.f15547b;
        binderC4386z3.m19347S0().m18896E();
        binderC4386z3.m19347S0().m18925i0(this.f15546a);
    }
}

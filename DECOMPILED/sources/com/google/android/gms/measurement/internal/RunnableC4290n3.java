package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4290n3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4039G f15916a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15917b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BinderC4386z3 f15918c;

    RunnableC4290n3(BinderC4386z3 binderC4386z3, C4039G c4039g, String str) {
        this.f15916a = c4039g;
        this.f15917b = str;
        Objects.requireNonNull(binderC4386z3);
        this.f15918c = binderC4386z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC4386z3 binderC4386z3 = this.f15918c;
        binderC4386z3.m19347S0().m18896E();
        binderC4386z3.m19347S0().m18924i(this.f15916a, this.f15917b);
    }
}

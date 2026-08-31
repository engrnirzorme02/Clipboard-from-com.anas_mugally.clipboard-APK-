package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4282m3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4039G f15884a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4006B6 f15885b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BinderC4386z3 f15886c;

    RunnableC4282m3(BinderC4386z3 binderC4386z3, C4039G c4039g, C4006B6 c4006b6) {
        this.f15884a = c4039g;
        this.f15885b = c4006b6;
        Objects.requireNonNull(binderC4386z3);
        this.f15886c = binderC4386z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4039G c4039g = this.f15884a;
        C4006B6 c4006b6 = this.f15885b;
        BinderC4386z3 binderC4386z3 = this.f15886c;
        binderC4386z3.m19349W0(binderC4386z3.m19350X0(c4039g, c4006b6), c4006b6);
    }
}

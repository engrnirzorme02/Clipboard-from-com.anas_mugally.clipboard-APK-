package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.p3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4306p3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4357v6 f15946a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4006B6 f15947b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BinderC4386z3 f15948c;

    RunnableC4306p3(BinderC4386z3 binderC4386z3, C4357v6 c4357v6, C4006B6 c4006b6) {
        this.f15946a = c4357v6;
        this.f15947b = c4006b6;
        Objects.requireNonNull(binderC4386z3);
        this.f15948c = binderC4386z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC4386z3 binderC4386z3 = this.f15948c;
        binderC4386z3.m19347S0().m18896E();
        C4357v6 c4357v6 = this.f15946a;
        if (c4357v6.zza() != null) {
            binderC4386z3.m19347S0().m18915c0(c4357v6, this.f15947b);
        } else {
            C4006B6 c4006b6 = this.f15947b;
            binderC4386z3.m19347S0().m18917d0(c4357v6.f16124b, c4006b6);
        }
    }
}

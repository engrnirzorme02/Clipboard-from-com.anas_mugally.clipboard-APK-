package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4210d3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4246i f15712a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ BinderC4386z3 f15713b;

    RunnableC4210d3(BinderC4386z3 binderC4386z3, C4246i c4246i) {
        this.f15712a = c4246i;
        Objects.requireNonNull(binderC4386z3);
        this.f15713b = binderC4386z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC4386z3 binderC4386z3 = this.f15713b;
        binderC4386z3.m19347S0().m18896E();
        C4246i c4246i = this.f15712a;
        if (c4246i.f15808c.zza() == null) {
            binderC4386z3.m19347S0().m18931l0(c4246i);
        } else {
            binderC4386z3.m19347S0().m18927j0(c4246i);
        }
    }
}

package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4202c3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4246i f15581a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4006B6 f15582b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BinderC4386z3 f15583c;

    RunnableC4202c3(BinderC4386z3 binderC4386z3, C4246i c4246i, C4006B6 c4006b6) {
        this.f15581a = c4246i;
        this.f15582b = c4006b6;
        Objects.requireNonNull(binderC4386z3);
        this.f15583c = binderC4386z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC4386z3 binderC4386z3 = this.f15583c;
        binderC4386z3.m19347S0().m18896E();
        C4246i c4246i = this.f15581a;
        if (c4246i.f15808c.zza() == null) {
            binderC4386z3.m19347S0().m18933m0(c4246i, this.f15582b);
        } else {
            binderC4386z3.m19347S0().m18929k0(c4246i, this.f15582b);
        }
    }
}

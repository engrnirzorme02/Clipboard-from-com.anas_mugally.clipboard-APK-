package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q3 */
/* JADX INFO: loaded from: classes2.dex */
final class CallableC4314q3 implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15975a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Bundle f15976b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BinderC4386z3 f15977c;

    CallableC4314q3(BinderC4386z3 binderC4386z3, C4006B6 c4006b6, Bundle bundle) {
        this.f15975a = c4006b6;
        this.f15976b = bundle;
        Objects.requireNonNull(binderC4386z3);
        this.f15977c = binderC4386z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC4386z3 binderC4386z3 = this.f15977c;
        binderC4386z3.m19347S0().m18896E();
        return binderC4386z3.m19347S0().m18941q0(this.f15975a, this.f15976b);
    }
}

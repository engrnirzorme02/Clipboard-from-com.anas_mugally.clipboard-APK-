package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.Y2 */
/* JADX INFO: loaded from: classes2.dex */
final class CallableC4171Y2 implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15514a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ BinderC4386z3 f15515b;

    CallableC4171Y2(BinderC4386z3 binderC4386z3, String str) {
        this.f15514a = str;
        Objects.requireNonNull(binderC4386z3);
        this.f15515b = binderC4386z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC4386z3 binderC4386z3 = this.f15515b;
        binderC4386z3.m19347S0().m18896E();
        return binderC4386z3.m19347S0().m18898F0().m19007C0(this.f15514a);
    }
}

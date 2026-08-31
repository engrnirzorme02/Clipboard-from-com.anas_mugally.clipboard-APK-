package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;
import p283k3.C6030a;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l3 */
/* JADX INFO: loaded from: classes2.dex */
final class CallableC4274l3 implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15868a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ BinderC4386z3 f15869b;

    CallableC4274l3(BinderC4386z3 binderC4386z3, C4006B6 c4006b6) {
        this.f15868a = c4006b6;
        Objects.requireNonNull(binderC4386z3);
        this.f15869b = binderC4386z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC4386z3 binderC4386z3 = this.f15869b;
        binderC4386z3.m19347S0().m18896E();
        return new C6030a(binderC4386z3.m19347S0().m18911S0(this.f15868a.f15112a));
    }
}

package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e3 */
/* JADX INFO: loaded from: classes2.dex */
final class CallableC4218e3 implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15727a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15728b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f15729c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ BinderC4386z3 f15730d;

    CallableC4218e3(BinderC4386z3 binderC4386z3, String str, String str2, String str3) {
        this.f15727a = str;
        this.f15728b = str2;
        this.f15729c = str3;
        Objects.requireNonNull(binderC4386z3);
        this.f15730d = binderC4386z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC4386z3 binderC4386z3 = this.f15730d;
        binderC4386z3.m19347S0().m18896E();
        return binderC4386z3.m19347S0().m18898F0().m19009D0(this.f15727a, this.f15728b, this.f15729c);
    }
}

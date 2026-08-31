package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h3 */
/* JADX INFO: loaded from: classes2.dex */
final class CallableC4242h3 implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15793a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15794b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f15795c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ BinderC4386z3 f15796d;

    CallableC4242h3(BinderC4386z3 binderC4386z3, String str, String str2, String str3) {
        this.f15793a = str;
        this.f15794b = str2;
        this.f15795c = str3;
        Objects.requireNonNull(binderC4386z3);
        this.f15796d = binderC4386z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC4386z3 binderC4386z3 = this.f15796d;
        binderC4386z3.m19347S0().m18896E();
        return binderC4386z3.m19347S0().m18898F0().m19017H0(this.f15793a, this.f15794b, this.f15795c);
    }
}

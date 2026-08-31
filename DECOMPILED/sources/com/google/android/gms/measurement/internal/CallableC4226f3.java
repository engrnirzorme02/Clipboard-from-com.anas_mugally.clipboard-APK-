package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f3 */
/* JADX INFO: loaded from: classes2.dex */
final class CallableC4226f3 implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15742a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15743b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f15744c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ BinderC4386z3 f15745d;

    CallableC4226f3(BinderC4386z3 binderC4386z3, String str, String str2, String str3) {
        this.f15742a = str;
        this.f15743b = str2;
        this.f15744c = str3;
        Objects.requireNonNull(binderC4386z3);
        this.f15745d = binderC4386z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC4386z3 binderC4386z3 = this.f15745d;
        binderC4386z3.m19347S0().m18896E();
        return binderC4386z3.m19347S0().m18898F0().m19009D0(this.f15742a, this.f15743b, this.f15744c);
    }
}

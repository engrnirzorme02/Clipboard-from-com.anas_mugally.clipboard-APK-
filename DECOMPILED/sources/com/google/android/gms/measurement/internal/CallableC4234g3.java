package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g3 */
/* JADX INFO: loaded from: classes2.dex */
final class CallableC4234g3 implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15776a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15777b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f15778c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ BinderC4386z3 f15779d;

    CallableC4234g3(BinderC4386z3 binderC4386z3, String str, String str2, String str3) {
        this.f15776a = str;
        this.f15777b = str2;
        this.f15778c = str3;
        Objects.requireNonNull(binderC4386z3);
        this.f15779d = binderC4386z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        BinderC4386z3 binderC4386z3 = this.f15779d;
        binderC4386z3.m19347S0().m18896E();
        return binderC4386z3.m19347S0().m18898F0().m19017H0(this.f15776a, this.f15777b, this.f15778c);
    }
}

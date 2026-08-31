package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4194b3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15557a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15558b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f15559c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ long f15560d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ BinderC4386z3 f15561e;

    RunnableC4194b3(BinderC4386z3 binderC4386z3, String str, String str2, String str3, long j7) {
        this.f15557a = str;
        this.f15558b = str2;
        this.f15559c = str3;
        this.f15560d = j7;
        Objects.requireNonNull(binderC4386z3);
        this.f15561e = binderC4386z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f15557a;
        if (str == null) {
            BinderC4386z3 binderC4386z3 = this.f15561e;
            binderC4386z3.m19347S0().m18947t0(this.f15558b, null);
        } else {
            C4028E4 c4028e4 = new C4028E4(this.f15559c, str, this.f15560d);
            BinderC4386z3 binderC4386z4 = this.f15561e;
            binderC4386z4.m19347S0().m18947t0(this.f15558b, c4028e4);
        }
    }
}

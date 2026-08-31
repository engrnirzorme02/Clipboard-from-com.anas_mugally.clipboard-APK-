package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4250i3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15822a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ BinderC4386z3 f15823b;

    RunnableC4250i3(BinderC4386z3 binderC4386z3, C4006B6 c4006b6) {
        this.f15822a = c4006b6;
        Objects.requireNonNull(binderC4386z3);
        this.f15823b = binderC4386z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC4386z3 binderC4386z3 = this.f15823b;
        binderC4386z3.m19347S0().m18896E();
        C4317q6 c4317q6M19347S0 = binderC4386z3.m19347S0();
        c4317q6M19347S0.mo18422b().mo18427h();
        c4317q6M19347S0.m18907O0();
        C4006B6 c4006b6 = this.f15822a;
        AbstractC3718s.m18077f(c4006b6.f15112a);
        c4317q6M19347S0.m18937o0(c4006b6);
    }
}

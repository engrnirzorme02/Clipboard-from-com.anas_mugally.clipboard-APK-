package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.V2 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4150V2 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4043G3 f15449a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4164X2 f15450b;

    RunnableC4150V2(C4164X2 c4164x2, C4043G3 c4043g3) {
        this.f15449a = c4043g3;
        Objects.requireNonNull(c4164x2);
        this.f15450b = c4164x2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4164X2 c4164x2 = this.f15450b;
        C4043G3 c4043g3 = this.f15449a;
        c4164x2.m18684p(c4043g3);
        c4164x2.m18685v(c4043g3.f15230d);
    }
}

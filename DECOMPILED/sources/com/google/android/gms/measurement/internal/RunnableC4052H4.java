package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.H4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4052H4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4090M4 f15245a;

    RunnableC4052H4(C4090M4 c4090m4) {
        Objects.requireNonNull(c4090m4);
        this.f15245a = c4090m4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4090M4 c4090m4 = this.f15245a;
        c4090m4.f15312e = c4090m4.m18548D();
    }
}

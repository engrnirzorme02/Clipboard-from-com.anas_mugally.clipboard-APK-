package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.N3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4096N3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4371x4 f15325a;

    RunnableC4096N3(C4371x4 c4371x4) {
        Objects.requireNonNull(c4371x4);
        this.f15325a = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15325a.f16219r.m18524a();
    }
}

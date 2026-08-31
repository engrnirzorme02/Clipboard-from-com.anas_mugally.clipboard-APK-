package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.Y3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4172Y3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicReference f15516a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15517b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f15518c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4371x4 f15519d;

    RunnableC4172Y3(C4371x4 c4371x4, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f15516a = atomicReference;
        this.f15517b = str2;
        this.f15518c = str3;
        Objects.requireNonNull(c4371x4);
        this.f15519d = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15519d.f15066a.m18668J().m19227e0(this.f15516a, null, this.f15517b, this.f15518c);
    }
}

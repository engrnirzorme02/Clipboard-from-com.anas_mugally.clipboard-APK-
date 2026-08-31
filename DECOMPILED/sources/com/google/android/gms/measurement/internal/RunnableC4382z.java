package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4382z implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f16253a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f16254b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4008C0 f16255c;

    RunnableC4382z(C4008C0 c4008c0, String str, long j7) {
        this.f16253a = str;
        this.f16254b = j7;
        Objects.requireNonNull(c4008c0);
        this.f16255c = c4008c0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16255c.m18450m(this.f16253a, this.f16254b);
    }
}

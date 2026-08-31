package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4182a implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15540a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f15541b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4008C0 f15542c;

    RunnableC4182a(C4008C0 c4008c0, String str, long j7) {
        this.f15540a = str;
        this.f15541b = j7;
        Objects.requireNonNull(c4008c0);
        this.f15542c = c4008c0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15542c.m18449l(this.f15540a, this.f15541b);
    }
}

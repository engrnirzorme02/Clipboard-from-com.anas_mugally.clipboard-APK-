package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.S3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4130S3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15409a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15410b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f15411c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ long f15412d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4371x4 f15413e;

    RunnableC4130S3(C4371x4 c4371x4, String str, String str2, Object obj, long j7) {
        this.f15409a = str;
        this.f15410b = str2;
        this.f15411c = obj;
        this.f15412d = j7;
        Objects.requireNonNull(c4371x4);
        this.f15413e = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15413e.m19257B(this.f15409a, this.f15410b, this.f15411c, this.f15412d);
    }
}

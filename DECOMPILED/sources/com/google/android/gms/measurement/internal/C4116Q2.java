package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.Q2 */
/* JADX INFO: loaded from: classes2.dex */
final class C4116Q2 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private final String f15375a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4136T2 f15376b;

    public C4116Q2(C4136T2 c4136t2, String str) {
        Objects.requireNonNull(c4136t2);
        this.f15376b = c4136t2;
        AbstractC3718s.m18083l(str);
        this.f15375a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f15376b.f15066a.mo18421a().m18851o().m18835b(this.f15375a, th);
    }
}

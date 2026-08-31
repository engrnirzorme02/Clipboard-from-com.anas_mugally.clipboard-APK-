package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.J3 */
/* JADX INFO: loaded from: classes2.dex */
final class ExecutorC4067J3 implements Executor {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4371x4 f15271a;

    ExecutorC4067J3(C4371x4 c4371x4) {
        Objects.requireNonNull(c4371x4);
        this.f15271a = c4371x4;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f15271a.f15066a.mo18422b().m18639t(runnable);
    }
}

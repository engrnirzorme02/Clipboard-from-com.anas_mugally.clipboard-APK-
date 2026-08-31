package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzaow implements Executor {
    final /* synthetic */ Handler zza;

    zzaow(zzaoy zzaoyVar, Handler handler) {
        this.zza = handler;
        Objects.requireNonNull(zzaoyVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}

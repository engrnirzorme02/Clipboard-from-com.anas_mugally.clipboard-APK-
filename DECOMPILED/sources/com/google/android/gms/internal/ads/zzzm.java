package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzzm implements zzzn {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdf zzb;

    zzzm(Executor executor, zzdf zzdfVar) {
        this.zza = executor;
        this.zzb = zzdfVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}

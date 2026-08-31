package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzblg implements Runnable {
    final /* synthetic */ zzblj zza;

    zzblg(zzblj zzbljVar) {
        Objects.requireNonNull(zzbljVar);
        this.zza = zzbljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}

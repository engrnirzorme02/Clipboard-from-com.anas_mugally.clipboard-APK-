package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenj {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzeni zzb;

    public final void zza(boolean z7) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    final void zzc(zzeni zzeniVar) {
        this.zzb = zzeniVar;
    }

    final zzeni zzd() {
        return this.zzb;
    }
}

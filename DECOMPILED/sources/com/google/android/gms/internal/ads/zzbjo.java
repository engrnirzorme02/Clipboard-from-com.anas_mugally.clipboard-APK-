package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjo {
    private boolean zza = false;
    private boolean zzb = false;
    private float zzc = 0.0f;
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public final synchronized void zza(boolean z7) {
        this.zza = z7;
        this.zzd.set(true);
    }

    public final synchronized void zzb(boolean z7, float f7) {
        this.zzb = z7;
        this.zzc = f7;
    }

    public final synchronized boolean zzc(boolean z7) {
        if (!this.zzd.get()) {
            return z7;
        }
        return this.zza;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized float zze() {
        return this.zzc;
    }
}

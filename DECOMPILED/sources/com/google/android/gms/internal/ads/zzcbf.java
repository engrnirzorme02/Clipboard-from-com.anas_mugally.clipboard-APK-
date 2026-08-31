package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3431F0;

/* JADX INFO: loaded from: classes2.dex */
final class zzcbf implements Runnable {
    private final zzcar zza;
    private boolean zzb = false;

    zzcbf(zzcar zzcarVar) {
        this.zza = zzcarVar;
    }

    private final void zzc() {
        zzfro zzfroVar = C3431F0.f14180l;
        zzfroVar.removeCallbacks(this);
        zzfroVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzF();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzF();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}

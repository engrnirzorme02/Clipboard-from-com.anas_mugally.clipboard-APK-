package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaun implements Runnable {
    final /* synthetic */ zzauo zza;

    zzaun(zzauo zzauoVar) {
        Objects.requireNonNull(zzauoVar);
        this.zza = zzauoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzauo zzauoVar = this.zza;
        if (zzauoVar.zzb != null) {
            return;
        }
        synchronized (zzauo.zzd) {
            if (zzauoVar.zzb != null) {
                return;
            }
            boolean z7 = false;
            try {
                zBooleanValue = ((Boolean) zzbci.zzcQ.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzauo.zza = zzfqd.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z7 = zBooleanValue;
            this.zza.zzb = Boolean.valueOf(z7);
            zzauo.zzd.open();
        }
    }
}

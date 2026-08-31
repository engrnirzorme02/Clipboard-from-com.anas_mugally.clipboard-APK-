package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcmx implements zzbjl {
    final /* synthetic */ zzcna zza;

    zzcmx(zzcna zzcnaVar) {
        Objects.requireNonNull(zzcnaVar);
        this.zza = zzcnaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        zzcna zzcnaVar = this.zza;
        if (zzcnaVar.zze(map)) {
            zzcnaVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzg().zzl();
                }
            });
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzeyo implements zzelx {
    final /* synthetic */ zzeyr zza;

    zzeyo(zzeyr zzeyrVar) {
        Objects.requireNonNull(zzeyrVar);
        this.zza = zzeyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        zzeyr zzeyrVar = this.zza;
        synchronized (zzeyrVar) {
            zzeyrVar.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcoe zzcoeVar = (zzcoe) obj;
        zzeyr zzeyrVar = this.zza;
        synchronized (zzeyrVar) {
            try {
                zzcoe zzcoeVar2 = zzeyrVar.zza;
                if (zzcoeVar2 != null) {
                    zzcoeVar2.zzd();
                }
                zzeyrVar.zza = zzcoeVar;
                zzcoeVar.zza(zzeyrVar);
                zzeyrVar.zzN().zzs(new zzcof(zzcoeVar, zzeyrVar, zzeyrVar.zzN(), zzeyrVar.zzO()));
                zzcoeVar.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

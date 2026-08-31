package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzekm implements zzelx {
    final /* synthetic */ zzekn zza;

    zzekm(zzekn zzeknVar) {
        Objects.requireNonNull(zzeknVar);
        this.zza = zzeknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final void zza() {
        zzekn zzeknVar = this.zza;
        synchronized (zzeknVar) {
            zzeknVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzekn zzeknVar = this.zza;
        zzcok zzcokVar = (zzcok) obj;
        synchronized (zzeknVar) {
            try {
                if (zzeknVar.zzM() != null) {
                    if (zzcokVar.zzo() != null && zzeknVar.zzM().zzo() != null) {
                        zzcokVar.zzo().zzb(zzeknVar.zzM().zzo().zza());
                    }
                    zzeknVar.zzM().zzd();
                }
                zzeknVar.zzN(zzcokVar);
                zzeknVar.zzM().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

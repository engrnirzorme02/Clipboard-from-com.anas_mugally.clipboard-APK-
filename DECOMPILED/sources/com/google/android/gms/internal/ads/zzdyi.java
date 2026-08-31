package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdyi implements zzgoq {
    final /* synthetic */ zzdyo zza;

    zzdyi(zzdyo zzdyoVar) {
        Objects.requireNonNull(zzdyoVar);
        this.zza = zzdyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcu zzfcuVar = (zzfcu) obj;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcw)).booleanValue()) {
            this.zza.zzf().zzdU(zzfcuVar);
        }
    }
}

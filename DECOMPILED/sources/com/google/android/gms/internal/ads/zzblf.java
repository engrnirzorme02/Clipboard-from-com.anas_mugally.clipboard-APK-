package com.google.android.gms.internal.ads;

import java.util.Objects;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzblf implements zzgob {
    final /* synthetic */ zzbkx zza;

    zzblf(zzblj zzbljVar, zzbkx zzbkxVar) {
        this.zza = zzbkxVar;
        Objects.requireNonNull(zzbljVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
        zzbzm zzbzmVar = new zzbzm();
        ((zzbld) obj).zze(this.zza, new zzble(this, zzbzmVar));
        return zzbzmVar;
    }
}

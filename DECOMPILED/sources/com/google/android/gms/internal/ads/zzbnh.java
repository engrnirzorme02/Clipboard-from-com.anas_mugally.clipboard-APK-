package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbnh implements zzbzq {
    final /* synthetic */ zzbnj zza;

    zzbnh(zzbnj zzbnjVar) {
        Objects.requireNonNull(zzbnjVar);
        this.zza = zzbnjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AbstractC3490o0.m17545k("Releasing engine reference.");
        this.zza.zzb().zzb();
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbnk implements zzbzq {
    final /* synthetic */ zzbnj zza;

    zzbnk(zzbno zzbnoVar, zzbnj zzbnjVar) {
        this.zza = zzbnjVar;
        Objects.requireNonNull(zzbnoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AbstractC3490o0.m17545k("Getting a new session for JS Engine.");
        this.zza.zzf(((zzbmk) obj).zzl());
    }
}

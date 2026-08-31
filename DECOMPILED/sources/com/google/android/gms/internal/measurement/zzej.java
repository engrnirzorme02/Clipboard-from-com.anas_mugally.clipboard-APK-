package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzej extends zzeq {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzej(zzfb zzfbVar, boolean z7) {
        super(zzfbVar, true);
        this.zza = z7;
        Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() {
        ((zzcr) AbstractC3718s.m18083l(this.zzb.zzQ())).setDataCollectionEnabled(this.zza);
    }
}

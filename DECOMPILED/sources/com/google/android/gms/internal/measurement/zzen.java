package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzen extends zzeq {
    final /* synthetic */ zzes zza;
    final /* synthetic */ zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzen(zzfb zzfbVar, zzes zzesVar) {
        super(zzfbVar, true);
        this.zza = zzesVar;
        Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() {
        ((zzcr) AbstractC3718s.m18083l(this.zzb.zzQ())).registerOnMeasurementEventListener(this.zza);
    }
}

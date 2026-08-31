package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzef extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ zzco zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzef(zzfb zzfbVar, String str, zzco zzcoVar) {
        super(zzfbVar, true);
        this.zza = str;
        this.zzb = zzcoVar;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() {
        ((zzcr) AbstractC3718s.m18083l(this.zzc.zzQ())).getMaxUserProperties(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    protected final void zzb() {
        this.zzb.zzb(null);
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzep extends zzeq {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzfb zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzep(zzfb zzfbVar, Long l7, String str, String str2, Bundle bundle, boolean z7, boolean z8) {
        super(zzfbVar, true);
        this.zza = l7;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z7;
        this.zzf = z8;
        Objects.requireNonNull(zzfbVar);
        this.zzg = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() {
        Long l7 = this.zza;
        ((zzcr) AbstractC3718s.m18083l(this.zzg.zzQ())).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, l7 == null ? this.zzh : l7.longValue());
    }
}

package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdh extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzfb zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdh(zzfb zzfbVar, String str, String str2, Object obj, boolean z7) {
        super(zzfbVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z7;
        Objects.requireNonNull(zzfbVar);
        this.zze = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() {
        ((zzcr) AbstractC3718s.m18083l(this.zze.zzQ())).setUserProperty(this.zza, this.zzb, BinderC3773b.m18221N0(this.zzc), this.zzd, this.zzh);
    }
}

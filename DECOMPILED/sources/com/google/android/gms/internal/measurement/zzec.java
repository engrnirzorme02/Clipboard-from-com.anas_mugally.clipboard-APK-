package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzec extends zzeq {
    final /* synthetic */ String zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzec(zzfb zzfbVar, boolean z7, int i7, String str, Object obj, Object obj2, Object obj3) {
        super(zzfbVar, false);
        this.zza = str;
        this.zzb = obj;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() {
        ((zzcr) AbstractC3718s.m18083l(this.zzc.zzQ())).logHealthData(5, this.zza, BinderC3773b.m18221N0(this.zzb), BinderC3773b.m18221N0(null), BinderC3773b.m18221N0(null));
    }
}

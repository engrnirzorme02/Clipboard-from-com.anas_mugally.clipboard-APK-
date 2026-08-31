package com.google.android.gms.internal.ads;

import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzdlk implements zzgoq {
    final /* synthetic */ zzdru zza;
    final /* synthetic */ zzdln zzb;

    zzdlk(zzdln zzdlnVar, zzdru zzdruVar) {
        this.zza = zzdruVar;
        Objects.requireNonNull(zzdlnVar);
        this.zzb = zzdlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
        this.zzb.zzd().zze().putLong(this.zza.zza(), C7351t.m32357o().mo18159a());
    }
}

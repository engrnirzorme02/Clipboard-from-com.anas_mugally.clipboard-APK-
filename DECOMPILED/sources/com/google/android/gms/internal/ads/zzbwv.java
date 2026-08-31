package com.google.android.gms.internal.ads;

import java.util.Objects;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzbwv implements zzgoq {
    final /* synthetic */ InterfaceFutureC1673e zza;

    zzbwv(zzbxa zzbxaVar, InterfaceFutureC1673e interfaceFutureC1673e) {
        this.zza = interfaceFutureC1673e;
        Objects.requireNonNull(zzbxaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzbxa.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbxa.zzc.remove(this.zza);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzfdo implements zzgoq {
    final /* synthetic */ zzfdp zza;
    final /* synthetic */ int zzb;

    zzfdo(zzfdp zzfdpVar, int i7) {
        this.zzb = i7;
        Objects.requireNonNull(zzfdpVar);
        this.zza = zzfdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        C7351t.m32354l().zzg(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}

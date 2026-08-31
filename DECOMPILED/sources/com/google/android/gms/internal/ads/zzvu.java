package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzvu extends zzud {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzvu(zzvx zzvxVar, zzbe zzbeVar) {
        super(zzbeVar);
        Objects.requireNonNull(zzvxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i7, zzbd zzbdVar, long j7) {
        this.zzb.zzb(i7, zzbdVar, j7);
        zzbdVar.zzk = true;
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i7, zzbc zzbcVar, boolean z7) {
        this.zzb.zzd(i7, zzbcVar, z7);
        zzbcVar.zzf = true;
        return zzbcVar;
    }
}

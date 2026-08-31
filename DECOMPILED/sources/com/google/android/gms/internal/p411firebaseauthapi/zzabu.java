package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Objects;
import p192Z3.AbstractC2137o;

/* JADX INFO: loaded from: classes2.dex */
final class zzabu implements zzafv<zzajd> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    zzabu(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(AbstractC2137o.m8742a(str));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzajd zzajdVar) {
        zzajd zzajdVar2 = zzajdVar;
        if (!zzajdVar2.zzl()) {
            zzaar.zza(this.zzb, zzajdVar2, this.zza, this);
        } else {
            this.zza.zza(new zzaas(zzajdVar2.zzf(), zzajdVar2.zzk(), zzajdVar2.zzb()));
        }
    }
}

package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Objects;
import p192Z3.AbstractC2137o;

/* JADX INFO: loaded from: classes2.dex */
final class zzaaw implements zzafv<zzajh> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    zzaaw(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(AbstractC2137o.m8742a(str));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzajh zzajhVar) {
        zzajh zzajhVar2 = zzajhVar;
        if (zzajhVar2.zzf()) {
            this.zza.zza(new zzaas(zzajhVar2.zzc(), zzajhVar2.zze(), null));
        } else {
            this.zzb.zza(new zzahv(zzajhVar2.zzd(), zzajhVar2.zzb(), Long.valueOf(zzajhVar2.zza()), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
        }
    }
}

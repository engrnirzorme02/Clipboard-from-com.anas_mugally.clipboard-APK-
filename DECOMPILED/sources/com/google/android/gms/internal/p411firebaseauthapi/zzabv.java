package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Objects;
import p192Z3.AbstractC2137o;

/* JADX INFO: loaded from: classes2.dex */
final class zzabv implements zzafv<zzagy> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzabw zzb;

    zzabv(zzabw zzabwVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzabwVar);
        this.zzb = zzabwVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(AbstractC2137o.m8742a(str));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzagy zzagyVar) {
        zzagy zzagyVar2 = zzagyVar;
        this.zzb.zza.zza(new zzahv(zzagyVar2.zzb(), zzagyVar2.zza(), Long.valueOf(zzahx.zza(zzagyVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}

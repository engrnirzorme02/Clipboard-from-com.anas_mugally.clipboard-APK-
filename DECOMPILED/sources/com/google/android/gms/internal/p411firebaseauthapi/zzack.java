package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.firebase.auth.C4833Q;
import java.util.Objects;
import p192Z3.AbstractC2137o;

/* JADX INFO: loaded from: classes2.dex */
final class zzack implements zzafv<zzahv> {
    private final /* synthetic */ C4833Q zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzaar zzc;

    zzack(zzaar zzaarVar, C4833Q c4833q, zzael zzaelVar) {
        this.zza = c4833q;
        this.zzb = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzc = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzb.zza(AbstractC2137o.m8742a(str));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzahv zzahvVar2 = zzahvVar;
        zzail zzailVar = new zzail();
        zzailVar.zzd(zzahvVar2.zzc());
        if (this.zza.m22019V() || this.zza.m22017T() != null) {
            zzailVar.zzb(this.zza.m22017T());
        }
        if (this.zza.zzc() || this.zza.m22018U() != null) {
            zzailVar.zzg(this.zza.zza());
        }
        zzaar.zza(this.zzc, this.zzb, zzahvVar2, zzailVar, this);
    }
}

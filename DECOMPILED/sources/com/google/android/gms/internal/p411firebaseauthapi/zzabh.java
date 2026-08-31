package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Objects;
import p192Z3.AbstractC2137o;

/* JADX INFO: loaded from: classes2.dex */
final class zzabh implements zzafv<zzahv> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzael zze;
    private final /* synthetic */ zzaar zzf;

    zzabh(zzaar zzaarVar, String str, String str2, String str3, String str4, zzael zzaelVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzf = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zze.zza(AbstractC2137o.m8742a(str));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzaar.zza(this.zzf, this.zze, new zzaim(this.zza, this.zzb, null, this.zzc, this.zzd, zzahvVar.zzc()), this);
    }
}

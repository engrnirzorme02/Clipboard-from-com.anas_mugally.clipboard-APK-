package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.List;
import java.util.Objects;
import p192Z3.AbstractC2137o;

/* JADX INFO: loaded from: classes2.dex */
final class zzabp implements zzafv<zzahl> {
    private final /* synthetic */ zzafv zza;
    private final /* synthetic */ zzahv zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzael zzd;
    private final /* synthetic */ zzabq zze;

    zzabp(zzabq zzabqVar, zzafv zzafvVar, zzahv zzahvVar, String str, zzael zzaelVar) {
        this.zza = zzafvVar;
        this.zzb = zzahvVar;
        this.zzc = str;
        this.zzd = zzaelVar;
        Objects.requireNonNull(zzabqVar);
        this.zze = zzabqVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzd.zza(AbstractC2137o.m8742a(str));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahl zzahlVar) {
        List<zzahk> listZza = zzahlVar.zza();
        if (listZza != null && !listZza.isEmpty()) {
            zzahk zzahkVar = listZza.get(0);
            zzail zzailVar = new zzail();
            zzailVar.zzd(this.zzb.zzc()).zza(this.zzc);
            zzaar.zza(this.zze.zza, this.zzd, this.zzb, zzahkVar, zzailVar, this.zza);
            return;
        }
        this.zza.zza("No users.");
    }
}

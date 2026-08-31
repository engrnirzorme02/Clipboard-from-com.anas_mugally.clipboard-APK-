package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaax implements zzafv<zzahl> {
    private final /* synthetic */ zzafs zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzahv zzc;
    private final /* synthetic */ zzail zzd;
    private final /* synthetic */ zzaar zze;

    zzaax(zzaar zzaarVar, zzafs zzafsVar, zzael zzaelVar, zzahv zzahvVar, zzail zzailVar) {
        this.zza = zzafsVar;
        this.zzb = zzaelVar;
        this.zzc = zzahvVar;
        this.zzd = zzailVar;
        Objects.requireNonNull(zzaarVar);
        this.zze = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahl zzahlVar) {
        List<zzahk> listZza = zzahlVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users");
        } else {
            zzaar.zza(this.zze, this.zzb, this.zzc, listZza.get(0), this.zzd, this.zza);
        }
    }
}

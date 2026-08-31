package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcim implements zzexn {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    private final zzcih zzg;

    zzcim(zzcih zzcihVar, Context context, String str) {
        this.zzg = zzcihVar;
        zzhpx zzhpxVarZza = zzhpy.zza(context);
        this.zza = zzhpxVarZza;
        zzhpx zzhpxVarZza2 = zzhpy.zza(str);
        this.zzb = zzhpxVarZza2;
        zzhqg zzhqgVar = zzcihVar.zzbr;
        zzfad zzfadVarZzc = zzfad.zzc(zzhpxVarZza, zzhqgVar, zzcihVar.zzbs);
        this.zzc = zzfadVarZzc;
        zzhqg zzhqgVarZza = zzhpw.zza(zzeyk.zza(zzhqgVar));
        this.zzd = zzhqgVarZza;
        zzhqg zzhqgVar2 = zzcihVar.zza;
        zzhqg zzhqgVar3 = zzcihVar.zzU;
        zzfde zzfdeVarZza = zzfde.zza();
        zzhqg zzhqgVar4 = zzcihVar.zzi;
        zzhqg zzhqgVarZza2 = zzhpw.zza(zzeym.zza(zzhpxVarZza, zzhqgVar2, zzhqgVar3, zzfadVarZzc, zzhqgVarZza, zzfdeVarZza, zzhqgVar4));
        this.zze = zzhqgVarZza2;
        this.zzf = zzhpw.zza(zzeys.zza(zzhqgVar3, zzhpxVarZza, zzhpxVarZza2, zzhqgVarZza2, zzhqgVarZza, zzhqgVar4, zzcihVar.zzl));
    }

    @Override // com.google.android.gms.internal.ads.zzexn
    public final zzeyr zza() {
        return (zzeyr) this.zzf.zzb();
    }
}

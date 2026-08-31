package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcje implements zzfcd {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    final zzhqg zzg;
    final zzhqg zzh;
    private final zzcih zzi;

    zzcje(zzcih zzcihVar, Context context, String str) {
        this.zzi = zzcihVar;
        zzhpx zzhpxVarZza = zzhpy.zza(context);
        this.zza = zzhpxVarZza;
        zzhqg zzhqgVar = zzcihVar.zzbr;
        zzfae zzfaeVarZzc = zzfae.zzc(zzhpxVarZza, zzhqgVar, zzcihVar.zzbs);
        this.zzb = zzfaeVarZzc;
        zzhqg zzhqgVarZza = zzhpw.zza(zzfbo.zza(zzhqgVar));
        this.zzc = zzhqgVarZza;
        zzhqg zzhqgVarZza2 = zzhpw.zza(zzfda.zza());
        this.zzd = zzhqgVarZza2;
        zzhqg zzhqgVarZza3 = zzhpw.zza(zzfbx.zza(zzhpxVarZza, zzcihVar.zza, zzcihVar.zzU, zzfaeVarZzc, zzhqgVarZza, zzfde.zza(), zzhqgVarZza2));
        this.zze = zzhqgVarZza3;
        this.zzf = zzhpw.zza(zzfch.zza(zzhqgVarZza3, zzhqgVarZza, zzhqgVarZza2));
        zzhpx zzhpxVarZzc = zzhpy.zzc(str);
        this.zzg = zzhpxVarZzc;
        this.zzh = zzhpw.zza(zzfcb.zza(zzhpxVarZzc, zzhqgVarZza3, zzhpxVarZza, zzhqgVarZza, zzhqgVarZza2, zzcihVar.zzi, zzcihVar.zzX, zzcihVar.zzl));
    }

    @Override // com.google.android.gms.internal.ads.zzfcd
    public final zzfcg zza() {
        return (zzfcg) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfcd
    public final zzfca zzb() {
        return (zzfca) this.zzh.zzb();
    }
}

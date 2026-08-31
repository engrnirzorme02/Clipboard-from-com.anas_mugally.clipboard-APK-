package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3369m2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjc implements zzfaq {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    final zzhqg zzg;
    private final zzcih zzh;

    zzcjc(zzcih zzcihVar, Context context, String str, C3369m2 c3369m2) {
        this.zzh = zzcihVar;
        zzhpx zzhpxVarZza = zzhpy.zza(context);
        this.zza = zzhpxVarZza;
        zzhpx zzhpxVarZza2 = zzhpy.zza(c3369m2);
        this.zzb = zzhpxVarZza2;
        zzhpx zzhpxVarZza3 = zzhpy.zza(str);
        this.zzc = zzhpxVarZza3;
        zzhqg zzhqgVar = zzcihVar.zzl;
        zzhqg zzhqgVarZza = zzhpw.zza(zzelj.zza(zzhqgVar));
        this.zzd = zzhqgVarZza;
        zzhqg zzhqgVarZza2 = zzhpw.zza(zzfbo.zza(zzcihVar.zzbr));
        this.zze = zzhqgVarZza2;
        zzhqg zzhqgVarZza3 = zzhpw.zza(zzfao.zza(zzhpxVarZza, zzcihVar.zza, zzcihVar.zzU, zzhqgVarZza, zzhqgVarZza2, zzfde.zza()));
        this.zzf = zzhqgVarZza3;
        this.zzg = zzhpw.zza(zzelr.zza(zzhpxVarZza, zzhpxVarZza2, zzhpxVarZza3, zzhqgVarZza3, zzhqgVarZza, zzhqgVarZza2, zzcihVar.zzi, zzcihVar.zzX, zzhqgVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfaq
    public final zzelq zza() {
        return (zzelq) this.zzg.zzb();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3369m2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcir implements zzeza {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    private final Context zzg;
    private final C3369m2 zzh;
    private final String zzi;
    private final zzcih zzj;

    zzcir(zzcih zzcihVar, Context context, String str, C3369m2 c3369m2) {
        this.zzj = zzcihVar;
        this.zzg = context;
        this.zzh = c3369m2;
        this.zzi = str;
        zzhpx zzhpxVarZza = zzhpy.zza(context);
        this.zza = zzhpxVarZza;
        zzhpx zzhpxVarZza2 = zzhpy.zza(c3369m2);
        this.zzb = zzhpxVarZza2;
        zzhqg zzhqgVarZza = zzhpw.zza(zzelj.zza(zzcihVar.zzl));
        this.zzc = zzhqgVarZza;
        zzhqg zzhqgVarZza2 = zzhpw.zza(zzelo.zza());
        this.zzd = zzhqgVarZza2;
        zzhqg zzhqgVarZza3 = zzhpw.zza(zzdba.zza());
        this.zze = zzhqgVarZza3;
        this.zzf = zzhpw.zza(zzeyy.zza(zzhpxVarZza, zzcihVar.zza, zzhpxVarZza2, zzcihVar.zzU, zzhqgVarZza, zzhqgVarZza2, zzfde.zza(), zzhqgVarZza3));
    }

    @Override // com.google.android.gms.internal.ads.zzeza
    public final zzekn zza() {
        zzeyx zzeyxVar = (zzeyx) this.zzf.zzb();
        zzeli zzeliVar = (zzeli) this.zzc.zzb();
        zzcih zzcihVar = this.zzj;
        zzhqg zzhqgVar = zzcihVar.zzl;
        return new zzekn(this.zzg, this.zzh, this.zzi, zzeyxVar, zzeliVar, zzchs.zzd(zzcihVar.zzG()), (zzdsm) zzhqgVar.zzb());
    }
}

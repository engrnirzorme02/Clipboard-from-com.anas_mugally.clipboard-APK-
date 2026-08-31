package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcix implements zzdue {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    private final Context zze;
    private final zzbkl zzf;
    private final zzcih zzg;
    private final zzcix zzh = this;

    zzcix(zzcih zzcihVar, Context context, zzbkl zzbklVar) {
        this.zzg = zzcihVar;
        this.zze = context;
        this.zzf = zzbklVar;
        zzhpx zzhpxVarZza = zzhpy.zza(this);
        this.zza = zzhpxVarZza;
        zzhpx zzhpxVarZza2 = zzhpy.zza(zzbklVar);
        this.zzb = zzhpxVarZza2;
        zzdua zzduaVarZzc = zzdua.zzc(zzhpxVarZza2);
        this.zzc = zzduaVarZzc;
        this.zzd = zzhpw.zza(zzduc.zza(zzhpxVarZza, zzduaVarZzc));
    }

    final zzdtz zza() {
        return zzdua.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdue
    public final zzdub zzb() {
        return (zzdub) this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdue
    public final zzdtw zzc() {
        return new zzciu(this.zzg, this.zzh, null);
    }

    final /* synthetic */ Context zzd() {
        return this.zze;
    }
}

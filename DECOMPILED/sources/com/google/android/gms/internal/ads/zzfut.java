package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfut implements zzfxc {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    private final zzfun zzf;
    private final zzfut zzg = this;

    zzfut(zzfun zzfunVar) {
        this.zzf = zzfunVar;
        zzhqg zzhqgVarZza = zzhpw.zza(zzfxf.zza());
        this.zza = zzhqgVarZza;
        zzhqg zzhqgVarZza2 = zzhpw.zza(zzfyp.zza(zzfunVar.zza, zzfunVar.zzc, zzfunVar.zzC, zzhqgVarZza, zzfunVar.zzF, zzfunVar.zzp, zzfunVar.zzg, zzfys.zza()));
        this.zzb = zzhqgVarZza2;
        zzhqg zzhqgVarZza3 = zzhpw.zza(zzfxk.zza());
        this.zzc = zzhqgVarZza3;
        zzfus zzfusVar = new zzfus(this);
        this.zzd = zzfusVar;
        this.zze = zzhpw.zza(zzfxd.zza(zzfunVar.zzc, zzhqgVarZza2, zzfunVar.zzC, zzfunVar.zzB, zzhqgVarZza3, zzfusVar, zzfunVar.zzg));
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final zzfwn zza() {
        return (zzfwn) this.zze.zzb();
    }

    final /* synthetic */ zzfun zzb() {
        return this.zzf;
    }

    final /* synthetic */ zzfut zzc() {
        return this.zzg;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgxs implements zzgqe {
    final String zza;
    final Class zzb;
    final zzhds zzc;

    zzgxs(String str, Class cls, zzhds zzhdsVar, zzhka zzhkaVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzhdsVar;
    }

    public static zzgqe zzd(String str, Class cls, zzhds zzhdsVar, zzhka zzhkaVar) {
        return new zzgxs(str, cls, zzhdsVar, zzhkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final Object zza(zzhhb zzhhbVar) throws GeneralSecurityException {
        return zzgyl.zza().zzd(zzgyo.zza().zzg(zzgzj.zza(this.zza, zzhhbVar, this.zzc, zzhep.RAW, null), zzgqc.zza()), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final zzhdt zzc(zzhhb zzhhbVar) {
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza(this.zza);
        zzhdvVarZze.zzb(zzhhbVar);
        zzhdvVarZze.zzc(zzhep.RAW);
        zzgzj zzgzjVar = (zzgzj) zzgyo.zza().zzh(zzgyf.zza().zzc(zzgyo.zza().zzj(zzgzk.zzb((zzhdw) zzhdvVarZze.zzbu())), null), zzgzj.class, zzgqc.zza());
        zzhdr zzhdrVarZzd = zzhdt.zzd();
        zzhdrVarZzd.zza(zzgzjVar.zzg());
        zzhdrVarZzd.zzb(zzgzjVar.zzb());
        zzhdrVarZzd.zzc(zzgzjVar.zzc());
        return (zzhdt) zzhdrVarZzd.zzbu();
    }
}

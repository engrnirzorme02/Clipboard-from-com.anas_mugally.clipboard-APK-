package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdhj implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;
    private final zzhqg zzf;

    private zzdhj(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar5;
        this.zzf = zzhqgVar6;
    }

    public static zzdhj zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6) {
        return new zzdhj(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgv zzcgvVar = (zzcgv) this.zza.zzb();
        zzcva zzcvaVarZza = ((zzcvk) this.zzb).zza();
        zzdbs zzdbsVarZza = ((zzdcn) this.zzc).zza();
        zzdgy zzdgyVarZza = ((zzdha) this.zzd).zza();
        zzcyt zzcytVarZzb = ((zzcoj) this.zze).zzb();
        zzehk zzehkVar = (zzehk) this.zzf.zzb();
        zzcpo zzcpoVarZzg = zzcgvVar.zzg();
        zzcpoVarZzg.zzl(zzcvaVarZza.zze());
        zzcpoVarZzg.zzm(zzdbsVarZza);
        zzcpoVarZzg.zzd(zzdgyVarZza);
        zzcpoVarZzg.zzk(new zzejp(null));
        zzcpoVarZzg.zzg(new zzcqk(zzcytVarZzb, null));
        zzcpoVarZzg.zze(new zzcoh(null));
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzec)).booleanValue()) {
            zzcpoVarZzg.zzf(zzeht.zza(zzehkVar));
        }
        zzcqv zzcqvVarZzd = zzcpoVarZzg.zzh().zzd();
        zzhqf.zzb(zzcqvVarZzd);
        return zzcqvVarZzd;
    }
}

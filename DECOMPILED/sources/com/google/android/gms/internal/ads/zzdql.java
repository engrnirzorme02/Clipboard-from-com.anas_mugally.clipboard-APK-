package com.google.android.gms.internal.ads;

import android.content.Context;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdql implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;

    private zzdql(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar5;
    }

    public static zzdql zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        return new zzdql(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzchd) this.zza).zza();
        final String strZzb = ((zzdxu) this.zzb).zzb();
        C7584a c7584aZza = ((zzchs) this.zzc).zza();
        final zzbbn.zza.EnumC7681zza enumC7681zza = (zzbbn.zza.EnumC7681zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbbh zzbbhVar = new zzbbh(new zzbbm(contextZza));
        zzbbn.zzar.zza zzaVarZzs = zzbbn.zzar.zzs();
        zzaVarZzs.zzc(c7584aZza.f30227b);
        zzaVarZzs.zzg(c7584aZza.f30228c);
        zzaVarZzs.zzk(true != c7584aZza.f30229d ? 2 : 0);
        final zzbbn.zzar zzarVarZzbu = zzaVarZzs.zzbu();
        zzbbhVar.zzb(new zzbbg() { // from class: com.google.android.gms.internal.ads.zzdqk
            @Override // com.google.android.gms.internal.ads.zzbbg
            public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar) {
                zzbbn.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbVarZzcc.zzc(enumC7681zza);
                zzaVar.zzaa(zzbVarZzcc);
                zzbbn.zzm.zza zzaVarZzcc = zzaVar.zzG().zzcc();
                zzaVarZzcc.zzd(strZzb);
                zzaVarZzcc.zzs(zzarVarZzbu);
                zzaVar.zzI(zzaVarZzcc);
                zzaVar.zzh(str);
            }
        });
        return zzbbhVar;
    }
}

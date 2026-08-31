package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdrl implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzdrl(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar4;
    }

    public static zzdrl zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzdrl(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton;
        final String strZza = ((zzewz) this.zza).zza();
        Context contextZza = ((zzchd) this.zzb).zza();
        zzgpd zzgpdVarZzc = zzfgc.zzc();
        Map mapZzb = ((zzhqb) this.zzc).zzb();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfD)).booleanValue()) {
            zzbbh zzbbhVar = new zzbbh(new zzbbm(contextZza));
            zzbbhVar.zzb(new zzbbg() { // from class: com.google.android.gms.internal.ads.zzdrm
                @Override // com.google.android.gms.internal.ads.zzbbg
                public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar) {
                    zzaVar.zzh(strZza);
                }
            });
            setSingleton = Collections.singleton(new zzddr(new zzdro(zzbbhVar, mapZzb), zzgpdVarZzc));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        zzhqf.zzb(setSingleton);
        return setSingleton;
    }
}

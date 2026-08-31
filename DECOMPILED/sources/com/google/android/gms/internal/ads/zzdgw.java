package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzdgw implements zzcqv {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhqm zzd;
    private final zzdje zze;

    zzdgw(Map map, Map map2, Map map3, zzhqm zzhqmVar, zzdje zzdjeVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhqmVar;
        this.zze = zzdjeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final zzedz zza(int i7, String str) {
        zzedz zzedzVarZza;
        zzedz zzedzVar = (zzedz) this.zza.get(str);
        if (zzedzVar != null) {
            return zzedzVar;
        }
        if (i7 != 1) {
            if (i7 != 4) {
                return null;
            }
            zzegf zzegfVar = (zzegf) this.zzc.get(str);
            if (zzegfVar != null) {
                return zzcra.zza(zzegfVar);
            }
            zzedzVarZza = (zzedz) this.zzb.get(str);
            if (zzedzVarZza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zzedzVarZza = ((zzcqv) this.zzd.zzb()).zza(i7, str)) == null) {
            return null;
        }
        return zzcra.zzb(zzedzVarZza);
    }
}

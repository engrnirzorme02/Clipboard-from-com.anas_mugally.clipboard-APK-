package com.google.android.gms.internal.ads;

import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezs implements zzfab {
    private final zzfab zza;
    private zzcuz zzb;

    public zzezs(zzfab zzfabVar) {
        this.zza = zzfabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcuz zzd() {
        return this.zzb;
    }

    public final synchronized InterfaceFutureC1673e zzb(zzfac zzfacVar, zzfaa zzfaaVar, zzcuz zzcuzVar) {
        zzbuv zzbuvVar;
        this.zzb = zzcuzVar;
        if (zzcuzVar == null || (zzbuvVar = zzfacVar.zza) == null) {
            return ((zzezr) this.zza).zzb(zzfacVar, zzfaaVar, zzcuzVar);
        }
        zzcrw zzcrwVarZza = zzcuzVar.zza();
        return zzcrwVarZza.zzc(zzcrwVarZza.zza(zzgot.zza(zzbuvVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ InterfaceFutureC1673e zzc(zzfac zzfacVar, zzfaa zzfaaVar, Object obj) {
        return zzb(zzfacVar, zzfaaVar, null);
    }
}

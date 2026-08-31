package com.google.android.gms.internal.ads;

import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezr implements zzfab {
    private zzcuz zza;

    @Override // com.google.android.gms.internal.ads.zzfab
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcuz zzd() {
        return this.zza;
    }

    public final synchronized InterfaceFutureC1673e zzb(zzfac zzfacVar, zzfaa zzfaaVar, zzcuz zzcuzVar) {
        zzcrw zzcrwVarZza;
        try {
            if (zzcuzVar != null) {
                this.zza = zzcuzVar;
            } else {
                this.zza = (zzcuz) zzfaaVar.zza(zzfacVar.zzb).zzh();
            }
            zzcrwVarZza = this.zza.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zzcrwVarZza.zzc(zzcrwVarZza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfab
    public final /* bridge */ /* synthetic */ InterfaceFutureC1673e zzc(zzfac zzfacVar, zzfaa zzfaaVar, Object obj) {
        return zzb(zzfacVar, zzfaaVar, null);
    }
}

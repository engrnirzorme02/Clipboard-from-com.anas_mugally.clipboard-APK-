package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegx extends zzegz {
    private final zzcgv zza;
    private final zzdgy zzb;
    private final zzcva zzc;
    private final zzdbs zzd;
    private final zzehk zze;
    private final zzeee zzf;

    public zzegx(zzcgv zzcgvVar, zzdgy zzdgyVar, zzcva zzcvaVar, zzdbs zzdbsVar, zzehk zzehkVar, zzeee zzeeeVar) {
        this.zza = zzcgvVar;
        this.zzb = zzdgyVar;
        this.zzc = zzcvaVar;
        this.zzd = zzdbsVar;
        this.zze = zzehkVar;
        this.zzf = zzeeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    protected final InterfaceFutureC1673e zzc(zzfdc zzfdcVar, Bundle bundle, zzfcj zzfcjVar, zzfcu zzfcuVar) {
        zzcva zzcvaVar = this.zzc;
        zzcvaVar.zzb(zzfdcVar);
        zzcvaVar.zzc(bundle);
        zzcvaVar.zzd(new zzcut(zzfcuVar, zzfcjVar, this.zze));
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdZ)).booleanValue()) {
            zzcvaVar.zzg(this.zzf);
        }
        zzdhc zzdhcVarZzm = this.zza.zzm();
        zzdhcVarZzm.zzf(zzcvaVar.zze());
        zzdhcVarZzm.zzg(this.zzd);
        zzdhcVarZzm.zze(this.zzb);
        zzdhcVarZzm.zzd(new zzcoh(null));
        zzcrw zzcrwVarZza = zzdhcVarZzm.zzh().zza();
        return zzcrwVarZza.zzc(zzcrwVarZza.zzb());
    }
}

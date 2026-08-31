package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.C3250D;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzehc extends zzegz {
    private final zzcgv zza;
    private final zzcva zzb;
    private final zzejp zzc;
    private final zzdbs zzd;
    private final zzdgy zze;
    private final zzcyt zzf;
    private final ViewGroup zzg;
    private final zzday zzh;
    private final zzehk zzi;
    private final zzeee zzj;

    public zzehc(zzcgv zzcgvVar, zzcva zzcvaVar, zzejp zzejpVar, zzdbs zzdbsVar, zzdgy zzdgyVar, zzcyt zzcytVar, ViewGroup viewGroup, zzday zzdayVar, zzehk zzehkVar, zzeee zzeeeVar) {
        this.zza = zzcgvVar;
        this.zzb = zzcvaVar;
        this.zzc = zzejpVar;
        this.zzd = zzdbsVar;
        this.zze = zzdgyVar;
        this.zzf = zzcytVar;
        this.zzg = viewGroup;
        this.zzh = zzdayVar;
        this.zzi = zzehkVar;
        this.zzj = zzeeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    protected final InterfaceFutureC1673e zzc(zzfdc zzfdcVar, Bundle bundle, zzfcj zzfcjVar, zzfcu zzfcuVar) {
        zzcva zzcvaVar = this.zzb;
        zzcvaVar.zzb(zzfdcVar);
        zzcvaVar.zzc(bundle);
        zzcvaVar.zzd(new zzcut(zzfcuVar, zzfcjVar, this.zzi));
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdZ)).booleanValue()) {
            zzcvaVar.zzg(this.zzj);
        }
        zzcpo zzcpoVarZzg = this.zza.zzg();
        zzcpoVarZzg.zzl(zzcvaVar.zze());
        zzcpoVarZzg.zzm(this.zzd);
        zzcpoVarZzg.zzk(this.zzc);
        zzcpoVarZzg.zzd(this.zze);
        zzcpoVarZzg.zzg(new zzcqk(this.zzf, this.zzh));
        zzcpoVarZzg.zze(new zzcoh(this.zzg));
        zzcrw zzcrwVarZzc = zzcpoVarZzg.zzh().zzc();
        return zzcrwVarZzc.zzc(zzcrwVarZzc.zzb());
    }
}

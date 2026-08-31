package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdnq implements zzgoq {
    final /* synthetic */ zzfcj zza;
    final /* synthetic */ zzfcm zzb;
    final /* synthetic */ zzcmi zzc;
    final /* synthetic */ zzdnx zzd;

    zzdnq(zzdnx zzdnxVar, zzfcj zzfcjVar, zzfcm zzfcmVar, zzcmi zzcmiVar) {
        this.zza = zzfcjVar;
        this.zzb = zzfcmVar;
        this.zzc = zzcmiVar;
        Objects.requireNonNull(zzdnxVar);
        this.zzd = zzdnxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcek zzcekVar = (zzcek) obj;
        zzfcj zzfcjVar = this.zza;
        zzcekVar.zzaD(zzfcjVar, this.zzb);
        zzcgi zzcgiVarZzP = zzcekVar.zzP();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkU)).booleanValue() && zzcgiVarZzP != null) {
            zzcmi zzcmiVar = this.zzc;
            zzdnx zzdnxVar = this.zzd;
            zzcgiVarZzP.zzd(zzcmiVar, zzdnxVar.zzm(), zzdnxVar.zzn());
            zzcgiVarZzP.zze(zzcmiVar, zzdnxVar.zzm(), zzdnxVar.zzl());
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zznQ)).booleanValue() || zzcgiVarZzP == null) {
            return;
        }
        zzcgiVarZzP.zzb(zzfcjVar);
    }
}

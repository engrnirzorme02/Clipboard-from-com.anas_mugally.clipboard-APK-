package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
final class zzdyd implements zzgoq {
    final /* synthetic */ zzdyg zza;

    zzdyd(zzdyg zzdygVar) {
        Objects.requireNonNull(zzdygVar);
        this.zza = zzdygVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgF)).booleanValue()) {
            Matcher matcher = zzdyg.zzh.matcher(th.getMessage());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                zzdyg zzdygVar = this.zza;
                zzdygVar.zzc().zzc(Integer.parseInt(strGroup));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcu zzfcuVar = (zzfcu) obj;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgF)).booleanValue()) {
            zzdyg zzdygVar = this.zza;
            zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
            zzdygVar.zzc().zzc(zzfcmVar.zzf);
            zzdygVar.zzc().zze(zzfcmVar.zzg);
        }
    }
}

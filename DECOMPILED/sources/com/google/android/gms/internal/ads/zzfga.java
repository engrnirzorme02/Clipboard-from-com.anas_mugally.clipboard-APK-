package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfga implements zzhpx {
    public static zzfga zza() {
        return zzffz.zza;
    }

    public static zzgpd zzc() {
        zzgpd zzgpdVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgj)).booleanValue()) {
            zzgpdVar = zzbzh.zzc;
        } else {
            zzgpdVar = ((Boolean) C3250D.m17200c().zzd(zzbci.zzgi)).booleanValue() ? zzbzh.zza : zzbzh.zzf;
        }
        zzhqf.zzb(zzgpdVar);
        return zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}

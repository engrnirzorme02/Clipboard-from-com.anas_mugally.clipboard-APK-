package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcoz implements zzhpx {
    private final zzhqg zza;

    private zzcoz(zzcor zzcorVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzcoz zza(zzcor zzcorVar, zzhqg zzhqgVar) {
        return new zzcoz(zzcorVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgke zzgkeVarZzi = ((Boolean) C3250D.m17200c().zzd(zzbci.zznt)).booleanValue() ? zzgke.zzi(new zzddr(((zzcqd) this.zza).zzb(), zzbzh.zza)) : zzgke.zzh();
        zzhqf.zzb(zzgkeVarZzi);
        return zzgkeVarZzi;
    }
}

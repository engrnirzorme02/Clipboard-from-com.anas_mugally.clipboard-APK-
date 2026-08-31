package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdqw implements zzhpx {
    private final zzhqg zza;

    private zzdqw(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzdqw zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdqw(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgpd zzgpdVarZzc = zzfgc.zzc();
        Set setSingleton = ((Boolean) C3250D.m17200c().zzd(zzbci.zzfD)).booleanValue() ? Collections.singleton(new zzddr(((zzdrp) this.zza).zzb(), zzgpdVarZzc)) : Collections.EMPTY_SET;
        zzhqf.zzb(setSingleton);
        return setSingleton;
    }
}

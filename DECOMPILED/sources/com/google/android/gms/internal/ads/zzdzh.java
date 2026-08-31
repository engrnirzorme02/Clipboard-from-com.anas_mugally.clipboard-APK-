package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Map;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdzh implements zzdzj {
    private final Map zza;
    private final zzgpd zzb;
    private final zzcyw zzc;

    public zzdzh(Map map, zzgpd zzgpdVar, zzcyw zzcywVar) {
        this.zza = map;
        this.zzb = zzgpdVar;
        this.zzc = zzcywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdzj
    public final InterfaceFutureC1673e zza(final zzbuv zzbuvVar) {
        this.zzc.zzdT(zzbuvVar);
        InterfaceFutureC1673e interfaceFutureC1673eZzc = zzgot.zzc(new zzdwz(3));
        for (String str : ((String) C3250D.m17200c().zzd(zzbci.zziW)).split(",")) {
            final zzhqm zzhqmVar = (zzhqm) this.zza.get(str.trim());
            if (zzhqmVar != null) {
                interfaceFutureC1673eZzc = zzgot.zzh(interfaceFutureC1673eZzc, zzdwz.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdzg
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                        return ((zzdzj) zzhqmVar.zzb()).zza(zzbuvVar);
                    }
                }, this.zzb);
            }
        }
        zzgot.zzq(interfaceFutureC1673eZzc, new zzdzf(this), zzbzh.zzg);
        return interfaceFutureC1673eZzc;
    }

    final /* synthetic */ zzcyw zzb() {
        return this.zzc;
    }
}

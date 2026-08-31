package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewk implements zzeup {
    public zzewk(zzbyk zzbykVar, zzgpd zzgpdVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        final InterfaceFutureC1673e interfaceFutureC1673eZza = zzgot.zza(null);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgn)).booleanValue()) {
            interfaceFutureC1673eZza = zzgot.zza(null);
        }
        final InterfaceFutureC1673e interfaceFutureC1673eZza2 = zzgot.zza(null);
        return zzgot.zzn(interfaceFutureC1673eZza, interfaceFutureC1673eZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzewl((String) interfaceFutureC1673eZza.get(), (String) interfaceFutureC1673eZza2.get());
            }
        }, zzbzh.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 47;
    }
}

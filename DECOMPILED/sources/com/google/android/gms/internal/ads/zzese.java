package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzese implements zzeup {
    private final zzgpd zza;
    private final zzdvs zzb;

    zzese(zzgpd zzgpdVar, zzdvs zzdvsVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzesd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 23;
    }

    final /* synthetic */ zzesf zzc() {
        zzdvs zzdvsVar = this.zzb;
        return new zzesf(zzdvsVar.zzg(), zzdvsVar.zzd(), C7351t.m32361s().m17596k(), zzdvsVar.zzq(), zzdvsVar.zzm());
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewo implements zzeup {
    final zzgpd zza;
    final List zzb;

    public zzewo(zzbbs zzbbsVar, zzgpd zzgpdVar, List list) {
        this.zza = zzgpdVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzewn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzewp(this.zza.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 48;
    }
}

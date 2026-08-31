package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import p036E2.AbstractC0335c;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzert implements zzeup {
    private final zzgpd zza;
    private final zzfdc zzb;

    zzert(zzgpd zzgpdVar, zzfdc zzfdcVar) {
        this.zza = zzgpdVar;
        this.zzb = zzfdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzers
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 21;
    }

    final /* synthetic */ zzeru zzc() {
        return new zzeru("requester_type_2".equals(AbstractC0335c.m1521c(this.zzb.zzd)));
    }
}

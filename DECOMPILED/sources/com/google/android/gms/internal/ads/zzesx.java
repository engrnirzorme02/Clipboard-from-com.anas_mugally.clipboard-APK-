package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesx implements zzeup {
    private final zzgpd zza;
    private final zzdtp zzb;

    zzesx(zzgpd zzgpdVar, zzdtp zzdtpVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzesw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 62;
    }

    final /* synthetic */ zzesy zzc() {
        return new zzesy(this.zzb.zzb());
    }
}

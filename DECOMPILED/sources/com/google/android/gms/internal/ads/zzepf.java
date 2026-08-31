package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepf implements zzeup {
    private final zzgpd zza;

    zzepf(zzgpd zzgpdVar) {
        this.zza = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zza.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzepe
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzepg(C7351t.m32357o().mo18159a() - C7351t.m32354l().zzo().zzi().zzb());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 55;
    }
}

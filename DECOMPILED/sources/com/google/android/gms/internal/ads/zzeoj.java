package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeoj implements zzeup {
    private final zzgpd zza;
    private final C7584a zzb;

    zzeoj(C7584a c7584a, zzgpd zzgpdVar) {
        this.zzb = c7584a;
        this.zza = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 54;
    }

    final /* synthetic */ zzeok zzc() {
        return zzeok.zzc(this.zzb);
    }
}

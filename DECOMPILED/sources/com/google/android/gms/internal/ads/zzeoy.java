package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.AbstractC3765t;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeoy implements zzeup {
    private final zzezj zza;

    zzeoy(zzezj zzezjVar) {
        this.zza = zzezjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        zzezj zzezjVar = this.zza;
        if (zzezjVar == null) {
            return zzgot.zza(new zzeox(null));
        }
        String strZza = zzezjVar.zza();
        return AbstractC3765t.m18209b(strZza) ? zzgot.zza(new zzeox(null)) : zzgot.zza(new zzeox(strZza));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 15;
    }
}

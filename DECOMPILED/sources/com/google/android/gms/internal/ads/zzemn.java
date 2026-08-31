package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.InterfaceC3750e;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemn implements zzeup {
    private final InterfaceC3750e zza;
    private final zzfdc zzb;

    zzemn(InterfaceC3750e interfaceC3750e, zzfdc zzfdcVar) {
        this.zza = interfaceC3750e;
        this.zzb = zzfdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return zzgot.zza(new zzemo(this.zzb, this.zza.mo18159a()));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 4;
    }
}

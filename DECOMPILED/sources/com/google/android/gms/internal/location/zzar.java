package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C3610l;
import com.google.android.gms.location.AbstractBinderC3985x;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes2.dex */
final class zzar extends AbstractBinderC3985x {
    private final C3610l zza;

    zzar(C3610l c3610l) {
        this.zza = c3610l;
    }

    public final synchronized void zzc() {
        this.zza.m17926a();
    }

    @Override // com.google.android.gms.location.InterfaceC3987z
    public final void zzd(LocationResult locationResult) {
        this.zza.m17928c(new zzap(this, locationResult));
    }

    @Override // com.google.android.gms.location.InterfaceC3987z
    public final void zze(LocationAvailability locationAvailability) {
        this.zza.m17928c(new zzaq(this, locationAvailability));
    }
}

package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C3610l;
import com.google.android.gms.location.AbstractBinderC3937B;

/* JADX INFO: loaded from: classes2.dex */
final class zzau extends AbstractBinderC3937B {
    private final C3610l zza;

    zzau(C3610l c3610l) {
        this.zza = c3610l;
    }

    public final synchronized void zzc() {
        this.zza.m17926a();
    }

    @Override // com.google.android.gms.location.InterfaceC3938C
    public final synchronized void zzd(Location location) {
        this.zza.m17928c(new zzat(this, location));
    }
}

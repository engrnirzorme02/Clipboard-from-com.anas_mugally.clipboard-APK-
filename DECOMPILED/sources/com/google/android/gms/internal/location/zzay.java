package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.InterfaceC3596e;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.location.C3974m;

/* JADX INFO: loaded from: classes2.dex */
final class zzay extends zzan {
    private InterfaceC3596e zza;

    public zzay(InterfaceC3596e interfaceC3596e) {
        AbstractC3718s.m18073b(interfaceC3596e != null, "listener can't be null.");
        this.zza = interfaceC3596e;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(C3974m c3974m) {
        this.zza.setResult(c3974m);
        this.zza = null;
    }
}

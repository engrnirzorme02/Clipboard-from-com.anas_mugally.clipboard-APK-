package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.AbstractBinderC3371n0;
import p324p2.InterfaceC6738e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayx extends AbstractBinderC3371n0 {
    private final InterfaceC6738e zza;

    public zzayx(InterfaceC6738e interfaceC6738e) {
        this.zza = interfaceC6738e;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3375o0
    public final void zzb(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }

    public final InterfaceC6738e zzc() {
        return this.zza;
    }
}

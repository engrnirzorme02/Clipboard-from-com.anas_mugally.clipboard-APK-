package com.google.android.gms.internal.ads;

import android.view.View;
import p380w2.InterfaceC7338g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejs implements InterfaceC7338g {
    private InterfaceC7338g zza;

    @Override // p380w2.InterfaceC7338g
    public final synchronized void zza(View view) {
        InterfaceC7338g interfaceC7338g = this.zza;
        if (interfaceC7338g != null) {
            interfaceC7338g.zza(view);
        }
    }

    @Override // p380w2.InterfaceC7338g
    public final synchronized void zzb() {
        InterfaceC7338g interfaceC7338g = this.zza;
        if (interfaceC7338g != null) {
            interfaceC7338g.zzb();
        }
    }

    @Override // p380w2.InterfaceC7338g
    public final synchronized void zzc() {
        InterfaceC7338g interfaceC7338g = this.zza;
        if (interfaceC7338g != null) {
            interfaceC7338g.zzc();
        }
    }

    public final synchronized void zzd(InterfaceC7338g interfaceC7338g) {
        this.zza = interfaceC7338g;
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.InterfaceC3262H;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzelm implements InterfaceC3318a, zzddz {
    private InterfaceC3262H zza;

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final synchronized void onAdClicked() {
        InterfaceC3262H interfaceC3262H = this.zza;
        if (interfaceC3262H != null) {
            try {
                interfaceC3262H.zzb();
            } catch (RemoteException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33332g("Remote Exception at onAdClicked.", e7);
            }
        }
    }

    public final synchronized void zza(InterfaceC3262H interfaceC3262H) {
        this.zza = interfaceC3262H;
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final synchronized void zzdV() {
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final synchronized void zzdz() {
        InterfaceC3262H interfaceC3262H = this.zza;
        if (interfaceC3262H != null) {
            try {
                interfaceC3262H.zzb();
            } catch (RemoteException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33332g("Remote Exception at onPhysicalClick.", e7);
            }
        }
    }
}

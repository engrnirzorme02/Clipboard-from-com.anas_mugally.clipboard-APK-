package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.InterfaceC3331d0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;
import p068I2.InterfaceC0606a;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzfcf implements InterfaceC0606a {
    final /* synthetic */ InterfaceC3331d0 zza;
    final /* synthetic */ zzfcg zzb;

    zzfcf(zzfcg zzfcgVar, InterfaceC3331d0 interfaceC3331d0) {
        this.zza = interfaceC3331d0;
        Objects.requireNonNull(zzfcgVar);
        this.zzb = zzfcgVar;
    }

    @Override // p068I2.InterfaceC0606a
    public final void onAdMetadataChanged() {
        if (this.zzb.zzw() != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            }
        }
    }
}

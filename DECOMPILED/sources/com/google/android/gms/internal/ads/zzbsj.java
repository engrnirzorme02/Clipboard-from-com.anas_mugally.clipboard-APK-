package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.InterfaceC3522c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsj {
    private final InterfaceC3522c.c zza;
    private final InterfaceC3522c.b zzb;
    private InterfaceC3522c zzc;

    public zzbsj(InterfaceC3522c.c cVar, InterfaceC3522c.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC3522c zzc(zzbgq zzbgqVar) {
        InterfaceC3522c interfaceC3522c = this.zzc;
        if (interfaceC3522c != null) {
            return interfaceC3522c;
        }
        zzbsk zzbskVar = new zzbsk(zzbgqVar);
        this.zzc = zzbskVar;
        return zzbskVar;
    }

    public final zzbhd zza() {
        return new zzbsi(this, null);
    }

    public final zzbha zzb() {
        return null;
    }

    final /* synthetic */ InterfaceC3522c.c zzd() {
        return null;
    }

    final /* synthetic */ InterfaceC3522c.b zze() {
        return null;
    }
}

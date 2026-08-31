package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import p396y2.InterfaceC7516d;
import p396y2.InterfaceC7536x;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdoa extends zzdnl implements zzddz {
    private zzddz zza;

    @Override // com.google.android.gms.internal.ads.zzddz
    public final synchronized void zzdV() {
        zzddz zzddzVar = this.zza;
        if (zzddzVar != null) {
            zzddzVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final synchronized void zzdz() {
        zzddz zzddzVar = this.zza;
        if (zzddzVar != null) {
            zzddzVar.zzdz();
        }
    }

    protected final synchronized void zzn(InterfaceC3318a interfaceC3318a, zzbib zzbibVar, InterfaceC7536x interfaceC7536x, zzbid zzbidVar, InterfaceC7516d interfaceC7516d, zzddz zzddzVar) throws Throwable {
        try {
            try {
                super.zzm(interfaceC3318a, zzbibVar, interfaceC7536x, zzbidVar, interfaceC7516d);
                this.zza = zzddzVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}

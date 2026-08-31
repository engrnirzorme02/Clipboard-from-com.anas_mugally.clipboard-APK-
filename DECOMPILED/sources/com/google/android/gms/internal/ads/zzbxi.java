package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
final class zzbxi {
    private final InterfaceC3494q0 zza;

    zzbxi(InterfaceC3750e interfaceC3750e, InterfaceC3494q0 interfaceC3494q0, zzbxr zzbxrVar) {
        this.zza = interfaceC3494q0;
    }

    public final void zza(int i7, long j7) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaJ)).booleanValue()) {
            return;
        }
        InterfaceC3494q0 interfaceC3494q0 = this.zza;
        if (j7 - interfaceC3494q0.zzF() < 0) {
            AbstractC3490o0.m17545k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaK)).booleanValue()) {
            interfaceC3494q0.mo17556i(i7);
            interfaceC3494q0.mo17554g(j7);
        } else {
            interfaceC3494q0.mo17556i(-1);
            interfaceC3494q0.mo17554g(j7);
        }
    }
}

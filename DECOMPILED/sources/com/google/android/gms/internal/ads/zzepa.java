package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.InterfaceC3750e;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzepa {
    public final InterfaceFutureC1673e zza;
    private final long zzb;
    private final InterfaceC3750e zzc;

    public zzepa(InterfaceFutureC1673e interfaceFutureC1673e, long j7, InterfaceC3750e interfaceC3750e) {
        this.zza = interfaceFutureC1673e;
        this.zzc = interfaceC3750e;
        this.zzb = interfaceC3750e.mo18161c() + j7;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.mo18161c();
    }
}

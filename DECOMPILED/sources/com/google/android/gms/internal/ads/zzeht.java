package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeht {
    private zzehk zza;

    zzeht() {
    }

    public static zzeht zza(zzehk zzehkVar) {
        return new zzeht(zzehkVar);
    }

    public final zzehk zzb(InterfaceC3750e interfaceC3750e, zzehm zzehmVar, zzeee zzeeeVar, zzfjv zzfjvVar) {
        zzehk zzehkVar = this.zza;
        return zzehkVar != null ? zzehkVar : new zzehk(interfaceC3750e, zzehmVar, zzeeeVar, zzfjvVar);
    }

    private zzeht(zzehk zzehkVar) {
        this.zza = zzehkVar;
    }
}

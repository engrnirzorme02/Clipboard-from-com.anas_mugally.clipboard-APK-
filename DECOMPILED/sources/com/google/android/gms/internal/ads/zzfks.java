package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfks {
    private final Object zza;
    private final long zzb;
    private final InterfaceC3750e zzc;
    private final long zzd = ((Long) C3250D.m17200c().zzd(zzbci.zzG)).longValue() * 1000;

    public zzfks(Object obj, InterfaceC3750e interfaceC3750e) {
        this.zza = obj;
        this.zzc = interfaceC3750e;
        this.zzb = interfaceC3750e.mo18159a();
    }

    public final Object zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zzc.mo18159a() >= this.zzb + this.zzd;
    }

    public final long zzc() {
        return (this.zzd + Math.min(Math.max(((Long) C3250D.m17200c().zzd(zzbci.zzB)).longValue(), -900000L), 10000L)) - (this.zzc.mo18159a() - this.zzb);
    }

    public final long zzd() {
        return this.zzb;
    }
}

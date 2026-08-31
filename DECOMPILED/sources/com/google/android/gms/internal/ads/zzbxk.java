package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3302U1;
import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbxk {
    private final InterfaceC3750e zza;
    private final zzbxi zzb;

    zzbxk(InterfaceC3750e interfaceC3750e, zzbxi zzbxiVar) {
        this.zza = interfaceC3750e;
        this.zzb = zzbxiVar;
    }

    public static zzbxk zza(Context context) {
        return zzbxs.zzb(context).zza();
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.mo18159a());
    }

    public final void zzc(C3302U1 c3302u1) {
        this.zzb.zza(-1, this.zza.mo18159a());
    }

    public final void zzd(int i7, long j7) {
        this.zzb.zza(i7, j7);
    }
}

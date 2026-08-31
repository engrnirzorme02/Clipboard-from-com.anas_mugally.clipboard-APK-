package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcsu implements zzdbn, zzcxg {
    private final InterfaceC3750e zza;
    private final zzcsw zzb;
    private final zzfdc zzc;
    private final String zzd;

    zzcsu(InterfaceC3750e interfaceC3750e, zzcsw zzcswVar, zzfdc zzfdcVar, String str) {
        this.zza = interfaceC3750e;
        this.zzb = zzcswVar;
        this.zzc = zzfdcVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdbn
    public final void zza() {
        this.zzb.zzd(this.zzd, this.zza.mo18161c());
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        InterfaceC3750e interfaceC3750e = this.zza;
        this.zzb.zze(this.zzc.zzg, this.zzd, interfaceC3750e.mo18161c());
    }
}

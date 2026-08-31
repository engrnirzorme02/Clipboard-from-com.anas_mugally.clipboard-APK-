package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.InterfaceC3318a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcss implements InterfaceC3318a {
    private final zzcsw zza;
    private final zzfdc zzb;

    zzcss(zzcsw zzcswVar, zzfdc zzfdcVar) {
        this.zza = zzcswVar;
        this.zzb = zzfdcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import p076J2.AbstractC0680b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwt extends zzbwg {
    private final AbstractC0680b zza;
    private final zzbwu zzb;

    public zzbwt(AbstractC0680b abstractC0680b, zzbwu zzbwuVar) {
        this.zza = abstractC0680b;
        this.zzb = zzbwuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zze() {
        zzbwu zzbwuVar;
        AbstractC0680b abstractC0680b = this.zza;
        if (abstractC0680b == null || (zzbwuVar = this.zzb) == null) {
            return;
        }
        abstractC0680b.onAdLoaded(zzbwuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(C3324b1 c3324b1) {
        AbstractC0680b abstractC0680b = this.zza;
        if (abstractC0680b != null) {
            abstractC0680b.onAdFailedToLoad(c3324b1.m17221U());
        }
    }
}

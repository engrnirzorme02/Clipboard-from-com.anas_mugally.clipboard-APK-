package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import p068I2.AbstractC0608c;
import p068I2.AbstractC0609d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwn extends zzbwg {
    private final AbstractC0609d zza;
    private final AbstractC0608c zzb;

    public zzbwn(AbstractC0609d abstractC0609d, AbstractC0608c abstractC0608c) {
        this.zza = abstractC0609d;
        this.zzb = abstractC0608c;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zze() {
        AbstractC0609d abstractC0609d = this.zza;
        if (abstractC0609d != null) {
            abstractC0609d.onAdLoaded(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(C3324b1 c3324b1) {
        AbstractC0609d abstractC0609d = this.zza;
        if (abstractC0609d != null) {
            abstractC0609d.onAdFailedToLoad(c3324b1.m17221U());
        }
    }
}

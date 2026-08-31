package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import p332q2.AbstractC6824a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazw extends zzbad {
    private final AbstractC6824a.a zza;
    private final String zzb;

    public zzazw(AbstractC6824a.a aVar, String str) {
        this.zza = aVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzb(zzbab zzbabVar) {
        AbstractC6824a.a aVar = this.zza;
        if (aVar != null) {
            aVar.onAdLoaded(new zzazx(zzbabVar, this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzc(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzd(C3324b1 c3324b1) {
        AbstractC6824a.a aVar = this.zza;
        if (aVar != null) {
            aVar.onAdFailedToLoad(c3324b1.m17221U());
        }
    }
}

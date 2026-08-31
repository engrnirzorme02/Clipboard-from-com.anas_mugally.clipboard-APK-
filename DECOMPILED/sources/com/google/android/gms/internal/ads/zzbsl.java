package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsl extends zzbhj {
    private final NativeAd.InterfaceC3518c zza;

    public zzbsl(NativeAd.InterfaceC3518c interfaceC3518c) {
        this.zza = interfaceC3518c;
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void zze(zzbhq zzbhqVar) {
        this.zza.onNativeAdLoaded(new zzbsg(zzbhqVar));
    }
}

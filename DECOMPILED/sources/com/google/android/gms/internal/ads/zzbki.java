package com.google.android.gms.internal.ads;

import p348s2.InterfaceC7004b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbki extends zzbkk {
    private final InterfaceC7004b zza;

    public zzbki(InterfaceC7004b interfaceC7004b) {
        this.zza = interfaceC7004b;
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}

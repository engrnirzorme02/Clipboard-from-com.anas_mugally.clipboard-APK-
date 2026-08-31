package com.google.android.gms.internal.ads;

import p068I2.InterfaceC0607b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwr extends zzbvw {
    private final String zza;
    private final int zzb;

    public zzbwr(InterfaceC0607b interfaceC0607b) {
        this(interfaceC0607b != null ? interfaceC0607b.getType() : "", interfaceC0607b != null ? interfaceC0607b.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final int zzf() {
        return this.zzb;
    }

    public zzbwr(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }
}

package com.google.android.gms.internal.ads;

import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzetm implements zzeup {
    private final String zza;
    private final int zzb;

    zzetm(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return zzgot.zza(new zzetn(this.zza, this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 31;
    }
}

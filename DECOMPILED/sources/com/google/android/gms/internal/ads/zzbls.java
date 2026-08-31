package com.google.android.gms.internal.ads;

import p372v2.EnumC7224a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbls {
    private final EnumC7224a zza;
    private final String zzb;
    private final int zzc;

    public zzbls(EnumC7224a enumC7224a, String str, int i7) {
        this.zza = enumC7224a;
        this.zzb = str;
        this.zzc = i7;
    }

    public final String getDescription() {
        return this.zzb;
    }

    public final EnumC7224a getInitializationState() {
        return this.zza;
    }

    public final int getLatency() {
        return this.zzc;
    }
}

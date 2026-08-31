package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhqi {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzhqi(int i7, int i8, zzhqh zzhqhVar) {
        this.zza = zzhpu.zza(i7);
        this.zzb = zzhpu.zza(i8);
    }

    public final zzhqi zza(zzhqg zzhqgVar) {
        this.zza.add(zzhqgVar);
        return this;
    }

    public final zzhqi zzb(zzhqg zzhqgVar) {
        this.zzb.add(zzhqgVar);
        return this;
    }

    public final zzhqj zzc() {
        return new zzhqj(this.zza, this.zzb, null);
    }
}

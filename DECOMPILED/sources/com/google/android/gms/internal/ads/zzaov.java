package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaov {
    private int zza = 2500;
    private int zzb;

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final void zzc(zzapq zzapqVar) throws zzapq {
        int i7 = this.zzb + 1;
        this.zzb = i7;
        int i8 = this.zza;
        this.zza = i8 + i8;
        if (i7 > 1) {
            throw zzapqVar;
        }
    }
}

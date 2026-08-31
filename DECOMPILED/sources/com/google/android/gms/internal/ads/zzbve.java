package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC3714q;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbve extends zzbvg {
    private final String zza;
    private final int zzb;

    public zzbve(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbve)) {
            return false;
        }
        zzbve zzbveVar = (zzbve) obj;
        if (AbstractC3714q.m18053b(this.zza, zzbveVar.zza)) {
            if (AbstractC3714q.m18053b(Integer.valueOf(this.zzb), Integer.valueOf(zzbveVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final int zzc() {
        return this.zzb;
    }
}

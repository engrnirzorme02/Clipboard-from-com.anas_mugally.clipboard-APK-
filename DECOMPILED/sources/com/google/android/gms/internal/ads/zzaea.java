package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaea {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzaea(int i7, byte[] bArr, int i8, int i9) {
        this.zza = i7;
        this.zzb = bArr;
        this.zzc = i8;
        this.zzd = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaea.class == obj.getClass()) {
            zzaea zzaeaVar = (zzaea) obj;
            if (this.zza == zzaeaVar.zza && this.zzc == zzaeaVar.zzc && this.zzd == zzaeaVar.zzd && Arrays.equals(this.zzb, zzaeaVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}

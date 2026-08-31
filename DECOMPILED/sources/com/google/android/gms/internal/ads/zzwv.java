package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwv {
    public final long zza;
    public final long zzb;

    public zzwv(long j7, long j8) {
        this.zza = j7;
        this.zzb = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwv)) {
            return false;
        }
        zzwv zzwvVar = (zzwv) obj;
        return this.zza == zzwvVar.zza && this.zzb == zzwvVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}

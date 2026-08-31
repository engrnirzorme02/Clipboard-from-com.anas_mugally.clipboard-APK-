package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhhq {
    private final Object zza;
    private final int zzb;

    zzhhq(Object obj, int i7) {
        this.zza = obj;
        this.zzb = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhq)) {
            return false;
        }
        zzhhq zzhhqVar = (zzhhq) obj;
        return this.zza == zzhhqVar.zza && this.zzb == zzhhqVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}

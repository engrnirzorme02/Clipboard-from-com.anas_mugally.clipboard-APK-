package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzvr {
    public final int zza;
    public final boolean zzb;

    public zzvr(int i7, boolean z7) {
        this.zza = i7;
        this.zzb = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvr.class == obj.getClass()) {
            zzvr zzvrVar = (zzvr) obj;
            if (this.zza == zzvrVar.zza && this.zzb == zzvrVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}

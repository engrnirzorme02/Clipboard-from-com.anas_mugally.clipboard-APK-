package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazq {
    final long zza;
    final String zzb;
    final int zzc;

    zzazq(long j7, String str, int i7) {
        this.zza = j7;
        this.zzb = str;
        this.zzc = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzazq)) {
            return false;
        }
        zzazq zzazqVar = (zzazq) obj;
        return zzazqVar.zza == this.zza && zzazqVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}

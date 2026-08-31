package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class zzgls extends zzglj implements Serializable {
    final zzglj zza;

    zzgls(zzglj zzgljVar) {
        this.zza = zzgljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzglj, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgls) {
            return this.zza.equals(((zzgls) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}

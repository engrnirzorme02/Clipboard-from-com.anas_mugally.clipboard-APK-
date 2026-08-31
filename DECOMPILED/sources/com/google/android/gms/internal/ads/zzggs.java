package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzggs<E> implements Serializable, zzggr {
    private final Object zza;

    zzggs(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final E apply(Object obj) {
        return (E) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final boolean equals(Object obj) {
        if (obj instanceof zzggs) {
            return Objects.equals(this.zza, ((zzggs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
        sb.append("Functions.constant(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}

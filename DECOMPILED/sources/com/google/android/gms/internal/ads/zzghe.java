package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzghe implements Serializable, zzghd {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzghe) {
            return this.zza.equals(((zzghe) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z7 = true;
        for (Object obj : this.zza) {
            if (!z7) {
                sb.append(',');
            }
            sb.append(obj);
            z7 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzghd
    public final boolean zza(Object obj) {
        int i7 = 0;
        while (true) {
            List list = this.zza;
            if (i7 >= list.size()) {
                return true;
            }
            if (!((zzghd) list.get(i7)).zza(obj)) {
                return false;
            }
            i7++;
        }
    }
}

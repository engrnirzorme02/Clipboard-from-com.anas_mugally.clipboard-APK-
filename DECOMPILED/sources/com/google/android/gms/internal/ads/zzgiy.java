package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgiy extends zzglj implements Serializable {
    final zzggr zza;
    final zzglj zzb;

    zzgiy(zzggr zzggrVar, zzglj zzgljVar) {
        this.zza = zzggrVar;
        this.zzb = zzgljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzglj, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzggr zzggrVar = this.zza;
        return this.zzb.compare(zzggrVar.apply(obj), zzggrVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgiy) {
            zzgiy zzgiyVar = (zzgiy) obj;
            if (this.zza.equals(zzgiyVar.zza) && this.zzb.equals(zzgiyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        int length = string.length();
        String string2 = this.zza.toString();
        StringBuilder sb = new StringBuilder(length + 12 + string2.length() + 1);
        sb.append(string);
        sb.append(".onResultOf(");
        sb.append(string2);
        sb.append(")");
        return sb.toString();
    }
}

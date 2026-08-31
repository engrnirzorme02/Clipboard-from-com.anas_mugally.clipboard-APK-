package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgzp {
    private final Class zza;
    private final zzhgg zzb;

    /* synthetic */ zzgzp(Class cls, zzhgg zzhggVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zzhggVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgzp)) {
            return false;
        }
        zzgzp zzgzpVar = (zzgzp) obj;
        return zzgzpVar.zza.equals(this.zza) && zzgzpVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzhgg zzhggVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String strValueOf = String.valueOf(zzhggVar);
        StringBuilder sb = new StringBuilder(simpleName.length() + 21 + strValueOf.length());
        sb.append(simpleName);
        sb.append(", object identifier: ");
        sb.append(strValueOf);
        return sb.toString();
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadt {
    public final zzadw zza;
    public final zzadw zzb;

    public zzadt(zzadw zzadwVar, zzadw zzadwVar2) {
        this.zza = zzadwVar;
        this.zzb = zzadwVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadt.class == obj.getClass()) {
            zzadt zzadtVar = (zzadt) obj;
            if (this.zza.equals(zzadtVar.zza) && this.zzb.equals(zzadtVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzadw zzadwVar = this.zza;
        zzadw zzadwVar2 = this.zzb;
        String string = zzadwVar.toString();
        String strConcat = zzadwVar.equals(zzadwVar2) ? "" : ", ".concat(zzadwVar2.toString());
        StringBuilder sb = new StringBuilder(string.length() + 1 + strConcat.length() + 1);
        sb.append("[");
        sb.append(string);
        sb.append(strConcat);
        sb.append("]");
        return sb.toString();
    }
}

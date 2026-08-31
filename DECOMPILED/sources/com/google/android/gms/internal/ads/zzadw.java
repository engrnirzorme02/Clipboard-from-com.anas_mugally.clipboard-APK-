package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadw {
    public static final zzadw zza = new zzadw(0, 0);
    public final long zzb;
    public final long zzc;

    public zzadw(long j7, long j8) {
        this.zzb = j7;
        this.zzc = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadw.class == obj.getClass()) {
            zzadw zzadwVar = (zzadw) obj;
            if (this.zzb == zzadwVar.zzb && this.zzc == zzadwVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j7 = this.zzb;
        int length = String.valueOf(j7).length();
        long j8 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j8).length() + 1);
        sb.append("[timeUs=");
        sb.append(j7);
        sb.append(", position=");
        sb.append(j8);
        sb.append("]");
        return sb.toString();
    }
}

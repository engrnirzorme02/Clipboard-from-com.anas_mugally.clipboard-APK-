package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzex implements zzan {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzex(long j7, long j8, long j9) {
        this.zza = j7;
        this.zzb = j8;
        this.zzc = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzex)) {
            return false;
        }
        zzex zzexVar = (zzex) obj;
        return this.zza == zzexVar.zza && this.zzb == zzexVar.zzb && this.zzc == zzexVar.zzc;
    }

    public final int hashCode() {
        return ((((Long.hashCode(this.zza) + 527) * 31) + Long.hashCode(this.zzb)) * 31) + Long.hashCode(this.zzc);
    }

    public final String toString() {
        long j7 = this.zza;
        int length = String.valueOf(j7).length();
        long j8 = this.zzb;
        int length2 = String.valueOf(j8).length();
        long j9 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j9).length());
        sb.append("Mp4Timestamp: creation time=");
        sb.append(j7);
        sb.append(", modification time=");
        sb.append(j8);
        sb.append(", timescale=");
        sb.append(j9);
        return sb.toString();
    }
}

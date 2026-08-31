package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzago implements zzan {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzago(long j7, long j8, long j9, long j10, long j11) {
        this.zza = j7;
        this.zzb = j8;
        this.zzc = j9;
        this.zzd = j10;
        this.zze = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzago.class == obj.getClass()) {
            zzago zzagoVar = (zzago) obj;
            if (this.zza == zzagoVar.zza && this.zzb == zzagoVar.zzb && this.zzc == zzagoVar.zzc && this.zzd == zzagoVar.zzd && this.zze == zzagoVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Long.hashCode(this.zza) + 527) * 31) + Long.hashCode(this.zzb)) * 31) + Long.hashCode(this.zzc)) * 31) + Long.hashCode(this.zzd)) * 31) + Long.hashCode(this.zze);
    }

    public final String toString() {
        long j7 = this.zza;
        int length = String.valueOf(j7).length();
        long j8 = this.zzb;
        int length2 = String.valueOf(j8).length();
        long j9 = this.zzc;
        int length3 = String.valueOf(j9).length();
        long j10 = this.zzd;
        int length4 = String.valueOf(j10).length();
        long j11 = this.zze;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j11).length());
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j7);
        sb.append(", photoSize=");
        sb.append(j8);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j9);
        sb.append(", videoStartPosition=");
        sb.append(j10);
        sb.append(", videoSize=");
        sb.append(j11);
        return sb.toString();
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlt {
    public static final zzlt zza;
    public static final zzlt zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzlt zzltVar = new zzlt(0L, 0L);
        zza = zzltVar;
        new zzlt(Long.MAX_VALUE, Long.MAX_VALUE);
        new zzlt(Long.MAX_VALUE, 0L);
        new zzlt(0L, Long.MAX_VALUE);
        zzb = zzltVar;
    }

    public zzlt(long j7, long j8) {
        zzghc.zza(j7 >= 0);
        zzghc.zza(j8 >= 0);
        this.zzc = j7;
        this.zzd = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlt.class == obj.getClass()) {
            zzlt zzltVar = (zzlt) obj;
            if (this.zzc == zzltVar.zzc && this.zzd == zzltVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}

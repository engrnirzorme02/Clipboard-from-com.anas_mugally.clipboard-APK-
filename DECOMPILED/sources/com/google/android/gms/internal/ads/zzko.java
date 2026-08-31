package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzko {
    public final zzup zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;

    zzko(zzup zzupVar, long j7, long j8, long j9, long j10, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        boolean z12 = true;
        zzghc.zza(!z11 || z9);
        if (z10 && !z9) {
            z12 = false;
        }
        zzghc.zza(z12);
        this.zza = zzupVar;
        this.zzb = j7;
        this.zzc = j8;
        this.zzd = j9;
        this.zze = j10;
        this.zzf = false;
        this.zzg = false;
        this.zzh = z9;
        this.zzi = z10;
        this.zzj = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzko.class == obj.getClass()) {
            zzko zzkoVar = (zzko) obj;
            if (this.zzb == zzkoVar.zzb && this.zzc == zzkoVar.zzc && this.zzd == zzkoVar.zzd && this.zze == zzkoVar.zze && this.zzh == zzkoVar.zzh && this.zzi == zzkoVar.zzi && this.zzj == zzkoVar.zzj && Objects.equals(this.zza, zzkoVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        long j7 = this.zze;
        long j8 = this.zzd;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j8)) * 31) + ((int) j7)) * 29791) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0);
    }

    public final zzko zza(long j7) {
        return j7 == this.zzb ? this : new zzko(this.zza, j7, this.zzc, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    public final zzko zzb(long j7) {
        return j7 == this.zzc ? this : new zzko(this.zza, this.zzb, j7, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzme {
    public final long zza;
    public final zzbe zzb;
    public final int zzc;
    public final zzup zzd;
    public final long zze;
    public final zzbe zzf;
    public final int zzg;
    public final zzup zzh;
    public final long zzi;
    public final long zzj;

    public zzme(long j7, zzbe zzbeVar, int i7, zzup zzupVar, long j8, zzbe zzbeVar2, int i8, zzup zzupVar2, long j9, long j10) {
        this.zza = j7;
        this.zzb = zzbeVar;
        this.zzc = i7;
        this.zzd = zzupVar;
        this.zze = j8;
        this.zzf = zzbeVar2;
        this.zzg = i8;
        this.zzh = zzupVar2;
        this.zzi = j9;
        this.zzj = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzme.class == obj.getClass()) {
            zzme zzmeVar = (zzme) obj;
            if (this.zza == zzmeVar.zza && this.zzc == zzmeVar.zzc && this.zze == zzmeVar.zze && this.zzg == zzmeVar.zzg && this.zzi == zzmeVar.zzi && this.zzj == zzmeVar.zzj && Objects.equals(this.zzb, zzmeVar.zzb) && Objects.equals(this.zzd, zzmeVar.zzd) && Objects.equals(this.zzf, zzmeVar.zzf) && Objects.equals(this.zzh, zzmeVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj));
    }
}

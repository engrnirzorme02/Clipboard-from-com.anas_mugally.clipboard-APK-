package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbc {
    public Object zza;
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzb zzg = zzb.zza;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbc.class.equals(obj.getClass())) {
            zzbc zzbcVar = (zzbc) obj;
            if (Objects.equals(this.zza, zzbcVar.zza) && Objects.equals(this.zzb, zzbcVar.zzb) && this.zzc == zzbcVar.zzc && this.zzd == zzbcVar.zzd && this.zzf == zzbcVar.zzf && Objects.equals(this.zzg, zzbcVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j7 = this.zzd;
        return (((((iHashCode2 * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31) + this.zzg.hashCode();
    }

    public final zzbc zza(Object obj, Object obj2, int i7, long j7, long j8, zzb zzbVar, boolean z7) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i7;
        this.zzd = j7;
        this.zze = 0L;
        this.zzg = zzbVar;
        this.zzf = z7;
        return this;
    }

    public final int zzb() {
        int i7 = this.zzg.zzb;
        return 0;
    }

    public final long zzc(int i7) {
        long j7 = this.zzg.zza(i7).zza;
        return 0L;
    }

    public final int zzd(int i7) {
        return this.zzg.zza(i7).zza(-1);
    }

    public final int zze(long j7) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zzf(long j7) {
        return -1;
    }

    public final int zzg(int i7) {
        return this.zzg.zza(i7).zzb;
    }

    public final long zzh(int i7, int i8) {
        zza zzaVarZza = this.zzg.zza(i7);
        if (zzaVarZza.zzb != -1) {
            return zzaVarZza.zzf[i8];
        }
        return -9223372036854775807L;
    }

    public final boolean zzi(int i7) {
        zzb();
        if (i7 != -1) {
            return false;
        }
        this.zzg.zzb(-1);
        return false;
    }

    public final long zzj() {
        long j7 = this.zzg.zzc;
        return 0L;
    }

    public final boolean zzk(int i7) {
        boolean z7 = this.zzg.zza(i7).zzi;
        return false;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzacg {
    protected final zzaca zza;
    protected final zzacf zzb;
    protected zzacc zzc;
    private final int zzd;

    protected zzacg(zzacd zzacdVar, zzacf zzacfVar, long j7, long j8, long j9, long j10, long j11, long j12, int i7) {
        this.zzb = zzacfVar;
        this.zzd = i7;
        this.zza = new zzaca(zzacdVar, j7, 0L, j9, j10, j11, j12);
    }

    protected static final int zzf(zzacv zzacvVar, long j7, zzads zzadsVar) {
        if (j7 == zzacvVar.zzn()) {
            return 0;
        }
        zzadsVar.zza = j7;
        return 1;
    }

    protected static final boolean zzg(zzacv zzacvVar, long j7) {
        long jZzn = j7 - zzacvVar.zzn();
        if (jZzn < 0 || jZzn > 262144) {
            return false;
        }
        zzacvVar.zzf((int) jZzn);
        return true;
    }

    public final zzadv zza() {
        return this.zza;
    }

    public final void zzb(long j7) {
        zzacc zzaccVar = this.zzc;
        if (zzaccVar == null || zzaccVar.zze() != j7) {
            zzaca zzacaVar = this.zza;
            this.zzc = new zzacc(j7, zzacaVar.zzd(j7), 0L, zzacaVar.zze(), zzacaVar.zzf(), zzacaVar.zzg(), zzacaVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzacv zzacvVar, zzads zzadsVar) {
        while (true) {
            zzacc zzaccVar = this.zzc;
            zzaccVar.getClass();
            long jZzb = zzaccVar.zzb();
            long jZzc = zzaccVar.zzc();
            long jZzh = zzaccVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzacvVar, jZzb, zzadsVar);
            }
            if (!zzg(zzacvVar, jZzh)) {
                return zzf(zzacvVar, jZzh, zzadsVar);
            }
            zzacvVar.zzl();
            zzace zzaceVarZza = this.zzb.zza(zzacvVar, zzaccVar.zzd());
            int iZzd = zzaceVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzacvVar, jZzh, zzadsVar);
            }
            if (iZzd == -2) {
                zzaccVar.zzf(zzaceVarZza.zze(), zzaceVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzacvVar, zzaceVarZza.zzf());
                    zze(true, zzaceVarZza.zzf());
                    return zzf(zzacvVar, zzaceVarZza.zzf(), zzadsVar);
                }
                zzaccVar.zzg(zzaceVarZza.zze(), zzaceVarZza.zzf());
            }
        }
    }

    protected final void zze(boolean z7, long j7) {
        this.zzc = null;
        this.zzb.zzb();
    }
}

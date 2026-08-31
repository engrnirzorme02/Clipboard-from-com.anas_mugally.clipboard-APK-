package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaba {
    private final zzaau zza;
    private final zzaav zzf;
    private long zzk;
    private final zzzu zzl;
    private final zzaas zzb = new zzaas();
    private final zzek zzc = new zzek(10);
    private final zzek zzd = new zzek(10);
    private final zzdu zze = new zzdu(16);
    private long zzg = -9223372036854775807L;
    private zzbu zzj = zzbu.zza;
    private long zzh = -9223372036854775807L;
    private long zzi = -9223372036854775807L;

    public zzaba(zzzu zzzuVar, zzaau zzaauVar, zzaav zzaavVar) {
        this.zzl = zzzuVar;
        this.zza = zzaauVar;
        this.zzf = zzaavVar;
    }

    private static Object zzh(zzek zzekVar) {
        zzghc.zza(zzekVar.zzc() > 0);
        while (zzekVar.zzc() > 1) {
            zzekVar.zzd();
        }
        Object objZzd = zzekVar.zzd();
        objZzd.getClass();
        return objZzd;
    }

    public final void zza() {
        this.zze.zze();
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = -9223372036854775807L;
        zzek zzekVar = this.zzd;
        if (zzekVar.zzc() > 0) {
            this.zzk = ((Long) zzh(zzekVar)).longValue();
        }
        zzek zzekVar2 = this.zzc;
        if (zzekVar2.zzc() > 0) {
            zzekVar2.zza(0L, (zzbu) zzh(zzekVar2));
        }
    }

    public final void zzb(long j7, long j8) {
        while (true) {
            zzdu zzduVar = this.zze;
            if (zzduVar.zzd()) {
                return;
            }
            zzek zzekVar = this.zzd;
            long jZzc = zzduVar.zzc();
            Long l7 = (Long) zzekVar.zze(jZzc);
            if (l7 != null && l7.longValue() != this.zzk) {
                this.zzk = l7.longValue();
                this.zza.zza(2);
            }
            zzaau zzaauVar = this.zza;
            long j9 = this.zzk;
            zzaas zzaasVar = this.zzb;
            int iZzk = zzaauVar.zzk(jZzc, j7, j8, j9, false, false, zzaasVar);
            if (iZzk != 5 && iZzk != 4) {
                this.zzf.zza(jZzc, zzaasVar.zza());
            }
            if (iZzk == 0 || iZzk == 1) {
                this.zzh = jZzc;
                long jZzb = zzduVar.zzb();
                zzbu zzbuVar = (zzbu) this.zzc.zze(jZzb);
                if (zzbuVar != null && !zzbuVar.equals(zzbu.zza) && !zzbuVar.equals(this.zzj)) {
                    this.zzj = zzbuVar;
                    this.zzl.zza(zzbuVar);
                }
                this.zzl.zzb(iZzk == 0 ? System.nanoTime() : zzaasVar.zzb(), jZzb, zzaauVar.zzf());
            } else if (iZzk == 2 || iZzk == 3) {
                this.zzh = jZzc;
                zzduVar.zzb();
                final zzzu zzzuVar = this.zzl;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzzs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzzuVar.zza.zzB().zzc();
                    }
                };
                zzzv zzzvVar = zzzuVar.zza;
                zzzvVar.zzC().execute(runnable);
                ((zzabp) zzzvVar.zzz().remove()).zzb();
            } else if (iZzk != 4) {
                return;
            } else {
                this.zzh = jZzc;
            }
        }
    }

    public final void zzc(int i7, int i8) {
        long j7 = this.zzg;
        this.zzc.zza(j7 == -9223372036854775807L ? 0L : j7 + 1, new zzbu(i7, i8, 1.0f));
    }

    public final void zzd(int i7, long j7) {
        if (this.zze.zzd()) {
            this.zza.zza(i7);
            this.zzk = j7;
        } else {
            zzek zzekVar = this.zzd;
            long j8 = this.zzg;
            zzekVar.zza(j8 == -9223372036854775807L ? -4611686018427387904L : j8 + 1, Long.valueOf(j7));
        }
    }

    public final void zze(long j7) {
        this.zze.zza(j7);
        this.zzg = j7;
        this.zzi = -9223372036854775807L;
    }

    public final void zzf() {
        long j7 = this.zzg;
        if (j7 == -9223372036854775807L) {
            j7 = Long.MIN_VALUE;
            this.zzg = Long.MIN_VALUE;
            this.zzh = Long.MIN_VALUE;
        }
        this.zzi = j7;
    }

    public final boolean zzg() {
        long j7 = this.zzi;
        return j7 != -9223372036854775807L && this.zzh == j7;
    }
}

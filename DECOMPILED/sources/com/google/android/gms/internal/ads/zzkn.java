package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzkn {
    public final zzun zza;
    public final Object zzb;
    public final zzwf[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzko zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzln[] zzj;
    private final zzym zzk;
    private final zzlc zzl;
    private zzkn zzm;
    private zzwq zzn;
    private zzyn zzo;
    private long zzp;

    public zzkn(zzln[] zzlnVarArr, long j7, zzym zzymVar, zzyv zzyvVar, zzlc zzlcVar, zzko zzkoVar, zzyn zzynVar, long j8) {
        this.zzj = zzlnVarArr;
        this.zzp = j7;
        this.zzk = zzymVar;
        this.zzl = zzlcVar;
        zzup zzupVar = zzkoVar.zza;
        this.zzb = zzupVar.zza;
        this.zzg = zzkoVar;
        this.zzn = zzwq.zza;
        this.zzo = zzynVar;
        this.zzc = new zzwf[2];
        this.zzi = new boolean[2];
        long j9 = zzkoVar.zzb;
        long j10 = zzkoVar.zzd;
        zzun zzunVarZzp = zzlcVar.zzp(zzupVar, zzyvVar, j9);
        this.zza = j10 != -9223372036854775807L ? new zztt(zzunVarZzp, true, 0L, j10) : zzunVarZzp;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i7 = 0;
        while (true) {
            zzyn zzynVar = this.zzo;
            if (i7 >= zzynVar.zza) {
                return;
            }
            zzynVar.zza(i7);
            zzyf zzyfVar = this.zzo.zzc[i7];
            i7++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i7 = 0;
        while (true) {
            zzyn zzynVar = this.zzo;
            if (i7 >= zzynVar.zza) {
                return;
            }
            zzynVar.zza(i7);
            zzyf zzyfVar = this.zzo.zzc[i7];
            i7++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j7) {
        this.zzp = j7;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return jZzi == Long.MIN_VALUE ? this.zzg.zze : jZzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final void zzh(float f7, zzbe zzbeVar, boolean z7) {
        this.zze = true;
        this.zzn = this.zza.zzd();
        zzyn zzynVarZzk = zzk(f7, zzbeVar, z7);
        zzko zzkoVar = this.zzg;
        long jMax = zzkoVar.zzb;
        long j7 = zzkoVar.zze;
        if (j7 != -9223372036854775807L && jMax >= j7) {
            jMax = Math.max(0L, j7 - 1);
        }
        long jZzl = zzl(zzynVarZzk, jMax, false);
        long j8 = this.zzp;
        zzko zzkoVar2 = this.zzg;
        this.zzp = j8 + (zzkoVar2.zzb - jZzl);
        this.zzg = zzkoVar2.zza(jZzl);
    }

    public final void zzi(long j7) {
        zzghc.zzh(zzw());
        if (this.zze) {
            this.zza.zzg(j7 - this.zzp);
        }
    }

    public final void zzj(zzkl zzklVar) {
        zzghc.zzh(zzw());
        this.zza.zzm(zzklVar);
    }

    public final zzyn zzk(float f7, zzbe zzbeVar, boolean z7) {
        zzwq zzwqVar = this.zzn;
        zzup zzupVar = this.zzg.zza;
        zzym zzymVar = this.zzk;
        zzln[] zzlnVarArr = this.zzj;
        zzyn zzynVarZzq = zzymVar.zzq(zzlnVarArr, zzwqVar, zzupVar, zzbeVar);
        for (int i7 = 0; i7 < zzynVarZzq.zza; i7++) {
            boolean z8 = true;
            if (zzynVarZzq.zza(i7)) {
                if (zzynVarZzq.zzc[i7] == null) {
                    zzlnVarArr[i7].zza();
                    z8 = false;
                }
                zzghc.zzh(z8);
            } else {
                zzghc.zzh(zzynVarZzq.zzc[i7] == null);
            }
        }
        for (zzyf zzyfVar : zzynVarZzq.zzc) {
        }
        return zzynVarZzq;
    }

    public final long zzl(zzyn zzynVar, long j7, boolean z7) {
        return zzm(zzynVar, j7, false, new boolean[2]);
    }

    public final long zzm(zzyn zzynVar, long j7, boolean z7, boolean[] zArr) {
        zzln[] zzlnVarArr;
        int i7 = 0;
        while (true) {
            boolean z8 = true;
            if (i7 >= zzynVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z7 || !zzynVar.zzb(this.zzo, i7)) {
                z8 = false;
            }
            zArr2[i7] = z8;
            i7++;
        }
        int i8 = 0;
        while (true) {
            zzlnVarArr = this.zzj;
            if (i8 >= 2) {
                break;
            }
            zzlnVarArr[i8].zza();
            i8++;
        }
        zzv();
        this.zzo = zzynVar;
        zzu();
        zzun zzunVar = this.zza;
        zzyf[] zzyfVarArr = zzynVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzwf[] zzwfVarArr = this.zzc;
        long jZze = zzunVar.zze(zzyfVarArr, zArr3, zzwfVarArr, zArr, j7);
        for (int i9 = 0; i9 < 2; i9++) {
            zzlnVarArr[i9].zza();
        }
        this.zzf = false;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzwfVarArr[i10] != null) {
                zzghc.zzh(zzynVar.zza(i10));
                zzlnVarArr[i10].zza();
                this.zzf = true;
            } else {
                zzghc.zzh(zzyfVarArr[i10] == null);
            }
        }
        return jZze;
    }

    public final void zzn() {
        zzv();
        zzun zzunVar = this.zza;
        try {
            boolean z7 = zzunVar instanceof zztt;
            zzlc zzlcVar = this.zzl;
            if (z7) {
                zzlcVar.zze(((zztt) zzunVar).zza);
            } else {
                zzlcVar.zze(zzunVar);
            }
        } catch (RuntimeException e7) {
            zzds.zzf("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    public final void zzo(zzkn zzknVar) {
        if (zzknVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzknVar;
        zzu();
    }

    public final zzkn zzp() {
        return this.zzm;
    }

    public final zzwq zzq() {
        return this.zzn;
    }

    public final zzyn zzr() {
        return this.zzo;
    }

    public final void zzs() {
        zzun zzunVar = this.zza;
        if (zzunVar instanceof zztt) {
            long j7 = this.zzg.zzd;
            if (j7 == -9223372036854775807L) {
                j7 = Long.MIN_VALUE;
            }
            ((zztt) zzunVar).zza(0L, j7);
        }
    }

    public final void zzt(zzum zzumVar, long j7) {
        this.zzd = true;
        this.zza.zzb(zzumVar, j7);
    }
}

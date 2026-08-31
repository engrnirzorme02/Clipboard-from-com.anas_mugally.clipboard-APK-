package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zztt implements zzun, zzum {
    public final zzun zza;
    long zzb;
    private zzum zzc;
    private zzts[] zzd = new zzts[0];
    private long zze = 0;

    public zztt(zzun zzunVar, boolean z7, long j7, long j8) {
        this.zza = zzunVar;
        this.zzb = j8;
    }

    private static long zzq(long j7, long j8, long j9) {
        long jMax = Math.max(j7, j8);
        return j9 != Long.MIN_VALUE ? Math.min(jMax, j9) : jMax;
    }

    public final void zza(long j7, long j8) {
        this.zzb = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j7) {
        this.zzc = zzumVar;
        this.zza.zzb(this, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzc() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzwq zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zze(zzyf[] zzyfVarArr, boolean[] zArr, zzwf[] zzwfVarArr, boolean[] zArr2, long j7) {
        int length = zzwfVarArr.length;
        this.zzd = new zzts[length];
        zzwf[] zzwfVarArr2 = new zzwf[length];
        int i7 = 0;
        while (true) {
            zzwf zzwfVar = null;
            if (i7 >= zzwfVarArr.length) {
                break;
            }
            zzts[] zztsVarArr = this.zzd;
            zzts zztsVar = (zzts) zzwfVarArr[i7];
            zztsVarArr[i7] = zztsVar;
            if (zztsVar != null) {
                zzwfVar = zztsVar.zza;
            }
            zzwfVarArr2[i7] = zzwfVar;
            i7++;
        }
        long jZze = this.zza.zze(zzyfVarArr, zArr, zzwfVarArr2, zArr2, j7);
        long jZzq = zzq(jZze, j7, this.zzb);
        long j8 = -9223372036854775807L;
        if (zzo()) {
            if (jZze < j7) {
                j8 = jZzq;
                break;
            }
            if (jZze != 0) {
                for (zzyf zzyfVar : zzyfVarArr) {
                    if (zzyfVar != null) {
                        zzu zzuVarZzc = zzyfVar.zzc();
                        if (!zzar.zzd(zzuVarZzc.zzo, zzuVarZzc.zzk)) {
                            j8 = jZzq;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j8;
        for (int i8 = 0; i8 < zzwfVarArr.length; i8++) {
            zzwf zzwfVar2 = zzwfVarArr2[i8];
            if (zzwfVar2 == null) {
                this.zzd[i8] = null;
            } else {
                zzts[] zztsVarArr2 = this.zzd;
                zzts zztsVar2 = zztsVarArr2[i8];
                if (zztsVar2 == null || zztsVar2.zza != zzwfVar2) {
                    zztsVarArr2[i8] = new zzts(this, zzwfVar2);
                }
            }
            zzwfVarArr[i8] = this.zzd[i8];
        }
        return jZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j7, boolean z7) {
        this.zza.zzf(j7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j7) {
        this.zza.zzg(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        if (zzo()) {
            long j7 = this.zze;
            this.zze = -9223372036854775807L;
            long jZzh = zzh();
            return jZzh != -9223372036854775807L ? jZzh : j7;
        }
        long jZzh2 = this.zza.zzh();
        if (jZzh2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzq(jZzh2, 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi != Long.MIN_VALUE) {
            long j7 = this.zzb;
            if (j7 == Long.MIN_VALUE || jZzi < j7) {
                return jZzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j7) {
        this.zze = -9223372036854775807L;
        for (zzts zztsVar : this.zzd) {
            if (zztsVar != null) {
                zztsVar.zza();
            }
        }
        return zzq(this.zza.zzj(j7), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzk(long j7, zzlt zzltVar) {
        if (j7 == 0) {
            return 0L;
        }
        long j8 = zzltVar.zzc;
        String str = zzeo.zza;
        long jMax = Math.max(0L, Math.min(j8, j7));
        long j9 = zzltVar.zzd;
        long j10 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j9, j10 == Long.MIN_VALUE ? Long.MAX_VALUE : j10 - j7));
        if (jMax != j8 || jMax2 != j9) {
            zzltVar = new zzlt(jMax, jMax2);
        }
        return this.zza.zzk(j7, zzltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl != Long.MIN_VALUE) {
            long j7 = this.zzb;
            if (j7 == Long.MIN_VALUE || jZzl < j7) {
                return jZzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        return this.zza.zzm(zzklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zza.zzn();
    }

    final boolean zzo() {
        return this.zze != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzun zzunVar) {
        zzum zzumVar = this.zzc;
        zzumVar.getClass();
        zzumVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final /* bridge */ /* synthetic */ void zzs(zzwh zzwhVar) {
        zzum zzumVar = this.zzc;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzwn implements zzun, zzum {
    private final zzun zza;
    private final long zzb;
    private zzum zzc;

    public zzwn(zzun zzunVar, long j7) {
        this.zza = zzunVar;
        this.zzb = j7;
    }

    public final zzun zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j7) {
        this.zzc = zzumVar;
        this.zza.zzb(this, j7 - this.zzb);
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
        zzwf[] zzwfVarArr2 = new zzwf[zzwfVarArr.length];
        int i7 = 0;
        while (true) {
            zzwf zzwfVarZza = null;
            if (i7 >= zzwfVarArr.length) {
                break;
            }
            zzwm zzwmVar = (zzwm) zzwfVarArr[i7];
            if (zzwmVar != null) {
                zzwfVarZza = zzwmVar.zza();
            }
            zzwfVarArr2[i7] = zzwfVarZza;
            i7++;
        }
        zzun zzunVar = this.zza;
        long j8 = this.zzb;
        long jZze = zzunVar.zze(zzyfVarArr, zArr, zzwfVarArr2, zArr2, j7 - j8);
        for (int i8 = 0; i8 < zzwfVarArr.length; i8++) {
            zzwf zzwfVar = zzwfVarArr2[i8];
            if (zzwfVar == null) {
                zzwfVarArr[i8] = null;
            } else {
                zzwf zzwfVar2 = zzwfVarArr[i8];
                if (zzwfVar2 == null || ((zzwm) zzwfVar2).zza() != zzwfVar) {
                    zzwfVarArr[i8] = new zzwm(zzwfVar, j8);
                }
            }
        }
        return jZze + j8;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j7, boolean z7) {
        this.zza.zzf(j7 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j7) {
        this.zza.zzg(j7 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        long jZzh = this.zza.zzh();
        if (jZzh == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzi + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j7) {
        long j8 = this.zzb;
        return this.zza.zzj(j7 - j8) + j8;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzk(long j7, zzlt zzltVar) {
        long j8 = this.zzb;
        return this.zza.zzk(j7 - j8, zzltVar) + j8;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzl + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        long j7 = zzklVar.zza;
        long j8 = this.zzb;
        zzkk zzkkVarZza = zzklVar.zza();
        zzkkVarZza.zza(j7 - j8);
        return this.zza.zzm(zzkkVarZza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zza.zzn();
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

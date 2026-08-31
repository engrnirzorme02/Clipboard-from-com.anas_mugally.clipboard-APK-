package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuh implements zzun, zzum {
    public final zzup zza;
    private final long zzb;
    private zzur zzc;
    private zzun zzd;
    private zzum zze;
    private long zzf = -9223372036854775807L;
    private final zzyv zzg;

    public zzuh(zzup zzupVar, zzyv zzyvVar, long j7) {
        this.zza = zzupVar;
        this.zzg = zzyvVar;
        this.zzb = j7;
    }

    private final long zzv(long j7) {
        long j8 = this.zzf;
        return j8 != -9223372036854775807L ? j8 : j7;
    }

    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j7) {
        this.zze = zzumVar;
        zzun zzunVar = this.zzd;
        if (zzunVar != null) {
            zzunVar.zzb(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzc() {
        zzun zzunVar = this.zzd;
        if (zzunVar != null) {
            zzunVar.zzc();
            return;
        }
        zzur zzurVar = this.zzc;
        if (zzurVar != null) {
            zzurVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzwq zzd() {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zze(zzyf[] zzyfVarArr, boolean[] zArr, zzwf[] zzwfVarArr, boolean[] zArr2, long j7) {
        long j8 = this.zzf;
        long j9 = (j8 == -9223372036854775807L || j7 != this.zzb) ? j7 : j8;
        this.zzf = -9223372036854775807L;
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zze(zzyfVarArr, zArr, zzwfVarArr, zArr2, j9);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j7, boolean z7) {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        zzunVar.zzf(j7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j7) {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        zzunVar.zzg(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j7) {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zzj(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzk(long j7, zzlt zzltVar) {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zzk(j7, zzltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        zzun zzunVar = this.zzd;
        return zzunVar != null && zzunVar.zzm(zzklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        zzun zzunVar = this.zzd;
        return zzunVar != null && zzunVar.zzn();
    }

    public final void zzo(long j7) {
        this.zzf = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzun zzunVar) {
        zzum zzumVar = this.zze;
        String str = zzeo.zza;
        zzumVar.zzp(this);
    }

    public final long zzq() {
        return this.zzf;
    }

    public final void zzr(zzur zzurVar) {
        zzghc.zzh(this.zzc == null);
        this.zzc = zzurVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final /* bridge */ /* synthetic */ void zzs(zzwh zzwhVar) {
        zzum zzumVar = this.zze;
        String str = zzeo.zza;
        zzumVar.zzs(this);
    }

    public final void zzt(zzup zzupVar) {
        long jZzv = zzv(this.zzb);
        zzur zzurVar = this.zzc;
        zzurVar.getClass();
        zzun zzunVarZzG = zzurVar.zzG(zzupVar, this.zzg, jZzv);
        this.zzd = zzunVarZzG;
        if (this.zze != null) {
            zzunVarZzG.zzb(this, jZzv);
        }
    }

    public final void zzu() {
        zzun zzunVar = this.zzd;
        if (zzunVar != null) {
            zzur zzurVar = this.zzc;
            zzurVar.getClass();
            zzurVar.zzC(zzunVar);
        }
    }
}

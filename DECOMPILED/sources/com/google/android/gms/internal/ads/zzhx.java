package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhx implements zzkm {
    private final zzlw zza;
    private final zzhw zzb;
    private zzll zzc;
    private zzkm zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzhx(zzhw zzhwVar, zzdb zzdbVar) {
        this.zzb = zzhwVar;
        this.zza = new zzlw(zzdbVar);
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j7) {
        this.zza.zzc(j7);
    }

    public final void zzd(zzll zzllVar) throws zzhz {
        zzkm zzkmVar;
        zzkm zzkmVarZzd = zzllVar.zzd();
        if (zzkmVarZzd == null || zzkmVarZzd == (zzkmVar = this.zzd)) {
            return;
        }
        if (zzkmVar != null) {
            throw zzhz.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), zzbbn.zzq.zzf);
        }
        this.zzd = zzkmVarZzd;
        this.zzc = zzllVar;
        zzkmVarZzd.zzi(this.zza.zzj());
    }

    public final void zze(zzll zzllVar) {
        if (zzllVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    public final long zzf(boolean z7) {
        zzlw zzlwVar;
        zzau zzauVarZzj;
        zzll zzllVar = this.zzc;
        if (zzllVar == null || zzllVar.zzY() || ((z7 && this.zzc.zze() != 2) || (!this.zzc.zzX() && (z7 || this.zzc.zzdb())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zza();
            }
        } else {
            zzkm zzkmVar = this.zzd;
            zzkmVar.getClass();
            long jZzg = zzkmVar.zzg();
            if (this.zze) {
                zzlw zzlwVar2 = this.zza;
                if (jZzg < zzlwVar2.zzg()) {
                    zzlwVar2.zzb();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        zzlwVar2.zza();
                    }
                    zzlwVar = this.zza;
                    zzlwVar.zzc(jZzg);
                    zzauVarZzj = zzkmVar.zzj();
                    if (!zzauVarZzj.equals(zzlwVar.zzj())) {
                        zzlwVar.zzi(zzauVarZzj);
                        this.zzb.zzc(zzauVarZzj);
                    }
                }
            } else {
                zzlwVar = this.zza;
                zzlwVar.zzc(jZzg);
                zzauVarZzj = zzkmVar.zzj();
                if (!zzauVarZzj.equals(zzlwVar.zzj())) {
                    zzlwVar.zzi(zzauVarZzj);
                    this.zzb.zzc(zzauVarZzj);
                }
            }
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        zzkm zzkmVar = this.zzd;
        zzkmVar.getClass();
        return zzkmVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        zzkm zzkmVar = this.zzd;
        zzkmVar.getClass();
        return zzkmVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzi(zzau zzauVar) {
        zzkm zzkmVar = this.zzd;
        if (zzkmVar != null) {
            zzkmVar.zzi(zzauVar);
            zzauVar = this.zzd.zzj();
        }
        this.zza.zzi(zzauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final zzau zzj() {
        zzkm zzkmVar = this.zzd;
        return zzkmVar != null ? zzkmVar.zzj() : this.zza.zzj();
    }
}

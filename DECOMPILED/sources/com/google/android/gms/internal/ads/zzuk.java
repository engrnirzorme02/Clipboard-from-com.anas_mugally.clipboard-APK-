package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuk extends zzws {
    private final boolean zzb;
    private final zzbd zzc;
    private final zzbc zzd;
    private zzui zze;
    private zzuh zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzuk(zzur zzurVar, boolean z7) {
        boolean z8;
        super(zzurVar);
        if (z7) {
            zzurVar.zzI();
            z8 = true;
        } else {
            z8 = false;
        }
        this.zzb = z8;
        this.zzc = new zzbd();
        this.zzd = new zzbc();
        zzurVar.zzH();
        this.zze = zzui.zzp(zzurVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzs() == null || !obj.equals(zzui.zzc)) ? obj : this.zze.zzs();
    }

    private final boolean zzL(long j7) {
        zzuh zzuhVar = this.zzf;
        int iZze = this.zze.zze(zzuhVar.zza.zza);
        if (iZze == -1) {
            return false;
        }
        zzui zzuiVar = this.zze;
        zzbc zzbcVar = this.zzd;
        zzuiVar.zzd(iZze, zzbcVar, false);
        long j8 = zzbcVar.zzd;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0L, j8 - 1);
        }
        zzuhVar.zzo(j7);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzA(zzaj zzajVar) {
        if (this.zzi) {
            this.zze = this.zze.zzr(new zzwo(this.zze.zzb, zzajVar));
        } else {
            this.zze = zzui.zzp(zzajVar);
        }
        ((zzws) this).zza.zzA(zzajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void zzB() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzv(null, ((zzws) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzur
    public final void zzC(zzun zzunVar) {
        ((zzuh) zzunVar).zzu();
        if (zzunVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzws
    protected final void zzD(zzbe zzbeVar) {
        long jZza;
        zzup zzupVarZza = null;
        if (this.zzh) {
            this.zze = this.zze.zzr(zzbeVar);
            zzuh zzuhVar = this.zzf;
            if (zzuhVar != null) {
                zzL(zzuhVar.zzq());
            }
        } else if (zzbeVar.zzg()) {
            this.zze = this.zzi ? this.zze.zzr(zzbeVar) : zzui.zzq(zzbeVar, zzbd.zza, zzui.zzc);
        } else {
            zzbd zzbdVar = this.zzc;
            zzbeVar.zzb(0, zzbdVar, 0L);
            Object obj = zzbdVar.zzb;
            zzuh zzuhVar2 = this.zzf;
            if (zzuhVar2 != null) {
                jZza = zzuhVar2.zza();
                this.zze.zzo(zzuhVar2.zza.zza, this.zzd);
                this.zze.zzb(0, zzbdVar, 0L);
                if (jZza == 0) {
                    jZza = 0;
                }
            } else {
                jZza = 0;
            }
            Pair pairZzm = zzbeVar.zzm(zzbdVar, this.zzd, 0, jZza);
            Object obj2 = pairZzm.first;
            long jLongValue = ((Long) pairZzm.second).longValue();
            this.zze = this.zzi ? this.zze.zzr(zzbeVar) : zzui.zzq(zzbeVar, obj, obj2);
            zzuh zzuhVar3 = this.zzf;
            if (zzuhVar3 != null && zzL(jLongValue)) {
                zzup zzupVar = zzuhVar3.zza;
                zzupVarZza = zzupVar.zza(zzK(zzupVar.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zze(this.zze);
        if (zzupVarZza != null) {
            zzuh zzuhVar4 = this.zzf;
            zzuhVar4.getClass();
            zzuhVar4.zzt(zzupVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzws
    protected final zzup zzE(zzup zzupVar) {
        Object objZzs = this.zze.zzs();
        Object obj = zzupVar.zza;
        if (objZzs != null && this.zze.zzs().equals(obj)) {
            obj = zzui.zzc;
        }
        return zzupVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzws, com.google.android.gms.internal.ads.zzur
    /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
    public final zzuh zzG(zzup zzupVar, zzyv zzyvVar, long j7) {
        zzuh zzuhVar = new zzuh(zzupVar, zzyvVar, j7);
        zzuhVar.zzr(((zzws) this).zza);
        if (this.zzh) {
            zzuhVar.zzt(zzupVar.zza(zzK(zzupVar.zza)));
            return zzuhVar;
        }
        this.zzf = zzuhVar;
        if (!this.zzg) {
            this.zzg = true;
            zzv(null, ((zzws) this).zza);
        }
        return zzuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzto
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    public final zzbe zzz() {
        return this.zze;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzlp {
    private final zzll zza;
    private final int zzb;
    private final zzll zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzlp(zzll zzllVar, zzll zzllVar2, int i7) {
        this.zza = zzllVar;
        this.zzb = i7;
        this.zzc = zzllVar2;
    }

    private final boolean zzM() {
        int i7 = this.zzd;
        return i7 == 2 || i7 == 4;
    }

    private final boolean zzN() {
        return this.zzd == 3;
    }

    private final boolean zzO(zzkn zzknVar, zzll zzllVar) {
        if (zzllVar == null) {
            return true;
        }
        zzwf[] zzwfVarArr = zzknVar.zzc;
        int i7 = this.zzb;
        zzwf zzwfVar = zzwfVarArr[i7];
        if (zzllVar.zzda() != null) {
            if (zzllVar.zzda() == zzwfVar) {
                if (zzwfVar != null && !zzllVar.zzdb()) {
                    zzknVar.zzp();
                    boolean z7 = zzknVar.zzg.zzg;
                }
            }
            zzkn zzknVarZzp = zzknVar.zzp();
            return zzknVarZzp != null && zzknVarZzp.zzc[i7] == zzllVar.zzda();
        }
        return true;
    }

    private final void zzP(boolean z7) {
        if (z7) {
            zzll zzllVar = this.zzc;
            zzllVar.getClass();
            zzllVar.zzx(17, this.zza);
        } else {
            zzll zzllVar2 = this.zza;
            zzll zzllVar3 = this.zzc;
            zzllVar3.getClass();
            zzllVar2.zzx(17, zzllVar3);
        }
    }

    private final void zzQ(zzll zzllVar, zzwf zzwfVar, zzhx zzhxVar, long j7, boolean z7) {
        if (zzV(zzllVar)) {
            if (zzwfVar != zzllVar.zzda()) {
                zzR(zzllVar, zzhxVar);
            } else if (z7) {
                zzllVar.zzp(j7);
            }
        }
    }

    private final void zzR(zzll zzllVar, zzhx zzhxVar) {
        boolean z7 = true;
        if (this.zza != zzllVar && this.zzc != zzllVar) {
            z7 = false;
        }
        zzghc.zzh(z7);
        if (zzV(zzllVar)) {
            zzhxVar.zze(zzllVar);
            zzX(zzllVar);
            zzllVar.zzr();
        }
    }

    private final void zzS(boolean z7) {
        if (z7) {
            if (this.zze) {
                this.zza.zzs();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzll zzllVar = this.zzc;
            zzllVar.getClass();
            zzllVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzT(zzll zzllVar, zzkn zzknVar, zzyn zzynVar, zzhx zzhxVar) {
        if (zzllVar != null && zzV(zzllVar)) {
            zzll zzllVar2 = this.zza;
            boolean z7 = zzllVar != zzllVar2;
            if ((zzllVar != zzllVar2 || !zzM()) && (zzllVar != this.zzc || !zzN())) {
                zzwf zzwfVarZzda = zzllVar.zzda();
                zzwf[] zzwfVarArr = zzknVar.zzc;
                int i7 = this.zzb;
                zzwf zzwfVar = zzwfVarArr[i7];
                boolean zZza = zzynVar.zza(i7);
                if (zZza && zzwfVarZzda == zzwfVar) {
                    return 1;
                }
                if (!zzllVar.zzm()) {
                    zzu[] zzuVarArrZzU = zzU(zzynVar.zzc[i7]);
                    zzwf zzwfVar2 = zzwfVarArr[i7];
                    zzwfVar2.getClass();
                    zzllVar.zzcZ(zzuVarArrZzU, zzwfVar2, zzknVar.zzc(), zzknVar.zza(), zzknVar.zzg.zza);
                    return 3;
                }
                if (!zzllVar.zzY()) {
                    return 0;
                }
                zzR(zzllVar, zzhxVar);
                if (!zZza || zzc()) {
                    zzS(!z7);
                }
                return 1;
            }
        }
        return 1;
    }

    private static zzu[] zzU(zzyf zzyfVar) {
        int iZze = zzyfVar != null ? zzyfVar.zze() : 0;
        zzu[] zzuVarArr = new zzu[iZze];
        for (int i7 = 0; i7 < iZze; i7++) {
            zzyfVar.getClass();
            zzuVarArr[i7] = zzyfVar.zzb(i7);
        }
        return zzuVarArr;
    }

    private static boolean zzV(zzll zzllVar) {
        return zzllVar.zze() != 0;
    }

    private final zzll zzW(zzkn zzknVar) {
        if (zzknVar != null) {
            int i7 = this.zzb;
            zzwf[] zzwfVarArr = zzknVar.zzc;
            if (zzwfVarArr[i7] != null) {
                zzll zzllVar = this.zza;
                zzwf zzwfVarZzda = zzllVar.zzda();
                zzwf zzwfVar = zzwfVarArr[i7];
                if (zzwfVarZzda == zzwfVar) {
                    return zzllVar;
                }
                zzll zzllVar2 = this.zzc;
                if (zzllVar2 != null && zzllVar2.zzda() == zzwfVar) {
                    return zzllVar2;
                }
            }
        }
        return null;
    }

    private static final void zzX(zzll zzllVar) {
        if (zzllVar.zze() == 2) {
            zzllVar.zzq();
        }
    }

    private static final void zzY(zzll zzllVar, long j7) {
        zzllVar.zzl();
        if (zzllVar instanceof zzwu) {
            throw null;
        }
    }

    public final void zzA(zzhx zzhxVar) {
        zzR(this.zza, zzhxVar);
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            boolean z7 = zzV(zzllVar) && this.zzd != 3;
            zzR(zzllVar, zzhxVar);
            zzS(false);
            if (z7) {
                zzP(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() {
        int i7 = this.zzd;
        if (i7 == 3 || i7 == 4) {
            zzP(i7 == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i7 == 2) {
            this.zzd = 0;
        }
    }

    public final void zzC(zzhx zzhxVar) {
        boolean z7;
        zzll zzllVar;
        if (zzc()) {
            int i7 = this.zzd;
            if (i7 == 4) {
                z7 = true;
            } else if (i7 == 2) {
                i7 = 2;
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                zzllVar = this.zza;
            } else {
                zzllVar = this.zzc;
                zzllVar.getClass();
            }
            zzR(zzllVar, zzhxVar);
            zzS(z7);
            this.zzd = i7 == 4 ? 1 : 0;
        }
    }

    public final void zzD(zzwf zzwfVar, zzhx zzhxVar, long j7, boolean z7) {
        zzQ(this.zza, zzwfVar, zzhxVar, j7, z7);
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            zzQ(zzllVar, zzwfVar, zzhxVar, j7, z7);
        }
    }

    public final void zzE(zzkn zzknVar, long j7) {
        zzll zzllVarZzW = zzW(zzknVar);
        if (zzllVarZzW != null) {
            zzllVarZzW.zzp(j7);
        }
    }

    public final void zzF() {
        if (!zzV(this.zza)) {
            zzS(true);
        }
        zzll zzllVar = this.zzc;
        if (zzllVar == null || zzV(zzllVar)) {
            return;
        }
        zzS(false);
    }

    public final int zzG(zzkn zzknVar, zzyn zzynVar, zzhx zzhxVar) {
        int iZzT = zzT(this.zza, zzknVar, zzynVar, zzhxVar);
        return iZzT == 1 ? zzT(this.zzc, zzknVar, zzynVar, zzhxVar) : iZzT;
    }

    public final void zzH() {
        this.zza.zzt();
        this.zze = false;
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            zzllVar.zzt();
            this.zzf = false;
        }
    }

    public final void zzI(Object obj) {
        if (zze() != 2) {
            return;
        }
        int i7 = this.zzd;
        if (i7 != 4 && i7 != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        zzll zzllVar = this.zzc;
        zzllVar.getClass();
        zzllVar.zzx(1, obj);
    }

    public final void zzJ(zzaar zzaarVar) {
        if (zze() != 2) {
            zze();
            return;
        }
        this.zza.zzx(7, zzaarVar);
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            zzllVar.zzx(7, zzaarVar);
        }
    }

    public final void zzK(float f7) {
        if (zze() != 1) {
            return;
        }
        zzll zzllVar = this.zza;
        Float fValueOf = Float.valueOf(f7);
        zzllVar.zzx(2, fValueOf);
        zzll zzllVar2 = this.zzc;
        if (zzllVar2 != null) {
            zzllVar2.zzx(2, fValueOf);
        }
    }

    public final boolean zzL() {
        int i7 = this.zzd;
        if (i7 == 0 || i7 == 2 || i7 == 4) {
            return zzV(this.zza);
        }
        zzll zzllVar = this.zzc;
        zzllVar.getClass();
        return zzV(zzllVar);
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final void zzb() {
        int i7;
        zzghc.zzh(!zzc());
        if (zzV(this.zza)) {
            i7 = 3;
        } else {
            zzll zzllVar = this.zzc;
            i7 = (zzllVar == null || !zzV(zzllVar)) ? 2 : 4;
        }
        this.zzd = i7;
    }

    public final boolean zzc() {
        return zzM() || zzN();
    }

    public final int zzd() {
        zzll zzllVar = this.zzc;
        boolean zZzV = zzV(this.zza);
        int i7 = 0;
        if (zzllVar != null && zzV(zzllVar)) {
            i7 = 1;
        }
        return (zZzV ? 1 : 0) + i7;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final long zzf(zzkn zzknVar) {
        zzll zzllVarZzW = zzW(zzknVar);
        Objects.requireNonNull(zzllVarZzW);
        return zzllVarZzW.zzk();
    }

    public final boolean zzg(zzkn zzknVar) {
        zzll zzllVarZzW = zzW(zzknVar);
        zzllVarZzW.getClass();
        return zzllVarZzW.zzdb();
    }

    public final void zzh(zzkn zzknVar, long j7) {
        zzll zzllVarZzW = zzW(zzknVar);
        zzllVarZzW.getClass();
        zzY(zzllVarZzW, j7);
    }

    public final void zzi(zzyn zzynVar, zzyn zzynVar2, long j7) {
        int i7;
        int i8 = this.zzb;
        boolean zZza = zzynVar.zza(i8);
        boolean zZza2 = zzynVar2.zza(i8);
        zzll zzllVar = this.zzc;
        if (zzllVar == null || (i7 = this.zzd) == 3 || (i7 == 0 && zzV(this.zza))) {
            zzllVar = this.zza;
        }
        if (!zZza || zzllVar.zzm()) {
            return;
        }
        zze();
        zzlo zzloVar = zzynVar.zzb[i8];
        zzlo zzloVar2 = zzynVar2.zzb[i8];
        if (zZza2 && Objects.equals(zzloVar2, zzloVar) && !zzc()) {
            return;
        }
        zzY(zzllVar, j7);
    }

    public final void zzj(long j7) {
        int i7;
        zzll zzllVar = this.zza;
        if (zzV(zzllVar) && (i7 = this.zzd) != 4 && i7 != 2) {
            zzY(zzllVar, j7);
        }
        zzll zzllVar2 = this.zzc;
        if (zzllVar2 == null || !zzV(zzllVar2) || this.zzd == 3) {
            return;
        }
        zzY(zzllVar2, j7);
    }

    public final long zzk(long j7, long j8) {
        zzll zzllVar = this.zza;
        long jZzT = zzV(zzllVar) ? zzllVar.zzT(j7, j8) : Long.MAX_VALUE;
        zzll zzllVar2 = this.zzc;
        return (zzllVar2 == null || !zzV(zzllVar2)) ? jZzT : Math.min(jZzT, zzllVar2.zzT(j7, j8));
    }

    public final void zzl() {
        zzll zzllVar = this.zza;
        if (zzV(zzllVar)) {
            zzllVar.zzV();
            return;
        }
        zzll zzllVar2 = this.zzc;
        if (zzllVar2 == null || !zzV(zzllVar2)) {
            return;
        }
        zzllVar2.zzV();
    }

    public final void zzm(float f7, float f8) {
        this.zza.zzU(f7, f8);
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            zzllVar.zzU(f7, f8);
        }
    }

    public final void zzn(zzbe zzbeVar) {
        this.zza.zzo(zzbeVar);
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            zzllVar.zzo(zzbeVar);
        }
    }

    public final boolean zzo() {
        zzll zzllVar = this.zza;
        boolean zZzY = zzV(zzllVar) ? zzllVar.zzY() : true;
        zzll zzllVar2 = this.zzc;
        return (zzllVar2 == null || !zzV(zzllVar2)) ? zZzY : zZzY & zzllVar2.zzY();
    }

    public final boolean zzp(zzkn zzknVar) {
        return zzW(zzknVar) != null;
    }

    public final boolean zzq(zzkn zzknVar) {
        return (zzM() && zzW(zzknVar) == this.zza) || (zzN() && zzW(zzknVar) == this.zzc);
    }

    public final boolean zzr(zzkn zzknVar) {
        return zzO(zzknVar, this.zza) && zzO(zzknVar, this.zzc);
    }

    public final void zzs(long j7, long j8) {
        zzll zzllVar = this.zza;
        if (zzV(zzllVar)) {
            zzllVar.zzW(j7, j8);
        }
        zzll zzllVar2 = this.zzc;
        if (zzllVar2 == null || !zzV(zzllVar2)) {
            return;
        }
        zzllVar2.zzW(j7, j8);
    }

    public final boolean zzt(zzkn zzknVar) {
        zzll zzllVarZzW = zzW(zzknVar);
        return zzllVarZzW == null || zzllVarZzW.zzdb() || zzllVarZzW.zzX() || zzllVarZzW.zzY();
    }

    public final void zzu(zzkn zzknVar) {
        zzll zzllVarZzW = zzW(zzknVar);
        zzllVarZzW.getClass();
        zzllVarZzW.zzn();
    }

    public final void zzv() {
        zzll zzllVar = this.zza;
        if (zzllVar.zze() == 1 && this.zzd != 4) {
            zzllVar.zzcY();
            return;
        }
        zzll zzllVar2 = this.zzc;
        if (zzllVar2 == null || zzllVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zzllVar2.zzcY();
    }

    public final void zzw() {
        zzll zzllVar = this.zza;
        if (zzV(zzllVar)) {
            zzX(zzllVar);
        }
        zzll zzllVar2 = this.zzc;
        if (zzllVar2 == null || !zzV(zzllVar2)) {
            return;
        }
        zzX(zzllVar2);
    }

    public final void zzx(zzlo zzloVar, zzyf zzyfVar, zzwf zzwfVar, long j7, boolean z7, boolean z8, long j8, long j9, zzup zzupVar, zzhx zzhxVar) throws zzhz {
        zzu[] zzuVarArrZzU = zzU(zzyfVar);
        int i7 = this.zzd;
        if (i7 == 0 || i7 == 2 || i7 == 4) {
            this.zze = true;
            zzll zzllVar = this.zza;
            zzllVar.zzf(zzloVar, zzuVarArrZzU, zzwfVar, j7, z7, z8, j8, j9, zzupVar);
            zzhxVar.zzd(zzllVar);
            return;
        }
        this.zzf = true;
        zzll zzllVar2 = this.zzc;
        zzllVar2.getClass();
        zzllVar2.zzf(zzloVar, zzuVarArrZzU, zzwfVar, j7, z7, z8, j8, j9, zzupVar);
        zzhxVar.zzd(zzllVar2);
    }

    public final void zzy(int i7, Object obj, zzkn zzknVar) {
        zzll zzllVarZzW = zzW(zzknVar);
        zzllVarZzW.getClass();
        zzllVarZzW.zzx(11, obj);
    }

    public final void zzz(zzls zzlsVar) {
        this.zza.zzx(18, zzlsVar);
        zzll zzllVar = this.zzc;
        if (zzllVar != null) {
            zzllVar.zzx(18, zzlsVar);
        }
    }
}

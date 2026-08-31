package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzkq {
    private final zzmd zzc;
    private final zzdl zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzij zzh;
    private zzkn zzi;
    private zzkn zzj;
    private zzkn zzk;
    private zzkn zzl;
    private zzkn zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzjy zzr;
    private final zzbc zza = new zzbc();
    private final zzbd zzb = new zzbd();
    private List zzq = new ArrayList();

    public zzkq(zzmd zzmdVar, zzdl zzdlVar, zzjy zzjyVar, zzij zzijVar) {
        this.zzc = zzmdVar;
        this.zzd = zzdlVar;
        this.zzr = zzjyVar;
        this.zzh = zzijVar;
    }

    private static zzup zzA(zzbe zzbeVar, Object obj, long j7, long j8, zzbd zzbdVar, zzbc zzbcVar) {
        zzbeVar.zzo(obj, zzbcVar);
        zzbeVar.zzb(zzbcVar.zzc, zzbdVar, 0L);
        zzbeVar.zze(obj);
        zzbcVar.zzb();
        zzbeVar.zzo(obj, zzbcVar);
        int iZze = zzbcVar.zze(j7);
        return iZze == -1 ? new zzup(obj, j8, zzbcVar.zzf(j7)) : new zzup(obj, iZze, zzbcVar.zzd(iZze), j8);
    }

    private final void zzB() {
        int i7 = zzgjz.zzd;
        final zzgjw zzgjwVar = new zzgjw();
        for (zzkn zzknVarZzp = this.zzi; zzknVarZzp != null; zzknVarZzp = zzknVarZzp.zzp()) {
            zzgjwVar.zzf(zzknVarZzp.zzg.zza);
        }
        zzkn zzknVar = this.zzj;
        final zzup zzupVar = zzknVar == null ? null : zzknVar.zzg.zza;
        this.zzd.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgjwVar, zzupVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i7 = 0; i7 < this.zzq.size(); i7++) {
            zzkn zzknVar = (zzkn) this.zzq.get(i7);
            if (zzknVar.zzb.equals(obj)) {
                return zzknVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbe zzbeVar) {
        zzbe zzbeVar2;
        zzkn zzknVarZzp = this.zzi;
        if (zzknVarZzp == null) {
            return 0;
        }
        int iZze = zzbeVar.zze(zzknVarZzp.zzb);
        while (true) {
            zzbeVar2 = zzbeVar;
            iZze = zzbeVar2.zzl(iZze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzknVarZzp.getClass();
                if (zzknVarZzp.zzp() == null || zzknVarZzp.zzg.zzh) {
                    break;
                }
                zzknVarZzp = zzknVarZzp.zzp();
            }
            zzkn zzknVarZzp2 = zzknVarZzp.zzp();
            if (iZze == -1 || zzknVarZzp2 == null || zzbeVar2.zze(zzknVarZzp2.zzb) != iZze) {
                break;
            }
            zzknVarZzp = zzknVarZzp2;
            zzbeVar = zzbeVar2;
        }
        int iZzs = zzs(zzknVarZzp);
        zzknVarZzp.zzg = zzx(zzbeVar2, zzknVarZzp.zzg);
        return iZzs;
    }

    private final zzko zzE(zzbe zzbeVar, zzkn zzknVar, long j7) {
        zzbe zzbeVar2;
        long j8;
        zzbd zzbdVar;
        Object obj;
        long j9;
        long j10;
        long j11;
        zzko zzkoVar = zzknVar.zzg;
        long jZza = zzknVar.zza();
        long j12 = zzkoVar.zze;
        long j13 = (jZza + j12) - j7;
        if (!zzkoVar.zzh) {
            zzup zzupVar = zzkoVar.zza;
            Object obj2 = zzupVar.zza;
            zzbc zzbcVar = this.zza;
            zzbeVar.zzo(obj2, zzbcVar);
            if (!zzupVar.zzb()) {
                int i7 = zzupVar.zze;
                if (i7 != -1) {
                    zzbcVar.zzi(i7);
                }
                int iZzd = zzbcVar.zzd(i7);
                zzbcVar.zzk(i7);
                if (iZzd != zzbcVar.zzg(i7)) {
                    return zzG(zzbeVar, obj2, i7, iZzd, j12, zzupVar.zzd, false);
                }
                zzK(zzbeVar, obj2, i7);
                return zzH(zzbeVar, obj2, 0L, j12, zzupVar.zzd, false);
            }
            int i8 = zzupVar.zzb;
            if (zzbcVar.zzg(i8) == -1) {
                return null;
            }
            int iZza = zzbcVar.zzg.zza(i8).zza(zzupVar.zzc);
            if (iZza < 0) {
                return zzG(zzbeVar, obj2, i8, iZza, zzkoVar.zzc, zzupVar.zzd, false);
            }
            long jLongValue = zzkoVar.zzc;
            if (jLongValue == -9223372036854775807L) {
                Pair pairZzn = zzbeVar.zzn(this.zzb, zzbcVar, zzbcVar.zzc, -9223372036854775807L, Math.max(0L, j13));
                zzbeVar2 = zzbeVar;
                if (pairZzn == null) {
                    return null;
                }
                jLongValue = ((Long) pairZzn.second).longValue();
                j8 = -9223372036854775807L;
            } else {
                zzbeVar2 = zzbeVar;
                j8 = jLongValue;
            }
            zzK(zzbeVar2, obj2, i8);
            return zzH(zzbeVar2, obj2, Math.max(0L, jLongValue), j8, zzupVar.zzd, false);
        }
        zzup zzupVar2 = zzkoVar.zza;
        Object obj3 = zzupVar2.zza;
        int iZze = zzbeVar.zze(obj3);
        int i9 = this.zzf;
        boolean z7 = this.zzg;
        zzbd zzbdVar2 = this.zzb;
        zzbc zzbcVar2 = this.zza;
        long j14 = 0;
        int iZzl = zzbeVar.zzl(iZze, zzbcVar2, zzbdVar2, i9, z7);
        if (iZzl == -1) {
            return null;
        }
        int i10 = zzbeVar.zzd(iZzl, zzbcVar2, true).zzc;
        Object obj4 = zzbcVar2.zzb;
        obj4.getClass();
        long j15 = zzupVar2.zzd;
        if (zzbeVar.zzb(i10, zzbdVar2, 0L).zzn == iZzl) {
            Pair pairZzn2 = zzbeVar.zzn(zzbdVar2, zzbcVar2, i10, -9223372036854775807L, Math.max(0L, j13));
            if (pairZzn2 == null) {
                return null;
            }
            Object obj5 = pairZzn2.first;
            long jLongValue2 = ((Long) pairZzn2.second).longValue();
            zzkn zzknVarZzp = zzknVar.zzp();
            if (zzknVarZzp == null || !zzknVarZzp.zzb.equals(obj5)) {
                long jZzC = zzC(obj5);
                if (jZzC == -1) {
                    jZzC = this.zze;
                    this.zze = 1 + jZzC;
                }
                j11 = jZzC;
            } else {
                j11 = zzknVarZzp.zzg.zza.zzd;
            }
            zzbdVar = zzbdVar2;
            j9 = jLongValue2;
            obj = obj5;
            j10 = j11;
            j14 = -9223372036854775807L;
        } else {
            zzbdVar = zzbdVar2;
            obj = obj4;
            j9 = 0;
            j10 = j15;
        }
        zzup zzupVarZzA = zzA(zzbeVar, obj, j9, j10, zzbdVar, zzbcVar2);
        long j16 = j9;
        if (j14 != -9223372036854775807L && zzkoVar.zzc != -9223372036854775807L) {
            zzbeVar.zzo(obj3, zzbcVar2).zzb();
            int i11 = zzbcVar2.zzg.zzd;
        }
        return zzF(zzbeVar, zzupVarZzA, j14, j16);
    }

    private final zzko zzF(zzbe zzbeVar, zzup zzupVar, long j7, long j8) {
        Object obj = zzupVar.zza;
        zzbeVar.zzo(obj, this.zza);
        return zzupVar.zzb() ? zzG(zzbeVar, obj, zzupVar.zzb, zzupVar.zzc, j7, zzupVar.zzd, false) : zzH(zzbeVar, obj, j8, j7, zzupVar.zzd, false);
    }

    private final zzko zzG(zzbe zzbeVar, Object obj, int i7, int i8, long j7, long j8, boolean z7) {
        zzup zzupVar = new zzup(obj, i7, i8, j8);
        Object obj2 = zzupVar.zza;
        int i9 = zzupVar.zzb;
        int i10 = zzupVar.zzc;
        zzbc zzbcVar = this.zza;
        long jZzh = zzbeVar.zzo(obj2, zzbcVar).zzh(i9, i10);
        if (i8 == zzbcVar.zzd(i7)) {
            zzbcVar.zzj();
        }
        zzbcVar.zzk(i9);
        long jMax = 0;
        if (jZzh != -9223372036854775807L && jZzh <= 0) {
            jMax = Math.max(0L, (-1) + jZzh);
        }
        return new zzko(zzupVar, jMax, j7, -9223372036854775807L, jZzh, false, false, false, false, false);
    }

    private final zzko zzH(zzbe zzbeVar, Object obj, long j7, long j8, long j9, boolean z7) {
        long j10;
        long j11;
        long j12;
        long jMax = j7;
        zzbc zzbcVar = this.zza;
        zzbeVar.zzo(obj, zzbcVar);
        int iZzf = zzbcVar.zzf(jMax);
        if (iZzf == -1) {
            zzbcVar.zzb();
        } else {
            zzbcVar.zzk(iZzf);
        }
        zzup zzupVar = new zzup(obj, j9, iZzf);
        boolean zZzL = zzL(zzupVar);
        boolean zZzI = zzI(zzbeVar, zzupVar);
        boolean zZzJ = zzJ(zzbeVar, zzupVar, zZzL);
        if (iZzf != -1) {
            zzbcVar.zzk(iZzf);
        }
        if (iZzf != -1) {
            zzbcVar.zzi(iZzf);
        }
        if (iZzf != -1) {
            zzbcVar.zzc(iZzf);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        if (j10 != -9223372036854775807L) {
            j12 = j10;
            j11 = j12;
        } else {
            j11 = zzbcVar.zzd;
            j12 = -9223372036854775807L;
        }
        if (j11 != -9223372036854775807L && jMax >= j11) {
            jMax = Math.max(0L, j11 - 1);
        }
        return new zzko(zzupVar, jMax, j8, j12, j11, false, false, zZzL, zZzI, zZzJ);
    }

    private final boolean zzI(zzbe zzbeVar, zzup zzupVar) {
        if (!zzL(zzupVar)) {
            return false;
        }
        Object obj = zzupVar.zza;
        return zzbeVar.zzb(zzbeVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbeVar.zze(obj);
    }

    private final boolean zzJ(zzbe zzbeVar, zzup zzupVar, boolean z7) {
        int iZze = zzbeVar.zze(zzupVar.zza);
        zzbc zzbcVar = this.zza;
        int i7 = zzbeVar.zzd(iZze, zzbcVar, false).zzc;
        zzbd zzbdVar = this.zzb;
        return !zzbeVar.zzb(i7, zzbdVar, 0L).zzi && zzbeVar.zzl(iZze, zzbcVar, zzbdVar, this.zzf, this.zzg) == -1 && z7;
    }

    private final long zzK(zzbe zzbeVar, Object obj, int i7) {
        zzbc zzbcVar = this.zza;
        zzbeVar.zzo(obj, zzbcVar);
        zzbcVar.zzc(i7);
        long j7 = zzbcVar.zzg.zza(i7).zzh;
        return 0L;
    }

    private static final boolean zzL(zzup zzupVar) {
        return !zzupVar.zzb() && zzupVar.zze == -1;
    }

    public final int zza(zzbe zzbeVar, int i7) {
        this.zzf = i7;
        return zzD(zzbeVar);
    }

    public final int zzb(zzbe zzbeVar, boolean z7) {
        this.zzg = z7;
        return zzD(zzbeVar);
    }

    public final void zzc(zzbe zzbeVar, zzij zzijVar) {
        this.zzh = zzijVar;
        long j7 = zzijVar.zzb;
        zzj();
    }

    public final boolean zzd(zzun zzunVar) {
        zzkn zzknVar = this.zzl;
        return zzknVar != null && zzknVar.zza == zzunVar;
    }

    public final boolean zze(zzun zzunVar) {
        zzkn zzknVar = this.zzm;
        return zzknVar != null && zzknVar.zza == zzunVar;
    }

    public final void zzf(long j7) {
        zzkn zzknVar = this.zzl;
        if (zzknVar != null) {
            zzknVar.zzi(j7);
        }
    }

    public final boolean zzg() {
        zzkn zzknVar = this.zzl;
        if (zzknVar != null) {
            return !zzknVar.zzg.zzj && zzknVar.zzd() && this.zzl.zzg.zze != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }

    public final zzko zzh(long j7, zzld zzldVar) {
        zzkn zzknVar = this.zzl;
        return zzknVar == null ? zzF(zzldVar.zza, zzldVar.zzb, zzldVar.zzc, zzldVar.zzs) : zzE(zzldVar.zza, zzknVar, j7);
    }

    public final zzkn zzi(zzko zzkoVar) {
        zzkn zzknVarZza;
        zzkn zzknVar = this.zzl;
        long jZza = zzknVar == null ? 1000000000000L : (zzknVar.zza() + zzknVar.zzg.zze) - zzkoVar.zzb;
        int i7 = 0;
        while (true) {
            if (i7 >= this.zzq.size()) {
                zzknVarZza = null;
                break;
            }
            zzko zzkoVar2 = ((zzkn) this.zzq.get(i7)).zzg;
            long j7 = zzkoVar2.zze;
            long j8 = zzkoVar.zze;
            if ((j7 == -9223372036854775807L || j7 == j8) && zzkoVar2.zzb == zzkoVar.zzb && zzkoVar2.zza.equals(zzkoVar.zza)) {
                zzknVarZza = (zzkn) this.zzq.remove(i7);
                break;
            }
            i7++;
        }
        if (zzknVarZza == null) {
            zzknVarZza = this.zzr.zza(zzkoVar, jZza);
        } else {
            zzknVarZza.zzg = zzkoVar;
            zzknVarZza.zzb(jZza);
        }
        zzkn zzknVar2 = this.zzl;
        if (zzknVar2 != null) {
            zzknVar2.zzo(zzknVarZza);
        } else {
            this.zzi = zzknVarZza;
            this.zzj = zzknVarZza;
            this.zzk = zzknVarZza;
        }
        this.zzo = null;
        this.zzl = zzknVarZza;
        this.zzn++;
        zzB();
        return zzknVarZza;
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < this.zzq.size(); i7++) {
            ((zzkn) this.zzq.get(i7)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzkn zzk() {
        return this.zzl;
    }

    public final zzkn zzl() {
        return this.zzm;
    }

    public final zzkn zzm() {
        return this.zzi;
    }

    public final zzkn zzn() {
        return this.zzj;
    }

    public final zzkn zzo() {
        return this.zzk;
    }

    public final zzkn zzp() {
        zzkn zzknVar = this.zzk;
        zzkn zzknVar2 = this.zzj;
        if (zzknVar == zzknVar2) {
            zzknVar2.getClass();
            this.zzk = zzknVar2.zzp();
        }
        zzknVar2.getClass();
        this.zzj = zzknVar2.zzp();
        zzB();
        zzkn zzknVar3 = this.zzj;
        zzknVar3.getClass();
        return zzknVar3;
    }

    public final zzkn zzq() {
        zzkn zzknVar = this.zzk;
        zzknVar.getClass();
        this.zzk = zzknVar.zzp();
        zzB();
        zzkn zzknVar2 = this.zzk;
        zzknVar2.getClass();
        return zzknVar2;
    }

    public final zzkn zzr() {
        zzkn zzknVar = this.zzi;
        if (zzknVar == null) {
            return null;
        }
        if (zzknVar == this.zzj) {
            this.zzj = zzknVar.zzp();
        }
        if (zzknVar == this.zzk) {
            this.zzk = zzknVar.zzp();
        }
        zzknVar.zzn();
        int i7 = this.zzn - 1;
        this.zzn = i7;
        if (i7 == 0) {
            this.zzl = null;
            zzkn zzknVar2 = this.zzi;
            this.zzo = zzknVar2.zzb;
            this.zzp = zzknVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final int zzs(zzkn zzknVar) {
        zzknVar.getClass();
        int i7 = 0;
        if (zzknVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzknVar;
        while (zzknVar.zzp() != null) {
            zzknVar = zzknVar.zzp();
            zzknVar.getClass();
            if (zzknVar == this.zzj) {
                zzkn zzknVar2 = this.zzi;
                this.zzj = zzknVar2;
                this.zzk = zzknVar2;
                i7 = 3;
            }
            if (zzknVar == this.zzk) {
                this.zzk = this.zzj;
                i7 |= 2;
            }
            zzknVar.zzn();
            this.zzn--;
        }
        zzkn zzknVar3 = this.zzl;
        zzknVar3.getClass();
        zzknVar3.zzo(null);
        zzB();
        return i7;
    }

    public final void zzt() {
        zzkn zzknVar = this.zzm;
        if (zzknVar == null || zzknVar.zze()) {
            this.zzm = null;
            for (int i7 = 0; i7 < this.zzq.size(); i7++) {
                zzkn zzknVar2 = (zzkn) this.zzq.get(i7);
                if (!zzknVar2.zze()) {
                    this.zzm = zzknVar2;
                    return;
                }
            }
        }
    }

    public final zzkn zzu(zzun zzunVar) {
        for (int i7 = 0; i7 < this.zzq.size(); i7++) {
            zzkn zzknVar = (zzkn) this.zzq.get(i7);
            if (zzknVar.zza == zzunVar) {
                return zzknVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzkn zzknVarZzp = this.zzi;
        zzknVarZzp.getClass();
        this.zzo = zzknVarZzp.zzb;
        this.zzp = zzknVarZzp.zzg.zza.zzd;
        while (zzknVarZzp != null) {
            zzknVarZzp.zzn();
            zzknVarZzp = zzknVarZzp.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    public final int zzw(zzbe zzbeVar, long j7, long j8, long j9) {
        zzko zzkoVarZzx;
        boolean z7;
        zzkn zzknVarZzp = this.zzi;
        zzkn zzknVar = null;
        while (true) {
            int i7 = 0;
            if (zzknVarZzp == null) {
                return 0;
            }
            zzko zzkoVar = zzknVarZzp.zzg;
            if (zzknVar == null) {
                zzkoVarZzx = zzx(zzbeVar, zzkoVar);
            } else {
                zzko zzkoVarZzE = zzE(zzbeVar, zzknVar, j7);
                if (zzkoVarZzE == null || zzkoVar.zzb != zzkoVarZzE.zzb || !zzkoVar.zza.equals(zzkoVarZzE.zza)) {
                    return zzs(zzknVar);
                }
                zzkoVarZzx = zzkoVarZzE;
            }
            zzknVarZzp.zzg = zzkoVarZzx.zzb(zzkoVar.zzc);
            long j10 = zzkoVar.zze;
            long j11 = zzkoVarZzx.zze;
            if (j10 != j11) {
                zzknVarZzp.zzs();
                long jZza = j11 == -9223372036854775807L ? Long.MAX_VALUE : j11 + zzknVarZzp.zza();
                if (zzknVarZzp == this.zzj) {
                    boolean z8 = zzknVarZzp.zzg.zzg;
                    if (j8 == Long.MIN_VALUE || j8 >= jZza) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    z7 = false;
                }
                boolean z9 = zzknVarZzp == this.zzk && (j9 == Long.MIN_VALUE || j9 >= jZza);
                int iZzs = zzs(zzknVarZzp);
                if (iZzs != 0) {
                    return iZzs;
                }
                if (j10 == -9223372036854775807L) {
                    j10 = -9223372036854775807L;
                }
                if (z7 && j10 != -9223372036854775807L) {
                    i7 = 1;
                }
                return z9 ? i7 | 2 : i7;
            }
            zzknVar = zzknVarZzp;
            zzknVarZzp = zzknVarZzp.zzp();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    public final zzko zzx(zzbe zzbeVar, zzko zzkoVar) {
        long j7;
        long jZzh;
        long j8;
        long j9;
        int i7;
        int i8;
        zzup zzupVar = zzkoVar.zza;
        boolean zZzL = zzL(zzupVar);
        boolean zZzI = zzI(zzbeVar, zzupVar);
        boolean zZzJ = zzJ(zzbeVar, zzupVar, zZzL);
        Object obj = zzupVar.zza;
        zzbc zzbcVar = this.zza;
        zzbeVar.zzo(obj, zzbcVar);
        if (zzupVar.zzb() || (i8 = zzupVar.zze) == -1) {
            j7 = -9223372036854775807L;
        } else {
            zzbcVar.zzc(i8);
            j7 = 0;
        }
        if (!zzupVar.zzb()) {
            if (j7 != -9223372036854775807L) {
                j8 = 0;
                j9 = 0;
            } else {
                jZzh = zzbcVar.zzd;
            }
            if (zzupVar.zzb()) {
                zzbcVar.zzk(zzupVar.zzb);
            } else {
                i7 = zzupVar.zze;
                if (i7 != -1) {
                    zzbcVar.zzk(i7);
                }
            }
            return new zzko(zzupVar, zzkoVar.zzb, zzkoVar.zzc, j9, j8, false, false, zZzL, zZzI, zZzJ);
        }
        jZzh = zzbcVar.zzh(zzupVar.zzb, zzupVar.zzc);
        j8 = jZzh;
        j9 = j7;
        if (zzupVar.zzb()) {
            zzbcVar.zzk(zzupVar.zzb);
        } else {
            i7 = zzupVar.zze;
            if (i7 != -1) {
                zzbcVar.zzk(i7);
            }
        }
        return new zzko(zzupVar, zzkoVar.zzb, zzkoVar.zzc, j9, j8, false, false, zZzL, zZzI, zZzJ);
    }

    public final zzup zzy(zzbe zzbeVar, Object obj, long j7) {
        long jZzC;
        int iZze;
        zzbc zzbcVar = this.zza;
        int i7 = zzbeVar.zzo(obj, zzbcVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZze = zzbeVar.zze(obj2)) == -1 || zzbeVar.zzd(iZze, zzbcVar, false).zzc != i7) {
            zzkn zzknVarZzp = this.zzi;
            while (true) {
                if (zzknVarZzp == null) {
                    zzkn zzknVarZzp2 = this.zzi;
                    while (true) {
                        if (zzknVarZzp2 == null) {
                            jZzC = zzC(obj);
                            if (jZzC != -1) {
                                break;
                            }
                            jZzC = this.zze;
                            this.zze = 1 + jZzC;
                            if (this.zzi != null) {
                                break;
                            }
                            this.zzo = obj;
                            this.zzp = jZzC;
                            break;
                        }
                        int iZze2 = zzbeVar.zze(zzknVarZzp2.zzb);
                        if (iZze2 != -1 && zzbeVar.zzd(iZze2, zzbcVar, false).zzc == i7) {
                            jZzC = zzknVarZzp2.zzg.zza.zzd;
                            break;
                        }
                        zzknVarZzp2 = zzknVarZzp2.zzp();
                    }
                } else {
                    if (zzknVarZzp.zzb.equals(obj)) {
                        jZzC = zzknVarZzp.zzg.zza.zzd;
                        break;
                    }
                    zzknVarZzp = zzknVarZzp.zzp();
                }
            }
        } else {
            jZzC = this.zzp;
        }
        long j8 = jZzC;
        zzbeVar.zzo(obj, zzbcVar);
        int i8 = zzbcVar.zzc;
        zzbd zzbdVar = this.zzb;
        zzbeVar.zzb(i8, zzbdVar, 0L);
        Object obj3 = obj;
        for (int iZze3 = zzbeVar.zze(obj); iZze3 >= zzbdVar.zzn; iZze3--) {
            zzbeVar.zzd(iZze3, zzbcVar, true);
            zzbcVar.zzb();
            if (zzbcVar.zze(zzbcVar.zzd) != -1) {
                Object obj4 = zzbcVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbeVar, obj3, j7, j8, zzbdVar, zzbcVar);
    }

    final /* synthetic */ void zzz(zzgjw zzgjwVar, zzup zzupVar) {
        this.zzc.zzz(zzgjwVar.zzi(), zzupVar);
    }
}

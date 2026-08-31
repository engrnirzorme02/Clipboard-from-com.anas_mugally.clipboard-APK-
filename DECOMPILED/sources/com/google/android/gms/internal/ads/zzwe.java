package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwe implements zzaeb {
    private boolean zzB;
    private final zzvz zza;
    private final zzru zzd;
    private final zzrp zze;
    private zzwd zzf;
    private zzu zzg;
    private zzrn zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;
    private zzu zzz;
    private final zzwa zzb = new zzwa();
    private int zzi = zzbbn.zzq.zzf;
    private long[] zzj = new long[zzbbn.zzq.zzf];
    private long[] zzk = new long[zzbbn.zzq.zzf];
    private long[] zzn = new long[zzbbn.zzq.zzf];
    private int[] zzm = new int[zzbbn.zzq.zzf];
    private int[] zzl = new int[zzbbn.zzq.zzf];
    private zzaea[] zzo = new zzaea[zzbbn.zzq.zzf];
    private final zzwl zzc = new zzwl(zzwb.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;
    private boolean zzA = true;

    protected zzwe(zzyv zzyvVar, zzru zzruVar, zzrp zzrpVar) {
        this.zzd = zzruVar;
        this.zze = zzrpVar;
        this.zza = new zzvz(zzyvVar);
    }

    private final synchronized void zzA() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzB(zzkh zzkhVar, zzhg zzhgVar, boolean z7, boolean z8, zzwa zzwaVar) {
        try {
            zzhgVar.zzd = false;
            if (!zzH()) {
                if (!z8 && !this.zzw) {
                    zzu zzuVar = this.zzz;
                    if (zzuVar == null || (!z7 && zzuVar == this.zzg)) {
                        return -3;
                    }
                    zzI(zzuVar, zzkhVar);
                    return -5;
                }
                zzhgVar.zzg(4);
                zzhgVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzu zzuVar2 = ((zzwc) this.zzc.zza(this.zzq + this.zzs)).zza;
            if (!z7 && zzuVar2 == this.zzg) {
                int iZzM = zzM(this.zzs);
                if (!zzJ(iZzM)) {
                    zzhgVar.zzd = true;
                    return -3;
                }
                zzhgVar.zzg(this.zzm[iZzM]);
                if (this.zzs == this.zzp - 1 && (z8 || this.zzw)) {
                    zzhgVar.zzh(536870912);
                }
                zzhgVar.zze = this.zzn[iZzM];
                zzwaVar.zza = this.zzl[iZzM];
                zzwaVar.zzb = this.zzk[iZzM];
                zzwaVar.zzc = this.zzo[iZzM];
                return -4;
            }
            zzI(zzuVar2, zzkhVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzC(zzu zzuVar) {
        try {
            this.zzy = false;
            if (Objects.equals(zzuVar, this.zzz)) {
                return false;
            }
            zzwl zzwlVar = this.zzc;
            if (zzwlVar.zzf() || !((zzwc) zzwlVar.zzc()).zza.equals(zzuVar)) {
                this.zzz = zzuVar;
            } else {
                this.zzz = ((zzwc) zzwlVar.zzc()).zza;
            }
            boolean z7 = this.zzA;
            zzu zzuVar2 = this.zzz;
            this.zzA = z7 & zzar.zzd(zzuVar2.zzo, zzuVar2.zzk);
            this.zzB = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    private final synchronized long zzD(long j7, boolean z7, boolean z8) throws Throwable {
        Throwable th;
        try {
            try {
                int i7 = this.zzp;
                if (i7 != 0) {
                    long[] jArr = this.zzn;
                    int i8 = this.zzr;
                    if (j7 >= jArr[i8]) {
                        if (z8) {
                            try {
                                int i9 = this.zzs;
                                if (i9 != i7) {
                                    i7 = i9 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iZzK = zzK(i8, i7, j7, false);
                        if (iZzK != -1) {
                            return zzL(iZzK);
                        }
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final synchronized long zzE() {
        int i7 = this.zzp;
        if (i7 == 0) {
            return -1L;
        }
        return zzL(i7);
    }

    private final void zzF() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzG(long j7, int i7, long j8, int i8, zzaea zzaeaVar) {
        try {
            int i9 = this.zzp;
            if (i9 > 0) {
                int iZzM = zzM(i9 - 1);
                zzghc.zza(this.zzk[iZzM] + ((long) this.zzl[iZzM]) <= j8);
            }
            this.zzw = (536870912 & i7) != 0;
            this.zzv = Math.max(this.zzv, j7);
            int iZzM2 = zzM(this.zzp);
            this.zzn[iZzM2] = j7;
            this.zzk[iZzM2] = j8;
            this.zzl[iZzM2] = i8;
            this.zzm[iZzM2] = i7;
            this.zzo[iZzM2] = zzaeaVar;
            this.zzj[iZzM2] = 0;
            zzwl zzwlVar = this.zzc;
            if (zzwlVar.zzf() || !((zzwc) zzwlVar.zzc()).zza.equals(this.zzz)) {
                zzu zzuVar = this.zzz;
                if (zzuVar == null) {
                    throw null;
                }
                zzwlVar.zzb(this.zzq + this.zzp, new zzwc(zzuVar, zzrt.zzb, null));
            }
            int i10 = this.zzp + 1;
            this.zzp = i10;
            int i11 = this.zzi;
            if (i10 == i11) {
                int i12 = i11 + zzbbn.zzq.zzf;
                long[] jArr = new long[i12];
                long[] jArr2 = new long[i12];
                long[] jArr3 = new long[i12];
                int[] iArr = new int[i12];
                int[] iArr2 = new int[i12];
                zzaea[] zzaeaVarArr = new zzaea[i12];
                int i13 = this.zzr;
                int i14 = i11 - i13;
                System.arraycopy(this.zzk, i13, jArr2, 0, i14);
                System.arraycopy(this.zzn, this.zzr, jArr3, 0, i14);
                System.arraycopy(this.zzm, this.zzr, iArr, 0, i14);
                System.arraycopy(this.zzl, this.zzr, iArr2, 0, i14);
                System.arraycopy(this.zzo, this.zzr, zzaeaVarArr, 0, i14);
                System.arraycopy(this.zzj, this.zzr, jArr, 0, i14);
                int i15 = this.zzr;
                System.arraycopy(this.zzk, 0, jArr2, i14, i15);
                System.arraycopy(this.zzn, 0, jArr3, i14, i15);
                System.arraycopy(this.zzm, 0, iArr, i14, i15);
                System.arraycopy(this.zzl, 0, iArr2, i14, i15);
                System.arraycopy(this.zzo, 0, zzaeaVarArr, i14, i15);
                System.arraycopy(this.zzj, 0, jArr, i14, i15);
                this.zzk = jArr2;
                this.zzn = jArr3;
                this.zzm = iArr;
                this.zzl = iArr2;
                this.zzo = zzaeaVarArr;
                this.zzj = jArr;
                this.zzr = 0;
                this.zzi = i12;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzH() {
        return this.zzs != this.zzp;
    }

    private final void zzI(zzu zzuVar, zzkh zzkhVar) {
        zzu zzuVar2 = this.zzg;
        zzp zzpVar = zzuVar2 == null ? null : zzuVar2.zzs;
        this.zzg = zzuVar;
        zzp zzpVar2 = zzuVar.zzs;
        zzru zzruVar = this.zzd;
        zzkhVar.zzb = zzuVar.zzb(zzruVar.zzb(zzuVar));
        zzkhVar.zza = this.zzh;
        if (zzuVar2 == null || !Objects.equals(zzpVar, zzpVar2)) {
            zzrn zzrnVarZza = zzruVar.zza(this.zze, zzuVar);
            this.zzh = zzrnVarZza;
            zzkhVar.zza = zzrnVarZza;
        }
    }

    private final boolean zzJ(int i7) {
        if (this.zzh == null) {
            return true;
        }
        int i8 = this.zzm[i7];
        return false;
    }

    private final int zzK(int i7, int i8, long j7, boolean z7) {
        int i9 = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            long j8 = this.zzn[i7];
            if (j8 > j7) {
                break;
            }
            if (!z7 || (this.zzm[i7] & 1) != 0) {
                if (j8 == j7) {
                    return i10;
                }
                i9 = i10;
            }
            i7++;
            if (i7 == this.zzi) {
                i7 = 0;
            }
        }
        return i9;
    }

    private final long zzL(int i7) {
        long j7 = this.zzu;
        long jMax = Long.MIN_VALUE;
        if (i7 != 0) {
            int iZzM = zzM(i7 - 1);
            for (int i8 = 0; i8 < i7; i8++) {
                jMax = Math.max(jMax, this.zzn[iZzM]);
                if ((this.zzm[iZzM] & 1) != 0) {
                    break;
                }
                iZzM--;
                if (iZzM == -1) {
                    iZzM = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j7, jMax);
        this.zzp -= i7;
        int i9 = this.zzq + i7;
        this.zzq = i9;
        int i10 = this.zzr + i7;
        this.zzr = i10;
        int i11 = this.zzi;
        if (i10 >= i11) {
            this.zzr = i10 - i11;
        }
        int i12 = this.zzs - i7;
        this.zzs = i12;
        if (i12 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i9);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i13 = this.zzr;
        if (i13 == 0) {
            i13 = this.zzi;
        }
        int i14 = i13 - 1;
        return this.zzk[i14] + ((long) this.zzl[i14]);
    }

    private final int zzM(int i7) {
        int i8 = this.zzr + i7;
        int i9 = this.zzi;
        return i8 < i9 ? i8 : i8 - i9;
    }

    public final void zza() {
        zzb(true);
        zzF();
    }

    public final void zzb(boolean z7) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = false;
        this.zzc.zze();
        if (z7) {
            this.zzz = null;
            this.zzy = true;
            this.zzA = true;
        }
    }

    public final void zzc(long j7) {
        this.zzt = j7;
    }

    public final int zzd() {
        return this.zzq + this.zzp;
    }

    public final void zze() {
        zzs();
        zzF();
    }

    public final void zzf() {
        zzrn zzrnVar = this.zzh;
        if (zzrnVar != null) {
            throw zzrnVar.zza();
        }
    }

    public final int zzg() {
        return this.zzq;
    }

    public final int zzh() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzu zzi() {
        if (this.zzy) {
            return null;
        }
        return this.zzz;
    }

    public final synchronized long zzj() {
        return this.zzv;
    }

    public final synchronized boolean zzk() {
        return this.zzw;
    }

    public final synchronized boolean zzl(boolean z7) {
        boolean z8 = true;
        if (zzH()) {
            if (((zzwc) this.zzc.zza(this.zzq + this.zzs)).zza != this.zzg) {
                return true;
            }
            return zzJ(zzM(this.zzs));
        }
        if (!z7 && !this.zzw) {
            zzu zzuVar = this.zzz;
            if (zzuVar == null) {
                z8 = false;
            } else if (zzuVar == this.zzg) {
                return false;
            }
        }
        return z8;
    }

    public final int zzm(zzkh zzkhVar, zzhg zzhgVar, int i7, boolean z7) {
        boolean z8 = (i7 & 2) != 0;
        zzwa zzwaVar = this.zzb;
        int iZzB = zzB(zzkhVar, zzhgVar, z8, z7, zzwaVar);
        if (iZzB != -4) {
            return iZzB;
        }
        if (!zzhgVar.zzb()) {
            int i8 = i7 & 1;
            if ((i7 & 4) == 0) {
                if (i8 != 0) {
                    this.zza.zzd(zzhgVar, zzwaVar);
                    return -4;
                }
                this.zza.zzc(zzhgVar, zzwaVar);
            } else if (i8 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzn(int i7) {
        zzA();
        int i8 = this.zzq;
        if (i7 >= i8 && i7 <= this.zzp + i8) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i7 - i8;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    public final synchronized boolean zzo(long j7, boolean z7) throws Throwable {
        Throwable th;
        zzwe zzweVar;
        long j8;
        int iZzK;
        try {
            try {
                zzA();
                int i7 = this.zzs;
                int iZzM = zzM(i7);
                if (zzH() && j7 >= this.zzn[iZzM]) {
                    if (j7 > this.zzv) {
                        if (z7) {
                            z7 = true;
                        }
                    }
                    if (this.zzA) {
                        try {
                            int i8 = this.zzp - i7;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= i8) {
                                    if (!z7) {
                                        zzweVar = this;
                                        j8 = j7;
                                        iZzK = -1;
                                        break;
                                    }
                                    j8 = j7;
                                    iZzK = i8;
                                    zzweVar = this;
                                    break;
                                }
                                if (this.zzn[iZzM] >= j7) {
                                    zzweVar = this;
                                    j8 = j7;
                                    iZzK = i9;
                                    break;
                                }
                                iZzM++;
                                if (iZzM == this.zzi) {
                                    iZzM = 0;
                                }
                                i9++;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        zzweVar = this;
                        j8 = j7;
                        iZzK = zzweVar.zzK(iZzM, this.zzp - i7, j8, true);
                    }
                    if (iZzK != -1) {
                        zzweVar.zzt = j8;
                        zzweVar.zzs += iZzK;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized int zzp(long j7, boolean z7) {
        Throwable th;
        try {
            try {
                int i7 = this.zzs;
                int iZzM = zzM(i7);
                if (!zzH() || j7 < this.zzn[iZzM]) {
                    return 0;
                }
                if (j7 <= this.zzv || !z7) {
                    int iZzK = zzK(iZzM, this.zzp - i7, j7, true);
                    if (iZzK == -1) {
                        return 0;
                    }
                    return iZzK;
                }
                try {
                    return this.zzp - i7;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public final synchronized void zzq(int i7) {
        boolean z7 = false;
        if (i7 >= 0) {
            try {
                if (this.zzs + i7 <= this.zzp) {
                    z7 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzghc.zza(z7);
        this.zzs += i7;
    }

    public final void zzr(long j7, boolean z7, boolean z8) {
        this.zza.zze(zzD(j7, false, z8));
    }

    public final void zzs() {
        this.zza.zze(zzE());
    }

    public final void zzt(zzwd zzwdVar) {
        this.zzf = zzwdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzu(zzu zzuVar) {
        boolean zZzC = zzC(zzuVar);
        zzwd zzwdVar = this.zzf;
        if (zzwdVar == null || !zZzC) {
            return;
        }
        zzwdVar.zzy(zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zzv(zzi zziVar, int i7, boolean z7, int i8) {
        return this.zza.zzg(zziVar, i7, z7);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzw(zzef zzefVar, int i7, int i8) {
        this.zza.zzh(zzefVar, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzx(long j7, int i7, int i8, int i9, zzaea zzaeaVar) {
        if (this.zzx) {
            if ((i7 & 1) == 0) {
                return;
            } else {
                this.zzx = false;
            }
        }
        if (this.zzA) {
            if (j7 < this.zzt) {
                return;
            }
            if ((i7 & 1) == 0) {
                if (!this.zzB) {
                    zzds.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i7 |= 1;
            }
        }
        int i10 = i7;
        zzG(j7, i10, (this.zza.zzf() - ((long) i8)) - ((long) i9), i8, zzaeaVar);
    }
}

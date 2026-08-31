package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzkf implements Handler.Callback, zzum, zzyl, zzlb, zzhw, zzlf, zzho, zzaar {
    private static final long zza = zzeo.zzp(10000);
    private zzlt zzA;
    private boolean zzC;
    private boolean zzD;
    private zzke zzE;
    private int zzF;
    private zzld zzG;
    private zzkc zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;
    private zzke zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;
    private zzhz zzX;
    private zzij zzZ;
    private boolean zzab;
    private final zzht zzad;
    private final zzlp[] zzb;
    private final zzln[] zzc;
    private final boolean[] zzd;
    private final zzym zze;
    private final zzyn zzf;
    private final zzkj zzg;
    private final zzyu zzh;
    private final zzdl zzi;
    private final zzle zzj;
    private final Looper zzk;
    private final zzbd zzl;
    private final zzbc zzm;
    private final long zzn;
    private final zzhx zzo;
    private final ArrayList zzp;
    private final zzdb zzq;
    private final zzkd zzr;
    private final zzkq zzs;
    private final zzlc zzt;
    private final long zzu;
    private final zzox zzv;
    private final zzmd zzw;
    private final zzdl zzx;
    private final boolean zzy;
    private final zzhp zzz;
    private long zzaa = -9223372036854775807L;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzls zzB = zzls.zza;
    private long zzY = -9223372036854775807L;
    private long zzM = -9223372036854775807L;

    public zzkf(Context context, zzll[] zzllVarArr, zzll[] zzllVarArr2, zzym zzymVar, zzyn zzynVar, zzkj zzkjVar, zzyu zzyuVar, int i7, boolean z7, zzmd zzmdVar, zzlt zzltVar, zzht zzhtVar, long j7, boolean z8, boolean z9, Looper looper, zzdb zzdbVar, zzkd zzkdVar, zzox zzoxVar, zzle zzleVar, zzij zzijVar, final zzaar zzaarVar) {
        this.zzr = zzkdVar;
        this.zze = zzymVar;
        this.zzf = zzynVar;
        this.zzg = zzkjVar;
        this.zzh = zzyuVar;
        int i8 = 0;
        this.zzA = zzltVar;
        this.zzad = zzhtVar;
        this.zzu = j7;
        this.zzq = zzdbVar;
        this.zzv = zzoxVar;
        this.zzZ = zzijVar;
        this.zzw = zzmdVar;
        this.zzn = zzkjVar.zze(zzoxVar);
        zzkjVar.zzf(zzoxVar);
        zzbe zzbeVar = zzbe.zza;
        zzld zzldVarZza = zzld.zza(zzynVar);
        this.zzG = zzldVarZza;
        this.zzH = new zzkc(zzldVarZza);
        int length = zzllVarArr.length;
        this.zzc = new zzln[2];
        this.zzd = new boolean[2];
        zzlm zzlmVarZzg = zzymVar.zzg();
        this.zzb = new zzlp[2];
        boolean z10 = false;
        for (int i9 = 2; i8 < i9; i9 = 2) {
            zzllVarArr[i8].zzc(i8, zzoxVar, zzdbVar);
            this.zzc[i8] = zzllVarArr[i8].zzb();
            this.zzc[i8].zzv(zzlmVarZzg);
            zzll zzllVar = zzllVarArr2[i8];
            if (zzllVar != null) {
                zzllVar.zzc(i8, zzoxVar, zzdbVar);
                z10 = true;
            }
            this.zzb[i8] = new zzlp(zzllVarArr[i8], zzllVarArr2[i8], i8);
            i8++;
        }
        this.zzy = z10;
        this.zzo = new zzhx(this, zzdbVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbd();
        this.zzm = new zzbc();
        zzymVar.zzr(this, zzyuVar);
        this.zzW = true;
        zzdl zzdlVarZzd = zzdbVar.zzd(looper, null);
        this.zzx = zzdlVarZzd;
        this.zzs = new zzkq(zzmdVar, zzdlVarZzd, new zzjy(this), zzijVar);
        this.zzt = new zzlc(this, zzmdVar, zzdlVarZzd, zzoxVar);
        zzle zzleVar2 = new zzle(null);
        this.zzj = zzleVar2;
        Looper looperZza = zzleVar2.zza();
        this.zzk = looperZza;
        zzdl zzdlVarZzd2 = zzdbVar.zzd(looperZza, this);
        this.zzi = zzdlVarZzd2;
        this.zzz = new zzhp(context, looperZza, this);
        zzdlVarZzd2.zzd(35, new zzaar() { // from class: com.google.android.gms.internal.ads.zzju
            @Override // com.google.android.gms.internal.ads.zzaar
            public final /* synthetic */ void zzcS(long j8, long j9, zzu zzuVar, MediaFormat mediaFormat) {
                this.zza.zzcS(j8, j9, zzuVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzA(IOException iOException, int i7) {
        zzkq zzkqVar = this.zzs;
        zzhz zzhzVarZza = zzhz.zza(iOException, i7);
        zzkn zzknVarZzm = zzkqVar.zzm();
        if (zzknVarZzm != null) {
            zzhzVarZza = zzhzVarZza.zzd(zzknVarZzm.zzg.zza);
        }
        zzds.zzf("ExoPlayerImplInternal", "Playback error", zzhzVarZza);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zzhzVarZza);
    }

    private final void zzB(int i7) {
        zzld zzldVar = this.zzG;
        if (zzldVar.zze != i7) {
            if (i7 != 2) {
                this.zzY = -9223372036854775807L;
            }
            this.zzG = zzldVar.zze(i7);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzkc(this.zzG);
        }
    }

    private final void zzD(float f7) {
        this.zzac = f7;
        float fZza = f7 * this.zzz.zza();
        int i7 = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i7 >= 2) {
                return;
            }
            zzlpVarArr[i7].zzK(fZza);
            i7++;
        }
    }

    private final void zzE(boolean z7, int i7, boolean z8, int i8) {
        this.zzH.zza(z8 ? 1 : 0);
        zzG(z7, i7, i8);
    }

    private final void zzF() {
        zzld zzldVar = this.zzG;
        zzG(zzldVar.zzl, zzldVar.zzn, zzldVar.zzm);
    }

    private final void zzG(boolean z7, int i7, int i8) {
        zzH(z7, this.zzz.zzc(z7, this.zzG.zze), i7, i8);
    }

    private final void zzH(boolean z7, int i7, int i8, int i9) {
        boolean z8;
        if (!z7) {
            z8 = false;
        } else if (i7 != -1) {
            z8 = true;
        } else {
            i7 = -1;
            z8 = false;
        }
        if (i7 == -1) {
            i9 = 2;
        } else if (i9 == 2) {
            i9 = 1;
        }
        if (i7 == 0) {
            i8 = 1;
        } else if (i8 == 1) {
            i8 = 0;
        }
        zzld zzldVar = this.zzG;
        if (zzldVar.zzl == z8 && zzldVar.zzn == i8 && zzldVar.zzm == i9) {
            return;
        }
        this.zzG = zzldVar.zzi(z8, i9, i8);
        zzaC(false, false);
        zzkq zzkqVar = this.zzs;
        for (zzkn zzknVarZzm = zzkqVar.zzm(); zzknVarZzm != null; zzknVarZzm = zzknVarZzm.zzp()) {
            for (zzyf zzyfVar : zzknVarZzm.zzr().zzc) {
            }
        }
        if (!zzax()) {
            zzK();
            zzL();
            boolean z9 = this.zzG.zzp;
            zzkqVar.zzf(this.zzT);
            return;
        }
        int i10 = this.zzG.zze;
        if (i10 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i10 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzI(boolean z7) throws zzhz {
        zzup zzupVar = this.zzs.zzm().zzg.zza;
        long jZzT = zzT(zzupVar, this.zzG.zzs, true, false);
        if (jZzT != this.zzG.zzs) {
            zzld zzldVar = this.zzG;
            this.zzG = zzao(zzupVar, jZzT, zzldVar.zzc, zzldVar.zzd, z7, 5);
        }
    }

    private final void zzJ() {
        zzkn zzknVarZzm = this.zzs.zzm();
        if (zzknVarZzm == null) {
            return;
        }
        zzyn zzynVarZzr = zzknVarZzm.zzr();
        int i7 = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i7 >= 2) {
                return;
            }
            if (zzynVarZzr.zza(i7)) {
                zzlpVarArr[i7].zzv();
            }
            i7++;
        }
    }

    private final void zzK() {
        this.zzo.zzb();
        int i7 = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i7 >= 2) {
                return;
            }
            zzlpVarArr[i7].zzw();
            i7++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzL() {
        zzkb zzkbVar;
        zzkq zzkqVar = this.zzs;
        zzkn zzknVarZzm = zzkqVar.zzm();
        if (zzknVarZzm == null) {
            return;
        }
        long jZzh = zzknVarZzm.zze ? zzknVarZzm.zza.zzh() : -9223372036854775807L;
        if (jZzh != -9223372036854775807L) {
            if (!zzknVarZzm.zzd()) {
                zzkqVar.zzs(zzknVarZzm);
                zzas(false);
                zzam();
            }
            zzU(jZzh);
            if (jZzh != this.zzG.zzs) {
                zzld zzldVar = this.zzG;
                long j7 = jZzh;
                this.zzG = zzao(zzldVar.zzb, j7, zzldVar.zzc, j7, true, 5);
            }
        } else {
            zzhx zzhxVar = this.zzo;
            long jZzf = zzhxVar.zzf(zzknVarZzm != zzkqVar.zzn());
            this.zzT = jZzf;
            long jZza = jZzf - zzknVarZzm.zza();
            long j8 = this.zzG.zzs;
            ArrayList arrayList = this.zzp;
            if (!arrayList.isEmpty() && !this.zzG.zzb.zzb()) {
                if (this.zzW) {
                    j8--;
                    this.zzW = false;
                }
                zzld zzldVar2 = this.zzG;
                int iZze = zzldVar2.zza.zze(zzldVar2.zzb.zza);
                int iMin = Math.min(this.zzV, arrayList.size());
                if (iMin > 0) {
                    zzkbVar = (zzkb) arrayList.get(iMin - 1);
                    while (zzkbVar != null && (iZze < 0 || (iZze == 0 && j8 < 0))) {
                        int i7 = iMin - 1;
                        if (i7 > 0) {
                            zzkbVar = (zzkb) arrayList.get(iMin - 2);
                            iMin = i7;
                        } else {
                            iMin = i7;
                            zzkbVar = null;
                        }
                    }
                    if (iMin < arrayList.size()) {
                    }
                    this.zzV = iMin;
                } else {
                    zzkbVar = null;
                }
            }
            if (zzhxVar.zzh()) {
                boolean z7 = !this.zzH.zzc;
                zzld zzldVar3 = this.zzG;
                this.zzG = zzao(zzldVar3.zzb, jZza, zzldVar3.zzc, jZza, z7, 6);
            } else {
                zzld zzldVar4 = this.zzG;
                zzldVar4.zzs = jZza;
                zzldVar4.zzt = SystemClock.elapsedRealtime();
            }
        }
        this.zzG.zzq = zzkqVar.zzk().zzf();
        this.zzG.zzr = zzat();
        zzld zzldVar5 = this.zzG;
        if (zzldVar5.zzl && zzldVar5.zze == 3 && zzP(zzldVar5.zza, zzldVar5.zzb)) {
            zzld zzldVar6 = this.zzG;
            if (zzldVar6.zzo.zzb == 1.0f) {
                float fZzd = this.zzad.zzd(zzO(zzldVar6.zza, zzldVar6.zzb.zza, zzldVar6.zzs), this.zzG.zzr);
                zzhx zzhxVar2 = this.zzo;
                if (zzhxVar2.zzj().zzb != fZzd) {
                    zzM(new zzau(fZzd, this.zzG.zzo.zzc));
                    zzal(this.zzG.zzo, zzhxVar2.zzj().zzb, false, false);
                }
            }
        }
    }

    private final void zzM(zzau zzauVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzauVar);
    }

    private final void zzN(final int i7, final boolean z7) {
        boolean[] zArr = this.zzd;
        if (zArr[i7] != z7) {
            zArr[i7] = z7;
            this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i7, z7);
                }
            });
        }
    }

    private final long zzO(zzbe zzbeVar, Object obj, long j7) {
        int i7 = zzbeVar.zzo(obj, this.zzm).zzc;
        zzbd zzbdVar = this.zzl;
        zzbeVar.zzb(i7, zzbdVar, 0L);
        if (zzbdVar.zzf == -9223372036854775807L || !zzbdVar.zzb() || !zzbdVar.zzi) {
            return -9223372036854775807L;
        }
        long j8 = zzbdVar.zzg;
        String str = zzeo.zza;
        return zzeo.zzq((j8 == -9223372036854775807L ? System.currentTimeMillis() : j8 + SystemClock.elapsedRealtime()) - zzbdVar.zzf) - j7;
    }

    private final boolean zzP(zzbe zzbeVar, zzup zzupVar) {
        if (!zzupVar.zzb() && !zzbeVar.zzg()) {
            int i7 = zzbeVar.zzo(zzupVar.zza, this.zzm).zzc;
            zzbd zzbdVar = this.zzl;
            zzbeVar.zzb(i7, zzbdVar, 0L);
            if (zzbdVar.zzb() && zzbdVar.zzi && zzbdVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j7) {
        long jMin = 1000;
        if (zzw()) {
            jMin = this.zzG.zze != 3 ? zza : 1000L;
            zzlp[] zzlpVarArr = this.zzb;
            for (int i7 = 0; i7 < 2; i7++) {
                jMin = Math.min(jMin, zzeo.zzp(zzlpVarArr[i7].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzkq zzkqVar = this.zzs;
                zzkn zzknVarZzp = zzkqVar.zzm() != null ? zzkqVar.zzm().zzp() : null;
                if (zzknVarZzp != null) {
                    if (this.zzT + (zzeo.zzq(jMin) * this.zzG.zzo.zzb) >= zzknVarZzp.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            jMin = zza;
        }
        this.zzi.zzj(2, j7 + jMin);
    }

    private final void zzR(zzke zzkeVar, boolean z7) throws Throwable {
        long jLongValue;
        long j7;
        long j8;
        boolean z8;
        zzup zzupVar;
        zzup zzupVar2;
        boolean z9;
        long j9;
        long jZzk;
        long jZzS;
        boolean z10;
        zzld zzldVar;
        zzbe zzbeVar;
        zzup zzupVar3;
        long j10;
        zzup zzupVar4;
        long j11;
        long j12;
        boolean z11;
        zzld zzldVar2;
        int i7;
        this.zzH.zza(z7 ? 1 : 0);
        if (this.zzD) {
            if (this.zzE != null) {
                this.zzF++;
            }
            this.zzE = zzkeVar;
            return;
        }
        zzbe zzbeVar2 = this.zzG.zza;
        int i8 = this.zzO;
        boolean z12 = this.zzP;
        zzbd zzbdVar = this.zzl;
        zzbc zzbcVar = this.zzm;
        Pair pairZzaD = zzaD(zzbeVar2, zzkeVar, true, i8, z12, zzbdVar, zzbcVar);
        if (pairZzaD == null) {
            Pair pairZzY = zzY(this.zzG.zza);
            zzupVar = (zzup) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            z8 = !this.zzG.zza.zzg();
            j7 = -9223372036854775807L;
            j8 = 0;
        } else {
            Object obj = pairZzaD.first;
            jLongValue = ((Long) pairZzaD.second).longValue();
            long j13 = zzkeVar.zzc;
            j7 = j13 == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            j8 = 0;
            zzup zzupVarZzy = this.zzs.zzy(this.zzG.zza, obj, jLongValue);
            if (zzupVarZzy.zzb()) {
                this.zzG.zza.zzo(zzupVarZzy.zza, zzbcVar);
                if (zzbcVar.zzd(zzupVarZzy.zzb) == zzupVarZzy.zzc) {
                    zzbcVar.zzj();
                }
                zzupVar = zzupVarZzy;
                z8 = true;
                jLongValue = 0;
            } else {
                z8 = j13 == -9223372036854775807L;
                zzupVar = zzupVarZzy;
            }
        }
        try {
            if (this.zzG.zza.zzg()) {
                this.zzS = zzkeVar;
            } else if (pairZzaD == null) {
                if (this.zzG.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                try {
                    try {
                        if (zzupVar.equals(this.zzG.zzb)) {
                            zzkn zzknVarZzm = this.zzs.zzm();
                            if (zzknVarZzm == null || !zzknVarZzm.zze || jLongValue == j8) {
                                jZzk = jLongValue;
                            } else {
                                zzun zzunVar = zzknVarZzm.zza;
                                long j14 = zzbdVar.zzm;
                                if (this.zzC && j14 != -9223372036854775807L) {
                                    Double d7 = this.zzB.zzc;
                                }
                                jZzk = zzunVar.zzk(jLongValue, this.zzA);
                            }
                            if (zzeo.zzp(jZzk) == zzeo.zzp(this.zzG.zzs) && ((i7 = (zzldVar2 = this.zzG).zze) == 2 || i7 == 3)) {
                                jLongValue = zzldVar2.zzs;
                            }
                            this.zzG = zzao(zzupVar4, j12, j11, j12, z11, 2);
                        }
                        jZzk = jLongValue;
                        zzag(zzbeVar, zzupVar3, zzbeVar, zzldVar.zzb, j10, true);
                        zzupVar4 = zzupVar3;
                        j11 = j10;
                        j12 = jZzS;
                        z11 = z10;
                        this.zzG = zzao(zzupVar4, j12, j11, j12, z11, 2);
                    } catch (Throwable th) {
                        th = th;
                        zzupVar2 = zzupVar3;
                        j7 = j10;
                        j9 = jZzS;
                        z9 = z10;
                        this.zzG = zzao(zzupVar2, j9, j7, j9, z9, 2);
                        throw th;
                    }
                    zzldVar = this.zzG;
                    zzbeVar = zzldVar.zza;
                    zzupVar3 = zzupVar;
                    j10 = j7;
                } catch (Throwable th2) {
                    th = th2;
                    zzupVar2 = zzupVar;
                }
                this.zzD = this.zzC;
                jZzS = zzS(zzupVar, jZzk, this.zzG.zze == 4);
                z10 = z8 | (jLongValue != jZzS);
            }
            z11 = z8;
            zzupVar4 = zzupVar;
            j12 = jLongValue;
            j11 = j7;
            this.zzG = zzao(zzupVar4, j12, j11, j12, z11, 2);
        } catch (Throwable th3) {
            th = th3;
            zzupVar2 = zzupVar;
            z9 = z8;
            j9 = jLongValue;
        }
    }

    private final long zzS(zzup zzupVar, long j7, boolean z7) {
        zzkq zzkqVar = this.zzs;
        return zzT(zzupVar, j7, zzkqVar.zzm() != zzkqVar.zzn(), z7);
    }

    private final long zzT(zzup zzupVar, long j7, boolean z7, boolean z8) throws zzhz {
        zzK();
        zzaC(false, true);
        if (z8 || this.zzG.zze == 3) {
            zzB(2);
        }
        zzkq zzkqVar = this.zzs;
        zzkn zzknVarZzm = zzkqVar.zzm();
        zzkn zzknVarZzp = zzknVarZzm;
        while (zzknVarZzp != null && !zzupVar.equals(zzknVarZzp.zzg.zza)) {
            zzknVarZzp = zzknVarZzp.zzp();
        }
        if (z7 || zzknVarZzm != zzknVarZzp || (zzknVarZzp != null && zzknVarZzp.zza() + j7 < 0)) {
            zzaa();
            if (zzknVarZzp != null) {
                while (zzkqVar.zzm() != zzknVarZzp) {
                    zzkqVar.zzr();
                }
                zzkqVar.zzs(zzknVarZzp);
                zzknVarZzp.zzb(1000000000000L);
                zzap();
                zzknVarZzp.zzh = true;
            }
        }
        zzab();
        if (zzknVarZzp != null) {
            zzkqVar.zzs(zzknVarZzp);
            if (!zzknVarZzp.zze) {
                zzknVarZzp.zzg = zzknVarZzp.zzg.zza(j7);
            } else if (zzknVarZzp.zzf) {
                zzun zzunVar = zzknVarZzp.zza;
                j7 = zzunVar.zzj(j7);
                zzunVar.zzf(j7 - this.zzn, false);
            }
            zzU(j7);
            zzam();
        } else {
            zzkqVar.zzv();
            zzU(j7);
        }
        zzas(false);
        this.zzi.zzh(2);
        return j7;
    }

    private final void zzU(long j7) {
        zzkn zzknVarZzm = this.zzs.zzm();
        long jZza = j7 + (zzknVarZzm == null ? 1000000000000L : zzknVarZzm.zza());
        this.zzT = jZza;
        this.zzo.zzc(jZza);
        zzlp[] zzlpVarArr = this.zzb;
        for (int i7 = 0; i7 < 2; i7++) {
            zzlpVarArr[i7].zzE(zzknVarZzm, this.zzT);
        }
        for (zzkn zzknVarZzm2 = r0.zzm(); zzknVarZzm2 != null; zzknVarZzm2 = zzknVarZzm2.zzp()) {
            for (zzyf zzyfVar : zzknVarZzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() {
        int i7 = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i7 >= 2) {
                return;
            }
            zzlpVarArr[i7].zzz(this.zzC ? this.zzB : null);
            i7++;
        }
    }

    private final void zzW(boolean z7, boolean z8) {
        zzX(z7 || !this.zzQ, false, true, false);
        this.zzH.zza(z8 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[PHI: r2 r7 r9
      0x0094: PHI (r2v2 com.google.android.gms.internal.ads.zzup) = (r2v1 com.google.android.gms.internal.ads.zzup), (r2v11 com.google.android.gms.internal.ads.zzup) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r9v2 long) = (r9v1 long), (r9v7 long) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8 A[PHI: r3
      0x00d8: PHI (r3v3 com.google.android.gms.internal.ads.zzbe) = 
      (r3v2 com.google.android.gms.internal.ads.zzbe)
      (r3v2 com.google.android.gms.internal.ads.zzbe)
      (r3v12 com.google.android.gms.internal.ads.zzbe)
      (r3v12 com.google.android.gms.internal.ads.zzbe)
     binds: [B:31:0x00a1, B:33:0x00a5, B:35:0x00b6, B:37:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzX(boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        zzup zzupVar;
        zzbe zzbeVar;
        this.zzi.zzk(2);
        this.zzD = false;
        this.zzE = null;
        this.zzX = null;
        zzaC(false, true);
        this.zzo.zzb();
        this.zzT = 1000000000000L;
        try {
            zzaa();
        } catch (zzhz | RuntimeException e7) {
            zzds.zzf("ExoPlayerImplInternal", "Disable failed.", e7);
        }
        if (z7) {
            zzlp[] zzlpVarArr = this.zzb;
            for (int i7 = 0; i7 < 2; i7++) {
                try {
                    zzlpVarArr[i7].zzF();
                } catch (RuntimeException e8) {
                    zzds.zzf("ExoPlayerImplInternal", "Reset failed.", e8);
                }
            }
        }
        this.zzR = 0;
        zzld zzldVar = this.zzG;
        zzup zzupVar2 = zzldVar.zzb;
        long jLongValue = zzldVar.zzs;
        long j7 = (this.zzG.zzb.zzb() || zzaB(this.zzG, this.zzm)) ? this.zzG.zzc : this.zzG.zzs;
        if (z8) {
            this.zzS = null;
            Pair pairZzY = zzY(this.zzG.zza);
            zzupVar2 = (zzup) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            j7 = -9223372036854775807L;
            z11 = zzupVar2.equals(this.zzG.zzb) ? false : true;
        }
        long j8 = jLongValue;
        long j9 = j7;
        zzkq zzkqVar = this.zzs;
        zzkqVar.zzv();
        this.zzN = false;
        zzbe zzbeVarZzx = this.zzG.zza;
        if (z9 && (zzbeVarZzx instanceof zzlj)) {
            zzbeVarZzx = ((zzlj) zzbeVarZzx).zzx(this.zzt.zzq());
            if (zzupVar2.zzb != -1) {
                Object obj = zzupVar2.zza;
                zzbc zzbcVar = this.zzm;
                zzbeVarZzx.zzo(obj, zzbcVar);
                zzbd zzbdVar = this.zzl;
                zzbeVarZzx.zzb(zzbcVar.zzc, zzbdVar, 0L);
                if (zzbdVar.zzb()) {
                    zzbeVar = zzbeVarZzx;
                    zzupVar = new zzup(obj, zzupVar2.zzd);
                } else {
                    zzupVar = zzupVar2;
                    zzbeVar = zzbeVarZzx;
                }
            } else {
                zzupVar = zzupVar2;
                zzbeVar = zzbeVarZzx;
            }
        } else {
            zzupVar = zzupVar2;
            zzbeVar = zzbeVarZzx;
        }
        zzld zzldVar2 = this.zzG;
        int i8 = zzldVar2.zze;
        zzhz zzhzVar = z10 ? null : zzldVar2.zzf;
        zzwq zzwqVar = z11 ? zzwq.zza : zzldVar2.zzh;
        zzyn zzynVar = z11 ? this.zzf : zzldVar2.zzi;
        List listZzi = z11 ? zzgjz.zzi() : zzldVar2.zzj;
        zzld zzldVar3 = this.zzG;
        this.zzG = new zzld(zzbeVar, zzupVar, j9, j8, i8, zzhzVar, false, zzwqVar, zzynVar, listZzi, zzupVar, zzldVar3.zzl, zzldVar3.zzm, zzldVar3.zzn, zzldVar3.zzo, j8, 0L, j8, 0L, false);
        if (z9) {
            zzkqVar.zzj();
            this.zzt.zzf();
        }
    }

    private final Pair zzY(zzbe zzbeVar) {
        long j7 = 0;
        if (zzbeVar.zzg()) {
            return Pair.create(zzld.zzb(), 0L);
        }
        int iZzk = zzbeVar.zzk(this.zzP);
        zzbd zzbdVar = this.zzl;
        zzbc zzbcVar = this.zzm;
        Pair pairZzm = zzbeVar.zzm(zzbdVar, zzbcVar, iZzk, -9223372036854775807L);
        zzup zzupVarZzy = this.zzs.zzy(zzbeVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzupVarZzy.zzb()) {
            zzbeVar.zzo(zzupVarZzy.zza, zzbcVar);
            if (zzupVarZzy.zzc == zzbcVar.zzd(zzupVarZzy.zzb)) {
                zzbcVar.zzj();
            }
        } else {
            j7 = jLongValue;
        }
        return Pair.create(zzupVarZzy, Long.valueOf(j7));
    }

    private final void zzZ(zzbe zzbeVar, zzbe zzbeVar2) {
        if (zzbeVar.zzg() && zzbeVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzkb) arrayList.get(size)).zzb;
            String str = zzeo.zza;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z7 = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzld zzldVar, zzbc zzbcVar) {
        zzup zzupVar = zzldVar.zzb;
        zzbe zzbeVar = zzldVar.zza;
        return zzbeVar.zzg() || zzbeVar.zzo(zzupVar.zza, zzbcVar).zzf;
    }

    private final void zzaC(boolean z7, boolean z8) {
        this.zzL = z7;
        long jElapsedRealtime = -9223372036854775807L;
        if (z7 && !z8) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzM = jElapsedRealtime;
    }

    private static Pair zzaD(zzbe zzbeVar, zzke zzkeVar, boolean z7, int i7, boolean z8, zzbd zzbdVar, zzbc zzbcVar) {
        zzbe zzbeVar2;
        zzbe zzbeVar3 = zzkeVar.zza;
        if (zzbeVar.zzg()) {
            return null;
        }
        if (true == zzbeVar3.zzg()) {
            zzbeVar2 = zzbeVar3;
            zzbeVar2 = zzbeVar;
        }
        try {
            zzbeVar2 = zzbeVar3;
            Pair pairZzm = zzbeVar2.zzm(zzbdVar, zzbcVar, zzkeVar.zzb, zzkeVar.zzc);
            zzbe zzbeVar4 = zzbeVar2;
            if (zzbeVar.equals(zzbeVar4)) {
                return pairZzm;
            }
            if (zzbeVar.zze(pairZzm.first) != -1) {
                return (zzbeVar4.zzo(pairZzm.first, zzbcVar).zzf && zzbeVar4.zzb(zzbcVar.zzc, zzbdVar, 0L).zzn == zzbeVar4.zze(pairZzm.first)) ? zzbeVar.zzm(zzbdVar, zzbcVar, zzbeVar.zzo(pairZzm.first, zzbcVar).zzc, zzkeVar.zzc) : pairZzm;
            }
            int iZzr = zzr(zzbdVar, zzbcVar, i7, z8, pairZzm.first, zzbeVar4, zzbeVar);
            if (iZzr != -1) {
                return zzbeVar.zzm(zzbdVar, zzbcVar, iZzr, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private static final void zzaE(zzlh zzlhVar) {
        zzlhVar.zzh();
        try {
            zzlhVar.zza().zzx(zzlhVar.zzc(), zzlhVar.zze());
        } finally {
            zzlhVar.zzi(true);
        }
    }

    private static final boolean zzaF(zzkn zzknVar) {
        if (zzknVar != null) {
            try {
                if (zzknVar.zze) {
                    zzwf[] zzwfVarArr = zzknVar.zzc;
                    for (int i7 = 0; i7 < 2; i7++) {
                        zzwf zzwfVar = zzwfVarArr[i7];
                        if (zzwfVar != null) {
                            zzwfVar.zzc();
                        }
                    }
                } else {
                    zzknVar.zza.zzc();
                }
                if (zzknVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() {
        int i7 = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzb;
            if (i7 >= 2) {
                this.zzaa = -9223372036854775807L;
                return;
            }
            int iZzd = zzlpVarArr[i7].zzd();
            zzlpVarArr[i7].zzA(this.zzo);
            zzN(i7, false);
            this.zzR -= iZzd;
            i7++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzlp[] zzlpVarArr = this.zzb;
            for (int i7 = 0; i7 < 2; i7++) {
                zzlp zzlpVar = zzlpVarArr[i7];
                int iZzd = zzlpVar.zzd();
                zzlpVar.zzC(this.zzo);
                this.zzR -= iZzd - zzlpVar.zzd();
            }
            this.zzaa = -9223372036854775807L;
        }
    }

    private final void zzac() throws zzhz {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zzhz {
        zzyn zzynVarZzk;
        zzyn zzynVar;
        boolean z7;
        zzkf zzkfVar;
        int i7;
        int i8;
        zzhx zzhxVar = this.zzo;
        float f7 = zzhxVar.zzj().zzb;
        zzkq zzkqVar = this.zzs;
        zzkn zzknVarZzm = zzkqVar.zzm();
        zzkn zzknVarZzn = zzkqVar.zzn();
        zzyn zzynVar2 = null;
        boolean z8 = true;
        loop0: while (true) {
            if (zzknVarZzm == null || !zzknVarZzm.zze) {
                return;
            }
            zzld zzldVar = this.zzG;
            zzynVarZzk = zzknVarZzm.zzk(f7, zzldVar.zza, zzldVar.zzl);
            zzynVar = zzknVarZzm == zzkqVar.zzm() ? zzynVarZzk : zzynVar2;
            zzyn zzynVarZzr = zzknVarZzm.zzr();
            z7 = false;
            if (zzynVarZzr == null) {
                break;
            }
            zzyf[] zzyfVarArr = zzynVarZzk.zzc;
            if (zzynVarZzr.zzc.length != zzyfVarArr.length) {
                break;
            }
            for (int i9 = 0; i9 < zzyfVarArr.length; i9++) {
                if (!zzynVarZzk.zzb(zzynVarZzr, i9)) {
                    break loop0;
                }
            }
            if (zzknVarZzm != zzknVarZzn) {
                z7 = true;
            }
            z8 &= z7;
            zzknVarZzm = zzknVarZzm.zzp();
            zzynVar2 = zzynVar;
        }
        if (z8) {
            zzkn zzknVarZzm2 = zzkqVar.zzm();
            int iZzs = zzkqVar.zzs(zzknVarZzm2) & 1;
            zzlp[] zzlpVarArr = this.zzb;
            boolean[] zArr = new boolean[2];
            zzynVar.getClass();
            long jZzm = zzknVarZzm2.zzm(zzynVar, this.zzG.zzs, 1 == iZzs, zArr);
            zzld zzldVar2 = this.zzG;
            if (zzldVar2.zze != 4 && jZzm != zzldVar2.zzs) {
                z7 = true;
            }
            zzld zzldVar3 = this.zzG;
            i7 = 4;
            i8 = 2;
            zzkfVar = this;
            zzkfVar.zzG = zzao(zzldVar3.zzb, jZzm, zzldVar3.zzc, zzldVar3.zzd, z7, 5);
            if (z7) {
                zzkfVar.zzU(jZzm);
            }
            zzkfVar.zzab();
            boolean[] zArr2 = new boolean[2];
            int i10 = 0;
            while (i10 < 2) {
                int iZzd = zzlpVarArr[i10].zzd();
                zArr2[i10] = zzlpVarArr[i10].zzL();
                zzhx zzhxVar2 = zzhxVar;
                zzlpVarArr[i10].zzD(zzknVarZzm2.zzc[i10], zzhxVar2, zzkfVar.zzT, zArr[i10]);
                if (iZzd - zzlpVarArr[i10].zzd() > 0) {
                    zzkfVar.zzN(i10, false);
                }
                zzkfVar.zzR -= iZzd - zzlpVarArr[i10].zzd();
                i10++;
                zzhxVar = zzhxVar2;
            }
            zzkfVar.zzaq(zArr2, zzkfVar.zzT);
            zzknVarZzm2.zzh = true;
        } else {
            zzkfVar = this;
            i7 = 4;
            i8 = 2;
            zzkqVar.zzs(zzknVarZzm);
            if (zzknVarZzm.zze) {
                long jMax = Math.max(zzknVarZzm.zzg.zzb, zzkfVar.zzT - zzknVarZzm.zza());
                if (zzkfVar.zzy && zzkfVar.zzaz() && zzkqVar.zzo() == zzknVarZzm) {
                    zzkfVar.zzab();
                }
                zzknVarZzm.zzl(zzynVarZzk, jMax, false);
            }
        }
        zzkfVar.zzas(true);
        if (zzkfVar.zzG.zze != i7) {
            zzkfVar.zzam();
            zzkfVar.zzL();
            zzkfVar.zzi.zzh(i8);
        }
    }

    private final boolean zzae() {
        zzkn zzknVarZzm = this.zzs.zzm();
        long j7 = zzknVarZzm.zzg.zze;
        if (zzknVarZzm.zze) {
            return j7 == -9223372036854775807L || this.zzG.zzs < j7 || !zzax();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x027b  */
    /* JADX WARN: Code duplicated, block: B:128:0x027e A[Catch: all -> 0x02dc, TryCatch #6 {all -> 0x02dc, blocks: (B:125:0x0273, B:129:0x0287, B:128:0x027e), top: B:235:0x0273 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0293  */
    /* JADX WARN: Code duplicated, block: B:134:0x0298 A[Catch: all -> 0x02a3, TRY_LEAVE, TryCatch #2 {all -> 0x02a3, blocks: (B:131:0x028d, B:134:0x0298), top: B:227:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:143:0x02be  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ca A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x02cd A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x02e1 A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x02ea A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x02f2 A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02fc A[Catch: all -> 0x02c3, TryCatch #1 {all -> 0x02c3, blocks: (B:144:0x02bf, B:147:0x02ca, B:149:0x02cd, B:157:0x02e1, B:159:0x02ea, B:161:0x02f2, B:163:0x02fc, B:164:0x0307, B:165:0x030c), top: B:226:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0318  */
    /* JADX WARN: Code duplicated, block: B:169:0x031b  */
    /* JADX WARN: Code duplicated, block: B:174:0x032d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0337 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x034b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0357  */
    /* JADX WARN: Code duplicated, block: B:187:0x035c  */
    /* JADX WARN: Code duplicated, block: B:191:0x037d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0392  */
    /* JADX WARN: Code duplicated, block: B:197:0x0395  */
    /* JADX WARN: Code duplicated, block: B:200:0x039f  */
    /* JADX WARN: Code duplicated, block: B:204:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:206:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:215:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:217:0x03df  */
    /* JADX WARN: Code duplicated, block: B:221:0x0400  */
    /* JADX WARN: Code duplicated, block: B:227:0x028d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0259 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0273 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zzaf(zzbe zzbeVar, boolean z7) throws Throwable {
        zzup zzupVar;
        zzbd zzbdVar;
        Object obj;
        long j7;
        long j8;
        long j9;
        int i7;
        long jMax;
        boolean z8;
        boolean z9;
        char c7;
        int iZzk;
        boolean z10;
        long jLongValue;
        zzup zzupVarZzb;
        boolean z11;
        char c8;
        int i8;
        long jLongValue2;
        Object obj2;
        int iZzk2;
        char c9;
        Object obj3;
        char c10;
        boolean z12;
        boolean z13;
        zzbe zzbeVar2;
        zzup zzupVar2;
        Object obj4;
        long j10;
        zzup zzupVar3;
        Object obj5;
        boolean z14;
        int i9;
        zzlp[] zzlpVarArr;
        int i10;
        zzkq zzkqVar;
        long jZzah;
        long jZzah2;
        int iZzw;
        long j11;
        zzup zzupVar4;
        zzbe zzbeVar3;
        Object obj6;
        boolean z15;
        int i11;
        zzkq zzkqVar2;
        zzkn zzknVarZzm;
        zzld zzldVar = this.zzG;
        zzke zzkeVar = this.zzS;
        int i12 = this.zzO;
        boolean z16 = this.zzP;
        char c11 = 4;
        long jZzS = 0;
        int i13 = -1;
        if (zzbeVar.zzg()) {
            zzbeVar = zzbeVar;
            zzupVarZzb = zzld.zzb();
            z11 = false;
            c8 = 0;
            z9 = true;
            j7 = -9223372036854775807L;
            j9 = -9223372036854775807L;
        } else {
            zzbc zzbcVar = this.zzm;
            zzup zzupVar5 = zzldVar.zzb;
            Object obj7 = zzupVar5.zza;
            boolean zZzaB = zzaB(zzldVar, zzbcVar);
            long j12 = (zzupVar5.zzb() || zZzaB) ? zzldVar.zzc : zzldVar.zzs;
            zzbd zzbdVar2 = this.zzl;
            if (zzkeVar != null) {
                zzupVar = zzupVar5;
                obj = obj7;
                j7 = -9223372036854775807L;
                zzbeVar = zzbeVar;
                Pair pairZzaD = zzaD(zzbeVar, zzkeVar, true, i12, z16, zzbdVar2, zzbcVar);
                if (pairZzaD == null) {
                    iZzk2 = zzbeVar.zzk(z16);
                    obj3 = obj;
                    jLongValue2 = j12;
                    z12 = false;
                    z13 = true;
                    c10 = 0;
                } else {
                    if (zzkeVar.zzc == -9223372036854775807L) {
                        iZzk2 = zzbeVar.zzo(pairZzaD.first, zzbcVar).zzc;
                        obj2 = obj;
                        jLongValue2 = j12;
                        c9 = 0;
                    } else {
                        Object obj8 = pairZzaD.first;
                        jLongValue2 = ((Long) pairZzaD.second).longValue();
                        obj2 = obj8;
                        iZzk2 = -1;
                        c9 = 1;
                    }
                    obj3 = obj2;
                    c10 = c9;
                    z12 = zzldVar.zze == 4;
                    z13 = false;
                }
                i7 = iZzk2;
                zzbdVar = zzbdVar2;
                obj = obj3;
                j9 = jLongValue2;
                zzbcVar = zzbcVar;
                char c12 = c10;
                z8 = z12;
                z9 = z13;
                c7 = c12;
                j8 = j12;
            } else {
                zzupVar = zzupVar5;
                zzbdVar = zzbdVar2;
                obj = obj7;
                j7 = -9223372036854775807L;
                zzbeVar = zzbeVar;
                zzbe zzbeVar4 = zzldVar.zza;
                if (zzbeVar4.zzg()) {
                    iZzk = zzbeVar.zzk(z16);
                } else if (zzbeVar.zze(obj) == -1) {
                    int iZzr = zzr(zzbdVar, zzbcVar, i12, z16, obj, zzbeVar4, zzbeVar);
                    if (iZzr == -1) {
                        zzbdVar = zzbdVar;
                        zzbeVar = zzbeVar;
                        obj = obj;
                        iZzr = zzbeVar.zzk(z16);
                        z10 = true;
                    } else {
                        zzbdVar = zzbdVar;
                        zzbeVar = zzbeVar;
                        obj = obj;
                        z10 = false;
                    }
                    i7 = iZzr;
                    zzbcVar = zzbcVar;
                    obj = obj;
                    j8 = j12;
                    j9 = j8;
                    z8 = false;
                    c7 = 0;
                    z9 = z10;
                } else if (j12 == -9223372036854775807L) {
                    iZzk = zzbeVar.zzo(obj, zzbcVar).zzc;
                } else if (zZzaB) {
                    zzbeVar4.zzo(obj, zzbcVar);
                    if (zzbeVar4.zzb(zzbcVar.zzc, zzbdVar, 0L).zzn == zzbeVar4.zze(obj)) {
                        zzbcVar = zzbcVar;
                        Pair pairZzm = zzbeVar.zzm(zzbdVar, zzbcVar, zzbeVar.zzo(obj, zzbcVar).zzc, j12);
                        j8 = j12;
                        obj = pairZzm.first;
                        jMax = ((Long) pairZzm.second).longValue();
                    } else {
                        zzbcVar = zzbcVar;
                        j8 = j12;
                        if (zzbeVar.zzo(obj, zzbcVar).zzd != -9223372036854775807L) {
                            long j13 = zzbcVar.zzd - 1;
                            String str = zzeo.zza;
                            jMax = Math.max(0L, Math.min(j8, j13));
                        } else {
                            jMax = j8;
                        }
                        obj = obj;
                    }
                    i7 = -1;
                    j9 = jMax;
                    z8 = false;
                    z9 = false;
                    c7 = 1;
                } else {
                    j8 = j12;
                    j9 = j8;
                    i7 = -1;
                    z8 = false;
                    z9 = false;
                    c7 = 0;
                }
                i7 = iZzk;
                j8 = j12;
                j9 = j8;
                z8 = false;
                z9 = false;
                c7 = 0;
            }
            if (i7 != -1) {
                Pair pairZzm2 = zzbeVar.zzm(zzbdVar, zzbcVar, i7, -9223372036854775807L);
                obj = pairZzm2.first;
                jLongValue = ((Long) pairZzm2.second).longValue();
                j9 = j7;
            } else {
                jLongValue = j9;
            }
            zzup zzupVarZzy = this.zzs.zzy(zzbeVar, obj, jLongValue);
            int i14 = zzupVarZzy.zze;
            boolean z17 = obj.equals(obj) && !zzupVar.zzb() && !zzupVarZzy.zzb() && (i14 == -1 || ((i8 = zzupVar.zze) != -1 && i14 >= i8));
            zzbc zzbcVarZzo = zzbeVar.zzo(obj, zzbcVar);
            if (!zZzaB && j8 == j9 && obj.equals(zzupVarZzy.zza)) {
                if (zzupVar.zzb()) {
                    zzbcVarZzo.zzk(zzupVar.zzb);
                }
                if (zzupVarZzy.zzb()) {
                    zzbcVarZzo.zzk(zzupVarZzy.zzb);
                }
            }
            if (true == z17) {
                zzupVarZzy = zzupVar;
            }
            if (zzupVarZzy.zzb()) {
                if (zzupVarZzy.equals(zzupVar)) {
                    jLongValue = zzldVar.zzs;
                } else {
                    zzbeVar.zzo(zzupVarZzy.zza, zzbcVar);
                    if (zzupVarZzy.zzc == zzbcVar.zzd(zzupVarZzy.zzb)) {
                        zzbcVar.zzj();
                    }
                    jLongValue = 0;
                }
            }
            zzupVarZzb = zzupVarZzy;
            jZzS = jLongValue;
            z11 = z8;
            c8 = c7;
        }
        boolean z18 = (this.zzG.zzb.equals(zzupVarZzb) && jZzS == this.zzG.zzs) ? false : true;
        i13 = 2;
        if (!z9) {
            zzlpVarArr = this.zzb;
            for (i10 = 0; i10 < 2; i10++) {
                zzlpVarArr[i10].zzn(zzbeVar);
            }
            if (z18) {
                i13 = 2;
                c11 = 1;
                if (!zzbeVar.zzg()) {
                    zzkqVar2 = this.zzs;
                    for (zzknVarZzm = zzkqVar2.zzm(); zzknVarZzm != null; zzknVarZzm = zzknVarZzm.zzp()) {
                        if (zzknVarZzm.zzg.zza.equals(zzupVarZzb)) {
                            zzknVarZzm.zzg = zzkqVar2.zzx(zzbeVar, zzknVarZzm.zzg);
                            zzknVarZzm.zzs();
                        }
                    }
                    jZzS = zzS(zzupVarZzb, jZzS, z11);
                }
            } else {
                zzkqVar = this.zzs;
                if (zzkqVar.zzn() == null) {
                    jZzah = 0;
                } else {
                    jZzah = zzah(zzkqVar.zzn());
                }
                if (!zzaz()) {
                    jZzah2 = 0;
                } else if (zzkqVar.zzo() == null) {
                    jZzah2 = 0;
                } else {
                    jZzah2 = zzah(zzkqVar.zzo());
                }
                i13 = i13;
                c11 = 1;
                iZzw = zzkqVar.zzw(zzbeVar, this.zzT, jZzah, jZzah2);
                zzbeVar = zzbeVar;
                if ((iZzw & 1) != 0) {
                    zzI(false);
                } else if ((iZzw & i13) != 0) {
                    zzab();
                }
            }
            zzld zzldVar2 = this.zzG;
            zzbe zzbeVar5 = zzldVar2.zza;
            zzup zzupVar6 = zzldVar2.zzb;
            if (c11 != c8) {
                j11 = j7;
            } else {
                j11 = jZzS;
            }
            zzupVar4 = zzupVarZzb;
            zzag(zzbeVar, zzupVar4, zzbeVar5, zzupVar6, j11, false);
            zzbeVar3 = zzbeVar;
            if (z18) {
                zzld zzldVar3 = this.zzG;
                obj6 = zzldVar3.zzb.zza;
                zzbe zzbeVar6 = zzldVar3.zza;
                if (z18) {
                    z15 = 0;
                } else {
                    z15 = 0;
                }
                long j14 = this.zzG.zzd;
                if (zzbeVar3.zze(obj6) == -1) {
                    i11 = 4;
                } else {
                    i11 = 3;
                }
                this.zzG = zzao(zzupVar4, jZzS, j9, j14, z15, i11);
            } else {
                zzld zzldVar4 = this.zzG;
                obj6 = zzldVar4.zzb.zza;
                zzbe zzbeVar7 = zzldVar4.zza;
                if (z18) {
                    z15 = 0;
                } else {
                    z15 = 0;
                }
                long j15 = this.zzG.zzd;
                if (zzbeVar3.zze(obj6) == -1) {
                    i11 = 4;
                } else {
                    i11 = 3;
                }
                this.zzG = zzao(zzupVar4, jZzS, j9, j15, z15, i11);
            }
            zzaj();
            zzZ(zzbeVar3, this.zzG.zza);
            this.zzG = this.zzG.zzd(zzbeVar3);
            if (!zzbeVar3.zzg()) {
                this.zzS = null;
            }
            zzas(false);
            this.zzi.zzh(i13);
            return;
        }
        try {
            if (this.zzG.zze != 1) {
                try {
                    zzB(4);
                } catch (Throwable th) {
                    th = th;
                    zzup zzupVar7 = zzupVarZzb;
                    zzbeVar2 = zzbeVar;
                    zzupVar2 = zzupVar7;
                    obj4 = null;
                    i13 = 2;
                    c11 = 1;
                }
            }
            zzX(false, false, false, true);
            zzlpVarArr = this.zzb;
            while (i10 < 2) {
                try {
                    zzlpVarArr[i10].zzn(zzbeVar);
                } catch (Throwable th2) {
                    th = th2;
                    zzup zzupVar8 = zzupVarZzb;
                    zzbeVar2 = zzbeVar;
                    zzupVar2 = zzupVar8;
                    obj4 = null;
                    i13 = 2;
                    c11 = 1;
                }
            }
            try {
                if (z18) {
                    try {
                        zzkqVar = this.zzs;
                        if (zzkqVar.zzn() == null) {
                            jZzah = 0;
                        } else {
                            jZzah = zzah(zzkqVar.zzn());
                        }
                        if (!zzaz()) {
                            try {
                                if (zzkqVar.zzo() == null) {
                                    jZzah2 = 0;
                                } else {
                                    jZzah2 = zzah(zzkqVar.zzo());
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                obj4 = null;
                                i13 = 2;
                                zzupVar2 = zzupVarZzb;
                                c11 = 1;
                                zzbeVar2 = zzbeVar;
                            }
                        } else {
                            jZzah2 = 0;
                        }
                        try {
                            i13 = i13;
                            c11 = 1;
                            try {
                                iZzw = zzkqVar.zzw(zzbeVar, this.zzT, jZzah, jZzah2);
                                zzbeVar = zzbeVar;
                                if ((iZzw & 1) != 0) {
                                    zzI(false);
                                } else if ((iZzw & i13) != 0) {
                                    zzab();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                zzbeVar = zzbeVar;
                                zzup zzupVar9 = zzupVarZzb;
                                zzbeVar2 = zzbeVar;
                                zzupVar2 = zzupVar9;
                                obj4 = null;
                                zzld zzldVar5 = this.zzG;
                                zzbe zzbeVar8 = zzldVar5.zza;
                                zzup zzupVar10 = zzldVar5.zzb;
                                if (c11 != c8) {
                                    j10 = j7;
                                } else {
                                    j10 = jZzS;
                                }
                                zzupVar3 = zzupVar2;
                                zzag(zzbeVar2, zzupVar3, zzbeVar8, zzupVar10, j10, false);
                                if (z18) {
                                    zzld zzldVar6 = this.zzG;
                                    obj5 = zzldVar6.zzb.zza;
                                    zzbe zzbeVar9 = zzldVar6.zza;
                                    if (z18) {
                                        z14 = 0;
                                    } else {
                                        z14 = 0;
                                    }
                                    long j16 = this.zzG.zzd;
                                    if (zzbeVar2.zze(obj5) == -1) {
                                        i9 = 4;
                                    } else {
                                        i9 = 3;
                                    }
                                    this.zzG = zzao(zzupVar3, jZzS, j9, j16, z14, i9);
                                } else {
                                    zzld zzldVar7 = this.zzG;
                                    obj5 = zzldVar7.zzb.zza;
                                    zzbe zzbeVar10 = zzldVar7.zza;
                                    if (z18) {
                                        z14 = 0;
                                    } else {
                                        z14 = 0;
                                    }
                                    long j17 = this.zzG.zzd;
                                    if (zzbeVar2.zze(obj5) == -1) {
                                        i9 = 4;
                                    } else {
                                        i9 = 3;
                                    }
                                    this.zzG = zzao(zzupVar3, jZzS, j9, j17, z14, i9);
                                }
                                zzaj();
                                zzZ(zzbeVar2, this.zzG.zza);
                                this.zzG = this.zzG.zzd(zzbeVar2);
                                if (!zzbeVar2.zzg()) {
                                    this.zzS = obj4;
                                }
                                zzas(false);
                                this.zzi.zzh(i13);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c11 = 1;
                            zzup zzupVar11 = zzupVarZzb;
                            zzbeVar2 = zzbeVar;
                            zzupVar2 = zzupVar11;
                            obj4 = null;
                            zzld zzldVar8 = this.zzG;
                            zzbe zzbeVar11 = zzldVar8.zza;
                            zzup zzupVar12 = zzldVar8.zzb;
                            if (c11 != c8) {
                                j10 = j7;
                            } else {
                                j10 = jZzS;
                            }
                            zzupVar3 = zzupVar2;
                            zzag(zzbeVar2, zzupVar3, zzbeVar11, zzupVar12, j10, false);
                            if (z18) {
                                zzld zzldVar9 = this.zzG;
                                obj5 = zzldVar9.zzb.zza;
                                zzbe zzbeVar12 = zzldVar9.zza;
                                if (z18) {
                                    z14 = 0;
                                } else {
                                    z14 = 0;
                                }
                                long j18 = this.zzG.zzd;
                                if (zzbeVar2.zze(obj5) == -1) {
                                    i9 = 4;
                                } else {
                                    i9 = 3;
                                }
                                this.zzG = zzao(zzupVar3, jZzS, j9, j18, z14, i9);
                            } else {
                                zzld zzldVar10 = this.zzG;
                                obj5 = zzldVar10.zzb.zza;
                                zzbe zzbeVar13 = zzldVar10.zza;
                                if (z18) {
                                    z14 = 0;
                                } else {
                                    z14 = 0;
                                }
                                long j19 = this.zzG.zzd;
                                if (zzbeVar2.zze(obj5) == -1) {
                                    i9 = 4;
                                } else {
                                    i9 = 3;
                                }
                                this.zzG = zzao(zzupVar3, jZzS, j9, j19, z14, i9);
                            }
                            zzaj();
                            zzZ(zzbeVar2, this.zzG.zza);
                            this.zzG = this.zzG.zzd(zzbeVar2);
                            if (!zzbeVar2.zzg()) {
                                this.zzS = obj4;
                            }
                            zzas(false);
                            this.zzi.zzh(i13);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } else {
                    i13 = 2;
                    c11 = 1;
                    if (!zzbeVar.zzg()) {
                        zzkqVar2 = this.zzs;
                        while (zzknVarZzm != null) {
                            if (zzknVarZzm.zzg.zza.equals(zzupVarZzb)) {
                                zzknVarZzm.zzg = zzkqVar2.zzx(zzbeVar, zzknVarZzm.zzg);
                                zzknVarZzm.zzs();
                            }
                        }
                        jZzS = zzS(zzupVarZzb, jZzS, z11);
                    }
                }
                zzld zzldVar11 = this.zzG;
                zzbe zzbeVar14 = zzldVar11.zza;
                zzup zzupVar13 = zzldVar11.zzb;
                if (c11 != c8) {
                    j11 = j7;
                } else {
                    j11 = jZzS;
                }
                zzupVar4 = zzupVarZzb;
                zzag(zzbeVar, zzupVar4, zzbeVar14, zzupVar13, j11, false);
                zzbeVar3 = zzbeVar;
                if (z18 || j9 != this.zzG.zzc) {
                    zzld zzldVar12 = this.zzG;
                    obj6 = zzldVar12.zzb.zza;
                    zzbe zzbeVar15 = zzldVar12.zza;
                    if (z18 || !z7 || zzbeVar15.zzg() || zzbeVar15.zzo(obj6, this.zzm).zzf) {
                        z15 = 0;
                    } else {
                        z15 = c11;
                    }
                    long j110 = this.zzG.zzd;
                    if (zzbeVar3.zze(obj6) == -1) {
                        i11 = 4;
                    } else {
                        i11 = 3;
                    }
                    this.zzG = zzao(zzupVar4, jZzS, j9, j110, z15, i11);
                }
                zzaj();
                zzZ(zzbeVar3, this.zzG.zza);
                this.zzG = this.zzG.zzd(zzbeVar3);
                if (!zzbeVar3.zzg()) {
                    this.zzS = null;
                }
                zzas(false);
                this.zzi.zzh(i13);
                return;
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            zzup zzupVar14 = zzupVarZzb;
            zzbeVar2 = zzbeVar;
            zzupVar2 = zzupVar14;
            obj4 = null;
            i13 = 2;
            c11 = 1;
        }
        zzld zzldVar13 = this.zzG;
        zzbe zzbeVar16 = zzldVar13.zza;
        zzup zzupVar15 = zzldVar13.zzb;
        if (c11 != c8) {
            j10 = j7;
        } else {
            j10 = jZzS;
        }
        zzupVar3 = zzupVar2;
        zzag(zzbeVar2, zzupVar3, zzbeVar16, zzupVar15, j10, false);
        if (z18 || j9 != this.zzG.zzc) {
            zzld zzldVar14 = this.zzG;
            obj5 = zzldVar14.zzb.zza;
            zzbe zzbeVar17 = zzldVar14.zza;
            if (z18 || !z7 || zzbeVar17.zzg() || zzbeVar17.zzo(obj5, this.zzm).zzf) {
                z14 = 0;
            } else {
                z14 = c11;
            }
            long j111 = this.zzG.zzd;
            if (zzbeVar2.zze(obj5) == -1) {
                i9 = 4;
            } else {
                i9 = 3;
            }
            this.zzG = zzao(zzupVar3, jZzS, j9, j111, z14, i9);
        }
        zzaj();
        zzZ(zzbeVar2, this.zzG.zza);
        this.zzG = this.zzG.zzd(zzbeVar2);
        if (!zzbeVar2.zzg()) {
            this.zzS = obj4;
        }
        zzas(false);
        this.zzi.zzh(i13);
        throw th;
    }

    private final void zzag(zzbe zzbeVar, zzup zzupVar, zzbe zzbeVar2, zzup zzupVar2, long j7, boolean z7) {
        if (!zzP(zzbeVar, zzupVar)) {
            zzau zzauVar = zzupVar.zzb() ? zzau.zza : this.zzG.zzo;
            if (this.zzo.zzj().equals(zzauVar)) {
                return;
            }
            zzM(zzauVar);
            zzal(this.zzG.zzo, zzauVar.zzb, false, false);
            return;
        }
        Object obj = zzupVar.zza;
        zzbc zzbcVar = this.zzm;
        int i7 = zzbeVar.zzo(obj, zzbcVar).zzc;
        zzbd zzbdVar = this.zzl;
        zzbeVar.zzb(i7, zzbdVar, 0L);
        zzht zzhtVar = this.zzad;
        zzae zzaeVar = zzbdVar.zzj;
        String str = zzeo.zza;
        zzhtVar.zza(zzaeVar);
        if (j7 != -9223372036854775807L) {
            zzhtVar.zzb(zzO(zzbeVar, obj, j7));
            return;
        }
        if (!Objects.equals(!zzbeVar2.zzg() ? zzbeVar2.zzb(zzbeVar2.zzo(zzupVar2.zza, zzbcVar).zzc, zzbdVar, 0L).zzb : null, zzbdVar.zzb) || z7) {
            zzhtVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzkn zzknVar) {
        if (zzknVar == null) {
            return 0L;
        }
        long jZza = zzknVar.zza();
        if (zzknVar.zze) {
            int i7 = 0;
            while (true) {
                zzlp[] zzlpVarArr = this.zzb;
                if (i7 >= 2) {
                    break;
                }
                if (zzlpVarArr[i7].zzp(zzknVar)) {
                    long jZzf = zzlpVarArr[i7].zzf(zzknVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i7++;
            }
        }
        return jZza;
    }

    private final void zzai() {
        zzkq zzkqVar = this.zzs;
        zzkqVar.zzt();
        zzkn zzknVarZzl = zzkqVar.zzl();
        if (zzknVarZzl != null) {
            if (!zzknVarZzl.zzd || zzknVarZzl.zze) {
                zzun zzunVar = zzknVarZzl.zza;
                if (zzunVar.zzn()) {
                    return;
                }
                if (this.zzg.zzi(this.zzG.zza, zzknVarZzl.zzg.zza, zzknVarZzl.zze ? zzunVar.zzi() : 0L)) {
                    if (!zzknVarZzl.zzd) {
                        zzknVarZzl.zzt(this, zzknVarZzl.zzg.zzb);
                        return;
                    }
                    zzkk zzkkVar = new zzkk();
                    zzkkVar.zza(this.zzT - zzknVarZzl.zza());
                    zzkkVar.zzb(this.zzo.zzj().zzb);
                    zzkkVar.zzc(this.zzM);
                    zzknVarZzl.zzj(new zzkl(zzkkVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzkn zzknVarZzm = this.zzs.zzm();
        boolean z7 = false;
        if (zzknVarZzm != null && zzknVarZzm.zzg.zzi && this.zzJ) {
            z7 = true;
        }
        this.zzK = z7;
    }

    private final void zzak(zzau zzauVar, boolean z7) {
        zzal(zzauVar, zzauVar.zzb, true, z7);
    }

    private final void zzal(zzau zzauVar, float f7, boolean z7, boolean z8) {
        int i7;
        if (z7) {
            if (z8) {
                this.zzH.zza(1);
            }
            zzld zzldVar = this.zzG;
            this.zzG = new zzld(zzldVar.zza, zzldVar.zzb, zzldVar.zzc, zzldVar.zzd, zzldVar.zze, zzldVar.zzf, zzldVar.zzg, zzldVar.zzh, zzldVar.zzi, zzldVar.zzj, zzldVar.zzk, zzldVar.zzl, zzldVar.zzm, zzldVar.zzn, zzauVar, zzldVar.zzq, zzldVar.zzr, zzldVar.zzs, zzldVar.zzt, false);
        }
        float f8 = zzauVar.zzb;
        zzkn zzknVarZzm = this.zzs.zzm();
        while (true) {
            i7 = 0;
            if (zzknVarZzm == null) {
                break;
            }
            zzyf[] zzyfVarArr = zzknVarZzm.zzr().zzc;
            int length = zzyfVarArr.length;
            while (i7 < length) {
                zzyf zzyfVar = zzyfVarArr[i7];
                i7++;
            }
            zzknVarZzm = zzknVarZzm.zzp();
        }
        zzlp[] zzlpVarArr = this.zzb;
        while (i7 < 2) {
            zzlpVarArr[i7].zzm(f7, f8);
            i7++;
        }
    }

    private final void zzam() {
        long jZza;
        long jZza2;
        zzkq zzkqVar = this.zzs;
        boolean zZzg = false;
        if (zzaF(zzkqVar.zzk())) {
            zzkn zzknVarZzk = zzkqVar.zzk();
            long jZzau = zzau(zzknVarZzk.zzg());
            if (zzknVarZzk == zzkqVar.zzm()) {
                jZza = this.zzT;
                jZza2 = zzknVarZzk.zza();
            } else {
                jZza = this.zzT - zzknVarZzk.zza();
                jZza2 = zzknVarZzk.zzg.zzb;
            }
            zzki zzkiVar = new zzki(this.zzv, this.zzG.zza, zzknVarZzk.zzg.zza, jZza - jZza2, jZzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzknVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM);
            zzkj zzkjVar = this.zzg;
            boolean zZzg2 = zzkjVar.zzg(zzkiVar);
            zzkn zzknVarZzm = zzkqVar.zzm();
            if (zZzg2 || !zzknVarZzm.zze || jZzau >= 500000 || this.zzn <= 0) {
                zZzg = zZzg2;
            } else {
                zzknVarZzm.zza.zzf(this.zzG.zzs, false);
                zZzg = zzkjVar.zzg(zzkiVar);
            }
        }
        this.zzN = zZzg;
        if (zZzg) {
            zzkn zzknVarZzk2 = zzkqVar.zzk();
            zzknVarZzk2.getClass();
            zzkk zzkkVar = new zzkk();
            zzkkVar.zza(this.zzT - zzknVarZzk2.zza());
            zzkkVar.zzb(this.zzo.zzj().zzb);
            zzkkVar.zzc(this.zzM);
            zzknVarZzk2.zzj(new zzkl(zzkkVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzkn zzknVarZzk = this.zzs.zzk();
        boolean z7 = true;
        if (!this.zzN && (zzknVarZzk == null || !zzknVarZzk.zza.zzn())) {
            z7 = false;
        }
        zzld zzldVar = this.zzG;
        if (z7 != zzldVar.zzg) {
            this.zzG = zzldVar.zzg(z7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    private final zzld zzao(zzup zzupVar, long j7, long j8, long j9, boolean z7, int i7) {
        List list;
        zzyn zzynVar;
        zzkn zzknVarZzm;
        int i8 = 0;
        this.zzW = (!this.zzW && j7 == this.zzG.zzs && zzupVar.equals(this.zzG.zzb)) ? false : true;
        zzaj();
        zzld zzldVar = this.zzG;
        zzwq zzwqVar = zzldVar.zzh;
        zzyn zzynVar2 = zzldVar.zzi;
        List listZzi = zzldVar.zzj;
        if (this.zzt.zzb()) {
            zzkq zzkqVar = this.zzs;
            zzkn zzknVarZzm2 = zzkqVar.zzm();
            zzwq zzwqVarZzq = zzknVarZzm2 == null ? zzwq.zza : zzknVarZzm2.zzq();
            zzyn zzynVarZzr = zzknVarZzm2 == null ? this.zzf : zzknVarZzm2.zzr();
            zzyf[] zzyfVarArr = zzynVarZzr.zzc;
            zzgjw zzgjwVar = new zzgjw();
            boolean z8 = false;
            for (zzyf zzyfVar : zzyfVarArr) {
                if (zzyfVar != null) {
                    zzao zzaoVar = zzyfVar.zzb(0).zzl;
                    if (zzaoVar == null) {
                        zzgjwVar.zzf(new zzao(-9223372036854775807L, new zzan[0]));
                    } else {
                        zzgjwVar.zzf(zzaoVar);
                        z8 = true;
                    }
                }
            }
            zzgjz zzgjzVarZzi = z8 ? zzgjwVar.zzi() : zzgjz.zzi();
            if (zzknVarZzm2 != null) {
                zzko zzkoVar = zzknVarZzm2.zzg;
                if (zzkoVar.zzc != j8) {
                    zzknVarZzm2.zzg = zzkoVar.zzb(j8);
                }
            }
            if (zzkqVar.zzm() == zzkqVar.zzn() && (zzknVarZzm = zzkqVar.zzm()) != null) {
                zzyn zzynVarZzr2 = zzknVarZzm.zzr();
                while (true) {
                    zzlp[] zzlpVarArr = this.zzb;
                    if (i8 >= 2) {
                        break;
                    }
                    if (zzynVarZzr2.zza(i8)) {
                        if (zzlpVarArr[i8].zze() != 1) {
                            break;
                        }
                        int i9 = zzynVarZzr2.zzb[i8].zzb;
                    }
                    i8++;
                }
            }
            list = zzgjzVarZzi;
            zzwqVar = zzwqVarZzq;
            zzynVar = zzynVarZzr;
        } else {
            if (!zzupVar.equals(this.zzG.zzb)) {
                zzynVar2 = this.zzf;
                zzwqVar = zzwq.zza;
                listZzi = zzgjz.zzi();
            }
            list = listZzi;
            zzynVar = zzynVar2;
        }
        if (z7) {
            this.zzH.zzc(i7);
        }
        return this.zzG.zzc(zzupVar, j7, j8, j9, zzat(), zzwqVar, zzynVar, list);
    }

    private final void zzap() throws zzhz {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j7) throws zzhz {
        zzlp[] zzlpVarArr;
        long j8;
        zzkn zzknVarZzn = this.zzs.zzn();
        zzyn zzynVarZzr = zzknVarZzn.zzr();
        int i7 = 0;
        while (true) {
            zzlpVarArr = this.zzb;
            if (i7 >= 2) {
                break;
            }
            if (!zzynVarZzr.zza(i7)) {
                zzlpVarArr[i7].zzF();
            }
            i7++;
        }
        int i8 = 0;
        while (i8 < 2) {
            if (!zzynVarZzr.zza(i8) || zzlpVarArr[i8].zzp(zzknVarZzn)) {
                j8 = j7;
            } else {
                j8 = j7;
                zzar(zzknVarZzn, i8, zArr[i8], j8);
            }
            i8++;
            j7 = j8;
        }
    }

    private final void zzar(zzkn zzknVar, int i7, boolean z7, long j7) throws zzhz {
        zzlp zzlpVar = this.zzb[i7];
        if (zzlpVar.zzL()) {
            return;
        }
        boolean z8 = zzknVar == this.zzs.zzm();
        zzyn zzynVarZzr = zzknVar.zzr();
        zzlo zzloVar = zzynVarZzr.zzb[i7];
        zzyf zzyfVar = zzynVarZzr.zzc[i7];
        boolean z9 = zzax() && this.zzG.zze == 3;
        boolean z10 = !z7 && z9;
        this.zzR++;
        zzlpVar.zzx(zzloVar, zzyfVar, zzknVar.zzc[i7], this.zzT, z10, z8, j7, zzknVar.zza(), zzknVar.zzg.zza, this.zzo);
        zzlpVar.zzy(11, new zzjt(this), zzknVar);
        if (z9 && z8) {
            zzlpVar.zzv();
        }
    }

    private final void zzas(boolean z7) {
        zzkn zzknVarZzk = this.zzs.zzk();
        zzup zzupVar = zzknVarZzk == null ? this.zzG.zzb : zzknVarZzk.zzg.zza;
        boolean zEquals = this.zzG.zzk.equals(zzupVar);
        if (!zEquals) {
            this.zzG = this.zzG.zzh(zzupVar);
        }
        zzld zzldVar = this.zzG;
        zzldVar.zzq = zzknVarZzk == null ? zzldVar.zzs : zzknVarZzk.zzf();
        this.zzG.zzr = zzat();
        if ((!zEquals || z7) && zzknVarZzk != null && zzknVarZzk.zze) {
            zzaw(zzknVarZzk.zzg.zza, zzknVarZzk.zzq(), zzknVarZzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j7) {
        zzkn zzknVarZzk = this.zzs.zzk();
        if (zzknVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j7 - (this.zzT - zzknVarZzk.zza()));
    }

    private final long zzav(zzkn zzknVar) {
        zzghc.zzh(zzknVar.zze);
        return (long) ((zzknVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzup zzupVar, zzwq zzwqVar, zzyn zzynVar) {
        long jZza;
        long jZza2;
        zzkq zzkqVar = this.zzs;
        zzkn zzknVarZzk = zzkqVar.zzk();
        zzknVarZzk.getClass();
        if (zzknVarZzk == zzkqVar.zzm()) {
            jZza = this.zzT;
            jZza2 = zzknVarZzk.zza();
        } else {
            jZza = this.zzT - zzknVarZzk.zza();
            jZza2 = zzknVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzki(this.zzv, this.zzG.zza, zzupVar, jZza - jZza2, zzau(zzknVarZzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzknVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM), zzwqVar, zzynVar.zzc);
    }

    private final boolean zzax() {
        zzld zzldVar = this.zzG;
        return zzldVar.zzl && zzldVar.zzn == 0;
    }

    private final void zzay(int i7) throws Throwable {
        zzlp zzlpVar = this.zzb[i7];
        try {
            zzkn zzknVarZzm = this.zzs.zzm();
            if (zzknVarZzm == null) {
                throw null;
            }
            zzlpVar.zzu(zzknVarZzm);
        } catch (IOException e7) {
            e = e7;
            zzlpVar.zze();
            throw e;
        } catch (RuntimeException e8) {
            e = e8;
            zzlpVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzlp[] zzlpVarArr = this.zzb;
        for (int i7 = 0; i7 < 2; i7++) {
            if (zzlpVarArr[i7].zzc()) {
                return true;
            }
        }
        return false;
    }

    static int zzr(zzbd zzbdVar, zzbc zzbcVar, int i7, boolean z7, Object obj, zzbe zzbeVar, zzbe zzbeVar2) {
        zzbe zzbeVar3 = zzbeVar;
        Object obj2 = zzbeVar3.zzb(zzbeVar3.zzo(obj, zzbcVar).zzc, zzbdVar, 0L).zzb;
        for (int i8 = 0; i8 < zzbeVar2.zza(); i8++) {
            if (zzbeVar2.zzb(i8, zzbdVar, 0L).zzb.equals(obj2)) {
                return i8;
            }
        }
        int iZze = zzbeVar3.zze(obj);
        int iZzc = zzbeVar3.zzc();
        int iZze2 = -1;
        int i9 = 0;
        while (i9 < iZzc && iZze2 == -1) {
            zzbe zzbeVar4 = zzbeVar3;
            int iZzl = zzbeVar4.zzl(iZze, zzbcVar, zzbdVar, i7, z7);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbeVar2.zze(zzbeVar4.zzf(iZzl));
            i9++;
            zzbeVar3 = zzbeVar4;
            iZze = iZzl;
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbeVar2.zzd(iZze2, zzbcVar, false).zzc;
    }

    static final /* synthetic */ void zzz(zzlh zzlhVar) {
        try {
            zzaE(zzlhVar);
        } catch (zzhz e7) {
            zzds.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
            throw new RuntimeException(e7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:233:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:289:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:290:0x05f5 A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TRY_LEAVE, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:295:0x0604 A[Catch: RuntimeException -> 0x0711, IOException -> 0x0716, zztp -> 0x071b, zzgb -> 0x0720, zzas -> 0x0725, zzrm -> 0x072a, zzhz -> 0x072f, TryCatch #16 {zzas -> 0x0725, zzgb -> 0x0720, zzhz -> 0x072f, zzrm -> 0x072a, zztp -> 0x071b, IOException -> 0x0716, RuntimeException -> 0x0711, blocks: (B:292:0x05fb, B:295:0x0604, B:298:0x060d, B:303:0x061c, B:307:0x062c, B:312:0x0642, B:317:0x0656), top: B:688:0x05fb }] */
    /* JADX WARN: Code duplicated, block: B:297:0x060c  */
    /* JADX WARN: Code duplicated, block: B:300:0x0611 A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TRY_ENTER, TRY_LEAVE, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x0619 A[LOOP:15: B:298:0x060d->B:302:0x0619, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:321:0x0691 A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:341:0x06df  */
    /* JADX WARN: Code duplicated, block: B:350:0x0705 A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, LOOP:18: B:349:0x0703->B:350:0x0705, LOOP_END, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:367:0x073a A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:369:0x073e A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:371:0x0743 A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:373:0x074b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:374:0x074c A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:378:0x075a  */
    /* JADX WARN: Code duplicated, block: B:381:0x0766  */
    /* JADX WARN: Code duplicated, block: B:394:0x078d A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, LOOP:5: B:392:0x0789->B:394:0x078d, LOOP_END, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:396:0x07af  */
    /* JADX WARN: Code duplicated, block: B:398:0x07b2 A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:440:0x086e A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, LOOP:8: B:439:0x086c->B:440:0x086e, LOOP_END, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:443:0x087c A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:447:0x088c A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:449:0x0892 A[Catch: IOException -> 0x0029, zztp -> 0x002c, zzgb -> 0x002f, zzas -> 0x0032, zzrm -> 0x0035, RuntimeException -> 0x058f, zzhz -> 0x0592, TryCatch #36 {zzhz -> 0x0592, RuntimeException -> 0x058f, blocks: (B:270:0x058b, B:278:0x05a9, B:279:0x05b2, B:281:0x05c3, B:283:0x05d1, B:287:0x05ea, B:384:0x076d, B:386:0x0773, B:388:0x0779, B:391:0x077e, B:392:0x0789, B:394:0x078d, B:398:0x07b2, B:400:0x07b8, B:402:0x07c0, B:403:0x07c8, B:404:0x07cb, B:406:0x07d4, B:454:0x089f, B:457:0x08ab, B:462:0x08b8, B:464:0x08c0, B:465:0x08c6, B:467:0x08d4, B:468:0x08ee, B:470:0x08f2, B:472:0x08fa, B:486:0x0927, B:473:0x0900, B:475:0x090b, B:479:0x0914, B:485:0x0924, B:489:0x093b, B:491:0x0941, B:495:0x0949, B:497:0x0951, B:499:0x0955, B:500:0x0960, B:502:0x0966, B:553:0x0a73, B:556:0x0a7b, B:558:0x0a7f, B:560:0x0a87, B:561:0x0a8a, B:562:0x0a8e, B:564:0x0a94, B:566:0x0a9d, B:568:0x0aa7, B:570:0x0aad, B:572:0x0ab3, B:579:0x0ad3, B:581:0x0ad9, B:585:0x0ae3, B:596:0x0afc, B:593:0x0af5, B:595:0x0af9, B:573:0x0aba, B:576:0x0ac8, B:577:0x0ace, B:578:0x0acf, B:503:0x096f, B:505:0x0976, B:507:0x097a, B:532:0x0a14, B:534:0x0a20, B:510:0x0984, B:512:0x0988, B:514:0x099a, B:516:0x09a5, B:518:0x09af, B:522:0x09b8, B:524:0x09c2, B:530:0x09cd, B:535:0x0a2d, B:537:0x0a34, B:539:0x0a38, B:543:0x0a41, B:545:0x0a51, B:547:0x0a57, B:549:0x0a61, B:550:0x0a66, B:551:0x0a6b, B:552:0x0a70, B:488:0x0932, B:409:0x07de, B:411:0x07e2, B:413:0x07e8, B:415:0x07ee, B:417:0x07f8, B:420:0x07fe, B:421:0x0801, B:423:0x080a, B:425:0x081c, B:427:0x0825, B:429:0x082d, B:434:0x0839, B:436:0x0863, B:438:0x0869, B:440:0x086e, B:441:0x0876, B:443:0x087c, B:444:0x087f, B:445:0x0888, B:447:0x088c, B:449:0x0892, B:450:0x0897, B:453:0x089e, B:290:0x05f5, B:300:0x0611, B:305:0x0622, B:309:0x0634, B:314:0x064a, B:319:0x068a, B:321:0x0691, B:323:0x0695, B:327:0x06a5, B:329:0x06a9, B:333:0x06b0, B:335:0x06b6, B:337:0x06d3, B:340:0x06dc, B:342:0x06e1, B:344:0x06e8, B:345:0x06f0, B:347:0x06f6, B:325:0x069b, B:350:0x0705, B:365:0x0734, B:367:0x073a, B:369:0x073e, B:371:0x0743, B:383:0x076a, B:374:0x074c, B:376:0x0752, B:380:0x0760, B:382:0x0767, B:597:0x0b01, B:601:0x0b0c), top: B:687:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:688:0x05fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x07ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:0x0897 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x05f0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:407:0x07d8
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r43) {
        /*
            Method dump skipped, instruction units count: 3270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkf.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzho
    public final void zza(float f7) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzho
    public final void zzb(int i7) {
        this.zzi.zze(33, i7, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzc(zzau zzauVar) {
        this.zzi.zzd(16, zzauVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void zzcS(long j7, long j8, zzu zzuVar, MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z7, int i7, int i8) {
        this.zzi.zze(1, z7 ? 1 : 0, (i8 << 4) | 1).zza();
    }

    public final void zzf(zzbe zzbeVar, int i7, long j7) {
        this.zzi.zzd(3, new zzke(zzbeVar, i7, j7)).zza();
    }

    public final void zzg(zzls zzlsVar) {
        this.zzi.zzd(38, zzlsVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzc zzcVar, boolean z7) {
        this.zzi.zzf(31, 0, 0, zzcVar).zza();
    }

    public final void zzj(float f7) {
        this.zzi.zzd(32, Float.valueOf(f7)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlf
    public final void zzk(zzlh zzlhVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzlhVar).zza();
        } else {
            zzds.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzlhVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j7) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzde zzdeVar = new zzde(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdeVar)).zza();
        if (j7 != -9223372036854775807L) {
            return zzdeVar.zze(j7);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzde zzdeVar = new zzde(this.zzq);
        this.zzi.zzd(7, zzdeVar).zza();
        return zzdeVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzo() {
        zzdl zzdlVar = this.zzi;
        zzdlVar.zzk(2);
        zzdlVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzun zzunVar) {
        this.zzi.zzd(8, zzunVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final /* bridge */ /* synthetic */ void zzs(zzwh zzwhVar) {
        this.zzi.zzd(9, (zzun) zzwhVar).zza();
    }

    final /* synthetic */ zzkn zzt(zzko zzkoVar, long j7) {
        zzyv zzyvVarZzk = this.zzg.zzk();
        long j8 = this.zzZ.zzb;
        zzyn zzynVar = this.zzf;
        zzlc zzlcVar = this.zzt;
        return new zzkn(this.zzc, j7, this.zze, zzyvVarZzk, zzlcVar, zzkoVar, zzynVar, -9223372036854775807L);
    }

    final /* synthetic */ void zzu(int i7, boolean z7) {
        this.zzw.zzB(i7, this.zzb[i7].zze(), z7);
    }

    final /* synthetic */ void zzv(int i7) {
        this.zzw.zzW(i7);
    }

    final /* synthetic */ zzdl zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i7, long j7, zzwi zzwiVar) {
        this.zzi.zzd(17, new zzjz(list, zzwiVar, i7, j7, null)).zza();
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzvt implements zzun, zzacx, zzyz, zzze, zzwd {
    private static final Map zzb;
    private static final zzu zzc;
    private zzadv zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private int zzH;
    private boolean zzI;
    private long zzJ;
    private boolean zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private final zzyv zzP;
    private final Uri zzd;
    private final zzga zze;
    private final zzru zzf;
    private final zzuz zzg;
    private final zzrp zzh;
    private final zzvl zzi;
    private final long zzj;
    private final long zzk;
    private final zzvi zzm;
    private zzum zzr;
    private zzafw zzs;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzvs zzz;
    private final zzzh zzl = new zzzh("ProgressiveMediaPeriod");
    private final zzde zzn = new zzde(zzdb.zza);
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvp
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzD();
        }
    };
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvm
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzq = zzeo.zzc(null);
    private zzvr[] zzu = new zzvr[0];
    private zzwe[] zzt = new zzwe[0];
    private long zzK = -9223372036854775807L;
    private int zzD = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzs zzsVar = new zzs();
        zzsVar.zza("icy");
        zzsVar.zzm("application/x-icy");
        zzc = zzsVar.zzM();
    }

    public zzvt(Uri uri, zzga zzgaVar, zzvi zzviVar, zzru zzruVar, zzrp zzrpVar, zzyy zzyyVar, zzuz zzuzVar, zzvl zzvlVar, zzyv zzyvVar, String str, int i7, int i8, zzu zzuVar, long j7, zzzn zzznVar) {
        this.zzd = uri;
        this.zze = zzgaVar;
        this.zzf = zzruVar;
        this.zzh = zzrpVar;
        this.zzg = zzuzVar;
        this.zzi = zzvlVar;
        this.zzP = zzyvVar;
        this.zzj = i7;
        this.zzm = zzviVar;
        this.zzk = j7;
    }

    private final void zzR(int i7) {
        zzaa();
        zzvs zzvsVar = this.zzz;
        boolean[] zArr = zzvsVar.zzd;
        if (zArr[i7]) {
            return;
        }
        zzu zzuVarZza = zzvsVar.zza.zza(i7).zza(0);
        this.zzg.zzh(new zzul(1, zzar.zzg(zzuVarZza.zzo), zzuVarZza, 0, null, zzeo.zzp(this.zzJ), -9223372036854775807L));
        zArr[i7] = true;
    }

    private final void zzS(int i7) {
        zzaa();
        if (this.zzL) {
            if ((!this.zzx || this.zzz.zzb[i7]) && !this.zzt[i7].zzl(false)) {
                this.zzK = 0L;
                this.zzL = false;
                this.zzF = true;
                this.zzJ = 0L;
                this.zzM = 0;
                for (zzwe zzweVar : this.zzt) {
                    zzweVar.zzb(false);
                }
                zzum zzumVar = this.zzr;
                zzumVar.getClass();
                zzumVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzF || zzZ();
    }

    private final zzaeb zzU(zzvr zzvrVar) {
        int length = this.zzt.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (zzvrVar.equals(this.zzu[i7])) {
                return this.zzt[i7];
            }
        }
        if (this.zzv) {
            int i8 = zzvrVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i8);
            sb.append(") after finishing tracks.");
            zzds.zzc("ProgressiveMediaPeriod", sb.toString());
            return new zzacr();
        }
        zzwe zzweVar = new zzwe(this.zzP, this.zzf, this.zzh);
        zzweVar.zzt(this);
        int i9 = length + 1;
        zzvr[] zzvrVarArr = (zzvr[]) Arrays.copyOf(this.zzu, i9);
        zzvrVarArr[length] = zzvrVar;
        String str = zzeo.zza;
        this.zzu = zzvrVarArr;
        zzwe[] zzweVarArr = (zzwe[]) Arrays.copyOf(this.zzt, i9);
        zzweVarArr[length] = zzweVar;
        this.zzt = zzweVarArr;
        return zzweVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i7;
        if (this.zzO || this.zzw || !this.zzv || this.zzA == null) {
            return;
        }
        for (zzwe zzweVar : this.zzt) {
            if (zzweVar.zzi() == null) {
                return;
            }
        }
        this.zzn.zzb();
        int length = this.zzt.length;
        zzbf[] zzbfVarArr = new zzbf[length];
        boolean[] zArr = new boolean[length];
        for (int i8 = 0; i8 < length; i8++) {
            zzu zzuVarZzi = this.zzt[i8].zzi();
            zzuVarZzi.getClass();
            String str = zzuVarZzi.zzo;
            boolean zZza = zzar.zza(str);
            boolean z7 = zZza || zzar.zzb(str);
            zArr[i8] = z7;
            this.zzx = z7 | this.zzx;
            this.zzy = this.zzk != -9223372036854775807L && length == 1 && zzar.zzc(str);
            zzafw zzafwVar = this.zzs;
            if (zzafwVar != null) {
                if (zZza || this.zzu[i8].zzb) {
                    zzao zzaoVar = zzuVarZzi.zzl;
                    zzao zzaoVar2 = zzaoVar == null ? new zzao(-9223372036854775807L, zzafwVar) : zzaoVar.zzd(zzafwVar);
                    zzs zzsVarZza = zzuVarZzi.zza();
                    zzsVarZza.zzk(zzaoVar2);
                    zzuVarZzi = zzsVarZza.zzM();
                }
                if (zZza && zzuVarZzi.zzh == -1 && zzuVarZzi.zzi == -1 && (i7 = zzafwVar.zza) != -1) {
                    zzs zzsVarZza2 = zzuVarZzi.zza();
                    zzsVarZza2.zzh(i7);
                    zzuVarZzi = zzsVarZza2.zzM();
                }
            }
            zzu zzuVarZzb = zzuVarZzi.zzb(this.zzf.zzb(zzuVarZzi));
            zzbfVarArr[i8] = new zzbf(Integer.toString(i8), zzuVarZzb);
            this.zzG = zzuVarZzb.zzu | this.zzG;
        }
        this.zzz = new zzvs(new zzwq(zzbfVarArr), zArr);
        if (this.zzy && this.zzB == -9223372036854775807L) {
            this.zzB = this.zzk;
            this.zzA = new zzvj(this, this.zzA);
        }
        this.zzi.zzb(this.zzB, this.zzA, this.zzC);
        this.zzw = true;
        zzum zzumVar = this.zzr;
        zzumVar.getClass();
        zzumVar.zzp(this);
    }

    private final void zzW() {
        zzvk zzvkVar = new zzvk(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzghc.zzh(zzZ());
            long j7 = this.zzB;
            if (j7 != -9223372036854775807L && this.zzK > j7) {
                this.zzN = true;
                this.zzK = -9223372036854775807L;
                return;
            }
            zzadv zzadvVar = this.zzA;
            zzadvVar.getClass();
            zzvkVar.zzd(zzadvVar.zzc(this.zzK).zza.zzc, this.zzK);
            for (zzwe zzweVar : this.zzt) {
                zzweVar.zzc(this.zzK);
            }
            this.zzK = -9223372036854775807L;
        }
        this.zzM = zzX();
        this.zzl.zzd(zzvkVar, this, zzyy.zza(this.zzD));
    }

    private final int zzX() {
        int iZzd = 0;
        for (zzwe zzweVar : this.zzt) {
            iZzd += zzweVar.zzd();
        }
        return iZzd;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final long zzY(boolean z7) {
        int i7 = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzwe[] zzweVarArr = this.zzt;
            if (i7 >= zzweVarArr.length) {
                return jMax;
            }
            if (z7) {
                jMax = Math.max(jMax, zzweVarArr[i7].zzj());
            } else {
                zzvs zzvsVar = this.zzz;
                zzvsVar.getClass();
                if (zzvsVar.zzc[i7]) {
                    jMax = Math.max(jMax, zzweVarArr[i7].zzj());
                }
            }
            i7++;
        }
    }

    private final boolean zzZ() {
        return this.zzK != -9223372036854775807L;
    }

    private final void zzaa() {
        zzghc.zzh(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final /* bridge */ /* synthetic */ void zzA(zzzd zzzdVar, long j7, long j8, boolean z7) {
        zzvk zzvkVar = (zzvk) zzzdVar;
        zzgx zzgxVarZzf = zzvkVar.zzf();
        zzug zzugVar = new zzug(zzvkVar.zze(), zzvkVar.zzh(), zzgxVarZzf.zzg(), zzgxVarZzf.zzh(), j7, j8, zzgxVarZzf.zzf());
        zzvkVar.zze();
        this.zzg.zzf(zzugVar, new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)));
        if (z7) {
            return;
        }
        for (zzwe zzweVar : this.zzt) {
            zzweVar.zzb(false);
        }
        if (this.zzH > 0) {
            zzum zzumVar = this.zzr;
            zzumVar.getClass();
            zzumVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final /* bridge */ /* synthetic */ void zzB(zzzd zzzdVar, long j7, long j8) {
        zzvk zzvkVar = (zzvk) zzzdVar;
        if (this.zzB == -9223372036854775807L && this.zzA != null) {
            long jZzY = zzY(true);
            long j9 = jZzY == Long.MIN_VALUE ? 0L : jZzY + 10000;
            this.zzB = j9;
            this.zzi.zzb(j9, this.zzA, this.zzC);
        }
        zzgx zzgxVarZzf = zzvkVar.zzf();
        zzug zzugVar = new zzug(zzvkVar.zze(), zzvkVar.zzh(), zzgxVarZzf.zzg(), zzgxVarZzf.zzh(), j7, j8, zzgxVarZzf.zzf());
        zzvkVar.zze();
        this.zzg.zze(zzugVar, new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)));
        this.zzN = true;
        zzum zzumVar = this.zzr;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final /* bridge */ /* synthetic */ void zzC(zzzd zzzdVar, long j7, long j8, int i7) {
        zzvk zzvkVar = (zzvk) zzzdVar;
        zzgx zzgxVarZzf = zzvkVar.zzf();
        this.zzg.zzd(i7 == 0 ? new zzug(zzvkVar.zze(), zzvkVar.zzh(), j7) : new zzug(zzvkVar.zze(), zzvkVar.zzh(), zzgxVarZzf.zzg(), zzgxVarZzf.zzh(), j7, j8, zzgxVarZzf.zzf()), new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)), i7);
    }

    final /* synthetic */ void zzE() {
        if (this.zzO) {
            return;
        }
        zzum zzumVar = this.zzr;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }

    final /* synthetic */ void zzF(zzadv zzadvVar) {
        this.zzA = this.zzs == null ? zzadvVar : new zzadu(-9223372036854775807L, 0L);
        this.zzB = zzadvVar.zza();
        boolean z7 = false;
        if (!this.zzI && zzadvVar.zza() == -9223372036854775807L) {
            z7 = true;
        }
        this.zzC = z7;
        this.zzD = true == z7 ? 7 : 1;
        if (this.zzw) {
            this.zzi.zzb(this.zzB, zzadvVar, z7);
        } else {
            zzD();
        }
    }

    final /* synthetic */ void zzG() {
        this.zzI = true;
    }

    final /* synthetic */ void zzH() {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    final /* synthetic */ long zzI(boolean z7) {
        return zzY(true);
    }

    final /* synthetic */ long zzL() {
        return this.zzj;
    }

    final /* synthetic */ Runnable zzM() {
        return this.zzp;
    }

    final /* synthetic */ Handler zzN() {
        return this.zzq;
    }

    final /* synthetic */ zzafw zzO() {
        return this.zzs;
    }

    final /* synthetic */ void zzP(zzafw zzafwVar) {
        this.zzs = zzafwVar;
    }

    final /* synthetic */ long zzQ() {
        return this.zzB;
    }

    public final void zza() {
        if (this.zzw) {
            for (zzwe zzweVar : this.zzt) {
                zzweVar.zze();
            }
        }
        this.zzl.zzg(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzO = true;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j7) {
        this.zzr = zzumVar;
        this.zzn.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzc() throws IOException {
        zzr();
        if (this.zzN && !this.zzw) {
            throw zzas.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzwq zzd() {
        zzaa();
        return this.zzz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zze(zzyf[] zzyfVarArr, boolean[] zArr, zzwf[] zzwfVarArr, boolean[] zArr2, long j7) {
        zzyf zzyfVar;
        zzaa();
        zzvs zzvsVar = this.zzz;
        zzwq zzwqVar = zzvsVar.zza;
        boolean[] zArr3 = zzvsVar.zzc;
        int i7 = this.zzH;
        int i8 = 0;
        for (int i9 = 0; i9 < zzyfVarArr.length; i9++) {
            zzwf zzwfVar = zzwfVarArr[i9];
            if (zzwfVar != null && (zzyfVarArr[i9] == null || !zArr[i9])) {
                int iZza = ((zzvq) zzwfVar).zza();
                zzghc.zzh(zArr3[iZza]);
                this.zzH--;
                zArr3[iZza] = false;
                zzwfVarArr[i9] = null;
            }
        }
        boolean z7 = !this.zzE ? j7 == 0 || this.zzy : i7 != 0;
        for (int i10 = 0; i10 < zzyfVarArr.length; i10++) {
            if (zzwfVarArr[i10] == null && (zzyfVar = zzyfVarArr[i10]) != null) {
                zzghc.zzh(zzyfVar.zze() == 1);
                zzghc.zzh(zzyfVar.zzf(0) == 0);
                int iZzb = zzwqVar.zzb(zzyfVar.zza());
                zzghc.zzh(!zArr3[iZzb]);
                this.zzH++;
                zArr3[iZzb] = true;
                this.zzG = zzyfVar.zzc().zzu | this.zzG;
                zzwfVarArr[i10] = new zzvq(this, iZzb);
                zArr2[i10] = true;
                if (!z7) {
                    zzwe zzweVar = this.zzt[iZzb];
                    z7 = (zzweVar.zzh() == 0 || zzweVar.zzo(j7, true)) ? false : true;
                }
            }
        }
        if (this.zzH == 0) {
            this.zzL = false;
            this.zzF = false;
            this.zzG = false;
            zzzh zzzhVar = this.zzl;
            if (zzzhVar.zze()) {
                zzwe[] zzweVarArr = this.zzt;
                int length = zzweVarArr.length;
                while (i8 < length) {
                    zzweVarArr[i8].zzs();
                    i8++;
                }
                zzzhVar.zzf();
            } else {
                this.zzN = false;
                for (zzwe zzweVar2 : this.zzt) {
                    zzweVar2.zzb(false);
                }
            }
        } else if (z7) {
            j7 = zzj(j7);
            while (i8 < zzwfVarArr.length) {
                if (zzwfVarArr[i8] != null) {
                    zArr2[i8] = true;
                }
                i8++;
            }
        }
        this.zzE = true;
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j7, boolean z7) {
        if (this.zzy) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzz.zzc;
        int length = this.zzt.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.zzt[i7].zzr(j7, false, zArr[i7]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j7) {
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        if (this.zzG) {
            this.zzG = false;
        } else {
            if (!this.zzF) {
                return -9223372036854775807L;
            }
            if (!this.zzN && zzX() <= this.zzM) {
                return -9223372036854775807L;
            }
            this.zzF = false;
        }
        return this.zzJ;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        long jZzY;
        zzaa();
        if (this.zzN || this.zzH == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzK;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            jZzY = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                zzvs zzvsVar = this.zzz;
                if (zzvsVar.zzb[i7] && zzvsVar.zzc[i7] && !this.zzt[i7].zzk()) {
                    jZzY = Math.min(jZzY, this.zzt[i7].zzj());
                }
            }
        } else {
            jZzY = Long.MAX_VALUE;
        }
        if (jZzY == Long.MAX_VALUE) {
            jZzY = zzY(false);
        }
        return jZzY == Long.MIN_VALUE ? this.zzJ : jZzY;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e A[LOOP:1: B:36:0x007c->B:37:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093 A[LOOP:2: B:41:0x0091->B:42:0x0093, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0079, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x008a, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j7) {
        zzzh zzzhVar;
        int i7;
        zzaa();
        boolean[] zArr = this.zzz.zzb;
        if (true != this.zzA.zzb()) {
            j7 = 0;
        }
        this.zzF = false;
        long j8 = this.zzJ;
        this.zzJ = j7;
        if (zzZ()) {
            this.zzK = j7;
            return j7;
        }
        if (this.zzD == 7 || !(this.zzN || this.zzl.zze())) {
            this.zzL = false;
            this.zzK = j7;
            this.zzN = false;
            this.zzG = false;
            zzzhVar = this.zzl;
            if (zzzhVar.zze()) {
                zzzhVar.zzc();
                for (zzwe zzweVar : this.zzt) {
                    zzweVar.zzb(false);
                }
                break;
            }
            for (zzwe zzweVar2 : this.zzt) {
                zzweVar2.zzs();
            }
            zzzhVar.zzf();
            return j7;
        }
        int length = this.zzt.length;
        for (int i8 = 0; i8 < length; i8++) {
            zzwe zzweVar3 = this.zzt[i8];
            if (zzweVar3.zzh() != 0 || j8 != j7) {
                if (!(this.zzy ? zzweVar3.zzn(zzweVar3.zzg()) : zzweVar3.zzo(j7, this.zzN)) && (zArr[i8] || !this.zzx)) {
                    this.zzL = false;
                    this.zzK = j7;
                    this.zzN = false;
                    this.zzG = false;
                    zzzhVar = this.zzl;
                    if (zzzhVar.zze()) {
                        zzzhVar.zzc();
                        while (i7 < r2) {
                            zzweVar.zzb(false);
                        }
                        break;
                        break;
                    }
                    while (i < r3) {
                        zzweVar2.zzs();
                    }
                    zzzhVar.zzf();
                    return j7;
                }
            }
        }
        return j7;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0085 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzk(long j7, zzlt zzltVar) {
        zzaa();
        if (!this.zzA.zzb()) {
            return 0L;
        }
        zzadt zzadtVarZzc = this.zzA.zzc(j7);
        zzadw zzadwVar = zzadtVarZzc.zza;
        zzadw zzadwVar2 = zzadtVarZzc.zzb;
        long j8 = zzltVar.zzc;
        if (j8 == 0) {
            if (zzltVar.zzd == 0) {
                return j7;
            }
            j8 = 0;
        }
        long j9 = zzadwVar.zzb;
        String str = zzeo.zza;
        long j10 = j7 - j8;
        long j11 = zzltVar.zzd;
        long j12 = j7 + j11;
        long j13 = j7 ^ j12;
        long j14 = j11 ^ j12;
        if (((j7 ^ j8) & (j7 ^ j10)) < 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((j13 & j14) < 0) {
            j12 = Long.MAX_VALUE;
        }
        boolean z7 = j10 <= j9 && j9 <= j12;
        long j15 = zzadwVar2.zzb;
        boolean z8 = j10 <= j15 && j15 <= j12;
        if (z7 && z8) {
            if (Math.abs(j9 - j7) <= Math.abs(j15 - j7)) {
                return j9;
            }
            return j15;
        }
        if (!z7) {
            if (z8) {
                return j15;
            }
            return j10;
        }
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        if (this.zzN) {
            return false;
        }
        zzzh zzzhVar = this.zzl;
        if (zzzhVar.zzb() || this.zzL) {
            return false;
        }
        if (this.zzw && this.zzH == 0) {
            return false;
        }
        boolean zZza = this.zzn.zza();
        if (zzzhVar.zze()) {
            return zZza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zzl.zze() && this.zzn.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final void zzo() {
        for (zzwe zzweVar : this.zzt) {
            zzweVar.zza();
        }
        this.zzm.zzb();
    }

    final boolean zzp(int i7) {
        return !zzT() && this.zzt[i7].zzl(this.zzN);
    }

    final void zzq(int i7) throws IOException {
        this.zzt[i7].zzf();
        zzr();
    }

    final void zzr() throws IOException {
        this.zzl.zzh(zzyy.zza(this.zzD));
    }

    final int zzs(int i7, zzkh zzkhVar, zzhg zzhgVar, int i8) {
        if (zzT()) {
            return -3;
        }
        zzR(i7);
        int iZzm = this.zzt[i7].zzm(zzkhVar, zzhgVar, i8, this.zzN);
        if (iZzm == -3) {
            zzS(i7);
        }
        return iZzm;
    }

    final int zzt(int i7, long j7) {
        if (zzT()) {
            return 0;
        }
        zzR(i7);
        zzwe zzweVar = this.zzt[i7];
        int iZzp = zzweVar.zzp(j7, this.zzN);
        zzweVar.zzq(iZzp);
        if (iZzp != 0) {
            return iZzp;
        }
        zzS(i7);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final zzaeb zzu(int i7, int i8) {
        return zzU(new zzvr(i7, false));
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzv() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzw(final zzadv zzadvVar) {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzadvVar);
            }
        });
    }

    final zzaeb zzx() {
        return zzU(new zzvr(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzwd
    public final void zzy(zzu zzuVar) {
        this.zzq.post(this.zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final /* bridge */ /* synthetic */ zzzb zzz(zzzd zzzdVar, long j7, long j8, IOException iOException, int i7) {
        long jMin;
        zzzb zzzbVarZza;
        zzadv zzadvVar;
        zzvk zzvkVar = (zzvk) zzzdVar;
        zzgx zzgxVarZzf = zzvkVar.zzf();
        zzug zzugVar = new zzug(zzvkVar.zze(), zzvkVar.zzh(), zzgxVarZzf.zzg(), zzgxVarZzf.zzh(), j7, j8, zzgxVarZzf.zzf());
        zzvkVar.zzg();
        String str = zzeo.zza;
        if ((iOException instanceof zzas) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzgo) || (iOException instanceof zzzg)) {
            jMin = -9223372036854775807L;
            break;
        }
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i7 - 1) * zzbbn.zzq.zzf, 5000);
                break;
            }
            if ((cause instanceof zzgb) && ((zzgb) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzzbVarZza = zzzh.zzb;
        } else {
            int iZzX = zzX();
            boolean z7 = iZzX > this.zzM;
            if (this.zzI || !((zzadvVar = this.zzA) == null || zzadvVar.zza() == -9223372036854775807L)) {
                this.zzM = iZzX;
            } else {
                boolean z8 = this.zzw;
                if (!z8 || zzT()) {
                    this.zzF = z8;
                    this.zzJ = 0L;
                    this.zzM = 0;
                    for (zzwe zzweVar : this.zzt) {
                        zzweVar.zzb(false);
                    }
                    zzvkVar.zzd(0L, 0L);
                } else {
                    this.zzL = true;
                    zzzbVarZza = zzzh.zza;
                }
            }
            zzzbVarZza = zzzh.zza(z7, jMin);
        }
        boolean zZza = zzzbVarZza.zza();
        this.zzg.zzg(zzugVar, new zzul(1, -1, null, 0, null, zzeo.zzp(zzvkVar.zzg()), zzeo.zzp(this.zzB)), iOException, true ^ zZza);
        if (!zZza) {
            zzvkVar.zze();
        }
        return zzzbVarZza;
    }
}

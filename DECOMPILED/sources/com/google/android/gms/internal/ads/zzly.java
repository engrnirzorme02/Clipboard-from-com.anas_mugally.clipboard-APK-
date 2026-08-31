package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzly {
    final /* synthetic */ zzlz zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;

    public zzly(zzlz zzlzVar, int i7) {
        Objects.requireNonNull(zzlzVar);
        this.zza = zzlzVar;
        this.zzb = i7;
    }

    public final void zza() {
        zzlz zzlzVar = this.zza;
        if (zzlzVar.zzw().zzg() != 2 || !zzlzVar.zzw().zzj() || zzlzVar.zzw().zzh() != 0) {
            if (this.zzh) {
                zzlzVar.zzz().zzk(1);
            }
            this.zzh = false;
            return;
        }
        zzbe zzbeVarZzo = zzlzVar.zzw().zzo();
        Object objZzf = zzbeVarZzo.zzg() ? null : zzbeVarZzo.zzf(zzlzVar.zzw().zzp());
        zzba zzbaVarZzw = zzlzVar.zzw();
        zzba zzbaVarZzw2 = zzlzVar.zzw();
        zzba zzbaVarZzw3 = zzlzVar.zzw();
        zzba zzbaVarZzw4 = zzlzVar.zzw();
        int iZzw = zzbaVarZzw.zzw();
        int iZzx = zzbaVarZzw2.zzx();
        long jZzt = zzbaVarZzw3.zzt();
        long jMax = Math.max(0L, zzlzVar.zzw().zzu() - Math.max(0L, jZzt - zzbaVarZzw4.zzs()));
        if (objZzf != null && iZzw == -1) {
            zzbeVarZzo.zzo(objZzf, zzlzVar.zzy());
            jZzt -= zzeo.zzp(0L);
            iZzw = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzh && Objects.equals(objZzf, this.zzc) && iZzw == this.zzd && iZzx == this.zze && jZzt == this.zzf && jMax == this.zzg) {
            if (jElapsedRealtime - this.zzi >= this.zzb) {
                ((zzir) zzlzVar.zzx()).zza.zzN(zzhz.zzc(new zzma(1), 1003));
                return;
            }
            return;
        }
        this.zzh = true;
        this.zzi = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzw;
        this.zze = iZzx;
        this.zzf = jZzt;
        this.zzg = jMax;
        zzlzVar.zzz().zzk(1);
        zzlzVar.zzz().zzi(1, this.zzb);
    }
}

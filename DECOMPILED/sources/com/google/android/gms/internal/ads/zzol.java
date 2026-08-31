package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzol {
    final /* synthetic */ zzom zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzup zze;
    private boolean zzf;
    private boolean zzg;

    public zzol(zzom zzomVar, String str, int i7, zzup zzupVar) {
        Objects.requireNonNull(zzomVar);
        this.zza = zzomVar;
        this.zzb = str;
        this.zzc = i7;
        this.zzd = zzupVar == null ? -1L : zzupVar.zzd;
        if (zzupVar == null || !zzupVar.zzb()) {
            return;
        }
        this.zze = zzupVar;
    }

    public final boolean zza(zzbe zzbeVar, zzbe zzbeVar2) {
        int i7 = this.zzc;
        if (i7 < zzbeVar.zza()) {
            zzom zzomVar = this.zza;
            zzbeVar.zzb(i7, zzomVar.zzj(), 0L);
            int i8 = zzomVar.zzj().zzn;
            while (true) {
                if (i8 > zzomVar.zzj().zzo) {
                    i7 = -1;
                    break;
                }
                int iZze = zzbeVar2.zze(zzbeVar.zzf(i8));
                if (iZze != -1) {
                    i7 = zzbeVar2.zzd(iZze, zzomVar.zzk(), false).zzc;
                    break;
                }
                i8++;
            }
        } else if (i7 >= zzbeVar2.zza()) {
            i7 = -1;
            break;
        }
        this.zzc = i7;
        if (i7 == -1) {
            return false;
        }
        zzup zzupVar = this.zze;
        return zzupVar == null || zzbeVar2.zze(zzupVar.zza) != -1;
    }

    public final boolean zzb(int i7, zzup zzupVar) {
        if (zzupVar == null) {
            return i7 == this.zzc;
        }
        zzup zzupVar2 = this.zze;
        if (zzupVar2 == null) {
            return !zzupVar.zzb() && zzupVar.zzd == this.zzd;
        }
        return zzupVar.zzd == zzupVar2.zzd && zzupVar.zzb == zzupVar2.zzb && zzupVar.zzc == zzupVar2.zzc;
    }

    public final void zzc(int i7, zzup zzupVar) {
        if (this.zzd == -1 && i7 == this.zzc && zzupVar != null) {
            zzom zzomVar = this.zza;
            long j7 = zzupVar.zzd;
            if (j7 >= zzomVar.zzi()) {
                this.zzd = j7;
            }
        }
    }

    public final boolean zzd(zzme zzmeVar) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar == null) {
            return this.zzc != zzmeVar.zzc;
        }
        long j7 = this.zzd;
        if (j7 == -1) {
            return false;
        }
        long j8 = zzupVar.zzd;
        if (j8 > j7) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbe zzbeVar = zzmeVar.zzb;
        int iZze = zzbeVar.zze(zzupVar.zza);
        int iZze2 = zzbeVar.zze(this.zze.zza);
        zzup zzupVar2 = this.zze;
        if (j8 < zzupVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzupVar.zzb()) {
            int i7 = zzupVar.zze;
            return i7 == -1 || i7 > zzupVar2.zzb;
        }
        int i8 = zzupVar.zzb;
        int i9 = zzupVar.zzc;
        int i10 = zzupVar2.zzb;
        if (i8 <= i10) {
            return i8 == i10 && i9 > zzupVar2.zzc;
        }
        return true;
    }

    final /* synthetic */ String zze() {
        return this.zzb;
    }

    final /* synthetic */ int zzf() {
        return this.zzc;
    }

    final /* synthetic */ long zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzup zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(boolean z7) {
        this.zzf = true;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(boolean z7) {
        this.zzg = true;
    }
}

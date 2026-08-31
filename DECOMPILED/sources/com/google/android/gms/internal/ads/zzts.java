package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzts implements zzwf {
    public final zzwf zza;
    final /* synthetic */ zztt zzb;
    private boolean zzc;

    public zzts(zztt zzttVar, zzwf zzwfVar) {
        Objects.requireNonNull(zzttVar);
        this.zzb = zzttVar;
        this.zza = zzwfVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final void zzc() {
        this.zza.zzc();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    @Override // com.google.android.gms.internal.ads.zzwf
    public final int zzd(zzkh zzkhVar, zzhg zzhgVar, int i7) {
        zztt zzttVar = this.zzb;
        if (zzttVar.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzhgVar.zzg(4);
            return -4;
        }
        long jZzi = zzttVar.zzi();
        int iZzd = this.zza.zzd(zzkhVar, zzhgVar, i7);
        if (iZzd != -5) {
            long j7 = zzttVar.zzb;
            if (j7 == Long.MIN_VALUE || ((iZzd != -4 || zzhgVar.zze < j7) && !(iZzd == -3 && jZzi == Long.MIN_VALUE && !zzhgVar.zzd))) {
                return iZzd;
            }
            zzhgVar.zza();
            zzhgVar.zzg(4);
            this.zzc = true;
            return -4;
        }
        zzu zzuVar = zzkhVar.zzb;
        zzuVar.getClass();
        int i8 = zzuVar.zzJ;
        if (i8 != 0) {
            int i9 = zzttVar.zzb == Long.MIN_VALUE ? zzuVar.zzK : 0;
            zzs zzsVarZza = zzuVar.zza();
            zzsVarZza.zzH(i8);
            zzsVarZza.zzI(i9);
            zzkhVar.zzb = zzsVarZza.zzM();
        } else if (zzuVar.zzK != 0) {
            i8 = 0;
            if (zzttVar.zzb == Long.MIN_VALUE) {
            }
            zzs zzsVarZza2 = zzuVar.zza();
            zzsVarZza2.zzH(i8);
            zzsVarZza2.zzI(i9);
            zzkhVar.zzb = zzsVarZza2.zzM();
        }
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final int zze(long j7) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j7);
    }
}

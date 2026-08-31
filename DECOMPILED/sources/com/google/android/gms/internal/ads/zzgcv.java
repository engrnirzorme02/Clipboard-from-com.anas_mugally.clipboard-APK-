package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgcv implements zzgcu {
    private final zzhpr zza;
    private final zzgea zzb;
    private final long zzc;

    zzgcv(zzhpr zzhprVar, zzgea zzgeaVar, zzftp zzftpVar, long j7) {
        this.zza = zzhprVar;
        this.zzb = zzgeaVar;
        this.zzc = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final boolean zza(zzfwm zzfwmVar) {
        if (zzfwmVar == null || zzfwmVar.equals(zzfwm.zzd())) {
            this.zzb.zzb(15104);
            return true;
        }
        if (zzfwmVar.zzb() != this.zza.zzb()) {
            this.zzb.zzb(15105);
            return true;
        }
        boolean z7 = (zzfwmVar.zza().zzc() * 1000) - System.currentTimeMillis() <= this.zzc;
        if (z7) {
            this.zzb.zzb(15106);
        }
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final boolean zzb(zzfwm zzfwmVar) {
        if (zzfwmVar == null || zzfwmVar.equals(zzfwm.zzd())) {
            this.zzb.zzb(15102);
            return false;
        }
        if (zzfwmVar.zzb() == this.zza.zzb()) {
            return true;
        }
        this.zzb.zzb(15103);
        return false;
    }
}

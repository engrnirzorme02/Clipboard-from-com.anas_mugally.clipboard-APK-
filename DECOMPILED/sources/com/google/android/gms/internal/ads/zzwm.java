package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzwm implements zzwf {
    private final zzwf zza;
    private final long zzb;

    public zzwm(zzwf zzwfVar, long j7) {
        this.zza = zzwfVar;
        this.zzb = j7;
    }

    public final zzwf zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final void zzc() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final int zzd(zzkh zzkhVar, zzhg zzhgVar, int i7) {
        int iZzd = this.zza.zzd(zzkhVar, zzhgVar, i7);
        if (iZzd != -4) {
            return iZzd;
        }
        zzhgVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final int zze(long j7) {
        return this.zza.zze(j7 - this.zzb);
    }
}

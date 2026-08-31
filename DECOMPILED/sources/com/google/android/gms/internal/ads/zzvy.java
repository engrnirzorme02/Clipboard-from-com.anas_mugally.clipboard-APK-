package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzvy implements zzyp {
    public long zza;
    public long zzb;
    public zzyo zzc;
    public zzvy zzd;

    public zzvy(long j7, int i7) {
        zza(j7, 65536);
    }

    public final void zza(long j7, int i7) {
        zzghc.zzh(this.zzc == null);
        this.zza = j7;
        this.zzb = j7 + 65536;
    }

    public final int zzb(long j7) {
        long j8 = j7 - this.zza;
        int i7 = this.zzc.zzb;
        return (int) j8;
    }

    public final zzvy zzc() {
        this.zzc = null;
        zzvy zzvyVar = this.zzd;
        this.zzd = null;
        return zzvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final zzyo zzd() {
        zzyo zzyoVar = this.zzc;
        zzyoVar.getClass();
        return zzyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final zzyp zze() {
        zzvy zzvyVar = this.zzd;
        if (zzvyVar == null || zzvyVar.zzc == null) {
            return null;
        }
        return zzvyVar;
    }
}

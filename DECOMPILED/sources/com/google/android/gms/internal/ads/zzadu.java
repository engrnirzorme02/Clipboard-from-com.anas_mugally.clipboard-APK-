package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzadu implements zzadv {
    private final long zza;
    private final zzadt zzb;

    public zzadu(long j7, long j8) {
        this.zza = j7;
        zzadw zzadwVar = j8 == 0 ? zzadw.zza : new zzadw(0L, j8);
        this.zzb = new zzadt(zzadwVar, zzadwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j7) {
        return this.zzb;
    }
}

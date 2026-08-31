package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaca implements zzadv {
    private final zzacd zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzaca(zzacd zzacdVar, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.zza = zzacdVar;
        this.zzb = j7;
        this.zzc = j9;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j7) {
        zzadw zzadwVar = new zzadw(j7, zzacc.zza(this.zza.zza(j7), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzadt(zzadwVar, zzadwVar);
    }

    public final long zzd(long j7) {
        return this.zza.zza(j7);
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zze;
    }

    final /* synthetic */ long zzh() {
        return this.zzf;
    }
}

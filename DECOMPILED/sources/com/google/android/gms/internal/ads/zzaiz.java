package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaiz implements zzajf {
    private final zzadh zza;
    private final zzadg zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzaiz(zzadh zzadhVar, zzadg zzadgVar) {
        this.zza = zzadhVar;
        this.zzb = zzadgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final long zza(zzacv zzacvVar) {
        long j7 = this.zzd;
        if (j7 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j7 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zzb(long j7) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzeo.zzm(jArr, j7, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final zzadv zzc() {
        zzghc.zzh(this.zzc != -1);
        return new zzadf(this.zza, this.zzc);
    }

    public final void zzd(long j7) {
        this.zzc = j7;
    }
}

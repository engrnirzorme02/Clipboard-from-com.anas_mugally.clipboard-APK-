package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class zzaoe implements zzadv {
    private final zzaob zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaoe(zzaob zzaobVar, int i7, long j7, long j8) {
        this.zza = zzaobVar;
        this.zzb = i7;
        this.zzc = j7;
        long j9 = (j8 - j7) / ((long) zzaobVar.zzd);
        this.zzd = j9;
        this.zze = zzd(j9);
    }

    private final long zzd(long j7) {
        return zzeo.zzt(j7 * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j7) {
        long j8 = this.zzb;
        zzaob zzaobVar = this.zza;
        long j9 = (((long) zzaobVar.zzc) * j7) / (j8 * 1000000);
        String str = zzeo.zza;
        long j10 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j9, j10));
        long j11 = zzaobVar.zzd;
        long jZzd = zzd(jMax);
        long j12 = this.zzc;
        zzadw zzadwVar = new zzadw(jZzd, (jMax * j11) + j12);
        if (jZzd >= j7 || jMax == j10) {
            return new zzadt(zzadwVar, zzadwVar);
        }
        long j13 = jMax + 1;
        return new zzadt(zzadwVar, new zzadw(zzd(j13), j12 + (j11 * j13)));
    }
}

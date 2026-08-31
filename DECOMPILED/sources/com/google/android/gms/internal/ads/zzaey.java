package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaey extends zzacg {
    public zzaey(final zzadh zzadhVar, int i7, long j7, long j8) {
        long j9;
        Objects.requireNonNull(zzadhVar);
        zzacd zzacdVar = new zzacd() { // from class: com.google.android.gms.internal.ads.zzaew
            @Override // com.google.android.gms.internal.ads.zzacd
            public final /* synthetic */ long zza(long j10) {
                return zzadhVar.zzb(j10);
            }
        };
        zzaex zzaexVar = new zzaex(zzadhVar, i7, null);
        long jZza = zzadhVar.zza();
        long j10 = zzadhVar.zzj;
        int i8 = zzadhVar.zzd;
        if (i8 > 0) {
            j9 = ((((long) i8) + ((long) zzadhVar.zzc)) / 2) + 1;
        } else {
            int i9 = zzadhVar.zza;
            long j11 = 4096;
            if (i9 == zzadhVar.zzb && i9 > 0) {
                j11 = i9;
            }
            j9 = 64 + (((j11 * ((long) zzadhVar.zzg)) * ((long) zzadhVar.zzh)) / 8);
        }
        super(zzacdVar, zzaexVar, jZza, 0L, j10, j7, j8, j9, Math.max(6, zzadhVar.zzc));
    }
}

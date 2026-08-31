package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadf implements zzadv {
    private final zzadh zza;
    private final long zzb;

    public zzadf(zzadh zzadhVar, long j7) {
        this.zza = zzadhVar;
        this.zzb = j7;
    }

    private final zzadw zzd(long j7, long j8) {
        return new zzadw((j7 * 1000000) / ((long) this.zza.zze), this.zzb + j8);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j7) {
        zzadh zzadhVar = this.zza;
        zzadg zzadgVar = zzadhVar.zzk;
        zzadgVar.getClass();
        long jZzb = zzadhVar.zzb(j7);
        long[] jArr = zzadgVar.zza;
        int iZzm = zzeo.zzm(jArr, jZzb, true, false);
        long j8 = iZzm == -1 ? 0L : jArr[iZzm];
        long[] jArr2 = zzadgVar.zzb;
        zzadw zzadwVarZzd = zzd(j8, iZzm != -1 ? jArr2[iZzm] : 0L);
        if (zzadwVarZzd.zzb == j7 || iZzm == jArr.length - 1) {
            return new zzadt(zzadwVarZzd, zzadwVarZzd);
        }
        int i7 = iZzm + 1;
        return new zzadt(zzadwVarZzd, zzd(jArr[i7], jArr2[i7]));
    }
}

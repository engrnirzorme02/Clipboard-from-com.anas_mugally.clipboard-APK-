package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadn implements zzadv {
    private final zzdt zza;
    private final zzdt zzb;
    private long zzc;

    public zzadn(long[] jArr, long[] jArr2, long j7) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzghc.zza(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzdt(length2);
            this.zzb = new zzdt(length2);
        } else {
            int i7 = length2 + 1;
            zzdt zzdtVar = new zzdt(i7);
            this.zza = zzdtVar;
            zzdt zzdtVar2 = new zzdt(i7);
            this.zzb = zzdtVar2;
            zzdtVar.zza(0L);
            zzdtVar2.zza(0L);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j7) {
        zzdt zzdtVar = this.zzb;
        if (zzdtVar.zzd() == 0) {
            zzadw zzadwVar = zzadw.zza;
            return new zzadt(zzadwVar, zzadwVar);
        }
        int iZzn = zzeo.zzn(zzdtVar, j7, true, true);
        long jZzc = zzdtVar.zzc(iZzn);
        zzdt zzdtVar2 = this.zza;
        zzadw zzadwVar2 = new zzadw(jZzc, zzdtVar2.zzc(iZzn));
        if (zzadwVar2.zzb == j7 || iZzn == zzdtVar.zzd() - 1) {
            return new zzadt(zzadwVar2, zzadwVar2);
        }
        int i7 = iZzn + 1;
        return new zzadt(zzadwVar2, new zzadw(zzdtVar.zzc(i7), zzdtVar2.zzc(i7)));
    }
}

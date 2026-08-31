package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzanh implements zzacf {
    private final zzel zza;
    private final zzef zzb = new zzef();
    private final int zzc;

    public zzanh(int i7, zzel zzelVar, int i8) {
        this.zzc = i7;
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final zzace zza(zzacv zzacvVar, long j7) {
        int iZza;
        int iZza2;
        long jZzn = zzacvVar.zzn();
        int iMin = (int) Math.min(112800L, zzacvVar.zzo() - jZzn);
        zzef zzefVar = this.zzb;
        zzefVar.zza(iMin);
        zzacvVar.zzi(zzefVar.zzi(), 0, iMin);
        int iZze = zzefVar.zze();
        long j8 = -1;
        long j9 = -9223372036854775807L;
        long j10 = -1;
        while (zzefVar.zzd() >= 188 && (iZza2 = (iZza = zzant.zza(zzefVar.zzi(), zzefVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzant.zzb(zzefVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j7) {
                    return j9 == -9223372036854775807L ? zzace.zza(jZze, jZzn) : zzace.zzc(jZzn + j10);
                }
                j10 = iZza;
                if (100000 + jZze > j7) {
                    return zzace.zzc(jZzn + j10);
                }
                j9 = jZze;
            }
            zzefVar.zzh(iZza2);
            j8 = iZza2;
        }
        return j9 != -9223372036854775807L ? zzace.zzb(j9, jZzn + j8) : zzace.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final void zzb() {
        byte[] bArr = zzeo.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}

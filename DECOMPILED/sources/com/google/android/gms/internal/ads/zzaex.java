package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaex implements zzacf {
    private final zzadh zza;
    private final int zzb;
    private final zzadb zzc = new zzadb();

    /* synthetic */ zzaex(zzadh zzadhVar, int i7, byte[] bArr) {
        this.zza = zzadhVar;
        this.zzb = i7;
    }

    private final long zzc(zzacv zzacvVar) {
        while (zzacvVar.zzm() < zzacvVar.zzo() - 6) {
            zzadh zzadhVar = this.zza;
            int i7 = this.zzb;
            zzadb zzadbVar = this.zzc;
            long jZzm = zzacvVar.zzm();
            zzef zzefVar = new zzef(17);
            zzacvVar.zzi(zzefVar.zzi(), 0, 2);
            if (zzefVar.zzo() != i7) {
                zzacvVar.zzl();
                zzacvVar.zzk((int) (jZzm - zzacvVar.zzn()));
            } else {
                zzefVar.zzf(zzacy.zzb(zzacvVar, zzefVar.zzi(), 2, 15) + 2);
                zzacvVar.zzl();
                zzacvVar.zzk((int) (jZzm - zzacvVar.zzn()));
                if (zzadc.zza(zzefVar, zzadhVar, i7, zzadbVar)) {
                    break;
                }
            }
            zzacvVar.zzk(1);
        }
        if (zzacvVar.zzm() < zzacvVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzacvVar.zzk((int) (zzacvVar.zzo() - zzacvVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final zzace zza(zzacv zzacvVar, long j7) {
        long jZzn = zzacvVar.zzn();
        long jZzc = zzc(zzacvVar);
        long jZzm = zzacvVar.zzm();
        zzacvVar.zzk(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzacvVar);
        long jZzm2 = zzacvVar.zzm();
        if (jZzc > j7 || jZzc2 <= j7) {
            return jZzc2 <= j7 ? zzace.zzb(jZzc2, jZzm2) : zzace.zza(jZzc, jZzn);
        }
        return zzace.zzc(jZzm);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzanj {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzel zza = new zzel(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzef zzb = new zzef();

    zzanj(int i7) {
    }

    private final int zze(zzacv zzacvVar) {
        byte[] bArr = zzeo.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzacvVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzacv zzacvVar, zzads zzadsVar, int i7) {
        if (i7 <= 0) {
            zze(zzacvVar);
            return 0;
        }
        long j7 = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzacvVar);
                return 0;
            }
            if (this.zzd) {
                long j8 = this.zzf;
                if (j8 == -9223372036854775807L) {
                    zze(zzacvVar);
                    return 0;
                }
                zzel zzelVar = this.zza;
                this.zzh = zzelVar.zzf(this.zzg) - zzelVar.zze(j8);
                zze(zzacvVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzacvVar.zzo());
            if (zzacvVar.zzn() != 0) {
                zzadsVar.zza = 0L;
                return 1;
            }
            zzef zzefVar = this.zzb;
            zzefVar.zza(iMin);
            zzacvVar.zzl();
            zzacvVar.zzi(zzefVar.zzi(), 0, iMin);
            int iZze = zzefVar.zze();
            for (int iZzg = zzefVar.zzg(); iZzg < iZze; iZzg++) {
                if (zzefVar.zzi()[iZzg] == 71) {
                    long jZzb = zzant.zzb(zzefVar, iZzg, i7);
                    if (jZzb != -9223372036854775807L) {
                        j7 = jZzb;
                        break;
                    }
                }
            }
            this.zzf = j7;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzacvVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j9 = jZzo - ((long) iMin2);
        if (zzacvVar.zzn() != j9) {
            zzadsVar.zza = j9;
            return 1;
        }
        zzef zzefVar2 = this.zzb;
        zzefVar2.zza(iMin2);
        zzacvVar.zzl();
        zzacvVar.zzi(zzefVar2.zzi(), 0, iMin2);
        int iZzg2 = zzefVar2.zzg();
        int iZze2 = zzefVar2.zze();
        for (int i8 = iZze2 - 188; i8 >= iZzg2; i8--) {
            byte[] bArrZzi = zzefVar2.zzi();
            int i9 = 0;
            for (int i10 = -4; i10 <= 4; i10++) {
                int i11 = (i10 * 188) + i8;
                if (i11 >= iZzg2 && i11 < iZze2 && bArrZzi[i11] == 71) {
                    i9++;
                    if (i9 == 5) {
                        long jZzb2 = zzant.zzb(zzefVar2, i8, i7);
                        if (jZzb2 == -9223372036854775807L) {
                            break;
                        }
                        j7 = jZzb2;
                        break;
                    }
                } else {
                    i9 = 0;
                }
            }
        }
        this.zzg = j7;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzel zzd() {
        return this.zza;
    }
}

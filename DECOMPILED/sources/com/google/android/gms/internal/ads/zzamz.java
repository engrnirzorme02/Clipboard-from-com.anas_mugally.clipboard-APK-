package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzamz {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzel zza = new zzel(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzef zzb = new zzef();

    zzamz() {
    }

    public static long zze(zzef zzefVar) {
        int iZzg = zzefVar.zzg();
        if (zzefVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzefVar.zzm(bArr, 0, 9);
        zzefVar.zzh(iZzg);
        byte b7 = bArr[0];
        if ((b7 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b8 = bArr[2];
        if ((b8 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b9 = bArr[4];
        if ((b9 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j7 = b7;
        long j8 = b8;
        long j9 = (248 & j8) >> 3;
        long j10 = (j8 & 3) << 13;
        return j10 | ((bArr[1] & 255) << 20) | ((j7 & 3) << 28) | (((j7 & 56) >> 3) << 30) | (j9 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b9) & 248) >> 3);
    }

    private final int zzf(zzacv zzacvVar) {
        byte[] bArr = zzeo.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzacvVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzel zzb() {
        return this.zza;
    }

    public final int zzc(zzacv zzacvVar, zzads zzadsVar) {
        long j7 = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzacvVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j8 = jZzo - ((long) iMin);
            if (zzacvVar.zzn() != j8) {
                zzadsVar.zza = j8;
                return 1;
            }
            zzef zzefVar = this.zzb;
            zzefVar.zza(iMin);
            zzacvVar.zzl();
            zzacvVar.zzi(zzefVar.zzi(), 0, iMin);
            int iZzg = zzefVar.zzg();
            for (int iZze = zzefVar.zze() - 4; iZze >= iZzg; iZze--) {
                if (zzg(zzefVar.zzi(), iZze) == 442) {
                    zzefVar.zzh(iZze + 4);
                    long jZze = zze(zzefVar);
                    if (jZze != -9223372036854775807L) {
                        j7 = jZze;
                        break;
                    }
                }
            }
            this.zzg = j7;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzacvVar);
            return 0;
        }
        if (this.zzd) {
            long j9 = this.zzf;
            if (j9 == -9223372036854775807L) {
                zzf(zzacvVar);
                return 0;
            }
            zzel zzelVar = this.zza;
            this.zzh = zzelVar.zzf(this.zzg) - zzelVar.zze(j9);
            zzf(zzacvVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzacvVar.zzo());
        if (zzacvVar.zzn() != 0) {
            zzadsVar.zza = 0L;
            return 1;
        }
        zzef zzefVar2 = this.zzb;
        zzefVar2.zza(iMin2);
        zzacvVar.zzl();
        zzacvVar.zzi(zzefVar2.zzi(), 0, iMin2);
        int iZze2 = zzefVar2.zze();
        for (int iZzg2 = zzefVar2.zzg(); iZzg2 < iZze2 - 3; iZzg2++) {
            if (zzg(zzefVar2.zzi(), iZzg2) == 442) {
                zzefVar2.zzh(iZzg2 + 4);
                long jZze2 = zze(zzefVar2);
                if (jZze2 != -9223372036854775807L) {
                    j7 = jZze2;
                    break;
                }
            }
        }
        this.zzf = j7;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}

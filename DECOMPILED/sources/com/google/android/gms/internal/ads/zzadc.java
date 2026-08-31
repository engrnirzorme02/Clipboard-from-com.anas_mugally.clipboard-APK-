package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadc {
    public static boolean zza(zzef zzefVar, zzadh zzadhVar, int i7, zzadb zzadbVar) {
        int iZzg = zzefVar.zzg();
        long jZzz = zzefVar.zzz();
        long j7 = jZzz >>> 16;
        if (j7 != i7) {
            return false;
        }
        boolean z7 = (j7 & 1) == 1;
        long j8 = jZzz >> 12;
        long j9 = jZzz >> 8;
        long j10 = jZzz >> 4;
        long j11 = jZzz >> 1;
        long j12 = jZzz & 1;
        int i8 = (int) (j10 & 15);
        if (i8 <= 7) {
            if (i8 != zzadhVar.zzg - 1) {
                return false;
            }
        } else if (i8 > 10 || zzadhVar.zzg != 2) {
            return false;
        }
        int i9 = (int) (j11 & 7);
        if ((i9 != 0 && i9 != zzadhVar.zzi) || j12 == 1 || !zzd(zzefVar, zzadhVar, z7, zzadbVar)) {
            return false;
        }
        long j13 = zzadbVar.zza;
        int iZzc = zzc(zzefVar, (int) (j8 & 15));
        long j14 = zzadhVar.zzj;
        boolean z8 = j14 == 0 || j13 + ((long) iZzc) >= j14;
        if (iZzc == -1) {
            return false;
        }
        if ((!z8 && iZzc < zzadhVar.zza) || iZzc > zzadhVar.zzb) {
            return false;
        }
        int i10 = zzadhVar.zze;
        int i11 = (int) (j9 & 15);
        if (i11 != 0) {
            if (i11 <= 11) {
                if (i11 != zzadhVar.zzf) {
                    return false;
                }
            } else if (i11 == 12) {
                if (zzefVar.zzs() * zzbbn.zzq.zzf != i10) {
                    return false;
                }
            } else {
                if (i11 > 14) {
                    return false;
                }
                int iZzt = zzefVar.zzt();
                if (i11 == 14) {
                    iZzt *= 10;
                }
                if (iZzt != i10) {
                    return false;
                }
            }
        }
        if (zzefVar.zzs() != zzeo.zzJ(zzefVar.zzi(), iZzg, zzefVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzefVar.zzd() != 0) {
            int iZzn = zzefVar.zzn();
            if ((iZzn & 128) != 0) {
                return false;
            }
            int i12 = (iZzn & 126) >> 1;
            if ((i12 >= 2 && i12 <= 7) || (i12 >= 13 && i12 <= 31)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 57);
                sb.append("Ignoring frame where first subframe has a reserved type: ");
                sb.append(i12);
                zzds.zzb("FlacFrameReader", sb.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzacv zzacvVar, zzadh zzadhVar) throws zzas {
        zzacvVar.zzl();
        zzacvVar.zzk(1);
        byte[] bArr = new byte[1];
        zzacvVar.zzi(bArr, 0, 1);
        int i7 = bArr[0] & 1;
        boolean z7 = 1 == i7;
        zzacvVar.zzk(2);
        int i8 = 1 != i7 ? 6 : 7;
        zzef zzefVar = new zzef(i8);
        zzefVar.zzf(zzacy.zzb(zzacvVar, zzefVar.zzi(), 0, i8));
        zzacvVar.zzl();
        zzadb zzadbVar = new zzadb();
        if (zzd(zzefVar, zzadhVar, z7, zzadbVar)) {
            return zzadbVar.zza;
        }
        throw zzas.zzb(null, null);
    }

    public static int zzc(zzef zzefVar, int i7) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return zzefVar.zzs() + 1;
            case 7:
                return zzefVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzef zzefVar, zzadh zzadhVar, boolean z7, zzadb zzadbVar) {
        try {
            long jZzO = zzefVar.zzO();
            if (!z7) {
                jZzO *= (long) zzadhVar.zzb;
            }
            long j7 = zzadhVar.zzj;
            if (j7 != 0 && jZzO > j7) {
                return false;
            }
            zzadbVar.zza = jZzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}

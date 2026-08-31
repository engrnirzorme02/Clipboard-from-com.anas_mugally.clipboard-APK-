package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzamt {
    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    public static boolean zza(zzee zzeeVar, zzamr zzamrVar) throws zzas {
        long jZzk;
        zzeeVar.zze();
        int iZzf = zzf(zzeeVar, 3, 8, 8);
        zzamrVar.zza = iZzf;
        if (iZzf == -1) {
            return false;
        }
        zzghc.zza(Math.max(Math.max(2, 8), 32) <= 63);
        Math.addExact(Math.addExact(3L, 255L), 4294967296L);
        if (zzeeVar.zzc() < 2) {
            jZzk = -1;
        } else {
            jZzk = zzeeVar.zzk(2);
            if (jZzk == 3) {
                if (zzeeVar.zzc() < 8) {
                    jZzk = -1;
                } else {
                    long jZzk2 = zzeeVar.zzk(8);
                    long j7 = jZzk2 + 3;
                    if (jZzk2 != 255) {
                        jZzk = j7;
                    } else if (zzeeVar.zzc() < 32) {
                        jZzk = -1;
                    } else {
                        jZzk = j7 + zzeeVar.zzk(32);
                    }
                }
            }
        }
        zzamrVar.zzb = jZzk;
        if (jZzk == -1) {
            return false;
        }
        if (jZzk > 16) {
            StringBuilder sb = new StringBuilder(String.valueOf(jZzk).length() + 49);
            sb.append("Contains sub-stream with an invalid packet label ");
            sb.append(jZzk);
            throw zzas.zzc(sb.toString());
        }
        if (jZzk == 0) {
            int i7 = zzamrVar.zza;
            if (i7 == 1) {
                throw zzas.zzb("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i7 == 2) {
                throw zzas.zzb("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i7 == 17) {
                throw zzas.zzb("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iZzf2 = zzf(zzeeVar, 11, 24, 24);
        zzamrVar.zzc = iZzf2;
        return iZzf2 != -1;
    }

    public static zzams zzb(zzee zzeeVar) throws zzas {
        int iZzj;
        int i7;
        char c7;
        int i8;
        int i9;
        int iZzj2;
        char c8;
        int iZzj3 = zzeeVar.zzj(8);
        int i10 = 5;
        int iZzj4 = zzeeVar.zzj(5);
        if (iZzj4 != 31) {
            switch (iZzj4) {
                case 0:
                    iZzj = 96000;
                    break;
                case 1:
                    iZzj = 88200;
                    break;
                case 2:
                    iZzj = 64000;
                    break;
                case 3:
                    iZzj = 48000;
                    break;
                case 4:
                    iZzj = 44100;
                    break;
                case 5:
                    iZzj = 32000;
                    break;
                case 6:
                    iZzj = 24000;
                    break;
                case 7:
                    iZzj = 22050;
                    break;
                case 8:
                    iZzj = 16000;
                    break;
                case 9:
                    iZzj = 12000;
                    break;
                case 10:
                    iZzj = 11025;
                    break;
                case 11:
                    iZzj = 8000;
                    break;
                case 12:
                    iZzj = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzj4).length() + 32);
                    sb.append("Unsupported sampling rate index ");
                    sb.append(iZzj4);
                    throw zzas.zzc(sb.toString());
                case 15:
                    iZzj = 57600;
                    break;
                case 16:
                    iZzj = 51200;
                    break;
                case 17:
                    iZzj = 40000;
                    break;
                case 18:
                    iZzj = 38400;
                    break;
                case 19:
                    iZzj = 34150;
                    break;
                case 20:
                    iZzj = 28800;
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    iZzj = 25600;
                    break;
                case 22:
                    iZzj = 20000;
                    break;
                case 23:
                    iZzj = 19200;
                    break;
                case 24:
                    iZzj = 17075;
                    break;
                case 25:
                    iZzj = 14400;
                    break;
                case 26:
                    iZzj = 12800;
                    break;
                case 27:
                    iZzj = 9600;
                    break;
            }
        } else {
            iZzj = zzeeVar.zzj(24);
        }
        int iZzj5 = zzeeVar.zzj(3);
        int i11 = 1;
        if (iZzj5 == 0) {
            i7 = 768;
        } else if (iZzj5 == 1) {
            i7 = 1024;
        } else if (iZzj5 == 2 || iZzj5 == 3) {
            i7 = 2048;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj5).length() + 36);
                sb2.append("Unsupported coreSbrFrameLengthIndex ");
                sb2.append(iZzj5);
                throw zzas.zzc(sb2.toString());
            }
            i7 = 4096;
        }
        if (iZzj5 == 0 || iZzj5 == 1) {
            c7 = 0;
        } else if (iZzj5 == 2) {
            c7 = 2;
        } else if (iZzj5 == 3) {
            c7 = 3;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj5).length() + 36);
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(iZzj5);
                throw zzas.zzc(sb3.toString());
            }
            c7 = 1;
        }
        zzeeVar.zzh(2);
        zzc(zzeeVar);
        int iZzj6 = zzeeVar.zzj(5);
        int i12 = 0;
        int iZzf = 0;
        while (true) {
            int i13 = 16;
            if (i12 < iZzj6 + 1) {
                int iZzj7 = zzeeVar.zzj(3);
                iZzf += zzf(zzeeVar, 5, 8, 16) + 1;
                if ((iZzj7 == 0 || iZzj7 == 2) && zzeeVar.zzi()) {
                    zzc(zzeeVar);
                }
                i12++;
            } else {
                int iZzf2 = zzf(zzeeVar, 4, 8, 16) + 1;
                zzeeVar.zzg();
                int i14 = 0;
                while (true) {
                    double d7 = 2.0d;
                    if (i14 >= iZzf2) {
                        int i15 = iZzj3;
                        byte[] bArr = null;
                        if (zzeeVar.zzi()) {
                            int iZzf3 = zzf(zzeeVar, 2, 4, 8) + 1;
                            for (int i16 = 0; i16 < iZzf3; i16++) {
                                int iZzf4 = zzf(zzeeVar, 4, 8, 16);
                                int iZzf5 = zzf(zzeeVar, 4, 8, 16);
                                if (iZzf4 == 7) {
                                    int iZzj8 = zzeeVar.zzj(4) + 1;
                                    zzeeVar.zzh(4);
                                    byte[] bArr2 = new byte[iZzj8];
                                    for (int i17 = 0; i17 < iZzj8; i17++) {
                                        bArr2[i17] = (byte) zzeeVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzeeVar.zzh(iZzf5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzj) {
                            case 14700:
                            case 16000:
                                d7 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d7 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d7 = 1.0d;
                                break;
                            default:
                                StringBuilder sb4 = new StringBuilder(String.valueOf(iZzj).length() + 26);
                                sb4.append("Unsupported sampling rate ");
                                sb4.append(iZzj);
                                throw zzas.zzc(sb4.toString());
                        }
                        return new zzams(i15, (int) (((double) iZzj) * d7), (int) (((double) i7) * d7), bArr3, null);
                    }
                    int iZzj9 = zzeeVar.zzj(2);
                    if (iZzj9 == 0) {
                        i8 = iZzj3;
                        i9 = i11;
                        zzd(zzeeVar);
                        if (c7 > 0) {
                            zze(zzeeVar);
                        }
                    } else if (iZzj9 == i11) {
                        i9 = i11;
                        if (zzd(zzeeVar)) {
                            zzeeVar.zzg();
                        }
                        if (c7 > 0) {
                            zze(zzeeVar);
                            iZzj2 = zzeeVar.zzj(2);
                            c8 = c7;
                        } else {
                            iZzj2 = 0;
                            c8 = 0;
                        }
                        if (iZzj2 > 0) {
                            zzeeVar.zzh(6);
                            int iZzj10 = zzeeVar.zzj(2);
                            zzeeVar.zzh(4);
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(i10);
                            }
                            if (iZzj2 == 2 || iZzj2 == 3) {
                                zzeeVar.zzh(6);
                            }
                            if (iZzj10 == 2) {
                                zzeeVar.zzg();
                            }
                        }
                        i8 = iZzj3;
                        int iFloor = ((int) Math.floor(Math.log(iZzf - 1) / Math.log(2.0d))) + 1;
                        int iZzj11 = zzeeVar.zzj(2);
                        if (iZzj11 > 0 && zzeeVar.zzi()) {
                            zzeeVar.zzh(iFloor);
                        }
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(iFloor);
                        }
                        if (c8 == 0 && iZzj11 == 0) {
                            zzeeVar.zzg();
                        }
                    } else if (iZzj9 != 3) {
                        i8 = iZzj3;
                        i9 = i11;
                    } else {
                        zzf(zzeeVar, 4, 8, i13);
                        int iZzf6 = zzf(zzeeVar, 4, 8, i13);
                        i9 = i11;
                        if (zzeeVar.zzi()) {
                            zzf(zzeeVar, 8, i13, 0);
                        }
                        zzeeVar.zzg();
                        if (iZzf6 > 0) {
                            zzeeVar.zzh(iZzf6 * 8);
                        }
                        i8 = iZzj3;
                    }
                    i14++;
                    iZzj3 = i8;
                    i11 = i9;
                    i10 = 5;
                    i13 = 16;
                }
            }
        }
    }

    private static void zzc(zzee zzeeVar) {
        int iZzj;
        int iZzj2 = zzeeVar.zzj(2);
        if (iZzj2 == 0) {
            zzeeVar.zzh(6);
            return;
        }
        int iZzf = zzf(zzeeVar, 5, 8, 16) + 1;
        if (iZzj2 == 1) {
            zzeeVar.zzh(iZzf * 7);
            return;
        }
        if (iZzj2 == 2) {
            boolean zZzi = zzeeVar.zzi();
            int i7 = true != zZzi ? 5 : 1;
            int i8 = true == zZzi ? 7 : 5;
            int i9 = true == zZzi ? 8 : 6;
            int i10 = 0;
            while (i10 < iZzf) {
                if (zzeeVar.zzi()) {
                    zzeeVar.zzh(7);
                    iZzj = 0;
                } else {
                    if (zzeeVar.zzj(2) == 3 && zzeeVar.zzj(i8) * i7 != 0) {
                        zzeeVar.zzg();
                    }
                    iZzj = zzeeVar.zzj(i9) * i7;
                    if (iZzj != 0 && iZzj != 180) {
                        zzeeVar.zzg();
                    }
                    zzeeVar.zzg();
                }
                if (iZzj != 0 && iZzj != 180 && zzeeVar.zzi()) {
                    i10++;
                }
                i10++;
            }
        }
    }

    private static boolean zzd(zzee zzeeVar) {
        zzeeVar.zzh(3);
        boolean zZzi = zzeeVar.zzi();
        if (zZzi) {
            zzeeVar.zzh(13);
        }
        return zZzi;
    }

    private static void zze(zzee zzeeVar) {
        zzeeVar.zzh(3);
        zzeeVar.zzh(8);
        boolean zZzi = zzeeVar.zzi();
        boolean zZzi2 = zzeeVar.zzi();
        if (zZzi) {
            zzeeVar.zzh(5);
        }
        if (zZzi2) {
            zzeeVar.zzh(6);
        }
    }

    private static int zzf(zzee zzeeVar, int i7, int i8, int i9) {
        zzghc.zza(Math.max(Math.max(i7, i8), i9) <= 31);
        int i10 = (1 << i7) - 1;
        int i11 = (1 << i8) - 1;
        Math.addExact(Math.addExact(i10, i11), 1 << i9);
        if (zzeeVar.zzc() < i7) {
            return -1;
        }
        int iZzj = zzeeVar.zzj(i7);
        if (iZzj != i10) {
            return iZzj;
        }
        if (zzeeVar.zzc() < i8) {
            return -1;
        }
        int iZzj2 = zzeeVar.zzj(i8);
        int i12 = iZzj + iZzj2;
        if (iZzj2 != i11) {
            return i12;
        }
        if (zzeeVar.zzc() < i9) {
            return -1;
        }
        return i12 + zzeeVar.zzj(i9);
    }
}

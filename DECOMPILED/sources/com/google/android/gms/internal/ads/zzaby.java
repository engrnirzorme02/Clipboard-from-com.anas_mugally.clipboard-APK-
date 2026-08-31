package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaby {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, zzbbn.zzq.zzf, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:143:0x0210  */
    /* JADX WARN: Code duplicated, block: B:145:0x0216  */
    /* JADX WARN: Code duplicated, block: B:152:0x022a  */
    /* JADX WARN: Code duplicated, block: B:154:0x023e A[LOOP:2: B:153:0x023c->B:154:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x024e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257  */
    /* JADX WARN: Code duplicated, block: B:161:0x0261  */
    /* JADX WARN: Code duplicated, block: B:162:0x0266  */
    /* JADX WARN: Code duplicated, block: B:166:0x0271  */
    /* JADX WARN: Code duplicated, block: B:169:0x0277  */
    /* JADX WARN: Code duplicated, block: B:171:0x0297  */
    public static zzu zza(zzef zzefVar, String str, String str2, zzp zzpVar) throws zzas {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zZzi;
        int i15;
        int iZzj;
        int iZzj2;
        int iZzc;
        int i16;
        int i17;
        int iZzj3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iZzc2;
        int iZzj4;
        int i23;
        int i24 = 8;
        zzee zzeeVar = new zzee();
        zzeeVar.zza(zzefVar);
        int iZzc3 = zzeeVar.zzc();
        int iZzj5 = zzeeVar.zzj(3);
        int i25 = 1;
        if (iZzj5 > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzj5).length() + 30);
            sb.append("Unsupported AC-4 DSI version: ");
            sb.append(iZzj5);
            throw zzas.zzc(sb.toString());
        }
        int iZzj6 = zzeeVar.zzj(7);
        int i26 = true != zzeeVar.zzi() ? 44100 : 48000;
        zzeeVar.zzh(4);
        int iZzj7 = zzeeVar.zzj(9);
        if (iZzj6 > 1) {
            if (iZzj5 == 0) {
                throw zzas.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzeeVar.zzi()) {
                zzeeVar.zzh(16);
                if (zzeeVar.zzi()) {
                    zzeeVar.zzh(128);
                }
            }
        }
        if (iZzj5 == 1) {
            if (!zzg(zzeeVar)) {
                throw zzas.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzeeVar.zzm();
        }
        zzabw zzabwVar = new zzabw(null);
        int i27 = 0;
        while (true) {
            if (i27 < iZzj7) {
                if (iZzj5 == 0) {
                    zZzi = zzeeVar.zzi();
                    i15 = i24;
                    iZzj = zzeeVar.zzj(5);
                    iZzj2 = zzeeVar.zzj(5);
                    iZzc = 0;
                    i16 = 0;
                    i17 = i25;
                    iZzj3 = 0;
                } else {
                    int iZzj8 = zzeeVar.zzj(i24);
                    i17 = i25;
                    iZzj3 = zzeeVar.zzj(i24);
                    i15 = i24;
                    if (iZzj3 == 255) {
                        iZzj3 = zzeeVar.zzj(16) + 255;
                    }
                    if (iZzj8 > 2) {
                        zzeeVar.zzh(iZzj3 * 8);
                        i27++;
                        i25 = i17;
                        i24 = i15;
                    } else {
                        iZzc = (iZzc3 - zzeeVar.zzc()) / 8;
                        int iZzj9 = zzeeVar.zzj(5);
                        i16 = iZzj9 == 31 ? i17 : 0;
                        iZzj2 = iZzj8;
                        iZzj = iZzj9;
                        zZzi = false;
                    }
                }
                zzabwVar.zzf = iZzj2;
                if (!zZzi && i16 == 0 && iZzj == 6) {
                    i18 = iZzc;
                    i10 = 7;
                } else {
                    zzabwVar.zzg = zzeeVar.zzj(3);
                    if (zzeeVar.zzi()) {
                        zzeeVar.zzh(5);
                    }
                    zzeeVar.zzh(2);
                    int i28 = i17;
                    if (iZzj5 == i28) {
                        if (iZzj2 == i28) {
                            zzeeVar.zzh(2);
                        } else {
                            if (iZzj2 == 2) {
                                iZzj2 = 2;
                                zzeeVar.zzh(2);
                            }
                            if (iZzj2 <= 0) {
                                i22 = 1;
                                i7 = 8;
                                i8 = 5;
                            } else {
                                if (!zzeeVar.zzi() && !zzg(zzeeVar)) {
                                    throw zzas.zzc("Can't parse bitrate DSI.");
                                }
                                if (zzeeVar.zzi()) {
                                    zzeeVar.zzm();
                                    zzeeVar.zzo(zzeeVar.zzj(16));
                                    i8 = 5;
                                    iZzj4 = zzeeVar.zzj(5);
                                    for (i23 = 0; i23 < iZzj4; i23++) {
                                        zzeeVar.zzh(3);
                                        zzeeVar.zzh(8);
                                    }
                                    i22 = 1;
                                    i7 = 8;
                                } else {
                                    i22 = 1;
                                    i7 = 8;
                                    i8 = 5;
                                }
                            }
                            zzeeVar.zzm();
                            if (iZzj5 == i22) {
                                iZzc2 = ((iZzc3 - zzeeVar.zzc()) / i7) - i18;
                                if (iZzj3 < iZzc2) {
                                    throw zzas.zzc("pres_bytes is smaller than presentation bytes read.");
                                }
                                zzeeVar.zzo(iZzj3 - iZzc2);
                            }
                            if (zzabwVar.zza) {
                                i9 = -1;
                                if (zzabwVar.zzb == -1) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(i27).length() + 45);
                                    sb2.append("Can't determine channel mode of presentation ");
                                    sb2.append(i27);
                                    throw zzas.zzc(sb2.toString());
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                    }
                    zzeeVar.zzh(5);
                    zzeeVar.zzh(10);
                    if (iZzj5 == i28) {
                        if (iZzj2 > 0) {
                            zzabwVar.zza = zzeeVar.zzi();
                        }
                        if (zzabwVar.zza) {
                            if (iZzj2 != i28) {
                                i19 = 2;
                                if (iZzj2 == 2) {
                                    i21 = 2;
                                } else {
                                    i18 = iZzc;
                                    i21 = iZzj2;
                                }
                                zzeeVar.zzh(24);
                                i20 = 1;
                            } else {
                                i21 = 1;
                            }
                            i18 = iZzc;
                            int iZzj10 = zzeeVar.zzj(5);
                            if (iZzj10 >= 0 && iZzj10 <= 15) {
                                zzabwVar.zzb = iZzj10;
                            }
                            if (iZzj10 < 11 || iZzj10 > 14) {
                                i19 = 2;
                            } else {
                                zzabwVar.zzd = zzeeVar.zzi();
                                i19 = 2;
                                zzabwVar.zze = zzeeVar.zzj(2);
                            }
                            zzeeVar.zzh(24);
                            i20 = 1;
                        } else {
                            i18 = iZzc;
                            i19 = 2;
                            i20 = i28;
                            i21 = iZzj2;
                        }
                        if (iZzj2 == i20 || iZzj2 == i19) {
                            if (zzeeVar.zzi() && zzeeVar.zzi()) {
                                zzeeVar.zzh(i19);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzg();
                                int i29 = i15;
                                int iZzj11 = zzeeVar.zzj(i29);
                                int i30 = 0;
                                while (i30 < iZzj11) {
                                    zzeeVar.zzh(i29);
                                    i30++;
                                    i29 = 8;
                                }
                            }
                        }
                        iZzj2 = i21;
                    } else {
                        i18 = iZzc;
                    }
                    if (!zZzi && i16 == 0) {
                        zzeeVar.zzg();
                        if (iZzj == 0 || iZzj == 1 || iZzj == 2) {
                            if (iZzj2 == 0) {
                                for (int i31 = 0; i31 < 2; i31++) {
                                    zzd(zzeeVar, zzabwVar);
                                }
                                iZzj2 = 0;
                            } else {
                                for (int i32 = 0; i32 < 2; i32++) {
                                    zze(zzeeVar, zzabwVar);
                                }
                            }
                        } else if (iZzj == 3 || iZzj == 4) {
                            if (iZzj2 == 0) {
                                for (int i33 = 0; i33 < 3; i33++) {
                                    zzd(zzeeVar, zzabwVar);
                                }
                                iZzj2 = 0;
                            } else {
                                for (int i34 = 0; i34 < 3; i34++) {
                                    zze(zzeeVar, zzabwVar);
                                }
                            }
                        } else if (iZzj != 5) {
                            int iZzj12 = zzeeVar.zzj(7);
                            for (int i35 = 0; i35 < iZzj12; i35++) {
                                zzeeVar.zzh(8);
                            }
                        } else if (iZzj2 == 0) {
                            zzd(zzeeVar, zzabwVar);
                            iZzj2 = 0;
                        } else {
                            int iZzj13 = zzeeVar.zzj(3);
                            for (int i36 = 0; i36 < iZzj13 + 2; i36++) {
                                zze(zzeeVar, zzabwVar);
                            }
                        }
                    } else if (iZzj2 == 0) {
                        zzd(zzeeVar, zzabwVar);
                        iZzj2 = 0;
                    } else {
                        zze(zzeeVar, zzabwVar);
                    }
                    zzeeVar.zzg();
                    i10 = 7;
                    if (zzeeVar.zzi()) {
                    }
                    if (iZzj2 <= 0) {
                        i22 = 1;
                        i7 = 8;
                        i8 = 5;
                    } else {
                        if (!zzeeVar.zzi()) {
                        }
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzm();
                            zzeeVar.zzo(zzeeVar.zzj(16));
                            i8 = 5;
                            iZzj4 = zzeeVar.zzj(5);
                            while (i23 < iZzj4) {
                                zzeeVar.zzh(3);
                                zzeeVar.zzh(8);
                            }
                            i22 = 1;
                            i7 = 8;
                        } else {
                            i22 = 1;
                            i7 = 8;
                            i8 = 5;
                        }
                    }
                    zzeeVar.zzm();
                    if (iZzj5 == i22) {
                        iZzc2 = ((iZzc3 - zzeeVar.zzc()) / i7) - i18;
                        if (iZzj3 < iZzc2) {
                            throw zzas.zzc("pres_bytes is smaller than presentation bytes read.");
                        }
                        zzeeVar.zzo(iZzj3 - iZzc2);
                    }
                    if (zzabwVar.zza) {
                        i9 = -1;
                        if (zzabwVar.zzb == -1) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i27).length() + 45);
                            sb3.append("Can't determine channel mode of presentation ");
                            sb3.append(i27);
                            throw zzas.zzc(sb3.toString());
                        }
                    } else {
                        i9 = -1;
                    }
                }
                int iZzj14 = zzeeVar.zzj(i10);
                for (int i37 = 0; i37 < iZzj14; i37++) {
                    zzeeVar.zzh(15);
                }
                if (iZzj2 <= 0) {
                    i22 = 1;
                    i7 = 8;
                    i8 = 5;
                } else {
                    if (!zzeeVar.zzi()) {
                    }
                    if (zzeeVar.zzi()) {
                        zzeeVar.zzm();
                        zzeeVar.zzo(zzeeVar.zzj(16));
                        i8 = 5;
                        iZzj4 = zzeeVar.zzj(5);
                        while (i23 < iZzj4) {
                            zzeeVar.zzh(3);
                            zzeeVar.zzh(8);
                        }
                        i22 = 1;
                        i7 = 8;
                    } else {
                        i22 = 1;
                        i7 = 8;
                        i8 = 5;
                    }
                }
                zzeeVar.zzm();
                if (iZzj5 == i22) {
                    iZzc2 = ((iZzc3 - zzeeVar.zzc()) / i7) - i18;
                    if (iZzj3 < iZzc2) {
                        throw zzas.zzc("pres_bytes is smaller than presentation bytes read.");
                    }
                    zzeeVar.zzo(iZzj3 - iZzc2);
                }
                if (zzabwVar.zza) {
                    i9 = -1;
                    if (zzabwVar.zzb == -1) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i27).length() + 45);
                        sb4.append("Can't determine channel mode of presentation ");
                        sb4.append(i27);
                        throw zzas.zzc(sb4.toString());
                    }
                } else {
                    i9 = -1;
                }
            } else {
                i7 = i24;
                i8 = 5;
                i9 = -1;
                i10 = 7;
            }
            if (zzabwVar.zza) {
                int i38 = zzabwVar.zzb;
                boolean z7 = zzabwVar.zzd;
                int i39 = zzabwVar.zze;
                switch (i38) {
                    case 0:
                        i13 = 11;
                        i14 = 1;
                        break;
                    case 1:
                        i13 = 11;
                        i14 = 2;
                        break;
                    case 2:
                        i13 = 11;
                        i14 = 3;
                        break;
                    case 3:
                        i14 = i8;
                        i13 = 11;
                        break;
                    case 4:
                        i13 = 11;
                        i14 = 6;
                        break;
                    case 5:
                    case 7:
                    case 9:
                        i14 = i10;
                        i13 = 11;
                        break;
                    case 6:
                    case 8:
                    case 10:
                        i14 = i7;
                        i13 = 11;
                        break;
                    case 11:
                        i13 = 11;
                        i14 = 11;
                        break;
                    case 12:
                        i14 = 12;
                        i13 = 11;
                        break;
                    case 13:
                        i14 = 13;
                        i13 = 11;
                        break;
                    case 14:
                        i13 = 11;
                        i14 = 14;
                        break;
                    case 15:
                        i13 = 11;
                        i14 = 24;
                        break;
                    default:
                        i14 = i9;
                        i13 = 11;
                        break;
                }
                if (i38 == i13 || i38 == 12 || i38 == 13 || i38 == 14) {
                    if (!z7) {
                        i14 -= 2;
                    }
                    i12 = i14;
                    if (i39 == 0) {
                        i12 -= 4;
                    } else if (i39 == 1) {
                        i12 -= 2;
                    }
                } else {
                    i12 = i14;
                }
            } else {
                int i40 = zzabwVar.zzc;
                if (i40 > 0) {
                    i12 = i40 + 1;
                    if (zzabwVar.zzg == 4 && i12 == 17) {
                        i12 = 21;
                    }
                } else {
                    int i41 = zzabwVar.zzg;
                    if (i41 == 0) {
                        i11 = 2;
                    } else if (i41 != 1) {
                        i11 = 2;
                        if (i41 == 2) {
                            i12 = i7;
                        } else if (i41 == 3) {
                            i12 = 10;
                        } else if (i41 != 4) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(i41).length() + 33);
                            sb5.append("AC-4 level ");
                            sb5.append(i41);
                            sb5.append(" has not been defined.");
                            zzds.zzc("Ac4Util", sb5.toString());
                        } else {
                            i12 = 12;
                        }
                    } else {
                        i12 = 6;
                    }
                    i12 = i11;
                }
            }
            if (i12 <= 0) {
                throw zzas.zzc("Cannot determine channel count of presentation.");
            }
            Object[] objArr = {Integer.valueOf(iZzj6), Integer.valueOf(zzabwVar.zzf), Integer.valueOf(zzabwVar.zzg)};
            String str3 = zzeo.zza;
            String str4 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
            zzs zzsVar = new zzs();
            zzsVar.zza(str);
            zzsVar.zzm("audio/ac4");
            zzsVar.zzE(i12);
            zzsVar.zzF(i26);
            zzsVar.zzq(zzpVar);
            zzsVar.zze(str2);
            zzsVar.zzj(str4);
            return zzsVar.zzM();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    public static zzabx zzb(zzee zzeeVar) {
        int i7;
        int iZzj;
        int iZzj2 = zzeeVar.zzj(16);
        int iZzj3 = zzeeVar.zzj(16);
        if (iZzj3 == 65535) {
            iZzj3 = zzeeVar.zzj(24);
            i7 = 7;
        } else {
            i7 = 4;
        }
        int i8 = iZzj3 + i7;
        if (iZzj2 == 44097) {
            i8 += 2;
        }
        int i9 = i8;
        int iZzj4 = zzeeVar.zzj(2);
        int i10 = 0;
        if (iZzj4 == 3) {
            int i11 = 0;
            while (true) {
                iZzj = i11 + zzeeVar.zzj(2);
                if (!zzeeVar.zzi()) {
                    break;
                }
                i11 = (iZzj + 1) << 2;
            }
            iZzj4 = iZzj + 3;
        }
        int i12 = iZzj4;
        int iZzj5 = zzeeVar.zzj(10);
        if (zzeeVar.zzi() && zzeeVar.zzj(3) > 0) {
            zzeeVar.zzh(2);
        }
        int i13 = 48000;
        if (true != zzeeVar.zzi()) {
            i13 = 44100;
        }
        int iZzj6 = zzeeVar.zzj(4);
        if (i13 == 44100 && iZzj6 == 13) {
            i10 = zzb[13];
        } else if (i13 == 48000 && iZzj6 < 14) {
            i10 = zzb[iZzj6];
            int i14 = iZzj5 % 5;
            if (i14 == 1) {
                if (iZzj6 != 3 || iZzj6 == 8) {
                    i10++;
                }
            } else if (i14 != 2) {
                if (i14 != 3) {
                    if (i14 == 4 && (iZzj6 == 3 || iZzj6 == 8 || iZzj6 == 11)) {
                        i10++;
                    }
                } else if (iZzj6 != 3) {
                    i10++;
                } else {
                    i10++;
                }
            } else if (iZzj6 == 8 || iZzj6 == 11) {
                i10++;
            }
        }
        return new zzabx(i12, 2, i13, i9, i10, null);
    }

    public static void zzc(int i7, zzef zzefVar) {
        zzefVar.zza(7);
        byte[] bArrZzi = zzefVar.zzi();
        bArrZzi[0] = -84;
        bArrZzi[1] = 64;
        bArrZzi[2] = -1;
        bArrZzi[3] = -1;
        bArrZzi[4] = (byte) ((i7 >> 16) & 255);
        bArrZzi[5] = (byte) ((i7 >> 8) & 255);
        bArrZzi[6] = (byte) (i7 & 255);
    }

    private static void zzd(zzee zzeeVar, zzabw zzabwVar) throws zzas {
        int iZzj = zzeeVar.zzj(5);
        zzeeVar.zzh(2);
        if (zzeeVar.zzi()) {
            zzeeVar.zzh(5);
        }
        if (iZzj >= 7 && iZzj <= 10) {
            zzeeVar.zzg();
        }
        if (zzeeVar.zzi()) {
            int iZzj2 = zzeeVar.zzj(3);
            if (zzabwVar.zzb == -1 && iZzj >= 0 && iZzj <= 15 && (iZzj2 == 0 || iZzj2 == 1)) {
                zzabwVar.zzb = iZzj;
            }
            if (zzeeVar.zzi()) {
                zzf(zzeeVar);
            }
        }
    }

    private static void zze(zzee zzeeVar, zzabw zzabwVar) throws zzas {
        zzeeVar.zzh(2);
        boolean zZzi = zzeeVar.zzi();
        int iZzj = zzeeVar.zzj(8);
        for (int i7 = 0; i7 < iZzj; i7++) {
            zzeeVar.zzh(2);
            if (zzeeVar.zzi()) {
                zzeeVar.zzh(5);
            }
            if (zZzi) {
                zzeeVar.zzh(24);
            } else {
                if (zzeeVar.zzi()) {
                    if (!zzeeVar.zzi()) {
                        zzeeVar.zzh(4);
                    }
                    zzabwVar.zzc = zzeeVar.zzj(6) + 1;
                }
                zzeeVar.zzh(4);
            }
        }
        if (zzeeVar.zzi()) {
            zzeeVar.zzh(3);
            if (zzeeVar.zzi()) {
                zzf(zzeeVar);
            }
        }
    }

    private static void zzf(zzee zzeeVar) throws zzas {
        int iZzj = zzeeVar.zzj(6);
        if (iZzj < 2 || iZzj > 42) {
            throw zzas.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzj)));
        }
        zzeeVar.zzh(iZzj * 8);
    }

    private static boolean zzg(zzee zzeeVar) {
        if (zzeeVar.zzc() < 66) {
            return false;
        }
        zzeeVar.zzh(66);
        return true;
    }
}

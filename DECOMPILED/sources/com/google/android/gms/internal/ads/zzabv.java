package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzu zza(zzef zzefVar, String str, String str2, zzp zzpVar) {
        zzee zzeeVar = new zzee();
        zzeeVar.zza(zzefVar);
        int i7 = zzc[zzeeVar.zzj(2)];
        zzeeVar.zzh(8);
        int i8 = zze[zzeeVar.zzj(3)];
        if (zzeeVar.zzj(1) != 0) {
            i8++;
        }
        int i9 = zzf[zzeeVar.zzj(5)] * zzbbn.zzq.zzf;
        zzeeVar.zzm();
        zzefVar.zzh(zzeeVar.zze());
        zzs zzsVar = new zzs();
        zzsVar.zza(str);
        zzsVar.zzm("audio/ac3");
        zzsVar.zzE(i8);
        zzsVar.zzF(i7);
        zzsVar.zzq(zzpVar);
        zzsVar.zze(str2);
        zzsVar.zzh(i9);
        zzsVar.zzi(i9);
        return zzsVar.zzM();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static zzu zzb(zzef zzefVar, String str, String str2, zzp zzpVar) {
        String str3;
        zzee zzeeVar = new zzee();
        zzeeVar.zza(zzefVar);
        int iZzj = zzeeVar.zzj(13) * zzbbn.zzq.zzf;
        zzeeVar.zzh(3);
        int i7 = zzc[zzeeVar.zzj(2)];
        zzeeVar.zzh(10);
        int i8 = zze[zzeeVar.zzj(3)];
        if (zzeeVar.zzj(1) != 0) {
            i8++;
        }
        zzeeVar.zzh(3);
        int iZzj2 = zzeeVar.zzj(4);
        zzeeVar.zzh(1);
        if (iZzj2 > 0) {
            zzeeVar.zzh(6);
            if (zzeeVar.zzj(1) != 0) {
                i8 += 2;
            }
            zzeeVar.zzh(1);
        }
        if (zzeeVar.zzc() > 7) {
            zzeeVar.zzh(7);
            if (zzeeVar.zzj(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        zzeeVar.zzm();
        zzefVar.zzh(zzeeVar.zze());
        zzs zzsVar = new zzs();
        zzsVar.zza(str);
        zzsVar.zzm(str3);
        zzsVar.zzE(i8);
        zzsVar.zzF(i7);
        zzsVar.zzq(zzpVar);
        zzsVar.zze(str2);
        zzsVar.zzi(iZzj);
        return zzsVar.zzM();
    }

    public static zzabu zzc(zzee zzeeVar) {
        int iZzf;
        int i7;
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iZzd = zzeeVar.zzd();
        zzeeVar.zzh(40);
        int iZzj = zzeeVar.zzj(5);
        zzeeVar.zzf(iZzd);
        int i15 = -1;
        if (iZzj > 10) {
            zzeeVar.zzh(16);
            int iZzj2 = zzeeVar.zzj(2);
            if (iZzj2 == 0) {
                i15 = 0;
            } else if (iZzj2 == 1) {
                i15 = 1;
            } else if (iZzj2 == 2) {
                i15 = 2;
            }
            zzeeVar.zzh(3);
            int iZzj3 = zzeeVar.zzj(11) + 1;
            int iZzj4 = zzeeVar.zzj(2);
            if (iZzj4 == 3) {
                i7 = zzd[zzeeVar.zzj(2)];
                i12 = 6;
                i11 = 3;
            } else {
                int iZzj5 = zzeeVar.zzj(2);
                int i16 = zzb[iZzj5];
                i11 = iZzj5;
                i7 = zzc[iZzj4];
                i12 = i16;
            }
            iZzf = iZzj3 + iZzj3;
            int i17 = (iZzf * i7) / (i12 * 32);
            int iZzj6 = zzeeVar.zzj(3);
            boolean zZzi = zzeeVar.zzi();
            i8 = zze[iZzj6] + (zZzi ? 1 : 0);
            zzeeVar.zzh(10);
            if (zzeeVar.zzi()) {
                zzeeVar.zzh(8);
            }
            if (iZzj6 == 0) {
                zzeeVar.zzh(5);
                if (zzeeVar.zzi()) {
                    zzeeVar.zzh(8);
                }
                i13 = 0;
                iZzj6 = 0;
            } else {
                i13 = iZzj6;
            }
            if (i15 == 1) {
                if (zzeeVar.zzi()) {
                    zzeeVar.zzh(16);
                }
                i14 = 1;
            } else {
                i14 = i15;
            }
            if (zzeeVar.zzi()) {
                if (i13 > 2) {
                    zzeeVar.zzh(2);
                }
                if ((i13 & 1) != 0 && i13 > 2) {
                    zzeeVar.zzh(6);
                }
                if ((i13 & 4) != 0) {
                    zzeeVar.zzh(6);
                }
                if (zZzi && zzeeVar.zzi()) {
                    zzeeVar.zzh(5);
                }
                if (i14 == 0) {
                    if (zzeeVar.zzi()) {
                        zzeeVar.zzh(6);
                    }
                    if (i13 == 0 && zzeeVar.zzi()) {
                        zzeeVar.zzh(6);
                    }
                    if (zzeeVar.zzi()) {
                        zzeeVar.zzh(6);
                    }
                    int iZzj7 = zzeeVar.zzj(2);
                    if (iZzj7 == 1) {
                        zzeeVar.zzh(5);
                    } else if (iZzj7 == 2) {
                        zzeeVar.zzh(12);
                    } else if (iZzj7 == 3) {
                        int iZzj8 = zzeeVar.zzj(5);
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(5);
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(4);
                            }
                            if (zzeeVar.zzi()) {
                                if (zzeeVar.zzi()) {
                                    zzeeVar.zzh(4);
                                }
                                if (zzeeVar.zzi()) {
                                    zzeeVar.zzh(4);
                                }
                            }
                        }
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(5);
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(7);
                                if (zzeeVar.zzi()) {
                                    zzeeVar.zzh(8);
                                }
                            }
                        }
                        zzeeVar.zzh((iZzj8 + 2) * 8);
                        zzeeVar.zzm();
                    }
                    if (i13 < 2) {
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(14);
                        }
                        if (iZzj6 == 0 && zzeeVar.zzi()) {
                            zzeeVar.zzh(14);
                        }
                    }
                    if (!zzeeVar.zzi()) {
                        i14 = 0;
                    } else if (i11 == 0) {
                        zzeeVar.zzh(5);
                        i14 = 0;
                        i11 = 0;
                    } else {
                        for (int i18 = 0; i18 < i12; i18++) {
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(5);
                            }
                        }
                        i14 = 0;
                    }
                }
            }
            if (zzeeVar.zzi()) {
                zzeeVar.zzh(5);
                if (i13 == 2) {
                    zzeeVar.zzh(4);
                    i13 = 2;
                }
                if (i13 >= 6) {
                    zzeeVar.zzh(2);
                }
                if (zzeeVar.zzi()) {
                    zzeeVar.zzh(8);
                }
                if (i13 == 0 && zzeeVar.zzi()) {
                    zzeeVar.zzh(8);
                }
                if (iZzj4 < 3) {
                    zzeeVar.zzg();
                }
            }
            if (i14 == 0 && i11 != 3) {
                zzeeVar.zzg();
            }
            if (i14 == 2 && (i11 == 3 || zzeeVar.zzi())) {
                zzeeVar.zzh(6);
            }
            i9 = i12 * 256;
            str = (zzeeVar.zzi() && zzeeVar.zzj(6) == 1 && zzeeVar.zzj(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i10 = i17;
        } else {
            zzeeVar.zzh(32);
            int iZzj9 = zzeeVar.zzj(2);
            String str2 = iZzj9 == 3 ? null : "audio/ac3";
            int iZzj10 = zzeeVar.zzj(6);
            int i19 = zzf[iZzj10 / 2] * zzbbn.zzq.zzf;
            iZzf = zzf(iZzj9, iZzj10);
            zzeeVar.zzh(8);
            int iZzj11 = zzeeVar.zzj(3);
            if ((iZzj11 & 1) != 0 && iZzj11 != 1) {
                zzeeVar.zzh(2);
            }
            if ((iZzj11 & 4) != 0) {
                zzeeVar.zzh(2);
            }
            if (iZzj11 == 2) {
                zzeeVar.zzh(2);
            }
            i7 = iZzj9 < 3 ? zzc[iZzj9] : -1;
            i8 = zze[iZzj11] + (zzeeVar.zzi() ? 1 : 0);
            i9 = 1536;
            str = str2;
            i10 = i19;
        }
        return new zzabu(str, i15, i8, i7, iZzf, i9, i10, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b7 = bArr[4];
            return zzf((b7 & 192) >> 6, b7 & 63);
        }
        int i7 = bArr[2] & 7;
        int i8 = ((bArr[3] & 255) | (i7 << 8)) + 1;
        return i8 + i8;
    }

    public static int zze(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int zzf(int i7, int i8) {
        int i9;
        if (i7 < 0 || i7 >= 3 || i8 < 0 || (i9 = i8 >> 1) >= 19) {
            return -1;
        }
        int i10 = zzc[i7];
        if (i10 == 44100) {
            int i11 = zzg[i9] + (i8 & 1);
            return i11 + i11;
        }
        int i12 = zzf[i9];
        return i10 == 32000 ? i12 * 6 : i12 * 4;
    }
}

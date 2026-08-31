package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabt {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzabs zza(byte[] bArr) {
        return zzb(new zzee(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        if (r11 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzabs zzb(zzee zzeeVar, boolean z7) throws zzas {
        int i7;
        int iZzc = zzc(zzeeVar);
        int iZzd = zzd(zzeeVar);
        int iZzj = zzeeVar.zzj(4);
        StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + 8);
        sb.append("mp4a.40.");
        sb.append(iZzc);
        String string = sb.toString();
        if (iZzc == 5 || iZzc == 29) {
            iZzd = zzd(zzeeVar);
            iZzc = zzc(zzeeVar);
            if (iZzc == 22) {
                iZzj = zzeeVar.zzj(4);
            }
        }
        if (z7) {
            int i8 = 3;
            if (iZzc != 1 && iZzc != 2 && iZzc != 3 && iZzc != 4 && iZzc != 6 && iZzc != 7 && iZzc != 17) {
                switch (iZzc) {
                    case 19:
                    case 20:
                    case zzbbn.zzt.zzm /* 21 */:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 31);
                        sb2.append("Unsupported audio object type: ");
                        sb2.append(iZzc);
                        throw zzas.zzc(sb2.toString());
                }
            }
            if (zzeeVar.zzi()) {
                zzds.zzc("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzeeVar.zzi()) {
                zzeeVar.zzh(14);
            }
            boolean zZzi = zzeeVar.zzi();
            if (iZzj == 0) {
                throw new UnsupportedOperationException();
            }
            if (iZzc == 6) {
                zzeeVar.zzh(3);
            } else if (iZzc == 20) {
                iZzc = 20;
                zzeeVar.zzh(3);
            }
            if (zZzi) {
                if (iZzc == 22) {
                    zzeeVar.zzh(16);
                    i7 = 22;
                } else {
                    i7 = iZzc;
                }
                if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                    zzeeVar.zzh(3);
                }
                zzeeVar.zzh(1);
            }
            switch (iZzc) {
                case 17:
                case 19:
                case 20:
                case zzbbn.zzt.zzm /* 21 */:
                case 22:
                case 23:
                    int iZzj2 = zzeeVar.zzj(2);
                    if (iZzj2 == 2) {
                        i8 = iZzj2;
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i8).length() + 22);
                    sb3.append("Unsupported epConfig: ");
                    sb3.append(i8);
                    throw zzas.zzc(sb3.toString());
            }
        }
        int i9 = zzc[iZzj];
        if (i9 != -1) {
            return new zzabs(iZzd, i9, string, null);
        }
        throw zzas.zzb(null, null);
    }

    private static int zzc(zzee zzeeVar) {
        int iZzj = zzeeVar.zzj(5);
        return iZzj == 31 ? zzeeVar.zzj(6) + 32 : iZzj;
    }

    private static int zzd(zzee zzeeVar) throws zzas {
        int iZzj = zzeeVar.zzj(4);
        if (iZzj == 15) {
            if (zzeeVar.zzc() >= 24) {
                return zzeeVar.zzj(24);
            }
            throw zzas.zzb("AAC header insufficient data", null);
        }
        if (iZzj < 13) {
            return zzb[iZzj];
        }
        throw zzas.zzb("AAC header wrong Sampling Frequency Index", null);
    }
}

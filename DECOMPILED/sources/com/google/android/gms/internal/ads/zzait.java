package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzait {
    public final boolean zza;
    public final String zzb;
    public final zzaea zzc;
    public final int zzd;
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzait(boolean z7, String str, int i7, byte[] bArr, int i8, int i9, byte[] bArr2) {
        byte b7 = 0;
        int i10 = 1;
        zzghc.zza((i7 == 0) ^ (bArr2 == null));
        this.zza = z7;
        this.zzb = str;
        this.zzd = i7;
        this.zze = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b7 = -1;
                    } else {
                        b7 = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        b7 = -1;
                    } else {
                        b7 = 3;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b7 = -1;
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        b7 = -1;
                    } else {
                        b7 = 1;
                    }
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 != 0 && b7 != 1) {
                if (b7 == 2 || b7 == 3) {
                    i10 = 2;
                } else {
                    StringBuilder sb = new StringBuilder(str.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    zzds.zzc("TrackEncryptionBox", sb.toString());
                }
            }
        }
        this.zzc = new zzaea(i10, bArr, i8, i9);
    }
}

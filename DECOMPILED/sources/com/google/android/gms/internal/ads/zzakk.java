package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class zzakk {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzakk(int i7, int i8, int i9, int i10, int i11, int i12) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
    }

    public static zzakk zza(String str) {
        byte b7;
        zzghc.zza(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i7 >= length) {
                if (i9 == -1 || i10 == -1 || i12 == -1) {
                    return null;
                }
                return new zzakk(i8, i9, i10, i11, i12, length);
            }
            switch (zzggj.zza(strArrSplit[i7].trim())) {
                case "end":
                    b7 = 2;
                    break;
                case "text":
                    b7 = 4;
                    break;
                case "layer":
                    b7 = 0;
                    break;
                case "start":
                    b7 = 1;
                    break;
                case "style":
                    b7 = 3;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 == 0) {
                i8 = i7;
            } else if (b7 == 1) {
                i9 = i7;
            } else if (b7 == 2) {
                i10 = i7;
            } else if (b7 == 3) {
                i11 = i7;
            } else if (b7 == 4) {
                i12 = i7;
            }
            i7++;
        }
    }
}

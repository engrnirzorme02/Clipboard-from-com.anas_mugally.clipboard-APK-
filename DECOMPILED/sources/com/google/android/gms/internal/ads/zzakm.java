package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class zzakm {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzakm(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = i13;
        this.zzh = i14;
        this.zzi = i15;
        this.zzj = i16;
        this.zzk = i17;
    }

    public static zzakm zza(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i7 >= length) {
                if (i8 != -1) {
                    return new zzakm(i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, length);
                }
                return null;
            }
            switch (zzggj.zza(strArrSplit[i7].trim())) {
                case "name":
                    i8 = i7;
                    break;
                case "alignment":
                    i9 = i7;
                    break;
                case "primarycolour":
                    i10 = i7;
                    break;
                case "outlinecolour":
                    i11 = i7;
                    break;
                case "fontsize":
                    i12 = i7;
                    break;
                case "bold":
                    i13 = i7;
                    break;
                case "italic":
                    i14 = i7;
                    break;
                case "underline":
                    i15 = i7;
                    break;
                case "strikeout":
                    i16 = i7;
                    break;
                case "borderstyle":
                    i17 = i7;
                    break;
            }
            i7++;
        }
    }
}

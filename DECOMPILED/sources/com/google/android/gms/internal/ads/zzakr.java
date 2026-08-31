package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class zzakr {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgke zze = zzgke.zzj("auto", "none");
    private static final zzgke zzf = zzgke.zzk("dot", "sesame", "circle");
    private static final zzgke zzg = zzgke.zzj("filled", "open");
    private static final zzgke zzh = zzgke.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzakr(int i7, int i8, int i9) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static zzakr zza(String str) {
        byte b7;
        int i7;
        if (str == null) {
            return null;
        }
        String strZza = zzggj.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzgke zzgkeVarZzp = zzgke.zzp(TextUtils.split(strZza, zzd));
        String str2 = (String) zzgkf.zzb(zzglz.zza(zzh, zzgkeVarZzp), "outside");
        int iHashCode = str2.hashCode();
        int i8 = -1;
        int i9 = 0;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                b7 = 0;
            } else {
                b7 = -1;
            }
        } else if (str2.equals("outside")) {
            b7 = 1;
        } else {
            b7 = -1;
        }
        if (b7 != 0) {
            i7 = b7 != 1 ? 1 : -2;
        } else {
            i7 = 2;
        }
        zzgly zzglyVarZza = zzglz.zza(zze, zzgkeVarZzp);
        if (zzglyVarZza.isEmpty()) {
            zzgly zzglyVarZza2 = zzglz.zza(zzg, zzgkeVarZzp);
            zzgly zzglyVarZza3 = zzglz.zza(zzf, zzgkeVarZzp);
            if (!zzglyVarZza2.isEmpty() || !zzglyVarZza3.isEmpty()) {
                String str3 = (String) zzgkf.zzb(zzglyVarZza2, "filled");
                int i10 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzgkf.zzb(zzglyVarZza3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i8 = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i8 = 1;
                }
                if (i8 == 0) {
                    i8 = 2;
                } else if (i8 != 1) {
                    i9 = i10;
                    i8 = 1;
                } else {
                    i8 = 3;
                }
                i9 = i10;
            }
        } else {
            String str5 = (String) zzglyVarZza.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i8 = 0;
            }
        }
        return new zzakr(i8, i9, i7);
    }
}

package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv {
    public static int zza(int i7, int i8, String str) {
        String strZza;
        if (i7 >= 0 && i7 < i8) {
            return i7;
        }
        if (i7 < 0) {
            strZza = zzab.zza("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i8 < 0) {
                throw new IllegalArgumentException("negative size: " + i8);
            }
            strZza = zzab.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(zzd(i7, i8, "index"));
        }
        return i7;
    }

    public static void zzc(int i7, int i8, int i9) {
        String strZzd;
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            if (i7 < 0 || i7 > i9) {
                strZzd = zzd(i7, i9, "start index");
            } else {
                strZzd = (i8 < 0 || i8 > i9) ? zzd(i8, i9, "end index") : zzab.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strZzd);
        }
    }

    private static String zzd(int i7, int i8, String str) {
        if (i7 < 0) {
            return zzab.zza("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return zzab.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException("negative size: " + i8);
    }
}

package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzu {
    public static int zza(int i7, int i8) {
        String strZza;
        if (i7 >= 0 && i7 < i8) {
            return i7;
        }
        if (i7 < 0) {
            strZza = zzac.zza("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i8 < 0) {
                throw new IllegalArgumentException("negative size: " + i8);
            }
            strZza = zzac.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i7, int i8) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(zzb(i7, i8, "index"));
        }
        return i7;
    }

    private static String zzb(int i7, int i8, String str) {
        if (i7 < 0) {
            return zzac.zza("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return zzac.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException("negative size: " + i8);
    }

    public static int zza(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(zzb(i7, i8, str));
        }
        return i7;
    }

    public static <T> T zza(T t7) {
        t7.getClass();
        return t7;
    }

    public static void zza(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(zzp.zza(obj));
        }
    }

    public static void zza(int i7, int i8, int i9) {
        String strZzb;
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            if (i7 < 0 || i7 > i9) {
                strZzb = zzb(i7, i9, "start index");
            } else if (i8 >= 0 && i8 <= i9) {
                strZzb = zzac.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            } else {
                strZzb = zzb(i8, i9, "end index");
            }
            throw new IndexOutOfBoundsException(strZzb);
        }
    }
}

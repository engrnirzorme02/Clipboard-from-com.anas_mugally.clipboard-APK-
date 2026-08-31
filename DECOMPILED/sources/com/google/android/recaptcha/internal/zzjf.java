package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjf {
    public static void zza(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z7, String str, char c7) {
        if (!z7) {
            throw new IllegalArgumentException(zzji.zza(str, Character.valueOf(c7)));
        }
    }

    public static void zzd(int i7, int i8, int i9) {
        String strZzf;
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            if (i7 < 0 || i7 > i9) {
                strZzf = zzf(i7, i9, "start index");
            } else {
                strZzf = (i8 < 0 || i8 > i9) ? zzf(i8, i9, "end index") : zzji.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    public static void zze(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i7, int i8, String str) {
        return i7 < 0 ? zzji.zza("%s (%s) must not be negative", str, Integer.valueOf(i7)) : zzji.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
    }
}

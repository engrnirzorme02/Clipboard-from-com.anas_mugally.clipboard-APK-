package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghc {
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
            throw new IllegalArgumentException(zzghs.zzd(str, Character.valueOf(c7)));
        }
    }

    public static void zzd(boolean z7, String str, int i7) {
        if (!z7) {
            throw new IllegalArgumentException(zzghs.zzd(str, Integer.valueOf(i7)));
        }
    }

    public static void zze(boolean z7, String str, long j7) {
        if (!z7) {
            throw new IllegalArgumentException(zzghs.zzd(str, Long.valueOf(j7)));
        }
    }

    public static void zzf(boolean z7, String str, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(zzghs.zzd(str, obj));
        }
    }

    public static void zzg(boolean z7, String str, int i7, int i8) {
        if (!z7) {
            throw new IllegalArgumentException(zzghs.zzd(str, Integer.valueOf(i7), Integer.valueOf(i8)));
        }
    }

    public static void zzh(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void zzj(boolean z7, String str, Object obj, Object obj2) {
        if (!z7) {
            throw new IllegalStateException(zzghs.zzd(str, obj, obj2));
        }
    }

    public static Object zzk(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzl(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzghs.zzd(str, obj2));
    }

    public static int zzm(int i7, int i8, String str) {
        String strZzd;
        if (i7 >= 0 && i7 < i8) {
            return i7;
        }
        if (i7 < 0) {
            strZzd = zzghs.zzd("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i8 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 15);
                sb.append("negative size: ");
                sb.append(i8);
                throw new IllegalArgumentException(sb.toString());
            }
            strZzd = zzghs.zzd("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException(strZzd);
    }

    public static int zzn(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(zzp(i7, i8, "index"));
        }
        return i7;
    }

    public static void zzo(int i7, int i8, int i9) {
        String strZzp;
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            if (i7 < 0 || i7 > i9) {
                strZzp = zzp(i7, i9, "start index");
            } else {
                strZzp = (i8 < 0 || i8 > i9) ? zzp(i8, i9, "end index") : zzghs.zzd("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strZzp);
        }
    }

    private static String zzp(int i7, int i8, String str) {
        if (i7 < 0) {
            return zzghs.zzd("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return zzghs.zzd("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 15);
        sb.append("negative size: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }
}

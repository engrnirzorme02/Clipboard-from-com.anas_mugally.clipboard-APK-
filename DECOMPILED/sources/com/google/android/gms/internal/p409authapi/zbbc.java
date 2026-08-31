package com.google.android.gms.internal.p409authapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zbbc {
    public static int zba(int i7, int i8, String str) {
        String strZba;
        if (i7 >= 0 && i7 < i8) {
            return i7;
        }
        if (i7 < 0) {
            strZba = zbbd.zba("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i8 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 15);
                sb.append("negative size: ");
                sb.append(i8);
                throw new IllegalArgumentException(sb.toString());
            }
            strZba = zbbd.zba("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException(strZba);
    }

    public static int zbb(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(zbd(i7, i8, "index"));
        }
        return i7;
    }

    public static void zbc(int i7, int i8, int i9) {
        String strZbd;
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            if (i7 < 0 || i7 > i9) {
                strZbd = zbd(i7, i9, "start index");
            } else {
                strZbd = (i8 < 0 || i8 > i9) ? zbd(i8, i9, "end index") : zbbd.zba("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strZbd);
        }
    }

    private static String zbd(int i7, int i8, String str) {
        if (i7 < 0) {
            return zbbd.zba("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return zbbd.zba("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 15);
        sb.append("negative size: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }
}

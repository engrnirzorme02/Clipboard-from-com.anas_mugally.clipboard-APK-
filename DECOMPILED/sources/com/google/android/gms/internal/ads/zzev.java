package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzev {
    public final int zzd;

    public static String zze(int i7) {
        char c7 = (char) ((i7 >> 24) & 255);
        int length = String.valueOf(c7).length();
        char c8 = (char) ((i7 >> 16) & 255);
        int length2 = String.valueOf(c8).length();
        char c9 = (char) ((i7 >> 8) & 255);
        char c10 = (char) (i7 & 255);
        StringBuilder sb = new StringBuilder(length + length2 + String.valueOf(c9).length() + String.valueOf(c10).length());
        sb.append(c7);
        sb.append(c8);
        sb.append(c9);
        sb.append(c10);
        return sb.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeq {
    public final String zza;

    private zzeq(int i7, int i8, String str) {
        this.zza = str;
    }

    public static zzeq zza(zzef zzefVar) {
        String str;
        zzefVar.zzk(2);
        int iZzs = zzefVar.zzs();
        int i7 = iZzs >> 1;
        int i8 = iZzs & 1;
        int iZzs2 = zzefVar.zzs() >> 3;
        if (i7 == 4 || i7 == 5 || i7 == 7 || i7 == 8) {
            str = "dvhe";
        } else if (i7 == 9) {
            str = "dvav";
        } else {
            if (i7 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i9 = iZzs2 | (i8 << 5);
        int length = String.valueOf(i7).length();
        int length2 = String.valueOf(i9).length();
        String str2 = i7 < 10 ? ".0" : ".";
        int length3 = str.length() + str2.length() + length;
        String str3 = i9 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(length3 + str3.length() + length2);
        sb.append(str);
        sb.append(str2);
        sb.append(i7);
        sb.append(str3);
        sb.append(i9);
        return new zzeq(i7, i9, sb.toString());
    }
}

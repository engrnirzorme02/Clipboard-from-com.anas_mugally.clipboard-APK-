package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
final class zzehj {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    zzehj(String str, String str2, int i7, long j7, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i7;
        this.zzd = j7;
        this.zze = num;
    }

    public final String toString() {
        Integer num;
        String str = this.zza;
        int i7 = this.zzc;
        long j7 = this.zzd;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i7).length() + 1 + String.valueOf(j7).length());
        sb.append(str);
        sb.append(".");
        sb.append(i7);
        sb.append(".");
        sb.append(j7);
        String string = sb.toString();
        String str2 = this.zzb;
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(str2).length());
            sb2.append(string);
            sb2.append(".");
            sb2.append(str2);
            string = sb2.toString();
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzbP)).booleanValue() || (num = this.zze) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb3 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb3.append(string);
        sb3.append(".");
        sb3.append(num);
        return sb3.toString();
    }
}

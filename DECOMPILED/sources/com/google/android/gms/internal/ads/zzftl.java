package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
class zzftl {
    static final String zza = new UUID(0, 0).toString();
    final zzftk zzb;
    final zzftj zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    zzftl(Context context, String str, String str2, String str3) {
        this.zzb = zzftk.zza(context);
        this.zzc = zzftj.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length() + str3.length());
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            return UUID.nameUUIDFromBytes(sb.toString().getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.zzh;
        int length = str4.length();
        String str5 = str2 == null ? "null" : "not null";
        int length2 = length + 88 + str5.length();
        String str6 = str3 == null ? "null" : "not null";
        StringBuilder sb2 = new StringBuilder(length2 + 13 + str6.length());
        sb2.append(str4);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb2.append(str5);
        sb2.append(", hashKey is ");
        sb2.append(str6);
        throw new IllegalArgumentException(sb2.toString());
    }

    final zzfti zza(String str, String str2, long j7, boolean z7) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String strZze = zze(true);
                    String strZzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (strZze != null && strZzc != null && !strZze.equals(zzh(str, str2, strZzc))) {
                        return zzb(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfti();
        }
        boolean z8 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jZzd = zzd(z8);
        if (jZzd != -1) {
            if (jCurrentTimeMillis < jZzd) {
                this.zzb.zzb(z8 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jZzd + j7) {
                return zzb(str, str2);
            }
        }
        String strZze2 = zze(z8);
        return (strZze2 != null || z7) ? new zzfti(strZze2, zzd(z8)) : zzb(str, str2);
    }

    final zzfti zzb(String str, String str2) throws IOException {
        if (str == null) {
            return zzf(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.zzb.zzb("paid_3p_hash_key", string);
        return zzf(zzh(str, str2, string), true);
    }

    final void zzc(boolean z7) throws IOException {
        String str = z7 ? this.zzg : this.zzf;
        zzftk zzftkVar = this.zzb;
        zzftkVar.zzf(str);
        zzftkVar.zzf(z7 ? this.zze : this.zzd);
    }

    final long zzd(boolean z7) {
        return this.zzb.zzd(z7 ? this.zzg : this.zzf, -1L);
    }

    final String zze(boolean z7) {
        return this.zzb.zzc(z7 ? this.zze : this.zzd, null);
    }

    final zzfti zzf(String str, boolean z7) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        zzftk zzftkVar = this.zzb;
        zzftkVar.zzb(z7 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
        zzftkVar.zzb(z7 ? this.zze : this.zzd, str);
        return new zzfti(str, jCurrentTimeMillis);
    }

    final boolean zzg(boolean z7) {
        return this.zzb.zzg(this.zzd);
    }
}

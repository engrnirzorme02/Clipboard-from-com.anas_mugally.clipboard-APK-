package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.ads.zzbbn;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqb {
    private static final ThreadLocal zza;

    static {
        zzph zzphVarZzi = zzpj.zzi();
        zzphVarZzi.zzf(-62135596800L);
        zzphVarZzi.zze(0);
        zzph zzphVarZzi2 = zzpj.zzi();
        zzphVarZzi2.zzf(253402300799L);
        zzphVarZzi2.zze(999999999);
        zzph zzphVarZzi3 = zzpj.zzi();
        zzphVarZzi3.zzf(0L);
        zzphVarZzi3.zze(0);
        zza = new zzqa();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzpj zza(zzpj zzpjVar) {
        long jZzg = zzpjVar.zzg();
        boolean zZze = zze(jZzg);
        int iZzf = zzpjVar.zzf();
        if (!zZze || iZzf < 0 || iZzf >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(jZzg), Integer.valueOf(iZzf)));
        }
        return zzpjVar;
    }

    public static zzpj zzb(long j7) {
        long jZza = j7 / 1000;
        if (!zze(jZza)) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(jZza)));
        }
        int i7 = (int) ((j7 % 1000) * 1000000);
        if (i7 <= -1000000000 || i7 >= 1000000000) {
            jZza = zzkk.zza(jZza, i7 / 1000000000);
            i7 %= 1000000000;
        }
        if (i7 < 0) {
            i7 += 1000000000;
            jZza = zzkk.zzb(jZza, 1L);
        }
        zzph zzphVarZzi = zzpj.zzi();
        zzphVarZzi.zzf(jZza);
        zzphVarZzi.zze(i7);
        zzpj zzpjVar = (zzpj) zzphVarZzi.zzk();
        zza(zzpjVar);
        return zzpjVar;
    }

    public static String zzc(zzpj zzpjVar) {
        String str;
        zza(zzpjVar);
        long jZzg = zzpjVar.zzg();
        int iZzf = zzpjVar.zzf();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) zza.get()).format(new Date(jZzg * 1000)));
        if (iZzf != 0) {
            sb.append(".");
            if (iZzf % 1000000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iZzf / 1000000));
            } else {
                str = iZzf % zzbbn.zzq.zzf == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iZzf / zzbbn.zzq.zzf)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iZzf));
            }
            sb.append(str);
        }
        sb.append("Z");
        return sb.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j7) {
        return j7 >= -62135596800L && j7 <= 253402300799L;
    }
}

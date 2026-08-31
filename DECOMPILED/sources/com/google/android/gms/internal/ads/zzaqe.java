package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqe {
    public static zzaoq zza(zzapd zzapdVar) {
        long j7;
        boolean z7;
        long j8;
        long j9;
        long j10;
        long j11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzapdVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZzb = str != null ? zzb(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i7 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z7 = false;
            j8 = 0;
            j9 = 0;
            while (i7 < strArrSplit.length) {
                String strTrim = strArrSplit[i7].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j9 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j8 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z7 = true;
                }
                i7++;
            }
            j7 = 0;
            i7 = 1;
        } else {
            j7 = 0;
            z7 = false;
            j8 = 0;
            j9 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZzb2 = str3 != null ? zzb(str3) : j7;
        String str4 = (String) map.get("Last-Modified");
        long jZzb3 = str4 != null ? zzb(str4) : j7;
        String str5 = (String) map.get("ETag");
        if (i7 != 0) {
            long j12 = (j9 * 1000) + jCurrentTimeMillis;
            j11 = z7 ? j12 : (j8 * 1000) + j12;
            j10 = j12;
        } else {
            j10 = (jZzb <= j7 || jZzb2 < jZzb) ? j7 : (jZzb2 - jZzb) + jCurrentTimeMillis;
            j11 = j10;
        }
        zzaoq zzaoqVar = new zzaoq();
        zzaoqVar.zza = zzapdVar.zzb;
        zzaoqVar.zzb = str5;
        zzaoqVar.zzf = j10;
        zzaoqVar.zze = j11;
        zzaoqVar.zzc = jZzb;
        zzaoqVar.zzd = jZzb3;
        zzaoqVar.zzg = map;
        zzaoqVar.zzh = zzapdVar.zzd;
        return zzaoqVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e7) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzapt.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzapt.zzd(e7, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static String zzc(long j7) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j7));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}

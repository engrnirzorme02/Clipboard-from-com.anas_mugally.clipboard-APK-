package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgyk {
    private static final zzgyk zzb = new zzgyk();
    private final Map zza = new HashMap();

    zzgyk() {
    }

    public static zzgyk zza() {
        return zzb;
    }

    public final synchronized void zzb(String str, zzgqs zzgqsVar) {
        try {
            Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, zzgqsVar);
                return;
            }
            if (((zzgqs) map.get(str)).equals(zzgqsVar)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(zzgqsVar);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(strValueOf);
            sb.append("), cannot insert ");
            sb.append(strValueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzgqs zzc(String str) {
        Map map;
        map = this.zza;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzgqs) map.get("AES128_GCM");
    }

    public final synchronized void zzd(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzb((String) entry.getKey(), (zzgqs) entry.getValue());
        }
    }
}

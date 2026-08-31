package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzftk {
    private static zzftk zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzftk(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static zzftk zza(Context context) {
        if (zza == null) {
            zza = new zzftk(context);
        }
        return zza;
    }

    final void zzb(String str, Object obj) throws IOException {
        boolean zCommit;
        if (obj instanceof String) {
            zCommit = this.zzc.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = this.zzc.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                if (obj instanceof Integer) {
                    zCommit = this.zzc.edit().putInt(str, ((Integer) obj).intValue()).commit();
                } else {
                    String strValueOf = String.valueOf(obj.getClass());
                    String str2 = this.zzb;
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 33 + String.valueOf(str2).length());
                    sb.append("Unexpected object class ");
                    sb.append(strValueOf);
                    sb.append(" for app ");
                    sb.append(str2);
                    Log.e("GpidLifecycleSPHandler", sb.toString());
                }
                String str3 = this.zzb;
                StringBuilder sb2 = new StringBuilder(str.length() + 25 + String.valueOf(str3).length());
                sb2.append("Failed to store ");
                sb2.append(str);
                sb2.append(" for app ");
                sb2.append(str3);
                throw new IOException(sb2.toString());
            }
            zCommit = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (zCommit) {
            return;
        }
        String str4 = this.zzb;
        StringBuilder sb3 = new StringBuilder(str.length() + 25 + String.valueOf(str4).length());
        sb3.append("Failed to store ");
        sb3.append(str);
        sb3.append(" for app ");
        sb3.append(str4);
        throw new IOException(sb3.toString());
    }

    final String zzc(String str, String str2) {
        return this.zzc.getString(str, null);
    }

    final long zzd(String str, long j7) {
        return this.zzc.getLong(str, -1L);
    }

    final boolean zze(String str, boolean z7) {
        return this.zzc.getBoolean(str, true);
    }

    final void zzf(String str) throws IOException {
        if (this.zzc.edit().remove(str).commit()) {
            return;
        }
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(str2).length());
        sb.append("Failed to remove ");
        sb.append(str);
        sb.append(" for app ");
        sb.append(str2);
        throw new IOException(sb.toString());
    }

    final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}

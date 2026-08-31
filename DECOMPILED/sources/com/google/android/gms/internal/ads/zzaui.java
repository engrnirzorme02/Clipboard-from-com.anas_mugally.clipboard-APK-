package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaui {
    public static final String zza(Context context, String str, long j7, boolean z7) {
        try {
            zzatc zzatcVarZza = zzatd.zza();
            zzatcVarZza.zzb(str);
            zzatcVarZza.zza("0.460000000");
            zzatcVarZza.zzd(context.getPackageName());
            zzatcVarZza.zzf((System.currentTimeMillis() - j7) / 1000);
            zzatcVarZza.zzc(System.currentTimeMillis() / 1000);
            try {
                zzatcVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzatcVarZza.zze(-1L);
            }
            zzatj zzatjVarZzc = zzatt.zzc(((zzatd) zzatcVarZza.zzbu()).zzaN(), null);
            zzatjVarZzc.zzc(5);
            zzatjVarZzc.zzd(2);
            return Base64.encodeToString(((zzatk) zzatjVarZzc.zzbu()).zzaN(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}

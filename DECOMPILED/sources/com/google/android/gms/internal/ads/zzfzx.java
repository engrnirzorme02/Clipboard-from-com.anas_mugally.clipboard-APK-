package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfzx {
    private final Context zza;
    private final zzgea zzb;
    private final zzfxt zzc;
    private final String zzd;

    zzfzx(Context context, zzgea zzgeaVar, zzfxt zzfxtVar, zzfui zzfuiVar) {
        this.zza = context;
        this.zzb = zzgeaVar;
        this.zzc = zzfxtVar;
        this.zzd = zzfuiVar.zzb();
    }

    public final String zza(boolean z7, long j7) {
        String string;
        zzgdy zzgdyVarZza = this.zzb.zza(55);
        try {
            try {
                try {
                    zzgdyVarZza.zza();
                    zzatc zzatcVarZza = zzatd.zza();
                    zzatcVarZza.zzb(this.zzd);
                    zzatcVarZza.zza("0.794714348");
                    Context context = this.zza;
                    zzatcVarZza.zzd(context.getPackageName());
                    zzatcVarZza.zzc(System.currentTimeMillis() / 1000);
                    zzatcVarZza.zzf((System.currentTimeMillis() - j7) / 1000);
                    try {
                        zzatcVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        zzatcVarZza.zze(-1L);
                    }
                    zzfxt zzfxtVar = this.zzc;
                    if (!zzfxtVar.zzc()) {
                        zzfxtVar.zza();
                    }
                    zzatj zzatjVarZzf = zzfxtVar.zzf(((zzatd) zzatcVarZza.zzbu()).zzaN(), null);
                    zzatjVarZzf.zzc(5);
                    zzatjVarZzf.zzd(2);
                    byte[] bArrZzaN = ((zzatk) zzatjVarZzf.zzbu()).zzaN();
                    string = zzgmk.zzm().zzh().zzj(bArrZzaN, 0, bArrZzaN.length);
                } catch (UnsupportedEncodingException e7) {
                    zzgdyVarZza.zzb(e7);
                    string = Integer.toString(7);
                }
                zzgdyVarZza.zzc();
                return string;
            } catch (Throwable th) {
                zzgdyVarZza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgdyVarZza.zzc();
            throw th2;
        }
    }
}

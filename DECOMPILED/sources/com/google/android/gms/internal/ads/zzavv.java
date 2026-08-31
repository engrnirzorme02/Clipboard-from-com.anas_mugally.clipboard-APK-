package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzavv implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzavx zzb;

    zzavv(zzavx zzavxVar, int i7, boolean z7) {
        this.zza = i7;
        Objects.requireNonNull(zzavxVar);
        this.zzb = zzavxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzast zzastVarZza;
        int i7 = this.zza;
        zzavx zzavxVar = this.zzb;
        if (i7 > 0) {
            try {
                Thread.sleep(i7 * zzbbn.zzq.zzf);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzavxVar.zza;
            zzastVarZza = zzfoo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzastVarZza = null;
        }
        zzavx zzavxVar2 = this.zzb;
        zzavxVar2.zzs(zzastVarZza);
        int i8 = this.zza;
        if (i8 < 4) {
            if (zzastVarZza != null && zzastVarZza.zza() && !zzastVarZza.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzastVarZza.zze() && zzastVarZza.zzg().zza() && zzastVarZza.zzg().zzb() != -2) {
                return;
            }
            zzavxVar2.zzp(i8 + 1, true);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfto {
    private static zzfto zzb;
    final zzftk zza;

    private zzfto(Context context) {
        this.zza = zzftk.zza(context);
        zzftj.zza(context);
    }

    public static final zzfto zza(Context context) {
        zzfto zzftoVar;
        synchronized (zzfto.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfto(context);
                }
                zzftoVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzftoVar;
    }

    public final void zzb(zzfti zzftiVar) {
        synchronized (zzfto.class) {
            zzftk zzftkVar = this.zza;
            zzftkVar.zzf("vendor_scoped_gpid_v2_id");
            zzftkVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}

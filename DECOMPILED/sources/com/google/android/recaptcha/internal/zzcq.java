package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import p173W5.InterfaceC1875e;
import p318o6.AbstractC6672k;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j7, InterfaceC1875e interfaceC1875e) {
        return zzcv.zzh(zza(application), str, j7, null, null, null, interfaceC1875e, 28, null);
    }

    public static final Task zzc(Application application, String str, long j7) {
        return zzas.zza(AbstractC6672k.m28225b(zza(application).zzd().zza(), null, null, new zzco(application, str, j7, null), 3, null));
    }

    public static final Object zzd(Application application, String str, InterfaceC1875e interfaceC1875e) {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, interfaceC1875e, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzas.zza(AbstractC6672k.m28225b(zza(application).zzd().zza(), null, null, new zzcp(application, str, null), 3, null));
    }
}

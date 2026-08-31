package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class zzfzv extends zzfzq {
    private final DisplayMetrics zza;
    private final View zzb;

    zzfzv(zzarw zzarwVar, zzfym zzfymVar, DisplayMetrics displayMetrics, View view, zzgea zzgeaVar) {
        super("uPnxRmNxKnxatA3tTMUWOedbsmvc/x71nNhoYLkUbyjWQ98RCfWvVlhsOCQ2OJT2", "VhSlnRRMF+g0APHj5U0WTKxVM1iKXkL1bjHWDp7ZT0E=", zzarwVar, zzfymVar, zzgeaVar.zza(124));
        this.zza = displayMetrics;
        this.zzb = view;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        View view = this.zzb;
        if (view == null) {
            return;
        }
        Object objInvoke = method.invoke("", this.zza, view);
        objInvoke.getClass();
        Long[] lArr = (Long[]) objInvoke;
        zzasr zzasrVarZza = zzass.zza();
        zzasrVarZza.zzb(lArr[2].longValue());
        zzasrVarZza.zzc(lArr[1].longValue());
        zzasrVarZza.zzd(lArr[0].longValue());
        zzasrVarZza.zza(lArr[3].longValue());
        zzasrVarZza.zze(lArr[4].longValue());
        zzarwVar.zzM((zzass) zzasrVarZza.zzbu());
    }
}

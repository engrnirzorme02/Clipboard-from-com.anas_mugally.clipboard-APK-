package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfue {
    private static final Object zza = new Object();
    private static zzfue zzb;
    private final zzfuc zzc;

    private zzfue(Context context, ExecutorService executorService, zzfui zzfuiVar) {
        zzfuo zzfuoVar = new zzfuo(null);
        zzfuoVar.zzc(context);
        zzfuoVar.zzb(executorService);
        zzfuoVar.zzd(zzfuiVar);
        this.zzc = (zzfuc) ((zzfun) zzfuoVar.zza()).zzE.zzb();
    }

    public static zzfue zza(Context context, ExecutorService executorService, zzfui zzfuiVar) {
        zzfue zzfueVar;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = new zzfue(context, executorService, zzfuiVar);
                }
                zzfueVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfueVar;
    }

    public final InterfaceFutureC1673e zzb() {
        return this.zzc.zza();
    }

    public final String zzc(Context context) {
        return this.zzc.zzb(context);
    }

    public final String zzd(Context context, String str, View view, Activity activity) {
        return this.zzc.zzc(context, null, view, activity);
    }

    public final String zze(Context context, String str, View view, Activity activity) {
        return this.zzc.zzd(context, str, view, null);
    }

    public final void zzf(List list) {
        this.zzc.zze(list);
    }

    public final void zzg(InputEvent inputEvent) {
        this.zzc.zzf(inputEvent);
    }

    public final int zzh() {
        return this.zzc.zzh();
    }
}

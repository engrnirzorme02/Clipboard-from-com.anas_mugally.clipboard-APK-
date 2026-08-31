package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import p396y2.AbstractBinderC7534v;

/* JADX INFO: loaded from: classes2.dex */
final class zzecq extends TimerTask {
    final /* synthetic */ AlertDialog zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ AbstractBinderC7534v zzc;

    zzecq(zzecy zzecyVar, AlertDialog alertDialog, Timer timer, AbstractBinderC7534v abstractBinderC7534v) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = abstractBinderC7534v;
        Objects.requireNonNull(zzecyVar);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        AbstractBinderC7534v abstractBinderC7534v = this.zzc;
        if (abstractBinderC7534v != null) {
            abstractBinderC7534v.zzb();
        }
    }
}

package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import p318o6.AbstractC6672k;

/* JADX INFO: loaded from: classes2.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzes zzesVar = this.zza;
        AbstractC6672k.m28227d(zzesVar.zzd, null, null, new zzeq(zzesVar, null), 3, null);
    }
}

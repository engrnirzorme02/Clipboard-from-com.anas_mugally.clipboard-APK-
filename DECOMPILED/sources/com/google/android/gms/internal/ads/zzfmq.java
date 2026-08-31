package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfmq extends BroadcastReceiver {
    final /* synthetic */ zzfmr zza;

    zzfmq(zzfmr zzfmrVar) {
        Objects.requireNonNull(zzfmrVar);
        this.zza = zzfmrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfmr zzfmrVar = this.zza;
            zzfmrVar.zzd(true, zzfmrVar.zzf());
            zzfmrVar.zze(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfmr zzfmrVar2 = this.zza;
            zzfmrVar2.zzd(false, zzfmrVar2.zzf());
            zzfmrVar2.zze(false);
        }
    }
}

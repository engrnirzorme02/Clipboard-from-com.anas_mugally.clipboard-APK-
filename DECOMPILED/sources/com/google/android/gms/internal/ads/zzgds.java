package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgds extends BroadcastReceiver implements zzgcz {
    private boolean zza = true;

    zzgds(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    private final synchronized void zze(boolean z7) {
        this.zza = z7;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zze(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zze(false);
        }
    }

    final synchronized boolean zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzb(Map map) {
        map.put("up", Boolean.valueOf(zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzc(Map map, Context context, View view) {
        map.put("up", Boolean.valueOf(zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    public final void zzd(Map map) {
        map.put("up", Boolean.valueOf(zza()));
    }
}

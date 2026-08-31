package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzpc extends BroadcastReceiver {
    final /* synthetic */ zzpe zza;

    /* synthetic */ zzpc(zzpe zzpeVar, byte[] bArr) {
        Objects.requireNonNull(zzpeVar);
        this.zza = zzpeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzpe zzpeVar = this.zza;
        zzpeVar.zzf(zzoz.zzb(context, intent, zzpeVar.zzj(), zzpeVar.zzh()));
    }
}

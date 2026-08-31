package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.AbstractC3561i;
import com.google.android.gms.location.InterfaceC3963b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg implements InterfaceC3963b {
    public final AbstractC3561i removeActivityUpdates(AbstractC3560h abstractC3560h, PendingIntent pendingIntent) {
        return abstractC3560h.mo17772b(new zze(this, abstractC3560h, pendingIntent));
    }

    public final AbstractC3561i requestActivityUpdates(AbstractC3560h abstractC3560h, long j7, PendingIntent pendingIntent) {
        return abstractC3560h.mo17772b(new zzd(this, abstractC3560h, j7, pendingIntent));
    }
}

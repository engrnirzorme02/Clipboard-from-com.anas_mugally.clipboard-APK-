package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.AbstractC3561i;
import com.google.android.gms.location.C3951P;
import com.google.android.gms.location.C3969h;
import com.google.android.gms.location.InterfaceC3967f;
import com.google.android.gms.location.InterfaceC3968g;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf implements InterfaceC3968g {
    public final AbstractC3561i addGeofences(AbstractC3560h abstractC3560h, C3969h c3969h, PendingIntent pendingIntent) {
        return abstractC3560h.mo17772b(new zzac(this, abstractC3560h, c3969h, pendingIntent));
    }

    public final AbstractC3561i removeGeofences(AbstractC3560h abstractC3560h, PendingIntent pendingIntent) {
        return zza(abstractC3560h, C3951P.m18388U(pendingIntent));
    }

    public final AbstractC3561i zza(AbstractC3560h abstractC3560h, C3951P c3951p) {
        return abstractC3560h.mo17772b(new zzad(this, abstractC3560h, c3951p));
    }

    @Deprecated
    public final AbstractC3561i addGeofences(AbstractC3560h abstractC3560h, List<InterfaceC3967f> list, PendingIntent pendingIntent) {
        C3969h.a aVar = new C3969h.a();
        aVar.m18393b(list);
        aVar.m18395d(5);
        return abstractC3560h.mo17772b(new zzac(this, abstractC3560h, aVar.m18394c(), pendingIntent));
    }

    public final AbstractC3561i removeGeofences(AbstractC3560h abstractC3560h, List<String> list) {
        return zza(abstractC3560h, C3951P.m18387T(list));
    }
}

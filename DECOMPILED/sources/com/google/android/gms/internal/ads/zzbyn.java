package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3244B;
import p157U3.InterfaceFutureC1673e;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyn {
    public final InterfaceFutureC1673e zza(Context context, int i7) {
        zzbzm zzbzmVar = new zzbzm();
        C3244B.m17190a();
        if (C7590g.m33272B(context)) {
            zzbzh.zza.execute(new zzbym(this, context, zzbzmVar));
        }
        return zzbzmVar;
    }
}

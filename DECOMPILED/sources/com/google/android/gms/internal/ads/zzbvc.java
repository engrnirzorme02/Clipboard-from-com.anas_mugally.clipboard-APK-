package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvc {
    private final WeakHashMap zza = new WeakHashMap();

    public final Future zza(Context context) {
        return zzbzh.zza.submit(new zzbva(this, context));
    }

    final /* synthetic */ WeakHashMap zzb() {
        return this.zza;
    }
}

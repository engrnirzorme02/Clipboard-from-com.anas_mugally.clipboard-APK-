package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzbzh;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3422B {
    private final Runnable zza = new RunnableC3461a(this);
    private volatile Thread zzb;

    public abstract void zza();

    public InterfaceFutureC1673e zzb() {
        return zzbzh.zza.submit(this.zza);
    }

    final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }
}

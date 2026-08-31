package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzcyr implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcyt zzcytVar = (zzcyt) this.zza.get();
        if (zzcytVar != null) {
            zzcytVar.zzs(zzcyq.zza);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcgp extends Thread {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzcgq zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcgp(zzcgq zzcgqVar, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.zza = runnable2;
        Objects.requireNonNull(zzcgqVar);
        this.zzb = zzcgqVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.zzb.zza());
        this.zza.run();
    }
}

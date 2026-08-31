package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeh implements zzdb {
    protected zzeh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdb
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.zzdb
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdb
    public final long zzc() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.internal.ads.zzdb
    public final zzdl zzd(Looper looper, Handler.Callback callback) {
        return new zzej(new Handler(looper, callback));
    }
}

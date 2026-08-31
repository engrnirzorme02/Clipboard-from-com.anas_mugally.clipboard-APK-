package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public interface zzzn extends Executor {
    static zzzn zzb(Executor executor, zzdf zzdfVar) {
        return new zzzm(executor, zzdfVar);
    }

    void zza();
}

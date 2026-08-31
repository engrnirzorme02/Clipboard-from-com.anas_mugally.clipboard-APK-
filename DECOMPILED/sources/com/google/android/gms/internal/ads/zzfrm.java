package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzfrm implements zzfrl {
    private zzfrm() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrl
    public final ExecutorService zza(int i7, ThreadFactory threadFactory, int i8) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i7, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.zzfrl
    public final ExecutorService zzb(int i7) {
        return zza(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzfrl
    public final ExecutorService zzc(ThreadFactory threadFactory, int i7) {
        return zza(1, threadFactory, 1);
    }

    /* synthetic */ zzfrm(byte[] bArr) {
    }
}

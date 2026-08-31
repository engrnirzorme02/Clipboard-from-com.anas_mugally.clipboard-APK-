package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public interface zzgpd extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgpd
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    InterfaceFutureC1673e submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgpd
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    InterfaceFutureC1673e submit(Runnable runnable, Object obj);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgpd
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    InterfaceFutureC1673e submit(Callable callable);
}

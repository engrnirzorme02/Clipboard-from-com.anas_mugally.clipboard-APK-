package com.android.billingclient.api;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.android.billingclient.api.p */
/* JADX INFO: loaded from: classes.dex */
final class ThreadFactoryC3190p implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private final ThreadFactory f13655a;

    /* JADX INFO: renamed from: b */
    private final AtomicInteger f13656b;

    ThreadFactoryC3190p(C3176b c3176b) {
        Objects.requireNonNull(c3176b);
        this.f13655a = Executors.defaultThreadFactory();
        this.f13656b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f13656b;
        Thread threadNewThread = this.f13655a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}

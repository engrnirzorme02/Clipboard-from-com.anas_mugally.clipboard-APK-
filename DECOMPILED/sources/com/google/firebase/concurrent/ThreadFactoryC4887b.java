package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.google.firebase.concurrent.b */
/* JADX INFO: loaded from: classes.dex */
class ThreadFactoryC4887b implements ThreadFactory {

    /* JADX INFO: renamed from: e */
    private static final ThreadFactory f18570e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a */
    private final AtomicLong f18571a = new AtomicLong();

    /* JADX INFO: renamed from: b */
    private final String f18572b;

    /* JADX INFO: renamed from: c */
    private final int f18573c;

    /* JADX INFO: renamed from: d */
    private final StrictMode.ThreadPolicy f18574d;

    ThreadFactoryC4887b(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f18572b = str;
        this.f18573c = i7;
        this.f18574d = threadPolicy;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m22077a(ThreadFactoryC4887b threadFactoryC4887b, Runnable runnable) {
        Process.setThreadPriority(threadFactoryC4887b.f18573c);
        StrictMode.ThreadPolicy threadPolicy = threadFactoryC4887b.f18574d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f18570e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC4887b.m22077a(this.f18568a, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f18572b, Long.valueOf(this.f18571a.getAndIncrement())));
        return threadNewThread;
    }
}

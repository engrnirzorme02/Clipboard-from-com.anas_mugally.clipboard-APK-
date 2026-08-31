package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p217c3.ThreadFactoryC3009b;
import p277j5.AbstractC5897b;
import p277j5.EnumC5898c;

/* JADX INFO: renamed from: com.google.firebase.messaging.n */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5001n {
    /* JADX INFO: renamed from: a */
    private static Executor m22541a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3009b(str));
    }

    /* JADX INFO: renamed from: b */
    static Executor m22542b() {
        return m22541a("Firebase-Messaging-File-Io");
    }

    /* JADX INFO: renamed from: c */
    static ScheduledExecutorService m22543c() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3009b("Firebase-Messaging-Init"));
    }

    /* JADX INFO: renamed from: d */
    static ExecutorService m22544d() {
        return AbstractC5897b.m26637a().mo26636a(new ThreadFactoryC3009b("Firebase-Messaging-Intent-Handle"), EnumC5898c.HIGH_SPEED);
    }

    /* JADX INFO: renamed from: e */
    static ExecutorService m22545e() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC3009b("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: renamed from: f */
    static ExecutorService m22546f() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC3009b("Firebase-Messaging-Task"));
    }

    /* JADX INFO: renamed from: g */
    static ScheduledExecutorService m22547g() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3009b("Firebase-Messaging-Topics-Io"));
    }
}

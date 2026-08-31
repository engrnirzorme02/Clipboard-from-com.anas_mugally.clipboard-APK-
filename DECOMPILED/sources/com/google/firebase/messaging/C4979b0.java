package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.b0 */
/* JADX INFO: loaded from: classes.dex */
final class C4979b0 {

    /* JADX INFO: renamed from: d */
    private static WeakReference f18905d;

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f18906a;

    /* JADX INFO: renamed from: b */
    private C4973X f18907b;

    /* JADX INFO: renamed from: c */
    private final Executor f18908c;

    private C4979b0(SharedPreferences sharedPreferences, Executor executor) {
        this.f18908c = executor;
        this.f18906a = sharedPreferences;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C4979b0 m22448b(Context context, Executor executor) {
        C4979b0 c4979b0;
        try {
            WeakReference weakReference = f18905d;
            c4979b0 = weakReference != null ? (C4979b0) weakReference.get() : null;
            if (c4979b0 == null) {
                c4979b0 = new C4979b0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c4979b0.m22449d();
                f18905d = new WeakReference(c4979b0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c4979b0;
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m22449d() {
        this.f18907b = C4973X.m22411d(this.f18906a, "topic_operation_queue", ",", this.f18908c);
    }

    /* JADX INFO: renamed from: a */
    synchronized boolean m22450a(C4977a0 c4977a0) {
        return this.f18907b.m22415b(c4977a0.m22442e());
    }

    /* JADX INFO: renamed from: c */
    synchronized C4977a0 m22451c() {
        return C4977a0.m22437a(this.f18907b.m22416f());
    }

    /* JADX INFO: renamed from: e */
    synchronized boolean m22452e(C4977a0 c4977a0) {
        return this.f18907b.m22417g(c4977a0.m22442e());
    }
}

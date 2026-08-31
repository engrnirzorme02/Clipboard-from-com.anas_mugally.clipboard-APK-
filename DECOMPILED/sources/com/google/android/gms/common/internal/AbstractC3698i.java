package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import p170W2.C1837b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3698i {

    /* JADX INFO: renamed from: a */
    private static final Object f14792a = new Object();

    /* JADX INFO: renamed from: b */
    private static int f14793b = 9;

    /* JADX INFO: renamed from: c */
    private static C3723u0 f14794c = null;

    /* JADX INFO: renamed from: d */
    static HandlerThread f14795d = null;

    /* JADX INFO: renamed from: e */
    private static Executor f14796e = null;

    /* JADX INFO: renamed from: f */
    private static boolean f14797f = false;

    /* JADX INFO: renamed from: a */
    public static AbstractC3698i m18034a(Context context) {
        synchronized (f14792a) {
            try {
                if (f14794c == null) {
                    f14794c = new C3723u0(context.getApplicationContext(), f14797f ? m18035b().getLooper() : context.getMainLooper(), f14796e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14794c;
    }

    /* JADX INFO: renamed from: b */
    public static HandlerThread m18035b() {
        synchronized (f14792a) {
            try {
                HandlerThread handlerThread = f14795d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f14793b);
                f14795d = handlerThread2;
                handlerThread2.start();
                return f14795d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    protected abstract C1837b mo18036c(C3715q0 c3715q0, ServiceConnection serviceConnection, String str, Executor executor);

    /* JADX INFO: renamed from: d */
    protected abstract void mo18037d(C3715q0 c3715q0, ServiceConnection serviceConnection, String str);

    /* JADX INFO: renamed from: e */
    public final void m18038e(String str, String str2, int i7, ServiceConnection serviceConnection, String str3, boolean z7) {
        mo18037d(new C3715q0(str, str2, 4225, z7), serviceConnection, str3);
    }
}

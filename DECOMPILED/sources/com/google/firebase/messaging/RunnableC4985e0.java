package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.firebase.messaging.e0 */
/* JADX INFO: loaded from: classes.dex */
class RunnableC4985e0 implements Runnable {

    /* JADX INFO: renamed from: f */
    private static final Object f18931f = new Object();

    /* JADX INFO: renamed from: r */
    private static Boolean f18932r;

    /* JADX INFO: renamed from: s */
    private static Boolean f18933s;

    /* JADX INFO: renamed from: a */
    private final Context f18934a;

    /* JADX INFO: renamed from: b */
    private final C4957G f18935b;

    /* JADX INFO: renamed from: c */
    private final PowerManager.WakeLock f18936c;

    /* JADX INFO: renamed from: d */
    private final C4983d0 f18937d;

    /* JADX INFO: renamed from: e */
    private final long f18938e;

    /* JADX INFO: renamed from: com.google.firebase.messaging.e0$a */
    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private RunnableC4985e0 f18939a;

        public a(RunnableC4985e0 runnableC4985e0) {
            this.f18939a = runnableC4985e0;
        }

        /* JADX INFO: renamed from: a */
        public void m22505a() {
            if (RunnableC4985e0.m22504j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC4985e0.this.f18934a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                RunnableC4985e0 runnableC4985e0 = this.f18939a;
                if (runnableC4985e0 == null) {
                    return;
                }
                if (runnableC4985e0.m22503i()) {
                    if (RunnableC4985e0.m22504j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f18939a.f18937d.m22483l(this.f18939a, 0L);
                    context.unregisterReceiver(this);
                    this.f18939a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    RunnableC4985e0(C4983d0 c4983d0, Context context, C4957G c4957g, long j7) {
        this.f18937d = c4983d0;
        this.f18934a = context;
        this.f18938e = j7;
        this.f18935b = c4957g;
        this.f18936c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* JADX INFO: renamed from: e */
    private static String m22499e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* JADX INFO: renamed from: f */
    private static boolean m22500f(Context context) {
        boolean zBooleanValue;
        synchronized (f18931f) {
            try {
                Boolean bool = f18933s;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m22501g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f18933s = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m22501g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z7 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z7 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m22499e(str));
        }
        return z7;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m22502h(Context context) {
        boolean zBooleanValue;
        synchronized (f18931f) {
            try {
                Boolean bool = f18932r;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? m22501g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f18932r = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public synchronized boolean m22503i() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f18934a.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static boolean m22504j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m22502h(this.f18934a)) {
            this.f18936c.acquire(AbstractC4982d.f18918a);
        }
        try {
            try {
                try {
                    this.f18937d.m22485n(true);
                    if (!this.f18935b.m22348g()) {
                        this.f18937d.m22485n(false);
                        if (!m22502h(this.f18934a)) {
                            return;
                        } else {
                            wakeLock = this.f18936c;
                        }
                    } else if (!m22500f(this.f18934a) || m22503i()) {
                        if (this.f18937d.m22488r()) {
                            this.f18937d.m22485n(false);
                        } else {
                            this.f18937d.m22489s(this.f18938e);
                        }
                        if (!m22502h(this.f18934a)) {
                            return;
                        } else {
                            wakeLock = this.f18936c;
                        }
                    } else {
                        new a(this).m22505a();
                        if (!m22502h(this.f18934a)) {
                            return;
                        } else {
                            wakeLock = this.f18936c;
                        }
                    }
                    wakeLock.release();
                } catch (RuntimeException unused) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } catch (IOException e7) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e7.getMessage());
                this.f18937d.m22485n(false);
                if (m22502h(this.f18934a)) {
                    this.f18936c.release();
                }
            }
        } catch (Throwable th) {
            if (m22502h(this.f18934a)) {
                try {
                    this.f18936c.release();
                } catch (RuntimeException unused2) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}

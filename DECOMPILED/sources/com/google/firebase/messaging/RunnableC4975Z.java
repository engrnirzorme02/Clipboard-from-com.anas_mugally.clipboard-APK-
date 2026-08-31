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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p217c3.ThreadFactoryC3009b;

/* JADX INFO: renamed from: com.google.firebase.messaging.Z */
/* JADX INFO: loaded from: classes.dex */
class RunnableC4975Z implements Runnable {

    /* JADX INFO: renamed from: a */
    private final long f18872a;

    /* JADX INFO: renamed from: b */
    private final PowerManager.WakeLock f18873b;

    /* JADX INFO: renamed from: c */
    private final FirebaseMessaging f18874c;

    /* JADX INFO: renamed from: d */
    ExecutorService f18875d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3009b("firebase-iid-executor"));

    /* JADX INFO: renamed from: com.google.firebase.messaging.Z$a */
    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private RunnableC4975Z f18876a;

        /* JADX INFO: renamed from: b */
        private Context f18877b;

        public a(RunnableC4975Z runnableC4975Z) {
            this.f18876a = runnableC4975Z;
        }

        /* JADX INFO: renamed from: a */
        public void m22433a() {
            if (RunnableC4975Z.m22429c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            RunnableC4975Z runnableC4975Z = this.f18876a;
            if (runnableC4975Z != null) {
                Context contextM22430b = runnableC4975Z.m22430b();
                this.f18877b = contextM22430b;
                contextM22430b.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC4975Z runnableC4975Z = this.f18876a;
            if (runnableC4975Z != null && runnableC4975Z.m22431d()) {
                if (RunnableC4975Z.m22429c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f18876a.f18874c.m22319l(this.f18876a, 0L);
                Context context2 = this.f18877b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f18876a = null;
            }
        }
    }

    public RunnableC4975Z(FirebaseMessaging firebaseMessaging, long j7) {
        this.f18874c = firebaseMessaging;
        this.f18872a = j7;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) m22430b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f18873b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    /* JADX INFO: renamed from: c */
    static boolean m22429c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: renamed from: b */
    Context m22430b() {
        return this.f18874c.m22320m();
    }

    /* JADX INFO: renamed from: d */
    boolean m22431d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m22430b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: e */
    boolean m22432e() throws IOException {
        try {
            if (this.f18874c.m22318k() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e7) {
            if (!C4951B.m22250h(e7.getMessage())) {
                if (e7.getMessage() != null) {
                    throw e7;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e7.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C4971V.m22403b().m22407e(m22430b())) {
            this.f18873b.acquire();
        }
        try {
            this.f18874c.m22324x(true);
            if (!this.f18874c.m22323w()) {
                this.f18874c.m22324x(false);
            } else if (!C4971V.m22403b().m22406d(m22430b()) || m22431d()) {
                if (m22432e()) {
                    this.f18874c.m22324x(false);
                } else {
                    this.f18874c.m22316C(this.f18872a);
                }
            } else {
                new a(this).m22433a();
            }
        } catch (IOException e7) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e7.getMessage() + ". Won't retry the operation.");
            this.f18874c.m22324x(false);
        } finally {
            if (C4971V.m22403b().m22407e(m22430b())) {
                this.f18873b.release();
            }
        }
    }
}

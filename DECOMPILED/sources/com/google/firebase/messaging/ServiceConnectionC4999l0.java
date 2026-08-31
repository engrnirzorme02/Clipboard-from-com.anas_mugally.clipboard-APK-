package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p209b3.C2959a;
import p217c3.ThreadFactoryC3009b;

/* JADX INFO: renamed from: com.google.firebase.messaging.l0 */
/* JADX INFO: loaded from: classes.dex */
class ServiceConnectionC4999l0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final Context f18965a;

    /* JADX INFO: renamed from: b */
    private final Intent f18966b;

    /* JADX INFO: renamed from: c */
    private final ScheduledExecutorService f18967c;

    /* JADX INFO: renamed from: d */
    private final Queue f18968d;

    /* JADX INFO: renamed from: e */
    private BinderC4993i0 f18969e;

    /* JADX INFO: renamed from: f */
    private boolean f18970f;

    /* JADX INFO: renamed from: com.google.firebase.messaging.l0$a */
    static class a {

        /* JADX INFO: renamed from: a */
        final Intent f18971a;

        /* JADX INFO: renamed from: b */
        private final TaskCompletionSource f18972b = new TaskCompletionSource();

        a(Intent intent) {
            this.f18971a = intent;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m22529b(a aVar) {
            aVar.getClass();
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f18971a.getAction() + " finishing.");
            aVar.m22531d();
        }

        /* JADX INFO: renamed from: c */
        void m22530c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.j0
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC4999l0.a.m22529b(this.f18963a);
                }
            }, 20L, TimeUnit.SECONDS);
            m22532e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.k0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: d */
        public void m22531d() {
            this.f18972b.trySetResult(null);
        }

        /* JADX INFO: renamed from: e */
        Task m22532e() {
            return this.f18972b.getTask();
        }
    }

    ServiceConnectionC4999l0(Context context, String str) {
        this(context, str, m22523a());
    }

    /* JADX INFO: renamed from: a */
    private static ScheduledThreadPoolExecutor m22523a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3009b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    private void m22524b() {
        while (!this.f18968d.isEmpty()) {
            ((a) this.f18968d.poll()).m22531d();
        }
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m22525c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f18968d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                BinderC4993i0 binderC4993i0 = this.f18969e;
                if (binderC4993i0 == null || !binderC4993i0.isBinderAlive()) {
                    m22526e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f18969e.m22522b((a) this.f18968d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m22526e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f18970f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f18970f) {
            return;
        }
        this.f18970f = true;
        try {
            if (C2959a.m14804b().m14809a(this.f18965a, this.f18966b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e7) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e7);
        }
        this.f18970f = false;
        m22524b();
    }

    /* JADX INFO: renamed from: d */
    synchronized Task m22527d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.m22530c(this.f18967c);
            this.f18968d.add(aVar);
            m22525c();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.m22532e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f18970f = false;
            if (iBinder instanceof BinderC4993i0) {
                this.f18969e = (BinderC4993i0) iBinder;
                m22525c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            m22524b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m22525c();
    }

    ServiceConnectionC4999l0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f18968d = new ArrayDeque();
        this.f18970f = false;
        Context applicationContext = context.getApplicationContext();
        this.f18965a = applicationContext;
        this.f18966b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f18967c = scheduledExecutorService;
    }
}

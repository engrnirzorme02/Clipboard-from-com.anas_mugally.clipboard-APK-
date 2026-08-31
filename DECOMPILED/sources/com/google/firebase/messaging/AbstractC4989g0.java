package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
import p315o3.C6575a;

/* JADX INFO: renamed from: com.google.firebase.messaging.g0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC4989g0 {

    /* JADX INFO: renamed from: a */
    static final long f18947a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b */
    private static final Object f18948b = new Object();

    /* JADX INFO: renamed from: c */
    private static C6575a f18949c;

    /* JADX INFO: renamed from: b */
    private static void m22507b(Context context) {
        if (f18949c == null) {
            C6575a c6575a = new C6575a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f18949c = c6575a;
            c6575a.m27889d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: c */
    public static void m22508c(Intent intent) {
        synchronized (f18948b) {
            try {
                if (f18949c != null && m22509d(intent)) {
                    m22511f(intent, false);
                    f18949c.m27888c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    static boolean m22509d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: renamed from: e */
    static void m22510e(Context context, ServiceConnectionC4999l0 serviceConnectionC4999l0, final Intent intent) {
        synchronized (f18948b) {
            try {
                m22507b(context);
                boolean zM22509d = m22509d(intent);
                m22511f(intent, true);
                if (!zM22509d) {
                    f18949c.m27886a(f18947a);
                }
                serviceConnectionC4999l0.m22527d(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.f0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        AbstractC4989g0.m22508c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m22511f(Intent intent, boolean z7) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z7);
    }

    /* JADX INFO: renamed from: g */
    static ComponentName m22512g(Context context, Intent intent) {
        synchronized (f18948b) {
            try {
                m22507b(context);
                boolean zM22509d = m22509d(intent);
                m22511f(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zM22509d) {
                    f18949c.m27886a(f18947a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

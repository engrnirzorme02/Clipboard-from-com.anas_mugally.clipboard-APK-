package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.measurement.ExecutorC2688k;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.m */
/* JADX INFO: loaded from: classes.dex */
public class C5000m {

    /* JADX INFO: renamed from: c */
    private static final Object f18973c = new Object();

    /* JADX INFO: renamed from: d */
    private static ServiceConnectionC4999l0 f18974d;

    /* JADX INFO: renamed from: a */
    private final Context f18975a;

    /* JADX INFO: renamed from: b */
    private final Executor f18976b = new ExecutorC2688k();

    public C5000m(Context context) {
        this.f18975a = context;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m22533a(Context context, Intent intent, boolean z7, Task task) {
        return (AbstractC3760o.m18199g() && ((Integer) task.getResult()).intValue() == 402) ? m22537e(context, intent, z7).continueWith(new ExecutorC2688k(), new Continuation() { // from class: com.google.firebase.messaging.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return C5000m.m22536d(task2);
            }
        }) : task;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m22535c(Task task) {
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Integer m22536d(Task task) {
        return 403;
    }

    /* JADX INFO: renamed from: e */
    private static Task m22537e(Context context, Intent intent, boolean z7) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        ServiceConnectionC4999l0 serviceConnectionC4999l0M22538f = m22538f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z7) {
            return serviceConnectionC4999l0M22538f.m22527d(intent).continueWith(new ExecutorC2688k(), new Continuation() { // from class: com.google.firebase.messaging.l
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return C5000m.m22535c(task);
                }
            });
        }
        if (C4971V.m22403b().m22407e(context)) {
            AbstractC4989g0.m22510e(context, serviceConnectionC4999l0M22538f, intent);
        } else {
            serviceConnectionC4999l0M22538f.m22527d(intent);
        }
        return Tasks.forResult(-1);
    }

    /* JADX INFO: renamed from: f */
    private static ServiceConnectionC4999l0 m22538f(Context context, String str) {
        ServiceConnectionC4999l0 serviceConnectionC4999l0;
        synchronized (f18973c) {
            try {
                if (f18974d == null) {
                    f18974d = new ServiceConnectionC4999l0(context, str);
                }
                serviceConnectionC4999l0 = f18974d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceConnectionC4999l0;
    }

    /* JADX INFO: renamed from: g */
    public Task m22539g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m22540h(this.f18975a, intent);
    }

    /* JADX INFO: renamed from: h */
    public Task m22540h(final Context context, final Intent intent) {
        boolean z7 = AbstractC3760o.m18199g() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z8 = (intent.getFlags() & 268435456) != 0;
        return (!z7 || z8) ? Tasks.call(this.f18976b, new Callable() { // from class: com.google.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(C4971V.m22403b().m22408g(context, intent));
            }
        }).continueWithTask(this.f18976b, new Continuation() { // from class: com.google.firebase.messaging.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C5000m.m22533a(context, intent, z8, task);
            }
        }) : m22537e(context, intent, z8);
    }
}

package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.measurement.ExecutorC2688k;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.firebase.messaging.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC4990h extends Service {

    /* JADX INFO: renamed from: b */
    private Binder f18951b;

    /* JADX INFO: renamed from: d */
    private int f18953d;

    /* JADX INFO: renamed from: a */
    final ExecutorService f18950a = AbstractC5001n.m22544d();

    /* JADX INFO: renamed from: c */
    private final Object f18952c = new Object();

    /* JADX INFO: renamed from: e */
    private int f18954e = 0;

    /* JADX INFO: renamed from: com.google.firebase.messaging.h$a */
    class a implements BinderC4993i0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.BinderC4993i0.a
        /* JADX INFO: renamed from: a */
        public Task mo22520a(Intent intent) {
            return AbstractServiceC4990h.this.m22517h(intent);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m22513a(AbstractServiceC4990h abstractServiceC4990h, Intent intent, TaskCompletionSource taskCompletionSource) {
        abstractServiceC4990h.getClass();
        try {
            abstractServiceC4990h.mo22337f(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m22516d(Intent intent) {
        if (intent != null) {
            AbstractC4989g0.m22508c(intent);
        }
        synchronized (this.f18952c) {
            try {
                int i7 = this.f18954e - 1;
                this.f18954e = i7;
                if (i7 == 0) {
                    m22519i(this.f18953d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public Task m22517h(final Intent intent) {
        if (m22518g(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f18950a.execute(new Runnable() { // from class: com.google.firebase.messaging.g
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC4990h.m22513a(this.f18944a, intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: e */
    protected abstract Intent mo22336e(Intent intent);

    /* JADX INFO: renamed from: f */
    public abstract void mo22337f(Intent intent);

    /* JADX INFO: renamed from: g */
    public boolean m22518g(Intent intent) {
        return false;
    }

    /* JADX INFO: renamed from: i */
    boolean m22519i(int i7) {
        return stopSelfResult(i7);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f18951b == null) {
                this.f18951b = new BinderC4993i0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18951b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f18950a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i7, int i8) {
        synchronized (this.f18952c) {
            this.f18953d = i8;
            this.f18954e++;
        }
        Intent intentMo22336e = mo22336e(intent);
        if (intentMo22336e == null) {
            m22516d(intent);
            return 2;
        }
        Task taskM22517h = m22517h(intentMo22336e);
        if (taskM22517h.isComplete()) {
            m22516d(intent);
            return 2;
        }
        taskM22517h.addOnCompleteListener(new ExecutorC2688k(), new OnCompleteListener() { // from class: com.google.firebase.messaging.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f18941a.m22516d(intent);
            }
        });
        return 3;
    }
}

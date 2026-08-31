package p163V2;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p217c3.ThreadFactoryC3009b;

/* JADX INFO: renamed from: V2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1731b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static SoftReference f5740a;

    /* JADX INFO: renamed from: b */
    private static SoftReference f5741b;

    /* JADX INFO: renamed from: e */
    private final int m7354e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            mo7357c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    /* JADX INFO: renamed from: a */
    protected Executor m7355a() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (AbstractC1731b.class) {
            try {
                SoftReference softReference = f5740a;
                executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    zze.zza();
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC3009b("firebase-iid-executor")));
                    f5740a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    /* JADX INFO: renamed from: b */
    protected abstract int mo7356b(Context context, C1730a c1730a);

    /* JADX INFO: renamed from: c */
    protected abstract void mo7357c(Context context, Bundle bundle);

    /* JADX INFO: renamed from: d */
    final /* synthetic */ void m7358d(Intent intent, final Context context, boolean z7, BroadcastReceiver.PendingResult pendingResult) {
        Executor executorUnconfigurableExecutorService;
        int iM7354e;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iM7354e = m7354e(context, intent2);
            } else if (intent.getExtras() == null) {
                iM7354e = 500;
            } else {
                final C1730a c1730a = new C1730a(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (AbstractC1731b.class) {
                    try {
                        SoftReference softReference = f5741b;
                        executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                        if (executorUnconfigurableExecutorService == null) {
                            zze.zza();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC3009b("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            f5741b = new SoftReference(executorUnconfigurableExecutorService);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                executorUnconfigurableExecutorService.execute(new Runnable() { // from class: V2.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskM7347c;
                        C1730a c1730a2 = c1730a;
                        if (TextUtils.isEmpty(c1730a2.m7352U())) {
                            taskM7347c = Tasks.forResult(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("google.message_id", c1730a2.m7352U());
                            Integer numM7353V = c1730a2.m7353V();
                            if (numM7353V != null) {
                                bundle.putInt("google.product_id", numM7353V.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            taskM7347c = C1725D.m7343b(context2).m7347c(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        taskM7347c.addOnCompleteListener(new Executor() { // from class: V2.m
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new OnCompleteListener() { // from class: V2.n
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int iMo7356b = mo7356b(context, c1730a);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e7) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e7.toString()));
                }
                iM7354e = iMo7356b;
            }
            if (z7 && pendingResult != null) {
                pendingResult.setResultCode(iM7354e);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th2) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        m7355a().execute(new Runnable() { // from class: V2.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f5766a.m7358d(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }
}

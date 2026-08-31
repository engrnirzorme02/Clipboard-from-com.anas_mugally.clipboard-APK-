package p163V2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.C2400k;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: V2.c */
/* JADX INFO: loaded from: classes.dex */
public class C1732c {

    /* JADX INFO: renamed from: h */
    private static int f5742h;

    /* JADX INFO: renamed from: i */
    private static PendingIntent f5743i;

    /* JADX INFO: renamed from: j */
    private static final Executor f5744j = new Executor() { // from class: V2.G
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k */
    private static final Pattern f5745k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b */
    private final Context f5747b;

    /* JADX INFO: renamed from: c */
    private final C1726E f5748c;

    /* JADX INFO: renamed from: d */
    private final ScheduledExecutorService f5749d;

    /* JADX INFO: renamed from: f */
    private Messenger f5751f;

    /* JADX INFO: renamed from: g */
    private C1741l f5752g;

    /* JADX INFO: renamed from: a */
    private final C2400k f5746a = new C2400k();

    /* JADX INFO: renamed from: e */
    private final Messenger f5750e = new Messenger(new HandlerC1738i(this, Looper.getMainLooper()));

    public C1732c(Context context) {
        this.f5747b = context;
        this.f5748c = new C1726E(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5749d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ Task m7359e(Bundle bundle) {
        return m7365m(bundle) ? Tasks.forResult(null) : Tasks.forResult(bundle);
    }

    /* JADX INFO: renamed from: g */
    static /* bridge */ /* synthetic */ void m7360g(C1732c c1732c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C1740k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C1741l) {
                        c1732c.f5752g = (C1741l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1732c.f5751f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f5745k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c1732c.m7364l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c1732c.f5746a) {
                        for (int i7 = 0; i7 < c1732c.f5746a.size(); i7++) {
                            try {
                                c1732c.m7364l((String) c1732c.f5746a.m10300f(i7), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                c1732c.m7364l(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX INFO: renamed from: i */
    private final Task m7361i(Bundle bundle) {
        final String strM7362j = m7362j();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f5746a) {
            this.f5746a.put(strM7362j, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f5748c.m7350b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m7363k(this.f5747b, intent);
        intent.putExtra("kid", "|ID|" + strM7362j + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f5750e);
        if (this.f5751f != null || this.f5752g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f5751f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f5752g.m7373b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f5748c.m7350b() == 2) {
                    this.f5747b.sendBroadcast(intent);
                } else {
                    this.f5747b.startService(intent);
                }
            }
        } else if (this.f5748c.m7350b() == 2) {
            this.f5747b.sendBroadcast(intent);
        } else {
            this.f5747b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f5749d.schedule(new Runnable() { // from class: V2.g
            @Override // java.lang.Runnable
            public final void run() {
                if (taskCompletionSource.trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(f5744j, new OnCompleteListener() { // from class: V2.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f5756a.m7371h(strM7362j, scheduledFutureSchedule, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: j */
    private static synchronized String m7362j() {
        int i7;
        i7 = f5742h;
        f5742h = i7 + 1;
        return Integer.toString(i7);
    }

    /* JADX INFO: renamed from: k */
    private static synchronized void m7363k(Context context, Intent intent) {
        try {
            if (f5743i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f5743i = PendingIntent.getBroadcast(context, 0, intent2, zza.zza);
            }
            intent.putExtra("app", f5743i);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m7364l(String str, Bundle bundle) {
        synchronized (this.f5746a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f5746a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private static boolean m7365m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* JADX INFO: renamed from: a */
    public Task m7366a() {
        return this.f5748c.m7349a() >= 241100000 ? C1725D.m7343b(this.f5747b).m7348d(5, Bundle.EMPTY).continueWith(f5744j, new Continuation() { // from class: V2.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new C1730a(intent);
                }
                return null;
            }
        }) : Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    /* JADX INFO: renamed from: b */
    public Task m7367b(C1730a c1730a) {
        if (this.f5748c.m7349a() < 233700000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", c1730a.m7352U());
        Integer numM7353V = c1730a.m7353V();
        if (numM7353V != null) {
            bundle.putInt("google.product_id", numM7353V.intValue());
        }
        return C1725D.m7343b(this.f5747b).m7347c(3, bundle);
    }

    /* JADX INFO: renamed from: c */
    public Task m7368c(final Bundle bundle) {
        if (this.f5748c.m7349a() < 12000000) {
            return this.f5748c.m7350b() != 0 ? m7361i(bundle).continueWithTask(f5744j, new Continuation() { // from class: V2.H
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return this.f5737a.m7370f(bundle, task);
                }
            }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return C1725D.m7343b(this.f5747b).m7348d(1, bundle).continueWith(f5744j, new Continuation() { // from class: V2.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) throws IOException {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public Task m7369d(boolean z7) {
        if (this.f5748c.m7349a() < 241100000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z7);
        return C1725D.m7343b(this.f5747b).m7347c(4, bundle);
    }

    /* JADX INFO: renamed from: f */
    final /* synthetic */ Task m7370f(Bundle bundle, Task task) {
        return (task.isSuccessful() && m7365m((Bundle) task.getResult())) ? m7361i(bundle).onSuccessTask(f5744j, new SuccessContinuation() { // from class: V2.F
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return C1732c.m7359e((Bundle) obj);
            }
        }) : task;
    }

    /* JADX INFO: renamed from: h */
    final /* synthetic */ void m7371h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f5746a) {
            this.f5746a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}

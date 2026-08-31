package p163V2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p217c3.ThreadFactoryC3009b;

/* JADX INFO: renamed from: V2.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1725D {

    /* JADX INFO: renamed from: e */
    private static C1725D f5727e;

    /* JADX INFO: renamed from: a */
    private final Context f5728a;

    /* JADX INFO: renamed from: b */
    private final ScheduledExecutorService f5729b;

    /* JADX INFO: renamed from: c */
    private ServiceConnectionC1753x f5730c = new ServiceConnectionC1753x(this, null);

    /* JADX INFO: renamed from: d */
    private int f5731d = 1;

    C1725D(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f5729b = scheduledExecutorService;
        this.f5728a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C1725D m7343b(Context context) {
        try {
            if (f5727e == null) {
                zze.zza();
                f5727e = new C1725D(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC3009b("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5727e;
    }

    /* JADX INFO: renamed from: f */
    private final synchronized int m7345f() {
        int i7;
        i7 = this.f5731d;
        this.f5731d = i7 + 1;
        return i7;
    }

    /* JADX INFO: renamed from: g */
    private final synchronized Task m7346g(AbstractC1722A abstractC1722A) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(abstractC1722A.toString()));
            }
            if (!this.f5730c.m7380g(abstractC1722A)) {
                ServiceConnectionC1753x serviceConnectionC1753x = new ServiceConnectionC1753x(this, null);
                this.f5730c = serviceConnectionC1753x;
                serviceConnectionC1753x.m7380g(abstractC1722A);
            }
        } catch (Throwable th) {
            throw th;
        }
        return abstractC1722A.f5724b.getTask();
    }

    /* JADX INFO: renamed from: c */
    public final Task m7347c(int i7, Bundle bundle) {
        return m7346g(new C1755z(m7345f(), i7, bundle));
    }

    /* JADX INFO: renamed from: d */
    public final Task m7348d(int i7, Bundle bundle) {
        return m7346g(new C1724C(m7345f(), i7, bundle));
    }
}

package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p017C.AbstractC0111l;

/* JADX INFO: renamed from: com.google.firebase.messaging.e */
/* JADX INFO: loaded from: classes.dex */
class C4984e {

    /* JADX INFO: renamed from: a */
    private final ExecutorService f18928a;

    /* JADX INFO: renamed from: b */
    private final Context f18929b;

    /* JADX INFO: renamed from: c */
    private final C4958H f18930c;

    public C4984e(Context context, C4958H c4958h, ExecutorService executorService) {
        this.f18928a = executorService;
        this.f18929b = context;
        this.f18930c = c4958h;
    }

    /* JADX INFO: renamed from: b */
    private boolean m22490b() {
        if (((KeyguardManager) this.f18929b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!AbstractC3760o.m18196d()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f18929b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    if (runningAppProcessInfo.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private void m22491c(AbstractC4980c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f18929b.getSystemService("notification")).notify(aVar.f18911b, aVar.f18912c, aVar.f18910a.m463b());
    }

    /* JADX INFO: renamed from: d */
    private C4953D m22492d() {
        C4953D c4953dM22260x = C4953D.m22260x(this.f18930c.m22370p("gcm.n.image"));
        if (c4953dM22260x != null) {
            c4953dM22260x.m22262Q(this.f18928a);
        }
        return c4953dM22260x;
    }

    /* JADX INFO: renamed from: e */
    private void m22493e(AbstractC0111l.e eVar, C4953D c4953d) {
        if (c4953d == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(c4953d.m22261J(), 5L, TimeUnit.SECONDS);
            eVar.m475p(bitmap);
            eVar.m484y(new AbstractC0111l.b().m447i(bitmap).m446h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c4953d.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e7) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e7.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c4953d.close();
        }
    }

    /* JADX INFO: renamed from: a */
    boolean m22494a() {
        if (this.f18930c.m22356a("gcm.n.noui")) {
            return true;
        }
        if (m22490b()) {
            return false;
        }
        C4953D c4953dM22492d = m22492d();
        AbstractC4980c.a aVarM22457e = AbstractC4980c.m22457e(this.f18929b, this.f18930c);
        m22493e(aVarM22457e.f18910a, c4953dM22492d);
        m22491c(aVarM22457e);
        return true;
    }
}

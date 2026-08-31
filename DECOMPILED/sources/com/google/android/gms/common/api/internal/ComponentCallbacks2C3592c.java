package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.AbstractC3763r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C3592c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e */
    private static final ComponentCallbacks2C3592c f14624e = new ComponentCallbacks2C3592c();

    /* JADX INFO: renamed from: a */
    private final AtomicBoolean f14625a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f14626b = new AtomicBoolean();

    /* JADX INFO: renamed from: c */
    private final ArrayList f14627c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private boolean f14628d = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7413a(boolean z7);
    }

    private ComponentCallbacks2C3592c() {
    }

    /* JADX INFO: renamed from: b */
    public static ComponentCallbacks2C3592c m17857b() {
        return f14624e;
    }

    /* JADX INFO: renamed from: c */
    public static void m17858c(Application application) {
        ComponentCallbacks2C3592c componentCallbacks2C3592c = f14624e;
        synchronized (componentCallbacks2C3592c) {
            try {
                if (!componentCallbacks2C3592c.f14628d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C3592c);
                    application.registerComponentCallbacks(componentCallbacks2C3592c);
                    componentCallbacks2C3592c.f14628d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m17859f(boolean z7) {
        synchronized (f14624e) {
            try {
                Iterator it = this.f14627c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo7413a(z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m17860a(a aVar) {
        synchronized (f14624e) {
            this.f14627c.add(aVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m17861d() {
        return this.f14625a.get();
    }

    /* JADX INFO: renamed from: e */
    public boolean m17862e(boolean z7) {
        if (!this.f14626b.get()) {
            if (AbstractC3763r.m18206b()) {
                return z7;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f14626b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f14625a.set(true);
            }
        }
        return m17861d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f14626b;
        boolean zCompareAndSet = this.f14625a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            m17859f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f14626b;
        boolean zCompareAndSet = this.f14625a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            m17859f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20 && this.f14625a.compareAndSet(false, true)) {
            this.f14626b.set(true);
            m17859f(true);
        }
    }
}

package p301m5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: m5.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C6363Q implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6365T f24267a;

    /* JADX INFO: renamed from: b */
    private boolean f24268b;

    public C6363Q(InterfaceC6365T sharedSessionRepository) {
        AbstractC6118n.m27187e(sharedSessionRepository, "sharedSessionRepository");
        this.f24267a = sharedSessionRepository;
        this.f24268b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC6118n.m27187e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC6118n.m27187e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC6118n.m27187e(activity, "activity");
        if (this.f24268b) {
            this.f24267a.mo27435b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC6118n.m27187e(activity, "activity");
        if (this.f24268b) {
            this.f24267a.mo27436c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC6118n.m27187e(activity, "activity");
        AbstractC6118n.m27187e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC6118n.m27187e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC6118n.m27187e(activity, "activity");
    }
}

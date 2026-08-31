package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.lifecycle.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2653o {

    /* JADX INFO: renamed from: a */
    public static final C2653o f10486a = new C2653o();

    /* JADX INFO: renamed from: b */
    private static final AtomicBoolean f10487b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.o$a */
    public static final class a extends AbstractC2646h {
        @Override // androidx.lifecycle.AbstractC2646h, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC6118n.m27187e(activity, "activity");
            FragmentC2617I.f10407b.m12549c(activity);
        }
    }

    private C2653o() {
    }

    /* JADX INFO: renamed from: a */
    public static final void m12639a(Context context) {
        AbstractC6118n.m27187e(context, "context");
        if (f10487b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        AbstractC6118n.m27185c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}

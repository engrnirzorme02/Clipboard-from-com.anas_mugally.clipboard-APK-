package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.lifecycle.I */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC2617I extends Fragment {

    /* JADX INFO: renamed from: b */
    public static final b f10407b = new b(null);

    /* JADX INFO: renamed from: a */
    private a f10408a;

    /* JADX INFO: renamed from: androidx.lifecycle.I$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo12541a();

        void onCreate();

        void onResume();
    }

    /* JADX INFO: renamed from: androidx.lifecycle.I$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m12547a(Activity activity, AbstractC2650l.a event) {
            AbstractC6118n.m27187e(activity, "activity");
            AbstractC6118n.m27187e(event, "event");
            if (activity instanceof InterfaceC2657s) {
                AbstractC2650l abstractC2650lMo419P = ((InterfaceC2657s) activity).mo419P();
                if (abstractC2650lMo419P instanceof C2659u) {
                    ((C2659u) abstractC2650lMo419P).m12651i(event);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final FragmentC2617I m12548b(Activity activity) {
            AbstractC6118n.m27187e(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC6118n.m27185c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (FragmentC2617I) fragmentFindFragmentByTag;
        }

        /* JADX INFO: renamed from: c */
        public final void m12549c(Activity activity) {
            AbstractC6118n.m27187e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.m12550a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC2617I(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.I$c */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        /* JADX INFO: renamed from: androidx.lifecycle.I$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC6112h abstractC6112h) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final void m12550a(Activity activity) {
                AbstractC6118n.m27187e(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }

            private a() {
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.m12550a(activity);
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
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC6118n.m27187e(activity, "activity");
            FragmentC2617I.f10407b.m12547a(activity, AbstractC2650l.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC6118n.m27187e(activity, "activity");
            FragmentC2617I.f10407b.m12547a(activity, AbstractC2650l.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC6118n.m27187e(activity, "activity");
            FragmentC2617I.f10407b.m12547a(activity, AbstractC2650l.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC6118n.m27187e(activity, "activity");
            FragmentC2617I.f10407b.m12547a(activity, AbstractC2650l.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC6118n.m27187e(activity, "activity");
            FragmentC2617I.f10407b.m12547a(activity, AbstractC2650l.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC6118n.m27187e(activity, "activity");
            FragmentC2617I.f10407b.m12547a(activity, AbstractC2650l.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC6118n.m27187e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC6118n.m27187e(activity, "activity");
            AbstractC6118n.m27187e(bundle, "bundle");
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

    /* JADX INFO: renamed from: a */
    private final void m12542a(AbstractC2650l.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f10407b;
            Activity activity = getActivity();
            AbstractC6118n.m27186d(activity, "getActivity(...)");
            bVar.m12547a(activity, aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m12543b(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m12544c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m12545d(a aVar) {
        if (aVar != null) {
            aVar.mo12541a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12546e(a aVar) {
        this.f10408a = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m12543b(this.f10408a);
        m12542a(AbstractC2650l.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m12542a(AbstractC2650l.a.ON_DESTROY);
        this.f10408a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m12542a(AbstractC2650l.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m12544c(this.f10408a);
        m12542a(AbstractC2650l.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m12545d(this.f10408a);
        m12542a(AbstractC2650l.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m12542a(AbstractC2650l.a.ON_STOP);
    }
}

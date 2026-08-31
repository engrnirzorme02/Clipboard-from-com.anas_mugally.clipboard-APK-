package p017C;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: C.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0103d {

    /* JADX INFO: renamed from: a */
    protected static final Class f532a;

    /* JADX INFO: renamed from: b */
    protected static final Field f533b;

    /* JADX INFO: renamed from: c */
    protected static final Field f534c;

    /* JADX INFO: renamed from: d */
    protected static final Method f535d;

    /* JADX INFO: renamed from: e */
    protected static final Method f536e;

    /* JADX INFO: renamed from: f */
    protected static final Method f537f;

    /* JADX INFO: renamed from: g */
    private static final Handler f538g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: C.d$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ d f539a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Object f540b;

        a(d dVar, Object obj) {
            this.f539a = dVar;
            this.f540b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f539a.f545a = this.f540b;
        }
    }

    /* JADX INFO: renamed from: C.d$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Application f541a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ d f542b;

        b(Application application, d dVar) {
            this.f541a = application;
            this.f542b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f541a.unregisterActivityLifecycleCallbacks(this.f542b);
        }
    }

    /* JADX INFO: renamed from: C.d$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f543a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Object f544b;

        c(Object obj, Object obj2) {
            this.f543a = obj;
            this.f544b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = AbstractC0103d.f535d;
                if (method != null) {
                    method.invoke(this.f543a, this.f544b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    AbstractC0103d.f536e.invoke(this.f543a, this.f544b, Boolean.FALSE);
                }
            } catch (RuntimeException e7) {
                if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                    throw e7;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* JADX INFO: renamed from: C.d$d */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        Object f545a;

        /* JADX INFO: renamed from: b */
        private Activity f546b;

        /* JADX INFO: renamed from: c */
        private final int f547c;

        /* JADX INFO: renamed from: d */
        private boolean f548d = false;

        /* JADX INFO: renamed from: e */
        private boolean f549e = false;

        /* JADX INFO: renamed from: f */
        private boolean f550f = false;

        d(Activity activity) {
            this.f546b = activity;
            this.f547c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f546b == activity) {
                this.f546b = null;
                this.f549e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f549e || this.f550f || this.f548d || !AbstractC0103d.m404h(this.f545a, this.f547c, activity)) {
                return;
            }
            this.f550f = true;
            this.f545a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f546b == activity) {
                this.f548d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class clsM397a = m397a();
        f532a = clsM397a;
        f533b = m398b();
        f534c = m402f();
        f535d = m400d(clsM397a);
        f536e = m399c(clsM397a);
        f537f = m401e(clsM397a);
    }

    /* JADX INFO: renamed from: a */
    private static Class m397a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static Field m398b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static Method m399c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static Method m400d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static Method m401e(Class cls) {
        if (m403g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static Field m402f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m403g() {
        int i7 = Build.VERSION.SDK_INT;
        return i7 == 26 || i7 == 27;
    }

    /* JADX INFO: renamed from: h */
    protected static boolean m404h(Object obj, int i7, Activity activity) {
        try {
            Object obj2 = f534c.get(activity);
            if (obj2 == obj && activity.hashCode() == i7) {
                f538g.postAtFrontOfQueue(new c(f533b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    static boolean m405i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m403g() && f537f == null) {
            return false;
        }
        if (f536e == null && f535d == null) {
            return false;
        }
        try {
            Object obj2 = f534c.get(activity);
            if (obj2 == null || (obj = f533b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            f538g.post(new a(dVar, obj2));
            try {
                if (m403g()) {
                    Method method = f537f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f538g.post(new b(application, dVar));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}

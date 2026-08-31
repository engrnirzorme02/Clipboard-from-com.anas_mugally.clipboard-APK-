package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.collection.C2391b;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import p017C.AbstractC0104e;
import p081K.C0718j;

/* JADX INFO: renamed from: androidx.appcompat.app.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2245f {

    /* JADX INFO: renamed from: a */
    static c f7322a = new c(new d());

    /* JADX INFO: renamed from: b */
    private static int f7323b = -100;

    /* JADX INFO: renamed from: c */
    private static C0718j f7324c = null;

    /* JADX INFO: renamed from: d */
    private static C0718j f7325d = null;

    /* JADX INFO: renamed from: e */
    private static Boolean f7326e = null;

    /* JADX INFO: renamed from: f */
    private static boolean f7327f = false;

    /* JADX INFO: renamed from: r */
    private static final C2391b f7328r = new C2391b();

    /* JADX INFO: renamed from: s */
    private static final Object f7329s = new Object();

    /* JADX INFO: renamed from: t */
    private static final Object f7330t = new Object();

    /* JADX INFO: renamed from: androidx.appcompat.app.f$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static LocaleList m9173a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.f$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static LocaleList m9174a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* JADX INFO: renamed from: b */
        static void m9175b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.f$c */
    static class c implements Executor {

        /* JADX INFO: renamed from: a */
        private final Object f7331a = new Object();

        /* JADX INFO: renamed from: b */
        final Queue f7332b = new ArrayDeque();

        /* JADX INFO: renamed from: c */
        final Executor f7333c;

        /* JADX INFO: renamed from: d */
        Runnable f7334d;

        c(Executor executor) {
            this.f7333c = executor;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m9176a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.m9177b();
            }
        }

        /* JADX INFO: renamed from: b */
        protected void m9177b() {
            synchronized (this.f7331a) {
                try {
                    Runnable runnable = (Runnable) this.f7332b.poll();
                    this.f7334d = runnable;
                    if (runnable != null) {
                        this.f7333c.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f7331a) {
                try {
                    this.f7332b.add(new Runnable() { // from class: androidx.appcompat.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC2245f.c.m9176a(this.f7335a, runnable);
                        }
                    });
                    if (this.f7334d == null) {
                        m9177b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.f$d */
    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    AbstractC2245f() {
    }

    /* JADX INFO: renamed from: D */
    static void m9135D(AbstractC2245f abstractC2245f) {
        synchronized (f7329s) {
            m9136E(abstractC2245f);
        }
    }

    /* JADX INFO: renamed from: E */
    private static void m9136E(AbstractC2245f abstractC2245f) {
        synchronized (f7329s) {
            try {
                Iterator it = f7328r.iterator();
                while (it.hasNext()) {
                    AbstractC2245f abstractC2245f2 = (AbstractC2245f) ((WeakReference) it.next()).get();
                    if (abstractC2245f2 == abstractC2245f || abstractC2245f2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    static void m9137M(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m9143k().m3476e()) {
                    String strM407b = AbstractC0104e.m407b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.m9175b(systemService, a.m9173a(strM407b));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    static void m9138N(final Context context) {
        if (m9147u(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f7327f) {
                    return;
                }
                f7322a.execute(new Runnable() { // from class: androidx.appcompat.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2245f.m9139c(context);
                    }
                });
                return;
            }
            synchronized (f7330t) {
                try {
                    C0718j c0718j = f7324c;
                    if (c0718j == null) {
                        if (f7325d == null) {
                            f7325d = C0718j.m3472b(AbstractC0104e.m407b(context));
                        }
                        if (f7325d.m3476e()) {
                        } else {
                            f7324c = f7325d;
                        }
                    } else if (!c0718j.equals(f7325d)) {
                        C0718j c0718j2 = f7324c;
                        f7325d = c0718j2;
                        AbstractC0104e.m406a(context, c0718j2.m3478g());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m9139c(Context context) {
        m9137M(context);
        f7327f = true;
    }

    /* JADX INFO: renamed from: d */
    static void m9140d(AbstractC2245f abstractC2245f) {
        synchronized (f7329s) {
            m9136E(abstractC2245f);
            f7328r.add(new WeakReference(abstractC2245f));
        }
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC2245f m9141h(Activity activity, InterfaceC2243d interfaceC2243d) {
        return new LayoutInflaterFactory2C2247h(activity, interfaceC2243d);
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC2245f m9142i(Dialog dialog, InterfaceC2243d interfaceC2243d) {
        return new LayoutInflaterFactory2C2247h(dialog, interfaceC2243d);
    }

    /* JADX INFO: renamed from: k */
    public static C0718j m9143k() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM9145o = m9145o();
            if (objM9145o != null) {
                return C0718j.m3474i(b.m9174a(objM9145o));
            }
        } else {
            C0718j c0718j = f7324c;
            if (c0718j != null) {
                return c0718j;
            }
        }
        return C0718j.m3473d();
    }

    /* JADX INFO: renamed from: m */
    public static int m9144m() {
        return f7323b;
    }

    /* JADX INFO: renamed from: o */
    static Object m9145o() {
        Context contextMo9162l;
        Iterator it = f7328r.iterator();
        while (it.hasNext()) {
            AbstractC2245f abstractC2245f = (AbstractC2245f) ((WeakReference) it.next()).get();
            if (abstractC2245f != null && (contextMo9162l = abstractC2245f.mo9162l()) != null) {
                return contextMo9162l.getSystemService("locale");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    static C0718j m9146q() {
        return f7324c;
    }

    /* JADX INFO: renamed from: u */
    static boolean m9147u(Context context) {
        if (f7326e == null) {
            try {
                Bundle bundle = AbstractServiceC2258s.m9312a(context).metaData;
                if (bundle != null) {
                    f7326e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f7326e = Boolean.FALSE;
            }
        }
        return f7326e.booleanValue();
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo9148A(Bundle bundle);

    /* JADX INFO: renamed from: B */
    public abstract void mo9149B();

    /* JADX INFO: renamed from: C */
    public abstract void mo9150C();

    /* JADX INFO: renamed from: F */
    public abstract boolean mo9151F(int i7);

    /* JADX INFO: renamed from: G */
    public abstract void mo9152G(int i7);

    /* JADX INFO: renamed from: H */
    public abstract void mo9153H(View view);

    /* JADX INFO: renamed from: I */
    public abstract void mo9154I(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: J */
    public void mo9155J(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    /* JADX INFO: renamed from: K */
    public abstract void mo9156K(int i7);

    /* JADX INFO: renamed from: L */
    public abstract void mo9157L(CharSequence charSequence);

    /* JADX INFO: renamed from: e */
    public abstract void mo9158e(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: f */
    public void m9159f(Context context) {
    }

    /* JADX INFO: renamed from: g */
    public Context mo9160g(Context context) {
        m9159f(context);
        return context;
    }

    /* JADX INFO: renamed from: j */
    public abstract View mo9161j(int i7);

    /* JADX INFO: renamed from: l */
    public abstract Context mo9162l();

    /* JADX INFO: renamed from: n */
    public abstract int mo9163n();

    /* JADX INFO: renamed from: p */
    public abstract MenuInflater mo9164p();

    /* JADX INFO: renamed from: r */
    public abstract AbstractC2240a mo9165r();

    /* JADX INFO: renamed from: s */
    public abstract void mo9166s();

    /* JADX INFO: renamed from: t */
    public abstract void mo9167t();

    /* JADX INFO: renamed from: v */
    public abstract void mo9168v(Configuration configuration);

    /* JADX INFO: renamed from: w */
    public abstract void mo9169w(Bundle bundle);

    /* JADX INFO: renamed from: x */
    public abstract void mo9170x();

    /* JADX INFO: renamed from: y */
    public abstract void mo9171y(Bundle bundle);

    /* JADX INFO: renamed from: z */
    public abstract void mo9172z();
}

package p137R4;

import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import com.google.firebase.firestore.InterfaceC4935u;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: R4.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1357d {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4.d$b */
    static class b {

        /* JADX INFO: renamed from: a */
        private final List f4766a;

        private b() {
            this.f4766a = new ArrayList();
        }

        /* JADX INFO: renamed from: a */
        synchronized void m5866a(Runnable runnable) {
            this.f4766a.add(runnable);
        }

        /* JADX INFO: renamed from: b */
        void m5867b() {
            for (Runnable runnable : this.f4766a) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* JADX INFO: renamed from: R4.d$c */
    public static class c extends Fragment {

        /* JADX INFO: renamed from: a */
        b f4767a = new b();

        @Override // android.app.Fragment
        public void onStop() {
            b bVar;
            super.onStop();
            synchronized (this.f4767a) {
                bVar = this.f4767a;
                this.f4767a = new b();
            }
            bVar.m5867b();
        }
    }

    /* JADX INFO: renamed from: R4.d$d */
    public static class d extends AbstractComponentCallbacksC2591i {

        /* JADX INFO: renamed from: o0 */
        b f4768o0 = new b();

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
        /* JADX INFO: renamed from: T0 */
        public void mo5868T0() {
            b bVar;
            super.mo5868T0();
            synchronized (this.f4768o0) {
                bVar = this.f4768o0;
                this.f4768o0 = new b();
            }
            bVar.m5867b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5860a(AbstractActivityC2592j abstractActivityC2592j, Runnable runnable) {
        d dVar = (d) m5863d(d.class, abstractActivityC2592j.m12232H0().m12379h0("FirestoreOnStopObserverSupportFragment"), "FirestoreOnStopObserverSupportFragment");
        if (dVar == null || dVar.m12182l0()) {
            dVar = new d();
            abstractActivityC2592j.m12232H0().m12391n().m12507d(dVar, "FirestoreOnStopObserverSupportFragment").mo12017h();
            abstractActivityC2592j.m12232H0().m12372d0();
        }
        dVar.f4768o0.m5866a(runnable);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5861b(Activity activity, Runnable runnable) {
        c cVar = (c) m5863d(c.class, activity.getFragmentManager().findFragmentByTag("FirestoreOnStopObserverFragment"), "FirestoreOnStopObserverFragment");
        if (cVar == null || cVar.isRemoving()) {
            cVar = new c();
            activity.getFragmentManager().beginTransaction().add(cVar, "FirestoreOnStopObserverFragment").commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        cVar.f4767a.m5866a(runnable);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC4935u m5862c(Activity activity, final InterfaceC4935u interfaceC4935u) {
        if (activity != null) {
            if (activity instanceof AbstractActivityC2592j) {
                Objects.requireNonNull(interfaceC4935u);
                m5865f((AbstractActivityC2592j) activity, new Runnable() { // from class: R4.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC4935u.remove();
                    }
                });
                return interfaceC4935u;
            }
            Objects.requireNonNull(interfaceC4935u);
            m5864e(activity, new Runnable() { // from class: R4.a
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC4935u.remove();
                }
            });
        }
        return interfaceC4935u;
    }

    /* JADX INFO: renamed from: d */
    private static Object m5863d(Class cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Fragment with tag '" + str + "' is a " + obj.getClass().getName() + " but should be a " + cls.getName());
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m5864e(final Activity activity, final Runnable runnable) {
        AbstractC2034b.m8460d(!(activity instanceof AbstractActivityC2592j), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new Runnable() { // from class: R4.c
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1357d.m5861b(activity, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    private static void m5865f(final AbstractActivityC2592j abstractActivityC2592j, final Runnable runnable) {
        abstractActivityC2592j.runOnUiThread(new Runnable() { // from class: R4.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1357d.m5860a(abstractActivityC2592j, runnable);
            }
        });
    }
}

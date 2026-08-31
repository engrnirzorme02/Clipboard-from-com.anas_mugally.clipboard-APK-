package p134R1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p183Y1.AbstractC2017f;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: R1.r */
/* JADX INFO: loaded from: classes.dex */
final class C1325r {

    /* JADX INFO: renamed from: d */
    private static volatile C1325r f4623d;

    /* JADX INFO: renamed from: a */
    private final c f4624a;

    /* JADX INFO: renamed from: b */
    final Set f4625b = new HashSet();

    /* JADX INFO: renamed from: c */
    private boolean f4626c;

    /* JADX INFO: renamed from: R1.r$a */
    class a implements AbstractC2017f.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f4627a;

        a(Context context) {
            this.f4627a = context;
        }

        @Override // p183Y1.AbstractC2017f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f4627a.getSystemService("connectivity");
        }
    }

    /* JADX INFO: renamed from: R1.r$b */
    class b implements InterfaceC1309b.a {
        b() {
        }

        @Override // p134R1.InterfaceC1309b.a
        /* JADX INFO: renamed from: a */
        public void mo5650a(boolean z7) {
            ArrayList arrayList;
            AbstractC2023l.m8410a();
            synchronized (C1325r.this) {
                arrayList = new ArrayList(C1325r.this.f4625b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1309b.a) it.next()).mo5650a(z7);
            }
        }
    }

    /* JADX INFO: renamed from: R1.r$c */
    private interface c {
        /* JADX INFO: renamed from: a */
        boolean mo5683a();

        /* JADX INFO: renamed from: b */
        void mo5684b();
    }

    /* JADX INFO: renamed from: R1.r$d */
    private static final class d implements c {

        /* JADX INFO: renamed from: a */
        boolean f4630a;

        /* JADX INFO: renamed from: b */
        final InterfaceC1309b.a f4631b;

        /* JADX INFO: renamed from: c */
        private final AbstractC2017f.b f4632c;

        /* JADX INFO: renamed from: d */
        private final ConnectivityManager.NetworkCallback f4633d = new a();

        /* JADX INFO: renamed from: R1.r$d$a */
        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: R1.r$d$a$a, reason: collision with other inner class name */
            class RunnableC7647a implements Runnable {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ boolean f4635a;

                RunnableC7647a(boolean z7) {
                    this.f4635a = z7;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.m5686a(this.f4635a);
                }
            }

            a() {
            }

            /* JADX INFO: renamed from: b */
            private void m5685b(boolean z7) {
                AbstractC2023l.m8431v(new RunnableC7647a(z7));
            }

            /* JADX INFO: renamed from: a */
            void m5686a(boolean z7) {
                AbstractC2023l.m8410a();
                d dVar = d.this;
                boolean z8 = dVar.f4630a;
                dVar.f4630a = z7;
                if (z8 != z7) {
                    dVar.f4631b.mo5650a(z7);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                m5685b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                m5685b(false);
            }
        }

        d(AbstractC2017f.b bVar, InterfaceC1309b.a aVar) {
            this.f4632c = bVar;
            this.f4631b = aVar;
        }

        @Override // p134R1.C1325r.c
        /* JADX INFO: renamed from: a */
        public boolean mo5683a() {
            this.f4630a = ((ConnectivityManager) this.f4632c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f4632c.get()).registerDefaultNetworkCallback(this.f4633d);
                return true;
            } catch (RuntimeException e7) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e7);
                }
                return false;
            }
        }

        @Override // p134R1.C1325r.c
        /* JADX INFO: renamed from: b */
        public void mo5684b() {
            ((ConnectivityManager) this.f4632c.get()).unregisterNetworkCallback(this.f4633d);
        }
    }

    private C1325r(Context context) {
        this.f4624a = new d(AbstractC2017f.m8391a(new a(context)), new b());
    }

    /* JADX INFO: renamed from: a */
    static C1325r m5677a(Context context) {
        if (f4623d == null) {
            synchronized (C1325r.class) {
                try {
                    if (f4623d == null) {
                        f4623d = new C1325r(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4623d;
    }

    /* JADX INFO: renamed from: b */
    private void m5678b() {
        if (this.f4626c || this.f4625b.isEmpty()) {
            return;
        }
        this.f4626c = this.f4624a.mo5683a();
    }

    /* JADX INFO: renamed from: c */
    private void m5679c() {
        if (this.f4626c && this.f4625b.isEmpty()) {
            this.f4624a.mo5684b();
            this.f4626c = false;
        }
    }

    /* JADX INFO: renamed from: d */
    synchronized void m5680d(InterfaceC1309b.a aVar) {
        this.f4625b.add(aVar);
        m5678b();
    }

    /* JADX INFO: renamed from: e */
    synchronized void m5681e(InterfaceC1309b.a aVar) {
        this.f4625b.remove(aVar);
        m5679c();
    }
}

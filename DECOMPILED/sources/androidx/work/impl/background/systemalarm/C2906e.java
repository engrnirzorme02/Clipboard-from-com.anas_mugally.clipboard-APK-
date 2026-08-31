package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p112O0.AbstractC1097j;
import p119P0.C1177d;
import p119P0.C1182i;
import p119P0.InterfaceC1175b;
import p175X0.AbstractC1936n;
import p175X0.C1940r;
import p175X0.ExecutorC1933k;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.e */
/* JADX INFO: loaded from: classes.dex */
public class C2906e implements InterfaceC1175b {

    /* JADX INFO: renamed from: v */
    static final String f11936v = AbstractC1097j.m4846f("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a */
    final Context f11937a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2010a f11938b;

    /* JADX INFO: renamed from: c */
    private final C1940r f11939c;

    /* JADX INFO: renamed from: d */
    private final C1177d f11940d;

    /* JADX INFO: renamed from: e */
    private final C1182i f11941e;

    /* JADX INFO: renamed from: f */
    final C2903b f11942f;

    /* JADX INFO: renamed from: r */
    private final Handler f11943r;

    /* JADX INFO: renamed from: s */
    final List f11944s;

    /* JADX INFO: renamed from: t */
    Intent f11945t;

    /* JADX INFO: renamed from: u */
    private c f11946u;

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.e$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2906e c2906e;
            synchronized (C2906e.this.f11944s) {
                C2906e c2906e2 = C2906e.this;
                c2906e2.f11945t = (Intent) c2906e2.f11944s.get(0);
            }
            Intent intent = C2906e.this.f11945t;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C2906e.this.f11945t.getIntExtra("KEY_START_ID", 0);
                AbstractC1097j abstractC1097jM4844c = AbstractC1097j.m4844c();
                String str = C2906e.f11936v;
                abstractC1097jM4844c.mo4847a(str, String.format("Processing command %s, %s", C2906e.this.f11945t, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockM7987b = AbstractC1936n.m7987b(C2906e.this.f11937a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    AbstractC1097j.m4844c().mo4847a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockM7987b), new Throwable[0]);
                    wakeLockM7987b.acquire();
                    C2906e c2906e3 = C2906e.this;
                    c2906e3.f11942f.m14563o(c2906e3.f11945t, intExtra, c2906e3);
                    AbstractC1097j.m4844c().mo4847a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockM7987b), new Throwable[0]);
                    wakeLockM7987b.release();
                    C2906e c2906e4 = C2906e.this;
                    c2906e4.m14578k(new d(c2906e4));
                } catch (Throwable th) {
                    try {
                        AbstractC1097j abstractC1097jM4844c2 = AbstractC1097j.m4844c();
                        String str2 = C2906e.f11936v;
                        abstractC1097jM4844c2.mo4848b(str2, "Unexpected error in onHandleIntent", th);
                        AbstractC1097j.m4844c().mo4847a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockM7987b), new Throwable[0]);
                    } finally {
                        AbstractC1097j.m4844c().mo4847a(C2906e.f11936v, String.format("Releasing operation wake lock (%s) %s", action, wakeLockM7987b), new Throwable[0]);
                        wakeLockM7987b.release();
                        c2906e = C2906e.this;
                        c2906e.m14578k(new d(c2906e));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.e$b */
    static class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final C2906e f11948a;

        /* JADX INFO: renamed from: b */
        private final Intent f11949b;

        /* JADX INFO: renamed from: c */
        private final int f11950c;

        b(C2906e c2906e, Intent intent, int i7) {
            this.f11948a = c2906e;
            this.f11949b = intent;
            this.f11950c = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11948a.m14571a(this.f11949b, this.f11950c);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.e$c */
    interface c {
        /* JADX INFO: renamed from: a */
        void mo14545a();
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.e$d */
    static class d implements Runnable {

        /* JADX INFO: renamed from: a */
        private final C2906e f11951a;

        d(C2906e c2906e) {
            this.f11951a = c2906e;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11951a.m14572c();
        }
    }

    C2906e(Context context) {
        this(context, null, null);
    }

    /* JADX INFO: renamed from: b */
    private void m14568b() {
        if (this.f11943r.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* JADX INFO: renamed from: i */
    private boolean m14569i(String str) {
        m14568b();
        synchronized (this.f11944s) {
            try {
                Iterator it = this.f11944s.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m14570l() {
        m14568b();
        PowerManager.WakeLock wakeLockM7987b = AbstractC1936n.m7987b(this.f11937a, "ProcessCommand");
        try {
            wakeLockM7987b.acquire();
            this.f11941e.m5174p().mo8371b(new a());
        } finally {
            wakeLockM7987b.release();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m14571a(Intent intent, int i7) {
        AbstractC1097j abstractC1097jM4844c = AbstractC1097j.m4844c();
        String str = f11936v;
        abstractC1097jM4844c.mo4847a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i7)), new Throwable[0]);
        m14568b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC1097j.m4844c().mo4851h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m14569i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i7);
        synchronized (this.f11944s) {
            try {
                boolean zIsEmpty = this.f11944s.isEmpty();
                this.f11944s.add(intent);
                if (zIsEmpty) {
                    m14570l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    void m14572c() {
        AbstractC1097j abstractC1097jM4844c = AbstractC1097j.m4844c();
        String str = f11936v;
        abstractC1097jM4844c.mo4847a(str, "Checking if commands are complete.", new Throwable[0]);
        m14568b();
        synchronized (this.f11944s) {
            try {
                if (this.f11945t != null) {
                    AbstractC1097j.m4844c().mo4847a(str, String.format("Removing command %s", this.f11945t), new Throwable[0]);
                    if (!((Intent) this.f11944s.remove(0)).equals(this.f11945t)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f11945t = null;
                }
                ExecutorC1933k backgroundExecutor = this.f11938b.getBackgroundExecutor();
                if (!this.f11942f.m14562n() && this.f11944s.isEmpty() && !backgroundExecutor.m7984a()) {
                    AbstractC1097j.m4844c().mo4847a(str, "No more commands & intents.", new Throwable[0]);
                    c cVar = this.f11946u;
                    if (cVar != null) {
                        cVar.mo14545a();
                    }
                } else if (!this.f11944s.isEmpty()) {
                    m14570l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p119P0.InterfaceC1175b
    /* JADX INFO: renamed from: d */
    public void mo5123d(String str, boolean z7) {
        m14578k(new b(this, C2903b.m14552c(this.f11937a, str, z7), 0));
    }

    /* JADX INFO: renamed from: e */
    C1177d m14573e() {
        return this.f11940d;
    }

    /* JADX INFO: renamed from: f */
    InterfaceC2010a m14574f() {
        return this.f11938b;
    }

    /* JADX INFO: renamed from: g */
    C1182i m14575g() {
        return this.f11941e;
    }

    /* JADX INFO: renamed from: h */
    C1940r m14576h() {
        return this.f11939c;
    }

    /* JADX INFO: renamed from: j */
    void m14577j() {
        AbstractC1097j.m4844c().mo4847a(f11936v, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f11940d.m5133i(this);
        this.f11939c.m7989a();
        this.f11946u = null;
    }

    /* JADX INFO: renamed from: k */
    void m14578k(Runnable runnable) {
        this.f11943r.post(runnable);
    }

    /* JADX INFO: renamed from: m */
    void m14579m(c cVar) {
        if (this.f11946u != null) {
            AbstractC1097j.m4844c().mo4848b(f11936v, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f11946u = cVar;
        }
    }

    C2906e(Context context, C1177d c1177d, C1182i c1182i) {
        Context applicationContext = context.getApplicationContext();
        this.f11937a = applicationContext;
        this.f11942f = new C2903b(applicationContext);
        this.f11939c = new C1940r();
        c1182i = c1182i == null ? C1182i.m5164k(context) : c1182i;
        this.f11941e = c1182i;
        c1177d = c1177d == null ? c1182i.m5171m() : c1177d;
        this.f11940d = c1177d;
        this.f11938b = c1182i.m5174p();
        c1177d.m5129c(this);
        this.f11944s = new ArrayList();
        this.f11945t = null;
        this.f11943r = new Handler(Looper.getMainLooper());
    }
}

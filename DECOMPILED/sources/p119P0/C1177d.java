package p119P0;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.AbstractC2436b;
import androidx.work.C2895a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C2910a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p112O0.AbstractC1097j;
import p112O0.C1092e;
import p157U3.InterfaceFutureC1673e;
import p161V0.InterfaceC1711a;
import p175X0.AbstractC1936n;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: P0.d */
/* JADX INFO: loaded from: classes.dex */
public class C1177d implements InterfaceC1175b, InterfaceC1711a {

    /* JADX INFO: renamed from: w */
    private static final String f4143w = AbstractC1097j.m4846f("Processor");

    /* JADX INFO: renamed from: b */
    private Context f4145b;

    /* JADX INFO: renamed from: c */
    private C2895a f4146c;

    /* JADX INFO: renamed from: d */
    private InterfaceC2010a f4147d;

    /* JADX INFO: renamed from: e */
    private WorkDatabase f4148e;

    /* JADX INFO: renamed from: s */
    private List f4151s;

    /* JADX INFO: renamed from: r */
    private Map f4150r = new HashMap();

    /* JADX INFO: renamed from: f */
    private Map f4149f = new HashMap();

    /* JADX INFO: renamed from: t */
    private Set f4152t = new HashSet();

    /* JADX INFO: renamed from: u */
    private final List f4153u = new ArrayList();

    /* JADX INFO: renamed from: a */
    private PowerManager.WakeLock f4144a = null;

    /* JADX INFO: renamed from: v */
    private final Object f4154v = new Object();

    /* JADX INFO: renamed from: P0.d$a */
    private static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private InterfaceC1175b f4155a;

        /* JADX INFO: renamed from: b */
        private String f4156b;

        /* JADX INFO: renamed from: c */
        private InterfaceFutureC1673e f4157c;

        a(InterfaceC1175b interfaceC1175b, String str, InterfaceFutureC1673e interfaceFutureC1673e) {
            this.f4155a = interfaceC1175b;
            this.f4156b = str;
            this.f4157c = interfaceFutureC1673e;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.f4157c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f4155a.mo5123d(this.f4156b, zBooleanValue);
        }
    }

    public C1177d(Context context, C2895a c2895a, InterfaceC2010a interfaceC2010a, WorkDatabase workDatabase, List list) {
        this.f4145b = context;
        this.f4146c = c2895a;
        this.f4147d = interfaceC2010a;
        this.f4148e = workDatabase;
        this.f4151s = list;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m5125e(String str, RunnableC1183j runnableC1183j) {
        if (runnableC1183j == null) {
            AbstractC1097j.m4844c().mo4847a(f4143w, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        runnableC1183j.m5194d();
        AbstractC1097j.m4844c().mo4847a(f4143w, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    /* JADX INFO: renamed from: m */
    private void m5126m() {
        synchronized (this.f4154v) {
            try {
                if (this.f4149f.isEmpty()) {
                    try {
                        this.f4145b.startService(C2910a.m14587e(this.f4145b));
                    } catch (Throwable th) {
                        AbstractC1097j.m4844c().mo4848b(f4143w, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f4144a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f4144a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p161V0.InterfaceC1711a
    /* JADX INFO: renamed from: a */
    public void mo5127a(String str, C1092e c1092e) {
        synchronized (this.f4154v) {
            try {
                AbstractC1097j.m4844c().mo4849d(f4143w, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                RunnableC1183j runnableC1183j = (RunnableC1183j) this.f4150r.remove(str);
                if (runnableC1183j != null) {
                    if (this.f4144a == null) {
                        PowerManager.WakeLock wakeLockM7987b = AbstractC1936n.m7987b(this.f4145b, "ProcessorForegroundLck");
                        this.f4144a = wakeLockM7987b;
                        wakeLockM7987b.acquire();
                    }
                    this.f4149f.put(str, runnableC1183j);
                    AbstractC2436b.startForegroundService(this.f4145b, C2910a.m14586c(this.f4145b, str, c1092e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p161V0.InterfaceC1711a
    /* JADX INFO: renamed from: b */
    public void mo5128b(String str) {
        synchronized (this.f4154v) {
            this.f4149f.remove(str);
            m5126m();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5129c(InterfaceC1175b interfaceC1175b) {
        synchronized (this.f4154v) {
            this.f4153u.add(interfaceC1175b);
        }
    }

    @Override // p119P0.InterfaceC1175b
    /* JADX INFO: renamed from: d */
    public void mo5123d(String str, boolean z7) {
        synchronized (this.f4154v) {
            try {
                this.f4150r.remove(str);
                AbstractC1097j.m4844c().mo4847a(f4143w, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z7)), new Throwable[0]);
                Iterator it = this.f4153u.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1175b) it.next()).mo5123d(str, z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m5130f(String str) {
        boolean zContains;
        synchronized (this.f4154v) {
            zContains = this.f4152t.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: g */
    public boolean m5131g(String str) {
        boolean z7;
        synchronized (this.f4154v) {
            try {
                z7 = this.f4150r.containsKey(str) || this.f4149f.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: h */
    public boolean m5132h(String str) {
        boolean zContainsKey;
        synchronized (this.f4154v) {
            zContainsKey = this.f4149f.containsKey(str);
        }
        return zContainsKey;
    }

    /* JADX INFO: renamed from: i */
    public void m5133i(InterfaceC1175b interfaceC1175b) {
        synchronized (this.f4154v) {
            this.f4153u.remove(interfaceC1175b);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m5134j(String str) {
        return m5135k(str, null);
    }

    /* JADX INFO: renamed from: k */
    public boolean m5135k(String str, WorkerParameters.C2894a c2894a) throws Throwable {
        Throwable th;
        synchronized (this.f4154v) {
            try {
                try {
                    if (!m5131g(str)) {
                        RunnableC1183j runnableC1183jM5197a = new RunnableC1183j.c(this.f4145b, this.f4146c, this.f4147d, this, this.f4148e, str).m5199c(this.f4151s).m5198b(c2894a).m5197a();
                        InterfaceFutureC1673e interfaceFutureC1673eM5193b = runnableC1183jM5197a.m5193b();
                        interfaceFutureC1673eM5193b.addListener(new a(this, str, interfaceFutureC1673eM5193b), this.f4147d.mo8370a());
                        this.f4150r.put(str, runnableC1183jM5197a);
                        this.f4147d.getBackgroundExecutor().execute(runnableC1183jM5197a);
                        AbstractC1097j.m4844c().mo4847a(f4143w, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                        return true;
                    }
                    try {
                        AbstractC1097j.m4844c().mo4847a(f4143w, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m5136l(String str) {
        boolean zM5125e;
        synchronized (this.f4154v) {
            try {
                AbstractC1097j.m4844c().mo4847a(f4143w, String.format("Processor cancelling %s", str), new Throwable[0]);
                this.f4152t.add(str);
                RunnableC1183j runnableC1183j = (RunnableC1183j) this.f4149f.remove(str);
                boolean z7 = runnableC1183j != null;
                if (runnableC1183j == null) {
                    runnableC1183j = (RunnableC1183j) this.f4150r.remove(str);
                }
                zM5125e = m5125e(str, runnableC1183j);
                if (z7) {
                    m5126m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zM5125e;
    }

    /* JADX INFO: renamed from: n */
    public boolean m5137n(String str) {
        boolean zM5125e;
        synchronized (this.f4154v) {
            AbstractC1097j.m4844c().mo4847a(f4143w, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zM5125e = m5125e(str, (RunnableC1183j) this.f4149f.remove(str));
        }
        return zM5125e;
    }

    /* JADX INFO: renamed from: o */
    public boolean m5138o(String str) {
        boolean zM5125e;
        synchronized (this.f4154v) {
            AbstractC1097j.m4844c().mo4847a(f4143w, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zM5125e = m5125e(str, (RunnableC1183j) this.f4150r.remove(str));
        }
        return zM5125e;
    }
}

package p035E1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p019C1.EnumC0125a;
import p019C1.InterfaceC0130f;
import p059H1.ExecutorServiceC0494a;
import p104N.InterfaceC0907d;
import p155U1.InterfaceC1664g;
import p183Y1.AbstractC2016e;
import p183Y1.AbstractC2022k;
import p190Z1.AbstractC2083a;
import p190Z1.AbstractC2085c;

/* JADX INFO: renamed from: E1.l */
/* JADX INFO: loaded from: classes.dex */
class C0291l implements RunnableC0287h.b, AbstractC2083a.f {

    /* JADX INFO: renamed from: K */
    private static final c f1186K = new c();

    /* JADX INFO: renamed from: A */
    private boolean f1187A;

    /* JADX INFO: renamed from: B */
    private InterfaceC0301v f1188B;

    /* JADX INFO: renamed from: C */
    EnumC0125a f1189C;

    /* JADX INFO: renamed from: D */
    private boolean f1190D;

    /* JADX INFO: renamed from: E */
    C0296q f1191E;

    /* JADX INFO: renamed from: F */
    private boolean f1192F;

    /* JADX INFO: renamed from: G */
    C0295p f1193G;

    /* JADX INFO: renamed from: H */
    private RunnableC0287h f1194H;

    /* JADX INFO: renamed from: I */
    private volatile boolean f1195I;

    /* JADX INFO: renamed from: J */
    private boolean f1196J;

    /* JADX INFO: renamed from: a */
    final e f1197a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2085c f1198b;

    /* JADX INFO: renamed from: c */
    private final C0295p.a f1199c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0907d f1200d;

    /* JADX INFO: renamed from: e */
    private final c f1201e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0292m f1202f;

    /* JADX INFO: renamed from: r */
    private final ExecutorServiceC0494a f1203r;

    /* JADX INFO: renamed from: s */
    private final ExecutorServiceC0494a f1204s;

    /* JADX INFO: renamed from: t */
    private final ExecutorServiceC0494a f1205t;

    /* JADX INFO: renamed from: u */
    private final ExecutorServiceC0494a f1206u;

    /* JADX INFO: renamed from: v */
    private final AtomicInteger f1207v;

    /* JADX INFO: renamed from: w */
    private InterfaceC0130f f1208w;

    /* JADX INFO: renamed from: x */
    private boolean f1209x;

    /* JADX INFO: renamed from: y */
    private boolean f1210y;

    /* JADX INFO: renamed from: z */
    private boolean f1211z;

    /* JADX INFO: renamed from: E1.l$a */
    private class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1664g f1212a;

        a(InterfaceC1664g interfaceC1664g) {
            this.f1212a = interfaceC1664g;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f1212a.mo7003e()) {
                synchronized (C0291l.this) {
                    try {
                        if (C0291l.this.f1197a.m1431b(this.f1212a)) {
                            C0291l.this.m1417e(this.f1212a);
                        }
                        C0291l.this.m1420h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: E1.l$b */
    private class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1664g f1214a;

        b(InterfaceC1664g interfaceC1664g) {
            this.f1214a = interfaceC1664g;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f1214a.mo7003e()) {
                synchronized (C0291l.this) {
                    try {
                        if (C0291l.this.f1197a.m1431b(this.f1214a)) {
                            C0291l.this.f1193G.m1435a();
                            C0291l.this.m1418f(this.f1214a);
                            C0291l.this.m1426r(this.f1214a);
                        }
                        C0291l.this.m1420h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: E1.l$c */
    static class c {
        c() {
        }

        /* JADX INFO: renamed from: a */
        public C0295p m1428a(InterfaceC0301v interfaceC0301v, boolean z7, InterfaceC0130f interfaceC0130f, C0295p.a aVar) {
            return new C0295p(interfaceC0301v, z7, true, interfaceC0130f, aVar);
        }
    }

    /* JADX INFO: renamed from: E1.l$d */
    static final class d {

        /* JADX INFO: renamed from: a */
        final InterfaceC1664g f1216a;

        /* JADX INFO: renamed from: b */
        final Executor f1217b;

        d(InterfaceC1664g interfaceC1664g, Executor executor) {
            this.f1216a = interfaceC1664g;
            this.f1217b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f1216a.equals(((d) obj).f1216a);
            }
            return false;
        }

        public int hashCode() {
            return this.f1216a.hashCode();
        }
    }

    /* JADX INFO: renamed from: E1.l$e */
    static final class e implements Iterable {

        /* JADX INFO: renamed from: a */
        private final List f1218a;

        e() {
            this(new ArrayList(2));
        }

        /* JADX INFO: renamed from: g */
        private static d m1429g(InterfaceC1664g interfaceC1664g) {
            return new d(interfaceC1664g, AbstractC2016e.m8389a());
        }

        /* JADX INFO: renamed from: a */
        void m1430a(InterfaceC1664g interfaceC1664g, Executor executor) {
            this.f1218a.add(new d(interfaceC1664g, executor));
        }

        /* JADX INFO: renamed from: b */
        boolean m1431b(InterfaceC1664g interfaceC1664g) {
            return this.f1218a.contains(m1429g(interfaceC1664g));
        }

        void clear() {
            this.f1218a.clear();
        }

        /* JADX INFO: renamed from: e */
        e m1432e() {
            return new e(new ArrayList(this.f1218a));
        }

        boolean isEmpty() {
            return this.f1218a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f1218a.iterator();
        }

        /* JADX INFO: renamed from: j */
        void m1433j(InterfaceC1664g interfaceC1664g) {
            this.f1218a.remove(m1429g(interfaceC1664g));
        }

        int size() {
            return this.f1218a.size();
        }

        e(List list) {
            this.f1218a = list;
        }
    }

    C0291l(ExecutorServiceC0494a executorServiceC0494a, ExecutorServiceC0494a executorServiceC0494a2, ExecutorServiceC0494a executorServiceC0494a3, ExecutorServiceC0494a executorServiceC0494a4, InterfaceC0292m interfaceC0292m, C0295p.a aVar, InterfaceC0907d interfaceC0907d) {
        this(executorServiceC0494a, executorServiceC0494a2, executorServiceC0494a3, executorServiceC0494a4, interfaceC0292m, aVar, interfaceC0907d, f1186K);
    }

    /* JADX INFO: renamed from: i */
    private ExecutorServiceC0494a m1413i() {
        if (this.f1210y) {
            return this.f1205t;
        }
        return this.f1211z ? this.f1206u : this.f1204s;
    }

    /* JADX INFO: renamed from: m */
    private boolean m1414m() {
        return this.f1192F || this.f1190D || this.f1195I;
    }

    /* JADX INFO: renamed from: q */
    private synchronized void m1415q() {
        if (this.f1208w == null) {
            throw new IllegalArgumentException();
        }
        this.f1197a.clear();
        this.f1208w = null;
        this.f1193G = null;
        this.f1188B = null;
        this.f1192F = false;
        this.f1195I = false;
        this.f1190D = false;
        this.f1196J = false;
        this.f1194H.m1366J(false);
        this.f1194H = null;
        this.f1191E = null;
        this.f1189C = null;
        this.f1200d.mo4130a(this);
    }

    @Override // p035E1.RunnableC0287h.b
    /* JADX INFO: renamed from: a */
    public void mo1372a(InterfaceC0301v interfaceC0301v, EnumC0125a enumC0125a, boolean z7) {
        synchronized (this) {
            this.f1188B = interfaceC0301v;
            this.f1189C = enumC0125a;
            this.f1196J = z7;
        }
        m1424o();
    }

    /* JADX INFO: renamed from: b */
    synchronized void m1416b(InterfaceC1664g interfaceC1664g, Executor executor) {
        try {
            this.f1198b.mo8612c();
            this.f1197a.m1430a(interfaceC1664g, executor);
            if (this.f1190D) {
                m1421k(1);
                executor.execute(new b(interfaceC1664g));
            } else if (this.f1192F) {
                m1421k(1);
                executor.execute(new a(interfaceC1664g));
            } else {
                AbstractC2022k.m8405b(!this.f1195I, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p035E1.RunnableC0287h.b
    /* JADX INFO: renamed from: c */
    public void mo1373c(C0296q c0296q) {
        synchronized (this) {
            this.f1191E = c0296q;
        }
        m1423n();
    }

    @Override // p035E1.RunnableC0287h.b
    /* JADX INFO: renamed from: d */
    public void mo1374d(RunnableC0287h runnableC0287h) {
        m1413i().execute(runnableC0287h);
    }

    /* JADX INFO: renamed from: e */
    void m1417e(InterfaceC1664g interfaceC1664g) {
        try {
            interfaceC1664g.mo7002c(this.f1191E);
        } catch (Throwable th) {
            throw new C0281b(th);
        }
    }

    /* JADX INFO: renamed from: f */
    void m1418f(InterfaceC1664g interfaceC1664g) {
        try {
            interfaceC1664g.mo7001a(this.f1193G, this.f1189C, this.f1196J);
        } catch (Throwable th) {
            throw new C0281b(th);
        }
    }

    /* JADX INFO: renamed from: g */
    void m1419g() {
        if (m1414m()) {
            return;
        }
        this.f1195I = true;
        this.f1194H.m1369k();
        this.f1202f.mo1403c(this, this.f1208w);
    }

    /* JADX INFO: renamed from: h */
    void m1420h() {
        C0295p c0295p;
        synchronized (this) {
            try {
                this.f1198b.mo8612c();
                AbstractC2022k.m8405b(m1414m(), "Not yet complete!");
                int iDecrementAndGet = this.f1207v.decrementAndGet();
                AbstractC2022k.m8405b(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    c0295p = this.f1193G;
                    m1415q();
                } else {
                    c0295p = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0295p != null) {
            c0295p.m1441g();
        }
    }

    @Override // p190Z1.AbstractC2083a.f
    /* JADX INFO: renamed from: j */
    public AbstractC2085c mo1368j() {
        return this.f1198b;
    }

    /* JADX INFO: renamed from: k */
    synchronized void m1421k(int i7) {
        C0295p c0295p;
        AbstractC2022k.m8405b(m1414m(), "Not yet complete!");
        if (this.f1207v.getAndAdd(i7) == 0 && (c0295p = this.f1193G) != null) {
            c0295p.m1435a();
        }
    }

    /* JADX INFO: renamed from: l */
    synchronized C0291l m1422l(InterfaceC0130f interfaceC0130f, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f1208w = interfaceC0130f;
        this.f1209x = z7;
        this.f1210y = z8;
        this.f1211z = z9;
        this.f1187A = z10;
        return this;
    }

    /* JADX INFO: renamed from: n */
    void m1423n() {
        synchronized (this) {
            try {
                this.f1198b.mo8612c();
                if (this.f1195I) {
                    m1415q();
                    return;
                }
                if (this.f1197a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f1192F) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f1192F = true;
                InterfaceC0130f interfaceC0130f = this.f1208w;
                e<d> eVarM1432e = this.f1197a.m1432e();
                m1421k(eVarM1432e.size() + 1);
                this.f1202f.mo1404d(this, interfaceC0130f, null);
                for (d dVar : eVarM1432e) {
                    dVar.f1217b.execute(new a(dVar.f1216a));
                }
                m1420h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    void m1424o() {
        synchronized (this) {
            try {
                this.f1198b.mo8612c();
                if (this.f1195I) {
                    this.f1188B.mo1436b();
                    m1415q();
                    return;
                }
                if (this.f1197a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f1190D) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f1193G = this.f1201e.m1428a(this.f1188B, this.f1209x, this.f1208w, this.f1199c);
                this.f1190D = true;
                e<d> eVarM1432e = this.f1197a.m1432e();
                m1421k(eVarM1432e.size() + 1);
                this.f1202f.mo1404d(this, this.f1208w, this.f1193G);
                for (d dVar : eVarM1432e) {
                    dVar.f1217b.execute(new b(dVar.f1216a));
                }
                m1420h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    boolean m1425p() {
        return this.f1187A;
    }

    /* JADX INFO: renamed from: r */
    synchronized void m1426r(InterfaceC1664g interfaceC1664g) {
        try {
            this.f1198b.mo8612c();
            this.f1197a.m1433j(interfaceC1664g);
            if (this.f1197a.isEmpty()) {
                m1419g();
                if (this.f1190D || this.f1192F) {
                    if (this.f1207v.get() == 0) {
                        m1415q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m1427s(RunnableC0287h runnableC0287h) {
        try {
            this.f1194H = runnableC0287h;
            (runnableC0287h.m1367W() ? this.f1203r : m1413i()).execute(runnableC0287h);
        } catch (Throwable th) {
            throw th;
        }
    }

    C0291l(ExecutorServiceC0494a executorServiceC0494a, ExecutorServiceC0494a executorServiceC0494a2, ExecutorServiceC0494a executorServiceC0494a3, ExecutorServiceC0494a executorServiceC0494a4, InterfaceC0292m interfaceC0292m, C0295p.a aVar, InterfaceC0907d interfaceC0907d, c cVar) {
        this.f1197a = new e();
        this.f1198b = AbstractC2085c.m8610a();
        this.f1207v = new AtomicInteger();
        this.f1203r = executorServiceC0494a;
        this.f1204s = executorServiceC0494a2;
        this.f1205t = executorServiceC0494a3;
        this.f1206u = executorServiceC0494a4;
        this.f1202f = interfaceC0292m;
        this.f1199c = aVar;
        this.f1200d = interfaceC0907d;
        this.f1201e = cVar;
    }
}

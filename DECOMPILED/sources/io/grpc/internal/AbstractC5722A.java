package io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p063H5.AbstractC0543g;
import p063H5.C0530Z;
import p063H5.C0554l0;
import p063H5.C0565r;
import p063H5.C0568t;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5722A extends AbstractC0543g {

    /* JADX INFO: renamed from: j */
    private static final Logger f21882j = Logger.getLogger(AbstractC5722A.class.getName());

    /* JADX INFO: renamed from: k */
    private static final AbstractC0543g f21883k = new i();

    /* JADX INFO: renamed from: a */
    private final ScheduledFuture f21884a;

    /* JADX INFO: renamed from: b */
    private final Executor f21885b;

    /* JADX INFO: renamed from: c */
    private final C0565r f21886c;

    /* JADX INFO: renamed from: d */
    private volatile boolean f21887d;

    /* JADX INFO: renamed from: e */
    private AbstractC0543g.a f21888e;

    /* JADX INFO: renamed from: f */
    private AbstractC0543g f21889f;

    /* JADX INFO: renamed from: g */
    private C0554l0 f21890g;

    /* JADX INFO: renamed from: h */
    private List f21891h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private k f21892i;

    /* JADX INFO: renamed from: io.grpc.internal.A$a */
    class a extends AbstractRunnableC5818y {
        a(C0565r c0565r) {
            super(c0565r);
        }

        @Override // io.grpc.internal.AbstractRunnableC5818y
        /* JADX INFO: renamed from: a */
        public void mo25416a() {
            AbstractC5722A.this.m25410m();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.A$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ StringBuilder f21894a;

        b(StringBuilder sb) {
            this.f21894a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5722A.this.m25408k(C0554l0.f2102i.m2462q(this.f21894a.toString()), true);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.A$c */
    class c extends AbstractRunnableC5818y {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ k f21896b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(AbstractC5722A.this.f21886c);
            this.f21896b = kVar;
        }

        @Override // io.grpc.internal.AbstractRunnableC5818y
        /* JADX INFO: renamed from: a */
        public void mo25416a() {
            this.f21896b.m25419g();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.A$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC0543g.a f21898a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C0530Z f21899b;

        d(AbstractC0543g.a aVar, C0530Z c0530z) {
            this.f21898a = aVar;
            this.f21899b = c0530z;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5722A.this.f21889f.mo2122e(this.f21898a, this.f21899b);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.A$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0554l0 f21901a;

        e(C0554l0 c0554l0) {
            this.f21901a = c0554l0;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5722A.this.f21889f.mo2118a(this.f21901a.m2459n(), this.f21901a.m2457l());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.A$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f21903a;

        f(Object obj) {
            this.f21903a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5722A.this.f21889f.mo2121d(this.f21903a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.A$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f21905a;

        g(int i7) {
            this.f21905a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5722A.this.f21889f.mo2120c(this.f21905a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.A$h */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5722A.this.f21889f.mo2119b();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.A$i */
    class i extends AbstractC0543g {
        i() {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: a */
        public void mo2118a(String str, Throwable th) {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: b */
        public void mo2119b() {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: c */
        public void mo2120c(int i7) {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: d */
        public void mo2121d(Object obj) {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: e */
        public void mo2122e(AbstractC0543g.a aVar, C0530Z c0530z) {
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.A$j */
    private final class j extends AbstractRunnableC5818y {

        /* JADX INFO: renamed from: b */
        final AbstractC0543g.a f21908b;

        /* JADX INFO: renamed from: c */
        final C0554l0 f21909c;

        j(AbstractC0543g.a aVar, C0554l0 c0554l0) {
            super(AbstractC5722A.this.f21886c);
            this.f21908b = aVar;
            this.f21909c = c0554l0;
        }

        @Override // io.grpc.internal.AbstractRunnableC5818y
        /* JADX INFO: renamed from: a */
        public void mo25416a() {
            this.f21908b.mo2421a(this.f21909c, new C0530Z());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.A$k */
    private static final class k extends AbstractC0543g.a {

        /* JADX INFO: renamed from: a */
        private final AbstractC0543g.a f21911a;

        /* JADX INFO: renamed from: b */
        private volatile boolean f21912b;

        /* JADX INFO: renamed from: c */
        private List f21913c = new ArrayList();

        /* JADX INFO: renamed from: io.grpc.internal.A$k$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0530Z f21914a;

            a(C0530Z c0530z) {
                this.f21914a = c0530z;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f21911a.mo2422b(this.f21914a);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.A$k$b */
        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Object f21916a;

            b(Object obj) {
                this.f21916a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f21911a.mo2423c(this.f21916a);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.A$k$c */
        class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0554l0 f21918a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C0530Z f21919b;

            c(C0554l0 c0554l0, C0530Z c0530z) {
                this.f21918a = c0554l0;
                this.f21919b = c0530z;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f21911a.mo2421a(this.f21918a, this.f21919b);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.A$k$d */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f21911a.mo2424d();
            }
        }

        public k(AbstractC0543g.a aVar) {
            this.f21911a = aVar;
        }

        /* JADX INFO: renamed from: f */
        private void m25418f(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f21912b) {
                        runnable.run();
                    } else {
                        this.f21913c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p063H5.AbstractC0543g.a
        /* JADX INFO: renamed from: a */
        public void mo2421a(C0554l0 c0554l0, C0530Z c0530z) {
            m25418f(new c(c0554l0, c0530z));
        }

        @Override // p063H5.AbstractC0543g.a
        /* JADX INFO: renamed from: b */
        public void mo2422b(C0530Z c0530z) {
            if (this.f21912b) {
                this.f21911a.mo2422b(c0530z);
            } else {
                m25418f(new a(c0530z));
            }
        }

        @Override // p063H5.AbstractC0543g.a
        /* JADX INFO: renamed from: c */
        public void mo2423c(Object obj) {
            if (this.f21912b) {
                this.f21911a.mo2423c(obj);
            } else {
                m25418f(new b(obj));
            }
        }

        @Override // p063H5.AbstractC0543g.a
        /* JADX INFO: renamed from: d */
        public void mo2424d() {
            if (this.f21912b) {
                this.f21911a.mo2424d();
            } else {
                m25418f(new d());
            }
        }

        /* JADX INFO: renamed from: g */
        void m25419g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f21913c.isEmpty()) {
                            this.f21913c = null;
                            this.f21912b = true;
                            return;
                        } else {
                            list = this.f21913c;
                            this.f21913c = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    protected AbstractC5722A(Executor executor, ScheduledExecutorService scheduledExecutorService, C0568t c0568t) {
        this.f21885b = (Executor) AbstractC1209m.m5303o(executor, "callExecutor");
        AbstractC1209m.m5303o(scheduledExecutorService, "scheduler");
        this.f21886c = C0565r.m2503e();
        this.f21884a = m25412o(scheduledExecutorService, c0568t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m25408k(C0554l0 c0554l0, boolean z7) {
        boolean z8;
        AbstractC0543g.a aVar;
        synchronized (this) {
            try {
                if (this.f21889f == null) {
                    m25413q(f21883k);
                    aVar = this.f21888e;
                    this.f21890g = c0554l0;
                    z8 = false;
                } else {
                    if (z7) {
                        return;
                    }
                    z8 = true;
                    aVar = null;
                }
                if (z8) {
                    m25409l(new e(c0554l0));
                } else {
                    if (aVar != null) {
                        this.f21885b.execute(new j(aVar, c0554l0));
                    }
                    m25410m();
                }
                mo25414j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m25409l(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f21887d) {
                    runnable.run();
                } else {
                    this.f21891h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m25410m() {
        k kVar;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f21891h.isEmpty()) {
                    break;
                }
                list = this.f21891h;
                this.f21891h = arrayList;
            }
            if (kVar != null) {
                this.f21885b.execute(new c(kVar));
            }
            list.clear();
            arrayList = list;
        }
        this.f21891h = null;
        this.f21887d = true;
        kVar = this.f21892i;
        if (kVar != null) {
            this.f21885b.execute(new c(kVar));
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m25411n(C0568t c0568t, C0568t c0568t2) {
        if (c0568t2 == null) {
            return true;
        }
        if (c0568t == null) {
            return false;
        }
        return c0568t.m2521n(c0568t2);
    }

    /* JADX INFO: renamed from: o */
    private ScheduledFuture m25412o(ScheduledExecutorService scheduledExecutorService, C0568t c0568t) {
        C0568t c0568tM2510g = this.f21886c.m2510g();
        if (c0568t == null && c0568tM2510g == null) {
            return null;
        }
        long jM2524q = c0568t != null ? c0568t.m2524q(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
        if (c0568tM2510g != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (c0568tM2510g.m2524q(timeUnit) < jM2524q) {
                jM2524q = c0568tM2510g.m2524q(timeUnit);
                Logger logger = f21882j;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jM2524q)));
                    if (c0568t == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c0568t.m2524q(timeUnit))));
                    }
                    logger.fine(sb.toString());
                }
            }
        }
        long jAbs = Math.abs(jM2524q);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit2.toNanos(1L);
        long jAbs2 = Math.abs(jM2524q) % timeUnit2.toNanos(1L);
        StringBuilder sb2 = new StringBuilder();
        String str = m25411n(c0568tM2510g, c0568t) ? "Context" : "CallOptions";
        if (jM2524q < 0) {
            sb2.append("ClientCall started after ");
            sb2.append(str);
            sb2.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb2.append("Deadline ");
            sb2.append(str);
            sb2.append(" will be exceeded in ");
        }
        sb2.append(nanos);
        sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        sb2.append("s. ");
        return scheduledExecutorService.schedule(new b(sb2), jM2524q, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: q */
    private void m25413q(AbstractC0543g abstractC0543g) {
        AbstractC0543g abstractC0543g2 = this.f21889f;
        AbstractC1209m.m5311w(abstractC0543g2 == null, "realCall already set to %s", abstractC0543g2);
        ScheduledFuture scheduledFuture = this.f21884a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f21889f = abstractC0543g;
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: a */
    public final void mo2118a(String str, Throwable th) {
        C0554l0 c0554l0 = C0554l0.f2099f;
        C0554l0 c0554l0M2462q = str != null ? c0554l0.m2462q(str) : c0554l0.m2462q("Call cancelled without message");
        if (th != null) {
            c0554l0M2462q = c0554l0M2462q.m2461p(th);
        }
        m25408k(c0554l0M2462q, false);
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: b */
    public final void mo2119b() {
        m25409l(new h());
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: c */
    public final void mo2120c(int i7) {
        if (this.f21887d) {
            this.f21889f.mo2120c(i7);
        } else {
            m25409l(new g(i7));
        }
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: d */
    public final void mo2121d(Object obj) {
        if (this.f21887d) {
            this.f21889f.mo2121d(obj);
        } else {
            m25409l(new f(obj));
        }
    }

    @Override // p063H5.AbstractC0543g
    /* JADX INFO: renamed from: e */
    public final void mo2122e(AbstractC0543g.a aVar, C0530Z c0530z) {
        C0554l0 c0554l0;
        boolean z7;
        AbstractC1209m.m5309u(this.f21888e == null, "already started");
        synchronized (this) {
            try {
                this.f21888e = (AbstractC0543g.a) AbstractC1209m.m5303o(aVar, "listener");
                c0554l0 = this.f21890g;
                z7 = this.f21887d;
                if (!z7) {
                    k kVar = new k(aVar);
                    this.f21892i = kVar;
                    aVar = kVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0554l0 != null) {
            this.f21885b.execute(new j(aVar, c0554l0));
        } else if (z7) {
            this.f21889f.mo2122e(aVar, c0530z);
        } else {
            m25409l(new d(aVar, c0530z));
        }
    }

    /* JADX INFO: renamed from: j */
    protected void mo25414j() {
    }

    /* JADX INFO: renamed from: p */
    public final Runnable m25415p(AbstractC0543g abstractC0543g) {
        synchronized (this) {
            try {
                if (this.f21889f != null) {
                    return null;
                }
                m25413q((AbstractC0543g) AbstractC1209m.m5303o(abstractC0543g, "call"));
                return new a(this.f21886c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5277d("realCall", this.f21889f).toString();
    }
}

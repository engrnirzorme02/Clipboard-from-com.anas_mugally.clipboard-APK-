package androidx.concurrent.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: renamed from: androidx.concurrent.futures.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2403a implements InterfaceFutureC1673e {

    /* JADX INFO: renamed from: d */
    static final boolean f8484d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    private static final Logger f8485e = Logger.getLogger(AbstractC2403a.class.getName());

    /* JADX INFO: renamed from: f */
    static final b f8486f;

    /* JADX INFO: renamed from: r */
    private static final Object f8487r;

    /* JADX INFO: renamed from: a */
    volatile Object f8488a;

    /* JADX INFO: renamed from: b */
    volatile e f8489b;

    /* JADX INFO: renamed from: c */
    volatile h f8490c;

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$b */
    private static abstract class b {
        private b() {
        }

        /* JADX INFO: renamed from: a */
        abstract boolean mo10332a(AbstractC2403a abstractC2403a, e eVar, e eVar2);

        /* JADX INFO: renamed from: b */
        abstract boolean mo10333b(AbstractC2403a abstractC2403a, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        abstract boolean mo10334c(AbstractC2403a abstractC2403a, h hVar, h hVar2);

        /* JADX INFO: renamed from: d */
        abstract void mo10335d(h hVar, h hVar2);

        /* JADX INFO: renamed from: e */
        abstract void mo10336e(h hVar, Thread thread);
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$c */
    private static final class c {

        /* JADX INFO: renamed from: c */
        static final c f8491c;

        /* JADX INFO: renamed from: d */
        static final c f8492d;

        /* JADX INFO: renamed from: a */
        final boolean f8493a;

        /* JADX INFO: renamed from: b */
        final Throwable f8494b;

        static {
            if (AbstractC2403a.f8484d) {
                f8492d = null;
                f8491c = null;
            } else {
                f8492d = new c(false, null);
                f8491c = new c(true, null);
            }
        }

        c(boolean z7, Throwable th) {
            this.f8493a = z7;
            this.f8494b = th;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$d */
    private static final class d {

        /* JADX INFO: renamed from: b */
        static final d f8495b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a */
        final Throwable f8496a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f8496a = (Throwable) AbstractC2403a.m10317j(th);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$e */
    private static final class e {

        /* JADX INFO: renamed from: d */
        static final e f8497d = new e(null, null);

        /* JADX INFO: renamed from: a */
        final Runnable f8498a;

        /* JADX INFO: renamed from: b */
        final Executor f8499b;

        /* JADX INFO: renamed from: c */
        e f8500c;

        e(Runnable runnable, Executor executor) {
            this.f8498a = runnable;
            this.f8499b = executor;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$f */
    private static final class f extends b {

        /* JADX INFO: renamed from: a */
        final AtomicReferenceFieldUpdater f8501a;

        /* JADX INFO: renamed from: b */
        final AtomicReferenceFieldUpdater f8502b;

        /* JADX INFO: renamed from: c */
        final AtomicReferenceFieldUpdater f8503c;

        /* JADX INFO: renamed from: d */
        final AtomicReferenceFieldUpdater f8504d;

        /* JADX INFO: renamed from: e */
        final AtomicReferenceFieldUpdater f8505e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f8501a = atomicReferenceFieldUpdater;
            this.f8502b = atomicReferenceFieldUpdater2;
            this.f8503c = atomicReferenceFieldUpdater3;
            this.f8504d = atomicReferenceFieldUpdater4;
            this.f8505e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractC2403a.b
        /* JADX INFO: renamed from: a */
        boolean mo10332a(AbstractC2403a abstractC2403a, e eVar, e eVar2) {
            return AbstractC2404b.m10339a(this.f8504d, abstractC2403a, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC2403a.b
        /* JADX INFO: renamed from: b */
        boolean mo10333b(AbstractC2403a abstractC2403a, Object obj, Object obj2) {
            return AbstractC2404b.m10339a(this.f8505e, abstractC2403a, obj, obj2);
        }

        @Override // androidx.concurrent.futures.AbstractC2403a.b
        /* JADX INFO: renamed from: c */
        boolean mo10334c(AbstractC2403a abstractC2403a, h hVar, h hVar2) {
            return AbstractC2404b.m10339a(this.f8503c, abstractC2403a, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC2403a.b
        /* JADX INFO: renamed from: d */
        void mo10335d(h hVar, h hVar2) {
            this.f8502b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.AbstractC2403a.b
        /* JADX INFO: renamed from: e */
        void mo10336e(h hVar, Thread thread) {
            this.f8501a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$g */
    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.AbstractC2403a.b
        /* JADX INFO: renamed from: a */
        boolean mo10332a(AbstractC2403a abstractC2403a, e eVar, e eVar2) {
            synchronized (abstractC2403a) {
                try {
                    if (abstractC2403a.f8489b != eVar) {
                        return false;
                    }
                    abstractC2403a.f8489b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractC2403a.b
        /* JADX INFO: renamed from: b */
        boolean mo10333b(AbstractC2403a abstractC2403a, Object obj, Object obj2) {
            synchronized (abstractC2403a) {
                try {
                    if (abstractC2403a.f8488a != obj) {
                        return false;
                    }
                    abstractC2403a.f8488a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractC2403a.b
        /* JADX INFO: renamed from: c */
        boolean mo10334c(AbstractC2403a abstractC2403a, h hVar, h hVar2) {
            synchronized (abstractC2403a) {
                try {
                    if (abstractC2403a.f8490c != hVar) {
                        return false;
                    }
                    abstractC2403a.f8490c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractC2403a.b
        /* JADX INFO: renamed from: d */
        void mo10335d(h hVar, h hVar2) {
            hVar.f8508b = hVar2;
        }

        @Override // androidx.concurrent.futures.AbstractC2403a.b
        /* JADX INFO: renamed from: e */
        void mo10336e(h hVar, Thread thread) {
            hVar.f8507a = thread;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.a$h */
    private static final class h {

        /* JADX INFO: renamed from: c */
        static final h f8506c = new h(false);

        /* JADX INFO: renamed from: a */
        volatile Thread f8507a;

        /* JADX INFO: renamed from: b */
        volatile h f8508b;

        h(boolean z7) {
        }

        /* JADX INFO: renamed from: a */
        void m10337a(h hVar) {
            AbstractC2403a.f8486f.mo10335d(this, hVar);
        }

        /* JADX INFO: renamed from: b */
        void m10338b() {
            Thread thread = this.f8507a;
            if (thread != null) {
                this.f8507a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            AbstractC2403a.f8486f.mo10336e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2403a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2403a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2403a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f8486f = gVar;
        if (th != null) {
            f8485e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8487r = new Object();
    }

    protected AbstractC2403a() {
    }

    /* JADX INFO: renamed from: c */
    private void m10315c(StringBuilder sb) {
        try {
            Object objM10322p = m10322p(this);
            sb.append("SUCCESS, result=[");
            sb.append(m10325z(objM10322p));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e7) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e7.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    /* JADX INFO: renamed from: h */
    private static CancellationException m10316h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX INFO: renamed from: j */
    static Object m10317j(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: k */
    private e m10318k(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f8489b;
        } while (!f8486f.mo10332a(this, eVar2, e.f8497d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f8500c;
            eVar4.f8500c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX INFO: renamed from: m */
    static void m10319m(AbstractC2403a abstractC2403a) {
        abstractC2403a.m10323v();
        abstractC2403a.mo10327d();
        e eVarM10318k = abstractC2403a.m10318k(null);
        while (eVarM10318k != null) {
            e eVar = eVarM10318k.f8500c;
            m10320n(eVarM10318k.f8498a, eVarM10318k.f8499b);
            eVarM10318k = eVar;
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m10320n(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f8485e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    /* JADX INFO: renamed from: o */
    private Object m10321o(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw m10316h("Task was cancelled.", ((c) obj).f8494b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f8496a);
        }
        if (obj == f8487r) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: p */
    static Object m10322p(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: v */
    private void m10323v() {
        h hVar;
        do {
            hVar = this.f8490c;
        } while (!f8486f.mo10334c(this, hVar, h.f8506c));
        while (hVar != null) {
            hVar.m10338b();
            hVar = hVar.f8508b;
        }
    }

    /* JADX INFO: renamed from: w */
    private void m10324w(h hVar) {
        hVar.f8507a = null;
        while (true) {
            h hVar2 = this.f8490c;
            if (hVar2 == h.f8506c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f8508b;
                if (hVar2.f8507a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f8508b = hVar4;
                    if (hVar3.f8507a == null) {
                    }
                } else if (!f8486f.mo10334c(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: z */
    private String m10325z(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* JADX INFO: renamed from: A */
    protected final boolean m10326A() {
        Object obj = this.f8488a;
        return (obj instanceof c) && ((c) obj).f8493a;
    }

    @Override // p157U3.InterfaceFutureC1673e
    public final void addListener(Runnable runnable, Executor executor) {
        m10317j(runnable);
        m10317j(executor);
        e eVar = this.f8489b;
        if (eVar != e.f8497d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f8500c = eVar;
                if (f8486f.mo10332a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f8489b;
                }
            } while (eVar != e.f8497d);
        }
        m10320n(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        c cVar;
        Object obj = this.f8488a;
        if (obj == null) {
            if (f8484d) {
                cVar = new c(z7, new CancellationException("Future.cancel() was called."));
            } else {
                cVar = z7 ? c.f8491c : c.f8492d;
            }
            if (f8486f.mo10333b(this, obj, cVar)) {
                if (z7) {
                    m10328q();
                }
                m10319m(this);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    protected void mo10327d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8488a;
        if (obj != null) {
            return m10321o(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f8490c;
            if (hVar != h.f8506c) {
                h hVar2 = new h();
                while (true) {
                    hVar2.m10337a(hVar);
                    if (f8486f.mo10334c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m10324w(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8488a;
                            if (obj2 != null) {
                                return m10321o(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m10324w(hVar2);
                        break;
                    }
                    hVar = this.f8490c;
                    if (hVar == h.f8506c) {
                    }
                }
            }
            return m10321o(this.f8488a);
        }
        while (nanos > 0) {
            Object obj3 = this.f8488a;
            if (obj3 != null) {
                return m10321o(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j7 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j8 = -nanos;
            long jConvert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(jConvert);
            boolean z7 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z7) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z7) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8488a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8488a != null;
    }

    /* JADX INFO: renamed from: q */
    protected void m10328q() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    protected String mo10329t() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String strMo10329t;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m10315c(sb);
        } else {
            try {
                strMo10329t = mo10329t();
            } catch (RuntimeException e7) {
                strMo10329t = "Exception thrown from implementation: " + e7.getClass();
            }
            if (strMo10329t != null && !strMo10329t.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo10329t);
                sb.append("]");
            } else if (isDone()) {
                m10315c(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    protected boolean mo10330x(Object obj) {
        if (obj == null) {
            obj = f8487r;
        }
        if (!f8486f.mo10333b(this, null, obj)) {
            return false;
        }
        m10319m(this);
        return true;
    }

    /* JADX INFO: renamed from: y */
    protected boolean mo10331y(Throwable th) {
        if (!f8486f.mo10333b(this, null, new d((Throwable) m10317j(th)))) {
            return false;
        }
        m10319m(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8488a;
            if (obj2 != null) {
                return m10321o(obj2);
            }
            h hVar = this.f8490c;
            if (hVar != h.f8506c) {
                h hVar2 = new h();
                do {
                    hVar2.m10337a(hVar);
                    if (f8486f.mo10334c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8488a;
                            } else {
                                m10324w(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return m10321o(obj);
                    }
                    hVar = this.f8490c;
                } while (hVar != h.f8506c);
            }
            return m10321o(this.f8488a);
        }
        throw new InterruptedException();
    }
}

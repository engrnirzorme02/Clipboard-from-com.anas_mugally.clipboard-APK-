package androidx.work.impl.utils.futures;

import androidx.concurrent.futures.AbstractC2404b;
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

/* JADX INFO: renamed from: androidx.work.impl.utils.futures.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2911a implements InterfaceFutureC1673e {

    /* JADX INFO: renamed from: d */
    static final boolean f11991d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    private static final Logger f11992e = Logger.getLogger(AbstractC2911a.class.getName());

    /* JADX INFO: renamed from: f */
    static final b f11993f;

    /* JADX INFO: renamed from: r */
    private static final Object f11994r;

    /* JADX INFO: renamed from: a */
    volatile Object f11995a;

    /* JADX INFO: renamed from: b */
    volatile e f11996b;

    /* JADX INFO: renamed from: c */
    volatile i f11997c;

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$b */
    private static abstract class b {
        private b() {
        }

        /* JADX INFO: renamed from: a */
        abstract boolean mo14622a(AbstractC2911a abstractC2911a, e eVar, e eVar2);

        /* JADX INFO: renamed from: b */
        abstract boolean mo14623b(AbstractC2911a abstractC2911a, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        abstract boolean mo14624c(AbstractC2911a abstractC2911a, i iVar, i iVar2);

        /* JADX INFO: renamed from: d */
        abstract void mo14625d(i iVar, i iVar2);

        /* JADX INFO: renamed from: e */
        abstract void mo14626e(i iVar, Thread thread);
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$c */
    private static final class c {

        /* JADX INFO: renamed from: c */
        static final c f11998c;

        /* JADX INFO: renamed from: d */
        static final c f11999d;

        /* JADX INFO: renamed from: a */
        final boolean f12000a;

        /* JADX INFO: renamed from: b */
        final Throwable f12001b;

        static {
            if (AbstractC2911a.f11991d) {
                f11999d = null;
                f11998c = null;
            } else {
                f11999d = new c(false, null);
                f11998c = new c(true, null);
            }
        }

        c(boolean z7, Throwable th) {
            this.f12000a = z7;
            this.f12001b = th;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$d */
    private static final class d {

        /* JADX INFO: renamed from: b */
        static final d f12002b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a */
        final Throwable f12003a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$d$a */
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
            this.f12003a = (Throwable) AbstractC2911a.m14606d(th);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$e */
    private static final class e {

        /* JADX INFO: renamed from: d */
        static final e f12004d = new e(null, null);

        /* JADX INFO: renamed from: a */
        final Runnable f12005a;

        /* JADX INFO: renamed from: b */
        final Executor f12006b;

        /* JADX INFO: renamed from: c */
        e f12007c;

        e(Runnable runnable, Executor executor) {
            this.f12005a = runnable;
            this.f12006b = executor;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$f */
    private static final class f extends b {

        /* JADX INFO: renamed from: a */
        final AtomicReferenceFieldUpdater f12008a;

        /* JADX INFO: renamed from: b */
        final AtomicReferenceFieldUpdater f12009b;

        /* JADX INFO: renamed from: c */
        final AtomicReferenceFieldUpdater f12010c;

        /* JADX INFO: renamed from: d */
        final AtomicReferenceFieldUpdater f12011d;

        /* JADX INFO: renamed from: e */
        final AtomicReferenceFieldUpdater f12012e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f12008a = atomicReferenceFieldUpdater;
            this.f12009b = atomicReferenceFieldUpdater2;
            this.f12010c = atomicReferenceFieldUpdater3;
            this.f12011d = atomicReferenceFieldUpdater4;
            this.f12012e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2911a.b
        /* JADX INFO: renamed from: a */
        boolean mo14622a(AbstractC2911a abstractC2911a, e eVar, e eVar2) {
            return AbstractC2404b.m10339a(this.f12011d, abstractC2911a, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2911a.b
        /* JADX INFO: renamed from: b */
        boolean mo14623b(AbstractC2911a abstractC2911a, Object obj, Object obj2) {
            return AbstractC2404b.m10339a(this.f12012e, abstractC2911a, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2911a.b
        /* JADX INFO: renamed from: c */
        boolean mo14624c(AbstractC2911a abstractC2911a, i iVar, i iVar2) {
            return AbstractC2404b.m10339a(this.f12010c, abstractC2911a, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2911a.b
        /* JADX INFO: renamed from: d */
        void mo14625d(i iVar, i iVar2) {
            this.f12009b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2911a.b
        /* JADX INFO: renamed from: e */
        void mo14626e(i iVar, Thread thread) {
            this.f12008a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$g */
    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final AbstractC2911a f12013a;

        /* JADX INFO: renamed from: b */
        final InterfaceFutureC1673e f12014b;

        g(AbstractC2911a abstractC2911a, InterfaceFutureC1673e interfaceFutureC1673e) {
            this.f12013a = abstractC2911a;
            this.f12014b = interfaceFutureC1673e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12013a.f11995a != this) {
                return;
            }
            if (AbstractC2911a.f11993f.mo14623b(this.f12013a, this, AbstractC2911a.m14611i(this.f12014b))) {
                AbstractC2911a.m14608f(this.f12013a);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$h */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2911a.b
        /* JADX INFO: renamed from: a */
        boolean mo14622a(AbstractC2911a abstractC2911a, e eVar, e eVar2) {
            synchronized (abstractC2911a) {
                try {
                    if (abstractC2911a.f11996b != eVar) {
                        return false;
                    }
                    abstractC2911a.f11996b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2911a.b
        /* JADX INFO: renamed from: b */
        boolean mo14623b(AbstractC2911a abstractC2911a, Object obj, Object obj2) {
            synchronized (abstractC2911a) {
                try {
                    if (abstractC2911a.f11995a != obj) {
                        return false;
                    }
                    abstractC2911a.f11995a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2911a.b
        /* JADX INFO: renamed from: c */
        boolean mo14624c(AbstractC2911a abstractC2911a, i iVar, i iVar2) {
            synchronized (abstractC2911a) {
                try {
                    if (abstractC2911a.f11997c != iVar) {
                        return false;
                    }
                    abstractC2911a.f11997c = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2911a.b
        /* JADX INFO: renamed from: d */
        void mo14625d(i iVar, i iVar2) {
            iVar.f12017b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC2911a.b
        /* JADX INFO: renamed from: e */
        void mo14626e(i iVar, Thread thread) {
            iVar.f12016a = thread;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$i */
    private static final class i {

        /* JADX INFO: renamed from: c */
        static final i f12015c = new i(false);

        /* JADX INFO: renamed from: a */
        volatile Thread f12016a;

        /* JADX INFO: renamed from: b */
        volatile i f12017b;

        i(boolean z7) {
        }

        /* JADX INFO: renamed from: a */
        void m14627a(i iVar) {
            AbstractC2911a.f11993f.mo14625d(this, iVar);
        }

        /* JADX INFO: renamed from: b */
        void m14628b() {
            Thread thread = this.f12016a;
            if (thread != null) {
                this.f12016a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            AbstractC2911a.f11993f.mo14626e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2911a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2911a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2911a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f11993f = hVar;
        if (th != null) {
            f11992e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f11994r = new Object();
    }

    protected AbstractC2911a() {
    }

    /* JADX INFO: renamed from: a */
    private void m14604a(StringBuilder sb) {
        try {
            Object objM14612j = m14612j(this);
            sb.append("SUCCESS, result=[");
            sb.append(m14615r(objM14612j));
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

    /* JADX INFO: renamed from: c */
    private static CancellationException m14605c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX INFO: renamed from: d */
    static Object m14606d(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: e */
    private e m14607e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f11996b;
        } while (!f11993f.mo14622a(this, eVar2, e.f12004d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f12007c;
            eVar4.f12007c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX INFO: renamed from: f */
    static void m14608f(AbstractC2911a abstractC2911a) {
        e eVar = null;
        while (true) {
            abstractC2911a.m14613m();
            abstractC2911a.m14616b();
            e eVarM14607e = abstractC2911a.m14607e(eVar);
            while (eVarM14607e != null) {
                eVar = eVarM14607e.f12007c;
                Runnable runnable = eVarM14607e.f12005a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC2911a = gVar.f12013a;
                    if (abstractC2911a.f11995a == gVar) {
                        if (f11993f.mo14623b(abstractC2911a, gVar, m14611i(gVar.f12014b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    m14609g(runnable, eVarM14607e.f12006b);
                }
                eVarM14607e = eVar;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m14609g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            f11992e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    /* JADX INFO: renamed from: h */
    private Object m14610h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw m14605c("Task was cancelled.", ((c) obj).f12001b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f12003a);
        }
        if (obj == f11994r) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: i */
    static Object m14611i(InterfaceFutureC1673e interfaceFutureC1673e) {
        if (interfaceFutureC1673e instanceof AbstractC2911a) {
            Object obj = ((AbstractC2911a) interfaceFutureC1673e).f11995a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f12000a) {
                return cVar.f12001b != null ? new c(false, cVar.f12001b) : c.f11999d;
            }
            return obj;
        }
        boolean zIsCancelled = interfaceFutureC1673e.isCancelled();
        if ((!f11991d) && zIsCancelled) {
            return c.f11999d;
        }
        try {
            Object objM14612j = m14612j(interfaceFutureC1673e);
            return objM14612j == null ? f11994r : objM14612j;
        } catch (CancellationException e7) {
            if (zIsCancelled) {
                return new c(false, e7);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC1673e, e7));
        } catch (ExecutionException e8) {
            return new d(e8.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    /* JADX INFO: renamed from: j */
    private static Object m14612j(Future future) {
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

    /* JADX INFO: renamed from: m */
    private void m14613m() {
        i iVar;
        do {
            iVar = this.f11997c;
        } while (!f11993f.mo14624c(this, iVar, i.f12015c));
        while (iVar != null) {
            iVar.m14628b();
            iVar = iVar.f12017b;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m14614n(i iVar) {
        iVar.f12016a = null;
        while (true) {
            i iVar2 = this.f11997c;
            if (iVar2 == i.f12015c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f12017b;
                if (iVar2.f12016a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f12017b = iVar4;
                    if (iVar3.f12016a == null) {
                    }
                } else if (!f11993f.mo14624c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: r */
    private String m14615r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // p157U3.InterfaceFutureC1673e
    public final void addListener(Runnable runnable, Executor executor) {
        m14606d(runnable);
        m14606d(executor);
        e eVar = this.f11996b;
        if (eVar != e.f12004d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f12007c = eVar;
                if (f11993f.mo14622a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f11996b;
                }
            } while (eVar != e.f12004d);
        }
        m14609g(runnable, executor);
    }

    /* JADX INFO: renamed from: b */
    protected void m14616b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        c cVar;
        Object obj = this.f11995a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f11991d) {
            cVar = new c(z7, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z7 ? c.f11998c : c.f11999d;
        }
        AbstractC2911a abstractC2911a = this;
        boolean z8 = false;
        while (true) {
            if (f11993f.mo14623b(abstractC2911a, obj, cVar)) {
                if (z7) {
                    abstractC2911a.m14617k();
                }
                m14608f(abstractC2911a);
                if (obj instanceof g) {
                    InterfaceFutureC1673e interfaceFutureC1673e = ((g) obj).f12014b;
                    if (interfaceFutureC1673e instanceof AbstractC2911a) {
                        abstractC2911a = (AbstractC2911a) interfaceFutureC1673e;
                        obj = abstractC2911a.f11995a;
                        if ((obj == null) | (obj instanceof g)) {
                            z8 = true;
                        }
                    } else {
                        interfaceFutureC1673e.cancel(z7);
                    }
                }
                return true;
            }
            obj = abstractC2911a.f11995a;
            if (!(obj instanceof g)) {
                return z8;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f11995a;
        if ((obj != null) && (!(obj instanceof g))) {
            return m14610h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f11997c;
            if (iVar != i.f12015c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.m14627a(iVar);
                    if (f11993f.mo14624c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m14614n(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f11995a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m14610h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m14614n(iVar2);
                        break;
                    }
                    iVar = this.f11997c;
                    if (iVar == i.f12015c) {
                    }
                }
            }
            return m14610h(this.f11995a);
        }
        while (nanos > 0) {
            Object obj3 = this.f11995a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m14610h(obj3);
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
        return this.f11995a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f11995a;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* JADX INFO: renamed from: k */
    protected void m14617k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    protected String m14618l() {
        Object obj = this.f11995a;
        if (obj instanceof g) {
            return "setFuture=[" + m14615r(((g) obj).f12014b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: o */
    protected boolean mo14619o(Object obj) {
        if (obj == null) {
            obj = f11994r;
        }
        if (!f11993f.mo14623b(this, null, obj)) {
            return false;
        }
        m14608f(this);
        return true;
    }

    /* JADX INFO: renamed from: p */
    protected boolean mo14620p(Throwable th) {
        if (!f11993f.mo14623b(this, null, new d((Throwable) m14606d(th)))) {
            return false;
        }
        m14608f(this);
        return true;
    }

    /* JADX INFO: renamed from: q */
    protected boolean mo14621q(InterfaceFutureC1673e interfaceFutureC1673e) {
        d dVar;
        m14606d(interfaceFutureC1673e);
        Object obj = this.f11995a;
        if (obj == null) {
            if (interfaceFutureC1673e.isDone()) {
                if (!f11993f.mo14623b(this, null, m14611i(interfaceFutureC1673e))) {
                    return false;
                }
                m14608f(this);
                return true;
            }
            g gVar = new g(this, interfaceFutureC1673e);
            if (f11993f.mo14623b(this, null, gVar)) {
                try {
                    interfaceFutureC1673e.addListener(gVar, EnumC2912b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f12002b;
                    }
                    f11993f.mo14623b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f11995a;
        }
        if (obj instanceof c) {
            interfaceFutureC1673e.cancel(((c) obj).f12000a);
        }
        return false;
    }

    public String toString() {
        String strM14618l;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m14604a(sb);
        } else {
            try {
                strM14618l = m14618l();
            } catch (RuntimeException e7) {
                strM14618l = "Exception thrown from implementation: " + e7.getClass();
            }
            if (strM14618l != null && !strM14618l.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM14618l);
                sb.append("]");
            } else if (isDone()) {
                m14604a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f11995a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return m14610h(obj2);
            }
            i iVar = this.f11997c;
            if (iVar != i.f12015c) {
                i iVar2 = new i();
                do {
                    iVar2.m14627a(iVar);
                    if (f11993f.mo14624c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f11995a;
                            } else {
                                m14614n(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return m14610h(obj);
                    }
                    iVar = this.f11997c;
                } while (iVar != i.f12015c);
            }
            return m14610h(this.f11995a);
        }
        throw new InterruptedException();
    }
}

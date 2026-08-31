package p072I6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;

/* JADX INFO: renamed from: I6.c */
/* JADX INFO: loaded from: classes.dex */
public class C0646c extends C0641C {

    /* JADX INFO: renamed from: i */
    public static final a f2538i = new a(null);

    /* JADX INFO: renamed from: j */
    private static final ReentrantLock f2539j;

    /* JADX INFO: renamed from: k */
    private static final Condition f2540k;

    /* JADX INFO: renamed from: l */
    private static final long f2541l;

    /* JADX INFO: renamed from: m */
    private static final long f2542m;

    /* JADX INFO: renamed from: n */
    private static C0646c f2543n;

    /* JADX INFO: renamed from: f */
    private boolean f2544f;

    /* JADX INFO: renamed from: g */
    private C0646c f2545g;

    /* JADX INFO: renamed from: h */
    private long f2546h;

    /* JADX INFO: renamed from: I6.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final boolean m2998d(C0646c c0646c) {
            ReentrantLock reentrantLockM3002f = C0646c.f2538i.m3002f();
            reentrantLockM3002f.lock();
            try {
                if (!c0646c.f2544f) {
                    return false;
                }
                c0646c.f2544f = false;
                for (C0646c c0646c2 = C0646c.f2543n; c0646c2 != null; c0646c2 = c0646c2.f2545g) {
                    if (c0646c2.f2545g == c0646c) {
                        c0646c2.f2545g = c0646c.f2545g;
                        c0646c.f2545g = null;
                        return false;
                    }
                }
                return true;
            } finally {
                reentrantLockM3002f.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public final void m2999g(C0646c c0646c, long j7, boolean z7) {
            ReentrantLock reentrantLockM3002f = C0646c.f2538i.m3002f();
            reentrantLockM3002f.lock();
            try {
                if (c0646c.f2544f) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                c0646c.f2544f = true;
                if (C0646c.f2543n == null) {
                    C0646c.f2543n = new C0646c();
                    new b().start();
                }
                long jNanoTime = System.nanoTime();
                if (j7 != 0 && z7) {
                    c0646c.f2546h = Math.min(j7, c0646c.mo2952c() - jNanoTime) + jNanoTime;
                } else if (j7 != 0) {
                    c0646c.f2546h = j7 + jNanoTime;
                } else {
                    if (!z7) {
                        throw new AssertionError();
                    }
                    c0646c.f2546h = c0646c.mo2952c();
                }
                long jM2990z = c0646c.m2990z(jNanoTime);
                C0646c c0646c2 = C0646c.f2543n;
                AbstractC6118n.m27184b(c0646c2);
                while (c0646c2.f2545g != null) {
                    C0646c c0646c3 = c0646c2.f2545g;
                    AbstractC6118n.m27184b(c0646c3);
                    if (jM2990z < c0646c3.m2990z(jNanoTime)) {
                        break;
                    }
                    c0646c2 = c0646c2.f2545g;
                    AbstractC6118n.m27184b(c0646c2);
                }
                c0646c.f2545g = c0646c2.f2545g;
                c0646c2.f2545g = c0646c;
                if (c0646c2 == C0646c.f2543n) {
                    C0646c.f2538i.m3001e().signal();
                }
                C1444v c1444v = C1444v.f4971a;
                reentrantLockM3002f.unlock();
            } catch (Throwable th) {
                reentrantLockM3002f.unlock();
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public final C0646c m3000c() throws InterruptedException {
            C0646c c0646c = C0646c.f2543n;
            AbstractC6118n.m27184b(c0646c);
            C0646c c0646c2 = c0646c.f2545g;
            if (c0646c2 == null) {
                long jNanoTime = System.nanoTime();
                m3001e().await(C0646c.f2541l, TimeUnit.MILLISECONDS);
                C0646c c0646c3 = C0646c.f2543n;
                AbstractC6118n.m27184b(c0646c3);
                if (c0646c3.f2545g != null || System.nanoTime() - jNanoTime < C0646c.f2542m) {
                    return null;
                }
                return C0646c.f2543n;
            }
            long jM2990z = c0646c2.m2990z(System.nanoTime());
            if (jM2990z > 0) {
                m3001e().await(jM2990z, TimeUnit.NANOSECONDS);
                return null;
            }
            C0646c c0646c4 = C0646c.f2543n;
            AbstractC6118n.m27184b(c0646c4);
            c0646c4.f2545g = c0646c2.f2545g;
            c0646c2.f2545g = null;
            return c0646c2;
        }

        /* JADX INFO: renamed from: e */
        public final Condition m3001e() {
            return C0646c.f2540k;
        }

        /* JADX INFO: renamed from: f */
        public final ReentrantLock m3002f() {
            return C0646c.f2539j;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: I6.c$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    a aVar = C0646c.f2538i;
                    ReentrantLock reentrantLockM3002f = aVar.m3002f();
                    reentrantLockM3002f.lock();
                    try {
                        C0646c c0646cM3000c = aVar.m3000c();
                        if (c0646cM3000c == C0646c.f2543n) {
                            C0646c.f2543n = null;
                            reentrantLockM3002f.unlock();
                            return;
                        } else {
                            C1444v c1444v = C1444v.f4971a;
                            reentrantLockM3002f.unlock();
                            if (c0646cM3000c != null) {
                                c0646cM3000c.mo2946C();
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLockM3002f.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: I6.c$c */
    public static final class c implements InterfaceC0669z {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC0669z f2548b;

        c(InterfaceC0669z interfaceC0669z) {
            this.f2548b = interfaceC0669z;
        }

        @Override // p072I6.InterfaceC0669z
        /* JADX INFO: renamed from: I */
        public void mo3003I(C0648e source, long j7) throws IOException {
            AbstractC6118n.m27187e(source, "source");
            AbstractC0645b.m2968b(source.m3046h1(), 0L, j7);
            while (true) {
                long j8 = 0;
                if (j7 <= 0) {
                    return;
                }
                C0666w c0666w = source.f2551a;
                AbstractC6118n.m27184b(c0666w);
                while (j8 < 65536) {
                    j8 += (long) (c0666w.f2600c - c0666w.f2599b);
                    if (j8 >= j7) {
                        j8 = j7;
                        break;
                    } else {
                        c0666w = c0666w.f2603f;
                        AbstractC6118n.m27184b(c0666w);
                    }
                }
                C0646c c0646c = C0646c.this;
                InterfaceC0669z interfaceC0669z = this.f2548b;
                c0646c.m2994w();
                try {
                    try {
                        interfaceC0669z.mo3003I(source, j8);
                        C1444v c1444v = C1444v.f4971a;
                        if (c0646c.m2995x()) {
                            throw c0646c.m2993q(null);
                        }
                        j7 -= j8;
                    } catch (IOException e7) {
                        if (!c0646c.m2995x()) {
                            throw e7;
                        }
                        throw c0646c.m2993q(e7);
                    }
                } catch (Throwable th) {
                    c0646c.m2995x();
                    throw th;
                }
            }
        }

        @Override // p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0646c c0646c = C0646c.this;
            InterfaceC0669z interfaceC0669z = this.f2548b;
            c0646c.m2994w();
            try {
                try {
                    interfaceC0669z.close();
                    C1444v c1444v = C1444v.f4971a;
                    if (c0646c.m2995x()) {
                        throw c0646c.m2993q(null);
                    }
                } catch (IOException e7) {
                    if (!c0646c.m2995x()) {
                        throw e7;
                    }
                    throw c0646c.m2993q(e7);
                }
            } catch (Throwable th) {
                c0646c.m2995x();
                throw th;
            }
        }

        @Override // p072I6.InterfaceC0669z
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C0646c mo3005g() {
            return C0646c.this;
        }

        @Override // p072I6.InterfaceC0669z, java.io.Flushable
        public void flush() throws IOException {
            C0646c c0646c = C0646c.this;
            InterfaceC0669z interfaceC0669z = this.f2548b;
            c0646c.m2994w();
            try {
                try {
                    interfaceC0669z.flush();
                    C1444v c1444v = C1444v.f4971a;
                    if (c0646c.m2995x()) {
                        throw c0646c.m2993q(null);
                    }
                } catch (IOException e7) {
                    if (!c0646c.m2995x()) {
                        throw e7;
                    }
                    throw c0646c.m2993q(e7);
                }
            } catch (Throwable th) {
                c0646c.m2995x();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f2548b + ')';
        }
    }

    /* JADX INFO: renamed from: I6.c$d */
    public static final class d implements InterfaceC0640B {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC0640B f2550b;

        d(InterfaceC0640B interfaceC0640B) {
            this.f2550b = interfaceC0640B;
        }

        @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0646c c0646c = C0646c.this;
            InterfaceC0640B interfaceC0640B = this.f2550b;
            c0646c.m2994w();
            try {
                try {
                    interfaceC0640B.close();
                    C1444v c1444v = C1444v.f4971a;
                    if (c0646c.m2995x()) {
                        throw c0646c.m2993q(null);
                    }
                } catch (IOException e7) {
                    if (!c0646c.m2995x()) {
                        throw e7;
                    }
                    throw c0646c.m2993q(e7);
                }
            } catch (Throwable th) {
                c0646c.m2995x();
                throw th;
            }
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C0646c mo2948g() {
            return C0646c.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f2550b + ')';
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: w */
        public long mo2949w(C0648e sink, long j7) throws IOException {
            AbstractC6118n.m27187e(sink, "sink");
            C0646c c0646c = C0646c.this;
            InterfaceC0640B interfaceC0640B = this.f2550b;
            c0646c.m2994w();
            try {
                try {
                    long jMo2949w = interfaceC0640B.mo2949w(sink, j7);
                    if (c0646c.m2995x()) {
                        throw c0646c.m2993q(null);
                    }
                    return jMo2949w;
                } catch (IOException e7) {
                    if (c0646c.m2995x()) {
                        throw c0646c.m2993q(e7);
                    }
                    throw e7;
                }
            } catch (Throwable th) {
                c0646c.m2995x();
                throw th;
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f2539j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC6118n.m27186d(conditionNewCondition, "newCondition(...)");
        f2540k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f2541l = millis;
        f2542m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final long m2990z(long j7) {
        return this.f2546h - j7;
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC0669z m2991A(InterfaceC0669z sink) {
        AbstractC6118n.m27187e(sink, "sink");
        return new c(sink);
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC0640B m2992B(InterfaceC0640B source) {
        AbstractC6118n.m27187e(source, "source");
        return new d(source);
    }

    /* JADX INFO: renamed from: C */
    protected void mo2946C() {
    }

    /* JADX INFO: renamed from: q */
    public final IOException m2993q(IOException iOException) {
        return mo2947y(iOException);
    }

    /* JADX INFO: renamed from: w */
    public final void m2994w() {
        long jMo2957h = mo2957h();
        boolean zMo2954e = mo2954e();
        if (jMo2957h != 0 || zMo2954e) {
            f2538i.m2999g(this, jMo2957h, zMo2954e);
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m2995x() {
        return f2538i.m2998d(this);
    }

    /* JADX INFO: renamed from: y */
    protected IOException mo2947y(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}

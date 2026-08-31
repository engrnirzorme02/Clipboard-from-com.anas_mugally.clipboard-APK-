package p376v6;

import com.google.android.gms.common.api.C3553a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6099B;
import p145S5.C1434l;
import p145S5.C1444v;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;
import p278j6.AbstractC5905g;
import p318o6.AbstractC6633S;
import p318o6.AbstractC6655c;
import p360t6.C7104D;
import p360t6.C7141y;

/* JADX INFO: renamed from: v6.a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC7263a implements Executor, Closeable {

    /* JADX INFO: renamed from: s */
    public static final a f29046s = new a(null);

    /* JADX INFO: renamed from: t */
    private static final /* synthetic */ AtomicLongFieldUpdater f29047t = AtomicLongFieldUpdater.newUpdater(ExecutorC7263a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: u */
    private static final /* synthetic */ AtomicLongFieldUpdater f29048u = AtomicLongFieldUpdater.newUpdater(ExecutorC7263a.class, "controlState$volatile");

    /* JADX INFO: renamed from: v */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29049v = AtomicIntegerFieldUpdater.newUpdater(ExecutorC7263a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: w */
    public static final C7104D f29050w = new C7104D("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a */
    public final int f29051a;

    /* JADX INFO: renamed from: b */
    public final int f29052b;

    /* JADX INFO: renamed from: c */
    public final long f29053c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d */
    public final String f29054d;

    /* JADX INFO: renamed from: e */
    public final C7266d f29055e;

    /* JADX INFO: renamed from: f */
    public final C7266d f29056f;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: r */
    public final C7141y f29057r;

    /* JADX INFO: renamed from: v6.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: v6.a$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29058a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f29058a = iArr;
        }
    }

    /* JADX INFO: renamed from: v6.a$d */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: r */
        private static final /* synthetic */ InterfaceC2059a f29074r = AbstractC2060b.m8524a(m32235c());
    }

    public ExecutorC7263a(int i7, int i8, long j7, String str) {
        this.f29051a = i7;
        this.f29052b = i8;
        this.f29053c = j7;
        this.f29054d = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i7 + " should be at least 1").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should be greater than or equals to core pool size " + i7).toString());
        }
        if (i8 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j7 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j7 + " must be positive").toString());
        }
        this.f29055e = new C7266d();
        this.f29056f = new C7266d();
        this.f29057r = new C7141y((i7 + 1) * 2);
        this.controlState$volatile = ((long) i7) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX INFO: renamed from: K0 */
    private final int m32193K0(c cVar) {
        Object objM32230g = cVar.m32230g();
        while (objM32230g != f29050w) {
            if (objM32230g == null) {
                return 0;
            }
            c cVar2 = (c) objM32230g;
            int iM32229f = cVar2.m32229f();
            if (iM32229f != 0) {
                return iM32229f;
            }
            objM32230g = cVar2.m32230g();
        }
        return -1;
    }

    /* JADX INFO: renamed from: Q */
    private final c m32194Q() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !AbstractC6118n.m27183a(ExecutorC7263a.this, this)) {
            return null;
        }
        return cVar;
    }

    /* JADX INFO: renamed from: Q0 */
    private final c m32195Q0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29047t;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f29057r.m31519b((int) (2097151 & j7));
            if (cVar == null) {
                return null;
            }
            long j8 = (2097152 + j7) & (-2097152);
            int iM32193K0 = m32193K0(cVar);
            if (iM32193K0 >= 0 && f29047t.compareAndSet(this, j7, ((long) iM32193K0) | j8)) {
                cVar.m32233o(f29050w);
                return cVar;
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    private final void m32196V0(long j7, boolean z7) {
        if (z7 || m32200a1() || m32198Y0(j7)) {
            return;
        }
        m32200a1();
    }

    /* JADX INFO: renamed from: X0 */
    private final AbstractRunnableC7270h m32197X0(c cVar, AbstractRunnableC7270h abstractRunnableC7270h, boolean z7) {
        d dVar;
        if (cVar == null || (dVar = cVar.f29062c) == d.TERMINATED) {
            return abstractRunnableC7270h;
        }
        if (!abstractRunnableC7270h.f29085b && dVar == d.BLOCKING) {
            return abstractRunnableC7270h;
        }
        cVar.f29066r = true;
        return cVar.f29060a.m32255a(abstractRunnableC7270h, z7);
    }

    /* JADX INFO: renamed from: Y0 */
    private final boolean m32198Y0(long j7) {
        if (AbstractC5905g.m26654b(((int) (2097151 & j7)) - ((int) ((j7 & 4398044413952L) >> 21)), 0) < this.f29051a) {
            int iM32207x = m32207x();
            if (iM32207x == 1 && this.f29051a > 1) {
                m32207x();
            }
            if (iM32207x > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Z0 */
    static /* synthetic */ boolean m32199Z0(ExecutorC7263a executorC7263a, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = f29048u.get(executorC7263a);
        }
        return executorC7263a.m32198Y0(j7);
    }

    /* JADX INFO: renamed from: a1 */
    private final boolean m32200a1() {
        c cVarM32195Q0;
        do {
            cVarM32195Q0 = m32195Q0();
            if (cVarM32195Q0 == null) {
                return false;
            }
        } while (!c.f29059t.compareAndSet(cVarM32195Q0, -1, 0));
        LockSupport.unpark(cVarM32195Q0);
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m32201k0(ExecutorC7263a executorC7263a, Runnable runnable, boolean z7, boolean z8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        if ((i7 & 4) != 0) {
            z8 = false;
        }
        executorC7263a.m32214d0(runnable, z7, z8);
    }

    /* JADX INFO: renamed from: n */
    private final boolean m32203n(AbstractRunnableC7270h abstractRunnableC7270h) {
        return abstractRunnableC7270h.f29085b ? this.f29056f.m31487a(abstractRunnableC7270h) : this.f29055e.m31487a(abstractRunnableC7270h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m32204o0() {
        return f29048u;
    }

    /* JADX INFO: renamed from: x */
    private final int m32207x() {
        synchronized (this.f29057r) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j7 = f29048u.get(this);
                int i7 = (int) (j7 & 2097151);
                int iB = AbstractC5905g.m26654b(i7 - ((int) ((j7 & 4398044413952L) >> 21)), 0);
                if (iB >= this.f29051a) {
                    return 0;
                }
                if (i7 >= this.f29052b) {
                    return 0;
                }
                int i8 = ((int) (m32204o0().get(this) & 2097151)) + 1;
                if (i8 <= 0 || this.f29057r.m31519b(i8) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i8);
                this.f29057r.m31520c(i8, cVar);
                if (i8 != ((int) (2097151 & f29048u.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i9 = iB + 1;
                cVar.start();
                return i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final AbstractRunnableC7270h m32208J(Runnable runnable, boolean z7) {
        long jMo32236a = AbstractC7272j.f29092f.mo32236a();
        if (!(runnable instanceof AbstractRunnableC7270h)) {
            return AbstractC7272j.m32240b(runnable, jMo32236a, z7);
        }
        AbstractRunnableC7270h abstractRunnableC7270h = (AbstractRunnableC7270h) runnable;
        abstractRunnableC7270h.f29084a = jMo32236a;
        abstractRunnableC7270h.f29085b = z7;
        return abstractRunnableC7270h;
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m32209R0(c cVar) {
        long j7;
        int iM32229f;
        if (cVar.m32230g() != f29050w) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29047t;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            iM32229f = cVar.m32229f();
            cVar.m32233o(this.f29057r.m31519b((int) (2097151 & j7)));
        } while (!f29047t.compareAndSet(this, j7, ((2097152 + j7) & (-2097152)) | ((long) iM32229f)));
        return true;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m32210S0(c cVar, int i7, int i8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29047t;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            int iM32193K0 = (int) (2097151 & j7);
            long j8 = (2097152 + j7) & (-2097152);
            if (iM32193K0 == i7) {
                iM32193K0 = i8 == 0 ? m32193K0(cVar) : i8;
            }
            if (iM32193K0 >= 0) {
                if (f29047t.compareAndSet(this, j7, j8 | ((long) iM32193K0))) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m32211T0(AbstractRunnableC7270h abstractRunnableC7270h) {
        try {
            abstractRunnableC7270h.run();
            AbstractC6655c.m28161a();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractC6655c.m28161a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX INFO: renamed from: U0 */
    public final void m32212U0(long j7) throws InterruptedException {
        int i7;
        AbstractRunnableC7270h abstractRunnableC7270hM32228e;
        if (f29049v.compareAndSet(this, 0, 1)) {
            c cVarM32194Q = m32194Q();
            synchronized (this.f29057r) {
                i7 = (int) (m32204o0().get(this) & 2097151);
            }
            if (1 <= i7) {
                int i8 = 1;
                while (true) {
                    Object objM31519b = this.f29057r.m31519b(i8);
                    AbstractC6118n.m27184b(objM31519b);
                    c cVar = (c) objM31519b;
                    if (cVar != cVarM32194Q) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j7);
                        }
                        cVar.f29060a.m32257j(this.f29056f);
                    }
                    if (i8 == i7) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f29056f.m31488b();
            this.f29055e.m31488b();
            while (true) {
                if (cVarM32194Q == null) {
                    abstractRunnableC7270hM32228e = (AbstractRunnableC7270h) this.f29055e.m31490e();
                    if (abstractRunnableC7270hM32228e == null && (abstractRunnableC7270hM32228e = (AbstractRunnableC7270h) this.f29056f.m31490e()) == null) {
                        break;
                    }
                } else {
                    abstractRunnableC7270hM32228e = cVarM32194Q.m32228e(true);
                    if (abstractRunnableC7270hM32228e == null) {
                        abstractRunnableC7270hM32228e = (AbstractRunnableC7270h) this.f29055e.m31490e();
                        if (abstractRunnableC7270hM32228e == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                m32211T0(abstractRunnableC7270hM32228e);
            }
            if (cVarM32194Q != null) {
                cVarM32194Q.m32234r(d.TERMINATED);
            }
            f29047t.set(this, 0L);
            f29048u.set(this, 0L);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m32213W0() {
        if (m32200a1() || m32199Z0(this, 0L, 1, null)) {
            return;
        }
        m32200a1();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m32212U0(10000L);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m32214d0(Runnable runnable, boolean z7, boolean z8) {
        AbstractC6655c.m28161a();
        AbstractRunnableC7270h abstractRunnableC7270hM32208J = m32208J(runnable, z7);
        boolean z9 = abstractRunnableC7270hM32208J.f29085b;
        long jAddAndGet = z9 ? f29048u.addAndGet(this, 2097152L) : 0L;
        c cVarM32194Q = m32194Q();
        AbstractRunnableC7270h abstractRunnableC7270hM32197X0 = m32197X0(cVarM32194Q, abstractRunnableC7270hM32208J, z8);
        if (abstractRunnableC7270hM32197X0 != null && !m32203n(abstractRunnableC7270hM32197X0)) {
            throw new RejectedExecutionException(this.f29054d + " was terminated");
        }
        boolean z10 = z8 && cVarM32194Q != null;
        if (z9) {
            m32196V0(jAddAndGet, z10);
        } else {
            if (z10) {
                return;
            }
            m32213W0();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m32201k0(this, runnable, false, false, 6, null);
    }

    public final boolean isTerminated() {
        return f29049v.get(this) != 0;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM31518a = this.f29057r.m31518a();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < iM31518a; i12++) {
            c cVar = (c) this.f29057r.m31519b(i12);
            if (cVar != null) {
                int iM32256i = cVar.f29060a.m32256i();
                int i13 = b.f29058a[cVar.f29062c.ordinal()];
                if (i13 == 1) {
                    i9++;
                } else if (i13 == 2) {
                    i8++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM32256i);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i13 == 3) {
                    i7++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM32256i);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i13 == 4) {
                    i10++;
                    if (iM32256i > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM32256i);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i13 != 5) {
                        throw new C1434l();
                    }
                    i11++;
                }
            }
        }
        long j7 = f29048u.get(this);
        return this.f29054d + '@' + AbstractC6633S.m28109b(this) + "[Pool Size {core = " + this.f29051a + ", max = " + this.f29052b + "}, Worker States {CPU = " + i7 + ", blocking = " + i8 + ", parked = " + i9 + ", dormant = " + i10 + ", terminated = " + i11 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f29055e.m31489c() + ", global blocking queue size = " + this.f29056f.m31489c() + ", Control State {created workers= " + ((int) (2097151 & j7)) + ", blocking tasks = " + ((int) ((4398044413952L & j7) >> 21)) + ", CPUs acquired = " + (this.f29051a - ((int) ((9223367638808264704L & j7) >> 42))) + "}]";
    }

    /* JADX INFO: renamed from: v6.a$c */
    public final class c extends Thread {

        /* JADX INFO: renamed from: t */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f29059t = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a */
        public final C7274l f29060a;

        /* JADX INFO: renamed from: b */
        private final C6099B f29061b;

        /* JADX INFO: renamed from: c */
        public d f29062c;

        /* JADX INFO: renamed from: d */
        private long f29063d;

        /* JADX INFO: renamed from: e */
        private long f29064e;

        /* JADX INFO: renamed from: f */
        private int f29065f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* JADX INFO: renamed from: r */
        public boolean f29066r;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(ExecutorC7263a.this.getClass().getClassLoader());
            this.f29060a = new C7274l();
            this.f29061b = new C6099B();
            this.f29062c = d.DORMANT;
            this.nextParkedWorker = ExecutorC7263a.f29050w;
            int iNanoTime = (int) System.nanoTime();
            this.f29065f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        /* JADX INFO: renamed from: b */
        private final void m32216b(AbstractRunnableC7270h abstractRunnableC7270h) {
            this.f29063d = 0L;
            if (this.f29062c == d.PARKING) {
                this.f29062c = d.BLOCKING;
            }
            if (!abstractRunnableC7270h.f29085b) {
                ExecutorC7263a.this.m32211T0(abstractRunnableC7270h);
                return;
            }
            if (m32234r(d.BLOCKING)) {
                ExecutorC7263a.this.m32213W0();
            }
            ExecutorC7263a.this.m32211T0(abstractRunnableC7270h);
            ExecutorC7263a.m32204o0().addAndGet(ExecutorC7263a.this, -2097152L);
            if (this.f29062c != d.TERMINATED) {
                this.f29062c = d.DORMANT;
            }
        }

        /* JADX INFO: renamed from: c */
        private final AbstractRunnableC7270h m32217c(boolean z7) {
            AbstractRunnableC7270h abstractRunnableC7270hM32222l;
            AbstractRunnableC7270h abstractRunnableC7270hM32222l2;
            if (z7) {
                boolean z8 = m32231j(ExecutorC7263a.this.f29051a * 2) == 0;
                if (z8 && (abstractRunnableC7270hM32222l2 = m32222l()) != null) {
                    return abstractRunnableC7270hM32222l2;
                }
                AbstractRunnableC7270h abstractRunnableC7270hM32258k = this.f29060a.m32258k();
                if (abstractRunnableC7270hM32258k != null) {
                    return abstractRunnableC7270hM32258k;
                }
                if (!z8 && (abstractRunnableC7270hM32222l = m32222l()) != null) {
                    return abstractRunnableC7270hM32222l;
                }
            } else {
                AbstractRunnableC7270h abstractRunnableC7270hM32222l3 = m32222l();
                if (abstractRunnableC7270hM32222l3 != null) {
                    return abstractRunnableC7270hM32222l3;
                }
            }
            return m32226s(3);
        }

        /* JADX INFO: renamed from: d */
        private final AbstractRunnableC7270h m32218d() {
            AbstractRunnableC7270h abstractRunnableC7270hM32259l = this.f29060a.m32259l();
            if (abstractRunnableC7270hM32259l != null) {
                return abstractRunnableC7270hM32259l;
            }
            AbstractRunnableC7270h abstractRunnableC7270h = (AbstractRunnableC7270h) ExecutorC7263a.this.f29056f.m31490e();
            return abstractRunnableC7270h == null ? m32226s(1) : abstractRunnableC7270h;
        }

        /* JADX INFO: renamed from: i */
        private final boolean m32220i() {
            return this.nextParkedWorker != ExecutorC7263a.f29050w;
        }

        /* JADX INFO: renamed from: k */
        private final void m32221k() {
            if (this.f29063d == 0) {
                this.f29063d = System.nanoTime() + ExecutorC7263a.this.f29053c;
            }
            LockSupport.parkNanos(ExecutorC7263a.this.f29053c);
            if (System.nanoTime() - this.f29063d >= 0) {
                this.f29063d = 0L;
                m32227t();
            }
        }

        /* JADX INFO: renamed from: l */
        private final AbstractRunnableC7270h m32222l() {
            if (m32231j(2) == 0) {
                AbstractRunnableC7270h abstractRunnableC7270h = (AbstractRunnableC7270h) ExecutorC7263a.this.f29055e.m31490e();
                return abstractRunnableC7270h != null ? abstractRunnableC7270h : (AbstractRunnableC7270h) ExecutorC7263a.this.f29056f.m31490e();
            }
            AbstractRunnableC7270h abstractRunnableC7270h2 = (AbstractRunnableC7270h) ExecutorC7263a.this.f29056f.m31490e();
            return abstractRunnableC7270h2 != null ? abstractRunnableC7270h2 : (AbstractRunnableC7270h) ExecutorC7263a.this.f29055e.m31490e();
        }

        /* JADX INFO: renamed from: m */
        private final void m32223m() {
            loop0: while (true) {
                boolean z7 = false;
                while (true) {
                    if (ExecutorC7263a.this.isTerminated() || this.f29062c == d.TERMINATED) {
                        break loop0;
                    }
                    AbstractRunnableC7270h abstractRunnableC7270hM32228e = m32228e(this.f29066r);
                    if (abstractRunnableC7270hM32228e != null) {
                        this.f29064e = 0L;
                        m32216b(abstractRunnableC7270hM32228e);
                        break;
                    }
                    this.f29066r = false;
                    if (this.f29064e == 0) {
                        m32225q();
                    } else {
                        if (z7) {
                            m32234r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f29064e);
                            this.f29064e = 0L;
                            break;
                        }
                        z7 = true;
                    }
                }
            }
            m32234r(d.TERMINATED);
        }

        /* JADX INFO: renamed from: p */
        private final boolean m32224p() {
            long j7;
            if (this.f29062c == d.CPU_ACQUIRED) {
                return true;
            }
            ExecutorC7263a executorC7263a = ExecutorC7263a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterM32204o0 = ExecutorC7263a.m32204o0();
            do {
                j7 = atomicLongFieldUpdaterM32204o0.get(executorC7263a);
                if (((int) ((9223367638808264704L & j7) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC7263a.m32204o0().compareAndSet(executorC7263a, j7, j7 - 4398046511104L));
            this.f29062c = d.CPU_ACQUIRED;
            return true;
        }

        /* JADX INFO: renamed from: q */
        private final void m32225q() {
            if (!m32220i()) {
                ExecutorC7263a.this.m32209R0(this);
                return;
            }
            f29059t.set(this, -1);
            while (m32220i() && f29059t.get(this) == -1 && !ExecutorC7263a.this.isTerminated() && this.f29062c != d.TERMINATED) {
                m32234r(d.PARKING);
                Thread.interrupted();
                m32221k();
            }
        }

        /* JADX INFO: renamed from: s */
        private final AbstractRunnableC7270h m32226s(int i7) {
            int i8 = (int) (ExecutorC7263a.m32204o0().get(ExecutorC7263a.this) & 2097151);
            if (i8 < 2) {
                return null;
            }
            int iM32231j = m32231j(i8);
            ExecutorC7263a executorC7263a = ExecutorC7263a.this;
            long jMin = Long.MAX_VALUE;
            for (int i9 = 0; i9 < i8; i9++) {
                iM32231j++;
                if (iM32231j > i8) {
                    iM32231j = 1;
                }
                c cVar = (c) executorC7263a.f29057r.m31519b(iM32231j);
                if (cVar != null && cVar != this) {
                    long jM32260r = cVar.f29060a.m32260r(i7, this.f29061b);
                    if (jM32260r == -1) {
                        C6099B c6099b = this.f29061b;
                        AbstractRunnableC7270h abstractRunnableC7270h = (AbstractRunnableC7270h) c6099b.f23859a;
                        c6099b.f23859a = null;
                        return abstractRunnableC7270h;
                    }
                    if (jM32260r > 0) {
                        jMin = Math.min(jMin, jM32260r);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f29064e = jMin;
            return null;
        }

        /* JADX INFO: renamed from: t */
        private final void m32227t() {
            ExecutorC7263a executorC7263a = ExecutorC7263a.this;
            synchronized (executorC7263a.f29057r) {
                try {
                    if (executorC7263a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC7263a.m32204o0().get(executorC7263a) & 2097151)) <= executorC7263a.f29051a) {
                        return;
                    }
                    if (f29059t.compareAndSet(this, -1, 1)) {
                        int i7 = this.indexInArray;
                        m32232n(0);
                        executorC7263a.m32210S0(this, i7, 0);
                        int andDecrement = (int) (ExecutorC7263a.m32204o0().getAndDecrement(executorC7263a) & 2097151);
                        if (andDecrement != i7) {
                            Object objM31519b = executorC7263a.f29057r.m31519b(andDecrement);
                            AbstractC6118n.m27184b(objM31519b);
                            c cVar = (c) objM31519b;
                            executorC7263a.f29057r.m31520c(i7, cVar);
                            cVar.m32232n(i7);
                            executorC7263a.m32210S0(cVar, andDecrement, i7);
                        }
                        executorC7263a.f29057r.m31520c(andDecrement, null);
                        C1444v c1444v = C1444v.f4971a;
                        this.f29062c = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public final AbstractRunnableC7270h m32228e(boolean z7) {
            return m32224p() ? m32217c(z7) : m32218d();
        }

        /* JADX INFO: renamed from: f */
        public final int m32229f() {
            return this.indexInArray;
        }

        /* JADX INFO: renamed from: g */
        public final Object m32230g() {
            return this.nextParkedWorker;
        }

        /* JADX INFO: renamed from: j */
        public final int m32231j(int i7) {
            int i8 = this.f29065f;
            int i9 = i8 ^ (i8 << 13);
            int i10 = i9 ^ (i9 >> 17);
            int i11 = i10 ^ (i10 << 5);
            this.f29065f = i11;
            int i12 = i7 - 1;
            return (i12 & i7) == 0 ? i11 & i12 : (i11 & C3553a.e.API_PRIORITY_OTHER) % i7;
        }

        /* JADX INFO: renamed from: n */
        public final void m32232n(int i7) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC7263a.this.f29054d);
            sb.append("-worker-");
            sb.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
            setName(sb.toString());
            this.indexInArray = i7;
        }

        /* JADX INFO: renamed from: o */
        public final void m32233o(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* JADX INFO: renamed from: r */
        public final boolean m32234r(d dVar) {
            d dVar2 = this.f29062c;
            boolean z7 = dVar2 == d.CPU_ACQUIRED;
            if (z7) {
                ExecutorC7263a.m32204o0().addAndGet(ExecutorC7263a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f29062c = dVar;
            }
            return z7;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m32223m();
        }

        public c(ExecutorC7263a executorC7263a, int i7) {
            this();
            m32232n(i7);
        }
    }
}

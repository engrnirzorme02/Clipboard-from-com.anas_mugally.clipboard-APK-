package p318o6;

import androidx.concurrent.futures.AbstractC2404b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p173W5.InterfaceC1879i;
import p278j6.AbstractC5905g;
import p360t6.C7113M;
import p360t6.C7133q;
import p360t6.InterfaceC7114N;

/* JADX INFO: renamed from: o6.j0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6671j0 extends AbstractC6673k0 implements InterfaceC6643X {

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f24968f = AtomicReferenceFieldUpdater.newUpdater(AbstractC6671j0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: r */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f24969r = AtomicReferenceFieldUpdater.newUpdater(AbstractC6671j0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: s */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f24970s = AtomicIntegerFieldUpdater.newUpdater(AbstractC6671j0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: o6.j0$a */
    private final class a extends c {

        /* JADX INFO: renamed from: c */
        private final InterfaceC6678n f24971c;

        public a(long j7, InterfaceC6678n interfaceC6678n) {
            super(j7);
            this.f24971c = interfaceC6678n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24971c.mo28235c(AbstractC6671j0.this, C1444v.f4971a);
        }

        @Override // p318o6.AbstractC6671j0.c
        public String toString() {
            return super.toString() + this.f24971c;
        }
    }

    /* JADX INFO: renamed from: o6.j0$b */
    private static final class b extends c {

        /* JADX INFO: renamed from: c */
        private final Runnable f24973c;

        public b(long j7, Runnable runnable) {
            super(j7);
            this.f24973c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24973c.run();
        }

        @Override // p318o6.AbstractC6671j0.c
        public String toString() {
            return super.toString() + this.f24973c;
        }
    }

    /* JADX INFO: renamed from: o6.j0$c */
    public static abstract class c implements Runnable, Comparable, InterfaceC6661e0, InterfaceC7114N {
        private volatile Object _heap;

        /* JADX INFO: renamed from: a */
        public long f24974a;

        /* JADX INFO: renamed from: b */
        private int f24975b = -1;

        public c(long j7) {
            this.f24974a = j7;
        }

        @Override // p360t6.InterfaceC7114N
        /* JADX INFO: renamed from: c */
        public int mo28217c() {
            return this.f24975b;
        }

        @Override // p360t6.InterfaceC7114N
        /* JADX INFO: renamed from: h */
        public C7113M mo28218h() {
            Object obj = this._heap;
            if (obj instanceof C7113M) {
                return (C7113M) obj;
            }
            return null;
        }

        @Override // p360t6.InterfaceC7114N
        /* JADX INFO: renamed from: j */
        public void mo28219j(int i7) {
            this.f24975b = i7;
        }

        @Override // p318o6.InterfaceC6661e0
        /* JADX INFO: renamed from: k */
        public final void mo7954k() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC6677m0.f24979a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.m31423h(this);
                    }
                    this._heap = AbstractC6677m0.f24979a;
                    C1444v c1444v = C1444v.f4971a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p360t6.InterfaceC7114N
        /* JADX INFO: renamed from: m */
        public void mo28220m(C7113M c7113m) {
            if (this._heap == AbstractC6677m0.f24979a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = c7113m;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j7 = this.f24974a - cVar.f24974a;
            if (j7 > 0) {
                return 1;
            }
            return j7 < 0 ? -1 : 0;
        }

        /* JADX INFO: renamed from: o */
        public final int m28222o(long j7, d dVar, AbstractC6671j0 abstractC6671j0) {
            synchronized (this) {
                if (this._heap == AbstractC6677m0.f24979a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.m31419b();
                        if (abstractC6671j0.isCompleted()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f24976c = j7;
                        } else {
                            long j8 = cVar.f24974a;
                            if (j8 - j7 < 0) {
                                j7 = j8;
                            }
                            if (j7 - dVar.f24976c > 0) {
                                dVar.f24976c = j7;
                            }
                        }
                        long j9 = this.f24974a;
                        long j10 = dVar.f24976c;
                        if (j9 - j10 < 0) {
                            this.f24974a = j10;
                        }
                        dVar.m31418a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public final boolean m28223p(long j7) {
            return j7 - this.f24974a >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f24974a + ']';
        }
    }

    /* JADX INFO: renamed from: o6.j0$d */
    public static final class d extends C7113M {

        /* JADX INFO: renamed from: c */
        public long f24976c;

        public d(long j7) {
            this.f24976c = j7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return f24970s.get(this) != 0;
    }

    /* JADX INFO: renamed from: k1 */
    private final void m28202k1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24968f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (AbstractC2404b.m10339a(f24968f, this, null, AbstractC6677m0.f24980b)) {
                    return;
                }
            } else if (obj instanceof C7133q) {
                ((C7133q) obj).m31500d();
                return;
            } else {
                if (obj == AbstractC6677m0.f24980b) {
                    return;
                }
                C7133q c7133q = new C7133q(8, true);
                AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c7133q.m31499a((Runnable) obj);
                if (AbstractC2404b.m10339a(f24968f, this, obj, c7133q)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l1 */
    private final Runnable m28203l1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24968f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C7133q) {
                AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C7133q c7133q = (C7133q) obj;
                Object objM31504m = c7133q.m31504m();
                if (objM31504m != C7133q.f28437h) {
                    return (Runnable) objM31504m;
                }
                AbstractC2404b.m10339a(f24968f, this, obj, c7133q.m31503l());
            } else {
                if (obj == AbstractC6677m0.f24980b) {
                    return null;
                }
                if (AbstractC2404b.m10339a(f24968f, this, obj, null)) {
                    AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n1 */
    private final void m28204n1() {
        InterfaceC7114N interfaceC7114NM31424i;
        d dVar = (d) f24969r.get(this);
        if (dVar == null || dVar.m31421e()) {
            return;
        }
        AbstractC6655c.m28161a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    InterfaceC7114N interfaceC7114NM31419b = dVar.m31419b();
                    interfaceC7114NM31424i = null;
                    if (interfaceC7114NM31419b != null) {
                        c cVar = (c) interfaceC7114NM31419b;
                        interfaceC7114NM31424i = cVar.m28223p(jNanoTime) ? m28205o1(cVar) : false ? dVar.m31424i(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((c) interfaceC7114NM31424i) != null);
    }

    /* JADX INFO: renamed from: o1 */
    private final boolean m28205o1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24968f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC2404b.m10339a(f24968f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C7133q) {
                AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C7133q c7133q = (C7133q) obj;
                int iM31499a = c7133q.m31499a(runnable);
                if (iM31499a == 0) {
                    return true;
                }
                if (iM31499a == 1) {
                    AbstractC2404b.m10339a(f24968f, this, obj, c7133q.m31503l());
                } else if (iM31499a == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC6677m0.f24980b) {
                    return false;
                }
                C7133q c7133q2 = new C7133q(8, true);
                AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c7133q2.m31499a((Runnable) obj);
                c7133q2.m31499a(runnable);
                if (AbstractC2404b.m10339a(f24968f, this, obj, c7133q2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    private final void m28209t1() {
        c cVar;
        AbstractC6655c.m28161a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f24969r.get(this);
            if (dVar == null || (cVar = (c) dVar.m31425j()) == null) {
                return;
            } else {
                mo28120h1(jNanoTime, cVar);
            }
        }
    }

    /* JADX INFO: renamed from: w1 */
    private final int m28210w1(long j7, c cVar) {
        if (isCompleted()) {
            return 1;
        }
        d dVar = (d) f24969r.get(this);
        if (dVar == null) {
            AbstractC2404b.m10339a(f24969r, this, null, new d(j7));
            Object obj = f24969r.get(this);
            AbstractC6118n.m27184b(obj);
            dVar = (d) obj;
        }
        return cVar.m28222o(j7, dVar, this);
    }

    /* JADX INFO: renamed from: y1 */
    private final void m28211y1(boolean z7) {
        f24970s.set(this, z7 ? 1 : 0);
    }

    /* JADX INFO: renamed from: z1 */
    private final boolean m28212z1(c cVar) {
        d dVar = (d) f24969r.get(this);
        return (dVar != null ? (c) dVar.m31422f() : null) == cVar;
    }

    @Override // p318o6.InterfaceC6643X
    /* JADX INFO: renamed from: Q */
    public void mo28132Q(long j7, InterfaceC6678n interfaceC6678n) {
        long jM28233c = AbstractC6677m0.m28233c(j7);
        if (jM28233c < 4611686018427387903L) {
            AbstractC6655c.m28161a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jM28233c + jNanoTime, interfaceC6678n);
            m28215v1(jNanoTime, aVar);
            AbstractC6686r.m28280a(interfaceC6678n, aVar);
        }
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: Q0 */
    public final void mo28090Q0(InterfaceC1879i interfaceC1879i, Runnable runnable) {
        mo28122m1(runnable);
    }

    @Override // p318o6.AbstractC6669i0
    /* JADX INFO: renamed from: Y0 */
    protected long mo28192Y0() {
        c cVar;
        if (super.mo28192Y0() == 0) {
            return 0L;
        }
        Object obj = f24968f.get(this);
        if (obj != null) {
            if (!(obj instanceof C7133q)) {
                return obj == AbstractC6677m0.f24980b ? Long.MAX_VALUE : 0L;
            }
            if (!((C7133q) obj).m31502j()) {
                return 0L;
            }
        }
        d dVar = (d) f24969r.get(this);
        if (dVar == null || (cVar = (c) dVar.m31422f()) == null) {
            return Long.MAX_VALUE;
        }
        long j7 = cVar.f24974a;
        AbstractC6655c.m28161a();
        return AbstractC5905g.m26655c(j7 - System.nanoTime(), 0L);
    }

    @Override // p318o6.AbstractC6669i0
    /* JADX INFO: renamed from: d1 */
    public long mo28196d1() {
        if (m28197e1()) {
            return 0L;
        }
        m28204n1();
        Runnable runnableM28203l1 = m28203l1();
        if (runnableM28203l1 == null) {
            return mo28192Y0();
        }
        runnableM28203l1.run();
        return 0L;
    }

    /* JADX INFO: renamed from: k0 */
    public InterfaceC6661e0 mo28121k0(long j7, Runnable runnable, InterfaceC1879i interfaceC1879i) {
        return InterfaceC6643X.a.m28133a(this, j7, runnable, interfaceC1879i);
    }

    /* JADX INFO: renamed from: m1 */
    public void mo28122m1(Runnable runnable) {
        m28204n1();
        if (m28205o1(runnable)) {
            m28229i1();
        } else {
            RunnableC6635T.f24923t.mo28122m1(runnable);
        }
    }

    /* JADX INFO: renamed from: s1 */
    protected boolean m28213s1() {
        if (!m28195c1()) {
            return false;
        }
        d dVar = (d) f24969r.get(this);
        if (dVar != null && !dVar.m31421e()) {
            return false;
        }
        Object obj = f24968f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C7133q) {
            return ((C7133q) obj).m31502j();
        }
        return obj == AbstractC6677m0.f24980b;
    }

    @Override // p318o6.AbstractC6669i0
    public void shutdown() {
        C6638U0.f24927a.m28129c();
        m28211y1(true);
        m28202k1();
        while (mo28196d1() <= 0) {
        }
        m28209t1();
    }

    /* JADX INFO: renamed from: u1 */
    protected final void m28214u1() {
        f24968f.set(this, null);
        f24969r.set(this, null);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m28215v1(long j7, c cVar) {
        int iM28210w1 = m28210w1(j7, cVar);
        if (iM28210w1 == 0) {
            if (m28212z1(cVar)) {
                m28229i1();
            }
        } else if (iM28210w1 == 1) {
            mo28120h1(j7, cVar);
        } else if (iM28210w1 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    /* JADX INFO: renamed from: x1 */
    protected final InterfaceC6661e0 m28216x1(long j7, Runnable runnable) {
        long jM28233c = AbstractC6677m0.m28233c(j7);
        if (jM28233c >= 4611686018427387903L) {
            return C6619K0.f24909a;
        }
        AbstractC6655c.m28161a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jM28233c + jNanoTime, runnable);
        m28215v1(jNanoTime, bVar);
        return bVar;
    }
}

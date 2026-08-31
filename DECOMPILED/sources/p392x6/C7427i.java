package p392x6;

import androidx.concurrent.futures.AbstractC2404b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6116l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p318o6.InterfaceC6654b1;
import p318o6.InterfaceC6678n;
import p336q6.AbstractC6856l;
import p360t6.AbstractC7101A;
import p360t6.AbstractC7102B;
import p360t6.AbstractC7117a;

/* JADX INFO: renamed from: x6.i */
/* JADX INFO: loaded from: classes.dex */
public class C7427i {

    /* JADX INFO: renamed from: c */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29740c = AtomicReferenceFieldUpdater.newUpdater(C7427i.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ AtomicLongFieldUpdater f29741d = AtomicLongFieldUpdater.newUpdater(C7427i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29742e = AtomicReferenceFieldUpdater.newUpdater(C7427i.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicLongFieldUpdater f29743f = AtomicLongFieldUpdater.newUpdater(C7427i.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29744g = AtomicIntegerFieldUpdater.newUpdater(C7427i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    private final int f29745a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5372q f29746b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: x6.i$a */
    /* synthetic */ class a extends AbstractC6116l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        public static final a f29747a = new a();

        a() {
            super(2, AbstractC7428j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* JADX INFO: renamed from: d */
        public final C7429k m32895d(long j7, C7429k c7429k) {
            return AbstractC7428j.m32904h(j7, c7429k);
        }

        @Override // p238e6.InterfaceC5371p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m32895d(((Number) obj).longValue(), (C7429k) obj2);
        }
    }

    /* JADX INFO: renamed from: x6.i$b */
    /* synthetic */ class b extends AbstractC6116l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        public static final b f29748a = new b();

        b() {
            super(2, AbstractC7428j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* JADX INFO: renamed from: d */
        public final C7429k m32896d(long j7, C7429k c7429k) {
            return AbstractC7428j.m32904h(j7, c7429k);
        }

        @Override // p238e6.InterfaceC5371p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m32896d(((Number) obj).longValue(), (C7429k) obj2);
        }
    }

    public C7427i(int i7, int i8) {
        this.f29745a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i7).toString());
        }
        if (i8 < 0 || i8 > i7) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i7).toString());
        }
        C7429k c7429k = new C7429k(0L, null, 2);
        this.head$volatile = c7429k;
        this.tail$volatile = c7429k;
        this._availablePermits$volatile = i7 - i8;
        this.f29746b = new InterfaceC5372q() { // from class: x6.h
            @Override // p238e6.InterfaceC5372q
            /* JADX INFO: renamed from: j */
            public final Object mo7830j(Object obj, Object obj2, Object obj3) {
                return C7427i.m32888p(this.f29739a, (Throwable) obj, (C1444v) obj2, (InterfaceC1879i) obj3);
            }
        };
    }

    /* JADX INFO: renamed from: g */
    private final boolean m32880g(InterfaceC6654b1 interfaceC6654b1) {
        Object objM31430c;
        C7429k c7429k = (C7429k) f29742e.get(this);
        long andIncrement = f29743f.getAndIncrement(this);
        a aVar = a.f29747a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29742e;
        long j7 = andIncrement / ((long) AbstractC7428j.f29754f);
        loop0: while (true) {
            objM31430c = AbstractC7117a.m31430c(c7429k, j7, aVar);
            if (!AbstractC7102B.m31384c(objM31430c)) {
                AbstractC7101A abstractC7101AM31383b = AbstractC7102B.m31383b(objM31430c);
                while (true) {
                    AbstractC7101A abstractC7101A = (AbstractC7101A) atomicReferenceFieldUpdater.get(this);
                    if (abstractC7101A.f28391c >= abstractC7101AM31383b.f28391c) {
                        break loop0;
                    }
                    if (!abstractC7101AM31383b.m31381u()) {
                        break;
                    }
                    if (AbstractC2404b.m10339a(atomicReferenceFieldUpdater, this, abstractC7101A, abstractC7101AM31383b)) {
                        if (!abstractC7101A.m31379p()) {
                            break loop0;
                        }
                        abstractC7101A.m31442n();
                        break loop0;
                    }
                    if (abstractC7101AM31383b.m31379p()) {
                        abstractC7101AM31383b.m31442n();
                    }
                }
            } else {
                break;
            }
        }
        C7429k c7429k2 = (C7429k) AbstractC7102B.m31383b(objM31430c);
        int i7 = (int) (andIncrement % ((long) AbstractC7428j.f29754f));
        if (AbstractC6856l.m30045a(c7429k2.m32905v(), i7, null, interfaceC6654b1)) {
            interfaceC6654b1.mo28160b(c7429k2, i7);
            return true;
        }
        if (!AbstractC6856l.m30045a(c7429k2.m32905v(), i7, AbstractC7428j.f29750b, AbstractC7428j.f29751c)) {
            return false;
        }
        if (interfaceC6654b1 instanceof InterfaceC6678n) {
            AbstractC6118n.m27185c(interfaceC6654b1, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC6678n) interfaceC6654b1).mo28236e(C1444v.f4971a, this.f29746b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + interfaceC6654b1).toString());
    }

    /* JADX INFO: renamed from: h */
    private final void m32881h() {
        int i7;
        do {
            i7 = f29744g.get(this);
            if (i7 <= this.f29745a) {
                return;
            }
        } while (!f29744g.compareAndSet(this, i7, this.f29745a));
    }

    /* JADX INFO: renamed from: i */
    private final int m32882i() {
        int andDecrement;
        do {
            andDecrement = f29744g.getAndDecrement(this);
        } while (andDecrement > this.f29745a);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C1444v m32888p(C7427i c7427i, Throwable th, C1444v c1444v, InterfaceC1879i interfaceC1879i) {
        c7427i.m32893q();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: s */
    private final boolean m32889s(Object obj) {
        if (!(obj instanceof InterfaceC6678n)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC6678n interfaceC6678n = (InterfaceC6678n) obj;
        Object objMo28238h = interfaceC6678n.mo28238h(C1444v.f4971a, null, this.f29746b);
        if (objMo28238h == null) {
            return false;
        }
        interfaceC6678n.mo28239l(objMo28238h);
        return true;
    }

    /* JADX INFO: renamed from: t */
    private final boolean m32890t() {
        Object objM31430c;
        C7429k c7429k = (C7429k) f29740c.get(this);
        long andIncrement = f29741d.getAndIncrement(this);
        long j7 = andIncrement / ((long) AbstractC7428j.f29754f);
        b bVar = b.f29748a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29740c;
        loop0: while (true) {
            objM31430c = AbstractC7117a.m31430c(c7429k, j7, bVar);
            if (AbstractC7102B.m31384c(objM31430c)) {
                break;
            }
            AbstractC7101A abstractC7101AM31383b = AbstractC7102B.m31383b(objM31430c);
            while (true) {
                AbstractC7101A abstractC7101A = (AbstractC7101A) atomicReferenceFieldUpdater.get(this);
                if (abstractC7101A.f28391c >= abstractC7101AM31383b.f28391c) {
                    break loop0;
                }
                if (!abstractC7101AM31383b.m31381u()) {
                    break;
                }
                if (AbstractC2404b.m10339a(atomicReferenceFieldUpdater, this, abstractC7101A, abstractC7101AM31383b)) {
                    if (!abstractC7101A.m31379p()) {
                        break loop0;
                    }
                    abstractC7101A.m31442n();
                    break loop0;
                }
                if (abstractC7101AM31383b.m31379p()) {
                    abstractC7101AM31383b.m31442n();
                }
            }
        }
        C7429k c7429k2 = (C7429k) AbstractC7102B.m31383b(objM31430c);
        c7429k2.m31437c();
        if (c7429k2.f28391c > j7) {
            return false;
        }
        int i7 = (int) (andIncrement % ((long) AbstractC7428j.f29754f));
        Object andSet = c7429k2.m32905v().getAndSet(i7, AbstractC7428j.f29750b);
        if (andSet != null) {
            if (andSet == AbstractC7428j.f29753e) {
                return false;
            }
            return m32889s(andSet);
        }
        int i8 = AbstractC7428j.f29749a;
        for (int i9 = 0; i9 < i8; i9++) {
            if (c7429k2.m32905v().get(i7) == AbstractC7428j.f29751c) {
                return true;
            }
        }
        return !AbstractC6856l.m30045a(c7429k2.m32905v(), i7, AbstractC7428j.f29750b, AbstractC7428j.f29752d);
    }

    /* JADX INFO: renamed from: f */
    protected final void m32891f(InterfaceC6678n interfaceC6678n) {
        while (m32882i() <= 0) {
            AbstractC6118n.m27185c(interfaceC6678n, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m32880g((InterfaceC6654b1) interfaceC6678n)) {
                return;
            }
        }
        interfaceC6678n.mo28236e(C1444v.f4971a, this.f29746b);
    }

    /* JADX INFO: renamed from: j */
    public final int m32892j() {
        return Math.max(f29744g.get(this), 0);
    }

    /* JADX INFO: renamed from: q */
    public final void m32893q() {
        do {
            int andIncrement = f29744g.getAndIncrement(this);
            if (andIncrement >= this.f29745a) {
                m32881h();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f29745a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m32890t());
    }

    /* JADX INFO: renamed from: r */
    public final boolean m32894r() {
        while (true) {
            int i7 = f29744g.get(this);
            if (i7 > this.f29745a) {
                m32881h();
            } else {
                if (i7 <= 0) {
                    return false;
                }
                if (f29744g.compareAndSet(this, i7, i7 - 1)) {
                    return true;
                }
            }
        }
    }
}

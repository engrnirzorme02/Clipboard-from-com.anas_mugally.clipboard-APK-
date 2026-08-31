package io.grpc.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p063H5.AbstractC0551k;
import p063H5.C0530Z;
import p063H5.C0532a0;
import p063H5.C0554l0;
import p063H5.C0568t;
import p063H5.C0570v;
import p063H5.ExecutorC0562p0;
import p063H5.InterfaceC0557n;
import p122P3.AbstractC1205i;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.C0 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5727C0 implements InterfaceC5804r {

    /* JADX INFO: renamed from: A */
    static final C0530Z.g f22007A;

    /* JADX INFO: renamed from: B */
    static final C0530Z.g f22008B;

    /* JADX INFO: renamed from: C */
    private static final C0554l0 f22009C;

    /* JADX INFO: renamed from: D */
    private static Random f22010D;

    /* JADX INFO: renamed from: a */
    private final C0532a0 f22011a;

    /* JADX INFO: renamed from: b */
    private final Executor f22012b;

    /* JADX INFO: renamed from: d */
    private final ScheduledExecutorService f22014d;

    /* JADX INFO: renamed from: e */
    private final C0530Z f22015e;

    /* JADX INFO: renamed from: f */
    private final C5729D0 f22016f;

    /* JADX INFO: renamed from: g */
    private final C5761U f22017g;

    /* JADX INFO: renamed from: h */
    private final boolean f22018h;

    /* JADX INFO: renamed from: j */
    private final t f22020j;

    /* JADX INFO: renamed from: k */
    private final long f22021k;

    /* JADX INFO: renamed from: l */
    private final long f22022l;

    /* JADX INFO: renamed from: m */
    private final D f22023m;

    /* JADX INFO: renamed from: s */
    private y f22029s;

    /* JADX INFO: renamed from: t */
    private long f22030t;

    /* JADX INFO: renamed from: u */
    private InterfaceC5806s f22031u;

    /* JADX INFO: renamed from: v */
    private u f22032v;

    /* JADX INFO: renamed from: w */
    private u f22033w;

    /* JADX INFO: renamed from: x */
    private long f22034x;

    /* JADX INFO: renamed from: y */
    private C0554l0 f22035y;

    /* JADX INFO: renamed from: z */
    private boolean f22036z;

    /* JADX INFO: renamed from: c */
    private final Executor f22013c = new ExecutorC0562p0(new C7738a());

    /* JADX INFO: renamed from: i */
    private final Object f22019i = new Object();

    /* JADX INFO: renamed from: n */
    private final C5768Y f22024n = new C5768Y();

    /* JADX INFO: renamed from: o */
    private volatile A f22025o = new A(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);

    /* JADX INFO: renamed from: p */
    private final AtomicBoolean f22026p = new AtomicBoolean();

    /* JADX INFO: renamed from: q */
    private final AtomicInteger f22027q = new AtomicInteger();

    /* JADX INFO: renamed from: r */
    private final AtomicInteger f22028r = new AtomicInteger();

    /* JADX INFO: renamed from: io.grpc.internal.C0$A */
    private static final class A {

        /* JADX INFO: renamed from: a */
        final boolean f22037a;

        /* JADX INFO: renamed from: b */
        final List f22038b;

        /* JADX INFO: renamed from: c */
        final Collection f22039c;

        /* JADX INFO: renamed from: d */
        final Collection f22040d;

        /* JADX INFO: renamed from: e */
        final int f22041e;

        /* JADX INFO: renamed from: f */
        final C f22042f;

        /* JADX INFO: renamed from: g */
        final boolean f22043g;

        /* JADX INFO: renamed from: h */
        final boolean f22044h;

        A(List list, Collection collection, Collection collection2, C c7, boolean z7, boolean z8, boolean z9, int i7) {
            this.f22038b = list;
            this.f22039c = (Collection) AbstractC1209m.m5303o(collection, "drainedSubstreams");
            this.f22042f = c7;
            this.f22040d = collection2;
            this.f22043g = z7;
            this.f22037a = z8;
            this.f22044h = z9;
            this.f22041e = i7;
            AbstractC1209m.m5309u(!z8 || list == null, "passThrough should imply buffer is null");
            AbstractC1209m.m5309u((z8 && c7 == null) ? false : true, "passThrough should imply winningSubstream != null");
            AbstractC1209m.m5309u(!z8 || (collection.size() == 1 && collection.contains(c7)) || (collection.size() == 0 && c7.f22059b), "passThrough should imply winningSubstream is drained");
            AbstractC1209m.m5309u((z7 && c7 == null) ? false : true, "cancelled should imply committed");
        }

        /* JADX INFO: renamed from: a */
        A m25530a(C c7) {
            Collection collectionUnmodifiableCollection;
            AbstractC1209m.m5309u(!this.f22044h, "hedging frozen");
            AbstractC1209m.m5309u(this.f22042f == null, "already committed");
            if (this.f22040d == null) {
                collectionUnmodifiableCollection = Collections.singleton(c7);
            } else {
                ArrayList arrayList = new ArrayList(this.f22040d);
                arrayList.add(c7);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new A(this.f22038b, this.f22039c, collectionUnmodifiableCollection, this.f22042f, this.f22043g, this.f22037a, this.f22044h, this.f22041e + 1);
        }

        /* JADX INFO: renamed from: b */
        A m25531b() {
            return new A(this.f22038b, this.f22039c, this.f22040d, this.f22042f, true, this.f22037a, this.f22044h, this.f22041e);
        }

        /* JADX INFO: renamed from: c */
        A m25532c(C c7) {
            List list;
            boolean z7;
            Collection collectionSingleton;
            AbstractC1209m.m5309u(this.f22042f == null, "Already committed");
            List list2 = this.f22038b;
            if (this.f22039c.contains(c7)) {
                collectionSingleton = Collections.singleton(c7);
                list = null;
                z7 = true;
            } else {
                list = list2;
                z7 = false;
                collectionSingleton = Collections.EMPTY_LIST;
            }
            return new A(list, collectionSingleton, this.f22040d, c7, this.f22043g, z7, this.f22044h, this.f22041e);
        }

        /* JADX INFO: renamed from: d */
        A m25533d() {
            return this.f22044h ? this : new A(this.f22038b, this.f22039c, this.f22040d, this.f22042f, this.f22043g, this.f22037a, true, this.f22041e);
        }

        /* JADX INFO: renamed from: e */
        A m25534e(C c7) {
            ArrayList arrayList = new ArrayList(this.f22040d);
            arrayList.remove(c7);
            return new A(this.f22038b, this.f22039c, Collections.unmodifiableCollection(arrayList), this.f22042f, this.f22043g, this.f22037a, this.f22044h, this.f22041e);
        }

        /* JADX INFO: renamed from: f */
        A m25535f(C c7, C c8) {
            ArrayList arrayList = new ArrayList(this.f22040d);
            arrayList.remove(c7);
            arrayList.add(c8);
            return new A(this.f22038b, this.f22039c, Collections.unmodifiableCollection(arrayList), this.f22042f, this.f22043g, this.f22037a, this.f22044h, this.f22041e);
        }

        /* JADX INFO: renamed from: g */
        A m25536g(C c7) {
            c7.f22059b = true;
            if (!this.f22039c.contains(c7)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f22039c);
            arrayList.remove(c7);
            return new A(this.f22038b, Collections.unmodifiableCollection(arrayList), this.f22040d, this.f22042f, this.f22043g, this.f22037a, this.f22044h, this.f22041e);
        }

        /* JADX INFO: renamed from: h */
        A m25537h(C c7) {
            Collection collectionUnmodifiableCollection;
            AbstractC1209m.m5309u(!this.f22037a, "Already passThrough");
            if (c7.f22059b) {
                collectionUnmodifiableCollection = this.f22039c;
            } else if (this.f22039c.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(c7);
            } else {
                ArrayList arrayList = new ArrayList(this.f22039c);
                arrayList.add(c7);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = collectionUnmodifiableCollection;
            C c8 = this.f22042f;
            boolean z7 = c8 != null;
            List list = this.f22038b;
            if (z7) {
                AbstractC1209m.m5309u(c8 == c7, "Another RPC attempt has already committed");
                list = null;
            }
            return new A(list, collection, this.f22040d, this.f22042f, this.f22043g, z7, this.f22044h, this.f22041e);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$B */
    private final class B implements InterfaceC5806s {

        /* JADX INFO: renamed from: a */
        final C f22045a;

        /* JADX INFO: renamed from: io.grpc.internal.C0$B$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0530Z f22047a;

            a(C0530Z c0530z) {
                this.f22047a = c0530z;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC5727C0.this.f22031u.mo25476d(this.f22047a);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.C0$B$b */
        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C f22049a;

            /* JADX INFO: renamed from: io.grpc.internal.C0$B$b$a */
            class a implements Runnable {
                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b bVar = b.this;
                    AbstractC5727C0.this.m25510g0(bVar.f22049a);
                }
            }

            b(C c7) {
                this.f22049a = c7;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC5727C0.this.f22012b.execute(new a());
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.C0$B$c */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC5727C0.this.f22036z = true;
                AbstractC5727C0.this.f22031u.mo25475c(AbstractC5727C0.this.f22029s.f22115a, AbstractC5727C0.this.f22029s.f22116b, AbstractC5727C0.this.f22029s.f22117c);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.C0$B$d */
        class d implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C f22053a;

            d(C c7) {
                this.f22053a = c7;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC5727C0.this.m25510g0(this.f22053a);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.C0$B$e */
        class e implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC5755Q0.a f22055a;

            e(InterfaceC5755Q0.a aVar) {
                this.f22055a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC5727C0.this.f22031u.mo25473a(this.f22055a);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.C0$B$f */
        class f implements Runnable {
            f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC5727C0.this.f22036z) {
                    return;
                }
                AbstractC5727C0.this.f22031u.mo25474b();
            }
        }

        B(C c7) {
            this.f22045a = c7;
        }

        /* JADX INFO: renamed from: e */
        private Integer m25538e(C0530Z c0530z) {
            String str = (String) c0530z.m2283g(AbstractC5727C0.f22008B);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* JADX INFO: renamed from: f */
        private v m25539f(C0554l0 c0554l0, C0530Z c0530z) {
            Integer numM25538e = m25538e(c0530z);
            boolean zContains = AbstractC5727C0.this.f22017g.f22300c.contains(c0554l0.m2458m());
            boolean z7 = (AbstractC5727C0.this.f22023m == null || (!zContains && (numM25538e == null || numM25538e.intValue() >= 0))) ? false : !AbstractC5727C0.this.f22023m.m25542b();
            if (zContains && !z7 && !c0554l0.m2460o() && numM25538e != null && numM25538e.intValue() > 0) {
                numM25538e = 0;
            }
            return new v(zContains && !z7, numM25538e);
        }

        /* JADX INFO: renamed from: g */
        private x m25540g(C0554l0 c0554l0, C0530Z c0530z) {
            long nanos = 0;
            boolean z7 = false;
            if (AbstractC5727C0.this.f22016f == null) {
                return new x(false, 0L);
            }
            boolean zContains = AbstractC5727C0.this.f22016f.f22161f.contains(c0554l0.m2458m());
            Integer numM25538e = m25538e(c0530z);
            boolean z8 = (AbstractC5727C0.this.f22023m == null || (!zContains && (numM25538e == null || numM25538e.intValue() >= 0))) ? false : !AbstractC5727C0.this.f22023m.m25542b();
            if (AbstractC5727C0.this.f22016f.f22156a > this.f22045a.f22061d + 1 && !z8) {
                if (numM25538e == null) {
                    if (zContains) {
                        nanos = (long) (AbstractC5727C0.this.f22034x * AbstractC5727C0.f22010D.nextDouble());
                        AbstractC5727C0 abstractC5727C0 = AbstractC5727C0.this;
                        abstractC5727C0.f22034x = Math.min((long) (abstractC5727C0.f22034x * AbstractC5727C0.this.f22016f.f22159d), AbstractC5727C0.this.f22016f.f22158c);
                        z7 = true;
                    }
                } else if (numM25538e.intValue() >= 0) {
                    nanos = TimeUnit.MILLISECONDS.toNanos(numM25538e.intValue());
                    AbstractC5727C0 abstractC5727C1 = AbstractC5727C0.this;
                    abstractC5727C1.f22034x = abstractC5727C1.f22016f.f22157b;
                    z7 = true;
                }
            }
            return new x(z7, nanos);
        }

        @Override // io.grpc.internal.InterfaceC5755Q0
        /* JADX INFO: renamed from: a */
        public void mo25473a(InterfaceC5755Q0.a aVar) {
            A a7 = AbstractC5727C0.this.f22025o;
            AbstractC1209m.m5309u(a7.f22042f != null, "Headers should be received prior to messages.");
            if (a7.f22042f != this.f22045a) {
                AbstractC5757S.m25666d(aVar);
            } else {
                AbstractC5727C0.this.f22013c.execute(new e(aVar));
            }
        }

        @Override // io.grpc.internal.InterfaceC5755Q0
        /* JADX INFO: renamed from: b */
        public void mo25474b() {
            if (AbstractC5727C0.this.mo25460e()) {
                AbstractC5727C0.this.f22013c.execute(new f());
            }
        }

        @Override // io.grpc.internal.InterfaceC5806s
        /* JADX INFO: renamed from: c */
        public void mo25475c(C0554l0 c0554l0, InterfaceC5806s.a aVar, C0530Z c0530z) {
            u uVar;
            synchronized (AbstractC5727C0.this.f22019i) {
                AbstractC5727C0 abstractC5727C0 = AbstractC5727C0.this;
                abstractC5727C0.f22025o = abstractC5727C0.f22025o.m25536g(this.f22045a);
                AbstractC5727C0.this.f22024n.m25762a(c0554l0.m2458m());
            }
            if (AbstractC5727C0.this.f22028r.decrementAndGet() == Integer.MIN_VALUE) {
                AbstractC5727C0.this.f22013c.execute(new c());
                return;
            }
            C c7 = this.f22045a;
            if (c7.f22060c) {
                AbstractC5727C0.this.m25507d0(c7);
                if (AbstractC5727C0.this.f22025o.f22042f == this.f22045a) {
                    AbstractC5727C0.this.m25519n0(c0554l0, aVar, c0530z);
                    return;
                }
                return;
            }
            InterfaceC5806s.a aVar2 = InterfaceC5806s.a.MISCARRIED;
            if (aVar == aVar2 && AbstractC5727C0.this.f22027q.incrementAndGet() > 1000) {
                AbstractC5727C0.this.m25507d0(this.f22045a);
                if (AbstractC5727C0.this.f22025o.f22042f == this.f22045a) {
                    AbstractC5727C0.this.m25519n0(C0554l0.f2112s.m2462q("Too many transparent retries. Might be a bug in gRPC").m2461p(c0554l0.m2455d()), aVar, c0530z);
                    return;
                }
                return;
            }
            if (AbstractC5727C0.this.f22025o.f22042f == null) {
                if (aVar == aVar2 || (aVar == InterfaceC5806s.a.REFUSED && AbstractC5727C0.this.f22026p.compareAndSet(false, true))) {
                    C cM25508e0 = AbstractC5727C0.this.m25508e0(this.f22045a.f22061d, true);
                    if (cM25508e0 == null) {
                        return;
                    }
                    if (AbstractC5727C0.this.f22018h) {
                        synchronized (AbstractC5727C0.this.f22019i) {
                            AbstractC5727C0 abstractC5727C1 = AbstractC5727C0.this;
                            abstractC5727C1.f22025o = abstractC5727C1.f22025o.m25535f(this.f22045a, cM25508e0);
                        }
                    }
                    AbstractC5727C0.this.f22012b.execute(new d(cM25508e0));
                    return;
                }
                if (aVar != InterfaceC5806s.a.DROPPED) {
                    AbstractC5727C0.this.f22026p.set(true);
                    if (AbstractC5727C0.this.f22018h) {
                        v vVarM25539f = m25539f(c0554l0, c0530z);
                        if (vVarM25539f.f22107a) {
                            AbstractC5727C0.this.m25518m0(vVarM25539f.f22108b);
                        }
                        synchronized (AbstractC5727C0.this.f22019i) {
                            try {
                                AbstractC5727C0 abstractC5727C2 = AbstractC5727C0.this;
                                abstractC5727C2.f22025o = abstractC5727C2.f22025o.m25534e(this.f22045a);
                                if (vVarM25539f.f22107a) {
                                    AbstractC5727C0 abstractC5727C3 = AbstractC5727C0.this;
                                    if (!abstractC5727C3.m25514i0(abstractC5727C3.f22025o)) {
                                        if (!AbstractC5727C0.this.f22025o.f22040d.isEmpty()) {
                                        }
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        x xVarM25540g = m25540g(c0554l0, c0530z);
                        if (xVarM25540g.f22113a) {
                            C cM25508e1 = AbstractC5727C0.this.m25508e0(this.f22045a.f22061d + 1, false);
                            if (cM25508e1 == null) {
                                return;
                            }
                            synchronized (AbstractC5727C0.this.f22019i) {
                                AbstractC5727C0 abstractC5727C4 = AbstractC5727C0.this;
                                uVar = new u(abstractC5727C4.f22019i);
                                abstractC5727C4.f22032v = uVar;
                            }
                            uVar.m25548c(AbstractC5727C0.this.f22014d.schedule(new b(cM25508e1), xVarM25540g.f22114b, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                } else if (AbstractC5727C0.this.f22018h) {
                    AbstractC5727C0.this.m25512h0();
                }
            }
            AbstractC5727C0.this.m25507d0(this.f22045a);
            if (AbstractC5727C0.this.f22025o.f22042f == this.f22045a) {
                AbstractC5727C0.this.m25519n0(c0554l0, aVar, c0530z);
            }
        }

        @Override // io.grpc.internal.InterfaceC5806s
        /* JADX INFO: renamed from: d */
        public void mo25476d(C0530Z c0530z) {
            if (this.f22045a.f22061d > 0) {
                C0530Z.g gVar = AbstractC5727C0.f22007A;
                c0530z.m2282e(gVar);
                c0530z.m2287p(gVar, String.valueOf(this.f22045a.f22061d));
            }
            AbstractC5727C0.this.m25507d0(this.f22045a);
            if (AbstractC5727C0.this.f22025o.f22042f == this.f22045a) {
                if (AbstractC5727C0.this.f22023m != null) {
                    AbstractC5727C0.this.f22023m.m25543c();
                }
                AbstractC5727C0.this.f22013c.execute(new a(c0530z));
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$C */
    private static final class C {

        /* JADX INFO: renamed from: a */
        InterfaceC5804r f22058a;

        /* JADX INFO: renamed from: b */
        boolean f22059b;

        /* JADX INFO: renamed from: c */
        boolean f22060c;

        /* JADX INFO: renamed from: d */
        final int f22061d;

        C(int i7) {
            this.f22061d = i7;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$D */
    static final class D {

        /* JADX INFO: renamed from: a */
        final int f22062a;

        /* JADX INFO: renamed from: b */
        final int f22063b;

        /* JADX INFO: renamed from: c */
        final int f22064c;

        /* JADX INFO: renamed from: d */
        final AtomicInteger f22065d;

        D(float f7, float f8) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f22065d = atomicInteger;
            this.f22064c = (int) (f8 * 1000.0f);
            int i7 = (int) (f7 * 1000.0f);
            this.f22062a = i7;
            this.f22063b = i7 / 2;
            atomicInteger.set(i7);
        }

        /* JADX INFO: renamed from: a */
        boolean m25541a() {
            return this.f22065d.get() > this.f22063b;
        }

        /* JADX INFO: renamed from: b */
        boolean m25542b() {
            int i7;
            int i8;
            do {
                i7 = this.f22065d.get();
                if (i7 == 0) {
                    return false;
                }
                i8 = i7 - 1000;
            } while (!this.f22065d.compareAndSet(i7, Math.max(i8, 0)));
            return i8 > this.f22063b;
        }

        /* JADX INFO: renamed from: c */
        void m25543c() {
            int i7;
            int i8;
            do {
                i7 = this.f22065d.get();
                i8 = this.f22062a;
                if (i7 == i8) {
                    return;
                }
            } while (!this.f22065d.compareAndSet(i7, Math.min(this.f22064c + i7, i8)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof D)) {
                return false;
            }
            D d7 = (D) obj;
            return this.f22062a == d7.f22062a && this.f22064c == d7.f22064c;
        }

        public int hashCode() {
            return AbstractC1205i.m5283b(Integer.valueOf(this.f22062a), Integer.valueOf(this.f22064c));
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$a, reason: case insensitive filesystem */
    class C7738a implements Thread.UncaughtExceptionHandler {
        C7738a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            throw C0554l0.m2453k(th).m2462q("Uncaught exception in the SynchronizationContext. Re-thrown.").m2455d();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$b, reason: case insensitive filesystem */
    class C7739b implements r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f22067a;

        C7739b(String str) {
            this.f22067a = str;
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.mo3265o(this.f22067a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$c, reason: case insensitive filesystem */
    class RunnableC7740c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Collection f22069a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C f22070b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Future f22071c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Future f22072d;

        RunnableC7740c(Collection collection, C c7, Future future, Future future2) {
            this.f22069a = collection;
            this.f22070b = c7;
            this.f22071c = future;
            this.f22072d = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C c7 : this.f22069a) {
                if (c7 != this.f22070b) {
                    c7.f22058a.mo25438a(AbstractC5727C0.f22009C);
                }
            }
            Future future = this.f22071c;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f22072d;
            if (future2 != null) {
                future2.cancel(false);
            }
            AbstractC5727C0.this.mo25526k0();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$d, reason: case insensitive filesystem */
    class C7741d implements r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC0557n f22074a;

        C7741d(InterfaceC0557n interfaceC0557n) {
            this.f22074a = interfaceC0557n;
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.mo25458c(this.f22074a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$e */
    class e implements r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0568t f22076a;

        e(C0568t c0568t) {
            this.f22076a = c0568t;
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.mo25466r(this.f22076a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$f */
    class f implements r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0570v f22078a;

        f(C0570v c0570v) {
            this.f22078a = c0570v;
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.mo25468t(this.f22078a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$g */
    class g implements r {
        g() {
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.flush();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$h */
    class h implements r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f22081a;

        h(boolean z7) {
            this.f22081a = z7;
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.mo25469u(this.f22081a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$i */
    class i implements r {
        i() {
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.mo25465q();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$j */
    class j implements r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f22084a;

        j(int i7) {
            this.f22084a = i7;
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.mo25463m(this.f22084a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$k */
    class k implements r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f22086a;

        k(int i7) {
            this.f22086a = i7;
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.mo25464n(this.f22086a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$l */
    class l implements r {
        l() {
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.mo25462g();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$m */
    class m implements r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f22089a;

        m(int i7) {
            this.f22089a = i7;
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.mo25459d(this.f22089a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$n */
    class n implements r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f22091a;

        n(Object obj) {
            this.f22091a = obj;
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.mo25461f(AbstractC5727C0.this.f22011a.m2329j(this.f22091a));
            c7.f22058a.flush();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$o */
    class o extends AbstractC0551k.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC0551k f22093a;

        o(AbstractC0551k abstractC0551k) {
            this.f22093a = abstractC0551k;
        }

        @Override // p063H5.AbstractC0551k.a
        /* JADX INFO: renamed from: a */
        public AbstractC0551k mo2432a(AbstractC0551k.b bVar, C0530Z c0530z) {
            return this.f22093a;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$p */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC5727C0.this.f22036z) {
                return;
            }
            AbstractC5727C0.this.f22031u.mo25474b();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$q */
    class q implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0554l0 f22096a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5806s.a f22097b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C0530Z f22098c;

        q(C0554l0 c0554l0, InterfaceC5806s.a aVar, C0530Z c0530z) {
            this.f22096a = c0554l0;
            this.f22097b = aVar;
            this.f22098c = c0530z;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5727C0.this.f22036z = true;
            AbstractC5727C0.this.f22031u.mo25475c(this.f22096a, this.f22097b, this.f22098c);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$r */
    private interface r {
        /* JADX INFO: renamed from: a */
        void mo25544a(C c7);
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$s */
    class s extends AbstractC0551k {

        /* JADX INFO: renamed from: b */
        private final C f22100b;

        /* JADX INFO: renamed from: c */
        long f22101c;

        s(C c7) {
            this.f22100b = c7;
        }

        @Override // p063H5.AbstractC0560o0
        /* JADX INFO: renamed from: h */
        public void mo2486h(long j7) {
            if (AbstractC5727C0.this.f22025o.f22042f != null) {
                return;
            }
            synchronized (AbstractC5727C0.this.f22019i) {
                try {
                    if (AbstractC5727C0.this.f22025o.f22042f == null && !this.f22100b.f22059b) {
                        long j8 = this.f22101c + j7;
                        this.f22101c = j8;
                        if (j8 <= AbstractC5727C0.this.f22030t) {
                            return;
                        }
                        if (this.f22101c > AbstractC5727C0.this.f22021k) {
                            this.f22100b.f22060c = true;
                        } else {
                            long jM25545a = AbstractC5727C0.this.f22020j.m25545a(this.f22101c - AbstractC5727C0.this.f22030t);
                            AbstractC5727C0.this.f22030t = this.f22101c;
                            if (jM25545a > AbstractC5727C0.this.f22022l) {
                                this.f22100b.f22060c = true;
                            }
                        }
                        C c7 = this.f22100b;
                        Runnable runnableM25506c0 = c7.f22060c ? AbstractC5727C0.this.m25506c0(c7) : null;
                        if (runnableM25506c0 != null) {
                            runnableM25506c0.run();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$t */
    static final class t {

        /* JADX INFO: renamed from: a */
        private final AtomicLong f22103a = new AtomicLong();

        t() {
        }

        /* JADX INFO: renamed from: a */
        long m25545a(long j7) {
            return this.f22103a.addAndGet(j7);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$u */
    private static final class u {

        /* JADX INFO: renamed from: a */
        final Object f22104a;

        /* JADX INFO: renamed from: b */
        Future f22105b;

        /* JADX INFO: renamed from: c */
        boolean f22106c;

        u(Object obj) {
            this.f22104a = obj;
        }

        /* JADX INFO: renamed from: a */
        boolean m25546a() {
            return this.f22106c;
        }

        /* JADX INFO: renamed from: b */
        Future m25547b() {
            this.f22106c = true;
            return this.f22105b;
        }

        /* JADX INFO: renamed from: c */
        void m25548c(Future future) {
            synchronized (this.f22104a) {
                try {
                    if (!this.f22106c) {
                        this.f22105b = future;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$v */
    private static final class v {

        /* JADX INFO: renamed from: a */
        final boolean f22107a;

        /* JADX INFO: renamed from: b */
        final Integer f22108b;

        public v(boolean z7, Integer num) {
            this.f22107a = z7;
            this.f22108b = num;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$w */
    private final class w implements Runnable {

        /* JADX INFO: renamed from: a */
        final u f22109a;

        /* JADX INFO: renamed from: io.grpc.internal.C0$w$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C f22111a;

            a(C c7) {
                this.f22111a = c7;
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar;
                boolean z7;
                synchronized (AbstractC5727C0.this.f22019i) {
                    try {
                        uVar = null;
                        if (w.this.f22109a.m25546a()) {
                            z7 = true;
                        } else {
                            AbstractC5727C0 abstractC5727C0 = AbstractC5727C0.this;
                            abstractC5727C0.f22025o = abstractC5727C0.f22025o.m25530a(this.f22111a);
                            AbstractC5727C0 abstractC5727C1 = AbstractC5727C0.this;
                            if (abstractC5727C1.m25514i0(abstractC5727C1.f22025o) && (AbstractC5727C0.this.f22023m == null || AbstractC5727C0.this.f22023m.m25541a())) {
                                AbstractC5727C0 abstractC5727C2 = AbstractC5727C0.this;
                                uVar = new u(abstractC5727C2.f22019i);
                                abstractC5727C2.f22033w = uVar;
                            } else {
                                AbstractC5727C0 abstractC5727C3 = AbstractC5727C0.this;
                                abstractC5727C3.f22025o = abstractC5727C3.f22025o.m25533d();
                                AbstractC5727C0.this.f22033w = null;
                            }
                            z7 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z7) {
                    this.f22111a.f22058a.mo25467s(AbstractC5727C0.this.new B(this.f22111a));
                    this.f22111a.f22058a.mo25438a(C0554l0.f2099f.m2462q("Unneeded hedging"));
                } else {
                    if (uVar != null) {
                        uVar.m25548c(AbstractC5727C0.this.f22014d.schedule(AbstractC5727C0.this.new w(uVar), AbstractC5727C0.this.f22017g.f22299b, TimeUnit.NANOSECONDS));
                    }
                    AbstractC5727C0.this.m25510g0(this.f22111a);
                }
            }
        }

        w(u uVar) {
            this.f22109a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5727C0 abstractC5727C0 = AbstractC5727C0.this;
            C cM25508e0 = abstractC5727C0.m25508e0(abstractC5727C0.f22025o.f22041e, false);
            if (cM25508e0 == null) {
                return;
            }
            AbstractC5727C0.this.f22012b.execute(new a(cM25508e0));
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$x */
    private static final class x {

        /* JADX INFO: renamed from: a */
        final boolean f22113a;

        /* JADX INFO: renamed from: b */
        final long f22114b;

        x(boolean z7, long j7) {
            this.f22113a = z7;
            this.f22114b = j7;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$y */
    private static final class y {

        /* JADX INFO: renamed from: a */
        private final C0554l0 f22115a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC5806s.a f22116b;

        /* JADX INFO: renamed from: c */
        private final C0530Z f22117c;

        y(C0554l0 c0554l0, InterfaceC5806s.a aVar, C0530Z c0530z) {
            this.f22115a = c0554l0;
            this.f22116b = aVar;
            this.f22117c = c0530z;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C0$z */
    class z implements r {
        z() {
        }

        @Override // io.grpc.internal.AbstractC5727C0.r
        /* JADX INFO: renamed from: a */
        public void mo25544a(C c7) {
            c7.f22058a.mo25467s(AbstractC5727C0.this.new B(c7));
        }
    }

    static {
        C0530Z.d dVar = C0530Z.f1980e;
        f22007A = C0530Z.g.m2296e("grpc-previous-rpc-attempts", dVar);
        f22008B = C0530Z.g.m2296e("grpc-retry-pushback-ms", dVar);
        f22009C = C0554l0.f2099f.m2462q("Stream thrown away because RetriableStream committed");
        f22010D = new Random();
    }

    AbstractC5727C0(C0532a0 c0532a0, C0530Z c0530z, t tVar, long j7, long j8, Executor executor, ScheduledExecutorService scheduledExecutorService, C5729D0 c5729d0, C5761U c5761u, D d7) {
        this.f22011a = c0532a0;
        this.f22020j = tVar;
        this.f22021k = j7;
        this.f22022l = j8;
        this.f22012b = executor;
        this.f22014d = scheduledExecutorService;
        this.f22015e = c0530z;
        this.f22016f = c5729d0;
        if (c5729d0 != null) {
            this.f22034x = c5729d0.f22157b;
        }
        this.f22017g = c5761u;
        AbstractC1209m.m5293e(c5729d0 == null || c5761u == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f22018h = c5761u != null;
        this.f22023m = d7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public Runnable m25506c0(C c7) {
        Future future;
        Future future2;
        synchronized (this.f22019i) {
            try {
                if (this.f22025o.f22042f != null) {
                    return null;
                }
                Collection collection = this.f22025o.f22039c;
                this.f22025o = this.f22025o.m25532c(c7);
                this.f22020j.m25545a(-this.f22030t);
                u uVar = this.f22032v;
                if (uVar != null) {
                    Future futureM25547b = uVar.m25547b();
                    this.f22032v = null;
                    future = futureM25547b;
                } else {
                    future = null;
                }
                u uVar2 = this.f22033w;
                if (uVar2 != null) {
                    Future futureM25547b2 = uVar2.m25547b();
                    this.f22033w = null;
                    future2 = futureM25547b2;
                } else {
                    future2 = null;
                }
                return new RunnableC7740c(collection, c7, future, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public void m25507d0(C c7) {
        Runnable runnableM25506c0 = m25506c0(c7);
        if (runnableM25506c0 != null) {
            this.f22012b.execute(runnableM25506c0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public C m25508e0(int i7, boolean z7) {
        int i8;
        do {
            i8 = this.f22028r.get();
            if (i8 < 0) {
                return null;
            }
        } while (!this.f22028r.compareAndSet(i8, i8 + 1));
        C c7 = new C(i7);
        c7.f22058a = mo25525j0(m25529p0(this.f22015e, i7), new o(new s(c7)), i7, z7);
        return c7;
    }

    /* JADX INFO: renamed from: f0 */
    private void m25509f0(r rVar) {
        Collection collection;
        synchronized (this.f22019i) {
            try {
                if (!this.f22025o.f22037a) {
                    this.f22025o.f22038b.add(rVar);
                }
                collection = this.f22025o.f22039c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rVar.mo25544a((C) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r4 = (io.grpc.internal.AbstractC5727C0.r) r0.next();
        r4.mo25544a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if ((r4 instanceof io.grpc.internal.AbstractC5727C0.z) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        r4 = r8.f22025o;
        r5 = r4.f22042f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        if (r4.f22043g == false) goto L67;
     */
    /* JADX INFO: renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m25510g0(C c7) {
        int iMin;
        int i7 = 0;
        p pVar = null;
        boolean z7 = false;
        ArrayList arrayList = null;
        while (true) {
            synchronized (this.f22019i) {
                try {
                    A a7 = this.f22025o;
                    C c8 = a7.f22042f;
                    if (c8 == null || c8 == c7) {
                        if (!a7.f22043g) {
                            if (i7 == a7.f22038b.size()) {
                                this.f22025o = a7.m25537h(c7);
                                if (!mo25460e()) {
                                    return;
                                } else {
                                    pVar = new p();
                                }
                            } else {
                                if (c7.f22059b) {
                                    return;
                                }
                                iMin = Math.min(i7 + 128, a7.f22038b.size());
                                if (arrayList == null) {
                                    arrayList = new ArrayList(a7.f22038b.subList(i7, iMin));
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(a7.f22038b.subList(i7, iMin));
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i7 = iMin;
        }
        if (pVar != null) {
            this.f22013c.execute(pVar);
            return;
        }
        if (!z7) {
            c7.f22058a.mo25467s(new B(c7));
        }
        c7.f22058a.mo25438a(this.f22025o.f22042f == c7 ? this.f22035y : f22009C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m25512h0() {
        Future future;
        synchronized (this.f22019i) {
            try {
                u uVar = this.f22033w;
                future = null;
                if (uVar != null) {
                    Future futureM25547b = uVar.m25547b();
                    this.f22033w = null;
                    future = futureM25547b;
                }
                this.f22025o = this.f22025o.m25533d();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public boolean m25514i0(A a7) {
        return a7.f22042f == null && a7.f22041e < this.f22017g.f22298a && !a7.f22044h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public void m25518m0(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            m25512h0();
            return;
        }
        synchronized (this.f22019i) {
            try {
                u uVar = this.f22033w;
                if (uVar == null) {
                    return;
                }
                Future futureM25547b = uVar.m25547b();
                u uVar2 = new u(this.f22019i);
                this.f22033w = uVar2;
                if (futureM25547b != null) {
                    futureM25547b.cancel(false);
                }
                uVar2.m25548c(this.f22014d.schedule(new w(uVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public void m25519n0(C0554l0 c0554l0, InterfaceC5806s.a aVar, C0530Z c0530z) {
        this.f22029s = new y(c0554l0, aVar, c0530z);
        if (this.f22028r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f22013c.execute(new q(c0554l0, aVar, c0530z));
        }
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: a */
    public final void mo25438a(C0554l0 c0554l0) {
        C c7;
        C c8 = new C(0);
        c8.f22058a = new C5801p0();
        Runnable runnableM25506c0 = m25506c0(c8);
        if (runnableM25506c0 != null) {
            synchronized (this.f22019i) {
                this.f22025o = this.f22025o.m25537h(c8);
            }
            runnableM25506c0.run();
            m25519n0(c0554l0, InterfaceC5806s.a.PROCESSED, new C0530Z());
            return;
        }
        synchronized (this.f22019i) {
            try {
                if (this.f22025o.f22039c.contains(this.f22025o.f22042f)) {
                    c7 = this.f22025o.f22042f;
                } else {
                    this.f22035y = c0554l0;
                    c7 = null;
                }
                this.f22025o = this.f22025o.m25531b();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c7 != null) {
            c7.f22058a.mo25438a(c0554l0);
        }
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: c */
    public final void mo25458c(InterfaceC0557n interfaceC0557n) {
        m25509f0(new C7741d(interfaceC0557n));
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: d */
    public final void mo25459d(int i7) {
        A a7 = this.f22025o;
        if (a7.f22037a) {
            a7.f22042f.f22058a.mo25459d(i7);
        } else {
            m25509f0(new m(i7));
        }
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: e */
    public final boolean mo25460e() {
        Iterator it = this.f22025o.f22039c.iterator();
        while (it.hasNext()) {
            if (((C) it.next()).f22058a.mo25460e()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: f */
    public final void mo25461f(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    public final void flush() {
        A a7 = this.f22025o;
        if (a7.f22037a) {
            a7.f22042f.f22058a.flush();
        } else {
            m25509f0(new g());
        }
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: g */
    public void mo25462g() {
        m25509f0(new l());
    }

    /* JADX INFO: renamed from: j0 */
    abstract InterfaceC5804r mo25525j0(C0530Z c0530z, AbstractC0551k.a aVar, int i7, boolean z7);

    /* JADX INFO: renamed from: k0 */
    abstract void mo25526k0();

    /* JADX INFO: renamed from: l0 */
    abstract C0554l0 mo25527l0();

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: m */
    public final void mo25463m(int i7) {
        m25509f0(new j(i7));
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: n */
    public final void mo25464n(int i7) {
        m25509f0(new k(i7));
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: o */
    public final void mo3265o(String str) {
        m25509f0(new C7739b(str));
    }

    /* JADX INFO: renamed from: o0 */
    final void m25528o0(Object obj) {
        A a7 = this.f22025o;
        if (a7.f22037a) {
            a7.f22042f.f22058a.mo25461f(this.f22011a.m2329j(obj));
        } else {
            m25509f0(new n(obj));
        }
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: p */
    public void mo25439p(C5768Y c5768y) {
        A a7;
        synchronized (this.f22019i) {
            c5768y.m25763b("closed", this.f22024n);
            a7 = this.f22025o;
        }
        if (a7.f22042f != null) {
            C5768Y c5768y2 = new C5768Y();
            a7.f22042f.f22058a.mo25439p(c5768y2);
            c5768y.m25763b("committed", c5768y2);
            return;
        }
        C5768Y c5768y3 = new C5768Y();
        for (C c7 : a7.f22039c) {
            C5768Y c5768y4 = new C5768Y();
            c7.f22058a.mo25439p(c5768y4);
            c5768y3.m25762a(c5768y4);
        }
        c5768y.m25763b("open", c5768y3);
    }

    /* JADX INFO: renamed from: p0 */
    final C0530Z m25529p0(C0530Z c0530z, int i7) {
        C0530Z c0530z2 = new C0530Z();
        c0530z2.m2286m(c0530z);
        if (i7 > 0) {
            c0530z2.m2287p(f22007A, String.valueOf(i7));
        }
        return c0530z2;
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: q */
    public final void mo25465q() {
        m25509f0(new i());
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: r */
    public final void mo25466r(C0568t c0568t) {
        m25509f0(new e(c0568t));
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: s */
    public final void mo25467s(InterfaceC5806s interfaceC5806s) {
        u uVar;
        D d7;
        this.f22031u = interfaceC5806s;
        C0554l0 c0554l0Mo25527l0 = mo25527l0();
        if (c0554l0Mo25527l0 != null) {
            mo25438a(c0554l0Mo25527l0);
            return;
        }
        synchronized (this.f22019i) {
            this.f22025o.f22038b.add(new z());
        }
        C cM25508e0 = m25508e0(0, false);
        if (cM25508e0 == null) {
            return;
        }
        if (this.f22018h) {
            synchronized (this.f22019i) {
                try {
                    this.f22025o = this.f22025o.m25530a(cM25508e0);
                    if (m25514i0(this.f22025o) && ((d7 = this.f22023m) == null || d7.m25541a())) {
                        uVar = new u(this.f22019i);
                        this.f22033w = uVar;
                    } else {
                        uVar = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (uVar != null) {
                uVar.m25548c(this.f22014d.schedule(new w(uVar), this.f22017g.f22299b, TimeUnit.NANOSECONDS));
            }
        }
        m25510g0(cM25508e0);
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: t */
    public final void mo25468t(C0570v c0570v) {
        m25509f0(new f(c0570v));
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: u */
    public final void mo25469u(boolean z7) {
        m25509f0(new h(z7));
    }
}

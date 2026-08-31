package p336q6;

import androidx.appcompat.app.AbstractC2263x;
import androidx.concurrent.futures.AbstractC2404b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import kotlin.jvm.internal.AbstractC6116l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1423a;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p286k6.InterfaceC6079e;
import p302m6.AbstractC6406h;
import p318o6.AbstractC6686r;
import p318o6.C6682p;
import p318o6.InterfaceC6654b1;
import p318o6.InterfaceC6678n;
import p360t6.AbstractC7101A;
import p360t6.AbstractC7102B;
import p360t6.AbstractC7103C;
import p360t6.AbstractC7117a;
import p360t6.AbstractC7118b;
import p360t6.AbstractC7126j;
import p360t6.AbstractC7139w;
import p360t6.C7116P;
import p384w6.InterfaceC7364e;

/* JADX INFO: renamed from: q6.e */
/* JADX INFO: loaded from: classes.dex */
public class C6849e implements InterfaceC6851g {

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ AtomicLongFieldUpdater f27441d = AtomicLongFieldUpdater.newUpdater(C6849e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ AtomicLongFieldUpdater f27442e = AtomicLongFieldUpdater.newUpdater(C6849e.class, "receivers$volatile");

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicLongFieldUpdater f27443f = AtomicLongFieldUpdater.newUpdater(C6849e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: r */
    private static final /* synthetic */ AtomicLongFieldUpdater f27444r = AtomicLongFieldUpdater.newUpdater(C6849e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: s */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27445s = AtomicReferenceFieldUpdater.newUpdater(C6849e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: t */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27446t = AtomicReferenceFieldUpdater.newUpdater(C6849e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: u */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27447u = AtomicReferenceFieldUpdater.newUpdater(C6849e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: v */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27448v = AtomicReferenceFieldUpdater.newUpdater(C6849e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: w */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27449w = AtomicReferenceFieldUpdater.newUpdater(C6849e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a */
    private final int f27450a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5367l f27451b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5372q f27452c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: q6.e$a */
    private final class a implements InterfaceC6853i, InterfaceC6654b1 {

        /* JADX INFO: renamed from: a */
        private Object f27453a = AbstractC6850f.f27471p;

        /* JADX INFO: renamed from: b */
        private C6682p f27454b;

        public a() {
        }

        /* JADX INFO: renamed from: f */
        private final Object m29990f(C6857m c6857m, int i7, long j7, InterfaceC1875e interfaceC1875e) throws Throwable {
            Boolean boolM27120a;
            C6857m c6857mM29904O;
            C6849e c6849e = C6849e.this;
            C6682p c6682pM28281b = AbstractC6686r.m28281b(AbstractC2005b.m8367c(interfaceC1875e));
            try {
                this.f27454b = c6682pM28281b;
                try {
                    Object objM29917V0 = c6849e.m29917V0(c6857m, i7, j7, this);
                    if (objM29917V0 != AbstractC6850f.f27468m) {
                        InterfaceC5372q interfaceC5372qM29881A = null;
                        if (objM29917V0 == AbstractC6850f.f27470o) {
                            if (j7 < c6849e.m29977d0()) {
                                c6857m.m31437c();
                            }
                            C6857m c6857m2 = (C6857m) C6849e.m29920X().get(c6849e);
                            while (true) {
                                if (c6849e.m29983l0()) {
                                    m29992h();
                                    break;
                                }
                                long andIncrement = C6849e.m29922Y().getAndIncrement(c6849e);
                                int i8 = AbstractC6850f.f27457b;
                                long j8 = andIncrement / ((long) i8);
                                int i9 = (int) (andIncrement % ((long) i8));
                                if (c6857m2.f28391c != j8) {
                                    c6857mM29904O = c6849e.m29904O(j8, c6857m2);
                                    if (c6857mM29904O == null) {
                                    }
                                } else {
                                    c6857mM29904O = c6857m2;
                                }
                                Object objM29917V1 = c6849e.m29917V0(c6857mM29904O, i9, andIncrement, this);
                                if (objM29917V1 == AbstractC6850f.f27468m) {
                                    c6849e.m29889F0(this, c6857mM29904O, i9);
                                    break;
                                }
                                if (objM29917V1 == AbstractC6850f.f27470o) {
                                    if (andIncrement < c6849e.m29977d0()) {
                                        c6857mM29904O.m31437c();
                                    }
                                    c6857m2 = c6857mM29904O;
                                } else {
                                    if (objM29917V1 == AbstractC6850f.f27469n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c6857mM29904O.m31437c();
                                    this.f27453a = objM29917V1;
                                    this.f27454b = null;
                                    boolM27120a = AbstractC6087b.m27120a(true);
                                    InterfaceC5367l interfaceC5367l = c6849e.f27451b;
                                    if (interfaceC5367l != null) {
                                        interfaceC5372qM29881A = c6849e.m29881A(interfaceC5367l, objM29917V1);
                                    }
                                }
                            }
                        } else {
                            c6857m.m31437c();
                            this.f27453a = objM29917V0;
                            this.f27454b = null;
                            boolM27120a = AbstractC6087b.m27120a(true);
                            InterfaceC5367l interfaceC5367l2 = c6849e.f27451b;
                            if (interfaceC5367l2 != null) {
                                interfaceC5372qM29881A = c6849e.m29881A(interfaceC5367l2, objM29917V0);
                            }
                        }
                        c6682pM28281b.mo28236e(boolM27120a, interfaceC5372qM29881A);
                        break;
                    }
                    c6849e.m29889F0(this, c6857m, i7);
                    Object objM28273y = c6682pM28281b.m28273y();
                    if (objM28273y == AbstractC2005b.m8369e()) {
                        AbstractC6093h.m27135c(interfaceC1875e);
                    }
                    return objM28273y;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    c6682pM28281b.m28266M();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX INFO: renamed from: g */
        private final boolean m29991g() throws Throwable {
            this.f27453a = AbstractC6850f.m30025z();
            Throwable thM29971T = C6849e.this.m29971T();
            if (thM29971T == null) {
                return false;
            }
            throw AbstractC7103C.m31385a(thM29971T);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public final void m29992h() {
            C6682p c6682p = this.f27454b;
            AbstractC6118n.m27184b(c6682p);
            this.f27454b = null;
            this.f27453a = AbstractC6850f.m30025z();
            Throwable thM29971T = C6849e.this.m29971T();
            if (thM29971T == null) {
                C1436n.a aVar = C1436n.f4958b;
                c6682p.resumeWith(C1436n.m6073b(Boolean.FALSE));
            } else {
                C1436n.a aVar2 = C1436n.f4958b;
                c6682p.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(thM29971T)));
            }
        }

        @Override // p336q6.InterfaceC6853i
        /* JADX INFO: renamed from: a */
        public Object mo29993a(InterfaceC1875e interfaceC1875e) throws Throwable {
            C6857m c6857mM29904O;
            boolean zM29991g = true;
            if (this.f27453a == AbstractC6850f.f27471p || this.f27453a == AbstractC6850f.m30025z()) {
                C6849e c6849e = C6849e.this;
                C6857m c6857m = (C6857m) C6849e.m29920X().get(c6849e);
                while (!c6849e.m29983l0()) {
                    long andIncrement = C6849e.m29922Y().getAndIncrement(c6849e);
                    int i7 = AbstractC6850f.f27457b;
                    long j7 = andIncrement / ((long) i7);
                    int i8 = (int) (andIncrement % ((long) i7));
                    if (c6857m.f28391c != j7) {
                        c6857mM29904O = c6849e.m29904O(j7, c6857m);
                        if (c6857mM29904O == null) {
                            continue;
                        }
                    } else {
                        c6857mM29904O = c6857m;
                    }
                    Object objM29917V0 = c6849e.m29917V0(c6857mM29904O, i8, andIncrement, null);
                    if (objM29917V0 == AbstractC6850f.f27468m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objM29917V0 == AbstractC6850f.f27470o) {
                        if (andIncrement < c6849e.m29977d0()) {
                            c6857mM29904O.m31437c();
                        }
                        c6857m = c6857mM29904O;
                    } else {
                        if (objM29917V0 == AbstractC6850f.f27469n) {
                            return m29990f(c6857mM29904O, i8, andIncrement, interfaceC1875e);
                        }
                        c6857mM29904O.m31437c();
                        this.f27453a = objM29917V0;
                    }
                }
                zM29991g = m29991g();
            }
            return AbstractC6087b.m27120a(zM29991g);
        }

        @Override // p318o6.InterfaceC6654b1
        /* JADX INFO: renamed from: b */
        public void mo28160b(AbstractC7101A abstractC7101A, int i7) {
            C6682p c6682p = this.f27454b;
            if (c6682p != null) {
                c6682p.mo28160b(abstractC7101A, i7);
            }
        }

        /* JADX INFO: renamed from: i */
        public final boolean m29994i(Object obj) {
            C6682p c6682p = this.f27454b;
            AbstractC6118n.m27184b(c6682p);
            this.f27454b = null;
            this.f27453a = obj;
            Boolean bool = Boolean.TRUE;
            C6849e c6849e = C6849e.this;
            InterfaceC5367l interfaceC5367l = c6849e.f27451b;
            return AbstractC6850f.m29998B(c6682p, bool, interfaceC5367l != null ? c6849e.m29881A(interfaceC5367l, obj) : null);
        }

        /* JADX INFO: renamed from: j */
        public final void m29995j() {
            C6682p c6682p = this.f27454b;
            AbstractC6118n.m27184b(c6682p);
            this.f27454b = null;
            this.f27453a = AbstractC6850f.m30025z();
            Throwable thM29971T = C6849e.this.m29971T();
            if (thM29971T == null) {
                C1436n.a aVar = C1436n.f4958b;
                c6682p.resumeWith(C1436n.m6073b(Boolean.FALSE));
            } else {
                C1436n.a aVar2 = C1436n.f4958b;
                c6682p.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(thM29971T)));
            }
        }

        @Override // p336q6.InterfaceC6853i
        public Object next() throws Throwable {
            Object obj = this.f27453a;
            if (obj == AbstractC6850f.f27471p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f27453a = AbstractC6850f.f27471p;
            if (obj != AbstractC6850f.m30025z()) {
                return obj;
            }
            throw AbstractC7103C.m31385a(C6849e.this.m29918W());
        }
    }

    /* JADX INFO: renamed from: q6.e$b */
    /* synthetic */ class b extends AbstractC6116l implements InterfaceC5372q {
        b(Object obj) {
            super(3, obj, C6849e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m29996d(Throwable th, Object obj, InterfaceC1879i interfaceC1879i) {
            ((C6849e) this.receiver).m29959w0(th, obj, interfaceC1879i);
        }

        @Override // p238e6.InterfaceC5372q
        /* JADX INFO: renamed from: j */
        public /* bridge */ /* synthetic */ Object mo7830j(Object obj, Object obj2, Object obj3) {
            m29996d((Throwable) obj, obj2, (InterfaceC1879i) obj3);
            return C1444v.f4971a;
        }
    }

    public C6849e(int i7, InterfaceC5367l interfaceC5367l) {
        this.f27450a = i7;
        this.f27451b = interfaceC5367l;
        if (i7 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i7 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = AbstractC6850f.m29997A(i7);
        this.completedExpandBuffersAndPauseFlag$volatile = m29910R();
        C6857m c6857m = new C6857m(0L, null, this, 3);
        this.sendSegment$volatile = c6857m;
        this.receiveSegment$volatile = c6857m;
        if (m29947q0()) {
            c6857m = AbstractC6850f.f27456a;
            AbstractC6118n.m27185c(c6857m, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c6857m;
        this.f27452c = interfaceC5367l != null ? new InterfaceC5372q() { // from class: q6.b
            @Override // p238e6.InterfaceC5372q
            /* JADX INFO: renamed from: j */
            public final Object mo7830j(Object obj, Object obj2, Object obj3) {
                C6849e c6849e = this.f27436a;
                AbstractC2263x.m9328a(obj);
                return C6849e.m29886D0(c6849e, null, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = AbstractC6850f.f27474s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final InterfaceC5372q m29881A(final InterfaceC5367l interfaceC5367l, final Object obj) {
        return new InterfaceC5372q() { // from class: q6.c
            @Override // p238e6.InterfaceC5372q
            /* JADX INFO: renamed from: j */
            public final Object mo7830j(Object obj2, Object obj3, Object obj4) {
                return C6849e.m29884C(interfaceC5367l, obj, (Throwable) obj2, obj3, (InterfaceC1879i) obj4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public final void m29882A0(Object obj, InterfaceC6678n interfaceC6678n) {
        InterfaceC5367l interfaceC5367l = this.f27451b;
        if (interfaceC5367l != null) {
            AbstractC7139w.m31515a(interfaceC5367l, obj, interfaceC6678n.getContext());
        }
        Throwable thM29973a0 = m29973a0();
        C1436n.a aVar = C1436n.f4958b;
        interfaceC6678n.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(thM29973a0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final InterfaceC6079e m29883B(InterfaceC5367l interfaceC5367l) {
        return new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C1444v m29884C(InterfaceC5367l interfaceC5367l, Object obj, Throwable th, Object obj2, InterfaceC1879i interfaceC1879i) {
        AbstractC7139w.m31515a(interfaceC5367l, obj, interfaceC1879i);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: D */
    private final boolean m29885D(long j7) {
        return j7 < m29910R() || j7 < m29972Z() + ((long) this.f27450a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final InterfaceC5372q m29886D0(final C6849e c6849e, final InterfaceC7364e interfaceC7364e, Object obj, final Object obj2) {
        return new InterfaceC5372q(obj2, c6849e, interfaceC7364e) { // from class: q6.d

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f27439a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C6849e f27440b;

            @Override // p238e6.InterfaceC5372q
            /* JADX INFO: renamed from: j */
            public final Object mo7830j(Object obj3, Object obj4, Object obj5) {
                return C6849e.m29887E0(this.f27439a, this.f27440b, null, (Throwable) obj3, obj4, (InterfaceC1879i) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C1444v m29887E0(Object obj, C6849e c6849e, InterfaceC7364e interfaceC7364e, Throwable th, Object obj2, InterfaceC1879i interfaceC1879i) {
        if (obj != AbstractC6850f.m30025z()) {
            AbstractC7139w.m31515a(c6849e.f27451b, obj, interfaceC7364e.getContext());
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: F */
    private final void m29888F(C6857m c6857m, long j7) {
        Object objM31460b = AbstractC7126j.m31460b(null, 1, null);
        loop0: while (c6857m != null) {
            for (int i7 = AbstractC6850f.f27457b - 1; -1 < i7; i7--) {
                if ((c6857m.f28391c * ((long) AbstractC6850f.f27457b)) + ((long) i7) < j7) {
                    break loop0;
                }
                while (true) {
                    Object objM30049B = c6857m.m30049B(i7);
                    if (objM30049B != null && objM30049B != AbstractC6850f.f27460e) {
                        if (!(objM30049B instanceof C6869y)) {
                            if (!(objM30049B instanceof InterfaceC6654b1)) {
                                break;
                            }
                            if (c6857m.m30056v(i7, objM30049B, AbstractC6850f.m30025z())) {
                                objM31460b = AbstractC7126j.m31461c(objM31460b, objM30049B);
                                c6857m.m30050C(i7, true);
                                break;
                            }
                        } else {
                            if (c6857m.m30056v(i7, objM30049B, AbstractC6850f.m30025z())) {
                                objM31460b = AbstractC7126j.m31461c(objM31460b, ((C6869y) objM30049B).f27497a);
                                c6857m.m30050C(i7, true);
                                break;
                            }
                        }
                    } else {
                        if (c6857m.m30056v(i7, objM30049B, AbstractC6850f.m30025z())) {
                            c6857m.m31380t();
                            break;
                        }
                    }
                }
            }
            c6857m = (C6857m) c6857m.m31439h();
        }
        if (objM31460b != null) {
            if (!(objM31460b instanceof ArrayList)) {
                m29898K0((InterfaceC6654b1) objM31460b);
                return;
            }
            AbstractC6118n.m27185c(objM31460b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objM31460b;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m29898K0((InterfaceC6654b1) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public final void m29889F0(InterfaceC6654b1 interfaceC6654b1, C6857m c6857m, int i7) {
        m29966C0();
        interfaceC6654b1.mo28160b(c6857m, i7);
    }

    /* JADX INFO: renamed from: G */
    private final C6857m m29890G() {
        Object obj = f27447u.get(this);
        C6857m c6857m = (C6857m) f27445s.get(this);
        if (c6857m.f28391c > ((C6857m) obj).f28391c) {
            obj = c6857m;
        }
        C6857m c6857m2 = (C6857m) f27446t.get(this);
        if (c6857m2.f28391c > ((C6857m) obj).f28391c) {
            obj = c6857m2;
        }
        return (C6857m) AbstractC7117a.m31429b((AbstractC7118b) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public final void m29891G0(InterfaceC6654b1 interfaceC6654b1, C6857m c6857m, int i7) {
        interfaceC6654b1.mo28160b(c6857m, i7 + AbstractC6850f.f27457b);
    }

    /* JADX INFO: renamed from: H0 */
    static /* synthetic */ Object m29892H0(C6849e c6849e, InterfaceC1875e interfaceC1875e) throws Throwable {
        C6857m c6857m;
        C6857m c6857m2 = (C6857m) m29920X().get(c6849e);
        while (!c6849e.m29983l0()) {
            long andIncrement = m29922Y().getAndIncrement(c6849e);
            int i7 = AbstractC6850f.f27457b;
            long j7 = andIncrement / ((long) i7);
            int i8 = (int) (andIncrement % ((long) i7));
            if (c6857m2.f28391c != j7) {
                C6857m c6857mM29904O = c6849e.m29904O(j7, c6857m2);
                if (c6857mM29904O == null) {
                    continue;
                } else {
                    c6857m = c6857mM29904O;
                }
            } else {
                c6857m = c6857m2;
            }
            C6849e c6849e2 = c6849e;
            Object objM29917V0 = c6849e2.m29917V0(c6857m, i8, andIncrement, null);
            if (objM29917V0 == AbstractC6850f.f27468m) {
                throw new IllegalStateException("unexpected");
            }
            if (objM29917V0 != AbstractC6850f.f27470o) {
                if (objM29917V0 == AbstractC6850f.f27469n) {
                    return c6849e2.m29894I0(c6857m, i8, andIncrement, interfaceC1875e);
                }
                c6857m.m31437c();
                return objM29917V0;
            }
            if (andIncrement < c6849e2.m29977d0()) {
                c6857m.m31437c();
            }
            c6849e = c6849e2;
            c6857m2 = c6857m;
        }
        throw AbstractC7103C.m31385a(c6849e.m29918W());
    }

    /* JADX INFO: renamed from: I */
    private final void m29893I(long j7) {
        m29896J0(m29895J(j7));
    }

    /* JADX INFO: renamed from: I0 */
    private final Object m29894I0(C6857m c6857m, int i7, long j7, InterfaceC1875e interfaceC1875e) {
        InterfaceC5372q interfaceC5372q;
        C6857m c6857m2;
        C6682p c6682pM28281b = AbstractC6686r.m28281b(AbstractC2005b.m8367c(interfaceC1875e));
        try {
            Object objM29917V0 = m29917V0(c6857m, i7, j7, c6682pM28281b);
            if (objM29917V0 != AbstractC6850f.f27468m) {
                if (objM29917V0 == AbstractC6850f.f27470o) {
                    if (j7 < m29977d0()) {
                        c6857m.m31437c();
                    }
                    C6857m c6857m3 = (C6857m) m29920X().get(this);
                    while (true) {
                        if (m29983l0()) {
                            m29962y0(c6682pM28281b);
                            break;
                        }
                        long andIncrement = m29922Y().getAndIncrement(this);
                        int i8 = AbstractC6850f.f27457b;
                        long j8 = andIncrement / ((long) i8);
                        int i9 = (int) (andIncrement % ((long) i8));
                        if (c6857m3.f28391c != j8) {
                            C6857m c6857mM29904O = m29904O(j8, c6857m3);
                            if (c6857mM29904O != null) {
                                c6857m2 = c6857mM29904O;
                            }
                        } else {
                            c6857m2 = c6857m3;
                        }
                        objM29917V0 = m29917V0(c6857m2, i9, andIncrement, c6682pM28281b);
                        C6857m c6857m4 = c6857m2;
                        if (objM29917V0 == AbstractC6850f.f27468m) {
                            C6682p c6682p = c6682pM28281b != null ? c6682pM28281b : null;
                            if (c6682p == null) {
                                break;
                            }
                            m29889F0(c6682p, c6857m4, i9);
                            break;
                        }
                        if (objM29917V0 == AbstractC6850f.f27470o) {
                            if (andIncrement < m29977d0()) {
                                c6857m4.m31437c();
                            }
                            c6857m3 = c6857m4;
                        } else {
                            if (objM29917V0 == AbstractC6850f.f27469n) {
                                throw new IllegalStateException("unexpected");
                            }
                            c6857m4.m31437c();
                            InterfaceC5367l interfaceC5367l = this.f27451b;
                            interfaceC5372q = (InterfaceC5372q) (interfaceC5367l != null ? m29883B(interfaceC5367l) : null);
                        }
                    }
                } else {
                    c6857m.m31437c();
                    InterfaceC5367l interfaceC5367l2 = this.f27451b;
                    interfaceC5372q = (InterfaceC5372q) (interfaceC5367l2 != null ? m29883B(interfaceC5367l2) : null);
                }
                c6682pM28281b.mo28236e(objM29917V0, interfaceC5372q);
                break;
            }
            m29889F0(c6682pM28281b, c6857m, i7);
            Object objM28273y = c6682pM28281b.m28273y();
            if (objM28273y == AbstractC2005b.m8369e()) {
                AbstractC6093h.m27135c(interfaceC1875e);
            }
            return objM28273y;
        } catch (Throwable th) {
            c6682pM28281b.m28266M();
            throw th;
        }
    }

    /* JADX INFO: renamed from: J */
    private final C6857m m29895J(long j7) {
        C6857m c6857mM29890G = m29890G();
        if (mo29985p0()) {
            long jM29949r0 = m29949r0(c6857mM29890G);
            if (jM29949r0 != -1) {
                m29969L(jM29949r0);
            }
        }
        m29888F(c6857mM29890G, j7);
        return c6857mM29890G;
    }

    /* JADX INFO: renamed from: J0 */
    private final void m29896J0(C6857m c6857m) {
        InterfaceC5367l interfaceC5367l = this.f27451b;
        C7116P c7116pM31516b = null;
        Object objM31460b = AbstractC7126j.m31460b(null, 1, null);
        loop0: do {
            for (int i7 = AbstractC6850f.f27457b - 1; -1 < i7; i7--) {
                long j7 = (c6857m.f28391c * ((long) AbstractC6850f.f27457b)) + ((long) i7);
                while (true) {
                    Object objM30049B = c6857m.m30049B(i7);
                    if (objM30049B == AbstractC6850f.f27464i) {
                        break loop0;
                    }
                    if (objM30049B != AbstractC6850f.f27459d) {
                        if (objM30049B != AbstractC6850f.f27460e && objM30049B != null) {
                            if (!(objM30049B instanceof InterfaceC6654b1) && !(objM30049B instanceof C6869y)) {
                                if (objM30049B != AbstractC6850f.f27462g && objM30049B != AbstractC6850f.f27461f) {
                                    if (objM30049B != AbstractC6850f.f27462g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j7 < m29972Z()) {
                                    break loop0;
                                }
                                InterfaceC6654b1 interfaceC6654b1 = objM30049B instanceof C6869y ? ((C6869y) objM30049B).f27497a : (InterfaceC6654b1) objM30049B;
                                if (c6857m.m30056v(i7, objM30049B, AbstractC6850f.m30025z())) {
                                    if (interfaceC5367l != null) {
                                        c7116pM31516b = AbstractC7139w.m31516b(interfaceC5367l, c6857m.m30048A(i7), c7116pM31516b);
                                    }
                                    objM31460b = AbstractC7126j.m31461c(objM31460b, interfaceC6654b1);
                                    c6857m.m30057w(i7);
                                    c6857m.m31380t();
                                    break;
                                }
                            }
                        } else {
                            if (c6857m.m30056v(i7, objM30049B, AbstractC6850f.m30025z())) {
                                c6857m.m31380t();
                                break;
                            }
                        }
                    } else {
                        if (j7 < m29972Z()) {
                            break loop0;
                        }
                        if (c6857m.m30056v(i7, objM30049B, AbstractC6850f.m30025z())) {
                            if (interfaceC5367l != null) {
                                c7116pM31516b = AbstractC7139w.m31516b(interfaceC5367l, c6857m.m30048A(i7), c7116pM31516b);
                            }
                            c6857m.m30057w(i7);
                            c6857m.m31380t();
                            break;
                        }
                    }
                }
            }
            c6857m = (C6857m) c6857m.m31439h();
        } while (c6857m != null);
        if (objM31460b != null) {
            if (objM31460b instanceof ArrayList) {
                AbstractC6118n.m27185c(objM31460b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objM31460b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    m29899L0((InterfaceC6654b1) arrayList.get(size));
                }
            } else {
                m29899L0((InterfaceC6654b1) objM31460b);
            }
        }
        if (c7116pM31516b != null) {
            throw c7116pM31516b;
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m29897K() {
        m29984n0();
    }

    /* JADX INFO: renamed from: K0 */
    private final void m29898K0(InterfaceC6654b1 interfaceC6654b1) {
        m29901M0(interfaceC6654b1, true);
    }

    /* JADX INFO: renamed from: L0 */
    private final void m29899L0(InterfaceC6654b1 interfaceC6654b1) {
        m29901M0(interfaceC6654b1, false);
    }

    /* JADX INFO: renamed from: M */
    private final void m29900M() {
        if (m29947q0()) {
            return;
        }
        C6857m c6857m = (C6857m) f27447u.get(this);
        while (true) {
            long andIncrement = f27443f.getAndIncrement(this);
            int i7 = AbstractC6850f.f27457b;
            long j7 = andIncrement / ((long) i7);
            if (m29977d0() <= andIncrement) {
                if (c6857m.f28391c < j7 && c6857m.m31438f() != null) {
                    m29957v0(j7, c6857m);
                }
                m29935h0(this, 0L, 1, null);
                return;
            }
            if (c6857m.f28391c != j7) {
                C6857m c6857mM29902N = m29902N(j7, c6857m, andIncrement);
                if (c6857mM29902N == null) {
                    continue;
                } else {
                    c6857m = c6857mM29902N;
                }
            }
            if (m29913T0(c6857m, (int) (andIncrement % ((long) i7)), andIncrement)) {
                m29935h0(this, 0L, 1, null);
                return;
            }
            m29935h0(this, 0L, 1, null);
        }
    }

    /* JADX INFO: renamed from: M0 */
    private final void m29901M0(InterfaceC6654b1 interfaceC6654b1, boolean z7) {
        if (interfaceC6654b1 instanceof InterfaceC6678n) {
            InterfaceC1875e interfaceC1875e = (InterfaceC1875e) interfaceC6654b1;
            C1436n.a aVar = C1436n.f4958b;
            interfaceC1875e.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(z7 ? m29918W() : m29973a0())));
        } else {
            if (interfaceC6654b1 instanceof a) {
                ((a) interfaceC6654b1).m29995j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC6654b1).toString());
        }
    }

    /* JADX INFO: renamed from: N */
    private final C6857m m29902N(long j7, C6857m c6857m, long j8) {
        Object objM31430c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27447u;
        InterfaceC5371p interfaceC5371p = (InterfaceC5371p) AbstractC6850f.m30024y();
        loop0: while (true) {
            objM31430c = AbstractC7117a.m31430c(c6857m, j7, interfaceC5371p);
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
        if (AbstractC7102B.m31384c(objM31430c)) {
            m29897K();
            m29957v0(j7, c6857m);
            m29935h0(this, 0L, 1, null);
            return null;
        }
        C6857m c6857m2 = (C6857m) AbstractC7102B.m31383b(objM31430c);
        if (c6857m2.f28391c <= j7) {
            return c6857m2;
        }
        long j9 = c6857m2.f28391c;
        int i7 = AbstractC6850f.f27457b;
        if (f27443f.compareAndSet(this, j8 + 1, j9 * ((long) i7))) {
            m29933g0((c6857m2.f28391c * ((long) i7)) - j8);
        } else {
            m29935h0(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    static /* synthetic */ Object m29903N0(C6849e c6849e, Object obj, InterfaceC1875e interfaceC1875e) {
        C6857m c6857m;
        C6857m c6857m2 = (C6857m) m29927b0().get(c6849e);
        while (true) {
            long andIncrement = m29929c0().getAndIncrement(c6849e);
            long j7 = andIncrement & 1152921504606846975L;
            boolean zM29944o0 = c6849e.m29944o0(andIncrement);
            int i7 = AbstractC6850f.f27457b;
            long j8 = j7 / ((long) i7);
            int i8 = (int) (j7 % ((long) i7));
            if (c6857m2.f28391c != j8) {
                C6857m c6857mM29906P = c6849e.m29906P(j8, c6857m2);
                if (c6857mM29906P != null) {
                    c6857m = c6857mM29906P;
                } else if (zM29944o0) {
                    Object objM29964z0 = c6849e.m29964z0(obj, interfaceC1875e);
                    if (objM29964z0 != AbstractC2005b.m8369e()) {
                        break;
                    }
                    return objM29964z0;
                }
            } else {
                c6857m = c6857m2;
            }
            C6849e c6849e2 = c6849e;
            Object obj2 = obj;
            int iM29921X0 = c6849e2.m29921X0(c6857m, i8, obj2, j7, null, zM29944o0);
            if (iM29921X0 == 0) {
                c6857m.m31437c();
                break;
            }
            if (iM29921X0 != 1) {
                if (iM29921X0 == 2) {
                    if (!zM29944o0) {
                        break;
                    }
                    c6857m.m31380t();
                    Object objM29964z1 = c6849e2.m29964z0(obj2, interfaceC1875e);
                    if (objM29964z1 != AbstractC2005b.m8369e()) {
                        break;
                    }
                    return objM29964z1;
                }
                if (iM29921X0 == 3) {
                    Object objM29905O0 = c6849e2.m29905O0(c6857m, i8, obj2, j7, interfaceC1875e);
                    if (objM29905O0 != AbstractC2005b.m8369e()) {
                        break;
                    }
                    return objM29905O0;
                }
                if (iM29921X0 == 4) {
                    if (j7 < c6849e2.m29972Z()) {
                        c6857m.m31437c();
                    }
                    Object objM29964z2 = c6849e2.m29964z0(obj2, interfaceC1875e);
                    if (objM29964z2 != AbstractC2005b.m8369e()) {
                        break;
                    }
                    return objM29964z2;
                }
                if (iM29921X0 == 5) {
                    c6857m.m31437c();
                }
                c6849e = c6849e2;
                c6857m2 = c6857m;
                obj = obj2;
            } else {
                break;
            }
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final C6857m m29904O(long j7, C6857m c6857m) {
        Object objM31430c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27446t;
        InterfaceC5371p interfaceC5371p = (InterfaceC5371p) AbstractC6850f.m30024y();
        loop0: while (true) {
            objM31430c = AbstractC7117a.m31430c(c6857m, j7, interfaceC5371p);
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
        if (AbstractC7102B.m31384c(objM31430c)) {
            m29897K();
            if (c6857m.f28391c * ((long) AbstractC6850f.f27457b) < m29977d0()) {
                c6857m.m31437c();
            }
            return null;
        }
        C6857m c6857m2 = (C6857m) AbstractC7102B.m31383b(objM31430c);
        if (!m29947q0() && j7 <= m29910R() / ((long) AbstractC6850f.f27457b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f27447u;
            while (true) {
                AbstractC7101A abstractC7101A2 = (AbstractC7101A) atomicReferenceFieldUpdater2.get(this);
                if (abstractC7101A2.f28391c >= c6857m2.f28391c || !c6857m2.m31381u()) {
                    break;
                }
                if (AbstractC2404b.m10339a(atomicReferenceFieldUpdater2, this, abstractC7101A2, c6857m2)) {
                    if (!abstractC7101A2.m31379p()) {
                        break;
                    }
                    abstractC7101A2.m31442n();
                    break;
                }
                if (c6857m2.m31379p()) {
                    c6857m2.m31442n();
                }
            }
        }
        long j8 = c6857m2.f28391c;
        if (j8 <= j7) {
            return c6857m2;
        }
        int i7 = AbstractC6850f.f27457b;
        m29924Z0(j8 * ((long) i7));
        if (c6857m2.f28391c * ((long) i7) < m29977d0()) {
            c6857m2.m31437c();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0100  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x010a  */
    /* JADX INFO: renamed from: O0 */
    private final Object m29905O0(C6857m c6857m, int i7, Object obj, long j7, InterfaceC1875e interfaceC1875e) {
        Object objM6073b;
        Object objM28273y;
        C6857m c6857mM29906P;
        C6682p c6682pM28281b = AbstractC6686r.m28281b(AbstractC2005b.m8367c(interfaceC1875e));
        try {
            int iM29921X0 = m29921X0(c6857m, i7, obj, j7, c6682pM28281b, false);
            if (iM29921X0 == 0) {
                c6857m.m31437c();
                C1436n.a aVar = C1436n.f4958b;
                objM6073b = C1436n.m6073b(C1444v.f4971a);
            } else {
                if (iM29921X0 != 1) {
                    if (iM29921X0 != 2) {
                        if (iM29921X0 != 4) {
                            String str = "unexpected";
                            if (iM29921X0 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            c6857m.m31437c();
                            C6857m c6857m2 = (C6857m) m29927b0().get(this);
                            while (true) {
                                long andIncrement = m29929c0().getAndIncrement(this);
                                long j8 = 1152921504606846975L & andIncrement;
                                boolean zM29944o0 = m29944o0(andIncrement);
                                int i8 = AbstractC6850f.f27457b;
                                long j9 = j8 / ((long) i8);
                                int i9 = (int) (j8 % ((long) i8));
                                str = str;
                                if (c6857m2.f28391c != j9) {
                                    c6857mM29906P = m29906P(j9, c6857m2);
                                    if (c6857mM29906P == null) {
                                        if (zM29944o0) {
                                        }
                                    }
                                } else {
                                    c6857mM29906P = c6857m2;
                                }
                                int iM29921X1 = m29921X0(c6857mM29906P, i9, obj, j8, c6682pM28281b, zM29944o0);
                                if (iM29921X1 == 0) {
                                    c6857mM29906P.m31437c();
                                    C1436n.a aVar2 = C1436n.f4958b;
                                    objM6073b = C1436n.m6073b(C1444v.f4971a);
                                } else if (iM29921X1 == 1) {
                                    C1436n.a aVar3 = C1436n.f4958b;
                                    objM6073b = C1436n.m6073b(C1444v.f4971a);
                                } else if (iM29921X1 == 2) {
                                    if (!zM29944o0) {
                                        C6682p c6682p = c6682pM28281b != null ? c6682pM28281b : null;
                                        if (c6682p == null) {
                                            break;
                                        }
                                        m29891G0(c6682p, c6857mM29906P, i9);
                                        break;
                                    }
                                    c6857mM29906P.m31380t();
                                } else {
                                    if (iM29921X1 == 3) {
                                        throw new IllegalStateException(str);
                                    }
                                    if (iM29921X1 != 4) {
                                        if (iM29921X1 == 5) {
                                            c6857mM29906P.m31437c();
                                        }
                                        c6857m2 = c6857mM29906P;
                                    } else if (j8 < m29972Z()) {
                                        c6857mM29906P.m31437c();
                                    }
                                }
                            }
                        } else if (j7 < m29972Z()) {
                            c6857m.m31437c();
                        }
                        m29882A0(obj, c6682pM28281b);
                        break;
                    } else {
                        m29891G0(c6682pM28281b, c6857m, i7);
                    }
                    objM28273y = c6682pM28281b.m28273y();
                    if (objM28273y == AbstractC2005b.m8369e()) {
                        AbstractC6093h.m27135c(interfaceC1875e);
                    }
                    if (objM28273y == AbstractC2005b.m8369e()) {
                        return objM28273y;
                    }
                    return C1444v.f4971a;
                }
                C1436n.a aVar4 = C1436n.f4958b;
                objM6073b = C1436n.m6073b(C1444v.f4971a);
            }
            c6682pM28281b.resumeWith(objM6073b);
            objM28273y = c6682pM28281b.m28273y();
            if (objM28273y == AbstractC2005b.m8369e()) {
                AbstractC6093h.m27135c(interfaceC1875e);
            }
            if (objM28273y == AbstractC2005b.m8369e()) {
                return objM28273y;
            }
            return C1444v.f4971a;
        } catch (Throwable th) {
            c6682pM28281b.m28266M();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final C6857m m29906P(long j7, C6857m c6857m) {
        Object objM31430c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27445s;
        InterfaceC5371p interfaceC5371p = (InterfaceC5371p) AbstractC6850f.m30024y();
        loop0: while (true) {
            objM31430c = AbstractC7117a.m31430c(c6857m, j7, interfaceC5371p);
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
        if (AbstractC7102B.m31384c(objM31430c)) {
            m29897K();
            if (c6857m.f28391c * ((long) AbstractC6850f.f27457b) < m29972Z()) {
                c6857m.m31437c();
            }
            return null;
        }
        C6857m c6857m2 = (C6857m) AbstractC7102B.m31383b(objM31430c);
        long j8 = c6857m2.f28391c;
        if (j8 <= j7) {
            return c6857m2;
        }
        int i7 = AbstractC6850f.f27457b;
        m29926a1(j8 * ((long) i7));
        if (c6857m2.f28391c * ((long) i7) < m29972Z()) {
            c6857m2.m31437c();
        }
        return null;
    }

    /* JADX INFO: renamed from: P0 */
    private final boolean m29907P0(long j7) {
        if (m29944o0(j7)) {
            return false;
        }
        return !m29885D(j7 & 1152921504606846975L);
    }

    /* JADX INFO: renamed from: Q0 */
    private final boolean m29909Q0(Object obj, Object obj2) {
        if (obj instanceof a) {
            AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).m29994i(obj2);
        }
        if (obj instanceof InterfaceC6678n) {
            AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC6678n interfaceC6678n = (InterfaceC6678n) obj;
            InterfaceC5367l interfaceC5367l = this.f27451b;
            return AbstractC6850f.m29998B(interfaceC6678n, obj2, (InterfaceC5372q) (interfaceC5367l != null ? m29883B(interfaceC5367l) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    /* JADX INFO: renamed from: R */
    private final long m29910R() {
        return f27443f.get(this);
    }

    /* JADX INFO: renamed from: R0 */
    private final boolean m29911R0(Object obj, C6857m c6857m, int i7) {
        if (obj instanceof InterfaceC6678n) {
            AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return AbstractC6850f.m29999C((InterfaceC6678n) obj, C1444v.f4971a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX INFO: renamed from: T0 */
    private final boolean m29913T0(C6857m c6857m, int i7, long j7) {
        Object objM30049B = c6857m.m30049B(i7);
        if (!(objM30049B instanceof InterfaceC6654b1) || j7 < f27442e.get(this) || !c6857m.m30056v(i7, objM30049B, AbstractC6850f.f27462g)) {
            return m29915U0(c6857m, i7, j7);
        }
        if (m29911R0(objM30049B, c6857m, i7)) {
            c6857m.m30052F(i7, AbstractC6850f.f27459d);
            return true;
        }
        c6857m.m30052F(i7, AbstractC6850f.f27465j);
        c6857m.m30050C(i7, false);
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    private final boolean m29915U0(C6857m c6857m, int i7, long j7) {
        while (true) {
            Object objM30049B = c6857m.m30049B(i7);
            if (objM30049B instanceof InterfaceC6654b1) {
                if (j7 < f27442e.get(this)) {
                    if (c6857m.m30056v(i7, objM30049B, new C6869y((InterfaceC6654b1) objM30049B))) {
                        return true;
                    }
                } else if (c6857m.m30056v(i7, objM30049B, AbstractC6850f.f27462g)) {
                    if (m29911R0(objM30049B, c6857m, i7)) {
                        c6857m.m30052F(i7, AbstractC6850f.f27459d);
                        return true;
                    }
                    c6857m.m30052F(i7, AbstractC6850f.f27465j);
                    c6857m.m30050C(i7, false);
                    return false;
                }
            } else {
                if (objM30049B == AbstractC6850f.f27465j) {
                    return false;
                }
                if (objM30049B == null) {
                    if (c6857m.m30056v(i7, objM30049B, AbstractC6850f.f27460e)) {
                        return true;
                    }
                } else {
                    if (objM30049B == AbstractC6850f.f27459d || objM30049B == AbstractC6850f.f27463h || objM30049B == AbstractC6850f.f27464i || objM30049B == AbstractC6850f.f27466k || objM30049B == AbstractC6850f.m30025z()) {
                        return true;
                    }
                    if (objM30049B != AbstractC6850f.f27461f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objM30049B).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public final Object m29917V0(C6857m c6857m, int i7, long j7, Object obj) {
        Object objM30049B = c6857m.m30049B(i7);
        if (objM30049B == null) {
            if (j7 >= (f27441d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC6850f.f27469n;
                }
                if (c6857m.m30056v(i7, objM30049B, obj)) {
                    m29900M();
                    return AbstractC6850f.f27468m;
                }
            }
        } else if (objM30049B == AbstractC6850f.f27459d && c6857m.m30056v(i7, objM30049B, AbstractC6850f.f27464i)) {
            m29900M();
            return c6857m.m30051D(i7);
        }
        return m29919W0(c6857m, i7, j7, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final Throwable m29918W() {
        Throwable thM29971T = m29971T();
        return thM29971T == null ? new C6861q("Channel was closed") : thM29971T;
    }

    /* JADX INFO: renamed from: W0 */
    private final Object m29919W0(C6857m c6857m, int i7, long j7, Object obj) {
        while (true) {
            Object objM30049B = c6857m.m30049B(i7);
            if (objM30049B == null || objM30049B == AbstractC6850f.f27460e) {
                if (j7 < (f27441d.get(this) & 1152921504606846975L)) {
                    if (c6857m.m30056v(i7, objM30049B, AbstractC6850f.f27463h)) {
                        m29900M();
                        return AbstractC6850f.f27470o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC6850f.f27469n;
                    }
                    if (c6857m.m30056v(i7, objM30049B, obj)) {
                        m29900M();
                        return AbstractC6850f.f27468m;
                    }
                }
            } else {
                if (objM30049B != AbstractC6850f.f27459d) {
                    if (objM30049B != AbstractC6850f.f27465j && objM30049B != AbstractC6850f.f27463h) {
                        if (objM30049B == AbstractC6850f.m30025z()) {
                            m29900M();
                            return AbstractC6850f.f27470o;
                        }
                        if (objM30049B != AbstractC6850f.f27462g && c6857m.m30056v(i7, objM30049B, AbstractC6850f.f27461f)) {
                            boolean z7 = objM30049B instanceof C6869y;
                            if (z7) {
                                objM30049B = ((C6869y) objM30049B).f27497a;
                            }
                            if (m29911R0(objM30049B, c6857m, i7)) {
                                c6857m.m30052F(i7, AbstractC6850f.f27464i);
                                m29900M();
                                return c6857m.m30051D(i7);
                            }
                            c6857m.m30052F(i7, AbstractC6850f.f27465j);
                            c6857m.m30050C(i7, false);
                            if (z7) {
                                m29900M();
                            }
                            return AbstractC6850f.f27470o;
                        }
                    }
                    return AbstractC6850f.f27470o;
                }
                if (c6857m.m30056v(i7, objM30049B, AbstractC6850f.f27464i)) {
                    m29900M();
                    return c6857m.m30051D(i7);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m29920X() {
        return f27446t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public final int m29921X0(C6857m c6857m, int i7, Object obj, long j7, Object obj2, boolean z7) {
        c6857m.m30053G(i7, obj);
        if (z7) {
            return m29923Y0(c6857m, i7, obj, j7, obj2, z7);
        }
        Object objM30049B = c6857m.m30049B(i7);
        if (objM30049B == null) {
            if (m29885D(j7)) {
                if (c6857m.m30056v(i7, null, AbstractC6850f.f27459d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c6857m.m30056v(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM30049B instanceof InterfaceC6654b1) {
            c6857m.m30057w(i7);
            if (m29909Q0(objM30049B, obj)) {
                c6857m.m30052F(i7, AbstractC6850f.f27464i);
                m29965B0();
                return 0;
            }
            if (c6857m.m30058x(i7, AbstractC6850f.f27466k) == AbstractC6850f.f27466k) {
                return 5;
            }
            c6857m.m30050C(i7, true);
            return 5;
        }
        return m29923Y0(c6857m, i7, obj, j7, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ AtomicLongFieldUpdater m29922Y() {
        return f27442e;
    }

    /* JADX INFO: renamed from: Y0 */
    private final int m29923Y0(C6857m c6857m, int i7, Object obj, long j7, Object obj2, boolean z7) {
        while (true) {
            Object objM30049B = c6857m.m30049B(i7);
            if (objM30049B == null) {
                if (!m29885D(j7) || z7) {
                    if (z7) {
                        if (c6857m.m30056v(i7, null, AbstractC6850f.f27465j)) {
                            c6857m.m30050C(i7, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c6857m.m30056v(i7, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c6857m.m30056v(i7, null, AbstractC6850f.f27459d)) {
                    return 1;
                }
            } else {
                if (objM30049B != AbstractC6850f.f27460e) {
                    if (objM30049B == AbstractC6850f.f27466k) {
                        c6857m.m30057w(i7);
                        return 5;
                    }
                    if (objM30049B == AbstractC6850f.f27463h) {
                        c6857m.m30057w(i7);
                        return 5;
                    }
                    if (objM30049B == AbstractC6850f.m30025z()) {
                        c6857m.m30057w(i7);
                        m29897K();
                        return 4;
                    }
                    c6857m.m30057w(i7);
                    if (objM30049B instanceof C6869y) {
                        objM30049B = ((C6869y) objM30049B).f27497a;
                    }
                    if (m29909Q0(objM30049B, obj)) {
                        c6857m.m30052F(i7, AbstractC6850f.f27464i);
                        m29965B0();
                        return 0;
                    }
                    if (c6857m.m30058x(i7, AbstractC6850f.f27466k) != AbstractC6850f.f27466k) {
                        c6857m.m30050C(i7, true);
                    }
                    return 5;
                }
                if (c6857m.m30056v(i7, objM30049B, AbstractC6850f.f27459d)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m29924Z0(long j7) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27442e;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            if (j8 >= j7) {
                return;
            }
            long j9 = j7;
            if (f27442e.compareAndSet(this, j8, j9)) {
                return;
            } else {
                j7 = j9;
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    private final void m29926a1(long j7) {
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27441d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            j9 = 1152921504606846975L & j8;
            if (j9 >= j7) {
                return;
            }
        } while (!f27441d.compareAndSet(this, j8, AbstractC6850f.m30022w(j9, (int) (j8 >> 60))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m29927b0() {
        return f27445s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m29929c0() {
        return f27441d;
    }

    /* JADX INFO: renamed from: g0 */
    private final void m29933g0(long j7) {
        if ((f27444r.addAndGet(this, j7) & 4611686018427387904L) != 0) {
            while ((f27444r.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    static /* synthetic */ void m29935h0(C6849e c6849e, long j7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i7 & 1) != 0) {
            j7 = 1;
        }
        c6849e.m29933g0(j7);
    }

    /* JADX INFO: renamed from: i0 */
    private final void m29936i0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27449w;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractC2404b.m10339a(atomicReferenceFieldUpdater, this, obj, obj == null ? AbstractC6850f.f27472q : AbstractC6850f.f27473r));
        if (obj == null) {
            return;
        }
        ((InterfaceC5367l) obj).invoke(m29971T());
    }

    /* JADX INFO: renamed from: j0 */
    private final boolean m29937j0(C6857m c6857m, int i7, long j7) {
        Object objM30049B;
        do {
            objM30049B = c6857m.m30049B(i7);
            if (objM30049B != null && objM30049B != AbstractC6850f.f27460e) {
                if (objM30049B == AbstractC6850f.f27459d) {
                    return true;
                }
                if (objM30049B == AbstractC6850f.f27465j || objM30049B == AbstractC6850f.m30025z() || objM30049B == AbstractC6850f.f27464i || objM30049B == AbstractC6850f.f27463h) {
                    return false;
                }
                if (objM30049B == AbstractC6850f.f27462g) {
                    return true;
                }
                return objM30049B != AbstractC6850f.f27461f && j7 == m29972Z();
            }
        } while (!c6857m.m30056v(i7, objM30049B, AbstractC6850f.f27463h));
        m29900M();
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    private final boolean m29938k0(long j7, boolean z7) {
        int i7 = (int) (j7 >> 60);
        if (i7 == 0 || i7 == 1) {
            return false;
        }
        if (i7 == 2) {
            m29895J(j7 & 1152921504606846975L);
            return (z7 && m29978f0()) ? false : true;
        }
        if (i7 == 3) {
            m29893I(j7 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i7).toString());
    }

    /* JADX INFO: renamed from: m0 */
    private final boolean m29941m0(long j7) {
        return m29938k0(j7, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public final boolean m29944o0(long j7) {
        return m29938k0(j7, false);
    }

    /* JADX INFO: renamed from: q0 */
    private final boolean m29947q0() {
        long jM29910R = m29910R();
        return jM29910R == 0 || jM29910R == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: r0 */
    private final long m29949r0(C6857m c6857m) {
        do {
            int i7 = AbstractC6850f.f27457b;
            while (true) {
                i7--;
                if (-1 < i7) {
                    long j7 = (c6857m.f28391c * ((long) AbstractC6850f.f27457b)) + ((long) i7);
                    if (j7 >= m29972Z()) {
                        while (true) {
                            Object objM30049B = c6857m.m30049B(i7);
                            if (objM30049B != null && objM30049B != AbstractC6850f.f27460e) {
                                if (objM30049B != AbstractC6850f.f27459d) {
                                    break;
                                }
                                return j7;
                            }
                            if (c6857m.m30056v(i7, objM30049B, AbstractC6850f.m30025z())) {
                                c6857m.m31380t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            c6857m = (C6857m) c6857m.m31439h();
        } while (c6857m != null);
        return -1L;
    }

    /* JADX INFO: renamed from: s0 */
    private final void m29951s0() {
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27441d;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if (((int) (j7 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, AbstractC6850f.m30022w(1152921504606846975L & j7, 1)));
    }

    /* JADX INFO: renamed from: t0 */
    private final void m29953t0() {
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27441d;
        do {
            j7 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, AbstractC6850f.m30022w(1152921504606846975L & j7, 3)));
    }

    /* JADX INFO: renamed from: u0 */
    private final void m29955u0() {
        long j7;
        long jM30022w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27441d;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            int i7 = (int) (j7 >> 60);
            if (i7 == 0) {
                jM30022w = AbstractC6850f.m30022w(1152921504606846975L & j7, 2);
            } else if (i7 != 1) {
                return;
            } else {
                jM30022w = AbstractC6850f.m30022w(1152921504606846975L & j7, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, jM30022w));
    }

    /* JADX INFO: renamed from: v0 */
    private final void m29957v0(long j7, C6857m c6857m) {
        C6857m c6857m2;
        C6857m c6857m3;
        while (c6857m.f28391c < j7 && (c6857m3 = (C6857m) c6857m.m31438f()) != null) {
            c6857m = c6857m3;
        }
        while (true) {
            if (!c6857m.mo31378k() || (c6857m2 = (C6857m) c6857m.m31438f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27447u;
                while (true) {
                    AbstractC7101A abstractC7101A = (AbstractC7101A) atomicReferenceFieldUpdater.get(this);
                    if (abstractC7101A.f28391c >= c6857m.f28391c) {
                        return;
                    }
                    if (!c6857m.m31381u()) {
                        break;
                    }
                    if (AbstractC2404b.m10339a(atomicReferenceFieldUpdater, this, abstractC7101A, c6857m)) {
                        if (abstractC7101A.m31379p()) {
                            abstractC7101A.m31442n();
                            return;
                        }
                        return;
                    } else if (c6857m.m31379p()) {
                        c6857m.m31442n();
                    }
                }
            } else {
                c6857m = c6857m2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public final void m29959w0(Throwable th, Object obj, InterfaceC1879i interfaceC1879i) {
        InterfaceC5367l interfaceC5367l = this.f27451b;
        AbstractC6118n.m27184b(interfaceC5367l);
        AbstractC7139w.m31515a(interfaceC5367l, obj, interfaceC1879i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public final void m29962y0(InterfaceC6678n interfaceC6678n) {
        C1436n.a aVar = C1436n.f4958b;
        interfaceC6678n.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(m29918W())));
    }

    /* JADX INFO: renamed from: z0 */
    private final Object m29964z0(Object obj, InterfaceC1875e interfaceC1875e) {
        C7116P c7116pM31517c;
        C6682p c6682p = new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1);
        c6682p.m28263E();
        InterfaceC5367l interfaceC5367l = this.f27451b;
        if (interfaceC5367l == null || (c7116pM31517c = AbstractC7139w.m31517c(interfaceC5367l, obj, null, 2, null)) == null) {
            Throwable thM29973a0 = m29973a0();
            C1436n.a aVar = C1436n.f4958b;
            c6682p.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(thM29973a0)));
        } else {
            AbstractC1423a.m6060a(c7116pM31517c, m29973a0());
            C1436n.a aVar2 = C1436n.f4958b;
            c6682p.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(c7116pM31517c)));
        }
        Object objM28273y = c6682p.m28273y();
        if (objM28273y == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM28273y == AbstractC2005b.m8369e() ? objM28273y : C1444v.f4971a;
    }

    /* JADX INFO: renamed from: B0 */
    protected void m29965B0() {
    }

    /* JADX INFO: renamed from: C0 */
    protected void m29966C0() {
    }

    /* JADX INFO: renamed from: E */
    public boolean m29967E(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return m29968H(th, true);
    }

    /* JADX INFO: renamed from: H */
    protected boolean m29968H(Throwable th, boolean z7) {
        if (z7) {
            m29951s0();
        }
        boolean zM10339a = AbstractC2404b.m10339a(f27448v, this, AbstractC6850f.f27474s, th);
        if (z7) {
            m29953t0();
        } else {
            m29955u0();
        }
        m29897K();
        m29986x0();
        if (zM10339a) {
            m29936i0();
        }
        return zM10339a;
    }

    /* JADX INFO: renamed from: L */
    protected final void m29969L(long j7) {
        C6857m c6857mM29904O;
        C7116P c7116pM31517c;
        C6857m c6857m = (C6857m) f27446t.get(this);
        while (true) {
            long j8 = f27442e.get(this);
            if (j7 < Math.max(((long) this.f27450a) + j8, m29910R())) {
                return;
            }
            if (f27442e.compareAndSet(this, j8, 1 + j8)) {
                int i7 = AbstractC6850f.f27457b;
                long j9 = j8 / ((long) i7);
                int i8 = (int) (j8 % ((long) i7));
                if (c6857m.f28391c != j9) {
                    c6857mM29904O = m29904O(j9, c6857m);
                    if (c6857mM29904O == null) {
                        continue;
                    }
                } else {
                    c6857mM29904O = c6857m;
                }
                Object objM29917V0 = m29917V0(c6857mM29904O, i8, j8, null);
                if (objM29917V0 != AbstractC6850f.f27470o) {
                    c6857mM29904O.m31437c();
                    InterfaceC5367l interfaceC5367l = this.f27451b;
                    if (interfaceC5367l != null && (c7116pM31517c = AbstractC7139w.m31517c(interfaceC5367l, objM29917V0, null, 2, null)) != null) {
                        throw c7116pM31517c;
                    }
                } else if (j8 < m29977d0()) {
                    c6857mM29904O.m31437c();
                }
                c6857m = c6857mM29904O;
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    protected final Object m29970S0(Object obj) {
        C6857m c6857mM29906P;
        Object obj2 = AbstractC6850f.f27459d;
        C6857m c6857m = (C6857m) m29927b0().get(this);
        while (true) {
            long andIncrement = m29929c0().getAndIncrement(this);
            long j7 = andIncrement & 1152921504606846975L;
            boolean zM29944o0 = m29944o0(andIncrement);
            int i7 = AbstractC6850f.f27457b;
            long j8 = j7 / ((long) i7);
            int i8 = (int) (j7 % ((long) i7));
            if (c6857m.f28391c != j8) {
                c6857mM29906P = m29906P(j8, c6857m);
                if (c6857mM29906P == null) {
                    if (zM29944o0) {
                        return C6855k.f27480b.m30042a(m29973a0());
                    }
                }
            } else {
                c6857mM29906P = c6857m;
            }
            Object obj3 = obj;
            int iM29921X0 = m29921X0(c6857mM29906P, i8, obj3, j7, obj2, zM29944o0);
            c6857m = c6857mM29906P;
            if (iM29921X0 == 0) {
                c6857m.m31437c();
                return C6855k.f27480b.m30044c(C1444v.f4971a);
            }
            if (iM29921X0 == 1) {
                return C6855k.f27480b.m30044c(C1444v.f4971a);
            }
            if (iM29921X0 == 2) {
                if (zM29944o0) {
                    c6857m.m31380t();
                    return C6855k.f27480b.m30042a(m29973a0());
                }
                InterfaceC6654b1 interfaceC6654b1 = obj2 instanceof InterfaceC6654b1 ? (InterfaceC6654b1) obj2 : null;
                if (interfaceC6654b1 != null) {
                    m29891G0(interfaceC6654b1, c6857m, i8);
                }
                m29969L((c6857m.f28391c * ((long) i7)) + ((long) i8));
                return C6855k.f27480b.m30044c(C1444v.f4971a);
            }
            if (iM29921X0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM29921X0 == 4) {
                if (j7 < m29972Z()) {
                    c6857m.m31437c();
                }
                return C6855k.f27480b.m30042a(m29973a0());
            }
            if (iM29921X0 == 5) {
                c6857m.m31437c();
            }
            obj = obj3;
        }
    }

    /* JADX INFO: renamed from: T */
    protected final Throwable m29971T() {
        return (Throwable) f27448v.get(this);
    }

    /* JADX INFO: renamed from: Z */
    public final long m29972Z() {
        return f27442e.get(this);
    }

    /* JADX INFO: renamed from: a0 */
    protected final Throwable m29973a0() {
        Throwable thM29971T = m29971T();
        return thM29971T == null ? new C6862r("Channel was closed") : thM29971T;
    }

    @Override // p336q6.InterfaceC6867w
    /* JADX INFO: renamed from: b */
    public Object mo29974b() {
        C6857m c6857mM29904O;
        long j7 = f27442e.get(this);
        long j8 = f27441d.get(this);
        if (m29941m0(j8)) {
            return C6855k.f27480b.m30042a(m29971T());
        }
        if (j7 >= (j8 & 1152921504606846975L)) {
            return C6855k.f27480b.m30043b();
        }
        Object obj = AbstractC6850f.f27466k;
        C6857m c6857m = (C6857m) m29920X().get(this);
        while (!m29983l0()) {
            long andIncrement = m29922Y().getAndIncrement(this);
            int i7 = AbstractC6850f.f27457b;
            long j9 = andIncrement / ((long) i7);
            int i8 = (int) (andIncrement % ((long) i7));
            if (c6857m.f28391c != j9) {
                c6857mM29904O = m29904O(j9, c6857m);
                if (c6857mM29904O == null) {
                    continue;
                }
            } else {
                c6857mM29904O = c6857m;
            }
            Object objM29917V0 = m29917V0(c6857mM29904O, i8, andIncrement, obj);
            if (objM29917V0 == AbstractC6850f.f27468m) {
                InterfaceC6654b1 interfaceC6654b1 = obj instanceof InterfaceC6654b1 ? (InterfaceC6654b1) obj : null;
                if (interfaceC6654b1 != null) {
                    m29889F0(interfaceC6654b1, c6857mM29904O, i8);
                }
                m29975b1(andIncrement);
                c6857mM29904O.m31380t();
                return C6855k.f27480b.m30043b();
            }
            if (objM29917V0 != AbstractC6850f.f27470o) {
                if (objM29917V0 == AbstractC6850f.f27469n) {
                    throw new IllegalStateException("unexpected");
                }
                c6857mM29904O.m31437c();
                return C6855k.f27480b.m30044c(objM29917V0);
            }
            if (andIncrement < m29977d0()) {
                c6857mM29904O.m31437c();
            }
            c6857m = c6857mM29904O;
        }
        return C6855k.f27480b.m30042a(m29971T());
    }

    /* JADX INFO: renamed from: b1 */
    public final void m29975b1(long j7) {
        C6849e c6849e = this;
        if (c6849e.m29947q0()) {
            return;
        }
        while (c6849e.m29910R() <= j7) {
            c6849e = this;
        }
        int i7 = AbstractC6850f.f27458c;
        for (int i8 = 0; i8 < i7; i8++) {
            long jM29910R = c6849e.m29910R();
            if (jM29910R == (4611686018427387903L & f27444r.get(c6849e)) && jM29910R == c6849e.m29910R()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27444r;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(c6849e);
            if (atomicLongFieldUpdater.compareAndSet(c6849e, j8, AbstractC6850f.m30021v(j8 & 4611686018427387903L, true))) {
                break;
            } else {
                c6849e = this;
            }
        }
        while (true) {
            long jM29910R2 = c6849e.m29910R();
            long j9 = f27444r.get(c6849e);
            long j10 = j9 & 4611686018427387903L;
            boolean z7 = (4611686018427387904L & j9) != 0;
            if (jM29910R2 == j10 && jM29910R2 == c6849e.m29910R()) {
                break;
            }
            if (z7) {
                c6849e = this;
            } else {
                c6849e = this;
                f27444r.compareAndSet(c6849e, j9, AbstractC6850f.m30021v(j10, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f27444r;
        while (true) {
            long j11 = atomicLongFieldUpdater2.get(c6849e);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(c6849e, j11, AbstractC6850f.m30021v(j11 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            c6849e = this;
        }
    }

    @Override // p336q6.InterfaceC6867w
    public final void cancel(CancellationException cancellationException) {
        m29967E(cancellationException);
    }

    @Override // p336q6.InterfaceC6867w
    /* JADX INFO: renamed from: d */
    public Object mo29976d(InterfaceC1875e interfaceC1875e) {
        return m29892H0(this, interfaceC1875e);
    }

    /* JADX INFO: renamed from: d0 */
    public final long m29977d0() {
        return f27441d.get(this) & 1152921504606846975L;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m29978f0() {
        while (true) {
            C6857m c6857mM29904O = (C6857m) f27446t.get(this);
            long jM29972Z = m29972Z();
            if (m29977d0() <= jM29972Z) {
                return false;
            }
            int i7 = AbstractC6850f.f27457b;
            long j7 = jM29972Z / ((long) i7);
            if (c6857mM29904O.f28391c == j7 || (c6857mM29904O = m29904O(j7, c6857mM29904O)) != null) {
                c6857mM29904O.m31437c();
                if (m29937j0(c6857mM29904O, (int) (jM29972Z % ((long) i7)), jM29972Z)) {
                    return true;
                }
                f27442e.compareAndSet(this, jM29972Z, 1 + jM29972Z);
            } else if (((C6857m) f27446t.get(this)).f28391c < j7) {
                return false;
            }
        }
    }

    @Override // p336q6.InterfaceC6868x
    /* JADX INFO: renamed from: g */
    public boolean mo29979g(Throwable th) {
        return m29968H(th, false);
    }

    @Override // p336q6.InterfaceC6868x
    /* JADX INFO: renamed from: i */
    public Object mo29980i(Object obj, InterfaceC1875e interfaceC1875e) {
        return m29903N0(this, obj, interfaceC1875e);
    }

    @Override // p336q6.InterfaceC6867w
    public InterfaceC6853i iterator() {
        return new a();
    }

    @Override // p336q6.InterfaceC6868x
    /* JADX INFO: renamed from: j */
    public void mo29981j(InterfaceC5367l interfaceC5367l) {
        if (AbstractC2404b.m10339a(f27449w, this, null, interfaceC5367l)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27449w;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != AbstractC6850f.f27472q) {
                if (obj == AbstractC6850f.f27473r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!AbstractC2404b.m10339a(f27449w, this, AbstractC6850f.f27472q, AbstractC6850f.f27473r));
        interfaceC5367l.invoke(m29971T());
    }

    @Override // p336q6.InterfaceC6868x
    /* JADX INFO: renamed from: k */
    public Object mo29982k(Object obj) {
        C6857m c6857m;
        if (m29907P0(f27441d.get(this))) {
            return C6855k.f27480b.m30043b();
        }
        Object obj2 = AbstractC6850f.f27465j;
        C6857m c6857m2 = (C6857m) m29927b0().get(this);
        while (true) {
            long andIncrement = m29929c0().getAndIncrement(this);
            long j7 = andIncrement & 1152921504606846975L;
            boolean zM29944o0 = m29944o0(andIncrement);
            int i7 = AbstractC6850f.f27457b;
            long j8 = j7 / ((long) i7);
            int i8 = (int) (j7 % ((long) i7));
            if (c6857m2.f28391c != j8) {
                C6857m c6857mM29906P = m29906P(j8, c6857m2);
                if (c6857mM29906P != null) {
                    c6857m = c6857mM29906P;
                } else if (zM29944o0) {
                    return C6855k.f27480b.m30042a(m29973a0());
                }
            } else {
                c6857m = c6857m2;
            }
            int iM29921X0 = m29921X0(c6857m, i8, obj, j7, obj2, zM29944o0);
            c6857m2 = c6857m;
            if (iM29921X0 == 0) {
                c6857m2.m31437c();
                return C6855k.f27480b.m30044c(C1444v.f4971a);
            }
            if (iM29921X0 == 1) {
                return C6855k.f27480b.m30044c(C1444v.f4971a);
            }
            if (iM29921X0 == 2) {
                if (zM29944o0) {
                    c6857m2.m31380t();
                    return C6855k.f27480b.m30042a(m29973a0());
                }
                InterfaceC6654b1 interfaceC6654b1 = obj2 instanceof InterfaceC6654b1 ? (InterfaceC6654b1) obj2 : null;
                if (interfaceC6654b1 != null) {
                    m29891G0(interfaceC6654b1, c6857m2, i8);
                }
                c6857m2.m31380t();
                return C6855k.f27480b.m30043b();
            }
            if (iM29921X0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM29921X0 == 4) {
                if (j7 < m29972Z()) {
                    c6857m2.m31437c();
                }
                return C6855k.f27480b.m30042a(m29973a0());
            }
            if (iM29921X0 == 5) {
                c6857m2.m31437c();
            }
            obj = obj;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m29983l0() {
        return m29941m0(f27441d.get(this));
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m29984n0() {
        return m29944o0(f27441d.get(this));
    }

    /* JADX INFO: renamed from: p0 */
    protected boolean mo29985p0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i7 = (int) (f27441d.get(this) >> 60);
        if (i7 == 2) {
            sb.append("closed,");
        } else if (i7 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f27450a + ',');
        sb.append("data=[");
        int i8 = 0;
        boolean z7 = true;
        List listL = AbstractC1638q.m6767l(f27446t.get(this), f27445s.get(this), f27447u.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (((C6857m) obj) != AbstractC6850f.f27456a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j7 = ((C6857m) next).f28391c;
            do {
                Object next2 = it.next();
                long j8 = ((C6857m) next2).f28391c;
                if (j7 > j8) {
                    next = next2;
                    j7 = j8;
                }
            } while (it.hasNext());
        }
        C6857m c6857m = (C6857m) next;
        long jM29972Z = m29972Z();
        long jM29977d0 = m29977d0();
        loop2: while (true) {
            int i9 = AbstractC6850f.f27457b;
            int i10 = i8;
            while (i10 < i9) {
                long j9 = (c6857m.f28391c * ((long) AbstractC6850f.f27457b)) + ((long) i10);
                if (j9 >= jM29977d0 && j9 >= jM29972Z) {
                    break loop2;
                }
                Object objM30049B = c6857m.m30049B(i10);
                Object objM30048A = c6857m.m30048A(i10);
                boolean z8 = z7;
                if (objM30049B instanceof InterfaceC6678n) {
                    string = (j9 >= jM29972Z || j9 < jM29977d0) ? (j9 >= jM29977d0 || j9 < jM29972Z) ? "cont" : "send" : "receive";
                } else if (objM30049B instanceof C6869y) {
                    string = "EB(" + objM30049B + ')';
                } else if (AbstractC6118n.m27183a(objM30049B, AbstractC6850f.f27461f) || AbstractC6118n.m27183a(objM30049B, AbstractC6850f.f27462g)) {
                    string = "resuming_sender";
                } else {
                    if (objM30049B != null && !AbstractC6118n.m27183a(objM30049B, AbstractC6850f.f27460e) && !AbstractC6118n.m27183a(objM30049B, AbstractC6850f.f27464i) && !AbstractC6118n.m27183a(objM30049B, AbstractC6850f.f27463h) && !AbstractC6118n.m27183a(objM30049B, AbstractC6850f.f27466k) && !AbstractC6118n.m27183a(objM30049B, AbstractC6850f.f27465j) && !AbstractC6118n.m27183a(objM30049B, AbstractC6850f.m30025z())) {
                        string = objM30049B.toString();
                    }
                    i10++;
                    z7 = z8;
                }
                if (objM30048A != null) {
                    sb.append('(' + string + ',' + objM30048A + "),");
                } else {
                    sb.append(string + ',');
                }
                i10++;
                z7 = z8;
            }
            boolean z9 = z7;
            c6857m = (C6857m) c6857m.m31438f();
            if (c6857m == null) {
                break;
            }
            z7 = z9;
            i8 = 0;
        }
        if (AbstractC6406h.m27629U0(sb) == ',') {
            AbstractC6118n.m27186d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: x0 */
    protected void m29986x0() {
    }
}

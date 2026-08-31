package p318o6;

import androidx.concurrent.futures.AbstractC2404b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.InterfaceC6090e;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1426d;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5372q;
import p360t6.AbstractC7101A;
import p360t6.C7104D;
import p360t6.C7124h;

/* JADX INFO: renamed from: o6.p */
/* JADX INFO: loaded from: classes.dex */
public class C6682p extends AbstractC6650a0 implements InterfaceC6678n, InterfaceC6090e, InterfaceC6654b1 {

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f24982f = AtomicIntegerFieldUpdater.newUpdater(C6682p.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: r */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f24983r = AtomicReferenceFieldUpdater.newUpdater(C6682p.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: s */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f24984s = AtomicReferenceFieldUpdater.newUpdater(C6682p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1875e f24985d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1879i f24986e;

    public C6682p(InterfaceC1875e interfaceC1875e, int i7) {
        super(i7);
        this.f24985d = interfaceC1875e;
        this.f24986e = interfaceC1875e.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C6658d.f24941a;
    }

    /* JADX INFO: renamed from: A */
    private final String m28242A() {
        Object objM28274z = m28274z();
        if (objM28274z instanceof InterfaceC6621L0) {
            return "Active";
        }
        return objM28274z instanceof C6688s ? "Cancelled" : "Completed";
    }

    /* JADX INFO: renamed from: F */
    private final InterfaceC6661e0 m28246F() {
        InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) getContext().get(InterfaceC6701y0.f24999p);
        if (interfaceC6701y0 == null) {
            return null;
        }
        InterfaceC6661e0 interfaceC6661e0M27970l = AbstractC6603C0.m27970l(interfaceC6701y0, false, new C6690t(this), 1, null);
        AbstractC2404b.m10339a(f24984s, this, null, interfaceC6661e0M27970l);
        return interfaceC6661e0M27970l;
    }

    /* JADX INFO: renamed from: G */
    private final void m28247G(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24983r;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C6658d) {
                if (AbstractC2404b.m10339a(f24983r, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof InterfaceC6676m) || (obj2 instanceof AbstractC7101A)) {
                m28249J(obj, obj2);
            } else {
                if (obj2 instanceof C6602C) {
                    C6602C c6602c = (C6602C) obj2;
                    if (!c6602c.m27958c()) {
                        m28249J(obj, obj2);
                    }
                    if (obj2 instanceof C6688s) {
                        if (obj2 == null) {
                            c6602c = null;
                        }
                        Throwable th = c6602c != null ? c6602c.f24874a : null;
                        if (obj instanceof InterfaceC6676m) {
                            m28270p((InterfaceC6676m) obj, th);
                            return;
                        } else {
                            AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            m28258r((AbstractC7101A) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof C6600B) {
                    C6600B c6600b = (C6600B) obj2;
                    if (c6600b.f24869b != null) {
                        m28249J(obj, obj2);
                    }
                    if (obj instanceof AbstractC7101A) {
                        return;
                    }
                    AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC6676m interfaceC6676m = (InterfaceC6676m) obj;
                    if (c6600b.m27942c()) {
                        m28270p(interfaceC6676m, c6600b.f24872e);
                        return;
                    } else {
                        if (AbstractC2404b.m10339a(f24983r, this, obj2, C6600B.m27940b(c6600b, null, interfaceC6676m, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof AbstractC7101A) {
                        return;
                    }
                    AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (AbstractC2404b.m10339a(f24983r, this, obj2, new C6600B(obj2, (InterfaceC6676m) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    private final boolean m28248I() {
        if (!AbstractC6653b0.m28157c(this.f24935c)) {
            return false;
        }
        InterfaceC1875e interfaceC1875e = this.f24985d;
        AbstractC6118n.m27185c(interfaceC1875e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C7124h) interfaceC1875e).m31453r();
    }

    /* JADX INFO: renamed from: J */
    private final void m28249J(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C1444v m28250P(InterfaceC5367l interfaceC5367l, Throwable th, Object obj, InterfaceC1879i interfaceC1879i) {
        interfaceC5367l.invoke(th);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m28251R(C6682p c6682p, Object obj, int i7, InterfaceC5372q interfaceC5372q, int i8, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i8 & 4) != 0) {
            interfaceC5372q = null;
        }
        c6682p.m28269Q(obj, i7, interfaceC5372q);
    }

    /* JADX INFO: renamed from: S */
    private final Object m28252S(InterfaceC6621L0 interfaceC6621L0, Object obj, int i7, InterfaceC5372q interfaceC5372q, Object obj2) {
        if (obj instanceof C6602C) {
            return obj;
        }
        if ((AbstractC6653b0.m28156b(i7) || obj2 != null) && !(interfaceC5372q == null && !(interfaceC6621L0 instanceof InterfaceC6676m) && obj2 == null)) {
            return new C6600B(obj, interfaceC6621L0 instanceof InterfaceC6676m ? (InterfaceC6676m) interfaceC6621L0 : null, interfaceC5372q, obj2, null, 16, null);
        }
        return obj;
    }

    /* JADX INFO: renamed from: T */
    private final boolean m28253T() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24982f;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f24982f.compareAndSet(this, i7, 1073741824 + (536870911 & i7)));
        return true;
    }

    /* JADX INFO: renamed from: U */
    private final C7104D m28254U(Object obj, Object obj2, InterfaceC5372q interfaceC5372q) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24983r;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC6621L0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof C6600B) && obj4 != null && ((C6600B) obj3).f24871d == obj4) {
                    return AbstractC6684q.f24988a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            InterfaceC5372q interfaceC5372q2 = interfaceC5372q;
            if (AbstractC2404b.m10339a(f24983r, this, obj3, m28252S((InterfaceC6621L0) obj3, obj5, this.f24935c, interfaceC5372q2, obj6))) {
                m28260u();
                return AbstractC6684q.f24988a;
            }
            obj = obj5;
            interfaceC5372q = interfaceC5372q2;
            obj2 = obj6;
        }
    }

    /* JADX INFO: renamed from: V */
    private final boolean m28255V() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24982f;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f24982f.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        return true;
    }

    /* JADX INFO: renamed from: o */
    private final Void m28257o(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* JADX INFO: renamed from: r */
    private final void m28258r(AbstractC7101A abstractC7101A, Throwable th) {
        int i7 = f24982f.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC7101A.mo30055s(i7, th, getContext());
        } catch (Throwable th2) {
            AbstractC6622M.m28096a(getContext(), new C6604D("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: s */
    private final boolean m28259s(Throwable th) {
        if (!m28248I()) {
            return false;
        }
        InterfaceC1875e interfaceC1875e = this.f24985d;
        AbstractC6118n.m27185c(interfaceC1875e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C7124h) interfaceC1875e).m31454s(th);
    }

    /* JADX INFO: renamed from: u */
    private final void m28260u() {
        if (m28248I()) {
            return;
        }
        m28272t();
    }

    /* JADX INFO: renamed from: v */
    private final void m28261v(int i7) {
        if (m28253T()) {
            return;
        }
        AbstractC6653b0.m28155a(this, i7);
    }

    /* JADX INFO: renamed from: x */
    private final InterfaceC6661e0 m28262x() {
        return (InterfaceC6661e0) f24984s.get(this);
    }

    /* JADX INFO: renamed from: E */
    public void m28263E() {
        InterfaceC6661e0 interfaceC6661e0M28246F = m28246F();
        if (interfaceC6661e0M28246F != null && isCompleted()) {
            interfaceC6661e0M28246F.mo7954k();
            f24984s.set(this, C6619K0.f24909a);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m28264H(InterfaceC6676m interfaceC6676m) {
        m28247G(interfaceC6676m);
    }

    /* JADX INFO: renamed from: K */
    protected String mo28045K() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: L */
    public final void m28265L(Throwable th) {
        if (m28259s(th)) {
            return;
        }
        cancel(th);
        m28260u();
    }

    /* JADX INFO: renamed from: M */
    public final void m28266M() {
        Throwable thM31456u;
        InterfaceC1875e interfaceC1875e = this.f24985d;
        C7124h c7124h = interfaceC1875e instanceof C7124h ? (C7124h) interfaceC1875e : null;
        if (c7124h == null || (thM31456u = c7124h.m31456u(this)) == null) {
            return;
        }
        m28272t();
        cancel(thM31456u);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m28267N() {
        Object obj = f24983r.get(this);
        if ((obj instanceof C6600B) && ((C6600B) obj).f24871d != null) {
            m28272t();
            return false;
        }
        f24982f.set(this, 536870911);
        f24983r.set(this, C6658d.f24941a);
        return true;
    }

    /* JADX INFO: renamed from: O */
    public void m28268O(Object obj, final InterfaceC5367l interfaceC5367l) {
        m28269Q(obj, this.f24935c, interfaceC5367l != null ? new InterfaceC5372q() { // from class: o6.o
            @Override // p238e6.InterfaceC5372q
            /* JADX INFO: renamed from: j */
            public final Object mo7830j(Object obj2, Object obj3, Object obj4) {
                return C6682p.m28250P(interfaceC5367l, (Throwable) obj2, obj3, (InterfaceC1879i) obj4);
            }
        } : null);
    }

    /* JADX INFO: renamed from: Q */
    public final void m28269Q(Object obj, int i7, InterfaceC5372q interfaceC5372q) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24983r;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC6621L0)) {
                Object obj3 = obj;
                InterfaceC5372q interfaceC5372q2 = interfaceC5372q;
                if (obj2 instanceof C6688s) {
                    C6688s c6688s = (C6688s) obj2;
                    if (c6688s.m28286e()) {
                        if (interfaceC5372q2 != null) {
                            m28271q(interfaceC5372q2, c6688s.f24874a, obj3);
                            return;
                        }
                        return;
                    }
                }
                m28257o(obj3);
                throw new C1426d();
            }
            Object obj4 = obj;
            int i8 = i7;
            InterfaceC5372q interfaceC5372q3 = interfaceC5372q;
            if (AbstractC2404b.m10339a(f24983r, this, obj2, m28252S((InterfaceC6621L0) obj2, obj4, i8, interfaceC5372q3, null))) {
                m28260u();
                m28261v(i8);
                return;
            } else {
                obj = obj4;
                i7 = i8;
                interfaceC5372q = interfaceC5372q3;
            }
        }
    }

    @Override // p318o6.InterfaceC6678n
    /* JADX INFO: renamed from: a */
    public void mo28234a(InterfaceC5367l interfaceC5367l) {
        AbstractC6686r.m28282c(this, new InterfaceC6676m.a(interfaceC5367l));
    }

    @Override // p318o6.InterfaceC6654b1
    /* JADX INFO: renamed from: b */
    public void mo28160b(AbstractC7101A abstractC7101A, int i7) {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24982f;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        m28247G(abstractC7101A);
    }

    @Override // p318o6.InterfaceC6678n
    /* JADX INFO: renamed from: c */
    public void mo28235c(AbstractC6618K abstractC6618K, Object obj) {
        InterfaceC1875e interfaceC1875e = this.f24985d;
        C7124h c7124h = interfaceC1875e instanceof C7124h ? (C7124h) interfaceC1875e : null;
        m28251R(this, obj, (c7124h != null ? c7124h.f28414d : null) == abstractC6618K ? 4 : this.f24935c, null, 4, null);
    }

    @Override // p318o6.InterfaceC6678n
    public boolean cancel(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24983r;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC6621L0)) {
                return false;
            }
        } while (!AbstractC2404b.m10339a(f24983r, this, obj, new C6688s(this, th, (obj instanceof InterfaceC6676m) || (obj instanceof AbstractC7101A))));
        InterfaceC6621L0 interfaceC6621L0 = (InterfaceC6621L0) obj;
        if (interfaceC6621L0 instanceof InterfaceC6676m) {
            m28270p((InterfaceC6676m) obj, th);
        } else if (interfaceC6621L0 instanceof AbstractC7101A) {
            m28258r((AbstractC7101A) obj, th);
        }
        m28260u();
        m28261v(this.f24935c);
        return true;
    }

    @Override // p318o6.AbstractC6650a0
    /* JADX INFO: renamed from: d */
    public void mo28149d(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24983r;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC6621L0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C6602C) {
                return;
            }
            if (obj2 instanceof C6600B) {
                C6600B c6600b = (C6600B) obj2;
                if (c6600b.m27942c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (AbstractC2404b.m10339a(f24983r, this, obj2, C6600B.m27940b(c6600b, null, null, null, null, th3, 15, null))) {
                    c6600b.m27943d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (AbstractC2404b.m10339a(f24983r, this, obj2, new C6600B(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // p318o6.InterfaceC6678n
    /* JADX INFO: renamed from: e */
    public void mo28236e(Object obj, InterfaceC5372q interfaceC5372q) {
        m28269Q(obj, this.f24935c, interfaceC5372q);
    }

    @Override // p318o6.InterfaceC6678n
    /* JADX INFO: renamed from: f */
    public Object mo28237f(Throwable th) {
        return m28254U(new C6602C(th, false, 2, null), null, null);
    }

    @Override // p318o6.AbstractC6650a0
    /* JADX INFO: renamed from: g */
    public final InterfaceC1875e mo28150g() {
        return this.f24985d;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6090e
    public InterfaceC6090e getCallerFrame() {
        InterfaceC1875e interfaceC1875e = this.f24985d;
        if (interfaceC1875e instanceof InterfaceC6090e) {
            return (InterfaceC6090e) interfaceC1875e;
        }
        return null;
    }

    @Override // p173W5.InterfaceC1875e
    public InterfaceC1879i getContext() {
        return this.f24986e;
    }

    @Override // p318o6.InterfaceC6678n
    /* JADX INFO: renamed from: h */
    public Object mo28238h(Object obj, Object obj2, InterfaceC5372q interfaceC5372q) {
        return m28254U(obj, obj2, interfaceC5372q);
    }

    @Override // p318o6.AbstractC6650a0
    /* JADX INFO: renamed from: i */
    public Throwable mo28151i(Object obj) {
        Throwable thMo28151i = super.mo28151i(obj);
        if (thMo28151i != null) {
            return thMo28151i;
        }
        return null;
    }

    @Override // p318o6.InterfaceC6678n
    public boolean isCompleted() {
        return !(m28274z() instanceof InterfaceC6621L0);
    }

    @Override // p318o6.AbstractC6650a0
    /* JADX INFO: renamed from: j */
    public Object mo28152j(Object obj) {
        return obj instanceof C6600B ? ((C6600B) obj).f24868a : obj;
    }

    @Override // p318o6.InterfaceC6678n
    /* JADX INFO: renamed from: l */
    public void mo28239l(Object obj) {
        m28261v(this.f24935c);
    }

    @Override // p318o6.AbstractC6650a0
    /* JADX INFO: renamed from: m */
    public Object mo28154m() {
        return m28274z();
    }

    /* JADX INFO: renamed from: p */
    public final void m28270p(InterfaceC6676m interfaceC6676m, Throwable th) {
        try {
            interfaceC6676m.mo28174a(th);
        } catch (Throwable th2) {
            AbstractC6622M.m28096a(getContext(), new C6604D("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m28271q(InterfaceC5372q interfaceC5372q, Throwable th, Object obj) {
        try {
            interfaceC5372q.mo7830j(th, obj, getContext());
        } catch (Throwable th2) {
            AbstractC6622M.m28096a(getContext(), new C6604D("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // p173W5.InterfaceC1875e
    public void resumeWith(Object obj) {
        m28251R(this, AbstractC6606E.m27979c(obj, this), this.f24935c, null, 4, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m28272t() {
        InterfaceC6661e0 interfaceC6661e0M28262x = m28262x();
        if (interfaceC6661e0M28262x == null) {
            return;
        }
        interfaceC6661e0M28262x.mo7954k();
        f24984s.set(this, C6619K0.f24909a);
    }

    public String toString() {
        return mo28045K() + '(' + AbstractC6633S.m28110c(this.f24985d) + "){" + m28242A() + "}@" + AbstractC6633S.m28109b(this);
    }

    /* JADX INFO: renamed from: w */
    public Throwable mo28046w(InterfaceC6701y0 interfaceC6701y0) {
        return interfaceC6701y0.getCancellationException();
    }

    /* JADX INFO: renamed from: y */
    public final Object m28273y() {
        InterfaceC6701y0 interfaceC6701y0;
        boolean zM28248I = m28248I();
        if (m28255V()) {
            if (m28262x() == null) {
                m28246F();
            }
            if (zM28248I) {
                m28266M();
            }
            return AbstractC2005b.m8369e();
        }
        if (zM28248I) {
            m28266M();
        }
        Object objM28274z = m28274z();
        if (objM28274z instanceof C6602C) {
            throw ((C6602C) objM28274z).f24874a;
        }
        if (!AbstractC6653b0.m28156b(this.f24935c) || (interfaceC6701y0 = (InterfaceC6701y0) getContext().get(InterfaceC6701y0.f24999p)) == null || interfaceC6701y0.isActive()) {
            return mo28152j(objM28274z);
        }
        CancellationException cancellationException = interfaceC6701y0.getCancellationException();
        mo28149d(objM28274z, cancellationException);
        throw cancellationException;
    }

    /* JADX INFO: renamed from: z */
    public final Object m28274z() {
        return f24983r.get(this);
    }
}

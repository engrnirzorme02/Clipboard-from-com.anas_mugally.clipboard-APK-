package p318o6;

import androidx.appcompat.app.AbstractC2263x;
import androidx.concurrent.futures.AbstractC2404b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import kotlin.coroutines.jvm.internal.AbstractC6096k;
import kotlin.jvm.internal.AbstractC6104G;
import kotlin.jvm.internal.AbstractC6116l;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6099B;
import p145S5.AbstractC1423a;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p294l6.AbstractC6306g;
import p294l6.AbstractC6307h;
import p294l6.InterfaceC6304e;
import p360t6.C7131o;
import p384w6.C7361b;
import p384w6.C7363d;
import p384w6.InterfaceC7360a;
import p384w6.InterfaceC7362c;
import p384w6.InterfaceC7364e;

/* JADX INFO: renamed from: o6.E0 */
/* JADX INFO: loaded from: classes.dex */
public class C6607E0 implements InterfaceC6701y0, InterfaceC6696w, InterfaceC6623M0 {

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f24876a = AtomicReferenceFieldUpdater.newUpdater(C6607E0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f24877b = AtomicReferenceFieldUpdater.newUpdater(C6607E0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: o6.E0$a */
    private static final class a extends C6682p {

        /* JADX INFO: renamed from: t */
        private final C6607E0 f24878t;

        public a(InterfaceC1875e interfaceC1875e, C6607E0 c6607e0) {
            super(interfaceC1875e, 1);
            this.f24878t = c6607e0;
        }

        @Override // p318o6.C6682p
        /* JADX INFO: renamed from: K */
        protected String mo28045K() {
            return "AwaitContinuation";
        }

        @Override // p318o6.C6682p
        /* JADX INFO: renamed from: w */
        public Throwable mo28046w(InterfaceC6701y0 interfaceC6701y0) {
            Throwable thM28054e;
            Object objM28026T = this.f24878t.m28026T();
            if (!(objM28026T instanceof c) || (thM28054e = ((c) objM28026T).m28054e()) == null) {
                return objM28026T instanceof C6602C ? ((C6602C) objM28026T).f24874a : interfaceC6701y0.getCancellationException();
            }
            return thM28054e;
        }
    }

    /* JADX INFO: renamed from: o6.E0$b */
    private static final class b extends AbstractC6605D0 {

        /* JADX INFO: renamed from: e */
        private final C6607E0 f24879e;

        /* JADX INFO: renamed from: f */
        private final c f24880f;

        /* JADX INFO: renamed from: r */
        private final C6694v f24881r;

        /* JADX INFO: renamed from: s */
        private final Object f24882s;

        public b(C6607E0 c6607e0, c cVar, C6694v c6694v, Object obj) {
            this.f24879e = c6607e0;
            this.f24880f = cVar;
            this.f24881r = c6694v;
            this.f24882s = obj;
        }

        @Override // p318o6.AbstractC6605D0
        /* JADX INFO: renamed from: v */
        public boolean mo27974v() {
            return false;
        }

        @Override // p318o6.AbstractC6605D0
        /* JADX INFO: renamed from: w */
        public void mo27975w(Throwable th) {
            this.f24879e.m27987G(this.f24880f, this.f24881r, this.f24882s);
        }
    }

    /* JADX INFO: renamed from: o6.E0$c */
    private static final class c implements InterfaceC6693u0 {

        /* JADX INFO: renamed from: b */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f24883b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f24884c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f24885d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a */
        private final C6617J0 f24886a;

        public c(C6617J0 c6617j0, boolean z7, Throwable th) {
            this.f24886a = c6617j0;
            this._isCompleting$volatile = z7 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        /* JADX INFO: renamed from: c */
        private final ArrayList m28047c() {
            return new ArrayList(4);
        }

        /* JADX INFO: renamed from: d */
        private final Object m28048d() {
            return f24885d.get(this);
        }

        /* JADX INFO: renamed from: n */
        private final void m28052n(Object obj) {
            f24885d.set(this, obj);
        }

        @Override // p318o6.InterfaceC6693u0
        /* JADX INFO: renamed from: a */
        public C6617J0 mo27972a() {
            return this.f24886a;
        }

        /* JADX INFO: renamed from: b */
        public final void m28053b(Throwable th) {
            Throwable thM28054e = m28054e();
            if (thM28054e == null) {
                m28060o(th);
                return;
            }
            if (th == thM28054e) {
                return;
            }
            Object objM28048d = m28048d();
            if (objM28048d == null) {
                m28052n(th);
                return;
            }
            if (objM28048d instanceof Throwable) {
                if (th == objM28048d) {
                    return;
                }
                ArrayList arrayListM28047c = m28047c();
                arrayListM28047c.add(objM28048d);
                arrayListM28047c.add(th);
                m28052n(arrayListM28047c);
                return;
            }
            if (objM28048d instanceof ArrayList) {
                ((ArrayList) objM28048d).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objM28048d).toString());
        }

        /* JADX INFO: renamed from: e */
        public final Throwable m28054e() {
            return (Throwable) f24884c.get(this);
        }

        /* JADX INFO: renamed from: i */
        public final boolean m28055i() {
            return m28054e() != null;
        }

        @Override // p318o6.InterfaceC6693u0
        public boolean isActive() {
            return m28054e() == null;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m28056j() {
            return f24883b.get(this) != 0;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m28057k() {
            return m28048d() == AbstractC6609F0.f24901e;
        }

        /* JADX INFO: renamed from: l */
        public final List m28058l(Throwable th) {
            ArrayList arrayListM28047c;
            Object objM28048d = m28048d();
            if (objM28048d == null) {
                arrayListM28047c = m28047c();
            } else if (objM28048d instanceof Throwable) {
                ArrayList arrayListM28047c2 = m28047c();
                arrayListM28047c2.add(objM28048d);
                arrayListM28047c = arrayListM28047c2;
            } else {
                if (!(objM28048d instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objM28048d).toString());
                }
                arrayListM28047c = (ArrayList) objM28048d;
            }
            Throwable thM28054e = m28054e();
            if (thM28054e != null) {
                arrayListM28047c.add(0, thM28054e);
            }
            if (th != null && !AbstractC6118n.m27183a(th, thM28054e)) {
                arrayListM28047c.add(th);
            }
            m28052n(AbstractC6609F0.f24901e);
            return arrayListM28047c;
        }

        /* JADX INFO: renamed from: m */
        public final void m28059m(boolean z7) {
            f24883b.set(this, z7 ? 1 : 0);
        }

        /* JADX INFO: renamed from: o */
        public final void m28060o(Throwable th) {
            f24884c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + m28055i() + ", completing=" + m28056j() + ", rootCause=" + m28054e() + ", exceptions=" + m28048d() + ", list=" + mo27972a() + ']';
        }
    }

    /* JADX INFO: renamed from: o6.E0$d */
    private final class d extends AbstractC6605D0 {
        public d(InterfaceC7364e interfaceC7364e) {
        }

        @Override // p318o6.AbstractC6605D0
        /* JADX INFO: renamed from: v */
        public boolean mo27974v() {
            return false;
        }

        @Override // p318o6.AbstractC6605D0
        /* JADX INFO: renamed from: w */
        public void mo27975w(Throwable th) {
            Object objM28026T = C6607E0.this.m28026T();
            if (!(objM28026T instanceof C6602C)) {
                AbstractC6609F0.m28072h(objM28026T);
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: o6.E0$e */
    private final class e extends AbstractC6605D0 {
        public e(InterfaceC7364e interfaceC7364e) {
        }

        @Override // p318o6.AbstractC6605D0
        /* JADX INFO: renamed from: v */
        public boolean mo27974v() {
            return false;
        }

        @Override // p318o6.AbstractC6605D0
        /* JADX INFO: renamed from: w */
        public void mo27975w(Throwable th) {
            C1444v c1444v = C1444v.f4971a;
            throw null;
        }
    }

    /* JADX INFO: renamed from: o6.E0$f */
    static final class f extends AbstractC6096k implements InterfaceC5371p {

        /* JADX INFO: renamed from: b */
        Object f24889b;

        /* JADX INFO: renamed from: c */
        Object f24890c;

        /* JADX INFO: renamed from: d */
        int f24891d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Object f24892e;

        f(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            f fVar = C6607E0.this.new f(interfaceC1875e);
            fVar.f24892e = obj;
            return fVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC6306g abstractC6306g, InterfaceC1875e interfaceC1875e) {
            return ((f) create(abstractC6306g, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        /* JADX WARN: Code duplicated, block: B:24:0x006d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p180X5.AbstractC2005b.m8369e()
                int r1 = r5.f24891d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r5.f24890c
                t6.o r1 = (p360t6.C7131o) r1
                java.lang.Object r3 = r5.f24889b
                t6.n r3 = (p360t6.AbstractC7130n) r3
                java.lang.Object r4 = r5.f24892e
                l6.g r4 = (p294l6.AbstractC6306g) r4
                p145S5.AbstractC1437o.m6082b(r6)
                goto L81
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L26:
                p145S5.AbstractC1437o.m6082b(r6)
                goto L86
            L2a:
                p145S5.AbstractC1437o.m6082b(r6)
                java.lang.Object r6 = r5.f24892e
                l6.g r6 = (p294l6.AbstractC6306g) r6
                o6.E0 r1 = p318o6.C6607E0.this
                java.lang.Object r1 = r1.m28026T()
                boolean r4 = r1 instanceof p318o6.C6694v
                if (r4 == 0) goto L48
                o6.v r1 = (p318o6.C6694v) r1
                o6.w r1 = r1.f24994e
                r5.f24891d = r3
                java.lang.Object r6 = r6.mo27234b(r1, r5)
                if (r6 != r0) goto L86
                goto L80
            L48:
                boolean r3 = r1 instanceof p318o6.InterfaceC6693u0
                if (r3 == 0) goto L86
                o6.u0 r1 = (p318o6.InterfaceC6693u0) r1
                o6.J0 r1 = r1.mo27972a()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.m31481j()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.AbstractC6118n.m27185c(r3, r4)
                t6.o r3 = (p360t6.C7131o) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L63:
                boolean r6 = kotlin.jvm.internal.AbstractC6118n.m27183a(r1, r3)
                if (r6 != 0) goto L86
                boolean r6 = r1 instanceof p318o6.C6694v
                if (r6 == 0) goto L81
                r6 = r1
                o6.v r6 = (p318o6.C6694v) r6
                o6.w r6 = r6.f24994e
                r5.f24892e = r4
                r5.f24889b = r3
                r5.f24890c = r1
                r5.f24891d = r2
                java.lang.Object r6 = r4.mo27234b(r6, r5)
                if (r6 != r0) goto L81
            L80:
                return r0
            L81:
                t6.o r1 = r1.m31482l()
                goto L63
            L86:
                S5.v r6 = p145S5.C1444v.f4971a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p318o6.C6607E0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: o6.E0$g */
    /* synthetic */ class g extends AbstractC6116l implements InterfaceC5372q {

        /* JADX INFO: renamed from: a */
        public static final g f24894a = new g();

        g() {
            super(3, C6607E0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m28062d(C6607E0 c6607e0, InterfaceC7364e interfaceC7364e, Object obj) {
            c6607e0.m28004m0(interfaceC7364e, obj);
        }

        @Override // p238e6.InterfaceC5372q
        /* JADX INFO: renamed from: j */
        public /* bridge */ /* synthetic */ Object mo7830j(Object obj, Object obj2, Object obj3) {
            AbstractC2263x.m9328a(obj2);
            m28062d((C6607E0) obj, null, obj3);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: o6.E0$h */
    /* synthetic */ class h extends AbstractC6116l implements InterfaceC5372q {

        /* JADX INFO: renamed from: a */
        public static final h f24895a = new h();

        h() {
            super(3, C6607E0.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p238e6.InterfaceC5372q
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object mo7830j(C6607E0 c6607e0, Object obj, Object obj2) {
            return c6607e0.m28003l0(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: o6.E0$i */
    /* synthetic */ class i extends AbstractC6116l implements InterfaceC5372q {

        /* JADX INFO: renamed from: a */
        public static final i f24896a = new i();

        i() {
            super(3, C6607E0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m28064d(C6607E0 c6607e0, InterfaceC7364e interfaceC7364e, Object obj) {
            c6607e0.m28013u0(interfaceC7364e, obj);
        }

        @Override // p238e6.InterfaceC5372q
        /* JADX INFO: renamed from: j */
        public /* bridge */ /* synthetic */ Object mo7830j(Object obj, Object obj2, Object obj3) {
            AbstractC2263x.m9328a(obj2);
            m28064d((C6607E0) obj, null, obj3);
            return C1444v.f4971a;
        }
    }

    public C6607E0(boolean z7) {
        this._state$volatile = z7 ? AbstractC6609F0.f24903g : AbstractC6609F0.f24902f;
    }

    /* JADX INFO: renamed from: B */
    private final Object m27980B(Object obj) {
        Object objM27986F0;
        do {
            Object objM28026T = m28026T();
            if (!(objM28026T instanceof InterfaceC6693u0) || ((objM28026T instanceof c) && ((c) objM28026T).m28056j())) {
                return AbstractC6609F0.f24897a;
            }
            objM27986F0 = m27986F0(objM28026T, new C6602C(m27989H(obj), false, 2, null));
        } while (objM27986F0 == AbstractC6609F0.f24899c);
        return objM27986F0;
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ CancellationException m27981B0(C6607E0 c6607e0, Throwable th, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        return c6607e0.m28018A0(th, str);
    }

    /* JADX INFO: renamed from: C */
    private final boolean m27982C(Throwable th) {
        if (mo28031a0()) {
            return true;
        }
        boolean z7 = th instanceof CancellationException;
        InterfaceC6692u interfaceC6692uM28025S = m28025S();
        if (interfaceC6692uM28025S == null || interfaceC6692uM28025S == C6619K0.f24909a) {
            return z7;
        }
        return interfaceC6692uM28025S.mo28094d(th) || z7;
    }

    /* JADX INFO: renamed from: D0 */
    private final boolean m27983D0(InterfaceC6693u0 interfaceC6693u0, Object obj) throws Throwable {
        if (!AbstractC2404b.m10339a(f24876a, this, interfaceC6693u0, AbstractC6609F0.m28071g(obj))) {
            return false;
        }
        m28035n0(null);
        mo28036q0(obj);
        m27985F(interfaceC6693u0, obj);
        return true;
    }

    /* JADX INFO: renamed from: E0 */
    private final boolean m27984E0(InterfaceC6693u0 interfaceC6693u0, Throwable th) throws Throwable {
        C6617J0 c6617j0M27994R = m27994R(interfaceC6693u0);
        if (c6617j0M27994R == null) {
            return false;
        }
        if (!AbstractC2404b.m10339a(f24876a, this, interfaceC6693u0, new c(c6617j0M27994R, false, th))) {
            return false;
        }
        m28001j0(c6617j0M27994R, th);
        return true;
    }

    /* JADX INFO: renamed from: F */
    private final void m27985F(InterfaceC6693u0 interfaceC6693u0, Object obj) throws Throwable {
        InterfaceC6692u interfaceC6692uM28025S = m28025S();
        if (interfaceC6692uM28025S != null) {
            interfaceC6692uM28025S.mo7954k();
            m28042x0(C6619K0.f24909a);
        }
        C6602C c6602c = obj instanceof C6602C ? (C6602C) obj : null;
        Throwable th = c6602c != null ? c6602c.f24874a : null;
        if (!(interfaceC6693u0 instanceof AbstractC6605D0)) {
            C6617J0 c6617j0Mo27972a = interfaceC6693u0.mo27972a();
            if (c6617j0Mo27972a != null) {
                m28002k0(c6617j0Mo27972a, th);
                return;
            }
            return;
        }
        try {
            ((AbstractC6605D0) interfaceC6693u0).mo27975w(th);
        } catch (Throwable th2) {
            mo28028X(new C6604D("Exception in completion handler " + interfaceC6693u0 + " for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: F0 */
    private final Object m27986F0(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC6693u0)) {
            return AbstractC6609F0.f24897a;
        }
        if ((!(obj instanceof C6667h0) && !(obj instanceof AbstractC6605D0)) || (obj instanceof C6694v) || (obj2 instanceof C6602C)) {
            return m27988G0((InterfaceC6693u0) obj, obj2);
        }
        return m27983D0((InterfaceC6693u0) obj, obj2) ? obj2 : AbstractC6609F0.f24899c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final void m27987G(c cVar, C6694v c6694v, Object obj) {
        C6694v c6694vM28000i0 = m28000i0(c6694v);
        if (c6694vM28000i0 == null || !m27990H0(cVar, c6694vM28000i0, obj)) {
            cVar.mo27972a().m31480f(2);
            C6694v c6694vM28000i1 = m28000i0(c6694v);
            if (c6694vM28000i1 == null || !m27990H0(cVar, c6694vM28000i1, obj)) {
                mo28038u(m27991I(cVar, obj));
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    private final Object m27988G0(InterfaceC6693u0 interfaceC6693u0, Object obj) throws Throwable {
        C6617J0 c6617j0M27994R = m27994R(interfaceC6693u0);
        if (c6617j0M27994R == null) {
            return AbstractC6609F0.f24899c;
        }
        c cVar = interfaceC6693u0 instanceof c ? (c) interfaceC6693u0 : null;
        if (cVar == null) {
            cVar = new c(c6617j0M27994R, false, null);
        }
        C6099B c6099b = new C6099B();
        synchronized (cVar) {
            if (cVar.m28056j()) {
                return AbstractC6609F0.f24897a;
            }
            cVar.m28059m(true);
            if (cVar != interfaceC6693u0 && !AbstractC2404b.m10339a(f24876a, this, interfaceC6693u0, cVar)) {
                return AbstractC6609F0.f24899c;
            }
            boolean zM28055i = cVar.m28055i();
            C6602C c6602c = obj instanceof C6602C ? (C6602C) obj : null;
            if (c6602c != null) {
                cVar.m28053b(c6602c.f24874a);
            }
            Throwable thM28054e = zM28055i ? null : cVar.m28054e();
            c6099b.f23859a = thM28054e;
            C1444v c1444v = C1444v.f4971a;
            if (thM28054e != null) {
                m28001j0(c6617j0M27994R, thM28054e);
            }
            C6694v c6694vM28000i0 = m28000i0(c6617j0M27994R);
            if (c6694vM28000i0 != null && m27990H0(cVar, c6694vM28000i0, obj)) {
                return AbstractC6609F0.f24898b;
            }
            c6617j0M27994R.m31480f(2);
            C6694v c6694vM28000i1 = m28000i0(c6617j0M27994R);
            return (c6694vM28000i1 == null || !m27990H0(cVar, c6694vM28000i1, obj)) ? m27991I(cVar, obj) : AbstractC6609F0.f24898b;
        }
    }

    /* JADX INFO: renamed from: H */
    private final Throwable m27989H(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C6703z0(mo28020D(), null, this) : th;
        }
        AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC6623M0) obj).mo28041w0();
    }

    /* JADX INFO: renamed from: H0 */
    private final boolean m27990H0(c cVar, C6694v c6694v, Object obj) {
        while (AbstractC6601B0.m27954k(c6694v.f24994e, false, new b(this, cVar, c6694v, obj)) == C6619K0.f24909a) {
            c6694v = m28000i0(c6694v);
            if (c6694v == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    private final Object m27991I(c cVar, Object obj) throws Throwable {
        boolean zM28055i;
        Throwable thM27993M;
        C6602C c6602c = obj instanceof C6602C ? (C6602C) obj : null;
        Throwable th = c6602c != null ? c6602c.f24874a : null;
        synchronized (cVar) {
            zM28055i = cVar.m28055i();
            List listM28058l = cVar.m28058l(th);
            thM27993M = m27993M(cVar, listM28058l);
            if (thM27993M != null) {
                m28011t(thM27993M, listM28058l);
            }
        }
        if (thM27993M != null && thM27993M != th) {
            obj = new C6602C(thM27993M, false, 2, null);
        }
        if (thM27993M != null && (m27982C(thM27993M) || mo28027W(thM27993M))) {
            AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C6602C) obj).m27958c();
        }
        if (!zM28055i) {
            m28035n0(thM27993M);
        }
        mo28036q0(obj);
        AbstractC2404b.m10339a(f24876a, this, cVar, AbstractC6609F0.m28071g(obj));
        m27985F(cVar, obj);
        return obj;
    }

    /* JADX INFO: renamed from: L */
    private final Throwable m27992L(Object obj) {
        C6602C c6602c = obj instanceof C6602C ? (C6602C) obj : null;
        if (c6602c != null) {
            return c6602c.f24874a;
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    private final Throwable m27993M(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.m28055i()) {
                return new C6703z0(mo28020D(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof C6640V0) {
            for (Object obj2 : list) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof C6640V0)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX INFO: renamed from: R */
    private final C6617J0 m27994R(InterfaceC6693u0 interfaceC6693u0) {
        C6617J0 c6617j0Mo27972a = interfaceC6693u0.mo27972a();
        if (c6617j0Mo27972a != null) {
            return c6617j0Mo27972a;
        }
        if (interfaceC6693u0 instanceof C6667h0) {
            return new C6617J0();
        }
        if (interfaceC6693u0 instanceof AbstractC6605D0) {
            m28012t0((AbstractC6605D0) interfaceC6693u0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC6693u0).toString());
    }

    /* JADX INFO: renamed from: b0 */
    private final boolean m27997b0() {
        Object objM28026T;
        do {
            objM28026T = m28026T();
            if (!(objM28026T instanceof InterfaceC6693u0)) {
                return false;
            }
        } while (m28015y0(objM28026T) < 0);
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    private final Object m27998c0(InterfaceC1875e interfaceC1875e) {
        C6682p c6682p = new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1);
        c6682p.m28263E();
        AbstractC6686r.m28280a(c6682p, AbstractC6603C0.m27970l(this, false, new C6627O0(c6682p), 1, null));
        Object objM28273y = c6682p.m28273y();
        if (objM28273y == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM28273y == AbstractC2005b.m8369e() ? objM28273y : C1444v.f4971a;
    }

    /* JADX INFO: renamed from: e0 */
    private final Object m27999e0(Object obj) throws Throwable {
        Throwable thM27989H = null;
        while (true) {
            Object objM28026T = m28026T();
            if (objM28026T instanceof c) {
                synchronized (objM28026T) {
                    if (((c) objM28026T).m28057k()) {
                        return AbstractC6609F0.f24900d;
                    }
                    boolean zM28055i = ((c) objM28026T).m28055i();
                    if (obj != null || !zM28055i) {
                        if (thM27989H == null) {
                            thM27989H = m27989H(obj);
                        }
                        ((c) objM28026T).m28053b(thM27989H);
                    }
                    Throwable thM28054e = zM28055i ? null : ((c) objM28026T).m28054e();
                    if (thM28054e != null) {
                        m28001j0(((c) objM28026T).mo27972a(), thM28054e);
                    }
                    return AbstractC6609F0.f24897a;
                }
            }
            if (!(objM28026T instanceof InterfaceC6693u0)) {
                return AbstractC6609F0.f24900d;
            }
            if (thM27989H == null) {
                thM27989H = m27989H(obj);
            }
            InterfaceC6693u0 interfaceC6693u0 = (InterfaceC6693u0) objM28026T;
            if (!interfaceC6693u0.isActive()) {
                Object objM27986F0 = m27986F0(objM28026T, new C6602C(thM27989H, false, 2, null));
                if (objM27986F0 == AbstractC6609F0.f24897a) {
                    throw new IllegalStateException(("Cannot happen in " + objM28026T).toString());
                }
                if (objM27986F0 != AbstractC6609F0.f24899c) {
                    return objM27986F0;
                }
            } else if (m27984E0(interfaceC6693u0, thM27989H)) {
                return AbstractC6609F0.f24897a;
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    private final C6694v m28000i0(C7131o c7131o) {
        while (c7131o.mo31469q()) {
            c7131o = c7131o.m31483m();
        }
        while (true) {
            c7131o = c7131o.m31482l();
            if (!c7131o.mo31469q()) {
                if (c7131o instanceof C6694v) {
                    return (C6694v) c7131o;
                }
                if (c7131o instanceof C6617J0) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    private final void m28001j0(C6617J0 c6617j0, Throwable th) throws Throwable {
        m28035n0(th);
        c6617j0.m31480f(4);
        Object objM31481j = c6617j0.m31481j();
        AbstractC6118n.m27185c(objM31481j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C6604D c6604d = null;
        for (C7131o c7131oM31482l = (C7131o) objM31481j; !AbstractC6118n.m27183a(c7131oM31482l, c6617j0); c7131oM31482l = c7131oM31482l.m31482l()) {
            if ((c7131oM31482l instanceof AbstractC6605D0) && ((AbstractC6605D0) c7131oM31482l).mo27974v()) {
                try {
                    ((AbstractC6605D0) c7131oM31482l).mo27975w(th);
                } catch (Throwable th2) {
                    if (c6604d != null) {
                        AbstractC1423a.m6060a(c6604d, th2);
                    } else {
                        c6604d = new C6604D("Exception in completion handler " + c7131oM31482l + " for " + this, th2);
                        C1444v c1444v = C1444v.f4971a;
                    }
                }
            }
        }
        if (c6604d != null) {
            mo28028X(c6604d);
        }
        m27982C(th);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m28002k0(C6617J0 c6617j0, Throwable th) throws Throwable {
        c6617j0.m31480f(1);
        Object objM31481j = c6617j0.m31481j();
        AbstractC6118n.m27185c(objM31481j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C6604D c6604d = null;
        for (C7131o c7131oM31482l = (C7131o) objM31481j; !AbstractC6118n.m27183a(c7131oM31482l, c6617j0); c7131oM31482l = c7131oM31482l.m31482l()) {
            if (c7131oM31482l instanceof AbstractC6605D0) {
                try {
                    ((AbstractC6605D0) c7131oM31482l).mo27975w(th);
                } catch (Throwable th2) {
                    if (c6604d != null) {
                        AbstractC1423a.m6060a(c6604d, th2);
                    } else {
                        c6604d = new C6604D("Exception in completion handler " + c7131oM31482l + " for " + this, th2);
                        C1444v c1444v = C1444v.f4971a;
                    }
                }
            }
        }
        if (c6604d != null) {
            mo28028X(c6604d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public final Object m28003l0(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof C6602C) {
            throw ((C6602C) obj2).f24874a;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public final void m28004m0(InterfaceC7364e interfaceC7364e, Object obj) {
        Object objM28026T;
        do {
            objM28026T = m28026T();
            if (!(objM28026T instanceof InterfaceC6693u0)) {
                if (!(objM28026T instanceof C6602C)) {
                    objM28026T = AbstractC6609F0.m28072h(objM28026T);
                }
                interfaceC7364e.m32415b(objM28026T);
                return;
            }
        } while (m28015y0(objM28026T) < 0);
        interfaceC7364e.m32414a(AbstractC6603C0.m27970l(this, false, new d(interfaceC7364e), 1, null));
    }

    /* JADX INFO: renamed from: s0 */
    private final void m28010s0(C6667h0 c6667h0) {
        C6617J0 c6617j0 = new C6617J0();
        Object c6691t0 = c6617j0;
        if (!c6667h0.isActive()) {
            c6691t0 = new C6691t0(c6617j0);
        }
        AbstractC2404b.m10339a(f24876a, this, c6667h0, c6691t0);
    }

    /* JADX INFO: renamed from: t */
    private final void m28011t(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                AbstractC1423a.m6060a(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m28012t0(AbstractC6605D0 abstractC6605D0) {
        abstractC6605D0.m31479e(new C6617J0());
        AbstractC2404b.m10339a(f24876a, this, abstractC6605D0, abstractC6605D0.m31482l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public final void m28013u0(InterfaceC7364e interfaceC7364e, Object obj) {
        if (m27997b0()) {
            interfaceC7364e.m32414a(AbstractC6603C0.m27970l(this, false, new e(interfaceC7364e), 1, null));
        } else {
            interfaceC7364e.m32415b(C1444v.f4971a);
        }
    }

    /* JADX INFO: renamed from: w */
    private final Object m28014w(InterfaceC1875e interfaceC1875e) {
        a aVar = new a(AbstractC2005b.m8367c(interfaceC1875e), this);
        aVar.m28263E();
        AbstractC6686r.m28280a(aVar, AbstractC6603C0.m27970l(this, false, new C6625N0(aVar), 1, null));
        Object objM28273y = aVar.m28273y();
        if (objM28273y == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM28273y;
    }

    /* JADX INFO: renamed from: y0 */
    private final int m28015y0(Object obj) {
        if (obj instanceof C6667h0) {
            if (((C6667h0) obj).isActive()) {
                return 0;
            }
            if (!AbstractC2404b.m10339a(f24876a, this, obj, AbstractC6609F0.f24903g)) {
                return -1;
            }
            mo28037r0();
            return 1;
        }
        if (!(obj instanceof C6691t0)) {
            return 0;
        }
        if (!AbstractC2404b.m10339a(f24876a, this, obj, ((C6691t0) obj).mo27972a())) {
            return -1;
        }
        mo28037r0();
        return 1;
    }

    /* JADX INFO: renamed from: z0 */
    private final String m28016z0(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof InterfaceC6693u0) {
                return ((InterfaceC6693u0) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof C6602C ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.m28055i()) {
            return "Cancelling";
        }
        return cVar.m28056j() ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: A */
    public void mo28017A(Throwable th) throws Throwable {
        m28044z(th);
    }

    /* JADX INFO: renamed from: A0 */
    protected final CancellationException m28018A0(Throwable th, String str) {
        CancellationException c6703z0 = th instanceof CancellationException ? (CancellationException) th : null;
        if (c6703z0 == null) {
            if (str == null) {
                str = mo28020D();
            }
            c6703z0 = new C6703z0(str, th, this);
        }
        return c6703z0;
    }

    /* JADX INFO: renamed from: C0 */
    public final String m28019C0() {
        return mo28034h0() + '{' + m28016z0(m28026T()) + '}';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: D */
    public String mo28020D() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: E */
    public boolean mo28021E(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m28044z(th) && mo27938N();
    }

    @Override // p318o6.InterfaceC6696w
    /* JADX INFO: renamed from: J */
    public final void mo28022J(InterfaceC6623M0 interfaceC6623M0) throws Throwable {
        m28044z(interfaceC6623M0);
    }

    /* JADX INFO: renamed from: K */
    public final Object m28023K() throws Throwable {
        Object objM28026T = m28026T();
        if (objM28026T instanceof InterfaceC6693u0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objM28026T instanceof C6602C) {
            throw ((C6602C) objM28026T).f24874a;
        }
        return AbstractC6609F0.m28072h(objM28026T);
    }

    /* JADX INFO: renamed from: N */
    public boolean mo27938N() {
        return true;
    }

    /* JADX INFO: renamed from: O */
    protected final InterfaceC7362c m28024O() {
        g gVar = g.f24894a;
        AbstractC6118n.m27185c(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        InterfaceC5372q interfaceC5372q = (InterfaceC5372q) AbstractC6104G.m27161d(gVar, 3);
        h hVar = h.f24895a;
        AbstractC6118n.m27185c(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C7363d(this, interfaceC5372q, (InterfaceC5372q) AbstractC6104G.m27161d(hVar, 3), null, 8, null);
    }

    /* JADX INFO: renamed from: P */
    public boolean mo27939P() {
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final InterfaceC6692u m28025S() {
        return (InterfaceC6692u) f24877b.get(this);
    }

    /* JADX INFO: renamed from: T */
    public final Object m28026T() {
        return f24876a.get(this);
    }

    /* JADX INFO: renamed from: W */
    protected boolean mo28027W(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: X */
    public void mo28028X(Throwable th) throws Throwable {
        throw th;
    }

    /* JADX INFO: renamed from: Y */
    protected final void m28029Y(InterfaceC6701y0 interfaceC6701y0) {
        if (interfaceC6701y0 == null) {
            m28042x0(C6619K0.f24909a);
            return;
        }
        interfaceC6701y0.start();
        InterfaceC6692u interfaceC6692uAttachChild = interfaceC6701y0.attachChild(this);
        m28042x0(interfaceC6692uAttachChild);
        if (isCompleted()) {
            interfaceC6692uAttachChild.mo7954k();
            m28042x0(C6619K0.f24909a);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final InterfaceC6661e0 m28030Z(boolean z7, AbstractC6605D0 abstractC6605D0) {
        boolean z8;
        boolean zM31477b;
        abstractC6605D0.m27976x(this);
        while (true) {
            Object objM28026T = m28026T();
            z8 = true;
            if (!(objM28026T instanceof C6667h0)) {
                if (!(objM28026T instanceof InterfaceC6693u0)) {
                    z8 = false;
                    break;
                }
                InterfaceC6693u0 interfaceC6693u0 = (InterfaceC6693u0) objM28026T;
                C6617J0 c6617j0Mo27972a = interfaceC6693u0.mo27972a();
                if (c6617j0Mo27972a == null) {
                    AbstractC6118n.m27185c(objM28026T, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m28012t0((AbstractC6605D0) objM28026T);
                } else {
                    if (abstractC6605D0.mo27974v()) {
                        c cVar = interfaceC6693u0 instanceof c ? (c) interfaceC6693u0 : null;
                        Throwable thM28054e = cVar != null ? cVar.m28054e() : null;
                        if (thM28054e != null) {
                            if (z7) {
                                abstractC6605D0.mo27975w(thM28054e);
                            }
                            return C6619K0.f24909a;
                        }
                        zM31477b = c6617j0Mo27972a.m31477b(abstractC6605D0, 5);
                    } else {
                        zM31477b = c6617j0Mo27972a.m31477b(abstractC6605D0, 1);
                    }
                    if (zM31477b) {
                        break;
                    }
                }
            } else {
                C6667h0 c6667h0 = (C6667h0) objM28026T;
                if (!c6667h0.isActive()) {
                    m28010s0(c6667h0);
                } else if (AbstractC2404b.m10339a(f24876a, this, objM28026T, abstractC6605D0)) {
                    break;
                }
            }
        }
        if (z8) {
            return abstractC6605D0;
        }
        if (z7) {
            Object objM28026T2 = m28026T();
            C6602C c6602c = objM28026T2 instanceof C6602C ? (C6602C) objM28026T2 : null;
            abstractC6605D0.mo27975w(c6602c != null ? c6602c.f24874a : null);
        }
        return C6619K0.f24909a;
    }

    /* JADX INFO: renamed from: a0 */
    protected boolean mo28031a0() {
        return false;
    }

    @Override // p318o6.InterfaceC6701y0
    public final InterfaceC6692u attachChild(InterfaceC6696w interfaceC6696w) {
        C6694v c6694v = new C6694v(interfaceC6696w);
        c6694v.m27976x(this);
        while (true) {
            Object objM28026T = m28026T();
            if (objM28026T instanceof C6667h0) {
                C6667h0 c6667h0 = (C6667h0) objM28026T;
                if (!c6667h0.isActive()) {
                    m28010s0(c6667h0);
                } else if (AbstractC2404b.m10339a(f24876a, this, objM28026T, c6694v)) {
                    return c6694v;
                }
            } else {
                Throwable thM28054e = null;
                if (!(objM28026T instanceof InterfaceC6693u0)) {
                    Object objM28026T2 = m28026T();
                    C6602C c6602c = objM28026T2 instanceof C6602C ? (C6602C) objM28026T2 : null;
                    c6694v.mo27975w(c6602c != null ? c6602c.f24874a : null);
                    return C6619K0.f24909a;
                }
                C6617J0 c6617j0Mo27972a = ((InterfaceC6693u0) objM28026T).mo27972a();
                if (c6617j0Mo27972a != null) {
                    if (!c6617j0Mo27972a.m31477b(c6694v, 7)) {
                        boolean zM31477b = c6617j0Mo27972a.m31477b(c6694v, 3);
                        Object objM28026T3 = m28026T();
                        if (objM28026T3 instanceof c) {
                            thM28054e = ((c) objM28026T3).m28054e();
                        } else {
                            C6602C c6602c2 = objM28026T3 instanceof C6602C ? (C6602C) objM28026T3 : null;
                            if (c6602c2 != null) {
                                thM28054e = c6602c2.f24874a;
                            }
                        }
                        c6694v.mo27975w(thM28054e);
                        if (!zM31477b) {
                            return C6619K0.f24909a;
                        }
                    }
                    return c6694v;
                }
                AbstractC6118n.m27185c(objM28026T, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                m28012t0((AbstractC6605D0) objM28026T);
            }
        }
    }

    @Override // p318o6.InterfaceC6701y0
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m28032f0(Object obj) {
        Object objM27986F0;
        do {
            objM27986F0 = m27986F0(m28026T(), obj);
            if (objM27986F0 == AbstractC6609F0.f24897a) {
                return false;
            }
            if (objM27986F0 == AbstractC6609F0.f24898b) {
                return true;
            }
        } while (objM27986F0 == AbstractC6609F0.f24899c);
        mo28038u(objM27986F0);
        return true;
    }

    @Override // p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public Object fold(Object obj, InterfaceC5371p interfaceC5371p) {
        return InterfaceC6701y0.a.m28292c(this, obj, interfaceC5371p);
    }

    /* JADX INFO: renamed from: g0 */
    public final Object m28033g0(Object obj) {
        Object objM27986F0;
        do {
            objM27986F0 = m27986F0(m28026T(), obj);
            if (objM27986F0 == AbstractC6609F0.f24897a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m27992L(obj));
            }
        } while (objM27986F0 == AbstractC6609F0.f24899c);
        return objM27986F0;
    }

    @Override // p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public InterfaceC1879i.b get(InterfaceC1879i.c cVar) {
        return InterfaceC6701y0.a.m28293d(this, cVar);
    }

    @Override // p318o6.InterfaceC6701y0
    public final CancellationException getCancellationException() {
        Object objM28026T = m28026T();
        if (!(objM28026T instanceof c)) {
            if (objM28026T instanceof InterfaceC6693u0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objM28026T instanceof C6602C) {
                return m27981B0(this, ((C6602C) objM28026T).f24874a, null, 1, null);
            }
            return new C6703z0(AbstractC6633S.m28108a(this) + " has completed normally", null, this);
        }
        Throwable thM28054e = ((c) objM28026T).m28054e();
        if (thM28054e != null) {
            CancellationException cancellationExceptionM28018A0 = m28018A0(thM28054e, AbstractC6633S.m28108a(this) + " is cancelling");
            if (cancellationExceptionM28018A0 != null) {
                return cancellationExceptionM28018A0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // p318o6.InterfaceC6701y0
    public final InterfaceC6304e getChildren() {
        return AbstractC6307h.m27237b(new f(null));
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object objM28026T = m28026T();
        if (objM28026T instanceof InterfaceC6693u0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return m27992L(objM28026T);
    }

    @Override // p173W5.InterfaceC1879i.b
    public final InterfaceC1879i.c getKey() {
        return InterfaceC6701y0.f24999p;
    }

    @Override // p318o6.InterfaceC6701y0
    public final InterfaceC7360a getOnJoin() {
        i iVar = i.f24896a;
        AbstractC6118n.m27185c(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new C7361b(this, (InterfaceC5372q) AbstractC6104G.m27161d(iVar, 3), null, 4, null);
    }

    @Override // p318o6.InterfaceC6701y0
    public InterfaceC6701y0 getParent() {
        InterfaceC6692u interfaceC6692uM28025S = m28025S();
        if (interfaceC6692uM28025S != null) {
            return interfaceC6692uM28025S.getParent();
        }
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public String mo28034h0() {
        return AbstractC6633S.m28108a(this);
    }

    @Override // p318o6.InterfaceC6701y0
    public final InterfaceC6661e0 invokeOnCompletion(InterfaceC5367l interfaceC5367l) {
        return m28030Z(true, new C6699x0(interfaceC5367l));
    }

    @Override // p318o6.InterfaceC6701y0
    public boolean isActive() {
        Object objM28026T = m28026T();
        return (objM28026T instanceof InterfaceC6693u0) && ((InterfaceC6693u0) objM28026T).isActive();
    }

    @Override // p318o6.InterfaceC6701y0
    public final boolean isCancelled() {
        Object objM28026T = m28026T();
        if (objM28026T instanceof C6602C) {
            return true;
        }
        return (objM28026T instanceof c) && ((c) objM28026T).m28055i();
    }

    @Override // p318o6.InterfaceC6701y0
    public final boolean isCompleted() {
        return !(m28026T() instanceof InterfaceC6693u0);
    }

    @Override // p318o6.InterfaceC6701y0
    public final Object join(InterfaceC1875e interfaceC1875e) {
        if (m27997b0()) {
            Object objM27998c0 = m27998c0(interfaceC1875e);
            return objM27998c0 == AbstractC2005b.m8369e() ? objM27998c0 : C1444v.f4971a;
        }
        AbstractC6601B0.m27951h(interfaceC1875e.getContext());
        return C1444v.f4971a;
    }

    @Override // p173W5.InterfaceC1879i.b, p173W5.InterfaceC1879i
    public InterfaceC1879i minusKey(InterfaceC1879i.c cVar) {
        return InterfaceC6701y0.a.m28294e(this, cVar);
    }

    /* JADX INFO: renamed from: n0 */
    protected void m28035n0(Throwable th) {
    }

    @Override // p173W5.InterfaceC1879i
    public InterfaceC1879i plus(InterfaceC1879i interfaceC1879i) {
        return InterfaceC6701y0.a.m28295f(this, interfaceC1879i);
    }

    /* JADX INFO: renamed from: q0 */
    protected void mo28036q0(Object obj) {
    }

    /* JADX INFO: renamed from: r0 */
    protected void mo28037r0() {
    }

    @Override // p318o6.InterfaceC6701y0
    public final boolean start() {
        int iM28015y0;
        do {
            iM28015y0 = m28015y0(m28026T());
            if (iM28015y0 == 0) {
                return false;
            }
        } while (iM28015y0 != 1);
        return true;
    }

    public String toString() {
        return m28019C0() + '@' + AbstractC6633S.m28109b(this);
    }

    /* JADX INFO: renamed from: u */
    protected void mo28038u(Object obj) {
    }

    /* JADX INFO: renamed from: v */
    protected final Object m28039v(InterfaceC1875e interfaceC1875e) throws Throwable {
        Object objM28026T;
        do {
            objM28026T = m28026T();
            if (!(objM28026T instanceof InterfaceC6693u0)) {
                if (objM28026T instanceof C6602C) {
                    throw ((C6602C) objM28026T).f24874a;
                }
                return AbstractC6609F0.m28072h(objM28026T);
            }
        } while (m28015y0(objM28026T) < 0);
        return m28014w(interfaceC1875e);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m28040v0(AbstractC6605D0 abstractC6605D0) {
        Object objM28026T;
        do {
            objM28026T = m28026T();
            if (!(objM28026T instanceof AbstractC6605D0)) {
                if (!(objM28026T instanceof InterfaceC6693u0) || ((InterfaceC6693u0) objM28026T).mo27972a() == null) {
                    return;
                }
                abstractC6605D0.m31484r();
                return;
            }
            if (objM28026T != abstractC6605D0) {
                return;
            }
        } while (!AbstractC2404b.m10339a(f24876a, this, objM28026T, AbstractC6609F0.f24903g));
    }

    @Override // p318o6.InterfaceC6623M0
    /* JADX INFO: renamed from: w0 */
    public CancellationException mo28041w0() {
        Throwable thM28054e;
        Object objM28026T = m28026T();
        if (objM28026T instanceof c) {
            thM28054e = ((c) objM28026T).m28054e();
        } else if (objM28026T instanceof C6602C) {
            thM28054e = ((C6602C) objM28026T).f24874a;
        } else {
            if (objM28026T instanceof InterfaceC6693u0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM28026T).toString());
            }
            thM28054e = null;
        }
        CancellationException cancellationException = thM28054e instanceof CancellationException ? (CancellationException) thM28054e : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new C6703z0("Parent job is " + m28016z0(objM28026T), thM28054e, this);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m28042x0(InterfaceC6692u interfaceC6692u) {
        f24877b.set(this, interfaceC6692u);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m28043y(Throwable th) {
        return m28044z(th);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m28044z(Object obj) throws Throwable {
        Object objM27999e0 = AbstractC6609F0.f24897a;
        if (mo27939P() && (objM27999e0 = m27980B(obj)) == AbstractC6609F0.f24898b) {
            return true;
        }
        if (objM27999e0 == AbstractC6609F0.f24897a) {
            objM27999e0 = m27999e0(obj);
        }
        if (objM27999e0 == AbstractC6609F0.f24897a || objM27999e0 == AbstractC6609F0.f24898b) {
            return true;
        }
        if (objM27999e0 == AbstractC6609F0.f24900d) {
            return false;
        }
        mo28038u(objM27999e0);
        return true;
    }

    @Override // p318o6.InterfaceC6701y0
    public /* synthetic */ boolean cancel(Throwable th) throws Throwable {
        Throwable c6703z0;
        if (th == null || (c6703z0 = m27981B0(this, th, null, 1, null)) == null) {
            c6703z0 = new C6703z0(mo28020D(), null, this);
        }
        mo28017A(c6703z0);
        return true;
    }

    @Override // p318o6.InterfaceC6701y0
    public InterfaceC6701y0 plus(InterfaceC6701y0 interfaceC6701y0) {
        return InterfaceC6701y0.a.m28296g(this, interfaceC6701y0);
    }

    @Override // p318o6.InterfaceC6701y0
    public final InterfaceC6661e0 invokeOnCompletion(boolean z7, boolean z8, InterfaceC5367l interfaceC5367l) {
        AbstractC6605D0 c6699x0;
        if (z7) {
            c6699x0 = new C6697w0(interfaceC5367l);
        } else {
            c6699x0 = new C6699x0(interfaceC5367l);
        }
        return m28030Z(z8, c6699x0);
    }

    @Override // p318o6.InterfaceC6701y0
    public void cancel(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new C6703z0(mo28020D(), null, this);
        }
        mo28017A(cancellationException);
    }
}

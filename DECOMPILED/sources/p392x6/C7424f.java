package p392x6;

import androidx.appcompat.app.AbstractC2263x;
import androidx.concurrent.futures.AbstractC2404b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5372q;
import p318o6.AbstractC6618K;
import p318o6.AbstractC6633S;
import p318o6.AbstractC6686r;
import p318o6.C6682p;
import p318o6.InterfaceC6654b1;
import p318o6.InterfaceC6678n;
import p360t6.AbstractC7101A;
import p384w6.InterfaceC7364e;

/* JADX INFO: renamed from: x6.f */
/* JADX INFO: loaded from: classes.dex */
public class C7424f extends C7427i implements InterfaceC7419a {

    /* JADX INFO: renamed from: i */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29732i = AtomicReferenceFieldUpdater.newUpdater(C7424f.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h */
    private final InterfaceC5372q f29733h;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x6.f$a */
    final class a implements InterfaceC6678n, InterfaceC6654b1 {

        /* JADX INFO: renamed from: a */
        public final C6682p f29734a;

        /* JADX INFO: renamed from: b */
        public final Object f29735b;

        public a(C6682p c6682p, Object obj) {
            this.f29734a = c6682p;
            this.f29735b = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final C1444v m32871j(C7424f c7424f, a aVar, Throwable th) {
            c7424f.mo32855c(aVar.f29735b);
            return C1444v.f4971a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static final C1444v m32872n(C7424f c7424f, a aVar, Throwable th, C1444v c1444v, InterfaceC1879i interfaceC1879i) {
            C7424f.m32866x().set(c7424f, aVar.f29735b);
            c7424f.mo32855c(aVar.f29735b);
            return C1444v.f4971a;
        }

        @Override // p318o6.InterfaceC6678n
        /* JADX INFO: renamed from: a */
        public void mo28234a(InterfaceC5367l interfaceC5367l) {
            this.f29734a.mo28234a(interfaceC5367l);
        }

        @Override // p318o6.InterfaceC6654b1
        /* JADX INFO: renamed from: b */
        public void mo28160b(AbstractC7101A abstractC7101A, int i7) {
            this.f29734a.mo28160b(abstractC7101A, i7);
        }

        @Override // p318o6.InterfaceC6678n
        public boolean cancel(Throwable th) {
            return this.f29734a.cancel(th);
        }

        @Override // p318o6.InterfaceC6678n
        /* JADX INFO: renamed from: f */
        public Object mo28237f(Throwable th) {
            return this.f29734a.mo28237f(th);
        }

        @Override // p173W5.InterfaceC1875e
        public InterfaceC1879i getContext() {
            return this.f29734a.getContext();
        }

        @Override // p318o6.InterfaceC6678n
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo28236e(C1444v c1444v, InterfaceC5372q interfaceC5372q) {
            C7424f.m32866x().set(C7424f.this, this.f29735b);
            C6682p c6682p = this.f29734a;
            final C7424f c7424f = C7424f.this;
            c6682p.m28268O(c1444v, new InterfaceC5367l() { // from class: x6.e
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return C7424f.a.m32871j(c7424f, this, (Throwable) obj);
                }
            });
        }

        @Override // p318o6.InterfaceC6678n
        public boolean isCompleted() {
            return this.f29734a.isCompleted();
        }

        @Override // p318o6.InterfaceC6678n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo28235c(AbstractC6618K abstractC6618K, C1444v c1444v) {
            this.f29734a.mo28235c(abstractC6618K, c1444v);
        }

        @Override // p318o6.InterfaceC6678n
        /* JADX INFO: renamed from: l */
        public void mo28239l(Object obj) {
            this.f29734a.mo28239l(obj);
        }

        @Override // p318o6.InterfaceC6678n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Object mo28238h(C1444v c1444v, Object obj, InterfaceC5372q interfaceC5372q) {
            final C7424f c7424f = C7424f.this;
            Object objMo28238h = this.f29734a.mo28238h(c1444v, obj, new InterfaceC5372q() { // from class: x6.d
                @Override // p238e6.InterfaceC5372q
                /* JADX INFO: renamed from: j */
                public final Object mo7830j(Object obj2, Object obj3, Object obj4) {
                    return C7424f.a.m32872n(c7424f, this, (Throwable) obj2, (C1444v) obj3, (InterfaceC1879i) obj4);
                }
            });
            if (objMo28238h != null) {
                C7424f.m32866x().set(C7424f.this, this.f29735b);
            }
            return objMo28238h;
        }

        @Override // p173W5.InterfaceC1875e
        public void resumeWith(Object obj) {
            this.f29734a.resumeWith(obj);
        }
    }

    public C7424f(boolean z7) {
        super(1, z7 ? 1 : 0);
        this.owner$volatile = z7 ? null : AbstractC7425g.f29737a;
        this.f29733h = new InterfaceC5372q() { // from class: x6.b
            @Override // p238e6.InterfaceC5372q
            /* JADX INFO: renamed from: j */
            public final Object mo7830j(Object obj, Object obj2, Object obj3) {
                C7424f c7424f = this.f29725a;
                AbstractC2263x.m9328a(obj);
                return C7424f.m32860B(c7424f, null, obj2, obj3);
            }
        };
    }

    /* JADX INFO: renamed from: A */
    private final Object m32859A(Object obj, InterfaceC1875e interfaceC1875e) {
        C6682p c6682pM28281b = AbstractC6686r.m28281b(AbstractC2005b.m8367c(interfaceC1875e));
        try {
            m32891f(new a(c6682pM28281b, obj));
            Object objM28273y = c6682pM28281b.m28273y();
            if (objM28273y == AbstractC2005b.m8369e()) {
                AbstractC6093h.m27135c(interfaceC1875e);
            }
            return objM28273y == AbstractC2005b.m8369e() ? objM28273y : C1444v.f4971a;
        } catch (Throwable th) {
            c6682pM28281b.m28266M();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC5372q m32860B(final C7424f c7424f, InterfaceC7364e interfaceC7364e, final Object obj, Object obj2) {
        return new InterfaceC5372q() { // from class: x6.c
            @Override // p238e6.InterfaceC5372q
            /* JADX INFO: renamed from: j */
            public final Object mo7830j(Object obj3, Object obj4, Object obj5) {
                return C7424f.m32861C(this.f29726a, obj, (Throwable) obj3, obj4, (InterfaceC1879i) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C1444v m32861C(C7424f c7424f, Object obj, Throwable th, Object obj2, InterfaceC1879i interfaceC1879i) {
        c7424f.mo32855c(obj);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: D */
    private final int m32862D(Object obj) {
        while (!m32894r()) {
            if (obj == null) {
                return 1;
            }
            int iM32867y = m32867y(obj);
            if (iM32867y == 1) {
                return 2;
            }
            if (iM32867y == 2) {
                return 1;
            }
        }
        f29732i.set(this, obj);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m32866x() {
        return f29732i;
    }

    /* JADX INFO: renamed from: y */
    private final int m32867y(Object obj) {
        while (mo32854b()) {
            Object obj2 = f29732i.get(this);
            if (obj2 != AbstractC7425g.f29737a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    static /* synthetic */ Object m32868z(C7424f c7424f, Object obj, InterfaceC1875e interfaceC1875e) {
        Object objM32859A;
        return (!c7424f.mo32853a(obj) && (objM32859A = c7424f.m32859A(obj, interfaceC1875e)) == AbstractC2005b.m8369e()) ? objM32859A : C1444v.f4971a;
    }

    @Override // p392x6.InterfaceC7419a
    /* JADX INFO: renamed from: a */
    public boolean mo32853a(Object obj) {
        int iM32862D = m32862D(obj);
        if (iM32862D == 0) {
            return true;
        }
        if (iM32862D == 1) {
            return false;
        }
        if (iM32862D != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // p392x6.InterfaceC7419a
    /* JADX INFO: renamed from: b */
    public boolean mo32854b() {
        return m32892j() == 0;
    }

    @Override // p392x6.InterfaceC7419a
    /* JADX INFO: renamed from: c */
    public void mo32855c(Object obj) {
        while (mo32854b()) {
            Object obj2 = f29732i.get(this);
            if (obj2 != AbstractC7425g.f29737a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (AbstractC2404b.m10339a(f29732i, this, obj2, AbstractC7425g.f29737a)) {
                    m32893q();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // p392x6.InterfaceC7419a
    /* JADX INFO: renamed from: d */
    public Object mo32856d(Object obj, InterfaceC1875e interfaceC1875e) {
        return m32868z(this, obj, interfaceC1875e);
    }

    public String toString() {
        return "Mutex@" + AbstractC6633S.m28109b(this) + "[isLocked=" + mo32854b() + ",owner=" + f29732i.get(this) + ']';
    }
}

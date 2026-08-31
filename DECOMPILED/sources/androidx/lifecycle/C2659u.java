package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p311o.C6509a;
import p311o.C6510b;
import p344r6.AbstractC6935t;
import p344r6.InterfaceC6929n;

/* JADX INFO: renamed from: androidx.lifecycle.u */
/* JADX INFO: loaded from: classes.dex */
public class C2659u extends AbstractC2650l {

    /* JADX INFO: renamed from: k */
    public static final a f10488k = new a(null);

    /* JADX INFO: renamed from: b */
    private final boolean f10489b;

    /* JADX INFO: renamed from: c */
    private C6509a f10490c;

    /* JADX INFO: renamed from: d */
    private AbstractC2650l.b f10491d;

    /* JADX INFO: renamed from: e */
    private final WeakReference f10492e;

    /* JADX INFO: renamed from: f */
    private int f10493f;

    /* JADX INFO: renamed from: g */
    private boolean f10494g;

    /* JADX INFO: renamed from: h */
    private boolean f10495h;

    /* JADX INFO: renamed from: i */
    private ArrayList f10496i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC6929n f10497j;

    /* JADX INFO: renamed from: androidx.lifecycle.u$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC2650l.b m12653a(AbstractC2650l.b state1, AbstractC2650l.b bVar) {
            AbstractC6118n.m27187e(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.u$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private AbstractC2650l.b f10498a;

        /* JADX INFO: renamed from: b */
        private InterfaceC2654p f10499b;

        public b(InterfaceC2656r interfaceC2656r, AbstractC2650l.b initialState) {
            AbstractC6118n.m27187e(initialState, "initialState");
            AbstractC6118n.m27184b(interfaceC2656r);
            this.f10499b = C2663y.m12663f(interfaceC2656r);
            this.f10498a = initialState;
        }

        /* JADX INFO: renamed from: a */
        public final void m12654a(InterfaceC2657s interfaceC2657s, AbstractC2650l.a event) {
            AbstractC6118n.m27187e(event, "event");
            AbstractC2650l.b bVarM12630d = event.m12630d();
            this.f10498a = C2659u.f10488k.m12653a(this.f10498a, bVarM12630d);
            InterfaceC2654p interfaceC2654p = this.f10499b;
            AbstractC6118n.m27184b(interfaceC2657s);
            interfaceC2654p.mo173n(interfaceC2657s, event);
            this.f10498a = bVarM12630d;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC2650l.b m12655b() {
            return this.f10498a;
        }
    }

    private C2659u(InterfaceC2657s interfaceC2657s, boolean z7) {
        this.f10489b = z7;
        this.f10490c = new C6509a();
        AbstractC2650l.b bVar = AbstractC2650l.b.INITIALIZED;
        this.f10491d = bVar;
        this.f10496i = new ArrayList();
        this.f10492e = new WeakReference(interfaceC2657s);
        this.f10497j = AbstractC6935t.m30402a(bVar);
    }

    /* JADX INFO: renamed from: e */
    private final void m12642e(InterfaceC2657s interfaceC2657s) {
        Iterator itDescendingIterator = this.f10490c.descendingIterator();
        AbstractC6118n.m27186d(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.f10495h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            AbstractC6118n.m27184b(entry);
            InterfaceC2656r interfaceC2656r = (InterfaceC2656r) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.m12655b().compareTo(this.f10491d) > 0 && !this.f10495h && this.f10490c.contains(interfaceC2656r)) {
                AbstractC2650l.a aVarM12631a = AbstractC2650l.a.Companion.m12631a(bVar.m12655b());
                if (aVarM12631a == null) {
                    throw new IllegalStateException("no event down from " + bVar.m12655b());
                }
                m12649m(aVarM12631a.m12630d());
                bVar.m12654a(interfaceC2657s, aVarM12631a);
                m12648l();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC2650l.b m12643f(InterfaceC2656r interfaceC2656r) {
        b bVar;
        Map.Entry entryM27732n = this.f10490c.m27732n(interfaceC2656r);
        AbstractC2650l.b bVar2 = null;
        AbstractC2650l.b bVarM12655b = (entryM27732n == null || (bVar = (b) entryM27732n.getValue()) == null) ? null : bVar.m12655b();
        if (!this.f10496i.isEmpty()) {
            ArrayList arrayList = this.f10496i;
            bVar2 = (AbstractC2650l.b) arrayList.get(arrayList.size() - 1);
        }
        a aVar = f10488k;
        return aVar.m12653a(aVar.m12653a(this.f10491d, bVarM12655b), bVar2);
    }

    /* JADX INFO: renamed from: g */
    private final void m12644g(String str) {
        if (!this.f10489b || AbstractC2661w.m12657a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    /* JADX INFO: renamed from: h */
    private final void m12645h(InterfaceC2657s interfaceC2657s) {
        C6510b.d dVarM27734e = this.f10490c.m27734e();
        AbstractC6118n.m27186d(dVarM27734e, "iteratorWithAdditions(...)");
        while (dVarM27734e.hasNext() && !this.f10495h) {
            Map.Entry entry = (Map.Entry) dVarM27734e.next();
            InterfaceC2656r interfaceC2656r = (InterfaceC2656r) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.m12655b().compareTo(this.f10491d) < 0 && !this.f10495h && this.f10490c.contains(interfaceC2656r)) {
                m12649m(bVar.m12655b());
                AbstractC2650l.a aVarM12632b = AbstractC2650l.a.Companion.m12632b(bVar.m12655b());
                if (aVarM12632b == null) {
                    throw new IllegalStateException("no event up from " + bVar.m12655b());
                }
                bVar.m12654a(interfaceC2657s, aVarM12632b);
                m12648l();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private final boolean m12646j() {
        if (this.f10490c.size() == 0) {
            return true;
        }
        Map.Entry entryM27733a = this.f10490c.m27733a();
        AbstractC6118n.m27184b(entryM27733a);
        AbstractC2650l.b bVarM12655b = ((b) entryM27733a.getValue()).m12655b();
        Map.Entry entryM27735g = this.f10490c.m27735g();
        AbstractC6118n.m27184b(entryM27735g);
        AbstractC2650l.b bVarM12655b2 = ((b) entryM27735g.getValue()).m12655b();
        return bVarM12655b == bVarM12655b2 && this.f10491d == bVarM12655b2;
    }

    /* JADX INFO: renamed from: k */
    private final void m12647k(AbstractC2650l.b bVar) {
        if (this.f10491d == bVar) {
            return;
        }
        AbstractC2660v.m12656a((InterfaceC2657s) this.f10492e.get(), this.f10491d, bVar);
        this.f10491d = bVar;
        if (this.f10494g || this.f10493f != 0) {
            this.f10495h = true;
            return;
        }
        this.f10494g = true;
        m12650o();
        this.f10494g = false;
        if (this.f10491d == AbstractC2650l.b.DESTROYED) {
            this.f10490c = new C6509a();
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m12648l() {
        ArrayList arrayList = this.f10496i;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: m */
    private final void m12649m(AbstractC2650l.b bVar) {
        this.f10496i.add(bVar);
    }

    /* JADX INFO: renamed from: o */
    private final void m12650o() {
        InterfaceC2657s interfaceC2657s = (InterfaceC2657s) this.f10492e.get();
        if (interfaceC2657s == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!m12646j()) {
            this.f10495h = false;
            AbstractC2650l.b bVar = this.f10491d;
            Map.Entry entryM27733a = this.f10490c.m27733a();
            AbstractC6118n.m27184b(entryM27733a);
            if (bVar.compareTo(((b) entryM27733a.getValue()).m12655b()) < 0) {
                m12642e(interfaceC2657s);
            }
            Map.Entry entryM27735g = this.f10490c.m27735g();
            if (!this.f10495h && entryM27735g != null && this.f10491d.compareTo(((b) entryM27735g.getValue()).m12655b()) > 0) {
                m12645h(interfaceC2657s);
            }
        }
        this.f10495h = false;
        this.f10497j.setValue(mo12626b());
    }

    @Override // androidx.lifecycle.AbstractC2650l
    /* JADX INFO: renamed from: a */
    public void mo12625a(InterfaceC2656r observer) {
        InterfaceC2657s interfaceC2657s;
        AbstractC6118n.m27187e(observer, "observer");
        m12644g("addObserver");
        AbstractC2650l.b bVar = this.f10491d;
        AbstractC2650l.b bVar2 = AbstractC2650l.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC2650l.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f10490c.mo27730k(observer, bVar3)) == null && (interfaceC2657s = (InterfaceC2657s) this.f10492e.get()) != null) {
            boolean z7 = this.f10493f != 0 || this.f10494g;
            AbstractC2650l.b bVarM12643f = m12643f(observer);
            this.f10493f++;
            while (bVar3.m12655b().compareTo(bVarM12643f) < 0 && this.f10490c.contains(observer)) {
                m12649m(bVar3.m12655b());
                AbstractC2650l.a aVarM12632b = AbstractC2650l.a.Companion.m12632b(bVar3.m12655b());
                if (aVarM12632b == null) {
                    throw new IllegalStateException("no event up from " + bVar3.m12655b());
                }
                bVar3.m12654a(interfaceC2657s, aVarM12632b);
                m12648l();
                bVarM12643f = m12643f(observer);
            }
            if (!z7) {
                m12650o();
            }
            this.f10493f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC2650l
    /* JADX INFO: renamed from: b */
    public AbstractC2650l.b mo12626b() {
        return this.f10491d;
    }

    @Override // androidx.lifecycle.AbstractC2650l
    /* JADX INFO: renamed from: d */
    public void mo12628d(InterfaceC2656r observer) {
        AbstractC6118n.m27187e(observer, "observer");
        m12644g("removeObserver");
        this.f10490c.mo27731m(observer);
    }

    /* JADX INFO: renamed from: i */
    public void m12651i(AbstractC2650l.a event) {
        AbstractC6118n.m27187e(event, "event");
        m12644g("handleLifecycleEvent");
        m12647k(event.m12630d());
    }

    /* JADX INFO: renamed from: n */
    public void m12652n(AbstractC2650l.b state) {
        AbstractC6118n.m27187e(state, "state");
        m12644g("setCurrentState");
        m12647k(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2659u(InterfaceC2657s provider) {
        this(provider, true);
        AbstractC6118n.m27187e(provider, "provider");
    }
}

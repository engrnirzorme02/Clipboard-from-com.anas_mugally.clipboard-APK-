package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractC2579F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p081K.C0713e;
import p111O.AbstractC1030Z;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p248g0.AbstractC5452b;

/* JADX INFO: renamed from: androidx.fragment.app.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2579F {

    /* JADX INFO: renamed from: f */
    public static final a f10017f = new a(null);

    /* JADX INFO: renamed from: a */
    private final ViewGroup f10018a;

    /* JADX INFO: renamed from: b */
    private final List f10019b;

    /* JADX INFO: renamed from: c */
    private final List f10020c;

    /* JADX INFO: renamed from: d */
    private boolean f10021d;

    /* JADX INFO: renamed from: e */
    private boolean f10022e;

    /* JADX INFO: renamed from: androidx.fragment.app.F$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC2579F m11987a(ViewGroup container, AbstractC2599q fragmentManager) {
            AbstractC6118n.m27187e(container, "container");
            AbstractC6118n.m27187e(fragmentManager, "fragmentManager");
            InterfaceC2581G interfaceC2581GM12327A0 = fragmentManager.m12327A0();
            AbstractC6118n.m27186d(interfaceC2581GM12327A0, "fragmentManager.specialEffectsControllerFactory");
            return m11988b(container, interfaceC2581GM12327A0);
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC2579F m11988b(ViewGroup container, InterfaceC2581G factory) {
            AbstractC6118n.m27187e(container, "container");
            AbstractC6118n.m27187e(factory, "factory");
            int i7 = AbstractC5452b.f20751b;
            Object tag = container.getTag(i7);
            if (tag instanceof AbstractC2579F) {
                return (AbstractC2579F) tag;
            }
            AbstractC2579F abstractC2579FMo12011a = factory.mo12011a(container);
            AbstractC6118n.m27186d(abstractC2579FMo12011a, "factory.createController(container)");
            container.setTag(i7, abstractC2579FMo12011a);
            return abstractC2579FMo12011a;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.fragment.app.F$b */
    static final class b extends c {

        /* JADX INFO: renamed from: h */
        private final C2604v f10023h;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(c.b finalState, c.a lifecycleImpact, C2604v fragmentStateManager, C0713e cancellationSignal) {
            AbstractC6118n.m27187e(finalState, "finalState");
            AbstractC6118n.m27187e(lifecycleImpact, "lifecycleImpact");
            AbstractC6118n.m27187e(fragmentStateManager, "fragmentStateManager");
            AbstractC6118n.m27187e(cancellationSignal, "cancellationSignal");
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = fragmentStateManager.m12466k();
            AbstractC6118n.m27186d(abstractComponentCallbacksC2591iM12466k, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, abstractComponentCallbacksC2591iM12466k, cancellationSignal);
            this.f10023h = fragmentStateManager;
        }

        @Override // androidx.fragment.app.AbstractC2579F.c
        /* JADX INFO: renamed from: e */
        public void mo11989e() {
            super.mo11989e();
            this.f10023h.m12467m();
        }

        @Override // androidx.fragment.app.AbstractC2579F.c
        /* JADX INFO: renamed from: n */
        public void mo11990n() {
            if (m11998i() != c.a.ADDING) {
                if (m11998i() == c.a.REMOVING) {
                    AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = this.f10023h.m12466k();
                    AbstractC6118n.m27186d(abstractComponentCallbacksC2591iM12466k, "fragmentStateManager.fragment");
                    View viewM12216z1 = abstractComponentCallbacksC2591iM12466k.m12216z1();
                    AbstractC6118n.m27186d(viewM12216z1, "fragment.requireView()");
                    if (AbstractC2599q.m12289I0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewM12216z1.findFocus() + " on view " + viewM12216z1 + " for Fragment " + abstractComponentCallbacksC2591iM12466k);
                    }
                    viewM12216z1.clearFocus();
                    return;
                }
                return;
            }
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k2 = this.f10023h.m12466k();
            AbstractC6118n.m27186d(abstractComponentCallbacksC2591iM12466k2, "fragmentStateManager.fragment");
            View viewFindFocus = abstractComponentCallbacksC2591iM12466k2.f10138T.findFocus();
            if (viewFindFocus != null) {
                abstractComponentCallbacksC2591iM12466k2.m12120F1(viewFindFocus);
                if (AbstractC2599q.m12289I0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC2591iM12466k2);
                }
            }
            View viewM12216z2 = m11997h().m12216z1();
            AbstractC6118n.m27186d(viewM12216z2, "this.fragment.requireView()");
            if (viewM12216z2.getParent() == null) {
                this.f10023h.m12457b();
                viewM12216z2.setAlpha(0.0f);
            }
            if (viewM12216z2.getAlpha() == 0.0f && viewM12216z2.getVisibility() == 0) {
                viewM12216z2.setVisibility(4);
            }
            viewM12216z2.setAlpha(abstractComponentCallbacksC2591iM12466k2.m12142O());
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.F$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        private b f10024a;

        /* JADX INFO: renamed from: b */
        private a f10025b;

        /* JADX INFO: renamed from: c */
        private final AbstractComponentCallbacksC2591i f10026c;

        /* JADX INFO: renamed from: d */
        private final List f10027d;

        /* JADX INFO: renamed from: e */
        private final Set f10028e;

        /* JADX INFO: renamed from: f */
        private boolean f10029f;

        /* JADX INFO: renamed from: g */
        private boolean f10030g;

        /* JADX INFO: renamed from: androidx.fragment.app.F$c$a */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: renamed from: androidx.fragment.app.F$c$b */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: a */
            public static final a f10035a = new a(null);

            /* JADX INFO: renamed from: androidx.fragment.app.F$c$b$a */
            public static final class a {
                public /* synthetic */ a(AbstractC6112h abstractC6112h) {
                    this();
                }

                /* JADX INFO: renamed from: a */
                public final b m12007a(View view) {
                    AbstractC6118n.m27187e(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : m12008b(view.getVisibility());
                }

                /* JADX INFO: renamed from: b */
                public final b m12008b(int i7) {
                    if (i7 == 0) {
                        return b.VISIBLE;
                    }
                    if (i7 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i7 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i7);
                }

                private a() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.F$c$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C7665b {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f10041a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f10041a = iArr;
                }
            }

            /* JADX INFO: renamed from: h */
            public static final b m12005h(int i7) {
                return f10035a.m12008b(i7);
            }

            /* JADX INFO: renamed from: d */
            public final void m12006d(View view) {
                AbstractC6118n.m27187e(view, "view");
                int i7 = C7665b.f10041a[ordinal()];
                if (i7 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (AbstractC2599q.m12289I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i7 == 2) {
                    if (AbstractC2599q.m12289I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i7 == 3) {
                    if (AbstractC2599q.m12289I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i7 != 4) {
                    return;
                }
                if (AbstractC2599q.m12289I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.F$c$c, reason: collision with other inner class name */
        public /* synthetic */ class C7666c {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f10042a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f10042a = iArr;
            }
        }

        public c(b finalState, a lifecycleImpact, AbstractComponentCallbacksC2591i fragment, C0713e cancellationSignal) {
            AbstractC6118n.m27187e(finalState, "finalState");
            AbstractC6118n.m27187e(lifecycleImpact, "lifecycleImpact");
            AbstractC6118n.m27187e(fragment, "fragment");
            AbstractC6118n.m27187e(cancellationSignal, "cancellationSignal");
            this.f10024a = finalState;
            this.f10025b = lifecycleImpact;
            this.f10026c = fragment;
            this.f10027d = new ArrayList();
            this.f10028e = new LinkedHashSet();
            cancellationSignal.m3462c(new C0713e.a() { // from class: h0.s
                @Override // p081K.C0713e.a
                /* JADX INFO: renamed from: a */
                public final void mo3463a() {
                    AbstractC2579F.c.m11992b(this.f21383a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m11992b(c this$0) {
            AbstractC6118n.m27187e(this$0, "this$0");
            this$0.m11994d();
        }

        /* JADX INFO: renamed from: c */
        public final void m11993c(Runnable listener) {
            AbstractC6118n.m27187e(listener, "listener");
            this.f10027d.add(listener);
        }

        /* JADX INFO: renamed from: d */
        public final void m11994d() {
            if (this.f10029f) {
                return;
            }
            this.f10029f = true;
            if (this.f10028e.isEmpty()) {
                mo11989e();
                return;
            }
            Iterator it = AbstractC1638q.m6597k0(this.f10028e).iterator();
            while (it.hasNext()) {
                ((C0713e) it.next()).m3460a();
            }
        }

        /* JADX INFO: renamed from: e */
        public void mo11989e() {
            if (this.f10030g) {
                return;
            }
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f10030g = true;
            Iterator it = this.f10027d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m11995f(C0713e signal) {
            AbstractC6118n.m27187e(signal, "signal");
            if (this.f10028e.remove(signal) && this.f10028e.isEmpty()) {
                mo11989e();
            }
        }

        /* JADX INFO: renamed from: g */
        public final b m11996g() {
            return this.f10024a;
        }

        /* JADX INFO: renamed from: h */
        public final AbstractComponentCallbacksC2591i m11997h() {
            return this.f10026c;
        }

        /* JADX INFO: renamed from: i */
        public final a m11998i() {
            return this.f10025b;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m11999j() {
            return this.f10029f;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m12000k() {
            return this.f10030g;
        }

        /* JADX INFO: renamed from: l */
        public final void m12001l(C0713e signal) {
            AbstractC6118n.m27187e(signal, "signal");
            mo11990n();
            this.f10028e.add(signal);
        }

        /* JADX INFO: renamed from: m */
        public final void m12002m(b finalState, a lifecycleImpact) {
            AbstractC6118n.m27187e(finalState, "finalState");
            AbstractC6118n.m27187e(lifecycleImpact, "lifecycleImpact");
            int i7 = C7666c.f10042a[lifecycleImpact.ordinal()];
            if (i7 == 1) {
                if (this.f10024a == b.REMOVED) {
                    if (AbstractC2599q.m12289I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f10026c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f10025b + " to ADDING.");
                    }
                    this.f10024a = b.VISIBLE;
                    this.f10025b = a.ADDING;
                    return;
                }
                return;
            }
            if (i7 == 2) {
                if (AbstractC2599q.m12289I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f10026c + " mFinalState = " + this.f10024a + " -> REMOVED. mLifecycleImpact  = " + this.f10025b + " to REMOVING.");
                }
                this.f10024a = b.REMOVED;
                this.f10025b = a.REMOVING;
                return;
            }
            if (i7 == 3 && this.f10024a != b.REMOVED) {
                if (AbstractC2599q.m12289I0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f10026c + " mFinalState = " + this.f10024a + " -> " + finalState + '.');
                }
                this.f10024a = finalState;
            }
        }

        /* JADX INFO: renamed from: n */
        public abstract void mo11990n();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f10024a + " lifecycleImpact = " + this.f10025b + " fragment = " + this.f10026c + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.F$d */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10043a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10043a = iArr;
        }
    }

    public AbstractC2579F(ViewGroup container) {
        AbstractC6118n.m27187e(container, "container");
        this.f10018a = container;
        this.f10019b = new ArrayList();
        this.f10020c = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    private final void m11967c(c.b bVar, c.a aVar, C2604v c2604v) {
        synchronized (this.f10019b) {
            C0713e c0713e = new C0713e();
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = c2604v.m12466k();
            AbstractC6118n.m27186d(abstractComponentCallbacksC2591iM12466k, "fragmentStateManager.fragment");
            c cVarM11970l = m11970l(abstractComponentCallbacksC2591iM12466k);
            if (cVarM11970l != null) {
                cVarM11970l.m12002m(bVar, aVar);
                return;
            }
            final b bVar2 = new b(bVar, aVar, c2604v, c0713e);
            this.f10019b.add(bVar2);
            bVar2.m11993c(new Runnable() { // from class: androidx.fragment.app.D
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2579F.m11968d(this.f10013a, bVar2);
                }
            });
            bVar2.m11993c(new Runnable() { // from class: androidx.fragment.app.E
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2579F.m11969e(this.f10015a, bVar2);
                }
            });
            C1444v c1444v = C1444v.f4971a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m11968d(AbstractC2579F this$0, b operation) {
        AbstractC6118n.m27187e(this$0, "this$0");
        AbstractC6118n.m27187e(operation, "$operation");
        if (this$0.f10019b.contains(operation)) {
            c.b bVarM11996g = operation.m11996g();
            View view = operation.m11997h().f10138T;
            AbstractC6118n.m27186d(view, "operation.fragment.mView");
            bVarM11996g.m12006d(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m11969e(AbstractC2579F this$0, b operation) {
        AbstractC6118n.m27187e(this$0, "this$0");
        AbstractC6118n.m27187e(operation, "$operation");
        this$0.f10019b.remove(operation);
        this$0.f10020c.remove(operation);
    }

    /* JADX INFO: renamed from: l */
    private final c m11970l(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        Object next;
        Iterator it = this.f10019b.iterator();
        while (it.hasNext()) {
            next = it.next();
            c cVar = (c) next;
            if (AbstractC6118n.m27183a(cVar.m11997h(), abstractComponentCallbacksC2591i) && !cVar.m11999j()) {
                return (c) next;
            }
        }
        next = null;
        return (c) next;
    }

    /* JADX INFO: renamed from: m */
    private final c m11971m(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        Object next;
        Iterator it = this.f10020c.iterator();
        while (it.hasNext()) {
            next = it.next();
            c cVar = (c) next;
            if (AbstractC6118n.m27183a(cVar.m11997h(), abstractComponentCallbacksC2591i) && !cVar.m11999j()) {
                return (c) next;
            }
        }
        next = null;
        return (c) next;
    }

    /* JADX INFO: renamed from: r */
    public static final AbstractC2579F m11972r(ViewGroup viewGroup, AbstractC2599q abstractC2599q) {
        return f10017f.m11987a(viewGroup, abstractC2599q);
    }

    /* JADX INFO: renamed from: s */
    public static final AbstractC2579F m11973s(ViewGroup viewGroup, InterfaceC2581G interfaceC2581G) {
        return f10017f.m11988b(viewGroup, interfaceC2581G);
    }

    /* JADX INFO: renamed from: u */
    private final void m11974u() {
        for (c cVar : this.f10019b) {
            if (cVar.m11998i() == c.a.ADDING) {
                View viewM12216z1 = cVar.m11997h().m12216z1();
                AbstractC6118n.m27186d(viewM12216z1, "fragment.requireView()");
                cVar.m12002m(c.b.f10035a.m12008b(viewM12216z1.getVisibility()), c.a.NONE);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11975f(c.b finalState, C2604v fragmentStateManager) {
        AbstractC6118n.m27187e(finalState, "finalState");
        AbstractC6118n.m27187e(fragmentStateManager, "fragmentStateManager");
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.m12466k());
        }
        m11967c(finalState, c.a.ADDING, fragmentStateManager);
    }

    /* JADX INFO: renamed from: g */
    public final void m11976g(C2604v fragmentStateManager) {
        AbstractC6118n.m27187e(fragmentStateManager, "fragmentStateManager");
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.m12466k());
        }
        m11967c(c.b.GONE, c.a.NONE, fragmentStateManager);
    }

    /* JADX INFO: renamed from: h */
    public final void m11977h(C2604v fragmentStateManager) {
        AbstractC6118n.m27187e(fragmentStateManager, "fragmentStateManager");
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.m12466k());
        }
        m11967c(c.b.REMOVED, c.a.REMOVING, fragmentStateManager);
    }

    /* JADX INFO: renamed from: i */
    public final void m11978i(C2604v fragmentStateManager) {
        AbstractC6118n.m27187e(fragmentStateManager, "fragmentStateManager");
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.m12466k());
        }
        m11967c(c.b.VISIBLE, c.a.NONE, fragmentStateManager);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo11979j(List list, boolean z7);

    /* JADX INFO: renamed from: k */
    public final void m11980k() {
        if (this.f10022e) {
            return;
        }
        if (!AbstractC1030Z.m4443O(this.f10018a)) {
            m11981n();
            this.f10021d = false;
            return;
        }
        synchronized (this.f10019b) {
            try {
                if (!this.f10019b.isEmpty()) {
                    List<c> listJ0 = AbstractC1638q.m6596j0(this.f10020c);
                    this.f10020c.clear();
                    for (c cVar : listJ0) {
                        if (AbstractC2599q.m12289I0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar);
                        }
                        cVar.m11994d();
                        if (!cVar.m12000k()) {
                            this.f10020c.add(cVar);
                        }
                    }
                    m11974u();
                    List listJ1 = AbstractC1638q.m6596j0(this.f10019b);
                    this.f10019b.clear();
                    this.f10020c.addAll(listJ1);
                    if (AbstractC2599q.m12289I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = listJ1.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).mo11990n();
                    }
                    mo11979j(listJ1, this.f10021d);
                    this.f10021d = false;
                    if (AbstractC2599q.m12289I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11981n() {
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zM4443O = AbstractC1030Z.m4443O(this.f10018a);
        synchronized (this.f10019b) {
            try {
                m11974u();
                Iterator it = this.f10019b.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).mo11990n();
                }
                for (c cVar : AbstractC1638q.m6596j0(this.f10020c)) {
                    if (AbstractC2599q.m12289I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zM4443O ? "" : "Container " + this.f10018a + " is not attached to window. ") + "Cancelling running operation " + cVar);
                    }
                    cVar.m11994d();
                }
                for (c cVar2 : AbstractC1638q.m6596j0(this.f10019b)) {
                    if (AbstractC2599q.m12289I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zM4443O ? "" : "Container " + this.f10018a + " is not attached to window. ") + "Cancelling pending operation " + cVar2);
                    }
                    cVar2.m11994d();
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m11982o() {
        if (this.f10022e) {
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f10022e = false;
            m11980k();
        }
    }

    /* JADX INFO: renamed from: p */
    public final c.a m11983p(C2604v fragmentStateManager) {
        AbstractC6118n.m27187e(fragmentStateManager, "fragmentStateManager");
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = fragmentStateManager.m12466k();
        AbstractC6118n.m27186d(abstractComponentCallbacksC2591iM12466k, "fragmentStateManager.fragment");
        c cVarM11970l = m11970l(abstractComponentCallbacksC2591iM12466k);
        c.a aVarM11998i = cVarM11970l != null ? cVarM11970l.m11998i() : null;
        c cVarM11971m = m11971m(abstractComponentCallbacksC2591iM12466k);
        c.a aVarM11998i2 = cVarM11971m != null ? cVarM11971m.m11998i() : null;
        int i7 = aVarM11998i == null ? -1 : d.f10043a[aVarM11998i.ordinal()];
        return (i7 == -1 || i7 == 1) ? aVarM11998i2 : aVarM11998i;
    }

    /* JADX INFO: renamed from: q */
    public final ViewGroup m11984q() {
        return this.f10018a;
    }

    /* JADX INFO: renamed from: t */
    public final void m11985t() {
        Object objPrevious;
        synchronized (this.f10019b) {
            try {
                m11974u();
                List list = this.f10019b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    c cVar = (c) objPrevious;
                    c.b.a aVar = c.b.f10035a;
                    View view = cVar.m11997h().f10138T;
                    AbstractC6118n.m27186d(view, "operation.fragment.mView");
                    c.b bVarM12007a = aVar.m12007a(view);
                    c.b bVarM11996g = cVar.m11996g();
                    c.b bVar = c.b.VISIBLE;
                    if (bVarM11996g == bVar && bVarM12007a != bVar) {
                        break;
                    }
                }
                c cVar2 = (c) objPrevious;
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM11997h = cVar2 != null ? cVar2.m11997h() : null;
                this.f10022e = abstractComponentCallbacksC2591iM11997h != null ? abstractComponentCallbacksC2591iM11997h.m12179k0() : false;
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m11986v(boolean z7) {
        this.f10021d = z7;
    }
}

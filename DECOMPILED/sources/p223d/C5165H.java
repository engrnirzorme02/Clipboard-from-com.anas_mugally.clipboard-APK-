package p223d;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.InterfaceC2654p;
import androidx.lifecycle.InterfaceC2657s;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6116l;
import kotlin.jvm.internal.AbstractC6118n;
import p104N.InterfaceC0904a;
import p145S5.C1444v;
import p152T5.C1630i;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: d.H */
/* JADX INFO: loaded from: classes.dex */
public final class C5165H {

    /* JADX INFO: renamed from: a */
    private final Runnable f19748a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0904a f19749b;

    /* JADX INFO: renamed from: c */
    private final C1630i f19750c;

    /* JADX INFO: renamed from: d */
    private AbstractC5158A f19751d;

    /* JADX INFO: renamed from: e */
    private OnBackInvokedCallback f19752e;

    /* JADX INFO: renamed from: f */
    private OnBackInvokedDispatcher f19753f;

    /* JADX INFO: renamed from: g */
    private boolean f19754g;

    /* JADX INFO: renamed from: h */
    private boolean f19755h;

    /* JADX INFO: renamed from: d.H$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f19756a = new a();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final void m23942c(InterfaceC5356a interfaceC5356a) {
            interfaceC5356a.invoke();
        }

        /* JADX INFO: renamed from: b */
        public final OnBackInvokedCallback m23943b(final InterfaceC5356a onBackInvoked) {
            AbstractC6118n.m27187e(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: d.G
                public final void onBackInvoked() {
                    C5165H.a.m23942c(onBackInvoked);
                }
            };
        }

        /* JADX INFO: renamed from: d */
        public final void m23944d(Object dispatcher, int i7, Object callback) {
            AbstractC6118n.m27187e(dispatcher, "dispatcher");
            AbstractC6118n.m27187e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i7, (OnBackInvokedCallback) callback);
        }

        /* JADX INFO: renamed from: e */
        public final void m23945e(Object dispatcher, Object callback) {
            AbstractC6118n.m27187e(dispatcher, "dispatcher");
            AbstractC6118n.m27187e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: renamed from: d.H$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f19757a = new b();

        /* JADX INFO: renamed from: d.H$b$a */
        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC5367l f19758a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC5367l f19759b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ InterfaceC5356a f19760c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ InterfaceC5356a f19761d;

            a(InterfaceC5367l interfaceC5367l, InterfaceC5367l interfaceC5367l2, InterfaceC5356a interfaceC5356a, InterfaceC5356a interfaceC5356a2) {
                this.f19758a = interfaceC5367l;
                this.f19759b = interfaceC5367l2;
                this.f19760c = interfaceC5356a;
                this.f19761d = interfaceC5356a2;
            }

            public void onBackCancelled() {
                this.f19761d.invoke();
            }

            public void onBackInvoked() {
                this.f19760c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                AbstractC6118n.m27187e(backEvent, "backEvent");
                this.f19759b.invoke(new C5173c(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                AbstractC6118n.m27187e(backEvent, "backEvent");
                this.f19758a.invoke(new C5173c(backEvent));
            }
        }

        private b() {
        }

        /* JADX INFO: renamed from: a */
        public final OnBackInvokedCallback m23946a(InterfaceC5367l onBackStarted, InterfaceC5367l onBackProgressed, InterfaceC5356a onBackInvoked, InterfaceC5356a onBackCancelled) {
            AbstractC6118n.m27187e(onBackStarted, "onBackStarted");
            AbstractC6118n.m27187e(onBackProgressed, "onBackProgressed");
            AbstractC6118n.m27187e(onBackInvoked, "onBackInvoked");
            AbstractC6118n.m27187e(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }
    }

    /* JADX INFO: renamed from: d.H$c */
    private final class c implements InterfaceC2654p, InterfaceC5174d {

        /* JADX INFO: renamed from: a */
        private final AbstractC2650l f19762a;

        /* JADX INFO: renamed from: b */
        private final AbstractC5158A f19763b;

        /* JADX INFO: renamed from: c */
        private InterfaceC5174d f19764c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C5165H f19765d;

        public c(C5165H c5165h, AbstractC2650l lifecycle, AbstractC5158A onBackPressedCallback) {
            AbstractC6118n.m27187e(lifecycle, "lifecycle");
            AbstractC6118n.m27187e(onBackPressedCallback, "onBackPressedCallback");
            this.f19765d = c5165h;
            this.f19762a = lifecycle;
            this.f19763b = onBackPressedCallback;
            lifecycle.mo12625a(this);
        }

        @Override // p223d.InterfaceC5174d
        public void cancel() {
            this.f19762a.mo12628d(this);
            this.f19763b.m23914i(this);
            InterfaceC5174d interfaceC5174d = this.f19764c;
            if (interfaceC5174d != null) {
                interfaceC5174d.cancel();
            }
            this.f19764c = null;
        }

        @Override // androidx.lifecycle.InterfaceC2654p
        /* JADX INFO: renamed from: n */
        public void mo173n(InterfaceC2657s source, AbstractC2650l.a event) {
            AbstractC6118n.m27187e(source, "source");
            AbstractC6118n.m27187e(event, "event");
            if (event == AbstractC2650l.a.ON_START) {
                this.f19764c = this.f19765d.m23938q(this.f19763b);
                return;
            }
            if (event != AbstractC2650l.a.ON_STOP) {
                if (event == AbstractC2650l.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC5174d interfaceC5174d = this.f19764c;
                if (interfaceC5174d != null) {
                    interfaceC5174d.cancel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d.H$d */
    private final class d implements InterfaceC5174d {

        /* JADX INFO: renamed from: a */
        private final AbstractC5158A f19766a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C5165H f19767b;

        public d(C5165H c5165h, AbstractC5158A onBackPressedCallback) {
            AbstractC6118n.m27187e(onBackPressedCallback, "onBackPressedCallback");
            this.f19767b = c5165h;
            this.f19766a = onBackPressedCallback;
        }

        @Override // p223d.InterfaceC5174d
        public void cancel() {
            this.f19767b.f19750c.remove(this.f19766a);
            if (AbstractC6118n.m27183a(this.f19767b.f19751d, this.f19766a)) {
                this.f19766a.m23909c();
                this.f19767b.f19751d = null;
            }
            this.f19766a.m23914i(this);
            InterfaceC5356a interfaceC5356aM23908b = this.f19766a.m23908b();
            if (interfaceC5356aM23908b != null) {
                interfaceC5356aM23908b.invoke();
            }
            this.f19766a.m23916k(null);
        }
    }

    /* JADX INFO: renamed from: d.H$e */
    /* synthetic */ class e extends AbstractC6116l implements InterfaceC5356a {
        e(Object obj) {
            super(0, obj, C5165H.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m23947d() {
            ((C5165H) this.receiver).m23935x();
        }

        @Override // p238e6.InterfaceC5356a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23947d();
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: d.H$f */
    /* synthetic */ class f extends AbstractC6116l implements InterfaceC5356a {
        f(Object obj) {
            super(0, obj, C5165H.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m23948d() {
            ((C5165H) this.receiver).m23935x();
        }

        @Override // p238e6.InterfaceC5356a
        public /* bridge */ /* synthetic */ Object invoke() {
            m23948d();
            return C1444v.f4971a;
        }
    }

    public C5165H(Runnable runnable, InterfaceC0904a interfaceC0904a) {
        this.f19748a = runnable;
        this.f19749b = interfaceC0904a;
        this.f19750c = new C1630i();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.f19752e = i7 >= 34 ? b.f19757a.m23946a(new InterfaceC5367l() { // from class: d.B
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return C5165H.m23922f(this.f19742a, (C5173c) obj);
                }
            }, new InterfaceC5367l() { // from class: d.C
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return C5165H.m23923g(this.f19743a, (C5173c) obj);
                }
            }, new InterfaceC5356a() { // from class: d.D
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C5165H.m23924h(this.f19744a);
                }
            }, new InterfaceC5356a() { // from class: d.E
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C5165H.m23925i(this.f19745a);
                }
            }) : a.f19756a.m23943b(new InterfaceC5356a() { // from class: d.F
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C5165H.m23926j(this.f19746a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C1444v m23922f(C5165H c5165h, C5173c backEvent) {
        AbstractC6118n.m27187e(backEvent, "backEvent");
        c5165h.m23933u(backEvent);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C1444v m23923g(C5165H c5165h, C5173c backEvent) {
        AbstractC6118n.m27187e(backEvent, "backEvent");
        c5165h.m23932t(backEvent);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C1444v m23924h(C5165H c5165h) {
        c5165h.m23939s();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C1444v m23925i(C5165H c5165h) {
        c5165h.m23931r();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C1444v m23926j(C5165H c5165h) {
        c5165h.m23939s();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: r */
    private final void m23931r() {
        Object objPrevious;
        AbstractC5158A abstractC5158A = this.f19751d;
        if (abstractC5158A == null) {
            C1630i c1630i = this.f19750c;
            ListIterator<E> listIterator = c1630i.listIterator(c1630i.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((AbstractC5158A) objPrevious).m23912g());
            abstractC5158A = (AbstractC5158A) objPrevious;
        }
        this.f19751d = null;
        if (abstractC5158A != null) {
            abstractC5158A.m23909c();
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m23932t(C5173c c5173c) {
        Object objPrevious;
        AbstractC5158A abstractC5158A = this.f19751d;
        if (abstractC5158A == null) {
            C1630i c1630i = this.f19750c;
            ListIterator<E> listIterator = c1630i.listIterator(c1630i.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((AbstractC5158A) objPrevious).m23912g());
            abstractC5158A = (AbstractC5158A) objPrevious;
        }
        if (abstractC5158A != null) {
            abstractC5158A.m23910e(c5173c);
        }
    }

    /* JADX INFO: renamed from: u */
    private final void m23933u(C5173c c5173c) {
        Object objPrevious;
        C1630i c1630i = this.f19750c;
        ListIterator<E> listIterator = c1630i.listIterator(c1630i.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC5158A) objPrevious).m23912g());
        AbstractC5158A abstractC5158A = (AbstractC5158A) objPrevious;
        if (this.f19751d != null) {
            m23931r();
        }
        this.f19751d = abstractC5158A;
        if (abstractC5158A != null) {
            abstractC5158A.m23911f(c5173c);
        }
    }

    /* JADX INFO: renamed from: w */
    private final void m23934w(boolean z7) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f19753f;
        OnBackInvokedCallback onBackInvokedCallback = this.f19752e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z7 && !this.f19754g) {
            a.f19756a.m23944d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f19754g = true;
        } else {
            if (z7 || !this.f19754g) {
                return;
            }
            a.f19756a.m23945e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f19754g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final void m23935x() {
        boolean z7 = this.f19755h;
        C1630i c1630i = this.f19750c;
        boolean z8 = false;
        if (c1630i == null || !c1630i.isEmpty()) {
            Iterator<E> it = c1630i.iterator();
            while (it.hasNext()) {
                if (((AbstractC5158A) it.next()).m23912g()) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f19755h = z8;
        if (z8 != z7) {
            InterfaceC0904a interfaceC0904a = this.f19749b;
            if (interfaceC0904a != null) {
                interfaceC0904a.accept(Boolean.valueOf(z8));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                m23934w(z8);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m23936o(InterfaceC2657s owner, AbstractC5158A onBackPressedCallback) {
        AbstractC6118n.m27187e(owner, "owner");
        AbstractC6118n.m27187e(onBackPressedCallback, "onBackPressedCallback");
        AbstractC2650l abstractC2650lMo419P = owner.mo419P();
        if (abstractC2650lMo419P.mo12626b() == AbstractC2650l.b.DESTROYED) {
            return;
        }
        onBackPressedCallback.m23907a(new c(this, abstractC2650lMo419P, onBackPressedCallback));
        m23935x();
        onBackPressedCallback.m23916k(new e(this));
    }

    /* JADX INFO: renamed from: p */
    public final void m23937p(AbstractC5158A onBackPressedCallback) {
        AbstractC6118n.m27187e(onBackPressedCallback, "onBackPressedCallback");
        m23938q(onBackPressedCallback);
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC5174d m23938q(AbstractC5158A onBackPressedCallback) {
        AbstractC6118n.m27187e(onBackPressedCallback, "onBackPressedCallback");
        this.f19750c.add(onBackPressedCallback);
        d dVar = new d(this, onBackPressedCallback);
        onBackPressedCallback.m23907a(dVar);
        m23935x();
        onBackPressedCallback.m23916k(new f(this));
        return dVar;
    }

    /* JADX INFO: renamed from: s */
    public final void m23939s() {
        Object objPrevious;
        AbstractC5158A abstractC5158A = this.f19751d;
        if (abstractC5158A == null) {
            C1630i c1630i = this.f19750c;
            ListIterator<E> listIterator = c1630i.listIterator(c1630i.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((AbstractC5158A) objPrevious).m23912g());
            abstractC5158A = (AbstractC5158A) objPrevious;
        }
        this.f19751d = null;
        if (abstractC5158A != null) {
            abstractC5158A.mo363d();
            return;
        }
        Runnable runnable = this.f19748a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m23940v(OnBackInvokedDispatcher invoker) {
        AbstractC6118n.m27187e(invoker, "invoker");
        this.f19753f = invoker;
        m23934w(this.f19755h);
    }

    public C5165H(Runnable runnable) {
        this(runnable, null);
    }
}

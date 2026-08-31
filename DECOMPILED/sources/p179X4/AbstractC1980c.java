package p179X4;

import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p063H5.AbstractC0543g;
import p063H5.C0530Z;
import p063H5.C0532a0;
import p063H5.C0554l0;
import p186Y4.AbstractC2032B;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p186Y4.C2037e;
import p186Y4.C2046n;

/* JADX INFO: renamed from: X4.c */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1980c {

    /* JADX INFO: renamed from: n */
    private static final long f6556n;

    /* JADX INFO: renamed from: o */
    private static final long f6557o;

    /* JADX INFO: renamed from: p */
    private static final long f6558p;

    /* JADX INFO: renamed from: q */
    private static final long f6559q;

    /* JADX INFO: renamed from: r */
    private static final long f6560r;

    /* JADX INFO: renamed from: a */
    private C2037e.b f6561a;

    /* JADX INFO: renamed from: b */
    private C2037e.b f6562b;

    /* JADX INFO: renamed from: c */
    private final C1998u f6563c;

    /* JADX INFO: renamed from: d */
    private final C0532a0 f6564d;

    /* JADX INFO: renamed from: f */
    private final C2037e f6566f;

    /* JADX INFO: renamed from: g */
    private final C2037e.d f6567g;

    /* JADX INFO: renamed from: h */
    private final C2037e.d f6568h;

    /* JADX INFO: renamed from: k */
    private AbstractC0543g f6571k;

    /* JADX INFO: renamed from: l */
    final C2046n f6572l;

    /* JADX INFO: renamed from: m */
    final InterfaceC1970Q f6573m;

    /* JADX INFO: renamed from: i */
    private EnumC1969P f6569i = EnumC1969P.Initial;

    /* JADX INFO: renamed from: j */
    private long f6570j = 0;

    /* JADX INFO: renamed from: e */
    private final b f6565e = new b();

    /* JADX INFO: renamed from: X4.c$a */
    class a {

        /* JADX INFO: renamed from: a */
        private final long f6574a;

        a(long j7) {
            this.f6574a = j7;
        }

        /* JADX INFO: renamed from: a */
        void m8322a(Runnable runnable) {
            AbstractC1980c.this.f6566f.m8475n();
            if (AbstractC1980c.this.f6570j == this.f6574a) {
                runnable.run();
            } else {
                AbstractC2049q.m8502a(AbstractC1980c.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: X4.c$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1980c.this.m8316j();
        }
    }

    /* JADX INFO: renamed from: X4.c$c */
    class c implements InterfaceC1959F {

        /* JADX INFO: renamed from: a */
        private final a f6577a;

        /* JADX INFO: renamed from: b */
        private int f6578b = 0;

        c(a aVar) {
            this.f6577a = aVar;
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m8323e(c cVar, C0554l0 c0554l0) {
            cVar.getClass();
            if (c0554l0.m2460o()) {
                AbstractC2049q.m8502a(AbstractC1980c.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(AbstractC1980c.this)));
            } else {
                AbstractC2049q.m8505d(AbstractC1980c.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(AbstractC1980c.this)), c0554l0);
            }
            AbstractC1980c.this.m8319k(c0554l0);
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m8324f(c cVar, C0530Z c0530z) {
            cVar.getClass();
            if (AbstractC2049q.m8504c()) {
                HashMap map = new HashMap();
                for (String str : c0530z.m2285j()) {
                    if (C1992o.f6620d.contains(str.toLowerCase(Locale.ENGLISH))) {
                        map.put(str, (String) c0530z.m2283g(C0530Z.g.m2296e(str, C0530Z.f1980e)));
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                AbstractC2049q.m8502a(AbstractC1980c.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(AbstractC1980c.this)), map);
            }
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m8325g(c cVar, int i7, Object obj) {
            cVar.getClass();
            if (AbstractC2049q.m8504c()) {
                AbstractC2049q.m8502a(AbstractC1980c.this.getClass().getSimpleName(), "(%x) Stream received (%s): %s", Integer.valueOf(System.identityHashCode(AbstractC1980c.this)), Integer.valueOf(i7), obj);
            }
            if (i7 == 1) {
                AbstractC1980c.this.mo8292p(obj);
            } else {
                AbstractC1980c.this.mo8293q(obj);
            }
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m8326h(c cVar) {
            AbstractC2049q.m8502a(AbstractC1980c.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(AbstractC1980c.this)));
            AbstractC1980c.this.m8317r();
        }

        @Override // p179X4.InterfaceC1959F
        /* JADX INFO: renamed from: a */
        public void mo8099a() {
            this.f6577a.m8322a(new Runnable() { // from class: X4.d
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1980c.c.m8326h(this.f6580a);
                }
            });
        }

        @Override // p179X4.InterfaceC1959F
        /* JADX INFO: renamed from: b */
        public void mo8100b(final C0554l0 c0554l0) {
            this.f6577a.m8322a(new Runnable() { // from class: X4.g
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1980c.c.m8323e(this.f6586a, c0554l0);
                }
            });
        }

        @Override // p179X4.InterfaceC1959F
        /* JADX INFO: renamed from: c */
        public void mo8101c(final C0530Z c0530z) {
            this.f6577a.m8322a(new Runnable() { // from class: X4.f
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1980c.c.m8324f(this.f6584a, c0530z);
                }
            });
        }

        @Override // p179X4.InterfaceC1959F
        /* JADX INFO: renamed from: d */
        public void mo8102d(final Object obj) {
            final int i7 = this.f6578b + 1;
            this.f6577a.m8322a(new Runnable() { // from class: X4.e
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1980c.c.m8325g(this.f6581a, i7, obj);
                }
            });
            this.f6578b = i7;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f6556n = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f6557o = timeUnit2.toMillis(1L);
        f6558p = timeUnit2.toMillis(1L);
        f6559q = timeUnit.toMillis(10L);
        f6560r = timeUnit.toMillis(10L);
    }

    AbstractC1980c(C1998u c1998u, C0532a0 c0532a0, C2037e c2037e, C2037e.d dVar, C2037e.d dVar2, C2037e.d dVar3, InterfaceC1970Q interfaceC1970Q) {
        this.f6563c = c1998u;
        this.f6564d = c0532a0;
        this.f6566f = c2037e;
        this.f6567g = dVar2;
        this.f6568h = dVar3;
        this.f6573m = interfaceC1970Q;
        this.f6572l = new C2046n(c2037e, dVar, f6556n, 1.5d, f6557o);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8307a(AbstractC1980c abstractC1980c) {
        EnumC1969P enumC1969P = abstractC1980c.f6569i;
        AbstractC2034b.m8460d(enumC1969P == EnumC1969P.Backoff, "State should still be backoff but was %s", enumC1969P);
        abstractC1980c.f6569i = EnumC1969P.Initial;
        abstractC1980c.mo8294t();
        AbstractC2034b.m8460d(abstractC1980c.mo8291n(), "Stream should have started", new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8308b(AbstractC1980c abstractC1980c) {
        if (abstractC1980c.mo8290m()) {
            abstractC1980c.f6569i = EnumC1969P.Healthy;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m8313g() {
        C2037e.b bVar = this.f6561a;
        if (bVar != null) {
            bVar.m8481c();
            this.f6561a = null;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m8314h() {
        C2037e.b bVar = this.f6562b;
        if (bVar != null) {
            bVar.m8481c();
            this.f6562b = null;
        }
    }

    /* JADX INFO: renamed from: i */
    private void m8315i(EnumC1969P enumC1969P, C0554l0 c0554l0) {
        AbstractC2034b.m8460d(mo8291n(), "Only started streams should be closed.", new Object[0]);
        EnumC1969P enumC1969P2 = EnumC1969P.Error;
        AbstractC2034b.m8460d(enumC1969P == enumC1969P2 || c0554l0.m2460o(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f6566f.m8475n();
        if (C1992o.m8347c(c0554l0)) {
            AbstractC2032B.m8449n(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", c0554l0.m2457l()));
        }
        m8314h();
        m8313g();
        this.f6572l.m8498c();
        this.f6570j++;
        C0554l0.b bVarM2458m = c0554l0.m2458m();
        if (bVarM2458m == C0554l0.b.OK) {
            this.f6572l.m8499e();
        } else if (bVarM2458m == C0554l0.b.RESOURCE_EXHAUSTED) {
            AbstractC2049q.m8502a(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.f6572l.m8500f();
        } else if (bVarM2458m == C0554l0.b.UNAUTHENTICATED && this.f6569i != EnumC1969P.Healthy) {
            this.f6563c.m8362d();
        } else if (bVarM2458m == C0554l0.b.UNAVAILABLE && ((c0554l0.m2457l() instanceof UnknownHostException) || (c0554l0.m2457l() instanceof ConnectException))) {
            this.f6572l.m8501g(f6560r);
        }
        if (enumC1969P != enumC1969P2) {
            AbstractC2049q.m8502a(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            mo8303v();
        }
        if (this.f6571k != null) {
            if (c0554l0.m2460o()) {
                AbstractC2049q.m8502a(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                try {
                    this.f6571k.mo2119b();
                } catch (IllegalStateException e7) {
                    AbstractC2049q.m8502a(getClass().getSimpleName(), "(%x) Closing stream client-side result in exception: [%s]", Integer.valueOf(System.identityHashCode(this)), e7);
                }
            }
            this.f6571k = null;
        }
        this.f6569i = enumC1969P;
        this.f6573m.mo8219b(c0554l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m8316j() {
        if (mo8290m()) {
            m8315i(EnumC1969P.Initial, C0554l0.f2098e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m8317r() {
        this.f6569i = EnumC1969P.Open;
        this.f6573m.mo8218a();
        if (this.f6561a == null) {
            this.f6561a = this.f6566f.m8470h(this.f6568h, f6559q, new Runnable() { // from class: X4.b
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1980c.m8308b(this.f6555a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    private void m8318s() {
        AbstractC2034b.m8460d(this.f6569i == EnumC1969P.Error, "Should only perform backoff in an error state", new Object[0]);
        this.f6569i = EnumC1969P.Backoff;
        this.f6572l.m8497b(new Runnable() { // from class: X4.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1980c.m8307a(this.f6554a);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    void m8319k(C0554l0 c0554l0) {
        AbstractC2034b.m8460d(mo8291n(), "Can't handle server close on non-started stream!", new Object[0]);
        m8315i(EnumC1969P.Error, c0554l0);
    }

    /* JADX INFO: renamed from: l */
    public void mo8289l() {
        AbstractC2034b.m8460d(!mo8291n(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f6566f.m8475n();
        this.f6569i = EnumC1969P.Initial;
        this.f6572l.m8499e();
    }

    /* JADX INFO: renamed from: m */
    public boolean mo8290m() {
        this.f6566f.m8475n();
        EnumC1969P enumC1969P = this.f6569i;
        return enumC1969P == EnumC1969P.Open || enumC1969P == EnumC1969P.Healthy;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo8291n() {
        this.f6566f.m8475n();
        EnumC1969P enumC1969P = this.f6569i;
        return enumC1969P == EnumC1969P.Starting || enumC1969P == EnumC1969P.Backoff || mo8290m();
    }

    /* JADX INFO: renamed from: o */
    void m8320o() {
        if (mo8290m() && this.f6562b == null) {
            this.f6562b = this.f6566f.m8470h(this.f6567g, f6558p, this.f6565e);
        }
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo8292p(Object obj);

    /* JADX INFO: renamed from: q */
    public abstract void mo8293q(Object obj);

    /* JADX INFO: renamed from: t */
    public void mo8294t() {
        this.f6566f.m8475n();
        AbstractC2034b.m8460d(this.f6571k == null, "Last call still set", new Object[0]);
        AbstractC2034b.m8460d(this.f6562b == null, "Idle timer still set", new Object[0]);
        EnumC1969P enumC1969P = this.f6569i;
        if (enumC1969P == EnumC1969P.Error) {
            m8318s();
            return;
        }
        AbstractC2034b.m8460d(enumC1969P == EnumC1969P.Initial, "Already started", new Object[0]);
        this.f6571k = this.f6563c.m8363f(this.f6564d, new c(new a(this.f6570j)));
        this.f6569i = EnumC1969P.Starting;
    }

    /* JADX INFO: renamed from: u */
    public void mo8295u() {
        if (mo8291n()) {
            m8315i(EnumC1969P.Initial, C0554l0.f2098e);
        }
    }

    /* JADX INFO: renamed from: v */
    protected void mo8303v() {
    }

    /* JADX INFO: renamed from: w */
    protected void m8321w(Object obj) {
        this.f6566f.m8475n();
        AbstractC2049q.m8502a(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), obj);
        m8314h();
        this.f6571k.mo2121d(obj);
    }
}

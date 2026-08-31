package io.grpc.internal;

import androidx.appcompat.app.AbstractC2263x;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p063H5.AbstractC0506A;
import p063H5.AbstractC0512G;
import p063H5.AbstractC0523S;
import p063H5.AbstractC0526V;
import p063H5.AbstractC0536c0;
import p063H5.AbstractC0537d;
import p063H5.AbstractC0538d0;
import p063H5.AbstractC0541f;
import p063H5.AbstractC0543g;
import p063H5.AbstractC0549j;
import p063H5.AbstractC0551k;
import p063H5.C0510E;
import p063H5.C0511F;
import p063H5.C0516K;
import p063H5.C0530Z;
import p063H5.C0531a;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.C0540e0;
import p063H5.C0554l0;
import p063H5.C0559o;
import p063H5.C0563q;
import p063H5.C0565r;
import p063H5.C0568t;
import p063H5.C0570v;
import p063H5.C0572x;
import p063H5.EnumC0561p;
import p063H5.ExecutorC0562p0;
import p063H5.InterfaceC0515J;
import p063H5.InterfaceC0546h0;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;
import p122P3.C1212p;
import p122P3.InterfaceC1214r;

/* JADX INFO: renamed from: io.grpc.internal.h0 */
/* JADX INFO: loaded from: classes.dex */
final class C5785h0 extends AbstractC0526V implements InterfaceC0515J {

    /* JADX INFO: renamed from: m0 */
    static final Logger f22488m0 = Logger.getLogger(C5785h0.class.getName());

    /* JADX INFO: renamed from: n0 */
    static final Pattern f22489n0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* JADX INFO: renamed from: o0 */
    static final C0554l0 f22490o0;

    /* JADX INFO: renamed from: p0 */
    static final C0554l0 f22491p0;

    /* JADX INFO: renamed from: q0 */
    static final C0554l0 f22492q0;

    /* JADX INFO: renamed from: r0 */
    private static final C5791k0 f22493r0;

    /* JADX INFO: renamed from: s0 */
    private static final AbstractC0512G f22494s0;

    /* JADX INFO: renamed from: t0 */
    private static final AbstractC0543g f22495t0;

    /* JADX INFO: renamed from: A */
    private final List f22496A;

    /* JADX INFO: renamed from: B */
    private final String f22497B;

    /* JADX INFO: renamed from: C */
    private AbstractC0536c0 f22498C;

    /* JADX INFO: renamed from: D */
    private boolean f22499D;

    /* JADX INFO: renamed from: E */
    private s f22500E;

    /* JADX INFO: renamed from: F */
    private volatile AbstractC0523S.j f22501F;

    /* JADX INFO: renamed from: G */
    private boolean f22502G;

    /* JADX INFO: renamed from: H */
    private final Set f22503H;

    /* JADX INFO: renamed from: I */
    private Collection f22504I;

    /* JADX INFO: renamed from: J */
    private final Object f22505J;

    /* JADX INFO: renamed from: K */
    private final Set f22506K;

    /* JADX INFO: renamed from: L */
    private final C5724B f22507L;

    /* JADX INFO: renamed from: M */
    private final y f22508M;

    /* JADX INFO: renamed from: N */
    private final AtomicBoolean f22509N;

    /* JADX INFO: renamed from: O */
    private boolean f22510O;

    /* JADX INFO: renamed from: P */
    private boolean f22511P;

    /* JADX INFO: renamed from: Q */
    private volatile boolean f22512Q;

    /* JADX INFO: renamed from: R */
    private final CountDownLatch f22513R;

    /* JADX INFO: renamed from: S */
    private final C5796n.b f22514S;

    /* JADX INFO: renamed from: T */
    private final C5796n f22515T;

    /* JADX INFO: renamed from: U */
    private final C5800p f22516U;

    /* JADX INFO: renamed from: V */
    private final AbstractC0541f f22517V;

    /* JADX INFO: renamed from: W */
    private final C0510E f22518W;

    /* JADX INFO: renamed from: X */
    private final u f22519X;

    /* JADX INFO: renamed from: Y */
    private v f22520Y;

    /* JADX INFO: renamed from: Z */
    private C5791k0 f22521Z;

    /* JADX INFO: renamed from: a */
    private final C0516K f22522a;

    /* JADX INFO: renamed from: a0 */
    private final C5791k0 f22523a0;

    /* JADX INFO: renamed from: b */
    private final String f22524b;

    /* JADX INFO: renamed from: b0 */
    private boolean f22525b0;

    /* JADX INFO: renamed from: c */
    private final String f22526c;

    /* JADX INFO: renamed from: c0 */
    private final boolean f22527c0;

    /* JADX INFO: renamed from: d */
    private final C0540e0 f22528d;

    /* JADX INFO: renamed from: d0 */
    private final AbstractC5727C0.t f22529d0;

    /* JADX INFO: renamed from: e */
    private final AbstractC0536c0.a f22530e;

    /* JADX INFO: renamed from: e0 */
    private final long f22531e0;

    /* JADX INFO: renamed from: f */
    private final C5786i f22532f;

    /* JADX INFO: renamed from: f0 */
    private final long f22533f0;

    /* JADX INFO: renamed from: g */
    private final InterfaceC5810u f22534g;

    /* JADX INFO: renamed from: g0 */
    private final boolean f22535g0;

    /* JADX INFO: renamed from: h */
    private final InterfaceC5810u f22536h;

    /* JADX INFO: renamed from: h0 */
    private final C0568t.c f22537h0;

    /* JADX INFO: renamed from: i */
    private final InterfaceC5810u f22538i;

    /* JADX INFO: renamed from: i0 */
    private final InterfaceC5793l0.a f22539i0;

    /* JADX INFO: renamed from: j */
    private final w f22540j;

    /* JADX INFO: renamed from: j0 */
    final AbstractC5767X f22541j0;

    /* JADX INFO: renamed from: k */
    private final Executor f22542k;

    /* JADX INFO: renamed from: k0 */
    private final m f22543k0;

    /* JADX INFO: renamed from: l */
    private final InterfaceC5803q0 f22544l;

    /* JADX INFO: renamed from: l0 */
    private final C5725B0 f22545l0;

    /* JADX INFO: renamed from: m */
    private final InterfaceC5803q0 f22546m;

    /* JADX INFO: renamed from: n */
    private final p f22547n;

    /* JADX INFO: renamed from: o */
    private final p f22548o;

    /* JADX INFO: renamed from: p */
    private final InterfaceC5756R0 f22549p;

    /* JADX INFO: renamed from: q */
    private final int f22550q;

    /* JADX INFO: renamed from: r */
    final ExecutorC0562p0 f22551r;

    /* JADX INFO: renamed from: s */
    private boolean f22552s;

    /* JADX INFO: renamed from: t */
    private final C0570v f22553t;

    /* JADX INFO: renamed from: u */
    private final C0559o f22554u;

    /* JADX INFO: renamed from: v */
    private final InterfaceC1214r f22555v;

    /* JADX INFO: renamed from: w */
    private final long f22556w;

    /* JADX INFO: renamed from: x */
    private final C5816x f22557x;

    /* JADX INFO: renamed from: y */
    private final InterfaceC5788j.a f22558y;

    /* JADX INFO: renamed from: z */
    private final AbstractC0537d f22559z;

    /* JADX INFO: renamed from: io.grpc.internal.h0$a */
    class a extends AbstractC0512G {
        a() {
        }

        @Override // p063H5.AbstractC0512G
        /* JADX INFO: renamed from: a */
        public AbstractC0512G.b mo2151a(AbstractC0523S.g gVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$b */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5785h0.this.m25993w0(true);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$c */
    final class c implements C5796n.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5756R0 f22561a;

        c(InterfaceC5756R0 interfaceC5756R0) {
            this.f22561a = interfaceC5756R0;
        }

        @Override // io.grpc.internal.C5796n.b
        /* JADX INFO: renamed from: a */
        public C5796n mo26003a() {
            return new C5796n(this.f22561a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$d */
    final class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f22563a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ EnumC0561p f22564b;

        d(Runnable runnable, EnumC0561p enumC0561p) {
            this.f22563a = runnable;
            this.f22564b = enumC0561p;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5785h0.this.f22557x.m26209c(this.f22563a, C5785h0.this.f22542k, this.f22564b);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$e */
    final class e extends AbstractC0523S.j {

        /* JADX INFO: renamed from: a */
        private final AbstractC0523S.f f22566a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Throwable f22567b;

        e(Throwable th) {
            this.f22567b = th;
            this.f22566a = AbstractC0523S.f.m2200e(C0554l0.f2112s.m2462q("Panic! This is a bug!").m2461p(th));
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public AbstractC0523S.f mo2179a(AbstractC0523S.g gVar) {
            return this.f22566a;
        }

        public String toString() {
            return AbstractC1203g.m5266a(e.class).m5277d("panicPickResult", this.f22566a).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$f */
    final class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5785h0.this.f22509N.get() || C5785h0.this.f22500E == null) {
                return;
            }
            C5785h0.this.m25993w0(false);
            C5785h0.this.m25995x0();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$g */
    final class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5785h0.this.m26002y0();
            if (C5785h0.this.f22501F != null) {
                C5785h0.this.f22501F.m2230b();
            }
            if (C5785h0.this.f22500E != null) {
                C5785h0.this.f22500E.f22600a.m26036c();
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$h */
    final class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5785h0.this.f22517V.mo2419a(AbstractC0541f.a.INFO, "Entering SHUTDOWN state");
            C5785h0.this.f22557x.m26208b(EnumC0561p.SHUTDOWN);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$i */
    final class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5785h0.this.f22510O) {
                return;
            }
            C5785h0.this.f22510O = true;
            C5785h0.this.m25932C0();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$j */
    class j implements Thread.UncaughtExceptionHandler {
        j() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            C5785h0.f22488m0.log(Level.SEVERE, "[" + C5785h0.this.mo2172g() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            C5785h0.this.m25999E0(th);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$k */
    class k extends AbstractC5748N {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f22574b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(AbstractC0536c0 abstractC0536c0, String str) {
            super(abstractC0536c0);
            this.f22574b = str;
        }

        @Override // io.grpc.internal.AbstractC5748N, p063H5.AbstractC0536c0
        /* JADX INFO: renamed from: a */
        public String mo2366a() {
            return this.f22574b;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$l */
    class l extends AbstractC0543g {
        l() {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: a */
        public void mo2118a(String str, Throwable th) {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: b */
        public void mo2119b() {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: c */
        public void mo2120c(int i7) {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: d */
        public void mo2121d(Object obj) {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: e */
        public void mo2122e(AbstractC0543g.a aVar, C0530Z c0530z) {
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$m */
    private final class m implements C5802q.e {

        /* JADX INFO: renamed from: a */
        volatile AbstractC5727C0.D f22575a;

        /* JADX INFO: renamed from: io.grpc.internal.h0$m$a */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5785h0.this.m26002y0();
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$m$b */
        final class b extends AbstractC5727C0 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C0532a0 f22578E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ C0530Z f22579F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ C0535c f22580G;

            /* JADX INFO: renamed from: H */
            final /* synthetic */ C5729D0 f22581H;

            /* JADX INFO: renamed from: I */
            final /* synthetic */ C5761U f22582I;

            /* JADX INFO: renamed from: J */
            final /* synthetic */ C0565r f22583J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C0532a0 c0532a0, C0530Z c0530z, C0535c c0535c, C5729D0 c5729d0, C5761U c5761u, C0565r c0565r) {
                super(c0532a0, c0530z, C5785h0.this.f22529d0, C5785h0.this.f22531e0, C5785h0.this.f22533f0, C5785h0.this.m25998z0(c0535c), C5785h0.this.f22536h.mo3246z0(), c5729d0, c5761u, m.this.f22575a);
                this.f22578E = c0532a0;
                this.f22579F = c0530z;
                this.f22580G = c0535c;
                this.f22581H = c5729d0;
                this.f22582I = c5761u;
                this.f22583J = c0565r;
            }

            @Override // io.grpc.internal.AbstractC5727C0
            /* JADX INFO: renamed from: j0 */
            InterfaceC5804r mo25525j0(C0530Z c0530z, AbstractC0551k.a aVar, int i7, boolean z7) {
                C0535c c0535cM2359r = this.f22580G.m2359r(aVar);
                AbstractC0551k[] abstractC0551kArrM25668f = AbstractC5757S.m25668f(c0535cM2359r, c0530z, i7, z7);
                InterfaceC5808t interfaceC5808tM26005c = m.this.m26005c(new C5815w0(this.f22578E, c0530z, c0535cM2359r));
                C0565r c0565rM2507b = this.f22583J.m2507b();
                try {
                    return interfaceC5808tM26005c.mo3348c(this.f22578E, c0530z, c0535cM2359r, abstractC0551kArrM25668f);
                } finally {
                    this.f22583J.m2509f(c0565rM2507b);
                }
            }

            @Override // io.grpc.internal.AbstractC5727C0
            /* JADX INFO: renamed from: k0 */
            void mo25526k0() {
                C5785h0.this.f22508M.m26027d(this);
            }

            @Override // io.grpc.internal.AbstractC5727C0
            /* JADX INFO: renamed from: l0 */
            C0554l0 mo25527l0() {
                return C5785h0.this.f22508M.m26024a(this);
            }
        }

        private m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public InterfaceC5808t m26005c(AbstractC0523S.g gVar) {
            AbstractC0523S.j jVar = C5785h0.this.f22501F;
            if (C5785h0.this.f22509N.get()) {
                return C5785h0.this.f22507L;
            }
            if (jVar == null) {
                C5785h0.this.f22551r.execute(new a());
                return C5785h0.this.f22507L;
            }
            InterfaceC5808t interfaceC5808tM25673k = AbstractC5757S.m25673k(jVar.mo2179a(gVar), gVar.mo2209a().m2352j());
            return interfaceC5808tM25673k != null ? interfaceC5808tM25673k : C5785h0.this.f22507L;
        }

        @Override // io.grpc.internal.C5802q.e
        /* JADX INFO: renamed from: a */
        public InterfaceC5804r mo26006a(C0532a0 c0532a0, C0535c c0535c, C0530Z c0530z, C0565r c0565r) {
            if (C5785h0.this.f22535g0) {
                C5791k0.b bVar = (C5791k0.b) c0535c.m2350h(C5791k0.b.f22719g);
                return new b(c0532a0, c0530z, c0535c, bVar == null ? null : bVar.f22724e, bVar != null ? bVar.f22725f : null, c0565r);
            }
            InterfaceC5808t interfaceC5808tM26005c = m26005c(new C5815w0(c0532a0, c0530z, c0535c));
            C0565r c0565rM2507b = c0565r.m2507b();
            try {
                return interfaceC5808tM26005c.mo3348c(c0532a0, c0530z, c0535c, AbstractC5757S.m25668f(c0535c, c0530z, 0, false));
            } finally {
                c0565r.m2509f(c0565rM2507b);
            }
        }

        /* synthetic */ m(C5785h0 c5785h0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$n */
    static final class n extends AbstractC0506A {

        /* JADX INFO: renamed from: a */
        private final AbstractC0512G f22585a;

        /* JADX INFO: renamed from: b */
        private final AbstractC0537d f22586b;

        /* JADX INFO: renamed from: c */
        private final Executor f22587c;

        /* JADX INFO: renamed from: d */
        private final C0532a0 f22588d;

        /* JADX INFO: renamed from: e */
        private final C0565r f22589e;

        /* JADX INFO: renamed from: f */
        private C0535c f22590f;

        /* JADX INFO: renamed from: g */
        private AbstractC0543g f22591g;

        /* JADX INFO: renamed from: io.grpc.internal.h0$n$a */
        class a extends AbstractRunnableC5818y {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AbstractC0543g.a f22592b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C0554l0 f22593c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC0543g.a aVar, C0554l0 c0554l0) {
                super(n.this.f22589e);
                this.f22592b = aVar;
                this.f22593c = c0554l0;
            }

            @Override // io.grpc.internal.AbstractRunnableC5818y
            /* JADX INFO: renamed from: a */
            public void mo25416a() {
                this.f22592b.mo2421a(this.f22593c, new C0530Z());
            }
        }

        n(AbstractC0512G abstractC0512G, AbstractC0537d abstractC0537d, Executor executor, C0532a0 c0532a0, C0535c c0535c) {
            this.f22585a = abstractC0512G;
            this.f22586b = abstractC0537d;
            this.f22588d = c0532a0;
            executor = c0535c.m2347e() != null ? c0535c.m2347e() : executor;
            this.f22587c = executor;
            this.f22590f = c0535c.m2355n(executor);
            this.f22589e = C0565r.m2503e();
        }

        /* JADX INFO: renamed from: h */
        private void m26008h(AbstractC0543g.a aVar, C0554l0 c0554l0) {
            this.f22587c.execute(new a(aVar, c0554l0));
        }

        @Override // p063H5.AbstractC0506A, p063H5.AbstractC0542f0, p063H5.AbstractC0543g
        /* JADX INFO: renamed from: a */
        public void mo2118a(String str, Throwable th) {
            AbstractC0543g abstractC0543g = this.f22591g;
            if (abstractC0543g != null) {
                abstractC0543g.mo2118a(str, th);
            }
        }

        @Override // p063H5.AbstractC0506A, p063H5.AbstractC0543g
        /* JADX INFO: renamed from: e */
        public void mo2122e(AbstractC0543g.a aVar, C0530Z c0530z) {
            AbstractC0512G.b bVarMo2151a = this.f22585a.mo2151a(new C5815w0(this.f22588d, c0530z, this.f22590f));
            C0554l0 c0554l0M2155c = bVarMo2151a.m2155c();
            if (!c0554l0M2155c.m2460o()) {
                m26008h(aVar, AbstractC5757S.m25677o(c0554l0M2155c));
                this.f22591g = C5785h0.f22495t0;
                return;
            }
            bVarMo2151a.m2154b();
            C5791k0.b bVarM26052f = ((C5791k0) bVarMo2151a.m2153a()).m26052f(this.f22588d);
            if (bVarM26052f != null) {
                this.f22590f = this.f22590f.m2358q(C5791k0.b.f22719g, bVarM26052f);
            }
            AbstractC0543g abstractC0543gMo2405f = this.f22586b.mo2405f(this.f22588d, this.f22590f);
            this.f22591g = abstractC0543gMo2405f;
            abstractC0543gMo2405f.mo2122e(aVar, c0530z);
        }

        @Override // p063H5.AbstractC0506A, p063H5.AbstractC0542f0
        /* JADX INFO: renamed from: f */
        protected AbstractC0543g mo2123f() {
            return this.f22591g;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$o */
    private final class o implements InterfaceC5793l0.a {
        private o() {
        }

        @Override // io.grpc.internal.InterfaceC5793l0.a
        /* JADX INFO: renamed from: a */
        public C0531a mo25819a(C0531a c0531a) {
            return c0531a;
        }

        @Override // io.grpc.internal.InterfaceC5793l0.a
        /* JADX INFO: renamed from: b */
        public void mo25820b() {
        }

        @Override // io.grpc.internal.InterfaceC5793l0.a
        /* JADX INFO: renamed from: c */
        public void mo25821c() {
            AbstractC1209m.m5309u(C5785h0.this.f22509N.get(), "Channel must have been shut down");
            C5785h0.this.f22511P = true;
            C5785h0.this.m25942I0(false);
            C5785h0.this.m25932C0();
            C5785h0.this.m25934D0();
        }

        @Override // io.grpc.internal.InterfaceC5793l0.a
        /* JADX INFO: renamed from: d */
        public void mo25822d(boolean z7) {
            C5785h0 c5785h0 = C5785h0.this;
            c5785h0.f22541j0.m25761e(c5785h0.f22507L, z7);
        }

        @Override // io.grpc.internal.InterfaceC5793l0.a
        /* JADX INFO: renamed from: e */
        public void mo25823e(C0554l0 c0554l0) {
            AbstractC1209m.m5309u(C5785h0.this.f22509N.get(), "Channel must have been shut down");
        }

        /* synthetic */ o(C5785h0 c5785h0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$p */
    static final class p implements Executor {

        /* JADX INFO: renamed from: a */
        private final InterfaceC5803q0 f22596a;

        /* JADX INFO: renamed from: b */
        private Executor f22597b;

        p(InterfaceC5803q0 interfaceC5803q0) {
            this.f22596a = (InterfaceC5803q0) AbstractC1209m.m5303o(interfaceC5803q0, "executorPool");
        }

        /* JADX INFO: renamed from: a */
        synchronized Executor m26009a() {
            try {
                if (this.f22597b == null) {
                    this.f22597b = (Executor) AbstractC1209m.m5304p((Executor) this.f22596a.mo25643a(), "%s.getObject()", this.f22597b);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f22597b;
        }

        /* JADX INFO: renamed from: b */
        synchronized void m26010b() {
            Executor executor = this.f22597b;
            if (executor != null) {
                this.f22597b = (Executor) this.f22596a.mo25644b(executor);
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            m26009a().execute(runnable);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$q */
    private final class q extends AbstractC5767X {
        private q() {
        }

        @Override // io.grpc.internal.AbstractC5767X
        /* JADX INFO: renamed from: b */
        protected void mo3357b() {
            C5785h0.this.m26002y0();
        }

        @Override // io.grpc.internal.AbstractC5767X
        /* JADX INFO: renamed from: c */
        protected void mo3358c() {
            if (C5785h0.this.f22509N.get()) {
                return;
            }
            C5785h0.this.m25939G0();
        }

        /* synthetic */ q(C5785h0 c5785h0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$r */
    private class r implements Runnable {
        private r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5785h0.this.f22500E == null) {
                return;
            }
            C5785h0.this.m25995x0();
        }

        /* synthetic */ r(C5785h0 c5785h0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$s */
    private final class s extends AbstractC0523S.e {

        /* JADX INFO: renamed from: a */
        C5786i.b f22600a;

        /* JADX INFO: renamed from: io.grpc.internal.h0$s$a */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5785h0.this.m25937F0();
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$s$b */
        final class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AbstractC0523S.j f22603a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ EnumC0561p f22604b;

            b(AbstractC0523S.j jVar, EnumC0561p enumC0561p) {
                this.f22603a = jVar;
                this.f22604b = enumC0561p;
            }

            @Override // java.lang.Runnable
            public void run() {
                s sVar = s.this;
                if (sVar != C5785h0.this.f22500E) {
                    return;
                }
                C5785h0.this.m25945K0(this.f22603a);
                if (this.f22604b != EnumC0561p.SHUTDOWN) {
                    C5785h0.this.f22517V.mo2420b(AbstractC0541f.a.INFO, "Entering {0} state with picker: {1}", this.f22604b, this.f22603a);
                    C5785h0.this.f22557x.m26208b(this.f22604b);
                }
            }
        }

        private s() {
        }

        @Override // p063H5.AbstractC0523S.e
        /* JADX INFO: renamed from: b */
        public AbstractC0541f mo2195b() {
            return C5785h0.this.f22517V;
        }

        @Override // p063H5.AbstractC0523S.e
        /* JADX INFO: renamed from: c */
        public ScheduledExecutorService mo2196c() {
            return C5785h0.this.f22540j;
        }

        @Override // p063H5.AbstractC0523S.e
        /* JADX INFO: renamed from: d */
        public ExecutorC0562p0 mo2197d() {
            return C5785h0.this.f22551r;
        }

        @Override // p063H5.AbstractC0523S.e
        /* JADX INFO: renamed from: e */
        public void mo2198e() {
            C5785h0.this.f22551r.m2492f();
            C5785h0.this.f22551r.execute(new a());
        }

        @Override // p063H5.AbstractC0523S.e
        /* JADX INFO: renamed from: f */
        public void mo2199f(EnumC0561p enumC0561p, AbstractC0523S.j jVar) {
            C5785h0.this.f22551r.m2492f();
            AbstractC1209m.m5303o(enumC0561p, "newState");
            AbstractC1209m.m5303o(jVar, "newPicker");
            C5785h0.this.f22551r.execute(new b(jVar, enumC0561p));
        }

        @Override // p063H5.AbstractC0523S.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC5776d mo2194a(AbstractC0523S.b bVar) {
            C5785h0.this.f22551r.m2492f();
            AbstractC1209m.m5309u(!C5785h0.this.f22511P, "Channel is being terminated");
            return C5785h0.this.new x(bVar);
        }

        /* synthetic */ s(C5785h0 c5785h0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$t */
    final class t extends AbstractC0536c0.d {

        /* JADX INFO: renamed from: a */
        final s f22606a;

        /* JADX INFO: renamed from: b */
        final AbstractC0536c0 f22607b;

        /* JADX INFO: renamed from: io.grpc.internal.h0$t$a */
        final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0554l0 f22609a;

            a(C0554l0 c0554l0) {
                this.f22609a = c0554l0;
            }

            @Override // java.lang.Runnable
            public void run() {
                t.this.m26013d(this.f22609a);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$t$b */
        final class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AbstractC0536c0.e f22611a;

            b(AbstractC0536c0.e eVar) {
                this.f22611a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5791k0 c5791k0;
                if (C5785h0.this.f22498C != t.this.f22607b) {
                    return;
                }
                List listM2395a = this.f22611a.m2395a();
                AbstractC0541f abstractC0541f = C5785h0.this.f22517V;
                AbstractC0541f.a aVar = AbstractC0541f.a.DEBUG;
                abstractC0541f.mo2420b(aVar, "Resolved address: {0}, config={1}", listM2395a, this.f22611a.m2396b());
                v vVar = C5785h0.this.f22520Y;
                v vVar2 = v.SUCCESS;
                if (vVar != vVar2) {
                    C5785h0.this.f22517V.mo2420b(AbstractC0541f.a.INFO, "Address resolved: {0}", listM2395a);
                    C5785h0.this.f22520Y = vVar2;
                }
                AbstractC0536c0.b bVarM2397c = this.f22611a.m2397c();
                C5733F0.b bVar = (C5733F0.b) this.f22611a.m2396b().m2313b(C5733F0.f22170e);
                AbstractC0512G abstractC0512G = (AbstractC0512G) this.f22611a.m2396b().m2313b(AbstractC0512G.f1929a);
                C5791k0 c5791k1 = (bVarM2397c == null || bVarM2397c.m2388c() == null) ? null : (C5791k0) bVarM2397c.m2388c();
                C0554l0 c0554l0M2389d = bVarM2397c != null ? bVarM2397c.m2389d() : null;
                if (C5785h0.this.f22527c0) {
                    if (c5791k1 != null) {
                        if (abstractC0512G != null) {
                            C5785h0.this.f22519X.m26021q(abstractC0512G);
                            if (c5791k1.m26049c() != null) {
                                C5785h0.this.f22517V.mo2419a(aVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            C5785h0.this.f22519X.m26021q(c5791k1.m26049c());
                        }
                    } else if (C5785h0.this.f22523a0 != null) {
                        c5791k1 = C5785h0.this.f22523a0;
                        C5785h0.this.f22519X.m26021q(c5791k1.m26049c());
                        C5785h0.this.f22517V.mo2419a(AbstractC0541f.a.INFO, "Received no service config, using default service config");
                    } else if (c0554l0M2389d == null) {
                        c5791k1 = C5785h0.f22493r0;
                        C5785h0.this.f22519X.m26021q(null);
                    } else {
                        if (!C5785h0.this.f22525b0) {
                            C5785h0.this.f22517V.mo2419a(AbstractC0541f.a.INFO, "Fallback to error due to invalid first service config without default config");
                            t.this.mo2392a(bVarM2397c.m2389d());
                            if (bVar != null) {
                                bVar.m25588a(bVarM2397c.m2389d());
                                return;
                            }
                            return;
                        }
                        c5791k1 = C5785h0.this.f22521Z;
                    }
                    if (!c5791k1.equals(C5785h0.this.f22521Z)) {
                        C5785h0.this.f22517V.mo2420b(AbstractC0541f.a.INFO, "Service config changed{0}", c5791k1 == C5785h0.f22493r0 ? " to empty" : "");
                        C5785h0.this.f22521Z = c5791k1;
                        C5785h0.this.f22543k0.f22575a = c5791k1.m26053g();
                    }
                    try {
                        C5785h0.this.f22525b0 = true;
                    } catch (RuntimeException e7) {
                        C5785h0.f22488m0.log(Level.WARNING, "[" + C5785h0.this.mo2172g() + "] Unexpected exception from parsing service config", (Throwable) e7);
                    }
                    c5791k0 = c5791k1;
                } else {
                    if (c5791k1 != null) {
                        C5785h0.this.f22517V.mo2419a(AbstractC0541f.a.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    c5791k0 = C5785h0.this.f22523a0 == null ? C5785h0.f22493r0 : C5785h0.this.f22523a0;
                    if (abstractC0512G != null) {
                        C5785h0.this.f22517V.mo2419a(AbstractC0541f.a.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    C5785h0.this.f22519X.m26021q(c5791k0.m26049c());
                }
                C0531a c0531aM2396b = this.f22611a.m2396b();
                t tVar = t.this;
                if (tVar.f22606a == C5785h0.this.f22500E) {
                    C0531a.b bVarM2317c = c0531aM2396b.m2314d().m2317c(AbstractC0512G.f1929a);
                    Map mapM26050d = c5791k0.m26050d();
                    if (mapM26050d != null) {
                        bVarM2317c.m2318d(AbstractC0523S.f1941b, mapM26050d).m2316a();
                    }
                    C0554l0 c0554l0M26038e = t.this.f22606a.f22600a.m26038e(AbstractC0523S.h.m2212d().m2218b(listM2395a).m2219c(bVarM2317c.m2316a()).m2220d(c5791k0.m26051e()).m2217a());
                    if (bVar != null) {
                        bVar.m25588a(c0554l0M26038e);
                    }
                }
            }
        }

        t(s sVar, AbstractC0536c0 abstractC0536c0) {
            this.f22606a = (s) AbstractC1209m.m5303o(sVar, "helperImpl");
            this.f22607b = (AbstractC0536c0) AbstractC1209m.m5303o(abstractC0536c0, "resolver");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public void m26013d(C0554l0 c0554l0) {
            C5785h0.f22488m0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{C5785h0.this.mo2172g(), c0554l0});
            C5785h0.this.f22519X.m26018n();
            v vVar = C5785h0.this.f22520Y;
            v vVar2 = v.ERROR;
            if (vVar != vVar2) {
                C5785h0.this.f22517V.mo2420b(AbstractC0541f.a.WARNING, "Failed to resolve name: {0}", c0554l0);
                C5785h0.this.f22520Y = vVar2;
            }
            if (this.f22606a != C5785h0.this.f22500E) {
                return;
            }
            this.f22606a.f22600a.m26035b(c0554l0);
        }

        @Override // p063H5.AbstractC0536c0.d
        /* JADX INFO: renamed from: a */
        public void mo2392a(C0554l0 c0554l0) {
            AbstractC1209m.m5293e(!c0554l0.m2460o(), "the error status must not be OK");
            C5785h0.this.f22551r.execute(new a(c0554l0));
        }

        @Override // p063H5.AbstractC0536c0.d
        /* JADX INFO: renamed from: b */
        public void mo2393b(AbstractC0536c0.e eVar) {
            C5785h0.this.f22551r.execute(new b(eVar));
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$u */
    private class u extends AbstractC0537d {

        /* JADX INFO: renamed from: a */
        private final AtomicReference f22613a;

        /* JADX INFO: renamed from: b */
        private final String f22614b;

        /* JADX INFO: renamed from: c */
        private final AbstractC0537d f22615c;

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$a */
        class a extends AbstractC0537d {
            a() {
            }

            @Override // p063H5.AbstractC0537d
            /* JADX INFO: renamed from: a */
            public String mo2404a() {
                return u.this.f22614b;
            }

            @Override // p063H5.AbstractC0537d
            /* JADX INFO: renamed from: f */
            public AbstractC0543g mo2405f(C0532a0 c0532a0, C0535c c0535c) {
                return new C5802q(c0532a0, C5785h0.this.m25998z0(c0535c), c0535c, C5785h0.this.f22543k0, C5785h0.this.f22512Q ? null : C5785h0.this.f22536h.mo3246z0(), C5785h0.this.f22515T, null).m26136E(C5785h0.this.f22552s).m26135D(C5785h0.this.f22553t).m26134C(C5785h0.this.f22554u);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$b */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C5785h0.this.f22504I == null) {
                    if (u.this.f22613a.get() == C5785h0.f22494s0) {
                        u.this.f22613a.set(null);
                    }
                    C5785h0.this.f22508M.m26025b(C5785h0.f22491p0);
                }
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$c */
        final class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (u.this.f22613a.get() == C5785h0.f22494s0) {
                    u.this.f22613a.set(null);
                }
                if (C5785h0.this.f22504I != null) {
                    Iterator it = C5785h0.this.f22504I.iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).mo2118a("Channel is forcefully shutdown", null);
                    }
                }
                C5785h0.this.f22508M.m26026c(C5785h0.f22490o0);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$d */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5785h0.this.m26002y0();
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$e */
        class e extends AbstractC0543g {
            e() {
            }

            @Override // p063H5.AbstractC0543g
            /* JADX INFO: renamed from: a */
            public void mo2118a(String str, Throwable th) {
            }

            @Override // p063H5.AbstractC0543g
            /* JADX INFO: renamed from: b */
            public void mo2119b() {
            }

            @Override // p063H5.AbstractC0543g
            /* JADX INFO: renamed from: c */
            public void mo2120c(int i7) {
            }

            @Override // p063H5.AbstractC0543g
            /* JADX INFO: renamed from: d */
            public void mo2121d(Object obj) {
            }

            @Override // p063H5.AbstractC0543g
            /* JADX INFO: renamed from: e */
            public void mo2122e(AbstractC0543g.a aVar, C0530Z c0530z) {
                aVar.mo2421a(C5785h0.f22491p0, new C0530Z());
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$f */
        class f implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ g f22622a;

            f(g gVar) {
                this.f22622a = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (u.this.f22613a.get() != C5785h0.f22494s0) {
                    this.f22622a.m26022r();
                    return;
                }
                if (C5785h0.this.f22504I == null) {
                    C5785h0.this.f22504I = new LinkedHashSet();
                    C5785h0 c5785h0 = C5785h0.this;
                    c5785h0.f22541j0.m25761e(c5785h0.f22505J, true);
                }
                C5785h0.this.f22504I.add(this.f22622a);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$u$g */
        private final class g extends AbstractC5722A {

            /* JADX INFO: renamed from: l */
            final C0565r f22624l;

            /* JADX INFO: renamed from: m */
            final C0532a0 f22625m;

            /* JADX INFO: renamed from: n */
            final C0535c f22626n;

            /* JADX INFO: renamed from: o */
            private final long f22627o;

            /* JADX INFO: renamed from: io.grpc.internal.h0$u$g$a */
            class a implements Runnable {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Runnable f22629a;

                a(Runnable runnable) {
                    this.f22629a = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f22629a.run();
                    g gVar = g.this;
                    C5785h0.this.f22551r.execute(gVar.new b());
                }
            }

            /* JADX INFO: renamed from: io.grpc.internal.h0$u$g$b */
            final class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C5785h0.this.f22504I != null) {
                        C5785h0.this.f22504I.remove(g.this);
                        if (C5785h0.this.f22504I.isEmpty()) {
                            C5785h0 c5785h0 = C5785h0.this;
                            c5785h0.f22541j0.m25761e(c5785h0.f22505J, false);
                            C5785h0.this.f22504I = null;
                            if (C5785h0.this.f22509N.get()) {
                                C5785h0.this.f22508M.m26025b(C5785h0.f22491p0);
                            }
                        }
                    }
                }
            }

            g(C0565r c0565r, C0532a0 c0532a0, C0535c c0535c) {
                super(C5785h0.this.m25998z0(c0535c), C5785h0.this.f22540j, c0535c.m2346d());
                this.f22624l = c0565r;
                this.f22625m = c0532a0;
                this.f22626n = c0535c;
                this.f22627o = C5785h0.this.f22537h0.mo2525a();
            }

            @Override // io.grpc.internal.AbstractC5722A
            /* JADX INFO: renamed from: j */
            protected void mo25414j() {
                super.mo25414j();
                C5785h0.this.f22551r.execute(new b());
            }

            /* JADX INFO: renamed from: r */
            void m26022r() {
                C0565r c0565rM2507b = this.f22624l.m2507b();
                try {
                    AbstractC0543g abstractC0543gM26017m = u.this.m26017m(this.f22625m, this.f22626n.m2358q(AbstractC0551k.f2088a, Long.valueOf(C5785h0.this.f22537h0.mo2525a() - this.f22627o)));
                    this.f22624l.m2509f(c0565rM2507b);
                    Runnable runnableM25415p = m25415p(abstractC0543gM26017m);
                    if (runnableM25415p == null) {
                        C5785h0.this.f22551r.execute(new b());
                    } else {
                        C5785h0.this.m25998z0(this.f22626n).execute(new a(runnableM25415p));
                    }
                } catch (Throwable th) {
                    this.f22624l.m2509f(c0565rM2507b);
                    throw th;
                }
            }
        }

        /* synthetic */ u(C5785h0 c5785h0, String str, a aVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m */
        public AbstractC0543g m26017m(C0532a0 c0532a0, C0535c c0535c) {
            AbstractC0512G abstractC0512G = (AbstractC0512G) this.f22613a.get();
            if (abstractC0512G == null) {
                return this.f22615c.mo2405f(c0532a0, c0535c);
            }
            if (!(abstractC0512G instanceof C5791k0.c)) {
                return new n(abstractC0512G, this.f22615c, C5785h0.this.f22542k, c0532a0, c0535c);
            }
            C5791k0.b bVarM26052f = ((C5791k0.c) abstractC0512G).f22726b.m26052f(c0532a0);
            if (bVarM26052f != null) {
                c0535c = c0535c.m2358q(C5791k0.b.f22719g, bVarM26052f);
            }
            return this.f22615c.mo2405f(c0532a0, c0535c);
        }

        @Override // p063H5.AbstractC0537d
        /* JADX INFO: renamed from: a */
        public String mo2404a() {
            return this.f22614b;
        }

        @Override // p063H5.AbstractC0537d
        /* JADX INFO: renamed from: f */
        public AbstractC0543g mo2405f(C0532a0 c0532a0, C0535c c0535c) {
            if (this.f22613a.get() != C5785h0.f22494s0) {
                return m26017m(c0532a0, c0535c);
            }
            C5785h0.this.f22551r.execute(new d());
            if (this.f22613a.get() != C5785h0.f22494s0) {
                return m26017m(c0532a0, c0535c);
            }
            if (C5785h0.this.f22509N.get()) {
                return new e();
            }
            g gVar = new g(C0565r.m2503e(), c0532a0, c0535c);
            C5785h0.this.f22551r.execute(new f(gVar));
            return gVar;
        }

        /* JADX INFO: renamed from: n */
        void m26018n() {
            if (this.f22613a.get() == C5785h0.f22494s0) {
                m26021q(null);
            }
        }

        /* JADX INFO: renamed from: o */
        void m26019o() {
            C5785h0.this.f22551r.execute(new b());
        }

        /* JADX INFO: renamed from: p */
        void m26020p() {
            C5785h0.this.f22551r.execute(new c());
        }

        /* JADX INFO: renamed from: q */
        void m26021q(AbstractC0512G abstractC0512G) {
            AbstractC0512G abstractC0512G2 = (AbstractC0512G) this.f22613a.get();
            this.f22613a.set(abstractC0512G);
            if (abstractC0512G2 != C5785h0.f22494s0 || C5785h0.this.f22504I == null) {
                return;
            }
            Iterator it = C5785h0.this.f22504I.iterator();
            while (it.hasNext()) {
                ((g) it.next()).m26022r();
            }
        }

        private u(String str) {
            this.f22613a = new AtomicReference(C5785h0.f22494s0);
            this.f22615c = new a();
            this.f22614b = (String) AbstractC1209m.m5303o(str, "authority");
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$v */
    enum v {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$w */
    private static final class w implements ScheduledExecutorService {

        /* JADX INFO: renamed from: a */
        final ScheduledExecutorService f22636a;

        /* synthetic */ w(ScheduledExecutorService scheduledExecutorService, a aVar) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j7, TimeUnit timeUnit) {
            return this.f22636a.awaitTermination(j7, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f22636a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection) {
            return this.f22636a.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection) {
            return this.f22636a.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f22636a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f22636a.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Callable callable, long j7, TimeUnit timeUnit) {
            return this.f22636a.schedule(callable, j7, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
            return this.f22636a.scheduleAtFixedRate(runnable, j7, j8, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
            return this.f22636a.scheduleWithFixedDelay(runnable, j7, j8, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Callable callable) {
            return this.f22636a.submit(callable);
        }

        private w(ScheduledExecutorService scheduledExecutorService) {
            this.f22636a = (ScheduledExecutorService) AbstractC1209m.m5303o(scheduledExecutorService, "delegate");
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection, long j7, TimeUnit timeUnit) {
            return this.f22636a.invokeAll(collection, j7, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection, long j7, TimeUnit timeUnit) {
            return this.f22636a.invokeAny(collection, j7, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
            return this.f22636a.schedule(runnable, j7, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable) {
            return this.f22636a.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable, Object obj) {
            return this.f22636a.submit(runnable, obj);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$x */
    private final class x extends AbstractC5776d {

        /* JADX INFO: renamed from: a */
        final AbstractC0523S.b f22637a;

        /* JADX INFO: renamed from: b */
        final C0516K f22638b;

        /* JADX INFO: renamed from: c */
        final C5798o f22639c;

        /* JADX INFO: renamed from: d */
        final C5800p f22640d;

        /* JADX INFO: renamed from: e */
        List f22641e;

        /* JADX INFO: renamed from: f */
        C5769Z f22642f;

        /* JADX INFO: renamed from: g */
        boolean f22643g;

        /* JADX INFO: renamed from: h */
        boolean f22644h;

        /* JADX INFO: renamed from: i */
        ExecutorC0562p0.d f22645i;

        /* JADX INFO: renamed from: io.grpc.internal.h0$x$a */
        final class a extends C5769Z.j {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AbstractC0523S.k f22647a;

            a(AbstractC0523S.k kVar) {
                this.f22647a = kVar;
            }

            @Override // io.grpc.internal.C5769Z.j
            /* JADX INFO: renamed from: a */
            void mo25807a(C5769Z c5769z) {
                C5785h0.this.f22541j0.m25761e(c5769z, true);
            }

            @Override // io.grpc.internal.C5769Z.j
            /* JADX INFO: renamed from: b */
            void mo25808b(C5769Z c5769z) {
                C5785h0.this.f22541j0.m25761e(c5769z, false);
            }

            @Override // io.grpc.internal.C5769Z.j
            /* JADX INFO: renamed from: c */
            void mo25809c(C5769Z c5769z, C0563q c0563q) {
                AbstractC1209m.m5309u(this.f22647a != null, "listener is null");
                this.f22647a.mo2231a(c0563q);
            }

            @Override // io.grpc.internal.C5769Z.j
            /* JADX INFO: renamed from: d */
            void mo25810d(C5769Z c5769z) {
                C5785h0.this.f22503H.remove(c5769z);
                C5785h0.this.f22518W.m2145k(c5769z);
                C5785h0.this.m25934D0();
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.h0$x$b */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                x.this.f22642f.m25805h(C5785h0.f22492q0);
            }
        }

        x(AbstractC0523S.b bVar) {
            AbstractC1209m.m5303o(bVar, "args");
            this.f22641e = bVar.m2181a();
            if (C5785h0.this.f22526c != null) {
                bVar = bVar.m2184e().m2189e(m26023j(bVar.m2181a())).m2188c();
            }
            this.f22637a = bVar;
            C0516K c0516kM2161b = C0516K.m2161b("Subchannel", C5785h0.this.mo2404a());
            this.f22638b = c0516kM2161b;
            C5800p c5800p = new C5800p(c0516kM2161b, C5785h0.this.f22550q, C5785h0.this.f22549p.mo25662a(), "Subchannel for " + bVar.m2181a());
            this.f22640d = c5800p;
            this.f22639c = new C5798o(c5800p, C5785h0.this.f22549p);
        }

        /* JADX INFO: renamed from: j */
        private List m26023j(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0572x c0572x = (C0572x) it.next();
                arrayList.add(new C0572x(c0572x.m2533a(), c0572x.m2534b().m2314d().m2317c(C0572x.f2205d).m2316a()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: b */
        public List mo2222b() {
            C5785h0.this.f22551r.m2492f();
            AbstractC1209m.m5309u(this.f22643g, "not started");
            return this.f22641e;
        }

        @Override // p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: c */
        public C0531a mo2223c() {
            return this.f22637a.m2182b();
        }

        @Override // p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: d */
        public AbstractC0541f mo2224d() {
            return this.f22639c;
        }

        @Override // p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: e */
        public Object mo2225e() {
            AbstractC1209m.m5309u(this.f22643g, "Subchannel is not started");
            return this.f22642f;
        }

        @Override // p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: f */
        public void mo2226f() {
            C5785h0.this.f22551r.m2492f();
            AbstractC1209m.m5309u(this.f22643g, "not started");
            this.f22642f.mo25733a();
        }

        @Override // p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: g */
        public void mo2227g() {
            ExecutorC0562p0.d dVar;
            C5785h0.this.f22551r.m2492f();
            if (this.f22642f == null) {
                this.f22644h = true;
                return;
            }
            if (!this.f22644h) {
                this.f22644h = true;
            } else {
                if (!C5785h0.this.f22511P || (dVar = this.f22645i) == null) {
                    return;
                }
                dVar.m2493a();
                this.f22645i = null;
            }
            if (C5785h0.this.f22511P) {
                this.f22642f.m25805h(C5785h0.f22491p0);
            } else {
                this.f22645i = C5785h0.this.f22551r.m2490c(new RunnableC5779e0(new b()), 5L, TimeUnit.SECONDS, C5785h0.this.f22536h.mo3246z0());
            }
        }

        @Override // p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: h */
        public void mo2228h(AbstractC0523S.k kVar) {
            C5785h0.this.f22551r.m2492f();
            AbstractC1209m.m5309u(!this.f22643g, "already started");
            AbstractC1209m.m5309u(!this.f22644h, "already shutdown");
            AbstractC1209m.m5309u(!C5785h0.this.f22511P, "Channel is being terminated");
            this.f22643g = true;
            C5769Z c5769z = new C5769Z(this.f22637a.m2181a(), C5785h0.this.mo2404a(), C5785h0.this.f22497B, C5785h0.this.f22558y, C5785h0.this.f22536h, C5785h0.this.f22536h.mo3246z0(), C5785h0.this.f22555v, C5785h0.this.f22551r, new a(kVar), C5785h0.this.f22518W, C5785h0.this.f22514S.mo26003a(), this.f22640d, this.f22638b, this.f22639c, C5785h0.this.f22496A);
            C5785h0.this.f22516U.m26106e(new C0511F.a().m2147b("Child Subchannel started").m2148c(C0511F.b.CT_INFO).m2150e(C5785h0.this.f22549p.mo25662a()).m2149d(c5769z).m2146a());
            this.f22642f = c5769z;
            C5785h0.this.f22518W.m2142e(c5769z);
            C5785h0.this.f22503H.add(c5769z);
        }

        @Override // p063H5.AbstractC0523S.i
        /* JADX INFO: renamed from: i */
        public void mo2229i(List list) {
            C5785h0.this.f22551r.m2492f();
            this.f22641e = list;
            if (C5785h0.this.f22526c != null) {
                list = m26023j(list);
            }
            this.f22642f.m25803V(list);
        }

        public String toString() {
            return this.f22638b.toString();
        }
    }

    static {
        C0554l0 c0554l0 = C0554l0.f2113t;
        f22490o0 = c0554l0.m2462q("Channel shutdownNow invoked");
        f22491p0 = c0554l0.m2462q("Channel shutdown invoked");
        f22492q0 = c0554l0.m2462q("Subchannel shutdown invoked");
        f22493r0 = C5791k0.m26047a();
        f22494s0 = new a();
        f22495t0 = new l();
    }

    C5785h0(C5787i0 c5787i0, InterfaceC5810u interfaceC5810u, InterfaceC5788j.a aVar, InterfaceC5803q0 interfaceC5803q0, InterfaceC1214r interfaceC1214r, List list, InterfaceC5756R0 interfaceC5756R0) {
        a aVar2;
        ExecutorC0562p0 executorC0562p0 = new ExecutorC0562p0(new j());
        this.f22551r = executorC0562p0;
        this.f22557x = new C5816x();
        this.f22503H = new HashSet(16, 0.75f);
        this.f22505J = new Object();
        this.f22506K = new HashSet(1, 0.75f);
        a aVar3 = null;
        this.f22508M = new y(this, aVar3);
        this.f22509N = new AtomicBoolean(false);
        this.f22513R = new CountDownLatch(1);
        this.f22520Y = v.NO_RESOLUTION;
        this.f22521Z = f22493r0;
        this.f22525b0 = false;
        this.f22529d0 = new AbstractC5727C0.t();
        this.f22537h0 = C0568t.m2519m();
        o oVar = new o(this, aVar3);
        this.f22539i0 = oVar;
        this.f22541j0 = new q(this, aVar3);
        this.f22543k0 = new m(this, aVar3);
        String str = (String) AbstractC1209m.m5303o(c5787i0.f22680f, "target");
        this.f22524b = str;
        C0516K c0516kM2161b = C0516K.m2161b("Channel", str);
        this.f22522a = c0516kM2161b;
        this.f22549p = (InterfaceC5756R0) AbstractC1209m.m5303o(interfaceC5756R0, "timeProvider");
        InterfaceC5803q0 interfaceC5803q1 = (InterfaceC5803q0) AbstractC1209m.m5303o(c5787i0.f22675a, "executorPool");
        this.f22544l = interfaceC5803q1;
        Executor executor = (Executor) AbstractC1209m.m5303o((Executor) interfaceC5803q1.mo25643a(), "executor");
        this.f22542k = executor;
        this.f22534g = interfaceC5810u;
        p pVar = new p((InterfaceC5803q0) AbstractC1209m.m5303o(c5787i0.f22676b, "offloadExecutorPool"));
        this.f22548o = pVar;
        C5794m c5794m = new C5794m(interfaceC5810u, c5787i0.f22681g, pVar);
        this.f22536h = c5794m;
        this.f22538i = new C5794m(interfaceC5810u, null, pVar);
        w wVar = new w(c5794m.mo3246z0(), aVar3);
        this.f22540j = wVar;
        this.f22550q = c5787i0.f22696v;
        C5800p c5800p = new C5800p(c0516kM2161b, c5787i0.f22696v, interfaceC5756R0.mo25662a(), "Channel for '" + str + "'");
        this.f22516U = c5800p;
        C5798o c5798o = new C5798o(c5800p, interfaceC5756R0);
        this.f22517V = c5798o;
        InterfaceC0546h0 interfaceC0546h0 = c5787i0.f22699y;
        interfaceC0546h0 = interfaceC0546h0 == null ? AbstractC5757S.f22241q : interfaceC0546h0;
        boolean z7 = c5787i0.f22694t;
        this.f22535g0 = z7;
        C5786i c5786i = new C5786i(c5787i0.f22685k);
        this.f22532f = c5786i;
        C0540e0 c0540e0 = c5787i0.f22678d;
        this.f22528d = c0540e0;
        C5737H0 c5737h0 = new C5737H0(z7, c5787i0.f22690p, c5787i0.f22691q, c5786i);
        String str2 = c5787i0.f22684j;
        this.f22526c = str2;
        AbstractC0536c0.a aVarM2377a = AbstractC0536c0.a.m2370g().m2379c(c5787i0.m26039e()).m2382f(interfaceC0546h0).m2385i(executorC0562p0).m2383g(wVar).m2384h(c5737h0).m2378b(c5798o).m2380d(pVar).m2381e(str2).m2377a();
        this.f22530e = aVarM2377a;
        this.f22498C = m25930B0(str, str2, c0540e0, aVarM2377a, c5794m.mo3245M0());
        this.f22546m = (InterfaceC5803q0) AbstractC1209m.m5303o(interfaceC5803q0, "balancerRpcExecutorPool");
        this.f22547n = new p(interfaceC5803q0);
        C5724B c5724b = new C5724B(executor, executorC0562p0);
        this.f22507L = c5724b;
        c5724b.mo3351e(oVar);
        this.f22558y = aVar;
        Map map = c5787i0.f22697w;
        if (map != null) {
            AbstractC0536c0.b bVarMo2403a = c5737h0.mo2403a(map);
            AbstractC1209m.m5311w(bVarMo2403a.m2389d() == null, "Default config is invalid: %s", bVarMo2403a.m2389d());
            C5791k0 c5791k0 = (C5791k0) bVarMo2403a.m2388c();
            this.f22523a0 = c5791k0;
            this.f22521Z = c5791k0;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f22523a0 = null;
        }
        boolean z8 = c5787i0.f22698x;
        this.f22527c0 = z8;
        u uVar = new u(this, this.f22498C.mo2366a(), aVar2);
        this.f22519X = uVar;
        this.f22559z = AbstractC0549j.m2426a(uVar, list);
        this.f22496A = new ArrayList(c5787i0.f22679e);
        this.f22555v = (InterfaceC1214r) AbstractC1209m.m5303o(interfaceC1214r, "stopwatchSupplier");
        long j7 = c5787i0.f22689o;
        if (j7 == -1) {
            this.f22556w = j7;
        } else {
            AbstractC1209m.m5297i(j7 >= C5787i0.f22663J, "invalid idleTimeoutMillis %s", j7);
            this.f22556w = c5787i0.f22689o;
        }
        this.f22545l0 = new C5725B0(new r(this, null), executorC0562p0, c5794m.mo3246z0(), (C1212p) interfaceC1214r.get());
        this.f22552s = c5787i0.f22686l;
        this.f22553t = (C0570v) AbstractC1209m.m5303o(c5787i0.f22687m, "decompressorRegistry");
        this.f22554u = (C0559o) AbstractC1209m.m5303o(c5787i0.f22688n, "compressorRegistry");
        this.f22497B = c5787i0.f22683i;
        this.f22533f0 = c5787i0.f22692r;
        this.f22531e0 = c5787i0.f22693s;
        c cVar = new c(interfaceC5756R0);
        this.f22514S = cVar;
        this.f22515T = cVar.mo26003a();
        C0510E c0510e = (C0510E) AbstractC1209m.m5302n(c5787i0.f22695u);
        this.f22518W = c0510e;
        c0510e.m2141d(this);
        if (z8) {
            return;
        }
        if (this.f22523a0 != null) {
            c5798o.mo2419a(AbstractC0541f.a.INFO, "Service config look-up disabled, using default service config");
        }
        this.f22525b0 = true;
    }

    /* JADX INFO: renamed from: A0 */
    private static AbstractC0536c0 m25928A0(String str, C0540e0 c0540e0, AbstractC0536c0.a aVar, Collection collection) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e7) {
            sb.append(e7.getMessage());
            uri = null;
        }
        AbstractC0538d0 abstractC0538d0M2415e = uri != null ? c0540e0.m2415e(uri.getScheme()) : null;
        String str2 = "";
        if (abstractC0538d0M2415e == null && !f22489n0.matcher(str).matches()) {
            try {
                uri = new URI(c0540e0.m2414c(), "", "/" + str, null);
                abstractC0538d0M2415e = c0540e0.m2415e(uri.getScheme());
            } catch (URISyntaxException e8) {
                throw new IllegalArgumentException(e8);
            }
        }
        if (abstractC0538d0M2415e == null) {
            if (sb.length() > 0) {
                str2 = " (" + ((Object) sb) + ")";
            }
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, str2));
        }
        if (collection != null && !collection.containsAll(abstractC0538d0M2415e.mo2406c())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
        }
        AbstractC0536c0 abstractC0536c0Mo2391b = abstractC0538d0M2415e.mo2391b(uri, aVar);
        if (abstractC0536c0Mo2391b != null) {
            return abstractC0536c0Mo2391b;
        }
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + ")";
        }
        throw new IllegalArgumentException(String.format("cannot create a NameResolver for %s%s", str, str2));
    }

    /* JADX INFO: renamed from: B0 */
    static AbstractC0536c0 m25930B0(String str, String str2, C0540e0 c0540e0, AbstractC0536c0.a aVar, Collection collection) {
        C5733F0 c5733f0 = new C5733F0(m25928A0(str, c0540e0, aVar, collection), new C5792l(new C5732F.a(), aVar.m2374d(), aVar.m2376f()), aVar.m2376f());
        return str2 == null ? c5733f0 : new k(c5733f0, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public void m25932C0() {
        if (this.f22510O) {
            Iterator it = this.f22503H.iterator();
            while (it.hasNext()) {
                ((C5769Z) it.next()).m25804d(f22490o0);
            }
            Iterator it2 = this.f22506K.iterator();
            if (it2.hasNext()) {
                AbstractC2263x.m9328a(it2.next());
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public void m25934D0() {
        if (!this.f22512Q && this.f22509N.get() && this.f22503H.isEmpty() && this.f22506K.isEmpty()) {
            this.f22517V.mo2419a(AbstractC0541f.a.INFO, "Terminated");
            this.f22518W.m2144j(this);
            this.f22544l.mo25644b(this.f22542k);
            this.f22547n.m26010b();
            this.f22548o.m26010b();
            this.f22536h.close();
            this.f22512Q = true;
            this.f22513R.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public void m25937F0() {
        this.f22551r.m2492f();
        if (this.f22499D) {
            this.f22498C.mo2367b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public void m25939G0() {
        long j7 = this.f22556w;
        if (j7 == -1) {
            return;
        }
        this.f22545l0.m25451k(j7, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public void m25942I0(boolean z7) {
        this.f22551r.m2492f();
        if (z7) {
            AbstractC1209m.m5309u(this.f22499D, "nameResolver is not started");
            AbstractC1209m.m5309u(this.f22500E != null, "lbHelper is null");
        }
        AbstractC0536c0 abstractC0536c0 = this.f22498C;
        if (abstractC0536c0 != null) {
            abstractC0536c0.mo2368c();
            this.f22499D = false;
            if (z7) {
                this.f22498C = m25930B0(this.f22524b, this.f22526c, this.f22528d, this.f22530e, this.f22536h.mo3245M0());
            } else {
                this.f22498C = null;
            }
        }
        s sVar = this.f22500E;
        if (sVar != null) {
            sVar.f22600a.m26037d();
            this.f22500E = null;
        }
        this.f22501F = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public void m25945K0(AbstractC0523S.j jVar) {
        this.f22501F = jVar;
        this.f22507L.m25433s(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public void m25993w0(boolean z7) {
        this.f22545l0.m25450i(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m25995x0() {
        m25942I0(true);
        this.f22507L.m25433s(null);
        this.f22517V.mo2419a(AbstractC0541f.a.INFO, "Entering IDLE state");
        this.f22557x.m26208b(EnumC0561p.IDLE);
        if (this.f22541j0.m25759a(this.f22505J, this.f22507L)) {
            m26002y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public Executor m25998z0(C0535c c0535c) {
        Executor executorM2347e = c0535c.m2347e();
        return executorM2347e == null ? this.f22542k : executorM2347e;
    }

    /* JADX INFO: renamed from: E0 */
    void m25999E0(Throwable th) {
        if (this.f22502G) {
            return;
        }
        this.f22502G = true;
        m25993w0(true);
        m25942I0(false);
        m25945K0(new e(th));
        this.f22519X.m26021q(null);
        this.f22517V.mo2419a(AbstractC0541f.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.f22557x.m26208b(EnumC0561p.TRANSIENT_FAILURE);
    }

    /* JADX INFO: renamed from: H0 */
    public C5785h0 m26000H0() {
        this.f22517V.mo2419a(AbstractC0541f.a.DEBUG, "shutdown() called");
        if (!this.f22509N.compareAndSet(false, true)) {
            return this;
        }
        this.f22551r.execute(new h());
        this.f22519X.m26019o();
        this.f22551r.execute(new b());
        return this;
    }

    @Override // p063H5.AbstractC0526V
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public C5785h0 mo2248m() {
        this.f22517V.mo2419a(AbstractC0541f.a.DEBUG, "shutdownNow() called");
        m26000H0();
        this.f22519X.m26020p();
        this.f22551r.execute(new i());
        return this;
    }

    @Override // p063H5.AbstractC0537d
    /* JADX INFO: renamed from: a */
    public String mo2404a() {
        return this.f22559z.mo2404a();
    }

    @Override // p063H5.AbstractC0537d
    /* JADX INFO: renamed from: f */
    public AbstractC0543g mo2405f(C0532a0 c0532a0, C0535c c0535c) {
        return this.f22559z.mo2405f(c0532a0, c0535c);
    }

    @Override // p063H5.InterfaceC0521P
    /* JADX INFO: renamed from: g */
    public C0516K mo2172g() {
        return this.f22522a;
    }

    @Override // p063H5.AbstractC0526V
    /* JADX INFO: renamed from: j */
    public void mo2245j() {
        this.f22551r.execute(new f());
    }

    @Override // p063H5.AbstractC0526V
    /* JADX INFO: renamed from: k */
    public EnumC0561p mo2246k(boolean z7) {
        EnumC0561p enumC0561pM26207a = this.f22557x.m26207a();
        if (z7 && enumC0561pM26207a == EnumC0561p.IDLE) {
            this.f22551r.execute(new g());
        }
        return enumC0561pM26207a;
    }

    @Override // p063H5.AbstractC0526V
    /* JADX INFO: renamed from: l */
    public void mo2247l(EnumC0561p enumC0561p, Runnable runnable) {
        this.f22551r.execute(new d(runnable, enumC0561p));
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5276c("logId", this.f22522a.m2164d()).m5277d("target", this.f22524b).toString();
    }

    /* JADX INFO: renamed from: y0 */
    void m26002y0() {
        this.f22551r.m2492f();
        if (this.f22509N.get() || this.f22502G) {
            return;
        }
        if (this.f22541j0.m25760d()) {
            m25993w0(false);
        } else {
            m25939G0();
        }
        if (this.f22500E != null) {
            return;
        }
        this.f22517V.mo2419a(AbstractC0541f.a.INFO, "Exiting idle mode");
        s sVar = new s(this, null);
        sVar.f22600a = this.f22532f.m26032e(sVar);
        this.f22500E = sVar;
        this.f22498C.mo2369d(new t(sVar, this.f22498C));
        this.f22499D = true;
    }

    /* JADX INFO: renamed from: io.grpc.internal.h0$y */
    private final class y {

        /* JADX INFO: renamed from: a */
        final Object f22650a;

        /* JADX INFO: renamed from: b */
        Collection f22651b;

        /* JADX INFO: renamed from: c */
        C0554l0 f22652c;

        private y() {
            this.f22650a = new Object();
            this.f22651b = new HashSet();
        }

        /* JADX INFO: renamed from: a */
        C0554l0 m26024a(AbstractC5727C0 abstractC5727C0) {
            synchronized (this.f22650a) {
                try {
                    C0554l0 c0554l0 = this.f22652c;
                    if (c0554l0 != null) {
                        return c0554l0;
                    }
                    this.f22651b.add(abstractC5727C0);
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        void m26025b(C0554l0 c0554l0) {
            synchronized (this.f22650a) {
                try {
                    if (this.f22652c != null) {
                        return;
                    }
                    this.f22652c = c0554l0;
                    boolean zIsEmpty = this.f22651b.isEmpty();
                    if (zIsEmpty) {
                        C5785h0.this.f22507L.mo3353h(c0554l0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        void m26026c(C0554l0 c0554l0) {
            ArrayList arrayList;
            m26025b(c0554l0);
            synchronized (this.f22650a) {
                arrayList = new ArrayList(this.f22651b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC5804r) it.next()).mo25438a(c0554l0);
            }
            C5785h0.this.f22507L.mo3350d(c0554l0);
        }

        /* JADX INFO: renamed from: d */
        void m26027d(AbstractC5727C0 abstractC5727C0) {
            C0554l0 c0554l0;
            synchronized (this.f22650a) {
                try {
                    this.f22651b.remove(abstractC5727C0);
                    if (this.f22651b.isEmpty()) {
                        c0554l0 = this.f22652c;
                        this.f22651b = new HashSet();
                    } else {
                        c0554l0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c0554l0 != null) {
                C5785h0.this.f22507L.mo3353h(c0554l0);
            }
        }

        /* synthetic */ y(C5785h0 c5785h0, a aVar) {
            this();
        }
    }
}

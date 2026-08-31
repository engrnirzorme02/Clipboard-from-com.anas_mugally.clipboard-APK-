package p079J5;

import com.google.android.gms.common.api.C3553a;
import io.grpc.internal.AbstractC5754Q;
import io.grpc.internal.AbstractC5757S;
import io.grpc.internal.AbstractC5767X;
import io.grpc.internal.C5751O0;
import io.grpc.internal.C5762U0;
import io.grpc.internal.C5765W;
import io.grpc.internal.C5777d0;
import io.grpc.internal.ExecutorC5741J0;
import io.grpc.internal.InterfaceC5793l0;
import io.grpc.internal.InterfaceC5806s;
import io.grpc.internal.InterfaceC5808t;
import io.grpc.internal.InterfaceC5814w;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p063H5.AbstractC0508C;
import p063H5.AbstractC0551k;
import p063H5.C0509D;
import p063H5.C0510E;
import p063H5.C0516K;
import p063H5.C0530Z;
import p063H5.C0531a;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.C0554l0;
import p063H5.C0556m0;
import p063H5.EnumC0548i0;
import p072I6.AbstractC0659p;
import p072I6.C0641C;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0649f;
import p072I6.InterfaceC0650g;
import p087K5.AbstractC0754c;
import p087K5.C0753b;
import p087K5.C0761j;
import p095L5.C0848d;
import p095L5.C0851g;
import p095L5.C0853i;
import p095L5.EnumC0845a;
import p095L5.EnumC0849e;
import p095L5.InterfaceC0846b;
import p095L5.InterfaceC0847c;
import p095L5.InterfaceC0854j;
import p103M5.C0902a;
import p103M5.C0903b;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;
import p122P3.C1212p;
import p122P3.InterfaceC1214r;
import p131Q5.AbstractC1291c;

/* JADX INFO: renamed from: J5.i */
/* JADX INFO: loaded from: classes.dex */
class C0695i implements InterfaceC5814w, C0688b.a, C0704r.d {

    /* JADX INFO: renamed from: V */
    private static final Map f2765V = m3308R();

    /* JADX INFO: renamed from: W */
    private static final Logger f2766W = Logger.getLogger(C0695i.class.getName());

    /* JADX INFO: renamed from: A */
    private final SocketFactory f2767A;

    /* JADX INFO: renamed from: B */
    private SSLSocketFactory f2768B;

    /* JADX INFO: renamed from: C */
    private HostnameVerifier f2769C;

    /* JADX INFO: renamed from: D */
    private Socket f2770D;

    /* JADX INFO: renamed from: E */
    private int f2771E;

    /* JADX INFO: renamed from: F */
    private final Deque f2772F;

    /* JADX INFO: renamed from: G */
    private final C0753b f2773G;

    /* JADX INFO: renamed from: H */
    private C5777d0 f2774H;

    /* JADX INFO: renamed from: I */
    private boolean f2775I;

    /* JADX INFO: renamed from: J */
    private long f2776J;

    /* JADX INFO: renamed from: K */
    private long f2777K;

    /* JADX INFO: renamed from: L */
    private boolean f2778L;

    /* JADX INFO: renamed from: M */
    private final Runnable f2779M;

    /* JADX INFO: renamed from: N */
    private final int f2780N;

    /* JADX INFO: renamed from: O */
    private final boolean f2781O;

    /* JADX INFO: renamed from: P */
    private final C5762U0 f2782P;

    /* JADX INFO: renamed from: Q */
    private final AbstractC5767X f2783Q;

    /* JADX INFO: renamed from: R */
    private C0510E.b f2784R;

    /* JADX INFO: renamed from: S */
    final C0509D f2785S;

    /* JADX INFO: renamed from: T */
    int f2786T;

    /* JADX INFO: renamed from: U */
    Runnable f2787U;

    /* JADX INFO: renamed from: a */
    private final InetSocketAddress f2788a;

    /* JADX INFO: renamed from: b */
    private final String f2789b;

    /* JADX INFO: renamed from: c */
    private final String f2790c;

    /* JADX INFO: renamed from: d */
    private final Random f2791d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1214r f2792e;

    /* JADX INFO: renamed from: f */
    private final int f2793f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC0854j f2794g;

    /* JADX INFO: renamed from: h */
    private InterfaceC5793l0.a f2795h;

    /* JADX INFO: renamed from: i */
    private C0688b f2796i;

    /* JADX INFO: renamed from: j */
    private C0704r f2797j;

    /* JADX INFO: renamed from: k */
    private final Object f2798k;

    /* JADX INFO: renamed from: l */
    private final C0516K f2799l;

    /* JADX INFO: renamed from: m */
    private int f2800m;

    /* JADX INFO: renamed from: n */
    private final Map f2801n;

    /* JADX INFO: renamed from: o */
    private final Executor f2802o;

    /* JADX INFO: renamed from: p */
    private final ExecutorC5741J0 f2803p;

    /* JADX INFO: renamed from: q */
    private final ScheduledExecutorService f2804q;

    /* JADX INFO: renamed from: r */
    private final int f2805r;

    /* JADX INFO: renamed from: s */
    private int f2806s;

    /* JADX INFO: renamed from: t */
    private e f2807t;

    /* JADX INFO: renamed from: u */
    private C0531a f2808u;

    /* JADX INFO: renamed from: v */
    private C0554l0 f2809v;

    /* JADX INFO: renamed from: w */
    private boolean f2810w;

    /* JADX INFO: renamed from: x */
    private C5765W f2811x;

    /* JADX INFO: renamed from: y */
    private boolean f2812y;

    /* JADX INFO: renamed from: z */
    private boolean f2813z;

    /* JADX INFO: renamed from: J5.i$a */
    class a extends AbstractC5767X {
        a() {
        }

        @Override // io.grpc.internal.AbstractC5767X
        /* JADX INFO: renamed from: b */
        protected void mo3357b() {
            C0695i.this.f2795h.mo25822d(true);
        }

        @Override // io.grpc.internal.AbstractC5767X
        /* JADX INFO: renamed from: c */
        protected void mo3358c() {
            C0695i.this.f2795h.mo25822d(false);
        }
    }

    /* JADX INFO: renamed from: J5.i$b */
    class b implements C5762U0.c {
        b() {
        }
    }

    /* JADX INFO: renamed from: J5.i$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CountDownLatch f2816a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C0687a f2817b;

        /* JADX INFO: renamed from: J5.i$c$a */
        class a implements InterfaceC0640B {
            a() {
            }

            @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // p072I6.InterfaceC0640B
            /* JADX INFO: renamed from: g */
            public C0641C mo2948g() {
                return C0641C.f2530e;
            }

            @Override // p072I6.InterfaceC0640B
            /* JADX INFO: renamed from: w */
            public long mo2949w(C0648e c0648e, long j7) {
                return -1L;
            }
        }

        c(CountDownLatch countDownLatch, C0687a c0687a) {
            this.f2816a = countDownLatch;
            this.f2817b = c0687a;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            C0695i c0695i;
            e eVar;
            Socket socketM3310T;
            SSLSession session;
            Socket socket;
            try {
                this.f2816a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            InterfaceC0650g interfaceC0650gM3132d = AbstractC0659p.m3132d(new a());
            try {
                try {
                    C0695i c0695i2 = C0695i.this;
                    C0509D c0509d = c0695i2.f2785S;
                    if (c0509d == null) {
                        socketM3310T = c0695i2.f2767A.createSocket(C0695i.this.f2788a.getAddress(), C0695i.this.f2788a.getPort());
                    } else {
                        if (!(c0509d.m2127b() instanceof InetSocketAddress)) {
                            throw C0554l0.f2112s.m2462q("Unsupported SocketAddress implementation " + C0695i.this.f2785S.m2127b().getClass()).m2454c();
                        }
                        C0695i c0695i3 = C0695i.this;
                        socketM3310T = c0695i3.m3310T(c0695i3.f2785S.m2128c(), (InetSocketAddress) C0695i.this.f2785S.m2127b(), C0695i.this.f2785S.m2129d(), C0695i.this.f2785S.m2126a());
                    }
                    Socket socket2 = socketM3310T;
                    if (C0695i.this.f2768B != null) {
                        SSLSocket sSLSocketM3403b = AbstractC0701o.m3403b(C0695i.this.f2768B, C0695i.this.f2769C, socket2, C0695i.this.m3342W(), C0695i.this.m3343X(), C0695i.this.f2773G);
                        session = sSLSocketM3403b.getSession();
                        socket = sSLSocketM3403b;
                    } else {
                        session = null;
                        socket = socket2;
                    }
                    socket.setTcpNoDelay(true);
                    InterfaceC0650g interfaceC0650gM3132d2 = AbstractC0659p.m3132d(AbstractC0659p.m3140l(socket));
                    this.f2817b.m3213p0(AbstractC0659p.m3136h(socket), socket);
                    C0695i c0695i4 = C0695i.this;
                    c0695i4.f2808u = c0695i4.f2808u.m2314d().m2318d(AbstractC0508C.f1892a, socket.getRemoteSocketAddress()).m2318d(AbstractC0508C.f1893b, socket.getLocalSocketAddress()).m2318d(AbstractC0508C.f1894c, session).m2318d(AbstractC5754Q.f22222a, session == null ? EnumC0548i0.NONE : EnumC0548i0.PRIVACY_AND_INTEGRITY).m2316a();
                    C0695i c0695i5 = C0695i.this;
                    c0695i5.f2807t = c0695i5.new e(c0695i5.f2794g.mo3933b(interfaceC0650gM3132d2, true));
                    synchronized (C0695i.this.f2798k) {
                        try {
                            C0695i.this.f2770D = (Socket) AbstractC1209m.m5303o(socket, "socket");
                            if (session != null) {
                                C0695i.this.f2784R = new C0510E.b(new C0510E.c(session));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (C0556m0 e7) {
                    C0695i.this.m3320k0(0, EnumC0845a.INTERNAL_ERROR, e7.m2475a());
                    c0695i = C0695i.this;
                    eVar = c0695i.new e(c0695i.f2794g.mo3933b(interfaceC0650gM3132d, true));
                    c0695i.f2807t = eVar;
                } catch (Exception e8) {
                    C0695i.this.mo3227f(e8);
                    c0695i = C0695i.this;
                    eVar = c0695i.new e(c0695i.f2794g.mo3933b(interfaceC0650gM3132d, true));
                    c0695i.f2807t = eVar;
                }
            } catch (Throwable th2) {
                C0695i c0695i6 = C0695i.this;
                c0695i6.f2807t = c0695i6.new e(c0695i6.f2794g.mo3933b(interfaceC0650gM3132d, true));
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: J5.i$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = C0695i.this.f2787U;
            if (runnable != null) {
                runnable.run();
            }
            C0695i.this.f2802o.execute(C0695i.this.f2807t);
            synchronized (C0695i.this.f2798k) {
                C0695i.this.f2771E = C3553a.e.API_PRIORITY_OTHER;
                C0695i.this.m3322l0();
            }
            C0695i.this.getClass();
        }
    }

    /* JADX INFO: renamed from: J5.i$e */
    class e implements InterfaceC0846b.a, Runnable {

        /* JADX INFO: renamed from: b */
        InterfaceC0846b f2822b;

        /* JADX INFO: renamed from: a */
        private final C0696j f2821a = new C0696j(Level.FINE, C0695i.class);

        /* JADX INFO: renamed from: c */
        boolean f2823c = true;

        e(InterfaceC0846b interfaceC0846b) {
            this.f2822b = interfaceC0846b;
        }

        /* JADX INFO: renamed from: d */
        private int m3359d(List list) {
            long jM3090F = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                C0848d c0848d = (C0848d) list.get(i7);
                jM3090F += (long) (c0848d.f3354a.m3090F() + 32 + c0848d.f3355b.m3090F());
            }
            return (int) Math.min(jM3090F, 2147483647L);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0079  */
        /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:27:0x0079, please report this as an issue */
        @Override // p095L5.InterfaceC0846b.a
        /* JADX INFO: renamed from: a */
        public void mo3360a(int i7, long j7) {
            boolean z7;
            this.f2821a.m3382k(C0696j.a.INBOUND, i7, j7);
            if (j7 == 0) {
                if (i7 == 0) {
                    C0695i.this.m3314f0(EnumC0845a.PROTOCOL_ERROR, "Received 0 flow control window increment.");
                    return;
                } else {
                    C0695i.this.m3341V(i7, C0554l0.f2112s.m2462q("Received 0 flow control window increment."), InterfaceC5806s.a.PROCESSED, false, EnumC0845a.PROTOCOL_ERROR, null);
                    return;
                }
            }
            synchronized (C0695i.this.f2798k) {
                try {
                    if (i7 == 0) {
                        C0695i.this.f2797j.m3416g(null, (int) j7);
                        return;
                    }
                    C0694h c0694h = (C0694h) C0695i.this.f2801n.get(Integer.valueOf(i7));
                    if (c0694h == null) {
                        z7 = C0695i.this.m3349c0(i7) ? false : true;
                        if (z7) {
                            C0695i.this.m3314f0(EnumC0845a.PROTOCOL_ERROR, "Received window_update for unknown stream: " + i7);
                        }
                    }
                    C0695i.this.f2797j.m3416g(c0694h.mo3264l().m3280b0(), (int) j7);
                    if (z7) {
                        C0695i.this.m3314f0(EnumC0845a.PROTOCOL_ERROR, "Received window_update for unknown stream: " + i7);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p095L5.InterfaceC0846b.a
        /* JADX INFO: renamed from: b */
        public void mo3361b(boolean z7, int i7, int i8) {
            C5765W c5765w;
            long j7 = (((long) i7) << 32) | (((long) i8) & 4294967295L);
            this.f2821a.m3376e(C0696j.a.INBOUND, j7);
            if (!z7) {
                synchronized (C0695i.this.f2798k) {
                    C0695i.this.f2796i.mo3217b(true, i7, i8);
                }
                return;
            }
            synchronized (C0695i.this.f2798k) {
                try {
                    c5765w = null;
                    if (C0695i.this.f2811x == null) {
                        C0695i.f2766W.warning("Received unexpected ping ack. No ping outstanding");
                    } else if (C0695i.this.f2811x.m25758h() == j7) {
                        C5765W c5765w2 = C0695i.this.f2811x;
                        C0695i.this.f2811x = null;
                        c5765w = c5765w2;
                    } else {
                        C0695i.f2766W.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(C0695i.this.f2811x.m25758h()), Long.valueOf(j7)));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c5765w != null) {
                c5765w.m25756d();
            }
        }

        @Override // p095L5.InterfaceC0846b.a
        /* JADX INFO: renamed from: c */
        public void mo3362c() {
        }

        @Override // p095L5.InterfaceC0846b.a
        /* JADX INFO: renamed from: k */
        public void mo3363k(int i7, EnumC0845a enumC0845a) {
            this.f2821a.m3379h(C0696j.a.INBOUND, i7, enumC0845a);
            C0554l0 c0554l0M2456e = C0695i.m3329p0(enumC0845a).m2456e("Rst Stream");
            boolean z7 = c0554l0M2456e.m2458m() == C0554l0.b.CANCELLED || c0554l0M2456e.m2458m() == C0554l0.b.DEADLINE_EXCEEDED;
            synchronized (C0695i.this.f2798k) {
                try {
                    C0694h c0694h = (C0694h) C0695i.this.f2801n.get(Integer.valueOf(i7));
                    if (c0694h != null) {
                        AbstractC1291c.m5628d("OkHttpClientTransport$ClientFrameHandler.rstStream", c0694h.mo3264l().m3287h0());
                        C0695i.this.m3341V(i7, c0554l0M2456e, enumC0845a == EnumC0845a.REFUSED_STREAM ? InterfaceC5806s.a.REFUSED : InterfaceC5806s.a.PROCESSED, z7, null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p095L5.InterfaceC0846b.a
        /* JADX INFO: renamed from: l */
        public void mo3364l(int i7, int i8, int i9, boolean z7) {
        }

        @Override // p095L5.InterfaceC0846b.a
        /* JADX INFO: renamed from: m */
        public void mo3365m(int i7, int i8, List list) {
            this.f2821a.m3378g(C0696j.a.INBOUND, i7, i8, list);
            synchronized (C0695i.this.f2798k) {
                C0695i.this.f2796i.mo3218k(i7, EnumC0845a.PROTOCOL_ERROR);
            }
        }

        @Override // p095L5.InterfaceC0846b.a
        /* JADX INFO: renamed from: n */
        public void mo3366n(boolean z7, boolean z8, int i7, int i8, List list, EnumC0849e enumC0849e) {
            C0554l0 c0554l0M2462q;
            boolean z9;
            int iM3359d;
            this.f2821a.m3375d(C0696j.a.INBOUND, i7, list, z8);
            if (C0695i.this.f2780N == Integer.MAX_VALUE || (iM3359d = m3359d(list)) <= C0695i.this.f2780N) {
                c0554l0M2462q = null;
            } else {
                c0554l0M2462q = C0554l0.f2107n.m2462q(String.format(Locale.US, "Response %s metadata larger than %d: %d", z8 ? "trailer" : "header", Integer.valueOf(C0695i.this.f2780N), Integer.valueOf(iM3359d)));
            }
            synchronized (C0695i.this.f2798k) {
                try {
                    C0694h c0694h = (C0694h) C0695i.this.f2801n.get(Integer.valueOf(i7));
                    z9 = false;
                    if (c0694h == null) {
                        if (C0695i.this.m3349c0(i7)) {
                            C0695i.this.f2796i.mo3218k(i7, EnumC0845a.STREAM_CLOSED);
                        } else {
                            z9 = true;
                        }
                    } else if (c0554l0M2462q == null) {
                        AbstractC1291c.m5628d("OkHttpClientTransport$ClientFrameHandler.headers", c0694h.mo3264l().m3287h0());
                        c0694h.mo3264l().m3289j0(list, z8);
                    } else {
                        if (!z8) {
                            C0695i.this.f2796i.mo3218k(i7, EnumC0845a.CANCEL);
                        }
                        c0694h.mo3264l().m25844N(c0554l0M2462q, false, new C0530Z());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z9) {
                C0695i.this.m3314f0(EnumC0845a.PROTOCOL_ERROR, "Received header for unknown stream: " + i7);
            }
        }

        @Override // p095L5.InterfaceC0846b.a
        /* JADX INFO: renamed from: o */
        public void mo3367o(boolean z7, C0853i c0853i) {
            boolean zM3415f;
            this.f2821a.m3380i(C0696j.a.INBOUND, c0853i);
            synchronized (C0695i.this.f2798k) {
                try {
                    if (AbstractC0700n.m3400b(c0853i, 4)) {
                        C0695i.this.f2771E = AbstractC0700n.m3399a(c0853i, 4);
                    }
                    if (AbstractC0700n.m3400b(c0853i, 7)) {
                        zM3415f = C0695i.this.f2797j.m3415f(AbstractC0700n.m3399a(c0853i, 7));
                    } else {
                        zM3415f = false;
                    }
                    if (this.f2823c) {
                        C0695i c0695i = C0695i.this;
                        c0695i.f2808u = c0695i.f2795h.mo25819a(C0695i.this.f2808u);
                        C0695i.this.f2795h.mo25820b();
                        this.f2823c = false;
                    }
                    C0695i.this.f2796i.mo3216B0(c0853i);
                    if (zM3415f) {
                        C0695i.this.f2797j.m3417h();
                    }
                    C0695i.this.m3322l0();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p095L5.InterfaceC0846b.a
        /* JADX INFO: renamed from: p */
        public void mo3368p(boolean z7, int i7, InterfaceC0650g interfaceC0650g, int i8, int i9) {
            this.f2821a.m3373b(C0696j.a.INBOUND, i7, interfaceC0650g.mo3043f(), i8, z7);
            C0694h c0694hM3344Z = C0695i.this.m3344Z(i7);
            if (c0694hM3344Z != null) {
                long j7 = i8;
                interfaceC0650g.mo3011G0(j7);
                C0648e c0648e = new C0648e();
                c0648e.mo3003I(interfaceC0650g.mo3043f(), j7);
                AbstractC1291c.m5628d("OkHttpClientTransport$ClientFrameHandler.data", c0694hM3344Z.mo3264l().m3287h0());
                synchronized (C0695i.this.f2798k) {
                    c0694hM3344Z.mo3264l().m3288i0(c0648e, z7, i9 - i8);
                }
            } else {
                if (!C0695i.this.m3349c0(i7)) {
                    C0695i.this.m3314f0(EnumC0845a.PROTOCOL_ERROR, "Received data for unknown stream: " + i7);
                    return;
                }
                synchronized (C0695i.this.f2798k) {
                    C0695i.this.f2796i.mo3218k(i7, EnumC0845a.STREAM_CLOSED);
                }
                interfaceC0650g.mo3052l(i8);
            }
            C0695i.m3295E(C0695i.this, i9);
            if (C0695i.this.f2806s >= C0695i.this.f2793f * 0.5f) {
                synchronized (C0695i.this.f2798k) {
                    C0695i.this.f2796i.mo3224a(0, C0695i.this.f2806s);
                }
                C0695i.this.f2806s = 0;
            }
        }

        @Override // p095L5.InterfaceC0846b.a
        /* JADX INFO: renamed from: q */
        public void mo3369q(int i7, EnumC0845a enumC0845a, C0651h c0651h) {
            this.f2821a.m3374c(C0696j.a.INBOUND, i7, enumC0845a, c0651h);
            if (enumC0845a == EnumC0845a.ENHANCE_YOUR_CALM) {
                String strM3094M = c0651h.m3094M();
                C0695i.f2766W.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strM3094M));
                if ("too_many_pings".equals(strM3094M)) {
                    C0695i.this.f2779M.run();
                }
            }
            C0554l0 c0554l0M2456e = AbstractC5757S.h.m25688k(enumC0845a.f3344a).m2456e("Received Goaway");
            if (c0651h.m3090F() > 0) {
                c0554l0M2456e = c0554l0M2456e.m2456e(c0651h.m3094M());
            }
            C0695i.this.m3320k0(i7, null, c0554l0M2456e);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0554l0 c0554l0M2462q;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f2822b.mo3889g0(this)) {
                try {
                    if (C0695i.this.f2774H != null) {
                        C0695i.this.f2774H.m25900m();
                    }
                } catch (Throwable th) {
                    try {
                        C0695i.this.m3320k0(0, EnumC0845a.PROTOCOL_ERROR, C0554l0.f2112s.m2462q("error in frame handler").m2461p(th));
                        try {
                            this.f2822b.close();
                        } catch (IOException e7) {
                            e = e7;
                            C0695i.f2766W.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        } catch (RuntimeException e8) {
                            if (!"bio == null".equals(e8.getMessage())) {
                                throw e8;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            this.f2822b.close();
                        } catch (IOException e9) {
                            C0695i.f2766W.log(Level.INFO, "Exception closing frame reader", (Throwable) e9);
                        } catch (RuntimeException e10) {
                            if (!"bio == null".equals(e10.getMessage())) {
                                throw e10;
                            }
                        }
                        C0695i.this.f2795h.mo25821c();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (C0695i.this.f2798k) {
                c0554l0M2462q = C0695i.this.f2809v;
            }
            if (c0554l0M2462q == null) {
                c0554l0M2462q = C0554l0.f2113t.m2462q("End of stream or IOException");
            }
            C0695i.this.m3320k0(0, EnumC0845a.INTERNAL_ERROR, c0554l0M2462q);
            try {
                this.f2822b.close();
            } catch (IOException e11) {
                e = e11;
                C0695i.f2766W.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
            } catch (RuntimeException e12) {
                if (!"bio == null".equals(e12.getMessage())) {
                    throw e12;
                }
            }
            C0695i.this.f2795h.mo25821c();
            Thread.currentThread().setName(name);
        }
    }

    public C0695i(C0692f.f fVar, InetSocketAddress inetSocketAddress, String str, String str2, C0531a c0531a, C0509D c0509d, Runnable runnable) {
        this(fVar, inetSocketAddress, str, str2, c0531a, AbstractC5757S.f22247w, new C0851g(), c0509d, runnable);
    }

    /* JADX INFO: renamed from: E */
    static /* synthetic */ int m3295E(C0695i c0695i, int i7) {
        int i8 = c0695i.f2806s + i7;
        c0695i.f2806s = i8;
        return i8;
    }

    /* JADX INFO: renamed from: R */
    private static Map m3308R() {
        EnumMap enumMap = new EnumMap(EnumC0845a.class);
        EnumC0845a enumC0845a = EnumC0845a.NO_ERROR;
        C0554l0 c0554l0 = C0554l0.f2112s;
        enumMap.put(enumC0845a, c0554l0.m2462q("No error: A GRPC status of OK should have been sent"));
        enumMap.put(EnumC0845a.PROTOCOL_ERROR, c0554l0.m2462q("Protocol error"));
        enumMap.put(EnumC0845a.INTERNAL_ERROR, c0554l0.m2462q("Internal error"));
        enumMap.put(EnumC0845a.FLOW_CONTROL_ERROR, c0554l0.m2462q("Flow control error"));
        enumMap.put(EnumC0845a.STREAM_CLOSED, c0554l0.m2462q("Stream closed"));
        enumMap.put(EnumC0845a.FRAME_TOO_LARGE, c0554l0.m2462q("Frame too large"));
        enumMap.put(EnumC0845a.REFUSED_STREAM, C0554l0.f2113t.m2462q("Refused stream"));
        enumMap.put(EnumC0845a.CANCEL, C0554l0.f2099f.m2462q("Cancelled"));
        enumMap.put(EnumC0845a.COMPRESSION_ERROR, c0554l0.m2462q("Compression error"));
        enumMap.put(EnumC0845a.CONNECT_ERROR, c0554l0.m2462q("Connect error"));
        enumMap.put(EnumC0845a.ENHANCE_YOUR_CALM, C0554l0.f2107n.m2462q("Enhance your calm"));
        enumMap.put(EnumC0845a.INADEQUATE_SECURITY, C0554l0.f2105l.m2462q("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    /* JADX INFO: renamed from: S */
    private C0903b m3309S(InetSocketAddress inetSocketAddress, String str, String str2) {
        C0902a c0902aM4113a = new C0902a.b().m4117k("https").m4115h(inetSocketAddress.getHostName()).m4116j(inetSocketAddress.getPort()).m4113a();
        C0903b.b bVarM4123d = new C0903b.b().m4124e(c0902aM4113a).m4123d("Host", c0902aM4113a.m4105c() + ":" + c0902aM4113a.m4106f()).m4123d("User-Agent", this.f2790c);
        if (str != null && str2 != null) {
            bVarM4123d.m4123d("Proxy-Authorization", AbstractC0754c.m3541a(str, str2));
        }
        return bVarM4123d.m4122c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public Socket m3310T(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws C0556m0 {
        Socket socketCreateSocket = null;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? this.f2767A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.f2767A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socketCreateSocket.setTcpNoDelay(true);
            socketCreateSocket.setSoTimeout(this.f2786T);
            InterfaceC0640B interfaceC0640BM3140l = AbstractC0659p.m3140l(socketCreateSocket);
            InterfaceC0649f interfaceC0649fM3131c = AbstractC0659p.m3131c(AbstractC0659p.m3136h(socketCreateSocket));
            C0903b c0903bM3309S = m3309S(inetSocketAddress, str, str2);
            C0902a c0902aM4119b = c0903bM3309S.m4119b();
            interfaceC0649fM3131c.mo3031X(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", c0902aM4119b.m4105c(), Integer.valueOf(c0902aM4119b.m4106f()))).mo3031X("\r\n");
            int iM3551b = c0903bM3309S.m4118a().m3551b();
            for (int i7 = 0; i7 < iM3551b; i7++) {
                interfaceC0649fM3131c.mo3031X(c0903bM3309S.m4118a().m3550a(i7)).mo3031X(": ").mo3031X(c0903bM3309S.m4118a().m3552c(i7)).mo3031X("\r\n");
            }
            interfaceC0649fM3131c.mo3031X("\r\n");
            interfaceC0649fM3131c.flush();
            C0761j c0761jM3589a = C0761j.m3589a(m3315g0(interfaceC0640BM3140l));
            while (!m3315g0(interfaceC0640BM3140l).equals("")) {
            }
            int i8 = c0761jM3589a.f3094b;
            if (i8 >= 200 && i8 < 300) {
                socketCreateSocket.setSoTimeout(0);
                return socketCreateSocket;
            }
            C0648e c0648e = new C0648e();
            try {
                socketCreateSocket.shutdownOutput();
                interfaceC0640BM3140l.mo2949w(c0648e, 1024L);
            } catch (IOException e7) {
                c0648e.mo3031X("Unable to read body: " + e7.toString());
            }
            try {
                socketCreateSocket.close();
            } catch (IOException unused) {
            }
            throw C0554l0.f2113t.m2462q(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(c0761jM3589a.f3094b), c0761jM3589a.f3095c, c0648e.m3042e1())).m2454c();
        } catch (IOException e8) {
            if (socketCreateSocket != null) {
                AbstractC5757S.m25667e(socketCreateSocket);
            }
            throw C0554l0.f2113t.m2462q("Failed trying to connect with proxy").m2461p(e8).m2454c();
        }
    }

    /* JADX INFO: renamed from: Y */
    private Throwable m3311Y() {
        synchronized (this.f2798k) {
            try {
                C0554l0 c0554l0 = this.f2809v;
                if (c0554l0 != null) {
                    return c0554l0.m2454c();
                }
                return C0554l0.f2113t.m2462q("Connection closed").m2454c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    private void m3312a0() {
        synchronized (this.f2798k) {
            this.f2782P.m25740g(new b());
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m3313d0(C0694h c0694h) {
        if (this.f2813z && this.f2772F.isEmpty() && this.f2801n.isEmpty()) {
            this.f2813z = false;
            C5777d0 c5777d0 = this.f2774H;
            if (c5777d0 != null) {
                c5777d0.m25902o();
            }
        }
        if (c0694h.m25828y()) {
            this.f2783Q.m25761e(c0694h, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public void m3314f0(EnumC0845a enumC0845a, String str) {
        m3320k0(0, enumC0845a, m3329p0(enumC0845a).m2456e(str));
    }

    /* JADX INFO: renamed from: g0 */
    private static String m3315g0(InterfaceC0640B interfaceC0640B) throws EOFException {
        C0648e c0648e = new C0648e();
        while (interfaceC0640B.mo2949w(c0648e, 1L) != -1) {
            if (c0648e.m3060p0(c0648e.m3046h1() - 1) == 10) {
                return c0648e.mo3056n0();
            }
        }
        throw new EOFException("\\n not found: " + c0648e.m3034a1().mo3104q());
    }

    /* JADX INFO: renamed from: i0 */
    private void m3316i0() {
        synchronized (this.f2798k) {
            try {
                this.f2796i.mo3222H();
                C0853i c0853i = new C0853i();
                AbstractC0700n.m3401c(c0853i, 7, this.f2793f);
                this.f2796i.mo3225h0(c0853i);
                int i7 = this.f2793f;
                if (i7 > 65535) {
                    this.f2796i.mo3224a(0, i7 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    private void m3318j0(C0694h c0694h) {
        if (!this.f2813z) {
            this.f2813z = true;
            C5777d0 c5777d0 = this.f2774H;
            if (c5777d0 != null) {
                c5777d0.m25901n();
            }
        }
        if (c0694h.m25828y()) {
            this.f2783Q.m25761e(c0694h, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public void m3320k0(int i7, EnumC0845a enumC0845a, C0554l0 c0554l0) {
        synchronized (this.f2798k) {
            try {
                if (this.f2809v == null) {
                    this.f2809v = c0554l0;
                    this.f2795h.mo25823e(c0554l0);
                }
                if (enumC0845a != null && !this.f2810w) {
                    this.f2810w = true;
                    this.f2796i.mo3223Z(0, enumC0845a, new byte[0]);
                }
                Iterator it = this.f2801n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i7) {
                        it.remove();
                        ((C0694h) entry.getValue()).mo3264l().m25843M(c0554l0, InterfaceC5806s.a.REFUSED, false, new C0530Z());
                        m3313d0((C0694h) entry.getValue());
                    }
                }
                for (C0694h c0694h : this.f2772F) {
                    c0694h.mo3264l().m25843M(c0554l0, InterfaceC5806s.a.MISCARRIED, true, new C0530Z());
                    m3313d0(c0694h);
                }
                this.f2772F.clear();
                m3326n0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public boolean m3322l0() {
        boolean z7 = false;
        while (!this.f2772F.isEmpty() && this.f2801n.size() < this.f2771E) {
            m3324m0((C0694h) this.f2772F.poll());
            z7 = true;
        }
        return z7;
    }

    /* JADX INFO: renamed from: m0 */
    private void m3324m0(C0694h c0694h) {
        AbstractC1209m.m5309u(c0694h.mo3264l().m3282c0() == -1, "StreamId already assigned");
        this.f2801n.put(Integer.valueOf(this.f2800m), c0694h);
        m3318j0(c0694h);
        c0694h.mo3264l().m3286f0(this.f2800m);
        if ((c0694h.m3260M() != C0532a0.d.UNARY && c0694h.m3260M() != C0532a0.d.SERVER_STREAMING) || c0694h.m3262O()) {
            this.f2796i.flush();
        }
        int i7 = this.f2800m;
        if (i7 < 2147483645) {
            this.f2800m = i7 + 2;
        } else {
            this.f2800m = C3553a.e.API_PRIORITY_OTHER;
            m3320k0(C3553a.e.API_PRIORITY_OTHER, EnumC0845a.NO_ERROR, C0554l0.f2113t.m2462q("Stream ids exhausted"));
        }
    }

    /* JADX INFO: renamed from: n0 */
    private void m3326n0() {
        if (this.f2809v == null || !this.f2801n.isEmpty() || !this.f2772F.isEmpty() || this.f2812y) {
            return;
        }
        this.f2812y = true;
        C5777d0 c5777d0 = this.f2774H;
        if (c5777d0 != null) {
            c5777d0.m25904q();
        }
        C5765W c5765w = this.f2811x;
        if (c5765w != null) {
            c5765w.m25757f(m3311Y());
            this.f2811x = null;
        }
        if (!this.f2810w) {
            this.f2810w = true;
            this.f2796i.mo3223Z(0, EnumC0845a.NO_ERROR, new byte[0]);
        }
        this.f2796i.close();
    }

    /* JADX INFO: renamed from: p0 */
    static C0554l0 m3329p0(EnumC0845a enumC0845a) {
        C0554l0 c0554l0 = (C0554l0) f2765V.get(enumC0845a);
        if (c0554l0 != null) {
            return c0554l0;
        }
        return C0554l0.f2100g.m2462q("Unknown http2 error code: " + enumC0845a.f3344a);
    }

    /* JADX INFO: renamed from: U */
    void m3340U(boolean z7, long j7, long j8, boolean z8) {
        this.f2775I = z7;
        this.f2776J = j7;
        this.f2777K = j8;
        this.f2778L = z8;
    }

    /* JADX INFO: renamed from: V */
    void m3341V(int i7, C0554l0 c0554l0, InterfaceC5806s.a aVar, boolean z7, EnumC0845a enumC0845a, C0530Z c0530z) {
        synchronized (this.f2798k) {
            try {
                C0694h c0694h = (C0694h) this.f2801n.remove(Integer.valueOf(i7));
                if (c0694h != null) {
                    if (enumC0845a != null) {
                        this.f2796i.mo3218k(i7, EnumC0845a.CANCEL);
                    }
                    if (c0554l0 != null) {
                        C0694h.b bVarM3261N = c0694h.mo3264l();
                        if (c0530z == null) {
                            c0530z = new C0530Z();
                        }
                        bVarM3261N.m25843M(c0554l0, aVar, z7, c0530z);
                    }
                    if (!m3322l0()) {
                        m3326n0();
                        m3313d0(c0694h);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: W */
    String m3342W() {
        URI uriM25664b = AbstractC5757S.m25664b(this.f2789b);
        return uriM25664b.getHost() != null ? uriM25664b.getHost() : this.f2789b;
    }

    /* JADX INFO: renamed from: X */
    int m3343X() {
        URI uriM25664b = AbstractC5757S.m25664b(this.f2789b);
        return uriM25664b.getPort() != -1 ? uriM25664b.getPort() : this.f2788a.getPort();
    }

    /* JADX INFO: renamed from: Z */
    C0694h m3344Z(int i7) {
        C0694h c0694h;
        synchronized (this.f2798k) {
            c0694h = (C0694h) this.f2801n.get(Integer.valueOf(i7));
        }
        return c0694h;
    }

    @Override // p079J5.C0704r.d
    /* JADX INFO: renamed from: a */
    public C0704r.c[] mo3345a() {
        C0704r.c[] cVarArr;
        synchronized (this.f2798k) {
            try {
                cVarArr = new C0704r.c[this.f2801n.size()];
                Iterator it = this.f2801n.values().iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    cVarArr[i7] = ((C0694h) it.next()).mo3264l().m3280b0();
                    i7++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarArr;
    }

    @Override // io.grpc.internal.InterfaceC5814w
    /* JADX INFO: renamed from: b */
    public C0531a mo3346b() {
        return this.f2808u;
    }

    /* JADX INFO: renamed from: b0 */
    boolean m3347b0() {
        return this.f2768B == null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000c  */
    /* JADX INFO: renamed from: c0 */
    boolean m3349c0(int i7) {
        boolean z7;
        synchronized (this.f2798k) {
            if (i7 < this.f2800m) {
                z7 = true;
                if ((i7 & 1) != 1) {
                    z7 = false;
                }
            } else {
                z7 = false;
            }
        }
        return z7;
    }

    @Override // io.grpc.internal.InterfaceC5793l0
    /* JADX INFO: renamed from: d */
    public void mo3350d(C0554l0 c0554l0) {
        mo3353h(c0554l0);
        synchronized (this.f2798k) {
            try {
                Iterator it = this.f2801n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((C0694h) entry.getValue()).mo3264l().m25844N(c0554l0, false, new C0530Z());
                    m3313d0((C0694h) entry.getValue());
                }
                for (C0694h c0694h : this.f2772F) {
                    c0694h.mo3264l().m25843M(c0554l0, InterfaceC5806s.a.MISCARRIED, true, new C0530Z());
                    m3313d0(c0694h);
                }
                this.f2772F.clear();
                m3326n0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC5793l0
    /* JADX INFO: renamed from: e */
    public Runnable mo3351e(InterfaceC5793l0.a aVar) {
        this.f2795h = (InterfaceC5793l0.a) AbstractC1209m.m5303o(aVar, "listener");
        if (this.f2775I) {
            C5777d0 c5777d0 = new C5777d0(new C5777d0.c(this), this.f2804q, this.f2776J, this.f2777K, this.f2778L);
            this.f2774H = c5777d0;
            c5777d0.m25903p();
        }
        C0687a c0687aM3203K0 = C0687a.m3203K0(this.f2803p, this, 10000);
        InterfaceC0847c interfaceC0847cM3214w0 = c0687aM3203K0.m3214w0(this.f2794g.mo3932a(AbstractC0659p.m3131c(c0687aM3203K0), true));
        synchronized (this.f2798k) {
            C0688b c0688b = new C0688b(this, interfaceC0847cM3214w0);
            this.f2796i = c0688b;
            this.f2797j = new C0704r(this, c0688b);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f2803p.execute(new c(countDownLatch, c0687aM3203K0));
        try {
            m3316i0();
            countDownLatch.countDown();
            this.f2803p.execute(new d());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // io.grpc.internal.InterfaceC5808t
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C0694h mo3348c(C0532a0 c0532a0, C0530Z c0530z, C0535c c0535c, AbstractC0551k[] abstractC0551kArr) {
        C0694h c0694h;
        AbstractC1209m.m5303o(c0532a0, "method");
        AbstractC1209m.m5303o(c0530z, "headers");
        C5751O0 c5751o0M25646h = C5751O0.m25646h(abstractC0551kArr, mo3346b(), c0530z);
        synchronized (this.f2798k) {
            c0694h = new C0694h(c0532a0, c0530z, this.f2796i, this, this.f2797j, this.f2798k, this.f2805r, this.f2793f, this.f2789b, this.f2790c, c5751o0M25646h, this.f2782P, c0535c, this.f2781O);
        }
        return c0694h;
    }

    @Override // p079J5.C0688b.a
    /* JADX INFO: renamed from: f */
    public void mo3227f(Throwable th) {
        AbstractC1209m.m5303o(th, "failureCause");
        m3320k0(0, EnumC0845a.INTERNAL_ERROR, C0554l0.f2113t.m2461p(th));
    }

    @Override // p063H5.InterfaceC0521P
    /* JADX INFO: renamed from: g */
    public C0516K mo2172g() {
        return this.f2799l;
    }

    @Override // io.grpc.internal.InterfaceC5793l0
    /* JADX INFO: renamed from: h */
    public void mo3353h(C0554l0 c0554l0) {
        synchronized (this.f2798k) {
            try {
                if (this.f2809v != null) {
                    return;
                }
                this.f2809v = c0554l0;
                this.f2795h.mo25823e(c0554l0);
                m3326n0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    void m3354h0(C0694h c0694h) {
        this.f2772F.remove(c0694h);
        m3313d0(c0694h);
    }

    @Override // io.grpc.internal.InterfaceC5808t
    /* JADX INFO: renamed from: i */
    public void mo3355i(InterfaceC5808t.a aVar, Executor executor) {
        long jNextLong;
        synchronized (this.f2798k) {
            try {
                boolean z7 = true;
                AbstractC1209m.m5308t(this.f2796i != null);
                if (this.f2812y) {
                    C5765W.m25754g(aVar, executor, m3311Y());
                    return;
                }
                C5765W c5765w = this.f2811x;
                if (c5765w != null) {
                    jNextLong = 0;
                    z7 = false;
                } else {
                    jNextLong = this.f2791d.nextLong();
                    C1212p c1212p = (C1212p) this.f2792e.get();
                    c1212p.m5322g();
                    C5765W c5765w2 = new C5765W(jNextLong, c1212p);
                    this.f2811x = c5765w2;
                    this.f2782P.m25735b();
                    c5765w = c5765w2;
                }
                if (z7) {
                    this.f2796i.mo3217b(false, (int) (jNextLong >>> 32), (int) jNextLong);
                }
                c5765w.m25755a(aVar, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    void m3356o0(C0694h c0694h) {
        if (this.f2809v != null) {
            c0694h.mo3264l().m25843M(this.f2809v, InterfaceC5806s.a.MISCARRIED, true, new C0530Z());
        } else if (this.f2801n.size() < this.f2771E) {
            m3324m0(c0694h);
        } else {
            this.f2772F.add(c0694h);
            m3318j0(c0694h);
        }
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5276c("logId", this.f2799l.m2164d()).m5277d("address", this.f2788a).toString();
    }

    private C0695i(C0692f.f fVar, InetSocketAddress inetSocketAddress, String str, String str2, C0531a c0531a, InterfaceC1214r interfaceC1214r, InterfaceC0854j interfaceC0854j, C0509D c0509d, Runnable runnable) {
        this.f2791d = new Random();
        this.f2798k = new Object();
        this.f2801n = new HashMap();
        this.f2771E = 0;
        this.f2772F = new LinkedList();
        this.f2783Q = new a();
        this.f2786T = 30000;
        this.f2788a = (InetSocketAddress) AbstractC1209m.m5303o(inetSocketAddress, "address");
        this.f2789b = str;
        this.f2805r = fVar.f2730u;
        this.f2793f = fVar.f2735z;
        this.f2802o = (Executor) AbstractC1209m.m5303o(fVar.f2722b, "executor");
        this.f2803p = new ExecutorC5741J0(fVar.f2722b);
        this.f2804q = (ScheduledExecutorService) AbstractC1209m.m5303o(fVar.f2724d, "scheduledExecutorService");
        this.f2800m = 3;
        SocketFactory socketFactory = fVar.f2726f;
        this.f2767A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.f2768B = fVar.f2727r;
        this.f2769C = fVar.f2728s;
        this.f2773G = (C0753b) AbstractC1209m.m5303o(fVar.f2729t, "connectionSpec");
        this.f2792e = (InterfaceC1214r) AbstractC1209m.m5303o(interfaceC1214r, "stopwatchFactory");
        this.f2794g = (InterfaceC0854j) AbstractC1209m.m5303o(interfaceC0854j, "variant");
        this.f2790c = AbstractC5757S.m25670h("okhttp", str2);
        this.f2785S = c0509d;
        this.f2779M = (Runnable) AbstractC1209m.m5303o(runnable, "tooManyPingsRunnable");
        this.f2780N = fVar.f2718B;
        this.f2782P = fVar.f2725e.m25741a();
        this.f2799l = C0516K.m2160a(getClass(), inetSocketAddress.toString());
        this.f2808u = C0531a.m2312c().m2318d(AbstractC5754Q.f22223b, c0531a).m2316a();
        this.f2781O = fVar.f2719C;
        m3312a0();
    }
}

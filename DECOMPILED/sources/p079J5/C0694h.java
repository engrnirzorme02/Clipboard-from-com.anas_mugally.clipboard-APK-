package p079J5;

import io.grpc.internal.AbstractC5763V;
import io.grpc.internal.AbstractC5770a;
import io.grpc.internal.C5751O0;
import io.grpc.internal.C5762U0;
import io.grpc.internal.InterfaceC5764V0;
import io.grpc.internal.InterfaceC5806s;
import java.io.EOFException;
import java.util.List;
import p063H5.C0530Z;
import p063H5.C0531a;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.C0554l0;
import p072I6.C0648e;
import p095L5.EnumC0845a;
import p122P3.AbstractC1209m;
import p131Q5.AbstractC1291c;
import p131Q5.C1292d;
import p131Q5.C1293e;
import p136R3.AbstractC1331a;

/* JADX INFO: renamed from: J5.h */
/* JADX INFO: loaded from: classes.dex */
class C0694h extends AbstractC5770a {

    /* JADX INFO: renamed from: p */
    private static final C0648e f2738p = new C0648e();

    /* JADX INFO: renamed from: h */
    private final C0532a0 f2739h;

    /* JADX INFO: renamed from: i */
    private final String f2740i;

    /* JADX INFO: renamed from: j */
    private final C5751O0 f2741j;

    /* JADX INFO: renamed from: k */
    private String f2742k;

    /* JADX INFO: renamed from: l */
    private final b f2743l;

    /* JADX INFO: renamed from: m */
    private final a f2744m;

    /* JADX INFO: renamed from: n */
    private final C0531a f2745n;

    /* JADX INFO: renamed from: o */
    private boolean f2746o;

    /* JADX INFO: renamed from: J5.h$a */
    class a implements AbstractC5770a.b {
        a() {
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0026 */
        @Override // io.grpc.internal.AbstractC5770a.b
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo3268a(C0554l0 c0554l0) {
            C1293e c1293eM5632h = AbstractC1291c.m5632h("OkHttpClientStream$Sink.cancel");
            synchronized (C0694h.this.f2743l.f2764z) {
                try {
                    C0694h.this.f2743l.m3275a0(c0554l0, true, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c1293eM5632h != null) {
                c1293eM5632h.close();
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x000d */
        @Override // io.grpc.internal.AbstractC5770a.b
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo3269b(InterfaceC5764V0 interfaceC5764V0, boolean z7, boolean z8, int i7) {
            C0648e c0648eM3406c;
            C1293e c1293eM5632h = AbstractC1291c.m5632h("OkHttpClientStream$Sink.writeFrame");
            if (interfaceC5764V0 == null) {
                c0648eM3406c = C0694h.f2738p;
            } else {
                c0648eM3406c = ((C0702p) interfaceC5764V0).m3406c();
                int iM3046h1 = (int) c0648eM3406c.m3046h1();
                if (iM3046h1 > 0) {
                    C0694h.this.m25854k(iM3046h1);
                }
            }
            synchronized (C0694h.this.f2743l.f2764z) {
                try {
                    C0694h.this.f2743l.m3277e0(c0648eM3406c, z7, z8);
                    C0694h.this.m25827x().m25738e(i7);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c1293eM5632h != null) {
                c1293eM5632h.close();
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0046 */
        @Override // io.grpc.internal.AbstractC5770a.b
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo3270c(C0530Z c0530z, byte[] bArr) {
            C1293e c1293eM5632h = AbstractC1291c.m5632h("OkHttpClientStream$Sink.writeHeaders");
            String str = "/" + C0694h.this.f2739h.m2324c();
            if (bArr != null) {
                C0694h.this.f2746o = true;
                str = str + "?" + AbstractC1331a.m5692a().m5697e(bArr);
            }
            synchronized (C0694h.this.f2743l.f2764z) {
                try {
                    C0694h.this.f2743l.m3278g0(c0530z, str);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c1293eM5632h != null) {
                c1293eM5632h.close();
            }
        }
    }

    /* JADX INFO: renamed from: J5.h$b */
    class b extends AbstractC5763V implements C0704r.b {

        /* JADX INFO: renamed from: A */
        private List f2748A;

        /* JADX INFO: renamed from: B */
        private C0648e f2749B;

        /* JADX INFO: renamed from: C */
        private boolean f2750C;

        /* JADX INFO: renamed from: D */
        private boolean f2751D;

        /* JADX INFO: renamed from: E */
        private boolean f2752E;

        /* JADX INFO: renamed from: F */
        private int f2753F;

        /* JADX INFO: renamed from: G */
        private int f2754G;

        /* JADX INFO: renamed from: H */
        private final C0688b f2755H;

        /* JADX INFO: renamed from: I */
        private final C0704r f2756I;

        /* JADX INFO: renamed from: J */
        private final C0695i f2757J;

        /* JADX INFO: renamed from: K */
        private boolean f2758K;

        /* JADX INFO: renamed from: L */
        private final C1292d f2759L;

        /* JADX INFO: renamed from: M */
        private C0704r.c f2760M;

        /* JADX INFO: renamed from: N */
        private int f2761N;

        /* JADX INFO: renamed from: y */
        private final int f2763y;

        /* JADX INFO: renamed from: z */
        private final Object f2764z;

        public b(int i7, C5751O0 c5751o0, Object obj, C0688b c0688b, C0704r c0704r, C0695i c0695i, int i8, String str) {
            super(i7, c5751o0, C0694h.this.m25827x());
            this.f2749B = new C0648e();
            this.f2750C = false;
            this.f2751D = false;
            this.f2752E = false;
            this.f2758K = true;
            this.f2761N = -1;
            this.f2764z = AbstractC1209m.m5303o(obj, "lock");
            this.f2755H = c0688b;
            this.f2756I = c0704r;
            this.f2757J = c0695i;
            this.f2753F = i8;
            this.f2754G = i8;
            this.f2763y = i8;
            this.f2759L = AbstractC1291c.m5626b(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a0 */
        public void m3275a0(C0554l0 c0554l0, boolean z7, C0530Z c0530z) throws EOFException {
            if (this.f2752E) {
                return;
            }
            this.f2752E = true;
            if (!this.f2758K) {
                this.f2757J.m3341V(m3282c0(), c0554l0, InterfaceC5806s.a.PROCESSED, z7, EnumC0845a.CANCEL, c0530z);
                return;
            }
            this.f2757J.m3354h0(C0694h.this);
            this.f2748A = null;
            this.f2749B.m3076x();
            this.f2758K = false;
            if (c0530z == null) {
                c0530z = new C0530Z();
            }
            m25844N(c0554l0, true, c0530z);
        }

        /* JADX INFO: renamed from: d0 */
        private void m3276d0() {
            if (m25840G()) {
                this.f2757J.m3341V(m3282c0(), null, InterfaceC5806s.a.PROCESSED, false, null, null);
            } else {
                this.f2757J.m3341V(m3282c0(), null, InterfaceC5806s.a.PROCESSED, false, EnumC0845a.CANCEL, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e0 */
        public void m3277e0(C0648e c0648e, boolean z7, boolean z8) {
            if (this.f2752E) {
                return;
            }
            if (!this.f2758K) {
                AbstractC1209m.m5309u(m3282c0() != -1, "streamId should be set");
                this.f2756I.m3413d(z7, this.f2760M, c0648e, z8);
            } else {
                this.f2749B.mo3003I(c0648e, (int) c0648e.m3046h1());
                this.f2750C |= z7;
                this.f2751D |= z8;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g0 */
        public void m3278g0(C0530Z c0530z, String str) {
            this.f2748A = AbstractC0690d.m3229b(c0530z, str, C0694h.this.f2742k, C0694h.this.f2740i, C0694h.this.f2746o, this.f2757J.m3347b0());
            this.f2757J.m3356o0(C0694h.this);
        }

        @Override // io.grpc.internal.AbstractC5763V
        /* JADX INFO: renamed from: P */
        protected void mo3279P(C0554l0 c0554l0, boolean z7, C0530Z c0530z) throws EOFException {
            m3275a0(c0554l0, z7, c0530z);
        }

        /* JADX INFO: renamed from: b0 */
        C0704r.c m3280b0() {
            C0704r.c cVar;
            synchronized (this.f2764z) {
                cVar = this.f2760M;
            }
            return cVar;
        }

        @Override // io.grpc.internal.AbstractC5763V, io.grpc.internal.AbstractC5770a.c, io.grpc.internal.C5795m0.b
        /* JADX INFO: renamed from: c */
        public void mo3281c(boolean z7) {
            m3276d0();
            super.mo3281c(z7);
        }

        /* JADX INFO: renamed from: c0 */
        int m3282c0() {
            return this.f2761N;
        }

        @Override // io.grpc.internal.C5795m0.b
        /* JADX INFO: renamed from: d */
        public void mo3283d(int i7) {
            int i8 = this.f2754G - i7;
            this.f2754G = i8;
            float f7 = i8;
            int i9 = this.f2763y;
            if (f7 <= i9 * 0.5f) {
                int i10 = i9 - i8;
                this.f2753F += i10;
                this.f2754G = i8 + i10;
                this.f2755H.mo3224a(m3282c0(), i10);
            }
        }

        @Override // io.grpc.internal.C5795m0.b
        /* JADX INFO: renamed from: e */
        public void mo3284e(Throwable th) throws EOFException {
            mo3279P(C0554l0.m2453k(th), true, new C0530Z());
        }

        @Override // io.grpc.internal.C5780f.d
        /* JADX INFO: renamed from: f */
        public void mo3285f(Runnable runnable) {
            synchronized (this.f2764z) {
                runnable.run();
            }
        }

        /* JADX INFO: renamed from: f0 */
        public void m3286f0(int i7) {
            AbstractC1209m.m5310v(this.f2761N == -1, "the stream has been started with id %s", i7);
            this.f2761N = i7;
            this.f2760M = this.f2756I.m3412c(this, i7);
            C0694h.this.f2743l.mo3290r();
            if (this.f2758K) {
                this.f2755H.mo3221F0(C0694h.this.f2746o, false, this.f2761N, 0, this.f2748A);
                C0694h.this.f2741j.m25649c();
                this.f2748A = null;
                if (this.f2749B.m3046h1() > 0) {
                    this.f2756I.m3413d(this.f2750C, this.f2760M, this.f2749B, this.f2751D);
                }
                this.f2758K = false;
            }
        }

        /* JADX INFO: renamed from: h0 */
        C1292d m3287h0() {
            return this.f2759L;
        }

        /* JADX INFO: renamed from: i0 */
        public void m3288i0(C0648e c0648e, boolean z7, int i7) throws Throwable {
            int iM3046h1 = this.f2753F - (((int) c0648e.m3046h1()) + i7);
            this.f2753F = iM3046h1;
            this.f2754G -= i7;
            if (iM3046h1 >= 0) {
                super.m25746S(new C0698l(c0648e), z7);
            } else {
                this.f2755H.mo3218k(m3282c0(), EnumC0845a.FLOW_CONTROL_ERROR);
                this.f2757J.m3341V(m3282c0(), C0554l0.f2112s.m2462q("Received data size exceeded our receiving window size"), InterfaceC5806s.a.PROCESSED, false, null, null);
            }
        }

        /* JADX INFO: renamed from: j0 */
        public void m3289j0(List list, boolean z7) {
            if (z7) {
                m25748U(AbstractC0705s.m3435c(list));
            } else {
                m25747T(AbstractC0705s.m3433a(list));
            }
        }

        @Override // io.grpc.internal.AbstractC5774c.a
        /* JADX INFO: renamed from: r */
        protected void mo3290r() {
            super.mo3290r();
            m25866m().m25736c();
        }
    }

    C0694h(C0532a0 c0532a0, C0530Z c0530z, C0688b c0688b, C0695i c0695i, C0704r c0704r, Object obj, int i7, int i8, String str, String str2, C5751O0 c5751o0, C5762U0 c5762u0, C0535c c0535c, boolean z7) {
        super(new C0703q(), c5751o0, c5762u0, c0530z, c0535c, z7 && c0532a0.m2327f());
        this.f2744m = new a();
        this.f2746o = false;
        this.f2741j = (C5751O0) AbstractC1209m.m5303o(c5751o0, "statsTraceCtx");
        this.f2739h = c0532a0;
        this.f2742k = str;
        this.f2740i = str2;
        this.f2745n = c0695i.mo3346b();
        this.f2743l = new b(i7, c5751o0, obj, c0688b, c0704r, c0695i, i8, c0532a0.m2324c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.AbstractC5770a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a mo3266v() {
        return this.f2744m;
    }

    /* JADX INFO: renamed from: M */
    public C0532a0.d m3260M() {
        return this.f2739h.m2326e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.AbstractC5770a
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b mo3267z() {
        return this.f2743l;
    }

    /* JADX INFO: renamed from: O */
    boolean m3262O() {
        return this.f2746o;
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: b */
    public C0531a mo3263b() {
        return this.f2745n;
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: o */
    public void mo3265o(String str) {
        this.f2742k = (String) AbstractC1209m.m5303o(str, "authority");
    }
}

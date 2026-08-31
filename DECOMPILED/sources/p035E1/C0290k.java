package p035E1;

import android.util.Log;
import com.bumptech.glide.C3204d;
import com.bumptech.glide.EnumC3207g;
import java.util.Map;
import java.util.concurrent.Executor;
import p019C1.C0132h;
import p019C1.EnumC0125a;
import p019C1.InterfaceC0130f;
import p051G1.C0471b;
import p051G1.InterfaceC0470a;
import p051G1.InterfaceC0477h;
import p059H1.ExecutorServiceC0494a;
import p104N.InterfaceC0907d;
import p155U1.InterfaceC1664g;
import p183Y1.AbstractC2018g;
import p183Y1.AbstractC2022k;
import p190Z1.AbstractC2083a;

/* JADX INFO: renamed from: E1.k */
/* JADX INFO: loaded from: classes.dex */
public class C0290k implements InterfaceC0292m, InterfaceC0477h.a, C0295p.a {

    /* JADX INFO: renamed from: i */
    private static final boolean f1160i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a */
    private final C0298s f1161a;

    /* JADX INFO: renamed from: b */
    private final C0294o f1162b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0477h f1163c;

    /* JADX INFO: renamed from: d */
    private final b f1164d;

    /* JADX INFO: renamed from: e */
    private final C0304y f1165e;

    /* JADX INFO: renamed from: f */
    private final c f1166f;

    /* JADX INFO: renamed from: g */
    private final a f1167g;

    /* JADX INFO: renamed from: h */
    private final C0280a f1168h;

    /* JADX INFO: renamed from: E1.k$a */
    static class a {

        /* JADX INFO: renamed from: a */
        final RunnableC0287h.e f1169a;

        /* JADX INFO: renamed from: b */
        final InterfaceC0907d f1170b = AbstractC2083a.m8598d(150, new C7627a());

        /* JADX INFO: renamed from: c */
        private int f1171c;

        /* JADX INFO: renamed from: E1.k$a$a, reason: collision with other inner class name */
        class C7627a implements AbstractC2083a.d {
            C7627a() {
            }

            @Override // p190Z1.AbstractC2083a.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public RunnableC0287h mo1408a() {
                a aVar = a.this;
                return new RunnableC0287h(aVar.f1169a, aVar.f1170b);
            }
        }

        a(RunnableC0287h.e eVar) {
            this.f1169a = eVar;
        }

        /* JADX INFO: renamed from: a */
        RunnableC0287h m1407a(C3204d c3204d, Object obj, C0293n c0293n, InterfaceC0130f interfaceC0130f, int i7, int i8, Class cls, Class cls2, EnumC3207g enumC3207g, AbstractC0289j abstractC0289j, Map map, boolean z7, boolean z8, boolean z9, C0132h c0132h, RunnableC0287h.b bVar) {
            RunnableC0287h runnableC0287h = (RunnableC0287h) AbstractC2022k.m8408e((RunnableC0287h) this.f1170b.mo4131b());
            int i9 = this.f1171c;
            this.f1171c = i9 + 1;
            return runnableC0287h.m1371x(c3204d, obj, c0293n, interfaceC0130f, i7, i8, cls, cls2, enumC3207g, abstractC0289j, map, z7, z8, z9, c0132h, bVar, i9);
        }
    }

    /* JADX INFO: renamed from: E1.k$b */
    static class b {

        /* JADX INFO: renamed from: a */
        final ExecutorServiceC0494a f1173a;

        /* JADX INFO: renamed from: b */
        final ExecutorServiceC0494a f1174b;

        /* JADX INFO: renamed from: c */
        final ExecutorServiceC0494a f1175c;

        /* JADX INFO: renamed from: d */
        final ExecutorServiceC0494a f1176d;

        /* JADX INFO: renamed from: e */
        final InterfaceC0292m f1177e;

        /* JADX INFO: renamed from: f */
        final C0295p.a f1178f;

        /* JADX INFO: renamed from: g */
        final InterfaceC0907d f1179g = AbstractC2083a.m8598d(150, new a());

        /* JADX INFO: renamed from: E1.k$b$a */
        class a implements AbstractC2083a.d {
            a() {
            }

            @Override // p190Z1.AbstractC2083a.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0291l mo1408a() {
                b bVar = b.this;
                return new C0291l(bVar.f1173a, bVar.f1174b, bVar.f1175c, bVar.f1176d, bVar.f1177e, bVar.f1178f, bVar.f1179g);
            }
        }

        b(ExecutorServiceC0494a executorServiceC0494a, ExecutorServiceC0494a executorServiceC0494a2, ExecutorServiceC0494a executorServiceC0494a3, ExecutorServiceC0494a executorServiceC0494a4, InterfaceC0292m interfaceC0292m, C0295p.a aVar) {
            this.f1173a = executorServiceC0494a;
            this.f1174b = executorServiceC0494a2;
            this.f1175c = executorServiceC0494a3;
            this.f1176d = executorServiceC0494a4;
            this.f1177e = interfaceC0292m;
            this.f1178f = aVar;
        }

        /* JADX INFO: renamed from: a */
        C0291l m1410a(InterfaceC0130f interfaceC0130f, boolean z7, boolean z8, boolean z9, boolean z10) {
            return ((C0291l) AbstractC2022k.m8408e((C0291l) this.f1179g.mo4131b())).m1422l(interfaceC0130f, z7, z8, z9, z10);
        }
    }

    /* JADX INFO: renamed from: E1.k$c */
    private static class c implements RunnableC0287h.e {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0470a.a f1181a;

        /* JADX INFO: renamed from: b */
        private volatile InterfaceC0470a f1182b;

        c(InterfaceC0470a.a aVar) {
            this.f1181a = aVar;
        }

        @Override // p035E1.RunnableC0287h.e
        /* JADX INFO: renamed from: a */
        public InterfaceC0470a mo1380a() {
            if (this.f1182b == null) {
                synchronized (this) {
                    try {
                        if (this.f1182b == null) {
                            this.f1182b = this.f1181a.mo2033a();
                        }
                        if (this.f1182b == null) {
                            this.f1182b = new C0471b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f1182b;
        }
    }

    /* JADX INFO: renamed from: E1.k$d */
    public class d {

        /* JADX INFO: renamed from: a */
        private final C0291l f1183a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC1664g f1184b;

        d(InterfaceC1664g interfaceC1664g, C0291l c0291l) {
            this.f1184b = interfaceC1664g;
            this.f1183a = c0291l;
        }

        /* JADX INFO: renamed from: a */
        public void m1412a() {
            synchronized (C0290k.this) {
                this.f1183a.m1426r(this.f1184b);
            }
        }
    }

    public C0290k(InterfaceC0477h interfaceC0477h, InterfaceC0470a.a aVar, ExecutorServiceC0494a executorServiceC0494a, ExecutorServiceC0494a executorServiceC0494a2, ExecutorServiceC0494a executorServiceC0494a3, ExecutorServiceC0494a executorServiceC0494a4, boolean z7) {
        this(interfaceC0477h, aVar, executorServiceC0494a, executorServiceC0494a2, executorServiceC0494a3, executorServiceC0494a4, null, null, null, null, null, null, z7);
    }

    /* JADX INFO: renamed from: e */
    private C0295p m1395e(InterfaceC0130f interfaceC0130f) {
        InterfaceC0301v interfaceC0301vMo2042c = this.f1163c.mo2042c(interfaceC0130f);
        if (interfaceC0301vMo2042c == null) {
            return null;
        }
        return interfaceC0301vMo2042c instanceof C0295p ? (C0295p) interfaceC0301vMo2042c : new C0295p(interfaceC0301vMo2042c, true, true, interfaceC0130f, this);
    }

    /* JADX INFO: renamed from: g */
    private C0295p m1396g(InterfaceC0130f interfaceC0130f) {
        C0295p c0295pM1308e = this.f1168h.m1308e(interfaceC0130f);
        if (c0295pM1308e != null) {
            c0295pM1308e.m1435a();
        }
        return c0295pM1308e;
    }

    /* JADX INFO: renamed from: h */
    private C0295p m1397h(InterfaceC0130f interfaceC0130f) {
        C0295p c0295pM1395e = m1395e(interfaceC0130f);
        if (c0295pM1395e != null) {
            c0295pM1395e.m1435a();
            this.f1168h.m1304a(interfaceC0130f, c0295pM1395e);
        }
        return c0295pM1395e;
    }

    /* JADX INFO: renamed from: i */
    private C0295p m1398i(C0293n c0293n, boolean z7, long j7) {
        if (!z7) {
            return null;
        }
        C0295p c0295pM1396g = m1396g(c0293n);
        if (c0295pM1396g != null) {
            if (f1160i) {
                m1399j("Loaded resource from active resources", j7, c0293n);
            }
            return c0295pM1396g;
        }
        C0295p c0295pM1397h = m1397h(c0293n);
        if (c0295pM1397h == null) {
            return null;
        }
        if (f1160i) {
            m1399j("Loaded resource from cache", j7, c0293n);
        }
        return c0295pM1397h;
    }

    /* JADX INFO: renamed from: j */
    private static void m1399j(String str, long j7, InterfaceC0130f interfaceC0130f) {
        Log.v("Engine", str + " in " + AbstractC2018g.m8392a(j7) + "ms, key: " + interfaceC0130f);
    }

    /* JADX INFO: renamed from: l */
    private d m1400l(C3204d c3204d, Object obj, InterfaceC0130f interfaceC0130f, int i7, int i8, Class cls, Class cls2, EnumC3207g enumC3207g, AbstractC0289j abstractC0289j, Map map, boolean z7, boolean z8, C0132h c0132h, boolean z9, boolean z10, boolean z11, boolean z12, InterfaceC1664g interfaceC1664g, Executor executor, C0293n c0293n, long j7) {
        C0291l c0291lM1456a = this.f1161a.m1456a(c0293n, z12);
        if (c0291lM1456a != null) {
            c0291lM1456a.m1416b(interfaceC1664g, executor);
            if (f1160i) {
                m1399j("Added to existing load", j7, c0293n);
            }
            return new d(interfaceC1664g, c0291lM1456a);
        }
        C0291l c0291lM1410a = this.f1164d.m1410a(c0293n, z9, z10, z11, z12);
        RunnableC0287h runnableC0287hM1407a = this.f1167g.m1407a(c3204d, obj, c0293n, interfaceC0130f, i7, i8, cls, cls2, enumC3207g, abstractC0289j, map, z7, z8, z12, c0132h, c0291lM1410a);
        this.f1161a.m1457c(c0293n, c0291lM1410a);
        c0291lM1410a.m1416b(interfaceC1664g, executor);
        c0291lM1410a.m1427s(runnableC0287hM1407a);
        if (f1160i) {
            m1399j("Started new load", j7, c0293n);
        }
        return new d(interfaceC1664g, c0291lM1410a);
    }

    @Override // p035E1.C0295p.a
    /* JADX INFO: renamed from: a */
    public void mo1401a(InterfaceC0130f interfaceC0130f, C0295p c0295p) {
        this.f1168h.m1307d(interfaceC0130f);
        if (c0295p.m1440f()) {
            this.f1163c.mo2043d(interfaceC0130f, c0295p);
        } else {
            this.f1165e.m1468a(c0295p, false);
        }
    }

    @Override // p051G1.InterfaceC0477h.a
    /* JADX INFO: renamed from: b */
    public void mo1402b(InterfaceC0301v interfaceC0301v) {
        this.f1165e.m1468a(interfaceC0301v, true);
    }

    @Override // p035E1.InterfaceC0292m
    /* JADX INFO: renamed from: c */
    public synchronized void mo1403c(C0291l c0291l, InterfaceC0130f interfaceC0130f) {
        this.f1161a.m1458d(interfaceC0130f, c0291l);
    }

    @Override // p035E1.InterfaceC0292m
    /* JADX INFO: renamed from: d */
    public synchronized void mo1404d(C0291l c0291l, InterfaceC0130f interfaceC0130f, C0295p c0295p) {
        if (c0295p != null) {
            try {
                if (c0295p.m1440f()) {
                    this.f1168h.m1304a(interfaceC0130f, c0295p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1161a.m1458d(interfaceC0130f, c0291l);
    }

    /* JADX INFO: renamed from: f */
    public d m1405f(C3204d c3204d, Object obj, InterfaceC0130f interfaceC0130f, int i7, int i8, Class cls, Class cls2, EnumC3207g enumC3207g, AbstractC0289j abstractC0289j, Map map, boolean z7, boolean z8, C0132h c0132h, boolean z9, boolean z10, boolean z11, boolean z12, InterfaceC1664g interfaceC1664g, Executor executor) {
        long jM8393b = f1160i ? AbstractC2018g.m8393b() : 0L;
        C0293n c0293nM1434a = this.f1162b.m1434a(obj, interfaceC0130f, i7, i8, map, cls, cls2, c0132h);
        synchronized (this) {
            try {
                C0295p c0295pM1398i = m1398i(c0293nM1434a, z9, jM8393b);
                if (c0295pM1398i == null) {
                    return m1400l(c3204d, obj, interfaceC0130f, i7, i8, cls, cls2, enumC3207g, abstractC0289j, map, z7, z8, c0132h, z9, z10, z11, z12, interfaceC1664g, executor, c0293nM1434a, jM8393b);
                }
                interfaceC1664g.mo7001a(c0295pM1398i, EnumC0125a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m1406k(InterfaceC0301v interfaceC0301v) {
        if (!(interfaceC0301v instanceof C0295p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C0295p) interfaceC0301v).m1441g();
    }

    C0290k(InterfaceC0477h interfaceC0477h, InterfaceC0470a.a aVar, ExecutorServiceC0494a executorServiceC0494a, ExecutorServiceC0494a executorServiceC0494a2, ExecutorServiceC0494a executorServiceC0494a3, ExecutorServiceC0494a executorServiceC0494a4, C0298s c0298s, C0294o c0294o, C0280a c0280a, b bVar, a aVar2, C0304y c0304y, boolean z7) {
        this.f1163c = interfaceC0477h;
        c cVar = new c(aVar);
        this.f1166f = cVar;
        C0280a c0280a2 = c0280a == null ? new C0280a(z7) : c0280a;
        this.f1168h = c0280a2;
        c0280a2.m1309f(this);
        this.f1162b = c0294o == null ? new C0294o() : c0294o;
        this.f1161a = c0298s == null ? new C0298s() : c0298s;
        this.f1164d = bVar == null ? new b(executorServiceC0494a, executorServiceC0494a2, executorServiceC0494a3, executorServiceC0494a4, this, this) : bVar;
        this.f1167g = aVar2 == null ? new a(cVar) : aVar2;
        this.f1165e = c0304y == null ? new C0304y() : c0304y;
        interfaceC0477h.mo2044e(this);
    }
}

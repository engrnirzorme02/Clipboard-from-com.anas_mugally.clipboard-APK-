package p274j2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p198a2.C2187c;
import p216c2.AbstractC2993i;
import p216c2.AbstractC3000p;
import p216c2.C2992h;
import p226d2.AbstractC5217f;
import p226d2.AbstractC5218g;
import p226d2.InterfaceC5216e;
import p226d2.InterfaceC5224m;
import p242f2.C5429a;
import p242f2.C5431c;
import p250g2.AbstractC5459a;
import p282k2.AbstractC6002k;
import p282k2.InterfaceC5994c;
import p282k2.InterfaceC5995d;
import p290l2.C6293a;
import p290l2.InterfaceC6294b;
import p298m2.InterfaceC6328a;

/* JADX INFO: renamed from: j2.r */
/* JADX INFO: loaded from: classes.dex */
public class C5855r {

    /* JADX INFO: renamed from: a */
    private final Context f23008a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5216e f23009b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5995d f23010c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5861x f23011d;

    /* JADX INFO: renamed from: e */
    private final Executor f23012e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC6294b f23013f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC6328a f23014g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC6328a f23015h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC5994c f23016i;

    public C5855r(Context context, InterfaceC5216e interfaceC5216e, InterfaceC5995d interfaceC5995d, InterfaceC5861x interfaceC5861x, Executor executor, InterfaceC6294b interfaceC6294b, InterfaceC6328a interfaceC6328a, InterfaceC6328a interfaceC6328a2, InterfaceC5994c interfaceC5994c) {
        this.f23008a = context;
        this.f23009b = interfaceC5216e;
        this.f23010c = interfaceC5995d;
        this.f23011d = interfaceC5861x;
        this.f23012e = executor;
        this.f23013f = interfaceC6294b;
        this.f23014g = interfaceC6328a;
        this.f23015h = interfaceC6328a2;
        this.f23016i = interfaceC5994c;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m26255b(C5855r c5855r, Iterable iterable, AbstractC3000p abstractC3000p, long j7) {
        c5855r.f23010c.mo26975C0(iterable);
        c5855r.f23010c.mo26974C(abstractC3000p, c5855r.f23014g.mo27283a() + j7);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m26256c(C5855r c5855r) {
        c5855r.f23016i.mo26981d();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m26258e(C5855r c5855r, Iterable iterable) {
        c5855r.f23010c.mo26987p(iterable);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m26259f(C5855r c5855r, AbstractC3000p abstractC3000p, int i7) {
        c5855r.f23011d.mo26239a(abstractC3000p, i7 + 1);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m26260g(C5855r c5855r, AbstractC3000p abstractC3000p, long j7) {
        c5855r.f23010c.mo26974C(abstractC3000p, c5855r.f23014g.mo27283a() + j7);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m26261h(C5855r c5855r, Map map) {
        c5855r.getClass();
        for (Map.Entry entry : map.entrySet()) {
            c5855r.f23016i.mo26989x(((Integer) entry.getValue()).intValue(), C5431c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m26262i(final C5855r c5855r, final AbstractC3000p abstractC3000p, final int i7, Runnable runnable) {
        c5855r.getClass();
        try {
            InterfaceC6294b interfaceC6294b = c5855r.f23013f;
            final InterfaceC5995d interfaceC5995d = c5855r.f23010c;
            Objects.requireNonNull(interfaceC5995d);
            interfaceC6294b.mo26984m(new InterfaceC6294b.a() { // from class: j2.i
                @Override // p290l2.InterfaceC6294b.a
                /* JADX INFO: renamed from: n */
                public final Object mo25235n() {
                    return Integer.valueOf(interfaceC5995d.mo26986o());
                }
            });
            if (c5855r.m26264k()) {
                c5855r.m26265l(abstractC3000p, i7);
            } else {
                c5855r.f23013f.mo26984m(new InterfaceC6294b.a() { // from class: j2.j
                    @Override // p290l2.InterfaceC6294b.a
                    /* JADX INFO: renamed from: n */
                    public final Object mo25235n() {
                        return C5855r.m26259f(this.f22989a, abstractC3000p, i7);
                    }
                });
            }
        } catch (C6293a unused) {
            c5855r.f23011d.mo26239a(abstractC3000p, i7 + 1);
        } finally {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public AbstractC2993i m26263j(InterfaceC5224m interfaceC5224m) {
        InterfaceC6294b interfaceC6294b = this.f23013f;
        final InterfaceC5994c interfaceC5994c = this.f23016i;
        Objects.requireNonNull(interfaceC5994c);
        return interfaceC5224m.mo17160a(AbstractC2993i.m14946a().mo14911i(this.f23014g.mo27283a()).mo14917o(this.f23015h.mo27283a()).mo14916n("GDT_CLIENT_METRICS").mo14910h(new C2992h(C2187c.m8925b("proto"), ((C5429a) interfaceC6294b.mo26984m(new InterfaceC6294b.a() { // from class: j2.h
            @Override // p290l2.InterfaceC6294b.a
            /* JADX INFO: renamed from: n */
            public final Object mo25235n() {
                return interfaceC5994c.mo26985n();
            }
        })).m24608f())).mo14906d());
    }

    /* JADX INFO: renamed from: k */
    boolean m26264k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f23008a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: l */
    public AbstractC5218g m26265l(final AbstractC3000p abstractC3000p, int i7) {
        AbstractC5218g abstractC5218gMo17161b;
        InterfaceC5224m interfaceC5224mMo24128a = this.f23009b.mo24128a(abstractC3000p.mo14929b());
        AbstractC5218g abstractC5218gM24132e = AbstractC5218g.m24132e(0L);
        final long j7 = 0;
        while (((Boolean) this.f23013f.mo26984m(new InterfaceC6294b.a() { // from class: j2.k
            @Override // p290l2.InterfaceC6294b.a
            /* JADX INFO: renamed from: n */
            public final Object mo25235n() {
                return Boolean.valueOf(this.f22992a.f23010c.mo26980P0(abstractC3000p));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f23013f.mo26984m(new InterfaceC6294b.a() { // from class: j2.l
                @Override // p290l2.InterfaceC6294b.a
                /* JADX INFO: renamed from: n */
                public final Object mo25235n() {
                    return this.f22994a.f23010c.mo26978K(abstractC3000p);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return abstractC5218gM24132e;
            }
            if (interfaceC5224mMo24128a == null) {
                AbstractC5459a.m24663a("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC3000p);
                abstractC5218gMo17161b = AbstractC5218g.m24130a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC6002k) it.next()).mo27018b());
                }
                if (abstractC3000p.m14965e()) {
                    arrayList.add(m26263j(interfaceC5224mMo24128a));
                }
                abstractC5218gMo17161b = interfaceC5224mMo24128a.mo17161b(AbstractC5217f.m24129a().mo24120b(arrayList).mo24121c(abstractC3000p.mo14930c()).mo24119a());
            }
            abstractC5218gM24132e = abstractC5218gMo17161b;
            if (abstractC5218gM24132e.mo24123c() == AbstractC5218g.a.TRANSIENT_ERROR) {
                final AbstractC3000p abstractC3000p2 = abstractC3000p;
                this.f23013f.mo26984m(new InterfaceC6294b.a() { // from class: j2.m
                    @Override // p290l2.InterfaceC6294b.a
                    /* JADX INFO: renamed from: n */
                    public final Object mo25235n() {
                        return C5855r.m26255b(this.f22996a, iterable, abstractC3000p2, j7);
                    }
                });
                this.f23011d.mo26240b(abstractC3000p2, i7 + 1, true);
                return abstractC5218gM24132e;
            }
            AbstractC3000p abstractC3000p3 = abstractC3000p;
            this.f23013f.mo26984m(new InterfaceC6294b.a() { // from class: j2.n
                @Override // p290l2.InterfaceC6294b.a
                /* JADX INFO: renamed from: n */
                public final Object mo25235n() {
                    return C5855r.m26258e(this.f23000a, iterable);
                }
            });
            if (abstractC5218gM24132e.mo24123c() == AbstractC5218g.a.OK) {
                long jMax = Math.max(j7, abstractC5218gM24132e.mo24122b());
                if (abstractC3000p3.m14965e()) {
                    this.f23013f.mo26984m(new InterfaceC6294b.a() { // from class: j2.o
                        @Override // p290l2.InterfaceC6294b.a
                        /* JADX INFO: renamed from: n */
                        public final Object mo25235n() {
                            return C5855r.m26256c(this.f23002a);
                        }
                    });
                }
                j7 = jMax;
            } else if (abstractC5218gM24132e.mo24123c() == AbstractC5218g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strMo14904n = ((AbstractC6002k) it2.next()).mo27018b().mo14904n();
                    if (map.containsKey(strMo14904n)) {
                        map.put(strMo14904n, Integer.valueOf(((Integer) map.get(strMo14904n)).intValue() + 1));
                    } else {
                        map.put(strMo14904n, 1);
                    }
                }
                this.f23013f.mo26984m(new InterfaceC6294b.a() { // from class: j2.p
                    @Override // p290l2.InterfaceC6294b.a
                    /* JADX INFO: renamed from: n */
                    public final Object mo25235n() {
                        return C5855r.m26261h(this.f23003a, map);
                    }
                });
            }
            abstractC3000p = abstractC3000p3;
        }
        final AbstractC3000p abstractC3000p4 = abstractC3000p;
        this.f23013f.mo26984m(new InterfaceC6294b.a() { // from class: j2.q
            @Override // p290l2.InterfaceC6294b.a
            /* JADX INFO: renamed from: n */
            public final Object mo25235n() {
                return C5855r.m26260g(this.f23005a, abstractC3000p4, j7);
            }
        });
        return abstractC5218gM24132e;
    }

    /* JADX INFO: renamed from: m */
    public void m26266m(final AbstractC3000p abstractC3000p, final int i7, final Runnable runnable) {
        this.f23012e.execute(new Runnable() { // from class: j2.g
            @Override // java.lang.Runnable
            public final void run() {
                C5855r.m26262i(this.f22983a, abstractC3000p, i7, runnable);
            }
        });
    }
}

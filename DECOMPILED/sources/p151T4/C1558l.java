package p151T4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p122P3.InterfaceC1214r;
import p158U4.AbstractC1692p;
import p158U4.InterfaceC1684h;
import p186Y4.AbstractC2049q;
import p186Y4.C2037e;
import p186Y4.InterfaceC2052t;

/* JADX INFO: renamed from: T4.l */
/* JADX INFO: loaded from: classes.dex */
public class C1558l {

    /* JADX INFO: renamed from: f */
    private static final long f5252f = TimeUnit.SECONDS.toMillis(15);

    /* JADX INFO: renamed from: g */
    private static final long f5253g = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: a */
    private final a f5254a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1521Y f5255b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1214r f5256c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1214r f5257d;

    /* JADX INFO: renamed from: e */
    private int f5258e;

    /* JADX INFO: renamed from: T4.l$a */
    public class a implements InterfaceC1602z1 {

        /* JADX INFO: renamed from: a */
        private C2037e.b f5259a;

        /* JADX INFO: renamed from: b */
        private final C2037e f5260b;

        public a(C2037e c2037e) {
            this.f5260b = c2037e;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m6422a(a aVar) {
            AbstractC2049q.m8502a("IndexBackfiller", "Documents written: %s", Integer.valueOf(C1558l.this.m6420d()));
            aVar.m6423b(C1558l.f5253g);
        }

        /* JADX INFO: renamed from: b */
        private void m6423b(long j7) {
            this.f5259a = this.f5260b.m8470h(C2037e.d.INDEX_BACKFILL, j7, new Runnable() { // from class: T4.k
                @Override // java.lang.Runnable
                public final void run() {
                    C1558l.a.m6422a(this.f5246a);
                }
            });
        }

        @Override // p151T4.InterfaceC1602z1
        public void start() {
            m6423b(C1558l.f5252f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1558l(AbstractC1521Y abstractC1521Y, C2037e c2037e, final C1472A c1472a) {
        this(abstractC1521Y, c2037e, new InterfaceC1214r() { // from class: T4.h
            @Override // p122P3.InterfaceC1214r
            public final Object get() {
                return c1472a.m6159q();
            }
        }, new InterfaceC1214r() { // from class: T4.i
            @Override // p122P3.InterfaceC1214r
            public final Object get() {
                return c1472a.m6162u();
            }
        });
        Objects.requireNonNull(c1472a);
    }

    /* JADX INFO: renamed from: e */
    private AbstractC1692p.a m6417e(AbstractC1692p.a aVar, C1564n c1564n) {
        Iterator it = c1564n.m6427c().iterator();
        AbstractC1692p.a aVar2 = aVar;
        while (it.hasNext()) {
            AbstractC1692p.a aVarM7111k = AbstractC1692p.a.m7111k((InterfaceC1684h) ((Map.Entry) it.next()).getValue());
            if (aVarM7111k.compareTo(aVar2) > 0) {
                aVar2 = aVarM7111k;
            }
        }
        return AbstractC1692p.a.m7109h(aVar2.mo7047o(), aVar2.mo7045m(), Math.max(c1564n.m6426b(), aVar.mo7046n()));
    }

    /* JADX INFO: renamed from: g */
    private int m6418g(String str, int i7) {
        InterfaceC1561m interfaceC1561m = (InterfaceC1561m) this.f5256c.get();
        C1567o c1567o = (C1567o) this.f5257d.get();
        AbstractC1692p.a aVarMo6282i = interfaceC1561m.mo6282i(str);
        C1564n c1564nM6450k = c1567o.m6450k(str, aVarMo6282i, i7);
        interfaceC1561m.mo6275b(c1564nM6450k.m6427c());
        AbstractC1692p.a aVarM6417e = m6417e(aVarMo6282i, c1564nM6450k);
        AbstractC2049q.m8502a("IndexBackfiller", "Updating offset: %s", aVarM6417e);
        interfaceC1561m.mo6280g(str, aVarM6417e);
        return c1564nM6450k.m6427c().size();
    }

    /* JADX INFO: renamed from: h */
    private int m6419h() {
        InterfaceC1561m interfaceC1561m = (InterfaceC1561m) this.f5256c.get();
        HashSet hashSet = new HashSet();
        int iM6418g = this.f5258e;
        while (iM6418g > 0) {
            String strMo6276c = interfaceC1561m.mo6276c();
            if (strMo6276c == null || hashSet.contains(strMo6276c)) {
                break;
            }
            AbstractC2049q.m8502a("IndexBackfiller", "Processing collection: %s", strMo6276c);
            iM6418g -= m6418g(strMo6276c, iM6418g);
            hashSet.add(strMo6276c);
        }
        return this.f5258e - iM6418g;
    }

    /* JADX INFO: renamed from: d */
    public int m6420d() {
        return ((Integer) this.f5255b.mo6315k("Backfill Indexes", new InterfaceC2052t() { // from class: T4.j
            @Override // p186Y4.InterfaceC2052t
            public final Object get() {
                return Integer.valueOf(this.f5240a.m6419h());
            }
        })).intValue();
    }

    /* JADX INFO: renamed from: f */
    public a m6421f() {
        return this.f5254a;
    }

    public C1558l(AbstractC1521Y abstractC1521Y, C2037e c2037e, InterfaceC1214r interfaceC1214r, InterfaceC1214r interfaceC1214r2) {
        this.f5258e = 50;
        this.f5255b = abstractC1521Y;
        this.f5254a = new a(c2037e);
        this.f5256c = interfaceC1214r;
        this.f5257d = interfaceC1214r2;
    }
}

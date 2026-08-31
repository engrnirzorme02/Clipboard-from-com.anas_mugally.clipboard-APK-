package p137R4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p158U4.C1687k;
import p158U4.C1689m;
import p158U4.InterfaceC1684h;
import p179X4.C1971S;
import p186Y4.AbstractC2034b;
import p350s4.AbstractC7009c;
import p350s4.C7011e;

/* JADX INFO: renamed from: R4.T */
/* JADX INFO: loaded from: classes.dex */
public class C1351T {

    /* JADX INFO: renamed from: a */
    private final C1343K f4734a;

    /* JADX INFO: renamed from: c */
    private boolean f4736c;

    /* JADX INFO: renamed from: d */
    private C1689m f4737d;

    /* JADX INFO: renamed from: e */
    private C7011e f4738e;

    /* JADX INFO: renamed from: b */
    private C1353V.a f4735b = C1353V.a.NONE;

    /* JADX INFO: renamed from: f */
    private C7011e f4739f = C1687k.m7086j();

    /* JADX INFO: renamed from: g */
    private C7011e f4740g = C1687k.m7086j();

    /* JADX INFO: renamed from: R4.T$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4741a;

        static {
            int[] iArr = new int[C1366m.a.values().length];
            f4741a = iArr;
            try {
                iArr[C1366m.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4741a[C1366m.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4741a[C1366m.a.METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4741a[C1366m.a.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: R4.T$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        final C1689m f4742a;

        /* JADX INFO: renamed from: b */
        final C1367n f4743b;

        /* JADX INFO: renamed from: c */
        private final boolean f4744c;

        /* JADX INFO: renamed from: d */
        final C7011e f4745d;

        /* synthetic */ b(C1689m c1689m, C1367n c1367n, C7011e c7011e, boolean z7, a aVar) {
            this(c1689m, c1367n, c7011e, z7);
        }

        /* JADX INFO: renamed from: b */
        public boolean m5845b() {
            return this.f4744c;
        }

        private b(C1689m c1689m, C1367n c1367n, C7011e c7011e, boolean z7) {
            this.f4742a = c1689m;
            this.f4743b = c1367n;
            this.f4745d = c7011e;
            this.f4744c = z7;
        }
    }

    public C1351T(C1343K c1343k, C7011e c7011e) {
        this.f4734a = c1343k;
        this.f4737d = C1689m.m7098e(c1343k.m5751c());
        this.f4738e = c7011e;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m5830a(C1351T c1351t, C1366m c1366m, C1366m c1366m2) {
        c1351t.getClass();
        int iCompare = Integer.compare(m5832g(c1366m), m5832g(c1366m2));
        return iCompare != 0 ? iCompare : c1351t.f4734a.m5751c().compare(c1366m.m5905b(), c1366m2.m5905b());
    }

    /* JADX INFO: renamed from: f */
    private void m5831f(C1971S c1971s) {
        if (c1971s != null) {
            Iterator it = c1971s.m8225b().iterator();
            while (it.hasNext()) {
                this.f4738e = this.f4738e.m30620g((C1687k) it.next());
            }
            for (C1687k c1687k : c1971s.m8226c()) {
                AbstractC2034b.m8460d(this.f4738e.contains(c1687k), "Modified document %s not found in view.", c1687k);
            }
            Iterator it2 = c1971s.m8227d().iterator();
            while (it2.hasNext()) {
                this.f4738e = this.f4738e.m30622k((C1687k) it2.next());
            }
            this.f4736c = c1971s.m8229f();
        }
    }

    /* JADX INFO: renamed from: g */
    private static int m5832g(C1366m c1366m) {
        int i7 = a.f4741a[c1366m.m5906c().ordinal()];
        int i8 = 1;
        if (i7 != 1) {
            i8 = 2;
            if (i7 != 2 && i7 != 3) {
                if (i7 == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + c1366m.m5906c());
            }
        }
        return i8;
    }

    /* JADX INFO: renamed from: l */
    private boolean m5833l(C1687k c1687k) {
        InterfaceC1684h interfaceC1684hM7100g;
        return (this.f4738e.contains(c1687k) || (interfaceC1684hM7100g = this.f4737d.m7100g(c1687k)) == null || interfaceC1684hM7100g.mo7075d()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    private boolean m5834m(InterfaceC1684h interfaceC1684h, InterfaceC1684h interfaceC1684h2) {
        return interfaceC1684h.mo7075d() && interfaceC1684h2.mo7074c() && !interfaceC1684h2.mo7075d();
    }

    /* JADX INFO: renamed from: n */
    private List m5835n() {
        if (!this.f4736c) {
            return Collections.EMPTY_LIST;
        }
        C7011e<C1687k> c7011e = this.f4739f;
        this.f4739f = C1687k.m7086j();
        for (InterfaceC1684h interfaceC1684h : this.f4737d) {
            if (m5833l(interfaceC1684h.getKey())) {
                this.f4739f = this.f4739f.m30620g(interfaceC1684h.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(c7011e.size() + this.f4739f.size());
        for (C1687k c1687k : c7011e) {
            if (!this.f4739f.contains(c1687k)) {
                arrayList.add(new C1337E(C1337E.a.REMOVED, c1687k));
            }
        }
        for (C1687k c1687k2 : this.f4739f) {
            if (!c7011e.contains(c1687k2)) {
                arrayList.add(new C1337E(C1337E.a.ADDED, c1687k2));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public C1352U m5836b(b bVar) {
        return m5837c(bVar, null);
    }

    /* JADX INFO: renamed from: c */
    public C1352U m5837c(b bVar, C1971S c1971s) {
        return m5838d(bVar, c1971s, false);
    }

    /* JADX INFO: renamed from: d */
    public C1352U m5838d(b bVar, C1971S c1971s, boolean z7) {
        C1353V c1353v;
        AbstractC2034b.m8460d(!bVar.f4744c, "Cannot apply changes that need a refill", new Object[0]);
        C1689m c1689m = this.f4737d;
        this.f4737d = bVar.f4742a;
        this.f4740g = bVar.f4745d;
        List listM5909b = bVar.f4743b.m5909b();
        Collections.sort(listM5909b, new Comparator() { // from class: R4.S
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1351T.m5830a(this.f4733a, (C1366m) obj, (C1366m) obj2);
            }
        });
        m5831f(c1971s);
        List listM5835n = z7 ? Collections.EMPTY_LIST : m5835n();
        C1353V.a aVar = (this.f4739f.size() == 0 && this.f4736c && !z7) ? C1353V.a.SYNCED : C1353V.a.LOCAL;
        boolean z8 = aVar != this.f4735b;
        this.f4735b = aVar;
        if (listM5909b.size() != 0 || z8) {
            c1353v = new C1353V(this.f4734a, bVar.f4742a, c1689m, listM5909b, aVar == C1353V.a.LOCAL, bVar.f4745d, z8, false, (c1971s == null || c1971s.m8228e().isEmpty()) ? false : true);
        } else {
            c1353v = null;
        }
        return new C1352U(c1353v, listM5835n);
    }

    /* JADX INFO: renamed from: e */
    public C1352U m5839e(EnumC1341I enumC1341I) {
        if (!this.f4736c || enumC1341I != EnumC1341I.OFFLINE) {
            return new C1352U(null, Collections.EMPTY_LIST);
        }
        this.f4736c = false;
        return m5836b(new b(this.f4737d, new C1367n(), this.f4740g, false, null));
    }

    /* JADX INFO: renamed from: h */
    public b m5840h(AbstractC7009c abstractC7009c) {
        return m5841i(abstractC7009c, null);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0130  */
    /* JADX WARN: Code duplicated, block: B:72:0x0132  */
    /* JADX INFO: renamed from: i */
    public b m5841i(AbstractC7009c abstractC7009c, b bVar) {
        boolean z7;
        C7011e c7011eM30622k;
        C1367n c1367n = bVar != null ? bVar.f4743b : new C1367n();
        C1689m c1689m = bVar != null ? bVar.f4742a : this.f4737d;
        C7011e c7011eM30622k2 = bVar != null ? bVar.f4745d : this.f4740g;
        InterfaceC1684h interfaceC1684hM7102k = (this.f4734a.m5758j().equals(C1343K.a.LIMIT_TO_FIRST) && ((long) c1689m.size()) == this.f4734a.m5757i()) ? c1689m.m7102k() : null;
        InterfaceC1684h interfaceC1684hM7101j = (this.f4734a.m5758j().equals(C1343K.a.LIMIT_TO_LAST) && ((long) c1689m.size()) == this.f4734a.m5757i()) ? c1689m.m7101j() : null;
        Iterator it = abstractC7009c.iterator();
        C1689m c1689mM7103m = c1689m;
        boolean z8 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C1687k c1687k = (C1687k) entry.getKey();
            InterfaceC1684h interfaceC1684hM7100g = c1689m.m7100g(c1687k);
            InterfaceC1684h interfaceC1684h = this.f4734a.m5766r((InterfaceC1684h) entry.getValue()) ? (InterfaceC1684h) entry.getValue() : null;
            boolean z9 = interfaceC1684hM7100g != null && this.f4740g.contains(interfaceC1684hM7100g.getKey());
            boolean z10 = interfaceC1684h != null && (interfaceC1684h.mo7075d() || (this.f4740g.contains(interfaceC1684h.getKey()) && interfaceC1684h.mo7074c()));
            if (interfaceC1684hM7100g == null || interfaceC1684h == null) {
                if (interfaceC1684hM7100g == null && interfaceC1684h != null) {
                    c1367n.m5908a(C1366m.m5904a(C1366m.a.ADDED, interfaceC1684h));
                } else if (interfaceC1684hM7100g == null || interfaceC1684h != null) {
                    z7 = false;
                } else {
                    c1367n.m5908a(C1366m.m5904a(C1366m.a.REMOVED, interfaceC1684hM7100g));
                    if (interfaceC1684hM7102k != null || interfaceC1684hM7101j != null) {
                        z8 = true;
                    }
                }
                z7 = true;
            } else if (interfaceC1684hM7100g.getData().equals(interfaceC1684h.getData())) {
                if (z9 != z10) {
                    c1367n.m5908a(C1366m.m5904a(C1366m.a.METADATA, interfaceC1684h));
                    z7 = true;
                } else {
                    z7 = false;
                }
            } else if (m5834m(interfaceC1684hM7100g, interfaceC1684h)) {
                z7 = false;
            } else {
                c1367n.m5908a(C1366m.m5904a(C1366m.a.MODIFIED, interfaceC1684h));
                if ((interfaceC1684hM7102k != null && this.f4734a.m5751c().compare(interfaceC1684h, interfaceC1684hM7102k) > 0) || (interfaceC1684hM7101j != null && this.f4734a.m5751c().compare(interfaceC1684h, interfaceC1684hM7101j) < 0)) {
                    z8 = true;
                }
                z7 = true;
            }
            if (z7) {
                if (interfaceC1684h != null) {
                    c1689mM7103m = c1689mM7103m.m7099b(interfaceC1684h);
                    c7011eM30622k = interfaceC1684h.mo7075d() ? c7011eM30622k2.m30620g(interfaceC1684h.getKey()) : c7011eM30622k2.m30622k(interfaceC1684h.getKey());
                } else {
                    c1689mM7103m = c1689mM7103m.m7103m(c1687k);
                    c7011eM30622k = c7011eM30622k2.m30622k(c1687k);
                }
                c7011eM30622k2 = c7011eM30622k;
            }
        }
        if (this.f4734a.m5762n()) {
            long size = c1689mM7103m.size();
            long jM5757i = this.f4734a.m5757i();
            while (true) {
                size -= jM5757i;
                if (size <= 0) {
                    break;
                }
                InterfaceC1684h interfaceC1684hM7102k2 = this.f4734a.m5758j().equals(C1343K.a.LIMIT_TO_FIRST) ? c1689mM7103m.m7102k() : c1689mM7103m.m7101j();
                c1689mM7103m = c1689mM7103m.m7103m(interfaceC1684hM7102k2.getKey());
                c7011eM30622k2 = c7011eM30622k2.m30622k(interfaceC1684hM7102k2.getKey());
                c1367n.m5908a(C1366m.m5904a(C1366m.a.REMOVED, interfaceC1684hM7102k2));
                jM5757i = 1;
            }
        }
        C7011e c7011e = c7011eM30622k2;
        C1689m c1689m2 = c1689mM7103m;
        AbstractC2034b.m8460d(!z8 || bVar == null, "View was refilled using docs that themselves needed refilling.", new Object[0]);
        return new b(c1689m2, c1367n, c7011e, z8, null);
    }

    /* JADX INFO: renamed from: j */
    public C1353V.a m5842j() {
        return this.f4735b;
    }

    /* JADX INFO: renamed from: k */
    C7011e m5843k() {
        return this.f4738e;
    }
}

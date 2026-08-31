package p151T4;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p137R4.C1343K;
import p137R4.C1348P;
import p158U4.AbstractC1692p;
import p158U4.C1698v;
import p158U4.InterfaceC1684h;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p350s4.AbstractC7009c;
import p350s4.C7011e;

/* JADX INFO: renamed from: T4.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C1526a0 {

    /* JADX INFO: renamed from: a */
    private C1567o f5202a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1561m f5203b;

    /* JADX INFO: renamed from: c */
    private boolean f5204c;

    /* JADX INFO: renamed from: d */
    private boolean f5205d = false;

    /* JADX INFO: renamed from: e */
    private int f5206e = 100;

    /* JADX INFO: renamed from: f */
    private double f5207f = 2.0d;

    /* JADX INFO: renamed from: a */
    private AbstractC7009c m6384a(Iterable iterable, C1343K c1343k, AbstractC1692p.a aVar) {
        AbstractC7009c abstractC7009cM6447h = this.f5202a.m6447h(c1343k, aVar);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC1684h interfaceC1684h = (InterfaceC1684h) it.next();
            abstractC7009cM6447h = abstractC7009cM6447h.mo30605n(interfaceC1684h.getKey(), interfaceC1684h);
        }
        return abstractC7009cM6447h;
    }

    /* JADX INFO: renamed from: b */
    private C7011e m6385b(C1343K c1343k, AbstractC7009c abstractC7009c) {
        C7011e c7011e = new C7011e(Collections.EMPTY_LIST, c1343k.m5751c());
        Iterator it = abstractC7009c.iterator();
        while (it.hasNext()) {
            InterfaceC1684h interfaceC1684h = (InterfaceC1684h) ((Map.Entry) it.next()).getValue();
            if (c1343k.m5766r(interfaceC1684h)) {
                c7011e = c7011e.m30620g(interfaceC1684h);
            }
        }
        return c7011e;
    }

    /* JADX INFO: renamed from: c */
    private void m6386c(C1343K c1343k, C1523Z c1523z, int i7) {
        if (c1523z.m6382a() < this.f5206e) {
            AbstractC2049q.m8502a("QueryEngine", "SDK will not create cache indexes for query: %s, since it only creates cache indexes for collection contains more than or equal to %s documents.", c1343k.toString(), Integer.valueOf(this.f5206e));
            return;
        }
        AbstractC2049q.m8502a("QueryEngine", "Query: %s, scans %s local documents and returns %s documents as results.", c1343k.toString(), Integer.valueOf(c1523z.m6382a()), Integer.valueOf(i7));
        if (c1523z.m6382a() > this.f5207f * ((double) i7)) {
            this.f5203b.mo6283j(c1343k.m5768x());
            AbstractC2049q.m8502a("QueryEngine", "The SDK decides to create cache indexes for query: %s, as using cache indexes may help improve performance.", c1343k.toString());
        }
    }

    /* JADX INFO: renamed from: d */
    private AbstractC7009c m6387d(C1343K c1343k, C1523Z c1523z) {
        if (AbstractC2049q.m8504c()) {
            AbstractC2049q.m8502a("QueryEngine", "Using full collection scan to execute query: %s", c1343k.toString());
        }
        return this.f5202a.m6448i(c1343k, AbstractC1692p.a.f5610a, c1523z);
    }

    /* JADX INFO: renamed from: g */
    private boolean m6388g(C1343K c1343k, int i7, C7011e c7011e, C1698v c1698v) {
        if (!c1343k.m5762n()) {
            return false;
        }
        if (i7 != c7011e.size()) {
            return true;
        }
        InterfaceC1684h interfaceC1684h = c1343k.m5758j() == C1343K.a.LIMIT_TO_FIRST ? (InterfaceC1684h) c7011e.m30617a() : (InterfaceC1684h) c7011e.m30618b();
        if (interfaceC1684h == null) {
            return false;
        }
        return interfaceC1684h.mo7076e() || interfaceC1684h.mo7081j().compareTo(c1698v) > 0;
    }

    /* JADX INFO: renamed from: h */
    private AbstractC7009c m6389h(C1343K c1343k) {
        if (c1343k.m5767s()) {
            return null;
        }
        C1348P c1348pM5768x = c1343k.m5768x();
        InterfaceC1561m.a aVarMo6274a = this.f5203b.mo6274a(c1348pM5768x);
        if (aVarMo6274a.equals(InterfaceC1561m.a.NONE)) {
            return null;
        }
        if (c1343k.m5762n() && aVarMo6274a.equals(InterfaceC1561m.a.PARTIAL)) {
            return m6389h(c1343k.m5765q(-1L));
        }
        List listMo6279f = this.f5203b.mo6279f(c1348pM5768x);
        AbstractC2034b.m8460d(listMo6279f != null, "index manager must return results for partial and full indexes.", new Object[0]);
        AbstractC7009c abstractC7009cM6446d = this.f5202a.m6446d(listMo6279f);
        AbstractC1692p.a aVarMo6281h = this.f5203b.mo6281h(c1348pM5768x);
        C7011e c7011eM6385b = m6385b(c1343k, abstractC7009cM6446d);
        return m6388g(c1343k, listMo6279f.size(), c7011eM6385b, aVarMo6281h.mo7047o()) ? m6389h(c1343k.m5765q(-1L)) : m6384a(c7011eM6385b, c1343k, aVarMo6281h);
    }

    /* JADX INFO: renamed from: i */
    private AbstractC7009c m6390i(C1343K c1343k, C7011e c7011e, C1698v c1698v) {
        if (c1343k.m5767s() || c1698v.equals(C1698v.f5636b)) {
            return null;
        }
        C7011e c7011eM6385b = m6385b(c1343k, this.f5202a.m6446d(c7011e));
        if (m6388g(c1343k, c7011e.size(), c7011eM6385b, c1698v)) {
            return null;
        }
        if (AbstractC2049q.m8504c()) {
            AbstractC2049q.m8502a("QueryEngine", "Re-using previous result from %s to execute query: %s", c1698v.toString(), c1343k.toString());
        }
        return m6384a(c7011eM6385b, c1343k, AbstractC1692p.a.m7110j(c1698v, -1));
    }

    /* JADX INFO: renamed from: e */
    public AbstractC7009c m6391e(C1343K c1343k, C1698v c1698v, C7011e c7011e) {
        AbstractC2034b.m8460d(this.f5204c, "initialize() not called", new Object[0]);
        AbstractC7009c abstractC7009cM6389h = m6389h(c1343k);
        if (abstractC7009cM6389h != null) {
            return abstractC7009cM6389h;
        }
        AbstractC7009c abstractC7009cM6390i = m6390i(c1343k, c7011e, c1698v);
        if (abstractC7009cM6390i != null) {
            return abstractC7009cM6390i;
        }
        C1523Z c1523z = new C1523Z();
        AbstractC7009c abstractC7009cM6387d = m6387d(c1343k, c1523z);
        if (abstractC7009cM6387d != null && this.f5205d) {
            m6386c(c1343k, c1523z, abstractC7009cM6387d.size());
        }
        return abstractC7009cM6387d;
    }

    /* JADX INFO: renamed from: f */
    public void m6392f(C1567o c1567o, InterfaceC1561m interfaceC1561m) {
        this.f5202a = c1567o;
        this.f5203b = interfaceC1561m;
        this.f5204c = true;
    }
}

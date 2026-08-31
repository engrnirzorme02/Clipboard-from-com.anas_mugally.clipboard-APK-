package p158U4;

import java.util.HashMap;
import java.util.Map;
import p186Y4.AbstractC2034b;
import p351s5.C7034p;
import p351s5.C7039u;

/* JADX INFO: renamed from: U4.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1695s implements Cloneable {

    /* JADX INFO: renamed from: a */
    private C7039u f5633a;

    /* JADX INFO: renamed from: b */
    private final Map f5634b;

    public C1695s(C7039u c7039u) {
        this.f5634b = new HashMap();
        AbstractC2034b.m8460d(c7039u.m31044w0() == C7039u.c.MAP_VALUE, "ObjectValues should be backed by a MapValue", new Object[0]);
        AbstractC2034b.m8460d(!AbstractC1697u.m7152c(c7039u), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f5633a = c7039u;
    }

    /* JADX INFO: renamed from: a */
    private C7034p m7136a(C1693q c1693q, Map map) {
        C7039u c7039uM7138e = m7138e(this.f5633a, c1693q);
        C7034p.b bVarM30809j0 = AbstractC1701y.m7196x(c7039uM7138e) ? (C7034p.b) c7039uM7138e.m31040s0().m23710Y() : C7034p.m30809j0();
        boolean z7 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                C7034p c7034pM7136a = m7136a((C1693q) c1693q.m7056d(str), (Map) value);
                if (c7034pM7136a != null) {
                    bVarM30809j0.m30817z(str, (C7039u) C7039u.m31032y0().m31051F(c7034pM7136a).m23721o());
                    z7 = true;
                }
            } else {
                if (value instanceof C7039u) {
                    bVarM30809j0.m30817z(str, (C7039u) value);
                } else if (bVarM30809j0.m30815x(str)) {
                    AbstractC2034b.m8460d(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                    bVarM30809j0.m30814A(str);
                }
                z7 = true;
            }
        }
        if (z7) {
            return (C7034p) bVarM30809j0.m23721o();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private C7039u m7137b() {
        synchronized (this.f5634b) {
            try {
                C7034p c7034pM7136a = m7136a(C1693q.f5617c, this.f5634b);
                if (c7034pM7136a != null) {
                    this.f5633a = (C7039u) C7039u.m31032y0().m31051F(c7034pM7136a).m23721o();
                    this.f5634b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f5633a;
    }

    /* JADX INFO: renamed from: e */
    private C7039u m7138e(C7039u c7039u, C1693q c1693q) {
        if (c1693q.isEmpty()) {
            return c7039u;
        }
        for (int i7 = 0; i7 < c1693q.m7063v() - 1; i7++) {
            c7039u = c7039u.m31040s0().m30812e0(c1693q.m7061p(i7), null);
            if (!AbstractC1701y.m7196x(c7039u)) {
                return null;
            }
        }
        return c7039u.m31040s0().m30812e0(c1693q.m7060o(), null);
    }

    /* JADX INFO: renamed from: f */
    public static C1695s m7139f(Map map) {
        return new C1695s((C7039u) C7039u.m31032y0().m31050E(C7034p.m30809j0().m30816y(map)).m23721o());
    }

    /* JADX INFO: renamed from: k */
    private void m7140k(C1693q c1693q, C7039u c7039u) {
        Map map;
        Map map2 = this.f5634b;
        for (int i7 = 0; i7 < c1693q.m7063v() - 1; i7++) {
            String strM7061p = c1693q.m7061p(i7);
            Object obj = map2.get(strM7061p);
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                if (obj instanceof C7039u) {
                    C7039u c7039u2 = (C7039u) obj;
                    if (c7039u2.m31044w0() == C7039u.c.MAP_VALUE) {
                        HashMap map3 = new HashMap(c7039u2.m31040s0().m30811d0());
                        map2.put(strM7061p, map3);
                        map2 = map3;
                    }
                }
                map = new HashMap();
                map2.put(strM7061p, map);
            }
            map2 = map;
        }
        map2.put(c1693q.m7060o(), c7039u);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1695s clone() {
        return new C1695s(m7137b());
    }

    /* JADX INFO: renamed from: d */
    public void m7142d(C1693q c1693q) {
        AbstractC2034b.m8460d(!c1693q.isEmpty(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        m7140k(c1693q, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1695s) {
            return AbstractC1701y.m7190r(m7137b(), ((C1695s) obj).m7137b());
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public C7039u m7143g(C1693q c1693q) {
        return m7138e(m7137b(), c1693q);
    }

    /* JADX INFO: renamed from: h */
    public Map m7144h() {
        return m7137b().m31040s0().m30811d0();
    }

    public int hashCode() {
        return m7137b().hashCode();
    }

    /* JADX INFO: renamed from: i */
    public void m7145i(C1693q c1693q, C7039u c7039u) {
        AbstractC2034b.m8460d(!c1693q.isEmpty(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        m7140k(c1693q, c7039u);
    }

    /* JADX INFO: renamed from: j */
    public void m7146j(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            C1693q c1693q = (C1693q) entry.getKey();
            if (entry.getValue() == null) {
                m7142d(c1693q);
            } else {
                m7145i(c1693q, (C7039u) entry.getValue());
            }
        }
    }

    public String toString() {
        return "ObjectValue{internalValue=" + AbstractC1701y.m7174b(m7137b()) + '}';
    }

    public C1695s() {
        this((C7039u) C7039u.m31032y0().m31051F(C7034p.m30805b0()).m23721o());
    }
}

package p151T4;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p137R4.C1338F;
import p158U4.C1687k;
import p158U4.InterfaceC1684h;
import p186Y4.AbstractC2034b;
import p186Y4.InterfaceC2043k;

/* JADX INFO: renamed from: T4.O */
/* JADX INFO: loaded from: classes.dex */
class C1502O implements InterfaceC1535d0, InterfaceC1478C {

    /* JADX INFO: renamed from: a */
    private final C1509S f5104a;

    /* JADX INFO: renamed from: b */
    private final C1570p f5105b;

    /* JADX INFO: renamed from: d */
    private C1538e0 f5107d;

    /* JADX INFO: renamed from: e */
    private final C1486G f5108e;

    /* JADX INFO: renamed from: f */
    private final C1338F f5109f;

    /* JADX INFO: renamed from: c */
    private final Map f5106c = new HashMap();

    /* JADX INFO: renamed from: g */
    private long f5110g = -1;

    C1502O(C1509S c1509s, C1486G.b bVar, C1570p c1570p) {
        this.f5104a = c1509s;
        this.f5105b = c1570p;
        this.f5109f = new C1338F(c1509s.mo6313i().m6363m());
        this.f5108e = new C1486G(this, bVar);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m6286q(long[] jArr, Long l7) {
        jArr[0] = jArr[0] + 1;
    }

    /* JADX INFO: renamed from: r */
    private boolean m6287r(C1687k c1687k, long j7) {
        if (m6288s(c1687k) || this.f5107d.m6403c(c1687k) || this.f5104a.mo6313i().m6360j(c1687k)) {
            return true;
        }
        Long l7 = (Long) this.f5106c.get(c1687k);
        return l7 != null && l7.longValue() > j7;
    }

    /* JADX INFO: renamed from: s */
    private boolean m6288s(C1687k c1687k) {
        Iterator it = this.f5104a.m6319q().iterator();
        while (it.hasNext()) {
            if (((C1504P) it.next()).m6292j(c1687k)) {
                return true;
            }
        }
        return false;
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: a */
    public long mo6190a() {
        long jM6362l = this.f5104a.mo6313i().m6362l(this.f5105b) + this.f5104a.mo6312h().m6357h(this.f5105b);
        Iterator it = this.f5104a.m6319q().iterator();
        while (it.hasNext()) {
            jM6362l += ((C1504P) it.next()).m6293k(this.f5105b);
        }
        return jM6362l;
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: b */
    public void mo6191b(C1687k c1687k) {
        this.f5106c.put(c1687k, Long.valueOf(mo6201l()));
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: c */
    public int mo6192c(long j7, SparseArray sparseArray) {
        return this.f5104a.mo6313i().m6366p(j7, sparseArray);
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: d */
    public void mo6193d(C1687k c1687k) {
        this.f5106c.put(c1687k, Long.valueOf(mo6201l()));
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: e */
    public void mo6194e(C1687k c1687k) {
        this.f5106c.put(c1687k, Long.valueOf(mo6201l()));
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: f */
    public void mo6195f() {
        AbstractC2034b.m8460d(this.f5110g != -1, "Committing a transaction without having started one", new Object[0]);
        this.f5110g = -1L;
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: g */
    public void mo6196g(C1538e0 c1538e0) {
        this.f5107d = c1538e0;
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: h */
    public C1486G mo6197h() {
        return this.f5108e;
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: i */
    public void mo6198i() {
        AbstractC2034b.m8460d(this.f5110g == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f5110g = this.f5109f.m5722a();
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: j */
    public void mo6199j(InterfaceC2043k interfaceC2043k) {
        this.f5104a.mo6313i().m6361k(interfaceC2043k);
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: k */
    public void mo6200k(C1687k c1687k) {
        this.f5106c.put(c1687k, Long.valueOf(mo6201l()));
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: l */
    public long mo6201l() {
        AbstractC2034b.m8460d(this.f5110g != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f5110g;
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: m */
    public void mo6202m(C1477B1 c1477b1) {
        this.f5104a.mo6313i().mo6171c(c1477b1.m6218l(mo6201l()));
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: n */
    public long mo6203n() {
        long jM6364n = this.f5104a.mo6313i().m6364n();
        final long[] jArr = new long[1];
        mo6205p(new InterfaceC2043k() { // from class: T4.N
            @Override // p186Y4.InterfaceC2043k
            public final void accept(Object obj) {
                C1502O.m6286q(jArr, (Long) obj);
            }
        });
        return jM6364n + jArr[0];
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: o */
    public int mo6204o(long j7) {
        C1511T c1511tMo6312h = this.f5104a.mo6312h();
        ArrayList arrayList = new ArrayList();
        Iterator it = c1511tMo6312h.m6358i().iterator();
        while (it.hasNext()) {
            C1687k key = ((InterfaceC1684h) it.next()).getKey();
            if (!m6287r(key, j7)) {
                arrayList.add(key);
                this.f5106c.remove(key);
            }
        }
        c1511tMo6312h.removeAll(arrayList);
        return arrayList.size();
    }

    @Override // p151T4.InterfaceC1478C
    /* JADX INFO: renamed from: p */
    public void mo6205p(InterfaceC2043k interfaceC2043k) {
        for (Map.Entry entry : this.f5106c.entrySet()) {
            if (!m6287r((C1687k) entry.getKey(), ((Long) entry.getValue()).longValue())) {
                interfaceC2043k.accept((Long) entry.getValue());
            }
        }
    }
}

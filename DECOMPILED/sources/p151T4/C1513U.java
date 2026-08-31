package p151T4;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p137R4.C1348P;
import p158U4.C1687k;
import p158U4.C1698v;
import p186Y4.InterfaceC2043k;
import p350s4.C7011e;

/* JADX INFO: renamed from: T4.U */
/* JADX INFO: loaded from: classes.dex */
final class C1513U implements InterfaceC1474A1 {

    /* JADX INFO: renamed from: c */
    private int f5157c;

    /* JADX INFO: renamed from: f */
    private final C1509S f5160f;

    /* JADX INFO: renamed from: a */
    private final Map f5155a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final C1538e0 f5156b = new C1538e0();

    /* JADX INFO: renamed from: d */
    private C1698v f5158d = C1698v.f5636b;

    /* JADX INFO: renamed from: e */
    private long f5159e = 0;

    C1513U(C1509S c1509s) {
        this.f5160f = c1509s;
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: a */
    public void mo6169a(C7011e c7011e, int i7) {
        this.f5156b.m6406g(c7011e, i7);
        InterfaceC1535d0 interfaceC1535d0Mo6311g = this.f5160f.mo6311g();
        Iterator it = c7011e.iterator();
        while (it.hasNext()) {
            interfaceC1535d0Mo6311g.mo6191b((C1687k) it.next());
        }
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: b */
    public int mo6170b() {
        return this.f5157c;
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: c */
    public void mo6171c(C1477B1 c1477b1) {
        mo6176h(c1477b1);
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: d */
    public C7011e mo6172d(int i7) {
        return this.f5156b.m6404d(i7);
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: e */
    public C1698v mo6173e() {
        return this.f5158d;
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: f */
    public void mo6174f(C1698v c1698v) {
        this.f5158d = c1698v;
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: g */
    public void mo6175g(C7011e c7011e, int i7) {
        this.f5156b.m6402b(c7011e, i7);
        InterfaceC1535d0 interfaceC1535d0Mo6311g = this.f5160f.mo6311g();
        Iterator it = c7011e.iterator();
        while (it.hasNext()) {
            interfaceC1535d0Mo6311g.mo6193d((C1687k) it.next());
        }
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: h */
    public void mo6176h(C1477B1 c1477b1) {
        this.f5155a.put(c1477b1.m6213g(), c1477b1);
        int iM6214h = c1477b1.m6214h();
        if (iM6214h > this.f5157c) {
            this.f5157c = iM6214h;
        }
        if (c1477b1.m6211e() > this.f5159e) {
            this.f5159e = c1477b1.m6211e();
        }
    }

    @Override // p151T4.InterfaceC1474A1
    /* JADX INFO: renamed from: i */
    public C1477B1 mo6177i(C1348P c1348p) {
        return (C1477B1) this.f5155a.get(c1348p);
    }

    /* JADX INFO: renamed from: j */
    public boolean m6360j(C1687k c1687k) {
        return this.f5156b.m6403c(c1687k);
    }

    /* JADX INFO: renamed from: k */
    public void m6361k(InterfaceC2043k interfaceC2043k) {
        Iterator it = this.f5155a.values().iterator();
        while (it.hasNext()) {
            interfaceC2043k.accept((C1477B1) it.next());
        }
    }

    /* JADX INFO: renamed from: l */
    long m6362l(C1570p c1570p) {
        Iterator it = this.f5155a.entrySet().iterator();
        long jMo22969b = 0;
        while (it.hasNext()) {
            jMo22969b += (long) c1570p.m6467o((C1477B1) ((Map.Entry) it.next()).getValue()).mo22969b();
        }
        return jMo22969b;
    }

    /* JADX INFO: renamed from: m */
    public long m6363m() {
        return this.f5159e;
    }

    /* JADX INFO: renamed from: n */
    public long m6364n() {
        return this.f5155a.size();
    }

    /* JADX INFO: renamed from: o */
    public void m6365o(int i7) {
        this.f5156b.m6407h(i7);
    }

    /* JADX INFO: renamed from: p */
    int m6366p(long j7, SparseArray sparseArray) {
        Iterator it = this.f5155a.entrySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iM6214h = ((C1477B1) entry.getValue()).m6214h();
            if (((C1477B1) entry.getValue()).m6211e() <= j7 && sparseArray.get(iM6214h) == null) {
                it.remove();
                m6365o(iM6214h);
                i7++;
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: q */
    public void m6367q(C1477B1 c1477b1) {
        this.f5155a.remove(c1477b1.m6213g());
        this.f5156b.m6407h(c1477b1.m6214h());
    }
}

package p151T4;

import com.google.protobuf.AbstractC5104i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p123P4.C1229i;
import p158U4.C1687k;
import p165V4.AbstractC1780f;
import p165V4.C1781g;
import p179X4.C1977Y;
import p186Y4.AbstractC2032B;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2051s;
import p350s4.C7011e;

/* JADX INFO: renamed from: T4.P */
/* JADX INFO: loaded from: classes.dex */
final class C1504P implements InterfaceC1515V {

    /* JADX INFO: renamed from: a */
    private final List f5112a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private C7011e f5113b = new C7011e(Collections.EMPTY_LIST, C1537e.f5219c);

    /* JADX INFO: renamed from: c */
    private int f5114c = 1;

    /* JADX INFO: renamed from: d */
    private AbstractC5104i f5115d = C1977Y.f6550v;

    /* JADX INFO: renamed from: e */
    private final C1509S f5116e;

    /* JADX INFO: renamed from: f */
    private final C1498M f5117f;

    C1504P(C1509S c1509s, C1229i c1229i) {
        this.f5116e = c1509s;
        this.f5117f = c1509s.mo6308d(c1229i);
    }

    /* JADX INFO: renamed from: l */
    private int m6289l(int i7) {
        if (this.f5112a.isEmpty()) {
            return 0;
        }
        return i7 - ((C1781g) this.f5112a.get(0)).m7473d();
    }

    /* JADX INFO: renamed from: m */
    private int m6290m(int i7, String str) {
        int iM6289l = m6289l(i7);
        AbstractC2034b.m8460d(iM6289l >= 0 && iM6289l < this.f5112a.size(), "Batches must exist to be %s", str);
        return iM6289l;
    }

    /* JADX INFO: renamed from: o */
    private List m6291o(C7011e c7011e) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c7011e.iterator();
        while (it.hasNext()) {
            C1781g c1781gMo6265g = mo6265g(((Integer) it.next()).intValue());
            if (c1781gMo6265g != null) {
                arrayList.add(c1781gMo6265g);
            }
        }
        return arrayList;
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: a */
    public void mo6259a() {
        if (this.f5112a.isEmpty()) {
            AbstractC2034b.m8460d(this.f5113b.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: b */
    public List mo6260b(Iterable iterable) {
        C7011e c7011e = new C7011e(Collections.EMPTY_LIST, AbstractC2032B.m8441f());
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1687k c1687k = (C1687k) it.next();
            Iterator itM30621j = this.f5113b.m30621j(new C1537e(c1687k, 0));
            while (itM30621j.hasNext()) {
                C1537e c1537e = (C1537e) itM30621j.next();
                if (!c1687k.equals(c1537e.m6399d())) {
                    break;
                }
                c7011e = c7011e.m30620g(Integer.valueOf(c1537e.m6398c()));
            }
        }
        return m6291o(c7011e);
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: c */
    public void mo6261c(C1781g c1781g, AbstractC5104i abstractC5104i) {
        int iM7473d = c1781g.m7473d();
        int iM6290m = m6290m(iM7473d, "acknowledged");
        AbstractC2034b.m8460d(iM6290m == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        C1781g c1781g2 = (C1781g) this.f5112a.get(iM6290m);
        AbstractC2034b.m8460d(iM7473d == c1781g2.m7473d(), "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(iM7473d), Integer.valueOf(c1781g2.m7473d()));
        this.f5115d = (AbstractC5104i) AbstractC2051s.m8520a(abstractC5104i);
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: d */
    public void mo6262d(AbstractC5104i abstractC5104i) {
        this.f5115d = (AbstractC5104i) AbstractC2051s.m8520a(abstractC5104i);
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: e */
    public void mo6263e(C1781g c1781g) {
        AbstractC2034b.m8460d(m6290m(c1781g.m7473d(), "removed") == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.f5112a.remove(0);
        C7011e c7011eM30622k = this.f5113b;
        Iterator it = c1781g.m7476g().iterator();
        while (it.hasNext()) {
            C1687k c1687kM7462f = ((AbstractC1780f) it.next()).m7462f();
            this.f5116e.mo6311g().mo6194e(c1687kM7462f);
            c7011eM30622k = c7011eM30622k.m30622k(new C1537e(c1687kM7462f, c1781g.m7473d()));
        }
        this.f5113b = c7011eM30622k;
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: f */
    public C1781g mo6264f(int i7) {
        int iM6289l = m6289l(i7 + 1);
        if (iM6289l < 0) {
            iM6289l = 0;
        }
        if (this.f5112a.size() > iM6289l) {
            return (C1781g) this.f5112a.get(iM6289l);
        }
        return null;
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: g */
    public C1781g mo6265g(int i7) {
        int iM6289l = m6289l(i7);
        if (iM6289l < 0 || iM6289l >= this.f5112a.size()) {
            return null;
        }
        C1781g c1781g = (C1781g) this.f5112a.get(iM6289l);
        AbstractC2034b.m8460d(c1781g.m7473d() == i7, "If found batch must match", new Object[0]);
        return c1781g;
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: h */
    public AbstractC5104i mo6266h() {
        return this.f5115d;
    }

    @Override // p151T4.InterfaceC1515V
    /* JADX INFO: renamed from: i */
    public List mo6267i() {
        return Collections.unmodifiableList(this.f5112a);
    }

    /* JADX INFO: renamed from: j */
    boolean m6292j(C1687k c1687k) {
        Iterator itM30621j = this.f5113b.m30621j(new C1537e(c1687k, 0));
        if (itM30621j.hasNext()) {
            return ((C1537e) itM30621j.next()).m6399d().equals(c1687k);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    long m6293k(C1570p c1570p) {
        Iterator it = this.f5112a.iterator();
        long jMo22969b = 0;
        while (it.hasNext()) {
            jMo22969b += (long) c1570p.m6466m((C1781g) it.next()).mo22969b();
        }
        return jMo22969b;
    }

    /* JADX INFO: renamed from: n */
    public boolean m6294n() {
        return this.f5112a.isEmpty();
    }

    @Override // p151T4.InterfaceC1515V
    public void start() {
        if (m6294n()) {
            this.f5114c = 1;
        }
    }
}

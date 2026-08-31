package p151T4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p158U4.C1687k;

/* JADX INFO: renamed from: T4.K */
/* JADX INFO: loaded from: classes.dex */
class C1494K implements InterfaceC1535d0 {

    /* JADX INFO: renamed from: a */
    private C1538e0 f5085a;

    /* JADX INFO: renamed from: b */
    private final C1509S f5086b;

    /* JADX INFO: renamed from: c */
    private Set f5087c;

    C1494K(C1509S c1509s) {
        this.f5086b = c1509s;
    }

    /* JADX INFO: renamed from: a */
    private boolean m6245a(C1687k c1687k) {
        if (this.f5086b.mo6313i().m6360j(c1687k) || m6246c(c1687k)) {
            return true;
        }
        C1538e0 c1538e0 = this.f5085a;
        return c1538e0 != null && c1538e0.m6403c(c1687k);
    }

    /* JADX INFO: renamed from: c */
    private boolean m6246c(C1687k c1687k) {
        Iterator it = this.f5086b.m6319q().iterator();
        while (it.hasNext()) {
            if (((C1504P) it.next()).m6292j(c1687k)) {
                return true;
            }
        }
        return false;
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: b */
    public void mo6191b(C1687k c1687k) {
        this.f5087c.add(c1687k);
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: d */
    public void mo6193d(C1687k c1687k) {
        this.f5087c.remove(c1687k);
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: e */
    public void mo6194e(C1687k c1687k) {
        this.f5087c.add(c1687k);
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: f */
    public void mo6195f() {
        C1511T c1511tMo6312h = this.f5086b.mo6312h();
        ArrayList arrayList = new ArrayList();
        for (C1687k c1687k : this.f5087c) {
            if (!m6245a(c1687k)) {
                arrayList.add(c1687k);
            }
        }
        c1511tMo6312h.removeAll(arrayList);
        this.f5087c = null;
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: g */
    public void mo6196g(C1538e0 c1538e0) {
        this.f5085a = c1538e0;
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: i */
    public void mo6198i() {
        this.f5087c = new HashSet();
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: k */
    public void mo6200k(C1687k c1687k) {
        if (m6245a(c1687k)) {
            this.f5087c.remove(c1687k);
        } else {
            this.f5087c.add(c1687k);
        }
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: l */
    public long mo6201l() {
        return -1L;
    }

    @Override // p151T4.InterfaceC1535d0
    /* JADX INFO: renamed from: m */
    public void mo6202m(C1477B1 c1477b1) {
        C1513U c1513uMo6313i = this.f5086b.mo6313i();
        Iterator it = c1513uMo6313i.mo6172d(c1477b1.m6214h()).iterator();
        while (it.hasNext()) {
            this.f5087c.add((C1687k) it.next());
        }
        c1513uMo6313i.m6367q(c1477b1);
    }
}

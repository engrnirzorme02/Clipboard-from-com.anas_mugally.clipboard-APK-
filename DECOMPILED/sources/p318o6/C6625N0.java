package p318o6;

import p145S5.AbstractC1437o;
import p145S5.C1436n;

/* JADX INFO: renamed from: o6.N0 */
/* JADX INFO: loaded from: classes.dex */
final class C6625N0 extends AbstractC6605D0 {

    /* JADX INFO: renamed from: e */
    private final C6682p f24912e;

    public C6625N0(C6682p c6682p) {
        this.f24912e = c6682p;
    }

    @Override // p318o6.AbstractC6605D0
    /* JADX INFO: renamed from: v */
    public boolean mo27974v() {
        return false;
    }

    @Override // p318o6.AbstractC6605D0
    /* JADX INFO: renamed from: w */
    public void mo27975w(Throwable th) {
        Object objM28026T = m27973u().m28026T();
        if (objM28026T instanceof C6602C) {
            C6682p c6682p = this.f24912e;
            C1436n.a aVar = C1436n.f4958b;
            c6682p.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(((C6602C) objM28026T).f24874a)));
        } else {
            C6682p c6682p2 = this.f24912e;
            C1436n.a aVar2 = C1436n.f4958b;
            c6682p2.resumeWith(C1436n.m6073b(AbstractC6609F0.m28072h(objM28026T)));
        }
    }
}

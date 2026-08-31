package p120P1;

import p035E1.InterfaceC0297r;
import p106N1.AbstractC0944j;

/* JADX INFO: renamed from: P1.e */
/* JADX INFO: loaded from: classes.dex */
public class C1188e extends AbstractC0944j implements InterfaceC0297r {
    public C1188e(C1186c c1186c) {
        super(c1186c);
    }

    @Override // p106N1.AbstractC0944j, p035E1.InterfaceC0297r
    /* JADX INFO: renamed from: a */
    public void mo1454a() {
        ((C1186c) this.f3657a).m5216e().prepareToDraw();
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: b */
    public void mo1436b() {
        ((C1186c) this.f3657a).stop();
        ((C1186c) this.f3657a).m5220k();
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: c */
    public int mo1437c() {
        return ((C1186c) this.f3657a).m5219i();
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: d */
    public Class mo1438d() {
        return C1186c.class;
    }
}

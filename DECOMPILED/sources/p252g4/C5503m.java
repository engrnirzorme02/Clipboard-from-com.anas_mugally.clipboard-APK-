package p252g4;

import p228d4.C5235g;
import p300m4.C6346g;
import p309n5.InterfaceC6503c;

/* JADX INFO: renamed from: g4.m */
/* JADX INFO: loaded from: classes.dex */
public class C5503m implements InterfaceC6503c {

    /* JADX INFO: renamed from: a */
    private final C5465C f20866a;

    /* JADX INFO: renamed from: b */
    private final C5502l f20867b;

    public C5503m(C5465C c5465c, C6346g c6346g) {
        this.f20866a = c5465c;
        this.f20867b = new C5502l(c6346g);
    }

    @Override // p309n5.InterfaceC6503c
    /* JADX INFO: renamed from: a */
    public void mo24818a(InterfaceC6503c.b bVar) {
        C5235g.m24179f().m24180b("App Quality Sessions session changed: " + bVar);
        this.f20867b.m24816f(bVar.m27686a());
    }

    @Override // p309n5.InterfaceC6503c
    /* JADX INFO: renamed from: b */
    public boolean mo24819b() {
        return this.f20866a.m24680d();
    }

    @Override // p309n5.InterfaceC6503c
    /* JADX INFO: renamed from: c */
    public InterfaceC6503c.a mo24820c() {
        return InterfaceC6503c.a.CRASHLYTICS;
    }

    /* JADX INFO: renamed from: d */
    public String m24821d(String str) {
        return this.f20867b.m24815c(str);
    }

    /* JADX INFO: renamed from: e */
    public void m24822e(String str) {
        this.f20867b.m24817g(str);
    }
}

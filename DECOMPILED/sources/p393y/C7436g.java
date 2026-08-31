package p393y;

/* JADX INFO: renamed from: y.g */
/* JADX INFO: loaded from: classes.dex */
class C7436g extends C7435f {

    /* JADX INFO: renamed from: m */
    public int f29804m;

    C7436g(AbstractC7445p abstractC7445p) {
        super(abstractC7445p);
        if (abstractC7445p instanceof C7441l) {
            this.f29787e = C7435f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f29787e = C7435f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // p393y.C7435f
    /* JADX INFO: renamed from: d */
    public void mo32936d(int i7) {
        if (this.f29792j) {
            return;
        }
        this.f29792j = true;
        this.f29789g = i7;
        for (InterfaceC7433d interfaceC7433d : this.f29793k) {
            interfaceC7433d.mo32914a(interfaceC7433d);
        }
    }
}

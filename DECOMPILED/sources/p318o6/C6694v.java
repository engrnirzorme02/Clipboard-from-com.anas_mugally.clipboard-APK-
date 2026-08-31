package p318o6;

/* JADX INFO: renamed from: o6.v */
/* JADX INFO: loaded from: classes.dex */
final class C6694v extends AbstractC6605D0 implements InterfaceC6692u {

    /* JADX INFO: renamed from: e */
    public final InterfaceC6696w f24994e;

    public C6694v(InterfaceC6696w interfaceC6696w) {
        this.f24994e = interfaceC6696w;
    }

    @Override // p318o6.InterfaceC6692u
    /* JADX INFO: renamed from: d */
    public boolean mo28094d(Throwable th) {
        return m27973u().mo28021E(th);
    }

    @Override // p318o6.InterfaceC6692u
    public InterfaceC6701y0 getParent() {
        return m27973u();
    }

    @Override // p318o6.AbstractC6605D0
    /* JADX INFO: renamed from: v */
    public boolean mo27974v() {
        return true;
    }

    @Override // p318o6.AbstractC6605D0
    /* JADX INFO: renamed from: w */
    public void mo27975w(Throwable th) {
        this.f24994e.mo28022J(m27973u());
    }
}

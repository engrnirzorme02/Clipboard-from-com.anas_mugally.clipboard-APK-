package p069I3;

/* JADX INFO: renamed from: I3.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C0624k extends C0620g {

    /* JADX INFO: renamed from: a */
    private final C0620g f2399a;

    /* JADX INFO: renamed from: b */
    private final float f2400b;

    public C0624k(C0620g c0620g, float f7) {
        this.f2399a = c0620g;
        this.f2400b = f7;
    }

    @Override // p069I3.C0620g
    /* JADX INFO: renamed from: a */
    boolean mo2660a() {
        return this.f2399a.mo2660a();
    }

    @Override // p069I3.C0620g
    /* JADX INFO: renamed from: b */
    public void mo2661b(float f7, float f8, float f9, C0629p c0629p) {
        this.f2399a.mo2661b(f7, f8 - this.f2400b, f9, c0629p);
    }
}

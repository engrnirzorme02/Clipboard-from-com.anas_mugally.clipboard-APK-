package p069I3;

/* JADX INFO: renamed from: I3.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0621h extends C0620g {

    /* JADX INFO: renamed from: a */
    private final float f2337a;

    public C0621h(float f7) {
        this.f2337a = f7 - 0.001f;
    }

    @Override // p069I3.C0620g
    /* JADX INFO: renamed from: a */
    boolean mo2660a() {
        return true;
    }

    @Override // p069I3.C0620g
    /* JADX INFO: renamed from: b */
    public void mo2661b(float f7, float f8, float f9, C0629p c0629p) {
        float fSqrt = (float) ((((double) this.f2337a) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f2337a, 2.0d) - Math.pow(fSqrt, 2.0d));
        c0629p.m2849n(f8 - fSqrt, ((float) (-((((double) this.f2337a) * Math.sqrt(2.0d)) - ((double) this.f2337a)))) + fSqrt2);
        c0629p.m2848m(f8, (float) (-((((double) this.f2337a) * Math.sqrt(2.0d)) - ((double) this.f2337a))));
        c0629p.m2848m(f8 + fSqrt, ((float) (-((((double) this.f2337a) * Math.sqrt(2.0d)) - ((double) this.f2337a)))) + fSqrt2);
    }
}

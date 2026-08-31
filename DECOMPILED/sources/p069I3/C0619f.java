package p069I3;

/* JADX INFO: renamed from: I3.f */
/* JADX INFO: loaded from: classes2.dex */
public class C0619f extends AbstractC0618e {

    /* JADX INFO: renamed from: a */
    float f2336a = -1.0f;

    @Override // p069I3.AbstractC0618e
    /* JADX INFO: renamed from: a */
    public void mo2658a(C0629p c0629p, float f7, float f8, float f9) {
        float f10 = f9 * f8;
        c0629p.m2850o(0.0f, f10, 180.0f, 180.0f - f7);
        double d7 = f10;
        c0629p.m2848m((float) (Math.sin(Math.toRadians(f7)) * d7), (float) (Math.sin(Math.toRadians(90.0f - f7)) * d7));
    }
}

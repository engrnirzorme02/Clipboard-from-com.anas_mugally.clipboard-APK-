package p224d0;

/* JADX INFO: renamed from: d0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5208l {

    /* JADX INFO: renamed from: a */
    double f19893a;

    /* JADX INFO: renamed from: b */
    double f19894b;

    /* JADX INFO: renamed from: c */
    private boolean f19895c;

    /* JADX INFO: renamed from: d */
    private double f19896d;

    /* JADX INFO: renamed from: e */
    private double f19897e;

    /* JADX INFO: renamed from: f */
    private double f19898f;

    /* JADX INFO: renamed from: g */
    private double f19899g;

    /* JADX INFO: renamed from: h */
    private double f19900h;

    /* JADX INFO: renamed from: i */
    private double f19901i;

    /* JADX INFO: renamed from: j */
    private final AbstractC5204h.o f19902j;

    public C5208l() {
        this.f19893a = Math.sqrt(1500.0d);
        this.f19894b = 0.5d;
        this.f19895c = false;
        this.f19901i = Double.MAX_VALUE;
        this.f19902j = new AbstractC5204h.o();
    }

    /* JADX INFO: renamed from: d */
    private void m24085d() {
        if (this.f19895c) {
            return;
        }
        if (this.f19901i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d7 = this.f19894b;
        if (d7 > 1.0d) {
            double d8 = this.f19893a;
            this.f19898f = ((-d7) * d8) + (d8 * Math.sqrt((d7 * d7) - 1.0d));
            double d9 = this.f19894b;
            double d10 = this.f19893a;
            this.f19899g = ((-d9) * d10) - (d10 * Math.sqrt((d9 * d9) - 1.0d));
        } else if (d7 >= 0.0d && d7 < 1.0d) {
            this.f19900h = this.f19893a * Math.sqrt(1.0d - (d7 * d7));
        }
        this.f19895c = true;
    }

    /* JADX INFO: renamed from: a */
    public float m24086a() {
        return (float) this.f19894b;
    }

    /* JADX INFO: renamed from: b */
    public float m24087b() {
        return (float) this.f19901i;
    }

    /* JADX INFO: renamed from: c */
    public float m24088c() {
        double d7 = this.f19893a;
        return (float) (d7 * d7);
    }

    /* JADX INFO: renamed from: e */
    public boolean m24089e(float f7, float f8) {
        return ((double) Math.abs(f8)) < this.f19897e && ((double) Math.abs(f7 - m24087b())) < this.f19896d;
    }

    /* JADX INFO: renamed from: f */
    public C5208l m24090f(float f7) {
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f19894b = f7;
        this.f19895c = false;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C5208l m24091g(float f7) {
        this.f19901i = f7;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C5208l m24092h(float f7) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f19893a = Math.sqrt(f7);
        this.f19895c = false;
        return this;
    }

    /* JADX INFO: renamed from: i */
    void m24093i(double d7) {
        double dAbs = Math.abs(d7);
        this.f19896d = dAbs;
        this.f19897e = dAbs * 62.5d;
    }

    /* JADX INFO: renamed from: j */
    AbstractC5204h.o m24094j(double d7, double d8, long j7) {
        double dPow;
        double dCos;
        m24085d();
        double d9 = j7 / 1000.0d;
        double d10 = d7 - this.f19901i;
        double d11 = this.f19894b;
        if (d11 > 1.0d) {
            double d12 = this.f19899g;
            double d13 = this.f19898f;
            double d14 = d10 - (((d12 * d10) - d8) / (d12 - d13));
            double d15 = ((d10 * d12) - d8) / (d12 - d13);
            dPow = (Math.pow(2.718281828459045d, d12 * d9) * d14) + (Math.pow(2.718281828459045d, this.f19898f * d9) * d15);
            double d16 = this.f19899g;
            double dPow2 = d14 * d16 * Math.pow(2.718281828459045d, d16 * d9);
            double d17 = this.f19898f;
            dCos = dPow2 + (d15 * d17 * Math.pow(2.718281828459045d, d17 * d9));
        } else if (d11 == 1.0d) {
            double d18 = this.f19893a;
            double d19 = d8 + (d18 * d10);
            double d20 = d10 + (d19 * d9);
            dPow = Math.pow(2.718281828459045d, (-d18) * d9) * d20;
            double dPow3 = d20 * Math.pow(2.718281828459045d, (-this.f19893a) * d9);
            double d21 = this.f19893a;
            dCos = (d19 * Math.pow(2.718281828459045d, (-d21) * d9)) + (dPow3 * (-d21));
        } else {
            double d22 = 1.0d / this.f19900h;
            double d23 = this.f19893a;
            double d24 = d22 * ((d11 * d23 * d10) + d8);
            dPow = Math.pow(2.718281828459045d, (-d11) * d23 * d9) * ((Math.cos(this.f19900h * d9) * d10) + (Math.sin(this.f19900h * d9) * d24));
            double d25 = this.f19893a;
            double d26 = this.f19894b;
            double dPow4 = Math.pow(2.718281828459045d, (-d26) * d25 * d9);
            double d27 = this.f19900h;
            double dSin = (-d27) * d10 * Math.sin(d27 * d9);
            double d28 = this.f19900h;
            dCos = ((-d25) * dPow * d26) + (dPow4 * (dSin + (d24 * d28 * Math.cos(d28 * d9))));
        }
        AbstractC5204h.o oVar = this.f19902j;
        oVar.f19887a = (float) (dPow + this.f19901i);
        oVar.f19888b = (float) dCos;
        return oVar;
    }

    public C5208l(float f7) {
        this.f19893a = Math.sqrt(1500.0d);
        this.f19894b = 0.5d;
        this.f19895c = false;
        this.f19901i = Double.MAX_VALUE;
        this.f19902j = new AbstractC5204h.o();
        this.f19901i = f7;
    }
}

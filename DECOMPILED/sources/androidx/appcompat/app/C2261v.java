package androidx.appcompat.app;

/* JADX INFO: renamed from: androidx.appcompat.app.v */
/* JADX INFO: loaded from: classes.dex */
class C2261v {

    /* JADX INFO: renamed from: d */
    private static C2261v f7452d;

    /* JADX INFO: renamed from: a */
    public long f7453a;

    /* JADX INFO: renamed from: b */
    public long f7454b;

    /* JADX INFO: renamed from: c */
    public int f7455c;

    C2261v() {
    }

    /* JADX INFO: renamed from: b */
    static C2261v m9320b() {
        if (f7452d == null) {
            f7452d = new C2261v();
        }
        return f7452d;
    }

    /* JADX INFO: renamed from: a */
    public void m9321a(long j7, double d7, double d8) {
        float f7 = (j7 - 946728000000L) / 8.64E7f;
        float f8 = (0.01720197f * f7) + 6.24006f;
        double d9 = f8;
        double dSin = (Math.sin(d9) * 0.03341960161924362d) + d9 + (Math.sin(2.0f * f8) * 3.4906598739326E-4d) + (Math.sin(f8 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d10 = (-d8) / 360.0d;
        double dRound = ((double) (Math.round(((double) (f7 - 9.0E-4f)) - d10) + 9.0E-4f)) + d10 + (Math.sin(d9) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d11 = 0.01745329238474369d * d7;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d11) * Math.sin(dAsin))) / (Math.cos(d11) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f7455c = 1;
            this.f7453a = -1L;
            this.f7454b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f7455c = 0;
                this.f7453a = -1L;
                this.f7454b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f7453a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f7454b = jRound;
            if (jRound >= j7 || this.f7453a <= j7) {
                this.f7455c = 1;
            } else {
                this.f7455c = 0;
            }
        }
    }
}

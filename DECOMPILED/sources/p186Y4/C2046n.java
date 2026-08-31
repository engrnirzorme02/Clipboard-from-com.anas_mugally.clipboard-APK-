package p186Y4;

import java.util.Date;

/* JADX INFO: renamed from: Y4.n */
/* JADX INFO: loaded from: classes.dex */
public class C2046n {

    /* JADX INFO: renamed from: a */
    private final C2037e f6767a;

    /* JADX INFO: renamed from: b */
    private final C2037e.d f6768b;

    /* JADX INFO: renamed from: c */
    private final long f6769c;

    /* JADX INFO: renamed from: d */
    private final double f6770d;

    /* JADX INFO: renamed from: e */
    private final long f6771e;

    /* JADX INFO: renamed from: f */
    private long f6772f;

    /* JADX INFO: renamed from: g */
    private long f6773g;

    /* JADX INFO: renamed from: h */
    private long f6774h = new Date().getTime();

    /* JADX INFO: renamed from: i */
    private C2037e.b f6775i;

    public C2046n(C2037e c2037e, C2037e.d dVar, long j7, double d7, long j8) {
        this.f6767a = c2037e;
        this.f6768b = dVar;
        this.f6769c = j7;
        this.f6770d = d7;
        this.f6771e = j8;
        this.f6772f = j8;
        m8499e();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8495a(C2046n c2046n, Runnable runnable) {
        c2046n.getClass();
        c2046n.f6774h = new Date().getTime();
        runnable.run();
    }

    /* JADX INFO: renamed from: d */
    private long m8496d() {
        return (long) ((Math.random() - 0.5d) * this.f6773g);
    }

    /* JADX INFO: renamed from: b */
    public void m8497b(final Runnable runnable) {
        m8498c();
        long jM8496d = this.f6773g + m8496d();
        long jMax = Math.max(0L, new Date().getTime() - this.f6774h);
        long jMax2 = Math.max(0L, jM8496d - jMax);
        if (this.f6773g > 0) {
            AbstractC2049q.m8502a(getClass().getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(jMax2), Long.valueOf(this.f6773g), Long.valueOf(jM8496d), Long.valueOf(jMax));
        }
        this.f6775i = this.f6767a.m8470h(this.f6768b, jMax2, new Runnable() { // from class: Y4.m
            @Override // java.lang.Runnable
            public final void run() {
                C2046n.m8495a(this.f6765a, runnable);
            }
        });
        long j7 = (long) (this.f6773g * this.f6770d);
        this.f6773g = j7;
        long j8 = this.f6769c;
        if (j7 < j8) {
            this.f6773g = j8;
        } else {
            long j9 = this.f6772f;
            if (j7 > j9) {
                this.f6773g = j9;
            }
        }
        this.f6772f = this.f6771e;
    }

    /* JADX INFO: renamed from: c */
    public void m8498c() {
        C2037e.b bVar = this.f6775i;
        if (bVar != null) {
            bVar.m8481c();
            this.f6775i = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m8499e() {
        this.f6773g = 0L;
    }

    /* JADX INFO: renamed from: f */
    public void m8500f() {
        this.f6773g = this.f6772f;
    }

    /* JADX INFO: renamed from: g */
    public void m8501g(long j7) {
        this.f6772f = j7;
    }
}

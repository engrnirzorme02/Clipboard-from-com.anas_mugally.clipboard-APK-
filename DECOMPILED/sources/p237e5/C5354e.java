package p237e5;

import com.google.firebase.installations.C4949i;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: e5.e */
/* JADX INFO: loaded from: classes.dex */
class C5354e {

    /* JADX INFO: renamed from: d */
    private static final long f20480d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e */
    private static final long f20481e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a */
    private final C4949i f20482a = C4949i.m22237c();

    /* JADX INFO: renamed from: b */
    private long f20483b;

    /* JADX INFO: renamed from: c */
    private int f20484c;

    C5354e() {
    }

    /* JADX INFO: renamed from: a */
    private synchronized long m24376a(int i7) {
        if (m24377c(i7)) {
            return (long) Math.min(Math.pow(2.0d, this.f20484c) + this.f20482a.m22243e(), f20481e);
        }
        return f20480d;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m24377c(int i7) {
        if (i7 != 429) {
            return i7 >= 500 && i7 < 600;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m24378d(int i7) {
        return (i7 >= 200 && i7 < 300) || i7 == 401 || i7 == 404;
    }

    /* JADX INFO: renamed from: e */
    private synchronized void m24379e() {
        this.f20484c = 0;
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m24380b() {
        return this.f20484c == 0 || this.f20482a.m22241a() > this.f20483b;
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m24381f(int i7) {
        if (m24378d(i7)) {
            m24379e();
            return;
        }
        this.f20484c++;
        this.f20483b = this.f20482a.m22241a() + m24376a(i7);
    }
}
